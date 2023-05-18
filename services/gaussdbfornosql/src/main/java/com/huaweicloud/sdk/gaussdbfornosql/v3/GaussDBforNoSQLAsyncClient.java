package com.huaweicloud.sdk.gaussdbfornosql.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.gaussdbfornosql.v3.model.*;

import java.util.concurrent.CompletableFuture;

public class GaussDBforNoSQLAsyncClient {

    protected HcClient hcClient;

    public GaussDBforNoSQLAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<GaussDBforNoSQLAsyncClient> newBuilder() {
        return new ClientBuilder<>(GaussDBforNoSQLAsyncClient::new);
    }

    /**
     * 应用参数模板
     *
     * 将参数模板应用到实例，可以指定一个或多个实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ApplyConfigurationRequest 请求对象
     * @return CompletableFuture<ApplyConfigurationResponse>
     */
    public CompletableFuture<ApplyConfigurationResponse> applyConfigurationAsync(ApplyConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.applyConfiguration);
    }

    /**
     * 应用参数模板
     *
     * 将参数模板应用到实例，可以指定一个或多个实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ApplyConfigurationRequest 请求对象
     * @return AsyncInvoker<ApplyConfigurationRequest, ApplyConfigurationResponse>
     */
    public AsyncInvoker<ApplyConfigurationRequest, ApplyConfigurationResponse> applyConfigurationAsyncInvoker(
        ApplyConfigurationRequest request) {
        return new AsyncInvoker<ApplyConfigurationRequest, ApplyConfigurationResponse>(request,
            GaussDBforNoSQLMeta.applyConfiguration, hcClient);
    }

    /**
     * 批量添加或删除资源标签
     *
     * 批量添加或删除指定数据库实例的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchTagActionRequest 请求对象
     * @return CompletableFuture<BatchTagActionResponse>
     */
    public CompletableFuture<BatchTagActionResponse> batchTagActionAsync(BatchTagActionRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.batchTagAction);
    }

    /**
     * 批量添加或删除资源标签
     *
     * 批量添加或删除指定数据库实例的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchTagActionRequest 请求对象
     * @return AsyncInvoker<BatchTagActionRequest, BatchTagActionResponse>
     */
    public AsyncInvoker<BatchTagActionRequest, BatchTagActionResponse> batchTagActionAsyncInvoker(
        BatchTagActionRequest request) {
        return new AsyncInvoker<BatchTagActionRequest, BatchTagActionResponse>(request,
            GaussDBforNoSQLMeta.batchTagAction, hcClient);
    }

    /**
     * 校验实例是否可以与指定实例建立/解除容灾关系
     *
     * 校验实例是否可以与指定实例建立/解除容灾关系。若接口返回成功，表示可以与指定实例建立/解除容灾关系。
     * 该接口需要对建立/解除容灾关系的两个实例各调用一次，2次调用都响应成功才能进行容灾关系的搭建/解除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckDisasterRecoveryOperationRequest 请求对象
     * @return CompletableFuture<CheckDisasterRecoveryOperationResponse>
     */
    public CompletableFuture<CheckDisasterRecoveryOperationResponse> checkDisasterRecoveryOperationAsync(
        CheckDisasterRecoveryOperationRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.checkDisasterRecoveryOperation);
    }

    /**
     * 校验实例是否可以与指定实例建立/解除容灾关系
     *
     * 校验实例是否可以与指定实例建立/解除容灾关系。若接口返回成功，表示可以与指定实例建立/解除容灾关系。
     * 该接口需要对建立/解除容灾关系的两个实例各调用一次，2次调用都响应成功才能进行容灾关系的搭建/解除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckDisasterRecoveryOperationRequest 请求对象
     * @return AsyncInvoker<CheckDisasterRecoveryOperationRequest, CheckDisasterRecoveryOperationResponse>
     */
    public AsyncInvoker<CheckDisasterRecoveryOperationRequest, CheckDisasterRecoveryOperationResponse> checkDisasterRecoveryOperationAsyncInvoker(
        CheckDisasterRecoveryOperationRequest request) {
        return new AsyncInvoker<CheckDisasterRecoveryOperationRequest, CheckDisasterRecoveryOperationResponse>(request,
            GaussDBforNoSQLMeta.checkDisasterRecoveryOperation, hcClient);
    }

    /**
     * 判断弱密码
     *
     * 判断弱密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckWeekPasswordRequest 请求对象
     * @return CompletableFuture<CheckWeekPasswordResponse>
     */
    public CompletableFuture<CheckWeekPasswordResponse> checkWeekPasswordAsync(CheckWeekPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.checkWeekPassword);
    }

    /**
     * 判断弱密码
     *
     * 判断弱密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CheckWeekPasswordRequest 请求对象
     * @return AsyncInvoker<CheckWeekPasswordRequest, CheckWeekPasswordResponse>
     */
    public AsyncInvoker<CheckWeekPasswordRequest, CheckWeekPasswordResponse> checkWeekPasswordAsyncInvoker(
        CheckWeekPasswordRequest request) {
        return new AsyncInvoker<CheckWeekPasswordRequest, CheckWeekPasswordResponse>(request,
            GaussDBforNoSQLMeta.checkWeekPassword, hcClient);
    }

    /**
     * 参数模板比较
     *
     * 比较两个参数模板之间的差异
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CompareConfigurationRequest 请求对象
     * @return CompletableFuture<CompareConfigurationResponse>
     */
    public CompletableFuture<CompareConfigurationResponse> compareConfigurationAsync(
        CompareConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.compareConfiguration);
    }

    /**
     * 参数模板比较
     *
     * 比较两个参数模板之间的差异
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CompareConfigurationRequest 请求对象
     * @return AsyncInvoker<CompareConfigurationRequest, CompareConfigurationResponse>
     */
    public AsyncInvoker<CompareConfigurationRequest, CompareConfigurationResponse> compareConfigurationAsyncInvoker(
        CompareConfigurationRequest request) {
        return new AsyncInvoker<CompareConfigurationRequest, CompareConfigurationResponse>(request,
            GaussDBforNoSQLMeta.compareConfiguration, hcClient);
    }

    /**
     * 复制参数模板
     *
     * 复制参数模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CopyConfigurationRequest 请求对象
     * @return CompletableFuture<CopyConfigurationResponse>
     */
    public CompletableFuture<CopyConfigurationResponse> copyConfigurationAsync(CopyConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.copyConfiguration);
    }

    /**
     * 复制参数模板
     *
     * 复制参数模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CopyConfigurationRequest 请求对象
     * @return AsyncInvoker<CopyConfigurationRequest, CopyConfigurationResponse>
     */
    public AsyncInvoker<CopyConfigurationRequest, CopyConfigurationResponse> copyConfigurationAsyncInvoker(
        CopyConfigurationRequest request) {
        return new AsyncInvoker<CopyConfigurationRequest, CopyConfigurationResponse>(request,
            GaussDBforNoSQLMeta.copyConfiguration, hcClient);
    }

    /**
     * 创建手动备份
     *
     * 创建手动备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateBackRequest 请求对象
     * @return CompletableFuture<CreateBackResponse>
     */
    public CompletableFuture<CreateBackResponse> createBackAsync(CreateBackRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.createBack);
    }

    /**
     * 创建手动备份
     *
     * 创建手动备份。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateBackRequest 请求对象
     * @return AsyncInvoker<CreateBackRequest, CreateBackResponse>
     */
    public AsyncInvoker<CreateBackRequest, CreateBackResponse> createBackAsyncInvoker(CreateBackRequest request) {
        return new AsyncInvoker<CreateBackRequest, CreateBackResponse>(request, GaussDBforNoSQLMeta.createBack,
            hcClient);
    }

    /**
     * ‘创建冷数据存储’
     *
     * ‘创建冷数据存储’
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateColdVolumeRequest 请求对象
     * @return CompletableFuture<CreateColdVolumeResponse>
     */
    public CompletableFuture<CreateColdVolumeResponse> createColdVolumeAsync(CreateColdVolumeRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.createColdVolume);
    }

    /**
     * ‘创建冷数据存储’
     *
     * ‘创建冷数据存储’
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateColdVolumeRequest 请求对象
     * @return AsyncInvoker<CreateColdVolumeRequest, CreateColdVolumeResponse>
     */
    public AsyncInvoker<CreateColdVolumeRequest, CreateColdVolumeResponse> createColdVolumeAsyncInvoker(
        CreateColdVolumeRequest request) {
        return new AsyncInvoker<CreateColdVolumeRequest, CreateColdVolumeResponse>(request,
            GaussDBforNoSQLMeta.createColdVolume, hcClient);
    }

    /**
     * 创建参数模板
     *
     * 创建参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateConfigurationRequest 请求对象
     * @return CompletableFuture<CreateConfigurationResponse>
     */
    public CompletableFuture<CreateConfigurationResponse> createConfigurationAsync(CreateConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.createConfiguration);
    }

    /**
     * 创建参数模板
     *
     * 创建参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateConfigurationRequest 请求对象
     * @return AsyncInvoker<CreateConfigurationRequest, CreateConfigurationResponse>
     */
    public AsyncInvoker<CreateConfigurationRequest, CreateConfigurationResponse> createConfigurationAsyncInvoker(
        CreateConfigurationRequest request) {
        return new AsyncInvoker<CreateConfigurationRequest, CreateConfigurationResponse>(request,
            GaussDBforNoSQLMeta.createConfiguration, hcClient);
    }

    /**
     * 创建Redis数据库账号
     *
     * 在Redis实例中创建数据库帐号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDbUserRequest 请求对象
     * @return CompletableFuture<CreateDbUserResponse>
     */
    public CompletableFuture<CreateDbUserResponse> createDbUserAsync(CreateDbUserRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.createDbUser);
    }

    /**
     * 创建Redis数据库账号
     *
     * 在Redis实例中创建数据库帐号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDbUserRequest 请求对象
     * @return AsyncInvoker<CreateDbUserRequest, CreateDbUserResponse>
     */
    public AsyncInvoker<CreateDbUserRequest, CreateDbUserResponse> createDbUserAsyncInvoker(
        CreateDbUserRequest request) {
        return new AsyncInvoker<CreateDbUserRequest, CreateDbUserResponse>(request, GaussDBforNoSQLMeta.createDbUser,
            hcClient);
    }

    /**
     * 搭建实例与特定实例的容灾关系
     *
     * 搭建实例与特定实例的容灾关系。 该接口需要对搭建容灾关系的两个实例分别各调用一次，2次接口都调用成功才能成功搭建容灾关系。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDisasterRecoveryRequest 请求对象
     * @return CompletableFuture<CreateDisasterRecoveryResponse>
     */
    public CompletableFuture<CreateDisasterRecoveryResponse> createDisasterRecoveryAsync(
        CreateDisasterRecoveryRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.createDisasterRecovery);
    }

    /**
     * 搭建实例与特定实例的容灾关系
     *
     * 搭建实例与特定实例的容灾关系。 该接口需要对搭建容灾关系的两个实例分别各调用一次，2次接口都调用成功才能成功搭建容灾关系。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateDisasterRecoveryRequest 请求对象
     * @return AsyncInvoker<CreateDisasterRecoveryRequest, CreateDisasterRecoveryResponse>
     */
    public AsyncInvoker<CreateDisasterRecoveryRequest, CreateDisasterRecoveryResponse> createDisasterRecoveryAsyncInvoker(
        CreateDisasterRecoveryRequest request) {
        return new AsyncInvoker<CreateDisasterRecoveryRequest, CreateDisasterRecoveryResponse>(request,
            GaussDBforNoSQLMeta.createDisasterRecovery, hcClient);
    }

    /**
     * 创建实例
     *
     * 创建数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateInstanceRequest 请求对象
     * @return CompletableFuture<CreateInstanceResponse>
     */
    public CompletableFuture<CreateInstanceResponse> createInstanceAsync(CreateInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.createInstance);
    }

    /**
     * 创建实例
     *
     * 创建数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateInstanceRequest 请求对象
     * @return AsyncInvoker<CreateInstanceRequest, CreateInstanceResponse>
     */
    public AsyncInvoker<CreateInstanceRequest, CreateInstanceResponse> createInstanceAsyncInvoker(
        CreateInstanceRequest request) {
        return new AsyncInvoker<CreateInstanceRequest, CreateInstanceResponse>(request,
            GaussDBforNoSQLMeta.createInstance, hcClient);
    }

    /**
     * 删除手动备份
     *
     * 删除手动备份
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteBackupRequest 请求对象
     * @return CompletableFuture<DeleteBackupResponse>
     */
    public CompletableFuture<DeleteBackupResponse> deleteBackupAsync(DeleteBackupRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.deleteBackup);
    }

    /**
     * 删除手动备份
     *
     * 删除手动备份
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteBackupRequest 请求对象
     * @return AsyncInvoker<DeleteBackupRequest, DeleteBackupResponse>
     */
    public AsyncInvoker<DeleteBackupRequest, DeleteBackupResponse> deleteBackupAsyncInvoker(
        DeleteBackupRequest request) {
        return new AsyncInvoker<DeleteBackupRequest, DeleteBackupResponse>(request, GaussDBforNoSQLMeta.deleteBackup,
            hcClient);
    }

    /**
     * 删除参数模板
     *
     * 删除指定参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteConfigurationRequest 请求对象
     * @return CompletableFuture<DeleteConfigurationResponse>
     */
    public CompletableFuture<DeleteConfigurationResponse> deleteConfigurationAsync(DeleteConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.deleteConfiguration);
    }

    /**
     * 删除参数模板
     *
     * 删除指定参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteConfigurationRequest 请求对象
     * @return AsyncInvoker<DeleteConfigurationRequest, DeleteConfigurationResponse>
     */
    public AsyncInvoker<DeleteConfigurationRequest, DeleteConfigurationResponse> deleteConfigurationAsyncInvoker(
        DeleteConfigurationRequest request) {
        return new AsyncInvoker<DeleteConfigurationRequest, DeleteConfigurationResponse>(request,
            GaussDBforNoSQLMeta.deleteConfiguration, hcClient);
    }

    /**
     * 删除Redis数据库账号
     *
     * 删除Redis实例的数据库账号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDbUserRequest 请求对象
     * @return CompletableFuture<DeleteDbUserResponse>
     */
    public CompletableFuture<DeleteDbUserResponse> deleteDbUserAsync(DeleteDbUserRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.deleteDbUser);
    }

    /**
     * 删除Redis数据库账号
     *
     * 删除Redis实例的数据库账号。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDbUserRequest 请求对象
     * @return AsyncInvoker<DeleteDbUserRequest, DeleteDbUserResponse>
     */
    public AsyncInvoker<DeleteDbUserRequest, DeleteDbUserResponse> deleteDbUserAsyncInvoker(
        DeleteDbUserRequest request) {
        return new AsyncInvoker<DeleteDbUserRequest, DeleteDbUserResponse>(request, GaussDBforNoSQLMeta.deleteDbUser,
            hcClient);
    }

    /**
     * 解除实例与特定实例的容灾关系
     *
     * 解除实例与特定实例的容灾关系。 该接口需要对搭建容灾关系的两个实例分别各调用一次，2次接口都调用成功才能成功解除容灾关系。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDisasterRecoveryRequest 请求对象
     * @return CompletableFuture<DeleteDisasterRecoveryResponse>
     */
    public CompletableFuture<DeleteDisasterRecoveryResponse> deleteDisasterRecoveryAsync(
        DeleteDisasterRecoveryRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.deleteDisasterRecovery);
    }

    /**
     * 解除实例与特定实例的容灾关系
     *
     * 解除实例与特定实例的容灾关系。 该接口需要对搭建容灾关系的两个实例分别各调用一次，2次接口都调用成功才能成功解除容灾关系。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteDisasterRecoveryRequest 请求对象
     * @return AsyncInvoker<DeleteDisasterRecoveryRequest, DeleteDisasterRecoveryResponse>
     */
    public AsyncInvoker<DeleteDisasterRecoveryRequest, DeleteDisasterRecoveryResponse> deleteDisasterRecoveryAsyncInvoker(
        DeleteDisasterRecoveryRequest request) {
        return new AsyncInvoker<DeleteDisasterRecoveryRequest, DeleteDisasterRecoveryResponse>(request,
            GaussDBforNoSQLMeta.deleteDisasterRecovery, hcClient);
    }

    /**
     * 删除扩容失败的节点
     *
     * 删除扩容失败的节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEnlargeFailNodeRequest 请求对象
     * @return CompletableFuture<DeleteEnlargeFailNodeResponse>
     */
    public CompletableFuture<DeleteEnlargeFailNodeResponse> deleteEnlargeFailNodeAsync(
        DeleteEnlargeFailNodeRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.deleteEnlargeFailNode);
    }

    /**
     * 删除扩容失败的节点
     *
     * 删除扩容失败的节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEnlargeFailNodeRequest 请求对象
     * @return AsyncInvoker<DeleteEnlargeFailNodeRequest, DeleteEnlargeFailNodeResponse>
     */
    public AsyncInvoker<DeleteEnlargeFailNodeRequest, DeleteEnlargeFailNodeResponse> deleteEnlargeFailNodeAsyncInvoker(
        DeleteEnlargeFailNodeRequest request) {
        return new AsyncInvoker<DeleteEnlargeFailNodeRequest, DeleteEnlargeFailNodeResponse>(request,
            GaussDBforNoSQLMeta.deleteEnlargeFailNode, hcClient);
    }

    /**
     * 删除实例
     *
     * 删除数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteInstanceRequest 请求对象
     * @return CompletableFuture<DeleteInstanceResponse>
     */
    public CompletableFuture<DeleteInstanceResponse> deleteInstanceAsync(DeleteInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.deleteInstance);
    }

    /**
     * 删除实例
     *
     * 删除数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteInstanceRequest 请求对象
     * @return AsyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>
     */
    public AsyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstanceAsyncInvoker(
        DeleteInstanceRequest request) {
        return new AsyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>(request,
            GaussDBforNoSQLMeta.deleteInstance, hcClient);
    }

    /**
     * 扩容指定集群实例的节点数量
     *
     * 扩容指定集群实例的节点数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExpandInstanceNodeRequest 请求对象
     * @return CompletableFuture<ExpandInstanceNodeResponse>
     */
    public CompletableFuture<ExpandInstanceNodeResponse> expandInstanceNodeAsync(ExpandInstanceNodeRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.expandInstanceNode);
    }

    /**
     * 扩容指定集群实例的节点数量
     *
     * 扩容指定集群实例的节点数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ExpandInstanceNodeRequest 请求对象
     * @return AsyncInvoker<ExpandInstanceNodeRequest, ExpandInstanceNodeResponse>
     */
    public AsyncInvoker<ExpandInstanceNodeRequest, ExpandInstanceNodeResponse> expandInstanceNodeAsyncInvoker(
        ExpandInstanceNodeRequest request) {
        return new AsyncInvoker<ExpandInstanceNodeRequest, ExpandInstanceNodeResponse>(request,
            GaussDBforNoSQLMeta.expandInstanceNode, hcClient);
    }

    /**
     * 查询实例可变更规格
     *
     * 查询实例可变更规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAvailableFlavorInfosRequest 请求对象
     * @return CompletableFuture<ListAvailableFlavorInfosResponse>
     */
    public CompletableFuture<ListAvailableFlavorInfosResponse> listAvailableFlavorInfosAsync(
        ListAvailableFlavorInfosRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.listAvailableFlavorInfos);
    }

    /**
     * 查询实例可变更规格
     *
     * 查询实例可变更规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAvailableFlavorInfosRequest 请求对象
     * @return AsyncInvoker<ListAvailableFlavorInfosRequest, ListAvailableFlavorInfosResponse>
     */
    public AsyncInvoker<ListAvailableFlavorInfosRequest, ListAvailableFlavorInfosResponse> listAvailableFlavorInfosAsyncInvoker(
        ListAvailableFlavorInfosRequest request) {
        return new AsyncInvoker<ListAvailableFlavorInfosRequest, ListAvailableFlavorInfosResponse>(request,
            GaussDBforNoSQLMeta.listAvailableFlavorInfos, hcClient);
    }

    /**
     * 查询支持参数模板的引擎信息
     *
     * 查询支持参数模板的引擎信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListConfigurationDatastoresRequest 请求对象
     * @return CompletableFuture<ListConfigurationDatastoresResponse>
     */
    public CompletableFuture<ListConfigurationDatastoresResponse> listConfigurationDatastoresAsync(
        ListConfigurationDatastoresRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.listConfigurationDatastores);
    }

    /**
     * 查询支持参数模板的引擎信息
     *
     * 查询支持参数模板的引擎信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListConfigurationDatastoresRequest 请求对象
     * @return AsyncInvoker<ListConfigurationDatastoresRequest, ListConfigurationDatastoresResponse>
     */
    public AsyncInvoker<ListConfigurationDatastoresRequest, ListConfigurationDatastoresResponse> listConfigurationDatastoresAsyncInvoker(
        ListConfigurationDatastoresRequest request) {
        return new AsyncInvoker<ListConfigurationDatastoresRequest, ListConfigurationDatastoresResponse>(request,
            GaussDBforNoSQLMeta.listConfigurationDatastores, hcClient);
    }

    /**
     * 获取参数模板列表
     *
     * 获取参数模板列表，包括所有数据库的默认参数模板和用户创建的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListConfigurationTemplatesRequest 请求对象
     * @return CompletableFuture<ListConfigurationTemplatesResponse>
     */
    public CompletableFuture<ListConfigurationTemplatesResponse> listConfigurationTemplatesAsync(
        ListConfigurationTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.listConfigurationTemplates);
    }

    /**
     * 获取参数模板列表
     *
     * 获取参数模板列表，包括所有数据库的默认参数模板和用户创建的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListConfigurationTemplatesRequest 请求对象
     * @return AsyncInvoker<ListConfigurationTemplatesRequest, ListConfigurationTemplatesResponse>
     */
    public AsyncInvoker<ListConfigurationTemplatesRequest, ListConfigurationTemplatesResponse> listConfigurationTemplatesAsyncInvoker(
        ListConfigurationTemplatesRequest request) {
        return new AsyncInvoker<ListConfigurationTemplatesRequest, ListConfigurationTemplatesResponse>(request,
            GaussDBforNoSQLMeta.listConfigurationTemplates, hcClient);
    }

    /**
     * 获取参数模板列表
     *
     * 获取参数模板列表，包括所有数据库的默认参数模板和用户创建的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListConfigurationsRequest 请求对象
     * @return CompletableFuture<ListConfigurationsResponse>
     */
    public CompletableFuture<ListConfigurationsResponse> listConfigurationsAsync(ListConfigurationsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.listConfigurations);
    }

    /**
     * 获取参数模板列表
     *
     * 获取参数模板列表，包括所有数据库的默认参数模板和用户创建的参数模板。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListConfigurationsRequest 请求对象
     * @return AsyncInvoker<ListConfigurationsRequest, ListConfigurationsResponse>
     */
    public AsyncInvoker<ListConfigurationsRequest, ListConfigurationsResponse> listConfigurationsAsyncInvoker(
        ListConfigurationsRequest request) {
        return new AsyncInvoker<ListConfigurationsRequest, ListConfigurationsResponse>(request,
            GaussDBforNoSQLMeta.listConfigurations, hcClient);
    }

    /**
     * 查询指定实例类型的数据库版本信息
     *
     * 查询指定实例类型的数据库版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDatastoresRequest 请求对象
     * @return CompletableFuture<ListDatastoresResponse>
     */
    public CompletableFuture<ListDatastoresResponse> listDatastoresAsync(ListDatastoresRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.listDatastores);
    }

    /**
     * 查询指定实例类型的数据库版本信息
     *
     * 查询指定实例类型的数据库版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDatastoresRequest 请求对象
     * @return AsyncInvoker<ListDatastoresRequest, ListDatastoresResponse>
     */
    public AsyncInvoker<ListDatastoresRequest, ListDatastoresResponse> listDatastoresAsyncInvoker(
        ListDatastoresRequest request) {
        return new AsyncInvoker<ListDatastoresRequest, ListDatastoresResponse>(request,
            GaussDBforNoSQLMeta.listDatastores, hcClient);
    }

    /**
     * 获取Redis数据库账号列表和详情
     *
     * 获取Redis数据库账号列表和详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDbUsersRequest 请求对象
     * @return CompletableFuture<ListDbUsersResponse>
     */
    public CompletableFuture<ListDbUsersResponse> listDbUsersAsync(ListDbUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.listDbUsers);
    }

    /**
     * 获取Redis数据库账号列表和详情
     *
     * 获取Redis数据库账号列表和详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDbUsersRequest 请求对象
     * @return AsyncInvoker<ListDbUsersRequest, ListDbUsersResponse>
     */
    public AsyncInvoker<ListDbUsersRequest, ListDbUsersResponse> listDbUsersAsyncInvoker(ListDbUsersRequest request) {
        return new AsyncInvoker<ListDbUsersRequest, ListDbUsersResponse>(request, GaussDBforNoSQLMeta.listDbUsers,
            hcClient);
    }

    /**
     * 查询专属资源列表
     *
     * 查询专属资源列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDedicatedResourcesRequest 请求对象
     * @return CompletableFuture<ListDedicatedResourcesResponse>
     */
    public CompletableFuture<ListDedicatedResourcesResponse> listDedicatedResourcesAsync(
        ListDedicatedResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.listDedicatedResources);
    }

    /**
     * 查询专属资源列表
     *
     * 查询专属资源列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListDedicatedResourcesRequest 请求对象
     * @return AsyncInvoker<ListDedicatedResourcesRequest, ListDedicatedResourcesResponse>
     */
    public AsyncInvoker<ListDedicatedResourcesRequest, ListDedicatedResourcesResponse> listDedicatedResourcesAsyncInvoker(
        ListDedicatedResourcesRequest request) {
        return new AsyncInvoker<ListDedicatedResourcesRequest, ListDedicatedResourcesResponse>(request,
            GaussDBforNoSQLMeta.listDedicatedResources, hcClient);
    }

    /**
     * 查询企业项目配额
     *
     * 查询企业项目配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEpsQuotasRequest 请求对象
     * @return CompletableFuture<ListEpsQuotasResponse>
     */
    public CompletableFuture<ListEpsQuotasResponse> listEpsQuotasAsync(ListEpsQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.listEpsQuotas);
    }

    /**
     * 查询企业项目配额
     *
     * 查询企业项目配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEpsQuotasRequest 请求对象
     * @return AsyncInvoker<ListEpsQuotasRequest, ListEpsQuotasResponse>
     */
    public AsyncInvoker<ListEpsQuotasRequest, ListEpsQuotasResponse> listEpsQuotasAsyncInvoker(
        ListEpsQuotasRequest request) {
        return new AsyncInvoker<ListEpsQuotasRequest, ListEpsQuotasResponse>(request, GaussDBforNoSQLMeta.listEpsQuotas,
            hcClient);
    }

    /**
     * 查询数据库规格
     *
     * 查询指定条件下的实例规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFlavorInfosRequest 请求对象
     * @return CompletableFuture<ListFlavorInfosResponse>
     */
    public CompletableFuture<ListFlavorInfosResponse> listFlavorInfosAsync(ListFlavorInfosRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.listFlavorInfos);
    }

    /**
     * 查询数据库规格
     *
     * 查询指定条件下的实例规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFlavorInfosRequest 请求对象
     * @return AsyncInvoker<ListFlavorInfosRequest, ListFlavorInfosResponse>
     */
    public AsyncInvoker<ListFlavorInfosRequest, ListFlavorInfosResponse> listFlavorInfosAsyncInvoker(
        ListFlavorInfosRequest request) {
        return new AsyncInvoker<ListFlavorInfosRequest, ListFlavorInfosResponse>(request,
            GaussDBforNoSQLMeta.listFlavorInfos, hcClient);
    }

    /**
     * 查询指定条件下的所有实例规格信息
     *
     * 查询指定条件下的所有实例规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFlavorsRequest 请求对象
     * @return CompletableFuture<ListFlavorsResponse>
     */
    public CompletableFuture<ListFlavorsResponse> listFlavorsAsync(ListFlavorsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.listFlavors);
    }

    /**
     * 查询指定条件下的所有实例规格信息
     *
     * 查询指定条件下的所有实例规格信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFlavorsRequest 请求对象
     * @return AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse>
     */
    public AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse> listFlavorsAsyncInvoker(ListFlavorsRequest request) {
        return new AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse>(request, GaussDBforNoSQLMeta.listFlavors,
            hcClient);
    }

    /**
     * 获取Redis实例数据库列表
     *
     * 获取Redis实例数据库列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstanceDatabasesRequest 请求对象
     * @return CompletableFuture<ListInstanceDatabasesResponse>
     */
    public CompletableFuture<ListInstanceDatabasesResponse> listInstanceDatabasesAsync(
        ListInstanceDatabasesRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.listInstanceDatabases);
    }

    /**
     * 获取Redis实例数据库列表
     *
     * 获取Redis实例数据库列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstanceDatabasesRequest 请求对象
     * @return AsyncInvoker<ListInstanceDatabasesRequest, ListInstanceDatabasesResponse>
     */
    public AsyncInvoker<ListInstanceDatabasesRequest, ListInstanceDatabasesResponse> listInstanceDatabasesAsyncInvoker(
        ListInstanceDatabasesRequest request) {
        return new AsyncInvoker<ListInstanceDatabasesRequest, ListInstanceDatabasesResponse>(request,
            GaussDBforNoSQLMeta.listInstanceDatabases, hcClient);
    }

    /**
     * 查询资源标签
     *
     * 查询指定实例的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstanceTagsRequest 请求对象
     * @return CompletableFuture<ListInstanceTagsResponse>
     */
    public CompletableFuture<ListInstanceTagsResponse> listInstanceTagsAsync(ListInstanceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.listInstanceTags);
    }

    /**
     * 查询资源标签
     *
     * 查询指定实例的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstanceTagsRequest 请求对象
     * @return AsyncInvoker<ListInstanceTagsRequest, ListInstanceTagsResponse>
     */
    public AsyncInvoker<ListInstanceTagsRequest, ListInstanceTagsResponse> listInstanceTagsAsyncInvoker(
        ListInstanceTagsRequest request) {
        return new AsyncInvoker<ListInstanceTagsRequest, ListInstanceTagsResponse>(request,
            GaussDBforNoSQLMeta.listInstanceTags, hcClient);
    }

    /**
     * 查询实例列表和详情
     *
     * 根据指定条件查询数据库实例列表和详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstancesRequest 请求对象
     * @return CompletableFuture<ListInstancesResponse>
     */
    public CompletableFuture<ListInstancesResponse> listInstancesAsync(ListInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.listInstances);
    }

    /**
     * 查询实例列表和详情
     *
     * 根据指定条件查询数据库实例列表和详情。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstancesRequest 请求对象
     * @return AsyncInvoker<ListInstancesRequest, ListInstancesResponse>
     */
    public AsyncInvoker<ListInstancesRequest, ListInstancesResponse> listInstancesAsyncInvoker(
        ListInstancesRequest request) {
        return new AsyncInvoker<ListInstancesRequest, ListInstancesResponse>(request, GaussDBforNoSQLMeta.listInstances,
            hcClient);
    }

    /**
     * 查询资源实例
     *
     * 根据标签查询指定的数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstancesByResourceTagsRequest 请求对象
     * @return CompletableFuture<ListInstancesByResourceTagsResponse>
     */
    public CompletableFuture<ListInstancesByResourceTagsResponse> listInstancesByResourceTagsAsync(
        ListInstancesByResourceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.listInstancesByResourceTags);
    }

    /**
     * 查询资源实例
     *
     * 根据标签查询指定的数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstancesByResourceTagsRequest 请求对象
     * @return AsyncInvoker<ListInstancesByResourceTagsRequest, ListInstancesByResourceTagsResponse>
     */
    public AsyncInvoker<ListInstancesByResourceTagsRequest, ListInstancesByResourceTagsResponse> listInstancesByResourceTagsAsyncInvoker(
        ListInstancesByResourceTagsRequest request) {
        return new AsyncInvoker<ListInstancesByResourceTagsRequest, ListInstancesByResourceTagsResponse>(request,
            GaussDBforNoSQLMeta.listInstancesByResourceTags, hcClient);
    }

    /**
     * 查询资源实例
     *
     * 根据标签查询指定的数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstancesByTagsRequest 请求对象
     * @return CompletableFuture<ListInstancesByTagsResponse>
     */
    public CompletableFuture<ListInstancesByTagsResponse> listInstancesByTagsAsync(ListInstancesByTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.listInstancesByTags);
    }

    /**
     * 查询资源实例
     *
     * 根据标签查询指定的数据库实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListInstancesByTagsRequest 请求对象
     * @return AsyncInvoker<ListInstancesByTagsRequest, ListInstancesByTagsResponse>
     */
    public AsyncInvoker<ListInstancesByTagsRequest, ListInstancesByTagsResponse> listInstancesByTagsAsyncInvoker(
        ListInstancesByTagsRequest request) {
        return new AsyncInvoker<ListInstancesByTagsRequest, ListInstancesByTagsResponse>(request,
            GaussDBforNoSQLMeta.listInstancesByTags, hcClient);
    }

    /**
     * 查询项目标签
     *
     * 查询指定项目的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProjectTagsRequest 请求对象
     * @return CompletableFuture<ListProjectTagsResponse>
     */
    public CompletableFuture<ListProjectTagsResponse> listProjectTagsAsync(ListProjectTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.listProjectTags);
    }

    /**
     * 查询项目标签
     *
     * 查询指定项目的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProjectTagsRequest 请求对象
     * @return AsyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse>
     */
    public AsyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse> listProjectTagsAsyncInvoker(
        ListProjectTagsRequest request) {
        return new AsyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse>(request,
            GaussDBforNoSQLMeta.listProjectTags, hcClient);
    }

    /**
     * 查询回收站实例列表
     *
     * 查询回收站所有引擎的实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRecycleInstancesRequest 请求对象
     * @return CompletableFuture<ListRecycleInstancesResponse>
     */
    public CompletableFuture<ListRecycleInstancesResponse> listRecycleInstancesAsync(
        ListRecycleInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.listRecycleInstances);
    }

    /**
     * 查询回收站实例列表
     *
     * 查询回收站所有引擎的实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRecycleInstancesRequest 请求对象
     * @return AsyncInvoker<ListRecycleInstancesRequest, ListRecycleInstancesResponse>
     */
    public AsyncInvoker<ListRecycleInstancesRequest, ListRecycleInstancesResponse> listRecycleInstancesAsyncInvoker(
        ListRecycleInstancesRequest request) {
        return new AsyncInvoker<ListRecycleInstancesRequest, ListRecycleInstancesResponse>(request,
            GaussDBforNoSQLMeta.listRecycleInstances, hcClient);
    }

    /**
     * 查询实例可恢复的时间段
     *
     * 查询实例可恢复的时间段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRestoreTimeRequest 请求对象
     * @return CompletableFuture<ListRestoreTimeResponse>
     */
    public CompletableFuture<ListRestoreTimeResponse> listRestoreTimeAsync(ListRestoreTimeRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.listRestoreTime);
    }

    /**
     * 查询实例可恢复的时间段
     *
     * 查询实例可恢复的时间段
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRestoreTimeRequest 请求对象
     * @return AsyncInvoker<ListRestoreTimeRequest, ListRestoreTimeResponse>
     */
    public AsyncInvoker<ListRestoreTimeRequest, ListRestoreTimeResponse> listRestoreTimeAsyncInvoker(
        ListRestoreTimeRequest request) {
        return new AsyncInvoker<ListRestoreTimeRequest, ListRestoreTimeResponse>(request,
            GaussDBforNoSQLMeta.listRestoreTime, hcClient);
    }

    /**
     * 查询数据库慢日志
     *
     * 查询数据库慢日志信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSlowLogsRequest 请求对象
     * @return CompletableFuture<ListSlowLogsResponse>
     */
    public CompletableFuture<ListSlowLogsResponse> listSlowLogsAsync(ListSlowLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.listSlowLogs);
    }

    /**
     * 查询数据库慢日志
     *
     * 查询数据库慢日志信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListSlowLogsRequest 请求对象
     * @return AsyncInvoker<ListSlowLogsRequest, ListSlowLogsResponse>
     */
    public AsyncInvoker<ListSlowLogsRequest, ListSlowLogsResponse> listSlowLogsAsyncInvoker(
        ListSlowLogsRequest request) {
        return new AsyncInvoker<ListSlowLogsRequest, ListSlowLogsResponse>(request, GaussDBforNoSQLMeta.listSlowLogs,
            hcClient);
    }

    /**
     * 修改Redis数据库帐号权限
     *
     * 修改Redis数据库帐号权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ModifyDbUserPrivilegeRequest 请求对象
     * @return CompletableFuture<ModifyDbUserPrivilegeResponse>
     */
    public CompletableFuture<ModifyDbUserPrivilegeResponse> modifyDbUserPrivilegeAsync(
        ModifyDbUserPrivilegeRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.modifyDbUserPrivilege);
    }

    /**
     * 修改Redis数据库帐号权限
     *
     * 修改Redis数据库帐号权限。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ModifyDbUserPrivilegeRequest 请求对象
     * @return AsyncInvoker<ModifyDbUserPrivilegeRequest, ModifyDbUserPrivilegeResponse>
     */
    public AsyncInvoker<ModifyDbUserPrivilegeRequest, ModifyDbUserPrivilegeResponse> modifyDbUserPrivilegeAsyncInvoker(
        ModifyDbUserPrivilegeRequest request) {
        return new AsyncInvoker<ModifyDbUserPrivilegeRequest, ModifyDbUserPrivilegeResponse>(request,
            GaussDBforNoSQLMeta.modifyDbUserPrivilege, hcClient);
    }

    /**
     * 修改企业项目配额
     *
     * 修改企业项目配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ModifyEpsQuotasRequest 请求对象
     * @return CompletableFuture<ModifyEpsQuotasResponse>
     */
    public CompletableFuture<ModifyEpsQuotasResponse> modifyEpsQuotasAsync(ModifyEpsQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.modifyEpsQuotas);
    }

    /**
     * 修改企业项目配额
     *
     * 修改企业项目配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ModifyEpsQuotasRequest 请求对象
     * @return AsyncInvoker<ModifyEpsQuotasRequest, ModifyEpsQuotasResponse>
     */
    public AsyncInvoker<ModifyEpsQuotasRequest, ModifyEpsQuotasResponse> modifyEpsQuotasAsyncInvoker(
        ModifyEpsQuotasRequest request) {
        return new AsyncInvoker<ModifyEpsQuotasRequest, ModifyEpsQuotasResponse>(request,
            GaussDBforNoSQLMeta.modifyEpsQuotas, hcClient);
    }

    /**
     * 修改数据库端口
     *
     * 修改数据库实例的端口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ModifyPortRequest 请求对象
     * @return CompletableFuture<ModifyPortResponse>
     */
    public CompletableFuture<ModifyPortResponse> modifyPortAsync(ModifyPortRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.modifyPort);
    }

    /**
     * 修改数据库端口
     *
     * 修改数据库实例的端口。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ModifyPortRequest 请求对象
     * @return AsyncInvoker<ModifyPortRequest, ModifyPortResponse>
     */
    public AsyncInvoker<ModifyPortRequest, ModifyPortResponse> modifyPortAsyncInvoker(ModifyPortRequest request) {
        return new AsyncInvoker<ModifyPortRequest, ModifyPortResponse>(request, GaussDBforNoSQLMeta.modifyPort,
            hcClient);
    }

    /**
     * 绑定/解绑弹性公网IP
     *
     * 实例下的节点绑定弹性公网IP/解绑弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ModifyPublicIpRequest 请求对象
     * @return CompletableFuture<ModifyPublicIpResponse>
     */
    public CompletableFuture<ModifyPublicIpResponse> modifyPublicIpAsync(ModifyPublicIpRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.modifyPublicIp);
    }

    /**
     * 绑定/解绑弹性公网IP
     *
     * 实例下的节点绑定弹性公网IP/解绑弹性公网IP
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ModifyPublicIpRequest 请求对象
     * @return AsyncInvoker<ModifyPublicIpRequest, ModifyPublicIpResponse>
     */
    public AsyncInvoker<ModifyPublicIpRequest, ModifyPublicIpResponse> modifyPublicIpAsyncInvoker(
        ModifyPublicIpRequest request) {
        return new AsyncInvoker<ModifyPublicIpRequest, ModifyPublicIpResponse>(request,
            GaussDBforNoSQLMeta.modifyPublicIp, hcClient);
    }

    /**
     * 变更实例存储容量
     *
     * 变更实例的存储容量大小
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ModifyVolumeRequest 请求对象
     * @return CompletableFuture<ModifyVolumeResponse>
     */
    public CompletableFuture<ModifyVolumeResponse> modifyVolumeAsync(ModifyVolumeRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.modifyVolume);
    }

    /**
     * 变更实例存储容量
     *
     * 变更实例的存储容量大小
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ModifyVolumeRequest 请求对象
     * @return AsyncInvoker<ModifyVolumeRequest, ModifyVolumeResponse>
     */
    public AsyncInvoker<ModifyVolumeRequest, ModifyVolumeResponse> modifyVolumeAsyncInvoker(
        ModifyVolumeRequest request) {
        return new AsyncInvoker<ModifyVolumeRequest, ModifyVolumeResponse>(request, GaussDBforNoSQLMeta.modifyVolume,
            hcClient);
    }

    /**
     * 暂停/恢复具备容灾关系的实例数据同步
     *
     * 该接口用于暂停/恢复具备容灾关系的实例数据同步。
     * 
     * 该接口需要对具备容灾关系的两个实例分别各调用一次，2次接口都调用成功才能成功暂停/恢复容灾实例数据同步。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PauseResumeDataSynchronizationRequest 请求对象
     * @return CompletableFuture<PauseResumeDataSynchronizationResponse>
     */
    public CompletableFuture<PauseResumeDataSynchronizationResponse> pauseResumeDataSynchronizationAsync(
        PauseResumeDataSynchronizationRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.pauseResumeDataSynchronization);
    }

    /**
     * 暂停/恢复具备容灾关系的实例数据同步
     *
     * 该接口用于暂停/恢复具备容灾关系的实例数据同步。
     * 
     * 该接口需要对具备容灾关系的两个实例分别各调用一次，2次接口都调用成功才能成功暂停/恢复容灾实例数据同步。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param PauseResumeDataSynchronizationRequest 请求对象
     * @return AsyncInvoker<PauseResumeDataSynchronizationRequest, PauseResumeDataSynchronizationResponse>
     */
    public AsyncInvoker<PauseResumeDataSynchronizationRequest, PauseResumeDataSynchronizationResponse> pauseResumeDataSynchronizationAsyncInvoker(
        PauseResumeDataSynchronizationRequest request) {
        return new AsyncInvoker<PauseResumeDataSynchronizationRequest, PauseResumeDataSynchronizationResponse>(request,
            GaussDBforNoSQLMeta.pauseResumeDataSynchronization, hcClient);
    }

    /**
     * 重置Redis数据库账号密码
     *
     * 重置Redis数据库账号密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetDbUserPasswordRequest 请求对象
     * @return CompletableFuture<ResetDbUserPasswordResponse>
     */
    public CompletableFuture<ResetDbUserPasswordResponse> resetDbUserPasswordAsync(ResetDbUserPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.resetDbUserPassword);
    }

    /**
     * 重置Redis数据库账号密码
     *
     * 重置Redis数据库账号密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetDbUserPasswordRequest 请求对象
     * @return AsyncInvoker<ResetDbUserPasswordRequest, ResetDbUserPasswordResponse>
     */
    public AsyncInvoker<ResetDbUserPasswordRequest, ResetDbUserPasswordResponse> resetDbUserPasswordAsyncInvoker(
        ResetDbUserPasswordRequest request) {
        return new AsyncInvoker<ResetDbUserPasswordRequest, ResetDbUserPasswordResponse>(request,
            GaussDBforNoSQLMeta.resetDbUserPassword, hcClient);
    }

    /**
     * 修改实例的管理员密码
     *
     * 修改实例的管理员密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetPasswordRequest 请求对象
     * @return CompletableFuture<ResetPasswordResponse>
     */
    public CompletableFuture<ResetPasswordResponse> resetPasswordAsync(ResetPasswordRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.resetPassword);
    }

    /**
     * 修改实例的管理员密码
     *
     * 修改实例的管理员密码。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResetPasswordRequest 请求对象
     * @return AsyncInvoker<ResetPasswordRequest, ResetPasswordResponse>
     */
    public AsyncInvoker<ResetPasswordRequest, ResetPasswordResponse> resetPasswordAsyncInvoker(
        ResetPasswordRequest request) {
        return new AsyncInvoker<ResetPasswordRequest, ResetPasswordResponse>(request, GaussDBforNoSQLMeta.resetPassword,
            hcClient);
    }

    /**
     * 扩容冷数据存储
     *
     * 扩容冷数据存储。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResizeColdVolumeRequest 请求对象
     * @return CompletableFuture<ResizeColdVolumeResponse>
     */
    public CompletableFuture<ResizeColdVolumeResponse> resizeColdVolumeAsync(ResizeColdVolumeRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.resizeColdVolume);
    }

    /**
     * 扩容冷数据存储
     *
     * 扩容冷数据存储。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResizeColdVolumeRequest 请求对象
     * @return AsyncInvoker<ResizeColdVolumeRequest, ResizeColdVolumeResponse>
     */
    public AsyncInvoker<ResizeColdVolumeRequest, ResizeColdVolumeResponse> resizeColdVolumeAsyncInvoker(
        ResizeColdVolumeRequest request) {
        return new AsyncInvoker<ResizeColdVolumeRequest, ResizeColdVolumeResponse>(request,
            GaussDBforNoSQLMeta.resizeColdVolume, hcClient);
    }

    /**
     * 变更实例规格
     *
     * 变更实例的规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResizeInstanceRequest 请求对象
     * @return CompletableFuture<ResizeInstanceResponse>
     */
    public CompletableFuture<ResizeInstanceResponse> resizeInstanceAsync(ResizeInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.resizeInstance);
    }

    /**
     * 变更实例规格
     *
     * 变更实例的规格。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResizeInstanceRequest 请求对象
     * @return AsyncInvoker<ResizeInstanceRequest, ResizeInstanceResponse>
     */
    public AsyncInvoker<ResizeInstanceRequest, ResizeInstanceResponse> resizeInstanceAsyncInvoker(
        ResizeInstanceRequest request) {
        return new AsyncInvoker<ResizeInstanceRequest, ResizeInstanceResponse>(request,
            GaussDBforNoSQLMeta.resizeInstance, hcClient);
    }

    /**
     * 扩容实例存储容量
     *
     * 扩容实例的存储容量大小。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResizeInstanceVolumeRequest 请求对象
     * @return CompletableFuture<ResizeInstanceVolumeResponse>
     */
    public CompletableFuture<ResizeInstanceVolumeResponse> resizeInstanceVolumeAsync(
        ResizeInstanceVolumeRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.resizeInstanceVolume);
    }

    /**
     * 扩容实例存储容量
     *
     * 扩容实例的存储容量大小。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ResizeInstanceVolumeRequest 请求对象
     * @return AsyncInvoker<ResizeInstanceVolumeRequest, ResizeInstanceVolumeResponse>
     */
    public AsyncInvoker<ResizeInstanceVolumeRequest, ResizeInstanceVolumeResponse> resizeInstanceVolumeAsyncInvoker(
        ResizeInstanceVolumeRequest request) {
        return new AsyncInvoker<ResizeInstanceVolumeRequest, ResizeInstanceVolumeResponse>(request,
            GaussDBforNoSQLMeta.resizeInstanceVolume, hcClient);
    }

    /**
     * 重启实例的数据库服务
     *
     * 重启实例的数据库服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestartInstanceRequest 请求对象
     * @return CompletableFuture<RestartInstanceResponse>
     */
    public CompletableFuture<RestartInstanceResponse> restartInstanceAsync(RestartInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.restartInstance);
    }

    /**
     * 重启实例的数据库服务
     *
     * 重启实例的数据库服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestartInstanceRequest 请求对象
     * @return AsyncInvoker<RestartInstanceRequest, RestartInstanceResponse>
     */
    public AsyncInvoker<RestartInstanceRequest, RestartInstanceResponse> restartInstanceAsyncInvoker(
        RestartInstanceRequest request) {
        return new AsyncInvoker<RestartInstanceRequest, RestartInstanceResponse>(request,
            GaussDBforNoSQLMeta.restartInstance, hcClient);
    }

    /**
     * 恢复到已有实例
     *
     * 恢复到已有实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestoreExistingInstanceRequest 请求对象
     * @return CompletableFuture<RestoreExistingInstanceResponse>
     */
    public CompletableFuture<RestoreExistingInstanceResponse> restoreExistingInstanceAsync(
        RestoreExistingInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.restoreExistingInstance);
    }

    /**
     * 恢复到已有实例
     *
     * 恢复到已有实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestoreExistingInstanceRequest 请求对象
     * @return AsyncInvoker<RestoreExistingInstanceRequest, RestoreExistingInstanceResponse>
     */
    public AsyncInvoker<RestoreExistingInstanceRequest, RestoreExistingInstanceResponse> restoreExistingInstanceAsyncInvoker(
        RestoreExistingInstanceRequest request) {
        return new AsyncInvoker<RestoreExistingInstanceRequest, RestoreExistingInstanceResponse>(request,
            GaussDBforNoSQLMeta.restoreExistingInstance, hcClient);
    }

    /**
     * 设置磁盘自动扩容策略
     *
     * 设置磁盘自动扩容策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetAutoEnlargePolicyRequest 请求对象
     * @return CompletableFuture<SetAutoEnlargePolicyResponse>
     */
    public CompletableFuture<SetAutoEnlargePolicyResponse> setAutoEnlargePolicyAsync(
        SetAutoEnlargePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.setAutoEnlargePolicy);
    }

    /**
     * 设置磁盘自动扩容策略
     *
     * 设置磁盘自动扩容策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetAutoEnlargePolicyRequest 请求对象
     * @return AsyncInvoker<SetAutoEnlargePolicyRequest, SetAutoEnlargePolicyResponse>
     */
    public AsyncInvoker<SetAutoEnlargePolicyRequest, SetAutoEnlargePolicyResponse> setAutoEnlargePolicyAsyncInvoker(
        SetAutoEnlargePolicyRequest request) {
        return new AsyncInvoker<SetAutoEnlargePolicyRequest, SetAutoEnlargePolicyResponse>(request,
            GaussDBforNoSQLMeta.setAutoEnlargePolicy, hcClient);
    }

    /**
     * 设置自动备份策略
     *
     * 设置自动备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetBackupPolicyRequest 请求对象
     * @return CompletableFuture<SetBackupPolicyResponse>
     */
    public CompletableFuture<SetBackupPolicyResponse> setBackupPolicyAsync(SetBackupPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.setBackupPolicy);
    }

    /**
     * 设置自动备份策略
     *
     * 设置自动备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetBackupPolicyRequest 请求对象
     * @return AsyncInvoker<SetBackupPolicyRequest, SetBackupPolicyResponse>
     */
    public AsyncInvoker<SetBackupPolicyRequest, SetBackupPolicyResponse> setBackupPolicyAsyncInvoker(
        SetBackupPolicyRequest request) {
        return new AsyncInvoker<SetBackupPolicyRequest, SetBackupPolicyResponse>(request,
            GaussDBforNoSQLMeta.setBackupPolicy, hcClient);
    }

    /**
     * 设置回收策略
     *
     * 设置已删除实例保留天数，修改保留天数后删除的实例按照新的天数保留，修改之前已在回收站的实例保留天数不变。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetRecyclePolicyRequest 请求对象
     * @return CompletableFuture<SetRecyclePolicyResponse>
     */
    public CompletableFuture<SetRecyclePolicyResponse> setRecyclePolicyAsync(SetRecyclePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.setRecyclePolicy);
    }

    /**
     * 设置回收策略
     *
     * 设置已删除实例保留天数，修改保留天数后删除的实例按照新的天数保留，修改之前已在回收站的实例保留天数不变。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetRecyclePolicyRequest 请求对象
     * @return AsyncInvoker<SetRecyclePolicyRequest, SetRecyclePolicyResponse>
     */
    public AsyncInvoker<SetRecyclePolicyRequest, SetRecyclePolicyResponse> setRecyclePolicyAsyncInvoker(
        SetRecyclePolicyRequest request) {
        return new AsyncInvoker<SetRecyclePolicyRequest, SetRecyclePolicyResponse>(request,
            GaussDBforNoSQLMeta.setRecyclePolicy, hcClient);
    }

    /**
     * 查询备份列表
     *
     * 根据指定条件查询备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAllInstancesBackupsRequest 请求对象
     * @return CompletableFuture<ShowAllInstancesBackupsResponse>
     */
    public CompletableFuture<ShowAllInstancesBackupsResponse> showAllInstancesBackupsAsync(
        ShowAllInstancesBackupsRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.showAllInstancesBackups);
    }

    /**
     * 查询备份列表
     *
     * 根据指定条件查询备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAllInstancesBackupsRequest 请求对象
     * @return AsyncInvoker<ShowAllInstancesBackupsRequest, ShowAllInstancesBackupsResponse>
     */
    public AsyncInvoker<ShowAllInstancesBackupsRequest, ShowAllInstancesBackupsResponse> showAllInstancesBackupsAsyncInvoker(
        ShowAllInstancesBackupsRequest request) {
        return new AsyncInvoker<ShowAllInstancesBackupsRequest, ShowAllInstancesBackupsResponse>(request,
            GaussDBforNoSQLMeta.showAllInstancesBackups, hcClient);
    }

    /**
     * 查询备份列表（推荐）
     *
     * 根据指定条件查询备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAllInstancesBackupsNewRequest 请求对象
     * @return CompletableFuture<ShowAllInstancesBackupsNewResponse>
     */
    public CompletableFuture<ShowAllInstancesBackupsNewResponse> showAllInstancesBackupsNewAsync(
        ShowAllInstancesBackupsNewRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.showAllInstancesBackupsNew);
    }

    /**
     * 查询备份列表（推荐）
     *
     * 根据指定条件查询备份列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAllInstancesBackupsNewRequest 请求对象
     * @return AsyncInvoker<ShowAllInstancesBackupsNewRequest, ShowAllInstancesBackupsNewResponse>
     */
    public AsyncInvoker<ShowAllInstancesBackupsNewRequest, ShowAllInstancesBackupsNewResponse> showAllInstancesBackupsNewAsyncInvoker(
        ShowAllInstancesBackupsNewRequest request) {
        return new AsyncInvoker<ShowAllInstancesBackupsNewRequest, ShowAllInstancesBackupsNewResponse>(request,
            GaussDBforNoSQLMeta.showAllInstancesBackupsNew, hcClient);
    }

    /**
     * 查询参数模板可应用的实例列表
     *
     * 查询参数模板可应用的实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowApplicableInstancesRequest 请求对象
     * @return CompletableFuture<ShowApplicableInstancesResponse>
     */
    public CompletableFuture<ShowApplicableInstancesResponse> showApplicableInstancesAsync(
        ShowApplicableInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.showApplicableInstances);
    }

    /**
     * 查询参数模板可应用的实例列表
     *
     * 查询参数模板可应用的实例列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowApplicableInstancesRequest 请求对象
     * @return AsyncInvoker<ShowApplicableInstancesRequest, ShowApplicableInstancesResponse>
     */
    public AsyncInvoker<ShowApplicableInstancesRequest, ShowApplicableInstancesResponse> showApplicableInstancesAsyncInvoker(
        ShowApplicableInstancesRequest request) {
        return new AsyncInvoker<ShowApplicableInstancesRequest, ShowApplicableInstancesResponse>(request,
            GaussDBforNoSQLMeta.showApplicableInstances, hcClient);
    }

    /**
     * 查询参数模板应用历史
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowApplyHistoryRequest 请求对象
     * @return CompletableFuture<ShowApplyHistoryResponse>
     */
    public CompletableFuture<ShowApplyHistoryResponse> showApplyHistoryAsync(ShowApplyHistoryRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.showApplyHistory);
    }

    /**
     * 查询参数模板应用历史
     *
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowApplyHistoryRequest 请求对象
     * @return AsyncInvoker<ShowApplyHistoryRequest, ShowApplyHistoryResponse>
     */
    public AsyncInvoker<ShowApplyHistoryRequest, ShowApplyHistoryResponse> showApplyHistoryAsyncInvoker(
        ShowApplyHistoryRequest request) {
        return new AsyncInvoker<ShowApplyHistoryRequest, ShowApplyHistoryResponse>(request,
            GaussDBforNoSQLMeta.showApplyHistory, hcClient);
    }

    /**
     * 查询磁盘自动扩容策略
     *
     * 查询磁盘自动扩容策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAutoEnlargePolicyRequest 请求对象
     * @return CompletableFuture<ShowAutoEnlargePolicyResponse>
     */
    public CompletableFuture<ShowAutoEnlargePolicyResponse> showAutoEnlargePolicyAsync(
        ShowAutoEnlargePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.showAutoEnlargePolicy);
    }

    /**
     * 查询磁盘自动扩容策略
     *
     * 查询磁盘自动扩容策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAutoEnlargePolicyRequest 请求对象
     * @return AsyncInvoker<ShowAutoEnlargePolicyRequest, ShowAutoEnlargePolicyResponse>
     */
    public AsyncInvoker<ShowAutoEnlargePolicyRequest, ShowAutoEnlargePolicyResponse> showAutoEnlargePolicyAsyncInvoker(
        ShowAutoEnlargePolicyRequest request) {
        return new AsyncInvoker<ShowAutoEnlargePolicyRequest, ShowAutoEnlargePolicyResponse>(request,
            GaussDBforNoSQLMeta.showAutoEnlargePolicy, hcClient);
    }

    /**
     * 查询自动备份策略
     *
     * 查询自动备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBackupPolicyRequest 请求对象
     * @return CompletableFuture<ShowBackupPolicyResponse>
     */
    public CompletableFuture<ShowBackupPolicyResponse> showBackupPolicyAsync(ShowBackupPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.showBackupPolicy);
    }

    /**
     * 查询自动备份策略
     *
     * 查询自动备份策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowBackupPolicyRequest 请求对象
     * @return AsyncInvoker<ShowBackupPolicyRequest, ShowBackupPolicyResponse>
     */
    public AsyncInvoker<ShowBackupPolicyRequest, ShowBackupPolicyResponse> showBackupPolicyAsyncInvoker(
        ShowBackupPolicyRequest request) {
        return new AsyncInvoker<ShowBackupPolicyRequest, ShowBackupPolicyResponse>(request,
            GaussDBforNoSQLMeta.showBackupPolicy, hcClient);
    }

    /**
     * 获取指定参数模板的参数
     *
     * 获取指定参数模板的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowConfigurationDetailRequest 请求对象
     * @return CompletableFuture<ShowConfigurationDetailResponse>
     */
    public CompletableFuture<ShowConfigurationDetailResponse> showConfigurationDetailAsync(
        ShowConfigurationDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.showConfigurationDetail);
    }

    /**
     * 获取指定参数模板的参数
     *
     * 获取指定参数模板的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowConfigurationDetailRequest 请求对象
     * @return AsyncInvoker<ShowConfigurationDetailRequest, ShowConfigurationDetailResponse>
     */
    public AsyncInvoker<ShowConfigurationDetailRequest, ShowConfigurationDetailResponse> showConfigurationDetailAsyncInvoker(
        ShowConfigurationDetailRequest request) {
        return new AsyncInvoker<ShowConfigurationDetailRequest, ShowConfigurationDetailResponse>(request,
            GaussDBforNoSQLMeta.showConfigurationDetail, hcClient);
    }

    /**
     * 查询数据库错误日志信息
     *
     * 查询数据库错误日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowErrorLogRequest 请求对象
     * @return CompletableFuture<ShowErrorLogResponse>
     */
    public CompletableFuture<ShowErrorLogResponse> showErrorLogAsync(ShowErrorLogRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.showErrorLog);
    }

    /**
     * 查询数据库错误日志信息
     *
     * 查询数据库错误日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowErrorLogRequest 请求对象
     * @return AsyncInvoker<ShowErrorLogRequest, ShowErrorLogResponse>
     */
    public AsyncInvoker<ShowErrorLogRequest, ShowErrorLogResponse> showErrorLogAsyncInvoker(
        ShowErrorLogRequest request) {
        return new AsyncInvoker<ShowErrorLogRequest, ShowErrorLogResponse>(request, GaussDBforNoSQLMeta.showErrorLog,
            hcClient);
    }

    /**
     * 获取指定实例的参数
     *
     * 获取指定实例的参数信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowInstanceConfigurationRequest 请求对象
     * @return CompletableFuture<ShowInstanceConfigurationResponse>
     */
    public CompletableFuture<ShowInstanceConfigurationResponse> showInstanceConfigurationAsync(
        ShowInstanceConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.showInstanceConfiguration);
    }

    /**
     * 获取指定实例的参数
     *
     * 获取指定实例的参数信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowInstanceConfigurationRequest 请求对象
     * @return AsyncInvoker<ShowInstanceConfigurationRequest, ShowInstanceConfigurationResponse>
     */
    public AsyncInvoker<ShowInstanceConfigurationRequest, ShowInstanceConfigurationResponse> showInstanceConfigurationAsyncInvoker(
        ShowInstanceConfigurationRequest request) {
        return new AsyncInvoker<ShowInstanceConfigurationRequest, ShowInstanceConfigurationResponse>(request,
            GaussDBforNoSQLMeta.showInstanceConfiguration, hcClient);
    }

    /**
     * 获取容灾实例主/备角色信息
     *
     * 该接口用于获取容灾实例主/备角色信息，以便后续容灾实例备升主和容灾实例主降备接口调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowInstanceRoleRequest 请求对象
     * @return CompletableFuture<ShowInstanceRoleResponse>
     */
    public CompletableFuture<ShowInstanceRoleResponse> showInstanceRoleAsync(ShowInstanceRoleRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.showInstanceRole);
    }

    /**
     * 获取容灾实例主/备角色信息
     *
     * 该接口用于获取容灾实例主/备角色信息，以便后续容灾实例备升主和容灾实例主降备接口调用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowInstanceRoleRequest 请求对象
     * @return AsyncInvoker<ShowInstanceRoleRequest, ShowInstanceRoleResponse>
     */
    public AsyncInvoker<ShowInstanceRoleRequest, ShowInstanceRoleResponse> showInstanceRoleAsyncInvoker(
        ShowInstanceRoleRequest request) {
        return new AsyncInvoker<ShowInstanceRoleRequest, ShowInstanceRoleResponse>(request,
            GaussDBforNoSQLMeta.showInstanceRole, hcClient);
    }

    /**
     * 查询创建实例或扩容节点时需要的IP数量
     *
     * 查询创建实例或扩容节点时需要的IP数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowIpNumRequirementRequest 请求对象
     * @return CompletableFuture<ShowIpNumRequirementResponse>
     */
    public CompletableFuture<ShowIpNumRequirementResponse> showIpNumRequirementAsync(
        ShowIpNumRequirementRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.showIpNumRequirement);
    }

    /**
     * 查询创建实例或扩容节点时需要的IP数量
     *
     * 查询创建实例或扩容节点时需要的IP数量
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowIpNumRequirementRequest 请求对象
     * @return AsyncInvoker<ShowIpNumRequirementRequest, ShowIpNumRequirementResponse>
     */
    public AsyncInvoker<ShowIpNumRequirementRequest, ShowIpNumRequirementResponse> showIpNumRequirementAsyncInvoker(
        ShowIpNumRequirementRequest request) {
        return new AsyncInvoker<ShowIpNumRequirementRequest, ShowIpNumRequirementResponse>(request,
            GaussDBforNoSQLMeta.showIpNumRequirement, hcClient);
    }

    /**
     * 查询实例参数的修改历史
     *
     * 查询实例参数的修改历史
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowModifyHistoryRequest 请求对象
     * @return CompletableFuture<ShowModifyHistoryResponse>
     */
    public CompletableFuture<ShowModifyHistoryResponse> showModifyHistoryAsync(ShowModifyHistoryRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.showModifyHistory);
    }

    /**
     * 查询实例参数的修改历史
     *
     * 查询实例参数的修改历史
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowModifyHistoryRequest 请求对象
     * @return AsyncInvoker<ShowModifyHistoryRequest, ShowModifyHistoryResponse>
     */
    public AsyncInvoker<ShowModifyHistoryRequest, ShowModifyHistoryResponse> showModifyHistoryAsyncInvoker(
        ShowModifyHistoryRequest request) {
        return new AsyncInvoker<ShowModifyHistoryRequest, ShowModifyHistoryResponse>(request,
            GaussDBforNoSQLMeta.showModifyHistory, hcClient);
    }

    /**
     * 获取容灾实例数据同步状态
     *
     * 获取容灾实例数据同步状态，主备实例id，数据同步指标值，以及倒换和切换场景下的RPO，RTO指标值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPauseResumeStutusRequest 请求对象
     * @return CompletableFuture<ShowPauseResumeStutusResponse>
     */
    public CompletableFuture<ShowPauseResumeStutusResponse> showPauseResumeStutusAsync(
        ShowPauseResumeStutusRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.showPauseResumeStutus);
    }

    /**
     * 获取容灾实例数据同步状态
     *
     * 获取容灾实例数据同步状态，主备实例id，数据同步指标值，以及倒换和切换场景下的RPO，RTO指标值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPauseResumeStutusRequest 请求对象
     * @return AsyncInvoker<ShowPauseResumeStutusRequest, ShowPauseResumeStutusResponse>
     */
    public AsyncInvoker<ShowPauseResumeStutusRequest, ShowPauseResumeStutusResponse> showPauseResumeStutusAsyncInvoker(
        ShowPauseResumeStutusRequest request) {
        return new AsyncInvoker<ShowPauseResumeStutusRequest, ShowPauseResumeStutusResponse>(request,
            GaussDBforNoSQLMeta.showPauseResumeStutus, hcClient);
    }

    /**
     * 查询配额
     *
     * 查询单租户在GaussDBforNoSQL服务下的资源配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowQuotasRequest 请求对象
     * @return CompletableFuture<ShowQuotasResponse>
     */
    public CompletableFuture<ShowQuotasResponse> showQuotasAsync(ShowQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.showQuotas);
    }

    /**
     * 查询配额
     *
     * 查询单租户在GaussDBforNoSQL服务下的资源配额。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowQuotasRequest 请求对象
     * @return AsyncInvoker<ShowQuotasRequest, ShowQuotasResponse>
     */
    public AsyncInvoker<ShowQuotasRequest, ShowQuotasResponse> showQuotasAsyncInvoker(ShowQuotasRequest request) {
        return new AsyncInvoker<ShowQuotasRequest, ShowQuotasResponse>(request, GaussDBforNoSQLMeta.showQuotas,
            hcClient);
    }

    /**
     * 查询回收策略
     *
     * 查询回收策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRecyclePolicyRequest 请求对象
     * @return CompletableFuture<ShowRecyclePolicyResponse>
     */
    public CompletableFuture<ShowRecyclePolicyResponse> showRecyclePolicyAsync(ShowRecyclePolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.showRecyclePolicy);
    }

    /**
     * 查询回收策略
     *
     * 查询回收策略。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRecyclePolicyRequest 请求对象
     * @return AsyncInvoker<ShowRecyclePolicyRequest, ShowRecyclePolicyResponse>
     */
    public AsyncInvoker<ShowRecyclePolicyRequest, ShowRecyclePolicyResponse> showRecyclePolicyAsyncInvoker(
        ShowRecyclePolicyRequest request) {
        return new AsyncInvoker<ShowRecyclePolicyRequest, ShowRecyclePolicyResponse>(request,
            GaussDBforNoSQLMeta.showRecyclePolicy, hcClient);
    }

    /**
     * 查询可恢复的实例列表
     *
     * 查询用户可恢复的实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRestorableListRequest 请求对象
     * @return CompletableFuture<ShowRestorableListResponse>
     */
    public CompletableFuture<ShowRestorableListResponse> showRestorableListAsync(ShowRestorableListRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.showRestorableList);
    }

    /**
     * 查询可恢复的实例列表
     *
     * 查询用户可恢复的实例列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRestorableListRequest 请求对象
     * @return AsyncInvoker<ShowRestorableListRequest, ShowRestorableListResponse>
     */
    public AsyncInvoker<ShowRestorableListRequest, ShowRestorableListResponse> showRestorableListAsyncInvoker(
        ShowRestorableListRequest request) {
        return new AsyncInvoker<ShowRestorableListRequest, ShowRestorableListResponse>(request,
            GaussDBforNoSQLMeta.showRestorableList, hcClient);
    }

    /**
     * 查询慢日志脱敏状态
     *
     * 查询慢日志脱敏状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSlowLogDesensitizationRequest 请求对象
     * @return CompletableFuture<ShowSlowLogDesensitizationResponse>
     */
    public CompletableFuture<ShowSlowLogDesensitizationResponse> showSlowLogDesensitizationAsync(
        ShowSlowLogDesensitizationRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.showSlowLogDesensitization);
    }

    /**
     * 查询慢日志脱敏状态
     *
     * 查询慢日志脱敏状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowSlowLogDesensitizationRequest 请求对象
     * @return AsyncInvoker<ShowSlowLogDesensitizationRequest, ShowSlowLogDesensitizationResponse>
     */
    public AsyncInvoker<ShowSlowLogDesensitizationRequest, ShowSlowLogDesensitizationResponse> showSlowLogDesensitizationAsyncInvoker(
        ShowSlowLogDesensitizationRequest request) {
        return new AsyncInvoker<ShowSlowLogDesensitizationRequest, ShowSlowLogDesensitizationResponse>(request,
            GaussDBforNoSQLMeta.showSlowLogDesensitization, hcClient);
    }

    /**
     * 缩容指定集群实例的节点数量
     *
     * 缩容指定集群实例的节点数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShrinkInstanceNodeRequest 请求对象
     * @return CompletableFuture<ShrinkInstanceNodeResponse>
     */
    public CompletableFuture<ShrinkInstanceNodeResponse> shrinkInstanceNodeAsync(ShrinkInstanceNodeRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.shrinkInstanceNode);
    }

    /**
     * 缩容指定集群实例的节点数量
     *
     * 缩容指定集群实例的节点数量。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShrinkInstanceNodeRequest 请求对象
     * @return AsyncInvoker<ShrinkInstanceNodeRequest, ShrinkInstanceNodeResponse>
     */
    public AsyncInvoker<ShrinkInstanceNodeRequest, ShrinkInstanceNodeResponse> shrinkInstanceNodeAsyncInvoker(
        ShrinkInstanceNodeRequest request) {
        return new AsyncInvoker<ShrinkInstanceNodeRequest, ShrinkInstanceNodeResponse>(request,
            GaussDBforNoSQLMeta.shrinkInstanceNode, hcClient);
    }

    /**
     * 设置慢日志脱敏状态
     *
     * 设置慢日志脱敏状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SwitchSlowlogDesensitizationRequest 请求对象
     * @return CompletableFuture<SwitchSlowlogDesensitizationResponse>
     */
    public CompletableFuture<SwitchSlowlogDesensitizationResponse> switchSlowlogDesensitizationAsync(
        SwitchSlowlogDesensitizationRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.switchSlowlogDesensitization);
    }

    /**
     * 设置慢日志脱敏状态
     *
     * 设置慢日志脱敏状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SwitchSlowlogDesensitizationRequest 请求对象
     * @return AsyncInvoker<SwitchSlowlogDesensitizationRequest, SwitchSlowlogDesensitizationResponse>
     */
    public AsyncInvoker<SwitchSlowlogDesensitizationRequest, SwitchSlowlogDesensitizationResponse> switchSlowlogDesensitizationAsyncInvoker(
        SwitchSlowlogDesensitizationRequest request) {
        return new AsyncInvoker<SwitchSlowlogDesensitizationRequest, SwitchSlowlogDesensitizationResponse>(request,
            GaussDBforNoSQLMeta.switchSlowlogDesensitization, hcClient);
    }

    /**
     * 切换实例SSL开关
     *
     * 切换实例SSL开关。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SwitchSslRequest 请求对象
     * @return CompletableFuture<SwitchSslResponse>
     */
    public CompletableFuture<SwitchSslResponse> switchSslAsync(SwitchSslRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.switchSsl);
    }

    /**
     * 切换实例SSL开关
     *
     * 切换实例SSL开关。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SwitchSslRequest 请求对象
     * @return AsyncInvoker<SwitchSslRequest, SwitchSslResponse>
     */
    public AsyncInvoker<SwitchSslRequest, SwitchSslResponse> switchSslAsyncInvoker(SwitchSslRequest request) {
        return new AsyncInvoker<SwitchSslRequest, SwitchSslResponse>(request, GaussDBforNoSQLMeta.switchSsl, hcClient);
    }

    /**
     * 容灾实例备升主
     *
     * 该接口用于对已经搭建容灾关系的实例，将备实例升级为主实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SwitchToMasterRequest 请求对象
     * @return CompletableFuture<SwitchToMasterResponse>
     */
    public CompletableFuture<SwitchToMasterResponse> switchToMasterAsync(SwitchToMasterRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.switchToMaster);
    }

    /**
     * 容灾实例备升主
     *
     * 该接口用于对已经搭建容灾关系的实例，将备实例升级为主实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SwitchToMasterRequest 请求对象
     * @return AsyncInvoker<SwitchToMasterRequest, SwitchToMasterResponse>
     */
    public AsyncInvoker<SwitchToMasterRequest, SwitchToMasterResponse> switchToMasterAsyncInvoker(
        SwitchToMasterRequest request) {
        return new AsyncInvoker<SwitchToMasterRequest, SwitchToMasterResponse>(request,
            GaussDBforNoSQLMeta.switchToMaster, hcClient);
    }

    /**
     * 容灾实例主降备
     *
     * 该接口用于对已经搭建容灾关系的实例，将主实例降级为备实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SwitchToSlaveRequest 请求对象
     * @return CompletableFuture<SwitchToSlaveResponse>
     */
    public CompletableFuture<SwitchToSlaveResponse> switchToSlaveAsync(SwitchToSlaveRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.switchToSlave);
    }

    /**
     * 容灾实例主降备
     *
     * 该接口用于对已经搭建容灾关系的实例，将主实例降级为备实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SwitchToSlaveRequest 请求对象
     * @return AsyncInvoker<SwitchToSlaveRequest, SwitchToSlaveResponse>
     */
    public AsyncInvoker<SwitchToSlaveRequest, SwitchToSlaveResponse> switchToSlaveAsyncInvoker(
        SwitchToSlaveRequest request) {
        return new AsyncInvoker<SwitchToSlaveRequest, SwitchToSlaveResponse>(request, GaussDBforNoSQLMeta.switchToSlave,
            hcClient);
    }

    /**
     * 修改副本集跨网段访问配置
     *
     * 修改副本集跨网段访问配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateClientNetworkRequest 请求对象
     * @return CompletableFuture<UpdateClientNetworkResponse>
     */
    public CompletableFuture<UpdateClientNetworkResponse> updateClientNetworkAsync(UpdateClientNetworkRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.updateClientNetwork);
    }

    /**
     * 修改副本集跨网段访问配置
     *
     * 修改副本集跨网段访问配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateClientNetworkRequest 请求对象
     * @return AsyncInvoker<UpdateClientNetworkRequest, UpdateClientNetworkResponse>
     */
    public AsyncInvoker<UpdateClientNetworkRequest, UpdateClientNetworkResponse> updateClientNetworkAsyncInvoker(
        UpdateClientNetworkRequest request) {
        return new AsyncInvoker<UpdateClientNetworkRequest, UpdateClientNetworkResponse>(request,
            GaussDBforNoSQLMeta.updateClientNetwork, hcClient);
    }

    /**
     * 修改参数模板参数
     *
     * 修改参数模板参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateConfigurationRequest 请求对象
     * @return CompletableFuture<UpdateConfigurationResponse>
     */
    public CompletableFuture<UpdateConfigurationResponse> updateConfigurationAsync(UpdateConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.updateConfiguration);
    }

    /**
     * 修改参数模板参数
     *
     * 修改参数模板参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateConfigurationRequest 请求对象
     * @return AsyncInvoker<UpdateConfigurationRequest, UpdateConfigurationResponse>
     */
    public AsyncInvoker<UpdateConfigurationRequest, UpdateConfigurationResponse> updateConfigurationAsyncInvoker(
        UpdateConfigurationRequest request) {
        return new AsyncInvoker<UpdateConfigurationRequest, UpdateConfigurationResponse>(request,
            GaussDBforNoSQLMeta.updateConfiguration, hcClient);
    }

    /**
     * 修改指定实例的参数
     *
     * 修改指定实例的参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateInstanceConfigurationRequest 请求对象
     * @return CompletableFuture<UpdateInstanceConfigurationResponse>
     */
    public CompletableFuture<UpdateInstanceConfigurationResponse> updateInstanceConfigurationAsync(
        UpdateInstanceConfigurationRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.updateInstanceConfiguration);
    }

    /**
     * 修改指定实例的参数
     *
     * 修改指定实例的参数。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateInstanceConfigurationRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceConfigurationRequest, UpdateInstanceConfigurationResponse>
     */
    public AsyncInvoker<UpdateInstanceConfigurationRequest, UpdateInstanceConfigurationResponse> updateInstanceConfigurationAsyncInvoker(
        UpdateInstanceConfigurationRequest request) {
        return new AsyncInvoker<UpdateInstanceConfigurationRequest, UpdateInstanceConfigurationResponse>(request,
            GaussDBforNoSQLMeta.updateInstanceConfiguration, hcClient);
    }

    /**
     * 修改实例名称
     *
     * 修改实例名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateInstanceNameRequest 请求对象
     * @return CompletableFuture<UpdateInstanceNameResponse>
     */
    public CompletableFuture<UpdateInstanceNameResponse> updateInstanceNameAsync(UpdateInstanceNameRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.updateInstanceName);
    }

    /**
     * 修改实例名称
     *
     * 修改实例名称
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateInstanceNameRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceNameRequest, UpdateInstanceNameResponse>
     */
    public AsyncInvoker<UpdateInstanceNameRequest, UpdateInstanceNameResponse> updateInstanceNameAsyncInvoker(
        UpdateInstanceNameRequest request) {
        return new AsyncInvoker<UpdateInstanceNameRequest, UpdateInstanceNameResponse>(request,
            GaussDBforNoSQLMeta.updateInstanceName, hcClient);
    }

    /**
     * 变更实例安全组
     *
     * 变更实例关联的安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSecurityGroupRequest 请求对象
     * @return CompletableFuture<UpdateSecurityGroupResponse>
     */
    public CompletableFuture<UpdateSecurityGroupResponse> updateSecurityGroupAsync(UpdateSecurityGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.updateSecurityGroup);
    }

    /**
     * 变更实例安全组
     *
     * 变更实例关联的安全组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateSecurityGroupRequest 请求对象
     * @return AsyncInvoker<UpdateSecurityGroupRequest, UpdateSecurityGroupResponse>
     */
    public AsyncInvoker<UpdateSecurityGroupRequest, UpdateSecurityGroupResponse> updateSecurityGroupAsyncInvoker(
        UpdateSecurityGroupRequest request) {
        return new AsyncInvoker<UpdateSecurityGroupRequest, UpdateSecurityGroupResponse>(request,
            GaussDBforNoSQLMeta.updateSecurityGroup, hcClient);
    }

    /**
     * 数据库补丁升级
     *
     * 升级数据库补丁版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpgradeDbVersionRequest 请求对象
     * @return CompletableFuture<UpgradeDbVersionResponse>
     */
    public CompletableFuture<UpgradeDbVersionResponse> upgradeDbVersionAsync(UpgradeDbVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.upgradeDbVersion);
    }

    /**
     * 数据库补丁升级
     *
     * 升级数据库补丁版本
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpgradeDbVersionRequest 请求对象
     * @return AsyncInvoker<UpgradeDbVersionRequest, UpgradeDbVersionResponse>
     */
    public AsyncInvoker<UpgradeDbVersionRequest, UpgradeDbVersionResponse> upgradeDbVersionAsyncInvoker(
        UpgradeDbVersionRequest request) {
        return new AsyncInvoker<UpgradeDbVersionRequest, UpgradeDbVersionResponse>(request,
            GaussDBforNoSQLMeta.upgradeDbVersion, hcClient);
    }

    /**
     * 查询当前支持的API版本信息列表
     *
     * 查询当前支持的API版本信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApiVersionRequest 请求对象
     * @return CompletableFuture<ListApiVersionResponse>
     */
    public CompletableFuture<ListApiVersionResponse> listApiVersionAsync(ListApiVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.listApiVersion);
    }

    /**
     * 查询当前支持的API版本信息列表
     *
     * 查询当前支持的API版本信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApiVersionRequest 请求对象
     * @return AsyncInvoker<ListApiVersionRequest, ListApiVersionResponse>
     */
    public AsyncInvoker<ListApiVersionRequest, ListApiVersionResponse> listApiVersionAsyncInvoker(
        ListApiVersionRequest request) {
        return new AsyncInvoker<ListApiVersionRequest, ListApiVersionResponse>(request,
            GaussDBforNoSQLMeta.listApiVersion, hcClient);
    }

    /**
     * 查询指定API版本信息
     *
     * 查询指定API版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowApiVersionRequest 请求对象
     * @return CompletableFuture<ShowApiVersionResponse>
     */
    public CompletableFuture<ShowApiVersionResponse> showApiVersionAsync(ShowApiVersionRequest request) {
        return hcClient.asyncInvokeHttp(request, GaussDBforNoSQLMeta.showApiVersion);
    }

    /**
     * 查询指定API版本信息
     *
     * 查询指定API版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowApiVersionRequest 请求对象
     * @return AsyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse>
     */
    public AsyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse> showApiVersionAsyncInvoker(
        ShowApiVersionRequest request) {
        return new AsyncInvoker<ShowApiVersionRequest, ShowApiVersionResponse>(request,
            GaussDBforNoSQLMeta.showApiVersion, hcClient);
    }

}
