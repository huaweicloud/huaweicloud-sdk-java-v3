package com.huaweicloud.sdk.idme.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.idme.v1.model.CreateXdmApplicationRequest;
import com.huaweicloud.sdk.idme.v1.model.CreateXdmApplicationResponse;
import com.huaweicloud.sdk.idme.v1.model.DeleteCloudServiceRequest;
import com.huaweicloud.sdk.idme.v1.model.DeleteCloudServiceResponse;
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
import com.huaweicloud.sdk.idme.v1.model.SubscribeCloudServiceRequest;
import com.huaweicloud.sdk.idme.v1.model.SubscribeCloudServiceResponse;
import com.huaweicloud.sdk.idme.v1.model.UninstallRequest;
import com.huaweicloud.sdk.idme.v1.model.UninstallResponse;

public class IdmeClient {

    protected HcClient hcClient;

    public IdmeClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<IdmeClient> newBuilder() {
        ClientBuilder<IdmeClient> clientBuilder = new ClientBuilder<>(IdmeClient::new);
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
     * @return CreateXdmApplicationResponse
     */
    public CreateXdmApplicationResponse createXdmApplication(CreateXdmApplicationRequest request) {
        return hcClient.syncInvokeHttp(request, IdmeMeta.createXdmApplication);
    }

    /**
     * 创建应用
     *
     * 本接口用于创建工业数字模型驱动引擎（Industrial Digital Model Engine，简称iDME）的应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateXdmApplicationRequest 请求对象
     * @return SyncInvoker<CreateXdmApplicationRequest, CreateXdmApplicationResponse>
     */
    public SyncInvoker<CreateXdmApplicationRequest, CreateXdmApplicationResponse> createXdmApplicationInvoker(
        CreateXdmApplicationRequest request) {
        return new SyncInvoker<>(request, IdmeMeta.createXdmApplication, hcClient);
    }

    /**
     * 删除iDME实例
     *
     * 本接口用于删除工业数字模型驱动引擎（Industrial Digital Model Engine，简称iDME）实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCloudServiceRequest 请求对象
     * @return DeleteCloudServiceResponse
     */
    public DeleteCloudServiceResponse deleteCloudService(DeleteCloudServiceRequest request) {
        return hcClient.syncInvokeHttp(request, IdmeMeta.deleteCloudService);
    }

    /**
     * 删除iDME实例
     *
     * 本接口用于删除工业数字模型驱动引擎（Industrial Digital Model Engine，简称iDME）实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCloudServiceRequest 请求对象
     * @return SyncInvoker<DeleteCloudServiceRequest, DeleteCloudServiceResponse>
     */
    public SyncInvoker<DeleteCloudServiceRequest, DeleteCloudServiceResponse> deleteCloudServiceInvoker(
        DeleteCloudServiceRequest request) {
        return new SyncInvoker<>(request, IdmeMeta.deleteCloudService, hcClient);
    }

    /**
     * 删除应用
     *
     * 本接口用于删除工业数字模型驱动引擎（Industrial Digital Model Engine，简称iDME）的应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteXdmApplicationRequest 请求对象
     * @return DeleteXdmApplicationResponse
     */
    public DeleteXdmApplicationResponse deleteXdmApplication(DeleteXdmApplicationRequest request) {
        return hcClient.syncInvokeHttp(request, IdmeMeta.deleteXdmApplication);
    }

    /**
     * 删除应用
     *
     * 本接口用于删除工业数字模型驱动引擎（Industrial Digital Model Engine，简称iDME）的应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteXdmApplicationRequest 请求对象
     * @return SyncInvoker<DeleteXdmApplicationRequest, DeleteXdmApplicationResponse>
     */
    public SyncInvoker<DeleteXdmApplicationRequest, DeleteXdmApplicationResponse> deleteXdmApplicationInvoker(
        DeleteXdmApplicationRequest request) {
        return new SyncInvoker<>(request, IdmeMeta.deleteXdmApplication, hcClient);
    }

    /**
     * 部署应用
     *
     * 本接口用于部署工业数字模型驱动引擎（Industrial Digital Model Engine，简称iDME）的应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeployApplicationRequest 请求对象
     * @return DeployApplicationResponse
     */
    public DeployApplicationResponse deployApplication(DeployApplicationRequest request) {
        return hcClient.syncInvokeHttp(request, IdmeMeta.deployApplication);
    }

    /**
     * 部署应用
     *
     * 本接口用于部署工业数字模型驱动引擎（Industrial Digital Model Engine，简称iDME）的应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeployApplicationRequest 请求对象
     * @return SyncInvoker<DeployApplicationRequest, DeployApplicationResponse>
     */
    public SyncInvoker<DeployApplicationRequest, DeployApplicationResponse> deployApplicationInvoker(
        DeployApplicationRequest request) {
        return new SyncInvoker<>(request, IdmeMeta.deployApplication, hcClient);
    }

    /**
     * 获取租户下的应用清单
     *
     * 本接口用于获取租户在工业数字模型驱动引擎（Industrial Digital Model Engine，简称iDME）的应用清单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppsRequest 请求对象
     * @return ListAppsResponse
     */
    public ListAppsResponse listApps(ListAppsRequest request) {
        return hcClient.syncInvokeHttp(request, IdmeMeta.listApps);
    }

    /**
     * 获取租户下的应用清单
     *
     * 本接口用于获取租户在工业数字模型驱动引擎（Industrial Digital Model Engine，简称iDME）的应用清单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAppsRequest 请求对象
     * @return SyncInvoker<ListAppsRequest, ListAppsResponse>
     */
    public SyncInvoker<ListAppsRequest, ListAppsResponse> listAppsInvoker(ListAppsRequest request) {
        return new SyncInvoker<>(request, IdmeMeta.listApps, hcClient);
    }

    /**
     * 获取运行服务清单
     *
     * 本接口用于获取租户在工业数字模型驱动引擎（Industrial Digital Model Engine，简称iDME）的运行服务清单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnvsRequest 请求对象
     * @return ListEnvsResponse
     */
    public ListEnvsResponse listEnvs(ListEnvsRequest request) {
        return hcClient.syncInvokeHttp(request, IdmeMeta.listEnvs);
    }

    /**
     * 获取运行服务清单
     *
     * 本接口用于获取租户在工业数字模型驱动引擎（Industrial Digital Model Engine，简称iDME）的运行服务清单。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEnvsRequest 请求对象
     * @return SyncInvoker<ListEnvsRequest, ListEnvsResponse>
     */
    public SyncInvoker<ListEnvsRequest, ListEnvsResponse> listEnvsInvoker(ListEnvsRequest request) {
        return new SyncInvoker<>(request, IdmeMeta.listEnvs, hcClient);
    }

    /**
     * 编辑应用
     *
     * 本接口用于修改工业数字模型驱动引擎（Industrial Digital Model Engine，简称iDME）的应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyApplicationRequest 请求对象
     * @return ModifyApplicationResponse
     */
    public ModifyApplicationResponse modifyApplication(ModifyApplicationRequest request) {
        return hcClient.syncInvokeHttp(request, IdmeMeta.modifyApplication);
    }

    /**
     * 编辑应用
     *
     * 本接口用于修改工业数字模型驱动引擎（Industrial Digital Model Engine，简称iDME）的应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ModifyApplicationRequest 请求对象
     * @return SyncInvoker<ModifyApplicationRequest, ModifyApplicationResponse>
     */
    public SyncInvoker<ModifyApplicationRequest, ModifyApplicationResponse> modifyApplicationInvoker(
        ModifyApplicationRequest request) {
        return new SyncInvoker<>(request, IdmeMeta.modifyApplication, hcClient);
    }

    /**
     * 开通iDME实例
     *
     * 本接口用于开通工业数字模型驱动引擎（Industrial Digital Model Engine，简称iDME）实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SubscribeCloudServiceRequest 请求对象
     * @return SubscribeCloudServiceResponse
     */
    public SubscribeCloudServiceResponse subscribeCloudService(SubscribeCloudServiceRequest request) {
        return hcClient.syncInvokeHttp(request, IdmeMeta.subscribeCloudService);
    }

    /**
     * 开通iDME实例
     *
     * 本接口用于开通工业数字模型驱动引擎（Industrial Digital Model Engine，简称iDME）实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SubscribeCloudServiceRequest 请求对象
     * @return SyncInvoker<SubscribeCloudServiceRequest, SubscribeCloudServiceResponse>
     */
    public SyncInvoker<SubscribeCloudServiceRequest, SubscribeCloudServiceResponse> subscribeCloudServiceInvoker(
        SubscribeCloudServiceRequest request) {
        return new SyncInvoker<>(request, IdmeMeta.subscribeCloudService, hcClient);
    }

    /**
     * 卸载应用
     *
     * 本接口用于卸载指定运行服务下的工业数字模型驱动引擎（Industrial Digital Model Engine，简称iDME）应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UninstallRequest 请求对象
     * @return UninstallResponse
     */
    public UninstallResponse uninstall(UninstallRequest request) {
        return hcClient.syncInvokeHttp(request, IdmeMeta.uninstall);
    }

    /**
     * 卸载应用
     *
     * 本接口用于卸载指定运行服务下的工业数字模型驱动引擎（Industrial Digital Model Engine，简称iDME）应用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UninstallRequest 请求对象
     * @return SyncInvoker<UninstallRequest, UninstallResponse>
     */
    public SyncInvoker<UninstallRequest, UninstallResponse> uninstallInvoker(UninstallRequest request) {
        return new SyncInvoker<>(request, IdmeMeta.uninstall, hcClient);
    }

}
