package com.huaweicloud.sdk.rds.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
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

    /** 应用参数模板 应用参数模板。
     *
     * @param ApplyConfigurationAsyncRequest 请求对象
     * @return ApplyConfigurationAsyncResponse */
    public ApplyConfigurationAsyncResponse applyConfigurationAsync(ApplyConfigurationAsyncRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.applyConfigurationAsync);
    }

    /** 应用参数模板 应用参数模板。
     *
     * @param ApplyConfigurationAsyncRequest 请求对象
     * @return SyncInvoker<ApplyConfigurationAsyncRequest, ApplyConfigurationAsyncResponse> */
    public SyncInvoker<ApplyConfigurationAsyncRequest, ApplyConfigurationAsyncResponse> applyConfigurationAsyncInvoker(
        ApplyConfigurationAsyncRequest request) {
        return new SyncInvoker<ApplyConfigurationAsyncRequest, ApplyConfigurationAsyncResponse>(request,
            RdsMeta.applyConfigurationAsync, hcClient);
    }

    /** 绑定和解绑弹性公网IP 绑定和解绑弹性公网IP。
     *
     * @param AttachEipRequest 请求对象
     * @return AttachEipResponse */
    public AttachEipResponse attachEip(AttachEipRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.attachEip);
    }

    /** 绑定和解绑弹性公网IP 绑定和解绑弹性公网IP。
     *
     * @param AttachEipRequest 请求对象
     * @return SyncInvoker<AttachEipRequest, AttachEipResponse> */
    public SyncInvoker<AttachEipRequest, AttachEipResponse> attachEipInvoker(AttachEipRequest request) {
        return new SyncInvoker<AttachEipRequest, AttachEipResponse>(request, RdsMeta.attachEip, hcClient);
    }

    /** 批量添加标签 批量添加标签。
     *
     * @param BatchTagAddActionRequest 请求对象
     * @return BatchTagAddActionResponse */
    public BatchTagAddActionResponse batchTagAddAction(BatchTagAddActionRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.batchTagAddAction);
    }

    /** 批量添加标签 批量添加标签。
     *
     * @param BatchTagAddActionRequest 请求对象
     * @return SyncInvoker<BatchTagAddActionRequest, BatchTagAddActionResponse> */
    public SyncInvoker<BatchTagAddActionRequest, BatchTagAddActionResponse> batchTagAddActionInvoker(
        BatchTagAddActionRequest request) {
        return new SyncInvoker<BatchTagAddActionRequest, BatchTagAddActionResponse>(request, RdsMeta.batchTagAddAction,
            hcClient);
    }

    /** 批量删除标签 批量删除标签。
     *
     * @param BatchTagDelActionRequest 请求对象
     * @return BatchTagDelActionResponse */
    public BatchTagDelActionResponse batchTagDelAction(BatchTagDelActionRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.batchTagDelAction);
    }

    /** 批量删除标签 批量删除标签。
     *
     * @param BatchTagDelActionRequest 请求对象
     * @return SyncInvoker<BatchTagDelActionRequest, BatchTagDelActionResponse> */
    public SyncInvoker<BatchTagDelActionRequest, BatchTagDelActionResponse> batchTagDelActionInvoker(
        BatchTagDelActionRequest request) {
        return new SyncInvoker<BatchTagDelActionRequest, BatchTagDelActionResponse>(request, RdsMeta.batchTagDelAction,
            hcClient);
    }

    /** 更改主备实例的数据同步方式 更改主备实例的数据同步方式。
     *
     * @param ChangeFailoverModeRequest 请求对象
     * @return ChangeFailoverModeResponse */
    public ChangeFailoverModeResponse changeFailoverMode(ChangeFailoverModeRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.changeFailoverMode);
    }

    /** 更改主备实例的数据同步方式 更改主备实例的数据同步方式。
     *
     * @param ChangeFailoverModeRequest 请求对象
     * @return SyncInvoker<ChangeFailoverModeRequest, ChangeFailoverModeResponse> */
    public SyncInvoker<ChangeFailoverModeRequest, ChangeFailoverModeResponse> changeFailoverModeInvoker(
        ChangeFailoverModeRequest request) {
        return new SyncInvoker<ChangeFailoverModeRequest, ChangeFailoverModeResponse>(request,
            RdsMeta.changeFailoverMode, hcClient);
    }

    /** 切换主备实例的倒换策略 切换主备实例的倒换策略.
     *
     * @param ChangeFailoverStrategyRequest 请求对象
     * @return ChangeFailoverStrategyResponse */
    public ChangeFailoverStrategyResponse changeFailoverStrategy(ChangeFailoverStrategyRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.changeFailoverStrategy);
    }

    /** 切换主备实例的倒换策略 切换主备实例的倒换策略.
     *
     * @param ChangeFailoverStrategyRequest 请求对象
     * @return SyncInvoker<ChangeFailoverStrategyRequest, ChangeFailoverStrategyResponse> */
    public SyncInvoker<ChangeFailoverStrategyRequest, ChangeFailoverStrategyResponse> changeFailoverStrategyInvoker(
        ChangeFailoverStrategyRequest request) {
        return new SyncInvoker<ChangeFailoverStrategyRequest, ChangeFailoverStrategyResponse>(request,
            RdsMeta.changeFailoverStrategy, hcClient);
    }

    /** 设置可维护时间段 设置可维护时间段
     *
     * @param ChangeOpsWindowRequest 请求对象
     * @return ChangeOpsWindowResponse */
    public ChangeOpsWindowResponse changeOpsWindow(ChangeOpsWindowRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.changeOpsWindow);
    }

    /** 设置可维护时间段 设置可维护时间段
     *
     * @param ChangeOpsWindowRequest 请求对象
     * @return SyncInvoker<ChangeOpsWindowRequest, ChangeOpsWindowResponse> */
    public SyncInvoker<ChangeOpsWindowRequest, ChangeOpsWindowResponse> changeOpsWindowInvoker(
        ChangeOpsWindowRequest request) {
        return new SyncInvoker<ChangeOpsWindowRequest, ChangeOpsWindowResponse>(request, RdsMeta.changeOpsWindow,
            hcClient);
    }

    /** 创建参数模板 创建参数模板。
     *
     * @param CreateConfigurationRequest 请求对象
     * @return CreateConfigurationResponse */
    public CreateConfigurationResponse createConfiguration(CreateConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.createConfiguration);
    }

    /** 创建参数模板 创建参数模板。
     *
     * @param CreateConfigurationRequest 请求对象
     * @return SyncInvoker<CreateConfigurationRequest, CreateConfigurationResponse> */
    public SyncInvoker<CreateConfigurationRequest, CreateConfigurationResponse> createConfigurationInvoker(
        CreateConfigurationRequest request) {
        return new SyncInvoker<CreateConfigurationRequest, CreateConfigurationResponse>(request,
            RdsMeta.createConfiguration, hcClient);
    }

    /** 申请域名 申请域名
     *
     * @param CreateDnsNameRequest 请求对象
     * @return CreateDnsNameResponse */
    public CreateDnsNameResponse createDnsName(CreateDnsNameRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.createDnsName);
    }

    /** 申请域名 申请域名
     *
     * @param CreateDnsNameRequest 请求对象
     * @return SyncInvoker<CreateDnsNameRequest, CreateDnsNameResponse> */
    public SyncInvoker<CreateDnsNameRequest, CreateDnsNameResponse> createDnsNameInvoker(CreateDnsNameRequest request) {
        return new SyncInvoker<CreateDnsNameRequest, CreateDnsNameResponse>(request, RdsMeta.createDnsName, hcClient);
    }

    /** 创建数据库实例 创建数据库实例。
     *
     * @param CreateInstanceRequest 请求对象
     * @return CreateInstanceResponse */
    public CreateInstanceResponse createInstance(CreateInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.createInstance);
    }

    /** 创建数据库实例 创建数据库实例。
     *
     * @param CreateInstanceRequest 请求对象
     * @return SyncInvoker<CreateInstanceRequest, CreateInstanceResponse> */
    public SyncInvoker<CreateInstanceRequest, CreateInstanceResponse> createInstanceInvoker(
        CreateInstanceRequest request) {
        return new SyncInvoker<CreateInstanceRequest, CreateInstanceResponse>(request, RdsMeta.createInstance,
            hcClient);
    }

    /** 创建手动备份 创建手动备份。
     *
     * @param CreateManualBackupRequest 请求对象
     * @return CreateManualBackupResponse */
    public CreateManualBackupResponse createManualBackup(CreateManualBackupRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.createManualBackup);
    }

    /** 创建手动备份 创建手动备份。
     *
     * @param CreateManualBackupRequest 请求对象
     * @return SyncInvoker<CreateManualBackupRequest, CreateManualBackupResponse> */
    public SyncInvoker<CreateManualBackupRequest, CreateManualBackupResponse> createManualBackupInvoker(
        CreateManualBackupRequest request) {
        return new SyncInvoker<CreateManualBackupRequest, CreateManualBackupResponse>(request,
            RdsMeta.createManualBackup, hcClient);
    }

    /** 恢复到新实例 恢复到新实例。
     *
     * @param CreateRestoreInstanceRequest 请求对象
     * @return CreateRestoreInstanceResponse */
    public CreateRestoreInstanceResponse createRestoreInstance(CreateRestoreInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.createRestoreInstance);
    }

    /** 恢复到新实例 恢复到新实例。
     *
     * @param CreateRestoreInstanceRequest 请求对象
     * @return SyncInvoker<CreateRestoreInstanceRequest, CreateRestoreInstanceResponse> */
    public SyncInvoker<CreateRestoreInstanceRequest, CreateRestoreInstanceResponse> createRestoreInstanceInvoker(
        CreateRestoreInstanceRequest request) {
        return new SyncInvoker<CreateRestoreInstanceRequest, CreateRestoreInstanceResponse>(request,
            RdsMeta.createRestoreInstance, hcClient);
    }

    /** 删除参数模板 删除参数模板。
     *
     * @param DeleteConfigurationRequest 请求对象
     * @return DeleteConfigurationResponse */
    public DeleteConfigurationResponse deleteConfiguration(DeleteConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.deleteConfiguration);
    }

    /** 删除参数模板 删除参数模板。
     *
     * @param DeleteConfigurationRequest 请求对象
     * @return SyncInvoker<DeleteConfigurationRequest, DeleteConfigurationResponse> */
    public SyncInvoker<DeleteConfigurationRequest, DeleteConfigurationResponse> deleteConfigurationInvoker(
        DeleteConfigurationRequest request) {
        return new SyncInvoker<DeleteConfigurationRequest, DeleteConfigurationResponse>(request,
            RdsMeta.deleteConfiguration, hcClient);
    }

    /** 删除数据库实例 删除数据库实例。
     *
     * @param DeleteInstanceRequest 请求对象
     * @return DeleteInstanceResponse */
    public DeleteInstanceResponse deleteInstance(DeleteInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.deleteInstance);
    }

    /** 删除数据库实例 删除数据库实例。
     *
     * @param DeleteInstanceRequest 请求对象
     * @return SyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse> */
    public SyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstanceInvoker(
        DeleteInstanceRequest request) {
        return new SyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>(request, RdsMeta.deleteInstance,
            hcClient);
    }

    /** 删除手动备份 删除手动备份。
     *
     * @param DeleteManualBackupRequest 请求对象
     * @return DeleteManualBackupResponse */
    public DeleteManualBackupResponse deleteManualBackup(DeleteManualBackupRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.deleteManualBackup);
    }

    /** 删除手动备份 删除手动备份。
     *
     * @param DeleteManualBackupRequest 请求对象
     * @return SyncInvoker<DeleteManualBackupRequest, DeleteManualBackupResponse> */
    public SyncInvoker<DeleteManualBackupRequest, DeleteManualBackupResponse> deleteManualBackupInvoker(
        DeleteManualBackupRequest request) {
        return new SyncInvoker<DeleteManualBackupRequest, DeleteManualBackupResponse>(request,
            RdsMeta.deleteManualBackup, hcClient);
    }

    /** 获取慢日志下载链接 获取慢日志下载链接。
     *
     * @param DownloadSlowlogRequest 请求对象
     * @return DownloadSlowlogResponse */
    public DownloadSlowlogResponse downloadSlowlog(DownloadSlowlogRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.downloadSlowlog);
    }

    /** 获取慢日志下载链接 获取慢日志下载链接。
     *
     * @param DownloadSlowlogRequest 请求对象
     * @return SyncInvoker<DownloadSlowlogRequest, DownloadSlowlogResponse> */
    public SyncInvoker<DownloadSlowlogRequest, DownloadSlowlogResponse> downloadSlowlogInvoker(
        DownloadSlowlogRequest request) {
        return new SyncInvoker<DownloadSlowlogRequest, DownloadSlowlogResponse>(request, RdsMeta.downloadSlowlog,
            hcClient);
    }

    /** 应用参数模板 应用参数模板。
     *
     * @param EnableConfigurationRequest 请求对象
     * @return EnableConfigurationResponse */
    public EnableConfigurationResponse enableConfiguration(EnableConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.enableConfiguration);
    }

    /** 应用参数模板 应用参数模板。
     *
     * @param EnableConfigurationRequest 请求对象
     * @return SyncInvoker<EnableConfigurationRequest, EnableConfigurationResponse> */
    public SyncInvoker<EnableConfigurationRequest, EnableConfigurationResponse> enableConfigurationInvoker(
        EnableConfigurationRequest request) {
        return new SyncInvoker<EnableConfigurationRequest, EnableConfigurationResponse>(request,
            RdsMeta.enableConfiguration, hcClient);
    }

    /** 获取审计日志列表 获取审计日志列表。
     *
     * @param ListAuditlogsRequest 请求对象
     * @return ListAuditlogsResponse */
    public ListAuditlogsResponse listAuditlogs(ListAuditlogsRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listAuditlogs);
    }

    /** 获取审计日志列表 获取审计日志列表。
     *
     * @param ListAuditlogsRequest 请求对象
     * @return SyncInvoker<ListAuditlogsRequest, ListAuditlogsResponse> */
    public SyncInvoker<ListAuditlogsRequest, ListAuditlogsResponse> listAuditlogsInvoker(ListAuditlogsRequest request) {
        return new SyncInvoker<ListAuditlogsRequest, ListAuditlogsResponse>(request, RdsMeta.listAuditlogs, hcClient);
    }

    /** 获取备份列表 获取备份列表。
     *
     * @param ListBackupsRequest 请求对象
     * @return ListBackupsResponse */
    public ListBackupsResponse listBackups(ListBackupsRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listBackups);
    }

    /** 获取备份列表 获取备份列表。
     *
     * @param ListBackupsRequest 请求对象
     * @return SyncInvoker<ListBackupsRequest, ListBackupsResponse> */
    public SyncInvoker<ListBackupsRequest, ListBackupsResponse> listBackupsInvoker(ListBackupsRequest request) {
        return new SyncInvoker<ListBackupsRequest, ListBackupsResponse>(request, RdsMeta.listBackups, hcClient);
    }

    /** 查询SQLServer可用字符集 查询SQLServer可用字符集
     *
     * @param ListCollationsRequest 请求对象
     * @return ListCollationsResponse */
    public ListCollationsResponse listCollations(ListCollationsRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listCollations);
    }

    /** 查询SQLServer可用字符集 查询SQLServer可用字符集
     *
     * @param ListCollationsRequest 请求对象
     * @return SyncInvoker<ListCollationsRequest, ListCollationsResponse> */
    public SyncInvoker<ListCollationsRequest, ListCollationsResponse> listCollationsInvoker(
        ListCollationsRequest request) {
        return new SyncInvoker<ListCollationsRequest, ListCollationsResponse>(request, RdsMeta.listCollations,
            hcClient);
    }

    /** 获取参数模板列表 获取参数模板列表，包括所有数据库的默认参数模板和用户创建的参数模板。
     *
     * @param ListConfigurationsRequest 请求对象
     * @return ListConfigurationsResponse */
    public ListConfigurationsResponse listConfigurations(ListConfigurationsRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listConfigurations);
    }

    /** 获取参数模板列表 获取参数模板列表，包括所有数据库的默认参数模板和用户创建的参数模板。
     *
     * @param ListConfigurationsRequest 请求对象
     * @return SyncInvoker<ListConfigurationsRequest, ListConfigurationsResponse> */
    public SyncInvoker<ListConfigurationsRequest, ListConfigurationsResponse> listConfigurationsInvoker(
        ListConfigurationsRequest request) {
        return new SyncInvoker<ListConfigurationsRequest, ListConfigurationsResponse>(request,
            RdsMeta.listConfigurations, hcClient);
    }

    /** 查询数据库引擎的版本 查询数据库引擎的版本。
     *
     * @param ListDatastoresRequest 请求对象
     * @return ListDatastoresResponse */
    public ListDatastoresResponse listDatastores(ListDatastoresRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listDatastores);
    }

    /** 查询数据库引擎的版本 查询数据库引擎的版本。
     *
     * @param ListDatastoresRequest 请求对象
     * @return SyncInvoker<ListDatastoresRequest, ListDatastoresResponse> */
    public SyncInvoker<ListDatastoresRequest, ListDatastoresResponse> listDatastoresInvoker(
        ListDatastoresRequest request) {
        return new SyncInvoker<ListDatastoresRequest, ListDatastoresResponse>(request, RdsMeta.listDatastores,
            hcClient);
    }

    /** 查询数据库错误日志 查询数据库错误日志。
     *
     * @param ListErrorLogsRequest 请求对象
     * @return ListErrorLogsResponse */
    public ListErrorLogsResponse listErrorLogs(ListErrorLogsRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listErrorLogs);
    }

    /** 查询数据库错误日志 查询数据库错误日志。
     *
     * @param ListErrorLogsRequest 请求对象
     * @return SyncInvoker<ListErrorLogsRequest, ListErrorLogsResponse> */
    public SyncInvoker<ListErrorLogsRequest, ListErrorLogsResponse> listErrorLogsInvoker(ListErrorLogsRequest request) {
        return new SyncInvoker<ListErrorLogsRequest, ListErrorLogsResponse>(request, RdsMeta.listErrorLogs, hcClient);
    }

    /** 查询数据库错误日志 查询数据库错误日志。(与原v3接口相比修改offset,符合华为云服务开放 API遵从性规范3.0)
     *
     * @param ListErrorLogsNewRequest 请求对象
     * @return ListErrorLogsNewResponse */
    public ListErrorLogsNewResponse listErrorLogsNew(ListErrorLogsNewRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listErrorLogsNew);
    }

    /** 查询数据库错误日志 查询数据库错误日志。(与原v3接口相比修改offset,符合华为云服务开放 API遵从性规范3.0)
     *
     * @param ListErrorLogsNewRequest 请求对象
     * @return SyncInvoker<ListErrorLogsNewRequest, ListErrorLogsNewResponse> */
    public SyncInvoker<ListErrorLogsNewRequest, ListErrorLogsNewResponse> listErrorLogsNewInvoker(
        ListErrorLogsNewRequest request) {
        return new SyncInvoker<ListErrorLogsNewRequest, ListErrorLogsNewResponse>(request, RdsMeta.listErrorLogsNew,
            hcClient);
    }

    /** 查询数据库规格 查询数据库规格。
     *
     * @param ListFlavorsRequest 请求对象
     * @return ListFlavorsResponse */
    public ListFlavorsResponse listFlavors(ListFlavorsRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listFlavors);
    }

    /** 查询数据库规格 查询数据库规格。
     *
     * @param ListFlavorsRequest 请求对象
     * @return SyncInvoker<ListFlavorsRequest, ListFlavorsResponse> */
    public SyncInvoker<ListFlavorsRequest, ListFlavorsResponse> listFlavorsInvoker(ListFlavorsRequest request) {
        return new SyncInvoker<ListFlavorsRequest, ListFlavorsResponse>(request, RdsMeta.listFlavors, hcClient);
    }

    /** 查询数据库实例列表 查询数据库实例列表。
     *
     * @param ListInstancesRequest 请求对象
     * @return ListInstancesResponse */
    public ListInstancesResponse listInstances(ListInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listInstances);
    }

    /** 查询数据库实例列表 查询数据库实例列表。
     *
     * @param ListInstancesRequest 请求对象
     * @return SyncInvoker<ListInstancesRequest, ListInstancesResponse> */
    public SyncInvoker<ListInstancesRequest, ListInstancesResponse> listInstancesInvoker(ListInstancesRequest request) {
        return new SyncInvoker<ListInstancesRequest, ListInstancesResponse>(request, RdsMeta.listInstances, hcClient);
    }

    /** 获取指定ID的任务信息 获取指定ID的任务信息。
     *
     * @param ListJobInfoRequest 请求对象
     * @return ListJobInfoResponse */
    public ListJobInfoResponse listJobInfo(ListJobInfoRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listJobInfo);
    }

    /** 获取指定ID的任务信息 获取指定ID的任务信息。
     *
     * @param ListJobInfoRequest 请求对象
     * @return SyncInvoker<ListJobInfoRequest, ListJobInfoResponse> */
    public SyncInvoker<ListJobInfoRequest, ListJobInfoResponse> listJobInfoInvoker(ListJobInfoRequest request) {
        return new SyncInvoker<ListJobInfoRequest, ListJobInfoResponse>(request, RdsMeta.listJobInfo, hcClient);
    }

    /** 获取指定实例和时间范围的任务信息（SQL Server） 获取指定实例和时间范围的任务信息（SQL Server）。
     *
     * @param ListJobInfoDetailRequest 请求对象
     * @return ListJobInfoDetailResponse */
    public ListJobInfoDetailResponse listJobInfoDetail(ListJobInfoDetailRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listJobInfoDetail);
    }

    /** 获取指定实例和时间范围的任务信息（SQL Server） 获取指定实例和时间范围的任务信息（SQL Server）。
     *
     * @param ListJobInfoDetailRequest 请求对象
     * @return SyncInvoker<ListJobInfoDetailRequest, ListJobInfoDetailResponse> */
    public SyncInvoker<ListJobInfoDetailRequest, ListJobInfoDetailResponse> listJobInfoDetailInvoker(
        ListJobInfoDetailRequest request) {
        return new SyncInvoker<ListJobInfoDetailRequest, ListJobInfoDetailResponse>(request, RdsMeta.listJobInfoDetail,
            hcClient);
    }

    /** 查询跨区域备份列表 查询跨区域备份列表。
     *
     * @param ListOffSiteBackupsRequest 请求对象
     * @return ListOffSiteBackupsResponse */
    public ListOffSiteBackupsResponse listOffSiteBackups(ListOffSiteBackupsRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listOffSiteBackups);
    }

    /** 查询跨区域备份列表 查询跨区域备份列表。
     *
     * @param ListOffSiteBackupsRequest 请求对象
     * @return SyncInvoker<ListOffSiteBackupsRequest, ListOffSiteBackupsResponse> */
    public SyncInvoker<ListOffSiteBackupsRequest, ListOffSiteBackupsResponse> listOffSiteBackupsInvoker(
        ListOffSiteBackupsRequest request) {
        return new SyncInvoker<ListOffSiteBackupsRequest, ListOffSiteBackupsResponse>(request,
            RdsMeta.listOffSiteBackups, hcClient);
    }

    /** 查询跨区域备份实例列表 查询跨区域备份实例列表。
     *
     * @param ListOffSiteInstancesRequest 请求对象
     * @return ListOffSiteInstancesResponse */
    public ListOffSiteInstancesResponse listOffSiteInstances(ListOffSiteInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listOffSiteInstances);
    }

    /** 查询跨区域备份实例列表 查询跨区域备份实例列表。
     *
     * @param ListOffSiteInstancesRequest 请求对象
     * @return SyncInvoker<ListOffSiteInstancesRequest, ListOffSiteInstancesResponse> */
    public SyncInvoker<ListOffSiteInstancesRequest, ListOffSiteInstancesResponse> listOffSiteInstancesInvoker(
        ListOffSiteInstancesRequest request) {
        return new SyncInvoker<ListOffSiteInstancesRequest, ListOffSiteInstancesResponse>(request,
            RdsMeta.listOffSiteInstances, hcClient);
    }

    /** 查询跨区域备份可恢复时间段 查询跨区域备份可恢复时间段。 如果您备份策略中的保存天数设置较长，建议您传入查询日期“date”。
     *
     * @param ListOffSiteRestoreTimesRequest 请求对象
     * @return ListOffSiteRestoreTimesResponse */
    public ListOffSiteRestoreTimesResponse listOffSiteRestoreTimes(ListOffSiteRestoreTimesRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listOffSiteRestoreTimes);
    }

    /** 查询跨区域备份可恢复时间段 查询跨区域备份可恢复时间段。 如果您备份策略中的保存天数设置较长，建议您传入查询日期“date”。
     *
     * @param ListOffSiteRestoreTimesRequest 请求对象
     * @return SyncInvoker<ListOffSiteRestoreTimesRequest, ListOffSiteRestoreTimesResponse> */
    public SyncInvoker<ListOffSiteRestoreTimesRequest, ListOffSiteRestoreTimesResponse> listOffSiteRestoreTimesInvoker(
        ListOffSiteRestoreTimesRequest request) {
        return new SyncInvoker<ListOffSiteRestoreTimesRequest, ListOffSiteRestoreTimesResponse>(request,
            RdsMeta.listOffSiteRestoreTimes, hcClient);
    }

    /** 查询项目标签 查询项目标签。
     *
     * @param ListProjectTagsRequest 请求对象
     * @return ListProjectTagsResponse */
    public ListProjectTagsResponse listProjectTags(ListProjectTagsRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listProjectTags);
    }

    /** 查询项目标签 查询项目标签。
     *
     * @param ListProjectTagsRequest 请求对象
     * @return SyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse> */
    public SyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse> listProjectTagsInvoker(
        ListProjectTagsRequest request) {
        return new SyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse>(request, RdsMeta.listProjectTags,
            hcClient);
    }

    /** 查询可恢复时间段 查询可恢复时间段。 如果您备份策略中的保存天数设置较长，建议您传入查询日期“date”。
     *
     * @param ListRestoreTimesRequest 请求对象
     * @return ListRestoreTimesResponse */
    public ListRestoreTimesResponse listRestoreTimes(ListRestoreTimesRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listRestoreTimes);
    }

    /** 查询可恢复时间段 查询可恢复时间段。 如果您备份策略中的保存天数设置较长，建议您传入查询日期“date”。
     *
     * @param ListRestoreTimesRequest 请求对象
     * @return SyncInvoker<ListRestoreTimesRequest, ListRestoreTimesResponse> */
    public SyncInvoker<ListRestoreTimesRequest, ListRestoreTimesResponse> listRestoreTimesInvoker(
        ListRestoreTimesRequest request) {
        return new SyncInvoker<ListRestoreTimesRequest, ListRestoreTimesResponse>(request, RdsMeta.listRestoreTimes,
            hcClient);
    }

    /** 查询慢日志文件列表 查询慢日志文件列表。 调用该接口取到慢日志文件名后，可以调用接口/v3/{project_id}/instances/{instance_id}/slowlog-download 获取慢日志文件下载链接
     *
     * @param ListSlowLogFileRequest 请求对象
     * @return ListSlowLogFileResponse */
    public ListSlowLogFileResponse listSlowLogFile(ListSlowLogFileRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listSlowLogFile);
    }

    /** 查询慢日志文件列表 查询慢日志文件列表。 调用该接口取到慢日志文件名后，可以调用接口/v3/{project_id}/instances/{instance_id}/slowlog-download 获取慢日志文件下载链接
     *
     * @param ListSlowLogFileRequest 请求对象
     * @return SyncInvoker<ListSlowLogFileRequest, ListSlowLogFileResponse> */
    public SyncInvoker<ListSlowLogFileRequest, ListSlowLogFileResponse> listSlowLogFileInvoker(
        ListSlowLogFileRequest request) {
        return new SyncInvoker<ListSlowLogFileRequest, ListSlowLogFileResponse>(request, RdsMeta.listSlowLogFile,
            hcClient);
    }

    /** 查询数据库慢日志 查询数据库慢日志。
     *
     * @param ListSlowLogsRequest 请求对象
     * @return ListSlowLogsResponse */
    public ListSlowLogsResponse listSlowLogs(ListSlowLogsRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listSlowLogs);
    }

    /** 查询数据库慢日志 查询数据库慢日志。
     *
     * @param ListSlowLogsRequest 请求对象
     * @return SyncInvoker<ListSlowLogsRequest, ListSlowLogsResponse> */
    public SyncInvoker<ListSlowLogsRequest, ListSlowLogsResponse> listSlowLogsInvoker(ListSlowLogsRequest request) {
        return new SyncInvoker<ListSlowLogsRequest, ListSlowLogsResponse>(request, RdsMeta.listSlowLogs, hcClient);
    }

    /** 查询数据库慢日志 查询数据库慢日志。(与原v3接口相比修改offset,符合华为云服务开放 API遵从性规范3.0)
     *
     * @param ListSlowLogsNewRequest 请求对象
     * @return ListSlowLogsNewResponse */
    public ListSlowLogsNewResponse listSlowLogsNew(ListSlowLogsNewRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listSlowLogsNew);
    }

    /** 查询数据库慢日志 查询数据库慢日志。(与原v3接口相比修改offset,符合华为云服务开放 API遵从性规范3.0)
     *
     * @param ListSlowLogsNewRequest 请求对象
     * @return SyncInvoker<ListSlowLogsNewRequest, ListSlowLogsNewResponse> */
    public SyncInvoker<ListSlowLogsNewRequest, ListSlowLogsNewResponse> listSlowLogsNewInvoker(
        ListSlowLogsNewRequest request) {
        return new SyncInvoker<ListSlowLogsNewRequest, ListSlowLogsNewResponse>(request, RdsMeta.listSlowLogsNew,
            hcClient);
    }

    /** 获取慢日志统计信息 获取慢日志统计信息
     *
     * @param ListSlowlogStatisticsRequest 请求对象
     * @return ListSlowlogStatisticsResponse */
    public ListSlowlogStatisticsResponse listSlowlogStatistics(ListSlowlogStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listSlowlogStatistics);
    }

    /** 获取慢日志统计信息 获取慢日志统计信息
     *
     * @param ListSlowlogStatisticsRequest 请求对象
     * @return SyncInvoker<ListSlowlogStatisticsRequest, ListSlowlogStatisticsResponse> */
    public SyncInvoker<ListSlowlogStatisticsRequest, ListSlowlogStatisticsResponse> listSlowlogStatisticsInvoker(
        ListSlowlogStatisticsRequest request) {
        return new SyncInvoker<ListSlowlogStatisticsRequest, ListSlowlogStatisticsResponse>(request,
            RdsMeta.listSlowlogStatistics, hcClient);
    }

    /** 查询数据库磁盘类型 查询数据库磁盘类型。
     *
     * @param ListStorageTypesRequest 请求对象
     * @return ListStorageTypesResponse */
    public ListStorageTypesResponse listStorageTypes(ListStorageTypesRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listStorageTypes);
    }

    /** 查询数据库磁盘类型 查询数据库磁盘类型。
     *
     * @param ListStorageTypesRequest 请求对象
     * @return SyncInvoker<ListStorageTypesRequest, ListStorageTypesResponse> */
    public SyncInvoker<ListStorageTypesRequest, ListStorageTypesResponse> listStorageTypesInvoker(
        ListStorageTypesRequest request) {
        return new SyncInvoker<ListStorageTypesRequest, ListStorageTypesResponse>(request, RdsMeta.listStorageTypes,
            hcClient);
    }

    /** 迁移主备实例的备机 迁移主备实例的备机
     *
     * @param MigrateFollowerRequest 请求对象
     * @return MigrateFollowerResponse */
    public MigrateFollowerResponse migrateFollower(MigrateFollowerRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.migrateFollower);
    }

    /** 迁移主备实例的备机 迁移主备实例的备机
     *
     * @param MigrateFollowerRequest 请求对象
     * @return SyncInvoker<MigrateFollowerRequest, MigrateFollowerResponse> */
    public SyncInvoker<MigrateFollowerRequest, MigrateFollowerResponse> migrateFollowerInvoker(
        MigrateFollowerRequest request) {
        return new SyncInvoker<MigrateFollowerRequest, MigrateFollowerResponse>(request, RdsMeta.migrateFollower,
            hcClient);
    }

    /** 恢复到已有实例 恢复到已有实例。
     *
     * @param RestoreExistInstanceRequest 请求对象
     * @return RestoreExistInstanceResponse */
    public RestoreExistInstanceResponse restoreExistInstance(RestoreExistInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.restoreExistInstance);
    }

    /** 恢复到已有实例 恢复到已有实例。
     *
     * @param RestoreExistInstanceRequest 请求对象
     * @return SyncInvoker<RestoreExistInstanceRequest, RestoreExistInstanceResponse> */
    public SyncInvoker<RestoreExistInstanceRequest, RestoreExistInstanceResponse> restoreExistInstanceInvoker(
        RestoreExistInstanceRequest request) {
        return new SyncInvoker<RestoreExistInstanceRequest, RestoreExistInstanceResponse>(request,
            RdsMeta.restoreExistInstance, hcClient);
    }

    /** 表级时间点恢复(MySQL) 表级时间点恢复(MySQL)。
     *
     * @param RestoreTablesRequest 请求对象
     * @return RestoreTablesResponse */
    public RestoreTablesResponse restoreTables(RestoreTablesRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.restoreTables);
    }

    /** 表级时间点恢复(MySQL) 表级时间点恢复(MySQL)。
     *
     * @param RestoreTablesRequest 请求对象
     * @return SyncInvoker<RestoreTablesRequest, RestoreTablesResponse> */
    public SyncInvoker<RestoreTablesRequest, RestoreTablesResponse> restoreTablesInvoker(RestoreTablesRequest request) {
        return new SyncInvoker<RestoreTablesRequest, RestoreTablesResponse>(request, RdsMeta.restoreTables, hcClient);
    }

    /** 恢复到已有实例 恢复到已有实例。
     *
     * @param RestoreToExistingInstanceRequest 请求对象
     * @return RestoreToExistingInstanceResponse */
    public RestoreToExistingInstanceResponse restoreToExistingInstance(RestoreToExistingInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.restoreToExistingInstance);
    }

    /** 恢复到已有实例 恢复到已有实例。
     *
     * @param RestoreToExistingInstanceRequest 请求对象
     * @return SyncInvoker<RestoreToExistingInstanceRequest, RestoreToExistingInstanceResponse> */
    public SyncInvoker<RestoreToExistingInstanceRequest, RestoreToExistingInstanceResponse> restoreToExistingInstanceInvoker(
        RestoreToExistingInstanceRequest request) {
        return new SyncInvoker<RestoreToExistingInstanceRequest, RestoreToExistingInstanceResponse>(request,
            RdsMeta.restoreToExistingInstance, hcClient);
    }

    /** 设置审计日志策略 设置审计日志策略。
     *
     * @param SetAuditlogPolicyRequest 请求对象
     * @return SetAuditlogPolicyResponse */
    public SetAuditlogPolicyResponse setAuditlogPolicy(SetAuditlogPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.setAuditlogPolicy);
    }

    /** 设置审计日志策略 设置审计日志策略。
     *
     * @param SetAuditlogPolicyRequest 请求对象
     * @return SyncInvoker<SetAuditlogPolicyRequest, SetAuditlogPolicyResponse> */
    public SyncInvoker<SetAuditlogPolicyRequest, SetAuditlogPolicyResponse> setAuditlogPolicyInvoker(
        SetAuditlogPolicyRequest request) {
        return new SyncInvoker<SetAuditlogPolicyRequest, SetAuditlogPolicyResponse>(request, RdsMeta.setAuditlogPolicy,
            hcClient);
    }

    /** 设置自动备份策略 设置自动备份策略。
     *
     * @param SetBackupPolicyRequest 请求对象
     * @return SetBackupPolicyResponse */
    public SetBackupPolicyResponse setBackupPolicy(SetBackupPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.setBackupPolicy);
    }

    /** 设置自动备份策略 设置自动备份策略。
     *
     * @param SetBackupPolicyRequest 请求对象
     * @return SyncInvoker<SetBackupPolicyRequest, SetBackupPolicyResponse> */
    public SyncInvoker<SetBackupPolicyRequest, SetBackupPolicyResponse> setBackupPolicyInvoker(
        SetBackupPolicyRequest request) {
        return new SyncInvoker<SetBackupPolicyRequest, SetBackupPolicyResponse>(request, RdsMeta.setBackupPolicy,
            hcClient);
    }

    /** 设置binlog本地保留时长 修改指定实例的binlog本地保留时长。
     *
     * @param SetBinlogClearPolicyRequest 请求对象
     * @return SetBinlogClearPolicyResponse */
    public SetBinlogClearPolicyResponse setBinlogClearPolicy(SetBinlogClearPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.setBinlogClearPolicy);
    }

    /** 设置binlog本地保留时长 修改指定实例的binlog本地保留时长。
     *
     * @param SetBinlogClearPolicyRequest 请求对象
     * @return SyncInvoker<SetBinlogClearPolicyRequest, SetBinlogClearPolicyResponse> */
    public SyncInvoker<SetBinlogClearPolicyRequest, SetBinlogClearPolicyResponse> setBinlogClearPolicyInvoker(
        SetBinlogClearPolicyRequest request) {
        return new SyncInvoker<SetBinlogClearPolicyRequest, SetBinlogClearPolicyResponse>(request,
            RdsMeta.setBinlogClearPolicy, hcClient);
    }

    /** 设置跨区域备份策略 设置跨区域备份策略。
     *
     * @param SetOffSiteBackupPolicyRequest 请求对象
     * @return SetOffSiteBackupPolicyResponse */
    public SetOffSiteBackupPolicyResponse setOffSiteBackupPolicy(SetOffSiteBackupPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.setOffSiteBackupPolicy);
    }

    /** 设置跨区域备份策略 设置跨区域备份策略。
     *
     * @param SetOffSiteBackupPolicyRequest 请求对象
     * @return SyncInvoker<SetOffSiteBackupPolicyRequest, SetOffSiteBackupPolicyResponse> */
    public SyncInvoker<SetOffSiteBackupPolicyRequest, SetOffSiteBackupPolicyResponse> setOffSiteBackupPolicyInvoker(
        SetOffSiteBackupPolicyRequest request) {
        return new SyncInvoker<SetOffSiteBackupPolicyRequest, SetOffSiteBackupPolicyResponse>(request,
            RdsMeta.setOffSiteBackupPolicy, hcClient);
    }

    /** 修改安全组 修改安全组
     *
     * @param SetSecurityGroupRequest 请求对象
     * @return SetSecurityGroupResponse */
    public SetSecurityGroupResponse setSecurityGroup(SetSecurityGroupRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.setSecurityGroup);
    }

    /** 修改安全组 修改安全组
     *
     * @param SetSecurityGroupRequest 请求对象
     * @return SyncInvoker<SetSecurityGroupRequest, SetSecurityGroupResponse> */
    public SyncInvoker<SetSecurityGroupRequest, SetSecurityGroupResponse> setSecurityGroupInvoker(
        SetSecurityGroupRequest request) {
        return new SyncInvoker<SetSecurityGroupRequest, SetSecurityGroupResponse>(request, RdsMeta.setSecurityGroup,
            hcClient);
    }

    /** 生成审计日志下载链接 生成审计日志下载链接。
     *
     * @param ShowAuditlogDownloadLinkRequest 请求对象
     * @return ShowAuditlogDownloadLinkResponse */
    public ShowAuditlogDownloadLinkResponse showAuditlogDownloadLink(ShowAuditlogDownloadLinkRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.showAuditlogDownloadLink);
    }

    /** 生成审计日志下载链接 生成审计日志下载链接。
     *
     * @param ShowAuditlogDownloadLinkRequest 请求对象
     * @return SyncInvoker<ShowAuditlogDownloadLinkRequest, ShowAuditlogDownloadLinkResponse> */
    public SyncInvoker<ShowAuditlogDownloadLinkRequest, ShowAuditlogDownloadLinkResponse> showAuditlogDownloadLinkInvoker(
        ShowAuditlogDownloadLinkRequest request) {
        return new SyncInvoker<ShowAuditlogDownloadLinkRequest, ShowAuditlogDownloadLinkResponse>(request,
            RdsMeta.showAuditlogDownloadLink, hcClient);
    }

    /** 查询审计日志策略 查询审计日志策略。
     *
     * @param ShowAuditlogPolicyRequest 请求对象
     * @return ShowAuditlogPolicyResponse */
    public ShowAuditlogPolicyResponse showAuditlogPolicy(ShowAuditlogPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.showAuditlogPolicy);
    }

    /** 查询审计日志策略 查询审计日志策略。
     *
     * @param ShowAuditlogPolicyRequest 请求对象
     * @return SyncInvoker<ShowAuditlogPolicyRequest, ShowAuditlogPolicyResponse> */
    public SyncInvoker<ShowAuditlogPolicyRequest, ShowAuditlogPolicyResponse> showAuditlogPolicyInvoker(
        ShowAuditlogPolicyRequest request) {
        return new SyncInvoker<ShowAuditlogPolicyRequest, ShowAuditlogPolicyResponse>(request,
            RdsMeta.showAuditlogPolicy, hcClient);
    }

    /** 获取备份下载链接 获取备份下载链接。
     *
     * @param ShowBackupDownloadLinkRequest 请求对象
     * @return ShowBackupDownloadLinkResponse */
    public ShowBackupDownloadLinkResponse showBackupDownloadLink(ShowBackupDownloadLinkRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.showBackupDownloadLink);
    }

    /** 获取备份下载链接 获取备份下载链接。
     *
     * @param ShowBackupDownloadLinkRequest 请求对象
     * @return SyncInvoker<ShowBackupDownloadLinkRequest, ShowBackupDownloadLinkResponse> */
    public SyncInvoker<ShowBackupDownloadLinkRequest, ShowBackupDownloadLinkResponse> showBackupDownloadLinkInvoker(
        ShowBackupDownloadLinkRequest request) {
        return new SyncInvoker<ShowBackupDownloadLinkRequest, ShowBackupDownloadLinkResponse>(request,
            RdsMeta.showBackupDownloadLink, hcClient);
    }

    /** 查询自动备份策略 查询自动备份策略。
     *
     * @param ShowBackupPolicyRequest 请求对象
     * @return ShowBackupPolicyResponse */
    public ShowBackupPolicyResponse showBackupPolicy(ShowBackupPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.showBackupPolicy);
    }

    /** 查询自动备份策略 查询自动备份策略。
     *
     * @param ShowBackupPolicyRequest 请求对象
     * @return SyncInvoker<ShowBackupPolicyRequest, ShowBackupPolicyResponse> */
    public SyncInvoker<ShowBackupPolicyRequest, ShowBackupPolicyResponse> showBackupPolicyInvoker(
        ShowBackupPolicyRequest request) {
        return new SyncInvoker<ShowBackupPolicyRequest, ShowBackupPolicyResponse>(request, RdsMeta.showBackupPolicy,
            hcClient);
    }

    /** 获取binlog本地保留时长 查寻指定实例的binlog本地保留时长。
     *
     * @param ShowBinlogClearPolicyRequest 请求对象
     * @return ShowBinlogClearPolicyResponse */
    public ShowBinlogClearPolicyResponse showBinlogClearPolicy(ShowBinlogClearPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.showBinlogClearPolicy);
    }

    /** 获取binlog本地保留时长 查寻指定实例的binlog本地保留时长。
     *
     * @param ShowBinlogClearPolicyRequest 请求对象
     * @return SyncInvoker<ShowBinlogClearPolicyRequest, ShowBinlogClearPolicyResponse> */
    public SyncInvoker<ShowBinlogClearPolicyRequest, ShowBinlogClearPolicyResponse> showBinlogClearPolicyInvoker(
        ShowBinlogClearPolicyRequest request) {
        return new SyncInvoker<ShowBinlogClearPolicyRequest, ShowBinlogClearPolicyResponse>(request,
            RdsMeta.showBinlogClearPolicy, hcClient);
    }

    /** 获取指定参数模板的参数 获取指定参数模板的参数。
     *
     * @param ShowConfigurationRequest 请求对象
     * @return ShowConfigurationResponse */
    public ShowConfigurationResponse showConfiguration(ShowConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.showConfiguration);
    }

    /** 获取指定参数模板的参数 获取指定参数模板的参数。
     *
     * @param ShowConfigurationRequest 请求对象
     * @return SyncInvoker<ShowConfigurationRequest, ShowConfigurationResponse> */
    public SyncInvoker<ShowConfigurationRequest, ShowConfigurationResponse> showConfigurationInvoker(
        ShowConfigurationRequest request) {
        return new SyncInvoker<ShowConfigurationRequest, ShowConfigurationResponse>(request, RdsMeta.showConfiguration,
            hcClient);
    }

    /** 查询跨云容灾复制状态 建立跨云容灾关系后，查询主实例和灾备实例间的复制状态及延迟。
     *
     * @param ShowDrReplicaStatusRequest 请求对象
     * @return ShowDrReplicaStatusResponse */
    public ShowDrReplicaStatusResponse showDrReplicaStatus(ShowDrReplicaStatusRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.showDrReplicaStatus);
    }

    /** 查询跨云容灾复制状态 建立跨云容灾关系后，查询主实例和灾备实例间的复制状态及延迟。
     *
     * @param ShowDrReplicaStatusRequest 请求对象
     * @return SyncInvoker<ShowDrReplicaStatusRequest, ShowDrReplicaStatusResponse> */
    public SyncInvoker<ShowDrReplicaStatusRequest, ShowDrReplicaStatusResponse> showDrReplicaStatusInvoker(
        ShowDrReplicaStatusRequest request) {
        return new SyncInvoker<ShowDrReplicaStatusRequest, ShowDrReplicaStatusResponse>(request,
            RdsMeta.showDrReplicaStatus, hcClient);
    }

    /** 获取指定实例的参数模板 获取指定实例的参数模板。
     *
     * @param ShowInstanceConfigurationRequest 请求对象
     * @return ShowInstanceConfigurationResponse */
    public ShowInstanceConfigurationResponse showInstanceConfiguration(ShowInstanceConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.showInstanceConfiguration);
    }

    /** 获取指定实例的参数模板 获取指定实例的参数模板。
     *
     * @param ShowInstanceConfigurationRequest 请求对象
     * @return SyncInvoker<ShowInstanceConfigurationRequest, ShowInstanceConfigurationResponse> */
    public SyncInvoker<ShowInstanceConfigurationRequest, ShowInstanceConfigurationResponse> showInstanceConfigurationInvoker(
        ShowInstanceConfigurationRequest request) {
        return new SyncInvoker<ShowInstanceConfigurationRequest, ShowInstanceConfigurationResponse>(request,
            RdsMeta.showInstanceConfiguration, hcClient);
    }

    /** 查询跨区域备份策略 查询跨区域备份策略。
     *
     * @param ShowOffSiteBackupPolicyRequest 请求对象
     * @return ShowOffSiteBackupPolicyResponse */
    public ShowOffSiteBackupPolicyResponse showOffSiteBackupPolicy(ShowOffSiteBackupPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.showOffSiteBackupPolicy);
    }

    /** 查询跨区域备份策略 查询跨区域备份策略。
     *
     * @param ShowOffSiteBackupPolicyRequest 请求对象
     * @return SyncInvoker<ShowOffSiteBackupPolicyRequest, ShowOffSiteBackupPolicyResponse> */
    public SyncInvoker<ShowOffSiteBackupPolicyRequest, ShowOffSiteBackupPolicyResponse> showOffSiteBackupPolicyInvoker(
        ShowOffSiteBackupPolicyRequest request) {
        return new SyncInvoker<ShowOffSiteBackupPolicyRequest, ShowOffSiteBackupPolicyResponse>(request,
            RdsMeta.showOffSiteBackupPolicy, hcClient);
    }

    /** 查询配额 查询当前项目下资源配额情况。
     *
     * @param ShowQuotasRequest 请求对象
     * @return ShowQuotasResponse */
    public ShowQuotasResponse showQuotas(ShowQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.showQuotas);
    }

    /** 查询配额 查询当前项目下资源配额情况。
     *
     * @param ShowQuotasRequest 请求对象
     * @return SyncInvoker<ShowQuotasRequest, ShowQuotasResponse> */
    public SyncInvoker<ShowQuotasRequest, ShowQuotasResponse> showQuotasInvoker(ShowQuotasRequest request) {
        return new SyncInvoker<ShowQuotasRequest, ShowQuotasResponse>(request, RdsMeta.showQuotas, hcClient);
    }

    /** 手动倒换主备 手动倒换主备.
     *
     * @param StartFailoverRequest 请求对象
     * @return StartFailoverResponse */
    public StartFailoverResponse startFailover(StartFailoverRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.startFailover);
    }

    /** 手动倒换主备 手动倒换主备.
     *
     * @param StartFailoverRequest 请求对象
     * @return SyncInvoker<StartFailoverRequest, StartFailoverResponse> */
    public SyncInvoker<StartFailoverRequest, StartFailoverResponse> startFailoverInvoker(StartFailoverRequest request) {
        return new SyncInvoker<StartFailoverRequest, StartFailoverResponse>(request, RdsMeta.startFailover, hcClient);
    }

    /** 扩容数据库实例的磁盘空间 扩容数据库实例的磁盘空间。
     *
     * @param StartInstanceEnlargeVolumeActionRequest 请求对象
     * @return StartInstanceEnlargeVolumeActionResponse */
    public StartInstanceEnlargeVolumeActionResponse startInstanceEnlargeVolumeAction(
        StartInstanceEnlargeVolumeActionRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.startInstanceEnlargeVolumeAction);
    }

    /** 扩容数据库实例的磁盘空间 扩容数据库实例的磁盘空间。
     *
     * @param StartInstanceEnlargeVolumeActionRequest 请求对象
     * @return SyncInvoker<StartInstanceEnlargeVolumeActionRequest, StartInstanceEnlargeVolumeActionResponse> */
    public SyncInvoker<StartInstanceEnlargeVolumeActionRequest, StartInstanceEnlargeVolumeActionResponse> startInstanceEnlargeVolumeActionInvoker(
        StartInstanceEnlargeVolumeActionRequest request) {
        return new SyncInvoker<StartInstanceEnlargeVolumeActionRequest, StartInstanceEnlargeVolumeActionResponse>(
            request, RdsMeta.startInstanceEnlargeVolumeAction, hcClient);
    }

    /** 重启数据库实例 重启数据库实例。
     *
     * @param StartInstanceRestartActionRequest 请求对象
     * @return StartInstanceRestartActionResponse */
    public StartInstanceRestartActionResponse startInstanceRestartAction(StartInstanceRestartActionRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.startInstanceRestartAction);
    }

    /** 重启数据库实例 重启数据库实例。
     *
     * @param StartInstanceRestartActionRequest 请求对象
     * @return SyncInvoker<StartInstanceRestartActionRequest, StartInstanceRestartActionResponse> */
    public SyncInvoker<StartInstanceRestartActionRequest, StartInstanceRestartActionResponse> startInstanceRestartActionInvoker(
        StartInstanceRestartActionRequest request) {
        return new SyncInvoker<StartInstanceRestartActionRequest, StartInstanceRestartActionResponse>(request,
            RdsMeta.startInstanceRestartAction, hcClient);
    }

    /** 单机转主备实例 单机转主备实例。
     *
     * @param StartInstanceSingleToHaActionRequest 请求对象
     * @return StartInstanceSingleToHaActionResponse */
    public StartInstanceSingleToHaActionResponse startInstanceSingleToHaAction(
        StartInstanceSingleToHaActionRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.startInstanceSingleToHaAction);
    }

    /** 单机转主备实例 单机转主备实例。
     *
     * @param StartInstanceSingleToHaActionRequest 请求对象
     * @return SyncInvoker<StartInstanceSingleToHaActionRequest, StartInstanceSingleToHaActionResponse> */
    public SyncInvoker<StartInstanceSingleToHaActionRequest, StartInstanceSingleToHaActionResponse> startInstanceSingleToHaActionInvoker(
        StartInstanceSingleToHaActionRequest request) {
        return new SyncInvoker<StartInstanceSingleToHaActionRequest, StartInstanceSingleToHaActionResponse>(request,
            RdsMeta.startInstanceSingleToHaAction, hcClient);
    }

    /** 设置回收站策略 设置回收站策略。
     *
     * @param StartRecyclePolicyRequest 请求对象
     * @return StartRecyclePolicyResponse */
    public StartRecyclePolicyResponse startRecyclePolicy(StartRecyclePolicyRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.startRecyclePolicy);
    }

    /** 设置回收站策略 设置回收站策略。
     *
     * @param StartRecyclePolicyRequest 请求对象
     * @return SyncInvoker<StartRecyclePolicyRequest, StartRecyclePolicyResponse> */
    public SyncInvoker<StartRecyclePolicyRequest, StartRecyclePolicyResponse> startRecyclePolicyInvoker(
        StartRecyclePolicyRequest request) {
        return new SyncInvoker<StartRecyclePolicyRequest, StartRecyclePolicyResponse>(request,
            RdsMeta.startRecyclePolicy, hcClient);
    }

    /** 变更数据库实例的规格 变更数据库实例的规格。
     *
     * @param StartResizeFlavorActionRequest 请求对象
     * @return StartResizeFlavorActionResponse */
    public StartResizeFlavorActionResponse startResizeFlavorAction(StartResizeFlavorActionRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.startResizeFlavorAction);
    }

    /** 变更数据库实例的规格 变更数据库实例的规格。
     *
     * @param StartResizeFlavorActionRequest 请求对象
     * @return SyncInvoker<StartResizeFlavorActionRequest, StartResizeFlavorActionResponse> */
    public SyncInvoker<StartResizeFlavorActionRequest, StartResizeFlavorActionResponse> startResizeFlavorActionInvoker(
        StartResizeFlavorActionRequest request) {
        return new SyncInvoker<StartResizeFlavorActionRequest, StartResizeFlavorActionResponse>(request,
            RdsMeta.startResizeFlavorAction, hcClient);
    }

    /** 开启实例 停止实例以节省费用，在停止数据库实例后，支持手动重新开启实例。
     *
     * @param StartupInstanceRequest 请求对象
     * @return StartupInstanceResponse */
    public StartupInstanceResponse startupInstance(StartupInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.startupInstance);
    }

    /** 开启实例 停止实例以节省费用，在停止数据库实例后，支持手动重新开启实例。
     *
     * @param StartupInstanceRequest 请求对象
     * @return SyncInvoker<StartupInstanceRequest, StartupInstanceResponse> */
    public SyncInvoker<StartupInstanceRequest, StartupInstanceResponse> startupInstanceInvoker(
        StartupInstanceRequest request) {
        return new SyncInvoker<StartupInstanceRequest, StartupInstanceResponse>(request, RdsMeta.startupInstance,
            hcClient);
    }

    /** 停止实例 实例进行关机，通过暂时停止按需实例以节省费用，实例默认停止七天。
     *
     * @param StopInstanceRequest 请求对象
     * @return StopInstanceResponse */
    public StopInstanceResponse stopInstance(StopInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.stopInstance);
    }

    /** 停止实例 实例进行关机，通过暂时停止按需实例以节省费用，实例默认停止七天。
     *
     * @param StopInstanceRequest 请求对象
     * @return SyncInvoker<StopInstanceRequest, StopInstanceResponse> */
    public SyncInvoker<StopInstanceRequest, StopInstanceResponse> stopInstanceInvoker(StopInstanceRequest request) {
        return new SyncInvoker<StopInstanceRequest, StopInstanceResponse>(request, RdsMeta.stopInstance, hcClient);
    }

    /** 设置SSL数据加密 设置SSL数据加密。
     *
     * @param SwitchSslRequest 请求对象
     * @return SwitchSslResponse */
    public SwitchSslResponse switchSsl(SwitchSslRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.switchSsl);
    }

    /** 设置SSL数据加密 设置SSL数据加密。
     *
     * @param SwitchSslRequest 请求对象
     * @return SyncInvoker<SwitchSslRequest, SwitchSslResponse> */
    public SyncInvoker<SwitchSslRequest, SwitchSslResponse> switchSslInvoker(SwitchSslRequest request) {
        return new SyncInvoker<SwitchSslRequest, SwitchSslResponse>(request, RdsMeta.switchSsl, hcClient);
    }

    /** 修改参数模板参数 修改参数模板参数。
     *
     * @param UpdateConfigurationRequest 请求对象
     * @return UpdateConfigurationResponse */
    public UpdateConfigurationResponse updateConfiguration(UpdateConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.updateConfiguration);
    }

    /** 修改参数模板参数 修改参数模板参数。
     *
     * @param UpdateConfigurationRequest 请求对象
     * @return SyncInvoker<UpdateConfigurationRequest, UpdateConfigurationResponse> */
    public SyncInvoker<UpdateConfigurationRequest, UpdateConfigurationResponse> updateConfigurationInvoker(
        UpdateConfigurationRequest request) {
        return new SyncInvoker<UpdateConfigurationRequest, UpdateConfigurationResponse>(request,
            RdsMeta.updateConfiguration, hcClient);
    }

    /** 修改内网地址 修改内网地址
     *
     * @param UpdateDataIpRequest 请求对象
     * @return UpdateDataIpResponse */
    public UpdateDataIpResponse updateDataIp(UpdateDataIpRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.updateDataIp);
    }

    /** 修改内网地址 修改内网地址
     *
     * @param UpdateDataIpRequest 请求对象
     * @return SyncInvoker<UpdateDataIpRequest, UpdateDataIpResponse> */
    public SyncInvoker<UpdateDataIpRequest, UpdateDataIpResponse> updateDataIpInvoker(UpdateDataIpRequest request) {
        return new SyncInvoker<UpdateDataIpRequest, UpdateDataIpResponse>(request, RdsMeta.updateDataIp, hcClient);
    }

    /** 修改域名 修改域名
     *
     * @param UpdateDnsNameRequest 请求对象
     * @return UpdateDnsNameResponse */
    public UpdateDnsNameResponse updateDnsName(UpdateDnsNameRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.updateDnsName);
    }

    /** 修改域名 修改域名
     *
     * @param UpdateDnsNameRequest 请求对象
     * @return SyncInvoker<UpdateDnsNameRequest, UpdateDnsNameResponse> */
    public SyncInvoker<UpdateDnsNameRequest, UpdateDnsNameResponse> updateDnsNameInvoker(UpdateDnsNameRequest request) {
        return new SyncInvoker<UpdateDnsNameRequest, UpdateDnsNameResponse>(request, RdsMeta.updateDnsName, hcClient);
    }

    /** 修改指定实例的参数 修改指定实例的参数。
     *
     * @param UpdateInstanceConfigurationRequest 请求对象
     * @return UpdateInstanceConfigurationResponse */
    public UpdateInstanceConfigurationResponse updateInstanceConfiguration(UpdateInstanceConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.updateInstanceConfiguration);
    }

    /** 修改指定实例的参数 修改指定实例的参数。
     *
     * @param UpdateInstanceConfigurationRequest 请求对象
     * @return SyncInvoker<UpdateInstanceConfigurationRequest, UpdateInstanceConfigurationResponse> */
    public SyncInvoker<UpdateInstanceConfigurationRequest, UpdateInstanceConfigurationResponse> updateInstanceConfigurationInvoker(
        UpdateInstanceConfigurationRequest request) {
        return new SyncInvoker<UpdateInstanceConfigurationRequest, UpdateInstanceConfigurationResponse>(request,
            RdsMeta.updateInstanceConfiguration, hcClient);
    }

    /** 修改指定实例的参数 修改指定实例的参数。
     *
     * @param UpdateInstanceConfigurationAsyncRequest 请求对象
     * @return UpdateInstanceConfigurationAsyncResponse */
    public UpdateInstanceConfigurationAsyncResponse updateInstanceConfigurationAsync(
        UpdateInstanceConfigurationAsyncRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.updateInstanceConfigurationAsync);
    }

    /** 修改指定实例的参数 修改指定实例的参数。
     *
     * @param UpdateInstanceConfigurationAsyncRequest 请求对象
     * @return SyncInvoker<UpdateInstanceConfigurationAsyncRequest, UpdateInstanceConfigurationAsyncResponse> */
    public SyncInvoker<UpdateInstanceConfigurationAsyncRequest, UpdateInstanceConfigurationAsyncResponse> updateInstanceConfigurationAsyncInvoker(
        UpdateInstanceConfigurationAsyncRequest request) {
        return new SyncInvoker<UpdateInstanceConfigurationAsyncRequest, UpdateInstanceConfigurationAsyncResponse>(
            request, RdsMeta.updateInstanceConfigurationAsync, hcClient);
    }

    /** 修改实例名称 修改实例名称。
     *
     * @param UpdateInstanceNameRequest 请求对象
     * @return UpdateInstanceNameResponse */
    public UpdateInstanceNameResponse updateInstanceName(UpdateInstanceNameRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.updateInstanceName);
    }

    /** 修改实例名称 修改实例名称。
     *
     * @param UpdateInstanceNameRequest 请求对象
     * @return SyncInvoker<UpdateInstanceNameRequest, UpdateInstanceNameResponse> */
    public SyncInvoker<UpdateInstanceNameRequest, UpdateInstanceNameResponse> updateInstanceNameInvoker(
        UpdateInstanceNameRequest request) {
        return new SyncInvoker<UpdateInstanceNameRequest, UpdateInstanceNameResponse>(request,
            RdsMeta.updateInstanceName, hcClient);
    }

    /** 修改数据库端口 修改数据库端口
     *
     * @param UpdatePortRequest 请求对象
     * @return UpdatePortResponse */
    public UpdatePortResponse updatePort(UpdatePortRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.updatePort);
    }

    /** 修改数据库端口 修改数据库端口
     *
     * @param UpdatePortRequest 请求对象
     * @return SyncInvoker<UpdatePortRequest, UpdatePortResponse> */
    public SyncInvoker<UpdatePortRequest, UpdatePortResponse> updatePortInvoker(UpdatePortRequest request) {
        return new SyncInvoker<UpdatePortRequest, UpdatePortResponse>(request, RdsMeta.updatePort, hcClient);
    }

    /** 修改实例备注信息 修改指定数据库实例的备注信息。
     *
     * @param UpdatePostgresqlInstanceAliasRequest 请求对象
     * @return UpdatePostgresqlInstanceAliasResponse */
    public UpdatePostgresqlInstanceAliasResponse updatePostgresqlInstanceAlias(
        UpdatePostgresqlInstanceAliasRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.updatePostgresqlInstanceAlias);
    }

    /** 修改实例备注信息 修改指定数据库实例的备注信息。
     *
     * @param UpdatePostgresqlInstanceAliasRequest 请求对象
     * @return SyncInvoker<UpdatePostgresqlInstanceAliasRequest, UpdatePostgresqlInstanceAliasResponse> */
    public SyncInvoker<UpdatePostgresqlInstanceAliasRequest, UpdatePostgresqlInstanceAliasResponse> updatePostgresqlInstanceAliasInvoker(
        UpdatePostgresqlInstanceAliasRequest request) {
        return new SyncInvoker<UpdatePostgresqlInstanceAliasRequest, UpdatePostgresqlInstanceAliasResponse>(request,
            RdsMeta.updatePostgresqlInstanceAlias, hcClient);
    }

    /** 升级内核小版本 对实例进行小版本升级。
     *
     * @param UpgradeDbVersionRequest 请求对象
     * @return UpgradeDbVersionResponse */
    public UpgradeDbVersionResponse upgradeDbVersion(UpgradeDbVersionRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.upgradeDbVersion);
    }

    /** 升级内核小版本 对实例进行小版本升级。
     *
     * @param UpgradeDbVersionRequest 请求对象
     * @return SyncInvoker<UpgradeDbVersionRequest, UpgradeDbVersionResponse> */
    public SyncInvoker<UpgradeDbVersionRequest, UpgradeDbVersionResponse> upgradeDbVersionInvoker(
        UpgradeDbVersionRequest request) {
        return new SyncInvoker<UpgradeDbVersionRequest, UpgradeDbVersionResponse>(request, RdsMeta.upgradeDbVersion,
            hcClient);
    }

    /** 查询API版本列表 查询API版本列表。
     *
     * @param ListApiVersionRequest 请求对象
     * @return ListApiVersionResponse */
    public ListApiVersionResponse listApiVersion(ListApiVersionRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listApiVersion);
    }

    /** 查询API版本列表 查询API版本列表。
     *
     * @param ListApiVersionRequest 请求对象
     * @return SyncInvoker<ListApiVersionRequest, ListApiVersionResponse> */
    public SyncInvoker<ListApiVersionRequest, ListApiVersionResponse> listApiVersionInvoker(
        ListApiVersionRequest request) {
        return new SyncInvoker<ListApiVersionRequest, ListApiVersionResponse>(request, RdsMeta.listApiVersion,
            hcClient);
    }

    /** 查询API版本列表 查询API版本列表。
     *
     * @param ListApiVersionNewRequest 请求对象
     * @return ListApiVersionNewResponse */
    public ListApiVersionNewResponse listApiVersionNew(ListApiVersionNewRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listApiVersionNew);
    }

    /** 查询API版本列表 查询API版本列表。
     *
     * @param ListApiVersionNewRequest 请求对象
     * @return SyncInvoker<ListApiVersionNewRequest, ListApiVersionNewResponse> */
    public SyncInvoker<ListApiVersionNewRequest, ListApiVersionNewResponse> listApiVersionNewInvoker(
        ListApiVersionNewRequest request) {
        return new SyncInvoker<ListApiVersionNewRequest, ListApiVersionNewResponse>(request, RdsMeta.listApiVersionNew,
            hcClient);
    }

    /** 查询指定的API版本信息 查询指定的API版本信息。
     *
     * @param ShowApiVersionRequest 请求对象
     * @return ShowApiVersionResponse */
    public ShowApiVersionResponse showApiVersion(ShowApiVersionRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.showApiVersion);
    }

    /** 查询指定的API版本信息 查询指定的API版本信息。
     *
     * @param ShowApiVersionRequest 请求对象
     * @return SyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse> */
    public SyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse> showApiVersionInvoker(
        ShowApiVersionRequest request) {
        return new SyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse>(request, RdsMeta.showApiVersion,
            hcClient);
    }

    /** 授权数据库帐号 授权数据库帐号。
     *
     * @param AllowDbUserPrivilegeRequest 请求对象
     * @return AllowDbUserPrivilegeResponse */
    public AllowDbUserPrivilegeResponse allowDbUserPrivilege(AllowDbUserPrivilegeRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.allowDbUserPrivilege);
    }

    /** 授权数据库帐号 授权数据库帐号。
     *
     * @param AllowDbUserPrivilegeRequest 请求对象
     * @return SyncInvoker<AllowDbUserPrivilegeRequest, AllowDbUserPrivilegeResponse> */
    public SyncInvoker<AllowDbUserPrivilegeRequest, AllowDbUserPrivilegeResponse> allowDbUserPrivilegeInvoker(
        AllowDbUserPrivilegeRequest request) {
        return new SyncInvoker<AllowDbUserPrivilegeRequest, AllowDbUserPrivilegeResponse>(request,
            RdsMeta.allowDbUserPrivilege, hcClient);
    }

    /** 创建数据库 创建数据库。
     *
     * @param CreateDatabaseRequest 请求对象
     * @return CreateDatabaseResponse */
    public CreateDatabaseResponse createDatabase(CreateDatabaseRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.createDatabase);
    }

    /** 创建数据库 创建数据库。
     *
     * @param CreateDatabaseRequest 请求对象
     * @return SyncInvoker<CreateDatabaseRequest, CreateDatabaseResponse> */
    public SyncInvoker<CreateDatabaseRequest, CreateDatabaseResponse> createDatabaseInvoker(
        CreateDatabaseRequest request) {
        return new SyncInvoker<CreateDatabaseRequest, CreateDatabaseResponse>(request, RdsMeta.createDatabase,
            hcClient);
    }

    /** 创建数据库用户 创建数据库用户。
     *
     * @param CreateDbUserRequest 请求对象
     * @return CreateDbUserResponse */
    public CreateDbUserResponse createDbUser(CreateDbUserRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.createDbUser);
    }

    /** 创建数据库用户 创建数据库用户。
     *
     * @param CreateDbUserRequest 请求对象
     * @return SyncInvoker<CreateDbUserRequest, CreateDbUserResponse> */
    public SyncInvoker<CreateDbUserRequest, CreateDbUserResponse> createDbUserInvoker(CreateDbUserRequest request) {
        return new SyncInvoker<CreateDbUserRequest, CreateDbUserResponse>(request, RdsMeta.createDbUser, hcClient);
    }

    /** 删除数据库 删除数据库。
     *
     * @param DeleteDatabaseRequest 请求对象
     * @return DeleteDatabaseResponse */
    public DeleteDatabaseResponse deleteDatabase(DeleteDatabaseRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.deleteDatabase);
    }

    /** 删除数据库 删除数据库。
     *
     * @param DeleteDatabaseRequest 请求对象
     * @return SyncInvoker<DeleteDatabaseRequest, DeleteDatabaseResponse> */
    public SyncInvoker<DeleteDatabaseRequest, DeleteDatabaseResponse> deleteDatabaseInvoker(
        DeleteDatabaseRequest request) {
        return new SyncInvoker<DeleteDatabaseRequest, DeleteDatabaseResponse>(request, RdsMeta.deleteDatabase,
            hcClient);
    }

    /** 删除数据库用户 删除数据库用户。
     *
     * @param DeleteDbUserRequest 请求对象
     * @return DeleteDbUserResponse */
    public DeleteDbUserResponse deleteDbUser(DeleteDbUserRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.deleteDbUser);
    }

    /** 删除数据库用户 删除数据库用户。
     *
     * @param DeleteDbUserRequest 请求对象
     * @return SyncInvoker<DeleteDbUserRequest, DeleteDbUserResponse> */
    public SyncInvoker<DeleteDbUserRequest, DeleteDbUserResponse> deleteDbUserInvoker(DeleteDbUserRequest request) {
        return new SyncInvoker<DeleteDbUserRequest, DeleteDbUserResponse>(request, RdsMeta.deleteDbUser, hcClient);
    }

    /** 查询指定用户的已授权数据库 查询指定用户的已授权数据库。
     *
     * @param ListAuthorizedDatabasesRequest 请求对象
     * @return ListAuthorizedDatabasesResponse */
    public ListAuthorizedDatabasesResponse listAuthorizedDatabases(ListAuthorizedDatabasesRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listAuthorizedDatabases);
    }

    /** 查询指定用户的已授权数据库 查询指定用户的已授权数据库。
     *
     * @param ListAuthorizedDatabasesRequest 请求对象
     * @return SyncInvoker<ListAuthorizedDatabasesRequest, ListAuthorizedDatabasesResponse> */
    public SyncInvoker<ListAuthorizedDatabasesRequest, ListAuthorizedDatabasesResponse> listAuthorizedDatabasesInvoker(
        ListAuthorizedDatabasesRequest request) {
        return new SyncInvoker<ListAuthorizedDatabasesRequest, ListAuthorizedDatabasesResponse>(request,
            RdsMeta.listAuthorizedDatabases, hcClient);
    }

    /** 查询指定数据库的已授权用户 查询指定数据库的已授权用户。
     *
     * @param ListAuthorizedDbUsersRequest 请求对象
     * @return ListAuthorizedDbUsersResponse */
    public ListAuthorizedDbUsersResponse listAuthorizedDbUsers(ListAuthorizedDbUsersRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listAuthorizedDbUsers);
    }

    /** 查询指定数据库的已授权用户 查询指定数据库的已授权用户。
     *
     * @param ListAuthorizedDbUsersRequest 请求对象
     * @return SyncInvoker<ListAuthorizedDbUsersRequest, ListAuthorizedDbUsersResponse> */
    public SyncInvoker<ListAuthorizedDbUsersRequest, ListAuthorizedDbUsersResponse> listAuthorizedDbUsersInvoker(
        ListAuthorizedDbUsersRequest request) {
        return new SyncInvoker<ListAuthorizedDbUsersRequest, ListAuthorizedDbUsersResponse>(request,
            RdsMeta.listAuthorizedDbUsers, hcClient);
    }

    /** 查询数据库列表 查询数据库列表。
     *
     * @param ListDatabasesRequest 请求对象
     * @return ListDatabasesResponse */
    public ListDatabasesResponse listDatabases(ListDatabasesRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listDatabases);
    }

    /** 查询数据库列表 查询数据库列表。
     *
     * @param ListDatabasesRequest 请求对象
     * @return SyncInvoker<ListDatabasesRequest, ListDatabasesResponse> */
    public SyncInvoker<ListDatabasesRequest, ListDatabasesResponse> listDatabasesInvoker(ListDatabasesRequest request) {
        return new SyncInvoker<ListDatabasesRequest, ListDatabasesResponse>(request, RdsMeta.listDatabases, hcClient);
    }

    /** 查询数据库用户列表 查询数据库用户列表。
     *
     * @param ListDbUsersRequest 请求对象
     * @return ListDbUsersResponse */
    public ListDbUsersResponse listDbUsers(ListDbUsersRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listDbUsers);
    }

    /** 查询数据库用户列表 查询数据库用户列表。
     *
     * @param ListDbUsersRequest 请求对象
     * @return SyncInvoker<ListDbUsersRequest, ListDbUsersResponse> */
    public SyncInvoker<ListDbUsersRequest, ListDbUsersResponse> listDbUsersInvoker(ListDbUsersRequest request) {
        return new SyncInvoker<ListDbUsersRequest, ListDbUsersResponse>(request, RdsMeta.listDbUsers, hcClient);
    }

    /** 重置数据库密码 重置数据库密码.
     *
     * @param ResetPwdRequest 请求对象
     * @return ResetPwdResponse */
    public ResetPwdResponse resetPwd(ResetPwdRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.resetPwd);
    }

    /** 重置数据库密码 重置数据库密码.
     *
     * @param ResetPwdRequest 请求对象
     * @return SyncInvoker<ResetPwdRequest, ResetPwdResponse> */
    public SyncInvoker<ResetPwdRequest, ResetPwdResponse> resetPwdInvoker(ResetPwdRequest request) {
        return new SyncInvoker<ResetPwdRequest, ResetPwdResponse>(request, RdsMeta.resetPwd, hcClient);
    }

    /** 解除数据库帐号权限 解除数据库帐号权限。
     *
     * @param RevokeRequest 请求对象
     * @return RevokeResponse */
    public RevokeResponse revoke(RevokeRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.revoke);
    }

    /** 解除数据库帐号权限 解除数据库帐号权限。
     *
     * @param RevokeRequest 请求对象
     * @return SyncInvoker<RevokeRequest, RevokeResponse> */
    public SyncInvoker<RevokeRequest, RevokeResponse> revokeInvoker(RevokeRequest request) {
        return new SyncInvoker<RevokeRequest, RevokeResponse>(request, RdsMeta.revoke, hcClient);
    }

    /** 设置数据库账号密码 设置数据库账号密码
     *
     * @param SetDbUserPwdRequest 请求对象
     * @return SetDbUserPwdResponse */
    public SetDbUserPwdResponse setDbUserPwd(SetDbUserPwdRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.setDbUserPwd);
    }

    /** 设置数据库账号密码 设置数据库账号密码
     *
     * @param SetDbUserPwdRequest 请求对象
     * @return SyncInvoker<SetDbUserPwdRequest, SetDbUserPwdResponse> */
    public SyncInvoker<SetDbUserPwdRequest, SetDbUserPwdResponse> setDbUserPwdInvoker(SetDbUserPwdRequest request) {
        return new SyncInvoker<SetDbUserPwdRequest, SetDbUserPwdResponse>(request, RdsMeta.setDbUserPwd, hcClient);
    }

    /** 修改指定实例的数据库备注 修改指定实例中的数据库备注。
     *
     * @param UpdateDatabaseRequest 请求对象
     * @return UpdateDatabaseResponse */
    public UpdateDatabaseResponse updateDatabase(UpdateDatabaseRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.updateDatabase);
    }

    /** 修改指定实例的数据库备注 修改指定实例中的数据库备注。
     *
     * @param UpdateDatabaseRequest 请求对象
     * @return SyncInvoker<UpdateDatabaseRequest, UpdateDatabaseResponse> */
    public SyncInvoker<UpdateDatabaseRequest, UpdateDatabaseResponse> updateDatabaseInvoker(
        UpdateDatabaseRequest request) {
        return new SyncInvoker<UpdateDatabaseRequest, UpdateDatabaseResponse>(request, RdsMeta.updateDatabase,
            hcClient);
    }

    /** 授权数据库帐号 在指定实例的数据库中, 设置帐号的权限。
     *
     * @param AllowDbPrivilegeRequest 请求对象
     * @return AllowDbPrivilegeResponse */
    public AllowDbPrivilegeResponse allowDbPrivilege(AllowDbPrivilegeRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.allowDbPrivilege);
    }

    /** 授权数据库帐号 在指定实例的数据库中, 设置帐号的权限。
     *
     * @param AllowDbPrivilegeRequest 请求对象
     * @return SyncInvoker<AllowDbPrivilegeRequest, AllowDbPrivilegeResponse> */
    public SyncInvoker<AllowDbPrivilegeRequest, AllowDbPrivilegeResponse> allowDbPrivilegeInvoker(
        AllowDbPrivilegeRequest request) {
        return new SyncInvoker<AllowDbPrivilegeRequest, AllowDbPrivilegeResponse>(request, RdsMeta.allowDbPrivilege,
            hcClient);
    }

    /** 数据库代理规格变更 数据库代理实例进行规格变更。 - 调用接口前，您需要了解API 认证鉴权。
     *
     * @param ChangeProxyScaleRequest 请求对象
     * @return ChangeProxyScaleResponse */
    public ChangeProxyScaleResponse changeProxyScale(ChangeProxyScaleRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.changeProxyScale);
    }

    /** 数据库代理规格变更 数据库代理实例进行规格变更。 - 调用接口前，您需要了解API 认证鉴权。
     *
     * @param ChangeProxyScaleRequest 请求对象
     * @return SyncInvoker<ChangeProxyScaleRequest, ChangeProxyScaleResponse> */
    public SyncInvoker<ChangeProxyScaleRequest, ChangeProxyScaleResponse> changeProxyScaleInvoker(
        ChangeProxyScaleRequest request) {
        return new SyncInvoker<ChangeProxyScaleRequest, ChangeProxyScaleResponse>(request, RdsMeta.changeProxyScale,
            hcClient);
    }

    /** 修改读写分离阈值 修改指定实例的读写分离延时阈值。
     *
     * @param ChangeTheDelayThresholdRequest 请求对象
     * @return ChangeTheDelayThresholdResponse */
    public ChangeTheDelayThresholdResponse changeTheDelayThreshold(ChangeTheDelayThresholdRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.changeTheDelayThreshold);
    }

    /** 修改读写分离阈值 修改指定实例的读写分离延时阈值。
     *
     * @param ChangeTheDelayThresholdRequest 请求对象
     * @return SyncInvoker<ChangeTheDelayThresholdRequest, ChangeTheDelayThresholdResponse> */
    public SyncInvoker<ChangeTheDelayThresholdRequest, ChangeTheDelayThresholdResponse> changeTheDelayThresholdInvoker(
        ChangeTheDelayThresholdRequest request) {
        return new SyncInvoker<ChangeTheDelayThresholdRequest, ChangeTheDelayThresholdResponse>(request,
            RdsMeta.changeTheDelayThreshold, hcClient);
    }

    /** 创建数据库 在指定实例中创建数据库。
     *
     * @param CreatePostgresqlDatabaseRequest 请求对象
     * @return CreatePostgresqlDatabaseResponse */
    public CreatePostgresqlDatabaseResponse createPostgresqlDatabase(CreatePostgresqlDatabaseRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.createPostgresqlDatabase);
    }

    /** 创建数据库 在指定实例中创建数据库。
     *
     * @param CreatePostgresqlDatabaseRequest 请求对象
     * @return SyncInvoker<CreatePostgresqlDatabaseRequest, CreatePostgresqlDatabaseResponse> */
    public SyncInvoker<CreatePostgresqlDatabaseRequest, CreatePostgresqlDatabaseResponse> createPostgresqlDatabaseInvoker(
        CreatePostgresqlDatabaseRequest request) {
        return new SyncInvoker<CreatePostgresqlDatabaseRequest, CreatePostgresqlDatabaseResponse>(request,
            RdsMeta.createPostgresqlDatabase, hcClient);
    }

    /** 创建数据库SCHEMA 在指定实例的数据库中, 创建数据库schema。
     *
     * @param CreatePostgresqlDatabaseSchemaRequest 请求对象
     * @return CreatePostgresqlDatabaseSchemaResponse */
    public CreatePostgresqlDatabaseSchemaResponse createPostgresqlDatabaseSchema(
        CreatePostgresqlDatabaseSchemaRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.createPostgresqlDatabaseSchema);
    }

    /** 创建数据库SCHEMA 在指定实例的数据库中, 创建数据库schema。
     *
     * @param CreatePostgresqlDatabaseSchemaRequest 请求对象
     * @return SyncInvoker<CreatePostgresqlDatabaseSchemaRequest, CreatePostgresqlDatabaseSchemaResponse> */
    public SyncInvoker<CreatePostgresqlDatabaseSchemaRequest, CreatePostgresqlDatabaseSchemaResponse> createPostgresqlDatabaseSchemaInvoker(
        CreatePostgresqlDatabaseSchemaRequest request) {
        return new SyncInvoker<CreatePostgresqlDatabaseSchemaRequest, CreatePostgresqlDatabaseSchemaResponse>(request,
            RdsMeta.createPostgresqlDatabaseSchema, hcClient);
    }

    /** 创建数据库用户 在指定实例中创建数据库用户。
     *
     * @param CreatePostgresqlDbUserRequest 请求对象
     * @return CreatePostgresqlDbUserResponse */
    public CreatePostgresqlDbUserResponse createPostgresqlDbUser(CreatePostgresqlDbUserRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.createPostgresqlDbUser);
    }

    /** 创建数据库用户 在指定实例中创建数据库用户。
     *
     * @param CreatePostgresqlDbUserRequest 请求对象
     * @return SyncInvoker<CreatePostgresqlDbUserRequest, CreatePostgresqlDbUserResponse> */
    public SyncInvoker<CreatePostgresqlDbUserRequest, CreatePostgresqlDbUserResponse> createPostgresqlDbUserInvoker(
        CreatePostgresqlDbUserRequest request) {
        return new SyncInvoker<CreatePostgresqlDbUserRequest, CreatePostgresqlDbUserResponse>(request,
            RdsMeta.createPostgresqlDbUser, hcClient);
    }

    /** 查询数据库SCHEMA列表 查询指定实例的数据库SCHEMA列表。
     *
     * @param ListPostgresqlDatabaseSchemasRequest 请求对象
     * @return ListPostgresqlDatabaseSchemasResponse */
    public ListPostgresqlDatabaseSchemasResponse listPostgresqlDatabaseSchemas(
        ListPostgresqlDatabaseSchemasRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listPostgresqlDatabaseSchemas);
    }

    /** 查询数据库SCHEMA列表 查询指定实例的数据库SCHEMA列表。
     *
     * @param ListPostgresqlDatabaseSchemasRequest 请求对象
     * @return SyncInvoker<ListPostgresqlDatabaseSchemasRequest, ListPostgresqlDatabaseSchemasResponse> */
    public SyncInvoker<ListPostgresqlDatabaseSchemasRequest, ListPostgresqlDatabaseSchemasResponse> listPostgresqlDatabaseSchemasInvoker(
        ListPostgresqlDatabaseSchemasRequest request) {
        return new SyncInvoker<ListPostgresqlDatabaseSchemasRequest, ListPostgresqlDatabaseSchemasResponse>(request,
            RdsMeta.listPostgresqlDatabaseSchemas, hcClient);
    }

    /** 查询数据库列表 查询指定实例中的数据库列表。
     *
     * @param ListPostgresqlDatabasesRequest 请求对象
     * @return ListPostgresqlDatabasesResponse */
    public ListPostgresqlDatabasesResponse listPostgresqlDatabases(ListPostgresqlDatabasesRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listPostgresqlDatabases);
    }

    /** 查询数据库列表 查询指定实例中的数据库列表。
     *
     * @param ListPostgresqlDatabasesRequest 请求对象
     * @return SyncInvoker<ListPostgresqlDatabasesRequest, ListPostgresqlDatabasesResponse> */
    public SyncInvoker<ListPostgresqlDatabasesRequest, ListPostgresqlDatabasesResponse> listPostgresqlDatabasesInvoker(
        ListPostgresqlDatabasesRequest request) {
        return new SyncInvoker<ListPostgresqlDatabasesRequest, ListPostgresqlDatabasesResponse>(request,
            RdsMeta.listPostgresqlDatabases, hcClient);
    }

    /** 查询数据库用户列表 在指定实例中查询数据库用户列表。
     *
     * @param ListPostgresqlDbUserPaginatedRequest 请求对象
     * @return ListPostgresqlDbUserPaginatedResponse */
    public ListPostgresqlDbUserPaginatedResponse listPostgresqlDbUserPaginated(
        ListPostgresqlDbUserPaginatedRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listPostgresqlDbUserPaginated);
    }

    /** 查询数据库用户列表 在指定实例中查询数据库用户列表。
     *
     * @param ListPostgresqlDbUserPaginatedRequest 请求对象
     * @return SyncInvoker<ListPostgresqlDbUserPaginatedRequest, ListPostgresqlDbUserPaginatedResponse> */
    public SyncInvoker<ListPostgresqlDbUserPaginatedRequest, ListPostgresqlDbUserPaginatedResponse> listPostgresqlDbUserPaginatedInvoker(
        ListPostgresqlDbUserPaginatedRequest request) {
        return new SyncInvoker<ListPostgresqlDbUserPaginatedRequest, ListPostgresqlDbUserPaginatedResponse>(request,
            RdsMeta.listPostgresqlDbUserPaginated, hcClient);
    }

    /** 查询数据库代理可变更的规格 查询数据库代理可变更的规格信息。 - 调用接口前，您需要了解API 认证鉴权。
     *
     * @param SearchQueryScaleComputeFlavorsRequest 请求对象
     * @return SearchQueryScaleComputeFlavorsResponse */
    public SearchQueryScaleComputeFlavorsResponse searchQueryScaleComputeFlavors(
        SearchQueryScaleComputeFlavorsRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.searchQueryScaleComputeFlavors);
    }

    /** 查询数据库代理可变更的规格 查询数据库代理可变更的规格信息。 - 调用接口前，您需要了解API 认证鉴权。
     *
     * @param SearchQueryScaleComputeFlavorsRequest 请求对象
     * @return SyncInvoker<SearchQueryScaleComputeFlavorsRequest, SearchQueryScaleComputeFlavorsResponse> */
    public SyncInvoker<SearchQueryScaleComputeFlavorsRequest, SearchQueryScaleComputeFlavorsResponse> searchQueryScaleComputeFlavorsInvoker(
        SearchQueryScaleComputeFlavorsRequest request) {
        return new SyncInvoker<SearchQueryScaleComputeFlavorsRequest, SearchQueryScaleComputeFlavorsResponse>(request,
            RdsMeta.searchQueryScaleComputeFlavors, hcClient);
    }

    /** 查询数据库代理可变更的规格 查询数据库代理可变更的规格信息。 - 调用接口前，您需要了解API 认证鉴权。
     *
     * @param SearchQueryScaleFlavorsRequest 请求对象
     * @return SearchQueryScaleFlavorsResponse */
    public SearchQueryScaleFlavorsResponse searchQueryScaleFlavors(SearchQueryScaleFlavorsRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.searchQueryScaleFlavors);
    }

    /** 查询数据库代理可变更的规格 查询数据库代理可变更的规格信息。 - 调用接口前，您需要了解API 认证鉴权。
     *
     * @param SearchQueryScaleFlavorsRequest 请求对象
     * @return SyncInvoker<SearchQueryScaleFlavorsRequest, SearchQueryScaleFlavorsResponse> */
    public SyncInvoker<SearchQueryScaleFlavorsRequest, SearchQueryScaleFlavorsResponse> searchQueryScaleFlavorsInvoker(
        SearchQueryScaleFlavorsRequest request) {
        return new SyncInvoker<SearchQueryScaleFlavorsRequest, SearchQueryScaleFlavorsResponse>(request,
            RdsMeta.searchQueryScaleFlavors, hcClient);
    }

    /** 重置数据库帐号密码 重置指定数据库帐号的密码。
     *
     * @param SetPostgresqlDbUserPwdRequest 请求对象
     * @return SetPostgresqlDbUserPwdResponse */
    public SetPostgresqlDbUserPwdResponse setPostgresqlDbUserPwd(SetPostgresqlDbUserPwdRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.setPostgresqlDbUserPwd);
    }

    /** 重置数据库帐号密码 重置指定数据库帐号的密码。
     *
     * @param SetPostgresqlDbUserPwdRequest 请求对象
     * @return SyncInvoker<SetPostgresqlDbUserPwdRequest, SetPostgresqlDbUserPwdResponse> */
    public SyncInvoker<SetPostgresqlDbUserPwdRequest, SetPostgresqlDbUserPwdResponse> setPostgresqlDbUserPwdInvoker(
        SetPostgresqlDbUserPwdRequest request) {
        return new SyncInvoker<SetPostgresqlDbUserPwdRequest, SetPostgresqlDbUserPwdResponse>(request,
            RdsMeta.setPostgresqlDbUserPwd, hcClient);
    }

    /** 查询数据库代理信息 查询指定实例的数据库代理详细信息。
     *
     * @param ShowInformationAboutDatabaseProxyRequest 请求对象
     * @return ShowInformationAboutDatabaseProxyResponse */
    public ShowInformationAboutDatabaseProxyResponse showInformationAboutDatabaseProxy(
        ShowInformationAboutDatabaseProxyRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.showInformationAboutDatabaseProxy);
    }

    /** 查询数据库代理信息 查询指定实例的数据库代理详细信息。
     *
     * @param ShowInformationAboutDatabaseProxyRequest 请求对象
     * @return SyncInvoker<ShowInformationAboutDatabaseProxyRequest, ShowInformationAboutDatabaseProxyResponse> */
    public SyncInvoker<ShowInformationAboutDatabaseProxyRequest, ShowInformationAboutDatabaseProxyResponse> showInformationAboutDatabaseProxyInvoker(
        ShowInformationAboutDatabaseProxyRequest request) {
        return new SyncInvoker<ShowInformationAboutDatabaseProxyRequest, ShowInformationAboutDatabaseProxyResponse>(
            request, RdsMeta.showInformationAboutDatabaseProxy, hcClient);
    }

    /** 开启数据库代理 为指定实例开启数据库代理。
     *
     * @param StartDatabaseProxyRequest 请求对象
     * @return StartDatabaseProxyResponse */
    public StartDatabaseProxyResponse startDatabaseProxy(StartDatabaseProxyRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.startDatabaseProxy);
    }

    /** 开启数据库代理 为指定实例开启数据库代理。
     *
     * @param StartDatabaseProxyRequest 请求对象
     * @return SyncInvoker<StartDatabaseProxyRequest, StartDatabaseProxyResponse> */
    public SyncInvoker<StartDatabaseProxyRequest, StartDatabaseProxyResponse> startDatabaseProxyInvoker(
        StartDatabaseProxyRequest request) {
        return new SyncInvoker<StartDatabaseProxyRequest, StartDatabaseProxyResponse>(request,
            RdsMeta.startDatabaseProxy, hcClient);
    }

    /** 关闭数据库代理 为指定实例关闭数据库代理。
     *
     * @param StopDatabaseProxyRequest 请求对象
     * @return StopDatabaseProxyResponse */
    public StopDatabaseProxyResponse stopDatabaseProxy(StopDatabaseProxyRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.stopDatabaseProxy);
    }

    /** 关闭数据库代理 为指定实例关闭数据库代理。
     *
     * @param StopDatabaseProxyRequest 请求对象
     * @return SyncInvoker<StopDatabaseProxyRequest, StopDatabaseProxyResponse> */
    public SyncInvoker<StopDatabaseProxyRequest, StopDatabaseProxyResponse> stopDatabaseProxyInvoker(
        StopDatabaseProxyRequest request) {
        return new SyncInvoker<StopDatabaseProxyRequest, StopDatabaseProxyResponse>(request, RdsMeta.stopDatabaseProxy,
            hcClient);
    }

    /** 修改读写分离权重 修改指定实例的读写分离权重。
     *
     * @param UpdateReadWeightRequest 请求对象
     * @return UpdateReadWeightResponse */
    public UpdateReadWeightResponse updateReadWeight(UpdateReadWeightRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.updateReadWeight);
    }

    /** 修改读写分离权重 修改指定实例的读写分离权重。
     *
     * @param UpdateReadWeightRequest 请求对象
     * @return SyncInvoker<UpdateReadWeightRequest, UpdateReadWeightResponse> */
    public SyncInvoker<UpdateReadWeightRequest, UpdateReadWeightResponse> updateReadWeightInvoker(
        UpdateReadWeightRequest request) {
        return new SyncInvoker<UpdateReadWeightRequest, UpdateReadWeightResponse>(request, RdsMeta.updateReadWeight,
            hcClient);
    }

    /** 授权数据库帐号 授权数据库帐号。
     *
     * @param AllowSqlserverDbUserPrivilegeRequest 请求对象
     * @return AllowSqlserverDbUserPrivilegeResponse */
    public AllowSqlserverDbUserPrivilegeResponse allowSqlserverDbUserPrivilege(
        AllowSqlserverDbUserPrivilegeRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.allowSqlserverDbUserPrivilege);
    }

    /** 授权数据库帐号 授权数据库帐号。
     *
     * @param AllowSqlserverDbUserPrivilegeRequest 请求对象
     * @return SyncInvoker<AllowSqlserverDbUserPrivilegeRequest, AllowSqlserverDbUserPrivilegeResponse> */
    public SyncInvoker<AllowSqlserverDbUserPrivilegeRequest, AllowSqlserverDbUserPrivilegeResponse> allowSqlserverDbUserPrivilegeInvoker(
        AllowSqlserverDbUserPrivilegeRequest request) {
        return new SyncInvoker<AllowSqlserverDbUserPrivilegeRequest, AllowSqlserverDbUserPrivilegeResponse>(request,
            RdsMeta.allowSqlserverDbUserPrivilege, hcClient);
    }

    /** 创建数据库 创建数据库。
     *
     * @param CreateSqlserverDatabaseRequest 请求对象
     * @return CreateSqlserverDatabaseResponse */
    public CreateSqlserverDatabaseResponse createSqlserverDatabase(CreateSqlserverDatabaseRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.createSqlserverDatabase);
    }

    /** 创建数据库 创建数据库。
     *
     * @param CreateSqlserverDatabaseRequest 请求对象
     * @return SyncInvoker<CreateSqlserverDatabaseRequest, CreateSqlserverDatabaseResponse> */
    public SyncInvoker<CreateSqlserverDatabaseRequest, CreateSqlserverDatabaseResponse> createSqlserverDatabaseInvoker(
        CreateSqlserverDatabaseRequest request) {
        return new SyncInvoker<CreateSqlserverDatabaseRequest, CreateSqlserverDatabaseResponse>(request,
            RdsMeta.createSqlserverDatabase, hcClient);
    }

    /** 创建数据库用户 创建数据库用户。
     *
     * @param CreateSqlserverDbUserRequest 请求对象
     * @return CreateSqlserverDbUserResponse */
    public CreateSqlserverDbUserResponse createSqlserverDbUser(CreateSqlserverDbUserRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.createSqlserverDbUser);
    }

    /** 创建数据库用户 创建数据库用户。
     *
     * @param CreateSqlserverDbUserRequest 请求对象
     * @return SyncInvoker<CreateSqlserverDbUserRequest, CreateSqlserverDbUserResponse> */
    public SyncInvoker<CreateSqlserverDbUserRequest, CreateSqlserverDbUserResponse> createSqlserverDbUserInvoker(
        CreateSqlserverDbUserRequest request) {
        return new SyncInvoker<CreateSqlserverDbUserRequest, CreateSqlserverDbUserResponse>(request,
            RdsMeta.createSqlserverDbUser, hcClient);
    }

    /** 删除数据库 删除数据库。
     *
     * @param DeleteSqlserverDatabaseRequest 请求对象
     * @return DeleteSqlserverDatabaseResponse */
    public DeleteSqlserverDatabaseResponse deleteSqlserverDatabase(DeleteSqlserverDatabaseRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.deleteSqlserverDatabase);
    }

    /** 删除数据库 删除数据库。
     *
     * @param DeleteSqlserverDatabaseRequest 请求对象
     * @return SyncInvoker<DeleteSqlserverDatabaseRequest, DeleteSqlserverDatabaseResponse> */
    public SyncInvoker<DeleteSqlserverDatabaseRequest, DeleteSqlserverDatabaseResponse> deleteSqlserverDatabaseInvoker(
        DeleteSqlserverDatabaseRequest request) {
        return new SyncInvoker<DeleteSqlserverDatabaseRequest, DeleteSqlserverDatabaseResponse>(request,
            RdsMeta.deleteSqlserverDatabase, hcClient);
    }

    /** 删除数据库 删除数据库。
     *
     * @param DeleteSqlserverDatabaseExRequest 请求对象
     * @return DeleteSqlserverDatabaseExResponse */
    public DeleteSqlserverDatabaseExResponse deleteSqlserverDatabaseEx(DeleteSqlserverDatabaseExRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.deleteSqlserverDatabaseEx);
    }

    /** 删除数据库 删除数据库。
     *
     * @param DeleteSqlserverDatabaseExRequest 请求对象
     * @return SyncInvoker<DeleteSqlserverDatabaseExRequest, DeleteSqlserverDatabaseExResponse> */
    public SyncInvoker<DeleteSqlserverDatabaseExRequest, DeleteSqlserverDatabaseExResponse> deleteSqlserverDatabaseExInvoker(
        DeleteSqlserverDatabaseExRequest request) {
        return new SyncInvoker<DeleteSqlserverDatabaseExRequest, DeleteSqlserverDatabaseExResponse>(request,
            RdsMeta.deleteSqlserverDatabaseEx, hcClient);
    }

    /** 删除数据库用户 删除数据库用户。
     *
     * @param DeleteSqlserverDbUserRequest 请求对象
     * @return DeleteSqlserverDbUserResponse */
    public DeleteSqlserverDbUserResponse deleteSqlserverDbUser(DeleteSqlserverDbUserRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.deleteSqlserverDbUser);
    }

    /** 删除数据库用户 删除数据库用户。
     *
     * @param DeleteSqlserverDbUserRequest 请求对象
     * @return SyncInvoker<DeleteSqlserverDbUserRequest, DeleteSqlserverDbUserResponse> */
    public SyncInvoker<DeleteSqlserverDbUserRequest, DeleteSqlserverDbUserResponse> deleteSqlserverDbUserInvoker(
        DeleteSqlserverDbUserRequest request) {
        return new SyncInvoker<DeleteSqlserverDbUserRequest, DeleteSqlserverDbUserResponse>(request,
            RdsMeta.deleteSqlserverDbUser, hcClient);
    }

    /** 查询指定数据库的已授权用户 查询指定数据库的已授权用户。
     *
     * @param ListAuthorizedSqlserverDbUsersRequest 请求对象
     * @return ListAuthorizedSqlserverDbUsersResponse */
    public ListAuthorizedSqlserverDbUsersResponse listAuthorizedSqlserverDbUsers(
        ListAuthorizedSqlserverDbUsersRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listAuthorizedSqlserverDbUsers);
    }

    /** 查询指定数据库的已授权用户 查询指定数据库的已授权用户。
     *
     * @param ListAuthorizedSqlserverDbUsersRequest 请求对象
     * @return SyncInvoker<ListAuthorizedSqlserverDbUsersRequest, ListAuthorizedSqlserverDbUsersResponse> */
    public SyncInvoker<ListAuthorizedSqlserverDbUsersRequest, ListAuthorizedSqlserverDbUsersResponse> listAuthorizedSqlserverDbUsersInvoker(
        ListAuthorizedSqlserverDbUsersRequest request) {
        return new SyncInvoker<ListAuthorizedSqlserverDbUsersRequest, ListAuthorizedSqlserverDbUsersResponse>(request,
            RdsMeta.listAuthorizedSqlserverDbUsers, hcClient);
    }

    /** 查询数据库列表 查询数据库列表。
     *
     * @param ListSqlserverDatabasesRequest 请求对象
     * @return ListSqlserverDatabasesResponse */
    public ListSqlserverDatabasesResponse listSqlserverDatabases(ListSqlserverDatabasesRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listSqlserverDatabases);
    }

    /** 查询数据库列表 查询数据库列表。
     *
     * @param ListSqlserverDatabasesRequest 请求对象
     * @return SyncInvoker<ListSqlserverDatabasesRequest, ListSqlserverDatabasesResponse> */
    public SyncInvoker<ListSqlserverDatabasesRequest, ListSqlserverDatabasesResponse> listSqlserverDatabasesInvoker(
        ListSqlserverDatabasesRequest request) {
        return new SyncInvoker<ListSqlserverDatabasesRequest, ListSqlserverDatabasesResponse>(request,
            RdsMeta.listSqlserverDatabases, hcClient);
    }

    /** 查询数据库用户列表 查询数据库用户列表。
     *
     * @param ListSqlserverDbUsersRequest 请求对象
     * @return ListSqlserverDbUsersResponse */
    public ListSqlserverDbUsersResponse listSqlserverDbUsers(ListSqlserverDbUsersRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.listSqlserverDbUsers);
    }

    /** 查询数据库用户列表 查询数据库用户列表。
     *
     * @param ListSqlserverDbUsersRequest 请求对象
     * @return SyncInvoker<ListSqlserverDbUsersRequest, ListSqlserverDbUsersResponse> */
    public SyncInvoker<ListSqlserverDbUsersRequest, ListSqlserverDbUsersResponse> listSqlserverDbUsersInvoker(
        ListSqlserverDbUsersRequest request) {
        return new SyncInvoker<ListSqlserverDbUsersRequest, ListSqlserverDbUsersResponse>(request,
            RdsMeta.listSqlserverDbUsers, hcClient);
    }

    /** 解除数据库帐号权限 解除数据库帐号权限。
     *
     * @param RevokeSqlserverDbUserPrivilegeRequest 请求对象
     * @return RevokeSqlserverDbUserPrivilegeResponse */
    public RevokeSqlserverDbUserPrivilegeResponse revokeSqlserverDbUserPrivilege(
        RevokeSqlserverDbUserPrivilegeRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.revokeSqlserverDbUserPrivilege);
    }

    /** 解除数据库帐号权限 解除数据库帐号权限。
     *
     * @param RevokeSqlserverDbUserPrivilegeRequest 请求对象
     * @return SyncInvoker<RevokeSqlserverDbUserPrivilegeRequest, RevokeSqlserverDbUserPrivilegeResponse> */
    public SyncInvoker<RevokeSqlserverDbUserPrivilegeRequest, RevokeSqlserverDbUserPrivilegeResponse> revokeSqlserverDbUserPrivilegeInvoker(
        RevokeSqlserverDbUserPrivilegeRequest request) {
        return new SyncInvoker<RevokeSqlserverDbUserPrivilegeRequest, RevokeSqlserverDbUserPrivilegeResponse>(request,
            RdsMeta.revokeSqlserverDbUserPrivilege, hcClient);
    }

}
