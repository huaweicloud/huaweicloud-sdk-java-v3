package com.huaweicloud.sdk.esw.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
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

public class EswClient {

    protected HcClient hcClient;

    public EswClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<EswClient> newBuilder() {
        ClientBuilder<EswClient> clientBuilder = new ClientBuilder<>(EswClient::new);
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
     * @return BindVportResponse
     */
    public BindVportResponse bindVport(BindVportRequest request) {
        return hcClient.syncInvokeHttp(request, EswMeta.bindVport);
    }

    /**
     * 将一个虚拟IP绑定到二层连接上
     *
     * 当您的二层连接创建成功后，您可以通过调用此接口将一个虚拟IP绑定到二层连接上。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BindVportRequest 请求对象
     * @return SyncInvoker<BindVportRequest, BindVportResponse>
     */
    public SyncInvoker<BindVportRequest, BindVportResponse> bindVportInvoker(BindVportRequest request) {
        return new SyncInvoker<>(request, EswMeta.bindVport, hcClient);
    }

    /**
     * 创建二层连接
     *
     * 当您的ESW实例创建成功后，您可以通过调用此接口在该实例上创建一个二层连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConnectionRequest 请求对象
     * @return CreateConnectionResponse
     */
    public CreateConnectionResponse createConnection(CreateConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, EswMeta.createConnection);
    }

    /**
     * 创建二层连接
     *
     * 当您的ESW实例创建成功后，您可以通过调用此接口在该实例上创建一个二层连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateConnectionRequest 请求对象
     * @return SyncInvoker<CreateConnectionRequest, CreateConnectionResponse>
     */
    public SyncInvoker<CreateConnectionRequest, CreateConnectionResponse> createConnectionInvoker(
        CreateConnectionRequest request) {
        return new SyncInvoker<>(request, EswMeta.createConnection, hcClient);
    }

