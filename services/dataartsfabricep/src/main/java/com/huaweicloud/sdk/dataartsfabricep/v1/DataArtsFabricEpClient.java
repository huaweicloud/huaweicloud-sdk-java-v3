package com.huaweicloud.sdk.dataartsfabricep.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.dataartsfabricep.v1.model.DeleteServiceInstanceRequest;
import com.huaweicloud.sdk.dataartsfabricep.v1.model.DeleteServiceInstanceResponse;
import com.huaweicloud.sdk.dataartsfabricep.v1.model.DeployServiceInstanceRequest;
import com.huaweicloud.sdk.dataartsfabricep.v1.model.DeployServiceInstanceResponse;
import com.huaweicloud.sdk.dataartsfabricep.v1.model.InvokeModelServiceRequest;
import com.huaweicloud.sdk.dataartsfabricep.v1.model.InvokeModelServiceResponse;
import com.huaweicloud.sdk.dataartsfabricep.v1.model.ListServicesInstancesRequest;
import com.huaweicloud.sdk.dataartsfabricep.v1.model.ListServicesInstancesResponse;
import com.huaweicloud.sdk.dataartsfabricep.v1.model.ShowEpHealthCheckRequest;
import com.huaweicloud.sdk.dataartsfabricep.v1.model.ShowEpHealthCheckResponse;
import com.huaweicloud.sdk.dataartsfabricep.v1.model.ShowServiceInstanceDetailRequest;
import com.huaweicloud.sdk.dataartsfabricep.v1.model.ShowServiceInstanceDetailResponse;
import com.huaweicloud.sdk.dataartsfabricep.v1.model.UpdateServiceInstanceRequest;
import com.huaweicloud.sdk.dataartsfabricep.v1.model.UpdateServiceInstanceResponse;

public class DataArtsFabricEpClient {

    protected HcClient hcClient;

    public DataArtsFabricEpClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DataArtsFabricEpClient> newBuilder() {
        ClientBuilder<DataArtsFabricEpClient> clientBuilder = new ClientBuilder<>(DataArtsFabricEpClient::new);
        return clientBuilder;
    }

