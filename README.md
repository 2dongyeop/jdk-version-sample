# jdk-version-sample
JDK 1.5 ~ 21까지의 주요 문법 예시 코드로, 주요 내용은 [노션](https://www.notion.so/leedongyeop/JDK-1-5-21-b8b2422c51844ad6b98731f1636b879c)에서 볼 수 있습니다.

<br/>

# Requirements
- JDK 21 문법은 현재(2023.12.09) preview 기능들이기에 정식 지원하지 않는 기능들이 있습니다.
  - 해당 기능들은 아래와 같이 터미널에서 실행해보시길 바랍니다.
  - 우선, Java 21이 설치되어 있어야 합니다.
    - asdf 사용 시 : `asdf install java openjdk-21`
  - 컴파일 방법
    - `javac --release 21 --enable-preview {컴파일할 클래스 명}.java`
  - 실행 방법
    - `java --enable-preview --source 21 {컴파일할 클래스 명}.class`

<br/>

# Features
## JDK 21 (LTS)
- StringTemplates
- Sequenced Collections
- Unnamed Patterns and Variables (Preview)
- Unnamed Classes and Instance Main Methods (Preview)

## JDK 19 ~ 20
- Virtual Threads (Preview)
- Structured Concurrency (Incubator)
- Record Patterns (Preview)

## JDK 18
- Code Snippets in Java API Documentation
- Deprecate Finalization for Removal

## JDK 17
- Pattern Matching for switch (Preview)

## JDK 15
- Sealed Class (Preview)
- Records (개선)
- Pattern Matching for instanceof (개선)

## JDK 14
- Records (Preview)
- Pattern Matching for instanceof (Preview)
- NullPointerExceptions 개선

## JDK 13
- Text Blocks : Multiline Strings (Preview)
- Switch Expression 개선 (Preview)

## JDK 12
- Switch Expression 확장 (Preview)

## JDK 11 (LTS)
- HTTP Client
- Local-Variable Syntax for Lambda Parameters(Lambda 파라미터로 var 사용)
- File API 개선
- String API 개선

## JDK 10
- Local-Variable Type Inference (var 키워드)

## JDK 9
- JPMS : Java 9 Platform Module System
- Try-With-Resources 개선
- Stream API 추가
- JShell (대화형 쉘)
- Interface Private Method

## JDK 1.8 (LTS)
- Stream API
- null 대신 Optional
- Date & Time API
- Base64 인코딩과 디코딩을 위한 표준 API
- Parallel Array Sorting (병렬 배열 정렬)
- Default Methods in Interface
- 메서드 참조 (Method Reference)
- Functional Interface

## JDK 1.7
- Automatic resource management in try-statement
- Allowing underscores in numeric literals
- Binary integer literals
- Diamond Operator
- Strings in switch

## JDK 1.6
- Annotation 기능 향상

## JDK 1.5
- Improved semantics of execution for multi-threaded Java programs
- Varargs
- Enhanced for each loop
- Enumeration
- Generics
- Autoboxing / Unboxing