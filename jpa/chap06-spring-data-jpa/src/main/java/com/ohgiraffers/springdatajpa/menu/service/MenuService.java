package com.ohgiraffers.springdatajpa.menu.service;
import com.ohgiraffers.springdatajpa.menu.dto.CategoryDTO;
import com.ohgiraffers.springdatajpa.menu.dto.MenuDTO;
import com.ohgiraffers.springdatajpa.menu.entity.Category;
import com.ohgiraffers.springdatajpa.menu.entity.Menu;
import com.ohgiraffers.springdatajpa.menu.repository.CategoryRepository;
import com.ohgiraffers.springdatajpa.menu.repository.MenuRepository;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import java.nio.file.Path;
import java.util.List;

@Service
@RequiredArgsConstructor  // final 이 붙은 구문의 파라미터를 자동으로 생성해줌
public class MenuService {

    private final MenuRepository menuRepository;

    private final ModelMapper modelMapper;

    private final CategoryRepository categoryRepository;

    // 1. findById
    public MenuDTO findMenuByMenuCode(int menuCode) {
        Menu foundMenu = menuRepository.findById(menuCode).orElseThrow(IllegalArgumentException::new);  // findById : null 포인터 익셉션을 방지한다
        return modelMapper.map(foundMenu, MenuDTO.class); // foundMenu(앤티티) 를 MenuDTO 타입으로 가공
    }

    // 2. findAll : Sort
    public List<MenuDTO> findMenuList() {
        List<Menu> menuList = menuRepository.findAll(Sort.by("menuCode").descending()); // descending : 역순으로
        return menuList.stream()
                .map(menu -> modelMapper.map(menu, MenuDTO.class))
                .toList();
    }

    // 3. findAll : pageable
    public Page<MenuDTO> findMenuList(Pageable pageable) {
        pageable = PageRequest.of(
                pageable.getPageNumber() <= 0 ? 0 : pageable.getPageNumber() -1,  // 몇번째 페이지
                pageable.getPageSize(),  // 몇개의 컨텐츠
                Sort.by("menuCode").descending()  // descending : 역순 정렬 설정
        );
        Page<Menu> menuList = menuRepository.findAll(pageable);
        return menuList.map(menu -> modelMapper.map(menu, MenuDTO.class));
    }

    // 4. Query Method
    public List<MenuDTO> findByMenuPrice(Integer menuPrice) {

        List<Menu> menuList = menuRepository.findByMenuPriceGreaterThan(

                menuPrice
                ,Sort.by("menuPrice").descending()
        );
        return menuList.stream()
                .map(menu -> modelMapper.map(menu, MenuDTO.class))  // 엔티티를 DTO 타입으로 변환
                .toList();  // 스트림의 요소들을 리스트로 변환

    }

    // 5. JPQL or Native Query
    public List<CategoryDTO> findAllCategory() {

        List<Category> categoryList = categoryRepository.findAllCategory();
        return categoryList.stream()
                .map(category -> modelMapper.map(category, CategoryDTO.class))  // 앤티티 -> DTO 타입으로 가공
                .toList();  // 리스트로 변환
    }

    /* 6. Save : 저장 */
    @Transactional
    public void registMenu(MenuDTO menuDTO) {

        menuRepository.save(modelMapper.map(menuDTO, Menu.class));
    }

    /* 7. Modify(수정) : 엔티티 객체 필드 값 변경 */
    @Transactional
    public void modifyMenu(MenuDTO menuDTO) {

        Menu foundMenu = menuRepository.findById(menuDTO.getMenuCode()).orElseThrow(IllegalArgumentException::new);
        foundMenu.modifyMenuName(menuDTO.getMenuName());
    }

    /* 8. deleteById : 삭제 */
    @Transactional
    public void deleteMenu(Integer menuCode) {

        menuRepository.deleteById(menuCode);
    }
}
