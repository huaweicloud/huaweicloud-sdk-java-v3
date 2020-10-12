## 3.0.16-beta 2020-10-12
## HuaweiCloud SDK CTS
 - ### 新增特性
    - 无
 - ### 解决问题
    - 无
 - ### 特性变更
    - 删除v1版本废弃接口

## HuaweiCloud SDK DevStar
 - ### 新增特性
    - 无
 - ### 解决问题
    - 服务客户端认证类型调整为全局认证，即GlobalCredentials
 - ### 特性变更
    - 无


## 3.0.15-beta 2020-09-30
## HuaweiCloud SDK CBR
 - ### 新增特性
    - 支持云备份服务
 - ### 解决问题
    - 无
 - ### 特性变更
    - 无


## 3.0.14-beta 2020-09-24
## HuaweiCloud SDK Core
 - ### 新增特性
    - 无
 - ### 解决问题
    - [Issue 11](https://github.com/huaweicloud/huaweicloud-sdk-java-v3/issues/11)：使用okhttp3不当导致线程数一直增加问题修复
 - ### 特性变更
    - 无

## HuaweiCloud SDK BSS
 - ### 新增特性
    - 无
 - ### 解决问题
    - 修复BssClient类无法加载的问题
 - ### 特性变更
    - 无

## HuaweiCloud SDK EIP
 - ### 新增特性
    - 无
 - ### 解决问题
    - 无
 - ### 特性变更
    - 接口ListPublicips调整，企业项目ID不支持多值查询

## HuaweiCloud SDK OMS
 - ### 新增特性
    - 支持对象存储迁移服务
 - ### 解决问题
    - 无
 - ### 特性变更
    - 无

## HuaweiCloud SDK TestHub
 - ### 新增特性
    - 无
 - ### 解决问题
    - 无
 - ### 特性变更
    - 原TestHub服务名变更为CloudTest，原命名无法正常上线SDK中心


## 3.0.13-beta 2020-09-16
## HuaweiCloud SDK ECS
 - ### 新增特性
    - 无
 - ### 解决问题
    - 修正接口参数类型
 - ### 特性变更
    - 无

## HuaweiCloud SDK BSS
 - ### 新增特性
    - 无
 - ### 解决问题
    - 无
 - ### 特性变更
    - 运营能力开放接口更新

## HuaweiCloud SDK EIP
 - ### 新增特性
    - 无
 - ### 解决问题
    - 修复查询弹性公网IP不支持传入多个值的问题
 - ### 特性变更
    - 无

## HuaweiCloud SDK ELB
 - ### 新增特性
    - 无
 - ### 解决问题
    - 修复部分接口参数错误的问题
 - ### 特性变更
    - 无

## HuaweiCloud SDK IMS
 - ### 新增特性
    - 无
 - ### 解决问题
    - 无
 - ### 特性变更
    - 调整接口描述

## HuaweiCloud SDK Live
 - ### 新增特性
    - 无
 - ### 解决问题
    - 无
 - ### 特性变更
    - 修改禁播参数描述

# 3.0.12-beta 2020-09-11


# 3.0.11-beta 2020-09-09
## HuaweiCloud SDK Core
 - ### 新增特性
    - 无
 - ### 解决问题
    - 无
 - ### 特性变更
    - 加强动态枚举类型的安全性

## HuaweiCloud SDK Meeting
 - ### 新增特性
    - 新增支持接口：会议控制/会议管理
 - ### 解决问题
    - 无
 - ### 特性变更
    - 无

## HuaweiCloud SDK VPC
 - ### 新增特性
    - 无
 - ### 解决问题
    - 修复安全组相关接口类型错误的问题
 - ### 特性变更
    - 无


# 3.0.10-beta 2020-09-04
## HuaweiCloud SDK Core
 - ### 新增特性
    - 无
 - ### 解决问题
    - 支持多种认证方式，恢复接口类ICredential
    - 修复yaml中没有定义format的整型枚举参数无法生成枚举代码的问题
    - 修复请求中query参数传多个值会认证失败的问题
 - ### 特性变更
    - 调整Http请求头的User-Agent信息

## HuaweiCloud SDK DevStar
 - ### 新增特性
    - 新增支持接口：下载模板产物
 - ### 解决问题
    - 无
 - ### 特性变更
    - 无

## HuaweiCloud SDK DMS
 - ### 新增特性
    - 支持分布式消息服务，提供Kafka专享版和RabbitMQ专享版
 - ### 解决问题
    - 无
 - ### 特性变更
    - 无


# 3.0.9-beta 2020-08-28
## HuaweiCloud SDK CloudPipeline
 - ### 新增特性
    - 支持流水线服务
 - ### 解决问题
    - 无
 - ### 特性变更
    - 无

## HuaweiCloud SDK CodeHub
 - ### 新增特性
    - 支持代码托管服务
 - ### 解决问题
    - 无
 - ### 特性变更
    - 无

## HuaweiCloud SDK EIP
 - ### 新增特性
    - 新增支持接口：弹性公网IP标签相关接口和共享带宽相关接口
 - ### 解决问题
    - 批量创建带宽接口，修改billing_info字段
 - ### 特性变更
    - 无

## HuaweiCloud SDK EVS
 - ### 新增特性
    - 无
 - ### 解决问题
    - ListVolumesByTags接口，修改total_count类型定义错误的问题
 - ### 特性变更
    - 无

## HuaweiCloud SDK ELB
 - ### 新增特性
    - 支持弹性负载均衡服务
 - ### 解决问题
    - 无
 - ### 特性变更
    - 无

## HuaweiCloud SDK FunctionGraph
 - ### 新增特性
    - 无
 - ### 解决问题
    - 无
 - ### 特性变更
    - 调整服务名，由缩写FGS调整为全称FunctionGraph

## HuaweiCloud SDK IAM
 - ### 新增特性
    - 发布新接口：console一致性相关接口
 - ### 解决问题
    - 无
 - ### 特性变更
    - 无

## HuaweiCloud SDK IoTDA
 - ### 新增特性
    - 新增支持接口：批量操作接口和异步接口
 - ### 解决问题
    - 无
 - ### 特性变更
    - 无

## HuaweiCloud SDK Meeting
 - ### 新增特性
    - 发布新接口：会议纪要接口
 - ### 解决问题
    - 无
 - ### 特性变更
    - 无

## HuaweiCloud SDK ProjectMan
 - ### 新增特性
    - 支持项目管理服务
 - ### 解决问题
    - 无
 - ### 特性变更
    - 无

## HuaweiCloud SDK TestHub
 - ### 新增特性
    - 支持云测服务TestHub测试工具
 - ### 解决问题
    - 无
 - ### 特性变更
    - 无

## HuaweiCloud SDK VPC
 - ### 新增特性
    - 发布新接口：安全组、安全组规则和可用IP数
 - ### 解决问题
    - 无
 - ### 特性变更
    - 无


# 3.0.8-beta 2020-8-14
## HuaweiCloud SDK Core
 - ### 新增特性
    - 支持临时AK/SK认证模式
 - ### 解决问题
    - 无
 - ### 特性变更
    - 无

## HuaweiCloud SDK BSS
 - ### 新增特性
    - 支持能力开放服务
 - ### 解决问题
    - 无
 - ### 特性变更
    - 无

## HuaweiCloud SDK CloudIDE
 - ### 新增特性
    - 支持云测服务
 - ### 解决问题
    - 无
 - ### 特性变更
    - 无
    
## HuaweiCloud SDK Live
 - ### 新增特性
    - 支持视频直播服务
 - ### 解决问题
    - 无
 - ### 特性变更
    - 无

## HuaweiCloud SDK RDS
 - ### 新增特性
    - 支持视频直播服务
 - ### 解决问题
    - 无
 - ### 特性变更
    - 无
 

# 3.0.7-beta 2020-07-30
## HuaweiCloud SDK APIG
 - ### 新增特性
    - 支持API网关
 - ### 解决问题
    - 无
 - ### 特性变更
    - 无

## HuaweiCloud SDK CloudBuild
 - ### 新增特性
    - 支持编译构建服务
 - ### 解决问题
    - 无
 - ### 特性变更
    - 无

## HuaweiCloud SDK DC
 - ### 新增特性
    - 支持云专线服务
 - ### 解决问题
    - 无
 - ### 特性变更
    - 无

## HuaweiCloud SDK ECS
 - ### 新增特性
    - 发布新接口，如变更操作系统/重置密码
 - ### 解决问题
    - 无
 - ### 特性变更
    - 无

## HuaweiCloud SDK KMS
 - ### 新增特性
    - 支持密钥管理服务
 - ### 解决问题
    - 无
 - ### 特性变更
    - 无

## HuaweiCloud SDK Meeting
 - ### 新增特性
    - 增加全球窗模块接口
 - ### 解决问题
    - 无
 - ### 特性变更
    - 无
    
## HuaweiCloud SDK MPC
 - ### 新增特性
    - 支持媒体处理服务
 - ### 解决问题
    - 无
 - ### 特性变更
    - 无

## HuaweiCloud SDK ServiceStage
 - ### 新增特性
    - 支持应用管理与运维平台
 - ### 解决问题
    - 无
 - ### 特性变更
    - 无

## HuaweiCloud SDK VPC
 - ### 新增特性
    - 支持VPC v3版本的接口
 - ### 解决问题
    - 无
 - ### 特性变更
    - 无


# 3.0.6-beta 2020-07-15
## HuaweiCloud SDK ECS
 - ### 新增特性
    - 支持创建竞价计费弹性云服务器
 - ### 解决问题
    - 无
 - ### 特性变更
    - 无

## HuaweiCloud SDK EIP
 - ### 新增特性
    - 支持弹性公网IP服务
 - ### 解决问题
    - 无
 - ### 特性变更
    - 无

## HuaweiCloud SDK EPS
 - ### 新增特性
    - 支持企业管理服务
 - ### 解决问题
    - 无
 - ### 特性变更
    - 无
    
## __HuaweiCloud SDK EVS__
 - ### 新增特性
    - 无
 - ### 解决问题
    - [Issue #3](https://github.com/huaweicloud/huaweicloud-sdk-java-v3/issues/3)：获取单个磁盘详情接口报错问题修复
 - ### 特性变更
    - 无
     
## HuaweiCloud SDK IAM
 - ### 新增特性
    - 无
 - ### 解决问题
    - 修复keystoneListVersions响应体解析失败问题
 - ### 特性变更
    - 无

## HuaweiCloud SDK IoTDA
 - ### 新增特性
    - 无
 - ### 解决问题
    - 无
 - ### 特性变更
    - 支持资源空间相关接口
    
## HuaweiCloud SDK Meeting
 - ### 新增特性
    - 支持云会议管理/会议控制功能
 - ### 解决问题
    - 无
 - ### 特性变更
    - 无 
    
## HuaweiCloud SDK TMS
 - ### 新增特性
    - 支持标签管理服务
 - ### 解决问题
    - 无
 - ### 特性变更
    - 无

    
# 3.0.5-beta 2020-06-30
## HuaweiCloud SDK Core
 - ### 新增特性
    - 支持上传下载
 - ### 解决问题
    - 修复 Content-Type 为 application/json 时 AK/SK 认证失败的问题
 - ### 特性变更
    - 无
    
## HuaweiCloud SDK CTS
 - ### 新增特性
    - 支持云审计服务
 - ### 解决问题
    - 无
 - ### 特性变更
    - 无
     
## HuaweiCloud SDK EVS
 - ### 新增特性
    - 无
 - ### 解决问题
    - 无
 - ### 特性变更
    - 支持全量服务接口
            
## HuaweiCloud SDK IoTDA
 - ### 新增特性
    - 支持设备接入服务
 - ### 解决问题
    - 无
 - ### 特性变更
    - 无



# 3.0.4-beta 2020-06-19
## HuaweiCloud SDK ECS
 - ### 新增特性
    - 支持创建包周期计费弹性云服务器
 - ### 解决问题
    - 无
 - ### 特性变更
    - 无

## HuaweiCloud SDK Meeting
 - ### 新增特性
    - 支持云会议服务
 - ### 解决问题
    - 无
 - ### 特性变更
    - 无 


# 3.0.3-beta 2020-06-15
## HuaweiCloud SDK Core
 - ### 新增特性
    - 支持异步客户端
    - 支持访问日志
    - 支持原始HTTP侦听器
 - ### 解决问题
    - proxy 不可用问题修复
 - ### 特性变更
    - 无

## HuaweiCloud SDK DevStar
 - ### 新增特性
    - 支持查询模板列表
    - 支持查询模板详情
    - 支持查询任务状态
    - 支持通过DevStar模板创建生成应用代码任务
 - ### 解决问题
    - 无
 - ### 特性变更
    - 无    