package com.huaweicloud.sdk.esw.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.esw.v3.model.BindVportRequest;
import com.huaweicloud.sdk.esw.v3.model.BindVportResponse;
import com.huaweicloud.sdk.esw.v3.model.CreateConnectionRequest;
import com.huaweicloud.sdk.esw.v3.model.CreateConnectionResponse;
import com.huaweicloud.sdk.esw.v3.model.CreateInstanceRequest;
import com.huaweicloud.sdk.esw.v3.model.CreateInstanceResponse;
import com.huaweicloud.sdk.esw.v3.model.DeleteConnectionRequest;
import com.huaweicloud.sdk.esw.v3.model.DeleteConnectionResponse;
import com.huaweicloud.sdk.esw.v3.model.DeleteInstanceRequest;
import com.huaweicloud.sdk.esw.v3.model.DeleteInstanceResponse;
import com.huaweicloud.sdk.esw.v3.model.ListAvailabilityZonesRequest;
import com.huaweicloud.sdk.esw.v3.model.ListAvailabilityZonesResponse;
import com.huaweicloud.sdk.esw.v3.model.ListConnectionsAllInstancesRequest;
import com.huaweicloud.sdk.esw.v3.model.ListConnectionsAllInstancesResponse;
import com.huaweicloud.sdk.esw.v3.model.ListConnectionsRequest;
import com.huaweicloud.sdk.esw.v3.model.ListConnectionsResponse;
import com.huaweicloud.sdk.esw.v3.model.ListFlavorsRequest;
import com.huaweicloud.sdk.esw.v3.model.ListFlavorsResponse;
import com.huaweicloud.sdk.esw.v3.model.ListInstancesRequest;
import com.huaweicloud.sdk.esw.v3.model.ListInstancesResponse;
import com.huaweicloud.sdk.esw.v3.model.ListQuotasRequest;
import com.huaweicloud.sdk.esw.v3.model.ListQuotasResponse;
import com.huaweicloud.sdk.esw.v3.model.ListResourceJobsRequest;
import com.huaweicloud.sdk.esw.v3.model.ListResourceJobsResponse;
import com.huaweicloud.sdk.esw.v3.model.ShowConnectionRequest;
import com.huaweicloud.sdk.esw.v3.model.ShowConnectionResponse;
import com.huaweicloud.sdk.esw.v3.model.ShowInstanceRequest;
import com.huaweicloud.sdk.esw.v3.model.ShowInstanceResponse;
import com.huaweicloud.sdk.esw.v3.model.UnbindVportRequest;
import com.huaweicloud.sdk.esw.v3.model.UnbindVportResponse;
import com.huaweicloud.sdk.esw.v3.model.UpdateConnectionRequest;
import com.huaweicloud.sdk.esw.v3.model.UpdateConnectionResponse;
import com.huaweicloud.sdk.esw.v3.model.UpdateInstanceRequest;
import com.huaweicloud.sdk.esw.v3.model.UpdateInstanceResponse;

import java.util.concurrent.CompletableFuture;

public class EswAsyncClient {

    protected HcClient hcClient;

