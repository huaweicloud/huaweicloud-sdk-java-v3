package com.huaweicloud.sdk.dns.v2;

import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;
import com.huaweicloud.sdk.dns.v2.model.AssociateEndpointIpaddressRequest;
import com.huaweicloud.sdk.dns.v2.model.AssociateEndpointIpaddressResponse;
import com.huaweicloud.sdk.dns.v2.model.AssociateResolverQueryLogConfigRequest;
import com.huaweicloud.sdk.dns.v2.model.AssociateResolverQueryLogConfigResponse;
import com.huaweicloud.sdk.dns.v2.model.AssociateResolverRuleRouterRequest;
import com.huaweicloud.sdk.dns.v2.model.AssociateResolverRuleRouterResponse;
import com.huaweicloud.sdk.dns.v2.model.AssociateRouterRequest;
import com.huaweicloud.sdk.dns.v2.model.AssociateRouterResponse;
import com.huaweicloud.sdk.dns.v2.model.BatchCreateCombinedPublicRecordsetsTaskRequest;
import com.huaweicloud.sdk.dns.v2.model.BatchCreateCombinedPublicRecordsetsTaskResponse;
import com.huaweicloud.sdk.dns.v2.model.BatchCreatePublicRecordsetsTaskRequest;
import com.huaweicloud.sdk.dns.v2.model.BatchCreatePublicRecordsetsTaskResponse;
import com.huaweicloud.sdk.dns.v2.model.BatchCreatePublicZonesTaskRequest;
import com.huaweicloud.sdk.dns.v2.model.BatchCreatePublicZonesTaskResponse;
import com.huaweicloud.sdk.dns.v2.model.BatchCreateRecordSetsTaskRequest;
import com.huaweicloud.sdk.dns.v2.model.BatchCreateRecordSetsTaskResponse;
import com.huaweicloud.sdk.dns.v2.model.BatchCreateTagRequest;
import com.huaweicloud.sdk.dns.v2.model.BatchCreateTagResponse;
import com.huaweicloud.sdk.dns.v2.model.BatchDeletePtrRecordsRequest;
import com.huaweicloud.sdk.dns.v2.model.BatchDeletePtrRecordsResponse;
import com.huaweicloud.sdk.dns.v2.model.BatchDeletePublicRecordsetsTaskRequest;
import com.huaweicloud.sdk.dns.v2.model.BatchDeletePublicRecordsetsTaskResponse;
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
import com.huaweicloud.sdk.dns.v2.model.BatchTransferPublicZonesTaskRequest;
import com.huaweicloud.sdk.dns.v2.model.BatchTransferPublicZonesTaskResponse;
import com.huaweicloud.sdk.dns.v2.model.BatchUpdatePublicRecordsetsTaskRequest;
import com.huaweicloud.sdk.dns.v2.model.BatchUpdatePublicRecordsetsTaskResponse;
import com.huaweicloud.sdk.dns.v2.model.BatchUpdateRecordSetWithLineRequest;
import com.huaweicloud.sdk.dns.v2.model.BatchUpdateRecordSetWithLineResponse;
import com.huaweicloud.sdk.dns.v2.model.CreateAuthorizeTxtRecordRequest;
import com.huaweicloud.sdk.dns.v2.model.CreateAuthorizeTxtRecordResponse;
import com.huaweicloud.sdk.dns.v2.model.CreateAuthorizeTxtRecordVerificationRequest;
import com.huaweicloud.sdk.dns.v2.model.CreateAuthorizeTxtRecordVerificationResponse;
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
import com.huaweicloud.sdk.dns.v2.model.CreateResolverQueryLogConfigRequest;
import com.huaweicloud.sdk.dns.v2.model.CreateResolverQueryLogConfigResponse;
import com.huaweicloud.sdk.dns.v2.model.CreateResolverRuleRequest;
import com.huaweicloud.sdk.dns.v2.model.CreateResolverRuleResponse;
import com.huaweicloud.sdk.dns.v2.model.CreateRetrievalRequest;
import com.huaweicloud.sdk.dns.v2.model.CreateRetrievalResponse;
import com.huaweicloud.sdk.dns.v2.model.CreateRetrievalVerificationRequest;
import com.huaweicloud.sdk.dns.v2.model.CreateRetrievalVerificationResponse;
import com.huaweicloud.sdk.dns.v2.model.CreateTagRequest;
import com.huaweicloud.sdk.dns.v2.model.CreateTagResponse;
import com.huaweicloud.sdk.dns.v2.model.DeleteBatchCreateRecordSetsTaskRequest;
import com.huaweicloud.sdk.dns.v2.model.DeleteBatchCreateRecordSetsTaskResponse;
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
import com.huaweicloud.sdk.dns.v2.model.DeleteResolverQueryLogConfigRequest;
import com.huaweicloud.sdk.dns.v2.model.DeleteResolverQueryLogConfigResponse;
import com.huaweicloud.sdk.dns.v2.model.DeleteResolverRuleRequest;
import com.huaweicloud.sdk.dns.v2.model.DeleteResolverRuleResponse;
import com.huaweicloud.sdk.dns.v2.model.DeleteTagRequest;
import com.huaweicloud.sdk.dns.v2.model.DeleteTagResponse;
import com.huaweicloud.sdk.dns.v2.model.DisableDnssecConfigRequest;
import com.huaweicloud.sdk.dns.v2.model.DisableDnssecConfigResponse;
import com.huaweicloud.sdk.dns.v2.model.DisassociateEndpointIpaddressRequest;
import com.huaweicloud.sdk.dns.v2.model.DisassociateEndpointIpaddressResponse;
import com.huaweicloud.sdk.dns.v2.model.DisassociateResolverQueryLogConfigRequest;
import com.huaweicloud.sdk.dns.v2.model.DisassociateResolverQueryLogConfigResponse;
import com.huaweicloud.sdk.dns.v2.model.DisassociateResolverRuleRouterRequest;
import com.huaweicloud.sdk.dns.v2.model.DisassociateResolverRuleRouterResponse;
import com.huaweicloud.sdk.dns.v2.model.DisassociateRouterRequest;
import com.huaweicloud.sdk.dns.v2.model.DisassociateRouterResponse;
import com.huaweicloud.sdk.dns.v2.model.EnableDnssecConfigRequest;
import com.huaweicloud.sdk.dns.v2.model.EnableDnssecConfigResponse;
import com.huaweicloud.sdk.dns.v2.model.ListApiVersionsRequest;
import com.huaweicloud.sdk.dns.v2.model.ListApiVersionsResponse;
import com.huaweicloud.sdk.dns.v2.model.ListBatchOperationTasksRequest;
import com.huaweicloud.sdk.dns.v2.model.ListBatchOperationTasksResponse;
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
import com.huaweicloud.sdk.dns.v2.model.ListResolverQueryLogConfigsRequest;
import com.huaweicloud.sdk.dns.v2.model.ListResolverQueryLogConfigsResponse;
import com.huaweicloud.sdk.dns.v2.model.ListResolverRulesRequest;
import com.huaweicloud.sdk.dns.v2.model.ListResolverRulesResponse;
import com.huaweicloud.sdk.dns.v2.model.ListSystemLinesRequest;
import com.huaweicloud.sdk.dns.v2.model.ListSystemLinesResponse;
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
import com.huaweicloud.sdk.dns.v2.model.ShowAuthorizeTxtRecordRequest;
import com.huaweicloud.sdk.dns.v2.model.ShowAuthorizeTxtRecordResponse;
import com.huaweicloud.sdk.dns.v2.model.ShowBatchCreateRecordSetsTaskRequest;
import com.huaweicloud.sdk.dns.v2.model.ShowBatchCreateRecordSetsTaskResponse;
import com.huaweicloud.sdk.dns.v2.model.ShowBatchOperationTaskRequest;
import com.huaweicloud.sdk.dns.v2.model.ShowBatchOperationTaskResponse;
import com.huaweicloud.sdk.dns.v2.model.ShowDnssecConfigRequest;
import com.huaweicloud.sdk.dns.v2.model.ShowDnssecConfigResponse;
import com.huaweicloud.sdk.dns.v2.model.ShowDomainDetectionRequest;
import com.huaweicloud.sdk.dns.v2.model.ShowDomainDetectionResponse;
import com.huaweicloud.sdk.dns.v2.model.ShowDomainQuotaRequest;
import com.huaweicloud.sdk.dns.v2.model.ShowDomainQuotaResponse;
import com.huaweicloud.sdk.dns.v2.model.ShowEmailRecordSetRequest;
import com.huaweicloud.sdk.dns.v2.model.ShowEmailRecordSetResponse;
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
import com.huaweicloud.sdk.dns.v2.model.ShowResolverQueryLogConfigRequest;
import com.huaweicloud.sdk.dns.v2.model.ShowResolverQueryLogConfigResponse;
import com.huaweicloud.sdk.dns.v2.model.ShowResolverRuleRequest;
import com.huaweicloud.sdk.dns.v2.model.ShowResolverRuleResponse;
import com.huaweicloud.sdk.dns.v2.model.ShowResourceTagRequest;
import com.huaweicloud.sdk.dns.v2.model.ShowResourceTagResponse;
import com.huaweicloud.sdk.dns.v2.model.ShowRetrievalRequest;
import com.huaweicloud.sdk.dns.v2.model.ShowRetrievalResponse;
import com.huaweicloud.sdk.dns.v2.model.ShowRetrievalVerificationRequest;
import com.huaweicloud.sdk.dns.v2.model.ShowRetrievalVerificationResponse;
import com.huaweicloud.sdk.dns.v2.model.ShowWebsiteRecordSetRequest;
import com.huaweicloud.sdk.dns.v2.model.ShowWebsiteRecordSetResponse;
import com.huaweicloud.sdk.dns.v2.model.ShowZoneNameServerRequest;
import com.huaweicloud.sdk.dns.v2.model.ShowZoneNameServerResponse;
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

import java.util.concurrent.CompletableFuture;

public class DnsAsyncClient {

    protected HcClient hcClient;

    public DnsAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<DnsAsyncClient> newBuilder() {
        ClientBuilder<DnsAsyncClient> clientBuilder = new ClientBuilder<>(DnsAsyncClient::new);
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
     * @return CompletableFuture<AssociateEndpointIpaddressResponse>
     */
    public CompletableFuture<AssociateEndpointIpaddressResponse> associateEndpointIpaddressAsync(
        AssociateEndpointIpaddressRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.associateEndpointIpaddress);
    }

