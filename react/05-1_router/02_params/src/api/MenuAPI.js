import menus from '../data/menu-detail.json';

// 전체 메뉴 목록 조회용 API
export function getMenuList() {

    return menus;
}

// 메뉴 코드를 이용하여 한 개의 상세 내용 조회
export function getMenuDetail(menuCode) {

    return menus.find(menu => menu.menuCode == menuCode);
}