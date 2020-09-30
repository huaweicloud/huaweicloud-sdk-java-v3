package com.huaweicloud.sdk.dds.v3;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import java.util.concurrent.CompletableFuture;
import java.util.function.Function;

import com.huaweicloud.sdk.dds.v3.model.*;

public class DdsAsyncClient {
    protected HcClient hcClient;

    public DdsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DdsAsyncClient> newBuilder() {
        return new ClientBuilder<>(DdsAsyncClient::new);
    }


    /**
     * 扩容指定集群实例的节点数量
     * 扩容指定集群实例的节点数量。
     *
     * @param AddShardingNodeRequest 请求对象
     * @return CompletableFuture<AddShardingNodeResponse>
     */
    public CompletableFuture<AddShardingNodeResponse> addShardingNodeAsync(AddShardingNodeRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.addShardingNode);
    }

    /**
     * 批量添加指定实例的标签
     * 批量添加指定实例的标签。
     *
     * @param BatchCreateInstanceTagsRequest 请求对象
     * @return CompletableFuture<BatchCreateInstanceTagsResponse>
     */
    public CompletableFuture<BatchCreateInstanceTagsResponse> batchCreateInstanceTagsAsync(BatchCreateInstanceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.batchCreateInstanceTags);
    }

    /**
     * 批量删除指定实例的标签
     * 批量删除指定实例的标签。
     *
     * @param BatchDeleteInstanceTagsRequest 请求对象
     * @return CompletableFuture<BatchDeleteInstanceTagsResponse>
     */
    public CompletableFuture<BatchDeleteInstanceTagsResponse> batchDeleteInstanceTagsAsync(BatchDeleteInstanceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.batchDeleteInstanceTags);
    }

    /**
     * 创建文档数据库实例，包括集群实例、副本集实例、以及单节点实例。
     * 创建文档数据库实例，包括集群实例、副本集实例、以及单节点实例。
     *
     * @param CreateInstanceRequest 请求对象
     * @return CompletableFuture<CreateInstanceResponse>
     */
    public CompletableFuture<CreateInstanceResponse> createInstanceAsync(CreateInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.createInstance);
    }

    /**
     * 创建数据库实例的手动备份
     * 创建数据库实例的手动备份。
     *
     * @param CreateManualBackupRequest 请求对象
     * @return CompletableFuture<CreateManualBackupResponse>
     */
    public CompletableFuture<CreateManualBackupResponse> createManualBackupAsync(CreateManualBackupRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.createManualBackup);
    }

    /**
     * 删除数据库实例
     * 删除数据库实例。
     *
     * @param DeleteInstanceRequest 请求对象
     * @return CompletableFuture<DeleteInstanceResponse>
     */
    public CompletableFuture<DeleteInstanceResponse> deleteInstanceAsync(DeleteInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.deleteInstance);
    }

    /**
     * 删除数据库实例的手动备份
     * 删除数据库实例的手动备份。
     *
     * @param DeleteManualBackupRequest 请求对象
     * @return CompletableFuture<DeleteManualBackupResponse>
     */
    public CompletableFuture<DeleteManualBackupResponse> deleteManualBackupAsync(DeleteManualBackupRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.deleteManualBackup);
    }

    /**
     * 根据指定条件查询备份列表
     * 根据指定条件查询备份列表。
     *
     * @param ListBackupsRequest 请求对象
     * @return CompletableFuture<ListBackupsResponse>
     */
    public CompletableFuture<ListBackupsResponse> listBackupsAsync(ListBackupsRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listBackups);
    }

    /**
     * 查询数据库版本信息
     * 查询指定实例类型的数据库版本信息。
     *
     * @param ListDatastoreVersionsRequest 请求对象
     * @return CompletableFuture<ListDatastoreVersionsResponse>
     */
    public CompletableFuture<ListDatastoreVersionsResponse> listDatastoreVersionsAsync(ListDatastoreVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listDatastoreVersions);
    }

    /**
     * 查询指定条件下的所有实例规格信息
     * 查询指定条件下的所有实例规格信息。
     *
     * @param ListFlavorsRequest 请求对象
     * @return CompletableFuture<ListFlavorsResponse>
     */
    public CompletableFuture<ListFlavorsResponse> listFlavorsAsync(ListFlavorsRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listFlavors);
    }

    /**
     * 查询指定实例的标签信息
     * 查询指定实例的标签信息。
     *
     * @param ListInstanceTagsRequest 请求对象
     * @return CompletableFuture<ListInstanceTagsResponse>
     */
    public CompletableFuture<ListInstanceTagsResponse> listInstanceTagsAsync(ListInstanceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listInstanceTags);
    }

    /**
     * 根据指定条件查询实例列表
     * 根据指定条件查询实例列表。
     *
     * @param ListInstancesRequest 请求对象
     * @return CompletableFuture<ListInstancesResponse>
     */
    public CompletableFuture<ListInstancesResponse> listInstancesAsync(ListInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listInstances);
    }

    /**
     * 根据标签查询指定的数据库实例
     * 根据标签查询指定的数据库实例。
     *
     * @param ListInstancesByTagsRequest 请求对象
     * @return CompletableFuture<ListInstancesByTagsResponse>
     */
    public CompletableFuture<ListInstancesByTagsResponse> listInstancesByTagsAsync(ListInstancesByTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listInstancesByTags);
    }

    /**
     * 查询指定project ID下实例的所有标签集合
     * 查询指定project ID下实例的所有标签集合。
     *
     * @param ListProjectTagsRequest 请求对象
     * @return CompletableFuture<ListProjectTagsResponse>
     */
    public CompletableFuture<ListProjectTagsResponse> listProjectTagsAsync(ListProjectTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.listProjectTags);
    }

    /**
     * 变更实例的规格
     * 变更实例的规格。
     *
     * @param ResizeInstanceRequest 请求对象
     * @return CompletableFuture<ResizeInstanceResponse>
     */
    public CompletableFuture<ResizeInstanceResponse> resizeInstanceAsync(ResizeInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.resizeInstance);
    }

    /**
     * 扩容实例相关的存储容量大小
     * 扩容实例相关的存储容量大小。
     *
     * @param ResizeInstanceVolumeRequest 请求对象
     * @return CompletableFuture<ResizeInstanceVolumeResponse>
     */
    public CompletableFuture<ResizeInstanceVolumeResponse> resizeInstanceVolumeAsync(ResizeInstanceVolumeRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.resizeInstanceVolume);
    }

    /**
     * 重启实例的数据库服务
     * 重启实例的数据库服务。
     *
     * @param RestartInstanceRequest 请求对象
     * @return CompletableFuture<RestartInstanceResponse>
     */
    public CompletableFuture<RestartInstanceResponse> restartInstanceAsync(RestartInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.restartInstance);
    }

    /**
     * 设置自动备份策略
     * 设置自动备份策略。 x-constraint: |- - 该接口支持DDS社区版和增强版。
     *
     * @param SetBackupPolicyRequest 请求对象
     * @return CompletableFuture<SetBackupPolicyResponse>
     */
    public CompletableFuture<SetBackupPolicyResponse> setBackupPolicyAsync(SetBackupPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.setBackupPolicy);
    }

    /**
     * 查询自动备份策略
     * 查询自动备份策略。
     *
     * @param ShowBackupPolicyRequest 请求对象
     * @return CompletableFuture<ShowBackupPolicyResponse>
     */
    public CompletableFuture<ShowBackupPolicyResponse> showBackupPolicyAsync(ShowBackupPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, DdsMeta.showBackupPolicy);
    }

}