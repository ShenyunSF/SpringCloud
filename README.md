# SpringCloud
springCloud项目
使用Eurek作为服务发现和监控注册微服务
使用provide-consumer生产者消费者模型，微服务都注册到Eureka
2个provider，1个consumer。通过Ribbon实现前端负载均衡
使用Feign接口，关联provider实现HttpClient访问的简化，封装RestFul，实现消费者对生产者的消费
使用Hystrix断路器功能，确保微服务异常的时候也会有回调
使用Zuul作为API网关，对外暴露统一接口，封装真实请求，提升系统安全