    /**
     * 创建ESW实例
     *
     * 您可通过调用本接口创建一个ESW实例。该接口是一个异步接口，当前创建ESW实例的请求下发成功后，会响应job_id以及实例ID等信息，需要通过[调用查询任务的执行状态查询job状态](ListResourceJobs.xml)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceRequest 请求对象
     * @return CreateInstanceResponse
     */
    public CreateInstanceResponse createInstance(CreateInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, EswMeta.createInstance);
    }

    /**
     * 创建ESW实例
     *
     * 您可通过调用本接口创建一个ESW实例。该接口是一个异步接口，当前创建ESW实例的请求下发成功后，会响应job_id以及实例ID等信息，需要通过[调用查询任务的执行状态查询job状态](ListResourceJobs.xml)。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateInstanceRequest 请求对象
     * @return SyncInvoker<CreateInstanceRequest, CreateInstanceResponse>
     */
    public SyncInvoker<CreateInstanceRequest, CreateInstanceResponse> createInstanceInvoker(
        CreateInstanceRequest request) {
        return new SyncInvoker<>(request, EswMeta.createInstance, hcClient);
    }

    /**
     * 删除二层连接
     *
     * 当您已创建的二层连接不再使用时，您可以通过调用该接口删除二层连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConnectionRequest 请求对象
     * @return DeleteConnectionResponse
     */
    public DeleteConnectionResponse deleteConnection(DeleteConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, EswMeta.deleteConnection);
    }

    /**
     * 删除二层连接
     *
     * 当您已创建的二层连接不再使用时，您可以通过调用该接口删除二层连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteConnectionRequest 请求对象
     * @return SyncInvoker<DeleteConnectionRequest, DeleteConnectionResponse>
     */
    public SyncInvoker<DeleteConnectionRequest, DeleteConnectionResponse> deleteConnectionInvoker(
        DeleteConnectionRequest request) {
        return new SyncInvoker<>(request, EswMeta.deleteConnection, hcClient);
    }

    /**
     * 删除ESW实例
     *
     * 当您创建的ESW实例不再使用时，您可以通过调用该接口删除ESW实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceRequest 请求对象
     * @return DeleteInstanceResponse
     */
    public DeleteInstanceResponse deleteInstance(DeleteInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, EswMeta.deleteInstance);
    }

    /**
     * 删除ESW实例
     *
     * 当您创建的ESW实例不再使用时，您可以通过调用该接口删除ESW实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteInstanceRequest 请求对象
     * @return SyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse>
     */
    public SyncInvoker<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstanceInvoker(
        DeleteInstanceRequest request) {
        return new SyncInvoker<>(request, EswMeta.deleteInstance, hcClient);
    }

    /**
     * 查询ESW实例可用区
     *
     * 当您在创建ESW实例时，需要通过调用本接口获取ESW实例主备节点可分布的可用区列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailabilityZonesRequest 请求对象
     * @return ListAvailabilityZonesResponse
     */
    public ListAvailabilityZonesResponse listAvailabilityZones(ListAvailabilityZonesRequest request) {
        return hcClient.syncInvokeHttp(request, EswMeta.listAvailabilityZones);
    }

    /**
     * 查询ESW实例可用区
     *
     * 当您在创建ESW实例时，需要通过调用本接口获取ESW实例主备节点可分布的可用区列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListAvailabilityZonesRequest 请求对象
     * @return SyncInvoker<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse>
     */
    public SyncInvoker<ListAvailabilityZonesRequest, ListAvailabilityZonesResponse> listAvailabilityZonesInvoker(
        ListAvailabilityZonesRequest request) {
        return new SyncInvoker<>(request, EswMeta.listAvailabilityZones, hcClient);
    }

    /**
     * 查询实例下的二层连接列表
     *
     * 当您的二层连接创建成功后，您可以通过调用此接口查询ESW实例下的二层连接列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConnectionsRequest 请求对象
     * @return ListConnectionsResponse
     */
    public ListConnectionsResponse listConnections(ListConnectionsRequest request) {
        return hcClient.syncInvokeHttp(request, EswMeta.listConnections);
    }

    /**
     * 查询实例下的二层连接列表
     *
     * 当您的二层连接创建成功后，您可以通过调用此接口查询ESW实例下的二层连接列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConnectionsRequest 请求对象
     * @return SyncInvoker<ListConnectionsRequest, ListConnectionsResponse>
     */
    public SyncInvoker<ListConnectionsRequest, ListConnectionsResponse> listConnectionsInvoker(
        ListConnectionsRequest request) {
        return new SyncInvoker<>(request, EswMeta.listConnections, hcClient);
    }

    /**
     * 查询二层连接列表
     *
     * 当您的二层连接创建成功后，您可以通过调用此接口查询租户所有二层连接信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConnectionsAllInstancesRequest 请求对象
     * @return ListConnectionsAllInstancesResponse
     */
    public ListConnectionsAllInstancesResponse listConnectionsAllInstances(ListConnectionsAllInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, EswMeta.listConnectionsAllInstances);
    }

    /**
     * 查询二层连接列表
     *
     * 当您的二层连接创建成功后，您可以通过调用此接口查询租户所有二层连接信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListConnectionsAllInstancesRequest 请求对象
     * @return SyncInvoker<ListConnectionsAllInstancesRequest, ListConnectionsAllInstancesResponse>
     */
    public SyncInvoker<ListConnectionsAllInstancesRequest, ListConnectionsAllInstancesResponse> listConnectionsAllInstancesInvoker(
        ListConnectionsAllInstancesRequest request) {
        return new SyncInvoker<>(request, EswMeta.listConnectionsAllInstances, hcClient);
    }

    /**
     * 查询ESW实例规格列表
     *
     * 查询租户可选用的ESW实例规格
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlavorsRequest 请求对象
     * @return ListFlavorsResponse
     */
    public ListFlavorsResponse listFlavors(ListFlavorsRequest request) {
        return hcClient.syncInvokeHttp(request, EswMeta.listFlavors);
    }

    /**
     * 查询ESW实例规格列表
     *
     * 查询租户可选用的ESW实例规格
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFlavorsRequest 请求对象
     * @return SyncInvoker<ListFlavorsRequest, ListFlavorsResponse>
     */
    public SyncInvoker<ListFlavorsRequest, ListFlavorsResponse> listFlavorsInvoker(ListFlavorsRequest request) {
        return new SyncInvoker<>(request, EswMeta.listFlavors, hcClient);
    }

    /**
     * 查询ESW实例列表
     *
     * 当您的ESW实例创建成功后，您可以通过调用此接口查询所有ESW实例的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesRequest 请求对象
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstances(ListInstancesRequest request) {
        return hcClient.syncInvokeHttp(request, EswMeta.listInstances);
    }

    /**
     * 查询ESW实例列表
     *
     * 当您的ESW实例创建成功后，您可以通过调用此接口查询所有ESW实例的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListInstancesRequest 请求对象
     * @return SyncInvoker<ListInstancesRequest, ListInstancesResponse>
     */
    public SyncInvoker<ListInstancesRequest, ListInstancesResponse> listInstancesInvoker(ListInstancesRequest request) {
        return new SyncInvoker<>(request, EswMeta.listInstances, hcClient);
    }

    /**
     * 查询ESW实例配额
     *
     * 查询租户的ESW实例配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQuotasRequest 请求对象
     * @return ListQuotasResponse
     */
    public ListQuotasResponse listQuotas(ListQuotasRequest request) {
        return hcClient.syncInvokeHttp(request, EswMeta.listQuotas);
    }

    /**
     * 查询ESW实例配额
     *
     * 查询租户的ESW实例配额
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListQuotasRequest 请求对象
     * @return SyncInvoker<ListQuotasRequest, ListQuotasResponse>
     */
    public SyncInvoker<ListQuotasRequest, ListQuotasResponse> listQuotasInvoker(ListQuotasRequest request) {
        return new SyncInvoker<>(request, EswMeta.listQuotas, hcClient);
    }

    /**
     * 查询任务的执行状态
     *
     * 查询租户指定资源相关的任务信息列表，COMPLETED表示任务已成功完成，RUNNING表示任务正在执行中，FAILED表示任务执行失败。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceJobsRequest 请求对象
     * @return ListResourceJobsResponse
     */
    public ListResourceJobsResponse listResourceJobs(ListResourceJobsRequest request) {
        return hcClient.syncInvokeHttp(request, EswMeta.listResourceJobs);
    }

    /**
     * 查询任务的执行状态
     *
     * 查询租户指定资源相关的任务信息列表，COMPLETED表示任务已成功完成，RUNNING表示任务正在执行中，FAILED表示任务执行失败。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResourceJobsRequest 请求对象
     * @return SyncInvoker<ListResourceJobsRequest, ListResourceJobsResponse>
     */
    public SyncInvoker<ListResourceJobsRequest, ListResourceJobsResponse> listResourceJobsInvoker(
        ListResourceJobsRequest request) {
        return new SyncInvoker<>(request, EswMeta.listResourceJobs, hcClient);
    }

    /**
     * 查询二层连接详情
     *
     * 当您的二层连接创建成功后，您可以通过调用此接口查询单二层连接的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConnectionRequest 请求对象
     * @return ShowConnectionResponse
     */
    public ShowConnectionResponse showConnection(ShowConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, EswMeta.showConnection);
    }

    /**
     * 查询二层连接详情
     *
     * 当您的二层连接创建成功后，您可以通过调用此接口查询单二层连接的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowConnectionRequest 请求对象
     * @return SyncInvoker<ShowConnectionRequest, ShowConnectionResponse>
     */
    public SyncInvoker<ShowConnectionRequest, ShowConnectionResponse> showConnectionInvoker(
        ShowConnectionRequest request) {
        return new SyncInvoker<>(request, EswMeta.showConnection, hcClient);
    }

    /**
     * 查询ESW实例详情
     *
     * 当您的ESW实例创建成功后，您可以通过调用此接口查询单个ESW实例的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceRequest 请求对象
     * @return ShowInstanceResponse
     */
    public ShowInstanceResponse showInstance(ShowInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, EswMeta.showInstance);
    }

    /**
     * 查询ESW实例详情
     *
     * 当您的ESW实例创建成功后，您可以通过调用此接口查询单个ESW实例的详细信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowInstanceRequest 请求对象
     * @return SyncInvoker<ShowInstanceRequest, ShowInstanceResponse>
     */
    public SyncInvoker<ShowInstanceRequest, ShowInstanceResponse> showInstanceInvoker(ShowInstanceRequest request) {
        return new SyncInvoker<>(request, EswMeta.showInstance, hcClient);
    }

    /**
     * 将一个虚拟IP从二层连接解绑
     *
     * 当您的二层连接已经绑定虚拟IP时，您可以通过调用此接口将虚拟IP与二层连接解绑。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnbindVportRequest 请求对象
     * @return UnbindVportResponse
     */
    public UnbindVportResponse unbindVport(UnbindVportRequest request) {
        return hcClient.syncInvokeHttp(request, EswMeta.unbindVport);
    }

    /**
     * 将一个虚拟IP从二层连接解绑
     *
     * 当您的二层连接已经绑定虚拟IP时，您可以通过调用此接口将虚拟IP与二层连接解绑。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnbindVportRequest 请求对象
     * @return SyncInvoker<UnbindVportRequest, UnbindVportResponse>
     */
    public SyncInvoker<UnbindVportRequest, UnbindVportResponse> unbindVportInvoker(UnbindVportRequest request) {
        return new SyncInvoker<>(request, EswMeta.unbindVport, hcClient);
    }

    /**
     * 更新二层连接
     *
     * 当您的二层连接创建成功后，您可以通过调用此接口更新一个二层连接的名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateConnectionRequest 请求对象
     * @return UpdateConnectionResponse
     */
    public UpdateConnectionResponse updateConnection(UpdateConnectionRequest request) {
        return hcClient.syncInvokeHttp(request, EswMeta.updateConnection);
    }

    /**
     * 更新二层连接
     *
     * 当您的二层连接创建成功后，您可以通过调用此接口更新一个二层连接的名称。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateConnectionRequest 请求对象
     * @return SyncInvoker<UpdateConnectionRequest, UpdateConnectionResponse>
     */
    public SyncInvoker<UpdateConnectionRequest, UpdateConnectionResponse> updateConnectionInvoker(
        UpdateConnectionRequest request) {
        return new SyncInvoker<>(request, EswMeta.updateConnection, hcClient);
    }

    /**
     * 更新ESW实例
     *
     * 当您的ESW实例创建成功后，您可以通过调用此接口更新一个ESW实例的名称或者描述信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceRequest 请求对象
     * @return UpdateInstanceResponse
     */
    public UpdateInstanceResponse updateInstance(UpdateInstanceRequest request) {
        return hcClient.syncInvokeHttp(request, EswMeta.updateInstance);
    }

    /**
     * 更新ESW实例
     *
     * 当您的ESW实例创建成功后，您可以通过调用此接口更新一个ESW实例的名称或者描述信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateInstanceRequest 请求对象
     * @return SyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse>
     */
    public SyncInvoker<UpdateInstanceRequest, UpdateInstanceResponse> updateInstanceInvoker(
        UpdateInstanceRequest request) {
        return new SyncInvoker<>(request, EswMeta.updateInstance, hcClient);
    }

}
