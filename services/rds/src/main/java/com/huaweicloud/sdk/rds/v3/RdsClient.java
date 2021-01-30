package com.huaweicloud.sdk.rds.v3;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.rds.v3.model.*;

public class RdsClient {
    protected HcClient hcClient;

    public RdsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<RdsClient> newBuilder() {
        return new ClientBuilder<>(RdsClient::new);
    }


    /**
     * 绑定和解绑弹性公网IP
     * 绑定和解绑弹性公网IP。
     *
     * @param AttachEipRequest 请求对象
     * @return AttachEipResponse
     */
    public AttachEipResponse attachEip(AttachEipRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.attachEip);
    }

    /**
     * 绑定和解绑弹性公网IP
     * 绑定和解绑弹性公网IP。
     *
     * @param AttachEipRequest 请求对象
     * @return SyncInvoker<AttachEipRequest, AttachEipResponse>
     */
    public SyncInvoker<AttachEipRequest, AttachEipResponse> attachEipInvoker(AttachEipRequest request) {
        return new SyncInvoker<AttachEipRequest, AttachEipResponse>(request, RdsMeta.attachEip, hcClient);
    }

    /**
     * 批量添加删除标签
     * 批量添加删除标签。
     *
     * @param BatchTagActionRequest 请求对象
     * @return BatchTagActionResponse
     */
    public BatchTagActionResponse batchTagAction(BatchTagActionRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.batchTagAction);
    }

    /**
     * 批量添加删除标签
     * 批量添加删除标签。
     *
     * @param BatchTagActionRequest 请求对象
     * @return SyncInvoker<BatchTagActionRequest, BatchTagActionResponse>
     */
    public SyncInvoker<BatchTagActionRequest, BatchTagActionResponse> batchTagActionInvoker(BatchTagActionRequest request) {
        return new SyncInvoker<BatchTagActionRequest, BatchTagActionResponse>(request, RdsMeta.batchTagAction, hcClient);
    }

    /**
     * 更改主备实例的同步模式
     * 更改主备实例的同步模式.
     *
     * @param ChangeFailoverModeRequest 请求对象
     * @return ChangeFailoverModeResponse
     */
    public ChangeFailoverModeResponse changeFailoverMode(ChangeFailoverModeRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.changeFailoverMode);
    }

    /**
     * 更改主备实例的同步模式
     * 更改主备实例的同步模式.
     *
     * @param ChangeFailoverModeRequest 请求对象
     * @return SyncInvoker<ChangeFailoverModeRequest, ChangeFailoverModeResponse>
     */
    public SyncInvoker<ChangeFailoverModeRequest, ChangeFailoverModeResponse> changeFailoverModeInvoker(ChangeFailoverModeRequest request) {
        return new SyncInvoker<ChangeFailoverModeRequest, ChangeFailoverModeResponse>(request, RdsMeta.changeFailoverMode, hcClient);
    }

    /**
     * 切换主备实例的倒换策略
     * 切换主备实例的倒换策略.
     *
     * @param ChangeFailoverStrategyRequest 请求对象
     * @return ChangeFailoverStrategyResponse
     */
    public ChangeFailoverStrategyResponse changeFailoverStrategy(ChangeFailoverStrategyRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.changeFailoverStrategy);
    }

    /**
     * 切换主备实例的倒换策略
     * 切换主备实例的倒换策略.
     *
     * @param ChangeFailoverStrategyRequest 请求对象
     * @return SyncInvoker<ChangeFailoverStrategyRequest, ChangeFailoverStrategyResponse>
     */
    public SyncInvoker<ChangeFailoverStrategyRequest, ChangeFailoverStrategyResponse> changeFailoverStrategyInvoker(ChangeFailoverStrategyRequest request) {
        return new SyncInvoker<ChangeFailoverStrategyRequest, ChangeFailoverStrategyResponse>(request, RdsMeta.changeFailoverStrategy, hcClient);
    }

    /**
     * 设置可维护时间段
     * 设置可维护时间段
     *
     * @param ChangeOpsWindowRequest 请求对象
     * @return ChangeOpsWindowResponse
     */
    public ChangeOpsWindowResponse changeOpsWindow(ChangeOpsWindowRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.changeOpsWindow);
    }

    /**
     * 设置可维护时间段
     * 设置可维护时间段
     *
     * @param ChangeOpsWindowRequest 请求对象
     * @return SyncInvoker<ChangeOpsWindowRequest, ChangeOpsWindowResponse>
     */
    public SyncInvoker<ChangeOpsWindowRequest, ChangeOpsWindowResponse> changeOpsWindowInvoker(ChangeOpsWindowRequest request) {
        return new SyncInvoker<ChangeOpsWindowRequest, ChangeOpsWindowResponse>(request, RdsMeta.changeOpsWindow, hcClient);
    }

    /**
     * 创建参数模板
     * 创建参数模板。
     *
     * @param CreateConfigurationRequest 请求对象
     * @return CreateConfigurationResponse
     */
    public CreateConfigurationResponse createConfiguration(CreateConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.createConfiguration);
    }

    /**
     * 创建参数模板
     * 创建参数模板。
     *
     * @param CreateConfigurationRequest 请求对象
     * @return SyncInvoker<CreateConfigurationRequest, CreateConfigurationResponse>
     */
    public SyncInvoker<CreateConfigurationRequest, CreateConfigurationResponse> createConfigurationInvoker(CreateConfigurationRequest request) {
        return new SyncInvoker<CreateConfigurationRequest, CreateConfigurationResponse>(request, RdsMeta.createConfiguration, hcClient);
    }

    /**
     * 创建数据库实例/恢复到新实例
     * 创建数据库实例/恢复到新实例。
     *
     * @param CreateInstanceRequest 请求对象
     * @return CreateInstanceResponse
     */
    public CreateInstanceResponse createInstance(CreateInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.createInstance);
    }

    /**
     * 创建数据库实例/恢复到新实例
     * 创建数据库实例/恢复到新实例。
     *
     * @param CreateInstanceRequest 请求对象
     * @return SyncInvoker<CreateInstanceRequest, CreateInstanceResponse>
     */
    public SyncInvoker<CreateInstanceRequest, CreateInstanceResponse> createInstanceInvoker(CreateInstanceRequest request) {
        return new SyncInvoker<CreateInstanceRequest, CreateInstanceResponse>(request, RdsMeta.createInstance, hcClient);
    }

    /**
     * 删除参数模板
     * 删除参数模板。
     *
     * @param DeleteConfigurationRequest 请求对象
     * @return DeleteConfigurationResponse
     */
    public DeleteConfigurationResponse deleteConfiguration(DeleteConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.deleteConfiguration);
    }

    /**
     * 删除参数模板
     * 删除参数模板。
     *
     * @param DeleteConfigurationRequest 请求对象
     * @return SyncInvoker<DeleteConfigurationRequest, DeleteConfigurationResponse>
     */
    public SyncInvoker<DeleteConfigurationRequest, DeleteConfigurationResponse> deleteConfigurationInvoker(DeleteConfigurationRequest request) {
        return new SyncInvoker<DeleteConfigurationRequest, DeleteConfigurationResponse>(request, RdsMeta.deleteConfiguration, hcClient);
    }

    /**
     * 删除实例
     * 删除实例。
     *
     * @param DeleteInstanceRequest 请求对象
     * @return DeleteInstanceResponse
     */
    public DeleteInstanceResponse deleteInstance(DeleteInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.deleteInstance);
    }

    /**
     * 删除实例
     * 删除实例。
     *
     * @param DeleteInstanceRequest 请求对象
     * @return SyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>
     */
    public SyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstanceInvoker(DeleteInstanceRequest request) {
        return new SyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>(request, RdsMeta.deleteInstance, hcClient);
    }

    /**
     * 删除手动备份
     * 删除手动备份。
     *
     * @param DeleteManualBackupRequest 请求对象
     * @return DeleteManualBackupResponse
     */
    public DeleteManualBackupResponse deleteManualBackup(DeleteManualBackupRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.deleteManualBackup);
    }

    /**
     * 删除手动备份
     * 删除手动备份。
     *
     * @param DeleteManualBackupRequest 请求对象
     * @return SyncInvoker<DeleteManualBackupRequest, DeleteManualBackupResponse>
     */
    public SyncInvoker<DeleteManualBackupRequest, DeleteManualBackupResponse> deleteManualBackupInvoker(DeleteManualBackupRequest request) {
        return new SyncInvoker<DeleteManualBackupRequest, DeleteManualBackupResponse>(request, RdsMeta.deleteManualBackup, hcClient);
    }

    /**
     * 创建手动备份
     * 创建手动备份。
     *
     * @param DoManualBackupRequest 请求对象
     * @return DoManualBackupResponse
     */
    public DoManualBackupResponse doManualBackup(DoManualBackupRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.doManualBackup);
    }

    /**
     * 创建手动备份
     * 创建手动备份。
     *
     * @param DoManualBackupRequest 请求对象
     * @return SyncInvoker<DoManualBackupRequest, DoManualBackupResponse>
     */
    public SyncInvoker<DoManualBackupRequest, DoManualBackupResponse> doManualBackupInvoker(DoManualBackupRequest request) {
        return new SyncInvoker<DoManualBackupRequest, DoManualBackupResponse>(request, RdsMeta.doManualBackup, hcClient);
    }

    /**
     * 获取日志信息
     * 获取日志信息
     *
     * @param DownloadSlowlogRequest 请求对象
     * @return DownloadSlowlogResponse
     */
    public DownloadSlowlogResponse downloadSlowlog(DownloadSlowlogRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.downloadSlowlog);
    }

    /**
     * 获取日志信息
     * 获取日志信息
     *
     * @param DownloadSlowlogRequest 请求对象
     * @return SyncInvoker<DownloadSlowlogRequest, DownloadSlowlogResponse>
     */
    public SyncInvoker<DownloadSlowlogRequest, DownloadSlowlogResponse> downloadSlowlogInvoker(DownloadSlowlogRequest request) {
        return new SyncInvoker<DownloadSlowlogRequest, DownloadSlowlogResponse>(request, RdsMeta.downloadSlowlog, hcClient);
    }

    /**
     * 应用参数模板
     * 应用参数模板。
     *
     * @param EnableConfigurationRequest 请求对象
     * @return EnableConfigurationResponse
     */
    public EnableConfigurationResponse enableConfiguration(EnableConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.enableConfiguration);
    }

    /**
     * 应用参数模板
     * 应用参数模板。
     *
     * @param EnableConfigurationRequest 请求对象
     * @return SyncInvoker<EnableConfigurationRequest, EnableConfigurationResponse>
     */
    public SyncInvoker<EnableConfigurationRequest, EnableConfigurationResponse> enableConfigurationInvoker(EnableConfigurationRequest request) {
        return new SyncInvoker<EnableConfigurationRequest, EnableConfigurationResponse>(request, RdsMeta.enableConfiguration, hcClient);
    }

    /**
     * 获取审计日志列表
     * 获取审计日志列表。
     *
     * @param ListAuditlogsRequest 请求对象
     * @return ListAuditlogsResponse
     */
    public ListAuditlogsResponse listAuditlogs(ListAuditlogsRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listAuditlogs);
    }

    /**
     * 获取审计日志列表
     * 获取审计日志列表。
     *
     * @param ListAuditlogsRequest 请求对象
     * @return SyncInvoker<ListAuditlogsRequest, ListAuditlogsResponse>
     */
    public SyncInvoker<ListAuditlogsRequest, ListAuditlogsResponse> listAuditlogsInvoker(ListAuditlogsRequest request) {
        return new SyncInvoker<ListAuditlogsRequest, ListAuditlogsResponse>(request, RdsMeta.listAuditlogs, hcClient);
    }

    /**
     * 获取备份列表
     * 获取备份列表。
     *
     * @param ListBackupsRequest 请求对象
     * @return ListBackupsResponse
     */
    public ListBackupsResponse listBackups(ListBackupsRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listBackups);
    }

    /**
     * 获取备份列表
     * 获取备份列表。
     *
     * @param ListBackupsRequest 请求对象
     * @return SyncInvoker<ListBackupsRequest, ListBackupsResponse>
     */
    public SyncInvoker<ListBackupsRequest, ListBackupsResponse> listBackupsInvoker(ListBackupsRequest request) {
        return new SyncInvoker<ListBackupsRequest, ListBackupsResponse>(request, RdsMeta.listBackups, hcClient);
    }

    /**
     * 查询SQLServer可用字符集
     * 查询SQLServer可用字符集
     *
     * @param ListCollationsRequest 请求对象
     * @return ListCollationsResponse
     */
    public ListCollationsResponse listCollations(ListCollationsRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listCollations);
    }

    /**
     * 查询SQLServer可用字符集
     * 查询SQLServer可用字符集
     *
     * @param ListCollationsRequest 请求对象
     * @return SyncInvoker<ListCollationsRequest, ListCollationsResponse>
     */
    public SyncInvoker<ListCollationsRequest, ListCollationsResponse> listCollationsInvoker(ListCollationsRequest request) {
        return new SyncInvoker<ListCollationsRequest, ListCollationsResponse>(request, RdsMeta.listCollations, hcClient);
    }

    /**
     * 获取参数模板列表
     * 获取参数模板列表，包括所有数据库的默认参数模板和用户创建的参数模板。
     *
     * @param ListConfigurationsRequest 请求对象
     * @return ListConfigurationsResponse
     */
    public ListConfigurationsResponse listConfigurations(ListConfigurationsRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listConfigurations);
    }

    /**
     * 获取参数模板列表
     * 获取参数模板列表，包括所有数据库的默认参数模板和用户创建的参数模板。
     *
     * @param ListConfigurationsRequest 请求对象
     * @return SyncInvoker<ListConfigurationsRequest, ListConfigurationsResponse>
     */
    public SyncInvoker<ListConfigurationsRequest, ListConfigurationsResponse> listConfigurationsInvoker(ListConfigurationsRequest request) {
        return new SyncInvoker<ListConfigurationsRequest, ListConfigurationsResponse>(request, RdsMeta.listConfigurations, hcClient);
    }

    /**
     * 查询数据库引擎的版本
     * 查询数据库引擎的版本。
     *
     * @param ListDatastoresRequest 请求对象
     * @return ListDatastoresResponse
     */
    public ListDatastoresResponse listDatastores(ListDatastoresRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listDatastores);
    }

    /**
     * 查询数据库引擎的版本
     * 查询数据库引擎的版本。
     *
     * @param ListDatastoresRequest 请求对象
     * @return SyncInvoker<ListDatastoresRequest, ListDatastoresResponse>
     */
    public SyncInvoker<ListDatastoresRequest, ListDatastoresResponse> listDatastoresInvoker(ListDatastoresRequest request) {
        return new SyncInvoker<ListDatastoresRequest, ListDatastoresResponse>(request, RdsMeta.listDatastores, hcClient);
    }

    /**
     * 查询数据库错误日志
     * 查询数据库错误日志。
     *
     * @param ListErrorLogsRequest 请求对象
     * @return ListErrorLogsResponse
     */
    public ListErrorLogsResponse listErrorLogs(ListErrorLogsRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listErrorLogs);
    }

    /**
     * 查询数据库错误日志
     * 查询数据库错误日志。
     *
     * @param ListErrorLogsRequest 请求对象
     * @return SyncInvoker<ListErrorLogsRequest, ListErrorLogsResponse>
     */
    public SyncInvoker<ListErrorLogsRequest, ListErrorLogsResponse> listErrorLogsInvoker(ListErrorLogsRequest request) {
        return new SyncInvoker<ListErrorLogsRequest, ListErrorLogsResponse>(request, RdsMeta.listErrorLogs, hcClient);
    }

    /**
     * 查询数据库规格
     * 查询数据库规格。
     *
     * @param ListFlavorsRequest 请求对象
     * @return ListFlavorsResponse
     */
    public ListFlavorsResponse listFlavors(ListFlavorsRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listFlavors);
    }

    /**
     * 查询数据库规格
     * 查询数据库规格。
     *
     * @param ListFlavorsRequest 请求对象
     * @return SyncInvoker<ListFlavorsRequest, ListFlavorsResponse>
     */
    public SyncInvoker<ListFlavorsRequest, ListFlavorsResponse> listFlavorsInvoker(ListFlavorsRequest request) {
        return new SyncInvoker<ListFlavorsRequest, ListFlavorsResponse>(request, RdsMeta.listFlavors, hcClient);
    }

    /**
     * 查询数据库实例列表
     * 查询数据库实例列表。
     *
     * @param ListInstancesRequest 请求对象
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstances(ListInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listInstances);
    }

    /**
     * 查询数据库实例列表
     * 查询数据库实例列表。
     *
     * @param ListInstancesRequest 请求对象
     * @return SyncInvoker<ListInstancesRequest, ListInstancesResponse>
     */
    public SyncInvoker<ListInstancesRequest, ListInstancesResponse> listInstancesInvoker(ListInstancesRequest request) {
        return new SyncInvoker<ListInstancesRequest, ListInstancesResponse>(request, RdsMeta.listInstances, hcClient);
    }

    /**
     * 获取任务信息
     * 获取任务信息。
     *
     * @param ListJobInfoRequest 请求对象
     * @return ListJobInfoResponse
     */
    public ListJobInfoResponse listJobInfo(ListJobInfoRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listJobInfo);
    }

    /**
     * 获取任务信息
     * 获取任务信息。
     *
     * @param ListJobInfoRequest 请求对象
     * @return SyncInvoker<ListJobInfoRequest, ListJobInfoResponse>
     */
    public SyncInvoker<ListJobInfoRequest, ListJobInfoResponse> listJobInfoInvoker(ListJobInfoRequest request) {
        return new SyncInvoker<ListJobInfoRequest, ListJobInfoResponse>(request, RdsMeta.listJobInfo, hcClient);
    }

    /**
     * 获取所有任务详细信息
     * 获取所有任务详细信息。
     *
     * @param ListJobInfoDetailRequest 请求对象
     * @return ListJobInfoDetailResponse
     */
    public ListJobInfoDetailResponse listJobInfoDetail(ListJobInfoDetailRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listJobInfoDetail);
    }

    /**
     * 获取所有任务详细信息
     * 获取所有任务详细信息。
     *
     * @param ListJobInfoDetailRequest 请求对象
     * @return SyncInvoker<ListJobInfoDetailRequest, ListJobInfoDetailResponse>
     */
    public SyncInvoker<ListJobInfoDetailRequest, ListJobInfoDetailResponse> listJobInfoDetailInvoker(ListJobInfoDetailRequest request) {
        return new SyncInvoker<ListJobInfoDetailRequest, ListJobInfoDetailResponse>(request, RdsMeta.listJobInfoDetail, hcClient);
    }

    /**
     * 获取跨区域备份列表
     * 获取跨区域备份列表。
     *
     * @param ListOffSiteBackupsRequest 请求对象
     * @return ListOffSiteBackupsResponse
     */
    public ListOffSiteBackupsResponse listOffSiteBackups(ListOffSiteBackupsRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listOffSiteBackups);
    }

    /**
     * 获取跨区域备份列表
     * 获取跨区域备份列表。
     *
     * @param ListOffSiteBackupsRequest 请求对象
     * @return SyncInvoker<ListOffSiteBackupsRequest, ListOffSiteBackupsResponse>
     */
    public SyncInvoker<ListOffSiteBackupsRequest, ListOffSiteBackupsResponse> listOffSiteBackupsInvoker(ListOffSiteBackupsRequest request) {
        return new SyncInvoker<ListOffSiteBackupsRequest, ListOffSiteBackupsResponse>(request, RdsMeta.listOffSiteBackups, hcClient);
    }

    /**
     * 查询跨区域备份实例列表
     * 查询跨区域备份实例列表。
     *
     * @param ListOffSiteInstancesRequest 请求对象
     * @return ListOffSiteInstancesResponse
     */
    public ListOffSiteInstancesResponse listOffSiteInstances(ListOffSiteInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listOffSiteInstances);
    }

    /**
     * 查询跨区域备份实例列表
     * 查询跨区域备份实例列表。
     *
     * @param ListOffSiteInstancesRequest 请求对象
     * @return SyncInvoker<ListOffSiteInstancesRequest, ListOffSiteInstancesResponse>
     */
    public SyncInvoker<ListOffSiteInstancesRequest, ListOffSiteInstancesResponse> listOffSiteInstancesInvoker(ListOffSiteInstancesRequest request) {
        return new SyncInvoker<ListOffSiteInstancesRequest, ListOffSiteInstancesResponse>(request, RdsMeta.listOffSiteInstances, hcClient);
    }

    /**
     * 查询跨区域可恢复时间段
     * 查询跨区域可恢复时间段。 如果您备份策略中的保存天数设置较长，建议您传入查询日期“date”。
     *
     * @param ListOffSiteRestoreTimesRequest 请求对象
     * @return ListOffSiteRestoreTimesResponse
     */
    public ListOffSiteRestoreTimesResponse listOffSiteRestoreTimes(ListOffSiteRestoreTimesRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listOffSiteRestoreTimes);
    }

    /**
     * 查询跨区域可恢复时间段
     * 查询跨区域可恢复时间段。 如果您备份策略中的保存天数设置较长，建议您传入查询日期“date”。
     *
     * @param ListOffSiteRestoreTimesRequest 请求对象
     * @return SyncInvoker<ListOffSiteRestoreTimesRequest, ListOffSiteRestoreTimesResponse>
     */
    public SyncInvoker<ListOffSiteRestoreTimesRequest, ListOffSiteRestoreTimesResponse> listOffSiteRestoreTimesInvoker(ListOffSiteRestoreTimesRequest request) {
        return new SyncInvoker<ListOffSiteRestoreTimesRequest, ListOffSiteRestoreTimesResponse>(request, RdsMeta.listOffSiteRestoreTimes, hcClient);
    }

    /**
     * 查询项目标签
     * 查询项目标签。
     *
     * @param ListProjectTagsRequest 请求对象
     * @return ListProjectTagsResponse
     */
    public ListProjectTagsResponse listProjectTags(ListProjectTagsRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listProjectTags);
    }

    /**
     * 查询项目标签
     * 查询项目标签。
     *
     * @param ListProjectTagsRequest 请求对象
     * @return SyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse>
     */
    public SyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse> listProjectTagsInvoker(ListProjectTagsRequest request) {
        return new SyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse>(request, RdsMeta.listProjectTags, hcClient);
    }

    /**
     * 查询可恢复时间段
     * 查询可恢复时间段。 如果您备份策略中的保存天数设置较长，建议您传入查询日期“date”。
     *
     * @param ListRestoreTimesRequest 请求对象
     * @return ListRestoreTimesResponse
     */
    public ListRestoreTimesResponse listRestoreTimes(ListRestoreTimesRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listRestoreTimes);
    }

    /**
     * 查询可恢复时间段
     * 查询可恢复时间段。 如果您备份策略中的保存天数设置较长，建议您传入查询日期“date”。
     *
     * @param ListRestoreTimesRequest 请求对象
     * @return SyncInvoker<ListRestoreTimesRequest, ListRestoreTimesResponse>
     */
    public SyncInvoker<ListRestoreTimesRequest, ListRestoreTimesResponse> listRestoreTimesInvoker(ListRestoreTimesRequest request) {
        return new SyncInvoker<ListRestoreTimesRequest, ListRestoreTimesResponse>(request, RdsMeta.listRestoreTimes, hcClient);
    }

    /**
     * 查询数据库慢日志
     * 查询数据库慢日志。
     *
     * @param ListSlowLogsRequest 请求对象
     * @return ListSlowLogsResponse
     */
    public ListSlowLogsResponse listSlowLogs(ListSlowLogsRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listSlowLogs);
    }

    /**
     * 查询数据库慢日志
     * 查询数据库慢日志。
     *
     * @param ListSlowLogsRequest 请求对象
     * @return SyncInvoker<ListSlowLogsRequest, ListSlowLogsResponse>
     */
    public SyncInvoker<ListSlowLogsRequest, ListSlowLogsResponse> listSlowLogsInvoker(ListSlowLogsRequest request) {
        return new SyncInvoker<ListSlowLogsRequest, ListSlowLogsResponse>(request, RdsMeta.listSlowLogs, hcClient);
    }

    /**
     * 获取慢日志统计信息
     * 获取慢日志统计信息
     *
     * @param ListSlowlogStatisticsRequest 请求对象
     * @return ListSlowlogStatisticsResponse
     */
    public ListSlowlogStatisticsResponse listSlowlogStatistics(ListSlowlogStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listSlowlogStatistics);
    }

    /**
     * 获取慢日志统计信息
     * 获取慢日志统计信息
     *
     * @param ListSlowlogStatisticsRequest 请求对象
     * @return SyncInvoker<ListSlowlogStatisticsRequest, ListSlowlogStatisticsResponse>
     */
    public SyncInvoker<ListSlowlogStatisticsRequest, ListSlowlogStatisticsResponse> listSlowlogStatisticsInvoker(ListSlowlogStatisticsRequest request) {
        return new SyncInvoker<ListSlowlogStatisticsRequest, ListSlowlogStatisticsResponse>(request, RdsMeta.listSlowlogStatistics, hcClient);
    }

    /**
     * 查询数据库磁盘类型
     * 查询数据库磁盘类型。
     *
     * @param ListStorageTypesRequest 请求对象
     * @return ListStorageTypesResponse
     */
    public ListStorageTypesResponse listStorageTypes(ListStorageTypesRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listStorageTypes);
    }

    /**
     * 查询数据库磁盘类型
     * 查询数据库磁盘类型。
     *
     * @param ListStorageTypesRequest 请求对象
     * @return SyncInvoker<ListStorageTypesRequest, ListStorageTypesResponse>
     */
    public SyncInvoker<ListStorageTypesRequest, ListStorageTypesResponse> listStorageTypesInvoker(ListStorageTypesRequest request) {
        return new SyncInvoker<ListStorageTypesRequest, ListStorageTypesResponse>(request, RdsMeta.listStorageTypes, hcClient);
    }

    /**
     * 迁移主备实例的备机
     * 迁移主备实例的备机
     *
     * @param MigrateFollowerRequest 请求对象
     * @return MigrateFollowerResponse
     */
    public MigrateFollowerResponse migrateFollower(MigrateFollowerRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.migrateFollower);
    }

    /**
     * 迁移主备实例的备机
     * 迁移主备实例的备机
     *
     * @param MigrateFollowerRequest 请求对象
     * @return SyncInvoker<MigrateFollowerRequest, MigrateFollowerResponse>
     */
    public SyncInvoker<MigrateFollowerRequest, MigrateFollowerResponse> migrateFollowerInvoker(MigrateFollowerRequest request) {
        return new SyncInvoker<MigrateFollowerRequest, MigrateFollowerResponse>(request, RdsMeta.migrateFollower, hcClient);
    }

    /**
     * 修改参数模板参数
     * 修改参数模板参数。
     *
     * @param ModifyConfigurationRequest 请求对象
     * @return ModifyConfigurationResponse
     */
    public ModifyConfigurationResponse modifyConfiguration(ModifyConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.modifyConfiguration);
    }

    /**
     * 修改参数模板参数
     * 修改参数模板参数。
     *
     * @param ModifyConfigurationRequest 请求对象
     * @return SyncInvoker<ModifyConfigurationRequest, ModifyConfigurationResponse>
     */
    public SyncInvoker<ModifyConfigurationRequest, ModifyConfigurationResponse> modifyConfigurationInvoker(ModifyConfigurationRequest request) {
        return new SyncInvoker<ModifyConfigurationRequest, ModifyConfigurationResponse>(request, RdsMeta.modifyConfiguration, hcClient);
    }

    /**
     * 修改指定实例的参数
     * 修改指定实例的参数。
     *
     * @param ModifyInstanceConfigurationRequest 请求对象
     * @return ModifyInstanceConfigurationResponse
     */
    public ModifyInstanceConfigurationResponse modifyInstanceConfiguration(ModifyInstanceConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.modifyInstanceConfiguration);
    }

    /**
     * 修改指定实例的参数
     * 修改指定实例的参数。
     *
     * @param ModifyInstanceConfigurationRequest 请求对象
     * @return SyncInvoker<ModifyInstanceConfigurationRequest, ModifyInstanceConfigurationResponse>
     */
    public SyncInvoker<ModifyInstanceConfigurationRequest, ModifyInstanceConfigurationResponse> modifyInstanceConfigurationInvoker(ModifyInstanceConfigurationRequest request) {
        return new SyncInvoker<ModifyInstanceConfigurationRequest, ModifyInstanceConfigurationResponse>(request, RdsMeta.modifyInstanceConfiguration, hcClient);
    }

    /**
     * 重置数据库密码
     * 重置数据库密码.
     *
     * @param ResetPwdRequest 请求对象
     * @return ResetPwdResponse
     */
    public ResetPwdResponse resetPwd(ResetPwdRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.resetPwd);
    }

    /**
     * 重置数据库密码
     * 重置数据库密码.
     *
     * @param ResetPwdRequest 请求对象
     * @return SyncInvoker<ResetPwdRequest, ResetPwdResponse>
     */
    public SyncInvoker<ResetPwdRequest, ResetPwdResponse> resetPwdInvoker(ResetPwdRequest request) {
        return new SyncInvoker<ResetPwdRequest, ResetPwdResponse>(request, RdsMeta.resetPwd, hcClient);
    }

    /**
     * 表级时间点恢复
     * 表级时间点恢复。
     *
     * @param RestoreTablesRequest 请求对象
     * @return RestoreTablesResponse
     */
    public RestoreTablesResponse restoreTables(RestoreTablesRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.restoreTables);
    }

    /**
     * 表级时间点恢复
     * 表级时间点恢复。
     *
     * @param RestoreTablesRequest 请求对象
     * @return SyncInvoker<RestoreTablesRequest, RestoreTablesResponse>
     */
    public SyncInvoker<RestoreTablesRequest, RestoreTablesResponse> restoreTablesInvoker(RestoreTablesRequest request) {
        return new SyncInvoker<RestoreTablesRequest, RestoreTablesResponse>(request, RdsMeta.restoreTables, hcClient);
    }

    /**
     * 恢复到已有实例
     * 恢复到已有实例。
     *
     * @param RestoreToExistingInstanceRequest 请求对象
     * @return RestoreToExistingInstanceResponse
     */
    public RestoreToExistingInstanceResponse restoreToExistingInstance(RestoreToExistingInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.restoreToExistingInstance);
    }

    /**
     * 恢复到已有实例
     * 恢复到已有实例。
     *
     * @param RestoreToExistingInstanceRequest 请求对象
     * @return SyncInvoker<RestoreToExistingInstanceRequest, RestoreToExistingInstanceResponse>
     */
    public SyncInvoker<RestoreToExistingInstanceRequest, RestoreToExistingInstanceResponse> restoreToExistingInstanceInvoker(RestoreToExistingInstanceRequest request) {
        return new SyncInvoker<RestoreToExistingInstanceRequest, RestoreToExistingInstanceResponse>(request, RdsMeta.restoreToExistingInstance, hcClient);
    }

    /**
     * 设置审计日志策略
     * 设置审计日志策略。
     *
     * @param SetAuditlogPolicyRequest 请求对象
     * @return SetAuditlogPolicyResponse
     */
    public SetAuditlogPolicyResponse setAuditlogPolicy(SetAuditlogPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.setAuditlogPolicy);
    }

    /**
     * 设置审计日志策略
     * 设置审计日志策略。
     *
     * @param SetAuditlogPolicyRequest 请求对象
     * @return SyncInvoker<SetAuditlogPolicyRequest, SetAuditlogPolicyResponse>
     */
    public SyncInvoker<SetAuditlogPolicyRequest, SetAuditlogPolicyResponse> setAuditlogPolicyInvoker(SetAuditlogPolicyRequest request) {
        return new SyncInvoker<SetAuditlogPolicyRequest, SetAuditlogPolicyResponse>(request, RdsMeta.setAuditlogPolicy, hcClient);
    }

    /**
     * 设置自动备份策略
     * 设置自动备份策略。
     *
     * @param SetBackupPolicyRequest 请求对象
     * @return SetBackupPolicyResponse
     */
    public SetBackupPolicyResponse setBackupPolicy(SetBackupPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.setBackupPolicy);
    }

    /**
     * 设置自动备份策略
     * 设置自动备份策略。
     *
     * @param SetBackupPolicyRequest 请求对象
     * @return SyncInvoker<SetBackupPolicyRequest, SetBackupPolicyResponse>
     */
    public SyncInvoker<SetBackupPolicyRequest, SetBackupPolicyResponse> setBackupPolicyInvoker(SetBackupPolicyRequest request) {
        return new SyncInvoker<SetBackupPolicyRequest, SetBackupPolicyResponse>(request, RdsMeta.setBackupPolicy, hcClient);
    }

    /**
     * 设置跨区域备份策略
     * 设置跨区域备份策略。
     *
     * @param SetOffSiteBackupPolicyRequest 请求对象
     * @return SetOffSiteBackupPolicyResponse
     */
    public SetOffSiteBackupPolicyResponse setOffSiteBackupPolicy(SetOffSiteBackupPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.setOffSiteBackupPolicy);
    }

    /**
     * 设置跨区域备份策略
     * 设置跨区域备份策略。
     *
     * @param SetOffSiteBackupPolicyRequest 请求对象
     * @return SyncInvoker<SetOffSiteBackupPolicyRequest, SetOffSiteBackupPolicyResponse>
     */
    public SyncInvoker<SetOffSiteBackupPolicyRequest, SetOffSiteBackupPolicyResponse> setOffSiteBackupPolicyInvoker(SetOffSiteBackupPolicyRequest request) {
        return new SyncInvoker<SetOffSiteBackupPolicyRequest, SetOffSiteBackupPolicyResponse>(request, RdsMeta.setOffSiteBackupPolicy, hcClient);
    }

    /**
     * 修改安全组
     * 修改安全组
     *
     * @param SetSecurityGroupRequest 请求对象
     * @return SetSecurityGroupResponse
     */
    public SetSecurityGroupResponse setSecurityGroup(SetSecurityGroupRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.setSecurityGroup);
    }

    /**
     * 修改安全组
     * 修改安全组
     *
     * @param SetSecurityGroupRequest 请求对象
     * @return SyncInvoker<SetSecurityGroupRequest, SetSecurityGroupResponse>
     */
    public SyncInvoker<SetSecurityGroupRequest, SetSecurityGroupResponse> setSecurityGroupInvoker(SetSecurityGroupRequest request) {
        return new SyncInvoker<SetSecurityGroupRequest, SetSecurityGroupResponse>(request, RdsMeta.setSecurityGroup, hcClient);
    }

    /**
     * 生成审计日志下载链接
     * 生成审计日志下载链接。
     *
     * @param ShowAuditlogDownloadLinkRequest 请求对象
     * @return ShowAuditlogDownloadLinkResponse
     */
    public ShowAuditlogDownloadLinkResponse showAuditlogDownloadLink(ShowAuditlogDownloadLinkRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.showAuditlogDownloadLink);
    }

    /**
     * 生成审计日志下载链接
     * 生成审计日志下载链接。
     *
     * @param ShowAuditlogDownloadLinkRequest 请求对象
     * @return SyncInvoker<ShowAuditlogDownloadLinkRequest, ShowAuditlogDownloadLinkResponse>
     */
    public SyncInvoker<ShowAuditlogDownloadLinkRequest, ShowAuditlogDownloadLinkResponse> showAuditlogDownloadLinkInvoker(ShowAuditlogDownloadLinkRequest request) {
        return new SyncInvoker<ShowAuditlogDownloadLinkRequest, ShowAuditlogDownloadLinkResponse>(request, RdsMeta.showAuditlogDownloadLink, hcClient);
    }

    /**
     * 查询审计日志策略
     * 查询审计日志策略。
     *
     * @param ShowAuditlogPolicyRequest 请求对象
     * @return ShowAuditlogPolicyResponse
     */
    public ShowAuditlogPolicyResponse showAuditlogPolicy(ShowAuditlogPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.showAuditlogPolicy);
    }

    /**
     * 查询审计日志策略
     * 查询审计日志策略。
     *
     * @param ShowAuditlogPolicyRequest 请求对象
     * @return SyncInvoker<ShowAuditlogPolicyRequest, ShowAuditlogPolicyResponse>
     */
    public SyncInvoker<ShowAuditlogPolicyRequest, ShowAuditlogPolicyResponse> showAuditlogPolicyInvoker(ShowAuditlogPolicyRequest request) {
        return new SyncInvoker<ShowAuditlogPolicyRequest, ShowAuditlogPolicyResponse>(request, RdsMeta.showAuditlogPolicy, hcClient);
    }

    /**
     * 获取备份下载链接
     * 获取备份下载链接。
     *
     * @param ShowBackupDownloadLinkRequest 请求对象
     * @return ShowBackupDownloadLinkResponse
     */
    public ShowBackupDownloadLinkResponse showBackupDownloadLink(ShowBackupDownloadLinkRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.showBackupDownloadLink);
    }

    /**
     * 获取备份下载链接
     * 获取备份下载链接。
     *
     * @param ShowBackupDownloadLinkRequest 请求对象
     * @return SyncInvoker<ShowBackupDownloadLinkRequest, ShowBackupDownloadLinkResponse>
     */
    public SyncInvoker<ShowBackupDownloadLinkRequest, ShowBackupDownloadLinkResponse> showBackupDownloadLinkInvoker(ShowBackupDownloadLinkRequest request) {
        return new SyncInvoker<ShowBackupDownloadLinkRequest, ShowBackupDownloadLinkResponse>(request, RdsMeta.showBackupDownloadLink, hcClient);
    }

    /**
     * 查询自动备份策略
     * 查询自动备份策略。
     *
     * @param ShowBackupPolicyRequest 请求对象
     * @return ShowBackupPolicyResponse
     */
    public ShowBackupPolicyResponse showBackupPolicy(ShowBackupPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.showBackupPolicy);
    }

    /**
     * 查询自动备份策略
     * 查询自动备份策略。
     *
     * @param ShowBackupPolicyRequest 请求对象
     * @return SyncInvoker<ShowBackupPolicyRequest, ShowBackupPolicyResponse>
     */
    public SyncInvoker<ShowBackupPolicyRequest, ShowBackupPolicyResponse> showBackupPolicyInvoker(ShowBackupPolicyRequest request) {
        return new SyncInvoker<ShowBackupPolicyRequest, ShowBackupPolicyResponse>(request, RdsMeta.showBackupPolicy, hcClient);
    }

    /**
     * 获取指定参数模板的参数
     * 获取指定参数模板的参数。
     *
     * @param ShowConfigurationRequest 请求对象
     * @return ShowConfigurationResponse
     */
    public ShowConfigurationResponse showConfiguration(ShowConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.showConfiguration);
    }

    /**
     * 获取指定参数模板的参数
     * 获取指定参数模板的参数。
     *
     * @param ShowConfigurationRequest 请求对象
     * @return SyncInvoker<ShowConfigurationRequest, ShowConfigurationResponse>
     */
    public SyncInvoker<ShowConfigurationRequest, ShowConfigurationResponse> showConfigurationInvoker(ShowConfigurationRequest request) {
        return new SyncInvoker<ShowConfigurationRequest, ShowConfigurationResponse>(request, RdsMeta.showConfiguration, hcClient);
    }

    /**
     * 获取指定实例的参数模板
     * 获取指定实例的参数模板。
     *
     * @param ShowInstanceConfigurationRequest 请求对象
     * @return ShowInstanceConfigurationResponse
     */
    public ShowInstanceConfigurationResponse showInstanceConfiguration(ShowInstanceConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.showInstanceConfiguration);
    }

    /**
     * 获取指定实例的参数模板
     * 获取指定实例的参数模板。
     *
     * @param ShowInstanceConfigurationRequest 请求对象
     * @return SyncInvoker<ShowInstanceConfigurationRequest, ShowInstanceConfigurationResponse>
     */
    public SyncInvoker<ShowInstanceConfigurationRequest, ShowInstanceConfigurationResponse> showInstanceConfigurationInvoker(ShowInstanceConfigurationRequest request) {
        return new SyncInvoker<ShowInstanceConfigurationRequest, ShowInstanceConfigurationResponse>(request, RdsMeta.showInstanceConfiguration, hcClient);
    }

    /**
     * 查询跨区域备份策略
     * 查询跨区域备份策略。
     *
     * @param ShowOffSiteBackupPolicyRequest 请求对象
     * @return ShowOffSiteBackupPolicyResponse
     */
    public ShowOffSiteBackupPolicyResponse showOffSiteBackupPolicy(ShowOffSiteBackupPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.showOffSiteBackupPolicy);
    }

    /**
     * 查询跨区域备份策略
     * 查询跨区域备份策略。
     *
     * @param ShowOffSiteBackupPolicyRequest 请求对象
     * @return SyncInvoker<ShowOffSiteBackupPolicyRequest, ShowOffSiteBackupPolicyResponse>
     */
    public SyncInvoker<ShowOffSiteBackupPolicyRequest, ShowOffSiteBackupPolicyResponse> showOffSiteBackupPolicyInvoker(ShowOffSiteBackupPolicyRequest request) {
        return new SyncInvoker<ShowOffSiteBackupPolicyRequest, ShowOffSiteBackupPolicyResponse>(request, RdsMeta.showOffSiteBackupPolicy, hcClient);
    }

    /**
     * 手动倒换主备实例
     * 手动倒换主备.
     *
     * @param StartFailoverRequest 请求对象
     * @return StartFailoverResponse
     */
    public StartFailoverResponse startFailover(StartFailoverRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.startFailover);
    }

    /**
     * 手动倒换主备实例
     * 手动倒换主备.
     *
     * @param StartFailoverRequest 请求对象
     * @return SyncInvoker<StartFailoverRequest, StartFailoverResponse>
     */
    public SyncInvoker<StartFailoverRequest, StartFailoverResponse> startFailoverInvoker(StartFailoverRequest request) {
        return new SyncInvoker<StartFailoverRequest, StartFailoverResponse>(request, RdsMeta.startFailover, hcClient);
    }

    /**
     * 变更实例规格/扩容实例磁盘/重启实例/单机转主备
     * 变更实例规格/扩容实例磁盘/重启实例/单机转主备。
     *
     * @param StartInstanceActionRequest 请求对象
     * @return StartInstanceActionResponse
     */
    public StartInstanceActionResponse startInstanceAction(StartInstanceActionRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.startInstanceAction);
    }

    /**
     * 变更实例规格/扩容实例磁盘/重启实例/单机转主备
     * 变更实例规格/扩容实例磁盘/重启实例/单机转主备。
     *
     * @param StartInstanceActionRequest 请求对象
     * @return SyncInvoker<StartInstanceActionRequest, StartInstanceActionResponse>
     */
    public SyncInvoker<StartInstanceActionRequest, StartInstanceActionResponse> startInstanceActionInvoker(StartInstanceActionRequest request) {
        return new SyncInvoker<StartInstanceActionRequest, StartInstanceActionResponse>(request, RdsMeta.startInstanceAction, hcClient);
    }

    /**
     * SSL开关
     * SSL开关
     *
     * @param SwitchSslRequest 请求对象
     * @return SwitchSslResponse
     */
    public SwitchSslResponse switchSsl(SwitchSslRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.switchSsl);
    }

    /**
     * SSL开关
     * SSL开关
     *
     * @param SwitchSslRequest 请求对象
     * @return SyncInvoker<SwitchSslRequest, SwitchSslResponse>
     */
    public SyncInvoker<SwitchSslRequest, SwitchSslResponse> switchSslInvoker(SwitchSslRequest request) {
        return new SyncInvoker<SwitchSslRequest, SwitchSslResponse>(request, RdsMeta.switchSsl, hcClient);
    }

    /**
     * 修改内网地址
     * 修改内网地址
     *
     * @param UpdateDataIpRequest 请求对象
     * @return UpdateDataIpResponse
     */
    public UpdateDataIpResponse updateDataIp(UpdateDataIpRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.updateDataIp);
    }

    /**
     * 修改内网地址
     * 修改内网地址
     *
     * @param UpdateDataIpRequest 请求对象
     * @return SyncInvoker<UpdateDataIpRequest, UpdateDataIpResponse>
     */
    public SyncInvoker<UpdateDataIpRequest, UpdateDataIpResponse> updateDataIpInvoker(UpdateDataIpRequest request) {
        return new SyncInvoker<UpdateDataIpRequest, UpdateDataIpResponse>(request, RdsMeta.updateDataIp, hcClient);
    }

    /**
     * 修改数据库端口
     * 修改数据库端口
     *
     * @param UpdatePortRequest 请求对象
     * @return UpdatePortResponse
     */
    public UpdatePortResponse updatePort(UpdatePortRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.updatePort);
    }

    /**
     * 修改数据库端口
     * 修改数据库端口
     *
     * @param UpdatePortRequest 请求对象
     * @return SyncInvoker<UpdatePortRequest, UpdatePortResponse>
     */
    public SyncInvoker<UpdatePortRequest, UpdatePortResponse> updatePortInvoker(UpdatePortRequest request) {
        return new SyncInvoker<UpdatePortRequest, UpdatePortResponse>(request, RdsMeta.updatePort, hcClient);
    }

    /**
     * 授权数据库帐号
     * 授权数据库帐号。
     *
     * @param AllowDbUserPrivilegeRequest 请求对象
     * @return AllowDbUserPrivilegeResponse
     */
    public AllowDbUserPrivilegeResponse allowDbUserPrivilege(AllowDbUserPrivilegeRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.allowDbUserPrivilege);
    }

    /**
     * 授权数据库帐号
     * 授权数据库帐号。
     *
     * @param AllowDbUserPrivilegeRequest 请求对象
     * @return SyncInvoker<AllowDbUserPrivilegeRequest, AllowDbUserPrivilegeResponse>
     */
    public SyncInvoker<AllowDbUserPrivilegeRequest, AllowDbUserPrivilegeResponse> allowDbUserPrivilegeInvoker(AllowDbUserPrivilegeRequest request) {
        return new SyncInvoker<AllowDbUserPrivilegeRequest, AllowDbUserPrivilegeResponse>(request, RdsMeta.allowDbUserPrivilege, hcClient);
    }

    /**
     * 创建数据库
     * 创建数据库。
     *
     * @param CreateDatabaseRequest 请求对象
     * @return CreateDatabaseResponse
     */
    public CreateDatabaseResponse createDatabase(CreateDatabaseRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.createDatabase);
    }

    /**
     * 创建数据库
     * 创建数据库。
     *
     * @param CreateDatabaseRequest 请求对象
     * @return SyncInvoker<CreateDatabaseRequest, CreateDatabaseResponse>
     */
    public SyncInvoker<CreateDatabaseRequest, CreateDatabaseResponse> createDatabaseInvoker(CreateDatabaseRequest request) {
        return new SyncInvoker<CreateDatabaseRequest, CreateDatabaseResponse>(request, RdsMeta.createDatabase, hcClient);
    }

    /**
     * 创建数据库用户
     * 创建数据库用户。
     *
     * @param CreateDbUserRequest 请求对象
     * @return CreateDbUserResponse
     */
    public CreateDbUserResponse createDbUser(CreateDbUserRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.createDbUser);
    }

    /**
     * 创建数据库用户
     * 创建数据库用户。
     *
     * @param CreateDbUserRequest 请求对象
     * @return SyncInvoker<CreateDbUserRequest, CreateDbUserResponse>
     */
    public SyncInvoker<CreateDbUserRequest, CreateDbUserResponse> createDbUserInvoker(CreateDbUserRequest request) {
        return new SyncInvoker<CreateDbUserRequest, CreateDbUserResponse>(request, RdsMeta.createDbUser, hcClient);
    }

    /**
     * 删除数据库
     * 删除数据库。
     *
     * @param DeleteDatabaseRequest 请求对象
     * @return DeleteDatabaseResponse
     */
    public DeleteDatabaseResponse deleteDatabase(DeleteDatabaseRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.deleteDatabase);
    }

    /**
     * 删除数据库
     * 删除数据库。
     *
     * @param DeleteDatabaseRequest 请求对象
     * @return SyncInvoker<DeleteDatabaseRequest, DeleteDatabaseResponse>
     */
    public SyncInvoker<DeleteDatabaseRequest, DeleteDatabaseResponse> deleteDatabaseInvoker(DeleteDatabaseRequest request) {
        return new SyncInvoker<DeleteDatabaseRequest, DeleteDatabaseResponse>(request, RdsMeta.deleteDatabase, hcClient);
    }

    /**
     * 删除数据库用户
     * 删除数据库用户。
     *
     * @param DeleteDbUserRequest 请求对象
     * @return DeleteDbUserResponse
     */
    public DeleteDbUserResponse deleteDbUser(DeleteDbUserRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.deleteDbUser);
    }

    /**
     * 删除数据库用户
     * 删除数据库用户。
     *
     * @param DeleteDbUserRequest 请求对象
     * @return SyncInvoker<DeleteDbUserRequest, DeleteDbUserResponse>
     */
    public SyncInvoker<DeleteDbUserRequest, DeleteDbUserResponse> deleteDbUserInvoker(DeleteDbUserRequest request) {
        return new SyncInvoker<DeleteDbUserRequest, DeleteDbUserResponse>(request, RdsMeta.deleteDbUser, hcClient);
    }

    /**
     * 查询指定用户的已授权数据库
     * 查询指定用户的已授权数据库。
     *
     * @param ListAuthorizedDatabasesRequest 请求对象
     * @return ListAuthorizedDatabasesResponse
     */
    public ListAuthorizedDatabasesResponse listAuthorizedDatabases(ListAuthorizedDatabasesRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listAuthorizedDatabases);
    }

    /**
     * 查询指定用户的已授权数据库
     * 查询指定用户的已授权数据库。
     *
     * @param ListAuthorizedDatabasesRequest 请求对象
     * @return SyncInvoker<ListAuthorizedDatabasesRequest, ListAuthorizedDatabasesResponse>
     */
    public SyncInvoker<ListAuthorizedDatabasesRequest, ListAuthorizedDatabasesResponse> listAuthorizedDatabasesInvoker(ListAuthorizedDatabasesRequest request) {
        return new SyncInvoker<ListAuthorizedDatabasesRequest, ListAuthorizedDatabasesResponse>(request, RdsMeta.listAuthorizedDatabases, hcClient);
    }

    /**
     * 查询指定数据库的已授权用户
     * 查询指定数据库的已授权用户。
     *
     * @param ListAuthorizedDbUsersRequest 请求对象
     * @return ListAuthorizedDbUsersResponse
     */
    public ListAuthorizedDbUsersResponse listAuthorizedDbUsers(ListAuthorizedDbUsersRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listAuthorizedDbUsers);
    }

    /**
     * 查询指定数据库的已授权用户
     * 查询指定数据库的已授权用户。
     *
     * @param ListAuthorizedDbUsersRequest 请求对象
     * @return SyncInvoker<ListAuthorizedDbUsersRequest, ListAuthorizedDbUsersResponse>
     */
    public SyncInvoker<ListAuthorizedDbUsersRequest, ListAuthorizedDbUsersResponse> listAuthorizedDbUsersInvoker(ListAuthorizedDbUsersRequest request) {
        return new SyncInvoker<ListAuthorizedDbUsersRequest, ListAuthorizedDbUsersResponse>(request, RdsMeta.listAuthorizedDbUsers, hcClient);
    }

    /**
     * 查询数据库列表
     * 查询数据库列表。
     *
     * @param ListDatabasesRequest 请求对象
     * @return ListDatabasesResponse
     */
    public ListDatabasesResponse listDatabases(ListDatabasesRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listDatabases);
    }

    /**
     * 查询数据库列表
     * 查询数据库列表。
     *
     * @param ListDatabasesRequest 请求对象
     * @return SyncInvoker<ListDatabasesRequest, ListDatabasesResponse>
     */
    public SyncInvoker<ListDatabasesRequest, ListDatabasesResponse> listDatabasesInvoker(ListDatabasesRequest request) {
        return new SyncInvoker<ListDatabasesRequest, ListDatabasesResponse>(request, RdsMeta.listDatabases, hcClient);
    }

    /**
     * 查询数据库用户列表
     * 查询数据库用户列表。
     *
     * @param ListDbUsersRequest 请求对象
     * @return ListDbUsersResponse
     */
    public ListDbUsersResponse listDbUsers(ListDbUsersRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listDbUsers);
    }

    /**
     * 查询数据库用户列表
     * 查询数据库用户列表。
     *
     * @param ListDbUsersRequest 请求对象
     * @return SyncInvoker<ListDbUsersRequest, ListDbUsersResponse>
     */
    public SyncInvoker<ListDbUsersRequest, ListDbUsersResponse> listDbUsersInvoker(ListDbUsersRequest request) {
        return new SyncInvoker<ListDbUsersRequest, ListDbUsersResponse>(request, RdsMeta.listDbUsers, hcClient);
    }

    /**
     * 解除数据库帐号权限
     * 解除数据库帐号权限。
     *
     * @param RevokeRequest 请求对象
     * @return RevokeResponse
     */
    public RevokeResponse revoke(RevokeRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.revoke);
    }

    /**
     * 解除数据库帐号权限
     * 解除数据库帐号权限。
     *
     * @param RevokeRequest 请求对象
     * @return SyncInvoker<RevokeRequest, RevokeResponse>
     */
    public SyncInvoker<RevokeRequest, RevokeResponse> revokeInvoker(RevokeRequest request) {
        return new SyncInvoker<RevokeRequest, RevokeResponse>(request, RdsMeta.revoke, hcClient);
    }

    /**
     * 设置数据库账号密码
     * 设置数据库账号密码
     *
     * @param SetDbUserPwdRequest 请求对象
     * @return SetDbUserPwdResponse
     */
    public SetDbUserPwdResponse setDbUserPwd(SetDbUserPwdRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.setDbUserPwd);
    }

    /**
     * 设置数据库账号密码
     * 设置数据库账号密码
     *
     * @param SetDbUserPwdRequest 请求对象
     * @return SyncInvoker<SetDbUserPwdRequest, SetDbUserPwdResponse>
     */
    public SyncInvoker<SetDbUserPwdRequest, SetDbUserPwdResponse> setDbUserPwdInvoker(SetDbUserPwdRequest request) {
        return new SyncInvoker<SetDbUserPwdRequest, SetDbUserPwdResponse>(request, RdsMeta.setDbUserPwd, hcClient);
    }

}