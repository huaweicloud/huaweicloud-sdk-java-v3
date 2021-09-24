package com.huaweicloud.sdk.gaussdbforopengauss.v3;

import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.gaussdbforopengauss.v3.model.*;

public class GaussDBforopenGaussClient {
    protected HcClient hcClient;

    public GaussDBforopenGaussClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<GaussDBforopenGaussClient> newBuilder() {
        return new ClientBuilder<>(GaussDBforopenGaussClient::new);
    }


    /**
     * 创建数据库实例
     * 创建数据库实例
     *
     * @param CreateInstanceRequest 请求对象
     * @return CreateInstanceResponse
     */
    public CreateInstanceResponse createInstance(CreateInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.createInstance);
    }

    /**
     * 创建数据库实例
     * 创建数据库实例
     *
     * @param CreateInstanceRequest 请求对象
     * @return SyncInvoker<CreateInstanceRequest, CreateInstanceResponse>
     */
    public SyncInvoker<CreateInstanceRequest, CreateInstanceResponse> createInstanceInvoker(CreateInstanceRequest request) {
        return new SyncInvoker<CreateInstanceRequest, CreateInstanceResponse>(request, GaussDBforopenGaussMeta.createInstance, hcClient);
    }

    /**
     * 删除实例
     * 删除数据库实例。
     *
     * @param DeleteInstanceRequest 请求对象
     * @return DeleteInstanceResponse
     */
    public DeleteInstanceResponse deleteInstance(DeleteInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.deleteInstance);
    }

    /**
     * 删除实例
     * 删除数据库实例。
     *
     * @param DeleteInstanceRequest 请求对象
     * @return SyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>
     */
    public SyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstanceInvoker(DeleteInstanceRequest request) {
        return new SyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>(request, GaussDBforopenGaussMeta.deleteInstance, hcClient);
    }

    /**
     * 查询数据库实例列表/查询实例详情
     * 查询数据库实例列表/查询实例详情
     *
     * @param ListInstancesRequest 请求对象
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstances(ListInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.listInstances);
    }

    /**
     * 查询数据库实例列表/查询实例详情
     * 查询数据库实例列表/查询实例详情
     *
     * @param ListInstancesRequest 请求对象
     * @return SyncInvoker<ListInstancesRequest, ListInstancesResponse>
     */
    public SyncInvoker<ListInstancesRequest, ListInstancesResponse> listInstancesInvoker(ListInstancesRequest request) {
        return new SyncInvoker<ListInstancesRequest, ListInstancesResponse>(request, GaussDBforopenGaussMeta.listInstances, hcClient);
    }

    /**
     * 重置数据库密码。
     * 重置数据库密码。
     *
     * @param ResetPwdRequest 请求对象
     * @return ResetPwdResponse
     */
    public ResetPwdResponse resetPwd(ResetPwdRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.resetPwd);
    }

    /**
     * 重置数据库密码。
     * 重置数据库密码。
     *
     * @param ResetPwdRequest 请求对象
     * @return SyncInvoker<ResetPwdRequest, ResetPwdResponse>
     */
    public SyncInvoker<ResetPwdRequest, ResetPwdResponse> resetPwdInvoker(ResetPwdRequest request) {
        return new SyncInvoker<ResetPwdRequest, ResetPwdResponse>(request, GaussDBforopenGaussMeta.resetPwd, hcClient);
    }

    /**
     * CN横向扩容/DN分片扩容/磁盘扩容
     * CN横向扩容/DN分片扩容/磁盘扩容
     *
     * @param RunInstanceActionRequest 请求对象
     * @return RunInstanceActionResponse
     */
    public RunInstanceActionResponse runInstanceAction(RunInstanceActionRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.runInstanceAction);
    }

    /**
     * CN横向扩容/DN分片扩容/磁盘扩容
     * CN横向扩容/DN分片扩容/磁盘扩容
     *
     * @param RunInstanceActionRequest 请求对象
     * @return SyncInvoker<RunInstanceActionRequest, RunInstanceActionResponse>
     */
    public SyncInvoker<RunInstanceActionRequest, RunInstanceActionResponse> runInstanceActionInvoker(RunInstanceActionRequest request) {
        return new SyncInvoker<RunInstanceActionRequest, RunInstanceActionResponse>(request, GaussDBforopenGaussMeta.runInstanceAction, hcClient);
    }

    /**
     * 设置自动备份策略。
     * 设置自动备份策略。
     *
     * @param SetBackupPolicyRequest 请求对象
     * @return SetBackupPolicyResponse
     */
    public SetBackupPolicyResponse setBackupPolicy(SetBackupPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.setBackupPolicy);
    }

    /**
     * 设置自动备份策略。
     * 设置自动备份策略。
     *
     * @param SetBackupPolicyRequest 请求对象
     * @return SyncInvoker<SetBackupPolicyRequest, SetBackupPolicyResponse>
     */
    public SyncInvoker<SetBackupPolicyRequest, SetBackupPolicyResponse> setBackupPolicyInvoker(SetBackupPolicyRequest request) {
        return new SyncInvoker<SetBackupPolicyRequest, SetBackupPolicyResponse>(request, GaussDBforopenGaussMeta.setBackupPolicy, hcClient);
    }

    /**
     * 修改指定实例的参数
     * 修改指定实例的参数。
     *
     * @param UpdateInstanceConfigurationRequest 请求对象
     * @return UpdateInstanceConfigurationResponse
     */
    public UpdateInstanceConfigurationResponse updateInstanceConfiguration(UpdateInstanceConfigurationRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.updateInstanceConfiguration);
    }

    /**
     * 修改指定实例的参数
     * 修改指定实例的参数。
     *
     * @param UpdateInstanceConfigurationRequest 请求对象
     * @return SyncInvoker<UpdateInstanceConfigurationRequest, UpdateInstanceConfigurationResponse>
     */
    public SyncInvoker<UpdateInstanceConfigurationRequest, UpdateInstanceConfigurationResponse> updateInstanceConfigurationInvoker(UpdateInstanceConfigurationRequest request) {
        return new SyncInvoker<UpdateInstanceConfigurationRequest, UpdateInstanceConfigurationResponse>(request, GaussDBforopenGaussMeta.updateInstanceConfiguration, hcClient);
    }

    /**
     * 修改实例名称
     * 修改实例名称。
     *
     * @param UpdateInstanceNameRequest 请求对象
     * @return UpdateInstanceNameResponse
     */
    public UpdateInstanceNameResponse updateInstanceName(UpdateInstanceNameRequest request) {
        return hcClient.syncInvokeHttp(request, GaussDBforopenGaussMeta.updateInstanceName);
    }

    /**
     * 修改实例名称
     * 修改实例名称。
     *
     * @param UpdateInstanceNameRequest 请求对象
     * @return SyncInvoker<UpdateInstanceNameRequest, UpdateInstanceNameResponse>
     */
    public SyncInvoker<UpdateInstanceNameRequest, UpdateInstanceNameResponse> updateInstanceNameInvoker(UpdateInstanceNameRequest request) {
        return new SyncInvoker<UpdateInstanceNameRequest, UpdateInstanceNameResponse>(request, GaussDBforopenGaussMeta.updateInstanceName, hcClient);
    }

}