package com.huaweicloud.sdk.dns.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;
import com.huaweicloud.sdk.dns.v2.model.AssociateEndpointIpaddressRequest;
import com.huaweicloud.sdk.dns.v2.model.AssociateEndpointIpaddressResponse;
import com.huaweicloud.sdk.dns.v2.model.AssociateResolverRuleRouterRequest;
import com.huaweicloud.sdk.dns.v2.model.AssociateResolverRuleRouterResponse;
import com.huaweicloud.sdk.dns.v2.model.AssociateRouterRequest;
import com.huaweicloud.sdk.dns.v2.model.AssociateRouterResponse;
import com.huaweicloud.sdk.dns.v2.model.BatchCreateTagRequest;
import com.huaweicloud.sdk.dns.v2.model.BatchCreateTagResponse;
import com.huaweicloud.sdk.dns.v2.model.BatchDeletePtrRecordsRequest;
import com.huaweicloud.sdk.dns.v2.model.BatchDeletePtrRecordsResponse;
import com.huaweicloud.sdk.dns.v2.model.BatchDeleteRecordSetWithLineRequest;
import com.huaweicloud.sdk.dns.v2.model.BatchDeleteRecordSetWithLineResponse;
import com.huaweicloud.sdk.dns.v2.model.BatchDeleteRecordSetsRequest;
import com.huaweicloud.sdk.dns.v2.model.BatchDeleteRecordSetsResponse;
import com.huaweicloud.sdk.dns.v2.model.BatchDeleteZonesRequest;
import com.huaweicloud.sdk.dns.v2.model.BatchDeleteZonesResponse;
import com.huaweicloud.sdk.dns.v2.model.BatchSetRecordSetsStatusRequest;
import com.huaweicloud.sdk.dns.v2.model.BatchSetRecordSetsStatusResponse;
import com.huaweicloud.sdk.dns.v2.model.BatchSetZonesStatusRequest;
import com.huaweicloud.sdk.dns.v2.model.BatchSetZonesStatusResponse;
import com.huaweicloud.sdk.dns.v2.model.BatchUpdateRecordSetWithLineRequest;
import com.huaweicloud.sdk.dns.v2.model.BatchUpdateRecordSetWithLineResponse;
import com.huaweicloud.sdk.dns.v2.model.CreateCustomLineRequest;
import com.huaweicloud.sdk.dns.v2.model.CreateCustomLineResponse;
import com.huaweicloud.sdk.dns.v2.model.CreateEipRecordSetRequest;
import com.huaweicloud.sdk.dns.v2.model.CreateEipRecordSetResponse;
import com.huaweicloud.sdk.dns.v2.model.CreateEndpointRequest;
import com.huaweicloud.sdk.dns.v2.model.CreateEndpointResponse;
import com.huaweicloud.sdk.dns.v2.model.CreateLineGroupRequest;
import com.huaweicloud.sdk.dns.v2.model.CreateLineGroupResponse;
import com.huaweicloud.sdk.dns.v2.model.CreatePrivateZoneRequest;
import com.huaweicloud.sdk.dns.v2.model.CreatePrivateZoneResponse;
import com.huaweicloud.sdk.dns.v2.model.CreatePtrRequest;
import com.huaweicloud.sdk.dns.v2.model.CreatePtrResponse;
import com.huaweicloud.sdk.dns.v2.model.CreatePublicZoneRequest;
import com.huaweicloud.sdk.dns.v2.model.CreatePublicZoneResponse;
import com.huaweicloud.sdk.dns.v2.model.CreateRecordSetRequest;
import com.huaweicloud.sdk.dns.v2.model.CreateRecordSetResponse;
import com.huaweicloud.sdk.dns.v2.model.CreateRecordSetWithBatchLinesRequest;
import com.huaweicloud.sdk.dns.v2.model.CreateRecordSetWithBatchLinesResponse;
import com.huaweicloud.sdk.dns.v2.model.CreateRecordSetWithLineRequest;
import com.huaweicloud.sdk.dns.v2.model.CreateRecordSetWithLineResponse;
import com.huaweicloud.sdk.dns.v2.model.CreateResolverRuleRequest;
import com.huaweicloud.sdk.dns.v2.model.CreateResolverRuleResponse;
import com.huaweicloud.sdk.dns.v2.model.CreateTagRequest;
import com.huaweicloud.sdk.dns.v2.model.CreateTagResponse;
import com.huaweicloud.sdk.dns.v2.model.DeleteCustomLineRequest;
import com.huaweicloud.sdk.dns.v2.model.DeleteCustomLineResponse;
import com.huaweicloud.sdk.dns.v2.model.DeleteEndpointRequest;
import com.huaweicloud.sdk.dns.v2.model.DeleteEndpointResponse;
import com.huaweicloud.sdk.dns.v2.model.DeleteLineGroupRequest;
import com.huaweicloud.sdk.dns.v2.model.DeleteLineGroupResponse;
import com.huaweicloud.sdk.dns.v2.model.DeletePrivateZoneRequest;
import com.huaweicloud.sdk.dns.v2.model.DeletePrivateZoneResponse;
import com.huaweicloud.sdk.dns.v2.model.DeletePtrRequest;
import com.huaweicloud.sdk.dns.v2.model.DeletePtrResponse;
import com.huaweicloud.sdk.dns.v2.model.DeletePublicZoneRequest;
import com.huaweicloud.sdk.dns.v2.model.DeletePublicZoneResponse;
import com.huaweicloud.sdk.dns.v2.model.DeleteRecordSetRequest;
import com.huaweicloud.sdk.dns.v2.model.DeleteRecordSetResponse;
import com.huaweicloud.sdk.dns.v2.model.DeleteRecordSetsRequest;
import com.huaweicloud.sdk.dns.v2.model.DeleteRecordSetsResponse;
import com.huaweicloud.sdk.dns.v2.model.DeleteResolverRuleRequest;
import com.huaweicloud.sdk.dns.v2.model.DeleteResolverRuleResponse;
import com.huaweicloud.sdk.dns.v2.model.DeleteTagRequest;
import com.huaweicloud.sdk.dns.v2.model.DeleteTagResponse;
import com.huaweicloud.sdk.dns.v2.model.DisableDnssecConfigRequest;
import com.huaweicloud.sdk.dns.v2.model.DisableDnssecConfigResponse;
import com.huaweicloud.sdk.dns.v2.model.DisassociateEndpointIpaddressRequest;
import com.huaweicloud.sdk.dns.v2.model.DisassociateEndpointIpaddressResponse;
import com.huaweicloud.sdk.dns.v2.model.DisassociateResolverRuleRouterRequest;
import com.huaweicloud.sdk.dns.v2.model.DisassociateResolverRuleRouterResponse;
import com.huaweicloud.sdk.dns.v2.model.DisassociateRouterRequest;
import com.huaweicloud.sdk.dns.v2.model.DisassociateRouterResponse;
import com.huaweicloud.sdk.dns.v2.model.EnableDnssecConfigRequest;
import com.huaweicloud.sdk.dns.v2.model.EnableDnssecConfigResponse;
import com.huaweicloud.sdk.dns.v2.model.ListApiVersionsRequest;
import com.huaweicloud.sdk.dns.v2.model.ListApiVersionsResponse;
import com.huaweicloud.sdk.dns.v2.model.ListCustomLineRequest;
import com.huaweicloud.sdk.dns.v2.model.ListCustomLineResponse;
import com.huaweicloud.sdk.dns.v2.model.ListEndpointIpaddressesRequest;
import com.huaweicloud.sdk.dns.v2.model.ListEndpointIpaddressesResponse;
import com.huaweicloud.sdk.dns.v2.model.ListEndpointVpcsRequest;
import com.huaweicloud.sdk.dns.v2.model.ListEndpointVpcsResponse;
import com.huaweicloud.sdk.dns.v2.model.ListEndpointsRequest;
import com.huaweicloud.sdk.dns.v2.model.ListEndpointsResponse;
import com.huaweicloud.sdk.dns.v2.model.ListLineGroupsRequest;
import com.huaweicloud.sdk.dns.v2.model.ListLineGroupsResponse;
import com.huaweicloud.sdk.dns.v2.model.ListNameServersRequest;
import com.huaweicloud.sdk.dns.v2.model.ListNameServersResponse;
import com.huaweicloud.sdk.dns.v2.model.ListPrivateZonesRequest;
import com.huaweicloud.sdk.dns.v2.model.ListPrivateZonesResponse;
import com.huaweicloud.sdk.dns.v2.model.ListPtrRecordsRequest;
import com.huaweicloud.sdk.dns.v2.model.ListPtrRecordsResponse;
import com.huaweicloud.sdk.dns.v2.model.ListPtrsRequest;
import com.huaweicloud.sdk.dns.v2.model.ListPtrsResponse;
import com.huaweicloud.sdk.dns.v2.model.ListPublicZoneLinesRequest;
import com.huaweicloud.sdk.dns.v2.model.ListPublicZoneLinesResponse;
import com.huaweicloud.sdk.dns.v2.model.ListPublicZonesRequest;
import com.huaweicloud.sdk.dns.v2.model.ListPublicZonesResponse;
import com.huaweicloud.sdk.dns.v2.model.ListRecordSetsByZoneRequest;
import com.huaweicloud.sdk.dns.v2.model.ListRecordSetsByZoneResponse;
import com.huaweicloud.sdk.dns.v2.model.ListRecordSetsRequest;
import com.huaweicloud.sdk.dns.v2.model.ListRecordSetsResponse;
import com.huaweicloud.sdk.dns.v2.model.ListRecordSetsWithLineRequest;
import com.huaweicloud.sdk.dns.v2.model.ListRecordSetsWithLineResponse;
import com.huaweicloud.sdk.dns.v2.model.ListResolverRulesRequest;
import com.huaweicloud.sdk.dns.v2.model.ListResolverRulesResponse;
import com.huaweicloud.sdk.dns.v2.model.ListTagRequest;
import com.huaweicloud.sdk.dns.v2.model.ListTagResponse;
import com.huaweicloud.sdk.dns.v2.model.ListTagsRequest;
import com.huaweicloud.sdk.dns.v2.model.ListTagsResponse;
import com.huaweicloud.sdk.dns.v2.model.RestorePtrRecordRequest;
import com.huaweicloud.sdk.dns.v2.model.RestorePtrRecordResponse;
import com.huaweicloud.sdk.dns.v2.model.SetPrivateZoneProxyPatternRequest;
import com.huaweicloud.sdk.dns.v2.model.SetPrivateZoneProxyPatternResponse;
import com.huaweicloud.sdk.dns.v2.model.SetRecordSetsStatusRequest;
import com.huaweicloud.sdk.dns.v2.model.SetRecordSetsStatusResponse;
import com.huaweicloud.sdk.dns.v2.model.ShowApiInfoRequest;
import com.huaweicloud.sdk.dns.v2.model.ShowApiInfoResponse;
import com.huaweicloud.sdk.dns.v2.model.ShowDnssecConfigRequest;
import com.huaweicloud.sdk.dns.v2.model.ShowDnssecConfigResponse;
import com.huaweicloud.sdk.dns.v2.model.ShowDomainQuotaRequest;
import com.huaweicloud.sdk.dns.v2.model.ShowDomainQuotaResponse;
import com.huaweicloud.sdk.dns.v2.model.ShowEndpointRequest;
import com.huaweicloud.sdk.dns.v2.model.ShowEndpointResponse;
import com.huaweicloud.sdk.dns.v2.model.ShowLineGroupRequest;
import com.huaweicloud.sdk.dns.v2.model.ShowLineGroupResponse;
import com.huaweicloud.sdk.dns.v2.model.ShowPrivateZoneNameServerRequest;
import com.huaweicloud.sdk.dns.v2.model.ShowPrivateZoneNameServerResponse;
import com.huaweicloud.sdk.dns.v2.model.ShowPrivateZoneRequest;
import com.huaweicloud.sdk.dns.v2.model.ShowPrivateZoneResponse;
import com.huaweicloud.sdk.dns.v2.model.ShowPtrRecordSetRequest;
import com.huaweicloud.sdk.dns.v2.model.ShowPtrRecordSetResponse;
import com.huaweicloud.sdk.dns.v2.model.ShowPtrRequest;
import com.huaweicloud.sdk.dns.v2.model.ShowPtrResponse;
import com.huaweicloud.sdk.dns.v2.model.ShowPublicZoneNameServerRequest;
import com.huaweicloud.sdk.dns.v2.model.ShowPublicZoneNameServerResponse;
import com.huaweicloud.sdk.dns.v2.model.ShowPublicZoneRequest;
import com.huaweicloud.sdk.dns.v2.model.ShowPublicZoneResponse;
import com.huaweicloud.sdk.dns.v2.model.ShowRecordSetByZoneRequest;
import com.huaweicloud.sdk.dns.v2.model.ShowRecordSetByZoneResponse;
import com.huaweicloud.sdk.dns.v2.model.ShowRecordSetRequest;
import com.huaweicloud.sdk.dns.v2.model.ShowRecordSetResponse;
import com.huaweicloud.sdk.dns.v2.model.ShowRecordSetWithLineRequest;
import com.huaweicloud.sdk.dns.v2.model.ShowRecordSetWithLineResponse;
import com.huaweicloud.sdk.dns.v2.model.ShowResolverRuleRequest;
import com.huaweicloud.sdk.dns.v2.model.ShowResolverRuleResponse;
import com.huaweicloud.sdk.dns.v2.model.ShowResourceTagRequest;
import com.huaweicloud.sdk.dns.v2.model.ShowResourceTagResponse;
import com.huaweicloud.sdk.dns.v2.model.UpdateCustomLineRequest;
import com.huaweicloud.sdk.dns.v2.model.UpdateCustomLineResponse;
import com.huaweicloud.sdk.dns.v2.model.UpdateEndpointRequest;
import com.huaweicloud.sdk.dns.v2.model.UpdateEndpointResponse;
import com.huaweicloud.sdk.dns.v2.model.UpdateLineGroupsRequest;
import com.huaweicloud.sdk.dns.v2.model.UpdateLineGroupsResponse;
import com.huaweicloud.sdk.dns.v2.model.UpdatePrivateZoneRequest;
import com.huaweicloud.sdk.dns.v2.model.UpdatePrivateZoneResponse;
import com.huaweicloud.sdk.dns.v2.model.UpdatePrivateZoneStatusRequest;
import com.huaweicloud.sdk.dns.v2.model.UpdatePrivateZoneStatusResponse;
import com.huaweicloud.sdk.dns.v2.model.UpdatePtrRecordRequest;
import com.huaweicloud.sdk.dns.v2.model.UpdatePtrRecordResponse;
import com.huaweicloud.sdk.dns.v2.model.UpdatePtrRequest;
import com.huaweicloud.sdk.dns.v2.model.UpdatePtrResponse;
import com.huaweicloud.sdk.dns.v2.model.UpdatePublicZoneRequest;
import com.huaweicloud.sdk.dns.v2.model.UpdatePublicZoneResponse;
import com.huaweicloud.sdk.dns.v2.model.UpdatePublicZoneStatusRequest;
import com.huaweicloud.sdk.dns.v2.model.UpdatePublicZoneStatusResponse;
import com.huaweicloud.sdk.dns.v2.model.UpdateRecordSetRequest;
import com.huaweicloud.sdk.dns.v2.model.UpdateRecordSetResponse;
import com.huaweicloud.sdk.dns.v2.model.UpdateRecordSetsRequest;
import com.huaweicloud.sdk.dns.v2.model.UpdateRecordSetsResponse;
import com.huaweicloud.sdk.dns.v2.model.UpdateResolverRuleRequest;
import com.huaweicloud.sdk.dns.v2.model.UpdateResolverRuleResponse;

