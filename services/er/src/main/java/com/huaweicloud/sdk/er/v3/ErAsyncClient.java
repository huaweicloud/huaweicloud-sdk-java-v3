package com.huaweicloud.sdk.er.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.er.v3.model.AcceptAttachmentRequest;
import com.huaweicloud.sdk.er.v3.model.AcceptAttachmentResponse;
import com.huaweicloud.sdk.er.v3.model.AssociateRouteTableRequest;
import com.huaweicloud.sdk.er.v3.model.AssociateRouteTableResponse;
import com.huaweicloud.sdk.er.v3.model.BatchCreateResourceTagsRequest;
import com.huaweicloud.sdk.er.v3.model.BatchCreateResourceTagsResponse;
import com.huaweicloud.sdk.er.v3.model.ChangeAvailabilityZoneRequest;
import com.huaweicloud.sdk.er.v3.model.ChangeAvailabilityZoneResponse;
import com.huaweicloud.sdk.er.v3.model.CreateEnterpriseRouterRequest;
import com.huaweicloud.sdk.er.v3.model.CreateEnterpriseRouterResponse;
import com.huaweicloud.sdk.er.v3.model.CreateFlowLogRequest;
import com.huaweicloud.sdk.er.v3.model.CreateFlowLogResponse;
import com.huaweicloud.sdk.er.v3.model.CreateResourceTagRequest;
import com.huaweicloud.sdk.er.v3.model.CreateResourceTagResponse;
import com.huaweicloud.sdk.er.v3.model.CreateRouteTableRequest;
import com.huaweicloud.sdk.er.v3.model.CreateRouteTableResponse;
import com.huaweicloud.sdk.er.v3.model.CreateStaticRouteRequest;
import com.huaweicloud.sdk.er.v3.model.CreateStaticRouteResponse;
import com.huaweicloud.sdk.er.v3.model.CreateVpcAttachmentRequest;
import com.huaweicloud.sdk.er.v3.model.CreateVpcAttachmentResponse;
import com.huaweicloud.sdk.er.v3.model.DeleteEnterpriseRouterRequest;
import com.huaweicloud.sdk.er.v3.model.DeleteEnterpriseRouterResponse;
import com.huaweicloud.sdk.er.v3.model.DeleteFlowLogRequest;
import com.huaweicloud.sdk.er.v3.model.DeleteFlowLogResponse;
import com.huaweicloud.sdk.er.v3.model.DeleteResourceTagRequest;
import com.huaweicloud.sdk.er.v3.model.DeleteResourceTagResponse;
import com.huaweicloud.sdk.er.v3.model.DeleteRouteTableRequest;
import com.huaweicloud.sdk.er.v3.model.DeleteRouteTableResponse;
import com.huaweicloud.sdk.er.v3.model.DeleteStaticRouteRequest;
import com.huaweicloud.sdk.er.v3.model.DeleteStaticRouteResponse;
import com.huaweicloud.sdk.er.v3.model.DeleteVpcAttachmentRequest;
import com.huaweicloud.sdk.er.v3.model.DeleteVpcAttachmentResponse;
import com.huaweicloud.sdk.er.v3.model.DisableFlowLogRequest;
import com.huaweicloud.sdk.er.v3.model.DisableFlowLogResponse;
import com.huaweicloud.sdk.er.v3.model.DisablePropagationRequest;
import com.huaweicloud.sdk.er.v3.model.DisablePropagationResponse;
import com.huaweicloud.sdk.er.v3.model.DisassociateRouteTableRequest;
import com.huaweicloud.sdk.er.v3.model.DisassociateRouteTableResponse;
import com.huaweicloud.sdk.er.v3.model.EnableFlowLogRequest;
import com.huaweicloud.sdk.er.v3.model.EnableFlowLogResponse;
import com.huaweicloud.sdk.er.v3.model.EnablePropagationRequest;
import com.huaweicloud.sdk.er.v3.model.EnablePropagationResponse;
import com.huaweicloud.sdk.er.v3.model.ListAssociationsRequest;
import com.huaweicloud.sdk.er.v3.model.ListAssociationsResponse;
import com.huaweicloud.sdk.er.v3.model.ListAttachmentsRequest;
import com.huaweicloud.sdk.er.v3.model.ListAttachmentsResponse;
import com.huaweicloud.sdk.er.v3.model.ListAvailabilityZoneRequest;
import com.huaweicloud.sdk.er.v3.model.ListAvailabilityZoneResponse;
import com.huaweicloud.sdk.er.v3.model.ListEffectiveRoutesRequest;
import com.huaweicloud.sdk.er.v3.model.ListEffectiveRoutesResponse;
import com.huaweicloud.sdk.er.v3.model.ListEnterpriseRoutersRequest;
import com.huaweicloud.sdk.er.v3.model.ListEnterpriseRoutersResponse;
import com.huaweicloud.sdk.er.v3.model.ListFlowLogsRequest;
import com.huaweicloud.sdk.er.v3.model.ListFlowLogsResponse;
import com.huaweicloud.sdk.er.v3.model.ListProjectTagsRequest;
import com.huaweicloud.sdk.er.v3.model.ListProjectTagsResponse;
import com.huaweicloud.sdk.er.v3.model.ListPropagationsRequest;
import com.huaweicloud.sdk.er.v3.model.ListPropagationsResponse;
import com.huaweicloud.sdk.er.v3.model.ListRouteTablesRequest;
import com.huaweicloud.sdk.er.v3.model.ListRouteTablesResponse;
import com.huaweicloud.sdk.er.v3.model.ListStaticRoutesRequest;
import com.huaweicloud.sdk.er.v3.model.ListStaticRoutesResponse;
import com.huaweicloud.sdk.er.v3.model.ListVpcAttachmentsRequest;
import com.huaweicloud.sdk.er.v3.model.ListVpcAttachmentsResponse;
import com.huaweicloud.sdk.er.v3.model.RejectAttachmentRequest;
import com.huaweicloud.sdk.er.v3.model.RejectAttachmentResponse;
import com.huaweicloud.sdk.er.v3.model.ShowAttachmentRequest;
import com.huaweicloud.sdk.er.v3.model.ShowAttachmentResponse;
import com.huaweicloud.sdk.er.v3.model.ShowEnterpriseRouterRequest;
import com.huaweicloud.sdk.er.v3.model.ShowEnterpriseRouterResponse;
import com.huaweicloud.sdk.er.v3.model.ShowFlowLogRequest;
import com.huaweicloud.sdk.er.v3.model.ShowFlowLogResponse;
import com.huaweicloud.sdk.er.v3.model.ShowQuotasRequest;
import com.huaweicloud.sdk.er.v3.model.ShowQuotasResponse;
import com.huaweicloud.sdk.er.v3.model.ShowResourceTagRequest;
import com.huaweicloud.sdk.er.v3.model.ShowResourceTagResponse;
import com.huaweicloud.sdk.er.v3.model.ShowRouteTableRequest;
import com.huaweicloud.sdk.er.v3.model.ShowRouteTableResponse;
import com.huaweicloud.sdk.er.v3.model.ShowStaticRouteRequest;
import com.huaweicloud.sdk.er.v3.model.ShowStaticRouteResponse;
import com.huaweicloud.sdk.er.v3.model.ShowVpcAttachmentRequest;
import com.huaweicloud.sdk.er.v3.model.ShowVpcAttachmentResponse;
import com.huaweicloud.sdk.er.v3.model.UpdateAttachmentRequest;
import com.huaweicloud.sdk.er.v3.model.UpdateAttachmentResponse;
import com.huaweicloud.sdk.er.v3.model.UpdateEnterpriseRouterRequest;
import com.huaweicloud.sdk.er.v3.model.UpdateEnterpriseRouterResponse;
import com.huaweicloud.sdk.er.v3.model.UpdateFlowLogRequest;
import com.huaweicloud.sdk.er.v3.model.UpdateFlowLogResponse;
import com.huaweicloud.sdk.er.v3.model.UpdateRouteTableRequest;
import com.huaweicloud.sdk.er.v3.model.UpdateRouteTableResponse;
import com.huaweicloud.sdk.er.v3.model.UpdateStaticRouteRequest;
import com.huaweicloud.sdk.er.v3.model.UpdateStaticRouteResponse;
import com.huaweicloud.sdk.er.v3.model.UpdateVpcAttachmentRequest;
import com.huaweicloud.sdk.er.v3.model.UpdateVpcAttachmentResponse;

