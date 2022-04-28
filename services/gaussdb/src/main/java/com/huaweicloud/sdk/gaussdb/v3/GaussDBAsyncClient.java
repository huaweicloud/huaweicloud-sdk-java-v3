package com.huaweicloud.sdk.gaussdb.v3;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.gaussdb.v3.model.*;

public class GaussDBAsyncClient {
    protected HcClient hcClient;

    public GaussDBAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<GaussDBAsyncClient> newBuilder() {
        return new ClientBuilder<>(GaussDBAsyncClient::new);
    }


    /**
     * 批量添加或删除标签
     *
     * 批量添加或删除指定实例的标签。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchTagActionRequest 请求对象
     * @return CompletableFuture<BatchTagActionResponse>
     */
    public CompletableFuture<BatchTagActionResponse> batchTagActionAsync(BatchTagActionRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.batchTagAction);
    }

    /**
     * 批量添加或删除标签
     *
     * 批量添加或删除指定实例的标签。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchTagActionRequest 请求对象
     * @return AsyncInvoker<BatchTagActionRequest, BatchTagActionResponse>
     */
    public AsyncInvoker<BatchTagActionRequest, BatchTagActionResponse> batchTagActionAsyncInvoker(BatchTagActionRequest request) {
        return new AsyncInvoker<BatchTagActionRequest, BatchTagActionResponse>(request, GaussDBMeta.batchTagAction, hcClient);
    }

    /**
     * 变更实例规格
     *
     * 变更数据库实例的规格。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ChangeGaussMySqlInstanceSpecificationRequest 请求对象
     * @return CompletableFuture<ChangeGaussMySqlInstanceSpecificationResponse>
     */
    public CompletableFuture<ChangeGaussMySqlInstanceSpecificationResponse> changeGaussMySqlInstanceSpecificationAsync(ChangeGaussMySqlInstanceSpecificationRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.changeGaussMySqlInstanceSpecification);
    }

    /**
     * 变更实例规格
     *
     * 变更数据库实例的规格。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ChangeGaussMySqlInstanceSpecificationRequest 请求对象
     * @return AsyncInvoker<ChangeGaussMySqlInstanceSpecificationRequest, ChangeGaussMySqlInstanceSpecificationResponse>
     */
    public AsyncInvoker<ChangeGaussMySqlInstanceSpecificationRequest, ChangeGaussMySqlInstanceSpecificationResponse> changeGaussMySqlInstanceSpecificationAsyncInvoker(ChangeGaussMySqlInstanceSpecificationRequest request) {
        return new AsyncInvoker<ChangeGaussMySqlInstanceSpecificationRequest, ChangeGaussMySqlInstanceSpecificationResponse>(request, GaussDBMeta.changeGaussMySqlInstanceSpecification, hcClient);
    }

    /**
     * 创建手动备份
     *
     * 创建手动备份
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateGaussMySqlBackupRequest 请求对象
     * @return CompletableFuture<CreateGaussMySqlBackupResponse>
     */
    public CompletableFuture<CreateGaussMySqlBackupResponse> createGaussMySqlBackupAsync(CreateGaussMySqlBackupRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.createGaussMySqlBackup);
    }

    /**
     * 创建手动备份
     *
     * 创建手动备份
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateGaussMySqlBackupRequest 请求对象
     * @return AsyncInvoker<CreateGaussMySqlBackupRequest, CreateGaussMySqlBackupResponse>
     */
    public AsyncInvoker<CreateGaussMySqlBackupRequest, CreateGaussMySqlBackupResponse> createGaussMySqlBackupAsyncInvoker(CreateGaussMySqlBackupRequest request) {
        return new AsyncInvoker<CreateGaussMySqlBackupRequest, CreateGaussMySqlBackupResponse>(request, GaussDBMeta.createGaussMySqlBackup, hcClient);
    }

    /**
     * 创建数据库实例
     *
     * 创建云数据库 GaussDB(for MySQL)实例。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateGaussMySqlInstanceRequest 请求对象
     * @return CompletableFuture<CreateGaussMySqlInstanceResponse>
     */
    public CompletableFuture<CreateGaussMySqlInstanceResponse> createGaussMySqlInstanceAsync(CreateGaussMySqlInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.createGaussMySqlInstance);
    }

    /**
     * 创建数据库实例
     *
     * 创建云数据库 GaussDB(for MySQL)实例。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateGaussMySqlInstanceRequest 请求对象
     * @return AsyncInvoker<CreateGaussMySqlInstanceRequest, CreateGaussMySqlInstanceResponse>
     */
    public AsyncInvoker<CreateGaussMySqlInstanceRequest, CreateGaussMySqlInstanceResponse> createGaussMySqlInstanceAsyncInvoker(CreateGaussMySqlInstanceRequest request) {
        return new AsyncInvoker<CreateGaussMySqlInstanceRequest, CreateGaussMySqlInstanceResponse>(request, GaussDBMeta.createGaussMySqlInstance, hcClient);
    }

    /**
     * 开启数据库代理
     *
     * 开启数据库代理，只支持ELB模式。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateGaussMySqlProxyRequest 请求对象
     * @return CompletableFuture<CreateGaussMySqlProxyResponse>
     */
    public CompletableFuture<CreateGaussMySqlProxyResponse> createGaussMySqlProxyAsync(CreateGaussMySqlProxyRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.createGaussMySqlProxy);
    }

    /**
     * 开启数据库代理
     *
     * 开启数据库代理，只支持ELB模式。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateGaussMySqlProxyRequest 请求对象
     * @return AsyncInvoker<CreateGaussMySqlProxyRequest, CreateGaussMySqlProxyResponse>
     */
    public AsyncInvoker<CreateGaussMySqlProxyRequest, CreateGaussMySqlProxyResponse> createGaussMySqlProxyAsyncInvoker(CreateGaussMySqlProxyRequest request) {
        return new AsyncInvoker<CreateGaussMySqlProxyRequest, CreateGaussMySqlProxyResponse>(request, GaussDBMeta.createGaussMySqlProxy, hcClient);
    }

    /**
     * 创建只读节点
     *
     * 创建只读节点。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateGaussMySqlReadonlyNodeRequest 请求对象
     * @return CompletableFuture<CreateGaussMySqlReadonlyNodeResponse>
     */
    public CompletableFuture<CreateGaussMySqlReadonlyNodeResponse> createGaussMySqlReadonlyNodeAsync(CreateGaussMySqlReadonlyNodeRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.createGaussMySqlReadonlyNode);
    }

    /**
     * 创建只读节点
     *
     * 创建只读节点。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateGaussMySqlReadonlyNodeRequest 请求对象
     * @return AsyncInvoker<CreateGaussMySqlReadonlyNodeRequest, CreateGaussMySqlReadonlyNodeResponse>
     */
    public AsyncInvoker<CreateGaussMySqlReadonlyNodeRequest, CreateGaussMySqlReadonlyNodeResponse> createGaussMySqlReadonlyNodeAsyncInvoker(CreateGaussMySqlReadonlyNodeRequest request) {
        return new AsyncInvoker<CreateGaussMySqlReadonlyNodeRequest, CreateGaussMySqlReadonlyNodeResponse>(request, GaussDBMeta.createGaussMySqlReadonlyNode, hcClient);
    }

    /**
     * 删除实例
     *
     * 删除数据库实例，不支持删除包周期实例。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteGaussMySqlInstanceRequest 请求对象
     * @return CompletableFuture<DeleteGaussMySqlInstanceResponse>
     */
    public CompletableFuture<DeleteGaussMySqlInstanceResponse> deleteGaussMySqlInstanceAsync(DeleteGaussMySqlInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.deleteGaussMySqlInstance);
    }

    /**
     * 删除实例
     *
     * 删除数据库实例，不支持删除包周期实例。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteGaussMySqlInstanceRequest 请求对象
     * @return AsyncInvoker<DeleteGaussMySqlInstanceRequest, DeleteGaussMySqlInstanceResponse>
     */
    public AsyncInvoker<DeleteGaussMySqlInstanceRequest, DeleteGaussMySqlInstanceResponse> deleteGaussMySqlInstanceAsyncInvoker(DeleteGaussMySqlInstanceRequest request) {
        return new AsyncInvoker<DeleteGaussMySqlInstanceRequest, DeleteGaussMySqlInstanceResponse>(request, GaussDBMeta.deleteGaussMySqlInstance, hcClient);
    }

    /**
     * 关闭数据库代理
     *
     * 关闭数据库代理。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteGaussMySqlProxyRequest 请求对象
     * @return CompletableFuture<DeleteGaussMySqlProxyResponse>
     */
    public CompletableFuture<DeleteGaussMySqlProxyResponse> deleteGaussMySqlProxyAsync(DeleteGaussMySqlProxyRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.deleteGaussMySqlProxy);
    }

    /**
     * 关闭数据库代理
     *
     * 关闭数据库代理。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteGaussMySqlProxyRequest 请求对象
     * @return AsyncInvoker<DeleteGaussMySqlProxyRequest, DeleteGaussMySqlProxyResponse>
     */
    public AsyncInvoker<DeleteGaussMySqlProxyRequest, DeleteGaussMySqlProxyResponse> deleteGaussMySqlProxyAsyncInvoker(DeleteGaussMySqlProxyRequest request) {
        return new AsyncInvoker<DeleteGaussMySqlProxyRequest, DeleteGaussMySqlProxyResponse>(request, GaussDBMeta.deleteGaussMySqlProxy, hcClient);
    }

    /**
     * 删除只读节点
     *
     * 删除实例的只读节点。多可用区模式删除只读节点时，要保证删除后，剩余的只读节点和主节点在不同的可用区中，否则无法删除该只读节点。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteGaussMySqlReadonlyNodeRequest 请求对象
     * @return CompletableFuture<DeleteGaussMySqlReadonlyNodeResponse>
     */
    public CompletableFuture<DeleteGaussMySqlReadonlyNodeResponse> deleteGaussMySqlReadonlyNodeAsync(DeleteGaussMySqlReadonlyNodeRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.deleteGaussMySqlReadonlyNode);
    }

    /**
     * 删除只读节点
     *
     * 删除实例的只读节点。多可用区模式删除只读节点时，要保证删除后，剩余的只读节点和主节点在不同的可用区中，否则无法删除该只读节点。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteGaussMySqlReadonlyNodeRequest 请求对象
     * @return AsyncInvoker<DeleteGaussMySqlReadonlyNodeRequest, DeleteGaussMySqlReadonlyNodeResponse>
     */
    public AsyncInvoker<DeleteGaussMySqlReadonlyNodeRequest, DeleteGaussMySqlReadonlyNodeResponse> deleteGaussMySqlReadonlyNodeAsyncInvoker(DeleteGaussMySqlReadonlyNodeRequest request) {
        return new AsyncInvoker<DeleteGaussMySqlReadonlyNodeRequest, DeleteGaussMySqlReadonlyNodeResponse>(request, GaussDBMeta.deleteGaussMySqlReadonlyNode, hcClient);
    }

    /**
     * 包周期存储扩容
     *
     * 包周期存储扩容
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ExpandGaussMySqlInstanceVolumeRequest 请求对象
     * @return CompletableFuture<ExpandGaussMySqlInstanceVolumeResponse>
     */
    public CompletableFuture<ExpandGaussMySqlInstanceVolumeResponse> expandGaussMySqlInstanceVolumeAsync(ExpandGaussMySqlInstanceVolumeRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.expandGaussMySqlInstanceVolume);
    }

    /**
     * 包周期存储扩容
     *
     * 包周期存储扩容
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ExpandGaussMySqlInstanceVolumeRequest 请求对象
     * @return AsyncInvoker<ExpandGaussMySqlInstanceVolumeRequest, ExpandGaussMySqlInstanceVolumeResponse>
     */
    public AsyncInvoker<ExpandGaussMySqlInstanceVolumeRequest, ExpandGaussMySqlInstanceVolumeResponse> expandGaussMySqlInstanceVolumeAsyncInvoker(ExpandGaussMySqlInstanceVolumeRequest request) {
        return new AsyncInvoker<ExpandGaussMySqlInstanceVolumeRequest, ExpandGaussMySqlInstanceVolumeResponse>(request, GaussDBMeta.expandGaussMySqlInstanceVolume, hcClient);
    }

    /**
     * 扩容数据库代理节点的数量
     *
     * 扩容数据库代理节点的数量。
     * DeC专属云账号暂不支持数据库代理。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ExpandGaussMySqlProxyRequest 请求对象
     * @return CompletableFuture<ExpandGaussMySqlProxyResponse>
     */
    public CompletableFuture<ExpandGaussMySqlProxyResponse> expandGaussMySqlProxyAsync(ExpandGaussMySqlProxyRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.expandGaussMySqlProxy);
    }

    /**
     * 扩容数据库代理节点的数量
     *
     * 扩容数据库代理节点的数量。
     * DeC专属云账号暂不支持数据库代理。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ExpandGaussMySqlProxyRequest 请求对象
     * @return AsyncInvoker<ExpandGaussMySqlProxyRequest, ExpandGaussMySqlProxyResponse>
     */
    public AsyncInvoker<ExpandGaussMySqlProxyRequest, ExpandGaussMySqlProxyResponse> expandGaussMySqlProxyAsyncInvoker(ExpandGaussMySqlProxyRequest request) {
        return new AsyncInvoker<ExpandGaussMySqlProxyRequest, ExpandGaussMySqlProxyResponse>(request, GaussDBMeta.expandGaussMySqlProxy, hcClient);
    }

    /**
     * 查询参数模板
     *
     * 获取参数模板列表，包括所有数据库的默认参数模板和用户创建的参数模板。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListGaussMySqlConfigurationsRequest 请求对象
     * @return CompletableFuture<ListGaussMySqlConfigurationsResponse>
     */
    public CompletableFuture<ListGaussMySqlConfigurationsResponse> listGaussMySqlConfigurationsAsync(ListGaussMySqlConfigurationsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.listGaussMySqlConfigurations);
    }

    /**
     * 查询参数模板
     *
     * 获取参数模板列表，包括所有数据库的默认参数模板和用户创建的参数模板。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListGaussMySqlConfigurationsRequest 请求对象
     * @return AsyncInvoker<ListGaussMySqlConfigurationsRequest, ListGaussMySqlConfigurationsResponse>
     */
    public AsyncInvoker<ListGaussMySqlConfigurationsRequest, ListGaussMySqlConfigurationsResponse> listGaussMySqlConfigurationsAsyncInvoker(ListGaussMySqlConfigurationsRequest request) {
        return new AsyncInvoker<ListGaussMySqlConfigurationsRequest, ListGaussMySqlConfigurationsResponse>(request, GaussDBMeta.listGaussMySqlConfigurations, hcClient);
    }

    /**
     * 查询专属资源池列表
     *
     * 获取专属资源池列表，包括用户开通的所有专属资源池信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListGaussMySqlDedicatedResourcesRequest 请求对象
     * @return CompletableFuture<ListGaussMySqlDedicatedResourcesResponse>
     */
    public CompletableFuture<ListGaussMySqlDedicatedResourcesResponse> listGaussMySqlDedicatedResourcesAsync(ListGaussMySqlDedicatedResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.listGaussMySqlDedicatedResources);
    }

    /**
     * 查询专属资源池列表
     *
     * 获取专属资源池列表，包括用户开通的所有专属资源池信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListGaussMySqlDedicatedResourcesRequest 请求对象
     * @return AsyncInvoker<ListGaussMySqlDedicatedResourcesRequest, ListGaussMySqlDedicatedResourcesResponse>
     */
    public AsyncInvoker<ListGaussMySqlDedicatedResourcesRequest, ListGaussMySqlDedicatedResourcesResponse> listGaussMySqlDedicatedResourcesAsyncInvoker(ListGaussMySqlDedicatedResourcesRequest request) {
        return new AsyncInvoker<ListGaussMySqlDedicatedResourcesRequest, ListGaussMySqlDedicatedResourcesResponse>(request, GaussDBMeta.listGaussMySqlDedicatedResources, hcClient);
    }

    /**
     * 查询数据库错误日志
     *
     * 查询数据库错误日志。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListGaussMySqlErrorLogRequest 请求对象
     * @return CompletableFuture<ListGaussMySqlErrorLogResponse>
     */
    public CompletableFuture<ListGaussMySqlErrorLogResponse> listGaussMySqlErrorLogAsync(ListGaussMySqlErrorLogRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.listGaussMySqlErrorLog);
    }

    /**
     * 查询数据库错误日志
     *
     * 查询数据库错误日志。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListGaussMySqlErrorLogRequest 请求对象
     * @return AsyncInvoker<ListGaussMySqlErrorLogRequest, ListGaussMySqlErrorLogResponse>
     */
    public AsyncInvoker<ListGaussMySqlErrorLogRequest, ListGaussMySqlErrorLogResponse> listGaussMySqlErrorLogAsyncInvoker(ListGaussMySqlErrorLogRequest request) {
        return new AsyncInvoker<ListGaussMySqlErrorLogRequest, ListGaussMySqlErrorLogResponse>(request, GaussDBMeta.listGaussMySqlErrorLog, hcClient);
    }

    /**
     * 查询实例列表
     *
     * 根据指定条件查询实例列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListGaussMySqlInstancesRequest 请求对象
     * @return CompletableFuture<ListGaussMySqlInstancesResponse>
     */
    public CompletableFuture<ListGaussMySqlInstancesResponse> listGaussMySqlInstancesAsync(ListGaussMySqlInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.listGaussMySqlInstances);
    }

    /**
     * 查询实例列表
     *
     * 根据指定条件查询实例列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListGaussMySqlInstancesRequest 请求对象
     * @return AsyncInvoker<ListGaussMySqlInstancesRequest, ListGaussMySqlInstancesResponse>
     */
    public AsyncInvoker<ListGaussMySqlInstancesRequest, ListGaussMySqlInstancesResponse> listGaussMySqlInstancesAsyncInvoker(ListGaussMySqlInstancesRequest request) {
        return new AsyncInvoker<ListGaussMySqlInstancesRequest, ListGaussMySqlInstancesResponse>(request, GaussDBMeta.listGaussMySqlInstances, hcClient);
    }

    /**
     * 查询数据库慢日志
     *
     * 查询数据库慢日志
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListGaussMySqlSlowLogRequest 请求对象
     * @return CompletableFuture<ListGaussMySqlSlowLogResponse>
     */
    public CompletableFuture<ListGaussMySqlSlowLogResponse> listGaussMySqlSlowLogAsync(ListGaussMySqlSlowLogRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.listGaussMySqlSlowLog);
    }

    /**
     * 查询数据库慢日志
     *
     * 查询数据库慢日志
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListGaussMySqlSlowLogRequest 请求对象
     * @return AsyncInvoker<ListGaussMySqlSlowLogRequest, ListGaussMySqlSlowLogResponse>
     */
    public AsyncInvoker<ListGaussMySqlSlowLogRequest, ListGaussMySqlSlowLogResponse> listGaussMySqlSlowLogAsyncInvoker(ListGaussMySqlSlowLogRequest request) {
        return new AsyncInvoker<ListGaussMySqlSlowLogRequest, ListGaussMySqlSlowLogResponse>(request, GaussDBMeta.listGaussMySqlSlowLog, hcClient);
    }

    /**
     * 查询资源标签
     *
     * 查询指定实例的标签信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListInstanceTagsRequest 请求对象
     * @return CompletableFuture<ListInstanceTagsResponse>
     */
    public CompletableFuture<ListInstanceTagsResponse> listInstanceTagsAsync(ListInstanceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.listInstanceTags);
    }

    /**
     * 查询资源标签
     *
     * 查询指定实例的标签信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListInstanceTagsRequest 请求对象
     * @return AsyncInvoker<ListInstanceTagsRequest, ListInstanceTagsResponse>
     */
    public AsyncInvoker<ListInstanceTagsRequest, ListInstanceTagsResponse> listInstanceTagsAsyncInvoker(ListInstanceTagsRequest request) {
        return new AsyncInvoker<ListInstanceTagsRequest, ListInstanceTagsResponse>(request, GaussDBMeta.listInstanceTags, hcClient);
    }

    /**
     * 查询项目标签
     *
     * 查询指定project ID下实例的所有标签集合。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListProjectTagsRequest 请求对象
     * @return CompletableFuture<ListProjectTagsResponse>
     */
    public CompletableFuture<ListProjectTagsResponse> listProjectTagsAsync(ListProjectTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.listProjectTags);
    }

    /**
     * 查询项目标签
     *
     * 查询指定project ID下实例的所有标签集合。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListProjectTagsRequest 请求对象
     * @return AsyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse>
     */
    public AsyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse> listProjectTagsAsyncInvoker(ListProjectTagsRequest request) {
        return new AsyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse>(request, GaussDBMeta.listProjectTags, hcClient);
    }

    /**
     * 重置数据库密码
     *
     * 重置数据库密码
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ResetGaussMySqlPasswordRequest 请求对象
     * @return CompletableFuture<ResetGaussMySqlPasswordResponse>
     */
    public CompletableFuture<ResetGaussMySqlPasswordResponse> resetGaussMySqlPasswordAsync(ResetGaussMySqlPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.resetGaussMySqlPassword);
    }

    /**
     * 重置数据库密码
     *
     * 重置数据库密码
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ResetGaussMySqlPasswordRequest 请求对象
     * @return AsyncInvoker<ResetGaussMySqlPasswordRequest, ResetGaussMySqlPasswordResponse>
     */
    public AsyncInvoker<ResetGaussMySqlPasswordRequest, ResetGaussMySqlPasswordResponse> resetGaussMySqlPasswordAsyncInvoker(ResetGaussMySqlPasswordRequest request) {
        return new AsyncInvoker<ResetGaussMySqlPasswordRequest, ResetGaussMySqlPasswordResponse>(request, GaussDBMeta.resetGaussMySqlPassword, hcClient);
    }

    /**
     * 设置租户基于企业项目的资源配额
     *
     * 设置指定企业项目的资源配额。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SetGaussMySqlQuotasRequest 请求对象
     * @return CompletableFuture<SetGaussMySqlQuotasResponse>
     */
    public CompletableFuture<SetGaussMySqlQuotasResponse> setGaussMySqlQuotasAsync(SetGaussMySqlQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.setGaussMySqlQuotas);
    }

    /**
     * 设置租户基于企业项目的资源配额
     *
     * 设置指定企业项目的资源配额。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SetGaussMySqlQuotasRequest 请求对象
     * @return AsyncInvoker<SetGaussMySqlQuotasRequest, SetGaussMySqlQuotasResponse>
     */
    public AsyncInvoker<SetGaussMySqlQuotasRequest, SetGaussMySqlQuotasResponse> setGaussMySqlQuotasAsyncInvoker(SetGaussMySqlQuotasRequest request) {
        return new AsyncInvoker<SetGaussMySqlQuotasRequest, SetGaussMySqlQuotasResponse>(request, GaussDBMeta.setGaussMySqlQuotas, hcClient);
    }

    /**
     * 查询审计日志开关状态
     *
     * 查询审计日志开关状态
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowAuditLogRequest 请求对象
     * @return CompletableFuture<ShowAuditLogResponse>
     */
    public CompletableFuture<ShowAuditLogResponse> showAuditLogAsync(ShowAuditLogRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.showAuditLog);
    }

    /**
     * 查询审计日志开关状态
     *
     * 查询审计日志开关状态
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowAuditLogRequest 请求对象
     * @return AsyncInvoker<ShowAuditLogRequest, ShowAuditLogResponse>
     */
    public AsyncInvoker<ShowAuditLogRequest, ShowAuditLogResponse> showAuditLogAsyncInvoker(ShowAuditLogRequest request) {
        return new AsyncInvoker<ShowAuditLogRequest, ShowAuditLogResponse>(request, GaussDBMeta.showAuditLog, hcClient);
    }

    /**
     * 查询备份列表
     *
     * 查询备份列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowGaussMySqlBackupListRequest 请求对象
     * @return CompletableFuture<ShowGaussMySqlBackupListResponse>
     */
    public CompletableFuture<ShowGaussMySqlBackupListResponse> showGaussMySqlBackupListAsync(ShowGaussMySqlBackupListRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.showGaussMySqlBackupList);
    }

    /**
     * 查询备份列表
     *
     * 查询备份列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowGaussMySqlBackupListRequest 请求对象
     * @return AsyncInvoker<ShowGaussMySqlBackupListRequest, ShowGaussMySqlBackupListResponse>
     */
    public AsyncInvoker<ShowGaussMySqlBackupListRequest, ShowGaussMySqlBackupListResponse> showGaussMySqlBackupListAsyncInvoker(ShowGaussMySqlBackupListRequest request) {
        return new AsyncInvoker<ShowGaussMySqlBackupListRequest, ShowGaussMySqlBackupListResponse>(request, GaussDBMeta.showGaussMySqlBackupList, hcClient);
    }

    /**
     * 查询自动备份策略
     *
     * 查询自动备份策略。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowGaussMySqlBackupPolicyRequest 请求对象
     * @return CompletableFuture<ShowGaussMySqlBackupPolicyResponse>
     */
    public CompletableFuture<ShowGaussMySqlBackupPolicyResponse> showGaussMySqlBackupPolicyAsync(ShowGaussMySqlBackupPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.showGaussMySqlBackupPolicy);
    }

    /**
     * 查询自动备份策略
     *
     * 查询自动备份策略。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowGaussMySqlBackupPolicyRequest 请求对象
     * @return AsyncInvoker<ShowGaussMySqlBackupPolicyRequest, ShowGaussMySqlBackupPolicyResponse>
     */
    public AsyncInvoker<ShowGaussMySqlBackupPolicyRequest, ShowGaussMySqlBackupPolicyResponse> showGaussMySqlBackupPolicyAsyncInvoker(ShowGaussMySqlBackupPolicyRequest request) {
        return new AsyncInvoker<ShowGaussMySqlBackupPolicyRequest, ShowGaussMySqlBackupPolicyResponse>(request, GaussDBMeta.showGaussMySqlBackupPolicy, hcClient);
    }

    /**
     * 查询数据库引擎的版本
     *
     * 获取指定数据库引擎对应的数据库版本信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowGaussMySqlEngineVersionRequest 请求对象
     * @return CompletableFuture<ShowGaussMySqlEngineVersionResponse>
     */
    public CompletableFuture<ShowGaussMySqlEngineVersionResponse> showGaussMySqlEngineVersionAsync(ShowGaussMySqlEngineVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.showGaussMySqlEngineVersion);
    }

    /**
     * 查询数据库引擎的版本
     *
     * 获取指定数据库引擎对应的数据库版本信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowGaussMySqlEngineVersionRequest 请求对象
     * @return AsyncInvoker<ShowGaussMySqlEngineVersionRequest, ShowGaussMySqlEngineVersionResponse>
     */
    public AsyncInvoker<ShowGaussMySqlEngineVersionRequest, ShowGaussMySqlEngineVersionResponse> showGaussMySqlEngineVersionAsyncInvoker(ShowGaussMySqlEngineVersionRequest request) {
        return new AsyncInvoker<ShowGaussMySqlEngineVersionRequest, ShowGaussMySqlEngineVersionResponse>(request, GaussDBMeta.showGaussMySqlEngineVersion, hcClient);
    }

    /**
     * 查询数据库规格
     *
     * 获取指定数据库引擎版本对应的规格信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowGaussMySqlFlavorsRequest 请求对象
     * @return CompletableFuture<ShowGaussMySqlFlavorsResponse>
     */
    public CompletableFuture<ShowGaussMySqlFlavorsResponse> showGaussMySqlFlavorsAsync(ShowGaussMySqlFlavorsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.showGaussMySqlFlavors);
    }

    /**
     * 查询数据库规格
     *
     * 获取指定数据库引擎版本对应的规格信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowGaussMySqlFlavorsRequest 请求对象
     * @return AsyncInvoker<ShowGaussMySqlFlavorsRequest, ShowGaussMySqlFlavorsResponse>
     */
    public AsyncInvoker<ShowGaussMySqlFlavorsRequest, ShowGaussMySqlFlavorsResponse> showGaussMySqlFlavorsAsyncInvoker(ShowGaussMySqlFlavorsRequest request) {
        return new AsyncInvoker<ShowGaussMySqlFlavorsRequest, ShowGaussMySqlFlavorsResponse>(request, GaussDBMeta.showGaussMySqlFlavors, hcClient);
    }

    /**
     * 查询实例详情信息
     *
     * 查询实例详情信息
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowGaussMySqlInstanceInfoRequest 请求对象
     * @return CompletableFuture<ShowGaussMySqlInstanceInfoResponse>
     */
    public CompletableFuture<ShowGaussMySqlInstanceInfoResponse> showGaussMySqlInstanceInfoAsync(ShowGaussMySqlInstanceInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.showGaussMySqlInstanceInfo);
    }

    /**
     * 查询实例详情信息
     *
     * 查询实例详情信息
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowGaussMySqlInstanceInfoRequest 请求对象
     * @return AsyncInvoker<ShowGaussMySqlInstanceInfoRequest, ShowGaussMySqlInstanceInfoResponse>
     */
    public AsyncInvoker<ShowGaussMySqlInstanceInfoRequest, ShowGaussMySqlInstanceInfoResponse> showGaussMySqlInstanceInfoAsyncInvoker(ShowGaussMySqlInstanceInfoRequest request) {
        return new AsyncInvoker<ShowGaussMySqlInstanceInfoRequest, ShowGaussMySqlInstanceInfoResponse>(request, GaussDBMeta.showGaussMySqlInstanceInfo, hcClient);
    }

    /**
     * 获取指定ID的任务信息
     *
     * 获取指定ID的任务信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowGaussMySqlJobInfoRequest 请求对象
     * @return CompletableFuture<ShowGaussMySqlJobInfoResponse>
     */
    public CompletableFuture<ShowGaussMySqlJobInfoResponse> showGaussMySqlJobInfoAsync(ShowGaussMySqlJobInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.showGaussMySqlJobInfo);
    }

    /**
     * 获取指定ID的任务信息
     *
     * 获取指定ID的任务信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowGaussMySqlJobInfoRequest 请求对象
     * @return AsyncInvoker<ShowGaussMySqlJobInfoRequest, ShowGaussMySqlJobInfoResponse>
     */
    public AsyncInvoker<ShowGaussMySqlJobInfoRequest, ShowGaussMySqlJobInfoResponse> showGaussMySqlJobInfoAsyncInvoker(ShowGaussMySqlJobInfoRequest request) {
        return new AsyncInvoker<ShowGaussMySqlJobInfoRequest, ShowGaussMySqlJobInfoResponse>(request, GaussDBMeta.showGaussMySqlJobInfo, hcClient);
    }

    /**
     * 查询租户的实例配额
     *
     * 获取指定租户的资源配额。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowGaussMySqlProjectQuotasRequest 请求对象
     * @return CompletableFuture<ShowGaussMySqlProjectQuotasResponse>
     */
    public CompletableFuture<ShowGaussMySqlProjectQuotasResponse> showGaussMySqlProjectQuotasAsync(ShowGaussMySqlProjectQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.showGaussMySqlProjectQuotas);
    }

    /**
     * 查询租户的实例配额
     *
     * 获取指定租户的资源配额。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowGaussMySqlProjectQuotasRequest 请求对象
     * @return AsyncInvoker<ShowGaussMySqlProjectQuotasRequest, ShowGaussMySqlProjectQuotasResponse>
     */
    public AsyncInvoker<ShowGaussMySqlProjectQuotasRequest, ShowGaussMySqlProjectQuotasResponse> showGaussMySqlProjectQuotasAsyncInvoker(ShowGaussMySqlProjectQuotasRequest request) {
        return new AsyncInvoker<ShowGaussMySqlProjectQuotasRequest, ShowGaussMySqlProjectQuotasResponse>(request, GaussDBMeta.showGaussMySqlProjectQuotas, hcClient);
    }

    /**
     * 查询数据库代理信息
     *
     * 查询数据库代理信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowGaussMySqlProxyRequest 请求对象
     * @return CompletableFuture<ShowGaussMySqlProxyResponse>
     */
    public CompletableFuture<ShowGaussMySqlProxyResponse> showGaussMySqlProxyAsync(ShowGaussMySqlProxyRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.showGaussMySqlProxy);
    }

    /**
     * 查询数据库代理信息
     *
     * 查询数据库代理信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowGaussMySqlProxyRequest 请求对象
     * @return AsyncInvoker<ShowGaussMySqlProxyRequest, ShowGaussMySqlProxyResponse>
     */
    public AsyncInvoker<ShowGaussMySqlProxyRequest, ShowGaussMySqlProxyResponse> showGaussMySqlProxyAsyncInvoker(ShowGaussMySqlProxyRequest request) {
        return new AsyncInvoker<ShowGaussMySqlProxyRequest, ShowGaussMySqlProxyResponse>(request, GaussDBMeta.showGaussMySqlProxy, hcClient);
    }

    /**
     * 查询数据库代理规格信息
     *
     * 查询数据库代理规格信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowGaussMySqlProxyFlavorsRequest 请求对象
     * @return CompletableFuture<ShowGaussMySqlProxyFlavorsResponse>
     */
    public CompletableFuture<ShowGaussMySqlProxyFlavorsResponse> showGaussMySqlProxyFlavorsAsync(ShowGaussMySqlProxyFlavorsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.showGaussMySqlProxyFlavors);
    }

    /**
     * 查询数据库代理规格信息
     *
     * 查询数据库代理规格信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowGaussMySqlProxyFlavorsRequest 请求对象
     * @return AsyncInvoker<ShowGaussMySqlProxyFlavorsRequest, ShowGaussMySqlProxyFlavorsResponse>
     */
    public AsyncInvoker<ShowGaussMySqlProxyFlavorsRequest, ShowGaussMySqlProxyFlavorsResponse> showGaussMySqlProxyFlavorsAsyncInvoker(ShowGaussMySqlProxyFlavorsRequest request) {
        return new AsyncInvoker<ShowGaussMySqlProxyFlavorsRequest, ShowGaussMySqlProxyFlavorsResponse>(request, GaussDBMeta.showGaussMySqlProxyFlavors, hcClient);
    }

    /**
     * 查询数据库代理信息列表
     *
     * 查询数据库代理信息列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowGaussMySqlProxyListRequest 请求对象
     * @return CompletableFuture<ShowGaussMySqlProxyListResponse>
     */
    public CompletableFuture<ShowGaussMySqlProxyListResponse> showGaussMySqlProxyListAsync(ShowGaussMySqlProxyListRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.showGaussMySqlProxyList);
    }

    /**
     * 查询数据库代理信息列表
     *
     * 查询数据库代理信息列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowGaussMySqlProxyListRequest 请求对象
     * @return AsyncInvoker<ShowGaussMySqlProxyListRequest, ShowGaussMySqlProxyListResponse>
     */
    public AsyncInvoker<ShowGaussMySqlProxyListRequest, ShowGaussMySqlProxyListResponse> showGaussMySqlProxyListAsyncInvoker(ShowGaussMySqlProxyListRequest request) {
        return new AsyncInvoker<ShowGaussMySqlProxyListRequest, ShowGaussMySqlProxyListResponse>(request, GaussDBMeta.showGaussMySqlProxyList, hcClient);
    }

    /**
     * 查询租户基于企业项目的资源配额
     *
     * 获取指定企业项目的资源配额。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowGaussMySqlQuotasRequest 请求对象
     * @return CompletableFuture<ShowGaussMySqlQuotasResponse>
     */
    public CompletableFuture<ShowGaussMySqlQuotasResponse> showGaussMySqlQuotasAsync(ShowGaussMySqlQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.showGaussMySqlQuotas);
    }

    /**
     * 查询租户基于企业项目的资源配额
     *
     * 获取指定企业项目的资源配额。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowGaussMySqlQuotasRequest 请求对象
     * @return AsyncInvoker<ShowGaussMySqlQuotasRequest, ShowGaussMySqlQuotasResponse>
     */
    public AsyncInvoker<ShowGaussMySqlQuotasRequest, ShowGaussMySqlQuotasResponse> showGaussMySqlQuotasAsyncInvoker(ShowGaussMySqlQuotasRequest request) {
        return new AsyncInvoker<ShowGaussMySqlQuotasRequest, ShowGaussMySqlQuotasResponse>(request, GaussDBMeta.showGaussMySqlQuotas, hcClient);
    }

    /**
     * 查询实例秒级监控频率
     *
     * 查询实例秒级监控频率。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowInstanceMonitorExtendRequest 请求对象
     * @return CompletableFuture<ShowInstanceMonitorExtendResponse>
     */
    public CompletableFuture<ShowInstanceMonitorExtendResponse> showInstanceMonitorExtendAsync(ShowInstanceMonitorExtendRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.showInstanceMonitorExtend);
    }

    /**
     * 查询实例秒级监控频率
     *
     * 查询实例秒级监控频率。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowInstanceMonitorExtendRequest 请求对象
     * @return AsyncInvoker<ShowInstanceMonitorExtendRequest, ShowInstanceMonitorExtendResponse>
     */
    public AsyncInvoker<ShowInstanceMonitorExtendRequest, ShowInstanceMonitorExtendResponse> showInstanceMonitorExtendAsyncInvoker(ShowInstanceMonitorExtendRequest request) {
        return new AsyncInvoker<ShowInstanceMonitorExtendRequest, ShowInstanceMonitorExtendResponse>(request, GaussDBMeta.showInstanceMonitorExtend, hcClient);
    }

    /**
     * 开启或者关闭审计日志
     *
     * 开启或者关闭审计日志
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateAuditLogRequest 请求对象
     * @return CompletableFuture<UpdateAuditLogResponse>
     */
    public CompletableFuture<UpdateAuditLogResponse> updateAuditLogAsync(UpdateAuditLogRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.updateAuditLog);
    }

    /**
     * 开启或者关闭审计日志
     *
     * 开启或者关闭审计日志
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateAuditLogRequest 请求对象
     * @return AsyncInvoker<UpdateAuditLogRequest, UpdateAuditLogResponse>
     */
    public AsyncInvoker<UpdateAuditLogRequest, UpdateAuditLogResponse> updateAuditLogAsyncInvoker(UpdateAuditLogRequest request) {
        return new AsyncInvoker<UpdateAuditLogRequest, UpdateAuditLogResponse>(request, GaussDBMeta.updateAuditLog, hcClient);
    }

    /**
     * 修改备份策略
     *
     * 修改备份策略
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateGaussMySqlBackupPolicyRequest 请求对象
     * @return CompletableFuture<UpdateGaussMySqlBackupPolicyResponse>
     */
    public CompletableFuture<UpdateGaussMySqlBackupPolicyResponse> updateGaussMySqlBackupPolicyAsync(UpdateGaussMySqlBackupPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.updateGaussMySqlBackupPolicy);
    }

    /**
     * 修改备份策略
     *
     * 修改备份策略
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateGaussMySqlBackupPolicyRequest 请求对象
     * @return AsyncInvoker<UpdateGaussMySqlBackupPolicyRequest, UpdateGaussMySqlBackupPolicyResponse>
     */
    public AsyncInvoker<UpdateGaussMySqlBackupPolicyRequest, UpdateGaussMySqlBackupPolicyResponse> updateGaussMySqlBackupPolicyAsyncInvoker(UpdateGaussMySqlBackupPolicyRequest request) {
        return new AsyncInvoker<UpdateGaussMySqlBackupPolicyRequest, UpdateGaussMySqlBackupPolicyResponse>(request, GaussDBMeta.updateGaussMySqlBackupPolicy, hcClient);
    }

    /**
     * 修改实例名称
     *
     * 修改实例名称
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateGaussMySqlInstanceNameRequest 请求对象
     * @return CompletableFuture<UpdateGaussMySqlInstanceNameResponse>
     */
    public CompletableFuture<UpdateGaussMySqlInstanceNameResponse> updateGaussMySqlInstanceNameAsync(UpdateGaussMySqlInstanceNameRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.updateGaussMySqlInstanceName);
    }

    /**
     * 修改实例名称
     *
     * 修改实例名称
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateGaussMySqlInstanceNameRequest 请求对象
     * @return AsyncInvoker<UpdateGaussMySqlInstanceNameRequest, UpdateGaussMySqlInstanceNameResponse>
     */
    public AsyncInvoker<UpdateGaussMySqlInstanceNameRequest, UpdateGaussMySqlInstanceNameResponse> updateGaussMySqlInstanceNameAsyncInvoker(UpdateGaussMySqlInstanceNameRequest request) {
        return new AsyncInvoker<UpdateGaussMySqlInstanceNameRequest, UpdateGaussMySqlInstanceNameResponse>(request, GaussDBMeta.updateGaussMySqlInstanceName, hcClient);
    }

    /**
     * 修改租户基于企业项目的资源配额
     *
     * 修改指定企业项目的资源配额。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateGaussMySqlQuotasRequest 请求对象
     * @return CompletableFuture<UpdateGaussMySqlQuotasResponse>
     */
    public CompletableFuture<UpdateGaussMySqlQuotasResponse> updateGaussMySqlQuotasAsync(UpdateGaussMySqlQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.updateGaussMySqlQuotas);
    }

    /**
     * 修改租户基于企业项目的资源配额
     *
     * 修改指定企业项目的资源配额。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateGaussMySqlQuotasRequest 请求对象
     * @return AsyncInvoker<UpdateGaussMySqlQuotasRequest, UpdateGaussMySqlQuotasResponse>
     */
    public AsyncInvoker<UpdateGaussMySqlQuotasRequest, UpdateGaussMySqlQuotasResponse> updateGaussMySqlQuotasAsyncInvoker(UpdateGaussMySqlQuotasRequest request) {
        return new AsyncInvoker<UpdateGaussMySqlQuotasRequest, UpdateGaussMySqlQuotasResponse>(request, GaussDBMeta.updateGaussMySqlQuotas, hcClient);
    }

    /**
     * 修改实例秒级监控频率
     *
     * 打开/关闭/修改实例秒级监控。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateInstanceMonitorRequest 请求对象
     * @return CompletableFuture<UpdateInstanceMonitorResponse>
     */
    public CompletableFuture<UpdateInstanceMonitorResponse> updateInstanceMonitorAsync(UpdateInstanceMonitorRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBMeta.updateInstanceMonitor);
    }

    /**
     * 修改实例秒级监控频率
     *
     * 打开/关闭/修改实例秒级监控。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateInstanceMonitorRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceMonitorRequest, UpdateInstanceMonitorResponse>
     */
    public AsyncInvoker<UpdateInstanceMonitorRequest, UpdateInstanceMonitorResponse> updateInstanceMonitorAsyncInvoker(UpdateInstanceMonitorRequest request) {
        return new AsyncInvoker<UpdateInstanceMonitorRequest, UpdateInstanceMonitorResponse>(request, GaussDBMeta.updateInstanceMonitor, hcClient);
    }

}