# Java 계산기 프로젝트
    
## 프로젝트 설명
이 프로젝트는 자바(Java)로 구현된 사칙연산 계산기입니다. 사용자의 입력을 받아 덧셈, 뺄셈, 곱셈, 나눗셈
연산을 수행하며, 계산 이력을 기록하고 조회하는 기능을 제공합니다.
    
## 주요 기능
    
### Lv1: 기본 사칙연산 계산기
- 두 개의 숫자와 사칙연산 기호(+, -, *, /)를 입력받아 연산을 수행합니다.
- 'exit' 명령어를 입력할 때까지 반복적으로 계산을 수행합니다.
- 0으로 나누는 경우에 대한 예외 처리가 포함되어 있습니다.

 ### Lv2: 계산 이력 관리
 - 계산된 결과 값들을 내부 컬렉션에 저장합니다.
 - 가장 오래된 계산 이력을 삭제하는 기능을 제공합니다.

 ### Lv3: 실수 연산 및 이력 조회
 - 정수뿐만 아니라 실수(double) 타입의 값도 연산할 수 있도록 확장되었습니다.
 - 저장된 연산 결과들 중 특정 값보다 큰 결과들을 조회하는 기능을 제공합니다. (Java Stream API 활용)

 ## 실행 방법
 1. 이 프로젝트를 IntelliJ IDEA 또는 다른 Java 개발 환경에서 엽니다.
 2. `src/main/java/org/example/lv3/App.java` 파일을 엽니다.
 3. `App.java` 파일의 `main` 메소드를 실행합니다.

 ## 사용 방법
 - 프로그램이 시작되면 첫 번째 숫자, 연산 기호, 두 번째 숫자를 차례로 입력합니다.
 - 계산 결과가 출력된 후, 추가 계산을 원하면 아무 키나 누르고, 종료하려면 'exit'를 입력합니다.
 - 'remove'를 입력하면 가장 오래된 계산 이력이 삭제됩니다.
 - 'inquiry'를 입력하면 기준 값을 입력받아 그 값보다 큰 계산 결과들을 조회할 수 있습니다.

 ---
 **개발 환경:**
 - Java 11 이상 (프로젝트 설정에 따라 다를 수 있음)
 - IntelliJ IDEA