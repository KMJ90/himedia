import axios from "axios";

const DOMAIN = 'http://localhost:4000'

// 비동기 통신을 사용해 HTTP 요청을 보내고, 무엇을 보낼것인가 정의하고, 응답에 대한 처리를 작성함

export const request = async (method, url, data) => {

    return await axios({  // axios 를 이용해 HTTP 요청을 보냄
                          // 요청을 보낼 때 지정된 메소드와 URL을 사용하고, 데이터도 보낼 수 있음

        method,                   // get, post, put, delete 등
        url : `${DOMAIN}${url}`,  // 요청을 보낼 URL
        data                      // 요청 바디에 포함될 데이터(post 또는 put 요청의 경우)
    })
        .then(res => res.data)  // 요청에 대한 응답이 오면 res.data를 반환
        .catch(error => console.log(error));  // 오류가 나면 오류를 콘솔에 출력
}