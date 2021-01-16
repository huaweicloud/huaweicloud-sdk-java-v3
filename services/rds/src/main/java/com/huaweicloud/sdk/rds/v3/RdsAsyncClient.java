package com.huaweicloud.sdk.rds.v3;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.huaweicloud.sdk.rds.v3.model.*;

public class RdsAsyncClient {
    protected HcClient hcClient;

    public RdsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<RdsAsyncClient> newBuilder() {
        return new ClientBuilder<>(RdsAsyncClient::new);
    }


    /**
     * 绑定和解绑弹性公网IP
     * 绑定和解绑弹性公网IP。
     *
     * @param AttachEipRequest 请求对象
     * @return CompletableFuture<AttachEipResponse>
     */
    public CompletableFuture<AttachEipResponse> attachEipAsync(AttachEipRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.attachEip);
    }

    /**
     * 批量添加删除标签
     * 批量添加删除标签。
     *
     * @param BatchTagActionRequest 请求对象
     * @return CompletableFuture<BatchTagActionResponse>
     */
    public CompletableFuture<BatchTagActionResponse> batchTagActionAsync(BatchTagActionRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.batchTagAction);
    }

    /**
     * 更改主备实例的同步模式
     * 更改主备实例的同步模式.
     *
     * @param ChangeFailoverModeRequest 请求对象
     * @return CompletableFuture<ChangeFailoverModeResponse>
     */
    public CompletableFuture<ChangeFailoverModeResponse> changeFailoverModeAsync(ChangeFailoverModeRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.changeFailoverMode);
    }

    /**
     * 切换主备实例的倒换策略
     * 切换主备实例的倒换策略.
     *
     * @param ChangeFailoverStrategyRequest 请求对象
     * @return CompletableFuture<ChangeFailoverStrategyResponse>
     */
    public CompletableFuture<ChangeFailoverStrategyResponse> changeFailoverStrategyAsync(ChangeFailoverStrategyRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.changeFailoverStrategy);
    }

    /**
     * 设置可维护时间段
     * 设置可维护时间段
     *
     * @param ChangeOpsWindowRequest 请求对象
     * @return CompletableFuture<ChangeOpsWindowResponse>
     */
    public CompletableFuture<ChangeOpsWindowResponse> changeOpsWindowAsync(ChangeOpsWindowRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.changeOpsWindow);
    }

    /**
     * 创建参数模板
     * 创建参数模板。
     *
     * @param CreateConfigurationRequest 请求对象
     * @return CompletableFuture<CreateConfigurationResponse>
     */
    public CompletableFuture<CreateConfigurationResponse> createConfigurationAsync(CreateConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.createConfiguration);
    }

    /**
     * 创建数据库实例/恢复到新实例
     * 创建数据库实例/恢复到新实例。
     *
     * @param CreateInstanceRequest 请求对象
     * @return CompletableFuture<CreateInstanceResponse>
     */
    public CompletableFuture<CreateInstanceResponse> createInstanceAsync(CreateInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.createInstance);
    }

    /**
     * 删除参数模板
     * 删除参数模板。
     *
     * @param DeleteConfigurationRequest 请求对象
     * @return CompletableFuture<DeleteConfigurationResponse>
     */
    public CompletableFuture<DeleteConfigurationResponse> deleteConfigurationAsync(DeleteConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.deleteConfiguration);
    }

    /**
     * 删除实例
     * 删除实例。
     *
     * @param DeleteInstanceRequest 请求对象
     * @return CompletableFuture<DeleteInstanceResponse>
     */
    public CompletableFuture<DeleteInstanceResponse> deleteInstanceAsync(DeleteInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.deleteInstance);
    }

    /**
     * 删除手动备份
     * 删除手动备份。
     *
     * @param DeleteManualBackupRequest 请求对象
     * @return CompletableFuture<DeleteManualBackupResponse>
     */
    public CompletableFuture<DeleteManualBackupResponse> deleteManualBackupAsync(DeleteManualBackupRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.deleteManualBackup);
    }

    /**
     * 创建手动备份
     * 创建手动备份。
     *
     * @param DoManualBackupRequest 请求对象
     * @return CompletableFuture<DoManualBackupResponse>
     */
    public CompletableFuture<DoManualBackupResponse> doManualBackupAsync(DoManualBackupRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.doManualBackup);
    }

    /**
     * 获取日志信息
     * 获取日志信息
     *
     * @param DownloadSlowlogRequest 请求对象
     * @return CompletableFuture<DownloadSlowlogResponse>
     */
    public CompletableFuture<DownloadSlowlogResponse> downloadSlowlogAsync(DownloadSlowlogRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.downloadSlowlog);
    }

    /**
     * 应用参数模板
     * 应用参数模板。
     *
     * @param EnableConfigurationRequest 请求对象
     * @return CompletableFuture<EnableConfigurationResponse>
     */
    public CompletableFuture<EnableConfigurationResponse> enableConfigurationAsync(EnableConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.enableConfiguration);
    }

    /**
     * 获取审计日志列表
     * 获取审计日志列表。
     *
     * @param ListAuditlogsRequest 请求对象
     * @return CompletableFuture<ListAuditlogsResponse>
     */
    public CompletableFuture<ListAuditlogsResponse> listAuditlogsAsync(ListAuditlogsRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listAuditlogs);
    }

    /**
     * 获取备份列表
     * 获取备份列表。
     *
     * @param ListBackupsRequest 请求对象
     * @return CompletableFuture<ListBackupsResponse>
     */
    public CompletableFuture<ListBackupsResponse> listBackupsAsync(ListBackupsRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listBackups);
    }

    /**
     * 查询SQLServer可用字符集
     * 查询SQLServer可用字符集
     *
     * @param ListCollationsRequest 请求对象
     * @return CompletableFuture<ListCollationsResponse>
     */
    public CompletableFuture<ListCollationsResponse> listCollationsAsync(ListCollationsRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listCollations);
    }

    /**
     * 获取参数模板列表
     * 获取参数模板列表，包括所有数据库的默认参数模板和用户创建的参数模板。
     *
     * @param ListConfigurationsRequest 请求对象
     * @return CompletableFuture<ListConfigurationsResponse>
     */
    public CompletableFuture<ListConfigurationsResponse> listConfigurationsAsync(ListConfigurationsRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listConfigurations);
    }

    /**
     * 查询数据库引擎的版本
     * 查询数据库引擎的版本。
     *
     * @param ListDatastoresRequest 请求对象
     * @return CompletableFuture<ListDatastoresResponse>
     */
    public CompletableFuture<ListDatastoresResponse> listDatastoresAsync(ListDatastoresRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listDatastores);
    }

    /**
     * 查询数据库错误日志
     * 查询数据库错误日志。
     *
     * @param ListErrorLogsRequest 请求对象
     * @return CompletableFuture<ListErrorLogsResponse>
     */
    public CompletableFuture<ListErrorLogsResponse> listErrorLogsAsync(ListErrorLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listErrorLogs);
    }

    /**
     * 查询数据库规格
     * 查询数据库规格。
     *
     * @param ListFlavorsRequest 请求对象
     * @return CompletableFuture<ListFlavorsResponse>
     */
    public CompletableFuture<ListFlavorsResponse> listFlavorsAsync(ListFlavorsRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listFlavors);
    }

    /**
     * 查询数据库实例列表
     * 查询数据库实例列表。
     *
     * @param ListInstancesRequest 请求对象
     * @return CompletableFuture<ListInstancesResponse>
     */
    public CompletableFuture<ListInstancesResponse> listInstancesAsync(ListInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listInstances);
    }

    /**
     * 获取任务信息
     * 获取任务信息。
     *
     * @param ListJobInfoRequest 请求对象
     * @return CompletableFuture<ListJobInfoResponse>
     */
    public CompletableFuture<ListJobInfoResponse> listJobInfoAsync(ListJobInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listJobInfo);
    }

    /**
     * 获取所有任务详细信息
     * 获取所有任务详细信息。
     *
     * @param ListJobInfoDetailRequest 请求对象
     * @return CompletableFuture<ListJobInfoDetailResponse>
     */
    public CompletableFuture<ListJobInfoDetailResponse> listJobInfoDetailAsync(ListJobInfoDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listJobInfoDetail);
    }

    /**
     * 获取跨区域备份列表
     * 获取跨区域备份列表。
     *
     * @param ListOffSiteBackupsRequest 请求对象
     * @return CompletableFuture<ListOffSiteBackupsResponse>
     */
    public CompletableFuture<ListOffSiteBackupsResponse> listOffSiteBackupsAsync(ListOffSiteBackupsRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listOffSiteBackups);
    }

    /**
     * 查询跨区域备份实例列表
     * 查询跨区域备份实例列表。
     *
     * @param ListOffSiteInstancesRequest 请求对象
     * @return CompletableFuture<ListOffSiteInstancesResponse>
     */
    public CompletableFuture<ListOffSiteInstancesResponse> listOffSiteInstancesAsync(ListOffSiteInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listOffSiteInstances);
    }

    /**
     * 查询跨区域可恢复时间段
     * 查询跨区域可恢复时间段。 如果您备份策略中的保存天数设置较长，建议您传入查询日期“date”。
     *
     * @param ListOffSiteRestoreTimesRequest 请求对象
     * @return CompletableFuture<ListOffSiteRestoreTimesResponse>
     */
    public CompletableFuture<ListOffSiteRestoreTimesResponse> listOffSiteRestoreTimesAsync(ListOffSiteRestoreTimesRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listOffSiteRestoreTimes);
    }

    /**
     * 查询项目标签
     * 查询项目标签。
     *
     * @param ListProjectTagsRequest 请求对象
     * @return CompletableFuture<ListProjectTagsResponse>
     */
    public CompletableFuture<ListProjectTagsResponse> listProjectTagsAsync(ListProjectTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listProjectTags);
    }

    /**
     * 查询可恢复时间段
     * 查询可恢复时间段。 如果您备份策略中的保存天数设置较长，建议您传入查询日期“date”。
     *
     * @param ListRestoreTimesRequest 请求对象
     * @return CompletableFuture<ListRestoreTimesResponse>
     */
    public CompletableFuture<ListRestoreTimesResponse> listRestoreTimesAsync(ListRestoreTimesRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listRestoreTimes);
    }

    /**
     * 查询数据库慢日志
     * 查询数据库慢日志。
     *
     * @param ListSlowLogsRequest 请求对象
     * @return CompletableFuture<ListSlowLogsResponse>
     */
    public CompletableFuture<ListSlowLogsResponse> listSlowLogsAsync(ListSlowLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listSlowLogs);
    }

    /**
     * 获取慢日志统计信息
     * 获取慢日志统计信息
     *
     * @param ListSlowlogStatisticsRequest 请求对象
     * @return CompletableFuture<ListSlowlogStatisticsResponse>
     */
    public CompletableFuture<ListSlowlogStatisticsResponse> listSlowlogStatisticsAsync(ListSlowlogStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listSlowlogStatistics);
    }

    /**
     * 查询数据库磁盘类型
     * 查询数据库磁盘类型。
     *
     * @param ListStorageTypesRequest 请求对象
     * @return CompletableFuture<ListStorageTypesResponse>
     */
    public CompletableFuture<ListStorageTypesResponse> listStorageTypesAsync(ListStorageTypesRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listStorageTypes);
    }

    /**
     * 迁移主备实例的备机
     * 迁移主备实例的备机
     *
     * @param MigrateFollowerRequest 请求对象
     * @return CompletableFuture<MigrateFollowerResponse>
     */
    public CompletableFuture<MigrateFollowerResponse> migrateFollowerAsync(MigrateFollowerRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.migrateFollower);
    }

    /**
     * 修改参数模板参数
     * 修改参数模板参数。
     *
     * @param ModifyConfigurationRequest 请求对象
     * @return CompletableFuture<ModifyConfigurationResponse>
     */
    public CompletableFuture<ModifyConfigurationResponse> modifyConfigurationAsync(ModifyConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.modifyConfiguration);
    }

    /**
     * 修改指定实例的参数
     * 修改指定实例的参数。
     *
     * @param ModifyInstanceConfigurationRequest 请求对象
     * @return CompletableFuture<ModifyInstanceConfigurationResponse>
     */
    public CompletableFuture<ModifyInstanceConfigurationResponse> modifyInstanceConfigurationAsync(ModifyInstanceConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.modifyInstanceConfiguration);
    }

    /**
     * 重置数据库密码
     * 重置数据库密码.
     *
     * @param ResetPwdRequest 请求对象
     * @return CompletableFuture<ResetPwdResponse>
     */
    public CompletableFuture<ResetPwdResponse> resetPwdAsync(ResetPwdRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.resetPwd);
    }

    /**
     * 表级时间点恢复
     * 表级时间点恢复。
     *
     * @param RestoreTablesRequest 请求对象
     * @return CompletableFuture<RestoreTablesResponse>
     */
    public CompletableFuture<RestoreTablesResponse> restoreTablesAsync(RestoreTablesRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.restoreTables);
    }

    /**
     * 恢复到已有实例
     * 恢复到已有实例。
     *
     * @param RestoreToExistingInstanceRequest 请求对象
     * @return CompletableFuture<RestoreToExistingInstanceResponse>
     */
    public CompletableFuture<RestoreToExistingInstanceResponse> restoreToExistingInstanceAsync(RestoreToExistingInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.restoreToExistingInstance);
    }

    /**
     * 设置审计日志策略
     * 设置审计日志策略。
     *
     * @param SetAuditlogPolicyRequest 请求对象
     * @return CompletableFuture<SetAuditlogPolicyResponse>
     */
    public CompletableFuture<SetAuditlogPolicyResponse> setAuditlogPolicyAsync(SetAuditlogPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.setAuditlogPolicy);
    }

    /**
     * 设置自动备份策略
     * 设置自动备份策略。
     *
     * @param SetBackupPolicyRequest 请求对象
     * @return CompletableFuture<SetBackupPolicyResponse>
     */
    public CompletableFuture<SetBackupPolicyResponse> setBackupPolicyAsync(SetBackupPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.setBackupPolicy);
    }

    /**
     * 设置跨区域备份策略
     * 设置跨区域备份策略。
     *
     * @param SetOffSiteBackupPolicyRequest 请求对象
     * @return CompletableFuture<SetOffSiteBackupPolicyResponse>
     */
    public CompletableFuture<SetOffSiteBackupPolicyResponse> setOffSiteBackupPolicyAsync(SetOffSiteBackupPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.setOffSiteBackupPolicy);
    }

    /**
     * 修改安全组
     * 修改安全组
     *
     * @param SetSecurityGroupRequest 请求对象
     * @return CompletableFuture<SetSecurityGroupResponse>
     */
    public CompletableFuture<SetSecurityGroupResponse> setSecurityGroupAsync(SetSecurityGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.setSecurityGroup);
    }

    /**
     * 生成审计日志下载链接
     * 生成审计日志下载链接。
     *
     * @param ShowAuditlogDownloadLinkRequest 请求对象
     * @return CompletableFuture<ShowAuditlogDownloadLinkResponse>
     */
    public CompletableFuture<ShowAuditlogDownloadLinkResponse> showAuditlogDownloadLinkAsync(ShowAuditlogDownloadLinkRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.showAuditlogDownloadLink);
    }

    /**
     * 查询审计日志策略
     * 查询审计日志策略。
     *
     * @param ShowAuditlogPolicyRequest 请求对象
     * @return CompletableFuture<ShowAuditlogPolicyResponse>
     */
    public CompletableFuture<ShowAuditlogPolicyResponse> showAuditlogPolicyAsync(ShowAuditlogPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.showAuditlogPolicy);
    }

    /**
     * 获取备份下载链接
     * 获取备份下载链接。
     *
     * @param ShowBackupDownloadLinkRequest 请求对象
     * @return CompletableFuture<ShowBackupDownloadLinkResponse>
     */
    public CompletableFuture<ShowBackupDownloadLinkResponse> showBackupDownloadLinkAsync(ShowBackupDownloadLinkRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.showBackupDownloadLink);
    }

    /**
     * 查询自动备份策略
     * 查询自动备份策略。
     *
     * @param ShowBackupPolicyRequest 请求对象
     * @return CompletableFuture<ShowBackupPolicyResponse>
     */
    public CompletableFuture<ShowBackupPolicyResponse> showBackupPolicyAsync(ShowBackupPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.showBackupPolicy);
    }

    /**
     * 获取指定参数模板的参数
     * 获取指定参数模板的参数。
     *
     * @param ShowConfigurationRequest 请求对象
     * @return CompletableFuture<ShowConfigurationResponse>
     */
    public CompletableFuture<ShowConfigurationResponse> showConfigurationAsync(ShowConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.showConfiguration);
    }

    /**
     * 获取指定实例的参数模板
     * 获取指定实例的参数模板。
     *
     * @param ShowInstanceConfigurationRequest 请求对象
     * @return CompletableFuture<ShowInstanceConfigurationResponse>
     */
    public CompletableFuture<ShowInstanceConfigurationResponse> showInstanceConfigurationAsync(ShowInstanceConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.showInstanceConfiguration);
    }

    /**
     * 查询跨区域备份策略
     * 查询跨区域备份策略。
     *
     * @param ShowOffSiteBackupPolicyRequest 请求对象
     * @return CompletableFuture<ShowOffSiteBackupPolicyResponse>
     */
    public CompletableFuture<ShowOffSiteBackupPolicyResponse> showOffSiteBackupPolicyAsync(ShowOffSiteBackupPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.showOffSiteBackupPolicy);
    }

    /**
     * 手动倒换主备实例
     * 手动倒换主备.
     *
     * @param StartFailoverRequest 请求对象
     * @return CompletableFuture<StartFailoverResponse>
     */
    public CompletableFuture<StartFailoverResponse> startFailoverAsync(StartFailoverRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.startFailover);
    }

    /**
     * 变更实例规格/扩容实例磁盘/重启实例/单机转主备
     * 变更实例规格/扩容实例磁盘/重启实例/单机转主备。
     *
     * @param StartInstanceActionRequest 请求对象
     * @return CompletableFuture<StartInstanceActionResponse>
     */
    public CompletableFuture<StartInstanceActionResponse> startInstanceActionAsync(StartInstanceActionRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.startInstanceAction);
    }

    /**
     * SSL开关
     * SSL开关
     *
     * @param SwitchSslRequest 请求对象
     * @return CompletableFuture<SwitchSslResponse>
     */
    public CompletableFuture<SwitchSslResponse> switchSslAsync(SwitchSslRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.switchSsl);
    }

    /**
     * 修改内网地址
     * 修改内网地址
     *
     * @param UpdateDataIpRequest 请求对象
     * @return CompletableFuture<UpdateDataIpResponse>
     */
    public CompletableFuture<UpdateDataIpResponse> updateDataIpAsync(UpdateDataIpRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.updateDataIp);
    }

    /**
     * 修改数据库端口
     * 修改数据库端口
     *
     * @param UpdatePortRequest 请求对象
     * @return CompletableFuture<UpdatePortResponse>
     */
    public CompletableFuture<UpdatePortResponse> updatePortAsync(UpdatePortRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.updatePort);
    }

    /**
     * 授权数据库帐号
     * 授权数据库帐号。
     *
     * @param AllowDbUserPrivilegeRequest 请求对象
     * @return CompletableFuture<AllowDbUserPrivilegeResponse>
     */
    public CompletableFuture<AllowDbUserPrivilegeResponse> allowDbUserPrivilegeAsync(AllowDbUserPrivilegeRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.allowDbUserPrivilege);
    }

    /**
     * 创建数据库
     * 创建数据库。
     *
     * @param CreateDatabaseRequest 请求对象
     * @return CompletableFuture<CreateDatabaseResponse>
     */
    public CompletableFuture<CreateDatabaseResponse> createDatabaseAsync(CreateDatabaseRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.createDatabase);
    }

    /**
     * 创建数据库用户
     * 创建数据库用户。
     *
     * @param CreateDbUserRequest 请求对象
     * @return CompletableFuture<CreateDbUserResponse>
     */
    public CompletableFuture<CreateDbUserResponse> createDbUserAsync(CreateDbUserRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.createDbUser);
    }

    /**
     * 删除数据库
     * 删除数据库。
     *
     * @param DeleteDatabaseRequest 请求对象
     * @return CompletableFuture<DeleteDatabaseResponse>
     */
    public CompletableFuture<DeleteDatabaseResponse> deleteDatabaseAsync(DeleteDatabaseRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.deleteDatabase);
    }

    /**
     * 删除数据库用户
     * 删除数据库用户。
     *
     * @param DeleteDbUserRequest 请求对象
     * @return CompletableFuture<DeleteDbUserResponse>
     */
    public CompletableFuture<DeleteDbUserResponse> deleteDbUserAsync(DeleteDbUserRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.deleteDbUser);
    }

    /**
     * 查询指定用户的已授权数据库
     * 查询指定用户的已授权数据库。
     *
     * @param ListAuthorizedDatabasesRequest 请求对象
     * @return CompletableFuture<ListAuthorizedDatabasesResponse>
     */
    public CompletableFuture<ListAuthorizedDatabasesResponse> listAuthorizedDatabasesAsync(ListAuthorizedDatabasesRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listAuthorizedDatabases);
    }

    /**
     * 查询指定数据库的已授权用户
     * 查询指定数据库的已授权用户。
     *
     * @param ListAuthorizedDbUsersRequest 请求对象
     * @return CompletableFuture<ListAuthorizedDbUsersResponse>
     */
    public CompletableFuture<ListAuthorizedDbUsersResponse> listAuthorizedDbUsersAsync(ListAuthorizedDbUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listAuthorizedDbUsers);
    }

    /**
     * 查询数据库列表
     * 查询数据库列表。
     *
     * @param ListDatabasesRequest 请求对象
     * @return CompletableFuture<ListDatabasesResponse>
     */
    public CompletableFuture<ListDatabasesResponse> listDatabasesAsync(ListDatabasesRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listDatabases);
    }

    /**
     * 查询数据库用户列表
     * 查询数据库用户列表。
     *
     * @param ListDbUsersRequest 请求对象
     * @return CompletableFuture<ListDbUsersResponse>
     */
    public CompletableFuture<ListDbUsersResponse> listDbUsersAsync(ListDbUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listDbUsers);
    }

    /**
     * 解除数据库帐号权限
     * 解除数据库帐号权限。
     *
     * @param RevokeRequest 请求对象
     * @return CompletableFuture<RevokeResponse>
     */
    public CompletableFuture<RevokeResponse> revokeAsync(RevokeRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.revoke);
    }

    /**
     * 设置数据库账号密码
     * 设置数据库账号密码
     *
     * @param SetDbUserPwdRequest 请求对象
     * @return CompletableFuture<SetDbUserPwdResponse>
     */
    public CompletableFuture<SetDbUserPwdResponse> setDbUserPwdAsync(SetDbUserPwdRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.setDbUserPwd);
    }

}