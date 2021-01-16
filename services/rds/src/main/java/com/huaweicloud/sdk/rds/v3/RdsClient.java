package com.huaweicloud.sdk.rds.v3;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
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
     * 设置数据库账号密码
     * 设置数据库账号密码
     *
     * @param SetDbUserPwdRequest 请求对象
     * @return SetDbUserPwdResponse
     */
    public SetDbUserPwdResponse setDbUserPwd(SetDbUserPwdRequest request) {
        return hcClient.syncInvokeHttp(request, RdsMeta.setDbUserPwd);
    }

}