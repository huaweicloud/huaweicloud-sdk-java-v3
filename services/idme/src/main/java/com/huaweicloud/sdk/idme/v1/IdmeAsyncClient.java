package com.huaweicloud.sdk.idme.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.idme.v1.model.CreateXdmApplicationRequest;
import com.huaweicloud.sdk.idme.v1.model.CreateXdmApplicationResponse;
import com.huaweicloud.sdk.idme.v1.model.DeleteXdmApplicationRequest;
import com.huaweicloud.sdk.idme.v1.model.DeleteXdmApplicationResponse;
import com.huaweicloud.sdk.idme.v1.model.DeployApplicationRequest;
import com.huaweicloud.sdk.idme.v1.model.DeployApplicationResponse;
import com.huaweicloud.sdk.idme.v1.model.ListAppsRequest;
import com.huaweicloud.sdk.idme.v1.model.ListAppsResponse;
import com.huaweicloud.sdk.idme.v1.model.ListEnvsRequest;
import com.huaweicloud.sdk.idme.v1.model.ListEnvsResponse;
import com.huaweicloud.sdk.idme.v1.model.ModifyApplicationRequest;
import com.huaweicloud.sdk.idme.v1.model.ModifyApplicationResponse;
import com.huaweicloud.sdk.idme.v1.model.UninstallRequest;
import com.huaweicloud.sdk.idme.v1.model.UninstallResponse;

import java.util.concurrent.CompletableFuture;

public class IdmeAsyncClient {

    protected HcClient hcClient;

