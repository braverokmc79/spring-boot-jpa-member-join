# spring-boot-jpa-member-join


### compile : 기본 범위, 클래스 경로는 src/main및 모두에 사용할 수 있습니다.src/test
### test : 클래스 경로를 사용할 수 있습니다.src/test
### provided : 준수와 비슷하지만 런타임 시 JDK 또는 컨테이너에서 제공됨
### runtime : 컴파일에는 필요하지 않고 런타임에만 필요
### system : 로컬로 제공 클래스 경로 제공
### import : 다른 POM만 으로 가져올 수 있으며 
	<dependencyManagement/>Maven 2.0.9 이상에서만 사용할 수 있습니다. 
	상위를 변경하는 것이 항상 실용적인 것은 아니며 많은 프로젝트가 이미 상위 프로젝트를 지정하여 조직 표준을 관리합니다.
	 dependencyManagement부모 프로젝트를 만들지 않고 부모 프로젝트를 추가할 수 있습니다. 이는 다중 상속과 같습니다.
