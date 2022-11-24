package com.huaweicloud.sdk.dns.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.dns.v2.model.*;

import java.util.concurrent.CompletableFuture;

public class DnsAsyncClient {

    protected HcClient hcClient;

    public DnsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DnsAsyncClient> newBuilder() {
        return new ClientBuilder<>(DnsAsyncClient::new);
    }

    /**
     * 绑定ip地址。
     *
     * 绑定单个IP地址到终端节点
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param AssociateEndpointIpaddressRequest 请求对象
     * @return CompletableFuture<AssociateEndpointIpaddressResponse>
     */
    public CompletableFuture<AssociateEndpointIpaddressResponse> associateEndpointIpaddressAsync(
        AssociateEndpointIpaddressRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.associateEndpointIpaddress);
    }

    /**
     * 绑定ip地址。
     *
     * 绑定单个IP地址到终端节点
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param AssociateEndpointIpaddressRequest 请求对象
     * @return AsyncInvoker<AssociateEndpointIpaddressRequest, AssociateEndpointIpaddressResponse>
     */
    public AsyncInvoker<AssociateEndpointIpaddressRequest, AssociateEndpointIpaddressResponse> associateEndpointIpaddressAsyncInvoker(
        AssociateEndpointIpaddressRequest request) {
        return new AsyncInvoker<AssociateEndpointIpaddressRequest, AssociateEndpointIpaddressResponse>(request,
            DnsMeta.associateEndpointIpaddress, hcClient);
    }

    /**
     * 批量删除PTR
     *
     * 批量删除PTR。本接口为原子操作，所有记录应全部删除成功或全部失败。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchDeletePtrRecordsRequest 请求对象
     * @return CompletableFuture<BatchDeletePtrRecordsResponse>
     */
    public CompletableFuture<BatchDeletePtrRecordsResponse> batchDeletePtrRecordsAsync(
        BatchDeletePtrRecordsRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.batchDeletePtrRecords);
    }

    /**
     * 批量删除PTR
     *
     * 批量删除PTR。本接口为原子操作，所有记录应全部删除成功或全部失败。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchDeletePtrRecordsRequest 请求对象
     * @return AsyncInvoker<BatchDeletePtrRecordsRequest, BatchDeletePtrRecordsResponse>
     */
    public AsyncInvoker<BatchDeletePtrRecordsRequest, BatchDeletePtrRecordsResponse> batchDeletePtrRecordsAsyncInvoker(
        BatchDeletePtrRecordsRequest request) {
        return new AsyncInvoker<BatchDeletePtrRecordsRequest, BatchDeletePtrRecordsResponse>(request,
            DnsMeta.batchDeletePtrRecords, hcClient);
    }

    /**
     * 批量删除Record Set
     *
     * 批量删除Record Set。
     * 响应结果中只包含本次实际删除的Record Set。
     * 支持批量删除公网域名和内网域名的记录集。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchDeleteRecordSetsRequest 请求对象
     * @return CompletableFuture<BatchDeleteRecordSetsResponse>
     */
    public CompletableFuture<BatchDeleteRecordSetsResponse> batchDeleteRecordSetsAsync(
        BatchDeleteRecordSetsRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.batchDeleteRecordSets);
    }

    /**
     * 批量删除Record Set
     *
     * 批量删除Record Set。
     * 响应结果中只包含本次实际删除的Record Set。
     * 支持批量删除公网域名和内网域名的记录集。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchDeleteRecordSetsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteRecordSetsRequest, BatchDeleteRecordSetsResponse>
     */
    public AsyncInvoker<BatchDeleteRecordSetsRequest, BatchDeleteRecordSetsResponse> batchDeleteRecordSetsAsyncInvoker(
        BatchDeleteRecordSetsRequest request) {
        return new AsyncInvoker<BatchDeleteRecordSetsRequest, BatchDeleteRecordSetsResponse>(request,
            DnsMeta.batchDeleteRecordSets, hcClient);
    }

    /**
     * 批量删除Zone
     *
     * 批量删除Zone。
     * 本接口为原子操作，所有记录应全部删除成功或全部失败。
     * 仅支持公网Zone、内网Zone。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchDeleteZonesRequest 请求对象
     * @return CompletableFuture<BatchDeleteZonesResponse>
     */
    public CompletableFuture<BatchDeleteZonesResponse> batchDeleteZonesAsync(BatchDeleteZonesRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.batchDeleteZones);
    }

    /**
     * 批量删除Zone
     *
     * 批量删除Zone。
     * 本接口为原子操作，所有记录应全部删除成功或全部失败。
     * 仅支持公网Zone、内网Zone。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchDeleteZonesRequest 请求对象
     * @return AsyncInvoker<BatchDeleteZonesRequest, BatchDeleteZonesResponse>
     */
    public AsyncInvoker<BatchDeleteZonesRequest, BatchDeleteZonesResponse> batchDeleteZonesAsyncInvoker(
        BatchDeleteZonesRequest request) {
        return new AsyncInvoker<BatchDeleteZonesRequest, BatchDeleteZonesResponse>(request, DnsMeta.batchDeleteZones,
            hcClient);
    }

    /**
     * 批量设置Record Set状态
     *
     * 批量设置Record Set状态。
     * 响应结果中只包含本次实际更新的Record Set。
     * 仅支持公网域名记录集。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchSetRecordSetsStatusRequest 请求对象
     * @return CompletableFuture<BatchSetRecordSetsStatusResponse>
     */
    public CompletableFuture<BatchSetRecordSetsStatusResponse> batchSetRecordSetsStatusAsync(
        BatchSetRecordSetsStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.batchSetRecordSetsStatus);
    }

    /**
     * 批量设置Record Set状态
     *
     * 批量设置Record Set状态。
     * 响应结果中只包含本次实际更新的Record Set。
     * 仅支持公网域名记录集。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchSetRecordSetsStatusRequest 请求对象
     * @return AsyncInvoker<BatchSetRecordSetsStatusRequest, BatchSetRecordSetsStatusResponse>
     */
    public AsyncInvoker<BatchSetRecordSetsStatusRequest, BatchSetRecordSetsStatusResponse> batchSetRecordSetsStatusAsyncInvoker(
        BatchSetRecordSetsStatusRequest request) {
        return new AsyncInvoker<BatchSetRecordSetsStatusRequest, BatchSetRecordSetsStatusResponse>(request,
            DnsMeta.batchSetRecordSetsStatus, hcClient);
    }

    /**
     * 批量设置Zone状态
     *
     * 批量设置Zone状态。
     * 响应结果中只包含本次实际更新的Zone。
     * 仅支持公网Zone。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchSetZonesStatusRequest 请求对象
     * @return CompletableFuture<BatchSetZonesStatusResponse>
     */
    public CompletableFuture<BatchSetZonesStatusResponse> batchSetZonesStatusAsync(BatchSetZonesStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.batchSetZonesStatus);
    }

    /**
     * 批量设置Zone状态
     *
     * 批量设置Zone状态。
     * 响应结果中只包含本次实际更新的Zone。
     * 仅支持公网Zone。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchSetZonesStatusRequest 请求对象
     * @return AsyncInvoker<BatchSetZonesStatusRequest, BatchSetZonesStatusResponse>
     */
    public AsyncInvoker<BatchSetZonesStatusRequest, BatchSetZonesStatusResponse> batchSetZonesStatusAsyncInvoker(
        BatchSetZonesStatusRequest request) {
        return new AsyncInvoker<BatchSetZonesStatusRequest, BatchSetZonesStatusResponse>(request,
            DnsMeta.batchSetZonesStatus, hcClient);
    }

    /**
     * 创建单个自定义线路
     *
     * 创建单个自定义线路
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateCustomLineRequest 请求对象
     * @return CompletableFuture<CreateCustomLineResponse>
     */
    public CompletableFuture<CreateCustomLineResponse> createCustomLineAsync(CreateCustomLineRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.createCustomLine);
    }

    /**
     * 创建单个自定义线路
     *
     * 创建单个自定义线路
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateCustomLineRequest 请求对象
     * @return AsyncInvoker<CreateCustomLineRequest, CreateCustomLineResponse>
     */
    public AsyncInvoker<CreateCustomLineRequest, CreateCustomLineResponse> createCustomLineAsyncInvoker(
        CreateCustomLineRequest request) {
        return new AsyncInvoker<CreateCustomLineRequest, CreateCustomLineResponse>(request, DnsMeta.createCustomLine,
            hcClient);
    }

    /**
     * 创建终端节点。
     *
     * 创建单个终端节点。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateEndpointRequest 请求对象
     * @return CompletableFuture<CreateEndpointResponse>
     */
    public CompletableFuture<CreateEndpointResponse> createEndpointAsync(CreateEndpointRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.createEndpoint);
    }

    /**
     * 创建终端节点。
     *
     * 创建单个终端节点。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateEndpointRequest 请求对象
     * @return AsyncInvoker<CreateEndpointRequest, CreateEndpointResponse>
     */
    public AsyncInvoker<CreateEndpointRequest, CreateEndpointResponse> createEndpointAsyncInvoker(
        CreateEndpointRequest request) {
        return new AsyncInvoker<CreateEndpointRequest, CreateEndpointResponse>(request, DnsMeta.createEndpoint,
            hcClient);
    }

    /**
     * 创建线路分组。
     *
     * 创建一个线路分组。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateLineGroupRequest 请求对象
     * @return CompletableFuture<CreateLineGroupResponse>
     */
    public CompletableFuture<CreateLineGroupResponse> createLineGroupAsync(CreateLineGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.createLineGroup);
    }

    /**
     * 创建线路分组。
     *
     * 创建一个线路分组。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateLineGroupRequest 请求对象
     * @return AsyncInvoker<CreateLineGroupRequest, CreateLineGroupResponse>
     */
    public AsyncInvoker<CreateLineGroupRequest, CreateLineGroupResponse> createLineGroupAsyncInvoker(
        CreateLineGroupRequest request) {
        return new AsyncInvoker<CreateLineGroupRequest, CreateLineGroupResponse>(request, DnsMeta.createLineGroup,
            hcClient);
    }

    /**
     * 创建解析规则。
     *
     * 创建一个解析规则。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateResolveRuleRequest 请求对象
     * @return CompletableFuture<CreateResolveRuleResponse>
     */
    public CompletableFuture<CreateResolveRuleResponse> createResolveRuleAsync(CreateResolveRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.createResolveRule);
    }

    /**
     * 创建解析规则。
     *
     * 创建一个解析规则。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateResolveRuleRequest 请求对象
     * @return AsyncInvoker<CreateResolveRuleRequest, CreateResolveRuleResponse>
     */
    public AsyncInvoker<CreateResolveRuleRequest, CreateResolveRuleResponse> createResolveRuleAsyncInvoker(
        CreateResolveRuleRequest request) {
        return new AsyncInvoker<CreateResolveRuleRequest, CreateResolveRuleResponse>(request, DnsMeta.createResolveRule,
            hcClient);
    }

    /**
     * 创建公网域名找回请求。
     *
     * 创建公网域名找回请求。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateRetrievalRequest 请求对象
     * @return CompletableFuture<CreateRetrievalResponse>
     */
    public CompletableFuture<CreateRetrievalResponse> createRetrievalAsync(CreateRetrievalRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.createRetrieval);
    }

    /**
     * 创建公网域名找回请求。
     *
     * 创建公网域名找回请求。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateRetrievalRequest 请求对象
     * @return AsyncInvoker<CreateRetrievalRequest, CreateRetrievalResponse>
     */
    public AsyncInvoker<CreateRetrievalRequest, CreateRetrievalResponse> createRetrievalAsyncInvoker(
        CreateRetrievalRequest request) {
        return new AsyncInvoker<CreateRetrievalRequest, CreateRetrievalResponse>(request, DnsMeta.createRetrieval,
            hcClient);
    }

    /**
     * 请求立即验证域名找回。
     *
     * 请求服务器立即执行找回验证。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateRetrievalVerificationRequest 请求对象
     * @return CompletableFuture<CreateRetrievalVerificationResponse>
     */
    public CompletableFuture<CreateRetrievalVerificationResponse> createRetrievalVerificationAsync(
        CreateRetrievalVerificationRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.createRetrievalVerification);
    }

    /**
     * 请求立即验证域名找回。
     *
     * 请求服务器立即执行找回验证。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateRetrievalVerificationRequest 请求对象
     * @return AsyncInvoker<CreateRetrievalVerificationRequest, CreateRetrievalVerificationResponse>
     */
    public AsyncInvoker<CreateRetrievalVerificationRequest, CreateRetrievalVerificationResponse> createRetrievalVerificationAsyncInvoker(
        CreateRetrievalVerificationRequest request) {
        return new AsyncInvoker<CreateRetrievalVerificationRequest, CreateRetrievalVerificationResponse>(request,
            DnsMeta.createRetrievalVerification, hcClient);
    }

    /**
     * 删除单个自定义线路
     *
     * 删除单个自定义线路
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteCustomLineRequest 请求对象
     * @return CompletableFuture<DeleteCustomLineResponse>
     */
    public CompletableFuture<DeleteCustomLineResponse> deleteCustomLineAsync(DeleteCustomLineRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.deleteCustomLine);
    }

    /**
     * 删除单个自定义线路
     *
     * 删除单个自定义线路
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteCustomLineRequest 请求对象
     * @return AsyncInvoker<DeleteCustomLineRequest, DeleteCustomLineResponse>
     */
    public AsyncInvoker<DeleteCustomLineRequest, DeleteCustomLineResponse> deleteCustomLineAsyncInvoker(
        DeleteCustomLineRequest request) {
        return new AsyncInvoker<DeleteCustomLineRequest, DeleteCustomLineResponse>(request, DnsMeta.deleteCustomLine,
            hcClient);
    }

    /**
     * 删除终端节点。
     *
     * 删除终端节点。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteEndpointRequest 请求对象
     * @return CompletableFuture<DeleteEndpointResponse>
     */
    public CompletableFuture<DeleteEndpointResponse> deleteEndpointAsync(DeleteEndpointRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.deleteEndpoint);
    }

    /**
     * 删除终端节点。
     *
     * 删除终端节点。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteEndpointRequest 请求对象
     * @return AsyncInvoker<DeleteEndpointRequest, DeleteEndpointResponse>
     */
    public AsyncInvoker<DeleteEndpointRequest, DeleteEndpointResponse> deleteEndpointAsyncInvoker(
        DeleteEndpointRequest request) {
        return new AsyncInvoker<DeleteEndpointRequest, DeleteEndpointResponse>(request, DnsMeta.deleteEndpoint,
            hcClient);
    }

    /**
     * 删除线路分组。
     *
     * 删除单个线路分组。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteLineGroupRequest 请求对象
     * @return CompletableFuture<DeleteLineGroupResponse>
     */
    public CompletableFuture<DeleteLineGroupResponse> deleteLineGroupAsync(DeleteLineGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.deleteLineGroup);
    }

    /**
     * 删除线路分组。
     *
     * 删除单个线路分组。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteLineGroupRequest 请求对象
     * @return AsyncInvoker<DeleteLineGroupRequest, DeleteLineGroupResponse>
     */
    public AsyncInvoker<DeleteLineGroupRequest, DeleteLineGroupResponse> deleteLineGroupAsyncInvoker(
        DeleteLineGroupRequest request) {
        return new AsyncInvoker<DeleteLineGroupRequest, DeleteLineGroupResponse>(request, DnsMeta.deleteLineGroup,
            hcClient);
    }

    /**
     * 删除解析规则。
     *
     * 删除解析规则。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteResolveRuleRequest 请求对象
     * @return CompletableFuture<DeleteResolveRuleResponse>
     */
    public CompletableFuture<DeleteResolveRuleResponse> deleteResolveRuleAsync(DeleteResolveRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.deleteResolveRule);
    }

    /**
     * 删除解析规则。
     *
     * 删除解析规则。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteResolveRuleRequest 请求对象
     * @return AsyncInvoker<DeleteResolveRuleRequest, DeleteResolveRuleResponse>
     */
    public AsyncInvoker<DeleteResolveRuleRequest, DeleteResolveRuleResponse> deleteResolveRuleAsyncInvoker(
        DeleteResolveRuleRequest request) {
        return new AsyncInvoker<DeleteResolveRuleRequest, DeleteResolveRuleResponse>(request, DnsMeta.deleteResolveRule,
            hcClient);
    }

    /**
     * 解关联ip地址。
     *
     * 解除endpoint绑定的IP。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DisassociateEndpointIpaddressRequest 请求对象
     * @return CompletableFuture<DisassociateEndpointIpaddressResponse>
     */
    public CompletableFuture<DisassociateEndpointIpaddressResponse> disassociateEndpointIpaddressAsync(
        DisassociateEndpointIpaddressRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.disassociateEndpointIpaddress);
    }

    /**
     * 解关联ip地址。
     *
     * 解除endpoint绑定的IP。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DisassociateEndpointIpaddressRequest 请求对象
     * @return AsyncInvoker<DisassociateEndpointIpaddressRequest, DisassociateEndpointIpaddressResponse>
     */
    public AsyncInvoker<DisassociateEndpointIpaddressRequest, DisassociateEndpointIpaddressResponse> disassociateEndpointIpaddressAsyncInvoker(
        DisassociateEndpointIpaddressRequest request) {
        return new AsyncInvoker<DisassociateEndpointIpaddressRequest, DisassociateEndpointIpaddressResponse>(request,
            DnsMeta.disassociateEndpointIpaddress, hcClient);
    }

    /**
     * 查询所有的云解析服务API版本号
     *
     * 查询所有的云解析服务API版本号列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListApiVersionsRequest 请求对象
     * @return CompletableFuture<ListApiVersionsResponse>
     */
    public CompletableFuture<ListApiVersionsResponse> listApiVersionsAsync(ListApiVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.listApiVersions);
    }

    /**
     * 查询所有的云解析服务API版本号
     *
     * 查询所有的云解析服务API版本号列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListApiVersionsRequest 请求对象
     * @return AsyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse>
     */
    public AsyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse> listApiVersionsAsyncInvoker(
        ListApiVersionsRequest request) {
        return new AsyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse>(request, DnsMeta.listApiVersions,
            hcClient);
    }

    /**
     * 查询自定义线路
     *
     * 查询自定义线路
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListCustomLineRequest 请求对象
     * @return CompletableFuture<ListCustomLineResponse>
     */
    public CompletableFuture<ListCustomLineResponse> listCustomLineAsync(ListCustomLineRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.listCustomLine);
    }

    /**
     * 查询自定义线路
     *
     * 查询自定义线路
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListCustomLineRequest 请求对象
     * @return AsyncInvoker<ListCustomLineRequest, ListCustomLineResponse>
     */
    public AsyncInvoker<ListCustomLineRequest, ListCustomLineResponse> listCustomLineAsyncInvoker(
        ListCustomLineRequest request) {
        return new AsyncInvoker<ListCustomLineRequest, ListCustomLineResponse>(request, DnsMeta.listCustomLine,
            hcClient);
    }

    /**
     * 查询ip地址列表。
     *
     * 查询某个endpoint下的ip地址列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListEndpointIpaddressesRequest 请求对象
     * @return CompletableFuture<ListEndpointIpaddressesResponse>
     */
    public CompletableFuture<ListEndpointIpaddressesResponse> listEndpointIpaddressesAsync(
        ListEndpointIpaddressesRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.listEndpointIpaddresses);
    }

    /**
     * 查询ip地址列表。
     *
     * 查询某个endpoint下的ip地址列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListEndpointIpaddressesRequest 请求对象
     * @return AsyncInvoker<ListEndpointIpaddressesRequest, ListEndpointIpaddressesResponse>
     */
    public AsyncInvoker<ListEndpointIpaddressesRequest, ListEndpointIpaddressesResponse> listEndpointIpaddressesAsyncInvoker(
        ListEndpointIpaddressesRequest request) {
        return new AsyncInvoker<ListEndpointIpaddressesRequest, ListEndpointIpaddressesResponse>(request,
            DnsMeta.listEndpointIpaddresses, hcClient);
    }

    /**
     * 查询vpc信息。
     *
     * 查询vpc的终端节点信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListEndpointVpcsRequest 请求对象
     * @return CompletableFuture<ListEndpointVpcsResponse>
     */
    public CompletableFuture<ListEndpointVpcsResponse> listEndpointVpcsAsync(ListEndpointVpcsRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.listEndpointVpcs);
    }

    /**
     * 查询vpc信息。
     *
     * 查询vpc的终端节点信息。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListEndpointVpcsRequest 请求对象
     * @return AsyncInvoker<ListEndpointVpcsRequest, ListEndpointVpcsResponse>
     */
    public AsyncInvoker<ListEndpointVpcsRequest, ListEndpointVpcsResponse> listEndpointVpcsAsyncInvoker(
        ListEndpointVpcsRequest request) {
        return new AsyncInvoker<ListEndpointVpcsRequest, ListEndpointVpcsResponse>(request, DnsMeta.listEndpointVpcs,
            hcClient);
    }

    /**
     * 查询终端节点列表。
     *
     * 查询终端节点列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListEndpointsRequest 请求对象
     * @return CompletableFuture<ListEndpointsResponse>
     */
    public CompletableFuture<ListEndpointsResponse> listEndpointsAsync(ListEndpointsRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.listEndpoints);
    }

    /**
     * 查询终端节点列表。
     *
     * 查询终端节点列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListEndpointsRequest 请求对象
     * @return AsyncInvoker<ListEndpointsRequest, ListEndpointsResponse>
     */
    public AsyncInvoker<ListEndpointsRequest, ListEndpointsResponse> listEndpointsAsyncInvoker(
        ListEndpointsRequest request) {
        return new AsyncInvoker<ListEndpointsRequest, ListEndpointsResponse>(request, DnsMeta.listEndpoints, hcClient);
    }

    /**
     * 查询线路分组列表。
     *
     * 查询线路分组列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListLineGroupsRequest 请求对象
     * @return CompletableFuture<ListLineGroupsResponse>
     */
    public CompletableFuture<ListLineGroupsResponse> listLineGroupsAsync(ListLineGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.listLineGroups);
    }

    /**
     * 查询线路分组列表。
     *
     * 查询线路分组列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListLineGroupsRequest 请求对象
     * @return AsyncInvoker<ListLineGroupsRequest, ListLineGroupsResponse>
     */
    public AsyncInvoker<ListLineGroupsRequest, ListLineGroupsResponse> listLineGroupsAsyncInvoker(
        ListLineGroupsRequest request) {
        return new AsyncInvoker<ListLineGroupsRequest, ListLineGroupsResponse>(request, DnsMeta.listLineGroups,
            hcClient);
    }

    /**
     * 查询名称服务器列表
     *
     * 查询名称服务器列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListNameServersRequest 请求对象
     * @return CompletableFuture<ListNameServersResponse>
     */
    public CompletableFuture<ListNameServersResponse> listNameServersAsync(ListNameServersRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.listNameServers);
    }

    /**
     * 查询名称服务器列表
     *
     * 查询名称服务器列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListNameServersRequest 请求对象
     * @return AsyncInvoker<ListNameServersRequest, ListNameServersResponse>
     */
    public AsyncInvoker<ListNameServersRequest, ListNameServersResponse> listNameServersAsyncInvoker(
        ListNameServersRequest request) {
        return new AsyncInvoker<ListNameServersRequest, ListNameServersResponse>(request, DnsMeta.listNameServers,
            hcClient);
    }

    /**
     * 查询解析规则列表。
     *
     * 查询解析规则的列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListResoleRulesRequest 请求对象
     * @return CompletableFuture<ListResoleRulesResponse>
     */
    public CompletableFuture<ListResoleRulesResponse> listResoleRulesAsync(ListResoleRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.listResoleRules);
    }

    /**
     * 查询解析规则列表。
     *
     * 查询解析规则的列表。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListResoleRulesRequest 请求对象
     * @return AsyncInvoker<ListResoleRulesRequest, ListResoleRulesResponse>
     */
    public AsyncInvoker<ListResoleRulesRequest, ListResoleRulesResponse> listResoleRulesAsyncInvoker(
        ListResoleRulesRequest request) {
        return new AsyncInvoker<ListResoleRulesRequest, ListResoleRulesResponse>(request, DnsMeta.listResoleRules,
            hcClient);
    }

    /**
     * 查询指定的云解析服务API版本号
     *
     * 查询指定的云解析服务API版本号
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowApiInfoRequest 请求对象
     * @return CompletableFuture<ShowApiInfoResponse>
     */
    public CompletableFuture<ShowApiInfoResponse> showApiInfoAsync(ShowApiInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.showApiInfo);
    }

    /**
     * 查询指定的云解析服务API版本号
     *
     * 查询指定的云解析服务API版本号
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowApiInfoRequest 请求对象
     * @return AsyncInvoker<ShowApiInfoRequest, ShowApiInfoResponse>
     */
    public AsyncInvoker<ShowApiInfoRequest, ShowApiInfoResponse> showApiInfoAsyncInvoker(ShowApiInfoRequest request) {
        return new AsyncInvoker<ShowApiInfoRequest, ShowApiInfoResponse>(request, DnsMeta.showApiInfo, hcClient);
    }

    /**
     * 查询租户配额
     *
     * 查询单租户在DNS服务下的资源配额，包括公网zone配额、内网zone配额、Record Set配额、PTR Record配额、入站终端节点配额、出站终端节点配额、自定义线路配额、线路分组配额等。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowDomainQuotaRequest 请求对象
     * @return CompletableFuture<ShowDomainQuotaResponse>
     */
    public CompletableFuture<ShowDomainQuotaResponse> showDomainQuotaAsync(ShowDomainQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.showDomainQuota);
    }

    /**
     * 查询租户配额
     *
     * 查询单租户在DNS服务下的资源配额，包括公网zone配额、内网zone配额、Record Set配额、PTR Record配额、入站终端节点配额、出站终端节点配额、自定义线路配额、线路分组配额等。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowDomainQuotaRequest 请求对象
     * @return AsyncInvoker<ShowDomainQuotaRequest, ShowDomainQuotaResponse>
     */
    public AsyncInvoker<ShowDomainQuotaRequest, ShowDomainQuotaResponse> showDomainQuotaAsyncInvoker(
        ShowDomainQuotaRequest request) {
        return new AsyncInvoker<ShowDomainQuotaRequest, ShowDomainQuotaResponse>(request, DnsMeta.showDomainQuota,
            hcClient);
    }

    /**
     * 查询endpoint。
     *
     * 查询终端单个节点。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowEndpointRequest 请求对象
     * @return CompletableFuture<ShowEndpointResponse>
     */
    public CompletableFuture<ShowEndpointResponse> showEndpointAsync(ShowEndpointRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.showEndpoint);
    }

    /**
     * 查询endpoint。
     *
     * 查询终端单个节点。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowEndpointRequest 请求对象
     * @return AsyncInvoker<ShowEndpointRequest, ShowEndpointResponse>
     */
    public AsyncInvoker<ShowEndpointRequest, ShowEndpointResponse> showEndpointAsyncInvoker(
        ShowEndpointRequest request) {
        return new AsyncInvoker<ShowEndpointRequest, ShowEndpointResponse>(request, DnsMeta.showEndpoint, hcClient);
    }

    /**
     * 查询线路分组。
     *
     * 查询线路分组。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowLineGroupRequest 请求对象
     * @return CompletableFuture<ShowLineGroupResponse>
     */
    public CompletableFuture<ShowLineGroupResponse> showLineGroupAsync(ShowLineGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.showLineGroup);
    }

    /**
     * 查询线路分组。
     *
     * 查询线路分组。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowLineGroupRequest 请求对象
     * @return AsyncInvoker<ShowLineGroupRequest, ShowLineGroupResponse>
     */
    public AsyncInvoker<ShowLineGroupRequest, ShowLineGroupResponse> showLineGroupAsyncInvoker(
        ShowLineGroupRequest request) {
        return new AsyncInvoker<ShowLineGroupRequest, ShowLineGroupResponse>(request, DnsMeta.showLineGroup, hcClient);
    }

    /**
     * 查询单个解析规则。
     *
     * 查询单个解析规则。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowResoleRuleRequest 请求对象
     * @return CompletableFuture<ShowResoleRuleResponse>
     */
    public CompletableFuture<ShowResoleRuleResponse> showResoleRuleAsync(ShowResoleRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.showResoleRule);
    }

    /**
     * 查询单个解析规则。
     *
     * 查询单个解析规则。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowResoleRuleRequest 请求对象
     * @return AsyncInvoker<ShowResoleRuleRequest, ShowResoleRuleResponse>
     */
    public AsyncInvoker<ShowResoleRuleRequest, ShowResoleRuleResponse> showResoleRuleAsyncInvoker(
        ShowResoleRuleRequest request) {
        return new AsyncInvoker<ShowResoleRuleRequest, ShowResoleRuleResponse>(request, DnsMeta.showResoleRule,
            hcClient);
    }

    /**
     * 查询域名找回。
     *
     * 查询域名找回请求。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowRetrievalRequest 请求对象
     * @return CompletableFuture<ShowRetrievalResponse>
     */
    public CompletableFuture<ShowRetrievalResponse> showRetrievalAsync(ShowRetrievalRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.showRetrieval);
    }

    /**
     * 查询域名找回。
     *
     * 查询域名找回请求。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowRetrievalRequest 请求对象
     * @return AsyncInvoker<ShowRetrievalRequest, ShowRetrievalResponse>
     */
    public AsyncInvoker<ShowRetrievalRequest, ShowRetrievalResponse> showRetrievalAsyncInvoker(
        ShowRetrievalRequest request) {
        return new AsyncInvoker<ShowRetrievalRequest, ShowRetrievalResponse>(request, DnsMeta.showRetrieval, hcClient);
    }

    /**
     * 查询域名找回结果。
     *
     * 查询域名找回结果。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowRetrievalVerificationRequest 请求对象
     * @return CompletableFuture<ShowRetrievalVerificationResponse>
     */
    public CompletableFuture<ShowRetrievalVerificationResponse> showRetrievalVerificationAsync(
        ShowRetrievalVerificationRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.showRetrievalVerification);
    }

    /**
     * 查询域名找回结果。
     *
     * 查询域名找回结果。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowRetrievalVerificationRequest 请求对象
     * @return AsyncInvoker<ShowRetrievalVerificationRequest, ShowRetrievalVerificationResponse>
     */
    public AsyncInvoker<ShowRetrievalVerificationRequest, ShowRetrievalVerificationResponse> showRetrievalVerificationAsyncInvoker(
        ShowRetrievalVerificationRequest request) {
        return new AsyncInvoker<ShowRetrievalVerificationRequest, ShowRetrievalVerificationResponse>(request,
            DnsMeta.showRetrievalVerification, hcClient);
    }

    /**
     * 更新单个自定义线路
     *
     * 更新单个自定义线路
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateCustomLineRequest 请求对象
     * @return CompletableFuture<UpdateCustomLineResponse>
     */
    public CompletableFuture<UpdateCustomLineResponse> updateCustomLineAsync(UpdateCustomLineRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.updateCustomLine);
    }

    /**
     * 更新单个自定义线路
     *
     * 更新单个自定义线路
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateCustomLineRequest 请求对象
     * @return AsyncInvoker<UpdateCustomLineRequest, UpdateCustomLineResponse>
     */
    public AsyncInvoker<UpdateCustomLineRequest, UpdateCustomLineResponse> updateCustomLineAsyncInvoker(
        UpdateCustomLineRequest request) {
        return new AsyncInvoker<UpdateCustomLineRequest, UpdateCustomLineResponse>(request, DnsMeta.updateCustomLine,
            hcClient);
    }

    /**
     * 修改终端节点
     *
     * 修改终端节点
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateEndpointRequest 请求对象
     * @return CompletableFuture<UpdateEndpointResponse>
     */
    public CompletableFuture<UpdateEndpointResponse> updateEndpointAsync(UpdateEndpointRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.updateEndpoint);
    }

    /**
     * 修改终端节点
     *
     * 修改终端节点
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateEndpointRequest 请求对象
     * @return AsyncInvoker<UpdateEndpointRequest, UpdateEndpointResponse>
     */
    public AsyncInvoker<UpdateEndpointRequest, UpdateEndpointResponse> updateEndpointAsyncInvoker(
        UpdateEndpointRequest request) {
        return new AsyncInvoker<UpdateEndpointRequest, UpdateEndpointResponse>(request, DnsMeta.updateEndpoint,
            hcClient);
    }

    /**
     * 更新线路分组。
     *
     * 更新单个线路分组。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateLineGroupsRequest 请求对象
     * @return CompletableFuture<UpdateLineGroupsResponse>
     */
    public CompletableFuture<UpdateLineGroupsResponse> updateLineGroupsAsync(UpdateLineGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.updateLineGroups);
    }

    /**
     * 更新线路分组。
     *
     * 更新单个线路分组。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateLineGroupsRequest 请求对象
     * @return AsyncInvoker<UpdateLineGroupsRequest, UpdateLineGroupsResponse>
     */
    public AsyncInvoker<UpdateLineGroupsRequest, UpdateLineGroupsResponse> updateLineGroupsAsyncInvoker(
        UpdateLineGroupsRequest request) {
        return new AsyncInvoker<UpdateLineGroupsRequest, UpdateLineGroupsResponse>(request, DnsMeta.updateLineGroups,
            hcClient);
    }

    /**
     * 修改解析规则。
     *
     * 修改一个解析规则。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateResolveRuleRequest 请求对象
     * @return CompletableFuture<UpdateResolveRuleResponse>
     */
    public CompletableFuture<UpdateResolveRuleResponse> updateResolveRuleAsync(UpdateResolveRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.updateResolveRule);
    }

    /**
     * 修改解析规则。
     *
     * 修改一个解析规则。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateResolveRuleRequest 请求对象
     * @return AsyncInvoker<UpdateResolveRuleRequest, UpdateResolveRuleResponse>
     */
    public AsyncInvoker<UpdateResolveRuleRequest, UpdateResolveRuleResponse> updateResolveRuleAsyncInvoker(
        UpdateResolveRuleRequest request) {
        return new AsyncInvoker<UpdateResolveRuleRequest, UpdateResolveRuleResponse>(request, DnsMeta.updateResolveRule,
            hcClient);
    }

    /**
     * 设置弹性IP的PTR记录
     *
     * 设置弹性IP的PTR记录
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateEipRecordSetRequest 请求对象
     * @return CompletableFuture<CreateEipRecordSetResponse>
     */
    public CompletableFuture<CreateEipRecordSetResponse> createEipRecordSetAsync(CreateEipRecordSetRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.createEipRecordSet);
    }

    /**
     * 设置弹性IP的PTR记录
     *
     * 设置弹性IP的PTR记录
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateEipRecordSetRequest 请求对象
     * @return AsyncInvoker<CreateEipRecordSetRequest, CreateEipRecordSetResponse>
     */
    public AsyncInvoker<CreateEipRecordSetRequest, CreateEipRecordSetResponse> createEipRecordSetAsyncInvoker(
        CreateEipRecordSetRequest request) {
        return new AsyncInvoker<CreateEipRecordSetRequest, CreateEipRecordSetResponse>(request,
            DnsMeta.createEipRecordSet, hcClient);
    }

    /**
     * 查询租户弹性IP的PTR记录列表
     *
     * 查询租户弹性IP的PTR记录列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListPtrRecordsRequest 请求对象
     * @return CompletableFuture<ListPtrRecordsResponse>
     */
    public CompletableFuture<ListPtrRecordsResponse> listPtrRecordsAsync(ListPtrRecordsRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.listPtrRecords);
    }

    /**
     * 查询租户弹性IP的PTR记录列表
     *
     * 查询租户弹性IP的PTR记录列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListPtrRecordsRequest 请求对象
     * @return AsyncInvoker<ListPtrRecordsRequest, ListPtrRecordsResponse>
     */
    public AsyncInvoker<ListPtrRecordsRequest, ListPtrRecordsResponse> listPtrRecordsAsyncInvoker(
        ListPtrRecordsRequest request) {
        return new AsyncInvoker<ListPtrRecordsRequest, ListPtrRecordsResponse>(request, DnsMeta.listPtrRecords,
            hcClient);
    }

    /**
     * 将弹性IP的PTR记录恢复为默认值
     *
     * 将弹性IP的PTR记录恢复为默认值
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RestorePtrRecordRequest 请求对象
     * @return CompletableFuture<RestorePtrRecordResponse>
     */
    public CompletableFuture<RestorePtrRecordResponse> restorePtrRecordAsync(RestorePtrRecordRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.restorePtrRecord);
    }

    /**
     * 将弹性IP的PTR记录恢复为默认值
     *
     * 将弹性IP的PTR记录恢复为默认值
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param RestorePtrRecordRequest 请求对象
     * @return AsyncInvoker<RestorePtrRecordRequest, RestorePtrRecordResponse>
     */
    public AsyncInvoker<RestorePtrRecordRequest, RestorePtrRecordResponse> restorePtrRecordAsyncInvoker(
        RestorePtrRecordRequest request) {
        return new AsyncInvoker<RestorePtrRecordRequest, RestorePtrRecordResponse>(request, DnsMeta.restorePtrRecord,
            hcClient);
    }

    /**
     * 查询单个弹性IP的PTR记录
     *
     * 查询单个弹性IP的PTR记录
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowPtrRecordSetRequest 请求对象
     * @return CompletableFuture<ShowPtrRecordSetResponse>
     */
    public CompletableFuture<ShowPtrRecordSetResponse> showPtrRecordSetAsync(ShowPtrRecordSetRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.showPtrRecordSet);
    }

    /**
     * 查询单个弹性IP的PTR记录
     *
     * 查询单个弹性IP的PTR记录
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowPtrRecordSetRequest 请求对象
     * @return AsyncInvoker<ShowPtrRecordSetRequest, ShowPtrRecordSetResponse>
     */
    public AsyncInvoker<ShowPtrRecordSetRequest, ShowPtrRecordSetResponse> showPtrRecordSetAsyncInvoker(
        ShowPtrRecordSetRequest request) {
        return new AsyncInvoker<ShowPtrRecordSetRequest, ShowPtrRecordSetResponse>(request, DnsMeta.showPtrRecordSet,
            hcClient);
    }

    /**
     * 修改弹性IP的PTR记录
     *
     * 修改弹性IP的PTR记录
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdatePtrRecordRequest 请求对象
     * @return CompletableFuture<UpdatePtrRecordResponse>
     */
    public CompletableFuture<UpdatePtrRecordResponse> updatePtrRecordAsync(UpdatePtrRecordRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.updatePtrRecord);
    }

    /**
     * 修改弹性IP的PTR记录
     *
     * 修改弹性IP的PTR记录
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdatePtrRecordRequest 请求对象
     * @return AsyncInvoker<UpdatePtrRecordRequest, UpdatePtrRecordResponse>
     */
    public AsyncInvoker<UpdatePtrRecordRequest, UpdatePtrRecordResponse> updatePtrRecordAsyncInvoker(
        UpdatePtrRecordRequest request) {
        return new AsyncInvoker<UpdatePtrRecordRequest, UpdatePtrRecordResponse>(request, DnsMeta.updatePtrRecord,
            hcClient);
    }

    /**
     * Record Set关联健康检查。
     *
     * Record Set关联健康检查。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param AssociateHealthCheckRequest 请求对象
     * @return CompletableFuture<AssociateHealthCheckResponse>
     */
    public CompletableFuture<AssociateHealthCheckResponse> associateHealthCheckAsync(
        AssociateHealthCheckRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.associateHealthCheck);
    }

    /**
     * Record Set关联健康检查。
     *
     * Record Set关联健康检查。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param AssociateHealthCheckRequest 请求对象
     * @return AsyncInvoker<AssociateHealthCheckRequest, AssociateHealthCheckResponse>
     */
    public AsyncInvoker<AssociateHealthCheckRequest, AssociateHealthCheckResponse> associateHealthCheckAsyncInvoker(
        AssociateHealthCheckRequest request) {
        return new AsyncInvoker<AssociateHealthCheckRequest, AssociateHealthCheckResponse>(request,
            DnsMeta.associateHealthCheck, hcClient);
    }

    /**
     * 批量删除某个Zone下的Record Set资源。
     *
     * 批量删除某个Zone下的Record Set资源，当删除的资源不存在时，则默认删除成功。
     * 响应结果中只包含本次实际删除的资源。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchDeleteRecordSetWithLineRequest 请求对象
     * @return CompletableFuture<BatchDeleteRecordSetWithLineResponse>
     */
    public CompletableFuture<BatchDeleteRecordSetWithLineResponse> batchDeleteRecordSetWithLineAsync(
        BatchDeleteRecordSetWithLineRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.batchDeleteRecordSetWithLine);
    }

    /**
     * 批量删除某个Zone下的Record Set资源。
     *
     * 批量删除某个Zone下的Record Set资源，当删除的资源不存在时，则默认删除成功。
     * 响应结果中只包含本次实际删除的资源。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchDeleteRecordSetWithLineRequest 请求对象
     * @return AsyncInvoker<BatchDeleteRecordSetWithLineRequest, BatchDeleteRecordSetWithLineResponse>
     */
    public AsyncInvoker<BatchDeleteRecordSetWithLineRequest, BatchDeleteRecordSetWithLineResponse> batchDeleteRecordSetWithLineAsyncInvoker(
        BatchDeleteRecordSetWithLineRequest request) {
        return new AsyncInvoker<BatchDeleteRecordSetWithLineRequest, BatchDeleteRecordSetWithLineResponse>(request,
            DnsMeta.batchDeleteRecordSetWithLine, hcClient);
    }

    /**
     * 批量修改RecordSet。
     *
     * 批量修改RecordSet。属于原子性操作，请求Record Set将全部完成修改，或不做任何修改。
     * 仅公网Zone支持。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchUpdateRecordSetWithLineRequest 请求对象
     * @return CompletableFuture<BatchUpdateRecordSetWithLineResponse>
     */
    public CompletableFuture<BatchUpdateRecordSetWithLineResponse> batchUpdateRecordSetWithLineAsync(
        BatchUpdateRecordSetWithLineRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.batchUpdateRecordSetWithLine);
    }

    /**
     * 批量修改RecordSet。
     *
     * 批量修改RecordSet。属于原子性操作，请求Record Set将全部完成修改，或不做任何修改。
     * 仅公网Zone支持。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchUpdateRecordSetWithLineRequest 请求对象
     * @return AsyncInvoker<BatchUpdateRecordSetWithLineRequest, BatchUpdateRecordSetWithLineResponse>
     */
    public AsyncInvoker<BatchUpdateRecordSetWithLineRequest, BatchUpdateRecordSetWithLineResponse> batchUpdateRecordSetWithLineAsyncInvoker(
        BatchUpdateRecordSetWithLineRequest request) {
        return new AsyncInvoker<BatchUpdateRecordSetWithLineRequest, BatchUpdateRecordSetWithLineResponse>(request,
            DnsMeta.batchUpdateRecordSetWithLine, hcClient);
    }

    /**
     * 创建单个Record Set
     *
     * 创建单个Record Set
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateRecordSetRequest 请求对象
     * @return CompletableFuture<CreateRecordSetResponse>
     */
    public CompletableFuture<CreateRecordSetResponse> createRecordSetAsync(CreateRecordSetRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.createRecordSet);
    }

    /**
     * 创建单个Record Set
     *
     * 创建单个Record Set
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateRecordSetRequest 请求对象
     * @return AsyncInvoker<CreateRecordSetRequest, CreateRecordSetResponse>
     */
    public AsyncInvoker<CreateRecordSetRequest, CreateRecordSetResponse> createRecordSetAsyncInvoker(
        CreateRecordSetRequest request) {
        return new AsyncInvoker<CreateRecordSetRequest, CreateRecordSetResponse>(request, DnsMeta.createRecordSet,
            hcClient);
    }

    /**
     * 批量线路创建RecordSet。仅公网Zone支持。
     *
     * 批量线路创建RecordSet。属于原子性操作，如果存在一个参数校验不通过，则创建失败。仅公网Zone支持。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateRecordSetWithBatchLinesRequest 请求对象
     * @return CompletableFuture<CreateRecordSetWithBatchLinesResponse>
     */
    public CompletableFuture<CreateRecordSetWithBatchLinesResponse> createRecordSetWithBatchLinesAsync(
        CreateRecordSetWithBatchLinesRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.createRecordSetWithBatchLines);
    }

    /**
     * 批量线路创建RecordSet。仅公网Zone支持。
     *
     * 批量线路创建RecordSet。属于原子性操作，如果存在一个参数校验不通过，则创建失败。仅公网Zone支持。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateRecordSetWithBatchLinesRequest 请求对象
     * @return AsyncInvoker<CreateRecordSetWithBatchLinesRequest, CreateRecordSetWithBatchLinesResponse>
     */
    public AsyncInvoker<CreateRecordSetWithBatchLinesRequest, CreateRecordSetWithBatchLinesResponse> createRecordSetWithBatchLinesAsyncInvoker(
        CreateRecordSetWithBatchLinesRequest request) {
        return new AsyncInvoker<CreateRecordSetWithBatchLinesRequest, CreateRecordSetWithBatchLinesResponse>(request,
            DnsMeta.createRecordSetWithBatchLines, hcClient);
    }

    /**
     * 创建单个Record Set，仅适用于公网DNS
     *
     * 创建单个Record Set，仅适用于公网DNS
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateRecordSetWithLineRequest 请求对象
     * @return CompletableFuture<CreateRecordSetWithLineResponse>
     */
    public CompletableFuture<CreateRecordSetWithLineResponse> createRecordSetWithLineAsync(
        CreateRecordSetWithLineRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.createRecordSetWithLine);
    }

    /**
     * 创建单个Record Set，仅适用于公网DNS
     *
     * 创建单个Record Set，仅适用于公网DNS
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateRecordSetWithLineRequest 请求对象
     * @return AsyncInvoker<CreateRecordSetWithLineRequest, CreateRecordSetWithLineResponse>
     */
    public AsyncInvoker<CreateRecordSetWithLineRequest, CreateRecordSetWithLineResponse> createRecordSetWithLineAsyncInvoker(
        CreateRecordSetWithLineRequest request) {
        return new AsyncInvoker<CreateRecordSetWithLineRequest, CreateRecordSetWithLineResponse>(request,
            DnsMeta.createRecordSetWithLine, hcClient);
    }

    /**
     * 删除单个Record Set
     *
     * 删除单个Record Set
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteRecordSetRequest 请求对象
     * @return CompletableFuture<DeleteRecordSetResponse>
     */
    public CompletableFuture<DeleteRecordSetResponse> deleteRecordSetAsync(DeleteRecordSetRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.deleteRecordSet);
    }

    /**
     * 删除单个Record Set
     *
     * 删除单个Record Set
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteRecordSetRequest 请求对象
     * @return AsyncInvoker<DeleteRecordSetRequest, DeleteRecordSetResponse>
     */
    public AsyncInvoker<DeleteRecordSetRequest, DeleteRecordSetResponse> deleteRecordSetAsyncInvoker(
        DeleteRecordSetRequest request) {
        return new AsyncInvoker<DeleteRecordSetRequest, DeleteRecordSetResponse>(request, DnsMeta.deleteRecordSet,
            hcClient);
    }

    /**
     * 删除单个Record Set
     *
     * 删除单个Record Set
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteRecordSetsRequest 请求对象
     * @return CompletableFuture<DeleteRecordSetsResponse>
     */
    public CompletableFuture<DeleteRecordSetsResponse> deleteRecordSetsAsync(DeleteRecordSetsRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.deleteRecordSets);
    }

    /**
     * 删除单个Record Set
     *
     * 删除单个Record Set
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteRecordSetsRequest 请求对象
     * @return AsyncInvoker<DeleteRecordSetsRequest, DeleteRecordSetsResponse>
     */
    public AsyncInvoker<DeleteRecordSetsRequest, DeleteRecordSetsResponse> deleteRecordSetsAsyncInvoker(
        DeleteRecordSetsRequest request) {
        return new AsyncInvoker<DeleteRecordSetsRequest, DeleteRecordSetsResponse>(request, DnsMeta.deleteRecordSets,
            hcClient);
    }

    /**
     * Record Set解关联健康检查。
     *
     * Record Set解关联健康检查。。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DisassociateHealthCheckRequest 请求对象
     * @return CompletableFuture<DisassociateHealthCheckResponse>
     */
    public CompletableFuture<DisassociateHealthCheckResponse> disassociateHealthCheckAsync(
        DisassociateHealthCheckRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.disassociateHealthCheck);
    }

    /**
     * Record Set解关联健康检查。
     *
     * Record Set解关联健康检查。。
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DisassociateHealthCheckRequest 请求对象
     * @return AsyncInvoker<DisassociateHealthCheckRequest, DisassociateHealthCheckResponse>
     */
    public AsyncInvoker<DisassociateHealthCheckRequest, DisassociateHealthCheckResponse> disassociateHealthCheckAsyncInvoker(
        DisassociateHealthCheckRequest request) {
        return new AsyncInvoker<DisassociateHealthCheckRequest, DisassociateHealthCheckResponse>(request,
            DnsMeta.disassociateHealthCheck, hcClient);
    }

    /**
     * 查询租户Record Set资源列表
     *
     * 查询租户Record Set资源列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListRecordSetsRequest 请求对象
     * @return CompletableFuture<ListRecordSetsResponse>
     */
    public CompletableFuture<ListRecordSetsResponse> listRecordSetsAsync(ListRecordSetsRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.listRecordSets);
    }

    /**
     * 查询租户Record Set资源列表
     *
     * 查询租户Record Set资源列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListRecordSetsRequest 请求对象
     * @return AsyncInvoker<ListRecordSetsRequest, ListRecordSetsResponse>
     */
    public AsyncInvoker<ListRecordSetsRequest, ListRecordSetsResponse> listRecordSetsAsyncInvoker(
        ListRecordSetsRequest request) {
        return new AsyncInvoker<ListRecordSetsRequest, ListRecordSetsResponse>(request, DnsMeta.listRecordSets,
            hcClient);
    }

    /**
     * 查询单个Zone下Record Set列表
     *
     * 查询单个Zone下Record Set列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListRecordSetsByZoneRequest 请求对象
     * @return CompletableFuture<ListRecordSetsByZoneResponse>
     */
    public CompletableFuture<ListRecordSetsByZoneResponse> listRecordSetsByZoneAsync(
        ListRecordSetsByZoneRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.listRecordSetsByZone);
    }

    /**
     * 查询单个Zone下Record Set列表
     *
     * 查询单个Zone下Record Set列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListRecordSetsByZoneRequest 请求对象
     * @return AsyncInvoker<ListRecordSetsByZoneRequest, ListRecordSetsByZoneResponse>
     */
    public AsyncInvoker<ListRecordSetsByZoneRequest, ListRecordSetsByZoneResponse> listRecordSetsByZoneAsyncInvoker(
        ListRecordSetsByZoneRequest request) {
        return new AsyncInvoker<ListRecordSetsByZoneRequest, ListRecordSetsByZoneResponse>(request,
            DnsMeta.listRecordSetsByZone, hcClient);
    }

    /**
     * 查询租户Record Set资源列表
     *
     * 查询租户Record Set资源列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListRecordSetsWithLineRequest 请求对象
     * @return CompletableFuture<ListRecordSetsWithLineResponse>
     */
    public CompletableFuture<ListRecordSetsWithLineResponse> listRecordSetsWithLineAsync(
        ListRecordSetsWithLineRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.listRecordSetsWithLine);
    }

    /**
     * 查询租户Record Set资源列表
     *
     * 查询租户Record Set资源列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListRecordSetsWithLineRequest 请求对象
     * @return AsyncInvoker<ListRecordSetsWithLineRequest, ListRecordSetsWithLineResponse>
     */
    public AsyncInvoker<ListRecordSetsWithLineRequest, ListRecordSetsWithLineResponse> listRecordSetsWithLineAsyncInvoker(
        ListRecordSetsWithLineRequest request) {
        return new AsyncInvoker<ListRecordSetsWithLineRequest, ListRecordSetsWithLineResponse>(request,
            DnsMeta.listRecordSetsWithLine, hcClient);
    }

    /**
     * 设置Record Set状态
     *
     * 设置Record Set状态
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SetRecordSetsStatusRequest 请求对象
     * @return CompletableFuture<SetRecordSetsStatusResponse>
     */
    public CompletableFuture<SetRecordSetsStatusResponse> setRecordSetsStatusAsync(SetRecordSetsStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.setRecordSetsStatus);
    }

    /**
     * 设置Record Set状态
     *
     * 设置Record Set状态
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SetRecordSetsStatusRequest 请求对象
     * @return AsyncInvoker<SetRecordSetsStatusRequest, SetRecordSetsStatusResponse>
     */
    public AsyncInvoker<SetRecordSetsStatusRequest, SetRecordSetsStatusResponse> setRecordSetsStatusAsyncInvoker(
        SetRecordSetsStatusRequest request) {
        return new AsyncInvoker<SetRecordSetsStatusRequest, SetRecordSetsStatusResponse>(request,
            DnsMeta.setRecordSetsStatus, hcClient);
    }

    /**
     * 查询单个Record Set
     *
     * 查询单个Record Set
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowRecordSetRequest 请求对象
     * @return CompletableFuture<ShowRecordSetResponse>
     */
    public CompletableFuture<ShowRecordSetResponse> showRecordSetAsync(ShowRecordSetRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.showRecordSet);
    }

    /**
     * 查询单个Record Set
     *
     * 查询单个Record Set
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowRecordSetRequest 请求对象
     * @return AsyncInvoker<ShowRecordSetRequest, ShowRecordSetResponse>
     */
    public AsyncInvoker<ShowRecordSetRequest, ShowRecordSetResponse> showRecordSetAsyncInvoker(
        ShowRecordSetRequest request) {
        return new AsyncInvoker<ShowRecordSetRequest, ShowRecordSetResponse>(request, DnsMeta.showRecordSet, hcClient);
    }

    /**
     * 查询单个Zone下Record Set列表
     *
     * 查询单个Zone下Record Set列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowRecordSetByZoneRequest 请求对象
     * @return CompletableFuture<ShowRecordSetByZoneResponse>
     */
    public CompletableFuture<ShowRecordSetByZoneResponse> showRecordSetByZoneAsync(ShowRecordSetByZoneRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.showRecordSetByZone);
    }

    /**
     * 查询单个Zone下Record Set列表
     *
     * 查询单个Zone下Record Set列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowRecordSetByZoneRequest 请求对象
     * @return AsyncInvoker<ShowRecordSetByZoneRequest, ShowRecordSetByZoneResponse>
     */
    public AsyncInvoker<ShowRecordSetByZoneRequest, ShowRecordSetByZoneResponse> showRecordSetByZoneAsyncInvoker(
        ShowRecordSetByZoneRequest request) {
        return new AsyncInvoker<ShowRecordSetByZoneRequest, ShowRecordSetByZoneResponse>(request,
            DnsMeta.showRecordSetByZone, hcClient);
    }

    /**
     * 查询单个Record Set，仅适用于公网DNS
     *
     * 查询单个Record Set，仅适用于公网DNS
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowRecordSetWithLineRequest 请求对象
     * @return CompletableFuture<ShowRecordSetWithLineResponse>
     */
    public CompletableFuture<ShowRecordSetWithLineResponse> showRecordSetWithLineAsync(
        ShowRecordSetWithLineRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.showRecordSetWithLine);
    }

    /**
     * 查询单个Record Set，仅适用于公网DNS
     *
     * 查询单个Record Set，仅适用于公网DNS
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowRecordSetWithLineRequest 请求对象
     * @return AsyncInvoker<ShowRecordSetWithLineRequest, ShowRecordSetWithLineResponse>
     */
    public AsyncInvoker<ShowRecordSetWithLineRequest, ShowRecordSetWithLineResponse> showRecordSetWithLineAsyncInvoker(
        ShowRecordSetWithLineRequest request) {
        return new AsyncInvoker<ShowRecordSetWithLineRequest, ShowRecordSetWithLineResponse>(request,
            DnsMeta.showRecordSetWithLine, hcClient);
    }

    /**
     * 修改单个Record Set
     *
     * 修改单个Record Set
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateRecordSetRequest 请求对象
     * @return CompletableFuture<UpdateRecordSetResponse>
     */
    public CompletableFuture<UpdateRecordSetResponse> updateRecordSetAsync(UpdateRecordSetRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.updateRecordSet);
    }

    /**
     * 修改单个Record Set
     *
     * 修改单个Record Set
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateRecordSetRequest 请求对象
     * @return AsyncInvoker<UpdateRecordSetRequest, UpdateRecordSetResponse>
     */
    public AsyncInvoker<UpdateRecordSetRequest, UpdateRecordSetResponse> updateRecordSetAsyncInvoker(
        UpdateRecordSetRequest request) {
        return new AsyncInvoker<UpdateRecordSetRequest, UpdateRecordSetResponse>(request, DnsMeta.updateRecordSet,
            hcClient);
    }

    /**
     * 修改单个Record Set
     *
     * 修改单个Record Set
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateRecordSetsRequest 请求对象
     * @return CompletableFuture<UpdateRecordSetsResponse>
     */
    public CompletableFuture<UpdateRecordSetsResponse> updateRecordSetsAsync(UpdateRecordSetsRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.updateRecordSets);
    }

    /**
     * 修改单个Record Set
     *
     * 修改单个Record Set
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdateRecordSetsRequest 请求对象
     * @return AsyncInvoker<UpdateRecordSetsRequest, UpdateRecordSetsResponse>
     */
    public AsyncInvoker<UpdateRecordSetsRequest, UpdateRecordSetsResponse> updateRecordSetsAsyncInvoker(
        UpdateRecordSetsRequest request) {
        return new AsyncInvoker<UpdateRecordSetsRequest, UpdateRecordSetsResponse>(request, DnsMeta.updateRecordSets,
            hcClient);
    }

    /**
     * 为指定实例批量添加或删除标签
     *
     * 为指定实例批量添加或删除标签
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchCreateTagRequest 请求对象
     * @return CompletableFuture<BatchCreateTagResponse>
     */
    public CompletableFuture<BatchCreateTagResponse> batchCreateTagAsync(BatchCreateTagRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.batchCreateTag);
    }

    /**
     * 为指定实例批量添加或删除标签
     *
     * 为指定实例批量添加或删除标签
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param BatchCreateTagRequest 请求对象
     * @return AsyncInvoker<BatchCreateTagRequest, BatchCreateTagResponse>
     */
    public AsyncInvoker<BatchCreateTagRequest, BatchCreateTagResponse> batchCreateTagAsyncInvoker(
        BatchCreateTagRequest request) {
        return new AsyncInvoker<BatchCreateTagRequest, BatchCreateTagResponse>(request, DnsMeta.batchCreateTag,
            hcClient);
    }

    /**
     * 为指定实例添加标签
     *
     * 为指定实例添加标签
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateTagRequest 请求对象
     * @return CompletableFuture<CreateTagResponse>
     */
    public CompletableFuture<CreateTagResponse> createTagAsync(CreateTagRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.createTag);
    }

    /**
     * 为指定实例添加标签
     *
     * 为指定实例添加标签
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreateTagRequest 请求对象
     * @return AsyncInvoker<CreateTagRequest, CreateTagResponse>
     */
    public AsyncInvoker<CreateTagRequest, CreateTagResponse> createTagAsyncInvoker(CreateTagRequest request) {
        return new AsyncInvoker<CreateTagRequest, CreateTagResponse>(request, DnsMeta.createTag, hcClient);
    }

    /**
     * 删除资源标签
     *
     * 删除资源标签
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteTagRequest 请求对象
     * @return CompletableFuture<DeleteTagResponse>
     */
    public CompletableFuture<DeleteTagResponse> deleteTagAsync(DeleteTagRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.deleteTag);
    }

    /**
     * 删除资源标签
     *
     * 删除资源标签
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeleteTagRequest 请求对象
     * @return AsyncInvoker<DeleteTagRequest, DeleteTagResponse>
     */
    public AsyncInvoker<DeleteTagRequest, DeleteTagResponse> deleteTagAsyncInvoker(DeleteTagRequest request) {
        return new AsyncInvoker<DeleteTagRequest, DeleteTagResponse>(request, DnsMeta.deleteTag, hcClient);
    }

    /**
     * 使用标签查询资源实例
     *
     * 使用标签查询资源实例
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListTagRequest 请求对象
     * @return CompletableFuture<ListTagResponse>
     */
    public CompletableFuture<ListTagResponse> listTagAsync(ListTagRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.listTag);
    }

    /**
     * 使用标签查询资源实例
     *
     * 使用标签查询资源实例
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListTagRequest 请求对象
     * @return AsyncInvoker<ListTagRequest, ListTagResponse>
     */
    public AsyncInvoker<ListTagRequest, ListTagResponse> listTagAsyncInvoker(ListTagRequest request) {
        return new AsyncInvoker<ListTagRequest, ListTagResponse>(request, DnsMeta.listTag, hcClient);
    }

    /**
     * 查询指定实例类型的所有标签集合
     *
     * 查询指定实例类型的所有标签集合
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListTagsRequest 请求对象
     * @return CompletableFuture<ListTagsResponse>
     */
    public CompletableFuture<ListTagsResponse> listTagsAsync(ListTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.listTags);
    }

    /**
     * 查询指定实例类型的所有标签集合
     *
     * 查询指定实例类型的所有标签集合
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListTagsRequest 请求对象
     * @return AsyncInvoker<ListTagsRequest, ListTagsResponse>
     */
    public AsyncInvoker<ListTagsRequest, ListTagsResponse> listTagsAsyncInvoker(ListTagsRequest request) {
        return new AsyncInvoker<ListTagsRequest, ListTagsResponse>(request, DnsMeta.listTags, hcClient);
    }

    /**
     * 查询指定实例的标签信息
     *
     * 查询指定实例的标签信息
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowResourceTagRequest 请求对象
     * @return CompletableFuture<ShowResourceTagResponse>
     */
    public CompletableFuture<ShowResourceTagResponse> showResourceTagAsync(ShowResourceTagRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.showResourceTag);
    }

    /**
     * 查询指定实例的标签信息
     *
     * 查询指定实例的标签信息
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowResourceTagRequest 请求对象
     * @return AsyncInvoker<ShowResourceTagRequest, ShowResourceTagResponse>
     */
    public AsyncInvoker<ShowResourceTagRequest, ShowResourceTagResponse> showResourceTagAsyncInvoker(
        ShowResourceTagRequest request) {
        return new AsyncInvoker<ShowResourceTagRequest, ShowResourceTagResponse>(request, DnsMeta.showResourceTag,
            hcClient);
    }

    /**
     * 在内网Zone上关联VPC
     *
     * 在内网Zone上关联VPC
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param AssociateRouterRequest 请求对象
     * @return CompletableFuture<AssociateRouterResponse>
     */
    public CompletableFuture<AssociateRouterResponse> associateRouterAsync(AssociateRouterRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.associateRouter);
    }

    /**
     * 在内网Zone上关联VPC
     *
     * 在内网Zone上关联VPC
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param AssociateRouterRequest 请求对象
     * @return AsyncInvoker<AssociateRouterRequest, AssociateRouterResponse>
     */
    public AsyncInvoker<AssociateRouterRequest, AssociateRouterResponse> associateRouterAsyncInvoker(
        AssociateRouterRequest request) {
        return new AsyncInvoker<AssociateRouterRequest, AssociateRouterResponse>(request, DnsMeta.associateRouter,
            hcClient);
    }

    /**
     * 创建单个内网Zone
     *
     * 创建单个内网Zone
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreatePrivateZoneRequest 请求对象
     * @return CompletableFuture<CreatePrivateZoneResponse>
     */
    public CompletableFuture<CreatePrivateZoneResponse> createPrivateZoneAsync(CreatePrivateZoneRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.createPrivateZone);
    }

    /**
     * 创建单个内网Zone
     *
     * 创建单个内网Zone
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreatePrivateZoneRequest 请求对象
     * @return AsyncInvoker<CreatePrivateZoneRequest, CreatePrivateZoneResponse>
     */
    public AsyncInvoker<CreatePrivateZoneRequest, CreatePrivateZoneResponse> createPrivateZoneAsyncInvoker(
        CreatePrivateZoneRequest request) {
        return new AsyncInvoker<CreatePrivateZoneRequest, CreatePrivateZoneResponse>(request, DnsMeta.createPrivateZone,
            hcClient);
    }

    /**
     * 创建单个公网Zone
     *
     * 创建单个公网Zone
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreatePublicZoneRequest 请求对象
     * @return CompletableFuture<CreatePublicZoneResponse>
     */
    public CompletableFuture<CreatePublicZoneResponse> createPublicZoneAsync(CreatePublicZoneRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.createPublicZone);
    }

    /**
     * 创建单个公网Zone
     *
     * 创建单个公网Zone
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param CreatePublicZoneRequest 请求对象
     * @return AsyncInvoker<CreatePublicZoneRequest, CreatePublicZoneResponse>
     */
    public AsyncInvoker<CreatePublicZoneRequest, CreatePublicZoneResponse> createPublicZoneAsyncInvoker(
        CreatePublicZoneRequest request) {
        return new AsyncInvoker<CreatePublicZoneRequest, CreatePublicZoneResponse>(request, DnsMeta.createPublicZone,
            hcClient);
    }

    /**
     * 删除单个内网Zone
     *
     * 删除单个内网Zone
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeletePrivateZoneRequest 请求对象
     * @return CompletableFuture<DeletePrivateZoneResponse>
     */
    public CompletableFuture<DeletePrivateZoneResponse> deletePrivateZoneAsync(DeletePrivateZoneRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.deletePrivateZone);
    }

    /**
     * 删除单个内网Zone
     *
     * 删除单个内网Zone
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeletePrivateZoneRequest 请求对象
     * @return AsyncInvoker<DeletePrivateZoneRequest, DeletePrivateZoneResponse>
     */
    public AsyncInvoker<DeletePrivateZoneRequest, DeletePrivateZoneResponse> deletePrivateZoneAsyncInvoker(
        DeletePrivateZoneRequest request) {
        return new AsyncInvoker<DeletePrivateZoneRequest, DeletePrivateZoneResponse>(request, DnsMeta.deletePrivateZone,
            hcClient);
    }

    /**
     * 删除单个公网Zone
     *
     * 删除单个公网Zone
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeletePublicZoneRequest 请求对象
     * @return CompletableFuture<DeletePublicZoneResponse>
     */
    public CompletableFuture<DeletePublicZoneResponse> deletePublicZoneAsync(DeletePublicZoneRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.deletePublicZone);
    }

    /**
     * 删除单个公网Zone
     *
     * 删除单个公网Zone
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DeletePublicZoneRequest 请求对象
     * @return AsyncInvoker<DeletePublicZoneRequest, DeletePublicZoneResponse>
     */
    public AsyncInvoker<DeletePublicZoneRequest, DeletePublicZoneResponse> deletePublicZoneAsyncInvoker(
        DeletePublicZoneRequest request) {
        return new AsyncInvoker<DeletePublicZoneRequest, DeletePublicZoneResponse>(request, DnsMeta.deletePublicZone,
            hcClient);
    }

    /**
     * 在内网Zone上解关联VPC
     *
     * 在内网Zone上解关联VPC
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DisassociateRouterRequest 请求对象
     * @return CompletableFuture<DisassociateRouterResponse>
     */
    public CompletableFuture<DisassociateRouterResponse> disassociateRouterAsync(DisassociateRouterRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.disassociateRouter);
    }

    /**
     * 在内网Zone上解关联VPC
     *
     * 在内网Zone上解关联VPC
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param DisassociateRouterRequest 请求对象
     * @return AsyncInvoker<DisassociateRouterRequest, DisassociateRouterResponse>
     */
    public AsyncInvoker<DisassociateRouterRequest, DisassociateRouterResponse> disassociateRouterAsyncInvoker(
        DisassociateRouterRequest request) {
        return new AsyncInvoker<DisassociateRouterRequest, DisassociateRouterResponse>(request,
            DnsMeta.disassociateRouter, hcClient);
    }

    /**
     * 查询内网Zone的列表
     *
     * 查询内网Zone的列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListPrivateZonesRequest 请求对象
     * @return CompletableFuture<ListPrivateZonesResponse>
     */
    public CompletableFuture<ListPrivateZonesResponse> listPrivateZonesAsync(ListPrivateZonesRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.listPrivateZones);
    }

    /**
     * 查询内网Zone的列表
     *
     * 查询内网Zone的列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListPrivateZonesRequest 请求对象
     * @return AsyncInvoker<ListPrivateZonesRequest, ListPrivateZonesResponse>
     */
    public AsyncInvoker<ListPrivateZonesRequest, ListPrivateZonesResponse> listPrivateZonesAsyncInvoker(
        ListPrivateZonesRequest request) {
        return new AsyncInvoker<ListPrivateZonesRequest, ListPrivateZonesResponse>(request, DnsMeta.listPrivateZones,
            hcClient);
    }

    /**
     * 查询公网Zone的列表
     *
     * 查询公网Zone的列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListPublicZonesRequest 请求对象
     * @return CompletableFuture<ListPublicZonesResponse>
     */
    public CompletableFuture<ListPublicZonesResponse> listPublicZonesAsync(ListPublicZonesRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.listPublicZones);
    }

    /**
     * 查询公网Zone的列表
     *
     * 查询公网Zone的列表
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ListPublicZonesRequest 请求对象
     * @return AsyncInvoker<ListPublicZonesRequest, ListPublicZonesResponse>
     */
    public AsyncInvoker<ListPublicZonesRequest, ListPublicZonesResponse> listPublicZonesAsyncInvoker(
        ListPublicZonesRequest request) {
        return new AsyncInvoker<ListPublicZonesRequest, ListPublicZonesResponse>(request, DnsMeta.listPublicZones,
            hcClient);
    }

    /**
     * 设置单个内网Zone的子域名递归解析代理
     *
     * 设置单个内网Zone的子域名递归解析代理
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SetPrivateZoneProxyPatternRequest 请求对象
     * @return CompletableFuture<SetPrivateZoneProxyPatternResponse>
     */
    public CompletableFuture<SetPrivateZoneProxyPatternResponse> setPrivateZoneProxyPatternAsync(
        SetPrivateZoneProxyPatternRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.setPrivateZoneProxyPattern);
    }

    /**
     * 设置单个内网Zone的子域名递归解析代理
     *
     * 设置单个内网Zone的子域名递归解析代理
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param SetPrivateZoneProxyPatternRequest 请求对象
     * @return AsyncInvoker<SetPrivateZoneProxyPatternRequest, SetPrivateZoneProxyPatternResponse>
     */
    public AsyncInvoker<SetPrivateZoneProxyPatternRequest, SetPrivateZoneProxyPatternResponse> setPrivateZoneProxyPatternAsyncInvoker(
        SetPrivateZoneProxyPatternRequest request) {
        return new AsyncInvoker<SetPrivateZoneProxyPatternRequest, SetPrivateZoneProxyPatternResponse>(request,
            DnsMeta.setPrivateZoneProxyPattern, hcClient);
    }

    /**
     * 查询单个内网Zone
     *
     * 查询单个内网Zone
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowPrivateZoneRequest 请求对象
     * @return CompletableFuture<ShowPrivateZoneResponse>
     */
    public CompletableFuture<ShowPrivateZoneResponse> showPrivateZoneAsync(ShowPrivateZoneRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.showPrivateZone);
    }

    /**
     * 查询单个内网Zone
     *
     * 查询单个内网Zone
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowPrivateZoneRequest 请求对象
     * @return AsyncInvoker<ShowPrivateZoneRequest, ShowPrivateZoneResponse>
     */
    public AsyncInvoker<ShowPrivateZoneRequest, ShowPrivateZoneResponse> showPrivateZoneAsyncInvoker(
        ShowPrivateZoneRequest request) {
        return new AsyncInvoker<ShowPrivateZoneRequest, ShowPrivateZoneResponse>(request, DnsMeta.showPrivateZone,
            hcClient);
    }

    /**
     * 查询单个内网Zone的名称服务器
     *
     * 查询单个内网Zone的名称服务器
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowPrivateZoneNameServerRequest 请求对象
     * @return CompletableFuture<ShowPrivateZoneNameServerResponse>
     */
    public CompletableFuture<ShowPrivateZoneNameServerResponse> showPrivateZoneNameServerAsync(
        ShowPrivateZoneNameServerRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.showPrivateZoneNameServer);
    }

    /**
     * 查询单个内网Zone的名称服务器
     *
     * 查询单个内网Zone的名称服务器
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowPrivateZoneNameServerRequest 请求对象
     * @return AsyncInvoker<ShowPrivateZoneNameServerRequest, ShowPrivateZoneNameServerResponse>
     */
    public AsyncInvoker<ShowPrivateZoneNameServerRequest, ShowPrivateZoneNameServerResponse> showPrivateZoneNameServerAsyncInvoker(
        ShowPrivateZoneNameServerRequest request) {
        return new AsyncInvoker<ShowPrivateZoneNameServerRequest, ShowPrivateZoneNameServerResponse>(request,
            DnsMeta.showPrivateZoneNameServer, hcClient);
    }

    /**
     * 查询单个公网Zone
     *
     * 查询单个公网Zone
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowPublicZoneRequest 请求对象
     * @return CompletableFuture<ShowPublicZoneResponse>
     */
    public CompletableFuture<ShowPublicZoneResponse> showPublicZoneAsync(ShowPublicZoneRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.showPublicZone);
    }

    /**
     * 查询单个公网Zone
     *
     * 查询单个公网Zone
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowPublicZoneRequest 请求对象
     * @return AsyncInvoker<ShowPublicZoneRequest, ShowPublicZoneResponse>
     */
    public AsyncInvoker<ShowPublicZoneRequest, ShowPublicZoneResponse> showPublicZoneAsyncInvoker(
        ShowPublicZoneRequest request) {
        return new AsyncInvoker<ShowPublicZoneRequest, ShowPublicZoneResponse>(request, DnsMeta.showPublicZone,
            hcClient);
    }

    /**
     * 查询单个公网Zone的名称服务器
     *
     * 查询单个公网Zone的名称服务器
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowPublicZoneNameServerRequest 请求对象
     * @return CompletableFuture<ShowPublicZoneNameServerResponse>
     */
    public CompletableFuture<ShowPublicZoneNameServerResponse> showPublicZoneNameServerAsync(
        ShowPublicZoneNameServerRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.showPublicZoneNameServer);
    }

    /**
     * 查询单个公网Zone的名称服务器
     *
     * 查询单个公网Zone的名称服务器
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param ShowPublicZoneNameServerRequest 请求对象
     * @return AsyncInvoker<ShowPublicZoneNameServerRequest, ShowPublicZoneNameServerResponse>
     */
    public AsyncInvoker<ShowPublicZoneNameServerRequest, ShowPublicZoneNameServerResponse> showPublicZoneNameServerAsyncInvoker(
        ShowPublicZoneNameServerRequest request) {
        return new AsyncInvoker<ShowPublicZoneNameServerRequest, ShowPublicZoneNameServerResponse>(request,
            DnsMeta.showPublicZoneNameServer, hcClient);
    }

    /**
     * 修改单个内网Zone
     *
     * 修改单个内网Zone
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdatePrivateZoneRequest 请求对象
     * @return CompletableFuture<UpdatePrivateZoneResponse>
     */
    public CompletableFuture<UpdatePrivateZoneResponse> updatePrivateZoneAsync(UpdatePrivateZoneRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.updatePrivateZone);
    }

    /**
     * 修改单个内网Zone
     *
     * 修改单个内网Zone
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdatePrivateZoneRequest 请求对象
     * @return AsyncInvoker<UpdatePrivateZoneRequest, UpdatePrivateZoneResponse>
     */
    public AsyncInvoker<UpdatePrivateZoneRequest, UpdatePrivateZoneResponse> updatePrivateZoneAsyncInvoker(
        UpdatePrivateZoneRequest request) {
        return new AsyncInvoker<UpdatePrivateZoneRequest, UpdatePrivateZoneResponse>(request, DnsMeta.updatePrivateZone,
            hcClient);
    }

    /**
     * 修改单个公网Zone
     *
     * 修改单个公网Zone
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdatePublicZoneRequest 请求对象
     * @return CompletableFuture<UpdatePublicZoneResponse>
     */
    public CompletableFuture<UpdatePublicZoneResponse> updatePublicZoneAsync(UpdatePublicZoneRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.updatePublicZone);
    }

    /**
     * 修改单个公网Zone
     *
     * 修改单个公网Zone
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdatePublicZoneRequest 请求对象
     * @return AsyncInvoker<UpdatePublicZoneRequest, UpdatePublicZoneResponse>
     */
    public AsyncInvoker<UpdatePublicZoneRequest, UpdatePublicZoneResponse> updatePublicZoneAsyncInvoker(
        UpdatePublicZoneRequest request) {
        return new AsyncInvoker<UpdatePublicZoneRequest, UpdatePublicZoneResponse>(request, DnsMeta.updatePublicZone,
            hcClient);
    }

    /**
     * 设置单个公网Zone状态，支持暂停、启用Zone
     *
     * 设置单个公网Zone状态，支持暂停、启用Zone
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdatePublicZoneStatusRequest 请求对象
     * @return CompletableFuture<UpdatePublicZoneStatusResponse>
     */
    public CompletableFuture<UpdatePublicZoneStatusResponse> updatePublicZoneStatusAsync(
        UpdatePublicZoneStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.updatePublicZoneStatus);
    }

    /**
     * 设置单个公网Zone状态，支持暂停、启用Zone
     *
     * 设置单个公网Zone状态，支持暂停、启用Zone
     * 
     * 详细说明请参考华为云API Explorer。
     * Please refer to Huawei cloud API Explorer for details.
     *
     * @param UpdatePublicZoneStatusRequest 请求对象
     * @return AsyncInvoker<UpdatePublicZoneStatusRequest, UpdatePublicZoneStatusResponse>
     */
    public AsyncInvoker<UpdatePublicZoneStatusRequest, UpdatePublicZoneStatusResponse> updatePublicZoneStatusAsyncInvoker(
        UpdatePublicZoneStatusRequest request) {
        return new AsyncInvoker<UpdatePublicZoneStatusRequest, UpdatePublicZoneStatusResponse>(request,
            DnsMeta.updatePublicZoneStatus, hcClient);
    }

}
