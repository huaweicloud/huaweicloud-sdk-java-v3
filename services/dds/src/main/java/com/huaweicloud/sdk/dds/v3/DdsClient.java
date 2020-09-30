package com.huaweicloud.sdk.dds.v3;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.dds.v3.model.*;

public class DdsClient {
    protected HcClient hcClient;

    public DdsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DdsClient> newBuilder() {
        return new ClientBuilder<>(DdsClient::new);
    }


    /**
     * 扩容指定集群实例的节点数量
     * 扩容指定集群实例的节点数量。
     *
     * @param AddShardingNodeRequest 请求对象
     * @return AddShardingNodeResponse
     */
    public AddShardingNodeResponse addShardingNode(AddShardingNodeRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.addShardingNode);
    }

    /**
     * 批量添加指定实例的标签
     * 批量添加指定实例的标签。
     *
     * @param BatchCreateInstanceTagsRequest 请求对象
     * @return BatchCreateInstanceTagsResponse
     */
    public BatchCreateInstanceTagsResponse batchCreateInstanceTags(BatchCreateInstanceTagsRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.batchCreateInstanceTags);
    }

    /**
     * 批量删除指定实例的标签
     * 批量删除指定实例的标签。
     *
     * @param BatchDeleteInstanceTagsRequest 请求对象
     * @return BatchDeleteInstanceTagsResponse
     */
    public BatchDeleteInstanceTagsResponse batchDeleteInstanceTags(BatchDeleteInstanceTagsRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.batchDeleteInstanceTags);
    }

    /**
     * 创建文档数据库实例，包括集群实例、副本集实例、以及单节点实例。
     * 创建文档数据库实例，包括集群实例、副本集实例、以及单节点实例。
     *
     * @param CreateInstanceRequest 请求对象
     * @return CreateInstanceResponse
     */
    public CreateInstanceResponse createInstance(CreateInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.createInstance);
    }

    /**
     * 创建数据库实例的手动备份
     * 创建数据库实例的手动备份。
     *
     * @param CreateManualBackupRequest 请求对象
     * @return CreateManualBackupResponse
     */
    public CreateManualBackupResponse createManualBackup(CreateManualBackupRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.createManualBackup);
    }

    /**
     * 删除数据库实例
     * 删除数据库实例。
     *
     * @param DeleteInstanceRequest 请求对象
     * @return DeleteInstanceResponse
     */
    public DeleteInstanceResponse deleteInstance(DeleteInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.deleteInstance);
    }

    /**
     * 删除数据库实例的手动备份
     * 删除数据库实例的手动备份。
     *
     * @param DeleteManualBackupRequest 请求对象
     * @return DeleteManualBackupResponse
     */
    public DeleteManualBackupResponse deleteManualBackup(DeleteManualBackupRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.deleteManualBackup);
    }

    /**
     * 根据指定条件查询备份列表
     * 根据指定条件查询备份列表。
     *
     * @param ListBackupsRequest 请求对象
     * @return ListBackupsResponse
     */
    public ListBackupsResponse listBackups(ListBackupsRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.listBackups);
    }

    /**
     * 查询数据库版本信息
     * 查询指定实例类型的数据库版本信息。
     *
     * @param ListDatastoreVersionsRequest 请求对象
     * @return ListDatastoreVersionsResponse
     */
    public ListDatastoreVersionsResponse listDatastoreVersions(ListDatastoreVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.listDatastoreVersions);
    }

    /**
     * 查询指定条件下的所有实例规格信息
     * 查询指定条件下的所有实例规格信息。
     *
     * @param ListFlavorsRequest 请求对象
     * @return ListFlavorsResponse
     */
    public ListFlavorsResponse listFlavors(ListFlavorsRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.listFlavors);
    }

    /**
     * 查询指定实例的标签信息
     * 查询指定实例的标签信息。
     *
     * @param ListInstanceTagsRequest 请求对象
     * @return ListInstanceTagsResponse
     */
    public ListInstanceTagsResponse listInstanceTags(ListInstanceTagsRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.listInstanceTags);
    }

    /**
     * 根据指定条件查询实例列表
     * 根据指定条件查询实例列表。
     *
     * @param ListInstancesRequest 请求对象
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstances(ListInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.listInstances);
    }

    /**
     * 根据标签查询指定的数据库实例
     * 根据标签查询指定的数据库实例。
     *
     * @param ListInstancesByTagsRequest 请求对象
     * @return ListInstancesByTagsResponse
     */
    public ListInstancesByTagsResponse listInstancesByTags(ListInstancesByTagsRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.listInstancesByTags);
    }

    /**
     * 查询指定project ID下实例的所有标签集合
     * 查询指定project ID下实例的所有标签集合。
     *
     * @param ListProjectTagsRequest 请求对象
     * @return ListProjectTagsResponse
     */
    public ListProjectTagsResponse listProjectTags(ListProjectTagsRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.listProjectTags);
    }

    /**
     * 变更实例的规格
     * 变更实例的规格。
     *
     * @param ResizeInstanceRequest 请求对象
     * @return ResizeInstanceResponse
     */
    public ResizeInstanceResponse resizeInstance(ResizeInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.resizeInstance);
    }

    /**
     * 扩容实例相关的存储容量大小
     * 扩容实例相关的存储容量大小。
     *
     * @param ResizeInstanceVolumeRequest 请求对象
     * @return ResizeInstanceVolumeResponse
     */
    public ResizeInstanceVolumeResponse resizeInstanceVolume(ResizeInstanceVolumeRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.resizeInstanceVolume);
    }

    /**
     * 重启实例的数据库服务
     * 重启实例的数据库服务。
     *
     * @param RestartInstanceRequest 请求对象
     * @return RestartInstanceResponse
     */
    public RestartInstanceResponse restartInstance(RestartInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.restartInstance);
    }

    /**
     * 设置自动备份策略
     * 设置自动备份策略。 x-constraint: |- - 该接口支持DDS社区版和增强版。
     *
     * @param SetBackupPolicyRequest 请求对象
     * @return SetBackupPolicyResponse
     */
    public SetBackupPolicyResponse setBackupPolicy(SetBackupPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.setBackupPolicy);
    }

    /**
     * 查询自动备份策略
     * 查询自动备份策略。
     *
     * @param ShowBackupPolicyRequest 请求对象
     * @return ShowBackupPolicyResponse
     */
    public ShowBackupPolicyResponse showBackupPolicy(ShowBackupPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, DdsMeta.showBackupPolicy);
    }

}