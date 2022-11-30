package com.huaweicloud.sdk.dns.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.dns.v2.model.*;

public class DnsClient {

    protected HcClient hcClient;

    public DnsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DnsClient> newBuilder() {
        return new ClientBuilder<>(DnsClient::new);
    }

    /**
     * 绑定ip地址。
     *
     * 绑定单个IP地址到终端节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociateEndpointIpaddressRequest 请求对象
     * @return AssociateEndpointIpaddressResponse
     */
    public AssociateEndpointIpaddressResponse associateEndpointIpaddress(AssociateEndpointIpaddressRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.associateEndpointIpaddress);
    }

    /**
     * 绑定ip地址。
     *
     * 绑定单个IP地址到终端节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociateEndpointIpaddressRequest 请求对象
     * @return SyncInvoker<AssociateEndpointIpaddressRequest, AssociateEndpointIpaddressResponse>
     */
    public SyncInvoker<AssociateEndpointIpaddressRequest, AssociateEndpointIpaddressResponse> associateEndpointIpaddressInvoker(
        AssociateEndpointIpaddressRequest request) {
        return new SyncInvoker<AssociateEndpointIpaddressRequest, AssociateEndpointIpaddressResponse>(request,
            DnsMeta.associateEndpointIpaddress, hcClient);
    }

    /**
     * 批量删除PTR
     *
     * 批量删除PTR。本接口为原子操作，所有记录应全部删除成功或全部失败。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeletePtrRecordsRequest 请求对象
     * @return BatchDeletePtrRecordsResponse
     */
    public BatchDeletePtrRecordsResponse batchDeletePtrRecords(BatchDeletePtrRecordsRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.batchDeletePtrRecords);
    }

    /**
     * 批量删除PTR
     *
     * 批量删除PTR。本接口为原子操作，所有记录应全部删除成功或全部失败。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeletePtrRecordsRequest 请求对象
     * @return SyncInvoker<BatchDeletePtrRecordsRequest, BatchDeletePtrRecordsResponse>
     */
    public SyncInvoker<BatchDeletePtrRecordsRequest, BatchDeletePtrRecordsResponse> batchDeletePtrRecordsInvoker(
        BatchDeletePtrRecordsRequest request) {
        return new SyncInvoker<BatchDeletePtrRecordsRequest, BatchDeletePtrRecordsResponse>(request,
            DnsMeta.batchDeletePtrRecords, hcClient);
    }

    /**
     * 批量删除Record Set
     *
     * 批量删除Record Set。
     * 响应结果中只包含本次实际删除的Record Set。
     * 支持批量删除公网域名和内网域名的记录集。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteRecordSetsRequest 请求对象
     * @return BatchDeleteRecordSetsResponse
     */
    public BatchDeleteRecordSetsResponse batchDeleteRecordSets(BatchDeleteRecordSetsRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.batchDeleteRecordSets);
    }

    /**
     * 批量删除Record Set
     *
     * 批量删除Record Set。
     * 响应结果中只包含本次实际删除的Record Set。
     * 支持批量删除公网域名和内网域名的记录集。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteRecordSetsRequest 请求对象
     * @return SyncInvoker<BatchDeleteRecordSetsRequest, BatchDeleteRecordSetsResponse>
     */
    public SyncInvoker<BatchDeleteRecordSetsRequest, BatchDeleteRecordSetsResponse> batchDeleteRecordSetsInvoker(
        BatchDeleteRecordSetsRequest request) {
        return new SyncInvoker<BatchDeleteRecordSetsRequest, BatchDeleteRecordSetsResponse>(request,
            DnsMeta.batchDeleteRecordSets, hcClient);
    }

    /**
     * 批量删除Zone
     *
     * 批量删除Zone。
     * 本接口为原子操作，所有记录应全部删除成功或全部失败。
     * 仅支持公网Zone、内网Zone。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteZonesRequest 请求对象
     * @return BatchDeleteZonesResponse
     */
    public BatchDeleteZonesResponse batchDeleteZones(BatchDeleteZonesRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.batchDeleteZones);
    }

    /**
     * 批量删除Zone
     *
     * 批量删除Zone。
     * 本接口为原子操作，所有记录应全部删除成功或全部失败。
     * 仅支持公网Zone、内网Zone。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteZonesRequest 请求对象
     * @return SyncInvoker<BatchDeleteZonesRequest, BatchDeleteZonesResponse>
     */
    public SyncInvoker<BatchDeleteZonesRequest, BatchDeleteZonesResponse> batchDeleteZonesInvoker(
        BatchDeleteZonesRequest request) {
        return new SyncInvoker<BatchDeleteZonesRequest, BatchDeleteZonesResponse>(request, DnsMeta.batchDeleteZones,
            hcClient);
    }

    /**
     * 批量设置Record Set状态
     *
     * 批量设置Record Set状态。
     * 响应结果中只包含本次实际更新的Record Set。
     * 仅支持公网域名记录集。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchSetRecordSetsStatusRequest 请求对象
     * @return BatchSetRecordSetsStatusResponse
     */
    public BatchSetRecordSetsStatusResponse batchSetRecordSetsStatus(BatchSetRecordSetsStatusRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.batchSetRecordSetsStatus);
    }

    /**
     * 批量设置Record Set状态
     *
     * 批量设置Record Set状态。
     * 响应结果中只包含本次实际更新的Record Set。
     * 仅支持公网域名记录集。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchSetRecordSetsStatusRequest 请求对象
     * @return SyncInvoker<BatchSetRecordSetsStatusRequest, BatchSetRecordSetsStatusResponse>
     */
    public SyncInvoker<BatchSetRecordSetsStatusRequest, BatchSetRecordSetsStatusResponse> batchSetRecordSetsStatusInvoker(
        BatchSetRecordSetsStatusRequest request) {
        return new SyncInvoker<BatchSetRecordSetsStatusRequest, BatchSetRecordSetsStatusResponse>(request,
            DnsMeta.batchSetRecordSetsStatus, hcClient);
    }

    /**
     * 批量设置Zone状态
     *
     * 批量设置Zone状态。
     * 响应结果中只包含本次实际更新的Zone。
     * 仅支持公网Zone。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchSetZonesStatusRequest 请求对象
     * @return BatchSetZonesStatusResponse
     */
    public BatchSetZonesStatusResponse batchSetZonesStatus(BatchSetZonesStatusRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.batchSetZonesStatus);
    }

    /**
     * 批量设置Zone状态
     *
     * 批量设置Zone状态。
     * 响应结果中只包含本次实际更新的Zone。
     * 仅支持公网Zone。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchSetZonesStatusRequest 请求对象
     * @return SyncInvoker<BatchSetZonesStatusRequest, BatchSetZonesStatusResponse>
     */
    public SyncInvoker<BatchSetZonesStatusRequest, BatchSetZonesStatusResponse> batchSetZonesStatusInvoker(
        BatchSetZonesStatusRequest request) {
        return new SyncInvoker<BatchSetZonesStatusRequest, BatchSetZonesStatusResponse>(request,
            DnsMeta.batchSetZonesStatus, hcClient);
    }

    /**
     * 创建单个自定义线路
     *
     * 创建单个自定义线路
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCustomLineRequest 请求对象
     * @return CreateCustomLineResponse
     */
    public CreateCustomLineResponse createCustomLine(CreateCustomLineRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.createCustomLine);
    }

    /**
     * 创建单个自定义线路
     *
     * 创建单个自定义线路
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateCustomLineRequest 请求对象
     * @return SyncInvoker<CreateCustomLineRequest, CreateCustomLineResponse>
     */
    public SyncInvoker<CreateCustomLineRequest, CreateCustomLineResponse> createCustomLineInvoker(
        CreateCustomLineRequest request) {
        return new SyncInvoker<CreateCustomLineRequest, CreateCustomLineResponse>(request, DnsMeta.createCustomLine,
            hcClient);
    }

    /**
     * 创建终端节点。
     *
     * 创建单个终端节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEndpointRequest 请求对象
     * @return CreateEndpointResponse
     */
    public CreateEndpointResponse createEndpoint(CreateEndpointRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.createEndpoint);
    }

    /**
     * 创建终端节点。
     *
     * 创建单个终端节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEndpointRequest 请求对象
     * @return SyncInvoker<CreateEndpointRequest, CreateEndpointResponse>
     */
    public SyncInvoker<CreateEndpointRequest, CreateEndpointResponse> createEndpointInvoker(
        CreateEndpointRequest request) {
        return new SyncInvoker<CreateEndpointRequest, CreateEndpointResponse>(request, DnsMeta.createEndpoint,
            hcClient);
    }

    /**
     * 创建线路分组。
     *
     * 创建一个线路分组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateLineGroupRequest 请求对象
     * @return CreateLineGroupResponse
     */
    public CreateLineGroupResponse createLineGroup(CreateLineGroupRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.createLineGroup);
    }

    /**
     * 创建线路分组。
     *
     * 创建一个线路分组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateLineGroupRequest 请求对象
     * @return SyncInvoker<CreateLineGroupRequest, CreateLineGroupResponse>
     */
    public SyncInvoker<CreateLineGroupRequest, CreateLineGroupResponse> createLineGroupInvoker(
        CreateLineGroupRequest request) {
        return new SyncInvoker<CreateLineGroupRequest, CreateLineGroupResponse>(request, DnsMeta.createLineGroup,
            hcClient);
    }

    /**
     * 创建解析规则。
     *
     * 创建一个解析规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateResolveRuleRequest 请求对象
     * @return CreateResolveRuleResponse
     */
    public CreateResolveRuleResponse createResolveRule(CreateResolveRuleRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.createResolveRule);
    }

    /**
     * 创建解析规则。
     *
     * 创建一个解析规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateResolveRuleRequest 请求对象
     * @return SyncInvoker<CreateResolveRuleRequest, CreateResolveRuleResponse>
     */
    public SyncInvoker<CreateResolveRuleRequest, CreateResolveRuleResponse> createResolveRuleInvoker(
        CreateResolveRuleRequest request) {
        return new SyncInvoker<CreateResolveRuleRequest, CreateResolveRuleResponse>(request, DnsMeta.createResolveRule,
            hcClient);
    }

    /**
     * 创建公网域名找回请求。
     *
     * 创建公网域名找回请求。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRetrievalRequest 请求对象
     * @return CreateRetrievalResponse
     */
    public CreateRetrievalResponse createRetrieval(CreateRetrievalRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.createRetrieval);
    }

    /**
     * 创建公网域名找回请求。
     *
     * 创建公网域名找回请求。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRetrievalRequest 请求对象
     * @return SyncInvoker<CreateRetrievalRequest, CreateRetrievalResponse>
     */
    public SyncInvoker<CreateRetrievalRequest, CreateRetrievalResponse> createRetrievalInvoker(
        CreateRetrievalRequest request) {
        return new SyncInvoker<CreateRetrievalRequest, CreateRetrievalResponse>(request, DnsMeta.createRetrieval,
            hcClient);
    }

    /**
     * 请求立即验证域名找回。
     *
     * 请求服务器立即执行找回验证。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRetrievalVerificationRequest 请求对象
     * @return CreateRetrievalVerificationResponse
     */
    public CreateRetrievalVerificationResponse createRetrievalVerification(CreateRetrievalVerificationRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.createRetrievalVerification);
    }

    /**
     * 请求立即验证域名找回。
     *
     * 请求服务器立即执行找回验证。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRetrievalVerificationRequest 请求对象
     * @return SyncInvoker<CreateRetrievalVerificationRequest, CreateRetrievalVerificationResponse>
     */
    public SyncInvoker<CreateRetrievalVerificationRequest, CreateRetrievalVerificationResponse> createRetrievalVerificationInvoker(
        CreateRetrievalVerificationRequest request) {
        return new SyncInvoker<CreateRetrievalVerificationRequest, CreateRetrievalVerificationResponse>(request,
            DnsMeta.createRetrievalVerification, hcClient);
    }

    /**
     * 删除单个自定义线路
     *
     * 删除单个自定义线路
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteCustomLineRequest 请求对象
     * @return DeleteCustomLineResponse
     */
    public DeleteCustomLineResponse deleteCustomLine(DeleteCustomLineRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.deleteCustomLine);
    }

    /**
     * 删除单个自定义线路
     *
     * 删除单个自定义线路
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteCustomLineRequest 请求对象
     * @return SyncInvoker<DeleteCustomLineRequest, DeleteCustomLineResponse>
     */
    public SyncInvoker<DeleteCustomLineRequest, DeleteCustomLineResponse> deleteCustomLineInvoker(
        DeleteCustomLineRequest request) {
        return new SyncInvoker<DeleteCustomLineRequest, DeleteCustomLineResponse>(request, DnsMeta.deleteCustomLine,
            hcClient);
    }

    /**
     * 删除终端节点。
     *
     * 删除终端节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEndpointRequest 请求对象
     * @return DeleteEndpointResponse
     */
    public DeleteEndpointResponse deleteEndpoint(DeleteEndpointRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.deleteEndpoint);
    }

    /**
     * 删除终端节点。
     *
     * 删除终端节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteEndpointRequest 请求对象
     * @return SyncInvoker<DeleteEndpointRequest, DeleteEndpointResponse>
     */
    public SyncInvoker<DeleteEndpointRequest, DeleteEndpointResponse> deleteEndpointInvoker(
        DeleteEndpointRequest request) {
        return new SyncInvoker<DeleteEndpointRequest, DeleteEndpointResponse>(request, DnsMeta.deleteEndpoint,
            hcClient);
    }

    /**
     * 删除线路分组。
     *
     * 删除单个线路分组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteLineGroupRequest 请求对象
     * @return DeleteLineGroupResponse
     */
    public DeleteLineGroupResponse deleteLineGroup(DeleteLineGroupRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.deleteLineGroup);
    }

    /**
     * 删除线路分组。
     *
     * 删除单个线路分组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteLineGroupRequest 请求对象
     * @return SyncInvoker<DeleteLineGroupRequest, DeleteLineGroupResponse>
     */
    public SyncInvoker<DeleteLineGroupRequest, DeleteLineGroupResponse> deleteLineGroupInvoker(
        DeleteLineGroupRequest request) {
        return new SyncInvoker<DeleteLineGroupRequest, DeleteLineGroupResponse>(request, DnsMeta.deleteLineGroup,
            hcClient);
    }

    /**
     * 删除解析规则。
     *
     * 删除解析规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteResolveRuleRequest 请求对象
     * @return DeleteResolveRuleResponse
     */
    public DeleteResolveRuleResponse deleteResolveRule(DeleteResolveRuleRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.deleteResolveRule);
    }

    /**
     * 删除解析规则。
     *
     * 删除解析规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteResolveRuleRequest 请求对象
     * @return SyncInvoker<DeleteResolveRuleRequest, DeleteResolveRuleResponse>
     */
    public SyncInvoker<DeleteResolveRuleRequest, DeleteResolveRuleResponse> deleteResolveRuleInvoker(
        DeleteResolveRuleRequest request) {
        return new SyncInvoker<DeleteResolveRuleRequest, DeleteResolveRuleResponse>(request, DnsMeta.deleteResolveRule,
            hcClient);
    }

    /**
     * 解关联ip地址。
     *
     * 解除endpoint绑定的IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisassociateEndpointIpaddressRequest 请求对象
     * @return DisassociateEndpointIpaddressResponse
     */
    public DisassociateEndpointIpaddressResponse disassociateEndpointIpaddress(
        DisassociateEndpointIpaddressRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.disassociateEndpointIpaddress);
    }

    /**
     * 解关联ip地址。
     *
     * 解除endpoint绑定的IP。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisassociateEndpointIpaddressRequest 请求对象
     * @return SyncInvoker<DisassociateEndpointIpaddressRequest, DisassociateEndpointIpaddressResponse>
     */
    public SyncInvoker<DisassociateEndpointIpaddressRequest, DisassociateEndpointIpaddressResponse> disassociateEndpointIpaddressInvoker(
        DisassociateEndpointIpaddressRequest request) {
        return new SyncInvoker<DisassociateEndpointIpaddressRequest, DisassociateEndpointIpaddressResponse>(request,
            DnsMeta.disassociateEndpointIpaddress, hcClient);
    }

    /**
     * 查询所有的云解析服务API版本号
     *
     * 查询所有的云解析服务API版本号列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApiVersionsRequest 请求对象
     * @return ListApiVersionsResponse
     */
    public ListApiVersionsResponse listApiVersions(ListApiVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.listApiVersions);
    }

    /**
     * 查询所有的云解析服务API版本号
     *
     * 查询所有的云解析服务API版本号列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListApiVersionsRequest 请求对象
     * @return SyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse>
     */
    public SyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse> listApiVersionsInvoker(
        ListApiVersionsRequest request) {
        return new SyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse>(request, DnsMeta.listApiVersions,
            hcClient);
    }

    /**
     * 查询自定义线路
     *
     * 查询自定义线路
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCustomLineRequest 请求对象
     * @return ListCustomLineResponse
     */
    public ListCustomLineResponse listCustomLine(ListCustomLineRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.listCustomLine);
    }

    /**
     * 查询自定义线路
     *
     * 查询自定义线路
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListCustomLineRequest 请求对象
     * @return SyncInvoker<ListCustomLineRequest, ListCustomLineResponse>
     */
    public SyncInvoker<ListCustomLineRequest, ListCustomLineResponse> listCustomLineInvoker(
        ListCustomLineRequest request) {
        return new SyncInvoker<ListCustomLineRequest, ListCustomLineResponse>(request, DnsMeta.listCustomLine,
            hcClient);
    }

    /**
     * 查询ip地址列表。
     *
     * 查询某个endpoint下的ip地址列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEndpointIpaddressesRequest 请求对象
     * @return ListEndpointIpaddressesResponse
     */
    public ListEndpointIpaddressesResponse listEndpointIpaddresses(ListEndpointIpaddressesRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.listEndpointIpaddresses);
    }

    /**
     * 查询ip地址列表。
     *
     * 查询某个endpoint下的ip地址列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEndpointIpaddressesRequest 请求对象
     * @return SyncInvoker<ListEndpointIpaddressesRequest, ListEndpointIpaddressesResponse>
     */
    public SyncInvoker<ListEndpointIpaddressesRequest, ListEndpointIpaddressesResponse> listEndpointIpaddressesInvoker(
        ListEndpointIpaddressesRequest request) {
        return new SyncInvoker<ListEndpointIpaddressesRequest, ListEndpointIpaddressesResponse>(request,
            DnsMeta.listEndpointIpaddresses, hcClient);
    }

    /**
     * 查询vpc信息。
     *
     * 查询vpc的终端节点信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEndpointVpcsRequest 请求对象
     * @return ListEndpointVpcsResponse
     */
    public ListEndpointVpcsResponse listEndpointVpcs(ListEndpointVpcsRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.listEndpointVpcs);
    }

    /**
     * 查询vpc信息。
     *
     * 查询vpc的终端节点信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEndpointVpcsRequest 请求对象
     * @return SyncInvoker<ListEndpointVpcsRequest, ListEndpointVpcsResponse>
     */
    public SyncInvoker<ListEndpointVpcsRequest, ListEndpointVpcsResponse> listEndpointVpcsInvoker(
        ListEndpointVpcsRequest request) {
        return new SyncInvoker<ListEndpointVpcsRequest, ListEndpointVpcsResponse>(request, DnsMeta.listEndpointVpcs,
            hcClient);
    }

    /**
     * 查询终端节点列表。
     *
     * 查询终端节点列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEndpointsRequest 请求对象
     * @return ListEndpointsResponse
     */
    public ListEndpointsResponse listEndpoints(ListEndpointsRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.listEndpoints);
    }

    /**
     * 查询终端节点列表。
     *
     * 查询终端节点列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListEndpointsRequest 请求对象
     * @return SyncInvoker<ListEndpointsRequest, ListEndpointsResponse>
     */
    public SyncInvoker<ListEndpointsRequest, ListEndpointsResponse> listEndpointsInvoker(ListEndpointsRequest request) {
        return new SyncInvoker<ListEndpointsRequest, ListEndpointsResponse>(request, DnsMeta.listEndpoints, hcClient);
    }

    /**
     * 查询线路分组列表。
     *
     * 查询线路分组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLineGroupsRequest 请求对象
     * @return ListLineGroupsResponse
     */
    public ListLineGroupsResponse listLineGroups(ListLineGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.listLineGroups);
    }

    /**
     * 查询线路分组列表。
     *
     * 查询线路分组列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListLineGroupsRequest 请求对象
     * @return SyncInvoker<ListLineGroupsRequest, ListLineGroupsResponse>
     */
    public SyncInvoker<ListLineGroupsRequest, ListLineGroupsResponse> listLineGroupsInvoker(
        ListLineGroupsRequest request) {
        return new SyncInvoker<ListLineGroupsRequest, ListLineGroupsResponse>(request, DnsMeta.listLineGroups,
            hcClient);
    }

    /**
     * 查询名称服务器列表
     *
     * 查询名称服务器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNameServersRequest 请求对象
     * @return ListNameServersResponse
     */
    public ListNameServersResponse listNameServers(ListNameServersRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.listNameServers);
    }

    /**
     * 查询名称服务器列表
     *
     * 查询名称服务器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListNameServersRequest 请求对象
     * @return SyncInvoker<ListNameServersRequest, ListNameServersResponse>
     */
    public SyncInvoker<ListNameServersRequest, ListNameServersResponse> listNameServersInvoker(
        ListNameServersRequest request) {
        return new SyncInvoker<ListNameServersRequest, ListNameServersResponse>(request, DnsMeta.listNameServers,
            hcClient);
    }

    /**
     * 查询解析规则列表。
     *
     * 查询解析规则的列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResoleRulesRequest 请求对象
     * @return ListResoleRulesResponse
     */
    public ListResoleRulesResponse listResoleRules(ListResoleRulesRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.listResoleRules);
    }

    /**
     * 查询解析规则列表。
     *
     * 查询解析规则的列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListResoleRulesRequest 请求对象
     * @return SyncInvoker<ListResoleRulesRequest, ListResoleRulesResponse>
     */
    public SyncInvoker<ListResoleRulesRequest, ListResoleRulesResponse> listResoleRulesInvoker(
        ListResoleRulesRequest request) {
        return new SyncInvoker<ListResoleRulesRequest, ListResoleRulesResponse>(request, DnsMeta.listResoleRules,
            hcClient);
    }

    /**
     * 查询指定的云解析服务API版本号
     *
     * 查询指定的云解析服务API版本号
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowApiInfoRequest 请求对象
     * @return ShowApiInfoResponse
     */
    public ShowApiInfoResponse showApiInfo(ShowApiInfoRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.showApiInfo);
    }

    /**
     * 查询指定的云解析服务API版本号
     *
     * 查询指定的云解析服务API版本号
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowApiInfoRequest 请求对象
     * @return SyncInvoker<ShowApiInfoRequest, ShowApiInfoResponse>
     */
    public SyncInvoker<ShowApiInfoRequest, ShowApiInfoResponse> showApiInfoInvoker(ShowApiInfoRequest request) {
        return new SyncInvoker<ShowApiInfoRequest, ShowApiInfoResponse>(request, DnsMeta.showApiInfo, hcClient);
    }

    /**
     * 查询租户配额
     *
     * 查询单租户在DNS服务下的资源配额，包括公网zone配额、内网zone配额、Record Set配额、PTR Record配额、入站终端节点配额、出站终端节点配额、自定义线路配额、线路分组配额等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDomainQuotaRequest 请求对象
     * @return ShowDomainQuotaResponse
     */
    public ShowDomainQuotaResponse showDomainQuota(ShowDomainQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.showDomainQuota);
    }

    /**
     * 查询租户配额
     *
     * 查询单租户在DNS服务下的资源配额，包括公网zone配额、内网zone配额、Record Set配额、PTR Record配额、入站终端节点配额、出站终端节点配额、自定义线路配额、线路分组配额等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowDomainQuotaRequest 请求对象
     * @return SyncInvoker<ShowDomainQuotaRequest, ShowDomainQuotaResponse>
     */
    public SyncInvoker<ShowDomainQuotaRequest, ShowDomainQuotaResponse> showDomainQuotaInvoker(
        ShowDomainQuotaRequest request) {
        return new SyncInvoker<ShowDomainQuotaRequest, ShowDomainQuotaResponse>(request, DnsMeta.showDomainQuota,
            hcClient);
    }

    /**
     * 查询endpoint。
     *
     * 查询终端单个节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEndpointRequest 请求对象
     * @return ShowEndpointResponse
     */
    public ShowEndpointResponse showEndpoint(ShowEndpointRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.showEndpoint);
    }

    /**
     * 查询endpoint。
     *
     * 查询终端单个节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowEndpointRequest 请求对象
     * @return SyncInvoker<ShowEndpointRequest, ShowEndpointResponse>
     */
    public SyncInvoker<ShowEndpointRequest, ShowEndpointResponse> showEndpointInvoker(ShowEndpointRequest request) {
        return new SyncInvoker<ShowEndpointRequest, ShowEndpointResponse>(request, DnsMeta.showEndpoint, hcClient);
    }

    /**
     * 查询线路分组。
     *
     * 查询线路分组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowLineGroupRequest 请求对象
     * @return ShowLineGroupResponse
     */
    public ShowLineGroupResponse showLineGroup(ShowLineGroupRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.showLineGroup);
    }

    /**
     * 查询线路分组。
     *
     * 查询线路分组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowLineGroupRequest 请求对象
     * @return SyncInvoker<ShowLineGroupRequest, ShowLineGroupResponse>
     */
    public SyncInvoker<ShowLineGroupRequest, ShowLineGroupResponse> showLineGroupInvoker(ShowLineGroupRequest request) {
        return new SyncInvoker<ShowLineGroupRequest, ShowLineGroupResponse>(request, DnsMeta.showLineGroup, hcClient);
    }

    /**
     * 查询单个解析规则。
     *
     * 查询单个解析规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResoleRuleRequest 请求对象
     * @return ShowResoleRuleResponse
     */
    public ShowResoleRuleResponse showResoleRule(ShowResoleRuleRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.showResoleRule);
    }

    /**
     * 查询单个解析规则。
     *
     * 查询单个解析规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResoleRuleRequest 请求对象
     * @return SyncInvoker<ShowResoleRuleRequest, ShowResoleRuleResponse>
     */
    public SyncInvoker<ShowResoleRuleRequest, ShowResoleRuleResponse> showResoleRuleInvoker(
        ShowResoleRuleRequest request) {
        return new SyncInvoker<ShowResoleRuleRequest, ShowResoleRuleResponse>(request, DnsMeta.showResoleRule,
            hcClient);
    }

    /**
     * 查询域名找回。
     *
     * 查询域名找回请求。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRetrievalRequest 请求对象
     * @return ShowRetrievalResponse
     */
    public ShowRetrievalResponse showRetrieval(ShowRetrievalRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.showRetrieval);
    }

    /**
     * 查询域名找回。
     *
     * 查询域名找回请求。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRetrievalRequest 请求对象
     * @return SyncInvoker<ShowRetrievalRequest, ShowRetrievalResponse>
     */
    public SyncInvoker<ShowRetrievalRequest, ShowRetrievalResponse> showRetrievalInvoker(ShowRetrievalRequest request) {
        return new SyncInvoker<ShowRetrievalRequest, ShowRetrievalResponse>(request, DnsMeta.showRetrieval, hcClient);
    }

    /**
     * 查询域名找回结果。
     *
     * 查询域名找回结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRetrievalVerificationRequest 请求对象
     * @return ShowRetrievalVerificationResponse
     */
    public ShowRetrievalVerificationResponse showRetrievalVerification(ShowRetrievalVerificationRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.showRetrievalVerification);
    }

    /**
     * 查询域名找回结果。
     *
     * 查询域名找回结果。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRetrievalVerificationRequest 请求对象
     * @return SyncInvoker<ShowRetrievalVerificationRequest, ShowRetrievalVerificationResponse>
     */
    public SyncInvoker<ShowRetrievalVerificationRequest, ShowRetrievalVerificationResponse> showRetrievalVerificationInvoker(
        ShowRetrievalVerificationRequest request) {
        return new SyncInvoker<ShowRetrievalVerificationRequest, ShowRetrievalVerificationResponse>(request,
            DnsMeta.showRetrievalVerification, hcClient);
    }

    /**
     * 更新单个自定义线路
     *
     * 更新单个自定义线路
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateCustomLineRequest 请求对象
     * @return UpdateCustomLineResponse
     */
    public UpdateCustomLineResponse updateCustomLine(UpdateCustomLineRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.updateCustomLine);
    }

    /**
     * 更新单个自定义线路
     *
     * 更新单个自定义线路
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateCustomLineRequest 请求对象
     * @return SyncInvoker<UpdateCustomLineRequest, UpdateCustomLineResponse>
     */
    public SyncInvoker<UpdateCustomLineRequest, UpdateCustomLineResponse> updateCustomLineInvoker(
        UpdateCustomLineRequest request) {
        return new SyncInvoker<UpdateCustomLineRequest, UpdateCustomLineResponse>(request, DnsMeta.updateCustomLine,
            hcClient);
    }

    /**
     * 修改终端节点
     *
     * 修改终端节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEndpointRequest 请求对象
     * @return UpdateEndpointResponse
     */
    public UpdateEndpointResponse updateEndpoint(UpdateEndpointRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.updateEndpoint);
    }

    /**
     * 修改终端节点
     *
     * 修改终端节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateEndpointRequest 请求对象
     * @return SyncInvoker<UpdateEndpointRequest, UpdateEndpointResponse>
     */
    public SyncInvoker<UpdateEndpointRequest, UpdateEndpointResponse> updateEndpointInvoker(
        UpdateEndpointRequest request) {
        return new SyncInvoker<UpdateEndpointRequest, UpdateEndpointResponse>(request, DnsMeta.updateEndpoint,
            hcClient);
    }

    /**
     * 更新线路分组。
     *
     * 更新单个线路分组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateLineGroupsRequest 请求对象
     * @return UpdateLineGroupsResponse
     */
    public UpdateLineGroupsResponse updateLineGroups(UpdateLineGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.updateLineGroups);
    }

    /**
     * 更新线路分组。
     *
     * 更新单个线路分组。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateLineGroupsRequest 请求对象
     * @return SyncInvoker<UpdateLineGroupsRequest, UpdateLineGroupsResponse>
     */
    public SyncInvoker<UpdateLineGroupsRequest, UpdateLineGroupsResponse> updateLineGroupsInvoker(
        UpdateLineGroupsRequest request) {
        return new SyncInvoker<UpdateLineGroupsRequest, UpdateLineGroupsResponse>(request, DnsMeta.updateLineGroups,
            hcClient);
    }

    /**
     * 修改解析规则。
     *
     * 修改一个解析规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateResolveRuleRequest 请求对象
     * @return UpdateResolveRuleResponse
     */
    public UpdateResolveRuleResponse updateResolveRule(UpdateResolveRuleRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.updateResolveRule);
    }

    /**
     * 修改解析规则。
     *
     * 修改一个解析规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateResolveRuleRequest 请求对象
     * @return SyncInvoker<UpdateResolveRuleRequest, UpdateResolveRuleResponse>
     */
    public SyncInvoker<UpdateResolveRuleRequest, UpdateResolveRuleResponse> updateResolveRuleInvoker(
        UpdateResolveRuleRequest request) {
        return new SyncInvoker<UpdateResolveRuleRequest, UpdateResolveRuleResponse>(request, DnsMeta.updateResolveRule,
            hcClient);
    }

    /**
     * 设置弹性IP的PTR记录
     *
     * 设置弹性IP的PTR记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEipRecordSetRequest 请求对象
     * @return CreateEipRecordSetResponse
     */
    public CreateEipRecordSetResponse createEipRecordSet(CreateEipRecordSetRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.createEipRecordSet);
    }

    /**
     * 设置弹性IP的PTR记录
     *
     * 设置弹性IP的PTR记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateEipRecordSetRequest 请求对象
     * @return SyncInvoker<CreateEipRecordSetRequest, CreateEipRecordSetResponse>
     */
    public SyncInvoker<CreateEipRecordSetRequest, CreateEipRecordSetResponse> createEipRecordSetInvoker(
        CreateEipRecordSetRequest request) {
        return new SyncInvoker<CreateEipRecordSetRequest, CreateEipRecordSetResponse>(request,
            DnsMeta.createEipRecordSet, hcClient);
    }

    /**
     * 查询租户弹性IP的PTR记录列表
     *
     * 查询租户弹性IP的PTR记录列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPtrRecordsRequest 请求对象
     * @return ListPtrRecordsResponse
     */
    public ListPtrRecordsResponse listPtrRecords(ListPtrRecordsRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.listPtrRecords);
    }

    /**
     * 查询租户弹性IP的PTR记录列表
     *
     * 查询租户弹性IP的PTR记录列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPtrRecordsRequest 请求对象
     * @return SyncInvoker<ListPtrRecordsRequest, ListPtrRecordsResponse>
     */
    public SyncInvoker<ListPtrRecordsRequest, ListPtrRecordsResponse> listPtrRecordsInvoker(
        ListPtrRecordsRequest request) {
        return new SyncInvoker<ListPtrRecordsRequest, ListPtrRecordsResponse>(request, DnsMeta.listPtrRecords,
            hcClient);
    }

    /**
     * 将弹性IP的PTR记录恢复为默认值
     *
     * 将弹性IP的PTR记录恢复为默认值
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestorePtrRecordRequest 请求对象
     * @return RestorePtrRecordResponse
     */
    public RestorePtrRecordResponse restorePtrRecord(RestorePtrRecordRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.restorePtrRecord);
    }

    /**
     * 将弹性IP的PTR记录恢复为默认值
     *
     * 将弹性IP的PTR记录恢复为默认值
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param RestorePtrRecordRequest 请求对象
     * @return SyncInvoker<RestorePtrRecordRequest, RestorePtrRecordResponse>
     */
    public SyncInvoker<RestorePtrRecordRequest, RestorePtrRecordResponse> restorePtrRecordInvoker(
        RestorePtrRecordRequest request) {
        return new SyncInvoker<RestorePtrRecordRequest, RestorePtrRecordResponse>(request, DnsMeta.restorePtrRecord,
            hcClient);
    }

    /**
     * 查询单个弹性IP的PTR记录
     *
     * 查询单个弹性IP的PTR记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPtrRecordSetRequest 请求对象
     * @return ShowPtrRecordSetResponse
     */
    public ShowPtrRecordSetResponse showPtrRecordSet(ShowPtrRecordSetRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.showPtrRecordSet);
    }

    /**
     * 查询单个弹性IP的PTR记录
     *
     * 查询单个弹性IP的PTR记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPtrRecordSetRequest 请求对象
     * @return SyncInvoker<ShowPtrRecordSetRequest, ShowPtrRecordSetResponse>
     */
    public SyncInvoker<ShowPtrRecordSetRequest, ShowPtrRecordSetResponse> showPtrRecordSetInvoker(
        ShowPtrRecordSetRequest request) {
        return new SyncInvoker<ShowPtrRecordSetRequest, ShowPtrRecordSetResponse>(request, DnsMeta.showPtrRecordSet,
            hcClient);
    }

    /**
     * 修改弹性IP的PTR记录
     *
     * 修改弹性IP的PTR记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePtrRecordRequest 请求对象
     * @return UpdatePtrRecordResponse
     */
    public UpdatePtrRecordResponse updatePtrRecord(UpdatePtrRecordRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.updatePtrRecord);
    }

    /**
     * 修改弹性IP的PTR记录
     *
     * 修改弹性IP的PTR记录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePtrRecordRequest 请求对象
     * @return SyncInvoker<UpdatePtrRecordRequest, UpdatePtrRecordResponse>
     */
    public SyncInvoker<UpdatePtrRecordRequest, UpdatePtrRecordResponse> updatePtrRecordInvoker(
        UpdatePtrRecordRequest request) {
        return new SyncInvoker<UpdatePtrRecordRequest, UpdatePtrRecordResponse>(request, DnsMeta.updatePtrRecord,
            hcClient);
    }

    /**
     * Record Set关联健康检查。
     *
     * Record Set关联健康检查。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociateHealthCheckRequest 请求对象
     * @return AssociateHealthCheckResponse
     */
    public AssociateHealthCheckResponse associateHealthCheck(AssociateHealthCheckRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.associateHealthCheck);
    }

    /**
     * Record Set关联健康检查。
     *
     * Record Set关联健康检查。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociateHealthCheckRequest 请求对象
     * @return SyncInvoker<AssociateHealthCheckRequest, AssociateHealthCheckResponse>
     */
    public SyncInvoker<AssociateHealthCheckRequest, AssociateHealthCheckResponse> associateHealthCheckInvoker(
        AssociateHealthCheckRequest request) {
        return new SyncInvoker<AssociateHealthCheckRequest, AssociateHealthCheckResponse>(request,
            DnsMeta.associateHealthCheck, hcClient);
    }

    /**
     * 批量删除某个Zone下的Record Set资源。
     *
     * 批量删除某个Zone下的Record Set资源，当删除的资源不存在时，则默认删除成功。
     * 响应结果中只包含本次实际删除的资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteRecordSetWithLineRequest 请求对象
     * @return BatchDeleteRecordSetWithLineResponse
     */
    public BatchDeleteRecordSetWithLineResponse batchDeleteRecordSetWithLine(
        BatchDeleteRecordSetWithLineRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.batchDeleteRecordSetWithLine);
    }

    /**
     * 批量删除某个Zone下的Record Set资源。
     *
     * 批量删除某个Zone下的Record Set资源，当删除的资源不存在时，则默认删除成功。
     * 响应结果中只包含本次实际删除的资源。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchDeleteRecordSetWithLineRequest 请求对象
     * @return SyncInvoker<BatchDeleteRecordSetWithLineRequest, BatchDeleteRecordSetWithLineResponse>
     */
    public SyncInvoker<BatchDeleteRecordSetWithLineRequest, BatchDeleteRecordSetWithLineResponse> batchDeleteRecordSetWithLineInvoker(
        BatchDeleteRecordSetWithLineRequest request) {
        return new SyncInvoker<BatchDeleteRecordSetWithLineRequest, BatchDeleteRecordSetWithLineResponse>(request,
            DnsMeta.batchDeleteRecordSetWithLine, hcClient);
    }

    /**
     * 批量修改RecordSet。
     *
     * 批量修改RecordSet。属于原子性操作，请求Record Set将全部完成修改，或不做任何修改。
     * 仅公网Zone支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchUpdateRecordSetWithLineRequest 请求对象
     * @return BatchUpdateRecordSetWithLineResponse
     */
    public BatchUpdateRecordSetWithLineResponse batchUpdateRecordSetWithLine(
        BatchUpdateRecordSetWithLineRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.batchUpdateRecordSetWithLine);
    }

    /**
     * 批量修改RecordSet。
     *
     * 批量修改RecordSet。属于原子性操作，请求Record Set将全部完成修改，或不做任何修改。
     * 仅公网Zone支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchUpdateRecordSetWithLineRequest 请求对象
     * @return SyncInvoker<BatchUpdateRecordSetWithLineRequest, BatchUpdateRecordSetWithLineResponse>
     */
    public SyncInvoker<BatchUpdateRecordSetWithLineRequest, BatchUpdateRecordSetWithLineResponse> batchUpdateRecordSetWithLineInvoker(
        BatchUpdateRecordSetWithLineRequest request) {
        return new SyncInvoker<BatchUpdateRecordSetWithLineRequest, BatchUpdateRecordSetWithLineResponse>(request,
            DnsMeta.batchUpdateRecordSetWithLine, hcClient);
    }

    /**
     * 创建单个Record Set
     *
     * 创建单个Record Set
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRecordSetRequest 请求对象
     * @return CreateRecordSetResponse
     */
    public CreateRecordSetResponse createRecordSet(CreateRecordSetRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.createRecordSet);
    }

    /**
     * 创建单个Record Set
     *
     * 创建单个Record Set
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRecordSetRequest 请求对象
     * @return SyncInvoker<CreateRecordSetRequest, CreateRecordSetResponse>
     */
    public SyncInvoker<CreateRecordSetRequest, CreateRecordSetResponse> createRecordSetInvoker(
        CreateRecordSetRequest request) {
        return new SyncInvoker<CreateRecordSetRequest, CreateRecordSetResponse>(request, DnsMeta.createRecordSet,
            hcClient);
    }

    /**
     * 批量线路创建RecordSet。仅公网Zone支持。
     *
     * 批量线路创建RecordSet。属于原子性操作，如果存在一个参数校验不通过，则创建失败。仅公网Zone支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRecordSetWithBatchLinesRequest 请求对象
     * @return CreateRecordSetWithBatchLinesResponse
     */
    public CreateRecordSetWithBatchLinesResponse createRecordSetWithBatchLines(
        CreateRecordSetWithBatchLinesRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.createRecordSetWithBatchLines);
    }

    /**
     * 批量线路创建RecordSet。仅公网Zone支持。
     *
     * 批量线路创建RecordSet。属于原子性操作，如果存在一个参数校验不通过，则创建失败。仅公网Zone支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRecordSetWithBatchLinesRequest 请求对象
     * @return SyncInvoker<CreateRecordSetWithBatchLinesRequest, CreateRecordSetWithBatchLinesResponse>
     */
    public SyncInvoker<CreateRecordSetWithBatchLinesRequest, CreateRecordSetWithBatchLinesResponse> createRecordSetWithBatchLinesInvoker(
        CreateRecordSetWithBatchLinesRequest request) {
        return new SyncInvoker<CreateRecordSetWithBatchLinesRequest, CreateRecordSetWithBatchLinesResponse>(request,
            DnsMeta.createRecordSetWithBatchLines, hcClient);
    }

    /**
     * 创建单个Record Set，仅适用于公网DNS
     *
     * 创建单个Record Set，仅适用于公网DNS
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRecordSetWithLineRequest 请求对象
     * @return CreateRecordSetWithLineResponse
     */
    public CreateRecordSetWithLineResponse createRecordSetWithLine(CreateRecordSetWithLineRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.createRecordSetWithLine);
    }

    /**
     * 创建单个Record Set，仅适用于公网DNS
     *
     * 创建单个Record Set，仅适用于公网DNS
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateRecordSetWithLineRequest 请求对象
     * @return SyncInvoker<CreateRecordSetWithLineRequest, CreateRecordSetWithLineResponse>
     */
    public SyncInvoker<CreateRecordSetWithLineRequest, CreateRecordSetWithLineResponse> createRecordSetWithLineInvoker(
        CreateRecordSetWithLineRequest request) {
        return new SyncInvoker<CreateRecordSetWithLineRequest, CreateRecordSetWithLineResponse>(request,
            DnsMeta.createRecordSetWithLine, hcClient);
    }

    /**
     * 删除单个Record Set
     *
     * 删除单个Record Set
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRecordSetRequest 请求对象
     * @return DeleteRecordSetResponse
     */
    public DeleteRecordSetResponse deleteRecordSet(DeleteRecordSetRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.deleteRecordSet);
    }

    /**
     * 删除单个Record Set
     *
     * 删除单个Record Set
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRecordSetRequest 请求对象
     * @return SyncInvoker<DeleteRecordSetRequest, DeleteRecordSetResponse>
     */
    public SyncInvoker<DeleteRecordSetRequest, DeleteRecordSetResponse> deleteRecordSetInvoker(
        DeleteRecordSetRequest request) {
        return new SyncInvoker<DeleteRecordSetRequest, DeleteRecordSetResponse>(request, DnsMeta.deleteRecordSet,
            hcClient);
    }

    /**
     * 删除单个Record Set
     *
     * 删除单个Record Set
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRecordSetsRequest 请求对象
     * @return DeleteRecordSetsResponse
     */
    public DeleteRecordSetsResponse deleteRecordSets(DeleteRecordSetsRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.deleteRecordSets);
    }

    /**
     * 删除单个Record Set
     *
     * 删除单个Record Set
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteRecordSetsRequest 请求对象
     * @return SyncInvoker<DeleteRecordSetsRequest, DeleteRecordSetsResponse>
     */
    public SyncInvoker<DeleteRecordSetsRequest, DeleteRecordSetsResponse> deleteRecordSetsInvoker(
        DeleteRecordSetsRequest request) {
        return new SyncInvoker<DeleteRecordSetsRequest, DeleteRecordSetsResponse>(request, DnsMeta.deleteRecordSets,
            hcClient);
    }

    /**
     * Record Set解关联健康检查。
     *
     * Record Set解关联健康检查。。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisassociateHealthCheckRequest 请求对象
     * @return DisassociateHealthCheckResponse
     */
    public DisassociateHealthCheckResponse disassociateHealthCheck(DisassociateHealthCheckRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.disassociateHealthCheck);
    }

    /**
     * Record Set解关联健康检查。
     *
     * Record Set解关联健康检查。。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisassociateHealthCheckRequest 请求对象
     * @return SyncInvoker<DisassociateHealthCheckRequest, DisassociateHealthCheckResponse>
     */
    public SyncInvoker<DisassociateHealthCheckRequest, DisassociateHealthCheckResponse> disassociateHealthCheckInvoker(
        DisassociateHealthCheckRequest request) {
        return new SyncInvoker<DisassociateHealthCheckRequest, DisassociateHealthCheckResponse>(request,
            DnsMeta.disassociateHealthCheck, hcClient);
    }

    /**
     * 查询租户Record Set资源列表
     *
     * 查询租户Record Set资源列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRecordSetsRequest 请求对象
     * @return ListRecordSetsResponse
     */
    public ListRecordSetsResponse listRecordSets(ListRecordSetsRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.listRecordSets);
    }

    /**
     * 查询租户Record Set资源列表
     *
     * 查询租户Record Set资源列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRecordSetsRequest 请求对象
     * @return SyncInvoker<ListRecordSetsRequest, ListRecordSetsResponse>
     */
    public SyncInvoker<ListRecordSetsRequest, ListRecordSetsResponse> listRecordSetsInvoker(
        ListRecordSetsRequest request) {
        return new SyncInvoker<ListRecordSetsRequest, ListRecordSetsResponse>(request, DnsMeta.listRecordSets,
            hcClient);
    }

    /**
     * 查询单个Zone下Record Set列表
     *
     * 查询单个Zone下Record Set列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRecordSetsByZoneRequest 请求对象
     * @return ListRecordSetsByZoneResponse
     */
    public ListRecordSetsByZoneResponse listRecordSetsByZone(ListRecordSetsByZoneRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.listRecordSetsByZone);
    }

    /**
     * 查询单个Zone下Record Set列表
     *
     * 查询单个Zone下Record Set列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRecordSetsByZoneRequest 请求对象
     * @return SyncInvoker<ListRecordSetsByZoneRequest, ListRecordSetsByZoneResponse>
     */
    public SyncInvoker<ListRecordSetsByZoneRequest, ListRecordSetsByZoneResponse> listRecordSetsByZoneInvoker(
        ListRecordSetsByZoneRequest request) {
        return new SyncInvoker<ListRecordSetsByZoneRequest, ListRecordSetsByZoneResponse>(request,
            DnsMeta.listRecordSetsByZone, hcClient);
    }

    /**
     * 查询租户Record Set资源列表
     *
     * 查询租户Record Set资源列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRecordSetsWithLineRequest 请求对象
     * @return ListRecordSetsWithLineResponse
     */
    public ListRecordSetsWithLineResponse listRecordSetsWithLine(ListRecordSetsWithLineRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.listRecordSetsWithLine);
    }

    /**
     * 查询租户Record Set资源列表
     *
     * 查询租户Record Set资源列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListRecordSetsWithLineRequest 请求对象
     * @return SyncInvoker<ListRecordSetsWithLineRequest, ListRecordSetsWithLineResponse>
     */
    public SyncInvoker<ListRecordSetsWithLineRequest, ListRecordSetsWithLineResponse> listRecordSetsWithLineInvoker(
        ListRecordSetsWithLineRequest request) {
        return new SyncInvoker<ListRecordSetsWithLineRequest, ListRecordSetsWithLineResponse>(request,
            DnsMeta.listRecordSetsWithLine, hcClient);
    }

    /**
     * 设置Record Set状态
     *
     * 设置Record Set状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetRecordSetsStatusRequest 请求对象
     * @return SetRecordSetsStatusResponse
     */
    public SetRecordSetsStatusResponse setRecordSetsStatus(SetRecordSetsStatusRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.setRecordSetsStatus);
    }

    /**
     * 设置Record Set状态
     *
     * 设置Record Set状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetRecordSetsStatusRequest 请求对象
     * @return SyncInvoker<SetRecordSetsStatusRequest, SetRecordSetsStatusResponse>
     */
    public SyncInvoker<SetRecordSetsStatusRequest, SetRecordSetsStatusResponse> setRecordSetsStatusInvoker(
        SetRecordSetsStatusRequest request) {
        return new SyncInvoker<SetRecordSetsStatusRequest, SetRecordSetsStatusResponse>(request,
            DnsMeta.setRecordSetsStatus, hcClient);
    }

    /**
     * 查询单个Record Set
     *
     * 查询单个Record Set
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRecordSetRequest 请求对象
     * @return ShowRecordSetResponse
     */
    public ShowRecordSetResponse showRecordSet(ShowRecordSetRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.showRecordSet);
    }

    /**
     * 查询单个Record Set
     *
     * 查询单个Record Set
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRecordSetRequest 请求对象
     * @return SyncInvoker<ShowRecordSetRequest, ShowRecordSetResponse>
     */
    public SyncInvoker<ShowRecordSetRequest, ShowRecordSetResponse> showRecordSetInvoker(ShowRecordSetRequest request) {
        return new SyncInvoker<ShowRecordSetRequest, ShowRecordSetResponse>(request, DnsMeta.showRecordSet, hcClient);
    }

    /**
     * 查询单个Zone下Record Set列表
     *
     * 查询单个Zone下Record Set列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRecordSetByZoneRequest 请求对象
     * @return ShowRecordSetByZoneResponse
     */
    public ShowRecordSetByZoneResponse showRecordSetByZone(ShowRecordSetByZoneRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.showRecordSetByZone);
    }

    /**
     * 查询单个Zone下Record Set列表
     *
     * 查询单个Zone下Record Set列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRecordSetByZoneRequest 请求对象
     * @return SyncInvoker<ShowRecordSetByZoneRequest, ShowRecordSetByZoneResponse>
     */
    public SyncInvoker<ShowRecordSetByZoneRequest, ShowRecordSetByZoneResponse> showRecordSetByZoneInvoker(
        ShowRecordSetByZoneRequest request) {
        return new SyncInvoker<ShowRecordSetByZoneRequest, ShowRecordSetByZoneResponse>(request,
            DnsMeta.showRecordSetByZone, hcClient);
    }

    /**
     * 查询单个Record Set，仅适用于公网DNS
     *
     * 查询单个Record Set，仅适用于公网DNS
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRecordSetWithLineRequest 请求对象
     * @return ShowRecordSetWithLineResponse
     */
    public ShowRecordSetWithLineResponse showRecordSetWithLine(ShowRecordSetWithLineRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.showRecordSetWithLine);
    }

    /**
     * 查询单个Record Set，仅适用于公网DNS
     *
     * 查询单个Record Set，仅适用于公网DNS
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowRecordSetWithLineRequest 请求对象
     * @return SyncInvoker<ShowRecordSetWithLineRequest, ShowRecordSetWithLineResponse>
     */
    public SyncInvoker<ShowRecordSetWithLineRequest, ShowRecordSetWithLineResponse> showRecordSetWithLineInvoker(
        ShowRecordSetWithLineRequest request) {
        return new SyncInvoker<ShowRecordSetWithLineRequest, ShowRecordSetWithLineResponse>(request,
            DnsMeta.showRecordSetWithLine, hcClient);
    }

    /**
     * 修改单个Record Set
     *
     * 修改单个Record Set
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateRecordSetRequest 请求对象
     * @return UpdateRecordSetResponse
     */
    public UpdateRecordSetResponse updateRecordSet(UpdateRecordSetRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.updateRecordSet);
    }

    /**
     * 修改单个Record Set
     *
     * 修改单个Record Set
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateRecordSetRequest 请求对象
     * @return SyncInvoker<UpdateRecordSetRequest, UpdateRecordSetResponse>
     */
    public SyncInvoker<UpdateRecordSetRequest, UpdateRecordSetResponse> updateRecordSetInvoker(
        UpdateRecordSetRequest request) {
        return new SyncInvoker<UpdateRecordSetRequest, UpdateRecordSetResponse>(request, DnsMeta.updateRecordSet,
            hcClient);
    }

    /**
     * 修改单个Record Set
     *
     * 修改单个Record Set
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateRecordSetsRequest 请求对象
     * @return UpdateRecordSetsResponse
     */
    public UpdateRecordSetsResponse updateRecordSets(UpdateRecordSetsRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.updateRecordSets);
    }

    /**
     * 修改单个Record Set
     *
     * 修改单个Record Set
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdateRecordSetsRequest 请求对象
     * @return SyncInvoker<UpdateRecordSetsRequest, UpdateRecordSetsResponse>
     */
    public SyncInvoker<UpdateRecordSetsRequest, UpdateRecordSetsResponse> updateRecordSetsInvoker(
        UpdateRecordSetsRequest request) {
        return new SyncInvoker<UpdateRecordSetsRequest, UpdateRecordSetsResponse>(request, DnsMeta.updateRecordSets,
            hcClient);
    }

    /**
     * 为指定实例批量添加或删除标签
     *
     * 为指定实例批量添加或删除标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateTagRequest 请求对象
     * @return BatchCreateTagResponse
     */
    public BatchCreateTagResponse batchCreateTag(BatchCreateTagRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.batchCreateTag);
    }

    /**
     * 为指定实例批量添加或删除标签
     *
     * 为指定实例批量添加或删除标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param BatchCreateTagRequest 请求对象
     * @return SyncInvoker<BatchCreateTagRequest, BatchCreateTagResponse>
     */
    public SyncInvoker<BatchCreateTagRequest, BatchCreateTagResponse> batchCreateTagInvoker(
        BatchCreateTagRequest request) {
        return new SyncInvoker<BatchCreateTagRequest, BatchCreateTagResponse>(request, DnsMeta.batchCreateTag,
            hcClient);
    }

    /**
     * 为指定实例添加标签
     *
     * 为指定实例添加标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTagRequest 请求对象
     * @return CreateTagResponse
     */
    public CreateTagResponse createTag(CreateTagRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.createTag);
    }

    /**
     * 为指定实例添加标签
     *
     * 为指定实例添加标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreateTagRequest 请求对象
     * @return SyncInvoker<CreateTagRequest, CreateTagResponse>
     */
    public SyncInvoker<CreateTagRequest, CreateTagResponse> createTagInvoker(CreateTagRequest request) {
        return new SyncInvoker<CreateTagRequest, CreateTagResponse>(request, DnsMeta.createTag, hcClient);
    }

    /**
     * 删除资源标签
     *
     * 删除资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTagRequest 请求对象
     * @return DeleteTagResponse
     */
    public DeleteTagResponse deleteTag(DeleteTagRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.deleteTag);
    }

    /**
     * 删除资源标签
     *
     * 删除资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeleteTagRequest 请求对象
     * @return SyncInvoker<DeleteTagRequest, DeleteTagResponse>
     */
    public SyncInvoker<DeleteTagRequest, DeleteTagResponse> deleteTagInvoker(DeleteTagRequest request) {
        return new SyncInvoker<DeleteTagRequest, DeleteTagResponse>(request, DnsMeta.deleteTag, hcClient);
    }

    /**
     * 使用标签查询资源实例
     *
     * 使用标签查询资源实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTagRequest 请求对象
     * @return ListTagResponse
     */
    public ListTagResponse listTag(ListTagRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.listTag);
    }

    /**
     * 使用标签查询资源实例
     *
     * 使用标签查询资源实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTagRequest 请求对象
     * @return SyncInvoker<ListTagRequest, ListTagResponse>
     */
    public SyncInvoker<ListTagRequest, ListTagResponse> listTagInvoker(ListTagRequest request) {
        return new SyncInvoker<ListTagRequest, ListTagResponse>(request, DnsMeta.listTag, hcClient);
    }

    /**
     * 查询指定实例类型的所有标签集合
     *
     * 查询指定实例类型的所有标签集合
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTagsRequest 请求对象
     * @return ListTagsResponse
     */
    public ListTagsResponse listTags(ListTagsRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.listTags);
    }

    /**
     * 查询指定实例类型的所有标签集合
     *
     * 查询指定实例类型的所有标签集合
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListTagsRequest 请求对象
     * @return SyncInvoker<ListTagsRequest, ListTagsResponse>
     */
    public SyncInvoker<ListTagsRequest, ListTagsResponse> listTagsInvoker(ListTagsRequest request) {
        return new SyncInvoker<ListTagsRequest, ListTagsResponse>(request, DnsMeta.listTags, hcClient);
    }

    /**
     * 查询指定实例的标签信息
     *
     * 查询指定实例的标签信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResourceTagRequest 请求对象
     * @return ShowResourceTagResponse
     */
    public ShowResourceTagResponse showResourceTag(ShowResourceTagRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.showResourceTag);
    }

    /**
     * 查询指定实例的标签信息
     *
     * 查询指定实例的标签信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowResourceTagRequest 请求对象
     * @return SyncInvoker<ShowResourceTagRequest, ShowResourceTagResponse>
     */
    public SyncInvoker<ShowResourceTagRequest, ShowResourceTagResponse> showResourceTagInvoker(
        ShowResourceTagRequest request) {
        return new SyncInvoker<ShowResourceTagRequest, ShowResourceTagResponse>(request, DnsMeta.showResourceTag,
            hcClient);
    }

    /**
     * 在内网Zone上关联VPC
     *
     * 在内网Zone上关联VPC
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociateRouterRequest 请求对象
     * @return AssociateRouterResponse
     */
    public AssociateRouterResponse associateRouter(AssociateRouterRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.associateRouter);
    }

    /**
     * 在内网Zone上关联VPC
     *
     * 在内网Zone上关联VPC
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param AssociateRouterRequest 请求对象
     * @return SyncInvoker<AssociateRouterRequest, AssociateRouterResponse>
     */
    public SyncInvoker<AssociateRouterRequest, AssociateRouterResponse> associateRouterInvoker(
        AssociateRouterRequest request) {
        return new SyncInvoker<AssociateRouterRequest, AssociateRouterResponse>(request, DnsMeta.associateRouter,
            hcClient);
    }

    /**
     * 创建单个内网Zone
     *
     * 创建单个内网Zone
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePrivateZoneRequest 请求对象
     * @return CreatePrivateZoneResponse
     */
    public CreatePrivateZoneResponse createPrivateZone(CreatePrivateZoneRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.createPrivateZone);
    }

    /**
     * 创建单个内网Zone
     *
     * 创建单个内网Zone
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePrivateZoneRequest 请求对象
     * @return SyncInvoker<CreatePrivateZoneRequest, CreatePrivateZoneResponse>
     */
    public SyncInvoker<CreatePrivateZoneRequest, CreatePrivateZoneResponse> createPrivateZoneInvoker(
        CreatePrivateZoneRequest request) {
        return new SyncInvoker<CreatePrivateZoneRequest, CreatePrivateZoneResponse>(request, DnsMeta.createPrivateZone,
            hcClient);
    }

    /**
     * 创建单个公网Zone
     *
     * 创建单个公网Zone
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePublicZoneRequest 请求对象
     * @return CreatePublicZoneResponse
     */
    public CreatePublicZoneResponse createPublicZone(CreatePublicZoneRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.createPublicZone);
    }

    /**
     * 创建单个公网Zone
     *
     * 创建单个公网Zone
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param CreatePublicZoneRequest 请求对象
     * @return SyncInvoker<CreatePublicZoneRequest, CreatePublicZoneResponse>
     */
    public SyncInvoker<CreatePublicZoneRequest, CreatePublicZoneResponse> createPublicZoneInvoker(
        CreatePublicZoneRequest request) {
        return new SyncInvoker<CreatePublicZoneRequest, CreatePublicZoneResponse>(request, DnsMeta.createPublicZone,
            hcClient);
    }

    /**
     * 删除单个内网Zone
     *
     * 删除单个内网Zone
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePrivateZoneRequest 请求对象
     * @return DeletePrivateZoneResponse
     */
    public DeletePrivateZoneResponse deletePrivateZone(DeletePrivateZoneRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.deletePrivateZone);
    }

    /**
     * 删除单个内网Zone
     *
     * 删除单个内网Zone
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePrivateZoneRequest 请求对象
     * @return SyncInvoker<DeletePrivateZoneRequest, DeletePrivateZoneResponse>
     */
    public SyncInvoker<DeletePrivateZoneRequest, DeletePrivateZoneResponse> deletePrivateZoneInvoker(
        DeletePrivateZoneRequest request) {
        return new SyncInvoker<DeletePrivateZoneRequest, DeletePrivateZoneResponse>(request, DnsMeta.deletePrivateZone,
            hcClient);
    }

    /**
     * 删除单个公网Zone
     *
     * 删除单个公网Zone
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePublicZoneRequest 请求对象
     * @return DeletePublicZoneResponse
     */
    public DeletePublicZoneResponse deletePublicZone(DeletePublicZoneRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.deletePublicZone);
    }

    /**
     * 删除单个公网Zone
     *
     * 删除单个公网Zone
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DeletePublicZoneRequest 请求对象
     * @return SyncInvoker<DeletePublicZoneRequest, DeletePublicZoneResponse>
     */
    public SyncInvoker<DeletePublicZoneRequest, DeletePublicZoneResponse> deletePublicZoneInvoker(
        DeletePublicZoneRequest request) {
        return new SyncInvoker<DeletePublicZoneRequest, DeletePublicZoneResponse>(request, DnsMeta.deletePublicZone,
            hcClient);
    }

    /**
     * 在内网Zone上解关联VPC
     *
     * 在内网Zone上解关联VPC
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisassociateRouterRequest 请求对象
     * @return DisassociateRouterResponse
     */
    public DisassociateRouterResponse disassociateRouter(DisassociateRouterRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.disassociateRouter);
    }

    /**
     * 在内网Zone上解关联VPC
     *
     * 在内网Zone上解关联VPC
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param DisassociateRouterRequest 请求对象
     * @return SyncInvoker<DisassociateRouterRequest, DisassociateRouterResponse>
     */
    public SyncInvoker<DisassociateRouterRequest, DisassociateRouterResponse> disassociateRouterInvoker(
        DisassociateRouterRequest request) {
        return new SyncInvoker<DisassociateRouterRequest, DisassociateRouterResponse>(request,
            DnsMeta.disassociateRouter, hcClient);
    }

    /**
     * 查询内网Zone的列表
     *
     * 查询内网Zone的列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPrivateZonesRequest 请求对象
     * @return ListPrivateZonesResponse
     */
    public ListPrivateZonesResponse listPrivateZones(ListPrivateZonesRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.listPrivateZones);
    }

    /**
     * 查询内网Zone的列表
     *
     * 查询内网Zone的列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPrivateZonesRequest 请求对象
     * @return SyncInvoker<ListPrivateZonesRequest, ListPrivateZonesResponse>
     */
    public SyncInvoker<ListPrivateZonesRequest, ListPrivateZonesResponse> listPrivateZonesInvoker(
        ListPrivateZonesRequest request) {
        return new SyncInvoker<ListPrivateZonesRequest, ListPrivateZonesResponse>(request, DnsMeta.listPrivateZones,
            hcClient);
    }

    /**
     * 查询公网Zone的列表
     *
     * 查询公网Zone的列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPublicZonesRequest 请求对象
     * @return ListPublicZonesResponse
     */
    public ListPublicZonesResponse listPublicZones(ListPublicZonesRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.listPublicZones);
    }

    /**
     * 查询公网Zone的列表
     *
     * 查询公网Zone的列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ListPublicZonesRequest 请求对象
     * @return SyncInvoker<ListPublicZonesRequest, ListPublicZonesResponse>
     */
    public SyncInvoker<ListPublicZonesRequest, ListPublicZonesResponse> listPublicZonesInvoker(
        ListPublicZonesRequest request) {
        return new SyncInvoker<ListPublicZonesRequest, ListPublicZonesResponse>(request, DnsMeta.listPublicZones,
            hcClient);
    }

    /**
     * 设置单个内网Zone的子域名递归解析代理
     *
     * 设置单个内网Zone的子域名递归解析代理
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetPrivateZoneProxyPatternRequest 请求对象
     * @return SetPrivateZoneProxyPatternResponse
     */
    public SetPrivateZoneProxyPatternResponse setPrivateZoneProxyPattern(SetPrivateZoneProxyPatternRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.setPrivateZoneProxyPattern);
    }

    /**
     * 设置单个内网Zone的子域名递归解析代理
     *
     * 设置单个内网Zone的子域名递归解析代理
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param SetPrivateZoneProxyPatternRequest 请求对象
     * @return SyncInvoker<SetPrivateZoneProxyPatternRequest, SetPrivateZoneProxyPatternResponse>
     */
    public SyncInvoker<SetPrivateZoneProxyPatternRequest, SetPrivateZoneProxyPatternResponse> setPrivateZoneProxyPatternInvoker(
        SetPrivateZoneProxyPatternRequest request) {
        return new SyncInvoker<SetPrivateZoneProxyPatternRequest, SetPrivateZoneProxyPatternResponse>(request,
            DnsMeta.setPrivateZoneProxyPattern, hcClient);
    }

    /**
     * 查询单个内网Zone
     *
     * 查询单个内网Zone
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPrivateZoneRequest 请求对象
     * @return ShowPrivateZoneResponse
     */
    public ShowPrivateZoneResponse showPrivateZone(ShowPrivateZoneRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.showPrivateZone);
    }

    /**
     * 查询单个内网Zone
     *
     * 查询单个内网Zone
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPrivateZoneRequest 请求对象
     * @return SyncInvoker<ShowPrivateZoneRequest, ShowPrivateZoneResponse>
     */
    public SyncInvoker<ShowPrivateZoneRequest, ShowPrivateZoneResponse> showPrivateZoneInvoker(
        ShowPrivateZoneRequest request) {
        return new SyncInvoker<ShowPrivateZoneRequest, ShowPrivateZoneResponse>(request, DnsMeta.showPrivateZone,
            hcClient);
    }

    /**
     * 查询单个内网Zone的名称服务器
     *
     * 查询单个内网Zone的名称服务器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPrivateZoneNameServerRequest 请求对象
     * @return ShowPrivateZoneNameServerResponse
     */
    public ShowPrivateZoneNameServerResponse showPrivateZoneNameServer(ShowPrivateZoneNameServerRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.showPrivateZoneNameServer);
    }

    /**
     * 查询单个内网Zone的名称服务器
     *
     * 查询单个内网Zone的名称服务器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPrivateZoneNameServerRequest 请求对象
     * @return SyncInvoker<ShowPrivateZoneNameServerRequest, ShowPrivateZoneNameServerResponse>
     */
    public SyncInvoker<ShowPrivateZoneNameServerRequest, ShowPrivateZoneNameServerResponse> showPrivateZoneNameServerInvoker(
        ShowPrivateZoneNameServerRequest request) {
        return new SyncInvoker<ShowPrivateZoneNameServerRequest, ShowPrivateZoneNameServerResponse>(request,
            DnsMeta.showPrivateZoneNameServer, hcClient);
    }

    /**
     * 查询单个公网Zone
     *
     * 查询单个公网Zone
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPublicZoneRequest 请求对象
     * @return ShowPublicZoneResponse
     */
    public ShowPublicZoneResponse showPublicZone(ShowPublicZoneRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.showPublicZone);
    }

    /**
     * 查询单个公网Zone
     *
     * 查询单个公网Zone
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPublicZoneRequest 请求对象
     * @return SyncInvoker<ShowPublicZoneRequest, ShowPublicZoneResponse>
     */
    public SyncInvoker<ShowPublicZoneRequest, ShowPublicZoneResponse> showPublicZoneInvoker(
        ShowPublicZoneRequest request) {
        return new SyncInvoker<ShowPublicZoneRequest, ShowPublicZoneResponse>(request, DnsMeta.showPublicZone,
            hcClient);
    }

    /**
     * 查询单个公网Zone的名称服务器
     *
     * 查询单个公网Zone的名称服务器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPublicZoneNameServerRequest 请求对象
     * @return ShowPublicZoneNameServerResponse
     */
    public ShowPublicZoneNameServerResponse showPublicZoneNameServer(ShowPublicZoneNameServerRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.showPublicZoneNameServer);
    }

    /**
     * 查询单个公网Zone的名称服务器
     *
     * 查询单个公网Zone的名称服务器
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param ShowPublicZoneNameServerRequest 请求对象
     * @return SyncInvoker<ShowPublicZoneNameServerRequest, ShowPublicZoneNameServerResponse>
     */
    public SyncInvoker<ShowPublicZoneNameServerRequest, ShowPublicZoneNameServerResponse> showPublicZoneNameServerInvoker(
        ShowPublicZoneNameServerRequest request) {
        return new SyncInvoker<ShowPublicZoneNameServerRequest, ShowPublicZoneNameServerResponse>(request,
            DnsMeta.showPublicZoneNameServer, hcClient);
    }

    /**
     * 修改单个内网Zone
     *
     * 修改单个内网Zone
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePrivateZoneRequest 请求对象
     * @return UpdatePrivateZoneResponse
     */
    public UpdatePrivateZoneResponse updatePrivateZone(UpdatePrivateZoneRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.updatePrivateZone);
    }

    /**
     * 修改单个内网Zone
     *
     * 修改单个内网Zone
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePrivateZoneRequest 请求对象
     * @return SyncInvoker<UpdatePrivateZoneRequest, UpdatePrivateZoneResponse>
     */
    public SyncInvoker<UpdatePrivateZoneRequest, UpdatePrivateZoneResponse> updatePrivateZoneInvoker(
        UpdatePrivateZoneRequest request) {
        return new SyncInvoker<UpdatePrivateZoneRequest, UpdatePrivateZoneResponse>(request, DnsMeta.updatePrivateZone,
            hcClient);
    }

    /**
     * 修改单个公网Zone
     *
     * 修改单个公网Zone
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePublicZoneRequest 请求对象
     * @return UpdatePublicZoneResponse
     */
    public UpdatePublicZoneResponse updatePublicZone(UpdatePublicZoneRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.updatePublicZone);
    }

    /**
     * 修改单个公网Zone
     *
     * 修改单个公网Zone
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePublicZoneRequest 请求对象
     * @return SyncInvoker<UpdatePublicZoneRequest, UpdatePublicZoneResponse>
     */
    public SyncInvoker<UpdatePublicZoneRequest, UpdatePublicZoneResponse> updatePublicZoneInvoker(
        UpdatePublicZoneRequest request) {
        return new SyncInvoker<UpdatePublicZoneRequest, UpdatePublicZoneResponse>(request, DnsMeta.updatePublicZone,
            hcClient);
    }

    /**
     * 设置单个公网Zone状态，支持暂停、启用Zone
     *
     * 设置单个公网Zone状态，支持暂停、启用Zone
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePublicZoneStatusRequest 请求对象
     * @return UpdatePublicZoneStatusResponse
     */
    public UpdatePublicZoneStatusResponse updatePublicZoneStatus(UpdatePublicZoneStatusRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.updatePublicZoneStatus);
    }

    /**
     * 设置单个公网Zone状态，支持暂停、启用Zone
     *
     * 设置单个公网Zone状态，支持暂停、启用Zone
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param UpdatePublicZoneStatusRequest 请求对象
     * @return SyncInvoker<UpdatePublicZoneStatusRequest, UpdatePublicZoneStatusResponse>
     */
    public SyncInvoker<UpdatePublicZoneStatusRequest, UpdatePublicZoneStatusResponse> updatePublicZoneStatusInvoker(
        UpdatePublicZoneStatusRequest request) {
        return new SyncInvoker<UpdatePublicZoneStatusRequest, UpdatePublicZoneStatusResponse>(request,
            DnsMeta.updatePublicZoneStatus, hcClient);
    }

}
