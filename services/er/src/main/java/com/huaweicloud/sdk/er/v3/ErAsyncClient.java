package com.huaweicloud.sdk.er.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.er.v3.model.*;

import java.util.concurrent.CompletableFuture;

public class ErAsyncClient {

    protected HcClient hcClient;

    public ErAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ErAsyncClient> newBuilder() {
        return new ClientBuilder<>(ErAsyncClient::new);
    }

    /**
     * 创建路由关联
     *
     * 每个连接只能关联到一张路由表。通过创建关联将连接关联到路由表，从该连接收到的报文会用被关联的路由表进行路由。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 查询连接列表
     *
     * 查询企业路由器实例下的连接列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 查询连接详情
     *
     * 查询连接详情
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 删除路由传播
     *
     * 解绑连接和路由表的传播关系。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 创建静态路由
     *
     * 创建静态路由
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 创建资源标签
     *
     * 为特定类型的资源创建标签。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
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
