# Library > Core > Enum Mapper
> Enum 데이터를 Client 에게 제공하기 위해 필요한 공통 설정 및 기능 정의
> - ## [EnumModel](./src/main/java/run/freshr/common/mappers/EnumModel.java)
>> Enum 공통 interface  
>> Enum 에서 key, value 설정을 하도록 가이드하는 공통 interface 
> - ## [EnumMapper](./src/main/java/run/freshr/common/mappers/EnumMapper.java)
>> EnumModel 을 상속받고 API 에서 조회되도록 설정한 Enum 데이터를 조회하고 반환하는 기능을 정의
> - ## [EnumGetter](./src/main/java/run/freshr/common/mappers/EnumGetter.java)
>> 조회된 Enum 데이터의 key, value 필드를 mapping 하는 model
> - ## [EnumUtil](./src/main/java/run/freshr/common/utils/EnumUtil.java)
>> Enum 공통 기능을 정의