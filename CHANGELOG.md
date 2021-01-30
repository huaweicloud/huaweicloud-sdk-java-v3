## 3.0.32-rc 2021-01-30
## HuaweiCloud SDK Core
- ### Features
    - None
- ### Bug Fix
    - None
- ### Change
    - None

## HuaweiCloud SDK CloudBuild
- ### Features
    - Support more interfaces: `ShowListPeriodHistory`.
- ### Bug Fix
    - None
- ### Change
    - None

## HuaweiCloud SDK DAS
- ### Features
    - Support `Data Admin Service`.
- ### Bug Fix
    - None
- ### Change
    - None

## HuaweiCloud SDK DNS
- ### Features
    - Support `Domain Name Service`.
- ### Bug Fix
    - None
- ### Change
    - None

## HuaweiCloud SDK ECS
- ### Features
    - None
- ### Bug Fix
    - None
- ### Change
    - Change interface name from `UpdateAutoTerminateTimeServer` to `UpdateServerAutoTerminateTime`.

## HuaweiCloud SDK EVS
- ### Features
    - None
- ### Bug Fix
    - None
- ### Change
    - Interface `CinderCreateVolume` is supported to specify the id of dedicated storage pool using property `OS-SCH-HNT:scheduler_hints`.
    - Modify property type of `allocated` of class `QuotaDetails` from `String` to `Integer`.

## HuaweiCloud SDK IAM
- ### Features
    - None
- ### Bug Fix
    - None
- ### Change
    - Increases the property `access_mode` of response class of interface `ShowUser`. 


## 3.0.31-rc 2021-01-25
## HuaweiCloud SDK Core
- ### Features
    - None
- ### Bug Fix
    - Resolve the problem when `Body` parameter in the interface is not required while it's still required to send empty `RequestBody` in SDK.
- ### Change
    - Enhance data type check to prevent automatic type conversion during deserialization.
    - The default value of `ConnectionTimeout` is set to 60 seconds.
    - The default value of `ReadTimeout` is set to 120 seconds.
    
## HuaweiCloud SDK BSS
- ### Features
    - Support more interface: ListOrderDiscounts.
- ### Bug Fix
    - None
- ### Change
    - None

## HuaweiCloud SDK ECS
- ### Features
    - Support more interface: UpdateAutoTerminateTimeServer.
- ### Bug Fix
    - None
- ### Change
    - None


## 3.0.30-rc 2021-01-15
## HuaweiCloud SDK Core
- ### Features
    - Support function `valueOf` to get region information.
- ### Bug Fix
    - Fix response exception when using temporary AK/SK.
    - Fix verification failure when request has query parameter of type `List`.
- ### Change
    - None

## HuaweiCloud SDK DGC
- ### Features
    - Support more interfaces: `Job` related interfaces, `Script` related interfaces, `Resource` related interfaces.
- ### Bug Fix
    - None
- ### Change
    - None

## HuaweiCloud SDK IAM
- ### Features
    - None
- ### Bug Fix
    - None
- ### Change
    - Modify the data type of response field `is_domain_owner` from string to boolean of interface `ShowUser` and `CreateUser`.

## HuaweiCloud SDK Meeting
- ### Features
    - Support more interface: ShowOrgRes
- ### Bug Fix
    - None
- ### Change
    - Interface `CreateMeeting` supports parameter `allowGuestStartConf`.
    - Add response fields of `ShowMeetingDetail`: `appId`, `isAutoInvite`, `isNotOverlayPidName`.

## HuaweiCloud SDK RDS
- ### Features
    - Support more interfaces: ShowOffSiteBackupPolicy, SetOffSiteBackupPolicy, ListOffSiteBackups, ListOffSiteRestoreTimes, ListOffSiteRestoreTimes, ListApiVersion, ShowApiVersion.
- ### Bug Fix
    - None
- ### Change
    - None

