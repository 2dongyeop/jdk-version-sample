/**
 * package-info.java는 두 가지 목적으로 사용됨
 * <p>
 * 1. 패키지 단위의 문서 작성
 * 2. 패키지 단위의 애노테이션 적용
 * </p>
 * <br/>
 * 패키지 단위의 문서 작성
 * <p>
 * - JDK 5 이전까지 사용되던 package.html의 대체자로 활용됨
 * </p>
 * <br/>
 * 패키지 단위의 애노테이션 적용
 * <p>
 * - 패키지 단위의 애노테이션 적용이 필요한 상황이라면 간단히 package-info.java에 애노테이션을 붙임으로써 문제를 해결
 * {@snippet :
 * @NonNullApi
 * @NonNullFields
 * class example {}
 * *}
 * </p>
 * @author 2dongyeop
 * @since 2023.12.10
 */
package com.songareeit.jdk9;