    public IdmeAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<IdmeAsyncClient> newBuilder() {
        ClientBuilder<IdmeAsyncClient> clientBuilder = new ClientBuilder<>(IdmeAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 创建应用
     *
     * 本接口用于创建工业数字模型驱动引擎（Industrial Digital Model Engine，简称iDME）的应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateXdmApplicationRequest 请求对象
     * @return CompletableFuture<CreateXdmApplicationResponse>
     */
    public CompletableFuture<CreateXdmApplicationResponse> createXdmApplicationAsync(
        CreateXdmApplicationRequest request) {
        return hcClient.asyncInvokeHttp(request, IdmeMeta.createXdmApplication);
    }

    /**
     * 创建应用
     *
     * 本接口用于创建工业数字模型驱动引擎（Industrial Digital Model Engine，简称iDME）的应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateXdmApplicationRequest 请求对象
     * @return AsyncInvoker<CreateXdmApplicationRequest, CreateXdmApplicationResponse>
     */
    public AsyncInvoker<CreateXdmApplicationRequest, CreateXdmApplicationResponse> createXdmApplicationAsyncInvoker(
        CreateXdmApplicationRequest request) {
        return new AsyncInvoker<>(request, IdmeMeta.createXdmApplication, hcClient);
    }

    /**
     * 删除应用
     *
     * 本接口用于删除工业数字模型驱动引擎（Industrial Digital Model Engine，简称iDME）的应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteXdmApplicationRequest 请求对象
     * @return CompletableFuture<DeleteXdmApplicationResponse>
     */
    public CompletableFuture<DeleteXdmApplicationResponse> deleteXdmApplicationAsync(
        DeleteXdmApplicationRequest request) {
        return hcClient.asyncInvokeHttp(request, IdmeMeta.deleteXdmApplication);
    }

    /**
     * 删除应用
     *
     * 本接口用于删除工业数字模型驱动引擎（Industrial Digital Model Engine，简称iDME）的应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteXdmApplicationRequest 请求对象
     * @return AsyncInvoker<DeleteXdmApplicationRequest, DeleteXdmApplicationResponse>
     */
    public AsyncInvoker<DeleteXdmApplicationRequest, DeleteXdmApplicationResponse> deleteXdmApplicationAsyncInvoker(
        DeleteXdmApplicationRequest request) {
        return new AsyncInvoker<>(request, IdmeMeta.deleteXdmApplication, hcClient);
    }

    /**
     * 部署应用
     *
     * 本接口用于部署工业数字模型驱动引擎（Industrial Digital Model Engine，简称iDME）的应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeployApplicationRequest 请求对象
     * @return CompletableFuture<DeployApplicationResponse>
     */
    public CompletableFuture<DeployApplicationResponse> deployApplicationAsync(DeployApplicationRequest request) {
        return hcClient.asyncInvokeHttp(request, IdmeMeta.deployApplication);
    }

    /**
     * 部署应用
     *
     * 本接口用于部署工业数字模型驱动引擎（Industrial Digital Model Engine，简称iDME）的应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeployApplicationRequest 请求对象
     * @return AsyncInvoker<DeployApplicationRequest, DeployApplicationResponse>
     */
    public AsyncInvoker<DeployApplicationRequest, DeployApplicationResponse> deployApplicationAsyncInvoker(
        DeployApplicationRequest request) {
        return new AsyncInvoker<>(request, IdmeMeta.deployApplication, hcClient);
    }

    /**
     * 获取租户下的应用清单
     *
     * 本接口用于获取租户在工业数字模型驱动引擎（Industrial Digital Model Engine，简称iDME）的应用清单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppsRequest 请求对象
     * @return CompletableFuture<ListAppsResponse>
     */
    public CompletableFuture<ListAppsResponse> listAppsAsync(ListAppsRequest request) {
        return hcClient.asyncInvokeHttp(request, IdmeMeta.listApps);
    }

    /**
     * 获取租户下的应用清单
     *
     * 本接口用于获取租户在工业数字模型驱动引擎（Industrial Digital Model Engine，简称iDME）的应用清单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppsRequest 请求对象
     * @return AsyncInvoker<ListAppsRequest, ListAppsResponse>
     */
    public AsyncInvoker<ListAppsRequest, ListAppsResponse> listAppsAsyncInvoker(ListAppsRequest request) {
        return new AsyncInvoker<>(request, IdmeMeta.listApps, hcClient);
    }

    /**
     * 获取运行服务清单
     *
     * 本接口用于获取租户在工业数字模型驱动引擎（Industrial Digital Model Engine，简称iDME）的运行服务清单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnvsRequest 请求对象
     * @return CompletableFuture<ListEnvsResponse>
     */
    public CompletableFuture<ListEnvsResponse> listEnvsAsync(ListEnvsRequest request) {
        return hcClient.asyncInvokeHttp(request, IdmeMeta.listEnvs);
    }

    /**
     * 获取运行服务清单
     *
     * 本接口用于获取租户在工业数字模型驱动引擎（Industrial Digital Model Engine，简称iDME）的运行服务清单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnvsRequest 请求对象
     * @return AsyncInvoker<ListEnvsRequest, ListEnvsResponse>
     */
    public AsyncInvoker<ListEnvsRequest, ListEnvsResponse> listEnvsAsyncInvoker(ListEnvsRequest request) {
        return new AsyncInvoker<>(request, IdmeMeta.listEnvs, hcClient);
    }

    /**
     * 编辑应用
     *
     * 本接口用于修改工业数字模型驱动引擎（Industrial Digital Model Engine，简称iDME）的应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyApplicationRequest 请求对象
     * @return CompletableFuture<ModifyApplicationResponse>
     */
    public CompletableFuture<ModifyApplicationResponse> modifyApplicationAsync(ModifyApplicationRequest request) {
        return hcClient.asyncInvokeHttp(request, IdmeMeta.modifyApplication);
    }

    /**
     * 编辑应用
     *
     * 本接口用于修改工业数字模型驱动引擎（Industrial Digital Model Engine，简称iDME）的应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyApplicationRequest 请求对象
     * @return AsyncInvoker<ModifyApplicationRequest, ModifyApplicationResponse>
     */
    public AsyncInvoker<ModifyApplicationRequest, ModifyApplicationResponse> modifyApplicationAsyncInvoker(
        ModifyApplicationRequest request) {
        return new AsyncInvoker<>(request, IdmeMeta.modifyApplication, hcClient);
    }

    /**
     * 卸载应用
     *
     * 本接口用于卸载指定运行服务下的工业数字模型驱动引擎（Industrial Digital Model Engine，简称iDME）应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UninstallRequest 请求对象
     * @return CompletableFuture<UninstallResponse>
     */
    public CompletableFuture<UninstallResponse> uninstallAsync(UninstallRequest request) {
        return hcClient.asyncInvokeHttp(request, IdmeMeta.uninstall);
    }

    /**
     * 卸载应用
     *
     * 本接口用于卸载指定运行服务下的工业数字模型驱动引擎（Industrial Digital Model Engine，简称iDME）应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UninstallRequest 请求对象
     * @return AsyncInvoker<UninstallRequest, UninstallResponse>
     */
    public AsyncInvoker<UninstallRequest, UninstallResponse> uninstallAsyncInvoker(UninstallRequest request) {
        return new AsyncInvoker<>(request, IdmeMeta.uninstall, hcClient);
    }

}