## HuaweiCloud SDK ROMA
- ### Features
    - Support more groups of interfaces: group of ApplicationManagement, group of AssetManagement, group of DictionaryManagement, group of PublicManagement.
- ### Bug Fix
    - None
- ### Change
    - None

## HuaweiCloud SDK SCM
- ### Features
    - Support `SSL Certificate Manager` service.
- ### Bug Fix
    - None
- ### Change
    - None

## HuaweiCloud SDK SWR
- ### Features
    - Support `Software Repository for Container` service.
- ### Bug Fix
    - None
- ### Change
    - None


## 3.0.29-beta 2020-12-31
## HuaweiCloud SDK AOM
 - ### Features
    - Support `Application Operations Management` service.
 - ### Bug Fix
    - None
 - ### Change
    - None

## HuaweiCloud SDK CloudIDE
 - ### Features
    - Support more interface: ShowAccountStatus
 - ### Bug Fix
    - None
 - ### Change
    - None

## HuaweiCloud SDK DCS
 - ### Features
    - None
 - ### Bug Fix
    - Modify the interface return data type to prevent deserialization failure: 
        - ListSlowlog: change data type of `Tags` from Tag to ResourceTag.
        - ListInstances: change data type of `duration` from int32 to string.
        - ShowBigkeyScanTaskDetails: change data type of `db` from int32 to string.
        - ShowHotkeyTaskDetails: change data type of `db` from int32 to string.
 - ### Change
    - None

## HuaweiCloud SDK DGC
 - ### Features
    - Support `Data Lake Governance Center` service.
 - ### Bug Fix
    - None
 - ### Change
    - None

## HuaweiCloud SDK DRS
 - ### Features
    - Support `Data Replication Service`.
 - ### Bug Fix
    - None
 - ### Change
    - None

## HuaweiCloud SDK MRS
 - ### Features
    - Support `MapReduce Service`.
 - ### Bug Fix
    - None
 - ### Change
    - None

## HuaweiCloud SDK RDS
 - ### Features
    - None
 - ### Bug Fix
    - None
 - ### Change
    - Interface modification: response type of interface `CreateInstance` adjustment.

## HuaweiCloud SDK ROMA
 - ### Features
    - Support `ROMA Connect` service.
 - ### Bug Fix
    - None
 - ### Change
    - None

## HuaweiCloud SDK SMN
 - ### Features
    - None
 - ### Bug Fix
    - Modify the request parameters of interface `PublishMessage` from Object to Map<String, String>
 - ### Change
    - None


## 3.0.28-beta 2020-12-28
## HuaweiCloud SDK DCS
 - ### Features
    - None
 - ### Bug Fix
    - Change property type of `port` from string to integer.
 - ### Change
    - None


## 3.0.27-beta 2020-12-25
## HuaweiCloud SDK DCS
 - ### Features
    - None
 - ### Bug Fix
    - None
 - ### Change
    - Query parameter in interface `ListInstances` modification: id → instance_id.

## HuaweiCloud SDK OSM
 - ### Features
    - Support interfaces of OSM system which supports HUAWEI CLOUD's after-sales services. 
 - ### Bug Fix
    - None
 - ### Change
    - None

## HuaweiCloud SDK RMS
 - ### Features
    - Support more interfaces: `Resources` related interfaces and `Region` related interfaces. 
 - ### Bug Fix
    - None
 - ### Change
    - None


## 3.0.26-beta 2020-12-23
## HuaweiCloud SDK Core
 - ### Features
    - Support Endpoint Resolver: it's supported to use {Service}Region when initializing {ServiceClient} which can automatically backfill endpoint. After choosing a region, the projectId/domainId will be backfilled automatically.
 - ### Bug Fix
    - None
 - ### Change
    - None

## HuaweiCloud SDK Anti-DDoS
 - ### Features
    - Support Anti-DDoS service.
 - ### Bug Fix
    - None
 - ### Change
    - None

