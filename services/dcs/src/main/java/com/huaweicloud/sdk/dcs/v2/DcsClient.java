package com.huaweicloud.sdk.dcs.v2;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.dcs.v2.model.*;

public class DcsClient {
    protected HcClient hcClient;

    public DcsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DcsClient> newBuilder() {
        return new ClientBuilder<>(DcsClient::new);
    }


    /**
     * 批量添加或删除标签
     * 为指定实例批量添加标签，或批量删除标签。
     *
     * @param BatchCreateOrDeleteDcsTagsRequest 请求对象
     * @return BatchCreateOrDeleteDcsTagsResponse
    */
    public BatchCreateOrDeleteDcsTagsResponse batchCreateOrDeleteDcsTags(BatchCreateOrDeleteDcsTagsRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.batchCreateOrDeleteDcsTags);
    }

    /**
     * 批量删除实例
     * 批量删除多个缓存实例。
     *
     * @param BatchDeleteDCSInstancesRequest 请求对象
     * @return BatchDeleteDCSInstancesResponse
    */
    public BatchDeleteDCSInstancesResponse batchDeleteDCSInstances(BatchDeleteDCSInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.batchDeleteDCSInstances);
    }

    /**
     * 备份指定实例
     * 备份指定的缓存实例。 &gt; 只有主备和集群类型的缓存实例支持备份恢复操作，单机实例不支持备份恢复操作。 
     *
     * @param CopyInstanceRequest 请求对象
     * @return CopyInstanceResponse
    */
    public CopyInstanceResponse copyInstance(CopyInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.copyInstance);
    }

    /**
     * 创建缓存实例
     * 创建缓存实例，该接口创建的缓存实例支持按需计费和包周期两种方式。
     *
     * @param CreateDCSInstanceRequest 请求对象
     * @return CreateDCSInstanceResponse
    */
    public CreateDCSInstanceResponse createDCSInstance(CreateDCSInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.createDCSInstance);
    }

    /**
     * 创建数据迁移任务
     * 创建数据迁移任务。
     *
     * @param CreateMigrationTaskRequest 请求对象
     * @return CreateMigrationTaskResponse
    */
    public CreateMigrationTaskResponse createMigrationTask(CreateMigrationTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.createMigrationTask);
    }

    /**
     * 添加副本
     * 为Cluster集群实例的分片添加副本。
     *
     * @param CreateReplicationRequest 请求对象
     * @return CreateReplicationResponse
    */
    public CreateReplicationResponse createReplication(CreateReplicationRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.createReplication);
    }

    /**
     * 删除备份文件
     * 删除缓存实例已备份的文件。
     *
     * @param DeleteBackupFileRequest 请求对象
     * @return DeleteBackupFileResponse
    */
    public DeleteBackupFileResponse deleteBackupFile(DeleteBackupFileRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.deleteBackupFile);
    }

    /**
     * 域名摘除IP
     * 将只读副本的IP从域名中摘除，摘除成功后，只读域名不会再解析到该副本IP。
     *
     * @param DeleteIpFromDomainNameRequest 请求对象
     * @return DeleteIpFromDomainNameResponse
    */
    public DeleteIpFromDomainNameResponse deleteIpFromDomainName(DeleteIpFromDomainNameRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.deleteIpFromDomainName);
    }

    /**
     * 删除数据迁移任务
     * 删除数据迁移任务。
     *
     * @param DeleteMigrationTaskRequest 请求对象
     * @return DeleteMigrationTaskResponse
    */
    public DeleteMigrationTaskResponse deleteMigrationTask(DeleteMigrationTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.deleteMigrationTask);
    }

    /**
     * 删除副本
     * 为Cluster集群删除指定副本
     *
     * @param DeleteReplicationRequest 请求对象
     * @return DeleteReplicationResponse
    */
    public DeleteReplicationResponse deleteReplication(DeleteReplicationRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.deleteReplication);
    }

    /**
     * 删除实例
     * 删除指定的缓存实例，释放该实例的所有资源。  &gt; 如果是删除按需资源，请按照本章节执行；如果是删除包周期资源，即退订，请参考[退订包周期资源](https://support.huaweicloud.com/api-oce/zh-cn_topic_0082522030.html#section2)。 
     *
     * @param DeleteSingleDCSInstanceRequest 请求对象
     * @return DeleteSingleDCSInstanceResponse
    */
    public DeleteSingleDCSInstanceResponse deleteSingleDCSInstance(DeleteSingleDCSInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.deleteSingleDCSInstance);
    }

    /**
     * 查询可用区信息
     * 查询所在局点的可用区信息
     *
     * @param ListAvailableZonesRequest 请求对象
     * @return ListAvailableZonesResponse
    */
    public ListAvailableZonesResponse listAvailableZones(ListAvailableZonesRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.listAvailableZones);
    }

    /**
     * 获取备份文件下载链接
     * 获取指定实例的备份文件下载链接，下载备份文件。
     *
     * @param ListBackupFileLinksRequest 请求对象
     * @return ListBackupFileLinksResponse
    */
    public ListBackupFileLinksResponse listBackupFileLinks(ListBackupFileLinksRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.listBackupFileLinks);
    }

    /**
     * 查询实例备份信息
     * 查询指定缓存实例的备份信息列表。
     *
     * @param ListBackupRecordsRequest 请求对象
     * @return ListBackupRecordsResponse
    */
    public ListBackupRecordsResponse listBackupRecords(ListBackupRecordsRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.listBackupRecords);
    }

    /**
     * 查询主维度信息列表
     * 查询主维度对象列表，主维度ID当前支持dcs_instance_id，dcs_memcached_instance_id。 &gt; 该接口当前仅在中国华南区开放。 
     *
     * @param ListCESMonitoredObjectsRequest 请求对象
     * @return ListCESMonitoredObjectsResponse
    */
    public ListCESMonitoredObjectsResponse listCESMonitoredObjects(ListCESMonitoredObjectsRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.listCESMonitoredObjects);
    }

    /**
     * 查询实例配置参数
     * 查询指定实例的配置参数信息。
     *
     * @param ListConfigurationsRequest 请求对象
     * @return ListConfigurationsResponse
    */
    public ListConfigurationsResponse listConfigurations(ListConfigurationsRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.listConfigurations);
    }

    /**
     * 查询租户所有标签
     * 查询租户在指定Project中实例类型的所有资源标签集合。
     *
     * @param ListDcsTagsOfTenantRequest 请求对象
     * @return ListDcsTagsOfTenantResponse
    */
    public ListDcsTagsOfTenantResponse listDcsTagsOfTenant(ListDcsTagsOfTenantRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.listDcsTagsOfTenant);
    }

    /**
     * 查询产品规格
     * 在创建缓存实例时，需要配置订购的产品规格编码（spec_code），可通过该接口查询产品规格，查询条件不选时默认查询全部。
     *
     * @param ListFlavorsRequest 请求对象
     * @return ListFlavorsResponse
    */
    public ListFlavorsResponse listFlavors(ListFlavorsRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.listFlavors);
    }

    /**
     * 查询分片信息
     * 查询读写分离实例和集群实例的分片和副本信息，其中，读写分离实例仅Redis4.0和Redis5.0的主备实例支持。
     *
     * @param ListGroupReplicationInfoRequest 请求对象
     * @return ListGroupReplicationInfoResponse
    */
    public ListGroupReplicationInfoResponse listGroupReplicationInfo(ListGroupReplicationInfoRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.listGroupReplicationInfo);
    }

    /**
     * 查询维护时间窗时间段
     * 查询维护时间窗开始时间和结束时间。
     *
     * @param ListMaintenanceWindowsRequest 请求对象
     * @return ListMaintenanceWindowsResponse
    */
    public ListMaintenanceWindowsResponse listMaintenanceWindows(ListMaintenanceWindowsRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.listMaintenanceWindows);
    }

    /**
     * 查询迁移任务列表
     * 查询迁移任务列表。
     *
     * @param ListMigrationTaskRequest 请求对象
     * @return ListMigrationTaskResponse
    */
    public ListMigrationTaskResponse listMigrationTask(ListMigrationTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.listMigrationTask);
    }

    /**
     * 查询单个主维度下子维度监控对象列表
     * 查询主维度下子维度监控对象列表，当前支持子维度的主维度ID的有 dcs_instance_id &gt; 该接口当前仅在中国华南区开放。 
     *
     * @param ListMonitoredObjectsOfInstanceRequest 请求对象
     * @return ListMonitoredObjectsOfInstanceResponse
    */
    public ListMonitoredObjectsOfInstanceResponse listMonitoredObjectsOfInstance(ListMonitoredObjectsOfInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.listMonitoredObjectsOfInstance);
    }

    /**
     * 查询实例状态
     * 查询该租户在当前区域下不同状态的实例数。
     *
     * @param ListNumberOfInstancesInDifferentStatusRequest 请求对象
     * @return ListNumberOfInstancesInDifferentStatusResponse
    */
    public ListNumberOfInstancesInDifferentStatusResponse listNumberOfInstancesInDifferentStatus(ListNumberOfInstancesInDifferentStatusRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.listNumberOfInstancesInDifferentStatus);
    }

    /**
     * 查询实例恢复记录
     * 查询指定缓存实例的恢复记录列表。
     *
     * @param ListRestoreRecordsRequest 请求对象
     * @return ListRestoreRecordsResponse
    */
    public ListRestoreRecordsResponse listRestoreRecords(ListRestoreRecordsRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.listRestoreRecords);
    }

    /**
     * 查询运行中实例的统计信息
     * 查询当前租户下处于“运行中”状态的缓存实例的统计信息。
     *
     * @param ListStatisticsOfRunningInstancesRequest 请求对象
     * @return ListStatisticsOfRunningInstancesResponse
    */
    public ListStatisticsOfRunningInstancesResponse listStatisticsOfRunningInstances(ListStatisticsOfRunningInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.listStatisticsOfRunningInstances);
    }

    /**
     * 重启实例或清空数据
     * 重启运行中的DCS缓存实例。  清空Redis4.0/Redis5.0的实例数据，数据清空后，无法撤销，且无法恢复，请谨慎操作。 
     *
     * @param RestartOrFlushDCSInstancesRequest 请求对象
     * @return RestartOrFlushDCSInstancesResponse
    */
    public RestartOrFlushDCSInstancesResponse restartOrFlushDCSInstances(RestartOrFlushDCSInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.restartOrFlushDCSInstances);
    }

    /**
     * 恢复指定实例
     * 恢复指定的缓存实例。 &gt; 只有主备和集群类型的缓存实例支持备份恢复操作，单机实例不支持备份恢复操作。 
     *
     * @param RestoreInstanceRequest 请求对象
     * @return RestoreInstanceResponse
    */
    public RestoreInstanceResponse restoreInstance(RestoreInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.restoreInstance);
    }

    /**
     * 查询单个实例标签
     * 通过实例id查询标签。
     *
     * @param ShowDcsTagsRequest 请求对象
     * @return ShowDcsTagsResponse
    */
    public ShowDcsTagsResponse showDcsTags(ShowDcsTagsRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.showDcsTags);
    }

    /**
     * 查询迁移任务详情
     * 查询迁移任务详情。
     *
     * @param ShowMigrationTaskRequest 请求对象
     * @return ShowMigrationTaskResponse
    */
    public ShowMigrationTaskResponse showMigrationTask(ShowMigrationTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.showMigrationTask);
    }

    /**
     * 查询租户配额
     * 查询租户默认可以创建的实例数和总内存的配额限制，以及可以申请配额的最大值和最小值。不同的租户在不同的区域配额可能不同。
     *
     * @param ShowQuotaOfTenantRequest 请求对象
     * @return ShowQuotaOfTenantResponse
    */
    public ShowQuotaOfTenantResponse showQuotaOfTenant(ShowQuotaOfTenantRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.showQuotaOfTenant);
    }

    /**
     * 停止数据迁移任务
     * 停止数据迁移任务。
     *
     * @param StopMigrationTaskRequest 请求对象
     * @return StopMigrationTaskResponse
    */
    public StopMigrationTaskResponse stopMigrationTask(StopMigrationTaskRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.stopMigrationTask);
    }

    /**
     * 修改实例配置参数
     * 为了确保分布式缓存服务发挥出最优性能，您可以根据自己的业务情况对DCS缓存实例的运行参数进行调整。
     *
     * @param UpdateConfigurationsRequest 请求对象
     * @return UpdateConfigurationsResponse
    */
    public UpdateConfigurationsResponse updateConfigurations(UpdateConfigurationsRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.updateConfigurations);
    }

    /**
     * 修改实例信息
     * 修改缓存实例的信息，可修改信息包括实例名称、描述、备份策略、维护时间窗开始和结束时间以及安全组。
     *
     * @param UpdateDCSInstanceRequest 请求对象
     * @return UpdateDCSInstanceResponse
    */
    public UpdateDCSInstanceResponse updateDCSInstance(UpdateDCSInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.updateDCSInstance);
    }

    /**
     * 修改密码
     * 修改缓存实例的密码。
     *
     * @param UpdatePasswordRequest 请求对象
     * @return UpdatePasswordResponse
    */
    public UpdatePasswordResponse updatePassword(UpdatePasswordRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.updatePassword);
    }

    /**
     * 设置备节点优先级
     * 设置副本优先级，主节点故障时，权重越小的备节点切换为主节点的优先级越高。
     *
     * @param UpdateSlavePriorityRequest 请求对象
     * @return UpdateSlavePriorityResponse
    */
    public UpdateSlavePriorityResponse updateSlavePriority(UpdateSlavePriorityRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.updateSlavePriority);
    }

    /**
     * 查询指定实例的IP白名单
     * 查询指定实例的IP白名单。
     *
     * @param ShowIpWhitelistRequest 请求对象
     * @return ShowIpWhitelistResponse
    */
    public ShowIpWhitelistResponse showIpWhitelist(ShowIpWhitelistRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.showIpWhitelist);
    }

    /**
     * 设置IP白名单分组
     * 为指定实例设置IP白名单分组
     *
     * @param UpdateIpWhitelistRequest 请求对象
     * @return UpdateIpWhitelistResponse
    */
    public UpdateIpWhitelistResponse updateIpWhitelist(UpdateIpWhitelistRequest request) {
        return hcClient.syncInvokeHttp(request, DcsMeta.updateIpWhitelist);
    }

}