    /**
     * 健康检查
     *
     * 服务健康检查
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEpHealthCheckRequest 请求对象
     * @return ShowEpHealthCheckResponse
     */
    public ShowEpHealthCheckResponse showEpHealthCheck(ShowEpHealthCheckRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsFabricEpMeta.showEpHealthCheck);
    }

    /**
     * 健康检查
     *
     * 服务健康检查
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEpHealthCheckRequest 请求对象
     * @return SyncInvoker<ShowEpHealthCheckRequest, ShowEpHealthCheckResponse>
     */
    public SyncInvoker<ShowEpHealthCheckRequest, ShowEpHealthCheckResponse> showEpHealthCheckInvoker(
        ShowEpHealthCheckRequest request) {
        return new SyncInvoker<>(request, DataArtsFabricEpMeta.showEpHealthCheck, hcClient);
    }

    /**
     * 发起调用请求
     *
     * 调用已部署的大模型推理实例，发起推理请求
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request InvokeModelServiceRequest 请求对象
     * @return InvokeModelServiceResponse
     */
    public InvokeModelServiceResponse invokeModelService(InvokeModelServiceRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsFabricEpMeta.invokeModelService);
    }

    /**
     * 发起调用请求
     *
     * 调用已部署的大模型推理实例，发起推理请求
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request InvokeModelServiceRequest 请求对象
     * @return SyncInvoker<InvokeModelServiceRequest, InvokeModelServiceResponse>
     */
    public SyncInvoker<InvokeModelServiceRequest, InvokeModelServiceResponse> invokeModelServiceInvoker(
        InvokeModelServiceRequest request) {
        return new SyncInvoker<>(request, DataArtsFabricEpMeta.invokeModelService, hcClient);
    }

    /**
     * 删除Service实例
     *
     * 删除Service实例，释放该实例的资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteServiceInstanceRequest 请求对象
     * @return DeleteServiceInstanceResponse
     */
    public DeleteServiceInstanceResponse deleteServiceInstance(DeleteServiceInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsFabricEpMeta.deleteServiceInstance);
    }

    /**
     * 删除Service实例
     *
     * 删除Service实例，释放该实例的资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteServiceInstanceRequest 请求对象
     * @return SyncInvoker<DeleteServiceInstanceRequest, DeleteServiceInstanceResponse>
     */
    public SyncInvoker<DeleteServiceInstanceRequest, DeleteServiceInstanceResponse> deleteServiceInstanceInvoker(
        DeleteServiceInstanceRequest request) {
        return new SyncInvoker<>(request, DataArtsFabricEpMeta.deleteServiceInstance, hcClient);
    }

    /**
     * 部署服务
     *
     * 部署一个Service实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeployServiceInstanceRequest 请求对象
     * @return DeployServiceInstanceResponse
     */
    public DeployServiceInstanceResponse deployServiceInstance(DeployServiceInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsFabricEpMeta.deployServiceInstance);
    }

    /**
     * 部署服务
     *
     * 部署一个Service实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeployServiceInstanceRequest 请求对象
     * @return SyncInvoker<DeployServiceInstanceRequest, DeployServiceInstanceResponse>
     */
    public SyncInvoker<DeployServiceInstanceRequest, DeployServiceInstanceResponse> deployServiceInstanceInvoker(
        DeployServiceInstanceRequest request) {
        return new SyncInvoker<>(request, DataArtsFabricEpMeta.deployServiceInstance, hcClient);
    }

    /**
     * 列举已部署的Service实例
     *
     * 列举已部署的Service实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServicesInstancesRequest 请求对象
     * @return ListServicesInstancesResponse
     */
    public ListServicesInstancesResponse listServicesInstances(ListServicesInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsFabricEpMeta.listServicesInstances);
    }

    /**
     * 列举已部署的Service实例
     *
     * 列举已部署的Service实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServicesInstancesRequest 请求对象
     * @return SyncInvoker<ListServicesInstancesRequest, ListServicesInstancesResponse>
     */
    public SyncInvoker<ListServicesInstancesRequest, ListServicesInstancesResponse> listServicesInstancesInvoker(
        ListServicesInstancesRequest request) {
        return new SyncInvoker<>(request, DataArtsFabricEpMeta.listServicesInstances, hcClient);
    }

    /**
     * 查看部署的Service实例详情
     *
     * 查看部署后的Service实例的详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServiceInstanceDetailRequest 请求对象
     * @return ShowServiceInstanceDetailResponse
     */
    public ShowServiceInstanceDetailResponse showServiceInstanceDetail(ShowServiceInstanceDetailRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsFabricEpMeta.showServiceInstanceDetail);
    }

    /**
     * 查看部署的Service实例详情
     *
     * 查看部署后的Service实例的详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServiceInstanceDetailRequest 请求对象
     * @return SyncInvoker<ShowServiceInstanceDetailRequest, ShowServiceInstanceDetailResponse>
     */
    public SyncInvoker<ShowServiceInstanceDetailRequest, ShowServiceInstanceDetailResponse> showServiceInstanceDetailInvoker(
        ShowServiceInstanceDetailRequest request) {
        return new SyncInvoker<>(request, DataArtsFabricEpMeta.showServiceInstanceDetail, hcClient);
    }

    /**
     * 更新Service实例
     *
     * 更新已部署的Service实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateServiceInstanceRequest 请求对象
     * @return UpdateServiceInstanceResponse
     */
    public UpdateServiceInstanceResponse updateServiceInstance(UpdateServiceInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsFabricEpMeta.updateServiceInstance);
    }

    /**
     * 更新Service实例
     *
     * 更新已部署的Service实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateServiceInstanceRequest 请求对象
     * @return SyncInvoker<UpdateServiceInstanceRequest, UpdateServiceInstanceResponse>
     */
    public SyncInvoker<UpdateServiceInstanceRequest, UpdateServiceInstanceResponse> updateServiceInstanceInvoker(
        UpdateServiceInstanceRequest request) {
        return new SyncInvoker<>(request, DataArtsFabricEpMeta.updateServiceInstance, hcClient);
    }

}