## HuaweiCloud SDK BSS
 - ### Features
    - Support more interfaces: ListMeasureUnits.
 - ### Bug Fix
    - None
 - ### Change
    - None

## HuaweiCloud SDK CES
 - ### Features
    - None
 - ### Bug Fix
    - None
 - ### Change
    - Update interface: ShowMetricData

## HuaweiCloud SDK Live
 - ### Features
    - Support more interfaces: ShowStreamPortrait.
 - ### Bug Fix
    - None
 - ### Change
    - None

## HuaweiCloud SDK MPC
 - ### Features
    - Support more interfaces: QualityEnhanceTemplate related interfaces and MergeChannelsTask related interfaces.
 - ### Bug Fix
    - None
 - ### Change
    - None

## HuaweiCloud SDK OCR
 - ### Features
    - Support Optical Character Recognition service.
 - ### Bug Fix
    - None
 - ### Change
    - None

## HuaweiCloud SDK SMN
 - ### Features
    - None
 - ### Bug Fix
    - None
 - ### Change
    - Update field type in message_template_name.


## 3.0.25-beta 2020-12-15
## HuaweiCloud SDK CCE
 - ### Features
    - Support Cloud Container Engine service.
 - ### Bug Fix
    - None
 - ### Change
    - None

## HuaweiCloud SDK CloudBuild
 - ### Features
    - Support more interfaces: `DownloadKeystone`.
 - ### Bug Fix
    - None
 - ### Change
    - None

## HuaweiCloud SDK DDM
 - ### Features
    - Support Distributed Database Middleware service.
 - ### Bug Fix
    - None
 - ### Change
    - None

## HuaweiCloud SDK DWS
 - ### Features
    - Support GaussDB service.
 - ### Bug Fix
    - None
 - ### Change
    - None

## HuaweiCloud SDK ELB
 - ### Features
    - None
 - ### Bug Fix
    - Fix the problem that sending request to interface `CreateListener` returns empty response.
    - Fix the problem that sending request to interface `CreateListener` returns response with wrong type. 
 - ### Change
    - None

## HuaweiCloud SDK FunctionGraph
 - ### Features
    - Support more interfaces: UpdateFunctionReservedInstances.
 - ### Bug Fix
    - None
 - ### Change
    - None

## HuaweiCloud SDK Meeting
 - ### Features
    - Support more interfaces: CreatePortalRefNonce.
 - ### Bug Fix
    - None
 - ### Change
    - None

## HuaweiCloud SDK NAT
 - ### Features
    - None
 - ### Bug Fix
    - Fix the problem that using interface `BatchCreateNatGatewayDnatRules` failed. 
 - ### Change
    - None


## 3.0.24-beta 2020-12-04
## HuaweiCloud SDK Core
 - ### Features
    - None
 - ### Bug Fix
    - Fix the problem of authentication failure caused by unsorted custom request headers.
 - ### Change
    - None

## HuaweiCloud SDK SMN
 - ### Features
    - Support Simple Message Notification service.
 - ### Bug Fix
    - None
 - ### Change
    - None


## 3.0.23-beta 2020-11-30
## HuaweiCloud SDK BCS
 - ### Features
    - Support BlockChain Service.
 - ### Bug Fix
    - None
 - ### Change
    - None 

## HuaweiCloud SDK BMS
 - ### Features
    - Support Bare Metal Server service.
 - ### Bug Fix
    - None
 - ### Change
    - None

## HuaweiCloud SDK BSS
 - ### Features
    - Support more interfaces: ListUsageTypes, ModPeriodToOnDemand.
 - ### Bug Fix
    - None
 - ### Change
    - None 

## HuaweiCloud SDK CBR
 - ### Features
    - Support more interfaces: MigrateVaultResource.
 - ### Bug Fix
    - None
 - ### Change
    - None

## HuaweiCloud SDK CES
 - ### Features
    - Support more interfaces: 
     - ListEvents
     - ListEventDetail
     - CreateResourceGroup
     - UpdateResourceGroup
     - DeleteResourceGroup
     - ListResourceGroup
     - UpdateAlarm
 - ### Bug Fix
    - None
 - ### Change
    - None

