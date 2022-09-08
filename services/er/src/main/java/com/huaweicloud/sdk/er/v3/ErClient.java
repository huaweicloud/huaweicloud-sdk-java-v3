package com.huaweicloud.sdk.er.v3;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.er.v3.model.*;

public class ErClient {

    protected HcClient hcClient;

    public ErClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<ErClient> newBuilder() {
        return new ClientBuilder<>(ErClient::new);
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
     * @return AssociateRouteTableResponse
     */
    public AssociateRouteTableResponse associateRouteTable(AssociateRouteTableRequest request) {
        return hcClient.syncInvokeHttp(request, ErMeta.associateRouteTable);
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
     * @return SyncInvoker<AssociateRouteTableRequest, AssociateRouteTableResponse>
     */
    public SyncInvoker<AssociateRouteTableRequest, AssociateRouteTableResponse> associateRouteTableInvoker(
        AssociateRouteTableRequest request) {
        return new SyncInvoker<AssociateRouteTableRequest, AssociateRouteTableResponse>(request,
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
     * @return DisassociateRouteTableResponse
     */
    public DisassociateRouteTableResponse disassociateRouteTable(DisassociateRouteTableRequest request) {
        return hcClient.syncInvokeHttp(request, ErMeta.disassociateRouteTable);
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
     * @return SyncInvoker<DisassociateRouteTableRequest, DisassociateRouteTableResponse>
     */
    public SyncInvoker<DisassociateRouteTableRequest, DisassociateRouteTableResponse> disassociateRouteTableInvoker(
        DisassociateRouteTableRequest request) {
        return new SyncInvoker<DisassociateRouteTableRequest, DisassociateRouteTableResponse>(request,
            ErMeta.disassociateRouteTable, hcClient);
    }

    /**
     * 查询路由关联列表
     *
     * 支持分页查询, 支持过滤查询：state, resource_type, attachment_id。支持单字段排序，排序字段有[id,created_at,updated_at]，不支持多字段排序。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListAssociationsRequest 请求对象
     * @return ListAssociationsResponse
     */
    public ListAssociationsResponse listAssociations(ListAssociationsRequest request) {
        return hcClient.syncInvokeHttp(request, ErMeta.listAssociations);
    }

    /**
     * 查询路由关联列表
     *
     * 支持分页查询, 支持过滤查询：state, resource_type, attachment_id。支持单字段排序，排序字段有[id,created_at,updated_at]，不支持多字段排序。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListAssociationsRequest 请求对象
     * @return SyncInvoker<ListAssociationsRequest, ListAssociationsResponse>
     */
    public SyncInvoker<ListAssociationsRequest, ListAssociationsResponse> listAssociationsInvoker(
        ListAssociationsRequest request) {
        return new SyncInvoker<ListAssociationsRequest, ListAssociationsResponse>(request, ErMeta.listAssociations,
            hcClient);
    }

    /**
     * 查询连接列表
     *
     * 查询企业路由器实例下的连接列表：
     *  1，支持过滤查询，过滤条件有state，resource_type，resource_id过滤条件可以重复和组合 
     * 2，支持分页查询，limit和marker组合实现分页查询 
     * 3，支持单字段排序，排序字段有[id,name,description,created_at,updated_at]，不支持多字段排序。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListAttachmentsRequest 请求对象
     * @return ListAttachmentsResponse
     */
    public ListAttachmentsResponse listAttachments(ListAttachmentsRequest request) {
        return hcClient.syncInvokeHttp(request, ErMeta.listAttachments);
    }

    /**
     * 查询连接列表
     *
     * 查询企业路由器实例下的连接列表：
     *  1，支持过滤查询，过滤条件有state，resource_type，resource_id过滤条件可以重复和组合 
     * 2，支持分页查询，limit和marker组合实现分页查询 
     * 3，支持单字段排序，排序字段有[id,name,description,created_at,updated_at]，不支持多字段排序。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListAttachmentsRequest 请求对象
     * @return SyncInvoker<ListAttachmentsRequest, ListAttachmentsResponse>
     */
    public SyncInvoker<ListAttachmentsRequest, ListAttachmentsResponse> listAttachmentsInvoker(
        ListAttachmentsRequest request) {
        return new SyncInvoker<ListAttachmentsRequest, ListAttachmentsResponse>(request, ErMeta.listAttachments,
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
     * @return ShowAttachmentResponse
     */
    public ShowAttachmentResponse showAttachment(ShowAttachmentRequest request) {
        return hcClient.syncInvokeHttp(request, ErMeta.showAttachment);
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
     * @return SyncInvoker<ShowAttachmentRequest, ShowAttachmentResponse>
     */
    public SyncInvoker<ShowAttachmentRequest, ShowAttachmentResponse> showAttachmentInvoker(
        ShowAttachmentRequest request) {
        return new SyncInvoker<ShowAttachmentRequest, ShowAttachmentResponse>(request, ErMeta.showAttachment, hcClient);
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
     * @return UpdateAttachmentResponse
     */
    public UpdateAttachmentResponse updateAttachment(UpdateAttachmentRequest request) {
        return hcClient.syncInvokeHttp(request, ErMeta.updateAttachment);
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
     * @return SyncInvoker<UpdateAttachmentRequest, UpdateAttachmentResponse>
     */
    public SyncInvoker<UpdateAttachmentRequest, UpdateAttachmentResponse> updateAttachmentInvoker(
        UpdateAttachmentRequest request) {
        return new SyncInvoker<UpdateAttachmentRequest, UpdateAttachmentResponse>(request, ErMeta.updateAttachment,
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
     * @return ListAvailabilityZoneResponse
     */
    public ListAvailabilityZoneResponse listAvailabilityZone(ListAvailabilityZoneRequest request) {
        return hcClient.syncInvokeHttp(request, ErMeta.listAvailabilityZone);
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
     * @return SyncInvoker<ListAvailabilityZoneRequest, ListAvailabilityZoneResponse>
     */
    public SyncInvoker<ListAvailabilityZoneRequest, ListAvailabilityZoneResponse> listAvailabilityZoneInvoker(
        ListAvailabilityZoneRequest request) {
        return new SyncInvoker<ListAvailabilityZoneRequest, ListAvailabilityZoneResponse>(request,
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
     * @return ChangeAvailabilityZoneResponse
     */
    public ChangeAvailabilityZoneResponse changeAvailabilityZone(ChangeAvailabilityZoneRequest request) {
        return hcClient.syncInvokeHttp(request, ErMeta.changeAvailabilityZone);
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
     * @return SyncInvoker<ChangeAvailabilityZoneRequest, ChangeAvailabilityZoneResponse>
     */
    public SyncInvoker<ChangeAvailabilityZoneRequest, ChangeAvailabilityZoneResponse> changeAvailabilityZoneInvoker(
        ChangeAvailabilityZoneRequest request) {
        return new SyncInvoker<ChangeAvailabilityZoneRequest, ChangeAvailabilityZoneResponse>(request,
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
     * @return CreateEnterpriseRouterResponse
     */
    public CreateEnterpriseRouterResponse createEnterpriseRouter(CreateEnterpriseRouterRequest request) {
        return hcClient.syncInvokeHttp(request, ErMeta.createEnterpriseRouter);
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
     * @return SyncInvoker<CreateEnterpriseRouterRequest, CreateEnterpriseRouterResponse>
     */
    public SyncInvoker<CreateEnterpriseRouterRequest, CreateEnterpriseRouterResponse> createEnterpriseRouterInvoker(
        CreateEnterpriseRouterRequest request) {
        return new SyncInvoker<CreateEnterpriseRouterRequest, CreateEnterpriseRouterResponse>(request,
            ErMeta.createEnterpriseRouter, hcClient);
    }

    /**
     * 删除企业路由器
     *
     * 1，只能删除企业路由器实例和其创建的默认路由表，如果存在其他路由表和连接，那么需要先删除其他路由表、连接、关联、传播和路由条目等。 
     * 2，企业路由器实例状态为available，deleting和failed的时候才能删除。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteEnterpriseRouterRequest 请求对象
     * @return DeleteEnterpriseRouterResponse
     */
    public DeleteEnterpriseRouterResponse deleteEnterpriseRouter(DeleteEnterpriseRouterRequest request) {
        return hcClient.syncInvokeHttp(request, ErMeta.deleteEnterpriseRouter);
    }

    /**
     * 删除企业路由器
     *
     * 1，只能删除企业路由器实例和其创建的默认路由表，如果存在其他路由表和连接，那么需要先删除其他路由表、连接、关联、传播和路由条目等。 
     * 2，企业路由器实例状态为available，deleting和failed的时候才能删除。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteEnterpriseRouterRequest 请求对象
     * @return SyncInvoker<DeleteEnterpriseRouterRequest, DeleteEnterpriseRouterResponse>
     */
    public SyncInvoker<DeleteEnterpriseRouterRequest, DeleteEnterpriseRouterResponse> deleteEnterpriseRouterInvoker(
        DeleteEnterpriseRouterRequest request) {
        return new SyncInvoker<DeleteEnterpriseRouterRequest, DeleteEnterpriseRouterResponse>(request,
            ErMeta.deleteEnterpriseRouter, hcClient);
    }

    /**
     * 查询企业路由器实例列表
     *
     * 分页查询使用的参数为marker、limit。marker和limit一起使用时才会生效，单独使用无效。支持单字段排序，排序字段有[id,name,description,created_at,updated_at]，不支持多字段排序。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListEnterpriseRoutersRequest 请求对象
     * @return ListEnterpriseRoutersResponse
     */
    public ListEnterpriseRoutersResponse listEnterpriseRouters(ListEnterpriseRoutersRequest request) {
        return hcClient.syncInvokeHttp(request, ErMeta.listEnterpriseRouters);
    }

    /**
     * 查询企业路由器实例列表
     *
     * 分页查询使用的参数为marker、limit。marker和limit一起使用时才会生效，单独使用无效。支持单字段排序，排序字段有[id,name,description,created_at,updated_at]，不支持多字段排序。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListEnterpriseRoutersRequest 请求对象
     * @return SyncInvoker<ListEnterpriseRoutersRequest, ListEnterpriseRoutersResponse>
     */
    public SyncInvoker<ListEnterpriseRoutersRequest, ListEnterpriseRoutersResponse> listEnterpriseRoutersInvoker(
        ListEnterpriseRoutersRequest request) {
        return new SyncInvoker<ListEnterpriseRoutersRequest, ListEnterpriseRoutersResponse>(request,
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
     * @return ShowEnterpriseRouterResponse
     */
    public ShowEnterpriseRouterResponse showEnterpriseRouter(ShowEnterpriseRouterRequest request) {
        return hcClient.syncInvokeHttp(request, ErMeta.showEnterpriseRouter);
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
     * @return SyncInvoker<ShowEnterpriseRouterRequest, ShowEnterpriseRouterResponse>
     */
    public SyncInvoker<ShowEnterpriseRouterRequest, ShowEnterpriseRouterResponse> showEnterpriseRouterInvoker(
        ShowEnterpriseRouterRequest request) {
        return new SyncInvoker<ShowEnterpriseRouterRequest, ShowEnterpriseRouterResponse>(request,
            ErMeta.showEnterpriseRouter, hcClient);
    }

    /**
     * 更新企业路由器
     *
     * 除了name和description，其它信息只有在企业路由器实例状态为available的时候才能更新。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateEnterpriseRouterRequest 请求对象
     * @return UpdateEnterpriseRouterResponse
     */
    public UpdateEnterpriseRouterResponse updateEnterpriseRouter(UpdateEnterpriseRouterRequest request) {
        return hcClient.syncInvokeHttp(request, ErMeta.updateEnterpriseRouter);
    }

    /**
     * 更新企业路由器
     *
     * 除了name和description，其它信息只有在企业路由器实例状态为available的时候才能更新。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateEnterpriseRouterRequest 请求对象
     * @return SyncInvoker<UpdateEnterpriseRouterRequest, UpdateEnterpriseRouterResponse>
     */
    public SyncInvoker<UpdateEnterpriseRouterRequest, UpdateEnterpriseRouterResponse> updateEnterpriseRouterInvoker(
        UpdateEnterpriseRouterRequest request) {
        return new SyncInvoker<UpdateEnterpriseRouterRequest, UpdateEnterpriseRouterResponse>(request,
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
     * @return DisablePropagationResponse
     */
    public DisablePropagationResponse disablePropagation(DisablePropagationRequest request) {
        return hcClient.syncInvokeHttp(request, ErMeta.disablePropagation);
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
     * @return SyncInvoker<DisablePropagationRequest, DisablePropagationResponse>
     */
    public SyncInvoker<DisablePropagationRequest, DisablePropagationResponse> disablePropagationInvoker(
        DisablePropagationRequest request) {
        return new SyncInvoker<DisablePropagationRequest, DisablePropagationResponse>(request,
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
     * @return EnablePropagationResponse
     */
    public EnablePropagationResponse enablePropagation(EnablePropagationRequest request) {
        return hcClient.syncInvokeHttp(request, ErMeta.enablePropagation);
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
     * @return SyncInvoker<EnablePropagationRequest, EnablePropagationResponse>
     */
    public SyncInvoker<EnablePropagationRequest, EnablePropagationResponse> enablePropagationInvoker(
        EnablePropagationRequest request) {
        return new SyncInvoker<EnablePropagationRequest, EnablePropagationResponse>(request, ErMeta.enablePropagation,
            hcClient);
    }

    /**
     * 查询路由传播列表
     *
     * 支持分页查询, 支持过滤查询：state, resource_type, attachment_id。支持单字段排序，排序字段有[id,created_at,updated_at]，不支持多字段排序。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListPropagationsRequest 请求对象
     * @return ListPropagationsResponse
     */
    public ListPropagationsResponse listPropagations(ListPropagationsRequest request) {
        return hcClient.syncInvokeHttp(request, ErMeta.listPropagations);
    }

    /**
     * 查询路由传播列表
     *
     * 支持分页查询, 支持过滤查询：state, resource_type, attachment_id。支持单字段排序，排序字段有[id,created_at,updated_at]，不支持多字段排序。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListPropagationsRequest 请求对象
     * @return SyncInvoker<ListPropagationsRequest, ListPropagationsResponse>
     */
    public SyncInvoker<ListPropagationsRequest, ListPropagationsResponse> listPropagationsInvoker(
        ListPropagationsRequest request) {
        return new SyncInvoker<ListPropagationsRequest, ListPropagationsResponse>(request, ErMeta.listPropagations,
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
     * @return CreateStaticRouteResponse
     */
    public CreateStaticRouteResponse createStaticRoute(CreateStaticRouteRequest request) {
        return hcClient.syncInvokeHttp(request, ErMeta.createStaticRoute);
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
     * @return SyncInvoker<CreateStaticRouteRequest, CreateStaticRouteResponse>
     */
    public SyncInvoker<CreateStaticRouteRequest, CreateStaticRouteResponse> createStaticRouteInvoker(
        CreateStaticRouteRequest request) {
        return new SyncInvoker<CreateStaticRouteRequest, CreateStaticRouteResponse>(request, ErMeta.createStaticRoute,
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
     * @return DeleteStaticRouteResponse
     */
    public DeleteStaticRouteResponse deleteStaticRoute(DeleteStaticRouteRequest request) {
        return hcClient.syncInvokeHttp(request, ErMeta.deleteStaticRoute);
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
     * @return SyncInvoker<DeleteStaticRouteRequest, DeleteStaticRouteResponse>
     */
    public SyncInvoker<DeleteStaticRouteRequest, DeleteStaticRouteResponse> deleteStaticRouteInvoker(
        DeleteStaticRouteRequest request) {
        return new SyncInvoker<DeleteStaticRouteRequest, DeleteStaticRouteResponse>(request, ErMeta.deleteStaticRoute,
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
     * @return ListEffectiveRoutesResponse
     */
    public ListEffectiveRoutesResponse listEffectiveRoutes(ListEffectiveRoutesRequest request) {
        return hcClient.syncInvokeHttp(request, ErMeta.listEffectiveRoutes);
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
     * @return SyncInvoker<ListEffectiveRoutesRequest, ListEffectiveRoutesResponse>
     */
    public SyncInvoker<ListEffectiveRoutesRequest, ListEffectiveRoutesResponse> listEffectiveRoutesInvoker(
        ListEffectiveRoutesRequest request) {
        return new SyncInvoker<ListEffectiveRoutesRequest, ListEffectiveRoutesResponse>(request,
            ErMeta.listEffectiveRoutes, hcClient);
    }

    /**
     * 查询静态路由列表
     *
     * 支持分页查询，支持过滤查询：destination，attachment_id, resource_type, type.支持单字段排序，排序字段有[id,destination,created_at,updated_at]，不支持多字段排序。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListStaticRoutesRequest 请求对象
     * @return ListStaticRoutesResponse
     */
    public ListStaticRoutesResponse listStaticRoutes(ListStaticRoutesRequest request) {
        return hcClient.syncInvokeHttp(request, ErMeta.listStaticRoutes);
    }

    /**
     * 查询静态路由列表
     *
     * 支持分页查询，支持过滤查询：destination，attachment_id, resource_type, type.支持单字段排序，排序字段有[id,destination,created_at,updated_at]，不支持多字段排序。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListStaticRoutesRequest 请求对象
     * @return SyncInvoker<ListStaticRoutesRequest, ListStaticRoutesResponse>
     */
    public SyncInvoker<ListStaticRoutesRequest, ListStaticRoutesResponse> listStaticRoutesInvoker(
        ListStaticRoutesRequest request) {
        return new SyncInvoker<ListStaticRoutesRequest, ListStaticRoutesResponse>(request, ErMeta.listStaticRoutes,
            hcClient);
    }

    /**
     * 查询路由详情
     *
     * 查询路由详情
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowStaticRouteRequest 请求对象
     * @return ShowStaticRouteResponse
     */
    public ShowStaticRouteResponse showStaticRoute(ShowStaticRouteRequest request) {
        return hcClient.syncInvokeHttp(request, ErMeta.showStaticRoute);
    }

    /**
     * 查询路由详情
     *
     * 查询路由详情
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowStaticRouteRequest 请求对象
     * @return SyncInvoker<ShowStaticRouteRequest, ShowStaticRouteResponse>
     */
    public SyncInvoker<ShowStaticRouteRequest, ShowStaticRouteResponse> showStaticRouteInvoker(
        ShowStaticRouteRequest request) {
        return new SyncInvoker<ShowStaticRouteRequest, ShowStaticRouteResponse>(request, ErMeta.showStaticRoute,
            hcClient);
    }

    /**
     * 修改路由
     *
     * 修改静态路由
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateStaticRouteRequest 请求对象
     * @return UpdateStaticRouteResponse
     */
    public UpdateStaticRouteResponse updateStaticRoute(UpdateStaticRouteRequest request) {
        return hcClient.syncInvokeHttp(request, ErMeta.updateStaticRoute);
    }

    /**
     * 修改路由
     *
     * 修改静态路由
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateStaticRouteRequest 请求对象
     * @return SyncInvoker<UpdateStaticRouteRequest, UpdateStaticRouteResponse>
     */
    public SyncInvoker<UpdateStaticRouteRequest, UpdateStaticRouteResponse> updateStaticRouteInvoker(
        UpdateStaticRouteRequest request) {
        return new SyncInvoker<UpdateStaticRouteRequest, UpdateStaticRouteResponse>(request, ErMeta.updateStaticRoute,
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
     * @return CreateRouteTableResponse
     */
    public CreateRouteTableResponse createRouteTable(CreateRouteTableRequest request) {
        return hcClient.syncInvokeHttp(request, ErMeta.createRouteTable);
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
     * @return SyncInvoker<CreateRouteTableRequest, CreateRouteTableResponse>
     */
    public SyncInvoker<CreateRouteTableRequest, CreateRouteTableResponse> createRouteTableInvoker(
        CreateRouteTableRequest request) {
        return new SyncInvoker<CreateRouteTableRequest, CreateRouteTableResponse>(request, ErMeta.createRouteTable,
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
     * @return DeleteRouteTableResponse
     */
    public DeleteRouteTableResponse deleteRouteTable(DeleteRouteTableRequest request) {
        return hcClient.syncInvokeHttp(request, ErMeta.deleteRouteTable);
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
     * @return SyncInvoker<DeleteRouteTableRequest, DeleteRouteTableResponse>
     */
    public SyncInvoker<DeleteRouteTableRequest, DeleteRouteTableResponse> deleteRouteTableInvoker(
        DeleteRouteTableRequest request) {
        return new SyncInvoker<DeleteRouteTableRequest, DeleteRouteTableResponse>(request, ErMeta.deleteRouteTable,
            hcClient);
    }

    /**
     * 查询路由表列表
     *
     * 支持分页查询, 支持过滤查询：state, is_default_propagation_route_table, is_default_association_route_table。支持单字段排序，排序字段有[id,name,description,created_at,updated_at]，不支持多字段排序。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListRouteTablesRequest 请求对象
     * @return ListRouteTablesResponse
     */
    public ListRouteTablesResponse listRouteTables(ListRouteTablesRequest request) {
        return hcClient.syncInvokeHttp(request, ErMeta.listRouteTables);
    }

    /**
     * 查询路由表列表
     *
     * 支持分页查询, 支持过滤查询：state, is_default_propagation_route_table, is_default_association_route_table。支持单字段排序，排序字段有[id,name,description,created_at,updated_at]，不支持多字段排序。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListRouteTablesRequest 请求对象
     * @return SyncInvoker<ListRouteTablesRequest, ListRouteTablesResponse>
     */
    public SyncInvoker<ListRouteTablesRequest, ListRouteTablesResponse> listRouteTablesInvoker(
        ListRouteTablesRequest request) {
        return new SyncInvoker<ListRouteTablesRequest, ListRouteTablesResponse>(request, ErMeta.listRouteTables,
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
     * @return ShowRouteTableResponse
     */
    public ShowRouteTableResponse showRouteTable(ShowRouteTableRequest request) {
        return hcClient.syncInvokeHttp(request, ErMeta.showRouteTable);
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
     * @return SyncInvoker<ShowRouteTableRequest, ShowRouteTableResponse>
     */
    public SyncInvoker<ShowRouteTableRequest, ShowRouteTableResponse> showRouteTableInvoker(
        ShowRouteTableRequest request) {
        return new SyncInvoker<ShowRouteTableRequest, ShowRouteTableResponse>(request, ErMeta.showRouteTable, hcClient);
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
     * @return UpdateRouteTableResponse
     */
    public UpdateRouteTableResponse updateRouteTable(UpdateRouteTableRequest request) {
        return hcClient.syncInvokeHttp(request, ErMeta.updateRouteTable);
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
     * @return SyncInvoker<UpdateRouteTableRequest, UpdateRouteTableResponse>
     */
    public SyncInvoker<UpdateRouteTableRequest, UpdateRouteTableResponse> updateRouteTableInvoker(
        UpdateRouteTableRequest request) {
        return new SyncInvoker<UpdateRouteTableRequest, UpdateRouteTableResponse>(request, ErMeta.updateRouteTable,
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
     * @return CreateVpcAttachmentResponse
     */
    public CreateVpcAttachmentResponse createVpcAttachment(CreateVpcAttachmentRequest request) {
        return hcClient.syncInvokeHttp(request, ErMeta.createVpcAttachment);
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
     * @return SyncInvoker<CreateVpcAttachmentRequest, CreateVpcAttachmentResponse>
     */
    public SyncInvoker<CreateVpcAttachmentRequest, CreateVpcAttachmentResponse> createVpcAttachmentInvoker(
        CreateVpcAttachmentRequest request) {
        return new SyncInvoker<CreateVpcAttachmentRequest, CreateVpcAttachmentResponse>(request,
            ErMeta.createVpcAttachment, hcClient);
    }

    /**
     * 删除VPC连接
     *
     * VPC连接状态为available，deleting和failed的时候才能删除。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteVpcAttachmentRequest 请求对象
     * @return DeleteVpcAttachmentResponse
     */
    public DeleteVpcAttachmentResponse deleteVpcAttachment(DeleteVpcAttachmentRequest request) {
        return hcClient.syncInvokeHttp(request, ErMeta.deleteVpcAttachment);
    }

    /**
     * 删除VPC连接
     *
     * VPC连接状态为available，deleting和failed的时候才能删除。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteVpcAttachmentRequest 请求对象
     * @return SyncInvoker<DeleteVpcAttachmentRequest, DeleteVpcAttachmentResponse>
     */
    public SyncInvoker<DeleteVpcAttachmentRequest, DeleteVpcAttachmentResponse> deleteVpcAttachmentInvoker(
        DeleteVpcAttachmentRequest request) {
        return new SyncInvoker<DeleteVpcAttachmentRequest, DeleteVpcAttachmentResponse>(request,
            ErMeta.deleteVpcAttachment, hcClient);
    }

    /**
     * 查询VPC连接列表
     *
     * 查询企业路由器实例下的VPC连接列表：
     * 1，支持过滤查询，过滤条件有id，state，enterprise_project_id，vpc_id，过滤条件可以重复和组合
     * 2，支持分页查询，limit和marker组合实现分页查询
     * 3，支持单字段排序功能，排序字段有[id,name,description,created_at,updated_at]，不支持多字段排序。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListVpcAttachmentsRequest 请求对象
     * @return ListVpcAttachmentsResponse
     */
    public ListVpcAttachmentsResponse listVpcAttachments(ListVpcAttachmentsRequest request) {
        return hcClient.syncInvokeHttp(request, ErMeta.listVpcAttachments);
    }

    /**
     * 查询VPC连接列表
     *
     * 查询企业路由器实例下的VPC连接列表：
     * 1，支持过滤查询，过滤条件有id，state，enterprise_project_id，vpc_id，过滤条件可以重复和组合
     * 2，支持分页查询，limit和marker组合实现分页查询
     * 3，支持单字段排序功能，排序字段有[id,name,description,created_at,updated_at]，不支持多字段排序。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListVpcAttachmentsRequest 请求对象
     * @return SyncInvoker<ListVpcAttachmentsRequest, ListVpcAttachmentsResponse>
     */
    public SyncInvoker<ListVpcAttachmentsRequest, ListVpcAttachmentsResponse> listVpcAttachmentsInvoker(
        ListVpcAttachmentsRequest request) {
        return new SyncInvoker<ListVpcAttachmentsRequest, ListVpcAttachmentsResponse>(request,
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
     * @return ShowVpcAttachmentResponse
     */
    public ShowVpcAttachmentResponse showVpcAttachment(ShowVpcAttachmentRequest request) {
        return hcClient.syncInvokeHttp(request, ErMeta.showVpcAttachment);
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
     * @return SyncInvoker<ShowVpcAttachmentRequest, ShowVpcAttachmentResponse>
     */
    public SyncInvoker<ShowVpcAttachmentRequest, ShowVpcAttachmentResponse> showVpcAttachmentInvoker(
        ShowVpcAttachmentRequest request) {
        return new SyncInvoker<ShowVpcAttachmentRequest, ShowVpcAttachmentResponse>(request, ErMeta.showVpcAttachment,
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
     * @return UpdateVpcAttachmentResponse
     */
    public UpdateVpcAttachmentResponse updateVpcAttachment(UpdateVpcAttachmentRequest request) {
        return hcClient.syncInvokeHttp(request, ErMeta.updateVpcAttachment);
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
     * @return SyncInvoker<UpdateVpcAttachmentRequest, UpdateVpcAttachmentResponse>
     */
    public SyncInvoker<UpdateVpcAttachmentRequest, UpdateVpcAttachmentResponse> updateVpcAttachmentInvoker(
        UpdateVpcAttachmentRequest request) {
        return new SyncInvoker<UpdateVpcAttachmentRequest, UpdateVpcAttachmentResponse>(request,
            ErMeta.updateVpcAttachment, hcClient);
    }

}