public class DnsClient {

    protected HcClient hcClient;

    public DnsClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DnsClient> newBuilder() {
        ClientBuilder<DnsClient> clientBuilder = new ClientBuilder<>(DnsClient::new);
        return clientBuilder;
    }

    /**
     * 终端节点绑定IP地址
     *
     * 终端节点绑定IP地址。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateEndpointIpaddressRequest 请求对象
     * @return AssociateEndpointIpaddressResponse
     */
    public AssociateEndpointIpaddressResponse associateEndpointIpaddress(AssociateEndpointIpaddressRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.associateEndpointIpaddress);
    }

    /**
     * 终端节点绑定IP地址
     *
     * 终端节点绑定IP地址。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateEndpointIpaddressRequest 请求对象
     * @return SyncInvoker<AssociateEndpointIpaddressRequest, AssociateEndpointIpaddressResponse>
     */
    public SyncInvoker<AssociateEndpointIpaddressRequest, AssociateEndpointIpaddressResponse> associateEndpointIpaddressInvoker(
        AssociateEndpointIpaddressRequest request) {
        return new SyncInvoker<>(request, DnsMeta.associateEndpointIpaddress, hcClient);
    }

    /**
     * 解析器转发规则关联VPC
     *
     * 解析器转发规则关联VPC。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateResolverRuleRouterRequest 请求对象
     * @return AssociateResolverRuleRouterResponse
     */
    public AssociateResolverRuleRouterResponse associateResolverRuleRouter(AssociateResolverRuleRouterRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.associateResolverRuleRouter);
    }

    /**
     * 解析器转发规则关联VPC
     *
     * 解析器转发规则关联VPC。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateResolverRuleRouterRequest 请求对象
     * @return SyncInvoker<AssociateResolverRuleRouterRequest, AssociateResolverRuleRouterResponse>
     */
    public SyncInvoker<AssociateResolverRuleRouterRequest, AssociateResolverRuleRouterResponse> associateResolverRuleRouterInvoker(
        AssociateResolverRuleRouterRequest request) {
        return new SyncInvoker<>(request, DnsMeta.associateResolverRuleRouter, hcClient);
    }

    /**
     * 在内网域名上关联VPC
     *
     * 当您的内网域名创建完成后，可以通过调用此接口为内网域名关联新的VPC。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateRouterRequest 请求对象
     * @return AssociateRouterResponse
     */
    public AssociateRouterResponse associateRouter(AssociateRouterRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.associateRouter);
    }

    /**
     * 在内网域名上关联VPC
     *
     * 当您的内网域名创建完成后，可以通过调用此接口为内网域名关联新的VPC。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateRouterRequest 请求对象
     * @return SyncInvoker<AssociateRouterRequest, AssociateRouterResponse>
     */
    public SyncInvoker<AssociateRouterRequest, AssociateRouterResponse> associateRouterInvoker(
        AssociateRouterRequest request) {
        return new SyncInvoker<>(request, DnsMeta.associateRouter, hcClient);
    }

    /**
     * 为指定实例批量添加或删除标签
     *
     * 为指定实例批量添加或删除标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateTagRequest 请求对象
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
     * @param request BatchCreateTagRequest 请求对象
     * @return SyncInvoker<BatchCreateTagRequest, BatchCreateTagResponse>
     */
    public SyncInvoker<BatchCreateTagRequest, BatchCreateTagResponse> batchCreateTagInvoker(
        BatchCreateTagRequest request) {
        return new SyncInvoker<>(request, DnsMeta.batchCreateTag, hcClient);
    }

    /**
     * 批量删除反向解析
     *
     * 批量删除反向解析。本接口为原子操作，所有记录应全部删除成功或全部失败。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeletePtrRecordsRequest 请求对象
     * @return BatchDeletePtrRecordsResponse
     */
    public BatchDeletePtrRecordsResponse batchDeletePtrRecords(BatchDeletePtrRecordsRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.batchDeletePtrRecords);
    }

    /**
     * 批量删除反向解析
     *
     * 批量删除反向解析。本接口为原子操作，所有记录应全部删除成功或全部失败。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeletePtrRecordsRequest 请求对象
     * @return SyncInvoker<BatchDeletePtrRecordsRequest, BatchDeletePtrRecordsResponse>
     */
    public SyncInvoker<BatchDeletePtrRecordsRequest, BatchDeletePtrRecordsResponse> batchDeletePtrRecordsInvoker(
        BatchDeletePtrRecordsRequest request) {
        return new SyncInvoker<>(request, DnsMeta.batchDeletePtrRecords, hcClient);
    }

    /**
     * 批量删除域名下的记录集
     *
     * 批量删除域名下的记录集，当删除的资源不存在时，则默认删除成功。
     * 响应结果中只包含本次实际删除的资源。
     * 支持公网域名和内网域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteRecordSetWithLineRequest 请求对象
     * @return BatchDeleteRecordSetWithLineResponse
     */
    public BatchDeleteRecordSetWithLineResponse batchDeleteRecordSetWithLine(
        BatchDeleteRecordSetWithLineRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.batchDeleteRecordSetWithLine);
    }

    /**
     * 批量删除域名下的记录集
     *
     * 批量删除域名下的记录集，当删除的资源不存在时，则默认删除成功。
     * 响应结果中只包含本次实际删除的资源。
     * 支持公网域名和内网域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteRecordSetWithLineRequest 请求对象
     * @return SyncInvoker<BatchDeleteRecordSetWithLineRequest, BatchDeleteRecordSetWithLineResponse>
     */
    public SyncInvoker<BatchDeleteRecordSetWithLineRequest, BatchDeleteRecordSetWithLineResponse> batchDeleteRecordSetWithLineInvoker(
        BatchDeleteRecordSetWithLineRequest request) {
        return new SyncInvoker<>(request, DnsMeta.batchDeleteRecordSetWithLine, hcClient);
    }

    /**
     * 批量删除记录集
     *
     * 批量删除记录集。
     * 响应结果中只包含本次实际删除的记录集。
     * 支持批量删除公网域名和内网域名的记录集。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteRecordSetsRequest 请求对象
     * @return BatchDeleteRecordSetsResponse
     */
    public BatchDeleteRecordSetsResponse batchDeleteRecordSets(BatchDeleteRecordSetsRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.batchDeleteRecordSets);
    }

    /**
     * 批量删除记录集
     *
     * 批量删除记录集。
     * 响应结果中只包含本次实际删除的记录集。
     * 支持批量删除公网域名和内网域名的记录集。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteRecordSetsRequest 请求对象
     * @return SyncInvoker<BatchDeleteRecordSetsRequest, BatchDeleteRecordSetsResponse>
     */
    public SyncInvoker<BatchDeleteRecordSetsRequest, BatchDeleteRecordSetsResponse> batchDeleteRecordSetsInvoker(
        BatchDeleteRecordSetsRequest request) {
        return new SyncInvoker<>(request, DnsMeta.batchDeleteRecordSets, hcClient);
    }

    /**
     * 批量删除域名
     *
     * 批量删除域名。
     * 本接口为原子操作，所有记录应全部删除成功或全部失败。
     * 支持公网域名、内网域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteZonesRequest 请求对象
     * @return BatchDeleteZonesResponse
     */
    public BatchDeleteZonesResponse batchDeleteZones(BatchDeleteZonesRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.batchDeleteZones);
    }

    /**
     * 批量删除域名
     *
     * 批量删除域名。
     * 本接口为原子操作，所有记录应全部删除成功或全部失败。
     * 支持公网域名、内网域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteZonesRequest 请求对象
     * @return SyncInvoker<BatchDeleteZonesRequest, BatchDeleteZonesResponse>
     */
    public SyncInvoker<BatchDeleteZonesRequest, BatchDeleteZonesResponse> batchDeleteZonesInvoker(
        BatchDeleteZonesRequest request) {
        return new SyncInvoker<>(request, DnsMeta.batchDeleteZones, hcClient);
    }

    /**
     * 批量设置记录集状态
     *
     * 批量设置记录集状态。
     * 响应结果中只包含本次实际更新的记录集。
     * 支持公网域名和内网域名的记录集。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchSetRecordSetsStatusRequest 请求对象
     * @return BatchSetRecordSetsStatusResponse
     */
    public BatchSetRecordSetsStatusResponse batchSetRecordSetsStatus(BatchSetRecordSetsStatusRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.batchSetRecordSetsStatus);
    }

    /**
     * 批量设置记录集状态
     *
     * 批量设置记录集状态。
     * 响应结果中只包含本次实际更新的记录集。
     * 支持公网域名和内网域名的记录集。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchSetRecordSetsStatusRequest 请求对象
     * @return SyncInvoker<BatchSetRecordSetsStatusRequest, BatchSetRecordSetsStatusResponse>
     */
    public SyncInvoker<BatchSetRecordSetsStatusRequest, BatchSetRecordSetsStatusResponse> batchSetRecordSetsStatusInvoker(
        BatchSetRecordSetsStatusRequest request) {
        return new SyncInvoker<>(request, DnsMeta.batchSetRecordSetsStatus, hcClient);
    }

    /**
     * 批量设置域名状态
     *
     * 批量设置域名状态。
     * 响应结果中只包含本次实际更新的域名。
     * 支持公网域名、内网域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchSetZonesStatusRequest 请求对象
     * @return BatchSetZonesStatusResponse
     */
    public BatchSetZonesStatusResponse batchSetZonesStatus(BatchSetZonesStatusRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.batchSetZonesStatus);
    }

    /**
     * 批量设置域名状态
     *
     * 批量设置域名状态。
     * 响应结果中只包含本次实际更新的域名。
     * 支持公网域名、内网域名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchSetZonesStatusRequest 请求对象
     * @return SyncInvoker<BatchSetZonesStatusRequest, BatchSetZonesStatusResponse>
     */
    public SyncInvoker<BatchSetZonesStatusRequest, BatchSetZonesStatusResponse> batchSetZonesStatusInvoker(
        BatchSetZonesStatusRequest request) {
        return new SyncInvoker<>(request, DnsMeta.batchSetZonesStatus, hcClient);
    }

    /**
     * 批量修改记录集
     *
     * 批量修改记录集。属于原子性操作，请求记录集将全部完成修改，或不做任何修改。
     * 仅公网域名支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateRecordSetWithLineRequest 请求对象
     * @return BatchUpdateRecordSetWithLineResponse
     */
    public BatchUpdateRecordSetWithLineResponse batchUpdateRecordSetWithLine(
        BatchUpdateRecordSetWithLineRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.batchUpdateRecordSetWithLine);
    }

    /**
     * 批量修改记录集
     *
     * 批量修改记录集。属于原子性操作，请求记录集将全部完成修改，或不做任何修改。
     * 仅公网域名支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateRecordSetWithLineRequest 请求对象
     * @return SyncInvoker<BatchUpdateRecordSetWithLineRequest, BatchUpdateRecordSetWithLineResponse>
     */
    public SyncInvoker<BatchUpdateRecordSetWithLineRequest, BatchUpdateRecordSetWithLineResponse> batchUpdateRecordSetWithLineInvoker(
        BatchUpdateRecordSetWithLineRequest request) {
        return new SyncInvoker<>(request, DnsMeta.batchUpdateRecordSetWithLine, hcClient);
    }

    /**
     * 创建自定义线路
     *
     * 创建自定义线路。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCustomLineRequest 请求对象
     * @return CreateCustomLineResponse
     */
    public CreateCustomLineResponse createCustomLine(CreateCustomLineRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.createCustomLine);
    }

    /**
     * 创建自定义线路
     *
     * 创建自定义线路。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCustomLineRequest 请求对象
     * @return SyncInvoker<CreateCustomLineRequest, CreateCustomLineResponse>
     */
    public SyncInvoker<CreateCustomLineRequest, CreateCustomLineResponse> createCustomLineInvoker(
        CreateCustomLineRequest request) {
        return new SyncInvoker<>(request, DnsMeta.createCustomLine, hcClient);
    }

    /**
     * 创建终端节点
     *
     * 创建终端节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEndpointRequest 请求对象
     * @return CreateEndpointResponse
     */
    public CreateEndpointResponse createEndpoint(CreateEndpointRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.createEndpoint);
    }

    /**
     * 创建终端节点
     *
     * 创建终端节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEndpointRequest 请求对象
     * @return SyncInvoker<CreateEndpointRequest, CreateEndpointResponse>
     */
    public SyncInvoker<CreateEndpointRequest, CreateEndpointResponse> createEndpointInvoker(
        CreateEndpointRequest request) {
        return new SyncInvoker<>(request, DnsMeta.createEndpoint, hcClient);
    }

    /**
     * 创建线路分组
     *
     * 创建线路分组。该接口部分区域未上线，如需使用请提交工单申请开通。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLineGroupRequest 请求对象
     * @return CreateLineGroupResponse
     */
    public CreateLineGroupResponse createLineGroup(CreateLineGroupRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.createLineGroup);
    }

    /**
     * 创建线路分组
     *
     * 创建线路分组。该接口部分区域未上线，如需使用请提交工单申请开通。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLineGroupRequest 请求对象
     * @return SyncInvoker<CreateLineGroupRequest, CreateLineGroupResponse>
     */
    public SyncInvoker<CreateLineGroupRequest, CreateLineGroupResponse> createLineGroupInvoker(
        CreateLineGroupRequest request) {
        return new SyncInvoker<>(request, DnsMeta.createLineGroup, hcClient);
    }

    /**
     * 创建内网域名
     *
     * 内网域名是指在VPC中生效的域名，内网域名创建后，用户可以将其与私网IP地址相关联，为云服务提供VPC内的内网域名解析服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePrivateZoneRequest 请求对象
     * @return CreatePrivateZoneResponse
     */
    public CreatePrivateZoneResponse createPrivateZone(CreatePrivateZoneRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.createPrivateZone);
    }

    /**
     * 创建内网域名
     *
     * 内网域名是指在VPC中生效的域名，内网域名创建后，用户可以将其与私网IP地址相关联，为云服务提供VPC内的内网域名解析服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePrivateZoneRequest 请求对象
     * @return SyncInvoker<CreatePrivateZoneRequest, CreatePrivateZoneResponse>
     */
    public SyncInvoker<CreatePrivateZoneRequest, CreatePrivateZoneResponse> createPrivateZoneInvoker(
        CreatePrivateZoneRequest request) {
        return new SyncInvoker<>(request, DnsMeta.createPrivateZone, hcClient);
    }

    /**
     * 创建公网域名
     *
     * 您在使用华为云云解析服务为自己注册的域名配置DNS解析之前，需要先将域名添加至云解析服务控制台。
     * 一般情况下，通过华为云[域名注册服务](https://support.huaweicloud.com/domain/index.html)注册的域名无需添加，系统将在域名注册完成后自动添加。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePublicZoneRequest 请求对象
     * @return CreatePublicZoneResponse
     */
    public CreatePublicZoneResponse createPublicZone(CreatePublicZoneRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.createPublicZone);
    }

    /**
     * 创建公网域名
     *
     * 您在使用华为云云解析服务为自己注册的域名配置DNS解析之前，需要先将域名添加至云解析服务控制台。
     * 一般情况下，通过华为云[域名注册服务](https://support.huaweicloud.com/domain/index.html)注册的域名无需添加，系统将在域名注册完成后自动添加。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePublicZoneRequest 请求对象
     * @return SyncInvoker<CreatePublicZoneRequest, CreatePublicZoneResponse>
     */
    public SyncInvoker<CreatePublicZoneRequest, CreatePublicZoneResponse> createPublicZoneInvoker(
        CreatePublicZoneRequest request) {
        return new SyncInvoker<>(request, DnsMeta.createPublicZone, hcClient);
    }

    /**
     * 批量线路创建记录集
     *
     * 批量线路创建记录集。属于原子性操作，如果存在一个参数校验不通过，则创建失败。仅公网域名支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRecordSetWithBatchLinesRequest 请求对象
     * @return CreateRecordSetWithBatchLinesResponse
     */
    public CreateRecordSetWithBatchLinesResponse createRecordSetWithBatchLines(
        CreateRecordSetWithBatchLinesRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.createRecordSetWithBatchLines);
    }

    /**
     * 批量线路创建记录集
     *
     * 批量线路创建记录集。属于原子性操作，如果存在一个参数校验不通过，则创建失败。仅公网域名支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRecordSetWithBatchLinesRequest 请求对象
     * @return SyncInvoker<CreateRecordSetWithBatchLinesRequest, CreateRecordSetWithBatchLinesResponse>
     */
    public SyncInvoker<CreateRecordSetWithBatchLinesRequest, CreateRecordSetWithBatchLinesResponse> createRecordSetWithBatchLinesInvoker(
        CreateRecordSetWithBatchLinesRequest request) {
        return new SyncInvoker<>(request, DnsMeta.createRecordSetWithBatchLines, hcClient);
    }

    /**
     * 创建解析器转发规则
     *
     * 创建解析器转发规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateResolverRuleRequest 请求对象
     * @return CreateResolverRuleResponse
     */
    public CreateResolverRuleResponse createResolverRule(CreateResolverRuleRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.createResolverRule);
    }

    /**
     * 创建解析器转发规则
     *
     * 创建解析器转发规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateResolverRuleRequest 请求对象
     * @return SyncInvoker<CreateResolverRuleRequest, CreateResolverRuleResponse>
     */
    public SyncInvoker<CreateResolverRuleRequest, CreateResolverRuleResponse> createResolverRuleInvoker(
        CreateResolverRuleRequest request) {
        return new SyncInvoker<>(request, DnsMeta.createResolverRule, hcClient);
    }

    /**
     * 为指定实例添加标签
     *
     * 为指定实例添加标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTagRequest 请求对象
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
     * @param request CreateTagRequest 请求对象
     * @return SyncInvoker<CreateTagRequest, CreateTagResponse>
     */
    public SyncInvoker<CreateTagRequest, CreateTagResponse> createTagInvoker(CreateTagRequest request) {
        return new SyncInvoker<>(request, DnsMeta.createTag, hcClient);
    }

    /**
     * 删除自定义线路
     *
     * 删除自定义线路。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCustomLineRequest 请求对象
     * @return DeleteCustomLineResponse
     */
    public DeleteCustomLineResponse deleteCustomLine(DeleteCustomLineRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.deleteCustomLine);
    }

    /**
     * 删除自定义线路
     *
     * 删除自定义线路。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCustomLineRequest 请求对象
     * @return SyncInvoker<DeleteCustomLineRequest, DeleteCustomLineResponse>
     */
    public SyncInvoker<DeleteCustomLineRequest, DeleteCustomLineResponse> deleteCustomLineInvoker(
        DeleteCustomLineRequest request) {
        return new SyncInvoker<>(request, DnsMeta.deleteCustomLine, hcClient);
    }

    /**
     * 删除终端节点
     *
     * 删除终端节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEndpointRequest 请求对象
     * @return DeleteEndpointResponse
     */
    public DeleteEndpointResponse deleteEndpoint(DeleteEndpointRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.deleteEndpoint);
    }

    /**
     * 删除终端节点
     *
     * 删除终端节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEndpointRequest 请求对象
     * @return SyncInvoker<DeleteEndpointRequest, DeleteEndpointResponse>
     */
    public SyncInvoker<DeleteEndpointRequest, DeleteEndpointResponse> deleteEndpointInvoker(
        DeleteEndpointRequest request) {
        return new SyncInvoker<>(request, DnsMeta.deleteEndpoint, hcClient);
    }

    /**
     * 删除线路分组
     *
     * 删除线路分组。该接口部分区域未上线，如需使用请提交工单申请开通。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLineGroupRequest 请求对象
     * @return DeleteLineGroupResponse
     */
    public DeleteLineGroupResponse deleteLineGroup(DeleteLineGroupRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.deleteLineGroup);
    }

    /**
     * 删除线路分组
     *
     * 删除线路分组。该接口部分区域未上线，如需使用请提交工单申请开通。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLineGroupRequest 请求对象
     * @return SyncInvoker<DeleteLineGroupRequest, DeleteLineGroupResponse>
     */
    public SyncInvoker<DeleteLineGroupRequest, DeleteLineGroupResponse> deleteLineGroupInvoker(
        DeleteLineGroupRequest request) {
        return new SyncInvoker<>(request, DnsMeta.deleteLineGroup, hcClient);
    }

    /**
     * 删除内网域名
     *
     * 当您的内网域名不再使用时，您可以通过调用此接口将其删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePrivateZoneRequest 请求对象
     * @return DeletePrivateZoneResponse
     */
    public DeletePrivateZoneResponse deletePrivateZone(DeletePrivateZoneRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.deletePrivateZone);
    }

    /**
     * 删除内网域名
     *
     * 当您的内网域名不再使用时，您可以通过调用此接口将其删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePrivateZoneRequest 请求对象
     * @return SyncInvoker<DeletePrivateZoneRequest, DeletePrivateZoneResponse>
     */
    public SyncInvoker<DeletePrivateZoneRequest, DeletePrivateZoneResponse> deletePrivateZoneInvoker(
        DeletePrivateZoneRequest request) {
        return new SyncInvoker<>(request, DnsMeta.deletePrivateZone, hcClient);
    }

    /**
     * 删除公网域名
     *
     * 当您的公网域名不再使用时，您可以通过调用此接口将其删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePublicZoneRequest 请求对象
     * @return DeletePublicZoneResponse
     */
    public DeletePublicZoneResponse deletePublicZone(DeletePublicZoneRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.deletePublicZone);
    }

    /**
     * 删除公网域名
     *
     * 当您的公网域名不再使用时，您可以通过调用此接口将其删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePublicZoneRequest 请求对象
     * @return SyncInvoker<DeletePublicZoneRequest, DeletePublicZoneResponse>
     */
    public SyncInvoker<DeletePublicZoneRequest, DeletePublicZoneResponse> deletePublicZoneInvoker(
        DeletePublicZoneRequest request) {
        return new SyncInvoker<>(request, DnsMeta.deletePublicZone, hcClient);
    }

    /**
     * 删除解析器转发规则
     *
     * 删除解析器转发规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteResolverRuleRequest 请求对象
     * @return DeleteResolverRuleResponse
     */
    public DeleteResolverRuleResponse deleteResolverRule(DeleteResolverRuleRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.deleteResolverRule);
    }

    /**
     * 删除解析器转发规则
     *
     * 删除解析器转发规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteResolverRuleRequest 请求对象
     * @return SyncInvoker<DeleteResolverRuleRequest, DeleteResolverRuleResponse>
     */
    public SyncInvoker<DeleteResolverRuleRequest, DeleteResolverRuleResponse> deleteResolverRuleInvoker(
        DeleteResolverRuleRequest request) {
        return new SyncInvoker<>(request, DnsMeta.deleteResolverRule, hcClient);
    }

    /**
     * 删除资源标签
     *
     * 删除资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTagRequest 请求对象
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
     * @param request DeleteTagRequest 请求对象
     * @return SyncInvoker<DeleteTagRequest, DeleteTagResponse>
     */
    public SyncInvoker<DeleteTagRequest, DeleteTagResponse> deleteTagInvoker(DeleteTagRequest request) {
        return new SyncInvoker<>(request, DnsMeta.deleteTag, hcClient);
    }

    /**
     * 终端节点解绑IP地址
     *
     * 终端节点解绑IP地址。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateEndpointIpaddressRequest 请求对象
     * @return DisassociateEndpointIpaddressResponse
     */
    public DisassociateEndpointIpaddressResponse disassociateEndpointIpaddress(
        DisassociateEndpointIpaddressRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.disassociateEndpointIpaddress);
    }

    /**
     * 终端节点解绑IP地址
     *
     * 终端节点解绑IP地址。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateEndpointIpaddressRequest 请求对象
     * @return SyncInvoker<DisassociateEndpointIpaddressRequest, DisassociateEndpointIpaddressResponse>
     */
    public SyncInvoker<DisassociateEndpointIpaddressRequest, DisassociateEndpointIpaddressResponse> disassociateEndpointIpaddressInvoker(
        DisassociateEndpointIpaddressRequest request) {
        return new SyncInvoker<>(request, DnsMeta.disassociateEndpointIpaddress, hcClient);
    }

    /**
     * 解析器转发规则解关联VPC
     *
     * 解析器转发规则解关联VPC。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateResolverRuleRouterRequest 请求对象
     * @return DisassociateResolverRuleRouterResponse
     */
    public DisassociateResolverRuleRouterResponse disassociateResolverRuleRouter(
        DisassociateResolverRuleRouterRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.disassociateResolverRuleRouter);
    }

    /**
     * 解析器转发规则解关联VPC
     *
     * 解析器转发规则解关联VPC。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateResolverRuleRouterRequest 请求对象
     * @return SyncInvoker<DisassociateResolverRuleRouterRequest, DisassociateResolverRuleRouterResponse>
     */
    public SyncInvoker<DisassociateResolverRuleRouterRequest, DisassociateResolverRuleRouterResponse> disassociateResolverRuleRouterInvoker(
        DisassociateResolverRuleRouterRequest request) {
        return new SyncInvoker<>(request, DnsMeta.disassociateResolverRuleRouter, hcClient);
    }

    /**
     * 在内网域名上解关联VPC
     *
     * 当您的内网域名创建完成后，可以通过调用此接口为内网域名解除已关联的VPC。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateRouterRequest 请求对象
     * @return DisassociateRouterResponse
     */
    public DisassociateRouterResponse disassociateRouter(DisassociateRouterRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.disassociateRouter);
    }

    /**
     * 在内网域名上解关联VPC
     *
     * 当您的内网域名创建完成后，可以通过调用此接口为内网域名解除已关联的VPC。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateRouterRequest 请求对象
     * @return SyncInvoker<DisassociateRouterRequest, DisassociateRouterResponse>
     */
    public SyncInvoker<DisassociateRouterRequest, DisassociateRouterResponse> disassociateRouterInvoker(
        DisassociateRouterRequest request) {
        return new SyncInvoker<>(request, DnsMeta.disassociateRouter, hcClient);
    }

    /**
     * 查询API版本信息列表
     *
     * 查询云解析服务支持的所有API版本信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiVersionsRequest 请求对象
     * @return ListApiVersionsResponse
     */
    public ListApiVersionsResponse listApiVersions(ListApiVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.listApiVersions);
    }

    /**
     * 查询API版本信息列表
     *
     * 查询云解析服务支持的所有API版本信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiVersionsRequest 请求对象
     * @return SyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse>
     */
    public SyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse> listApiVersionsInvoker(
        ListApiVersionsRequest request) {
        return new SyncInvoker<>(request, DnsMeta.listApiVersions, hcClient);
    }

    /**
     * 查询自定义线路
     *
     * 查询自定义线路。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCustomLineRequest 请求对象
     * @return ListCustomLineResponse
     */
    public ListCustomLineResponse listCustomLine(ListCustomLineRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.listCustomLine);
    }

    /**
     * 查询自定义线路
     *
     * 查询自定义线路。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCustomLineRequest 请求对象
     * @return SyncInvoker<ListCustomLineRequest, ListCustomLineResponse>
     */
    public SyncInvoker<ListCustomLineRequest, ListCustomLineResponse> listCustomLineInvoker(
        ListCustomLineRequest request) {
        return new SyncInvoker<>(request, DnsMeta.listCustomLine, hcClient);
    }

    /**
     * 查询IP地址列表
     *
     * 查询终端节点下的IP地址列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEndpointIpaddressesRequest 请求对象
     * @return ListEndpointIpaddressesResponse
     */
    public ListEndpointIpaddressesResponse listEndpointIpaddresses(ListEndpointIpaddressesRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.listEndpointIpaddresses);
    }

    /**
     * 查询IP地址列表
     *
     * 查询终端节点下的IP地址列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEndpointIpaddressesRequest 请求对象
     * @return SyncInvoker<ListEndpointIpaddressesRequest, ListEndpointIpaddressesResponse>
     */
    public SyncInvoker<ListEndpointIpaddressesRequest, ListEndpointIpaddressesResponse> listEndpointIpaddressesInvoker(
        ListEndpointIpaddressesRequest request) {
        return new SyncInvoker<>(request, DnsMeta.listEndpointIpaddresses, hcClient);
    }

    /**
     * 查询终端节点VPC列表
     *
     * 查询终端节点VPC列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEndpointVpcsRequest 请求对象
     * @return ListEndpointVpcsResponse
     */
    public ListEndpointVpcsResponse listEndpointVpcs(ListEndpointVpcsRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.listEndpointVpcs);
    }

    /**
     * 查询终端节点VPC列表
     *
     * 查询终端节点VPC列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEndpointVpcsRequest 请求对象
     * @return SyncInvoker<ListEndpointVpcsRequest, ListEndpointVpcsResponse>
     */
    public SyncInvoker<ListEndpointVpcsRequest, ListEndpointVpcsResponse> listEndpointVpcsInvoker(
        ListEndpointVpcsRequest request) {
        return new SyncInvoker<>(request, DnsMeta.listEndpointVpcs, hcClient);
    }

    /**
     * 查询终端节点列表
     *
     * 查询终端节点列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEndpointsRequest 请求对象
     * @return ListEndpointsResponse
     */
    public ListEndpointsResponse listEndpoints(ListEndpointsRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.listEndpoints);
    }

    /**
     * 查询终端节点列表
     *
     * 查询终端节点列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEndpointsRequest 请求对象
     * @return SyncInvoker<ListEndpointsRequest, ListEndpointsResponse>
     */
    public SyncInvoker<ListEndpointsRequest, ListEndpointsResponse> listEndpointsInvoker(ListEndpointsRequest request) {
        return new SyncInvoker<>(request, DnsMeta.listEndpoints, hcClient);
    }

    /**
     * 查询线路分组列表
     *
     * 查询线路分组列表。该接口部分区域未上线，如需使用请提交工单申请开通。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLineGroupsRequest 请求对象
     * @return ListLineGroupsResponse
     */
    public ListLineGroupsResponse listLineGroups(ListLineGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.listLineGroups);
    }

    /**
     * 查询线路分组列表
     *
     * 查询线路分组列表。该接口部分区域未上线，如需使用请提交工单申请开通。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLineGroupsRequest 请求对象
     * @return SyncInvoker<ListLineGroupsRequest, ListLineGroupsResponse>
     */
    public SyncInvoker<ListLineGroupsRequest, ListLineGroupsResponse> listLineGroupsInvoker(
        ListLineGroupsRequest request) {
        return new SyncInvoker<>(request, DnsMeta.listLineGroups, hcClient);
    }

    /**
     * 查询名称服务器列表
     *
     * 查询名称服务器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNameServersRequest 请求对象
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
     * @param request ListNameServersRequest 请求对象
     * @return SyncInvoker<ListNameServersRequest, ListNameServersResponse>
     */
    public SyncInvoker<ListNameServersRequest, ListNameServersResponse> listNameServersInvoker(
        ListNameServersRequest request) {
        return new SyncInvoker<>(request, DnsMeta.listNameServers, hcClient);
    }

    /**
     * 查询内网域名列表
     *
     * 当您的内网域名创建成功后，您可以通过调用此接口查询单个内网域名信息，包括域名、ID、状态、记录集个数、企业项目、标签、TTL、创建时间、修改时间、描述等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPrivateZonesRequest 请求对象
     * @return ListPrivateZonesResponse
     */
    public ListPrivateZonesResponse listPrivateZones(ListPrivateZonesRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.listPrivateZones);
    }

    /**
     * 查询内网域名列表
     *
     * 当您的内网域名创建成功后，您可以通过调用此接口查询单个内网域名信息，包括域名、ID、状态、记录集个数、企业项目、标签、TTL、创建时间、修改时间、描述等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPrivateZonesRequest 请求对象
     * @return SyncInvoker<ListPrivateZonesRequest, ListPrivateZonesResponse>
     */
    public SyncInvoker<ListPrivateZonesRequest, ListPrivateZonesResponse> listPrivateZonesInvoker(
        ListPrivateZonesRequest request) {
        return new SyncInvoker<>(request, DnsMeta.listPrivateZones, hcClient);
    }

    /**
     * 查询公网域名列表
     *
     * 当您的公网域名创建成功后，您可以通过调用此接口查询所有公网域名信息，包括域名、ID、状态、记录集个数、企业项目、标签、TTL、创建时间、修改时间、描述等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPublicZonesRequest 请求对象
     * @return ListPublicZonesResponse
     */
    public ListPublicZonesResponse listPublicZones(ListPublicZonesRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.listPublicZones);
    }

    /**
     * 查询公网域名列表
     *
     * 当您的公网域名创建成功后，您可以通过调用此接口查询所有公网域名信息，包括域名、ID、状态、记录集个数、企业项目、标签、TTL、创建时间、修改时间、描述等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPublicZonesRequest 请求对象
     * @return SyncInvoker<ListPublicZonesRequest, ListPublicZonesResponse>
     */
    public SyncInvoker<ListPublicZonesRequest, ListPublicZonesResponse> listPublicZonesInvoker(
        ListPublicZonesRequest request) {
        return new SyncInvoker<>(request, DnsMeta.listPublicZones, hcClient);
    }

    /**
     * 查询解析器转发规则列表
     *
     * 查询解析器转发规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResolverRulesRequest 请求对象
     * @return ListResolverRulesResponse
     */
    public ListResolverRulesResponse listResolverRules(ListResolverRulesRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.listResolverRules);
    }

    /**
     * 查询解析器转发规则列表
     *
     * 查询解析器转发规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResolverRulesRequest 请求对象
     * @return SyncInvoker<ListResolverRulesRequest, ListResolverRulesResponse>
     */
    public SyncInvoker<ListResolverRulesRequest, ListResolverRulesResponse> listResolverRulesInvoker(
        ListResolverRulesRequest request) {
        return new SyncInvoker<>(request, DnsMeta.listResolverRules, hcClient);
    }

    /**
     * 使用标签查询资源实例
     *
     * 使用标签查询资源实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagRequest 请求对象
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
     * @param request ListTagRequest 请求对象
     * @return SyncInvoker<ListTagRequest, ListTagResponse>
     */
    public SyncInvoker<ListTagRequest, ListTagResponse> listTagInvoker(ListTagRequest request) {
        return new SyncInvoker<>(request, DnsMeta.listTag, hcClient);
    }

    /**
     * 查询指定实例类型的所有标签集合
     *
     * 查询指定实例类型的所有标签集合
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagsRequest 请求对象
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
     * @param request ListTagsRequest 请求对象
     * @return SyncInvoker<ListTagsRequest, ListTagsResponse>
     */
    public SyncInvoker<ListTagsRequest, ListTagsResponse> listTagsInvoker(ListTagsRequest request) {
        return new SyncInvoker<>(request, DnsMeta.listTags, hcClient);
    }

    /**
     * 设置内网域名的子域名递归解析代理
     *
     * 当您的内网域名创建成功后，您可以通过调用此接口设置开启或者关闭内网域名的子域名递归解析代理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetPrivateZoneProxyPatternRequest 请求对象
     * @return SetPrivateZoneProxyPatternResponse
     */
    public SetPrivateZoneProxyPatternResponse setPrivateZoneProxyPattern(SetPrivateZoneProxyPatternRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.setPrivateZoneProxyPattern);
    }

    /**
     * 设置内网域名的子域名递归解析代理
     *
     * 当您的内网域名创建成功后，您可以通过调用此接口设置开启或者关闭内网域名的子域名递归解析代理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetPrivateZoneProxyPatternRequest 请求对象
     * @return SyncInvoker<SetPrivateZoneProxyPatternRequest, SetPrivateZoneProxyPatternResponse>
     */
    public SyncInvoker<SetPrivateZoneProxyPatternRequest, SetPrivateZoneProxyPatternResponse> setPrivateZoneProxyPatternInvoker(
        SetPrivateZoneProxyPatternRequest request) {
        return new SyncInvoker<>(request, DnsMeta.setPrivateZoneProxyPattern, hcClient);
    }

    /**
     * 查询指定版本号的API版本信息
     *
     * 查询指定版本号的云解析服务API版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApiInfoRequest 请求对象
     * @return ShowApiInfoResponse
     */
    public ShowApiInfoResponse showApiInfo(ShowApiInfoRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.showApiInfo);
    }

    /**
     * 查询指定版本号的API版本信息
     *
     * 查询指定版本号的云解析服务API版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApiInfoRequest 请求对象
     * @return SyncInvoker<ShowApiInfoRequest, ShowApiInfoResponse>
     */
    public SyncInvoker<ShowApiInfoRequest, ShowApiInfoResponse> showApiInfoInvoker(ShowApiInfoRequest request) {
        return new SyncInvoker<>(request, DnsMeta.showApiInfo, hcClient);
    }

    /**
     * 查询租户配额
     *
     * 查询租户在DNS服务下的资源配额，包括公网域名配额、内网域名配额、记录集配额、反向解析配额、自定义线路配额、线路分组配额、入站终端节点配额、出站终端节点配额、转发规则配额等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainQuotaRequest 请求对象
     * @return ShowDomainQuotaResponse
     */
    public ShowDomainQuotaResponse showDomainQuota(ShowDomainQuotaRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.showDomainQuota);
    }

    /**
     * 查询租户配额
     *
     * 查询租户在DNS服务下的资源配额，包括公网域名配额、内网域名配额、记录集配额、反向解析配额、自定义线路配额、线路分组配额、入站终端节点配额、出站终端节点配额、转发规则配额等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainQuotaRequest 请求对象
     * @return SyncInvoker<ShowDomainQuotaRequest, ShowDomainQuotaResponse>
     */
    public SyncInvoker<ShowDomainQuotaRequest, ShowDomainQuotaResponse> showDomainQuotaInvoker(
        ShowDomainQuotaRequest request) {
        return new SyncInvoker<>(request, DnsMeta.showDomainQuota, hcClient);
    }

    /**
     * 查询终端节点
     *
     * 查询终端节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEndpointRequest 请求对象
     * @return ShowEndpointResponse
     */
    public ShowEndpointResponse showEndpoint(ShowEndpointRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.showEndpoint);
    }

    /**
     * 查询终端节点
     *
     * 查询终端节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEndpointRequest 请求对象
     * @return SyncInvoker<ShowEndpointRequest, ShowEndpointResponse>
     */
    public SyncInvoker<ShowEndpointRequest, ShowEndpointResponse> showEndpointInvoker(ShowEndpointRequest request) {
        return new SyncInvoker<>(request, DnsMeta.showEndpoint, hcClient);
    }

    /**
     * 查询线路分组
     *
     * 查询线路分组。该接口部分区域未上线，如需使用请提交工单申请开通。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLineGroupRequest 请求对象
     * @return ShowLineGroupResponse
     */
    public ShowLineGroupResponse showLineGroup(ShowLineGroupRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.showLineGroup);
    }

    /**
     * 查询线路分组
     *
     * 查询线路分组。该接口部分区域未上线，如需使用请提交工单申请开通。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLineGroupRequest 请求对象
     * @return SyncInvoker<ShowLineGroupRequest, ShowLineGroupResponse>
     */
    public SyncInvoker<ShowLineGroupRequest, ShowLineGroupResponse> showLineGroupInvoker(ShowLineGroupRequest request) {
        return new SyncInvoker<>(request, DnsMeta.showLineGroup, hcClient);
    }

    /**
     * 查询内网域名
     *
     * 当您的内网域名创建成功后，您可以通过调用此接口查询单个内网域名信息，包括域名、ID、状态、记录集个数、企业项目、标签、TTL、创建时间、修改时间、描述等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPrivateZoneRequest 请求对象
     * @return ShowPrivateZoneResponse
     */
    public ShowPrivateZoneResponse showPrivateZone(ShowPrivateZoneRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.showPrivateZone);
    }

    /**
     * 查询内网域名
     *
     * 当您的内网域名创建成功后，您可以通过调用此接口查询单个内网域名信息，包括域名、ID、状态、记录集个数、企业项目、标签、TTL、创建时间、修改时间、描述等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPrivateZoneRequest 请求对象
     * @return SyncInvoker<ShowPrivateZoneRequest, ShowPrivateZoneResponse>
     */
    public SyncInvoker<ShowPrivateZoneRequest, ShowPrivateZoneResponse> showPrivateZoneInvoker(
        ShowPrivateZoneRequest request) {
        return new SyncInvoker<>(request, DnsMeta.showPrivateZone, hcClient);
    }

    /**
     * 查询内网域名的名称服务器
     *
     * 当您的内网域名创建成功后，您可以通过调用此接口查询内网域名的名称服务器信息，包括优先级、DNS服务器地址等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPrivateZoneNameServerRequest 请求对象
     * @return ShowPrivateZoneNameServerResponse
     */
    public ShowPrivateZoneNameServerResponse showPrivateZoneNameServer(ShowPrivateZoneNameServerRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.showPrivateZoneNameServer);
    }

    /**
     * 查询内网域名的名称服务器
     *
     * 当您的内网域名创建成功后，您可以通过调用此接口查询内网域名的名称服务器信息，包括优先级、DNS服务器地址等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPrivateZoneNameServerRequest 请求对象
     * @return SyncInvoker<ShowPrivateZoneNameServerRequest, ShowPrivateZoneNameServerResponse>
     */
    public SyncInvoker<ShowPrivateZoneNameServerRequest, ShowPrivateZoneNameServerResponse> showPrivateZoneNameServerInvoker(
        ShowPrivateZoneNameServerRequest request) {
        return new SyncInvoker<>(request, DnsMeta.showPrivateZoneNameServer, hcClient);
    }

    /**
     * 查询公网域名
     *
     * 当您的公网域名创建成功后，您可以通过调用此接口查询单个公网域名信息，包括域名、ID、状态、记录集个数、企业项目、标签、TTL、创建时间、修改时间、描述等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPublicZoneRequest 请求对象
     * @return ShowPublicZoneResponse
     */
    public ShowPublicZoneResponse showPublicZone(ShowPublicZoneRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.showPublicZone);
    }

    /**
     * 查询公网域名
     *
     * 当您的公网域名创建成功后，您可以通过调用此接口查询单个公网域名信息，包括域名、ID、状态、记录集个数、企业项目、标签、TTL、创建时间、修改时间、描述等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPublicZoneRequest 请求对象
     * @return SyncInvoker<ShowPublicZoneRequest, ShowPublicZoneResponse>
     */
    public SyncInvoker<ShowPublicZoneRequest, ShowPublicZoneResponse> showPublicZoneInvoker(
        ShowPublicZoneRequest request) {
        return new SyncInvoker<>(request, DnsMeta.showPublicZone, hcClient);
    }

    /**
     * 查询公网域名的名称服务器
     *
     * 当您的公网域名创建成功后，您可以通过调用此接口查询公网域名的名称服务器信息，包括主机名、优先级等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPublicZoneNameServerRequest 请求对象
     * @return ShowPublicZoneNameServerResponse
     */
    public ShowPublicZoneNameServerResponse showPublicZoneNameServer(ShowPublicZoneNameServerRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.showPublicZoneNameServer);
    }

    /**
     * 查询公网域名的名称服务器
     *
     * 当您的公网域名创建成功后，您可以通过调用此接口查询公网域名的名称服务器信息，包括主机名、优先级等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPublicZoneNameServerRequest 请求对象
     * @return SyncInvoker<ShowPublicZoneNameServerRequest, ShowPublicZoneNameServerResponse>
     */
    public SyncInvoker<ShowPublicZoneNameServerRequest, ShowPublicZoneNameServerResponse> showPublicZoneNameServerInvoker(
        ShowPublicZoneNameServerRequest request) {
        return new SyncInvoker<>(request, DnsMeta.showPublicZoneNameServer, hcClient);
    }

    /**
     * 查询解析器转发规则
     *
     * 查询解析器转发规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResolverRuleRequest 请求对象
     * @return ShowResolverRuleResponse
     */
    public ShowResolverRuleResponse showResolverRule(ShowResolverRuleRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.showResolverRule);
    }

    /**
     * 查询解析器转发规则
     *
     * 查询解析器转发规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResolverRuleRequest 请求对象
     * @return SyncInvoker<ShowResolverRuleRequest, ShowResolverRuleResponse>
     */
    public SyncInvoker<ShowResolverRuleRequest, ShowResolverRuleResponse> showResolverRuleInvoker(
        ShowResolverRuleRequest request) {
        return new SyncInvoker<>(request, DnsMeta.showResolverRule, hcClient);
    }

    /**
     * 查询指定实例的标签信息
     *
     * 查询指定实例的标签信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceTagRequest 请求对象
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
     * @param request ShowResourceTagRequest 请求对象
     * @return SyncInvoker<ShowResourceTagRequest, ShowResourceTagResponse>
     */
    public SyncInvoker<ShowResourceTagRequest, ShowResourceTagResponse> showResourceTagInvoker(
        ShowResourceTagRequest request) {
        return new SyncInvoker<>(request, DnsMeta.showResourceTag, hcClient);
    }

    /**
     * 修改自定义线路
     *
     * 修改自定义线路。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCustomLineRequest 请求对象
     * @return UpdateCustomLineResponse
     */
    public UpdateCustomLineResponse updateCustomLine(UpdateCustomLineRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.updateCustomLine);
    }

    /**
     * 修改自定义线路
     *
     * 修改自定义线路。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCustomLineRequest 请求对象
     * @return SyncInvoker<UpdateCustomLineRequest, UpdateCustomLineResponse>
     */
    public SyncInvoker<UpdateCustomLineRequest, UpdateCustomLineResponse> updateCustomLineInvoker(
        UpdateCustomLineRequest request) {
        return new SyncInvoker<>(request, DnsMeta.updateCustomLine, hcClient);
    }

    /**
     * 修改终端节点
     *
     * 修改终端节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEndpointRequest 请求对象
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
     * @param request UpdateEndpointRequest 请求对象
     * @return SyncInvoker<UpdateEndpointRequest, UpdateEndpointResponse>
     */
    public SyncInvoker<UpdateEndpointRequest, UpdateEndpointResponse> updateEndpointInvoker(
        UpdateEndpointRequest request) {
        return new SyncInvoker<>(request, DnsMeta.updateEndpoint, hcClient);
    }

    /**
     * 修改线路分组
     *
     * 修改线路分组。该接口部分区域未上线，如需使用请提交工单申请开通。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLineGroupsRequest 请求对象
     * @return UpdateLineGroupsResponse
     */
    public UpdateLineGroupsResponse updateLineGroups(UpdateLineGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.updateLineGroups);
    }

    /**
     * 修改线路分组
     *
     * 修改线路分组。该接口部分区域未上线，如需使用请提交工单申请开通。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLineGroupsRequest 请求对象
     * @return SyncInvoker<UpdateLineGroupsRequest, UpdateLineGroupsResponse>
     */
    public SyncInvoker<UpdateLineGroupsRequest, UpdateLineGroupsResponse> updateLineGroupsInvoker(
        UpdateLineGroupsRequest request) {
        return new SyncInvoker<>(request, DnsMeta.updateLineGroups, hcClient);
    }

    /**
     * 修改内网域名
     *
     * 当您的内网域名创建成功后，您可以通过调用此接口修改内网域名的基本信息，包括TTL、描述等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePrivateZoneRequest 请求对象
     * @return UpdatePrivateZoneResponse
     */
    public UpdatePrivateZoneResponse updatePrivateZone(UpdatePrivateZoneRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.updatePrivateZone);
    }

    /**
     * 修改内网域名
     *
     * 当您的内网域名创建成功后，您可以通过调用此接口修改内网域名的基本信息，包括TTL、描述等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePrivateZoneRequest 请求对象
     * @return SyncInvoker<UpdatePrivateZoneRequest, UpdatePrivateZoneResponse>
     */
    public SyncInvoker<UpdatePrivateZoneRequest, UpdatePrivateZoneResponse> updatePrivateZoneInvoker(
        UpdatePrivateZoneRequest request) {
        return new SyncInvoker<>(request, DnsMeta.updatePrivateZone, hcClient);
    }

    /**
     * 设置内网域名状态
     *
     * 当您的内网域名创建成功后，您可以通过调用此接口设置内网域名的状态，包括暂停、启用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePrivateZoneStatusRequest 请求对象
     * @return UpdatePrivateZoneStatusResponse
     */
    public UpdatePrivateZoneStatusResponse updatePrivateZoneStatus(UpdatePrivateZoneStatusRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.updatePrivateZoneStatus);
    }

    /**
     * 设置内网域名状态
     *
     * 当您的内网域名创建成功后，您可以通过调用此接口设置内网域名的状态，包括暂停、启用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePrivateZoneStatusRequest 请求对象
     * @return SyncInvoker<UpdatePrivateZoneStatusRequest, UpdatePrivateZoneStatusResponse>
     */
    public SyncInvoker<UpdatePrivateZoneStatusRequest, UpdatePrivateZoneStatusResponse> updatePrivateZoneStatusInvoker(
        UpdatePrivateZoneStatusRequest request) {
        return new SyncInvoker<>(request, DnsMeta.updatePrivateZoneStatus, hcClient);
    }

    /**
     * 修改公网域名
     *
     * 当您的公网域名创建成功后，您可以通过调用此接口修改公网域名的基本信息，包括TTL、描述等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePublicZoneRequest 请求对象
     * @return UpdatePublicZoneResponse
     */
    public UpdatePublicZoneResponse updatePublicZone(UpdatePublicZoneRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.updatePublicZone);
    }

    /**
     * 修改公网域名
     *
     * 当您的公网域名创建成功后，您可以通过调用此接口修改公网域名的基本信息，包括TTL、描述等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePublicZoneRequest 请求对象
     * @return SyncInvoker<UpdatePublicZoneRequest, UpdatePublicZoneResponse>
     */
    public SyncInvoker<UpdatePublicZoneRequest, UpdatePublicZoneResponse> updatePublicZoneInvoker(
        UpdatePublicZoneRequest request) {
        return new SyncInvoker<>(request, DnsMeta.updatePublicZone, hcClient);
    }

    /**
     * 设置公网域名状态
     *
     * 当您的公网域名创建成功后，您可以通过调用此接口设置公网域名的状态，包括暂停、启用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePublicZoneStatusRequest 请求对象
     * @return UpdatePublicZoneStatusResponse
     */
    public UpdatePublicZoneStatusResponse updatePublicZoneStatus(UpdatePublicZoneStatusRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.updatePublicZoneStatus);
    }

    /**
     * 设置公网域名状态
     *
     * 当您的公网域名创建成功后，您可以通过调用此接口设置公网域名的状态，包括暂停、启用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePublicZoneStatusRequest 请求对象
     * @return SyncInvoker<UpdatePublicZoneStatusRequest, UpdatePublicZoneStatusResponse>
     */
    public SyncInvoker<UpdatePublicZoneStatusRequest, UpdatePublicZoneStatusResponse> updatePublicZoneStatusInvoker(
        UpdatePublicZoneStatusRequest request) {
        return new SyncInvoker<>(request, DnsMeta.updatePublicZoneStatus, hcClient);
    }

    /**
     * 修改解析器转发规则
     *
     * 修改解析器转发规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateResolverRuleRequest 请求对象
     * @return UpdateResolverRuleResponse
     */
    public UpdateResolverRuleResponse updateResolverRule(UpdateResolverRuleRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.updateResolverRule);
    }

    /**
     * 修改解析器转发规则
     *
     * 修改解析器转发规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateResolverRuleRequest 请求对象
     * @return SyncInvoker<UpdateResolverRuleRequest, UpdateResolverRuleResponse>
     */
    public SyncInvoker<UpdateResolverRuleRequest, UpdateResolverRuleResponse> updateResolverRuleInvoker(
        UpdateResolverRuleRequest request) {
        return new SyncInvoker<>(request, DnsMeta.updateResolverRule, hcClient);
    }

    /**
     * 关闭DNSSEC
     *
     * 关闭公网域名的DNSSEC。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableDnssecConfigRequest 请求对象
     * @return DisableDnssecConfigResponse
     */
    public DisableDnssecConfigResponse disableDnssecConfig(DisableDnssecConfigRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.disableDnssecConfig);
    }

    /**
     * 关闭DNSSEC
     *
     * 关闭公网域名的DNSSEC。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableDnssecConfigRequest 请求对象
     * @return SyncInvoker<DisableDnssecConfigRequest, DisableDnssecConfigResponse>
     */
    public SyncInvoker<DisableDnssecConfigRequest, DisableDnssecConfigResponse> disableDnssecConfigInvoker(
        DisableDnssecConfigRequest request) {
        return new SyncInvoker<>(request, DnsMeta.disableDnssecConfig, hcClient);
    }

    /**
     * 开启DNSSEC
     *
     * 开启公网域名的DNSSEC。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableDnssecConfigRequest 请求对象
     * @return EnableDnssecConfigResponse
     */
    public EnableDnssecConfigResponse enableDnssecConfig(EnableDnssecConfigRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.enableDnssecConfig);
    }

    /**
     * 开启DNSSEC
     *
     * 开启公网域名的DNSSEC。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableDnssecConfigRequest 请求对象
     * @return SyncInvoker<EnableDnssecConfigRequest, EnableDnssecConfigResponse>
     */
    public SyncInvoker<EnableDnssecConfigRequest, EnableDnssecConfigResponse> enableDnssecConfigInvoker(
        EnableDnssecConfigRequest request) {
        return new SyncInvoker<>(request, DnsMeta.enableDnssecConfig, hcClient);
    }

    /**
     * 查询DNSSEC
     *
     * 查询公网域名的DNSSEC。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDnssecConfigRequest 请求对象
     * @return ShowDnssecConfigResponse
     */
    public ShowDnssecConfigResponse showDnssecConfig(ShowDnssecConfigRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.showDnssecConfig);
    }

    /**
     * 查询DNSSEC
     *
     * 查询公网域名的DNSSEC。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDnssecConfigRequest 请求对象
     * @return SyncInvoker<ShowDnssecConfigRequest, ShowDnssecConfigResponse>
     */
    public SyncInvoker<ShowDnssecConfigRequest, ShowDnssecConfigResponse> showDnssecConfigInvoker(
        ShowDnssecConfigRequest request) {
        return new SyncInvoker<>(request, DnsMeta.showDnssecConfig, hcClient);
    }

    /**
     * 设置弹性公网IP的反向解析记录
     *
     * 设置弹性公网IP的反向解析记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEipRecordSetRequest 请求对象
     * @return CreateEipRecordSetResponse
     */
    public CreateEipRecordSetResponse createEipRecordSet(CreateEipRecordSetRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.createEipRecordSet);
    }

    /**
     * 设置弹性公网IP的反向解析记录
     *
     * 设置弹性公网IP的反向解析记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEipRecordSetRequest 请求对象
     * @return SyncInvoker<CreateEipRecordSetRequest, CreateEipRecordSetResponse>
     */
    public SyncInvoker<CreateEipRecordSetRequest, CreateEipRecordSetResponse> createEipRecordSetInvoker(
        CreateEipRecordSetRequest request) {
        return new SyncInvoker<>(request, DnsMeta.createEipRecordSet, hcClient);
    }

    /**
     * 创建记录集
     *
     * 记录集是指一组资源记录的集合，这些资源记录属于同一域名，用于定义域名支持的解析类型以及解析值。您的域名创建完成后，可以通过调用此接口为域名添加不同类型的记录集。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRecordSetRequest 请求对象
     * @return CreateRecordSetResponse
     */
    public CreateRecordSetResponse createRecordSet(CreateRecordSetRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.createRecordSet);
    }

    /**
     * 创建记录集
     *
     * 记录集是指一组资源记录的集合，这些资源记录属于同一域名，用于定义域名支持的解析类型以及解析值。您的域名创建完成后，可以通过调用此接口为域名添加不同类型的记录集。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRecordSetRequest 请求对象
     * @return SyncInvoker<CreateRecordSetRequest, CreateRecordSetResponse>
     */
    public SyncInvoker<CreateRecordSetRequest, CreateRecordSetResponse> createRecordSetInvoker(
        CreateRecordSetRequest request) {
        return new SyncInvoker<>(request, DnsMeta.createRecordSet, hcClient);
    }

    /**
     * 删除记录集
     *
     * 当您的记录集不再使用时，您可以通过调用此接口将其删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRecordSetRequest 请求对象
     * @return DeleteRecordSetResponse
     */
    public DeleteRecordSetResponse deleteRecordSet(DeleteRecordSetRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.deleteRecordSet);
    }

    /**
     * 删除记录集
     *
     * 当您的记录集不再使用时，您可以通过调用此接口将其删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRecordSetRequest 请求对象
     * @return SyncInvoker<DeleteRecordSetRequest, DeleteRecordSetResponse>
     */
    public SyncInvoker<DeleteRecordSetRequest, DeleteRecordSetResponse> deleteRecordSetInvoker(
        DeleteRecordSetRequest request) {
        return new SyncInvoker<>(request, DnsMeta.deleteRecordSet, hcClient);
    }

    /**
     * 查询弹性公网IP的反向解析记录列表
     *
     * 查询弹性公网IP的反向解析记录列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPtrRecordsRequest 请求对象
     * @return ListPtrRecordsResponse
     */
    public ListPtrRecordsResponse listPtrRecords(ListPtrRecordsRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.listPtrRecords);
    }

    /**
     * 查询弹性公网IP的反向解析记录列表
     *
     * 查询弹性公网IP的反向解析记录列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPtrRecordsRequest 请求对象
     * @return SyncInvoker<ListPtrRecordsRequest, ListPtrRecordsResponse>
     */
    public SyncInvoker<ListPtrRecordsRequest, ListPtrRecordsResponse> listPtrRecordsInvoker(
        ListPtrRecordsRequest request) {
        return new SyncInvoker<>(request, DnsMeta.listPtrRecords, hcClient);
    }

    /**
     * 查询租户记录集列表
     *
     * 当您的记录集创建成功后，您可以通过调用此接口查询指定域名下的所有记录集信息，包括名称、ID、状态、所属域名、解析记录值、标签、TTL、创建时间、修改时间、描述等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecordSetsRequest 请求对象
     * @return ListRecordSetsResponse
     */
    public ListRecordSetsResponse listRecordSets(ListRecordSetsRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.listRecordSets);
    }

    /**
     * 查询租户记录集列表
     *
     * 当您的记录集创建成功后，您可以通过调用此接口查询指定域名下的所有记录集信息，包括名称、ID、状态、所属域名、解析记录值、标签、TTL、创建时间、修改时间、描述等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecordSetsRequest 请求对象
     * @return SyncInvoker<ListRecordSetsRequest, ListRecordSetsResponse>
     */
    public SyncInvoker<ListRecordSetsRequest, ListRecordSetsResponse> listRecordSetsInvoker(
        ListRecordSetsRequest request) {
        return new SyncInvoker<>(request, DnsMeta.listRecordSets, hcClient);
    }

    /**
     * 查询域名下的记录集列表
     *
     * 当您的记录集创建成功后，您可以通过调用此接口查询指定域名下的所有记录集信息，包括名称、ID、状态、所属域名、解析记录值、标签、TTL、创建时间、修改时间、描述等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecordSetsByZoneRequest 请求对象
     * @return ListRecordSetsByZoneResponse
     */
    public ListRecordSetsByZoneResponse listRecordSetsByZone(ListRecordSetsByZoneRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.listRecordSetsByZone);
    }

    /**
     * 查询域名下的记录集列表
     *
     * 当您的记录集创建成功后，您可以通过调用此接口查询指定域名下的所有记录集信息，包括名称、ID、状态、所属域名、解析记录值、标签、TTL、创建时间、修改时间、描述等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecordSetsByZoneRequest 请求对象
     * @return SyncInvoker<ListRecordSetsByZoneRequest, ListRecordSetsByZoneResponse>
     */
    public SyncInvoker<ListRecordSetsByZoneRequest, ListRecordSetsByZoneResponse> listRecordSetsByZoneInvoker(
        ListRecordSetsByZoneRequest request) {
        return new SyncInvoker<>(request, DnsMeta.listRecordSetsByZone, hcClient);
    }

    /**
     * 将弹性公网IP的反向解析记录恢复为默认值
     *
     * 将弹性公网IP的反向解析记录恢复为默认值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestorePtrRecordRequest 请求对象
     * @return RestorePtrRecordResponse
     */
    public RestorePtrRecordResponse restorePtrRecord(RestorePtrRecordRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.restorePtrRecord);
    }

    /**
     * 将弹性公网IP的反向解析记录恢复为默认值
     *
     * 将弹性公网IP的反向解析记录恢复为默认值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestorePtrRecordRequest 请求对象
     * @return SyncInvoker<RestorePtrRecordRequest, RestorePtrRecordResponse>
     */
    public SyncInvoker<RestorePtrRecordRequest, RestorePtrRecordResponse> restorePtrRecordInvoker(
        RestorePtrRecordRequest request) {
        return new SyncInvoker<>(request, DnsMeta.restorePtrRecord, hcClient);
    }

    /**
     * 查询弹性公网IP的反向解析记录
     *
     * 查询弹性公网IP的反向解析记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPtrRecordSetRequest 请求对象
     * @return ShowPtrRecordSetResponse
     */
    public ShowPtrRecordSetResponse showPtrRecordSet(ShowPtrRecordSetRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.showPtrRecordSet);
    }

    /**
     * 查询弹性公网IP的反向解析记录
     *
     * 查询弹性公网IP的反向解析记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPtrRecordSetRequest 请求对象
     * @return SyncInvoker<ShowPtrRecordSetRequest, ShowPtrRecordSetResponse>
     */
    public SyncInvoker<ShowPtrRecordSetRequest, ShowPtrRecordSetResponse> showPtrRecordSetInvoker(
        ShowPtrRecordSetRequest request) {
        return new SyncInvoker<>(request, DnsMeta.showPtrRecordSet, hcClient);
    }

    /**
     * 查询记录集
     *
     * 当您的记录集创建成功后，您可以通过调用此接口查询指定域名下的所有记录集信息，包括名称、ID、状态、所属域名、解析记录值、标签、TTL、创建时间、修改时间、描述等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRecordSetRequest 请求对象
     * @return ShowRecordSetResponse
     */
    public ShowRecordSetResponse showRecordSet(ShowRecordSetRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.showRecordSet);
    }

    /**
     * 查询记录集
     *
     * 当您的记录集创建成功后，您可以通过调用此接口查询指定域名下的所有记录集信息，包括名称、ID、状态、所属域名、解析记录值、标签、TTL、创建时间、修改时间、描述等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRecordSetRequest 请求对象
     * @return SyncInvoker<ShowRecordSetRequest, ShowRecordSetResponse>
     */
    public SyncInvoker<ShowRecordSetRequest, ShowRecordSetResponse> showRecordSetInvoker(ShowRecordSetRequest request) {
        return new SyncInvoker<>(request, DnsMeta.showRecordSet, hcClient);
    }

    /**
     * 修改弹性公网IP的反向解析记录
     *
     * 修改弹性公网IP的反向解析记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePtrRecordRequest 请求对象
     * @return UpdatePtrRecordResponse
     */
    public UpdatePtrRecordResponse updatePtrRecord(UpdatePtrRecordRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.updatePtrRecord);
    }

    /**
     * 修改弹性公网IP的反向解析记录
     *
     * 修改弹性公网IP的反向解析记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePtrRecordRequest 请求对象
     * @return SyncInvoker<UpdatePtrRecordRequest, UpdatePtrRecordResponse>
     */
    public SyncInvoker<UpdatePtrRecordRequest, UpdatePtrRecordResponse> updatePtrRecordInvoker(
        UpdatePtrRecordRequest request) {
        return new SyncInvoker<>(request, DnsMeta.updatePtrRecord, hcClient);
    }

    /**
     * 修改记录集
     *
     * 当您的记录集创建成功后，您可以通过调用此接口修改记录集的信息，包括域名、类型、记录值、TTL、描述等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRecordSetRequest 请求对象
     * @return UpdateRecordSetResponse
     */
    public UpdateRecordSetResponse updateRecordSet(UpdateRecordSetRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.updateRecordSet);
    }

    /**
     * 修改记录集
     *
     * 当您的记录集创建成功后，您可以通过调用此接口修改记录集的信息，包括域名、类型、记录值、TTL、描述等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRecordSetRequest 请求对象
     * @return SyncInvoker<UpdateRecordSetRequest, UpdateRecordSetResponse>
     */
    public SyncInvoker<UpdateRecordSetRequest, UpdateRecordSetResponse> updateRecordSetInvoker(
        UpdateRecordSetRequest request) {
        return new SyncInvoker<>(request, DnsMeta.updateRecordSet, hcClient);
    }

    /**
     * 创建弹性公网IP的反向解析记录
     *
     * 创建弹性公网IP的反向解析记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePtrRequest 请求对象
     * @return CreatePtrResponse
     */
    public CreatePtrResponse createPtr(CreatePtrRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.createPtr);
    }

    /**
     * 创建弹性公网IP的反向解析记录
     *
     * 创建弹性公网IP的反向解析记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePtrRequest 请求对象
     * @return SyncInvoker<CreatePtrRequest, CreatePtrResponse>
     */
    public SyncInvoker<CreatePtrRequest, CreatePtrResponse> createPtrInvoker(CreatePtrRequest request) {
        return new SyncInvoker<>(request, DnsMeta.createPtr, hcClient);
    }

    /**
     * 创建记录集
     *
     * 记录集是指一组资源记录的集合，这些资源记录属于同一域名，用于定义域名支持的解析类型以及解析值。您的域名创建完成后，可以通过调用此接口为域名添加不同类型的记录集。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRecordSetWithLineRequest 请求对象
     * @return CreateRecordSetWithLineResponse
     */
    public CreateRecordSetWithLineResponse createRecordSetWithLine(CreateRecordSetWithLineRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.createRecordSetWithLine);
    }

    /**
     * 创建记录集
     *
     * 记录集是指一组资源记录的集合，这些资源记录属于同一域名，用于定义域名支持的解析类型以及解析值。您的域名创建完成后，可以通过调用此接口为域名添加不同类型的记录集。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRecordSetWithLineRequest 请求对象
     * @return SyncInvoker<CreateRecordSetWithLineRequest, CreateRecordSetWithLineResponse>
     */
    public SyncInvoker<CreateRecordSetWithLineRequest, CreateRecordSetWithLineResponse> createRecordSetWithLineInvoker(
        CreateRecordSetWithLineRequest request) {
        return new SyncInvoker<>(request, DnsMeta.createRecordSetWithLine, hcClient);
    }

    /**
     * 将弹性公网IP的反向解析记录恢复为默认值
     *
     * 将弹性公网IP的反向解析记录恢复为默认值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePtrRequest 请求对象
     * @return DeletePtrResponse
     */
    public DeletePtrResponse deletePtr(DeletePtrRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.deletePtr);
    }

    /**
     * 将弹性公网IP的反向解析记录恢复为默认值
     *
     * 将弹性公网IP的反向解析记录恢复为默认值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePtrRequest 请求对象
     * @return SyncInvoker<DeletePtrRequest, DeletePtrResponse>
     */
    public SyncInvoker<DeletePtrRequest, DeletePtrResponse> deletePtrInvoker(DeletePtrRequest request) {
        return new SyncInvoker<>(request, DnsMeta.deletePtr, hcClient);
    }

    /**
     * 删除记录集
     *
     * 当您的记录集不再使用时，您可以通过调用此接口将其删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRecordSetsRequest 请求对象
     * @return DeleteRecordSetsResponse
     */
    public DeleteRecordSetsResponse deleteRecordSets(DeleteRecordSetsRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.deleteRecordSets);
    }

    /**
     * 删除记录集
     *
     * 当您的记录集不再使用时，您可以通过调用此接口将其删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRecordSetsRequest 请求对象
     * @return SyncInvoker<DeleteRecordSetsRequest, DeleteRecordSetsResponse>
     */
    public SyncInvoker<DeleteRecordSetsRequest, DeleteRecordSetsResponse> deleteRecordSetsInvoker(
        DeleteRecordSetsRequest request) {
        return new SyncInvoker<>(request, DnsMeta.deleteRecordSets, hcClient);
    }

    /**
     * 查询弹性公网IP的反向解析记录列表
     *
     * 查询弹性公网IP的反向解析记录列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPtrsRequest 请求对象
     * @return ListPtrsResponse
     */
    public ListPtrsResponse listPtrs(ListPtrsRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.listPtrs);
    }

    /**
     * 查询弹性公网IP的反向解析记录列表
     *
     * 查询弹性公网IP的反向解析记录列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPtrsRequest 请求对象
     * @return SyncInvoker<ListPtrsRequest, ListPtrsResponse>
     */
    public SyncInvoker<ListPtrsRequest, ListPtrsResponse> listPtrsInvoker(ListPtrsRequest request) {
        return new SyncInvoker<>(request, DnsMeta.listPtrs, hcClient);
    }

    /**
     * 查询公网域名的线路列表
     *
     * 公网域名支持设置线路解析，当您的公网域名创建完成并添加记录集时，可通过调用此接口查询公网域名的所有解析线路。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPublicZoneLinesRequest 请求对象
     * @return ListPublicZoneLinesResponse
     */
    public ListPublicZoneLinesResponse listPublicZoneLines(ListPublicZoneLinesRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.listPublicZoneLines);
    }

    /**
     * 查询公网域名的线路列表
     *
     * 公网域名支持设置线路解析，当您的公网域名创建完成并添加记录集时，可通过调用此接口查询公网域名的所有解析线路。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPublicZoneLinesRequest 请求对象
     * @return SyncInvoker<ListPublicZoneLinesRequest, ListPublicZoneLinesResponse>
     */
    public SyncInvoker<ListPublicZoneLinesRequest, ListPublicZoneLinesResponse> listPublicZoneLinesInvoker(
        ListPublicZoneLinesRequest request) {
        return new SyncInvoker<>(request, DnsMeta.listPublicZoneLines, hcClient);
    }

    /**
     * 查询租户记录集列表
     *
     * 当您的记录集创建成功后，您可以通过调用此接口查询单个记录集信息，包括名称、ID、状态、所属域名、解析记录值、标签、TTL、创建时间、修改时间、描述等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecordSetsWithLineRequest 请求对象
     * @return ListRecordSetsWithLineResponse
     */
    public ListRecordSetsWithLineResponse listRecordSetsWithLine(ListRecordSetsWithLineRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.listRecordSetsWithLine);
    }

    /**
     * 查询租户记录集列表
     *
     * 当您的记录集创建成功后，您可以通过调用此接口查询单个记录集信息，包括名称、ID、状态、所属域名、解析记录值、标签、TTL、创建时间、修改时间、描述等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecordSetsWithLineRequest 请求对象
     * @return SyncInvoker<ListRecordSetsWithLineRequest, ListRecordSetsWithLineResponse>
     */
    public SyncInvoker<ListRecordSetsWithLineRequest, ListRecordSetsWithLineResponse> listRecordSetsWithLineInvoker(
        ListRecordSetsWithLineRequest request) {
        return new SyncInvoker<>(request, DnsMeta.listRecordSetsWithLine, hcClient);
    }

    /**
     * 设置记录集状态
     *
     * 当您的内网域名创建成功后，您可以通过调用此接口设置记录集的状态，包括暂停、启用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetRecordSetsStatusRequest 请求对象
     * @return SetRecordSetsStatusResponse
     */
    public SetRecordSetsStatusResponse setRecordSetsStatus(SetRecordSetsStatusRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.setRecordSetsStatus);
    }

    /**
     * 设置记录集状态
     *
     * 当您的内网域名创建成功后，您可以通过调用此接口设置记录集的状态，包括暂停、启用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetRecordSetsStatusRequest 请求对象
     * @return SyncInvoker<SetRecordSetsStatusRequest, SetRecordSetsStatusResponse>
     */
    public SyncInvoker<SetRecordSetsStatusRequest, SetRecordSetsStatusResponse> setRecordSetsStatusInvoker(
        SetRecordSetsStatusRequest request) {
        return new SyncInvoker<>(request, DnsMeta.setRecordSetsStatus, hcClient);
    }

    /**
     * 查询弹性公网IP的反向解析记录
     *
     * 查询弹性公网IP的反向解析记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPtrRequest 请求对象
     * @return ShowPtrResponse
     */
    public ShowPtrResponse showPtr(ShowPtrRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.showPtr);
    }

    /**
     * 查询弹性公网IP的反向解析记录
     *
     * 查询弹性公网IP的反向解析记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPtrRequest 请求对象
     * @return SyncInvoker<ShowPtrRequest, ShowPtrResponse>
     */
    public SyncInvoker<ShowPtrRequest, ShowPtrResponse> showPtrInvoker(ShowPtrRequest request) {
        return new SyncInvoker<>(request, DnsMeta.showPtr, hcClient);
    }

    /**
     * 查询域名下的记录集列表
     *
     * 当您的记录集创建成功后，您可以通过调用此接口查询单个记录集信息，包括名称、ID、状态、所属域名、解析记录值、标签、TTL、创建时间、修改时间、描述等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRecordSetByZoneRequest 请求对象
     * @return ShowRecordSetByZoneResponse
     */
    public ShowRecordSetByZoneResponse showRecordSetByZone(ShowRecordSetByZoneRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.showRecordSetByZone);
    }

    /**
     * 查询域名下的记录集列表
     *
     * 当您的记录集创建成功后，您可以通过调用此接口查询单个记录集信息，包括名称、ID、状态、所属域名、解析记录值、标签、TTL、创建时间、修改时间、描述等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRecordSetByZoneRequest 请求对象
     * @return SyncInvoker<ShowRecordSetByZoneRequest, ShowRecordSetByZoneResponse>
     */
    public SyncInvoker<ShowRecordSetByZoneRequest, ShowRecordSetByZoneResponse> showRecordSetByZoneInvoker(
        ShowRecordSetByZoneRequest request) {
        return new SyncInvoker<>(request, DnsMeta.showRecordSetByZone, hcClient);
    }

    /**
     * 查询记录集
     *
     * 当您的记录集创建成功后，您可以通过调用此接口查询单个记录集信息，包括名称、ID、状态、所属域名、解析记录值、标签、TTL、创建时间、修改时间、描述等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRecordSetWithLineRequest 请求对象
     * @return ShowRecordSetWithLineResponse
     */
    public ShowRecordSetWithLineResponse showRecordSetWithLine(ShowRecordSetWithLineRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.showRecordSetWithLine);
    }

    /**
     * 查询记录集
     *
     * 当您的记录集创建成功后，您可以通过调用此接口查询单个记录集信息，包括名称、ID、状态、所属域名、解析记录值、标签、TTL、创建时间、修改时间、描述等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRecordSetWithLineRequest 请求对象
     * @return SyncInvoker<ShowRecordSetWithLineRequest, ShowRecordSetWithLineResponse>
     */
    public SyncInvoker<ShowRecordSetWithLineRequest, ShowRecordSetWithLineResponse> showRecordSetWithLineInvoker(
        ShowRecordSetWithLineRequest request) {
        return new SyncInvoker<>(request, DnsMeta.showRecordSetWithLine, hcClient);
    }

    /**
     * 修改弹性公网IP的反向解析记录
     *
     * 修改弹性公网IP的反向解析记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePtrRequest 请求对象
     * @return UpdatePtrResponse
     */
    public UpdatePtrResponse updatePtr(UpdatePtrRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.updatePtr);
    }

    /**
     * 修改弹性公网IP的反向解析记录
     *
     * 修改弹性公网IP的反向解析记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePtrRequest 请求对象
     * @return SyncInvoker<UpdatePtrRequest, UpdatePtrResponse>
     */
    public SyncInvoker<UpdatePtrRequest, UpdatePtrResponse> updatePtrInvoker(UpdatePtrRequest request) {
        return new SyncInvoker<>(request, DnsMeta.updatePtr, hcClient);
    }

    /**
     * 修改记录集
     *
     * 当您的记录集创建成功后，您可以通过调用此接口修改记录集的信息，包括域名、类型、记录值、TTL、描述等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRecordSetsRequest 请求对象
     * @return UpdateRecordSetsResponse
     */
    public UpdateRecordSetsResponse updateRecordSets(UpdateRecordSetsRequest request) {
        return hcClient.syncInvokeHttp(request, DnsMeta.updateRecordSets);
    }

    /**
     * 修改记录集
     *
     * 当您的记录集创建成功后，您可以通过调用此接口修改记录集的信息，包括域名、类型、记录值、TTL、描述等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRecordSetsRequest 请求对象
     * @return SyncInvoker<UpdateRecordSetsRequest, UpdateRecordSetsResponse>
     */
    public SyncInvoker<UpdateRecordSetsRequest, UpdateRecordSetsResponse> updateRecordSetsInvoker(
        UpdateRecordSetsRequest request) {
        return new SyncInvoker<>(request, DnsMeta.updateRecordSets, hcClient);
    }

}
