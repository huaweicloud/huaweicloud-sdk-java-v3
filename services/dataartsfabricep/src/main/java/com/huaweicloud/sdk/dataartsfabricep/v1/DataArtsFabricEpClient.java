package com.huaweicloud.sdk.dataartsfabricep.v1;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
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
     * 取消作业运行
     *
     * 取消作业运行。主要在取消运行Ray job/python job/spark job等job场景使用；输入workspace_id和run_id；输出为接口运行成功或失败的响应消息，无具体的返回值内容。此接口为同步接口，无配套使用接口和特殊场景。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelJobRunRequest 请求对象
     * @return CancelJobRunResponse
     */
    public CancelJobRunResponse cancelJobRun(CancelJobRunRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsFabricEpMeta.cancelJobRun);
    }

    /**
     * 取消作业运行
     *
     * 取消作业运行。主要在取消运行Ray job/python job/spark job等job场景使用；输入workspace_id和run_id；输出为接口运行成功或失败的响应消息，无具体的返回值内容。此接口为同步接口，无配套使用接口和特殊场景。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CancelJobRunRequest 请求对象
     * @return SyncInvoker<CancelJobRunRequest, CancelJobRunResponse>
     */
    public SyncInvoker<CancelJobRunRequest, CancelJobRunResponse> cancelJobRunInvoker(CancelJobRunRequest request) {
        return new SyncInvoker<>(request, DataArtsFabricEpMeta.cancelJobRun, hcClient);
    }

    /**
     * 删除端点下所有的作业
     *
     * 删除端点下所有的job运行记录。主要在删除指定端点下所有的Ray job/python job/spark job等job场景使用；输入参数workspace_id和endpoint_id；输出为接口运行成功或失败的响应消息，无具体的返回值内容。此接口为同步接口，无配套使用接口和特殊场景。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ClearJobRunRequest 请求对象
     * @return ClearJobRunResponse
     */
    public ClearJobRunResponse clearJobRun(ClearJobRunRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsFabricEpMeta.clearJobRun);
    }

    /**
     * 删除端点下所有的作业
     *
     * 删除端点下所有的job运行记录。主要在删除指定端点下所有的Ray job/python job/spark job等job场景使用；输入参数workspace_id和endpoint_id；输出为接口运行成功或失败的响应消息，无具体的返回值内容。此接口为同步接口，无配套使用接口和特殊场景。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ClearJobRunRequest 请求对象
     * @return SyncInvoker<ClearJobRunRequest, ClearJobRunResponse>
     */
    public SyncInvoker<ClearJobRunRequest, ClearJobRunResponse> clearJobRunInvoker(ClearJobRunRequest request) {
        return new SyncInvoker<>(request, DataArtsFabricEpMeta.clearJobRun, hcClient);
    }

    /**
     * 删除作业
     *
     * 删除作业。主要在删除Ray job/python job/spark job等job场景使用；输入workspace_id和run_id；输出为接口运行成功或失败的响应消息，无具体的返回值内容。此接口为同步接口，无配套使用接口和特殊场景。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteJobRunRequest 请求对象
     * @return DeleteJobRunResponse
     */
    public DeleteJobRunResponse deleteJobRun(DeleteJobRunRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsFabricEpMeta.deleteJobRun);
    }

    /**
     * 删除作业
     *
     * 删除作业。主要在删除Ray job/python job/spark job等job场景使用；输入workspace_id和run_id；输出为接口运行成功或失败的响应消息，无具体的返回值内容。此接口为同步接口，无配套使用接口和特殊场景。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteJobRunRequest 请求对象
     * @return SyncInvoker<DeleteJobRunRequest, DeleteJobRunResponse>
     */
    public SyncInvoker<DeleteJobRunRequest, DeleteJobRunResponse> deleteJobRunInvoker(DeleteJobRunRequest request) {
        return new SyncInvoker<>(request, DataArtsFabricEpMeta.deleteJobRun, hcClient);
    }

    /**
     * 查看作业运行列表
     *
     * 查看作业运行列表。主要在查询所有Ray job/python job/spark job等job场景使用；输入workspace_id，job运行id(可选)，job运行名称（可选），分页查询参数limit和offset，job id（可选），endpoint id（可选），job version id（可选），job状态（可选），job类型（可选），排序参数及升序/降序排序方式；输出job运行信息列表。此接口为同步接口，无配套使用接口和特殊场景。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobRunsRequest 请求对象
     * @return ListJobRunsResponse
     */
    public ListJobRunsResponse listJobRuns(ListJobRunsRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsFabricEpMeta.listJobRuns);
    }

    /**
     * 查看作业运行列表
     *
     * 查看作业运行列表。主要在查询所有Ray job/python job/spark job等job场景使用；输入workspace_id，job运行id(可选)，job运行名称（可选），分页查询参数limit和offset，job id（可选），endpoint id（可选），job version id（可选），job状态（可选），job类型（可选），排序参数及升序/降序排序方式；输出job运行信息列表。此接口为同步接口，无配套使用接口和特殊场景。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListJobRunsRequest 请求对象
     * @return SyncInvoker<ListJobRunsRequest, ListJobRunsResponse>
     */
    public SyncInvoker<ListJobRunsRequest, ListJobRunsResponse> listJobRunsInvoker(ListJobRunsRequest request) {
        return new SyncInvoker<>(request, DataArtsFabricEpMeta.listJobRuns, hcClient);
    }

    /**
     * 运行作业
     *
     * 运行作业。主要在运行Ray job/python job/spark job等job场景使用；输入workspace_id，job信息（jobId、jobVersionId），job运行名称，job运行端点id；输出作业运行Id。此接口为异步接口，配套使用接口showJobRunDetail接口或ListJobRuns接口查询job运行状态，无特殊场景。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunJobRequest 请求对象
     * @return RunJobResponse
     */
    public RunJobResponse runJob(RunJobRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsFabricEpMeta.runJob);
    }

    /**
     * 运行作业
     *
     * 运行作业。主要在运行Ray job/python job/spark job等job场景使用；输入workspace_id，job信息（jobId、jobVersionId），job运行名称，job运行端点id；输出作业运行Id。此接口为异步接口，配套使用接口showJobRunDetail接口或ListJobRuns接口查询job运行状态，无特殊场景。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RunJobRequest 请求对象
     * @return SyncInvoker<RunJobRequest, RunJobResponse>
     */
    public SyncInvoker<RunJobRequest, RunJobResponse> runJobInvoker(RunJobRequest request) {
        return new SyncInvoker<>(request, DataArtsFabricEpMeta.runJob, hcClient);
    }

    /**
     * 查看作业运行详情
     *
     * 查看指定作业运行详情。主要在Ray job/python job/spark job等job场景用户查询job运行详细信息；输入workspace_id和run_id；输出job的详细信息，包括id、创建时间、更新时间、状态、运行时长、job类型、错误码、错误信息、错误解决方案、远端信息，其中只有job错误时才会有错误码、错误信息等。此接口为同步接口，无配套使用接口和特殊场景。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobRunDetailRequest 请求对象
     * @return ShowJobRunDetailResponse
     */
    public ShowJobRunDetailResponse showJobRunDetail(ShowJobRunDetailRequest request) {
        return hcClient.syncInvokeHttp(request, DataArtsFabricEpMeta.showJobRunDetail);
    }

    /**
     * 查看作业运行详情
     *
     * 查看指定作业运行详情。主要在Ray job/python job/spark job等job场景用户查询job运行详细信息；输入workspace_id和run_id；输出job的详细信息，包括id、创建时间、更新时间、状态、运行时长、job类型、错误码、错误信息、错误解决方案、远端信息，其中只有job错误时才会有错误码、错误信息等。此接口为同步接口，无配套使用接口和特殊场景。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowJobRunDetailRequest 请求对象
     * @return SyncInvoker<ShowJobRunDetailRequest, ShowJobRunDetailResponse>
     */
    public SyncInvoker<ShowJobRunDetailRequest, ShowJobRunDetailResponse> showJobRunDetailInvoker(
        ShowJobRunDetailRequest request) {
        return new SyncInvoker<>(request, DataArtsFabricEpMeta.showJobRunDetail, hcClient);
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