import java.util.concurrent.CompletableFuture;

public class ErAsyncClient {

    protected HcClient hcClient;

    public ErAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ErAsyncClient> newBuilder() {
        ClientBuilder<ErAsyncClient> clientBuilder = new ClientBuilder<>(ErAsyncClient::new);
        return clientBuilder;
    }

    /**
     * 创建路由关联
     *
     * 每个连接只能关联到一张路由表。通过创建关联将连接关联到路由表，从该连接收到的报文会用被关联的路由表进行路由。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociateRouteTableRequest 请求对象
     * @return CompletableFuture<AssociateRouteTableResponse>
     */
    public CompletableFuture<AssociateRouteTableResponse> associateRouteTableAsync(AssociateRouteTableRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.associateRouteTable);
    }

    /**
     * 创建路由关联
     *
     * 每个连接只能关联到一张路由表。通过创建关联将连接关联到路由表，从该连接收到的报文会用被关联的路由表进行路由。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociateRouteTableRequest 请求对象
     * @return AsyncInvoker<AssociateRouteTableRequest, AssociateRouteTableResponse>
     */
    public AsyncInvoker<AssociateRouteTableRequest, AssociateRouteTableResponse> associateRouteTableAsyncInvoker(
        AssociateRouteTableRequest request) {
        return new AsyncInvoker<AssociateRouteTableRequest, AssociateRouteTableResponse>(request,
            ErMeta.associateRouteTable, hcClient);
    }

    /**
     * 删除路由关联
     *
     * 解绑连接和路由表的关联关系。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisassociateRouteTableRequest 请求对象
     * @return CompletableFuture<DisassociateRouteTableResponse>
     */
    public CompletableFuture<DisassociateRouteTableResponse> disassociateRouteTableAsync(
        DisassociateRouteTableRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.disassociateRouteTable);
    }

    /**
     * 删除路由关联
     *
     * 解绑连接和路由表的关联关系。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisassociateRouteTableRequest 请求对象
     * @return AsyncInvoker<DisassociateRouteTableRequest, DisassociateRouteTableResponse>
     */
    public AsyncInvoker<DisassociateRouteTableRequest, DisassociateRouteTableResponse> disassociateRouteTableAsyncInvoker(
        DisassociateRouteTableRequest request) {
        return new AsyncInvoker<DisassociateRouteTableRequest, DisassociateRouteTableResponse>(request,
            ErMeta.disassociateRouteTable, hcClient);
    }

    /**
     * 查询路由关联列表
     *
     * 查询路由关联列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAssociationsRequest 请求对象
     * @return CompletableFuture<ListAssociationsResponse>
     */
    public CompletableFuture<ListAssociationsResponse> listAssociationsAsync(ListAssociationsRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.listAssociations);
    }

    /**
     * 查询路由关联列表
     *
     * 查询路由关联列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAssociationsRequest 请求对象
     * @return AsyncInvoker<ListAssociationsRequest, ListAssociationsResponse>
     */
    public AsyncInvoker<ListAssociationsRequest, ListAssociationsResponse> listAssociationsAsyncInvoker(
        ListAssociationsRequest request) {
        return new AsyncInvoker<ListAssociationsRequest, ListAssociationsResponse>(request, ErMeta.listAssociations,
            hcClient);
    }

    /**
     * 接受共享连接创建
     *
     * 接受共享连接创建
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AcceptAttachmentRequest 请求对象
     * @return CompletableFuture<AcceptAttachmentResponse>
     */
    public CompletableFuture<AcceptAttachmentResponse> acceptAttachmentAsync(AcceptAttachmentRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.acceptAttachment);
    }

    /**
     * 接受共享连接创建
     *
     * 接受共享连接创建
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AcceptAttachmentRequest 请求对象
     * @return AsyncInvoker<AcceptAttachmentRequest, AcceptAttachmentResponse>
     */
    public AsyncInvoker<AcceptAttachmentRequest, AcceptAttachmentResponse> acceptAttachmentAsyncInvoker(
        AcceptAttachmentRequest request) {
        return new AsyncInvoker<AcceptAttachmentRequest, AcceptAttachmentResponse>(request, ErMeta.acceptAttachment,
            hcClient);
    }

    /**
     * 查询连接列表
     *
     * 查询企业路由器实例下的连接列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAttachmentsRequest 请求对象
     * @return CompletableFuture<ListAttachmentsResponse>
     */
    public CompletableFuture<ListAttachmentsResponse> listAttachmentsAsync(ListAttachmentsRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.listAttachments);
    }

    /**
     * 查询连接列表
     *
     * 查询企业路由器实例下的连接列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAttachmentsRequest 请求对象
     * @return AsyncInvoker<ListAttachmentsRequest, ListAttachmentsResponse>
     */
    public AsyncInvoker<ListAttachmentsRequest, ListAttachmentsResponse> listAttachmentsAsyncInvoker(
        ListAttachmentsRequest request) {
        return new AsyncInvoker<ListAttachmentsRequest, ListAttachmentsResponse>(request, ErMeta.listAttachments,
            hcClient);
    }

    /**
     * 拒绝共享连接创建
     *
     * 拒绝共享连接创建
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RejectAttachmentRequest 请求对象
     * @return CompletableFuture<RejectAttachmentResponse>
     */
    public CompletableFuture<RejectAttachmentResponse> rejectAttachmentAsync(RejectAttachmentRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.rejectAttachment);
    }

    /**
     * 拒绝共享连接创建
     *
     * 拒绝共享连接创建
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RejectAttachmentRequest 请求对象
     * @return AsyncInvoker<RejectAttachmentRequest, RejectAttachmentResponse>
     */
    public AsyncInvoker<RejectAttachmentRequest, RejectAttachmentResponse> rejectAttachmentAsyncInvoker(
        RejectAttachmentRequest request) {
        return new AsyncInvoker<RejectAttachmentRequest, RejectAttachmentResponse>(request, ErMeta.rejectAttachment,
            hcClient);
    }

    /**
     * 查询连接详情
     *
     * 查询连接详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAttachmentRequest 请求对象
     * @return CompletableFuture<ShowAttachmentResponse>
     */
    public CompletableFuture<ShowAttachmentResponse> showAttachmentAsync(ShowAttachmentRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.showAttachment);
    }

    /**
     * 查询连接详情
     *
     * 查询连接详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowAttachmentRequest 请求对象
     * @return AsyncInvoker<ShowAttachmentRequest, ShowAttachmentResponse>
     */
    public AsyncInvoker<ShowAttachmentRequest, ShowAttachmentResponse> showAttachmentAsyncInvoker(
        ShowAttachmentRequest request) {
        return new AsyncInvoker<ShowAttachmentRequest, ShowAttachmentResponse>(request, ErMeta.showAttachment,
            hcClient);
    }

    /**
     * 更新连接基本信息
     *
     * 修改连接基本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAttachmentRequest 请求对象
     * @return CompletableFuture<UpdateAttachmentResponse>
     */
    public CompletableFuture<UpdateAttachmentResponse> updateAttachmentAsync(UpdateAttachmentRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.updateAttachment);
    }

    /**
     * 更新连接基本信息
     *
     * 修改连接基本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateAttachmentRequest 请求对象
     * @return AsyncInvoker<UpdateAttachmentRequest, UpdateAttachmentResponse>
     */
    public AsyncInvoker<UpdateAttachmentRequest, UpdateAttachmentResponse> updateAttachmentAsyncInvoker(
        UpdateAttachmentRequest request) {
        return new AsyncInvoker<UpdateAttachmentRequest, UpdateAttachmentResponse>(request, ErMeta.updateAttachment,
            hcClient);
    }

    /**
     * 查询可用区列表
     *
     * 查询支持创建企业路由器实例的可用区列表，当可用区状态为available时，表示可以创建企业路由器实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAvailabilityZoneRequest 请求对象
     * @return CompletableFuture<ListAvailabilityZoneResponse>
     */
    public CompletableFuture<ListAvailabilityZoneResponse> listAvailabilityZoneAsync(
        ListAvailabilityZoneRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.listAvailabilityZone);
    }

    /**
     * 查询可用区列表
     *
     * 查询支持创建企业路由器实例的可用区列表，当可用区状态为available时，表示可以创建企业路由器实例。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListAvailabilityZoneRequest 请求对象
     * @return AsyncInvoker<ListAvailabilityZoneRequest, ListAvailabilityZoneResponse>
     */
    public AsyncInvoker<ListAvailabilityZoneRequest, ListAvailabilityZoneResponse> listAvailabilityZoneAsyncInvoker(
        ListAvailabilityZoneRequest request) {
        return new AsyncInvoker<ListAvailabilityZoneRequest, ListAvailabilityZoneResponse>(request,
            ErMeta.listAvailabilityZone, hcClient);
    }

    /**
     * 更新企业路由器的可用区信息
     *
     * 更新企业路由器的可用区信息，企业路由器实例状态为available的时候才能更新。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeAvailabilityZoneRequest 请求对象
     * @return CompletableFuture<ChangeAvailabilityZoneResponse>
     */
    public CompletableFuture<ChangeAvailabilityZoneResponse> changeAvailabilityZoneAsync(
        ChangeAvailabilityZoneRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.changeAvailabilityZone);
    }

    /**
     * 更新企业路由器的可用区信息
     *
     * 更新企业路由器的可用区信息，企业路由器实例状态为available的时候才能更新。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ChangeAvailabilityZoneRequest 请求对象
     * @return AsyncInvoker<ChangeAvailabilityZoneRequest, ChangeAvailabilityZoneResponse>
     */
    public AsyncInvoker<ChangeAvailabilityZoneRequest, ChangeAvailabilityZoneResponse> changeAvailabilityZoneAsyncInvoker(
        ChangeAvailabilityZoneRequest request) {
        return new AsyncInvoker<ChangeAvailabilityZoneRequest, ChangeAvailabilityZoneResponse>(request,
            ErMeta.changeAvailabilityZone, hcClient);
    }

    /**
     * 创建企业路由器
     *
     * 创建企业路由器实例，如果使能默认关联路由表或使能默认传递路由表，那么系统会默认创建一张路由表，作为默认关联路由表或默认传递路由表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEnterpriseRouterRequest 请求对象
     * @return CompletableFuture<CreateEnterpriseRouterResponse>
     */
    public CompletableFuture<CreateEnterpriseRouterResponse> createEnterpriseRouterAsync(
        CreateEnterpriseRouterRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.createEnterpriseRouter);
    }

    /**
     * 创建企业路由器
     *
     * 创建企业路由器实例，如果使能默认关联路由表或使能默认传递路由表，那么系统会默认创建一张路由表，作为默认关联路由表或默认传递路由表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEnterpriseRouterRequest 请求对象
     * @return AsyncInvoker<CreateEnterpriseRouterRequest, CreateEnterpriseRouterResponse>
     */
    public AsyncInvoker<CreateEnterpriseRouterRequest, CreateEnterpriseRouterResponse> createEnterpriseRouterAsyncInvoker(
        CreateEnterpriseRouterRequest request) {
        return new AsyncInvoker<CreateEnterpriseRouterRequest, CreateEnterpriseRouterResponse>(request,
            ErMeta.createEnterpriseRouter, hcClient);
    }

    /**
     * 删除企业路由器
     *
     * 删除企业路由器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEnterpriseRouterRequest 请求对象
     * @return CompletableFuture<DeleteEnterpriseRouterResponse>
     */
    public CompletableFuture<DeleteEnterpriseRouterResponse> deleteEnterpriseRouterAsync(
        DeleteEnterpriseRouterRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.deleteEnterpriseRouter);
    }

    /**
     * 删除企业路由器
     *
     * 删除企业路由器。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEnterpriseRouterRequest 请求对象
     * @return AsyncInvoker<DeleteEnterpriseRouterRequest, DeleteEnterpriseRouterResponse>
     */
    public AsyncInvoker<DeleteEnterpriseRouterRequest, DeleteEnterpriseRouterResponse> deleteEnterpriseRouterAsyncInvoker(
        DeleteEnterpriseRouterRequest request) {
        return new AsyncInvoker<DeleteEnterpriseRouterRequest, DeleteEnterpriseRouterResponse>(request,
            ErMeta.deleteEnterpriseRouter, hcClient);
    }

    /**
     * 查询企业路由器列表
     *
     * 查询企业路由器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEnterpriseRoutersRequest 请求对象
     * @return CompletableFuture<ListEnterpriseRoutersResponse>
     */
    public CompletableFuture<ListEnterpriseRoutersResponse> listEnterpriseRoutersAsync(
        ListEnterpriseRoutersRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.listEnterpriseRouters);
    }

    /**
     * 查询企业路由器列表
     *
     * 查询企业路由器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEnterpriseRoutersRequest 请求对象
     * @return AsyncInvoker<ListEnterpriseRoutersRequest, ListEnterpriseRoutersResponse>
     */
    public AsyncInvoker<ListEnterpriseRoutersRequest, ListEnterpriseRoutersResponse> listEnterpriseRoutersAsyncInvoker(
        ListEnterpriseRoutersRequest request) {
        return new AsyncInvoker<ListEnterpriseRoutersRequest, ListEnterpriseRoutersResponse>(request,
            ErMeta.listEnterpriseRouters, hcClient);
    }

    /**
     * 查询企业路由器详情
     *
     * 查询企业路由器详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEnterpriseRouterRequest 请求对象
     * @return CompletableFuture<ShowEnterpriseRouterResponse>
     */
    public CompletableFuture<ShowEnterpriseRouterResponse> showEnterpriseRouterAsync(
        ShowEnterpriseRouterRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.showEnterpriseRouter);
    }

    /**
     * 查询企业路由器详情
     *
     * 查询企业路由器详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEnterpriseRouterRequest 请求对象
     * @return AsyncInvoker<ShowEnterpriseRouterRequest, ShowEnterpriseRouterResponse>
     */
    public AsyncInvoker<ShowEnterpriseRouterRequest, ShowEnterpriseRouterResponse> showEnterpriseRouterAsyncInvoker(
        ShowEnterpriseRouterRequest request) {
        return new AsyncInvoker<ShowEnterpriseRouterRequest, ShowEnterpriseRouterResponse>(request,
            ErMeta.showEnterpriseRouter, hcClient);
    }

    /**
     * 更新企业路由器
     *
     * 更新企业路由器基本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEnterpriseRouterRequest 请求对象
     * @return CompletableFuture<UpdateEnterpriseRouterResponse>
     */
    public CompletableFuture<UpdateEnterpriseRouterResponse> updateEnterpriseRouterAsync(
        UpdateEnterpriseRouterRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.updateEnterpriseRouter);
    }

    /**
     * 更新企业路由器
     *
     * 更新企业路由器基本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEnterpriseRouterRequest 请求对象
     * @return AsyncInvoker<UpdateEnterpriseRouterRequest, UpdateEnterpriseRouterResponse>
     */
    public AsyncInvoker<UpdateEnterpriseRouterRequest, UpdateEnterpriseRouterResponse> updateEnterpriseRouterAsyncInvoker(
        UpdateEnterpriseRouterRequest request) {
        return new AsyncInvoker<UpdateEnterpriseRouterRequest, UpdateEnterpriseRouterResponse>(request,
            ErMeta.updateEnterpriseRouter, hcClient);
    }

    /**
     * 创建流日志
     *
     * 给ER实例创建流日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateFlowLogRequest 请求对象
     * @return CompletableFuture<CreateFlowLogResponse>
     */
    public CompletableFuture<CreateFlowLogResponse> createFlowLogAsync(CreateFlowLogRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.createFlowLog);
    }

    /**
     * 创建流日志
     *
     * 给ER实例创建流日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateFlowLogRequest 请求对象
     * @return AsyncInvoker<CreateFlowLogRequest, CreateFlowLogResponse>
     */
    public AsyncInvoker<CreateFlowLogRequest, CreateFlowLogResponse> createFlowLogAsyncInvoker(
        CreateFlowLogRequest request) {
        return new AsyncInvoker<CreateFlowLogRequest, CreateFlowLogResponse>(request, ErMeta.createFlowLog, hcClient);
    }

    /**
     * 删除流日志
     *
     * 删除流日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteFlowLogRequest 请求对象
     * @return CompletableFuture<DeleteFlowLogResponse>
     */
    public CompletableFuture<DeleteFlowLogResponse> deleteFlowLogAsync(DeleteFlowLogRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.deleteFlowLog);
    }

    /**
     * 删除流日志
     *
     * 删除流日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteFlowLogRequest 请求对象
     * @return AsyncInvoker<DeleteFlowLogRequest, DeleteFlowLogResponse>
     */
    public AsyncInvoker<DeleteFlowLogRequest, DeleteFlowLogResponse> deleteFlowLogAsyncInvoker(
        DeleteFlowLogRequest request) {
        return new AsyncInvoker<DeleteFlowLogRequest, DeleteFlowLogResponse>(request, ErMeta.deleteFlowLog, hcClient);
    }

    /**
     * 关闭流日志
     *
     * 关闭流日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisableFlowLogRequest 请求对象
     * @return CompletableFuture<DisableFlowLogResponse>
     */
    public CompletableFuture<DisableFlowLogResponse> disableFlowLogAsync(DisableFlowLogRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.disableFlowLog);
    }

    /**
     * 关闭流日志
     *
     * 关闭流日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisableFlowLogRequest 请求对象
     * @return AsyncInvoker<DisableFlowLogRequest, DisableFlowLogResponse>
     */
    public AsyncInvoker<DisableFlowLogRequest, DisableFlowLogResponse> disableFlowLogAsyncInvoker(
        DisableFlowLogRequest request) {
        return new AsyncInvoker<DisableFlowLogRequest, DisableFlowLogResponse>(request, ErMeta.disableFlowLog,
            hcClient);
    }

    /**
     * 开启流日志
     *
     * 开启流日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param EnableFlowLogRequest 请求对象
     * @return CompletableFuture<EnableFlowLogResponse>
     */
    public CompletableFuture<EnableFlowLogResponse> enableFlowLogAsync(EnableFlowLogRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.enableFlowLog);
    }

    /**
     * 开启流日志
     *
     * 开启流日志
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param EnableFlowLogRequest 请求对象
     * @return AsyncInvoker<EnableFlowLogRequest, EnableFlowLogResponse>
     */
    public AsyncInvoker<EnableFlowLogRequest, EnableFlowLogResponse> enableFlowLogAsyncInvoker(
        EnableFlowLogRequest request) {
        return new AsyncInvoker<EnableFlowLogRequest, EnableFlowLogResponse>(request, ErMeta.enableFlowLog, hcClient);
    }

    /**
     * 查询流日志列表
     *
     * 查询企业路由器实例下的流日志列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFlowLogsRequest 请求对象
     * @return CompletableFuture<ListFlowLogsResponse>
     */
    public CompletableFuture<ListFlowLogsResponse> listFlowLogsAsync(ListFlowLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.listFlowLogs);
    }

    /**
     * 查询流日志列表
     *
     * 查询企业路由器实例下的流日志列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListFlowLogsRequest 请求对象
     * @return AsyncInvoker<ListFlowLogsRequest, ListFlowLogsResponse>
     */
    public AsyncInvoker<ListFlowLogsRequest, ListFlowLogsResponse> listFlowLogsAsyncInvoker(
        ListFlowLogsRequest request) {
        return new AsyncInvoker<ListFlowLogsRequest, ListFlowLogsResponse>(request, ErMeta.listFlowLogs, hcClient);
    }

    /**
     * 查询流日志详情
     *
     * 查询流日志详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowFlowLogRequest 请求对象
     * @return CompletableFuture<ShowFlowLogResponse>
     */
    public CompletableFuture<ShowFlowLogResponse> showFlowLogAsync(ShowFlowLogRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.showFlowLog);
    }

    /**
     * 查询流日志详情
     *
     * 查询流日志详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowFlowLogRequest 请求对象
     * @return AsyncInvoker<ShowFlowLogRequest, ShowFlowLogResponse>
     */
    public AsyncInvoker<ShowFlowLogRequest, ShowFlowLogResponse> showFlowLogAsyncInvoker(ShowFlowLogRequest request) {
        return new AsyncInvoker<ShowFlowLogRequest, ShowFlowLogResponse>(request, ErMeta.showFlowLog, hcClient);
    }

    /**
     * 更新流日志基本信息
     *
     * 更新流日志基本信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateFlowLogRequest 请求对象
     * @return CompletableFuture<UpdateFlowLogResponse>
     */
    public CompletableFuture<UpdateFlowLogResponse> updateFlowLogAsync(UpdateFlowLogRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.updateFlowLog);
    }

    /**
     * 更新流日志基本信息
     *
     * 更新流日志基本信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateFlowLogRequest 请求对象
     * @return AsyncInvoker<UpdateFlowLogRequest, UpdateFlowLogResponse>
     */
    public AsyncInvoker<UpdateFlowLogRequest, UpdateFlowLogResponse> updateFlowLogAsyncInvoker(
        UpdateFlowLogRequest request) {
        return new AsyncInvoker<UpdateFlowLogRequest, UpdateFlowLogResponse>(request, ErMeta.updateFlowLog, hcClient);
    }

    /**
     * 删除路由传播
     *
     * 解绑连接和路由表的传播关系。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisablePropagationRequest 请求对象
     * @return CompletableFuture<DisablePropagationResponse>
     */
    public CompletableFuture<DisablePropagationResponse> disablePropagationAsync(DisablePropagationRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.disablePropagation);
    }

    /**
     * 删除路由传播
     *
     * 解绑连接和路由表的传播关系。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisablePropagationRequest 请求对象
     * @return AsyncInvoker<DisablePropagationRequest, DisablePropagationResponse>
     */
    public AsyncInvoker<DisablePropagationRequest, DisablePropagationResponse> disablePropagationAsyncInvoker(
        DisablePropagationRequest request) {
        return new AsyncInvoker<DisablePropagationRequest, DisablePropagationResponse>(request,
            ErMeta.disablePropagation, hcClient);
    }

    /**
     * 创建路由传播
     *
     * 每个连接可以和多个路由表建立传播关系，从该连接学习到的路由会应用到具有传播关系的路由表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param EnablePropagationRequest 请求对象
     * @return CompletableFuture<EnablePropagationResponse>
     */
    public CompletableFuture<EnablePropagationResponse> enablePropagationAsync(EnablePropagationRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.enablePropagation);
    }

    /**
     * 创建路由传播
     *
     * 每个连接可以和多个路由表建立传播关系，从该连接学习到的路由会应用到具有传播关系的路由表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param EnablePropagationRequest 请求对象
     * @return AsyncInvoker<EnablePropagationRequest, EnablePropagationResponse>
     */
    public AsyncInvoker<EnablePropagationRequest, EnablePropagationResponse> enablePropagationAsyncInvoker(
        EnablePropagationRequest request) {
        return new AsyncInvoker<EnablePropagationRequest, EnablePropagationResponse>(request, ErMeta.enablePropagation,
            hcClient);
    }

    /**
     * 查询路由传播列表
     *
     * 查询路由传播列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPropagationsRequest 请求对象
     * @return CompletableFuture<ListPropagationsResponse>
     */
    public CompletableFuture<ListPropagationsResponse> listPropagationsAsync(ListPropagationsRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.listPropagations);
    }

    /**
     * 查询路由传播列表
     *
     * 查询路由传播列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPropagationsRequest 请求对象
     * @return AsyncInvoker<ListPropagationsRequest, ListPropagationsResponse>
     */
    public AsyncInvoker<ListPropagationsRequest, ListPropagationsResponse> listPropagationsAsyncInvoker(
        ListPropagationsRequest request) {
        return new AsyncInvoker<ListPropagationsRequest, ListPropagationsResponse>(request, ErMeta.listPropagations,
            hcClient);
    }

    /**
     * 查询配额
     *
     * 查询租户各类资源的使用情况，如企业路由器的使用量，VPC连接的使用量等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowQuotasRequest 请求对象
     * @return CompletableFuture<ShowQuotasResponse>
     */
    public CompletableFuture<ShowQuotasResponse> showQuotasAsync(ShowQuotasRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.showQuotas);
    }

    /**
     * 查询配额
     *
     * 查询租户各类资源的使用情况，如企业路由器的使用量，VPC连接的使用量等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowQuotasRequest 请求对象
     * @return AsyncInvoker<ShowQuotasRequest, ShowQuotasResponse>
     */
    public AsyncInvoker<ShowQuotasRequest, ShowQuotasResponse> showQuotasAsyncInvoker(ShowQuotasRequest request) {
        return new AsyncInvoker<ShowQuotasRequest, ShowQuotasResponse>(request, ErMeta.showQuotas, hcClient);
    }

    /**
     * 创建静态路由
     *
     * 创建静态路由
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateStaticRouteRequest 请求对象
     * @return CompletableFuture<CreateStaticRouteResponse>
     */
    public CompletableFuture<CreateStaticRouteResponse> createStaticRouteAsync(CreateStaticRouteRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.createStaticRoute);
    }

    /**
     * 创建静态路由
     *
     * 创建静态路由
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateStaticRouteRequest 请求对象
     * @return AsyncInvoker<CreateStaticRouteRequest, CreateStaticRouteResponse>
     */
    public AsyncInvoker<CreateStaticRouteRequest, CreateStaticRouteResponse> createStaticRouteAsyncInvoker(
        CreateStaticRouteRequest request) {
        return new AsyncInvoker<CreateStaticRouteRequest, CreateStaticRouteResponse>(request, ErMeta.createStaticRoute,
            hcClient);
    }

    /**
     * 删除静态路由
     *
     * 删除静态路由
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteStaticRouteRequest 请求对象
     * @return CompletableFuture<DeleteStaticRouteResponse>
     */
    public CompletableFuture<DeleteStaticRouteResponse> deleteStaticRouteAsync(DeleteStaticRouteRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.deleteStaticRoute);
    }

    /**
     * 删除静态路由
     *
     * 删除静态路由
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteStaticRouteRequest 请求对象
     * @return AsyncInvoker<DeleteStaticRouteRequest, DeleteStaticRouteResponse>
     */
    public AsyncInvoker<DeleteStaticRouteRequest, DeleteStaticRouteResponse> deleteStaticRouteAsyncInvoker(
        DeleteStaticRouteRequest request) {
        return new AsyncInvoker<DeleteStaticRouteRequest, DeleteStaticRouteResponse>(request, ErMeta.deleteStaticRoute,
            hcClient);
    }

    /**
     * 查询有效路由列表
     *
     * 查询有效的路由列表，支持分页查询能力
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEffectiveRoutesRequest 请求对象
     * @return CompletableFuture<ListEffectiveRoutesResponse>
     */
    public CompletableFuture<ListEffectiveRoutesResponse> listEffectiveRoutesAsync(ListEffectiveRoutesRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.listEffectiveRoutes);
    }

    /**
     * 查询有效路由列表
     *
     * 查询有效的路由列表，支持分页查询能力
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEffectiveRoutesRequest 请求对象
     * @return AsyncInvoker<ListEffectiveRoutesRequest, ListEffectiveRoutesResponse>
     */
    public AsyncInvoker<ListEffectiveRoutesRequest, ListEffectiveRoutesResponse> listEffectiveRoutesAsyncInvoker(
        ListEffectiveRoutesRequest request) {
        return new AsyncInvoker<ListEffectiveRoutesRequest, ListEffectiveRoutesResponse>(request,
            ErMeta.listEffectiveRoutes, hcClient);
    }

    /**
     * 查询静态路由列表
     *
     * 查询静态路由列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStaticRoutesRequest 请求对象
     * @return CompletableFuture<ListStaticRoutesResponse>
     */
    public CompletableFuture<ListStaticRoutesResponse> listStaticRoutesAsync(ListStaticRoutesRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.listStaticRoutes);
    }

    /**
     * 查询静态路由列表
     *
     * 查询静态路由列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListStaticRoutesRequest 请求对象
     * @return AsyncInvoker<ListStaticRoutesRequest, ListStaticRoutesResponse>
     */
    public AsyncInvoker<ListStaticRoutesRequest, ListStaticRoutesResponse> listStaticRoutesAsyncInvoker(
        ListStaticRoutesRequest request) {
        return new AsyncInvoker<ListStaticRoutesRequest, ListStaticRoutesResponse>(request, ErMeta.listStaticRoutes,
            hcClient);
    }

    /**
     * 查询静态路由详情
     *
     * 查询静态路由详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowStaticRouteRequest 请求对象
     * @return CompletableFuture<ShowStaticRouteResponse>
     */
    public CompletableFuture<ShowStaticRouteResponse> showStaticRouteAsync(ShowStaticRouteRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.showStaticRoute);
    }

    /**
     * 查询静态路由详情
     *
     * 查询静态路由详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowStaticRouteRequest 请求对象
     * @return AsyncInvoker<ShowStaticRouteRequest, ShowStaticRouteResponse>
     */
    public AsyncInvoker<ShowStaticRouteRequest, ShowStaticRouteResponse> showStaticRouteAsyncInvoker(
        ShowStaticRouteRequest request) {
        return new AsyncInvoker<ShowStaticRouteRequest, ShowStaticRouteResponse>(request, ErMeta.showStaticRoute,
            hcClient);
    }

    /**
     * 更新静态路由
     *
     * 更新静态路由
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateStaticRouteRequest 请求对象
     * @return CompletableFuture<UpdateStaticRouteResponse>
     */
    public CompletableFuture<UpdateStaticRouteResponse> updateStaticRouteAsync(UpdateStaticRouteRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.updateStaticRoute);
    }

    /**
     * 更新静态路由
     *
     * 更新静态路由
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateStaticRouteRequest 请求对象
     * @return AsyncInvoker<UpdateStaticRouteRequest, UpdateStaticRouteResponse>
     */
    public AsyncInvoker<UpdateStaticRouteRequest, UpdateStaticRouteResponse> updateStaticRouteAsyncInvoker(
        UpdateStaticRouteRequest request) {
        return new AsyncInvoker<UpdateStaticRouteRequest, UpdateStaticRouteResponse>(request, ErMeta.updateStaticRoute,
            hcClient);
    }

    /**
     * 创建路由表
     *
     * 路由表是企业路由器收发报文的依据，包含了连接的关联关系，传播关系以及路由信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRouteTableRequest 请求对象
     * @return CompletableFuture<CreateRouteTableResponse>
     */
    public CompletableFuture<CreateRouteTableResponse> createRouteTableAsync(CreateRouteTableRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.createRouteTable);
    }

    /**
     * 创建路由表
     *
     * 路由表是企业路由器收发报文的依据，包含了连接的关联关系，传播关系以及路由信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRouteTableRequest 请求对象
     * @return AsyncInvoker<CreateRouteTableRequest, CreateRouteTableResponse>
     */
    public AsyncInvoker<CreateRouteTableRequest, CreateRouteTableResponse> createRouteTableAsyncInvoker(
        CreateRouteTableRequest request) {
        return new AsyncInvoker<CreateRouteTableRequest, CreateRouteTableResponse>(request, ErMeta.createRouteTable,
            hcClient);
    }

    /**
     * 删除路由表
     *
     * 删除路由表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRouteTableRequest 请求对象
     * @return CompletableFuture<DeleteRouteTableResponse>
     */
    public CompletableFuture<DeleteRouteTableResponse> deleteRouteTableAsync(DeleteRouteTableRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.deleteRouteTable);
    }

    /**
     * 删除路由表
     *
     * 删除路由表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRouteTableRequest 请求对象
     * @return AsyncInvoker<DeleteRouteTableRequest, DeleteRouteTableResponse>
     */
    public AsyncInvoker<DeleteRouteTableRequest, DeleteRouteTableResponse> deleteRouteTableAsyncInvoker(
        DeleteRouteTableRequest request) {
        return new AsyncInvoker<DeleteRouteTableRequest, DeleteRouteTableResponse>(request, ErMeta.deleteRouteTable,
            hcClient);
    }

    /**
     * 查询路由表列表
     *
     * 查询路由表列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRouteTablesRequest 请求对象
     * @return CompletableFuture<ListRouteTablesResponse>
     */
    public CompletableFuture<ListRouteTablesResponse> listRouteTablesAsync(ListRouteTablesRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.listRouteTables);
    }

    /**
     * 查询路由表列表
     *
     * 查询路由表列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRouteTablesRequest 请求对象
     * @return AsyncInvoker<ListRouteTablesRequest, ListRouteTablesResponse>
     */
    public AsyncInvoker<ListRouteTablesRequest, ListRouteTablesResponse> listRouteTablesAsyncInvoker(
        ListRouteTablesRequest request) {
        return new AsyncInvoker<ListRouteTablesRequest, ListRouteTablesResponse>(request, ErMeta.listRouteTables,
            hcClient);
    }

    /**
     * 查询路由表详情
     *
     * 查询路由表详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRouteTableRequest 请求对象
     * @return CompletableFuture<ShowRouteTableResponse>
     */
    public CompletableFuture<ShowRouteTableResponse> showRouteTableAsync(ShowRouteTableRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.showRouteTable);
    }

    /**
     * 查询路由表详情
     *
     * 查询路由表详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRouteTableRequest 请求对象
     * @return AsyncInvoker<ShowRouteTableRequest, ShowRouteTableResponse>
     */
    public AsyncInvoker<ShowRouteTableRequest, ShowRouteTableResponse> showRouteTableAsyncInvoker(
        ShowRouteTableRequest request) {
        return new AsyncInvoker<ShowRouteTableRequest, ShowRouteTableResponse>(request, ErMeta.showRouteTable,
            hcClient);
    }

    /**
     * 更新路由表信息
     *
     * 更新路由表基本信息，如名称，描述等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateRouteTableRequest 请求对象
     * @return CompletableFuture<UpdateRouteTableResponse>
     */
    public CompletableFuture<UpdateRouteTableResponse> updateRouteTableAsync(UpdateRouteTableRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.updateRouteTable);
    }

    /**
     * 更新路由表信息
     *
     * 更新路由表基本信息，如名称，描述等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateRouteTableRequest 请求对象
     * @return AsyncInvoker<UpdateRouteTableRequest, UpdateRouteTableResponse>
     */
    public AsyncInvoker<UpdateRouteTableRequest, UpdateRouteTableResponse> updateRouteTableAsyncInvoker(
        UpdateRouteTableRequest request) {
        return new AsyncInvoker<UpdateRouteTableRequest, UpdateRouteTableResponse>(request, ErMeta.updateRouteTable,
            hcClient);
    }

    /**
     * 批量添加删除资源标签
     *
     * - 为指定实例批量添加或删除标签
     * - 标签管理服务需要使用该接口批量管理实例的标签。
     * - 一个资源上最多有10个标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateResourceTagsRequest 请求对象
     * @return CompletableFuture<BatchCreateResourceTagsResponse>
     */
    public CompletableFuture<BatchCreateResourceTagsResponse> batchCreateResourceTagsAsync(
        BatchCreateResourceTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.batchCreateResourceTags);
    }

    /**
     * 批量添加删除资源标签
     *
     * - 为指定实例批量添加或删除标签
     * - 标签管理服务需要使用该接口批量管理实例的标签。
     * - 一个资源上最多有10个标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateResourceTagsRequest 请求对象
     * @return AsyncInvoker<BatchCreateResourceTagsRequest, BatchCreateResourceTagsResponse>
     */
    public AsyncInvoker<BatchCreateResourceTagsRequest, BatchCreateResourceTagsResponse> batchCreateResourceTagsAsyncInvoker(
        BatchCreateResourceTagsRequest request) {
        return new AsyncInvoker<BatchCreateResourceTagsRequest, BatchCreateResourceTagsResponse>(request,
            ErMeta.batchCreateResourceTags, hcClient);
    }

    /**
     * 创建资源标签
     *
     * 为特定类型的资源创建标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateResourceTagRequest 请求对象
     * @return CompletableFuture<CreateResourceTagResponse>
     */
    public CompletableFuture<CreateResourceTagResponse> createResourceTagAsync(CreateResourceTagRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.createResourceTag);
    }

    /**
     * 创建资源标签
     *
     * 为特定类型的资源创建标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateResourceTagRequest 请求对象
     * @return AsyncInvoker<CreateResourceTagRequest, CreateResourceTagResponse>
     */
    public AsyncInvoker<CreateResourceTagRequest, CreateResourceTagResponse> createResourceTagAsyncInvoker(
        CreateResourceTagRequest request) {
        return new AsyncInvoker<CreateResourceTagRequest, CreateResourceTagResponse>(request, ErMeta.createResourceTag,
            hcClient);
    }

    /**
     * 删除资源标签
     *
     * 删除特定类型资源的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteResourceTagRequest 请求对象
     * @return CompletableFuture<DeleteResourceTagResponse>
     */
    public CompletableFuture<DeleteResourceTagResponse> deleteResourceTagAsync(DeleteResourceTagRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.deleteResourceTag);
    }

    /**
     * 删除资源标签
     *
     * 删除特定类型资源的标签。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteResourceTagRequest 请求对象
     * @return AsyncInvoker<DeleteResourceTagRequest, DeleteResourceTagResponse>
     */
    public AsyncInvoker<DeleteResourceTagRequest, DeleteResourceTagResponse> deleteResourceTagAsyncInvoker(
        DeleteResourceTagRequest request) {
        return new AsyncInvoker<DeleteResourceTagRequest, DeleteResourceTagResponse>(request, ErMeta.deleteResourceTag,
            hcClient);
    }

    /**
     * 查询项目标签
     *
     * 查询特定类型资源的标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProjectTagsRequest 请求对象
     * @return CompletableFuture<ListProjectTagsResponse>
     */
    public CompletableFuture<ListProjectTagsResponse> listProjectTagsAsync(ListProjectTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.listProjectTags);
    }

    /**
     * 查询项目标签
     *
     * 查询特定类型资源的标签集合。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListProjectTagsRequest 请求对象
     * @return AsyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse>
     */
    public AsyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse> listProjectTagsAsyncInvoker(
        ListProjectTagsRequest request) {
        return new AsyncInvoker<ListProjectTagsRequest, ListProjectTagsResponse>(request, ErMeta.listProjectTags,
            hcClient);
    }

    /**
     * 查询资源标签
     *
     * 查询特定类型资源的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResourceTagRequest 请求对象
     * @return CompletableFuture<ShowResourceTagResponse>
     */
    public CompletableFuture<ShowResourceTagResponse> showResourceTagAsync(ShowResourceTagRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.showResourceTag);
    }

    /**
     * 查询资源标签
     *
     * 查询特定类型资源的标签信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResourceTagRequest 请求对象
     * @return AsyncInvoker<ShowResourceTagRequest, ShowResourceTagResponse>
     */
    public AsyncInvoker<ShowResourceTagRequest, ShowResourceTagResponse> showResourceTagAsyncInvoker(
        ShowResourceTagRequest request) {
        return new AsyncInvoker<ShowResourceTagRequest, ShowResourceTagResponse>(request, ErMeta.showResourceTag,
            hcClient);
    }

    /**
     * 创建VPC连接
     *
     * 给ER实例创建VPC连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVpcAttachmentRequest 请求对象
     * @return CompletableFuture<CreateVpcAttachmentResponse>
     */
    public CompletableFuture<CreateVpcAttachmentResponse> createVpcAttachmentAsync(CreateVpcAttachmentRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.createVpcAttachment);
    }

    /**
     * 创建VPC连接
     *
     * 给ER实例创建VPC连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateVpcAttachmentRequest 请求对象
     * @return AsyncInvoker<CreateVpcAttachmentRequest, CreateVpcAttachmentResponse>
     */
    public AsyncInvoker<CreateVpcAttachmentRequest, CreateVpcAttachmentResponse> createVpcAttachmentAsyncInvoker(
        CreateVpcAttachmentRequest request) {
        return new AsyncInvoker<CreateVpcAttachmentRequest, CreateVpcAttachmentResponse>(request,
            ErMeta.createVpcAttachment, hcClient);
    }

    /**
     * 删除VPC连接
     *
     * 删除VPC连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteVpcAttachmentRequest 请求对象
     * @return CompletableFuture<DeleteVpcAttachmentResponse>
     */
    public CompletableFuture<DeleteVpcAttachmentResponse> deleteVpcAttachmentAsync(DeleteVpcAttachmentRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.deleteVpcAttachment);
    }

    /**
     * 删除VPC连接
     *
     * 删除VPC连接。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteVpcAttachmentRequest 请求对象
     * @return AsyncInvoker<DeleteVpcAttachmentRequest, DeleteVpcAttachmentResponse>
     */
    public AsyncInvoker<DeleteVpcAttachmentRequest, DeleteVpcAttachmentResponse> deleteVpcAttachmentAsyncInvoker(
        DeleteVpcAttachmentRequest request) {
        return new AsyncInvoker<DeleteVpcAttachmentRequest, DeleteVpcAttachmentResponse>(request,
            ErMeta.deleteVpcAttachment, hcClient);
    }

    /**
     * 查询VPC连接列表
     *
     * 查询企业路由器实例下的VPC连接列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVpcAttachmentsRequest 请求对象
     * @return CompletableFuture<ListVpcAttachmentsResponse>
     */
    public CompletableFuture<ListVpcAttachmentsResponse> listVpcAttachmentsAsync(ListVpcAttachmentsRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.listVpcAttachments);
    }

    /**
     * 查询VPC连接列表
     *
     * 查询企业路由器实例下的VPC连接列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListVpcAttachmentsRequest 请求对象
     * @return AsyncInvoker<ListVpcAttachmentsRequest, ListVpcAttachmentsResponse>
     */
    public AsyncInvoker<ListVpcAttachmentsRequest, ListVpcAttachmentsResponse> listVpcAttachmentsAsyncInvoker(
        ListVpcAttachmentsRequest request) {
        return new AsyncInvoker<ListVpcAttachmentsRequest, ListVpcAttachmentsResponse>(request,
            ErMeta.listVpcAttachments, hcClient);
    }

    /**
     * 查询VPC连接详情
     *
     * 查询VPC连接详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVpcAttachmentRequest 请求对象
     * @return CompletableFuture<ShowVpcAttachmentResponse>
     */
    public CompletableFuture<ShowVpcAttachmentResponse> showVpcAttachmentAsync(ShowVpcAttachmentRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.showVpcAttachment);
    }

    /**
     * 查询VPC连接详情
     *
     * 查询VPC连接详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowVpcAttachmentRequest 请求对象
     * @return AsyncInvoker<ShowVpcAttachmentRequest, ShowVpcAttachmentResponse>
     */
    public AsyncInvoker<ShowVpcAttachmentRequest, ShowVpcAttachmentResponse> showVpcAttachmentAsyncInvoker(
        ShowVpcAttachmentRequest request) {
        return new AsyncInvoker<ShowVpcAttachmentRequest, ShowVpcAttachmentResponse>(request, ErMeta.showVpcAttachment,
            hcClient);
    }

    /**
     * 更新VPC连接基本信息
     *
     * 修改VPC连接基本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateVpcAttachmentRequest 请求对象
     * @return CompletableFuture<UpdateVpcAttachmentResponse>
     */
    public CompletableFuture<UpdateVpcAttachmentResponse> updateVpcAttachmentAsync(UpdateVpcAttachmentRequest request) {
        return hcClient.asyncInvokeHttp(request, ErMeta.updateVpcAttachment);
    }

    /**
     * 更新VPC连接基本信息
     *
     * 修改VPC连接基本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateVpcAttachmentRequest 请求对象
     * @return AsyncInvoker<UpdateVpcAttachmentRequest, UpdateVpcAttachmentResponse>
     */
    public AsyncInvoker<UpdateVpcAttachmentRequest, UpdateVpcAttachmentResponse> updateVpcAttachmentAsyncInvoker(
        UpdateVpcAttachmentRequest request) {
        return new AsyncInvoker<UpdateVpcAttachmentRequest, UpdateVpcAttachmentResponse>(request,
            ErMeta.updateVpcAttachment, hcClient);
    }

}
