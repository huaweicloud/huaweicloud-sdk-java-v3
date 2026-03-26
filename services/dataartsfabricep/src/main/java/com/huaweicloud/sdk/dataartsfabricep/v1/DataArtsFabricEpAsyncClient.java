package com.huaweicloud.sdk.dataartsfabricep.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.dataartsfabricep.v1.model.CancelJobRunRequest;
import com.huaweicloud.sdk.dataartsfabricep.v1.model.CancelJobRunResponse;
import com.huaweicloud.sdk.dataartsfabricep.v1.model.ClearJobRunRequest;
import com.huaweicloud.sdk.dataartsfabricep.v1.model.ClearJobRunResponse;
import com.huaweicloud.sdk.dataartsfabricep.v1.model.DeleteJobRunRequest;
import com.huaweicloud.sdk.dataartsfabricep.v1.model.DeleteJobRunResponse;
import com.huaweicloud.sdk.dataartsfabricep.v1.model.DeleteServiceInstanceRequest;
import com.huaweicloud.sdk.dataartsfabricep.v1.model.DeleteServiceInstanceResponse;
import com.huaweicloud.sdk.dataartsfabricep.v1.model.DeployServiceInstanceRequest;
import com.huaweicloud.sdk.dataartsfabricep.v1.model.DeployServiceInstanceResponse;
import com.huaweicloud.sdk.dataartsfabricep.v1.model.InvokeModelServiceRequest;
import com.huaweicloud.sdk.dataartsfabricep.v1.model.InvokeModelServiceResponse;
import com.huaweicloud.sdk.dataartsfabricep.v1.model.ListJobRunsRequest;
import com.huaweicloud.sdk.dataartsfabricep.v1.model.ListJobRunsResponse;
import com.huaweicloud.sdk.dataartsfabricep.v1.model.ListServicesInstancesRequest;
import com.huaweicloud.sdk.dataartsfabricep.v1.model.ListServicesInstancesResponse;
import com.huaweicloud.sdk.dataartsfabricep.v1.model.RunJobRequest;
import com.huaweicloud.sdk.dataartsfabricep.v1.model.RunJobResponse;
import com.huaweicloud.sdk.dataartsfabricep.v1.model.ShowEpHealthCheckRequest;
import com.huaweicloud.sdk.dataartsfabricep.v1.model.ShowEpHealthCheckResponse;
import com.huaweicloud.sdk.dataartsfabricep.v1.model.ShowJobRunDetailRequest;
import com.huaweicloud.sdk.dataartsfabricep.v1.model.ShowJobRunDetailResponse;
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
     * 取消作业运行
     *
     * 取消作业运行。主要在取消运行Ray job/python job/spark job等job场景使用；输入workspace_id和run_id；输出为接口运行成功或失败的响应消息，无具体的返回值内容。此接口为同步接口，无配套使用接口和特殊场景。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelJobRunRequest 请求对象
     * @return CompletableFuture<CancelJobRunResponse>
     */
    public CompletableFuture<CancelJobRunResponse> cancelJobRunAsync(CancelJobRunRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsFabricEpMeta.cancelJobRun);
    }

    /**
     * 取消作业运行
     *
     * 取消作业运行。主要在取消运行Ray job/python job/spark job等job场景使用；输入workspace_id和run_id；输出为接口运行成功或失败的响应消息，无具体的返回值内容。此接口为同步接口，无配套使用接口和特殊场景。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelJobRunRequest 请求对象
     * @return AsyncInvoker<CancelJobRunRequest, CancelJobRunResponse>
     */
    public AsyncInvoker<CancelJobRunRequest, CancelJobRunResponse> cancelJobRunAsyncInvoker(
        CancelJobRunRequest request) {
        return new AsyncInvoker<>(request, DataArtsFabricEpMeta.cancelJobRun, hcClient);
    }

    /**
     * 删除端点下所有的作业
     *
     * 删除端点下所有的job运行记录。主要在删除指定端点下所有的Ray job/python job/spark job等job场景使用；输入参数workspace_id和endpoint_id；输出为接口运行成功或失败的响应消息，无具体的返回值内容。此接口为同步接口，无配套使用接口和特殊场景。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ClearJobRunRequest 请求对象
     * @return CompletableFuture<ClearJobRunResponse>
     */
    public CompletableFuture<ClearJobRunResponse> clearJobRunAsync(ClearJobRunRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsFabricEpMeta.clearJobRun);
    }

    /**
     * 删除端点下所有的作业
     *
     * 删除端点下所有的job运行记录。主要在删除指定端点下所有的Ray job/python job/spark job等job场景使用；输入参数workspace_id和endpoint_id；输出为接口运行成功或失败的响应消息，无具体的返回值内容。此接口为同步接口，无配套使用接口和特殊场景。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ClearJobRunRequest 请求对象
     * @return AsyncInvoker<ClearJobRunRequest, ClearJobRunResponse>
     */
    public AsyncInvoker<ClearJobRunRequest, ClearJobRunResponse> clearJobRunAsyncInvoker(ClearJobRunRequest request) {
        return new AsyncInvoker<>(request, DataArtsFabricEpMeta.clearJobRun, hcClient);
    }

    /**
     * 删除作业
     *
     * 删除作业。主要在删除Ray job/python job/spark job等job场景使用；输入workspace_id和run_id；输出为接口运行成功或失败的响应消息，无具体的返回值内容。此接口为同步接口，无配套使用接口和特殊场景。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteJobRunRequest 请求对象
     * @return CompletableFuture<DeleteJobRunResponse>
     */
    public CompletableFuture<DeleteJobRunResponse> deleteJobRunAsync(DeleteJobRunRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsFabricEpMeta.deleteJobRun);
    }

    /**
     * 删除作业
     *
     * 删除作业。主要在删除Ray job/python job/spark job等job场景使用；输入workspace_id和run_id；输出为接口运行成功或失败的响应消息，无具体的返回值内容。此接口为同步接口，无配套使用接口和特殊场景。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteJobRunRequest 请求对象
     * @return AsyncInvoker<DeleteJobRunRequest, DeleteJobRunResponse>
     */
    public AsyncInvoker<DeleteJobRunRequest, DeleteJobRunResponse> deleteJobRunAsyncInvoker(
        DeleteJobRunRequest request) {
        return new AsyncInvoker<>(request, DataArtsFabricEpMeta.deleteJobRun, hcClient);
    }

    /**
     * 查看作业运行列表
     *
     * 查看作业运行列表。主要在查询所有Ray job/python job/spark job等job场景使用；输入workspace_id，job运行id(可选)，job运行名称（可选），分页查询参数limit和offset，job id（可选），endpoint id（可选），job version id（可选），job状态（可选），job类型（可选），排序参数及升序/降序排序方式；输出job运行信息列表。此接口为同步接口，无配套使用接口和特殊场景。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobRunsRequest 请求对象
     * @return CompletableFuture<ListJobRunsResponse>
     */
    public CompletableFuture<ListJobRunsResponse> listJobRunsAsync(ListJobRunsRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsFabricEpMeta.listJobRuns);
    }

    /**
     * 查看作业运行列表
     *
     * 查看作业运行列表。主要在查询所有Ray job/python job/spark job等job场景使用；输入workspace_id，job运行id(可选)，job运行名称（可选），分页查询参数limit和offset，job id（可选），endpoint id（可选），job version id（可选），job状态（可选），job类型（可选），排序参数及升序/降序排序方式；输出job运行信息列表。此接口为同步接口，无配套使用接口和特殊场景。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobRunsRequest 请求对象
     * @return AsyncInvoker<ListJobRunsRequest, ListJobRunsResponse>
     */
    public AsyncInvoker<ListJobRunsRequest, ListJobRunsResponse> listJobRunsAsyncInvoker(ListJobRunsRequest request) {
        return new AsyncInvoker<>(request, DataArtsFabricEpMeta.listJobRuns, hcClient);
    }

    /**
     * 运行作业
     *
     * 运行作业。主要在运行Ray job/python job/spark job等job场景使用；输入workspace_id，job信息（jobId、jobVersionId），job运行名称，job运行端点id；输出作业运行Id。此接口为异步接口，配套使用接口showJobRunDetail接口或ListJobRuns接口查询job运行状态，无特殊场景。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunJobRequest 请求对象
     * @return CompletableFuture<RunJobResponse>
     */
    public CompletableFuture<RunJobResponse> runJobAsync(RunJobRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsFabricEpMeta.runJob);
    }

    /**
     * 运行作业
     *
     * 运行作业。主要在运行Ray job/python job/spark job等job场景使用；输入workspace_id，job信息（jobId、jobVersionId），job运行名称，job运行端点id；输出作业运行Id。此接口为异步接口，配套使用接口showJobRunDetail接口或ListJobRuns接口查询job运行状态，无特殊场景。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunJobRequest 请求对象
     * @return AsyncInvoker<RunJobRequest, RunJobResponse>
     */
    public AsyncInvoker<RunJobRequest, RunJobResponse> runJobAsyncInvoker(RunJobRequest request) {
        return new AsyncInvoker<>(request, DataArtsFabricEpMeta.runJob, hcClient);
    }

    /**
     * 查看作业运行详情
     *
     * 查看指定作业运行详情。主要在Ray job/python job/spark job等job场景用户查询job运行详细信息；输入workspace_id和run_id；输出job的详细信息，包括id、创建时间、更新时间、状态、运行时长、job类型、错误码、错误信息、错误解决方案、远端信息，其中只有job错误时才会有错误码、错误信息等。此接口为同步接口，无配套使用接口和特殊场景。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobRunDetailRequest 请求对象
     * @return CompletableFuture<ShowJobRunDetailResponse>
     */
    public CompletableFuture<ShowJobRunDetailResponse> showJobRunDetailAsync(ShowJobRunDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, DataArtsFabricEpMeta.showJobRunDetail);
    }

    /**
     * 查看作业运行详情
     *
     * 查看指定作业运行详情。主要在Ray job/python job/spark job等job场景用户查询job运行详细信息；输入workspace_id和run_id；输出job的详细信息，包括id、创建时间、更新时间、状态、运行时长、job类型、错误码、错误信息、错误解决方案、远端信息，其中只有job错误时才会有错误码、错误信息等。此接口为同步接口，无配套使用接口和特殊场景。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobRunDetailRequest 请求对象
     * @return AsyncInvoker<ShowJobRunDetailRequest, ShowJobRunDetailResponse>
     */
    public AsyncInvoker<ShowJobRunDetailRequest, ShowJobRunDetailResponse> showJobRunDetailAsyncInvoker(
        ShowJobRunDetailRequest request) {
        return new AsyncInvoker<>(request, DataArtsFabricEpMeta.showJobRunDetail, hcClient);
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
