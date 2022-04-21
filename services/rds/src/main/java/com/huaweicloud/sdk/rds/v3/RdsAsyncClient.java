package com.huaweicloud.sdk.rds.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.rds.v3.model.*;

import java.util.concurrent.CompletableFuture;

public class RdsAsyncClient {

    protected HcClient hcClient;

    public RdsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<RdsAsyncClient> newBuilder() {
        return new ClientBuilder<>(RdsAsyncClient::new);
    }

    /**
     * 应用参数模板
     *
     * 应用参数模板。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ApplyConfigurationAsyncRequest 请求对象
     * @return CompletableFuture<ApplyConfigurationAsyncResponse>
     */
    public CompletableFuture<ApplyConfigurationAsyncResponse> applyConfigurationAsyncAsync(
        ApplyConfigurationAsyncRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.applyConfigurationAsync);
    }

    /**
     * 应用参数模板
     *
     * 应用参数模板。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ApplyConfigurationAsyncRequest 请求对象
     * @return AsyncInvoker<ApplyConfigurationAsyncRequest, ApplyConfigurationAsyncResponse>
     */
    public AsyncInvoker<ApplyConfigurationAsyncRequest, ApplyConfigurationAsyncResponse> applyConfigurationAsyncAsyncInvoker(
        ApplyConfigurationAsyncRequest request) {
        return new AsyncInvoker<ApplyConfigurationAsyncRequest, ApplyConfigurationAsyncResponse>(request,
            RdsMeta.applyConfigurationAsync, hcClient);
    }

    /**
     * 绑定和解绑弹性公网IP
     *
     * 绑定和解绑弹性公网IP。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param AttachEipRequest 请求对象
     * @return CompletableFuture<AttachEipResponse>
     */
    public CompletableFuture<AttachEipResponse> attachEipAsync(AttachEipRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.attachEip);
    }

    /**
     * 绑定和解绑弹性公网IP
     *
     * 绑定和解绑弹性公网IP。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param AttachEipRequest 请求对象
     * @return AsyncInvoker<AttachEipRequest, AttachEipResponse>
     */
    public AsyncInvoker<AttachEipRequest, AttachEipResponse> attachEipAsyncInvoker(AttachEipRequest request) {
        return new AsyncInvoker<AttachEipRequest, AttachEipResponse>(request, RdsMeta.attachEip, hcClient);
    }

    /**
     * 批量添加标签
     *
     * 批量添加标签。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchTagAddActionRequest 请求对象
     * @return CompletableFuture<BatchTagAddActionResponse>
     */
    public CompletableFuture<BatchTagAddActionResponse> batchTagAddActionAsync(BatchTagAddActionRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.batchTagAddAction);
    }

    /**
     * 批量添加标签
     *
     * 批量添加标签。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchTagAddActionRequest 请求对象
     * @return AsyncInvoker<BatchTagAddActionRequest, BatchTagAddActionResponse>
     */
    public AsyncInvoker<BatchTagAddActionRequest, BatchTagAddActionResponse> batchTagAddActionAsyncInvoker(
        BatchTagAddActionRequest request) {
        return new AsyncInvoker<BatchTagAddActionRequest, BatchTagAddActionResponse>(request, RdsMeta.batchTagAddAction,
            hcClient);
    }

    /**
     * 批量删除标签
     *
     * 批量删除标签。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchTagDelActionRequest 请求对象
     * @return CompletableFuture<BatchTagDelActionResponse>
     */
    public CompletableFuture<BatchTagDelActionResponse> batchTagDelActionAsync(BatchTagDelActionRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.batchTagDelAction);
    }

    /**
     * 批量删除标签
     *
     * 批量删除标签。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchTagDelActionRequest 请求对象
     * @return AsyncInvoker<BatchTagDelActionRequest, BatchTagDelActionResponse>
     */
    public AsyncInvoker<BatchTagDelActionRequest, BatchTagDelActionResponse> batchTagDelActionAsyncInvoker(
        BatchTagDelActionRequest request) {
        return new AsyncInvoker<BatchTagDelActionRequest, BatchTagDelActionResponse>(request, RdsMeta.batchTagDelAction,
            hcClient);
    }

    /**
     * 更改主备实例的数据同步方式
     *
     * 更改主备实例的数据同步方式。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ChangeFailoverModeRequest 请求对象
     * @return CompletableFuture<ChangeFailoverModeResponse>
     */
    public CompletableFuture<ChangeFailoverModeResponse> changeFailoverModeAsync(ChangeFailoverModeRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.changeFailoverMode);
    }

    /**
     * 更改主备实例的数据同步方式
     *
     * 更改主备实例的数据同步方式。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ChangeFailoverModeRequest 请求对象
     * @return AsyncInvoker<ChangeFailoverModeRequest, ChangeFailoverModeResponse>
     */
    public AsyncInvoker<ChangeFailoverModeRequest, ChangeFailoverModeResponse> changeFailoverModeAsyncInvoker(
        ChangeFailoverModeRequest request) {
        return new AsyncInvoker<ChangeFailoverModeRequest, ChangeFailoverModeResponse>(request,
            RdsMeta.changeFailoverMode, hcClient);
    }

    /**
     * 切换主备实例的倒换策略
     *
     * 切换主备实例的倒换策略.
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ChangeFailoverStrategyRequest 请求对象
     * @return CompletableFuture<ChangeFailoverStrategyResponse>
     */
    public CompletableFuture<ChangeFailoverStrategyResponse> changeFailoverStrategyAsync(
        ChangeFailoverStrategyRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.changeFailoverStrategy);
    }

    /**
     * 切换主备实例的倒换策略
     *
     * 切换主备实例的倒换策略.
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ChangeFailoverStrategyRequest 请求对象
     * @return AsyncInvoker<ChangeFailoverStrategyRequest, ChangeFailoverStrategyResponse>
     */
    public AsyncInvoker<ChangeFailoverStrategyRequest, ChangeFailoverStrategyResponse> changeFailoverStrategyAsyncInvoker(
        ChangeFailoverStrategyRequest request) {
        return new AsyncInvoker<ChangeFailoverStrategyRequest, ChangeFailoverStrategyResponse>(request,
            RdsMeta.changeFailoverStrategy, hcClient);
    }

    /**
     * 设置可维护时间段
     *
     * 设置可维护时间段
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ChangeOpsWindowRequest 请求对象
     * @return CompletableFuture<ChangeOpsWindowResponse>
     */
    public CompletableFuture<ChangeOpsWindowResponse> changeOpsWindowAsync(ChangeOpsWindowRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.changeOpsWindow);
    }

    /**
     * 设置可维护时间段
     *
     * 设置可维护时间段
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ChangeOpsWindowRequest 请求对象
     * @return AsyncInvoker<ChangeOpsWindowRequest, ChangeOpsWindowResponse>
     */
    public AsyncInvoker<ChangeOpsWindowRequest, ChangeOpsWindowResponse> changeOpsWindowAsyncInvoker(
        ChangeOpsWindowRequest request) {
        return new AsyncInvoker<ChangeOpsWindowRequest, ChangeOpsWindowResponse>(request, RdsMeta.changeOpsWindow,
            hcClient);
    }

    /**
     * 创建参数模板
     *
     * 创建参数模板。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateConfigurationRequest 请求对象
     * @return CompletableFuture<CreateConfigurationResponse>
     */
    public CompletableFuture<CreateConfigurationResponse> createConfigurationAsync(CreateConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.createConfiguration);
    }

    /**
     * 创建参数模板
     *
     * 创建参数模板。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateConfigurationRequest 请求对象
     * @return AsyncInvoker<CreateConfigurationRequest, CreateConfigurationResponse>
     */
    public AsyncInvoker<CreateConfigurationRequest, CreateConfigurationResponse> createConfigurationAsyncInvoker(
        CreateConfigurationRequest request) {
        return new AsyncInvoker<CreateConfigurationRequest, CreateConfigurationResponse>(request,
            RdsMeta.createConfiguration, hcClient);
    }

    /**
     * 申请域名
     *
     * 申请域名
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateDnsNameRequest 请求对象
     * @return CompletableFuture<CreateDnsNameResponse>
     */
    public CompletableFuture<CreateDnsNameResponse> createDnsNameAsync(CreateDnsNameRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.createDnsName);
    }

    /**
     * 申请域名
     *
     * 申请域名
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateDnsNameRequest 请求对象
     * @return AsyncInvoker<CreateDnsNameRequest, CreateDnsNameResponse>
     */
    public AsyncInvoker<CreateDnsNameRequest, CreateDnsNameResponse> createDnsNameAsyncInvoker(
        CreateDnsNameRequest request) {
        return new AsyncInvoker<CreateDnsNameRequest, CreateDnsNameResponse>(request, RdsMeta.createDnsName, hcClient);
    }

    /**
     * 创建数据库实例
     *
     * 创建数据库实例。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateInstanceRequest 请求对象
     * @return CompletableFuture<CreateInstanceResponse>
     */
    public CompletableFuture<CreateInstanceResponse> createInstanceAsync(CreateInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.createInstance);
    }

    /**
     * 创建数据库实例
     *
     * 创建数据库实例。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateInstanceRequest 请求对象
     * @return AsyncInvoker<CreateInstanceRequest, CreateInstanceResponse>
     */
    public AsyncInvoker<CreateInstanceRequest, CreateInstanceResponse> createInstanceAsyncInvoker(
        CreateInstanceRequest request) {
        return new AsyncInvoker<CreateInstanceRequest, CreateInstanceResponse>(request, RdsMeta.createInstance,
            hcClient);
    }

    /**
     * 创建手动备份
     *
     * 创建手动备份。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateManualBackupRequest 请求对象
     * @return CompletableFuture<CreateManualBackupResponse>
     */
    public CompletableFuture<CreateManualBackupResponse> createManualBackupAsync(CreateManualBackupRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.createManualBackup);
    }

    /**
     * 创建手动备份
     *
     * 创建手动备份。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateManualBackupRequest 请求对象
     * @return AsyncInvoker<CreateManualBackupRequest, CreateManualBackupResponse>
     */
    public AsyncInvoker<CreateManualBackupRequest, CreateManualBackupResponse> createManualBackupAsyncInvoker(
        CreateManualBackupRequest request) {
        return new AsyncInvoker<CreateManualBackupRequest, CreateManualBackupResponse>(request,
            RdsMeta.createManualBackup, hcClient);
    }

    /**
     * 恢复到新实例
     *
     * 恢复到新实例。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateRestoreInstanceRequest 请求对象
     * @return CompletableFuture<CreateRestoreInstanceResponse>
     */
    public CompletableFuture<CreateRestoreInstanceResponse> createRestoreInstanceAsync(
        CreateRestoreInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.createRestoreInstance);
    }

    /**
     * 恢复到新实例
     *
     * 恢复到新实例。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateRestoreInstanceRequest 请求对象
     * @return AsyncInvoker<CreateRestoreInstanceRequest, CreateRestoreInstanceResponse>
     */
    public AsyncInvoker<CreateRestoreInstanceRequest, CreateRestoreInstanceResponse> createRestoreInstanceAsyncInvoker(
        CreateRestoreInstanceRequest request) {
        return new AsyncInvoker<CreateRestoreInstanceRequest, CreateRestoreInstanceResponse>(request,
            RdsMeta.createRestoreInstance, hcClient);
    }

    /**
     * 删除参数模板
     *
     * 删除参数模板。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteConfigurationRequest 请求对象
     * @return CompletableFuture<DeleteConfigurationResponse>
     */
    public CompletableFuture<DeleteConfigurationResponse> deleteConfigurationAsync(DeleteConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.deleteConfiguration);
    }

    /**
     * 删除参数模板
     *
     * 删除参数模板。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteConfigurationRequest 请求对象
     * @return AsyncInvoker<DeleteConfigurationRequest, DeleteConfigurationResponse>
     */
    public AsyncInvoker<DeleteConfigurationRequest, DeleteConfigurationResponse> deleteConfigurationAsyncInvoker(
        DeleteConfigurationRequest request) {
        return new AsyncInvoker<DeleteConfigurationRequest, DeleteConfigurationResponse>(request,
            RdsMeta.deleteConfiguration, hcClient);
    }

    /**
     * 删除数据库实例
     *
     * 删除数据库实例。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteInstanceRequest 请求对象
     * @return CompletableFuture<DeleteInstanceResponse>
     */
    public CompletableFuture<DeleteInstanceResponse> deleteInstanceAsync(DeleteInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.deleteInstance);
    }

    /**
     * 删除数据库实例
     *
     * 删除数据库实例。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteInstanceRequest 请求对象
     * @return AsyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>
     */
    public AsyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstanceAsyncInvoker(
        DeleteInstanceRequest request) {
        return new AsyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>(request, RdsMeta.deleteInstance,
            hcClient);
    }

    /**
     * 删除手动备份
     *
     * 删除手动备份。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteManualBackupRequest 请求对象
     * @return CompletableFuture<DeleteManualBackupResponse>
     */
    public CompletableFuture<DeleteManualBackupResponse> deleteManualBackupAsync(DeleteManualBackupRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.deleteManualBackup);
    }

    /**
     * 删除手动备份
     *
     * 删除手动备份。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteManualBackupRequest 请求对象
     * @return AsyncInvoker<DeleteManualBackupRequest, DeleteManualBackupResponse>
     */
    public AsyncInvoker<DeleteManualBackupRequest, DeleteManualBackupResponse> deleteManualBackupAsyncInvoker(
        DeleteManualBackupRequest request) {
        return new AsyncInvoker<DeleteManualBackupRequest, DeleteManualBackupResponse>(request,
            RdsMeta.deleteManualBackup, hcClient);
    }

    /**
     * 获取慢日志下载链接
     *
     * 获取慢日志下载链接。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DownloadSlowlogRequest 请求对象
     * @return CompletableFuture<DownloadSlowlogResponse>
     */
    public CompletableFuture<DownloadSlowlogResponse> downloadSlowlogAsync(DownloadSlowlogRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.downloadSlowlog);
    }

    /**
     * 获取慢日志下载链接
     *
     * 获取慢日志下载链接。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DownloadSlowlogRequest 请求对象
     * @return AsyncInvoker<DownloadSlowlogRequest, DownloadSlowlogResponse>
     */
    public AsyncInvoker<DownloadSlowlogRequest, DownloadSlowlogResponse> downloadSlowlogAsyncInvoker(
        DownloadSlowlogRequest request) {
        return new AsyncInvoker<DownloadSlowlogRequest, DownloadSlowlogResponse>(request, RdsMeta.downloadSlowlog,
            hcClient);
    }

    /**
     * 应用参数模板
     *
     * 应用参数模板。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param EnableConfigurationRequest 请求对象
     * @return CompletableFuture<EnableConfigurationResponse>
     */
    public CompletableFuture<EnableConfigurationResponse> enableConfigurationAsync(EnableConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.enableConfiguration);
    }

    /**
     * 应用参数模板
     *
     * 应用参数模板。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param EnableConfigurationRequest 请求对象
     * @return AsyncInvoker<EnableConfigurationRequest, EnableConfigurationResponse>
     */
    public AsyncInvoker<EnableConfigurationRequest, EnableConfigurationResponse> enableConfigurationAsyncInvoker(
        EnableConfigurationRequest request) {
        return new AsyncInvoker<EnableConfigurationRequest, EnableConfigurationResponse>(request,
            RdsMeta.enableConfiguration, hcClient);
    }

    /**
     * 获取审计日志列表
     *
     * 获取审计日志列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListAuditlogsRequest 请求对象
     * @return CompletableFuture<ListAuditlogsResponse>
     */
    public CompletableFuture<ListAuditlogsResponse> listAuditlogsAsync(ListAuditlogsRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listAuditlogs);
    }

    /**
     * 获取审计日志列表
     *
     * 获取审计日志列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListAuditlogsRequest 请求对象
     * @return AsyncInvoker<ListAuditlogsRequest, ListAuditlogsResponse>
     */
    public AsyncInvoker<ListAuditlogsRequest, ListAuditlogsResponse> listAuditlogsAsyncInvoker(
        ListAuditlogsRequest request) {
        return new AsyncInvoker<ListAuditlogsRequest, ListAuditlogsResponse>(request, RdsMeta.listAuditlogs, hcClient);
    }

    /**
     * 获取备份列表
     *
     * 获取备份列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListBackupsRequest 请求对象
     * @return CompletableFuture<ListBackupsResponse>
     */
    public CompletableFuture<ListBackupsResponse> listBackupsAsync(ListBackupsRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listBackups);
    }

    /**
     * 获取备份列表
     *
     * 获取备份列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListBackupsRequest 请求对象
     * @return AsyncInvoker<ListBackupsRequest, ListBackupsResponse>
     */
    public AsyncInvoker<ListBackupsRequest, ListBackupsResponse> listBackupsAsyncInvoker(ListBackupsRequest request) {
        return new AsyncInvoker<ListBackupsRequest, ListBackupsResponse>(request, RdsMeta.listBackups, hcClient);
    }

    /**
     * 查询SQLServer可用字符集
     *
     * 查询SQLServer可用字符集
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListCollationsRequest 请求对象
     * @return CompletableFuture<ListCollationsResponse>
     */
    public CompletableFuture<ListCollationsResponse> listCollationsAsync(ListCollationsRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listCollations);
    }

    /**
     * 查询SQLServer可用字符集
     *
     * 查询SQLServer可用字符集
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListCollationsRequest 请求对象
     * @return AsyncInvoker<ListCollationsRequest, ListCollationsResponse>
     */
    public AsyncInvoker<ListCollationsRequest, ListCollationsResponse> listCollationsAsyncInvoker(
        ListCollationsRequest request) {
        return new AsyncInvoker<ListCollationsRequest, ListCollationsResponse>(request, RdsMeta.listCollations,
            hcClient);
    }

    /**
     * 获取参数模板列表
     *
     * 获取参数模板列表，包括所有数据库的默认参数模板和用户创建的参数模板。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListConfigurationsRequest 请求对象
     * @return CompletableFuture<ListConfigurationsResponse>
     */
    public CompletableFuture<ListConfigurationsResponse> listConfigurationsAsync(ListConfigurationsRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listConfigurations);
    }

    /**
     * 获取参数模板列表
     *
     * 获取参数模板列表，包括所有数据库的默认参数模板和用户创建的参数模板。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListConfigurationsRequest 请求对象
     * @return AsyncInvoker<ListConfigurationsRequest, ListConfigurationsResponse>
     */
    public AsyncInvoker<ListConfigurationsRequest, ListConfigurationsResponse> listConfigurationsAsyncInvoker(
        ListConfigurationsRequest request) {
        return new AsyncInvoker<ListConfigurationsRequest, ListConfigurationsResponse>(request,
            RdsMeta.listConfigurations, hcClient);
    }

    /**
     * 查询数据库引擎的版本
     *
     * 查询数据库引擎的版本。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListDatastoresRequest 请求对象
     * @return CompletableFuture<ListDatastoresResponse>
     */
    public CompletableFuture<ListDatastoresResponse> listDatastoresAsync(ListDatastoresRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listDatastores);
    }

    /**
     * 查询数据库引擎的版本
     *
     * 查询数据库引擎的版本。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListDatastoresRequest 请求对象
     * @return AsyncInvoker<ListDatastoresRequest, ListDatastoresResponse>
     */
    public AsyncInvoker<ListDatastoresRequest, ListDatastoresResponse> listDatastoresAsyncInvoker(
        ListDatastoresRequest request) {
        return new AsyncInvoker<ListDatastoresRequest, ListDatastoresResponse>(request, RdsMeta.listDatastores,
            hcClient);
    }

    /**
     * 查询数据库错误日志
     *
     * 查询数据库错误日志。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListErrorLogsRequest 请求对象
     * @return CompletableFuture<ListErrorLogsResponse>
     */
    public CompletableFuture<ListErrorLogsResponse> listErrorLogsAsync(ListErrorLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listErrorLogs);
    }

    /**
     * 查询数据库错误日志
     *
     * 查询数据库错误日志。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListErrorLogsRequest 请求对象
     * @return AsyncInvoker<ListErrorLogsRequest, ListErrorLogsResponse>
     */
    public AsyncInvoker<ListErrorLogsRequest, ListErrorLogsResponse> listErrorLogsAsyncInvoker(
        ListErrorLogsRequest request) {
        return new AsyncInvoker<ListErrorLogsRequest, ListErrorLogsResponse>(request, RdsMeta.listErrorLogs, hcClient);
    }

    /**
     * 查询数据库错误日志
     *
     * 查询数据库错误日志。(与原v3接口相比修改offset,符合华为云服务开放 API遵从性规范3.0)
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListErrorLogsNewRequest 请求对象
     * @return CompletableFuture<ListErrorLogsNewResponse>
     */
    public CompletableFuture<ListErrorLogsNewResponse> listErrorLogsNewAsync(ListErrorLogsNewRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listErrorLogsNew);
    }

    /**
     * 查询数据库错误日志
     *
     * 查询数据库错误日志。(与原v3接口相比修改offset,符合华为云服务开放 API遵从性规范3.0)
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListErrorLogsNewRequest 请求对象
     * @return AsyncInvoker<ListErrorLogsNewRequest, ListErrorLogsNewResponse>
     */
    public AsyncInvoker<ListErrorLogsNewRequest, ListErrorLogsNewResponse> listErrorLogsNewAsyncInvoker(
        ListErrorLogsNewRequest request) {
        return new AsyncInvoker<ListErrorLogsNewRequest, ListErrorLogsNewResponse>(request, RdsMeta.listErrorLogsNew,
            hcClient);
    }

    /**
     * 查询数据库规格
     *
     * 查询数据库规格。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListFlavorsRequest 请求对象
     * @return CompletableFuture<ListFlavorsResponse>
     */
    public CompletableFuture<ListFlavorsResponse> listFlavorsAsync(ListFlavorsRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listFlavors);
    }

    /**
     * 查询数据库规格
     *
     * 查询数据库规格。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListFlavorsRequest 请求对象
     * @return AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse>
     */
    public AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse> listFlavorsAsyncInvoker(ListFlavorsRequest request) {
        return new AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse>(request, RdsMeta.listFlavors, hcClient);
    }

    /**
     * 查询数据库实例列表
     *
     * 查询数据库实例列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListInstancesRequest 请求对象
     * @return CompletableFuture<ListInstancesResponse>
     */
    public CompletableFuture<ListInstancesResponse> listInstancesAsync(ListInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listInstances);
    }

    /**
     * 查询数据库实例列表
     *
     * 查询数据库实例列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListInstancesRequest 请求对象
     * @return AsyncInvoker<ListInstancesRequest, ListInstancesResponse>
     */
    public AsyncInvoker<ListInstancesRequest, ListInstancesResponse> listInstancesAsyncInvoker(
        ListInstancesRequest request) {
        return new AsyncInvoker<ListInstancesRequest, ListInstancesResponse>(request, RdsMeta.listInstances, hcClient);
    }

    /**
     * 获取指定ID的任务信息
     *
     * 获取指定ID的任务信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListJobInfoRequest 请求对象
     * @return CompletableFuture<ListJobInfoResponse>
     */
    public CompletableFuture<ListJobInfoResponse> listJobInfoAsync(ListJobInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listJobInfo);
    }

    /**
     * 获取指定ID的任务信息
     *
     * 获取指定ID的任务信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListJobInfoRequest 请求对象
     * @return AsyncInvoker<ListJobInfoRequest, ListJobInfoResponse>
     */
    public AsyncInvoker<ListJobInfoRequest, ListJobInfoResponse> listJobInfoAsyncInvoker(ListJobInfoRequest request) {
        return new AsyncInvoker<ListJobInfoRequest, ListJobInfoResponse>(request, RdsMeta.listJobInfo, hcClient);
    }

    /**
     * 获取指定实例和时间范围的任务信息（SQL Server）
     *
     * 获取指定实例和时间范围的任务信息（SQL Server）。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListJobInfoDetailRequest 请求对象
     * @return CompletableFuture<ListJobInfoDetailResponse>
     */
    public CompletableFuture<ListJobInfoDetailResponse> listJobInfoDetailAsync(ListJobInfoDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listJobInfoDetail);
    }

    /**
     * 获取指定实例和时间范围的任务信息（SQL Server）
     *
     * 获取指定实例和时间范围的任务信息（SQL Server）。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListJobInfoDetailRequest 请求对象
     * @return AsyncInvoker<ListJobInfoDetailRequest, ListJobInfoDetailResponse>
     */
    public AsyncInvoker<ListJobInfoDetailRequest, ListJobInfoDetailResponse> listJobInfoDetailAsyncInvoker(
        ListJobInfoDetailRequest request) {
        return new AsyncInvoker<ListJobInfoDetailRequest, ListJobInfoDetailResponse>(request, RdsMeta.listJobInfoDetail,
            hcClient);
    }

    /**
     * 查询跨区域备份列表
     *
     * 查询跨区域备份列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListOffSiteBackupsRequest 请求对象
     * @return CompletableFuture<ListOffSiteBackupsResponse>
     */
    public CompletableFuture<ListOffSiteBackupsResponse> listOffSiteBackupsAsync(ListOffSiteBackupsRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listOffSiteBackups);
    }

    /**
     * 查询跨区域备份列表
     *
     * 查询跨区域备份列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListOffSiteBackupsRequest 请求对象
     * @return AsyncInvoker<ListOffSiteBackupsRequest, ListOffSiteBackupsResponse>
     */
    public AsyncInvoker<ListOffSiteBackupsRequest, ListOffSiteBackupsResponse> listOffSiteBackupsAsyncInvoker(
        ListOffSiteBackupsRequest request) {
        return new AsyncInvoker<ListOffSiteBackupsRequest, ListOffSiteBackupsResponse>(request,
            RdsMeta.listOffSiteBackups, hcClient);
    }

    /**
     * 查询跨区域备份实例列表
     *
     * 查询跨区域备份实例列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListOffSiteInstancesRequest 请求对象
     * @return CompletableFuture<ListOffSiteInstancesResponse>
     */
    public CompletableFuture<ListOffSiteInstancesResponse> listOffSiteInstancesAsync(
        ListOffSiteInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listOffSiteInstances);
    }

    /**
     * 查询跨区域备份实例列表
     *
     * 查询跨区域备份实例列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListOffSiteInstancesRequest 请求对象
     * @return AsyncInvoker<ListOffSiteInstancesRequest, ListOffSiteInstancesResponse>
     */
    public AsyncInvoker<ListOffSiteInstancesRequest, ListOffSiteInstancesResponse> listOffSiteInstancesAsyncInvoker(
        ListOffSiteInstancesRequest request) {
        return new AsyncInvoker<ListOffSiteInstancesRequest, ListOffSiteInstancesResponse>(request,
            RdsMeta.listOffSiteInstances, hcClient);
    }

    /**
     * 查询跨区域备份可恢复时间段
     *
     * 查询跨区域备份可恢复时间段。
     * 如果您备份策略中的保存天数设置较长，建议您传入查询日期“date”。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListOffSiteRestoreTimesRequest 请求对象
     * @return CompletableFuture<ListOffSiteRestoreTimesResponse>
     */
    public CompletableFuture<ListOffSiteRestoreTimesResponse> listOffSiteRestoreTimesAsync(
        ListOffSiteRestoreTimesRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listOffSiteRestoreTimes);
    }

    /**
     * 查询跨区域备份可恢复时间段
     *
     * 查询跨区域备份可恢复时间段。
     * 如果您备份策略中的保存天数设置较长，建议您传入查询日期“date”。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListOffSiteRestoreTimesRequest 请求对象
     * @return AsyncInvoker<ListOffSiteRestoreTimesRequest, ListOffSiteRestoreTimesResponse>
     */
    public AsyncInvoker<ListOffSiteRestoreTimesRequest, ListOffSiteRestoreTimesResponse> listOffSiteRestoreTimesAsyncInvoker(
        ListOffSiteRestoreTimesRequest request) {
        return new AsyncInvoker<ListOffSiteRestoreTimesRequest, ListOffSiteRestoreTimesResponse>(request,
            RdsMeta.listOffSiteRestoreTimes, hcClient);
    }

    /**
     * 查询项目标签
     *
     * 查询项目标签。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListProjectTagsRequest 请求对象
     * @return CompletableFuture<ListProjectTagsResponse>
     */
    public CompletableFuture<ListProjectTagsResponse> listProjectTagsAsync(ListProjectTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listProjectTags);
    }

    /**
     * 查询项目标签
     *
     * 查询项目标签。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListProjectTagsRequest 请求对象
     * @return AsyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse>
     */
    public AsyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse> listProjectTagsAsyncInvoker(
        ListProjectTagsRequest request) {
        return new AsyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse>(request, RdsMeta.listProjectTags,
            hcClient);
    }

    /**
     * 查询可恢复时间段
     *
     * 查询可恢复时间段。
     * 如果您备份策略中的保存天数设置较长，建议您传入查询日期“date”。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListRestoreTimesRequest 请求对象
     * @return CompletableFuture<ListRestoreTimesResponse>
     */
    public CompletableFuture<ListRestoreTimesResponse> listRestoreTimesAsync(ListRestoreTimesRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listRestoreTimes);
    }

    /**
     * 查询可恢复时间段
     *
     * 查询可恢复时间段。
     * 如果您备份策略中的保存天数设置较长，建议您传入查询日期“date”。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListRestoreTimesRequest 请求对象
     * @return AsyncInvoker<ListRestoreTimesRequest, ListRestoreTimesResponse>
     */
    public AsyncInvoker<ListRestoreTimesRequest, ListRestoreTimesResponse> listRestoreTimesAsyncInvoker(
        ListRestoreTimesRequest request) {
        return new AsyncInvoker<ListRestoreTimesRequest, ListRestoreTimesResponse>(request, RdsMeta.listRestoreTimes,
            hcClient);
    }

    /**
     * 查询慢日志文件列表
     *
     * 查询慢日志文件列表。
     * 调用该接口取到慢日志文件名后，可以调用接口/v3/{project_id}/instances/{instance_id}/slowlog-download 获取慢日志文件下载链接
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListSlowLogFileRequest 请求对象
     * @return CompletableFuture<ListSlowLogFileResponse>
     */
    public CompletableFuture<ListSlowLogFileResponse> listSlowLogFileAsync(ListSlowLogFileRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listSlowLogFile);
    }

    /**
     * 查询慢日志文件列表
     *
     * 查询慢日志文件列表。
     * 调用该接口取到慢日志文件名后，可以调用接口/v3/{project_id}/instances/{instance_id}/slowlog-download 获取慢日志文件下载链接
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListSlowLogFileRequest 请求对象
     * @return AsyncInvoker<ListSlowLogFileRequest, ListSlowLogFileResponse>
     */
    public AsyncInvoker<ListSlowLogFileRequest, ListSlowLogFileResponse> listSlowLogFileAsyncInvoker(
        ListSlowLogFileRequest request) {
        return new AsyncInvoker<ListSlowLogFileRequest, ListSlowLogFileResponse>(request, RdsMeta.listSlowLogFile,
            hcClient);
    }

    /**
     * 查询数据库慢日志
     *
     * 查询数据库慢日志。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListSlowLogsRequest 请求对象
     * @return CompletableFuture<ListSlowLogsResponse>
     */
    public CompletableFuture<ListSlowLogsResponse> listSlowLogsAsync(ListSlowLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listSlowLogs);
    }

    /**
     * 查询数据库慢日志
     *
     * 查询数据库慢日志。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListSlowLogsRequest 请求对象
     * @return AsyncInvoker<ListSlowLogsRequest, ListSlowLogsResponse>
     */
    public AsyncInvoker<ListSlowLogsRequest, ListSlowLogsResponse> listSlowLogsAsyncInvoker(
        ListSlowLogsRequest request) {
        return new AsyncInvoker<ListSlowLogsRequest, ListSlowLogsResponse>(request, RdsMeta.listSlowLogs, hcClient);
    }

    /**
     * 查询数据库慢日志
     *
     * 查询数据库慢日志。(与原v3接口相比修改offset,符合华为云服务开放 API遵从性规范3.0)
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListSlowLogsNewRequest 请求对象
     * @return CompletableFuture<ListSlowLogsNewResponse>
     */
    public CompletableFuture<ListSlowLogsNewResponse> listSlowLogsNewAsync(ListSlowLogsNewRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listSlowLogsNew);
    }

    /**
     * 查询数据库慢日志
     *
     * 查询数据库慢日志。(与原v3接口相比修改offset,符合华为云服务开放 API遵从性规范3.0)
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListSlowLogsNewRequest 请求对象
     * @return AsyncInvoker<ListSlowLogsNewRequest, ListSlowLogsNewResponse>
     */
    public AsyncInvoker<ListSlowLogsNewRequest, ListSlowLogsNewResponse> listSlowLogsNewAsyncInvoker(
        ListSlowLogsNewRequest request) {
        return new AsyncInvoker<ListSlowLogsNewRequest, ListSlowLogsNewResponse>(request, RdsMeta.listSlowLogsNew,
            hcClient);
    }

    /**
     * 获取慢日志统计信息
     *
     * 获取慢日志统计信息
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListSlowlogStatisticsRequest 请求对象
     * @return CompletableFuture<ListSlowlogStatisticsResponse>
     */
    public CompletableFuture<ListSlowlogStatisticsResponse> listSlowlogStatisticsAsync(
        ListSlowlogStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listSlowlogStatistics);
    }

    /**
     * 获取慢日志统计信息
     *
     * 获取慢日志统计信息
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListSlowlogStatisticsRequest 请求对象
     * @return AsyncInvoker<ListSlowlogStatisticsRequest, ListSlowlogStatisticsResponse>
     */
    public AsyncInvoker<ListSlowlogStatisticsRequest, ListSlowlogStatisticsResponse> listSlowlogStatisticsAsyncInvoker(
        ListSlowlogStatisticsRequest request) {
        return new AsyncInvoker<ListSlowlogStatisticsRequest, ListSlowlogStatisticsResponse>(request,
            RdsMeta.listSlowlogStatistics, hcClient);
    }

    /**
     * 查询数据库磁盘类型
     *
     * 查询数据库磁盘类型。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListStorageTypesRequest 请求对象
     * @return CompletableFuture<ListStorageTypesResponse>
     */
    public CompletableFuture<ListStorageTypesResponse> listStorageTypesAsync(ListStorageTypesRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listStorageTypes);
    }

    /**
     * 查询数据库磁盘类型
     *
     * 查询数据库磁盘类型。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListStorageTypesRequest 请求对象
     * @return AsyncInvoker<ListStorageTypesRequest, ListStorageTypesResponse>
     */
    public AsyncInvoker<ListStorageTypesRequest, ListStorageTypesResponse> listStorageTypesAsyncInvoker(
        ListStorageTypesRequest request) {
        return new AsyncInvoker<ListStorageTypesRequest, ListStorageTypesResponse>(request, RdsMeta.listStorageTypes,
            hcClient);
    }

    /**
     * 迁移主备实例的备机
     *
     * 迁移主备实例的备机
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param MigrateFollowerRequest 请求对象
     * @return CompletableFuture<MigrateFollowerResponse>
     */
    public CompletableFuture<MigrateFollowerResponse> migrateFollowerAsync(MigrateFollowerRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.migrateFollower);
    }

    /**
     * 迁移主备实例的备机
     *
     * 迁移主备实例的备机
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param MigrateFollowerRequest 请求对象
     * @return AsyncInvoker<MigrateFollowerRequest, MigrateFollowerResponse>
     */
    public AsyncInvoker<MigrateFollowerRequest, MigrateFollowerResponse> migrateFollowerAsyncInvoker(
        MigrateFollowerRequest request) {
        return new AsyncInvoker<MigrateFollowerRequest, MigrateFollowerResponse>(request, RdsMeta.migrateFollower,
            hcClient);
    }

    /**
     * 恢复到已有实例
     *
     * 恢复到已有实例。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RestoreExistInstanceRequest 请求对象
     * @return CompletableFuture<RestoreExistInstanceResponse>
     */
    public CompletableFuture<RestoreExistInstanceResponse> restoreExistInstanceAsync(
        RestoreExistInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.restoreExistInstance);
    }

    /**
     * 恢复到已有实例
     *
     * 恢复到已有实例。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RestoreExistInstanceRequest 请求对象
     * @return AsyncInvoker<RestoreExistInstanceRequest, RestoreExistInstanceResponse>
     */
    public AsyncInvoker<RestoreExistInstanceRequest, RestoreExistInstanceResponse> restoreExistInstanceAsyncInvoker(
        RestoreExistInstanceRequest request) {
        return new AsyncInvoker<RestoreExistInstanceRequest, RestoreExistInstanceResponse>(request,
            RdsMeta.restoreExistInstance, hcClient);
    }

    /**
     * 表级时间点恢复(MySQL)
     *
     * 表级时间点恢复(MySQL)。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RestoreTablesRequest 请求对象
     * @return CompletableFuture<RestoreTablesResponse>
     */
    public CompletableFuture<RestoreTablesResponse> restoreTablesAsync(RestoreTablesRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.restoreTables);
    }

    /**
     * 表级时间点恢复(MySQL)
     *
     * 表级时间点恢复(MySQL)。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RestoreTablesRequest 请求对象
     * @return AsyncInvoker<RestoreTablesRequest, RestoreTablesResponse>
     */
    public AsyncInvoker<RestoreTablesRequest, RestoreTablesResponse> restoreTablesAsyncInvoker(
        RestoreTablesRequest request) {
        return new AsyncInvoker<RestoreTablesRequest, RestoreTablesResponse>(request, RdsMeta.restoreTables, hcClient);
    }

    /**
     * 恢复到已有实例
     *
     * 恢复到已有实例。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RestoreToExistingInstanceRequest 请求对象
     * @return CompletableFuture<RestoreToExistingInstanceResponse>
     */
    public CompletableFuture<RestoreToExistingInstanceResponse> restoreToExistingInstanceAsync(
        RestoreToExistingInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.restoreToExistingInstance);
    }

    /**
     * 恢复到已有实例
     *
     * 恢复到已有实例。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RestoreToExistingInstanceRequest 请求对象
     * @return AsyncInvoker<RestoreToExistingInstanceRequest, RestoreToExistingInstanceResponse>
     */
    public AsyncInvoker<RestoreToExistingInstanceRequest, RestoreToExistingInstanceResponse> restoreToExistingInstanceAsyncInvoker(
        RestoreToExistingInstanceRequest request) {
        return new AsyncInvoker<RestoreToExistingInstanceRequest, RestoreToExistingInstanceResponse>(request,
            RdsMeta.restoreToExistingInstance, hcClient);
    }

    /**
     * 设置审计日志策略
     *
     * 设置审计日志策略。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SetAuditlogPolicyRequest 请求对象
     * @return CompletableFuture<SetAuditlogPolicyResponse>
     */
    public CompletableFuture<SetAuditlogPolicyResponse> setAuditlogPolicyAsync(SetAuditlogPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.setAuditlogPolicy);
    }

    /**
     * 设置审计日志策略
     *
     * 设置审计日志策略。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SetAuditlogPolicyRequest 请求对象
     * @return AsyncInvoker<SetAuditlogPolicyRequest, SetAuditlogPolicyResponse>
     */
    public AsyncInvoker<SetAuditlogPolicyRequest, SetAuditlogPolicyResponse> setAuditlogPolicyAsyncInvoker(
        SetAuditlogPolicyRequest request) {
        return new AsyncInvoker<SetAuditlogPolicyRequest, SetAuditlogPolicyResponse>(request, RdsMeta.setAuditlogPolicy,
            hcClient);
    }

    /**
     * 设置自动备份策略
     *
     * 设置自动备份策略。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SetBackupPolicyRequest 请求对象
     * @return CompletableFuture<SetBackupPolicyResponse>
     */
    public CompletableFuture<SetBackupPolicyResponse> setBackupPolicyAsync(SetBackupPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.setBackupPolicy);
    }

    /**
     * 设置自动备份策略
     *
     * 设置自动备份策略。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SetBackupPolicyRequest 请求对象
     * @return AsyncInvoker<SetBackupPolicyRequest, SetBackupPolicyResponse>
     */
    public AsyncInvoker<SetBackupPolicyRequest, SetBackupPolicyResponse> setBackupPolicyAsyncInvoker(
        SetBackupPolicyRequest request) {
        return new AsyncInvoker<SetBackupPolicyRequest, SetBackupPolicyResponse>(request, RdsMeta.setBackupPolicy,
            hcClient);
    }

    /**
     * 设置binlog本地保留时长
     *
     * 修改指定实例的binlog本地保留时长。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SetBinlogClearPolicyRequest 请求对象
     * @return CompletableFuture<SetBinlogClearPolicyResponse>
     */
    public CompletableFuture<SetBinlogClearPolicyResponse> setBinlogClearPolicyAsync(
        SetBinlogClearPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.setBinlogClearPolicy);
    }

    /**
     * 设置binlog本地保留时长
     *
     * 修改指定实例的binlog本地保留时长。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SetBinlogClearPolicyRequest 请求对象
     * @return AsyncInvoker<SetBinlogClearPolicyRequest, SetBinlogClearPolicyResponse>
     */
    public AsyncInvoker<SetBinlogClearPolicyRequest, SetBinlogClearPolicyResponse> setBinlogClearPolicyAsyncInvoker(
        SetBinlogClearPolicyRequest request) {
        return new AsyncInvoker<SetBinlogClearPolicyRequest, SetBinlogClearPolicyResponse>(request,
            RdsMeta.setBinlogClearPolicy, hcClient);
    }

    /**
     * 设置跨区域备份策略
     *
     * 设置跨区域备份策略。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SetOffSiteBackupPolicyRequest 请求对象
     * @return CompletableFuture<SetOffSiteBackupPolicyResponse>
     */
    public CompletableFuture<SetOffSiteBackupPolicyResponse> setOffSiteBackupPolicyAsync(
        SetOffSiteBackupPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.setOffSiteBackupPolicy);
    }

    /**
     * 设置跨区域备份策略
     *
     * 设置跨区域备份策略。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SetOffSiteBackupPolicyRequest 请求对象
     * @return AsyncInvoker<SetOffSiteBackupPolicyRequest, SetOffSiteBackupPolicyResponse>
     */
    public AsyncInvoker<SetOffSiteBackupPolicyRequest, SetOffSiteBackupPolicyResponse> setOffSiteBackupPolicyAsyncInvoker(
        SetOffSiteBackupPolicyRequest request) {
        return new AsyncInvoker<SetOffSiteBackupPolicyRequest, SetOffSiteBackupPolicyResponse>(request,
            RdsMeta.setOffSiteBackupPolicy, hcClient);
    }

    /**
     * 修改安全组
     *
     * 修改安全组
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SetSecurityGroupRequest 请求对象
     * @return CompletableFuture<SetSecurityGroupResponse>
     */
    public CompletableFuture<SetSecurityGroupResponse> setSecurityGroupAsync(SetSecurityGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.setSecurityGroup);
    }

    /**
     * 修改安全组
     *
     * 修改安全组
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SetSecurityGroupRequest 请求对象
     * @return AsyncInvoker<SetSecurityGroupRequest, SetSecurityGroupResponse>
     */
    public AsyncInvoker<SetSecurityGroupRequest, SetSecurityGroupResponse> setSecurityGroupAsyncInvoker(
        SetSecurityGroupRequest request) {
        return new AsyncInvoker<SetSecurityGroupRequest, SetSecurityGroupResponse>(request, RdsMeta.setSecurityGroup,
            hcClient);
    }

    /**
     * 生成审计日志下载链接
     *
     * 生成审计日志下载链接。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowAuditlogDownloadLinkRequest 请求对象
     * @return CompletableFuture<ShowAuditlogDownloadLinkResponse>
     */
    public CompletableFuture<ShowAuditlogDownloadLinkResponse> showAuditlogDownloadLinkAsync(
        ShowAuditlogDownloadLinkRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.showAuditlogDownloadLink);
    }

    /**
     * 生成审计日志下载链接
     *
     * 生成审计日志下载链接。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowAuditlogDownloadLinkRequest 请求对象
     * @return AsyncInvoker<ShowAuditlogDownloadLinkRequest, ShowAuditlogDownloadLinkResponse>
     */
    public AsyncInvoker<ShowAuditlogDownloadLinkRequest, ShowAuditlogDownloadLinkResponse> showAuditlogDownloadLinkAsyncInvoker(
        ShowAuditlogDownloadLinkRequest request) {
        return new AsyncInvoker<ShowAuditlogDownloadLinkRequest, ShowAuditlogDownloadLinkResponse>(request,
            RdsMeta.showAuditlogDownloadLink, hcClient);
    }

    /**
     * 查询审计日志策略
     *
     * 查询审计日志策略。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowAuditlogPolicyRequest 请求对象
     * @return CompletableFuture<ShowAuditlogPolicyResponse>
     */
    public CompletableFuture<ShowAuditlogPolicyResponse> showAuditlogPolicyAsync(ShowAuditlogPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.showAuditlogPolicy);
    }

    /**
     * 查询审计日志策略
     *
     * 查询审计日志策略。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowAuditlogPolicyRequest 请求对象
     * @return AsyncInvoker<ShowAuditlogPolicyRequest, ShowAuditlogPolicyResponse>
     */
    public AsyncInvoker<ShowAuditlogPolicyRequest, ShowAuditlogPolicyResponse> showAuditlogPolicyAsyncInvoker(
        ShowAuditlogPolicyRequest request) {
        return new AsyncInvoker<ShowAuditlogPolicyRequest, ShowAuditlogPolicyResponse>(request,
            RdsMeta.showAuditlogPolicy, hcClient);
    }

    /**
     * 获取备份下载链接
     *
     * 获取备份下载链接。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowBackupDownloadLinkRequest 请求对象
     * @return CompletableFuture<ShowBackupDownloadLinkResponse>
     */
    public CompletableFuture<ShowBackupDownloadLinkResponse> showBackupDownloadLinkAsync(
        ShowBackupDownloadLinkRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.showBackupDownloadLink);
    }

    /**
     * 获取备份下载链接
     *
     * 获取备份下载链接。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowBackupDownloadLinkRequest 请求对象
     * @return AsyncInvoker<ShowBackupDownloadLinkRequest, ShowBackupDownloadLinkResponse>
     */
    public AsyncInvoker<ShowBackupDownloadLinkRequest, ShowBackupDownloadLinkResponse> showBackupDownloadLinkAsyncInvoker(
        ShowBackupDownloadLinkRequest request) {
        return new AsyncInvoker<ShowBackupDownloadLinkRequest, ShowBackupDownloadLinkResponse>(request,
            RdsMeta.showBackupDownloadLink, hcClient);
    }

    /**
     * 查询自动备份策略
     *
     * 查询自动备份策略。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowBackupPolicyRequest 请求对象
     * @return CompletableFuture<ShowBackupPolicyResponse>
     */
    public CompletableFuture<ShowBackupPolicyResponse> showBackupPolicyAsync(ShowBackupPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.showBackupPolicy);
    }

    /**
     * 查询自动备份策略
     *
     * 查询自动备份策略。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowBackupPolicyRequest 请求对象
     * @return AsyncInvoker<ShowBackupPolicyRequest, ShowBackupPolicyResponse>
     */
    public AsyncInvoker<ShowBackupPolicyRequest, ShowBackupPolicyResponse> showBackupPolicyAsyncInvoker(
        ShowBackupPolicyRequest request) {
        return new AsyncInvoker<ShowBackupPolicyRequest, ShowBackupPolicyResponse>(request, RdsMeta.showBackupPolicy,
            hcClient);
    }

    /**
     * 获取binlog本地保留时长
     *
     * 查寻指定实例的binlog本地保留时长。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowBinlogClearPolicyRequest 请求对象
     * @return CompletableFuture<ShowBinlogClearPolicyResponse>
     */
    public CompletableFuture<ShowBinlogClearPolicyResponse> showBinlogClearPolicyAsync(
        ShowBinlogClearPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.showBinlogClearPolicy);
    }

    /**
     * 获取binlog本地保留时长
     *
     * 查寻指定实例的binlog本地保留时长。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowBinlogClearPolicyRequest 请求对象
     * @return AsyncInvoker<ShowBinlogClearPolicyRequest, ShowBinlogClearPolicyResponse>
     */
    public AsyncInvoker<ShowBinlogClearPolicyRequest, ShowBinlogClearPolicyResponse> showBinlogClearPolicyAsyncInvoker(
        ShowBinlogClearPolicyRequest request) {
        return new AsyncInvoker<ShowBinlogClearPolicyRequest, ShowBinlogClearPolicyResponse>(request,
            RdsMeta.showBinlogClearPolicy, hcClient);
    }

    /**
     * 获取指定参数模板的参数
     *
     * 获取指定参数模板的参数。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowConfigurationRequest 请求对象
     * @return CompletableFuture<ShowConfigurationResponse>
     */
    public CompletableFuture<ShowConfigurationResponse> showConfigurationAsync(ShowConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.showConfiguration);
    }

    /**
     * 获取指定参数模板的参数
     *
     * 获取指定参数模板的参数。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowConfigurationRequest 请求对象
     * @return AsyncInvoker<ShowConfigurationRequest, ShowConfigurationResponse>
     */
    public AsyncInvoker<ShowConfigurationRequest, ShowConfigurationResponse> showConfigurationAsyncInvoker(
        ShowConfigurationRequest request) {
        return new AsyncInvoker<ShowConfigurationRequest, ShowConfigurationResponse>(request, RdsMeta.showConfiguration,
            hcClient);
    }

    /**
     * 查询跨云容灾复制状态
     *
     * 建立跨云容灾关系后，查询主实例和灾备实例间的复制状态及延迟。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowDrReplicaStatusRequest 请求对象
     * @return CompletableFuture<ShowDrReplicaStatusResponse>
     */
    public CompletableFuture<ShowDrReplicaStatusResponse> showDrReplicaStatusAsync(ShowDrReplicaStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.showDrReplicaStatus);
    }

    /**
     * 查询跨云容灾复制状态
     *
     * 建立跨云容灾关系后，查询主实例和灾备实例间的复制状态及延迟。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowDrReplicaStatusRequest 请求对象
     * @return AsyncInvoker<ShowDrReplicaStatusRequest, ShowDrReplicaStatusResponse>
     */
    public AsyncInvoker<ShowDrReplicaStatusRequest, ShowDrReplicaStatusResponse> showDrReplicaStatusAsyncInvoker(
        ShowDrReplicaStatusRequest request) {
        return new AsyncInvoker<ShowDrReplicaStatusRequest, ShowDrReplicaStatusResponse>(request,
            RdsMeta.showDrReplicaStatus, hcClient);
    }

    /**
     * 获取指定实例的参数模板
     *
     * 获取指定实例的参数模板。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowInstanceConfigurationRequest 请求对象
     * @return CompletableFuture<ShowInstanceConfigurationResponse>
     */
    public CompletableFuture<ShowInstanceConfigurationResponse> showInstanceConfigurationAsync(
        ShowInstanceConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.showInstanceConfiguration);
    }

    /**
     * 获取指定实例的参数模板
     *
     * 获取指定实例的参数模板。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowInstanceConfigurationRequest 请求对象
     * @return AsyncInvoker<ShowInstanceConfigurationRequest, ShowInstanceConfigurationResponse>
     */
    public AsyncInvoker<ShowInstanceConfigurationRequest, ShowInstanceConfigurationResponse> showInstanceConfigurationAsyncInvoker(
        ShowInstanceConfigurationRequest request) {
        return new AsyncInvoker<ShowInstanceConfigurationRequest, ShowInstanceConfigurationResponse>(request,
            RdsMeta.showInstanceConfiguration, hcClient);
    }

    /**
     * 查询跨区域备份策略
     *
     * 查询跨区域备份策略。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowOffSiteBackupPolicyRequest 请求对象
     * @return CompletableFuture<ShowOffSiteBackupPolicyResponse>
     */
    public CompletableFuture<ShowOffSiteBackupPolicyResponse> showOffSiteBackupPolicyAsync(
        ShowOffSiteBackupPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.showOffSiteBackupPolicy);
    }

    /**
     * 查询跨区域备份策略
     *
     * 查询跨区域备份策略。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowOffSiteBackupPolicyRequest 请求对象
     * @return AsyncInvoker<ShowOffSiteBackupPolicyRequest, ShowOffSiteBackupPolicyResponse>
     */
    public AsyncInvoker<ShowOffSiteBackupPolicyRequest, ShowOffSiteBackupPolicyResponse> showOffSiteBackupPolicyAsyncInvoker(
        ShowOffSiteBackupPolicyRequest request) {
        return new AsyncInvoker<ShowOffSiteBackupPolicyRequest, ShowOffSiteBackupPolicyResponse>(request,
            RdsMeta.showOffSiteBackupPolicy, hcClient);
    }

    /**
     * 查询配额
     *
     * 查询当前项目下资源配额情况。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowQuotasRequest 请求对象
     * @return CompletableFuture<ShowQuotasResponse>
     */
    public CompletableFuture<ShowQuotasResponse> showQuotasAsync(ShowQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.showQuotas);
    }

    /**
     * 查询配额
     *
     * 查询当前项目下资源配额情况。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowQuotasRequest 请求对象
     * @return AsyncInvoker<ShowQuotasRequest, ShowQuotasResponse>
     */
    public AsyncInvoker<ShowQuotasRequest, ShowQuotasResponse> showQuotasAsyncInvoker(ShowQuotasRequest request) {
        return new AsyncInvoker<ShowQuotasRequest, ShowQuotasResponse>(request, RdsMeta.showQuotas, hcClient);
    }

    /**
     * 手动倒换主备
     *
     * 手动倒换主备.
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StartFailoverRequest 请求对象
     * @return CompletableFuture<StartFailoverResponse>
     */
    public CompletableFuture<StartFailoverResponse> startFailoverAsync(StartFailoverRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.startFailover);
    }

    /**
     * 手动倒换主备
     *
     * 手动倒换主备.
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StartFailoverRequest 请求对象
     * @return AsyncInvoker<StartFailoverRequest, StartFailoverResponse>
     */
    public AsyncInvoker<StartFailoverRequest, StartFailoverResponse> startFailoverAsyncInvoker(
        StartFailoverRequest request) {
        return new AsyncInvoker<StartFailoverRequest, StartFailoverResponse>(request, RdsMeta.startFailover, hcClient);
    }

    /**
     * 扩容数据库实例的磁盘空间
     *
     * 扩容数据库实例的磁盘空间。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StartInstanceEnlargeVolumeActionRequest 请求对象
     * @return CompletableFuture<StartInstanceEnlargeVolumeActionResponse>
     */
    public CompletableFuture<StartInstanceEnlargeVolumeActionResponse> startInstanceEnlargeVolumeActionAsync(
        StartInstanceEnlargeVolumeActionRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.startInstanceEnlargeVolumeAction);
    }

    /**
     * 扩容数据库实例的磁盘空间
     *
     * 扩容数据库实例的磁盘空间。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StartInstanceEnlargeVolumeActionRequest 请求对象
     * @return AsyncInvoker<StartInstanceEnlargeVolumeActionRequest, StartInstanceEnlargeVolumeActionResponse>
     */
    public AsyncInvoker<StartInstanceEnlargeVolumeActionRequest, StartInstanceEnlargeVolumeActionResponse> startInstanceEnlargeVolumeActionAsyncInvoker(
        StartInstanceEnlargeVolumeActionRequest request) {
        return new AsyncInvoker<StartInstanceEnlargeVolumeActionRequest, StartInstanceEnlargeVolumeActionResponse>(
            request, RdsMeta.startInstanceEnlargeVolumeAction, hcClient);
    }

    /**
     * 重启数据库实例
     *
     * 重启数据库实例。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StartInstanceRestartActionRequest 请求对象
     * @return CompletableFuture<StartInstanceRestartActionResponse>
     */
    public CompletableFuture<StartInstanceRestartActionResponse> startInstanceRestartActionAsync(
        StartInstanceRestartActionRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.startInstanceRestartAction);
    }

    /**
     * 重启数据库实例
     *
     * 重启数据库实例。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StartInstanceRestartActionRequest 请求对象
     * @return AsyncInvoker<StartInstanceRestartActionRequest, StartInstanceRestartActionResponse>
     */
    public AsyncInvoker<StartInstanceRestartActionRequest, StartInstanceRestartActionResponse> startInstanceRestartActionAsyncInvoker(
        StartInstanceRestartActionRequest request) {
        return new AsyncInvoker<StartInstanceRestartActionRequest, StartInstanceRestartActionResponse>(request,
            RdsMeta.startInstanceRestartAction, hcClient);
    }

    /**
     * 单机转主备实例
     *
     * 单机转主备实例。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StartInstanceSingleToHaActionRequest 请求对象
     * @return CompletableFuture<StartInstanceSingleToHaActionResponse>
     */
    public CompletableFuture<StartInstanceSingleToHaActionResponse> startInstanceSingleToHaActionAsync(
        StartInstanceSingleToHaActionRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.startInstanceSingleToHaAction);
    }

    /**
     * 单机转主备实例
     *
     * 单机转主备实例。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StartInstanceSingleToHaActionRequest 请求对象
     * @return AsyncInvoker<StartInstanceSingleToHaActionRequest, StartInstanceSingleToHaActionResponse>
     */
    public AsyncInvoker<StartInstanceSingleToHaActionRequest, StartInstanceSingleToHaActionResponse> startInstanceSingleToHaActionAsyncInvoker(
        StartInstanceSingleToHaActionRequest request) {
        return new AsyncInvoker<StartInstanceSingleToHaActionRequest, StartInstanceSingleToHaActionResponse>(request,
            RdsMeta.startInstanceSingleToHaAction, hcClient);
    }

    /**
     * 设置回收站策略
     *
     * 设置回收站策略。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StartRecyclePolicyRequest 请求对象
     * @return CompletableFuture<StartRecyclePolicyResponse>
     */
    public CompletableFuture<StartRecyclePolicyResponse> startRecyclePolicyAsync(StartRecyclePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.startRecyclePolicy);
    }

    /**
     * 设置回收站策略
     *
     * 设置回收站策略。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StartRecyclePolicyRequest 请求对象
     * @return AsyncInvoker<StartRecyclePolicyRequest, StartRecyclePolicyResponse>
     */
    public AsyncInvoker<StartRecyclePolicyRequest, StartRecyclePolicyResponse> startRecyclePolicyAsyncInvoker(
        StartRecyclePolicyRequest request) {
        return new AsyncInvoker<StartRecyclePolicyRequest, StartRecyclePolicyResponse>(request,
            RdsMeta.startRecyclePolicy, hcClient);
    }

    /**
     * 变更数据库实例的规格
     *
     * 变更数据库实例的规格。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StartResizeFlavorActionRequest 请求对象
     * @return CompletableFuture<StartResizeFlavorActionResponse>
     */
    public CompletableFuture<StartResizeFlavorActionResponse> startResizeFlavorActionAsync(
        StartResizeFlavorActionRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.startResizeFlavorAction);
    }

    /**
     * 变更数据库实例的规格
     *
     * 变更数据库实例的规格。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StartResizeFlavorActionRequest 请求对象
     * @return AsyncInvoker<StartResizeFlavorActionRequest, StartResizeFlavorActionResponse>
     */
    public AsyncInvoker<StartResizeFlavorActionRequest, StartResizeFlavorActionResponse> startResizeFlavorActionAsyncInvoker(
        StartResizeFlavorActionRequest request) {
        return new AsyncInvoker<StartResizeFlavorActionRequest, StartResizeFlavorActionResponse>(request,
            RdsMeta.startResizeFlavorAction, hcClient);
    }

    /**
     * 开启实例
     *
     * 停止实例以节省费用，在停止数据库实例后，支持手动重新开启实例。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StartupInstanceRequest 请求对象
     * @return CompletableFuture<StartupInstanceResponse>
     */
    public CompletableFuture<StartupInstanceResponse> startupInstanceAsync(StartupInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.startupInstance);
    }

    /**
     * 开启实例
     *
     * 停止实例以节省费用，在停止数据库实例后，支持手动重新开启实例。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StartupInstanceRequest 请求对象
     * @return AsyncInvoker<StartupInstanceRequest, StartupInstanceResponse>
     */
    public AsyncInvoker<StartupInstanceRequest, StartupInstanceResponse> startupInstanceAsyncInvoker(
        StartupInstanceRequest request) {
        return new AsyncInvoker<StartupInstanceRequest, StartupInstanceResponse>(request, RdsMeta.startupInstance,
            hcClient);
    }

    /**
     * 停止实例
     *
     * 实例进行关机，通过暂时停止按需实例以节省费用，实例默认停止七天。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StopInstanceRequest 请求对象
     * @return CompletableFuture<StopInstanceResponse>
     */
    public CompletableFuture<StopInstanceResponse> stopInstanceAsync(StopInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.stopInstance);
    }

    /**
     * 停止实例
     *
     * 实例进行关机，通过暂时停止按需实例以节省费用，实例默认停止七天。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StopInstanceRequest 请求对象
     * @return AsyncInvoker<StopInstanceRequest, StopInstanceResponse>
     */
    public AsyncInvoker<StopInstanceRequest, StopInstanceResponse> stopInstanceAsyncInvoker(
        StopInstanceRequest request) {
        return new AsyncInvoker<StopInstanceRequest, StopInstanceResponse>(request, RdsMeta.stopInstance, hcClient);
    }

    /**
     * 设置SSL数据加密
     *
     * 设置SSL数据加密。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SwitchSslRequest 请求对象
     * @return CompletableFuture<SwitchSslResponse>
     */
    public CompletableFuture<SwitchSslResponse> switchSslAsync(SwitchSslRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.switchSsl);
    }

    /**
     * 设置SSL数据加密
     *
     * 设置SSL数据加密。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SwitchSslRequest 请求对象
     * @return AsyncInvoker<SwitchSslRequest, SwitchSslResponse>
     */
    public AsyncInvoker<SwitchSslRequest, SwitchSslResponse> switchSslAsyncInvoker(SwitchSslRequest request) {
        return new AsyncInvoker<SwitchSslRequest, SwitchSslResponse>(request, RdsMeta.switchSsl, hcClient);
    }

    /**
     * 修改参数模板参数
     *
     * 修改参数模板参数。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateConfigurationRequest 请求对象
     * @return CompletableFuture<UpdateConfigurationResponse>
     */
    public CompletableFuture<UpdateConfigurationResponse> updateConfigurationAsync(UpdateConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.updateConfiguration);
    }

    /**
     * 修改参数模板参数
     *
     * 修改参数模板参数。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateConfigurationRequest 请求对象
     * @return AsyncInvoker<UpdateConfigurationRequest, UpdateConfigurationResponse>
     */
    public AsyncInvoker<UpdateConfigurationRequest, UpdateConfigurationResponse> updateConfigurationAsyncInvoker(
        UpdateConfigurationRequest request) {
        return new AsyncInvoker<UpdateConfigurationRequest, UpdateConfigurationResponse>(request,
            RdsMeta.updateConfiguration, hcClient);
    }

    /**
     * 修改内网地址
     *
     * 修改内网地址
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateDataIpRequest 请求对象
     * @return CompletableFuture<UpdateDataIpResponse>
     */
    public CompletableFuture<UpdateDataIpResponse> updateDataIpAsync(UpdateDataIpRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.updateDataIp);
    }

    /**
     * 修改内网地址
     *
     * 修改内网地址
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateDataIpRequest 请求对象
     * @return AsyncInvoker<UpdateDataIpRequest, UpdateDataIpResponse>
     */
    public AsyncInvoker<UpdateDataIpRequest, UpdateDataIpResponse> updateDataIpAsyncInvoker(
        UpdateDataIpRequest request) {
        return new AsyncInvoker<UpdateDataIpRequest, UpdateDataIpResponse>(request, RdsMeta.updateDataIp, hcClient);
    }

    /**
     * 修改域名
     *
     * 修改域名
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateDnsNameRequest 请求对象
     * @return CompletableFuture<UpdateDnsNameResponse>
     */
    public CompletableFuture<UpdateDnsNameResponse> updateDnsNameAsync(UpdateDnsNameRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.updateDnsName);
    }

    /**
     * 修改域名
     *
     * 修改域名
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateDnsNameRequest 请求对象
     * @return AsyncInvoker<UpdateDnsNameRequest, UpdateDnsNameResponse>
     */
    public AsyncInvoker<UpdateDnsNameRequest, UpdateDnsNameResponse> updateDnsNameAsyncInvoker(
        UpdateDnsNameRequest request) {
        return new AsyncInvoker<UpdateDnsNameRequest, UpdateDnsNameResponse>(request, RdsMeta.updateDnsName, hcClient);
    }

    /**
     * 修改指定实例的参数
     *
     * 修改指定实例的参数。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateInstanceConfigurationRequest 请求对象
     * @return CompletableFuture<UpdateInstanceConfigurationResponse>
     */
    public CompletableFuture<UpdateInstanceConfigurationResponse> updateInstanceConfigurationAsync(
        UpdateInstanceConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.updateInstanceConfiguration);
    }

    /**
     * 修改指定实例的参数
     *
     * 修改指定实例的参数。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateInstanceConfigurationRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceConfigurationRequest, UpdateInstanceConfigurationResponse>
     */
    public AsyncInvoker<UpdateInstanceConfigurationRequest, UpdateInstanceConfigurationResponse> updateInstanceConfigurationAsyncInvoker(
        UpdateInstanceConfigurationRequest request) {
        return new AsyncInvoker<UpdateInstanceConfigurationRequest, UpdateInstanceConfigurationResponse>(request,
            RdsMeta.updateInstanceConfiguration, hcClient);
    }

    /**
     * 修改指定实例的参数
     *
     * 修改指定实例的参数。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateInstanceConfigurationAsyncRequest 请求对象
     * @return CompletableFuture<UpdateInstanceConfigurationAsyncResponse>
     */
    public CompletableFuture<UpdateInstanceConfigurationAsyncResponse> updateInstanceConfigurationAsyncAsync(
        UpdateInstanceConfigurationAsyncRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.updateInstanceConfigurationAsync);
    }

    /**
     * 修改指定实例的参数
     *
     * 修改指定实例的参数。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateInstanceConfigurationAsyncRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceConfigurationAsyncRequest, UpdateInstanceConfigurationAsyncResponse>
     */
    public AsyncInvoker<UpdateInstanceConfigurationAsyncRequest, UpdateInstanceConfigurationAsyncResponse> updateInstanceConfigurationAsyncAsyncInvoker(
        UpdateInstanceConfigurationAsyncRequest request) {
        return new AsyncInvoker<UpdateInstanceConfigurationAsyncRequest, UpdateInstanceConfigurationAsyncResponse>(
            request, RdsMeta.updateInstanceConfigurationAsync, hcClient);
    }

    /**
     * 修改实例名称
     *
     * 修改实例名称。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateInstanceNameRequest 请求对象
     * @return CompletableFuture<UpdateInstanceNameResponse>
     */
    public CompletableFuture<UpdateInstanceNameResponse> updateInstanceNameAsync(UpdateInstanceNameRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.updateInstanceName);
    }

    /**
     * 修改实例名称
     *
     * 修改实例名称。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateInstanceNameRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceNameRequest, UpdateInstanceNameResponse>
     */
    public AsyncInvoker<UpdateInstanceNameRequest, UpdateInstanceNameResponse> updateInstanceNameAsyncInvoker(
        UpdateInstanceNameRequest request) {
        return new AsyncInvoker<UpdateInstanceNameRequest, UpdateInstanceNameResponse>(request,
            RdsMeta.updateInstanceName, hcClient);
    }

    /**
     * 修改数据库端口
     *
     * 修改数据库端口
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdatePortRequest 请求对象
     * @return CompletableFuture<UpdatePortResponse>
     */
    public CompletableFuture<UpdatePortResponse> updatePortAsync(UpdatePortRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.updatePort);
    }

    /**
     * 修改数据库端口
     *
     * 修改数据库端口
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdatePortRequest 请求对象
     * @return AsyncInvoker<UpdatePortRequest, UpdatePortResponse>
     */
    public AsyncInvoker<UpdatePortRequest, UpdatePortResponse> updatePortAsyncInvoker(UpdatePortRequest request) {
        return new AsyncInvoker<UpdatePortRequest, UpdatePortResponse>(request, RdsMeta.updatePort, hcClient);
    }

    /**
     * 修改实例备注信息
     *
     * 修改指定数据库实例的备注信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdatePostgresqlInstanceAliasRequest 请求对象
     * @return CompletableFuture<UpdatePostgresqlInstanceAliasResponse>
     */
    public CompletableFuture<UpdatePostgresqlInstanceAliasResponse> updatePostgresqlInstanceAliasAsync(
        UpdatePostgresqlInstanceAliasRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.updatePostgresqlInstanceAlias);
    }

    /**
     * 修改实例备注信息
     *
     * 修改指定数据库实例的备注信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdatePostgresqlInstanceAliasRequest 请求对象
     * @return AsyncInvoker<UpdatePostgresqlInstanceAliasRequest, UpdatePostgresqlInstanceAliasResponse>
     */
    public AsyncInvoker<UpdatePostgresqlInstanceAliasRequest, UpdatePostgresqlInstanceAliasResponse> updatePostgresqlInstanceAliasAsyncInvoker(
        UpdatePostgresqlInstanceAliasRequest request) {
        return new AsyncInvoker<UpdatePostgresqlInstanceAliasRequest, UpdatePostgresqlInstanceAliasResponse>(request,
            RdsMeta.updatePostgresqlInstanceAlias, hcClient);
    }

    /**
     * 升级内核小版本
     *
     * 对实例进行小版本升级。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpgradeDbVersionRequest 请求对象
     * @return CompletableFuture<UpgradeDbVersionResponse>
     */
    public CompletableFuture<UpgradeDbVersionResponse> upgradeDbVersionAsync(UpgradeDbVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.upgradeDbVersion);
    }

    /**
     * 升级内核小版本
     *
     * 对实例进行小版本升级。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpgradeDbVersionRequest 请求对象
     * @return AsyncInvoker<UpgradeDbVersionRequest, UpgradeDbVersionResponse>
     */
    public AsyncInvoker<UpgradeDbVersionRequest, UpgradeDbVersionResponse> upgradeDbVersionAsyncInvoker(
        UpgradeDbVersionRequest request) {
        return new AsyncInvoker<UpgradeDbVersionRequest, UpgradeDbVersionResponse>(request, RdsMeta.upgradeDbVersion,
            hcClient);
    }

    /**
     * 查询API版本列表
     *
     * 查询API版本列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListApiVersionRequest 请求对象
     * @return CompletableFuture<ListApiVersionResponse>
     */
    public CompletableFuture<ListApiVersionResponse> listApiVersionAsync(ListApiVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listApiVersion);
    }

    /**
     * 查询API版本列表
     *
     * 查询API版本列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListApiVersionRequest 请求对象
     * @return AsyncInvoker<ListApiVersionRequest, ListApiVersionResponse>
     */
    public AsyncInvoker<ListApiVersionRequest, ListApiVersionResponse> listApiVersionAsyncInvoker(
        ListApiVersionRequest request) {
        return new AsyncInvoker<ListApiVersionRequest, ListApiVersionResponse>(request, RdsMeta.listApiVersion,
            hcClient);
    }

    /**
     * 查询API版本列表
     *
     * 查询API版本列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListApiVersionNewRequest 请求对象
     * @return CompletableFuture<ListApiVersionNewResponse>
     */
    public CompletableFuture<ListApiVersionNewResponse> listApiVersionNewAsync(ListApiVersionNewRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listApiVersionNew);
    }

    /**
     * 查询API版本列表
     *
     * 查询API版本列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListApiVersionNewRequest 请求对象
     * @return AsyncInvoker<ListApiVersionNewRequest, ListApiVersionNewResponse>
     */
    public AsyncInvoker<ListApiVersionNewRequest, ListApiVersionNewResponse> listApiVersionNewAsyncInvoker(
        ListApiVersionNewRequest request) {
        return new AsyncInvoker<ListApiVersionNewRequest, ListApiVersionNewResponse>(request, RdsMeta.listApiVersionNew,
            hcClient);
    }

    /**
     * 查询指定的API版本信息
     *
     * 查询指定的API版本信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowApiVersionRequest 请求对象
     * @return CompletableFuture<ShowApiVersionResponse>
     */
    public CompletableFuture<ShowApiVersionResponse> showApiVersionAsync(ShowApiVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.showApiVersion);
    }

    /**
     * 查询指定的API版本信息
     *
     * 查询指定的API版本信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowApiVersionRequest 请求对象
     * @return AsyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse>
     */
    public AsyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse> showApiVersionAsyncInvoker(
        ShowApiVersionRequest request) {
        return new AsyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse>(request, RdsMeta.showApiVersion,
            hcClient);
    }

    /**
     * 授权数据库帐号
     *
     * 授权数据库帐号。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param AllowDbUserPrivilegeRequest 请求对象
     * @return CompletableFuture<AllowDbUserPrivilegeResponse>
     */
    public CompletableFuture<AllowDbUserPrivilegeResponse> allowDbUserPrivilegeAsync(
        AllowDbUserPrivilegeRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.allowDbUserPrivilege);
    }

    /**
     * 授权数据库帐号
     *
     * 授权数据库帐号。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param AllowDbUserPrivilegeRequest 请求对象
     * @return AsyncInvoker<AllowDbUserPrivilegeRequest, AllowDbUserPrivilegeResponse>
     */
    public AsyncInvoker<AllowDbUserPrivilegeRequest, AllowDbUserPrivilegeResponse> allowDbUserPrivilegeAsyncInvoker(
        AllowDbUserPrivilegeRequest request) {
        return new AsyncInvoker<AllowDbUserPrivilegeRequest, AllowDbUserPrivilegeResponse>(request,
            RdsMeta.allowDbUserPrivilege, hcClient);
    }

    /**
     * 创建数据库
     *
     * 创建数据库。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateDatabaseRequest 请求对象
     * @return CompletableFuture<CreateDatabaseResponse>
     */
    public CompletableFuture<CreateDatabaseResponse> createDatabaseAsync(CreateDatabaseRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.createDatabase);
    }

    /**
     * 创建数据库
     *
     * 创建数据库。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateDatabaseRequest 请求对象
     * @return AsyncInvoker<CreateDatabaseRequest, CreateDatabaseResponse>
     */
    public AsyncInvoker<CreateDatabaseRequest, CreateDatabaseResponse> createDatabaseAsyncInvoker(
        CreateDatabaseRequest request) {
        return new AsyncInvoker<CreateDatabaseRequest, CreateDatabaseResponse>(request, RdsMeta.createDatabase,
            hcClient);
    }

    /**
     * 创建数据库用户
     *
     * 创建数据库用户。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateDbUserRequest 请求对象
     * @return CompletableFuture<CreateDbUserResponse>
     */
    public CompletableFuture<CreateDbUserResponse> createDbUserAsync(CreateDbUserRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.createDbUser);
    }

    /**
     * 创建数据库用户
     *
     * 创建数据库用户。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateDbUserRequest 请求对象
     * @return AsyncInvoker<CreateDbUserRequest, CreateDbUserResponse>
     */
    public AsyncInvoker<CreateDbUserRequest, CreateDbUserResponse> createDbUserAsyncInvoker(
        CreateDbUserRequest request) {
        return new AsyncInvoker<CreateDbUserRequest, CreateDbUserResponse>(request, RdsMeta.createDbUser, hcClient);
    }

    /**
     * 删除数据库
     *
     * 删除数据库。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteDatabaseRequest 请求对象
     * @return CompletableFuture<DeleteDatabaseResponse>
     */
    public CompletableFuture<DeleteDatabaseResponse> deleteDatabaseAsync(DeleteDatabaseRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.deleteDatabase);
    }

    /**
     * 删除数据库
     *
     * 删除数据库。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteDatabaseRequest 请求对象
     * @return AsyncInvoker<DeleteDatabaseRequest, DeleteDatabaseResponse>
     */
    public AsyncInvoker<DeleteDatabaseRequest, DeleteDatabaseResponse> deleteDatabaseAsyncInvoker(
        DeleteDatabaseRequest request) {
        return new AsyncInvoker<DeleteDatabaseRequest, DeleteDatabaseResponse>(request, RdsMeta.deleteDatabase,
            hcClient);
    }

    /**
     * 删除数据库用户
     *
     * 删除数据库用户。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteDbUserRequest 请求对象
     * @return CompletableFuture<DeleteDbUserResponse>
     */
    public CompletableFuture<DeleteDbUserResponse> deleteDbUserAsync(DeleteDbUserRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.deleteDbUser);
    }

    /**
     * 删除数据库用户
     *
     * 删除数据库用户。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteDbUserRequest 请求对象
     * @return AsyncInvoker<DeleteDbUserRequest, DeleteDbUserResponse>
     */
    public AsyncInvoker<DeleteDbUserRequest, DeleteDbUserResponse> deleteDbUserAsyncInvoker(
        DeleteDbUserRequest request) {
        return new AsyncInvoker<DeleteDbUserRequest, DeleteDbUserResponse>(request, RdsMeta.deleteDbUser, hcClient);
    }

    /**
     * 查询指定用户的已授权数据库
     *
     * 查询指定用户的已授权数据库。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListAuthorizedDatabasesRequest 请求对象
     * @return CompletableFuture<ListAuthorizedDatabasesResponse>
     */
    public CompletableFuture<ListAuthorizedDatabasesResponse> listAuthorizedDatabasesAsync(
        ListAuthorizedDatabasesRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listAuthorizedDatabases);
    }

    /**
     * 查询指定用户的已授权数据库
     *
     * 查询指定用户的已授权数据库。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListAuthorizedDatabasesRequest 请求对象
     * @return AsyncInvoker<ListAuthorizedDatabasesRequest, ListAuthorizedDatabasesResponse>
     */
    public AsyncInvoker<ListAuthorizedDatabasesRequest, ListAuthorizedDatabasesResponse> listAuthorizedDatabasesAsyncInvoker(
        ListAuthorizedDatabasesRequest request) {
        return new AsyncInvoker<ListAuthorizedDatabasesRequest, ListAuthorizedDatabasesResponse>(request,
            RdsMeta.listAuthorizedDatabases, hcClient);
    }

    /**
     * 查询指定数据库的已授权用户
     *
     * 查询指定数据库的已授权用户。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListAuthorizedDbUsersRequest 请求对象
     * @return CompletableFuture<ListAuthorizedDbUsersResponse>
     */
    public CompletableFuture<ListAuthorizedDbUsersResponse> listAuthorizedDbUsersAsync(
        ListAuthorizedDbUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listAuthorizedDbUsers);
    }

    /**
     * 查询指定数据库的已授权用户
     *
     * 查询指定数据库的已授权用户。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListAuthorizedDbUsersRequest 请求对象
     * @return AsyncInvoker<ListAuthorizedDbUsersRequest, ListAuthorizedDbUsersResponse>
     */
    public AsyncInvoker<ListAuthorizedDbUsersRequest, ListAuthorizedDbUsersResponse> listAuthorizedDbUsersAsyncInvoker(
        ListAuthorizedDbUsersRequest request) {
        return new AsyncInvoker<ListAuthorizedDbUsersRequest, ListAuthorizedDbUsersResponse>(request,
            RdsMeta.listAuthorizedDbUsers, hcClient);
    }

    /**
     * 查询数据库列表
     *
     * 查询数据库列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListDatabasesRequest 请求对象
     * @return CompletableFuture<ListDatabasesResponse>
     */
    public CompletableFuture<ListDatabasesResponse> listDatabasesAsync(ListDatabasesRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listDatabases);
    }

    /**
     * 查询数据库列表
     *
     * 查询数据库列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListDatabasesRequest 请求对象
     * @return AsyncInvoker<ListDatabasesRequest, ListDatabasesResponse>
     */
    public AsyncInvoker<ListDatabasesRequest, ListDatabasesResponse> listDatabasesAsyncInvoker(
        ListDatabasesRequest request) {
        return new AsyncInvoker<ListDatabasesRequest, ListDatabasesResponse>(request, RdsMeta.listDatabases, hcClient);
    }

    /**
     * 查询数据库用户列表
     *
     * 查询数据库用户列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListDbUsersRequest 请求对象
     * @return CompletableFuture<ListDbUsersResponse>
     */
    public CompletableFuture<ListDbUsersResponse> listDbUsersAsync(ListDbUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listDbUsers);
    }

    /**
     * 查询数据库用户列表
     *
     * 查询数据库用户列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListDbUsersRequest 请求对象
     * @return AsyncInvoker<ListDbUsersRequest, ListDbUsersResponse>
     */
    public AsyncInvoker<ListDbUsersRequest, ListDbUsersResponse> listDbUsersAsyncInvoker(ListDbUsersRequest request) {
        return new AsyncInvoker<ListDbUsersRequest, ListDbUsersResponse>(request, RdsMeta.listDbUsers, hcClient);
    }

    /**
     * 重置数据库密码
     *
     * 重置数据库密码.
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ResetPwdRequest 请求对象
     * @return CompletableFuture<ResetPwdResponse>
     */
    public CompletableFuture<ResetPwdResponse> resetPwdAsync(ResetPwdRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.resetPwd);
    }

    /**
     * 重置数据库密码
     *
     * 重置数据库密码.
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ResetPwdRequest 请求对象
     * @return AsyncInvoker<ResetPwdRequest, ResetPwdResponse>
     */
    public AsyncInvoker<ResetPwdRequest, ResetPwdResponse> resetPwdAsyncInvoker(ResetPwdRequest request) {
        return new AsyncInvoker<ResetPwdRequest, ResetPwdResponse>(request, RdsMeta.resetPwd, hcClient);
    }

    /**
     * 解除数据库帐号权限
     *
     * 解除数据库帐号权限。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RevokeRequest 请求对象
     * @return CompletableFuture<RevokeResponse>
     */
    public CompletableFuture<RevokeResponse> revokeAsync(RevokeRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.revoke);
    }

    /**
     * 解除数据库帐号权限
     *
     * 解除数据库帐号权限。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RevokeRequest 请求对象
     * @return AsyncInvoker<RevokeRequest, RevokeResponse>
     */
    public AsyncInvoker<RevokeRequest, RevokeResponse> revokeAsyncInvoker(RevokeRequest request) {
        return new AsyncInvoker<RevokeRequest, RevokeResponse>(request, RdsMeta.revoke, hcClient);
    }

    /**
     * 设置数据库账号密码
     *
     * 设置数据库账号密码
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SetDbUserPwdRequest 请求对象
     * @return CompletableFuture<SetDbUserPwdResponse>
     */
    public CompletableFuture<SetDbUserPwdResponse> setDbUserPwdAsync(SetDbUserPwdRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.setDbUserPwd);
    }

    /**
     * 设置数据库账号密码
     *
     * 设置数据库账号密码
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SetDbUserPwdRequest 请求对象
     * @return AsyncInvoker<SetDbUserPwdRequest, SetDbUserPwdResponse>
     */
    public AsyncInvoker<SetDbUserPwdRequest, SetDbUserPwdResponse> setDbUserPwdAsyncInvoker(
        SetDbUserPwdRequest request) {
        return new AsyncInvoker<SetDbUserPwdRequest, SetDbUserPwdResponse>(request, RdsMeta.setDbUserPwd, hcClient);
    }

    /**
     * 修改指定实例的数据库备注
     *
     * 修改指定实例中的数据库备注。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateDatabaseRequest 请求对象
     * @return CompletableFuture<UpdateDatabaseResponse>
     */
    public CompletableFuture<UpdateDatabaseResponse> updateDatabaseAsync(UpdateDatabaseRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.updateDatabase);
    }

    /**
     * 修改指定实例的数据库备注
     *
     * 修改指定实例中的数据库备注。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateDatabaseRequest 请求对象
     * @return AsyncInvoker<UpdateDatabaseRequest, UpdateDatabaseResponse>
     */
    public AsyncInvoker<UpdateDatabaseRequest, UpdateDatabaseResponse> updateDatabaseAsyncInvoker(
        UpdateDatabaseRequest request) {
        return new AsyncInvoker<UpdateDatabaseRequest, UpdateDatabaseResponse>(request, RdsMeta.updateDatabase,
            hcClient);
    }

    /**
     * 授权数据库帐号
     *
     * 在指定实例的数据库中, 设置帐号的权限。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param AllowDbPrivilegeRequest 请求对象
     * @return CompletableFuture<AllowDbPrivilegeResponse>
     */
    public CompletableFuture<AllowDbPrivilegeResponse> allowDbPrivilegeAsync(AllowDbPrivilegeRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.allowDbPrivilege);
    }

    /**
     * 授权数据库帐号
     *
     * 在指定实例的数据库中, 设置帐号的权限。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param AllowDbPrivilegeRequest 请求对象
     * @return AsyncInvoker<AllowDbPrivilegeRequest, AllowDbPrivilegeResponse>
     */
    public AsyncInvoker<AllowDbPrivilegeRequest, AllowDbPrivilegeResponse> allowDbPrivilegeAsyncInvoker(
        AllowDbPrivilegeRequest request) {
        return new AsyncInvoker<AllowDbPrivilegeRequest, AllowDbPrivilegeResponse>(request, RdsMeta.allowDbPrivilege,
            hcClient);
    }

    /**
     * 数据库代理规格变更
     *
     * 数据库代理实例进行规格变更。
     * 
     * - 调用接口前，您需要了解API 认证鉴权。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ChangeProxyScaleRequest 请求对象
     * @return CompletableFuture<ChangeProxyScaleResponse>
     */
    public CompletableFuture<ChangeProxyScaleResponse> changeProxyScaleAsync(ChangeProxyScaleRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.changeProxyScale);
    }

    /**
     * 数据库代理规格变更
     *
     * 数据库代理实例进行规格变更。
     * 
     * - 调用接口前，您需要了解API 认证鉴权。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ChangeProxyScaleRequest 请求对象
     * @return AsyncInvoker<ChangeProxyScaleRequest, ChangeProxyScaleResponse>
     */
    public AsyncInvoker<ChangeProxyScaleRequest, ChangeProxyScaleResponse> changeProxyScaleAsyncInvoker(
        ChangeProxyScaleRequest request) {
        return new AsyncInvoker<ChangeProxyScaleRequest, ChangeProxyScaleResponse>(request, RdsMeta.changeProxyScale,
            hcClient);
    }

    /**
     * 修改读写分离阈值
     *
     * 修改指定实例的读写分离延时阈值。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ChangeTheDelayThresholdRequest 请求对象
     * @return CompletableFuture<ChangeTheDelayThresholdResponse>
     */
    public CompletableFuture<ChangeTheDelayThresholdResponse> changeTheDelayThresholdAsync(
        ChangeTheDelayThresholdRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.changeTheDelayThreshold);
    }

    /**
     * 修改读写分离阈值
     *
     * 修改指定实例的读写分离延时阈值。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ChangeTheDelayThresholdRequest 请求对象
     * @return AsyncInvoker<ChangeTheDelayThresholdRequest, ChangeTheDelayThresholdResponse>
     */
    public AsyncInvoker<ChangeTheDelayThresholdRequest, ChangeTheDelayThresholdResponse> changeTheDelayThresholdAsyncInvoker(
        ChangeTheDelayThresholdRequest request) {
        return new AsyncInvoker<ChangeTheDelayThresholdRequest, ChangeTheDelayThresholdResponse>(request,
            RdsMeta.changeTheDelayThreshold, hcClient);
    }

    /**
     * 创建数据库
     *
     * 在指定实例中创建数据库。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreatePostgresqlDatabaseRequest 请求对象
     * @return CompletableFuture<CreatePostgresqlDatabaseResponse>
     */
    public CompletableFuture<CreatePostgresqlDatabaseResponse> createPostgresqlDatabaseAsync(
        CreatePostgresqlDatabaseRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.createPostgresqlDatabase);
    }

    /**
     * 创建数据库
     *
     * 在指定实例中创建数据库。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreatePostgresqlDatabaseRequest 请求对象
     * @return AsyncInvoker<CreatePostgresqlDatabaseRequest, CreatePostgresqlDatabaseResponse>
     */
    public AsyncInvoker<CreatePostgresqlDatabaseRequest, CreatePostgresqlDatabaseResponse> createPostgresqlDatabaseAsyncInvoker(
        CreatePostgresqlDatabaseRequest request) {
        return new AsyncInvoker<CreatePostgresqlDatabaseRequest, CreatePostgresqlDatabaseResponse>(request,
            RdsMeta.createPostgresqlDatabase, hcClient);
    }

    /**
     * 创建数据库SCHEMA
     *
     * 在指定实例的数据库中, 创建数据库schema。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreatePostgresqlDatabaseSchemaRequest 请求对象
     * @return CompletableFuture<CreatePostgresqlDatabaseSchemaResponse>
     */
    public CompletableFuture<CreatePostgresqlDatabaseSchemaResponse> createPostgresqlDatabaseSchemaAsync(
        CreatePostgresqlDatabaseSchemaRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.createPostgresqlDatabaseSchema);
    }

    /**
     * 创建数据库SCHEMA
     *
     * 在指定实例的数据库中, 创建数据库schema。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreatePostgresqlDatabaseSchemaRequest 请求对象
     * @return AsyncInvoker<CreatePostgresqlDatabaseSchemaRequest, CreatePostgresqlDatabaseSchemaResponse>
     */
    public AsyncInvoker<CreatePostgresqlDatabaseSchemaRequest, CreatePostgresqlDatabaseSchemaResponse> createPostgresqlDatabaseSchemaAsyncInvoker(
        CreatePostgresqlDatabaseSchemaRequest request) {
        return new AsyncInvoker<CreatePostgresqlDatabaseSchemaRequest, CreatePostgresqlDatabaseSchemaResponse>(request,
            RdsMeta.createPostgresqlDatabaseSchema, hcClient);
    }

    /**
     * 创建数据库用户
     *
     * 在指定实例中创建数据库用户。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreatePostgresqlDbUserRequest 请求对象
     * @return CompletableFuture<CreatePostgresqlDbUserResponse>
     */
    public CompletableFuture<CreatePostgresqlDbUserResponse> createPostgresqlDbUserAsync(
        CreatePostgresqlDbUserRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.createPostgresqlDbUser);
    }

    /**
     * 创建数据库用户
     *
     * 在指定实例中创建数据库用户。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreatePostgresqlDbUserRequest 请求对象
     * @return AsyncInvoker<CreatePostgresqlDbUserRequest, CreatePostgresqlDbUserResponse>
     */
    public AsyncInvoker<CreatePostgresqlDbUserRequest, CreatePostgresqlDbUserResponse> createPostgresqlDbUserAsyncInvoker(
        CreatePostgresqlDbUserRequest request) {
        return new AsyncInvoker<CreatePostgresqlDbUserRequest, CreatePostgresqlDbUserResponse>(request,
            RdsMeta.createPostgresqlDbUser, hcClient);
    }

    /**
     * 查询数据库SCHEMA列表
     *
     * 查询指定实例的数据库SCHEMA列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListPostgresqlDatabaseSchemasRequest 请求对象
     * @return CompletableFuture<ListPostgresqlDatabaseSchemasResponse>
     */
    public CompletableFuture<ListPostgresqlDatabaseSchemasResponse> listPostgresqlDatabaseSchemasAsync(
        ListPostgresqlDatabaseSchemasRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listPostgresqlDatabaseSchemas);
    }

    /**
     * 查询数据库SCHEMA列表
     *
     * 查询指定实例的数据库SCHEMA列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListPostgresqlDatabaseSchemasRequest 请求对象
     * @return AsyncInvoker<ListPostgresqlDatabaseSchemasRequest, ListPostgresqlDatabaseSchemasResponse>
     */
    public AsyncInvoker<ListPostgresqlDatabaseSchemasRequest, ListPostgresqlDatabaseSchemasResponse> listPostgresqlDatabaseSchemasAsyncInvoker(
        ListPostgresqlDatabaseSchemasRequest request) {
        return new AsyncInvoker<ListPostgresqlDatabaseSchemasRequest, ListPostgresqlDatabaseSchemasResponse>(request,
            RdsMeta.listPostgresqlDatabaseSchemas, hcClient);
    }

    /**
     * 查询数据库列表
     *
     * 查询指定实例中的数据库列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListPostgresqlDatabasesRequest 请求对象
     * @return CompletableFuture<ListPostgresqlDatabasesResponse>
     */
    public CompletableFuture<ListPostgresqlDatabasesResponse> listPostgresqlDatabasesAsync(
        ListPostgresqlDatabasesRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listPostgresqlDatabases);
    }

    /**
     * 查询数据库列表
     *
     * 查询指定实例中的数据库列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListPostgresqlDatabasesRequest 请求对象
     * @return AsyncInvoker<ListPostgresqlDatabasesRequest, ListPostgresqlDatabasesResponse>
     */
    public AsyncInvoker<ListPostgresqlDatabasesRequest, ListPostgresqlDatabasesResponse> listPostgresqlDatabasesAsyncInvoker(
        ListPostgresqlDatabasesRequest request) {
        return new AsyncInvoker<ListPostgresqlDatabasesRequest, ListPostgresqlDatabasesResponse>(request,
            RdsMeta.listPostgresqlDatabases, hcClient);
    }

    /**
     * 查询数据库用户列表
     *
     * 在指定实例中查询数据库用户列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListPostgresqlDbUserPaginatedRequest 请求对象
     * @return CompletableFuture<ListPostgresqlDbUserPaginatedResponse>
     */
    public CompletableFuture<ListPostgresqlDbUserPaginatedResponse> listPostgresqlDbUserPaginatedAsync(
        ListPostgresqlDbUserPaginatedRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listPostgresqlDbUserPaginated);
    }

    /**
     * 查询数据库用户列表
     *
     * 在指定实例中查询数据库用户列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListPostgresqlDbUserPaginatedRequest 请求对象
     * @return AsyncInvoker<ListPostgresqlDbUserPaginatedRequest, ListPostgresqlDbUserPaginatedResponse>
     */
    public AsyncInvoker<ListPostgresqlDbUserPaginatedRequest, ListPostgresqlDbUserPaginatedResponse> listPostgresqlDbUserPaginatedAsyncInvoker(
        ListPostgresqlDbUserPaginatedRequest request) {
        return new AsyncInvoker<ListPostgresqlDbUserPaginatedRequest, ListPostgresqlDbUserPaginatedResponse>(request,
            RdsMeta.listPostgresqlDbUserPaginated, hcClient);
    }

    /**
     * 查询数据库代理可变更的规格
     *
     * 查询数据库代理可变更的规格信息。
     * 
     * - 调用接口前，您需要了解API 认证鉴权。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SearchQueryScaleComputeFlavorsRequest 请求对象
     * @return CompletableFuture<SearchQueryScaleComputeFlavorsResponse>
     */
    public CompletableFuture<SearchQueryScaleComputeFlavorsResponse> searchQueryScaleComputeFlavorsAsync(
        SearchQueryScaleComputeFlavorsRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.searchQueryScaleComputeFlavors);
    }

    /**
     * 查询数据库代理可变更的规格
     *
     * 查询数据库代理可变更的规格信息。
     * 
     * - 调用接口前，您需要了解API 认证鉴权。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SearchQueryScaleComputeFlavorsRequest 请求对象
     * @return AsyncInvoker<SearchQueryScaleComputeFlavorsRequest, SearchQueryScaleComputeFlavorsResponse>
     */
    public AsyncInvoker<SearchQueryScaleComputeFlavorsRequest, SearchQueryScaleComputeFlavorsResponse> searchQueryScaleComputeFlavorsAsyncInvoker(
        SearchQueryScaleComputeFlavorsRequest request) {
        return new AsyncInvoker<SearchQueryScaleComputeFlavorsRequest, SearchQueryScaleComputeFlavorsResponse>(request,
            RdsMeta.searchQueryScaleComputeFlavors, hcClient);
    }

    /**
     * 查询数据库代理可变更的规格
     *
     * 查询数据库代理可变更的规格信息。
     * 
     * - 调用接口前，您需要了解API 认证鉴权。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SearchQueryScaleFlavorsRequest 请求对象
     * @return CompletableFuture<SearchQueryScaleFlavorsResponse>
     */
    public CompletableFuture<SearchQueryScaleFlavorsResponse> searchQueryScaleFlavorsAsync(
        SearchQueryScaleFlavorsRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.searchQueryScaleFlavors);
    }

    /**
     * 查询数据库代理可变更的规格
     *
     * 查询数据库代理可变更的规格信息。
     * 
     * - 调用接口前，您需要了解API 认证鉴权。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SearchQueryScaleFlavorsRequest 请求对象
     * @return AsyncInvoker<SearchQueryScaleFlavorsRequest, SearchQueryScaleFlavorsResponse>
     */
    public AsyncInvoker<SearchQueryScaleFlavorsRequest, SearchQueryScaleFlavorsResponse> searchQueryScaleFlavorsAsyncInvoker(
        SearchQueryScaleFlavorsRequest request) {
        return new AsyncInvoker<SearchQueryScaleFlavorsRequest, SearchQueryScaleFlavorsResponse>(request,
            RdsMeta.searchQueryScaleFlavors, hcClient);
    }

    /**
     * 重置数据库帐号密码
     *
     * 重置指定数据库帐号的密码。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SetPostgresqlDbUserPwdRequest 请求对象
     * @return CompletableFuture<SetPostgresqlDbUserPwdResponse>
     */
    public CompletableFuture<SetPostgresqlDbUserPwdResponse> setPostgresqlDbUserPwdAsync(
        SetPostgresqlDbUserPwdRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.setPostgresqlDbUserPwd);
    }

    /**
     * 重置数据库帐号密码
     *
     * 重置指定数据库帐号的密码。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SetPostgresqlDbUserPwdRequest 请求对象
     * @return AsyncInvoker<SetPostgresqlDbUserPwdRequest, SetPostgresqlDbUserPwdResponse>
     */
    public AsyncInvoker<SetPostgresqlDbUserPwdRequest, SetPostgresqlDbUserPwdResponse> setPostgresqlDbUserPwdAsyncInvoker(
        SetPostgresqlDbUserPwdRequest request) {
        return new AsyncInvoker<SetPostgresqlDbUserPwdRequest, SetPostgresqlDbUserPwdResponse>(request,
            RdsMeta.setPostgresqlDbUserPwd, hcClient);
    }

    /**
     * 查询数据库代理信息
     *
     * 查询指定实例的数据库代理详细信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowInformationAboutDatabaseProxyRequest 请求对象
     * @return CompletableFuture<ShowInformationAboutDatabaseProxyResponse>
     */
    public CompletableFuture<ShowInformationAboutDatabaseProxyResponse> showInformationAboutDatabaseProxyAsync(
        ShowInformationAboutDatabaseProxyRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.showInformationAboutDatabaseProxy);
    }

    /**
     * 查询数据库代理信息
     *
     * 查询指定实例的数据库代理详细信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowInformationAboutDatabaseProxyRequest 请求对象
     * @return AsyncInvoker<ShowInformationAboutDatabaseProxyRequest, ShowInformationAboutDatabaseProxyResponse>
     */
    public AsyncInvoker<ShowInformationAboutDatabaseProxyRequest, ShowInformationAboutDatabaseProxyResponse> showInformationAboutDatabaseProxyAsyncInvoker(
        ShowInformationAboutDatabaseProxyRequest request) {
        return new AsyncInvoker<ShowInformationAboutDatabaseProxyRequest, ShowInformationAboutDatabaseProxyResponse>(
            request, RdsMeta.showInformationAboutDatabaseProxy, hcClient);
    }

    /**
     * 开启数据库代理
     *
     * 为指定实例开启数据库代理。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StartDatabaseProxyRequest 请求对象
     * @return CompletableFuture<StartDatabaseProxyResponse>
     */
    public CompletableFuture<StartDatabaseProxyResponse> startDatabaseProxyAsync(StartDatabaseProxyRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.startDatabaseProxy);
    }

    /**
     * 开启数据库代理
     *
     * 为指定实例开启数据库代理。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StartDatabaseProxyRequest 请求对象
     * @return AsyncInvoker<StartDatabaseProxyRequest, StartDatabaseProxyResponse>
     */
    public AsyncInvoker<StartDatabaseProxyRequest, StartDatabaseProxyResponse> startDatabaseProxyAsyncInvoker(
        StartDatabaseProxyRequest request) {
        return new AsyncInvoker<StartDatabaseProxyRequest, StartDatabaseProxyResponse>(request,
            RdsMeta.startDatabaseProxy, hcClient);
    }

    /**
     * 关闭数据库代理
     *
     * 为指定实例关闭数据库代理。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StopDatabaseProxyRequest 请求对象
     * @return CompletableFuture<StopDatabaseProxyResponse>
     */
    public CompletableFuture<StopDatabaseProxyResponse> stopDatabaseProxyAsync(StopDatabaseProxyRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.stopDatabaseProxy);
    }

    /**
     * 关闭数据库代理
     *
     * 为指定实例关闭数据库代理。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param StopDatabaseProxyRequest 请求对象
     * @return AsyncInvoker<StopDatabaseProxyRequest, StopDatabaseProxyResponse>
     */
    public AsyncInvoker<StopDatabaseProxyRequest, StopDatabaseProxyResponse> stopDatabaseProxyAsyncInvoker(
        StopDatabaseProxyRequest request) {
        return new AsyncInvoker<StopDatabaseProxyRequest, StopDatabaseProxyResponse>(request, RdsMeta.stopDatabaseProxy,
            hcClient);
    }

    /**
     * 修改读写分离权重
     *
     * 修改指定实例的读写分离权重。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateReadWeightRequest 请求对象
     * @return CompletableFuture<UpdateReadWeightResponse>
     */
    public CompletableFuture<UpdateReadWeightResponse> updateReadWeightAsync(UpdateReadWeightRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.updateReadWeight);
    }

    /**
     * 修改读写分离权重
     *
     * 修改指定实例的读写分离权重。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateReadWeightRequest 请求对象
     * @return AsyncInvoker<UpdateReadWeightRequest, UpdateReadWeightResponse>
     */
    public AsyncInvoker<UpdateReadWeightRequest, UpdateReadWeightResponse> updateReadWeightAsyncInvoker(
        UpdateReadWeightRequest request) {
        return new AsyncInvoker<UpdateReadWeightRequest, UpdateReadWeightResponse>(request, RdsMeta.updateReadWeight,
            hcClient);
    }

    /**
     * 授权数据库帐号
     *
     * 授权数据库帐号。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param AllowSqlserverDbUserPrivilegeRequest 请求对象
     * @return CompletableFuture<AllowSqlserverDbUserPrivilegeResponse>
     */
    public CompletableFuture<AllowSqlserverDbUserPrivilegeResponse> allowSqlserverDbUserPrivilegeAsync(
        AllowSqlserverDbUserPrivilegeRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.allowSqlserverDbUserPrivilege);
    }

    /**
     * 授权数据库帐号
     *
     * 授权数据库帐号。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param AllowSqlserverDbUserPrivilegeRequest 请求对象
     * @return AsyncInvoker<AllowSqlserverDbUserPrivilegeRequest, AllowSqlserverDbUserPrivilegeResponse>
     */
    public AsyncInvoker<AllowSqlserverDbUserPrivilegeRequest, AllowSqlserverDbUserPrivilegeResponse> allowSqlserverDbUserPrivilegeAsyncInvoker(
        AllowSqlserverDbUserPrivilegeRequest request) {
        return new AsyncInvoker<AllowSqlserverDbUserPrivilegeRequest, AllowSqlserverDbUserPrivilegeResponse>(request,
            RdsMeta.allowSqlserverDbUserPrivilege, hcClient);
    }

    /**
     * 创建数据库
     *
     * 创建数据库。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateSqlserverDatabaseRequest 请求对象
     * @return CompletableFuture<CreateSqlserverDatabaseResponse>
     */
    public CompletableFuture<CreateSqlserverDatabaseResponse> createSqlserverDatabaseAsync(
        CreateSqlserverDatabaseRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.createSqlserverDatabase);
    }

    /**
     * 创建数据库
     *
     * 创建数据库。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateSqlserverDatabaseRequest 请求对象
     * @return AsyncInvoker<CreateSqlserverDatabaseRequest, CreateSqlserverDatabaseResponse>
     */
    public AsyncInvoker<CreateSqlserverDatabaseRequest, CreateSqlserverDatabaseResponse> createSqlserverDatabaseAsyncInvoker(
        CreateSqlserverDatabaseRequest request) {
        return new AsyncInvoker<CreateSqlserverDatabaseRequest, CreateSqlserverDatabaseResponse>(request,
            RdsMeta.createSqlserverDatabase, hcClient);
    }

    /**
     * 创建数据库用户
     *
     * 创建数据库用户。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateSqlserverDbUserRequest 请求对象
     * @return CompletableFuture<CreateSqlserverDbUserResponse>
     */
    public CompletableFuture<CreateSqlserverDbUserResponse> createSqlserverDbUserAsync(
        CreateSqlserverDbUserRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.createSqlserverDbUser);
    }

    /**
     * 创建数据库用户
     *
     * 创建数据库用户。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateSqlserverDbUserRequest 请求对象
     * @return AsyncInvoker<CreateSqlserverDbUserRequest, CreateSqlserverDbUserResponse>
     */
    public AsyncInvoker<CreateSqlserverDbUserRequest, CreateSqlserverDbUserResponse> createSqlserverDbUserAsyncInvoker(
        CreateSqlserverDbUserRequest request) {
        return new AsyncInvoker<CreateSqlserverDbUserRequest, CreateSqlserverDbUserResponse>(request,
            RdsMeta.createSqlserverDbUser, hcClient);
    }

    /**
     * 删除数据库
     *
     * 删除数据库。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteSqlserverDatabaseRequest 请求对象
     * @return CompletableFuture<DeleteSqlserverDatabaseResponse>
     */
    public CompletableFuture<DeleteSqlserverDatabaseResponse> deleteSqlserverDatabaseAsync(
        DeleteSqlserverDatabaseRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.deleteSqlserverDatabase);
    }

    /**
     * 删除数据库
     *
     * 删除数据库。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteSqlserverDatabaseRequest 请求对象
     * @return AsyncInvoker<DeleteSqlserverDatabaseRequest, DeleteSqlserverDatabaseResponse>
     */
    public AsyncInvoker<DeleteSqlserverDatabaseRequest, DeleteSqlserverDatabaseResponse> deleteSqlserverDatabaseAsyncInvoker(
        DeleteSqlserverDatabaseRequest request) {
        return new AsyncInvoker<DeleteSqlserverDatabaseRequest, DeleteSqlserverDatabaseResponse>(request,
            RdsMeta.deleteSqlserverDatabase, hcClient);
    }

    /**
     * 删除数据库
     *
     * 删除数据库。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteSqlserverDatabaseExRequest 请求对象
     * @return CompletableFuture<DeleteSqlserverDatabaseExResponse>
     */
    public CompletableFuture<DeleteSqlserverDatabaseExResponse> deleteSqlserverDatabaseExAsync(
        DeleteSqlserverDatabaseExRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.deleteSqlserverDatabaseEx);
    }

    /**
     * 删除数据库
     *
     * 删除数据库。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteSqlserverDatabaseExRequest 请求对象
     * @return AsyncInvoker<DeleteSqlserverDatabaseExRequest, DeleteSqlserverDatabaseExResponse>
     */
    public AsyncInvoker<DeleteSqlserverDatabaseExRequest, DeleteSqlserverDatabaseExResponse> deleteSqlserverDatabaseExAsyncInvoker(
        DeleteSqlserverDatabaseExRequest request) {
        return new AsyncInvoker<DeleteSqlserverDatabaseExRequest, DeleteSqlserverDatabaseExResponse>(request,
            RdsMeta.deleteSqlserverDatabaseEx, hcClient);
    }

    /**
     * 删除数据库用户
     *
     * 删除数据库用户。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteSqlserverDbUserRequest 请求对象
     * @return CompletableFuture<DeleteSqlserverDbUserResponse>
     */
    public CompletableFuture<DeleteSqlserverDbUserResponse> deleteSqlserverDbUserAsync(
        DeleteSqlserverDbUserRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.deleteSqlserverDbUser);
    }

    /**
     * 删除数据库用户
     *
     * 删除数据库用户。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteSqlserverDbUserRequest 请求对象
     * @return AsyncInvoker<DeleteSqlserverDbUserRequest, DeleteSqlserverDbUserResponse>
     */
    public AsyncInvoker<DeleteSqlserverDbUserRequest, DeleteSqlserverDbUserResponse> deleteSqlserverDbUserAsyncInvoker(
        DeleteSqlserverDbUserRequest request) {
        return new AsyncInvoker<DeleteSqlserverDbUserRequest, DeleteSqlserverDbUserResponse>(request,
            RdsMeta.deleteSqlserverDbUser, hcClient);
    }

    /**
     * 查询指定数据库的已授权用户
     *
     * 查询指定数据库的已授权用户。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListAuthorizedSqlserverDbUsersRequest 请求对象
     * @return CompletableFuture<ListAuthorizedSqlserverDbUsersResponse>
     */
    public CompletableFuture<ListAuthorizedSqlserverDbUsersResponse> listAuthorizedSqlserverDbUsersAsync(
        ListAuthorizedSqlserverDbUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listAuthorizedSqlserverDbUsers);
    }

    /**
     * 查询指定数据库的已授权用户
     *
     * 查询指定数据库的已授权用户。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListAuthorizedSqlserverDbUsersRequest 请求对象
     * @return AsyncInvoker<ListAuthorizedSqlserverDbUsersRequest, ListAuthorizedSqlserverDbUsersResponse>
     */
    public AsyncInvoker<ListAuthorizedSqlserverDbUsersRequest, ListAuthorizedSqlserverDbUsersResponse> listAuthorizedSqlserverDbUsersAsyncInvoker(
        ListAuthorizedSqlserverDbUsersRequest request) {
        return new AsyncInvoker<ListAuthorizedSqlserverDbUsersRequest, ListAuthorizedSqlserverDbUsersResponse>(request,
            RdsMeta.listAuthorizedSqlserverDbUsers, hcClient);
    }

    /**
     * 查询数据库列表
     *
     * 查询数据库列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListSqlserverDatabasesRequest 请求对象
     * @return CompletableFuture<ListSqlserverDatabasesResponse>
     */
    public CompletableFuture<ListSqlserverDatabasesResponse> listSqlserverDatabasesAsync(
        ListSqlserverDatabasesRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listSqlserverDatabases);
    }

    /**
     * 查询数据库列表
     *
     * 查询数据库列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListSqlserverDatabasesRequest 请求对象
     * @return AsyncInvoker<ListSqlserverDatabasesRequest, ListSqlserverDatabasesResponse>
     */
    public AsyncInvoker<ListSqlserverDatabasesRequest, ListSqlserverDatabasesResponse> listSqlserverDatabasesAsyncInvoker(
        ListSqlserverDatabasesRequest request) {
        return new AsyncInvoker<ListSqlserverDatabasesRequest, ListSqlserverDatabasesResponse>(request,
            RdsMeta.listSqlserverDatabases, hcClient);
    }

    /**
     * 查询数据库用户列表
     *
     * 查询数据库用户列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListSqlserverDbUsersRequest 请求对象
     * @return CompletableFuture<ListSqlserverDbUsersResponse>
     */
    public CompletableFuture<ListSqlserverDbUsersResponse> listSqlserverDbUsersAsync(
        ListSqlserverDbUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.listSqlserverDbUsers);
    }

    /**
     * 查询数据库用户列表
     *
     * 查询数据库用户列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListSqlserverDbUsersRequest 请求对象
     * @return AsyncInvoker<ListSqlserverDbUsersRequest, ListSqlserverDbUsersResponse>
     */
    public AsyncInvoker<ListSqlserverDbUsersRequest, ListSqlserverDbUsersResponse> listSqlserverDbUsersAsyncInvoker(
        ListSqlserverDbUsersRequest request) {
        return new AsyncInvoker<ListSqlserverDbUsersRequest, ListSqlserverDbUsersResponse>(request,
            RdsMeta.listSqlserverDbUsers, hcClient);
    }

    /**
     * 解除数据库帐号权限
     *
     * 解除数据库帐号权限。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RevokeSqlserverDbUserPrivilegeRequest 请求对象
     * @return CompletableFuture<RevokeSqlserverDbUserPrivilegeResponse>
     */
    public CompletableFuture<RevokeSqlserverDbUserPrivilegeResponse> revokeSqlserverDbUserPrivilegeAsync(
        RevokeSqlserverDbUserPrivilegeRequest request) {
        return hcClient.asyncInvokeHttp(request, RdsMeta.revokeSqlserverDbUserPrivilege);
    }

    /**
     * 解除数据库帐号权限
     *
     * 解除数据库帐号权限。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RevokeSqlserverDbUserPrivilegeRequest 请求对象
     * @return AsyncInvoker<RevokeSqlserverDbUserPrivilegeRequest, RevokeSqlserverDbUserPrivilegeResponse>
     */
    public AsyncInvoker<RevokeSqlserverDbUserPrivilegeRequest, RevokeSqlserverDbUserPrivilegeResponse> revokeSqlserverDbUserPrivilegeAsyncInvoker(
        RevokeSqlserverDbUserPrivilegeRequest request) {
        return new AsyncInvoker<RevokeSqlserverDbUserPrivilegeRequest, RevokeSqlserverDbUserPrivilegeResponse>(request,
            RdsMeta.revokeSqlserverDbUserPrivilege, hcClient);
    }

}