## HuaweiCloud SDK ECS
 - ### Features
    - None 
 - ### Bug Fix
    - None
 - ### Change
    - [Issue 21](https://github.com/huaweicloud/huaweicloud-sdk-java-v3/issues/21) Open related interface.

## HuaweiCloud SDK IAM
 - ### Features
    - Support more interfaces.
 - ### Bug Fix
    - None
 - ### Change
    - None

## HuaweiCloud SDK Live
 - ### Features
    - None
 - ### Bug Fix
    - None
 - ### Change
    - Name of service client modification: LiveAPIClient → LiveClient.

## HuaweiCloud SDK Meeting
 - ### Features
    - None
 - ### Bug Fix
    - None
 - ### Change
    - Property of interface `CreateMeeting` adjustment: increase property `callInRestriction`.
    - Property of interface `EditMeeting` adjustment: increase property `callInRestriction`.


## 3.0.22-beta 2020-11-17
## HuaweiCloud SDK DMS
 - ### Features
    - None
 - ### Bug Fix
    - None
 - ### Change
    - Type of property adjustment: type of property `created` and type of `eff_date` are changed from `string` to `integer64`.  

## HuaweiCloud SDK ECS
 - ### Features
    - None
 - ### Bug Fix
    - None
 - ### Change
    - Property adjustment:  increase property `dry_run` in interfaces `CreatePostPaidServers` and `CreateServers` which means whether parameters will be checked before sending real requests. 

## HuaweiCloud SDK NAT
 - ### Features
    - Support NAT Gateway service.
 - ### Bug Fix
    - None
 - ### Change
    - None 

## HuaweiCloud SDK Kafka
 - ### Features
    - None
 - ### Bug Fix
    - None
 - ### Change
    - Name of interface adjustment: UpdateInstanceCrossVPCIP → UpdateInstanceCrossVpcIp

## HuaweiCloud SDK RMS
 - ### Features
    - Support Resource Manager Service.
 - ### Bug Fix
    - None
 - ### Change
    - None 

## HuaweiCloud SDK VPC
 - ### Features
    - Support more interfaces: interfaces related to Network ACLs. 
 - ### Bug Fix
    - None
 - ### Change
    - None 


## 3.0.21-beta 2020-11-11
## HuaweiCloud SDK CBR
 - ### Features
    - None
 - ### Bug Fix
    - None
 - ### Change
    - Interface adjustment: property `object_type` in interface `CreateVault` support key `turbo`.
    - Interface adjustment: property `description` in interface `UpdatePolicy` is removed.

## HuaweiCloud SDK CES
 - ### Features
    - Add examples of interface response and adjust some filed description.
 - ### Bug Fix
    - None
 - ### Change
    - None

## HuaweiCloud SDK CloudPipeline
 - ### Features
    - None
 - ### Bug Fix
    - None
 - ### Change
    - Modify the name of generated Client class: DevcloudpipelineClient → CloudPipelineClient, DevcloudpipelineAsyncClient → CloudPipelineAsyncClient
    - Modify the name of generated Meta class: DevcloudpipelineMeta → CloudPipelineMeta

## HuaweiCloud SDK DevStar
 - ### Features
    - None
 - ### Bug Fix
    - None
 - ### Change
    - Modify interface parameters and adjust sample code.


## 3.0.20-beta 2020-11-02
## HuaweiCloud SDK CES
 - ### Features
    - None
 - ### Bug Fix
    - None
 - ### Change
    - Interface adjustment: property `alarm_type` in class `CreateAlarmRequestBody` support key `RESOURCE_GROUP`.
    - Interface adjustment: property `meta_data` in class `ListAlarmHistoriesResponse` only returns total number of alarm histories.

## HuaweiCloud SDK ELB
 - ### Features
    - None
 - ### Bug Fix
    - Modify wrong parameter in class `CreateL7ruleRequestBody`.
 - ### Change
    - None


## 3.0.19-beta 2020-10-31
## HuaweiCloud SDK CBR
 - ### Features
    - Support more interfaces: interfaces related to `TAG`.
 - ### Bug Fix
    - [Issue 17](https://github.com/huaweicloud/huaweicloud-sdk-java-v3/issues/17) fix the problem of interface: ListBackups.
 - ### Change
    - None

## HuaweiCloud SDK CodeCheck
 - ### Features
    - Support CodeCheck service.
 - ### Bug Fix
    - None
 - ### Change
    - None

## HuaweiCloud SDK CTS
 - ### Features
    - Support more interface: ListQuotas
 - ### Bug Fix
    - None
 - ### Change
    - None

## HuaweiCloud SDK EPS
 - ### Features
    - None
 - ### Bug Fix
    - None
 - ### Change
    - Adjust interfaces' names, replace abbreviations of `EP` with `EnterpriseProject`, the involved interfaces are:
     1. ListEP → ListEnterpriseProject
     2. CreateEP → CreateEnterpriseProject
     3. ShowEP → ShowEnterpriseProject
     4. ModifyEP → ModifyEnterpriseProject
     5. EnableEP → EnableEnterpriseProject
     6. ShowEPQuota → ShowEnterpriseProjectQuota
     7. ShowResourceBindEP → ShowResourceBindEnterpriseProject
     8. DisableEP → DisableEnterpriseProject

## HuaweiCloud SDK FunctionGraph
 - ### Features
    - Support more interfaces: UpdateTrigger, ListFunctionStatistics, ListStatistics, ListQuotas
 - ### Bug Fix
    - None
 - ### Change
    - None

## HuaweiCloud SDK Iam
 - ### Features
    - None
 - ### Bug Fix
    - None
 - ### Change
    - Adjust interfaces' names, the involved interfaces are:
     1. KeystoneCreateUserTokenByPasswordAndMFA → KeystoneCreateUserTokenByPasswordAndMfa
     2. CreateUnscopeTokenByIDPInitiated → CreateUnscopeTokenByIdpInitiated

## HuaweiCloud SDK ProjectMan
 - ### Features
    - Support more interfaces: iteration information, user information, project members, project information, project indicators, project statistics, etc.
 - ### Bug Fix
    - None
 - ### Change
    - None

## HuaweiCloud SDK SMS
 - ### Features
    - Support Server Migration Service.
 - ### Bug Fix
    - None
 - ### Change
    - None


## 3.0.18-beta 2020-10-20
## HuaweiCloud SDK DCS
 - ### Features
    - None
 - ### Bug Fix
    - None
 - ### Change
    - Remove redundant `Dcs` in interfaces.

## HuaweiCloud SDK ELB
 - ### Features
    - Support more interfaces of version v2.
 - ### Bug Fix
    - None
 - ### Change
    - None

## HuaweiCloud SDK IoTDA
 - ### Features
    - Support more interfaces related to rules.
 - ### Bug Fix
    - None
 - ### Change
    - None

## HuaweiCloud SDK Meeting
 - ### Features
    - Support more interfaces.
 - ### Bug Fix
    - None
 - ### Change
    - None


## 3.0.17-beta 2020-10-14
## HuaweiCloud SDK BSS
 - ### Features
    - Partner center supports exporting product catalog prices.
 - ### Bug Fix
    - None
 - ### Change
    - None

## HuaweiCloud SDK DCS
 - ### Features
    - Support more interfaces.
 - ### Bug Fix
    - None
 - ### Change
    - None

## HuaweiCloud SDK Live
 - ### Features
    - Support more interfaces of version v2 of Live.
 - ### Bug Fix
    - None
 - ### Change
    - None


## 3.0.16-beta 2020-10-12
## HuaweiCloud SDK CTS
 - ### Features
    - None
 - ### Bug Fix
    - None
 - ### Change
    - Delete deprecated interfaces of version v1.

## HuaweiCloud SDK DevStar
 - ### Features
    - None
 - ### Bug Fix
    - Modify the credential type of DevStarClient: the correct credential type is GlobalCredentials.
 - ### Change
    - None


## 3.0.15-beta 2020-09-30
## HuaweiCloud SDK CBR
 - ### Features
    - Support Cloud Backup and Recovery service.
 - ### Bug Fix
    - None
 - ### Change
    - None


## 3.0.14-beta 2020-09-24
## HuaweiCloud SDK Core
 - ### Features
    - None
 - ### Bug Fix
    - [Issue 11](https://github.com/huaweicloud/huaweicloud-sdk-java-v3/issues/11) Fix the problem that improper use of okhttp3 which causes the number of threads to keep continuous increasing.
 - ### Change
    - None

## HuaweiCloud SDK BSS
 - ### Features
    - None
 - ### Bug Fix
    - Fix the problem that the class `BssClient` cannot be loaded.
 - ### Change
    - None

## HuaweiCloud SDK EIP
 - ### Features
    - None
 - ### Bug Fix
    - None
 - ### Change
    - Interface `ListPublicips` adjustment: enterprise_project_id does not support multi-value query.

## HuaweiCloud SDK OMS
 - ### Features
    - Support Object Storage Migration Service.
 - ### Bug Fix
    - None
 - ### Change
    - None

## HuaweiCloud SDK TestHub
 - ### Features
    - None
 - ### Bug Fix
    - None
 - ### Change
    - The original service name `TestHub` has been changed to `CloudTest`, because `TestHub` couldn't be published in SDK Center successfully. 


## 3.0.13-beta 2020-09-16
## HuaweiCloud SDK ECS
 - ### Features
    - None
 - ### Bug Fix
    - Fix parameter type of interfaces.
 - ### Change
    - None

## HuaweiCloud SDK BSS
 - ### Features
    - None
 - ### Bug Fix
    - None
 - ### Change
    - Update interfaces.

## HuaweiCloud SDK EIP
 - ### Features
    - None
 - ### Bug Fix
    - Fix the problem that not support transfer multiple values.
 - ### Change
    - None

## HuaweiCloud SDK ELB
 - ### Features
    - None
 - ### Bug Fix
    - Fix the problem that some parameters are wrong.
 - ### Change
    - None

## HuaweiCloud SDK IMS
 - ### Features
    - None
 - ### Bug Fix
    - None
 - ### Change
    - Adjust descriptions of interfaces.

## HuaweiCloud SDK Live
 - ### Features
    - None
 - ### Bug Fix
    - None
 - ### Change
    - Adjust descriptions of banned interface.


# 3.0.12-beta 2020-09-11


# 3.0.11-beta 2020-09-09
## HuaweiCloud SDK Core
 - ### Features
    - None
 - ### Bug Fix
    - None
 - ### Change
    - Enhance the security of dynamic enumerated types.

## HuaweiCloud SDK Meeting
 - ### Features
    - Support more APIs: Meeting Control / Meeting Management.
 - ### Bug Fix
    - None
 - ### Change
    - None

## HuaweiCloud SDK VPC
 - ### Features
    - None
 - ### Bug Fix
    - Fix the problem that security group related interfaces have wrong data type.
 - ### Change
    - None


# 3.0.10-beta 2020-09-04
## HuaweiCloud SDK Core
 - ### Features
    - None
 - ### Bug Fix
    - Support multiple types of authentication, revert the interface class ICredential.
    - Fix the problem that the enumeration code cannot be generated for integer enumeration parameters without "format" defined in yaml.
    - Fix the problem that authentication will fail if the request query is an array and contains multiple values.
 - ### Change
    - Modify User Agent of Http Request header.

## HuaweiCloud SDK DevStar
 - ### Features
    - Support more APIs: DownloadApplicationCode
 - ### Bug Fix
    - None
 - ### Change
    - None

## HuaweiCloud SDK DMS
 - ### Features
    - Support Distributed Message Services, provide Kafka premium instances and RabbitMQ premium instances with dedicated resources.
 - ### Bug Fix
    - None
 - ### Change
    - None


# 3.0.9-beta 2020-08-28
## HuaweiCloud SDK CloudPipeline
 - ### Features
    - Support CloudPipeline service.
 - ### Bug Fix
    - None
 - ### Change
    - None

## HuaweiCloud SDK CodeHub
 - ### Features
    - Support CodeHub service.
 - ### Bug Fix
    - None
 - ### Change
    - None

## HuaweiCloud SDK EIP
 - ### Features
    - Support more APIs: tags related APIs and shared bandwidth related APIs.
 - ### Bug Fix
    - Interface BatchCreateBandwidth: modify field billing_info. 
 - ### Change
    - None
    
## HuaweiCloud SDK EVS
 - ### Features
    - None
 - ### Bug Fix
    - APIs ListVolumesByTags, solve the problem of type definition error of field `total_count`.
 - ### Change
    - None

## HuaweiCloud SDK ELB
 - ### Features
    - Support Elastic Load Balance service.
 - ### Bug Fix
    - None
 - ### Change
    - None

## HuaweiCloud SDK FunctionGraph
 - ### Features
    - None
 - ### Bug Fix
    - None
 - ### Change
    - Modify service name, change abbreviation FGS to full name FunctionGraph.

## HuaweiCloud SDK IAM
 - ### Features
    - Support more APIs: consistency of console related APIs.
 - ### Bug Fix
    - None
 - ### Change
    - None

## HuaweiCloud SDK IoTDA
 - ### Features
    - Support more APIs: batch operation related APIs and asynchronous related APIs.
 - ### Bug Fix
    - None
 - ### Change
    - None

## HuaweiCloud SDK Meeting
 - ### Features
    - Support more APIs: meeting minutes related APIs.
 - ### Bug Fix
    - None
 - ### Change
    - None
    
## HuaweiCloud SDK ProjectMan
 - ### Features
    - Support Project Management service.
 - ### Bug Fix
    - None
 - ### Change
    - None

## HuaweiCloud SDK TestHub
 - ### Features
    - Support TestHub tools in CloudTest service.
 - ### Bug Fix
    - None
 - ### Change
    - None

## HuaweiCloud SDK VPC
 - ### Features
    - Support more APIs: security group, security group rules, available IP count related APIs.
 - ### Bug Fix
    - None
 - ### Change
    - None


# 3.0.8-beta 2020-8-14
## HuaweiCloud SDK Core
 - ### Features
    - Support temporary AK/SK authentication mode.
 - ### Bug Fix
    - None
 - ### Change
    - None

## HuaweiCloud SDK BSS
 - ### Features
    - Support Business Support System service.
 - ### Bug Fix
    - None
 - ### Change
    - None

## HuaweiCloud SDK CloudIDE
 - ### Features
    - Support Cloud IDE service.
 - ### Bug Fix
    - None
 - ### Change
    - None

## HuaweiCloud SDK Live
 - ### Features
    - Support Live service.
 - ### Bug Fix
    - None
 - ### Change
    - None

## HuaweiCloud SDK RDS
 - ### Features
    - Support Relational Database Service.
 - ### Bug Fix
    - None
 - ### Change
    - None


# 3.0.7-beta 2020-07-30
## HuaweiCloud SDK APIG
 - ### Features
    - Support API Gateway.
 - ### Bug Fix
    - None
 - ### Change
    - None

## HuaweiCloud SDK CloudBuild
 - ### Features
    - Support CloudBuild platform.
 - ### Bug Fix
    - None
 - ### Change
    - None

## HuaweiCloud SDK DC
 - ### Features
    - Support Direct Connect Service.
 - ### Bug Fix
    - None
 - ### Change
    - None

## HuaweiCloud SDK ECS
 - ### Features
    - Publish new interfaces, such as ChangeServerOs and ResetServerPassword.
 - ### Bug Fix
    - None
 - ### Change
    - None

## HuaweiCloud SDK KMS
 - ### Features
    - Support Key Management Service.
 - ### Bug Fix
    - None
 - ### Change
    - None

## HuaweiCloud SDK Meeting
 - ### Features
    - Add interfaces of global window module.
 - ### Bug Fix
    - None
 - ### Change
    - None

## HuaweiCloud SDK MPC
 - ### Features
    - Support Media Processing Center.
 - ### Bug Fix
    - None
 - ### Change
    - None

## HuaweiCloud SDK ServiceStage
 - ### Features
    - Support ServiceStage.
 - ### Bug Fix
    - None
 - ### Change
    - None

## HuaweiCloud SDK VPC
 - ### Features
    - Support interfaces of version v3.
 - ### Bug Fix
    - None
 - ### Change
    - None


# 3.0.6-beta 2020-07-15
## HuaweiCloud SDK ECS
 - ### Features
    - Support interface of creating ECSs with Spot price billing Mode.
 - ### Bug Fix
    - None
 - ### Change
    - None

## HuaweiCloud SDK EIP
 - ### Features
    - Support Elastic IP Service.
 - ### Bug Fix
    - None
 - ### Change
    - None

## HuaweiCloud SDK EPS
 - ### Features
    - Support Enterprise Project Management Service.
 - ### Bug Fix
    - None
 - ### Change
    - None

## HuaweiCloud SDK EVS
 - ### Features
    - None
 - ### Bug Fix
    - [Issue #3](https://github.com/huaweicloud/huaweicloud-sdk-java-v3/issues/3): Fix call error of interface ShowVolume.
 - ### Change
    - None

## HuaweiCloud SDK IAM
  - ### Features
    - None
  - ### Bug Fix
    - Fix parsing failure of response body of interface keystoneListVersions.
  - ### Change
    - None

## HuaweiCloud SDK IoTDA
 - ### Features
    - None
 - ### Bug Fix
    - None
 - ### Change
    - Support related interfaces of application management.

## HuaweiCloud SDK Meeting
 - ### Features
    - Support cloud meeting management and control services.
 - ### Bug Fix
    - None
 - ### Change
    - None

## HuaweiCloud SDK TMS
 - ### Features
    - Support Tag Management Service.
 - ### Bug Fix
    - None
 - ### Change
    - None
    
    
# 3.0.5-beta 2020-06-30
## HuaweiCloud SDK Core
 - ### Features
    - Support file upload and download.
 - ### Bug Fix
    - Fix AK/SK authentication failure when Content-Type is application/json.
 - ### Change
    - None

## HuaweiCloud SDK CTS
 - ### Features
    - Support Cloud Trace Service.
 - ### Bug Fix
    - None
 - ### Change
    - None
    
## HuaweiCloud SDK EVS
 - ### Features
    - None
 - ### Bug Fix
    - None
 - ### Change
    - Support full service interface.

## HuaweiCloud SDK IoTDA
 - ### Features
    - Support IoT Device Access Service.
 - ### Bug Fix
    - None
 - ### Change
    - None

# 3.0.4-beta 2020-06-19
## HuaweiCloud SDK ECS
 - ### Features
    - Support interface of creating ECSs with Yearly/Monthly billing Mode.
 - ### Bug Fix
    - None
 - ### Change
    - None

## HuaweiCloud SDK Meeting
 - ### Features
    - Support cloud meeting service.
 - ### Bug Fix
    - None
 - ### Change
    - None


# 3.0.3-beta 2020-06-15
## HuaweiCloud SDK Core
 - ### Features
    - Support async client.
    - Support access logs.
    - Support Http Listener.
 - ### Bug Fix
    - fix proxy unavailable problem.
 - ### Change
    - None
