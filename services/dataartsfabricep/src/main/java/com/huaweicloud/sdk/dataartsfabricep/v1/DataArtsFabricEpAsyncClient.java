package com.huaweicloud.sdk.dataartsfabricep.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
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

import java.util.concurrent.CompletableFuture;

public class DataArtsFabricEpAsyncClient {

    protected HcClient hcClient;

    public DataArtsFabricEpAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DataArtsFabricEpAsyncClient> newBuilder() {
        ClientBuilder<DataArtsFabricEpAsyncClient> clientBuilder =
            new ClientBuilder<>(DataArtsFabricEpAsyncClient::new);
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
     * @return CompletableFuture<ShowEpHealthCheckResponse>
     */
    public CompletableFuture<ShowEpHealthCheckResponse> showEpHealthCheckAsync(ShowEpHealthCheckRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsFabricEpMeta.showEpHealthCheck);
    }

    /**
     * 健康检查
     *
     * 服务健康检查
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEpHealthCheckRequest 请求对象
     * @return AsyncInvoker<ShowEpHealthCheckRequest, ShowEpHealthCheckResponse>
     */
    public AsyncInvoker<ShowEpHealthCheckRequest, ShowEpHealthCheckResponse> showEpHealthCheckAsyncInvoker(
        ShowEpHealthCheckRequest request) {
        return new AsyncInvoker<>(request, DataArtsFabricEpMeta.showEpHealthCheck, hcClient);
    }

    /**
     * 发起调用请求
     *
     * 调用已部署的大模型推理实例，发起推理请求
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request InvokeModelServiceRequest 请求对象
     * @return CompletableFuture<InvokeModelServiceResponse>
     */
    public CompletableFuture<InvokeModelServiceResponse> invokeModelServiceAsync(InvokeModelServiceRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsFabricEpMeta.invokeModelService);
    }

    /**
     * 发起调用请求
     *
     * 调用已部署的大模型推理实例，发起推理请求
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request InvokeModelServiceRequest 请求对象
     * @return AsyncInvoker<InvokeModelServiceRequest, InvokeModelServiceResponse>
     */
    public AsyncInvoker<InvokeModelServiceRequest, InvokeModelServiceResponse> invokeModelServiceAsyncInvoker(
        InvokeModelServiceRequest request) {
        return new AsyncInvoker<>(request, DataArtsFabricEpMeta.invokeModelService, hcClient);
    }

    /**
     * 删除Service实例
     *
     * 删除Service实例，释放该实例的资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteServiceInstanceRequest 请求对象
     * @return CompletableFuture<DeleteServiceInstanceResponse>
     */
    public CompletableFuture<DeleteServiceInstanceResponse> deleteServiceInstanceAsync(
        DeleteServiceInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsFabricEpMeta.deleteServiceInstance);
    }

    /**
     * 删除Service实例
     *
     * 删除Service实例，释放该实例的资源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteServiceInstanceRequest 请求对象
     * @return AsyncInvoker<DeleteServiceInstanceRequest, DeleteServiceInstanceResponse>
     */
    public AsyncInvoker<DeleteServiceInstanceRequest, DeleteServiceInstanceResponse> deleteServiceInstanceAsyncInvoker(
        DeleteServiceInstanceRequest request) {
        return new AsyncInvoker<>(request, DataArtsFabricEpMeta.deleteServiceInstance, hcClient);
    }

    /**
     * 部署服务
     *
     * 部署一个Service实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeployServiceInstanceRequest 请求对象
     * @return CompletableFuture<DeployServiceInstanceResponse>
     */
    public CompletableFuture<DeployServiceInstanceResponse> deployServiceInstanceAsync(
        DeployServiceInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsFabricEpMeta.deployServiceInstance);
    }

    /**
     * 部署服务
     *
     * 部署一个Service实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeployServiceInstanceRequest 请求对象
     * @return AsyncInvoker<DeployServiceInstanceRequest, DeployServiceInstanceResponse>
     */
    public AsyncInvoker<DeployServiceInstanceRequest, DeployServiceInstanceResponse> deployServiceInstanceAsyncInvoker(
        DeployServiceInstanceRequest request) {
        return new AsyncInvoker<>(request, DataArtsFabricEpMeta.deployServiceInstance, hcClient);
    }

    /**
     * 列举已部署的Service实例
     *
     * 列举已部署的Service实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServicesInstancesRequest 请求对象
     * @return CompletableFuture<ListServicesInstancesResponse>
     */
    public CompletableFuture<ListServicesInstancesResponse> listServicesInstancesAsync(
        ListServicesInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsFabricEpMeta.listServicesInstances);
    }

    /**
     * 列举已部署的Service实例
     *
     * 列举已部署的Service实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListServicesInstancesRequest 请求对象
     * @return AsyncInvoker<ListServicesInstancesRequest, ListServicesInstancesResponse>
     */
    public AsyncInvoker<ListServicesInstancesRequest, ListServicesInstancesResponse> listServicesInstancesAsyncInvoker(
        ListServicesInstancesRequest request) {
        return new AsyncInvoker<>(request, DataArtsFabricEpMeta.listServicesInstances, hcClient);
    }

    /**
     * 查看部署的Service实例详情
     *
     * 查看部署后的Service实例的详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServiceInstanceDetailRequest 请求对象
     * @return CompletableFuture<ShowServiceInstanceDetailResponse>
     */
    public CompletableFuture<ShowServiceInstanceDetailResponse> showServiceInstanceDetailAsync(
        ShowServiceInstanceDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsFabricEpMeta.showServiceInstanceDetail);
    }

    /**
     * 查看部署的Service实例详情
     *
     * 查看部署后的Service实例的详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowServiceInstanceDetailRequest 请求对象
     * @return AsyncInvoker<ShowServiceInstanceDetailRequest, ShowServiceInstanceDetailResponse>
     */
    public AsyncInvoker<ShowServiceInstanceDetailRequest, ShowServiceInstanceDetailResponse> showServiceInstanceDetailAsyncInvoker(
        ShowServiceInstanceDetailRequest request) {
        return new AsyncInvoker<>(request, DataArtsFabricEpMeta.showServiceInstanceDetail, hcClient);
    }

    /**
     * 更新Service实例
     *
     * 更新已部署的Service实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateServiceInstanceRequest 请求对象
     * @return CompletableFuture<UpdateServiceInstanceResponse>
     */
    public CompletableFuture<UpdateServiceInstanceResponse> updateServiceInstanceAsync(
        UpdateServiceInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsFabricEpMeta.updateServiceInstance);
    }

    /**
     * 更新Service实例
     *
     * 更新已部署的Service实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateServiceInstanceRequest 请求对象
     * @return AsyncInvoker<UpdateServiceInstanceRequest, UpdateServiceInstanceResponse>
     */
    public AsyncInvoker<UpdateServiceInstanceRequest, UpdateServiceInstanceResponse> updateServiceInstanceAsyncInvoker(
        UpdateServiceInstanceRequest request) {
        return new AsyncInvoker<>(request, DataArtsFabricEpMeta.updateServiceInstance, hcClient);
    }

}