    public EswAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<EswAsyncClient> newBuilder() {
        ClientBuilder<EswAsyncClient> clientBuilder = new ClientBuilder<>(EswAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 将一个虚拟IP绑定到二层连接上
     *
     * 当您的二层连接创建成功后，您可以通过调用此接口将一个虚拟IP绑定到二层连接上。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BindVportRequest 请求对象
     * @return CompletableFuture<BindVportResponse>
     */
    public CompletableFuture<BindVportResponse> bindVportAsync(BindVportRequest request) {
        return hcClient.asyncInvokeHttp(request, EswMeta.bindVport);
    }

    /**
     * 将一个虚拟IP绑定到二层连接上
     *
     * 当您的二层连接创建成功后，您可以通过调用此接口将一个虚拟IP绑定到二层连接上。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BindVportRequest 请求对象
     * @return AsyncInvoker<BindVportRequest, BindVportResponse>
     */
    public AsyncInvoker<BindVportRequest, BindVportResponse> bindVportAsyncInvoker(BindVportRequest request) {
        return new AsyncInvoker<>(request, EswMeta.bindVport, hcClient);
    }

    /**
     * 创建二层连接
     *
     * 当您的ESW实例创建成功后，您可以通过调用此接口在该实例上创建一个二层连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConnectionRequest 请求对象
     * @return CompletableFuture<CreateConnectionResponse>
     */
    public CompletableFuture<CreateConnectionResponse> createConnectionAsync(CreateConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, EswMeta.createConnection);
    }

    /**
     * 创建二层连接
     *
     * 当您的ESW实例创建成功后，您可以通过调用此接口在该实例上创建一个二层连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConnectionRequest 请求对象
     * @return AsyncInvoker<CreateConnectionRequest, CreateConnectionResponse>
     */
    public AsyncInvoker<CreateConnectionRequest, CreateConnectionResponse> createConnectionAsyncInvoker(
        CreateConnectionRequest request) {
        return new AsyncInvoker<>(request, EswMeta.createConnection, hcClient);
    }

    /**
     * 创建ESW实例
     *
     * 您可通过调用本接口创建一个ESW实例。该接口是一个异步接口，当前创建ESW实例的请求下发成功后，会响应job_id以及实例ID等信息，需要通过[调用查询任务的执行状态查询job状态](ListResourceJobs.xml)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceRequest 请求对象
     * @return CompletableFuture<CreateInstanceResponse>
     */
    public CompletableFuture<CreateInstanceResponse> createInstanceAsync(CreateInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, EswMeta.createInstance);
    }

    /**
     * 创建ESW实例
     *
     * 您可通过调用本接口创建一个ESW实例。该接口是一个异步接口，当前创建ESW实例的请求下发成功后，会响应job_id以及实例ID等信息，需要通过[调用查询任务的执行状态查询job状态](ListResourceJobs.xml)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceRequest 请求对象
     * @return AsyncInvoker<CreateInstanceRequest, CreateInstanceResponse>
     */
    public AsyncInvoker<CreateInstanceRequest, CreateInstanceResponse> createInstanceAsyncInvoker(
        CreateInstanceRequest request) {
        return new AsyncInvoker<>(request, EswMeta.createInstance, hcClient);
    }