    /**
     * 终端节点绑定IP地址
     *
     * 终端节点绑定IP地址。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateEndpointIpaddressRequest 请求对象
     * @return AsyncInvoker<AssociateEndpointIpaddressRequest, AssociateEndpointIpaddressResponse>
     */
    public AsyncInvoker<AssociateEndpointIpaddressRequest, AssociateEndpointIpaddressResponse> associateEndpointIpaddressAsyncInvoker(
        AssociateEndpointIpaddressRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.associateEndpointIpaddress, hcClient);
    }

    /**
     * 解析器访问日志关联VPC
     *
     * 解析器访问日志关联VPC。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateResolverQueryLogConfigRequest 请求对象
     * @return CompletableFuture<AssociateResolverQueryLogConfigResponse>
     */
    public CompletableFuture<AssociateResolverQueryLogConfigResponse> associateResolverQueryLogConfigAsync(
        AssociateResolverQueryLogConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.associateResolverQueryLogConfig);
    }

    /**
     * 解析器访问日志关联VPC
     *
     * 解析器访问日志关联VPC。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateResolverQueryLogConfigRequest 请求对象
     * @return AsyncInvoker<AssociateResolverQueryLogConfigRequest, AssociateResolverQueryLogConfigResponse>
     */
    public AsyncInvoker<AssociateResolverQueryLogConfigRequest, AssociateResolverQueryLogConfigResponse> associateResolverQueryLogConfigAsyncInvoker(
        AssociateResolverQueryLogConfigRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.associateResolverQueryLogConfig, hcClient);
    }

    /**
     * 解析器转发规则关联VPC
     *
     * 解析器转发规则关联VPC。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateResolverRuleRouterRequest 请求对象
     * @return CompletableFuture<AssociateResolverRuleRouterResponse>
     */
    public CompletableFuture<AssociateResolverRuleRouterResponse> associateResolverRuleRouterAsync(
        AssociateResolverRuleRouterRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.associateResolverRuleRouter);
    }

    /**
     * 解析器转发规则关联VPC
     *
     * 解析器转发规则关联VPC。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateResolverRuleRouterRequest 请求对象
     * @return AsyncInvoker<AssociateResolverRuleRouterRequest, AssociateResolverRuleRouterResponse>
     */
    public AsyncInvoker<AssociateResolverRuleRouterRequest, AssociateResolverRuleRouterResponse> associateResolverRuleRouterAsyncInvoker(
        AssociateResolverRuleRouterRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.associateResolverRuleRouter, hcClient);
    }

    /**
     * 在内网域名上关联VPC
     *
     * 当您的内网域名创建完成后，可以通过调用此接口为内网域名关联新的VPC。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateRouterRequest 请求对象
     * @return CompletableFuture<AssociateRouterResponse>
     */
    public CompletableFuture<AssociateRouterResponse> associateRouterAsync(AssociateRouterRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.associateRouter);
    }

    /**
     * 在内网域名上关联VPC
     *
     * 当您的内网域名创建完成后，可以通过调用此接口为内网域名关联新的VPC。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateRouterRequest 请求对象
     * @return AsyncInvoker<AssociateRouterRequest, AssociateRouterResponse>
     */
    public AsyncInvoker<AssociateRouterRequest, AssociateRouterResponse> associateRouterAsyncInvoker(
        AssociateRouterRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.associateRouter, hcClient);
    }

    /**
     * 批量创建公网记录集
     *
     * 提交批量创建公网记录集任务，返回任务ID。
     * 
     * **[公网域名为全局资源，请选择“华北-北京四（cn-north-4）”区域调用。](tag:hws)**
     * **[公网域名为全局资源，请选择“亚太-新加坡（ap-southeast-3）”区域调用。](tag:hws_hk)**
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateCombinedPublicRecordsetsTaskRequest 请求对象
     * @return CompletableFuture<BatchCreateCombinedPublicRecordsetsTaskResponse>
     */
    public CompletableFuture<BatchCreateCombinedPublicRecordsetsTaskResponse> batchCreateCombinedPublicRecordsetsTaskAsync(
        BatchCreateCombinedPublicRecordsetsTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.batchCreateCombinedPublicRecordsetsTask);
    }

    /**
     * 批量创建公网记录集
     *
     * 提交批量创建公网记录集任务，返回任务ID。
     * 
     * **[公网域名为全局资源，请选择“华北-北京四（cn-north-4）”区域调用。](tag:hws)**
     * **[公网域名为全局资源，请选择“亚太-新加坡（ap-southeast-3）”区域调用。](tag:hws_hk)**
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateCombinedPublicRecordsetsTaskRequest 请求对象
     * @return AsyncInvoker<BatchCreateCombinedPublicRecordsetsTaskRequest, BatchCreateCombinedPublicRecordsetsTaskResponse>
     */
    public AsyncInvoker<BatchCreateCombinedPublicRecordsetsTaskRequest, BatchCreateCombinedPublicRecordsetsTaskResponse> batchCreateCombinedPublicRecordsetsTaskAsyncInvoker(
        BatchCreateCombinedPublicRecordsetsTaskRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.batchCreateCombinedPublicRecordsetsTask, hcClient);
    }

    /**
     * 批量创建公网记录集
     *
     * 提交批量创建公网记录集任务，返回任务ID。
     * 
     * **[公网域名为全局资源，请选择“华北-北京四（cn-north-4）”区域调用。](tag:hws)**
     * **[公网域名为全局资源，请选择“亚太-新加坡（ap-southeast-3）”区域调用。](tag:hws_hk)**
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreatePublicRecordsetsTaskRequest 请求对象
     * @return CompletableFuture<BatchCreatePublicRecordsetsTaskResponse>
     */
    public CompletableFuture<BatchCreatePublicRecordsetsTaskResponse> batchCreatePublicRecordsetsTaskAsync(
        BatchCreatePublicRecordsetsTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.batchCreatePublicRecordsetsTask);
    }

    /**
     * 批量创建公网记录集
     *
     * 提交批量创建公网记录集任务，返回任务ID。
     * 
     * **[公网域名为全局资源，请选择“华北-北京四（cn-north-4）”区域调用。](tag:hws)**
     * **[公网域名为全局资源，请选择“亚太-新加坡（ap-southeast-3）”区域调用。](tag:hws_hk)**
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreatePublicRecordsetsTaskRequest 请求对象
     * @return AsyncInvoker<BatchCreatePublicRecordsetsTaskRequest, BatchCreatePublicRecordsetsTaskResponse>
     */
    public AsyncInvoker<BatchCreatePublicRecordsetsTaskRequest, BatchCreatePublicRecordsetsTaskResponse> batchCreatePublicRecordsetsTaskAsyncInvoker(
        BatchCreatePublicRecordsetsTaskRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.batchCreatePublicRecordsetsTask, hcClient);
    }

    /**
     * 批量创建公网域名
     *
     * 提交批量创建公网域名任务，返回任务ID。
     * 
     * **[公网域名为全局资源，请选择“华北-北京四（cn-north-4）”区域调用。](tag:hws)**
     * **[公网域名为全局资源，请选择“亚太-新加坡（ap-southeast-3）”区域调用。](tag:hws_hk)**
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreatePublicZonesTaskRequest 请求对象
     * @return CompletableFuture<BatchCreatePublicZonesTaskResponse>
     */
    public CompletableFuture<BatchCreatePublicZonesTaskResponse> batchCreatePublicZonesTaskAsync(
        BatchCreatePublicZonesTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.batchCreatePublicZonesTask);
    }

    /**
     * 批量创建公网域名
     *
     * 提交批量创建公网域名任务，返回任务ID。
     * 
     * **[公网域名为全局资源，请选择“华北-北京四（cn-north-4）”区域调用。](tag:hws)**
     * **[公网域名为全局资源，请选择“亚太-新加坡（ap-southeast-3）”区域调用。](tag:hws_hk)**
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreatePublicZonesTaskRequest 请求对象
     * @return AsyncInvoker<BatchCreatePublicZonesTaskRequest, BatchCreatePublicZonesTaskResponse>
     */
    public AsyncInvoker<BatchCreatePublicZonesTaskRequest, BatchCreatePublicZonesTaskResponse> batchCreatePublicZonesTaskAsyncInvoker(
        BatchCreatePublicZonesTaskRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.batchCreatePublicZonesTask, hcClient);
    }

    /**
     * 为指定实例批量添加或删除标签
     *
     * 为指定实例批量添加或删除标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateTagRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateTagRequest 请求对象
     * @return AsyncInvoker<BatchCreateTagRequest, BatchCreateTagResponse>
     */
    public AsyncInvoker<BatchCreateTagRequest, BatchCreateTagResponse> batchCreateTagAsyncInvoker(
        BatchCreateTagRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.batchCreateTag, hcClient);
    }

    /**
     * 批量删除反向解析
     *
     * 批量删除反向解析。本接口为原子操作，所有记录应全部删除成功或全部失败。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeletePtrRecordsRequest 请求对象
     * @return CompletableFuture<BatchDeletePtrRecordsResponse>
     */
    public CompletableFuture<BatchDeletePtrRecordsResponse> batchDeletePtrRecordsAsync(
        BatchDeletePtrRecordsRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.batchDeletePtrRecords);
    }

    /**
     * 批量删除反向解析
     *
     * 批量删除反向解析。本接口为原子操作，所有记录应全部删除成功或全部失败。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeletePtrRecordsRequest 请求对象
     * @return AsyncInvoker<BatchDeletePtrRecordsRequest, BatchDeletePtrRecordsResponse>
     */
    public AsyncInvoker<BatchDeletePtrRecordsRequest, BatchDeletePtrRecordsResponse> batchDeletePtrRecordsAsyncInvoker(
        BatchDeletePtrRecordsRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.batchDeletePtrRecords, hcClient);
    }

    /**
     * 批量删除公网记录集
     *
     * 提交批量删除公网记录集任务，返回任务ID。
     * 
     * **[公网域名为全局资源，请选择“华北-北京四（cn-north-4）”区域调用。](tag:hws)**
     * **[公网域名为全局资源，请选择“亚太-新加坡（ap-southeast-3）”区域调用。](tag:hws_hk)**
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeletePublicRecordsetsTaskRequest 请求对象
     * @return CompletableFuture<BatchDeletePublicRecordsetsTaskResponse>
     */
    public CompletableFuture<BatchDeletePublicRecordsetsTaskResponse> batchDeletePublicRecordsetsTaskAsync(
        BatchDeletePublicRecordsetsTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.batchDeletePublicRecordsetsTask);
    }

    /**
     * 批量删除公网记录集
     *
     * 提交批量删除公网记录集任务，返回任务ID。
     * 
     * **[公网域名为全局资源，请选择“华北-北京四（cn-north-4）”区域调用。](tag:hws)**
     * **[公网域名为全局资源，请选择“亚太-新加坡（ap-southeast-3）”区域调用。](tag:hws_hk)**
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeletePublicRecordsetsTaskRequest 请求对象
     * @return AsyncInvoker<BatchDeletePublicRecordsetsTaskRequest, BatchDeletePublicRecordsetsTaskResponse>
     */
    public AsyncInvoker<BatchDeletePublicRecordsetsTaskRequest, BatchDeletePublicRecordsetsTaskResponse> batchDeletePublicRecordsetsTaskAsyncInvoker(
        BatchDeletePublicRecordsetsTaskRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.batchDeletePublicRecordsetsTask, hcClient);
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
     * @return CompletableFuture<BatchDeleteRecordSetsResponse>
     */
    public CompletableFuture<BatchDeleteRecordSetsResponse> batchDeleteRecordSetsAsync(
        BatchDeleteRecordSetsRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.batchDeleteRecordSets);
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
     * @return AsyncInvoker<BatchDeleteRecordSetsRequest, BatchDeleteRecordSetsResponse>
     */
    public AsyncInvoker<BatchDeleteRecordSetsRequest, BatchDeleteRecordSetsResponse> batchDeleteRecordSetsAsyncInvoker(
        BatchDeleteRecordSetsRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.batchDeleteRecordSets, hcClient);
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
     * @return CompletableFuture<BatchDeleteZonesResponse>
     */
    public CompletableFuture<BatchDeleteZonesResponse> batchDeleteZonesAsync(BatchDeleteZonesRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.batchDeleteZones);
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
     * @return AsyncInvoker<BatchDeleteZonesRequest, BatchDeleteZonesResponse>
     */
    public AsyncInvoker<BatchDeleteZonesRequest, BatchDeleteZonesResponse> batchDeleteZonesAsyncInvoker(
        BatchDeleteZonesRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.batchDeleteZones, hcClient);
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
     * @return CompletableFuture<BatchSetRecordSetsStatusResponse>
     */
    public CompletableFuture<BatchSetRecordSetsStatusResponse> batchSetRecordSetsStatusAsync(
        BatchSetRecordSetsStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.batchSetRecordSetsStatus);
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
     * @return AsyncInvoker<BatchSetRecordSetsStatusRequest, BatchSetRecordSetsStatusResponse>
     */
    public AsyncInvoker<BatchSetRecordSetsStatusRequest, BatchSetRecordSetsStatusResponse> batchSetRecordSetsStatusAsyncInvoker(
        BatchSetRecordSetsStatusRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.batchSetRecordSetsStatus, hcClient);
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
     * @return CompletableFuture<BatchSetZonesStatusResponse>
     */
    public CompletableFuture<BatchSetZonesStatusResponse> batchSetZonesStatusAsync(BatchSetZonesStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.batchSetZonesStatus);
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
     * @return AsyncInvoker<BatchSetZonesStatusRequest, BatchSetZonesStatusResponse>
     */
    public AsyncInvoker<BatchSetZonesStatusRequest, BatchSetZonesStatusResponse> batchSetZonesStatusAsyncInvoker(
        BatchSetZonesStatusRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.batchSetZonesStatus, hcClient);
    }

    /**
     * 批量转移公网域名
     *
     * 提交批量转移公网域名任务，返回任务ID。
     * 
     * **[公网域名为全局资源，请选择“华北-北京四（cn-north-4）”区域调用。](tag:hws)**
     * **[公网域名为全局资源，请选择“亚太-新加坡（ap-southeast-3）”区域调用。](tag:hws_hk)**
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchTransferPublicZonesTaskRequest 请求对象
     * @return CompletableFuture<BatchTransferPublicZonesTaskResponse>
     */
    public CompletableFuture<BatchTransferPublicZonesTaskResponse> batchTransferPublicZonesTaskAsync(
        BatchTransferPublicZonesTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.batchTransferPublicZonesTask);
    }

    /**
     * 批量转移公网域名
     *
     * 提交批量转移公网域名任务，返回任务ID。
     * 
     * **[公网域名为全局资源，请选择“华北-北京四（cn-north-4）”区域调用。](tag:hws)**
     * **[公网域名为全局资源，请选择“亚太-新加坡（ap-southeast-3）”区域调用。](tag:hws_hk)**
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchTransferPublicZonesTaskRequest 请求对象
     * @return AsyncInvoker<BatchTransferPublicZonesTaskRequest, BatchTransferPublicZonesTaskResponse>
     */
    public AsyncInvoker<BatchTransferPublicZonesTaskRequest, BatchTransferPublicZonesTaskResponse> batchTransferPublicZonesTaskAsyncInvoker(
        BatchTransferPublicZonesTaskRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.batchTransferPublicZonesTask, hcClient);
    }

    /**
     * 批量修改公网记录集
     *
     * 提交批量修改公网记录集任务，返回任务ID。
     * 
     * **[公网域名为全局资源，请选择“华北-北京四（cn-north-4）”区域调用。](tag:hws)**
     * **[公网域名为全局资源，请选择“亚太-新加坡（ap-southeast-3）”区域调用。](tag:hws_hk)**
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdatePublicRecordsetsTaskRequest 请求对象
     * @return CompletableFuture<BatchUpdatePublicRecordsetsTaskResponse>
     */
    public CompletableFuture<BatchUpdatePublicRecordsetsTaskResponse> batchUpdatePublicRecordsetsTaskAsync(
        BatchUpdatePublicRecordsetsTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.batchUpdatePublicRecordsetsTask);
    }

    /**
     * 批量修改公网记录集
     *
     * 提交批量修改公网记录集任务，返回任务ID。
     * 
     * **[公网域名为全局资源，请选择“华北-北京四（cn-north-4）”区域调用。](tag:hws)**
     * **[公网域名为全局资源，请选择“亚太-新加坡（ap-southeast-3）”区域调用。](tag:hws_hk)**
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdatePublicRecordsetsTaskRequest 请求对象
     * @return AsyncInvoker<BatchUpdatePublicRecordsetsTaskRequest, BatchUpdatePublicRecordsetsTaskResponse>
     */
    public AsyncInvoker<BatchUpdatePublicRecordsetsTaskRequest, BatchUpdatePublicRecordsetsTaskResponse> batchUpdatePublicRecordsetsTaskAsyncInvoker(
        BatchUpdatePublicRecordsetsTaskRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.batchUpdatePublicRecordsetsTask, hcClient);
    }

    /**
     * 创建公网子域名授权
     *
     * 当创建子域名时提示“域名与其他租户冲突，你需要添加TXT授权校验”，通过调用当前接口生成子域名授权的TXT记录验证信息。
     * 
     * **[公网域名为全局资源，请选择“华北-北京四（cn-north-4）”区域调用。](tag:hws)**
     * **[公网域名为全局资源，请选择“亚太-新加坡（ap-southeast-3）”区域调用。](tag:hws_hk)**
     * 
     * &gt; TXT记录验证信息生成后，请前往主域名所属的DNS服务商处添加相应的TXT类型解析记录，主机记录和记录值与验证信息保持一致。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAuthorizeTxtRecordRequest 请求对象
     * @return CompletableFuture<CreateAuthorizeTxtRecordResponse>
     */
    public CompletableFuture<CreateAuthorizeTxtRecordResponse> createAuthorizeTxtRecordAsync(
        CreateAuthorizeTxtRecordRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.createAuthorizeTxtRecord);
    }

    /**
     * 创建公网子域名授权
     *
     * 当创建子域名时提示“域名与其他租户冲突，你需要添加TXT授权校验”，通过调用当前接口生成子域名授权的TXT记录验证信息。
     * 
     * **[公网域名为全局资源，请选择“华北-北京四（cn-north-4）”区域调用。](tag:hws)**
     * **[公网域名为全局资源，请选择“亚太-新加坡（ap-southeast-3）”区域调用。](tag:hws_hk)**
     * 
     * &gt; TXT记录验证信息生成后，请前往主域名所属的DNS服务商处添加相应的TXT类型解析记录，主机记录和记录值与验证信息保持一致。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAuthorizeTxtRecordRequest 请求对象
     * @return AsyncInvoker<CreateAuthorizeTxtRecordRequest, CreateAuthorizeTxtRecordResponse>
     */
    public AsyncInvoker<CreateAuthorizeTxtRecordRequest, CreateAuthorizeTxtRecordResponse> createAuthorizeTxtRecordAsyncInvoker(
        CreateAuthorizeTxtRecordRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.createAuthorizeTxtRecord, hcClient);
    }

    /**
     * 验证公网子域名授权
     *
     * 用户在主域名所属DNS服务商处添加TXT类型解析记录后，调用当前接口验证子域名授权状态。
     * 
     * **[公网域名为全局资源，请选择“华北-北京四（cn-north-4）”区域调用。](tag:hws)**
     * **[公网域名为全局资源，请选择“亚太-新加坡（ap-southeast-3）”区域调用。](tag:hws_hk)**
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAuthorizeTxtRecordVerificationRequest 请求对象
     * @return CompletableFuture<CreateAuthorizeTxtRecordVerificationResponse>
     */
    public CompletableFuture<CreateAuthorizeTxtRecordVerificationResponse> createAuthorizeTxtRecordVerificationAsync(
        CreateAuthorizeTxtRecordVerificationRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.createAuthorizeTxtRecordVerification);
    }

    /**
     * 验证公网子域名授权
     *
     * 用户在主域名所属DNS服务商处添加TXT类型解析记录后，调用当前接口验证子域名授权状态。
     * 
     * **[公网域名为全局资源，请选择“华北-北京四（cn-north-4）”区域调用。](tag:hws)**
     * **[公网域名为全局资源，请选择“亚太-新加坡（ap-southeast-3）”区域调用。](tag:hws_hk)**
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateAuthorizeTxtRecordVerificationRequest 请求对象
     * @return AsyncInvoker<CreateAuthorizeTxtRecordVerificationRequest, CreateAuthorizeTxtRecordVerificationResponse>
     */
    public AsyncInvoker<CreateAuthorizeTxtRecordVerificationRequest, CreateAuthorizeTxtRecordVerificationResponse> createAuthorizeTxtRecordVerificationAsyncInvoker(
        CreateAuthorizeTxtRecordVerificationRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.createAuthorizeTxtRecordVerification, hcClient);
    }

    /**
     * 创建自定义线路
     *
     * 创建自定义线路。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCustomLineRequest 请求对象
     * @return CompletableFuture<CreateCustomLineResponse>
     */
    public CompletableFuture<CreateCustomLineResponse> createCustomLineAsync(CreateCustomLineRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.createCustomLine);
    }

    /**
     * 创建自定义线路
     *
     * 创建自定义线路。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCustomLineRequest 请求对象
     * @return AsyncInvoker<CreateCustomLineRequest, CreateCustomLineResponse>
     */
    public AsyncInvoker<CreateCustomLineRequest, CreateCustomLineResponse> createCustomLineAsyncInvoker(
        CreateCustomLineRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.createCustomLine, hcClient);
    }

    /**
     * 创建终端节点
     *
     * 创建终端节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEndpointRequest 请求对象
     * @return CompletableFuture<CreateEndpointResponse>
     */
    public CompletableFuture<CreateEndpointResponse> createEndpointAsync(CreateEndpointRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.createEndpoint);
    }

    /**
     * 创建终端节点
     *
     * 创建终端节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEndpointRequest 请求对象
     * @return AsyncInvoker<CreateEndpointRequest, CreateEndpointResponse>
     */
    public AsyncInvoker<CreateEndpointRequest, CreateEndpointResponse> createEndpointAsyncInvoker(
        CreateEndpointRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.createEndpoint, hcClient);
    }

    /**
     * 创建线路分组
     *
     * 创建线路分组。该接口部分区域未上线，如需使用请提交工单申请开通。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLineGroupRequest 请求对象
     * @return CompletableFuture<CreateLineGroupResponse>
     */
    public CompletableFuture<CreateLineGroupResponse> createLineGroupAsync(CreateLineGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.createLineGroup);
    }

    /**
     * 创建线路分组
     *
     * 创建线路分组。该接口部分区域未上线，如需使用请提交工单申请开通。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateLineGroupRequest 请求对象
     * @return AsyncInvoker<CreateLineGroupRequest, CreateLineGroupResponse>
     */
    public AsyncInvoker<CreateLineGroupRequest, CreateLineGroupResponse> createLineGroupAsyncInvoker(
        CreateLineGroupRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.createLineGroup, hcClient);
    }

    /**
     * 创建内网域名
     *
     * 内网域名是指在VPC中生效的域名，内网域名创建后，用户可以将其与私网IP地址相关联，为云服务提供VPC内的内网域名解析服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePrivateZoneRequest 请求对象
     * @return CompletableFuture<CreatePrivateZoneResponse>
     */
    public CompletableFuture<CreatePrivateZoneResponse> createPrivateZoneAsync(CreatePrivateZoneRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.createPrivateZone);
    }

    /**
     * 创建内网域名
     *
     * 内网域名是指在VPC中生效的域名，内网域名创建后，用户可以将其与私网IP地址相关联，为云服务提供VPC内的内网域名解析服务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePrivateZoneRequest 请求对象
     * @return AsyncInvoker<CreatePrivateZoneRequest, CreatePrivateZoneResponse>
     */
    public AsyncInvoker<CreatePrivateZoneRequest, CreatePrivateZoneResponse> createPrivateZoneAsyncInvoker(
        CreatePrivateZoneRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.createPrivateZone, hcClient);
    }

    /**
     * 创建公网域名
     *
     * 您在使用华为云云解析服务为自己注册的域名配置DNS解析之前，需要先将域名添加至云解析服务控制台。
     * 
     * **[公网域名为全局资源，请选择“华北-北京四（cn-north-4）”区域调用。](tag:hws)**
     * **[公网域名为全局资源，请选择“亚太-新加坡（ap-southeast-3）”区域调用。](tag:hws_hk)**
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePublicZoneRequest 请求对象
     * @return CompletableFuture<CreatePublicZoneResponse>
     */
    public CompletableFuture<CreatePublicZoneResponse> createPublicZoneAsync(CreatePublicZoneRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.createPublicZone);
    }

    /**
     * 创建公网域名
     *
     * 您在使用华为云云解析服务为自己注册的域名配置DNS解析之前，需要先将域名添加至云解析服务控制台。
     * 
     * **[公网域名为全局资源，请选择“华北-北京四（cn-north-4）”区域调用。](tag:hws)**
     * **[公网域名为全局资源，请选择“亚太-新加坡（ap-southeast-3）”区域调用。](tag:hws_hk)**
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePublicZoneRequest 请求对象
     * @return AsyncInvoker<CreatePublicZoneRequest, CreatePublicZoneResponse>
     */
    public AsyncInvoker<CreatePublicZoneRequest, CreatePublicZoneResponse> createPublicZoneAsyncInvoker(
        CreatePublicZoneRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.createPublicZone, hcClient);
    }

    /**
     * 创建解析器访问日志
     *
     * 创建解析器访问日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateResolverQueryLogConfigRequest 请求对象
     * @return CompletableFuture<CreateResolverQueryLogConfigResponse>
     */
    public CompletableFuture<CreateResolverQueryLogConfigResponse> createResolverQueryLogConfigAsync(
        CreateResolverQueryLogConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.createResolverQueryLogConfig);
    }

    /**
     * 创建解析器访问日志
     *
     * 创建解析器访问日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateResolverQueryLogConfigRequest 请求对象
     * @return AsyncInvoker<CreateResolverQueryLogConfigRequest, CreateResolverQueryLogConfigResponse>
     */
    public AsyncInvoker<CreateResolverQueryLogConfigRequest, CreateResolverQueryLogConfigResponse> createResolverQueryLogConfigAsyncInvoker(
        CreateResolverQueryLogConfigRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.createResolverQueryLogConfig, hcClient);
    }

    /**
     * 创建解析器转发规则
     *
     * 创建解析器转发规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateResolverRuleRequest 请求对象
     * @return CompletableFuture<CreateResolverRuleResponse>
     */
    public CompletableFuture<CreateResolverRuleResponse> createResolverRuleAsync(CreateResolverRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.createResolverRule);
    }

    /**
     * 创建解析器转发规则
     *
     * 创建解析器转发规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateResolverRuleRequest 请求对象
     * @return AsyncInvoker<CreateResolverRuleRequest, CreateResolverRuleResponse>
     */
    public AsyncInvoker<CreateResolverRuleRequest, CreateResolverRuleResponse> createResolverRuleAsyncInvoker(
        CreateResolverRuleRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.createResolverRule, hcClient);
    }

    /**
     * 创建公网域名找回
     *
     * 创建公网域名找回请求。
     * 
     * **[公网域名为全局资源，请选择“华北-北京四（cn-north-4）”区域调用。](tag:hws)**
     * **[公网域名为全局资源，请选择“亚太-新加坡（ap-southeast-3）”区域调用。](tag:hws_hk)**
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRetrievalRequest 请求对象
     * @return CompletableFuture<CreateRetrievalResponse>
     */
    public CompletableFuture<CreateRetrievalResponse> createRetrievalAsync(CreateRetrievalRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.createRetrieval);
    }

    /**
     * 创建公网域名找回
     *
     * 创建公网域名找回请求。
     * 
     * **[公网域名为全局资源，请选择“华北-北京四（cn-north-4）”区域调用。](tag:hws)**
     * **[公网域名为全局资源，请选择“亚太-新加坡（ap-southeast-3）”区域调用。](tag:hws_hk)**
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRetrievalRequest 请求对象
     * @return AsyncInvoker<CreateRetrievalRequest, CreateRetrievalResponse>
     */
    public AsyncInvoker<CreateRetrievalRequest, CreateRetrievalResponse> createRetrievalAsyncInvoker(
        CreateRetrievalRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.createRetrieval, hcClient);
    }

    /**
     * 验证公网域名找回
     *
     * 验证公网域名找回。
     * 
     * **[公网域名为全局资源，请选择“华北-北京四（cn-north-4）”区域调用。](tag:hws)**
     * **[公网域名为全局资源，请选择“亚太-新加坡（ap-southeast-3）”区域调用。](tag:hws_hk)**
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRetrievalVerificationRequest 请求对象
     * @return CompletableFuture<CreateRetrievalVerificationResponse>
     */
    public CompletableFuture<CreateRetrievalVerificationResponse> createRetrievalVerificationAsync(
        CreateRetrievalVerificationRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.createRetrievalVerification);
    }

    /**
     * 验证公网域名找回
     *
     * 验证公网域名找回。
     * 
     * **[公网域名为全局资源，请选择“华北-北京四（cn-north-4）”区域调用。](tag:hws)**
     * **[公网域名为全局资源，请选择“亚太-新加坡（ap-southeast-3）”区域调用。](tag:hws_hk)**
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRetrievalVerificationRequest 请求对象
     * @return AsyncInvoker<CreateRetrievalVerificationRequest, CreateRetrievalVerificationResponse>
     */
    public AsyncInvoker<CreateRetrievalVerificationRequest, CreateRetrievalVerificationResponse> createRetrievalVerificationAsyncInvoker(
        CreateRetrievalVerificationRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.createRetrievalVerification, hcClient);
    }

    /**
     * 为指定实例添加标签
     *
     * 为指定实例添加标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTagRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTagRequest 请求对象
     * @return AsyncInvoker<CreateTagRequest, CreateTagResponse>
     */
    public AsyncInvoker<CreateTagRequest, CreateTagResponse> createTagAsyncInvoker(CreateTagRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.createTag, hcClient);
    }

    /**
     * 删除自定义线路
     *
     * 删除自定义线路。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCustomLineRequest 请求对象
     * @return CompletableFuture<DeleteCustomLineResponse>
     */
    public CompletableFuture<DeleteCustomLineResponse> deleteCustomLineAsync(DeleteCustomLineRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.deleteCustomLine);
    }

    /**
     * 删除自定义线路
     *
     * 删除自定义线路。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteCustomLineRequest 请求对象
     * @return AsyncInvoker<DeleteCustomLineRequest, DeleteCustomLineResponse>
     */
    public AsyncInvoker<DeleteCustomLineRequest, DeleteCustomLineResponse> deleteCustomLineAsyncInvoker(
        DeleteCustomLineRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.deleteCustomLine, hcClient);
    }

    /**
     * 删除终端节点
     *
     * 删除终端节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEndpointRequest 请求对象
     * @return CompletableFuture<DeleteEndpointResponse>
     */
    public CompletableFuture<DeleteEndpointResponse> deleteEndpointAsync(DeleteEndpointRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.deleteEndpoint);
    }

    /**
     * 删除终端节点
     *
     * 删除终端节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteEndpointRequest 请求对象
     * @return AsyncInvoker<DeleteEndpointRequest, DeleteEndpointResponse>
     */
    public AsyncInvoker<DeleteEndpointRequest, DeleteEndpointResponse> deleteEndpointAsyncInvoker(
        DeleteEndpointRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.deleteEndpoint, hcClient);
    }

    /**
     * 删除线路分组
     *
     * 删除线路分组。该接口部分区域未上线，如需使用请提交工单申请开通。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLineGroupRequest 请求对象
     * @return CompletableFuture<DeleteLineGroupResponse>
     */
    public CompletableFuture<DeleteLineGroupResponse> deleteLineGroupAsync(DeleteLineGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.deleteLineGroup);
    }

    /**
     * 删除线路分组
     *
     * 删除线路分组。该接口部分区域未上线，如需使用请提交工单申请开通。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteLineGroupRequest 请求对象
     * @return AsyncInvoker<DeleteLineGroupRequest, DeleteLineGroupResponse>
     */
    public AsyncInvoker<DeleteLineGroupRequest, DeleteLineGroupResponse> deleteLineGroupAsyncInvoker(
        DeleteLineGroupRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.deleteLineGroup, hcClient);
    }

    /**
     * 删除内网域名
     *
     * 当您的内网域名不再使用时，您可以通过调用此接口将其删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePrivateZoneRequest 请求对象
     * @return CompletableFuture<DeletePrivateZoneResponse>
     */
    public CompletableFuture<DeletePrivateZoneResponse> deletePrivateZoneAsync(DeletePrivateZoneRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.deletePrivateZone);
    }

    /**
     * 删除内网域名
     *
     * 当您的内网域名不再使用时，您可以通过调用此接口将其删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePrivateZoneRequest 请求对象
     * @return AsyncInvoker<DeletePrivateZoneRequest, DeletePrivateZoneResponse>
     */
    public AsyncInvoker<DeletePrivateZoneRequest, DeletePrivateZoneResponse> deletePrivateZoneAsyncInvoker(
        DeletePrivateZoneRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.deletePrivateZone, hcClient);
    }

    /**
     * 删除公网域名
     *
     * 当您的公网域名不再使用时，您可以通过调用此接口将其删除。
     * 
     * **[公网域名为全局资源，请选择“华北-北京四（cn-north-4）”区域调用。](tag:hws)**
     * **[公网域名为全局资源，请选择“亚太-新加坡（ap-southeast-3）”区域调用。](tag:hws_hk)**
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePublicZoneRequest 请求对象
     * @return CompletableFuture<DeletePublicZoneResponse>
     */
    public CompletableFuture<DeletePublicZoneResponse> deletePublicZoneAsync(DeletePublicZoneRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.deletePublicZone);
    }

    /**
     * 删除公网域名
     *
     * 当您的公网域名不再使用时，您可以通过调用此接口将其删除。
     * 
     * **[公网域名为全局资源，请选择“华北-北京四（cn-north-4）”区域调用。](tag:hws)**
     * **[公网域名为全局资源，请选择“亚太-新加坡（ap-southeast-3）”区域调用。](tag:hws_hk)**
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePublicZoneRequest 请求对象
     * @return AsyncInvoker<DeletePublicZoneRequest, DeletePublicZoneResponse>
     */
    public AsyncInvoker<DeletePublicZoneRequest, DeletePublicZoneResponse> deletePublicZoneAsyncInvoker(
        DeletePublicZoneRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.deletePublicZone, hcClient);
    }

    /**
     * 删除解析器访问日志
     *
     * 删除解析器访问日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteResolverQueryLogConfigRequest 请求对象
     * @return CompletableFuture<DeleteResolverQueryLogConfigResponse>
     */
    public CompletableFuture<DeleteResolverQueryLogConfigResponse> deleteResolverQueryLogConfigAsync(
        DeleteResolverQueryLogConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.deleteResolverQueryLogConfig);
    }

    /**
     * 删除解析器访问日志
     *
     * 删除解析器访问日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteResolverQueryLogConfigRequest 请求对象
     * @return AsyncInvoker<DeleteResolverQueryLogConfigRequest, DeleteResolverQueryLogConfigResponse>
     */
    public AsyncInvoker<DeleteResolverQueryLogConfigRequest, DeleteResolverQueryLogConfigResponse> deleteResolverQueryLogConfigAsyncInvoker(
        DeleteResolverQueryLogConfigRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.deleteResolverQueryLogConfig, hcClient);
    }

    /**
     * 删除解析器转发规则
     *
     * 删除解析器转发规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteResolverRuleRequest 请求对象
     * @return CompletableFuture<DeleteResolverRuleResponse>
     */
    public CompletableFuture<DeleteResolverRuleResponse> deleteResolverRuleAsync(DeleteResolverRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.deleteResolverRule);
    }

    /**
     * 删除解析器转发规则
     *
     * 删除解析器转发规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteResolverRuleRequest 请求对象
     * @return AsyncInvoker<DeleteResolverRuleRequest, DeleteResolverRuleResponse>
     */
    public AsyncInvoker<DeleteResolverRuleRequest, DeleteResolverRuleResponse> deleteResolverRuleAsyncInvoker(
        DeleteResolverRuleRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.deleteResolverRule, hcClient);
    }

    /**
     * 删除资源标签
     *
     * 删除资源标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTagRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTagRequest 请求对象
     * @return AsyncInvoker<DeleteTagRequest, DeleteTagResponse>
     */
    public AsyncInvoker<DeleteTagRequest, DeleteTagResponse> deleteTagAsyncInvoker(DeleteTagRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.deleteTag, hcClient);
    }

    /**
     * 终端节点解绑IP地址
     *
     * 终端节点解绑IP地址。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateEndpointIpaddressRequest 请求对象
     * @return CompletableFuture<DisassociateEndpointIpaddressResponse>
     */
    public CompletableFuture<DisassociateEndpointIpaddressResponse> disassociateEndpointIpaddressAsync(
        DisassociateEndpointIpaddressRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.disassociateEndpointIpaddress);
    }

    /**
     * 终端节点解绑IP地址
     *
     * 终端节点解绑IP地址。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateEndpointIpaddressRequest 请求对象
     * @return AsyncInvoker<DisassociateEndpointIpaddressRequest, DisassociateEndpointIpaddressResponse>
     */
    public AsyncInvoker<DisassociateEndpointIpaddressRequest, DisassociateEndpointIpaddressResponse> disassociateEndpointIpaddressAsyncInvoker(
        DisassociateEndpointIpaddressRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.disassociateEndpointIpaddress, hcClient);
    }

    /**
     * 解析器访问日志解关联VPC
     *
     * 解析器访问日志解关联VPC。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateResolverQueryLogConfigRequest 请求对象
     * @return CompletableFuture<DisassociateResolverQueryLogConfigResponse>
     */
    public CompletableFuture<DisassociateResolverQueryLogConfigResponse> disassociateResolverQueryLogConfigAsync(
        DisassociateResolverQueryLogConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.disassociateResolverQueryLogConfig);
    }

    /**
     * 解析器访问日志解关联VPC
     *
     * 解析器访问日志解关联VPC。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateResolverQueryLogConfigRequest 请求对象
     * @return AsyncInvoker<DisassociateResolverQueryLogConfigRequest, DisassociateResolverQueryLogConfigResponse>
     */
    public AsyncInvoker<DisassociateResolverQueryLogConfigRequest, DisassociateResolverQueryLogConfigResponse> disassociateResolverQueryLogConfigAsyncInvoker(
        DisassociateResolverQueryLogConfigRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.disassociateResolverQueryLogConfig, hcClient);
    }

    /**
     * 解析器转发规则解关联VPC
     *
     * 解析器转发规则解关联VPC。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateResolverRuleRouterRequest 请求对象
     * @return CompletableFuture<DisassociateResolverRuleRouterResponse>
     */
    public CompletableFuture<DisassociateResolverRuleRouterResponse> disassociateResolverRuleRouterAsync(
        DisassociateResolverRuleRouterRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.disassociateResolverRuleRouter);
    }

    /**
     * 解析器转发规则解关联VPC
     *
     * 解析器转发规则解关联VPC。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateResolverRuleRouterRequest 请求对象
     * @return AsyncInvoker<DisassociateResolverRuleRouterRequest, DisassociateResolverRuleRouterResponse>
     */
    public AsyncInvoker<DisassociateResolverRuleRouterRequest, DisassociateResolverRuleRouterResponse> disassociateResolverRuleRouterAsyncInvoker(
        DisassociateResolverRuleRouterRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.disassociateResolverRuleRouter, hcClient);
    }

    /**
     * 在内网域名上解关联VPC
     *
     * 当您的内网域名创建完成后，可以通过调用此接口为内网域名解除已关联的VPC。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateRouterRequest 请求对象
     * @return CompletableFuture<DisassociateRouterResponse>
     */
    public CompletableFuture<DisassociateRouterResponse> disassociateRouterAsync(DisassociateRouterRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.disassociateRouter);
    }

    /**
     * 在内网域名上解关联VPC
     *
     * 当您的内网域名创建完成后，可以通过调用此接口为内网域名解除已关联的VPC。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisassociateRouterRequest 请求对象
     * @return AsyncInvoker<DisassociateRouterRequest, DisassociateRouterResponse>
     */
    public AsyncInvoker<DisassociateRouterRequest, DisassociateRouterResponse> disassociateRouterAsyncInvoker(
        DisassociateRouterRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.disassociateRouter, hcClient);
    }

    /**
     * 查询API版本信息列表
     *
     * 查询云解析服务支持的所有API版本信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiVersionsRequest 请求对象
     * @return CompletableFuture<ListApiVersionsResponse>
     */
    public CompletableFuture<ListApiVersionsResponse> listApiVersionsAsync(ListApiVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.listApiVersions);
    }

    /**
     * 查询API版本信息列表
     *
     * 查询云解析服务支持的所有API版本信息列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListApiVersionsRequest 请求对象
     * @return AsyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse>
     */
    public AsyncInvoker<ListApiVersionsRequest, ListApiVersionsResponse> listApiVersionsAsyncInvoker(
        ListApiVersionsRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.listApiVersions, hcClient);
    }

    /**
     * 查询批量操作任务列表
     *
     * 查询批量操作任务列表。
     * 
     * **[公网域名为全局资源，请选择“华北-北京四（cn-north-4）”区域调用。](tag:hws)**
     * **[公网域名为全局资源，请选择“亚太-新加坡（ap-southeast-3）”区域调用。](tag:hws_hk)**
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBatchOperationTasksRequest 请求对象
     * @return CompletableFuture<ListBatchOperationTasksResponse>
     */
    public CompletableFuture<ListBatchOperationTasksResponse> listBatchOperationTasksAsync(
        ListBatchOperationTasksRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.listBatchOperationTasks);
    }

    /**
     * 查询批量操作任务列表
     *
     * 查询批量操作任务列表。
     * 
     * **[公网域名为全局资源，请选择“华北-北京四（cn-north-4）”区域调用。](tag:hws)**
     * **[公网域名为全局资源，请选择“亚太-新加坡（ap-southeast-3）”区域调用。](tag:hws_hk)**
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBatchOperationTasksRequest 请求对象
     * @return AsyncInvoker<ListBatchOperationTasksRequest, ListBatchOperationTasksResponse>
     */
    public AsyncInvoker<ListBatchOperationTasksRequest, ListBatchOperationTasksResponse> listBatchOperationTasksAsyncInvoker(
        ListBatchOperationTasksRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.listBatchOperationTasks, hcClient);
    }

    /**
     * 查询自定义线路
     *
     * 查询自定义线路。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCustomLineRequest 请求对象
     * @return CompletableFuture<ListCustomLineResponse>
     */
    public CompletableFuture<ListCustomLineResponse> listCustomLineAsync(ListCustomLineRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.listCustomLine);
    }

    /**
     * 查询自定义线路
     *
     * 查询自定义线路。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCustomLineRequest 请求对象
     * @return AsyncInvoker<ListCustomLineRequest, ListCustomLineResponse>
     */
    public AsyncInvoker<ListCustomLineRequest, ListCustomLineResponse> listCustomLineAsyncInvoker(
        ListCustomLineRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.listCustomLine, hcClient);
    }

    /**
     * 查询IP地址列表
     *
     * 查询终端节点下的IP地址列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEndpointIpaddressesRequest 请求对象
     * @return CompletableFuture<ListEndpointIpaddressesResponse>
     */
    public CompletableFuture<ListEndpointIpaddressesResponse> listEndpointIpaddressesAsync(
        ListEndpointIpaddressesRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.listEndpointIpaddresses);
    }

    /**
     * 查询IP地址列表
     *
     * 查询终端节点下的IP地址列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEndpointIpaddressesRequest 请求对象
     * @return AsyncInvoker<ListEndpointIpaddressesRequest, ListEndpointIpaddressesResponse>
     */
    public AsyncInvoker<ListEndpointIpaddressesRequest, ListEndpointIpaddressesResponse> listEndpointIpaddressesAsyncInvoker(
        ListEndpointIpaddressesRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.listEndpointIpaddresses, hcClient);
    }

    /**
     * 查询终端节点VPC列表
     *
     * 查询终端节点VPC列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEndpointVpcsRequest 请求对象
     * @return CompletableFuture<ListEndpointVpcsResponse>
     */
    public CompletableFuture<ListEndpointVpcsResponse> listEndpointVpcsAsync(ListEndpointVpcsRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.listEndpointVpcs);
    }

    /**
     * 查询终端节点VPC列表
     *
     * 查询终端节点VPC列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEndpointVpcsRequest 请求对象
     * @return AsyncInvoker<ListEndpointVpcsRequest, ListEndpointVpcsResponse>
     */
    public AsyncInvoker<ListEndpointVpcsRequest, ListEndpointVpcsResponse> listEndpointVpcsAsyncInvoker(
        ListEndpointVpcsRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.listEndpointVpcs, hcClient);
    }

    /**
     * 查询终端节点列表
     *
     * 查询终端节点列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEndpointsRequest 请求对象
     * @return CompletableFuture<ListEndpointsResponse>
     */
    public CompletableFuture<ListEndpointsResponse> listEndpointsAsync(ListEndpointsRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.listEndpoints);
    }

    /**
     * 查询终端节点列表
     *
     * 查询终端节点列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListEndpointsRequest 请求对象
     * @return AsyncInvoker<ListEndpointsRequest, ListEndpointsResponse>
     */
    public AsyncInvoker<ListEndpointsRequest, ListEndpointsResponse> listEndpointsAsyncInvoker(
        ListEndpointsRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.listEndpoints, hcClient);
    }

    /**
     * 查询线路分组列表
     *
     * 查询线路分组列表。该接口部分区域未上线，如需使用请提交工单申请开通。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLineGroupsRequest 请求对象
     * @return CompletableFuture<ListLineGroupsResponse>
     */
    public CompletableFuture<ListLineGroupsResponse> listLineGroupsAsync(ListLineGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.listLineGroups);
    }

    /**
     * 查询线路分组列表
     *
     * 查询线路分组列表。该接口部分区域未上线，如需使用请提交工单申请开通。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLineGroupsRequest 请求对象
     * @return AsyncInvoker<ListLineGroupsRequest, ListLineGroupsResponse>
     */
    public AsyncInvoker<ListLineGroupsRequest, ListLineGroupsResponse> listLineGroupsAsyncInvoker(
        ListLineGroupsRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.listLineGroups, hcClient);
    }

    /**
     * 查询名称服务器列表
     *
     * 查询名称服务器列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNameServersRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListNameServersRequest 请求对象
     * @return AsyncInvoker<ListNameServersRequest, ListNameServersResponse>
     */
    public AsyncInvoker<ListNameServersRequest, ListNameServersResponse> listNameServersAsyncInvoker(
        ListNameServersRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.listNameServers, hcClient);
    }

    /**
     * 查询内网域名列表
     *
     * 当您的内网域名创建成功后，您可以通过调用此接口查询单个内网域名信息，包括域名、ID、状态、记录集个数、企业项目、标签、TTL、创建时间、修改时间、描述等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPrivateZonesRequest 请求对象
     * @return CompletableFuture<ListPrivateZonesResponse>
     */
    public CompletableFuture<ListPrivateZonesResponse> listPrivateZonesAsync(ListPrivateZonesRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.listPrivateZones);
    }

    /**
     * 查询内网域名列表
     *
     * 当您的内网域名创建成功后，您可以通过调用此接口查询单个内网域名信息，包括域名、ID、状态、记录集个数、企业项目、标签、TTL、创建时间、修改时间、描述等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPrivateZonesRequest 请求对象
     * @return AsyncInvoker<ListPrivateZonesRequest, ListPrivateZonesResponse>
     */
    public AsyncInvoker<ListPrivateZonesRequest, ListPrivateZonesResponse> listPrivateZonesAsyncInvoker(
        ListPrivateZonesRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.listPrivateZones, hcClient);
    }

    /**
     * 查询公网域名列表
     *
     * 当您的公网域名创建成功后，您可以通过调用此接口查询所有公网域名信息，包括域名、ID、状态、记录集个数、企业项目、标签、TTL、创建时间、修改时间、描述等。
     * 
     * **[公网域名为全局资源，请选择“华北-北京四（cn-north-4）”区域调用。](tag:hws)**
     * **[公网域名为全局资源，请选择“亚太-新加坡（ap-southeast-3）”区域调用。](tag:hws_hk)**
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPublicZonesRequest 请求对象
     * @return CompletableFuture<ListPublicZonesResponse>
     */
    public CompletableFuture<ListPublicZonesResponse> listPublicZonesAsync(ListPublicZonesRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.listPublicZones);
    }

    /**
     * 查询公网域名列表
     *
     * 当您的公网域名创建成功后，您可以通过调用此接口查询所有公网域名信息，包括域名、ID、状态、记录集个数、企业项目、标签、TTL、创建时间、修改时间、描述等。
     * 
     * **[公网域名为全局资源，请选择“华北-北京四（cn-north-4）”区域调用。](tag:hws)**
     * **[公网域名为全局资源，请选择“亚太-新加坡（ap-southeast-3）”区域调用。](tag:hws_hk)**
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPublicZonesRequest 请求对象
     * @return AsyncInvoker<ListPublicZonesRequest, ListPublicZonesResponse>
     */
    public AsyncInvoker<ListPublicZonesRequest, ListPublicZonesResponse> listPublicZonesAsyncInvoker(
        ListPublicZonesRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.listPublicZones, hcClient);
    }

    /**
     * 查询解析器访问日志列表
     *
     * 查询解析器访问日志列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResolverQueryLogConfigsRequest 请求对象
     * @return CompletableFuture<ListResolverQueryLogConfigsResponse>
     */
    public CompletableFuture<ListResolverQueryLogConfigsResponse> listResolverQueryLogConfigsAsync(
        ListResolverQueryLogConfigsRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.listResolverQueryLogConfigs);
    }

    /**
     * 查询解析器访问日志列表
     *
     * 查询解析器访问日志列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResolverQueryLogConfigsRequest 请求对象
     * @return AsyncInvoker<ListResolverQueryLogConfigsRequest, ListResolverQueryLogConfigsResponse>
     */
    public AsyncInvoker<ListResolverQueryLogConfigsRequest, ListResolverQueryLogConfigsResponse> listResolverQueryLogConfigsAsyncInvoker(
        ListResolverQueryLogConfigsRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.listResolverQueryLogConfigs, hcClient);
    }

    /**
     * 查询解析器转发规则列表
     *
     * 查询解析器转发规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResolverRulesRequest 请求对象
     * @return CompletableFuture<ListResolverRulesResponse>
     */
    public CompletableFuture<ListResolverRulesResponse> listResolverRulesAsync(ListResolverRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.listResolverRules);
    }

    /**
     * 查询解析器转发规则列表
     *
     * 查询解析器转发规则列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListResolverRulesRequest 请求对象
     * @return AsyncInvoker<ListResolverRulesRequest, ListResolverRulesResponse>
     */
    public AsyncInvoker<ListResolverRulesRequest, ListResolverRulesResponse> listResolverRulesAsyncInvoker(
        ListResolverRulesRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.listResolverRules, hcClient);
    }

    /**
     * 使用标签查询资源实例
     *
     * 使用标签查询资源实例
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagRequest 请求对象
     * @return AsyncInvoker<ListTagRequest, ListTagResponse>
     */
    public AsyncInvoker<ListTagRequest, ListTagResponse> listTagAsyncInvoker(ListTagRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.listTag, hcClient);
    }

    /**
     * 查询指定实例类型的所有标签集合
     *
     * 查询指定实例类型的所有标签集合
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagsRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagsRequest 请求对象
     * @return AsyncInvoker<ListTagsRequest, ListTagsResponse>
     */
    public AsyncInvoker<ListTagsRequest, ListTagsResponse> listTagsAsyncInvoker(ListTagsRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.listTags, hcClient);
    }

    /**
     * 设置内网域名的子域名递归解析代理
     *
     * 当您的内网域名创建成功后，您可以通过调用此接口设置开启或者关闭内网域名的子域名递归解析代理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetPrivateZoneProxyPatternRequest 请求对象
     * @return CompletableFuture<SetPrivateZoneProxyPatternResponse>
     */
    public CompletableFuture<SetPrivateZoneProxyPatternResponse> setPrivateZoneProxyPatternAsync(
        SetPrivateZoneProxyPatternRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.setPrivateZoneProxyPattern);
    }

    /**
     * 设置内网域名的子域名递归解析代理
     *
     * 当您的内网域名创建成功后，您可以通过调用此接口设置开启或者关闭内网域名的子域名递归解析代理。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetPrivateZoneProxyPatternRequest 请求对象
     * @return AsyncInvoker<SetPrivateZoneProxyPatternRequest, SetPrivateZoneProxyPatternResponse>
     */
    public AsyncInvoker<SetPrivateZoneProxyPatternRequest, SetPrivateZoneProxyPatternResponse> setPrivateZoneProxyPatternAsyncInvoker(
        SetPrivateZoneProxyPatternRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.setPrivateZoneProxyPattern, hcClient);
    }

    /**
     * 查询指定版本号的API版本信息
     *
     * 查询指定版本号的云解析服务API版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApiInfoRequest 请求对象
     * @return CompletableFuture<ShowApiInfoResponse>
     */
    public CompletableFuture<ShowApiInfoResponse> showApiInfoAsync(ShowApiInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.showApiInfo);
    }

    /**
     * 查询指定版本号的API版本信息
     *
     * 查询指定版本号的云解析服务API版本信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowApiInfoRequest 请求对象
     * @return AsyncInvoker<ShowApiInfoRequest, ShowApiInfoResponse>
     */
    public AsyncInvoker<ShowApiInfoRequest, ShowApiInfoResponse> showApiInfoAsyncInvoker(ShowApiInfoRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.showApiInfo, hcClient);
    }

    /**
     * 查询公网子域名授权
     *
     * 查询已生成的子域名授权TXT记录验证信息。
     * 
     * **[公网域名为全局资源，请选择“华北-北京四（cn-north-4）”区域调用。](tag:hws)**
     * **[公网域名为全局资源，请选择“亚太-新加坡（ap-southeast-3）”区域调用。](tag:hws_hk)**
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuthorizeTxtRecordRequest 请求对象
     * @return CompletableFuture<ShowAuthorizeTxtRecordResponse>
     */
    public CompletableFuture<ShowAuthorizeTxtRecordResponse> showAuthorizeTxtRecordAsync(
        ShowAuthorizeTxtRecordRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.showAuthorizeTxtRecord);
    }

    /**
     * 查询公网子域名授权
     *
     * 查询已生成的子域名授权TXT记录验证信息。
     * 
     * **[公网域名为全局资源，请选择“华北-北京四（cn-north-4）”区域调用。](tag:hws)**
     * **[公网域名为全局资源，请选择“亚太-新加坡（ap-southeast-3）”区域调用。](tag:hws_hk)**
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAuthorizeTxtRecordRequest 请求对象
     * @return AsyncInvoker<ShowAuthorizeTxtRecordRequest, ShowAuthorizeTxtRecordResponse>
     */
    public AsyncInvoker<ShowAuthorizeTxtRecordRequest, ShowAuthorizeTxtRecordResponse> showAuthorizeTxtRecordAsyncInvoker(
        ShowAuthorizeTxtRecordRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.showAuthorizeTxtRecord, hcClient);
    }

    /**
     * 查询批量操作任务
     *
     * 查询批量操作任务，分页返回失败条目。
     * 
     * **[公网域名为全局资源，请选择“华北-北京四（cn-north-4）”区域调用。](tag:hws)**
     * **[公网域名为全局资源，请选择“亚太-新加坡（ap-southeast-3）”区域调用。](tag:hws_hk)**
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBatchOperationTaskRequest 请求对象
     * @return CompletableFuture<ShowBatchOperationTaskResponse>
     */
    public CompletableFuture<ShowBatchOperationTaskResponse> showBatchOperationTaskAsync(
        ShowBatchOperationTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.showBatchOperationTask);
    }

    /**
     * 查询批量操作任务
     *
     * 查询批量操作任务，分页返回失败条目。
     * 
     * **[公网域名为全局资源，请选择“华北-北京四（cn-north-4）”区域调用。](tag:hws)**
     * **[公网域名为全局资源，请选择“亚太-新加坡（ap-southeast-3）”区域调用。](tag:hws_hk)**
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBatchOperationTaskRequest 请求对象
     * @return AsyncInvoker<ShowBatchOperationTaskRequest, ShowBatchOperationTaskResponse>
     */
    public AsyncInvoker<ShowBatchOperationTaskRequest, ShowBatchOperationTaskResponse> showBatchOperationTaskAsyncInvoker(
        ShowBatchOperationTaskRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.showBatchOperationTask, hcClient);
    }

    /**
     * 查询公网域名的域名诊断
     *
     * 查询公网域名的域名诊断。
     * 
     * **[公网域名为全局资源，请选择“华北-北京四（cn-north-4）”区域调用。](tag:hws)**
     * **[公网域名为全局资源，请选择“亚太-新加坡（ap-southeast-3）”区域调用。](tag:hws_hk)**
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainDetectionRequest 请求对象
     * @return CompletableFuture<ShowDomainDetectionResponse>
     */
    public CompletableFuture<ShowDomainDetectionResponse> showDomainDetectionAsync(ShowDomainDetectionRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.showDomainDetection);
    }

    /**
     * 查询公网域名的域名诊断
     *
     * 查询公网域名的域名诊断。
     * 
     * **[公网域名为全局资源，请选择“华北-北京四（cn-north-4）”区域调用。](tag:hws)**
     * **[公网域名为全局资源，请选择“亚太-新加坡（ap-southeast-3）”区域调用。](tag:hws_hk)**
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainDetectionRequest 请求对象
     * @return AsyncInvoker<ShowDomainDetectionRequest, ShowDomainDetectionResponse>
     */
    public AsyncInvoker<ShowDomainDetectionRequest, ShowDomainDetectionResponse> showDomainDetectionAsyncInvoker(
        ShowDomainDetectionRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.showDomainDetection, hcClient);
    }

    /**
     * 查询租户配额
     *
     * 查询租户在DNS服务下的资源配额，包括公网域名配额、内网域名配额、记录集配额、反向解析配额、自定义线路配额、线路分组配额、入站终端节点配额、出站终端节点配额、转发规则配额等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainQuotaRequest 请求对象
     * @return CompletableFuture<ShowDomainQuotaResponse>
     */
    public CompletableFuture<ShowDomainQuotaResponse> showDomainQuotaAsync(ShowDomainQuotaRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.showDomainQuota);
    }

    /**
     * 查询租户配额
     *
     * 查询租户在DNS服务下的资源配额，包括公网域名配额、内网域名配额、记录集配额、反向解析配额、自定义线路配额、线路分组配额、入站终端节点配额、出站终端节点配额、转发规则配额等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDomainQuotaRequest 请求对象
     * @return AsyncInvoker<ShowDomainQuotaRequest, ShowDomainQuotaResponse>
     */
    public AsyncInvoker<ShowDomainQuotaRequest, ShowDomainQuotaResponse> showDomainQuotaAsyncInvoker(
        ShowDomainQuotaRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.showDomainQuota, hcClient);
    }

    /**
     * 查询公网域名的邮箱域名
     *
     * 查询公网域名的邮箱域名。
     * 
     * **[公网域名为全局资源，请选择“华北-北京四（cn-north-4）”区域调用。](tag:hws)**
     * **[公网域名为全局资源，请选择“亚太-新加坡（ap-southeast-3）”区域调用。](tag:hws_hk)**
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEmailRecordSetRequest 请求对象
     * @return CompletableFuture<ShowEmailRecordSetResponse>
     */
    public CompletableFuture<ShowEmailRecordSetResponse> showEmailRecordSetAsync(ShowEmailRecordSetRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.showEmailRecordSet);
    }

    /**
     * 查询公网域名的邮箱域名
     *
     * 查询公网域名的邮箱域名。
     * 
     * **[公网域名为全局资源，请选择“华北-北京四（cn-north-4）”区域调用。](tag:hws)**
     * **[公网域名为全局资源，请选择“亚太-新加坡（ap-southeast-3）”区域调用。](tag:hws_hk)**
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEmailRecordSetRequest 请求对象
     * @return AsyncInvoker<ShowEmailRecordSetRequest, ShowEmailRecordSetResponse>
     */
    public AsyncInvoker<ShowEmailRecordSetRequest, ShowEmailRecordSetResponse> showEmailRecordSetAsyncInvoker(
        ShowEmailRecordSetRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.showEmailRecordSet, hcClient);
    }

    /**
     * 查询终端节点
     *
     * 查询终端节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEndpointRequest 请求对象
     * @return CompletableFuture<ShowEndpointResponse>
     */
    public CompletableFuture<ShowEndpointResponse> showEndpointAsync(ShowEndpointRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.showEndpoint);
    }

    /**
     * 查询终端节点
     *
     * 查询终端节点。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowEndpointRequest 请求对象
     * @return AsyncInvoker<ShowEndpointRequest, ShowEndpointResponse>
     */
    public AsyncInvoker<ShowEndpointRequest, ShowEndpointResponse> showEndpointAsyncInvoker(
        ShowEndpointRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.showEndpoint, hcClient);
    }

    /**
     * 查询线路分组
     *
     * 查询线路分组。该接口部分区域未上线，如需使用请提交工单申请开通。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLineGroupRequest 请求对象
     * @return CompletableFuture<ShowLineGroupResponse>
     */
    public CompletableFuture<ShowLineGroupResponse> showLineGroupAsync(ShowLineGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.showLineGroup);
    }

    /**
     * 查询线路分组
     *
     * 查询线路分组。该接口部分区域未上线，如需使用请提交工单申请开通。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLineGroupRequest 请求对象
     * @return AsyncInvoker<ShowLineGroupRequest, ShowLineGroupResponse>
     */
    public AsyncInvoker<ShowLineGroupRequest, ShowLineGroupResponse> showLineGroupAsyncInvoker(
        ShowLineGroupRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.showLineGroup, hcClient);
    }

    /**
     * 查询内网域名
     *
     * 当您的内网域名创建成功后，您可以通过调用此接口查询单个内网域名信息，包括域名、ID、状态、记录集个数、企业项目、标签、TTL、创建时间、修改时间、描述等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPrivateZoneRequest 请求对象
     * @return CompletableFuture<ShowPrivateZoneResponse>
     */
    public CompletableFuture<ShowPrivateZoneResponse> showPrivateZoneAsync(ShowPrivateZoneRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.showPrivateZone);
    }

    /**
     * 查询内网域名
     *
     * 当您的内网域名创建成功后，您可以通过调用此接口查询单个内网域名信息，包括域名、ID、状态、记录集个数、企业项目、标签、TTL、创建时间、修改时间、描述等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPrivateZoneRequest 请求对象
     * @return AsyncInvoker<ShowPrivateZoneRequest, ShowPrivateZoneResponse>
     */
    public AsyncInvoker<ShowPrivateZoneRequest, ShowPrivateZoneResponse> showPrivateZoneAsyncInvoker(
        ShowPrivateZoneRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.showPrivateZone, hcClient);
    }

    /**
     * 查询内网域名的名称服务器
     *
     * 当您的内网域名创建成功后，您可以通过调用此接口查询内网域名的名称服务器信息，包括优先级、DNS服务器地址等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPrivateZoneNameServerRequest 请求对象
     * @return CompletableFuture<ShowPrivateZoneNameServerResponse>
     */
    public CompletableFuture<ShowPrivateZoneNameServerResponse> showPrivateZoneNameServerAsync(
        ShowPrivateZoneNameServerRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.showPrivateZoneNameServer);
    }

    /**
     * 查询内网域名的名称服务器
     *
     * 当您的内网域名创建成功后，您可以通过调用此接口查询内网域名的名称服务器信息，包括优先级、DNS服务器地址等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPrivateZoneNameServerRequest 请求对象
     * @return AsyncInvoker<ShowPrivateZoneNameServerRequest, ShowPrivateZoneNameServerResponse>
     */
    public AsyncInvoker<ShowPrivateZoneNameServerRequest, ShowPrivateZoneNameServerResponse> showPrivateZoneNameServerAsyncInvoker(
        ShowPrivateZoneNameServerRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.showPrivateZoneNameServer, hcClient);
    }

    /**
     * 查询公网域名
     *
     * 当您的公网域名创建成功后，您可以通过调用此接口查询单个公网域名信息，包括域名、ID、状态、记录集个数、企业项目、标签、TTL、创建时间、修改时间、描述等。
     * 
     * **[公网域名为全局资源，请选择“华北-北京四（cn-north-4）”区域调用。](tag:hws)**
     * **[公网域名为全局资源，请选择“亚太-新加坡（ap-southeast-3）”区域调用。](tag:hws_hk)**
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPublicZoneRequest 请求对象
     * @return CompletableFuture<ShowPublicZoneResponse>
     */
    public CompletableFuture<ShowPublicZoneResponse> showPublicZoneAsync(ShowPublicZoneRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.showPublicZone);
    }

    /**
     * 查询公网域名
     *
     * 当您的公网域名创建成功后，您可以通过调用此接口查询单个公网域名信息，包括域名、ID、状态、记录集个数、企业项目、标签、TTL、创建时间、修改时间、描述等。
     * 
     * **[公网域名为全局资源，请选择“华北-北京四（cn-north-4）”区域调用。](tag:hws)**
     * **[公网域名为全局资源，请选择“亚太-新加坡（ap-southeast-3）”区域调用。](tag:hws_hk)**
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPublicZoneRequest 请求对象
     * @return AsyncInvoker<ShowPublicZoneRequest, ShowPublicZoneResponse>
     */
    public AsyncInvoker<ShowPublicZoneRequest, ShowPublicZoneResponse> showPublicZoneAsyncInvoker(
        ShowPublicZoneRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.showPublicZone, hcClient);
    }

    /**
     * 查询公网域名的名称服务器
     *
     * 当您的公网域名创建成功后，您可以通过调用此接口查询公网域名的名称服务器信息，包括主机名、优先级等。
     * 
     * **[公网域名为全局资源，请选择“华北-北京四（cn-north-4）”区域调用。](tag:hws)**
     * **[公网域名为全局资源，请选择“亚太-新加坡（ap-southeast-3）”区域调用。](tag:hws_hk)**
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPublicZoneNameServerRequest 请求对象
     * @return CompletableFuture<ShowPublicZoneNameServerResponse>
     */
    public CompletableFuture<ShowPublicZoneNameServerResponse> showPublicZoneNameServerAsync(
        ShowPublicZoneNameServerRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.showPublicZoneNameServer);
    }

    /**
     * 查询公网域名的名称服务器
     *
     * 当您的公网域名创建成功后，您可以通过调用此接口查询公网域名的名称服务器信息，包括主机名、优先级等。
     * 
     * **[公网域名为全局资源，请选择“华北-北京四（cn-north-4）”区域调用。](tag:hws)**
     * **[公网域名为全局资源，请选择“亚太-新加坡（ap-southeast-3）”区域调用。](tag:hws_hk)**
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPublicZoneNameServerRequest 请求对象
     * @return AsyncInvoker<ShowPublicZoneNameServerRequest, ShowPublicZoneNameServerResponse>
     */
    public AsyncInvoker<ShowPublicZoneNameServerRequest, ShowPublicZoneNameServerResponse> showPublicZoneNameServerAsyncInvoker(
        ShowPublicZoneNameServerRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.showPublicZoneNameServer, hcClient);
    }

    /**
     * 查询解析器访问日志
     *
     * 查询解析器访问日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResolverQueryLogConfigRequest 请求对象
     * @return CompletableFuture<ShowResolverQueryLogConfigResponse>
     */
    public CompletableFuture<ShowResolverQueryLogConfigResponse> showResolverQueryLogConfigAsync(
        ShowResolverQueryLogConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.showResolverQueryLogConfig);
    }

    /**
     * 查询解析器访问日志
     *
     * 查询解析器访问日志。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResolverQueryLogConfigRequest 请求对象
     * @return AsyncInvoker<ShowResolverQueryLogConfigRequest, ShowResolverQueryLogConfigResponse>
     */
    public AsyncInvoker<ShowResolverQueryLogConfigRequest, ShowResolverQueryLogConfigResponse> showResolverQueryLogConfigAsyncInvoker(
        ShowResolverQueryLogConfigRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.showResolverQueryLogConfig, hcClient);
    }

    /**
     * 查询解析器转发规则
     *
     * 查询解析器转发规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResolverRuleRequest 请求对象
     * @return CompletableFuture<ShowResolverRuleResponse>
     */
    public CompletableFuture<ShowResolverRuleResponse> showResolverRuleAsync(ShowResolverRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.showResolverRule);
    }

    /**
     * 查询解析器转发规则
     *
     * 查询解析器转发规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResolverRuleRequest 请求对象
     * @return AsyncInvoker<ShowResolverRuleRequest, ShowResolverRuleResponse>
     */
    public AsyncInvoker<ShowResolverRuleRequest, ShowResolverRuleResponse> showResolverRuleAsyncInvoker(
        ShowResolverRuleRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.showResolverRule, hcClient);
    }

    /**
     * 查询指定实例的标签信息
     *
     * 查询指定实例的标签信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceTagRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourceTagRequest 请求对象
     * @return AsyncInvoker<ShowResourceTagRequest, ShowResourceTagResponse>
     */
    public AsyncInvoker<ShowResourceTagRequest, ShowResourceTagResponse> showResourceTagAsyncInvoker(
        ShowResourceTagRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.showResourceTag, hcClient);
    }

    /**
     * 查询公网域名找回
     *
     * 查询公网域名找回请求。
     * 
     * **[公网域名为全局资源，请选择“华北-北京四（cn-north-4）”区域调用。](tag:hws)**
     * **[公网域名为全局资源，请选择“亚太-新加坡（ap-southeast-3）”区域调用。](tag:hws_hk)**
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRetrievalRequest 请求对象
     * @return CompletableFuture<ShowRetrievalResponse>
     */
    public CompletableFuture<ShowRetrievalResponse> showRetrievalAsync(ShowRetrievalRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.showRetrieval);
    }

    /**
     * 查询公网域名找回
     *
     * 查询公网域名找回请求。
     * 
     * **[公网域名为全局资源，请选择“华北-北京四（cn-north-4）”区域调用。](tag:hws)**
     * **[公网域名为全局资源，请选择“亚太-新加坡（ap-southeast-3）”区域调用。](tag:hws_hk)**
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRetrievalRequest 请求对象
     * @return AsyncInvoker<ShowRetrievalRequest, ShowRetrievalResponse>
     */
    public AsyncInvoker<ShowRetrievalRequest, ShowRetrievalResponse> showRetrievalAsyncInvoker(
        ShowRetrievalRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.showRetrieval, hcClient);
    }

    /**
     * 查询公网域名找回结果
     *
     * 查询公网域名找回结果。
     * 
     * **[公网域名为全局资源，请选择“华北-北京四（cn-north-4）”区域调用。](tag:hws)**
     * **[公网域名为全局资源，请选择“亚太-新加坡（ap-southeast-3）”区域调用。](tag:hws_hk)**
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRetrievalVerificationRequest 请求对象
     * @return CompletableFuture<ShowRetrievalVerificationResponse>
     */
    public CompletableFuture<ShowRetrievalVerificationResponse> showRetrievalVerificationAsync(
        ShowRetrievalVerificationRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.showRetrievalVerification);
    }

    /**
     * 查询公网域名找回结果
     *
     * 查询公网域名找回结果。
     * 
     * **[公网域名为全局资源，请选择“华北-北京四（cn-north-4）”区域调用。](tag:hws)**
     * **[公网域名为全局资源，请选择“亚太-新加坡（ap-southeast-3）”区域调用。](tag:hws_hk)**
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRetrievalVerificationRequest 请求对象
     * @return AsyncInvoker<ShowRetrievalVerificationRequest, ShowRetrievalVerificationResponse>
     */
    public AsyncInvoker<ShowRetrievalVerificationRequest, ShowRetrievalVerificationResponse> showRetrievalVerificationAsyncInvoker(
        ShowRetrievalVerificationRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.showRetrievalVerification, hcClient);
    }

    /**
     * 查询公网域名的网站域名
     *
     * 查询公网域名的网站域名。
     * 
     * **[公网域名为全局资源，请选择“华北-北京四（cn-north-4）”区域调用。](tag:hws)**
     * **[公网域名为全局资源，请选择“亚太-新加坡（ap-southeast-3）”区域调用。](tag:hws_hk)**
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWebsiteRecordSetRequest 请求对象
     * @return CompletableFuture<ShowWebsiteRecordSetResponse>
     */
    public CompletableFuture<ShowWebsiteRecordSetResponse> showWebsiteRecordSetAsync(
        ShowWebsiteRecordSetRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.showWebsiteRecordSet);
    }

    /**
     * 查询公网域名的网站域名
     *
     * 查询公网域名的网站域名。
     * 
     * **[公网域名为全局资源，请选择“华北-北京四（cn-north-4）”区域调用。](tag:hws)**
     * **[公网域名为全局资源，请选择“亚太-新加坡（ap-southeast-3）”区域调用。](tag:hws_hk)**
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowWebsiteRecordSetRequest 请求对象
     * @return AsyncInvoker<ShowWebsiteRecordSetRequest, ShowWebsiteRecordSetResponse>
     */
    public AsyncInvoker<ShowWebsiteRecordSetRequest, ShowWebsiteRecordSetResponse> showWebsiteRecordSetAsyncInvoker(
        ShowWebsiteRecordSetRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.showWebsiteRecordSet, hcClient);
    }

    /**
     * 查询公网域名的DNS服务器地址
     *
     * 查询域名当前DNS服务器地址及华为云提供的DNS服务器地址。
     * 
     * **[公网域名为全局资源，请选择“华北-北京四（cn-north-4）”区域调用。](tag:hws)**
     * **[公网域名为全局资源，请选择“亚太-新加坡（ap-southeast-3）”区域调用。](tag:hws_hk)**
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowZoneNameServerRequest 请求对象
     * @return CompletableFuture<ShowZoneNameServerResponse>
     */
    public CompletableFuture<ShowZoneNameServerResponse> showZoneNameServerAsync(ShowZoneNameServerRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.showZoneNameServer);
    }

    /**
     * 查询公网域名的DNS服务器地址
     *
     * 查询域名当前DNS服务器地址及华为云提供的DNS服务器地址。
     * 
     * **[公网域名为全局资源，请选择“华北-北京四（cn-north-4）”区域调用。](tag:hws)**
     * **[公网域名为全局资源，请选择“亚太-新加坡（ap-southeast-3）”区域调用。](tag:hws_hk)**
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowZoneNameServerRequest 请求对象
     * @return AsyncInvoker<ShowZoneNameServerRequest, ShowZoneNameServerResponse>
     */
    public AsyncInvoker<ShowZoneNameServerRequest, ShowZoneNameServerResponse> showZoneNameServerAsyncInvoker(
        ShowZoneNameServerRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.showZoneNameServer, hcClient);
    }

    /**
     * 修改自定义线路
     *
     * 修改自定义线路。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCustomLineRequest 请求对象
     * @return CompletableFuture<UpdateCustomLineResponse>
     */
    public CompletableFuture<UpdateCustomLineResponse> updateCustomLineAsync(UpdateCustomLineRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.updateCustomLine);
    }

    /**
     * 修改自定义线路
     *
     * 修改自定义线路。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateCustomLineRequest 请求对象
     * @return AsyncInvoker<UpdateCustomLineRequest, UpdateCustomLineResponse>
     */
    public AsyncInvoker<UpdateCustomLineRequest, UpdateCustomLineResponse> updateCustomLineAsyncInvoker(
        UpdateCustomLineRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.updateCustomLine, hcClient);
    }

    /**
     * 修改终端节点
     *
     * 修改终端节点
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEndpointRequest 请求对象
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
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateEndpointRequest 请求对象
     * @return AsyncInvoker<UpdateEndpointRequest, UpdateEndpointResponse>
     */
    public AsyncInvoker<UpdateEndpointRequest, UpdateEndpointResponse> updateEndpointAsyncInvoker(
        UpdateEndpointRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.updateEndpoint, hcClient);
    }

    /**
     * 修改线路分组
     *
     * 修改线路分组。该接口部分区域未上线，如需使用请提交工单申请开通。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLineGroupsRequest 请求对象
     * @return CompletableFuture<UpdateLineGroupsResponse>
     */
    public CompletableFuture<UpdateLineGroupsResponse> updateLineGroupsAsync(UpdateLineGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.updateLineGroups);
    }

    /**
     * 修改线路分组
     *
     * 修改线路分组。该接口部分区域未上线，如需使用请提交工单申请开通。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateLineGroupsRequest 请求对象
     * @return AsyncInvoker<UpdateLineGroupsRequest, UpdateLineGroupsResponse>
     */
    public AsyncInvoker<UpdateLineGroupsRequest, UpdateLineGroupsResponse> updateLineGroupsAsyncInvoker(
        UpdateLineGroupsRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.updateLineGroups, hcClient);
    }

    /**
     * 修改内网域名
     *
     * 当您的内网域名创建成功后，您可以通过调用此接口修改内网域名的基本信息，包括TTL、描述等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePrivateZoneRequest 请求对象
     * @return CompletableFuture<UpdatePrivateZoneResponse>
     */
    public CompletableFuture<UpdatePrivateZoneResponse> updatePrivateZoneAsync(UpdatePrivateZoneRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.updatePrivateZone);
    }

    /**
     * 修改内网域名
     *
     * 当您的内网域名创建成功后，您可以通过调用此接口修改内网域名的基本信息，包括TTL、描述等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePrivateZoneRequest 请求对象
     * @return AsyncInvoker<UpdatePrivateZoneRequest, UpdatePrivateZoneResponse>
     */
    public AsyncInvoker<UpdatePrivateZoneRequest, UpdatePrivateZoneResponse> updatePrivateZoneAsyncInvoker(
        UpdatePrivateZoneRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.updatePrivateZone, hcClient);
    }

    /**
     * 设置内网域名状态
     *
     * 当您的内网域名创建成功后，您可以通过调用此接口设置内网域名的状态，包括暂停、启用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePrivateZoneStatusRequest 请求对象
     * @return CompletableFuture<UpdatePrivateZoneStatusResponse>
     */
    public CompletableFuture<UpdatePrivateZoneStatusResponse> updatePrivateZoneStatusAsync(
        UpdatePrivateZoneStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.updatePrivateZoneStatus);
    }

    /**
     * 设置内网域名状态
     *
     * 当您的内网域名创建成功后，您可以通过调用此接口设置内网域名的状态，包括暂停、启用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePrivateZoneStatusRequest 请求对象
     * @return AsyncInvoker<UpdatePrivateZoneStatusRequest, UpdatePrivateZoneStatusResponse>
     */
    public AsyncInvoker<UpdatePrivateZoneStatusRequest, UpdatePrivateZoneStatusResponse> updatePrivateZoneStatusAsyncInvoker(
        UpdatePrivateZoneStatusRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.updatePrivateZoneStatus, hcClient);
    }

    /**
     * 修改公网域名
     *
     * 当您的公网域名创建成功后，您可以通过调用此接口修改公网域名的基本信息，包括TTL、描述等。
     * 
     * **[公网域名为全局资源，请选择“华北-北京四（cn-north-4）”区域调用。](tag:hws)**
     * **[公网域名为全局资源，请选择“亚太-新加坡（ap-southeast-3）”区域调用。](tag:hws_hk)**
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePublicZoneRequest 请求对象
     * @return CompletableFuture<UpdatePublicZoneResponse>
     */
    public CompletableFuture<UpdatePublicZoneResponse> updatePublicZoneAsync(UpdatePublicZoneRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.updatePublicZone);
    }

    /**
     * 修改公网域名
     *
     * 当您的公网域名创建成功后，您可以通过调用此接口修改公网域名的基本信息，包括TTL、描述等。
     * 
     * **[公网域名为全局资源，请选择“华北-北京四（cn-north-4）”区域调用。](tag:hws)**
     * **[公网域名为全局资源，请选择“亚太-新加坡（ap-southeast-3）”区域调用。](tag:hws_hk)**
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePublicZoneRequest 请求对象
     * @return AsyncInvoker<UpdatePublicZoneRequest, UpdatePublicZoneResponse>
     */
    public AsyncInvoker<UpdatePublicZoneRequest, UpdatePublicZoneResponse> updatePublicZoneAsyncInvoker(
        UpdatePublicZoneRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.updatePublicZone, hcClient);
    }

    /**
     * 设置公网域名状态
     *
     * 当您的公网域名创建成功后，您可以通过调用此接口设置公网域名的状态，包括暂停、启用。
     * 
     * **[公网域名为全局资源，请选择“华北-北京四（cn-north-4）”区域调用。](tag:hws)**
     * **[公网域名为全局资源，请选择“亚太-新加坡（ap-southeast-3）”区域调用。](tag:hws_hk)**
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePublicZoneStatusRequest 请求对象
     * @return CompletableFuture<UpdatePublicZoneStatusResponse>
     */
    public CompletableFuture<UpdatePublicZoneStatusResponse> updatePublicZoneStatusAsync(
        UpdatePublicZoneStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.updatePublicZoneStatus);
    }

    /**
     * 设置公网域名状态
     *
     * 当您的公网域名创建成功后，您可以通过调用此接口设置公网域名的状态，包括暂停、启用。
     * 
     * **[公网域名为全局资源，请选择“华北-北京四（cn-north-4）”区域调用。](tag:hws)**
     * **[公网域名为全局资源，请选择“亚太-新加坡（ap-southeast-3）”区域调用。](tag:hws_hk)**
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePublicZoneStatusRequest 请求对象
     * @return AsyncInvoker<UpdatePublicZoneStatusRequest, UpdatePublicZoneStatusResponse>
     */
    public AsyncInvoker<UpdatePublicZoneStatusRequest, UpdatePublicZoneStatusResponse> updatePublicZoneStatusAsyncInvoker(
        UpdatePublicZoneStatusRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.updatePublicZoneStatus, hcClient);
    }

    /**
     * 修改解析器转发规则
     *
     * 修改解析器转发规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateResolverRuleRequest 请求对象
     * @return CompletableFuture<UpdateResolverRuleResponse>
     */
    public CompletableFuture<UpdateResolverRuleResponse> updateResolverRuleAsync(UpdateResolverRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.updateResolverRule);
    }

    /**
     * 修改解析器转发规则
     *
     * 修改解析器转发规则。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateResolverRuleRequest 请求对象
     * @return AsyncInvoker<UpdateResolverRuleRequest, UpdateResolverRuleResponse>
     */
    public AsyncInvoker<UpdateResolverRuleRequest, UpdateResolverRuleResponse> updateResolverRuleAsyncInvoker(
        UpdateResolverRuleRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.updateResolverRule, hcClient);
    }

    /**
     * 关闭DNSSEC
     *
     * 关闭公网域名的DNSSEC。
     * 
     * **[公网域名为全局资源，请选择“华北-北京四（cn-north-4）”区域调用。](tag:hws)**
     * **[公网域名为全局资源，请选择“亚太-新加坡（ap-southeast-3）”区域调用。](tag:hws_hk)**
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableDnssecConfigRequest 请求对象
     * @return CompletableFuture<DisableDnssecConfigResponse>
     */
    public CompletableFuture<DisableDnssecConfigResponse> disableDnssecConfigAsync(DisableDnssecConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.disableDnssecConfig);
    }

    /**
     * 关闭DNSSEC
     *
     * 关闭公网域名的DNSSEC。
     * 
     * **[公网域名为全局资源，请选择“华北-北京四（cn-north-4）”区域调用。](tag:hws)**
     * **[公网域名为全局资源，请选择“亚太-新加坡（ap-southeast-3）”区域调用。](tag:hws_hk)**
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DisableDnssecConfigRequest 请求对象
     * @return AsyncInvoker<DisableDnssecConfigRequest, DisableDnssecConfigResponse>
     */
    public AsyncInvoker<DisableDnssecConfigRequest, DisableDnssecConfigResponse> disableDnssecConfigAsyncInvoker(
        DisableDnssecConfigRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.disableDnssecConfig, hcClient);
    }

    /**
     * 开启DNSSEC
     *
     * 开启公网域名的DNSSEC。
     * 
     * **[公网域名为全局资源，请选择“华北-北京四（cn-north-4）”区域调用。](tag:hws)**
     * **[公网域名为全局资源，请选择“亚太-新加坡（ap-southeast-3）”区域调用。](tag:hws_hk)**
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableDnssecConfigRequest 请求对象
     * @return CompletableFuture<EnableDnssecConfigResponse>
     */
    public CompletableFuture<EnableDnssecConfigResponse> enableDnssecConfigAsync(EnableDnssecConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.enableDnssecConfig);
    }

    /**
     * 开启DNSSEC
     *
     * 开启公网域名的DNSSEC。
     * 
     * **[公网域名为全局资源，请选择“华北-北京四（cn-north-4）”区域调用。](tag:hws)**
     * **[公网域名为全局资源，请选择“亚太-新加坡（ap-southeast-3）”区域调用。](tag:hws_hk)**
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request EnableDnssecConfigRequest 请求对象
     * @return AsyncInvoker<EnableDnssecConfigRequest, EnableDnssecConfigResponse>
     */
    public AsyncInvoker<EnableDnssecConfigRequest, EnableDnssecConfigResponse> enableDnssecConfigAsyncInvoker(
        EnableDnssecConfigRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.enableDnssecConfig, hcClient);
    }

    /**
     * 查询DNSSEC
     *
     * 查询公网域名的DNSSEC。
     * 
     * **[公网域名为全局资源，请选择“华北-北京四（cn-north-4）”区域调用。](tag:hws)**
     * **[公网域名为全局资源，请选择“亚太-新加坡（ap-southeast-3）”区域调用。](tag:hws_hk)**
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDnssecConfigRequest 请求对象
     * @return CompletableFuture<ShowDnssecConfigResponse>
     */
    public CompletableFuture<ShowDnssecConfigResponse> showDnssecConfigAsync(ShowDnssecConfigRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.showDnssecConfig);
    }

    /**
     * 查询DNSSEC
     *
     * 查询公网域名的DNSSEC。
     * 
     * **[公网域名为全局资源，请选择“华北-北京四（cn-north-4）”区域调用。](tag:hws)**
     * **[公网域名为全局资源，请选择“亚太-新加坡（ap-southeast-3）”区域调用。](tag:hws_hk)**
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDnssecConfigRequest 请求对象
     * @return AsyncInvoker<ShowDnssecConfigRequest, ShowDnssecConfigResponse>
     */
    public AsyncInvoker<ShowDnssecConfigRequest, ShowDnssecConfigResponse> showDnssecConfigAsyncInvoker(
        ShowDnssecConfigRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.showDnssecConfig, hcClient);
    }

    /**
     * 设置弹性公网IP的反向解析记录
     *
     * 设置弹性公网IP的反向解析记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEipRecordSetRequest 请求对象
     * @return CompletableFuture<CreateEipRecordSetResponse>
     */
    public CompletableFuture<CreateEipRecordSetResponse> createEipRecordSetAsync(CreateEipRecordSetRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.createEipRecordSet);
    }

    /**
     * 设置弹性公网IP的反向解析记录
     *
     * 设置弹性公网IP的反向解析记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateEipRecordSetRequest 请求对象
     * @return AsyncInvoker<CreateEipRecordSetRequest, CreateEipRecordSetResponse>
     */
    public AsyncInvoker<CreateEipRecordSetRequest, CreateEipRecordSetResponse> createEipRecordSetAsyncInvoker(
        CreateEipRecordSetRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.createEipRecordSet, hcClient);
    }

    /**
     * 创建记录集
     *
     * 记录集是指一组资源记录的集合，这些资源记录属于同一域名，用于定义域名支持的解析类型以及解析值。您的域名创建完成后，可以通过调用此接口为域名添加不同类型的记录集。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRecordSetRequest 请求对象
     * @return CompletableFuture<CreateRecordSetResponse>
     */
    public CompletableFuture<CreateRecordSetResponse> createRecordSetAsync(CreateRecordSetRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.createRecordSet);
    }

    /**
     * 创建记录集
     *
     * 记录集是指一组资源记录的集合，这些资源记录属于同一域名，用于定义域名支持的解析类型以及解析值。您的域名创建完成后，可以通过调用此接口为域名添加不同类型的记录集。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRecordSetRequest 请求对象
     * @return AsyncInvoker<CreateRecordSetRequest, CreateRecordSetResponse>
     */
    public AsyncInvoker<CreateRecordSetRequest, CreateRecordSetResponse> createRecordSetAsyncInvoker(
        CreateRecordSetRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.createRecordSet, hcClient);
    }

    /**
     * 删除记录集
     *
     * 当您的记录集不再使用时，您可以通过调用此接口将其删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRecordSetRequest 请求对象
     * @return CompletableFuture<DeleteRecordSetResponse>
     */
    public CompletableFuture<DeleteRecordSetResponse> deleteRecordSetAsync(DeleteRecordSetRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.deleteRecordSet);
    }

    /**
     * 删除记录集
     *
     * 当您的记录集不再使用时，您可以通过调用此接口将其删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRecordSetRequest 请求对象
     * @return AsyncInvoker<DeleteRecordSetRequest, DeleteRecordSetResponse>
     */
    public AsyncInvoker<DeleteRecordSetRequest, DeleteRecordSetResponse> deleteRecordSetAsyncInvoker(
        DeleteRecordSetRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.deleteRecordSet, hcClient);
    }

    /**
     * 查询弹性公网IP的反向解析记录列表
     *
     * 查询弹性公网IP的反向解析记录列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPtrRecordsRequest 请求对象
     * @return CompletableFuture<ListPtrRecordsResponse>
     */
    public CompletableFuture<ListPtrRecordsResponse> listPtrRecordsAsync(ListPtrRecordsRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.listPtrRecords);
    }

    /**
     * 查询弹性公网IP的反向解析记录列表
     *
     * 查询弹性公网IP的反向解析记录列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPtrRecordsRequest 请求对象
     * @return AsyncInvoker<ListPtrRecordsRequest, ListPtrRecordsResponse>
     */
    public AsyncInvoker<ListPtrRecordsRequest, ListPtrRecordsResponse> listPtrRecordsAsyncInvoker(
        ListPtrRecordsRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.listPtrRecords, hcClient);
    }

    /**
     * 查询租户记录集列表
     *
     * 当您的记录集创建成功后，您可以通过调用此接口查询所有记录集信息，包括名称、ID、状态、所属域名、解析记录值、标签、TTL、创建时间、修改时间、描述等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecordSetsRequest 请求对象
     * @return CompletableFuture<ListRecordSetsResponse>
     */
    public CompletableFuture<ListRecordSetsResponse> listRecordSetsAsync(ListRecordSetsRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.listRecordSets);
    }

    /**
     * 查询租户记录集列表
     *
     * 当您的记录集创建成功后，您可以通过调用此接口查询所有记录集信息，包括名称、ID、状态、所属域名、解析记录值、标签、TTL、创建时间、修改时间、描述等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecordSetsRequest 请求对象
     * @return AsyncInvoker<ListRecordSetsRequest, ListRecordSetsResponse>
     */
    public AsyncInvoker<ListRecordSetsRequest, ListRecordSetsResponse> listRecordSetsAsyncInvoker(
        ListRecordSetsRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.listRecordSets, hcClient);
    }

    /**
     * 查询域名下的记录集列表
     *
     * 当您的记录集创建成功后，您可以通过调用此接口查询指定域名下的所有记录集信息，包括名称、ID、状态、所属域名、解析记录值、标签、TTL、创建时间、修改时间、描述等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecordSetsByZoneRequest 请求对象
     * @return CompletableFuture<ListRecordSetsByZoneResponse>
     */
    public CompletableFuture<ListRecordSetsByZoneResponse> listRecordSetsByZoneAsync(
        ListRecordSetsByZoneRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.listRecordSetsByZone);
    }

    /**
     * 查询域名下的记录集列表
     *
     * 当您的记录集创建成功后，您可以通过调用此接口查询指定域名下的所有记录集信息，包括名称、ID、状态、所属域名、解析记录值、标签、TTL、创建时间、修改时间、描述等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecordSetsByZoneRequest 请求对象
     * @return AsyncInvoker<ListRecordSetsByZoneRequest, ListRecordSetsByZoneResponse>
     */
    public AsyncInvoker<ListRecordSetsByZoneRequest, ListRecordSetsByZoneResponse> listRecordSetsByZoneAsyncInvoker(
        ListRecordSetsByZoneRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.listRecordSetsByZone, hcClient);
    }

    /**
     * 将弹性公网IP的反向解析记录恢复为默认值
     *
     * 将弹性公网IP的反向解析记录恢复为默认值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestorePtrRecordRequest 请求对象
     * @return CompletableFuture<RestorePtrRecordResponse>
     */
    public CompletableFuture<RestorePtrRecordResponse> restorePtrRecordAsync(RestorePtrRecordRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.restorePtrRecord);
    }

    /**
     * 将弹性公网IP的反向解析记录恢复为默认值
     *
     * 将弹性公网IP的反向解析记录恢复为默认值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RestorePtrRecordRequest 请求对象
     * @return AsyncInvoker<RestorePtrRecordRequest, RestorePtrRecordResponse>
     */
    public AsyncInvoker<RestorePtrRecordRequest, RestorePtrRecordResponse> restorePtrRecordAsyncInvoker(
        RestorePtrRecordRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.restorePtrRecord, hcClient);
    }

    /**
     * 查询弹性公网IP的反向解析记录
     *
     * 查询弹性公网IP的反向解析记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPtrRecordSetRequest 请求对象
     * @return CompletableFuture<ShowPtrRecordSetResponse>
     */
    public CompletableFuture<ShowPtrRecordSetResponse> showPtrRecordSetAsync(ShowPtrRecordSetRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.showPtrRecordSet);
    }

    /**
     * 查询弹性公网IP的反向解析记录
     *
     * 查询弹性公网IP的反向解析记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPtrRecordSetRequest 请求对象
     * @return AsyncInvoker<ShowPtrRecordSetRequest, ShowPtrRecordSetResponse>
     */
    public AsyncInvoker<ShowPtrRecordSetRequest, ShowPtrRecordSetResponse> showPtrRecordSetAsyncInvoker(
        ShowPtrRecordSetRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.showPtrRecordSet, hcClient);
    }

    /**
     * 查询记录集
     *
     * 当您的记录集创建成功后，您可以通过调用此接口查询指定域名下的所有记录集信息，包括名称、ID、状态、所属域名、解析记录值、标签、TTL、创建时间、修改时间、描述等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRecordSetRequest 请求对象
     * @return CompletableFuture<ShowRecordSetResponse>
     */
    public CompletableFuture<ShowRecordSetResponse> showRecordSetAsync(ShowRecordSetRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.showRecordSet);
    }

    /**
     * 查询记录集
     *
     * 当您的记录集创建成功后，您可以通过调用此接口查询指定域名下的所有记录集信息，包括名称、ID、状态、所属域名、解析记录值、标签、TTL、创建时间、修改时间、描述等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRecordSetRequest 请求对象
     * @return AsyncInvoker<ShowRecordSetRequest, ShowRecordSetResponse>
     */
    public AsyncInvoker<ShowRecordSetRequest, ShowRecordSetResponse> showRecordSetAsyncInvoker(
        ShowRecordSetRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.showRecordSet, hcClient);
    }

    /**
     * 修改弹性公网IP的反向解析记录
     *
     * 修改弹性公网IP的反向解析记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePtrRecordRequest 请求对象
     * @return CompletableFuture<UpdatePtrRecordResponse>
     */
    public CompletableFuture<UpdatePtrRecordResponse> updatePtrRecordAsync(UpdatePtrRecordRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.updatePtrRecord);
    }

    /**
     * 修改弹性公网IP的反向解析记录
     *
     * 修改弹性公网IP的反向解析记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePtrRecordRequest 请求对象
     * @return AsyncInvoker<UpdatePtrRecordRequest, UpdatePtrRecordResponse>
     */
    public AsyncInvoker<UpdatePtrRecordRequest, UpdatePtrRecordResponse> updatePtrRecordAsyncInvoker(
        UpdatePtrRecordRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.updatePtrRecord, hcClient);
    }

    /**
     * 修改记录集
     *
     * 当您的记录集创建成功后，您可以通过调用此接口修改记录集的信息，包括域名、类型、记录值、TTL、描述等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRecordSetRequest 请求对象
     * @return CompletableFuture<UpdateRecordSetResponse>
     */
    public CompletableFuture<UpdateRecordSetResponse> updateRecordSetAsync(UpdateRecordSetRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.updateRecordSet);
    }

    /**
     * 修改记录集
     *
     * 当您的记录集创建成功后，您可以通过调用此接口修改记录集的信息，包括域名、类型、记录值、TTL、描述等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRecordSetRequest 请求对象
     * @return AsyncInvoker<UpdateRecordSetRequest, UpdateRecordSetResponse>
     */
    public AsyncInvoker<UpdateRecordSetRequest, UpdateRecordSetResponse> updateRecordSetAsyncInvoker(
        UpdateRecordSetRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.updateRecordSet, hcClient);
    }

    /**
     * 批量创建记录集
     *
     * 提交批量创建记录集任务，返回任务ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateRecordSetsTaskRequest 请求对象
     * @return CompletableFuture<BatchCreateRecordSetsTaskResponse>
     */
    public CompletableFuture<BatchCreateRecordSetsTaskResponse> batchCreateRecordSetsTaskAsync(
        BatchCreateRecordSetsTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.batchCreateRecordSetsTask);
    }

    /**
     * 批量创建记录集
     *
     * 提交批量创建记录集任务，返回任务ID。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateRecordSetsTaskRequest 请求对象
     * @return AsyncInvoker<BatchCreateRecordSetsTaskRequest, BatchCreateRecordSetsTaskResponse>
     */
    public AsyncInvoker<BatchCreateRecordSetsTaskRequest, BatchCreateRecordSetsTaskResponse> batchCreateRecordSetsTaskAsyncInvoker(
        BatchCreateRecordSetsTaskRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.batchCreateRecordSetsTask, hcClient);
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
     * @return CompletableFuture<BatchDeleteRecordSetWithLineResponse>
     */
    public CompletableFuture<BatchDeleteRecordSetWithLineResponse> batchDeleteRecordSetWithLineAsync(
        BatchDeleteRecordSetWithLineRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.batchDeleteRecordSetWithLine);
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
     * @return AsyncInvoker<BatchDeleteRecordSetWithLineRequest, BatchDeleteRecordSetWithLineResponse>
     */
    public AsyncInvoker<BatchDeleteRecordSetWithLineRequest, BatchDeleteRecordSetWithLineResponse> batchDeleteRecordSetWithLineAsyncInvoker(
        BatchDeleteRecordSetWithLineRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.batchDeleteRecordSetWithLine, hcClient);
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
     * @return CompletableFuture<BatchUpdateRecordSetWithLineResponse>
     */
    public CompletableFuture<BatchUpdateRecordSetWithLineResponse> batchUpdateRecordSetWithLineAsync(
        BatchUpdateRecordSetWithLineRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.batchUpdateRecordSetWithLine);
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
     * @return AsyncInvoker<BatchUpdateRecordSetWithLineRequest, BatchUpdateRecordSetWithLineResponse>
     */
    public AsyncInvoker<BatchUpdateRecordSetWithLineRequest, BatchUpdateRecordSetWithLineResponse> batchUpdateRecordSetWithLineAsyncInvoker(
        BatchUpdateRecordSetWithLineRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.batchUpdateRecordSetWithLine, hcClient);
    }

    /**
     * 创建弹性公网IP的反向解析记录
     *
     * 创建弹性公网IP的反向解析记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePtrRequest 请求对象
     * @return CompletableFuture<CreatePtrResponse>
     */
    public CompletableFuture<CreatePtrResponse> createPtrAsync(CreatePtrRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.createPtr);
    }

    /**
     * 创建弹性公网IP的反向解析记录
     *
     * 创建弹性公网IP的反向解析记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreatePtrRequest 请求对象
     * @return AsyncInvoker<CreatePtrRequest, CreatePtrResponse>
     */
    public AsyncInvoker<CreatePtrRequest, CreatePtrResponse> createPtrAsyncInvoker(CreatePtrRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.createPtr, hcClient);
    }

    /**
     * 批量线路创建记录集
     *
     * 批量线路创建记录集。属于原子性操作，如果存在一个参数校验不通过，则创建失败。仅公网域名支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRecordSetWithBatchLinesRequest 请求对象
     * @return CompletableFuture<CreateRecordSetWithBatchLinesResponse>
     */
    public CompletableFuture<CreateRecordSetWithBatchLinesResponse> createRecordSetWithBatchLinesAsync(
        CreateRecordSetWithBatchLinesRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.createRecordSetWithBatchLines);
    }

    /**
     * 批量线路创建记录集
     *
     * 批量线路创建记录集。属于原子性操作，如果存在一个参数校验不通过，则创建失败。仅公网域名支持。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRecordSetWithBatchLinesRequest 请求对象
     * @return AsyncInvoker<CreateRecordSetWithBatchLinesRequest, CreateRecordSetWithBatchLinesResponse>
     */
    public AsyncInvoker<CreateRecordSetWithBatchLinesRequest, CreateRecordSetWithBatchLinesResponse> createRecordSetWithBatchLinesAsyncInvoker(
        CreateRecordSetWithBatchLinesRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.createRecordSetWithBatchLines, hcClient);
    }

    /**
     * 创建记录集
     *
     * 记录集是指一组资源记录的集合，这些资源记录属于同一域名，用于定义域名支持的解析类型以及解析值。您的域名创建完成后，可以通过调用此接口为域名添加不同类型的记录集。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRecordSetWithLineRequest 请求对象
     * @return CompletableFuture<CreateRecordSetWithLineResponse>
     */
    public CompletableFuture<CreateRecordSetWithLineResponse> createRecordSetWithLineAsync(
        CreateRecordSetWithLineRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.createRecordSetWithLine);
    }

    /**
     * 创建记录集
     *
     * 记录集是指一组资源记录的集合，这些资源记录属于同一域名，用于定义域名支持的解析类型以及解析值。您的域名创建完成后，可以通过调用此接口为域名添加不同类型的记录集。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRecordSetWithLineRequest 请求对象
     * @return AsyncInvoker<CreateRecordSetWithLineRequest, CreateRecordSetWithLineResponse>
     */
    public AsyncInvoker<CreateRecordSetWithLineRequest, CreateRecordSetWithLineResponse> createRecordSetWithLineAsyncInvoker(
        CreateRecordSetWithLineRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.createRecordSetWithLine, hcClient);
    }

    /**
     * 删除批量创建记录集任务
     *
     * 删除批量创建记录集任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBatchCreateRecordSetsTaskRequest 请求对象
     * @return CompletableFuture<DeleteBatchCreateRecordSetsTaskResponse>
     */
    public CompletableFuture<DeleteBatchCreateRecordSetsTaskResponse> deleteBatchCreateRecordSetsTaskAsync(
        DeleteBatchCreateRecordSetsTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.deleteBatchCreateRecordSetsTask);
    }

    /**
     * 删除批量创建记录集任务
     *
     * 删除批量创建记录集任务。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBatchCreateRecordSetsTaskRequest 请求对象
     * @return AsyncInvoker<DeleteBatchCreateRecordSetsTaskRequest, DeleteBatchCreateRecordSetsTaskResponse>
     */
    public AsyncInvoker<DeleteBatchCreateRecordSetsTaskRequest, DeleteBatchCreateRecordSetsTaskResponse> deleteBatchCreateRecordSetsTaskAsyncInvoker(
        DeleteBatchCreateRecordSetsTaskRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.deleteBatchCreateRecordSetsTask, hcClient);
    }

    /**
     * 将弹性公网IP的反向解析记录恢复为默认值
     *
     * 将弹性公网IP的反向解析记录恢复为默认值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePtrRequest 请求对象
     * @return CompletableFuture<DeletePtrResponse>
     */
    public CompletableFuture<DeletePtrResponse> deletePtrAsync(DeletePtrRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.deletePtr);
    }

    /**
     * 将弹性公网IP的反向解析记录恢复为默认值
     *
     * 将弹性公网IP的反向解析记录恢复为默认值。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeletePtrRequest 请求对象
     * @return AsyncInvoker<DeletePtrRequest, DeletePtrResponse>
     */
    public AsyncInvoker<DeletePtrRequest, DeletePtrResponse> deletePtrAsyncInvoker(DeletePtrRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.deletePtr, hcClient);
    }

    /**
     * 删除记录集
     *
     * 当您的记录集不再使用时，您可以通过调用此接口将其删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRecordSetsRequest 请求对象
     * @return CompletableFuture<DeleteRecordSetsResponse>
     */
    public CompletableFuture<DeleteRecordSetsResponse> deleteRecordSetsAsync(DeleteRecordSetsRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.deleteRecordSets);
    }

    /**
     * 删除记录集
     *
     * 当您的记录集不再使用时，您可以通过调用此接口将其删除。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRecordSetsRequest 请求对象
     * @return AsyncInvoker<DeleteRecordSetsRequest, DeleteRecordSetsResponse>
     */
    public AsyncInvoker<DeleteRecordSetsRequest, DeleteRecordSetsResponse> deleteRecordSetsAsyncInvoker(
        DeleteRecordSetsRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.deleteRecordSets, hcClient);
    }

    /**
     * 查询弹性公网IP的反向解析记录列表
     *
     * 查询弹性公网IP的反向解析记录列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPtrsRequest 请求对象
     * @return CompletableFuture<ListPtrsResponse>
     */
    public CompletableFuture<ListPtrsResponse> listPtrsAsync(ListPtrsRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.listPtrs);
    }

    /**
     * 查询弹性公网IP的反向解析记录列表
     *
     * 查询弹性公网IP的反向解析记录列表。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPtrsRequest 请求对象
     * @return AsyncInvoker<ListPtrsRequest, ListPtrsResponse>
     */
    public AsyncInvoker<ListPtrsRequest, ListPtrsResponse> listPtrsAsyncInvoker(ListPtrsRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.listPtrs, hcClient);
    }

    /**
     * 查询公网域名的线路列表
     *
     * 公网域名支持设置线路解析，当您的公网域名创建完成并添加记录集时，可通过调用此接口查询公网域名的所有解析线路。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPublicZoneLinesRequest 请求对象
     * @return CompletableFuture<ListPublicZoneLinesResponse>
     */
    public CompletableFuture<ListPublicZoneLinesResponse> listPublicZoneLinesAsync(ListPublicZoneLinesRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.listPublicZoneLines);
    }

    /**
     * 查询公网域名的线路列表
     *
     * 公网域名支持设置线路解析，当您的公网域名创建完成并添加记录集时，可通过调用此接口查询公网域名的所有解析线路。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPublicZoneLinesRequest 请求对象
     * @return AsyncInvoker<ListPublicZoneLinesRequest, ListPublicZoneLinesResponse>
     */
    public AsyncInvoker<ListPublicZoneLinesRequest, ListPublicZoneLinesResponse> listPublicZoneLinesAsyncInvoker(
        ListPublicZoneLinesRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.listPublicZoneLines, hcClient);
    }

    /**
     * 查询租户记录集列表
     *
     * 当您的记录集创建成功后，您可以通过调用此接口查询所有记录集信息，包括名称、ID、状态、所属域名、解析记录值、标签、TTL、创建时间、修改时间、描述等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecordSetsWithLineRequest 请求对象
     * @return CompletableFuture<ListRecordSetsWithLineResponse>
     */
    public CompletableFuture<ListRecordSetsWithLineResponse> listRecordSetsWithLineAsync(
        ListRecordSetsWithLineRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.listRecordSetsWithLine);
    }

    /**
     * 查询租户记录集列表
     *
     * 当您的记录集创建成功后，您可以通过调用此接口查询所有记录集信息，包括名称、ID、状态、所属域名、解析记录值、标签、TTL、创建时间、修改时间、描述等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRecordSetsWithLineRequest 请求对象
     * @return AsyncInvoker<ListRecordSetsWithLineRequest, ListRecordSetsWithLineResponse>
     */
    public AsyncInvoker<ListRecordSetsWithLineRequest, ListRecordSetsWithLineResponse> listRecordSetsWithLineAsyncInvoker(
        ListRecordSetsWithLineRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.listRecordSetsWithLine, hcClient);
    }

    /**
     * 查询系统线路
     *
     * 查询系统预置解析线路。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSystemLinesRequest 请求对象
     * @return CompletableFuture<ListSystemLinesResponse>
     */
    public CompletableFuture<ListSystemLinesResponse> listSystemLinesAsync(ListSystemLinesRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.listSystemLines);
    }

    /**
     * 查询系统线路
     *
     * 查询系统预置解析线路。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSystemLinesRequest 请求对象
     * @return AsyncInvoker<ListSystemLinesRequest, ListSystemLinesResponse>
     */
    public AsyncInvoker<ListSystemLinesRequest, ListSystemLinesResponse> listSystemLinesAsyncInvoker(
        ListSystemLinesRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.listSystemLines, hcClient);
    }

    /**
     * 设置记录集状态
     *
     * 当您的记录集创建成功后，您可以通过调用此接口设置记录集的状态，包括暂停、启用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetRecordSetsStatusRequest 请求对象
     * @return CompletableFuture<SetRecordSetsStatusResponse>
     */
    public CompletableFuture<SetRecordSetsStatusResponse> setRecordSetsStatusAsync(SetRecordSetsStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.setRecordSetsStatus);
    }

    /**
     * 设置记录集状态
     *
     * 当您的记录集创建成功后，您可以通过调用此接口设置记录集的状态，包括暂停、启用。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SetRecordSetsStatusRequest 请求对象
     * @return AsyncInvoker<SetRecordSetsStatusRequest, SetRecordSetsStatusResponse>
     */
    public AsyncInvoker<SetRecordSetsStatusRequest, SetRecordSetsStatusResponse> setRecordSetsStatusAsyncInvoker(
        SetRecordSetsStatusRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.setRecordSetsStatus, hcClient);
    }

    /**
     * 查询批量创建记录集任务
     *
     * 查询批量创建记录集任务，分页返回失败条目。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBatchCreateRecordSetsTaskRequest 请求对象
     * @return CompletableFuture<ShowBatchCreateRecordSetsTaskResponse>
     */
    public CompletableFuture<ShowBatchCreateRecordSetsTaskResponse> showBatchCreateRecordSetsTaskAsync(
        ShowBatchCreateRecordSetsTaskRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.showBatchCreateRecordSetsTask);
    }

    /**
     * 查询批量创建记录集任务
     *
     * 查询批量创建记录集任务，分页返回失败条目。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBatchCreateRecordSetsTaskRequest 请求对象
     * @return AsyncInvoker<ShowBatchCreateRecordSetsTaskRequest, ShowBatchCreateRecordSetsTaskResponse>
     */
    public AsyncInvoker<ShowBatchCreateRecordSetsTaskRequest, ShowBatchCreateRecordSetsTaskResponse> showBatchCreateRecordSetsTaskAsyncInvoker(
        ShowBatchCreateRecordSetsTaskRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.showBatchCreateRecordSetsTask, hcClient);
    }

    /**
     * 查询弹性公网IP的反向解析记录
     *
     * 查询弹性公网IP的反向解析记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPtrRequest 请求对象
     * @return CompletableFuture<ShowPtrResponse>
     */
    public CompletableFuture<ShowPtrResponse> showPtrAsync(ShowPtrRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.showPtr);
    }

    /**
     * 查询弹性公网IP的反向解析记录
     *
     * 查询弹性公网IP的反向解析记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowPtrRequest 请求对象
     * @return AsyncInvoker<ShowPtrRequest, ShowPtrResponse>
     */
    public AsyncInvoker<ShowPtrRequest, ShowPtrResponse> showPtrAsyncInvoker(ShowPtrRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.showPtr, hcClient);
    }

    /**
     * 查询域名下的记录集列表
     *
     * 当您的记录集创建成功后，您可以通过调用此接口查询指定域名下的所有记录集信息，包括名称、ID、状态、所属域名、解析记录值、标签、TTL、创建时间、修改时间、描述等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRecordSetByZoneRequest 请求对象
     * @return CompletableFuture<ShowRecordSetByZoneResponse>
     */
    public CompletableFuture<ShowRecordSetByZoneResponse> showRecordSetByZoneAsync(ShowRecordSetByZoneRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.showRecordSetByZone);
    }

    /**
     * 查询域名下的记录集列表
     *
     * 当您的记录集创建成功后，您可以通过调用此接口查询指定域名下的所有记录集信息，包括名称、ID、状态、所属域名、解析记录值、标签、TTL、创建时间、修改时间、描述等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRecordSetByZoneRequest 请求对象
     * @return AsyncInvoker<ShowRecordSetByZoneRequest, ShowRecordSetByZoneResponse>
     */
    public AsyncInvoker<ShowRecordSetByZoneRequest, ShowRecordSetByZoneResponse> showRecordSetByZoneAsyncInvoker(
        ShowRecordSetByZoneRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.showRecordSetByZone, hcClient);
    }

    /**
     * 查询记录集
     *
     * 当您的记录集创建成功后，您可以通过调用此接口查询单个记录集信息，包括名称、ID、状态、所属域名、解析记录值、标签、TTL、创建时间、修改时间、描述等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRecordSetWithLineRequest 请求对象
     * @return CompletableFuture<ShowRecordSetWithLineResponse>
     */
    public CompletableFuture<ShowRecordSetWithLineResponse> showRecordSetWithLineAsync(
        ShowRecordSetWithLineRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.showRecordSetWithLine);
    }

    /**
     * 查询记录集
     *
     * 当您的记录集创建成功后，您可以通过调用此接口查询单个记录集信息，包括名称、ID、状态、所属域名、解析记录值、标签、TTL、创建时间、修改时间、描述等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRecordSetWithLineRequest 请求对象
     * @return AsyncInvoker<ShowRecordSetWithLineRequest, ShowRecordSetWithLineResponse>
     */
    public AsyncInvoker<ShowRecordSetWithLineRequest, ShowRecordSetWithLineResponse> showRecordSetWithLineAsyncInvoker(
        ShowRecordSetWithLineRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.showRecordSetWithLine, hcClient);
    }

    /**
     * 修改弹性公网IP的反向解析记录
     *
     * 修改弹性公网IP的反向解析记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePtrRequest 请求对象
     * @return CompletableFuture<UpdatePtrResponse>
     */
    public CompletableFuture<UpdatePtrResponse> updatePtrAsync(UpdatePtrRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.updatePtr);
    }

    /**
     * 修改弹性公网IP的反向解析记录
     *
     * 修改弹性公网IP的反向解析记录。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdatePtrRequest 请求对象
     * @return AsyncInvoker<UpdatePtrRequest, UpdatePtrResponse>
     */
    public AsyncInvoker<UpdatePtrRequest, UpdatePtrResponse> updatePtrAsyncInvoker(UpdatePtrRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.updatePtr, hcClient);
    }

    /**
     * 修改记录集
     *
     * 当您的记录集创建成功后，您可以通过调用此接口修改记录集的信息，包括域名、类型、记录值、TTL、描述等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRecordSetsRequest 请求对象
     * @return CompletableFuture<UpdateRecordSetsResponse>
     */
    public CompletableFuture<UpdateRecordSetsResponse> updateRecordSetsAsync(UpdateRecordSetsRequest request) {
        return hcClient.asyncInvokeHttp(request, DnsMeta.updateRecordSets);
    }

    /**
     * 修改记录集
     *
     * 当您的记录集创建成功后，您可以通过调用此接口修改记录集的信息，包括域名、类型、记录值、TTL、描述等。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRecordSetsRequest 请求对象
     * @return AsyncInvoker<UpdateRecordSetsRequest, UpdateRecordSetsResponse>
     */
    public AsyncInvoker<UpdateRecordSetsRequest, UpdateRecordSetsResponse> updateRecordSetsAsyncInvoker(
        UpdateRecordSetsRequest request) {
        return new AsyncInvoker<>(request, DnsMeta.updateRecordSets, hcClient);
    }

}