    /**
     * 删除二层连接
     *
     * 当您已创建的二层连接不再使用时，您可以通过调用该接口删除二层连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConnectionRequest 请求对象
     * @return CompletableFuture<DeleteConnectionResponse>
     */
    public CompletableFuture<DeleteConnectionResponse> deleteConnectionAsync(DeleteConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, EswMeta.deleteConnection);
    }

    /**
     * 删除二层连接
     *
     * 当您已创建的二层连接不再使用时，您可以通过调用该接口删除二层连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConnectionRequest 请求对象
     * @return AsyncInvoker<DeleteConnectionRequest, DeleteConnectionResponse>
     */
    public AsyncInvoker<DeleteConnectionRequest, DeleteConnectionResponse> deleteConnectionAsyncInvoker(
        DeleteConnectionRequest request) {
        return new AsyncInvoker<>(request, EswMeta.deleteConnection, hcClient);
    }

    /**
     * 删除ESW实例
     *
     * 当您创建的ESW实例不再使用时，您可以通过调用该接口删除ESW实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceRequest 请求对象
     * @return CompletableFuture<DeleteInstanceResponse>
     */
    public CompletableFuture<DeleteInstanceResponse> deleteInstanceAsync(DeleteInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, EswMeta.deleteInstance);
    }

    /**
     * 删除ESW实例
     *
     * 当您创建的ESW实例不再使用时，您可以通过调用该接口删除ESW实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceRequest 请求对象
     * @return AsyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>
     */
    public AsyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstanceAsyncInvoker(
        DeleteInstanceRequest request) {
        return new AsyncInvoker<>(request, EswMeta.deleteInstance, hcClient);
    }

    /**
     * 查询ESW实例可用区
     *
     * 当您在创建ESW实例时，需要通过调用本接口获取ESW实例主备节点可分布的可用区列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailabilityZonesRequest 请求对象
     * @return CompletableFuture<ListAvailabilityZonesResponse>
     */
    public CompletableFuture<ListAvailabilityZonesResponse> listAvailabilityZonesAsync(
        ListAvailabilityZonesRequest request) {
        return hcClient.asyncInvokeHttp(request, EswMeta.listAvailabilityZones);
    }

    /**
     * 查询ESW实例可用区
     *
     * 当您在创建ESW实例时，需要通过调用本接口获取ESW实例主备节点可分布的可用区列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailabilityZonesRequest 请求对象
     * @return AsyncInvoker<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse>
     */
    public AsyncInvoker<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse> listAvailabilityZonesAsyncInvoker(
        ListAvailabilityZonesRequest request) {
        return new AsyncInvoker<>(request, EswMeta.listAvailabilityZones, hcClient);
    }

    /**
     * 查询实例下的二层连接列表
     *
     * 当您的二层连接创建成功后，您可以通过调用此接口查询ESW实例下的二层连接列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConnectionsRequest 请求对象
     * @return CompletableFuture<ListConnectionsResponse>
     */
    public CompletableFuture<ListConnectionsResponse> listConnectionsAsync(ListConnectionsRequest request) {
        return hcClient.asyncInvokeHttp(request, EswMeta.listConnections);
    }

    /**
     * 查询实例下的二层连接列表
     *
     * 当您的二层连接创建成功后，您可以通过调用此接口查询ESW实例下的二层连接列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConnectionsRequest 请求对象
     * @return AsyncInvoker<ListConnectionsRequest, ListConnectionsResponse>
     */
    public AsyncInvoker<ListConnectionsRequest, ListConnectionsResponse> listConnectionsAsyncInvoker(
        ListConnectionsRequest request) {
        return new AsyncInvoker<>(request, EswMeta.listConnections, hcClient);
    }

    /**
     * 查询二层连接列表
     *
     * 当您的二层连接创建成功后，您可以通过调用此接口查询租户所有二层连接信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConnectionsAllInstancesRequest 请求对象
     * @return CompletableFuture<ListConnectionsAllInstancesResponse>
     */
    public CompletableFuture<ListConnectionsAllInstancesResponse> listConnectionsAllInstancesAsync(
        ListConnectionsAllInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, EswMeta.listConnectionsAllInstances);
    }

    /**
     * 查询二层连接列表
     *
     * 当您的二层连接创建成功后，您可以通过调用此接口查询租户所有二层连接信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConnectionsAllInstancesRequest 请求对象
     * @return AsyncInvoker<ListConnectionsAllInstancesRequest, ListConnectionsAllInstancesResponse>
     */
    public AsyncInvoker<ListConnectionsAllInstancesRequest, ListConnectionsAllInstancesResponse> listConnectionsAllInstancesAsyncInvoker(
        ListConnectionsAllInstancesRequest request) {
        return new AsyncInvoker<>(request, EswMeta.listConnectionsAllInstances, hcClient);
    }

    /**
     * 查询ESW实例规格列表
     *
     * 查询租户可选用的ESW实例规格
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlavorsRequest 请求对象
     * @return CompletableFuture<ListFlavorsResponse>
     */
    public CompletableFuture<ListFlavorsResponse> listFlavorsAsync(ListFlavorsRequest request) {
        return hcClient.asyncInvokeHttp(request, EswMeta.listFlavors);
    }

    /**
     * 查询ESW实例规格列表
     *
     * 查询租户可选用的ESW实例规格
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlavorsRequest 请求对象
     * @return AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse>
     */
    public AsyncInvoker<ListFlavorsRequest, ListFlavorsResponse> listFlavorsAsyncInvoker(ListFlavorsRequest request) {
        return new AsyncInvoker<>(request, EswMeta.listFlavors, hcClient);
    }

    /**
     * 查询ESW实例列表
     *
     * 当您的ESW实例创建成功后，您可以通过调用此接口查询所有ESW实例的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesRequest 请求对象
     * @return CompletableFuture<ListInstancesResponse>
     */
    public CompletableFuture<ListInstancesResponse> listInstancesAsync(ListInstancesRequest request) {
        return hcClient.asyncInvokeHttp(request, EswMeta.listInstances);
    }

    /**
     * 查询ESW实例列表
     *
     * 当您的ESW实例创建成功后，您可以通过调用此接口查询所有ESW实例的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesRequest 请求对象
     * @return AsyncInvoker<ListInstancesRequest, ListInstancesResponse>
     */
    public AsyncInvoker<ListInstancesRequest, ListInstancesResponse> listInstancesAsyncInvoker(
        ListInstancesRequest request) {
        return new AsyncInvoker<>(request, EswMeta.listInstances, hcClient);
    }

    /**
     * 查询ESW实例配额
     *
     * 查询租户的ESW实例配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQuotasRequest 请求对象
     * @return CompletableFuture<ListQuotasResponse>
     */
    public CompletableFuture<ListQuotasResponse> listQuotasAsync(ListQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, EswMeta.listQuotas);
    }

    /**
     * 查询ESW实例配额
     *
     * 查询租户的ESW实例配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQuotasRequest 请求对象
     * @return AsyncInvoker<ListQuotasRequest, ListQuotasResponse>
     */
    public AsyncInvoker<ListQuotasRequest, ListQuotasResponse> listQuotasAsyncInvoker(ListQuotasRequest request) {
        return new AsyncInvoker<>(request, EswMeta.listQuotas, hcClient);
    }

    /**
     * 查询任务的执行状态
     *
     * 查询租户指定资源相关的任务信息列表，COMPLETED表示任务已成功完成，RUNNING表示任务正在执行中，FAILED表示任务执行失败。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceJobsRequest 请求对象
     * @return CompletableFuture<ListResourceJobsResponse>
     */
    public CompletableFuture<ListResourceJobsResponse> listResourceJobsAsync(ListResourceJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, EswMeta.listResourceJobs);
    }

    /**
     * 查询任务的执行状态
     *
     * 查询租户指定资源相关的任务信息列表，COMPLETED表示任务已成功完成，RUNNING表示任务正在执行中，FAILED表示任务执行失败。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceJobsRequest 请求对象
     * @return AsyncInvoker<ListResourceJobsRequest, ListResourceJobsResponse>
     */
    public AsyncInvoker<ListResourceJobsRequest, ListResourceJobsResponse> listResourceJobsAsyncInvoker(
        ListResourceJobsRequest request) {
        return new AsyncInvoker<>(request, EswMeta.listResourceJobs, hcClient);
    }

    /**
     * 查询二层连接详情
     *
     * 当您的二层连接创建成功后，您可以通过调用此接口查询单二层连接的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConnectionRequest 请求对象
     * @return CompletableFuture<ShowConnectionResponse>
     */
    public CompletableFuture<ShowConnectionResponse> showConnectionAsync(ShowConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, EswMeta.showConnection);
    }

    /**
     * 查询二层连接详情
     *
     * 当您的二层连接创建成功后，您可以通过调用此接口查询单二层连接的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConnectionRequest 请求对象
     * @return AsyncInvoker<ShowConnectionRequest, ShowConnectionResponse>
     */
    public AsyncInvoker<ShowConnectionRequest, ShowConnectionResponse> showConnectionAsyncInvoker(
        ShowConnectionRequest request) {
        return new AsyncInvoker<>(request, EswMeta.showConnection, hcClient);
    }

    /**
     * 查询ESW实例详情
     *
     * 当您的ESW实例创建成功后，您可以通过调用此接口查询单个ESW实例的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceRequest 请求对象
     * @return CompletableFuture<ShowInstanceResponse>
     */
    public CompletableFuture<ShowInstanceResponse> showInstanceAsync(ShowInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, EswMeta.showInstance);
    }

    /**
     * 查询ESW实例详情
     *
     * 当您的ESW实例创建成功后，您可以通过调用此接口查询单个ESW实例的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceRequest 请求对象
     * @return AsyncInvoker<ShowInstanceRequest, ShowInstanceResponse>
     */
    public AsyncInvoker<ShowInstanceRequest, ShowInstanceResponse> showInstanceAsyncInvoker(
        ShowInstanceRequest request) {
        return new AsyncInvoker<>(request, EswMeta.showInstance, hcClient);
    }

    /**
     * 将一个虚拟IP从二层连接解绑
     *
     * 当您的二层连接已经绑定虚拟IP时，您可以通过调用此接口将虚拟IP与二层连接解绑。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnbindVportRequest 请求对象
     * @return CompletableFuture<UnbindVportResponse>
     */
    public CompletableFuture<UnbindVportResponse> unbindVportAsync(UnbindVportRequest request) {
        return hcClient.asyncInvokeHttp(request, EswMeta.unbindVport);
    }

    /**
     * 将一个虚拟IP从二层连接解绑
     *
     * 当您的二层连接已经绑定虚拟IP时，您可以通过调用此接口将虚拟IP与二层连接解绑。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnbindVportRequest 请求对象
     * @return AsyncInvoker<UnbindVportRequest, UnbindVportResponse>
     */
    public AsyncInvoker<UnbindVportRequest, UnbindVportResponse> unbindVportAsyncInvoker(UnbindVportRequest request) {
        return new AsyncInvoker<>(request, EswMeta.unbindVport, hcClient);
    }

    /**
     * 更新二层连接
     *
     * 当您的二层连接创建成功后，您可以通过调用此接口更新一个二层连接的名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateConnectionRequest 请求对象
     * @return CompletableFuture<UpdateConnectionResponse>
     */
    public CompletableFuture<UpdateConnectionResponse> updateConnectionAsync(UpdateConnectionRequest request) {
        return hcClient.asyncInvokeHttp(request, EswMeta.updateConnection);
    }

    /**
     * 更新二层连接
     *
     * 当您的二层连接创建成功后，您可以通过调用此接口更新一个二层连接的名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateConnectionRequest 请求对象
     * @return AsyncInvoker<UpdateConnectionRequest, UpdateConnectionResponse>
     */
    public AsyncInvoker<UpdateConnectionRequest, UpdateConnectionResponse> updateConnectionAsyncInvoker(
        UpdateConnectionRequest request) {
        return new AsyncInvoker<>(request, EswMeta.updateConnection, hcClient);
    }

    /**
     * 更新ESW实例
     *
     * 当您的ESW实例创建成功后，您可以通过调用此接口更新一个ESW实例的名称或者描述信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceRequest 请求对象
     * @return CompletableFuture<UpdateInstanceResponse>
     */
    public CompletableFuture<UpdateInstanceResponse> updateInstanceAsync(UpdateInstanceRequest request) {
        return hcClient.asyncInvokeHttp(request, EswMeta.updateInstance);
    }

    /**
     * 更新ESW实例
     *
     * 当您的ESW实例创建成功后，您可以通过调用此接口更新一个ESW实例的名称或者描述信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceRequest 请求对象
     * @return AsyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse>
     */
    public AsyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse> updateInstanceAsyncInvoker(
        UpdateInstanceRequest request) {
        return new AsyncInvoker<>(request, EswMeta.updateInstance, hcClient);
    }

}
