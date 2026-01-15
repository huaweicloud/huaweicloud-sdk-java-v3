package com.huaweicloud.sdk.dns.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.dns.v2.model.AssociateEndpointIpaddressRequest;
import com.huaweicloud.sdk.dns.v2.model.AssociateEndpointIpaddressResponse;
import com.huaweicloud.sdk.dns.v2.model.AssociateOrDisassociateRouterWithRuleRequestBody;
import com.huaweicloud.sdk.dns.v2.model.AssociateResolverQueryLogConfigRequest;
import com.huaweicloud.sdk.dns.v2.model.AssociateResolverQueryLogConfigRequestBody;
import com.huaweicloud.sdk.dns.v2.model.AssociateResolverQueryLogConfigResponse;
import com.huaweicloud.sdk.dns.v2.model.AssociateResolverRuleRouterRequest;
import com.huaweicloud.sdk.dns.v2.model.AssociateResolverRuleRouterResponse;
import com.huaweicloud.sdk.dns.v2.model.AssociateRouterRequest;
import com.huaweicloud.sdk.dns.v2.model.AssociateRouterRequestBody;
import com.huaweicloud.sdk.dns.v2.model.AssociateRouterResponse;
import com.huaweicloud.sdk.dns.v2.model.BatchCreateCombinedPublicRecordsetsTaskRequest;
import com.huaweicloud.sdk.dns.v2.model.BatchCreateCombinedPublicRecordsetsTaskRequestBody;
import com.huaweicloud.sdk.dns.v2.model.BatchCreateCombinedPublicRecordsetsTaskResponse;
import com.huaweicloud.sdk.dns.v2.model.BatchCreatePublicRecordsetsTaskRequest;
import com.huaweicloud.sdk.dns.v2.model.BatchCreatePublicRecordsetsTaskRequestBody;
import com.huaweicloud.sdk.dns.v2.model.BatchCreatePublicRecordsetsTaskResponse;
import com.huaweicloud.sdk.dns.v2.model.BatchCreatePublicZonesTaskRequest;
import com.huaweicloud.sdk.dns.v2.model.BatchCreatePublicZonesTaskRequestBody;
import com.huaweicloud.sdk.dns.v2.model.BatchCreatePublicZonesTaskResponse;
import com.huaweicloud.sdk.dns.v2.model.BatchCreateRecordSetsTaskRequest;
import com.huaweicloud.sdk.dns.v2.model.BatchCreateRecordSetsTaskRequestBody;
import com.huaweicloud.sdk.dns.v2.model.BatchCreateRecordSetsTaskResponse;
import com.huaweicloud.sdk.dns.v2.model.BatchCreateTagRequest;
import com.huaweicloud.sdk.dns.v2.model.BatchCreateTagResponse;
import com.huaweicloud.sdk.dns.v2.model.BatchDeletePtrRecordsRequest;
import com.huaweicloud.sdk.dns.v2.model.BatchDeletePtrRecordsRequestBody;
import com.huaweicloud.sdk.dns.v2.model.BatchDeletePtrRecordsResponse;
import com.huaweicloud.sdk.dns.v2.model.BatchDeletePublicRecordsetsTaskRequest;
import com.huaweicloud.sdk.dns.v2.model.BatchDeletePublicRecordsetsTaskRequestBody;
import com.huaweicloud.sdk.dns.v2.model.BatchDeletePublicRecordsetsTaskResponse;
import com.huaweicloud.sdk.dns.v2.model.BatchDeleteRecordSetWithLineRequest;
import com.huaweicloud.sdk.dns.v2.model.BatchDeleteRecordSetWithLineRequestBody;
import com.huaweicloud.sdk.dns.v2.model.BatchDeleteRecordSetWithLineResponse;
import com.huaweicloud.sdk.dns.v2.model.BatchDeleteRecordSetsRequest;
import com.huaweicloud.sdk.dns.v2.model.BatchDeleteRecordSetsRequestBody;
import com.huaweicloud.sdk.dns.v2.model.BatchDeleteRecordSetsResponse;
import com.huaweicloud.sdk.dns.v2.model.BatchDeleteZonesRequest;
import com.huaweicloud.sdk.dns.v2.model.BatchDeleteZonesRequestBody;
import com.huaweicloud.sdk.dns.v2.model.BatchDeleteZonesResponse;
import com.huaweicloud.sdk.dns.v2.model.BatchHandTags;
import com.huaweicloud.sdk.dns.v2.model.BatchSetRecordSetsStatusRequest;
import com.huaweicloud.sdk.dns.v2.model.BatchSetRecordSetsStatusRequestBody;
import com.huaweicloud.sdk.dns.v2.model.BatchSetRecordSetsStatusResponse;
import com.huaweicloud.sdk.dns.v2.model.BatchSetZonesStatusRequest;
import com.huaweicloud.sdk.dns.v2.model.BatchSetZonesStatusRequestBody;
import com.huaweicloud.sdk.dns.v2.model.BatchSetZonesStatusResponse;
import com.huaweicloud.sdk.dns.v2.model.BatchTransferPublicZonesTaskRequest;
import com.huaweicloud.sdk.dns.v2.model.BatchTransferPublicZonesTaskRequestBody;
import com.huaweicloud.sdk.dns.v2.model.BatchTransferPublicZonesTaskResponse;
import com.huaweicloud.sdk.dns.v2.model.BatchUpdatePublicRecordsetsTaskRequest;
import com.huaweicloud.sdk.dns.v2.model.BatchUpdatePublicRecordsetsTaskRequestBody;
import com.huaweicloud.sdk.dns.v2.model.BatchUpdatePublicRecordsetsTaskResponse;
import com.huaweicloud.sdk.dns.v2.model.BatchUpdateRecordSetWithLineRequest;
import com.huaweicloud.sdk.dns.v2.model.BatchUpdateRecordSetWithLineRequestBody;
import com.huaweicloud.sdk.dns.v2.model.BatchUpdateRecordSetWithLineResponse;
import com.huaweicloud.sdk.dns.v2.model.CreateAuthorizeTxtRecordRequest;
import com.huaweicloud.sdk.dns.v2.model.CreateAuthorizeTxtRecordRequestBody;
import com.huaweicloud.sdk.dns.v2.model.CreateAuthorizeTxtRecordResponse;
import com.huaweicloud.sdk.dns.v2.model.CreateAuthorizeTxtRecordVerificationRequest;
import com.huaweicloud.sdk.dns.v2.model.CreateAuthorizeTxtRecordVerificationResponse;
import com.huaweicloud.sdk.dns.v2.model.CreateCustomLineRequest;
import com.huaweicloud.sdk.dns.v2.model.CreateCustomLineRequestBody;
import com.huaweicloud.sdk.dns.v2.model.CreateCustomLineResponse;
import com.huaweicloud.sdk.dns.v2.model.CreateEipRecordSetRequest;
import com.huaweicloud.sdk.dns.v2.model.CreateEipRecordSetResponse;
import com.huaweicloud.sdk.dns.v2.model.CreateEndpointRequest;
import com.huaweicloud.sdk.dns.v2.model.CreateEndpointRequestBody;
import com.huaweicloud.sdk.dns.v2.model.CreateEndpointResponse;
import com.huaweicloud.sdk.dns.v2.model.CreateLineGroupRequest;
import com.huaweicloud.sdk.dns.v2.model.CreateLineGroupResponse;
import com.huaweicloud.sdk.dns.v2.model.CreateLineGroupsReq;
import com.huaweicloud.sdk.dns.v2.model.CreatePrivateZoneReq;
import com.huaweicloud.sdk.dns.v2.model.CreatePrivateZoneRequest;
import com.huaweicloud.sdk.dns.v2.model.CreatePrivateZoneResponse;
import com.huaweicloud.sdk.dns.v2.model.CreatePtrReq;
import com.huaweicloud.sdk.dns.v2.model.CreatePtrRequest;
import com.huaweicloud.sdk.dns.v2.model.CreatePtrRequestBody;
import com.huaweicloud.sdk.dns.v2.model.CreatePtrResponse;
import com.huaweicloud.sdk.dns.v2.model.CreatePublicZoneReq;
import com.huaweicloud.sdk.dns.v2.model.CreatePublicZoneRequest;
import com.huaweicloud.sdk.dns.v2.model.CreatePublicZoneResponse;
import com.huaweicloud.sdk.dns.v2.model.CreateRSetBatchLinesReq;
import com.huaweicloud.sdk.dns.v2.model.CreateRecordSetRequest;
import com.huaweicloud.sdk.dns.v2.model.CreateRecordSetRequestBody;
import com.huaweicloud.sdk.dns.v2.model.CreateRecordSetResponse;
import com.huaweicloud.sdk.dns.v2.model.CreateRecordSetWithBatchLinesRequest;
import com.huaweicloud.sdk.dns.v2.model.CreateRecordSetWithBatchLinesResponse;
import com.huaweicloud.sdk.dns.v2.model.CreateRecordSetWithLineRequest;
import com.huaweicloud.sdk.dns.v2.model.CreateRecordSetWithLineRequestBody;
import com.huaweicloud.sdk.dns.v2.model.CreateRecordSetWithLineResponse;
import com.huaweicloud.sdk.dns.v2.model.CreateResolverQueryLogConfigRequest;
import com.huaweicloud.sdk.dns.v2.model.CreateResolverQueryLogConfigRequestBody;
import com.huaweicloud.sdk.dns.v2.model.CreateResolverQueryLogConfigResponse;
import com.huaweicloud.sdk.dns.v2.model.CreateResolverRuleRequest;
import com.huaweicloud.sdk.dns.v2.model.CreateResolverRuleRequestBody;
import com.huaweicloud.sdk.dns.v2.model.CreateResolverRuleResponse;
import com.huaweicloud.sdk.dns.v2.model.CreateRetrievalRequest;
import com.huaweicloud.sdk.dns.v2.model.CreateRetrievalRequestBody;
import com.huaweicloud.sdk.dns.v2.model.CreateRetrievalResponse;
import com.huaweicloud.sdk.dns.v2.model.CreateRetrievalVerificationRequest;
import com.huaweicloud.sdk.dns.v2.model.CreateRetrievalVerificationResponse;
import com.huaweicloud.sdk.dns.v2.model.CreateTagReq;
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
import com.huaweicloud.sdk.dns.v2.model.DisassociaterouterRequestBody;
import com.huaweicloud.sdk.dns.v2.model.EnableDnssecConfigRequest;
import com.huaweicloud.sdk.dns.v2.model.EnableDnssecConfigResponse;
import com.huaweicloud.sdk.dns.v2.model.Ipaddresses;
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
import com.huaweicloud.sdk.dns.v2.model.ListInstancesRequest;
import com.huaweicloud.sdk.dns.v2.model.ListInstancesRequestBody;
import com.huaweicloud.sdk.dns.v2.model.ListInstancesResponse;
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
import com.huaweicloud.sdk.dns.v2.model.ListTagReq;
import com.huaweicloud.sdk.dns.v2.model.ListTagRequest;
import com.huaweicloud.sdk.dns.v2.model.ListTagResponse;
import com.huaweicloud.sdk.dns.v2.model.ListTagsRequest;
import com.huaweicloud.sdk.dns.v2.model.ListTagsResponse;
import com.huaweicloud.sdk.dns.v2.model.RestorePtrRecordRequest;
import com.huaweicloud.sdk.dns.v2.model.RestorePtrRecordResponse;
import com.huaweicloud.sdk.dns.v2.model.RestorePtrReq;
import com.huaweicloud.sdk.dns.v2.model.SetPrivateZoneProxyPatternRequest;
import com.huaweicloud.sdk.dns.v2.model.SetPrivateZoneProxyPatternRequestBody;
import com.huaweicloud.sdk.dns.v2.model.SetPrivateZoneProxyPatternResponse;
import com.huaweicloud.sdk.dns.v2.model.SetRecordSetsStatusRequest;
import com.huaweicloud.sdk.dns.v2.model.SetRecordSetsStatusRequestBody;
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
import com.huaweicloud.sdk.dns.v2.model.UpdateCustomLineRequestBody;
import com.huaweicloud.sdk.dns.v2.model.UpdateCustomLineResponse;
import com.huaweicloud.sdk.dns.v2.model.UpdateEndpointRequest;
import com.huaweicloud.sdk.dns.v2.model.UpdateEndpointRequestBody;
import com.huaweicloud.sdk.dns.v2.model.UpdateEndpointResponse;
import com.huaweicloud.sdk.dns.v2.model.UpdateLineGroupsRequest;
import com.huaweicloud.sdk.dns.v2.model.UpdateLineGroupsRequestBody;
import com.huaweicloud.sdk.dns.v2.model.UpdateLineGroupsResponse;
import com.huaweicloud.sdk.dns.v2.model.UpdatePrivateZoneInfoReq;
import com.huaweicloud.sdk.dns.v2.model.UpdatePrivateZoneRequest;
import com.huaweicloud.sdk.dns.v2.model.UpdatePrivateZoneResponse;
import com.huaweicloud.sdk.dns.v2.model.UpdatePrivateZoneStatusRequest;
import com.huaweicloud.sdk.dns.v2.model.UpdatePrivateZoneStatusResponse;
import com.huaweicloud.sdk.dns.v2.model.UpdatePtrRecordRequest;
import com.huaweicloud.sdk.dns.v2.model.UpdatePtrRecordResponse;
import com.huaweicloud.sdk.dns.v2.model.UpdatePtrReq;
import com.huaweicloud.sdk.dns.v2.model.UpdatePtrRequest;
import com.huaweicloud.sdk.dns.v2.model.UpdatePtrRequestBody;
import com.huaweicloud.sdk.dns.v2.model.UpdatePtrResponse;
import com.huaweicloud.sdk.dns.v2.model.UpdatePublicZoneInfo;
import com.huaweicloud.sdk.dns.v2.model.UpdatePublicZoneRequest;
import com.huaweicloud.sdk.dns.v2.model.UpdatePublicZoneResponse;
import com.huaweicloud.sdk.dns.v2.model.UpdatePublicZoneStatusRequest;
import com.huaweicloud.sdk.dns.v2.model.UpdatePublicZoneStatusResponse;
import com.huaweicloud.sdk.dns.v2.model.UpdateRecordSetReq;
import com.huaweicloud.sdk.dns.v2.model.UpdateRecordSetRequest;
import com.huaweicloud.sdk.dns.v2.model.UpdateRecordSetResponse;
import com.huaweicloud.sdk.dns.v2.model.UpdateRecordSetsReq;
import com.huaweicloud.sdk.dns.v2.model.UpdateRecordSetsRequest;
import com.huaweicloud.sdk.dns.v2.model.UpdateRecordSetsResponse;
import com.huaweicloud.sdk.dns.v2.model.UpdateResolverRuleRequest;
import com.huaweicloud.sdk.dns.v2.model.UpdateResolverRuleRequestBody;
import com.huaweicloud.sdk.dns.v2.model.UpdateResolverRuleResponse;
import com.huaweicloud.sdk.dns.v2.model.UpdateZoneStatusRequestBody;

@SuppressWarnings("unchecked")
public class DnsMeta {

    public static final HttpRequestDef<AssociateEndpointIpaddressRequest, AssociateEndpointIpaddressResponse> associateEndpointIpaddress =
        genForAssociateEndpointIpaddress();

    private static HttpRequestDef<AssociateEndpointIpaddressRequest, AssociateEndpointIpaddressResponse> genForAssociateEndpointIpaddress() {
        // basic
        HttpRequestDef.Builder<AssociateEndpointIpaddressRequest, AssociateEndpointIpaddressResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    AssociateEndpointIpaddressRequest.class,
                    AssociateEndpointIpaddressResponse.class)
                .withName("AssociateEndpointIpaddress")
                .withUri("/v2.1/endpoints/{endpoint_id}/ipaddresses")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("endpoint_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateEndpointIpaddressRequest::getEndpointId,
                AssociateEndpointIpaddressRequest::setEndpointId));
        builder.<Ipaddresses>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Ipaddresses.class),
            f -> f.withMarshaller(AssociateEndpointIpaddressRequest::getBody,
                AssociateEndpointIpaddressRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AssociateResolverQueryLogConfigRequest, AssociateResolverQueryLogConfigResponse> associateResolverQueryLogConfig =
        genForAssociateResolverQueryLogConfig();

    private static HttpRequestDef<AssociateResolverQueryLogConfigRequest, AssociateResolverQueryLogConfigResponse> genForAssociateResolverQueryLogConfig() {
        // basic
        HttpRequestDef.Builder<AssociateResolverQueryLogConfigRequest, AssociateResolverQueryLogConfigResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    AssociateResolverQueryLogConfigRequest.class,
                    AssociateResolverQueryLogConfigResponse.class)
                .withName("AssociateResolverQueryLogConfig")
                .withUri("/v2/resolver/queryloggingconfig/{id}/associatevpc")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateResolverQueryLogConfigRequest::getId,
                AssociateResolverQueryLogConfigRequest::setId));
        builder.<AssociateResolverQueryLogConfigRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AssociateResolverQueryLogConfigRequestBody.class),
            f -> f.withMarshaller(AssociateResolverQueryLogConfigRequest::getBody,
                AssociateResolverQueryLogConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AssociateResolverRuleRouterRequest, AssociateResolverRuleRouterResponse> associateResolverRuleRouter =
        genForAssociateResolverRuleRouter();

    private static HttpRequestDef<AssociateResolverRuleRouterRequest, AssociateResolverRuleRouterResponse> genForAssociateResolverRuleRouter() {
        // basic
        HttpRequestDef.Builder<AssociateResolverRuleRouterRequest, AssociateResolverRuleRouterResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    AssociateResolverRuleRouterRequest.class,
                    AssociateResolverRuleRouterResponse.class)
                .withName("AssociateResolverRuleRouter")
                .withUri("/v2.1/resolverrules/{resolverrule_id}/associaterouter")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resolverrule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateResolverRuleRouterRequest::getResolverruleId,
                AssociateResolverRuleRouterRequest::setResolverruleId));
        builder.<AssociateOrDisassociateRouterWithRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AssociateOrDisassociateRouterWithRuleRequestBody.class),
            f -> f.withMarshaller(AssociateResolverRuleRouterRequest::getBody,
                AssociateResolverRuleRouterRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AssociateRouterRequest, AssociateRouterResponse> associateRouter =
        genForAssociateRouter();

    private static HttpRequestDef<AssociateRouterRequest, AssociateRouterResponse> genForAssociateRouter() {
        // basic
        HttpRequestDef.Builder<AssociateRouterRequest, AssociateRouterResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, AssociateRouterRequest.class, AssociateRouterResponse.class)
                .withName("AssociateRouter")
                .withUri("/v2/zones/{zone_id}/associaterouter")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("zone_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateRouterRequest::getZoneId, AssociateRouterRequest::setZoneId));
        builder.<AssociateRouterRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AssociateRouterRequestBody.class),
            f -> f.withMarshaller(AssociateRouterRequest::getBody, AssociateRouterRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateCombinedPublicRecordsetsTaskRequest, BatchCreateCombinedPublicRecordsetsTaskResponse> batchCreateCombinedPublicRecordsetsTask =
        genForBatchCreateCombinedPublicRecordsetsTask();

    private static HttpRequestDef<BatchCreateCombinedPublicRecordsetsTaskRequest, BatchCreateCombinedPublicRecordsetsTaskResponse> genForBatchCreateCombinedPublicRecordsetsTask() {
        // basic
        HttpRequestDef.Builder<BatchCreateCombinedPublicRecordsetsTaskRequest, BatchCreateCombinedPublicRecordsetsTaskResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchCreateCombinedPublicRecordsetsTaskRequest.class,
                    BatchCreateCombinedPublicRecordsetsTaskResponse.class)
                .withName("BatchCreateCombinedPublicRecordsetsTask")
                .withUri("/v2.1/operation-task/batch-create-combined-recordset")
                .withContentType("application/json");

        // requests
        builder.<BatchCreateCombinedPublicRecordsetsTaskRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateCombinedPublicRecordsetsTaskRequestBody.class),
            f -> f.withMarshaller(BatchCreateCombinedPublicRecordsetsTaskRequest::getBody,
                BatchCreateCombinedPublicRecordsetsTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreatePublicRecordsetsTaskRequest, BatchCreatePublicRecordsetsTaskResponse> batchCreatePublicRecordsetsTask =
        genForBatchCreatePublicRecordsetsTask();

    private static HttpRequestDef<BatchCreatePublicRecordsetsTaskRequest, BatchCreatePublicRecordsetsTaskResponse> genForBatchCreatePublicRecordsetsTask() {
        // basic
        HttpRequestDef.Builder<BatchCreatePublicRecordsetsTaskRequest, BatchCreatePublicRecordsetsTaskResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchCreatePublicRecordsetsTaskRequest.class,
                    BatchCreatePublicRecordsetsTaskResponse.class)
                .withName("BatchCreatePublicRecordsetsTask")
                .withUri("/v2.1/operation-task/batch-create-recordset")
                .withContentType("application/json");

        // requests
        builder.<BatchCreatePublicRecordsetsTaskRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreatePublicRecordsetsTaskRequestBody.class),
            f -> f.withMarshaller(BatchCreatePublicRecordsetsTaskRequest::getBody,
                BatchCreatePublicRecordsetsTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreatePublicZonesTaskRequest, BatchCreatePublicZonesTaskResponse> batchCreatePublicZonesTask =
        genForBatchCreatePublicZonesTask();

    private static HttpRequestDef<BatchCreatePublicZonesTaskRequest, BatchCreatePublicZonesTaskResponse> genForBatchCreatePublicZonesTask() {
        // basic
        HttpRequestDef.Builder<BatchCreatePublicZonesTaskRequest, BatchCreatePublicZonesTaskResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchCreatePublicZonesTaskRequest.class,
                    BatchCreatePublicZonesTaskResponse.class)
                .withName("BatchCreatePublicZonesTask")
                .withUri("/v2.1/operation-task/batch-create-zone")
                .withContentType("application/json");

        // requests
        builder.<BatchCreatePublicZonesTaskRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreatePublicZonesTaskRequestBody.class),
            f -> f.withMarshaller(BatchCreatePublicZonesTaskRequest::getBody,
                BatchCreatePublicZonesTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateTagRequest, BatchCreateTagResponse> batchCreateTag =
        genForBatchCreateTag();

    private static HttpRequestDef<BatchCreateTagRequest, BatchCreateTagResponse> genForBatchCreateTag() {
        // basic
        HttpRequestDef.Builder<BatchCreateTagRequest, BatchCreateTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchCreateTagRequest.class, BatchCreateTagResponse.class)
                .withName("BatchCreateTag")
                .withUri("/v2/{project_id}/{resource_type}/{resource_id}/tags/action")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateTagRequest::getResourceType, BatchCreateTagRequest::setResourceType));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateTagRequest::getResourceId, BatchCreateTagRequest::setResourceId));
        builder.<BatchHandTags>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(BatchHandTags.class),
            f -> f.withMarshaller(BatchCreateTagRequest::getBody, BatchCreateTagRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeletePtrRecordsRequest, BatchDeletePtrRecordsResponse> batchDeletePtrRecords =
        genForBatchDeletePtrRecords();

    private static HttpRequestDef<BatchDeletePtrRecordsRequest, BatchDeletePtrRecordsResponse> genForBatchDeletePtrRecords() {
        // basic
        HttpRequestDef.Builder<BatchDeletePtrRecordsRequest, BatchDeletePtrRecordsResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, BatchDeletePtrRecordsRequest.class, BatchDeletePtrRecordsResponse.class)
            .withName("BatchDeletePtrRecords")
            .withUri("/v2.1/reverse/floatingips")
            .withContentType("application/json");

        // requests
        builder.<BatchDeletePtrRecordsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeletePtrRecordsRequestBody.class),
            f -> f.withMarshaller(BatchDeletePtrRecordsRequest::getBody, BatchDeletePtrRecordsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeletePublicRecordsetsTaskRequest, BatchDeletePublicRecordsetsTaskResponse> batchDeletePublicRecordsetsTask =
        genForBatchDeletePublicRecordsetsTask();

    private static HttpRequestDef<BatchDeletePublicRecordsetsTaskRequest, BatchDeletePublicRecordsetsTaskResponse> genForBatchDeletePublicRecordsetsTask() {
        // basic
        HttpRequestDef.Builder<BatchDeletePublicRecordsetsTaskRequest, BatchDeletePublicRecordsetsTaskResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchDeletePublicRecordsetsTaskRequest.class,
                    BatchDeletePublicRecordsetsTaskResponse.class)
                .withName("BatchDeletePublicRecordsetsTask")
                .withUri("/v2.1/operation-task/batch-delete-recordset")
                .withContentType("application/json");

        // requests
        builder.<BatchDeletePublicRecordsetsTaskRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeletePublicRecordsetsTaskRequestBody.class),
            f -> f.withMarshaller(BatchDeletePublicRecordsetsTaskRequest::getBody,
                BatchDeletePublicRecordsetsTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteRecordSetsRequest, BatchDeleteRecordSetsResponse> batchDeleteRecordSets =
        genForBatchDeleteRecordSets();

    private static HttpRequestDef<BatchDeleteRecordSetsRequest, BatchDeleteRecordSetsResponse> genForBatchDeleteRecordSets() {
        // basic
        HttpRequestDef.Builder<BatchDeleteRecordSetsRequest, BatchDeleteRecordSetsResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, BatchDeleteRecordSetsRequest.class, BatchDeleteRecordSetsResponse.class)
            .withName("BatchDeleteRecordSets")
            .withUri("/v2.1/recordsets")
            .withContentType("application/json");

        // requests
        builder.<BatchDeleteRecordSetsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteRecordSetsRequestBody.class),
            f -> f.withMarshaller(BatchDeleteRecordSetsRequest::getBody, BatchDeleteRecordSetsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteZonesRequest, BatchDeleteZonesResponse> batchDeleteZones =
        genForBatchDeleteZones();

    private static HttpRequestDef<BatchDeleteZonesRequest, BatchDeleteZonesResponse> genForBatchDeleteZones() {
        // basic
        HttpRequestDef.Builder<BatchDeleteZonesRequest, BatchDeleteZonesResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, BatchDeleteZonesRequest.class, BatchDeleteZonesResponse.class)
                .withName("BatchDeleteZones")
                .withUri("/v2.1/zones")
                .withContentType("application/json");

        // requests
        builder.<BatchDeleteZonesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteZonesRequestBody.class),
            f -> f.withMarshaller(BatchDeleteZonesRequest::getBody, BatchDeleteZonesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchSetRecordSetsStatusRequest, BatchSetRecordSetsStatusResponse> batchSetRecordSetsStatus =
        genForBatchSetRecordSetsStatus();

    private static HttpRequestDef<BatchSetRecordSetsStatusRequest, BatchSetRecordSetsStatusResponse> genForBatchSetRecordSetsStatus() {
        // basic
        HttpRequestDef.Builder<BatchSetRecordSetsStatusRequest, BatchSetRecordSetsStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT, BatchSetRecordSetsStatusRequest.class, BatchSetRecordSetsStatusResponse.class)
                .withName("BatchSetRecordSetsStatus")
                .withUri("/v2.1/recordsets/statuses")
                .withContentType("application/json");

        // requests
        builder.<BatchSetRecordSetsStatusRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchSetRecordSetsStatusRequestBody.class),
            f -> f.withMarshaller(BatchSetRecordSetsStatusRequest::getBody, BatchSetRecordSetsStatusRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchSetZonesStatusRequest, BatchSetZonesStatusResponse> batchSetZonesStatus =
        genForBatchSetZonesStatus();

    private static HttpRequestDef<BatchSetZonesStatusRequest, BatchSetZonesStatusResponse> genForBatchSetZonesStatus() {
        // basic
        HttpRequestDef.Builder<BatchSetZonesStatusRequest, BatchSetZonesStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, BatchSetZonesStatusRequest.class, BatchSetZonesStatusResponse.class)
                .withName("BatchSetZonesStatus")
                .withUri("/v2.1/zones/statuses")
                .withContentType("application/json");

        // requests
        builder.<BatchSetZonesStatusRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchSetZonesStatusRequestBody.class),
            f -> f.withMarshaller(BatchSetZonesStatusRequest::getBody, BatchSetZonesStatusRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchTransferPublicZonesTaskRequest, BatchTransferPublicZonesTaskResponse> batchTransferPublicZonesTask =
        genForBatchTransferPublicZonesTask();

    private static HttpRequestDef<BatchTransferPublicZonesTaskRequest, BatchTransferPublicZonesTaskResponse> genForBatchTransferPublicZonesTask() {
        // basic
        HttpRequestDef.Builder<BatchTransferPublicZonesTaskRequest, BatchTransferPublicZonesTaskResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchTransferPublicZonesTaskRequest.class,
                    BatchTransferPublicZonesTaskResponse.class)
                .withName("BatchTransferPublicZonesTask")
                .withUri("/v2.1/operation-task/batch-transfer")
                .withContentType("application/json");

        // requests
        builder.<BatchTransferPublicZonesTaskRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchTransferPublicZonesTaskRequestBody.class),
            f -> f.withMarshaller(BatchTransferPublicZonesTaskRequest::getBody,
                BatchTransferPublicZonesTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdatePublicRecordsetsTaskRequest, BatchUpdatePublicRecordsetsTaskResponse> batchUpdatePublicRecordsetsTask =
        genForBatchUpdatePublicRecordsetsTask();

    private static HttpRequestDef<BatchUpdatePublicRecordsetsTaskRequest, BatchUpdatePublicRecordsetsTaskResponse> genForBatchUpdatePublicRecordsetsTask() {
        // basic
        HttpRequestDef.Builder<BatchUpdatePublicRecordsetsTaskRequest, BatchUpdatePublicRecordsetsTaskResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchUpdatePublicRecordsetsTaskRequest.class,
                    BatchUpdatePublicRecordsetsTaskResponse.class)
                .withName("BatchUpdatePublicRecordsetsTask")
                .withUri("/v2.1/operation-task/batch-update-recordset")
                .withContentType("application/json");

        // requests
        builder.<BatchUpdatePublicRecordsetsTaskRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchUpdatePublicRecordsetsTaskRequestBody.class),
            f -> f.withMarshaller(BatchUpdatePublicRecordsetsTaskRequest::getBody,
                BatchUpdatePublicRecordsetsTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAuthorizeTxtRecordRequest, CreateAuthorizeTxtRecordResponse> createAuthorizeTxtRecord =
        genForCreateAuthorizeTxtRecord();

    private static HttpRequestDef<CreateAuthorizeTxtRecordRequest, CreateAuthorizeTxtRecordResponse> genForCreateAuthorizeTxtRecord() {
        // basic
        HttpRequestDef.Builder<CreateAuthorizeTxtRecordRequest, CreateAuthorizeTxtRecordResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, CreateAuthorizeTxtRecordRequest.class, CreateAuthorizeTxtRecordResponse.class)
                .withName("CreateAuthorizeTxtRecord")
                .withUri("/v2/authorize-txtrecord")
                .withContentType("application/json");

        // requests
        builder.<CreateAuthorizeTxtRecordRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAuthorizeTxtRecordRequestBody.class),
            f -> f.withMarshaller(CreateAuthorizeTxtRecordRequest::getBody, CreateAuthorizeTxtRecordRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAuthorizeTxtRecordVerificationRequest, CreateAuthorizeTxtRecordVerificationResponse> createAuthorizeTxtRecordVerification =
        genForCreateAuthorizeTxtRecordVerification();

    private static HttpRequestDef<CreateAuthorizeTxtRecordVerificationRequest, CreateAuthorizeTxtRecordVerificationResponse> genForCreateAuthorizeTxtRecordVerification() {
        // basic
        HttpRequestDef.Builder<CreateAuthorizeTxtRecordVerificationRequest, CreateAuthorizeTxtRecordVerificationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateAuthorizeTxtRecordVerificationRequest.class,
                    CreateAuthorizeTxtRecordVerificationResponse.class)
                .withName("CreateAuthorizeTxtRecordVerification")
                .withUri("/v2/authorize-txtrecord/{id}/verify")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAuthorizeTxtRecordVerificationRequest::getId,
                CreateAuthorizeTxtRecordVerificationRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCustomLineRequest, CreateCustomLineResponse> createCustomLine =
        genForCreateCustomLine();

    private static HttpRequestDef<CreateCustomLineRequest, CreateCustomLineResponse> genForCreateCustomLine() {
        // basic
        HttpRequestDef.Builder<CreateCustomLineRequest, CreateCustomLineResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCustomLineRequest.class, CreateCustomLineResponse.class)
                .withName("CreateCustomLine")
                .withUri("/v2.1/customlines")
                .withContentType("application/json");

        // requests
        builder.<CreateCustomLineRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateCustomLineRequestBody.class),
            f -> f.withMarshaller(CreateCustomLineRequest::getBody, CreateCustomLineRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEndpointRequest, CreateEndpointResponse> createEndpoint =
        genForCreateEndpoint();

    private static HttpRequestDef<CreateEndpointRequest, CreateEndpointResponse> genForCreateEndpoint() {
        // basic
        HttpRequestDef.Builder<CreateEndpointRequest, CreateEndpointResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateEndpointRequest.class, CreateEndpointResponse.class)
                .withName("CreateEndpoint")
                .withUri("/v2.1/endpoints")
                .withContentType("application/json");

        // requests
        builder.<CreateEndpointRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateEndpointRequestBody.class),
            f -> f.withMarshaller(CreateEndpointRequest::getBody, CreateEndpointRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateLineGroupRequest, CreateLineGroupResponse> createLineGroup =
        genForCreateLineGroup();

    private static HttpRequestDef<CreateLineGroupRequest, CreateLineGroupResponse> genForCreateLineGroup() {
        // basic
        HttpRequestDef.Builder<CreateLineGroupRequest, CreateLineGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateLineGroupRequest.class, CreateLineGroupResponse.class)
                .withName("CreateLineGroup")
                .withUri("/v2.1/linegroups")
                .withContentType("application/json");

        // requests
        builder.<CreateLineGroupsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateLineGroupsReq.class),
            f -> f.withMarshaller(CreateLineGroupRequest::getBody, CreateLineGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePrivateZoneRequest, CreatePrivateZoneResponse> createPrivateZone =
        genForCreatePrivateZone();

    private static HttpRequestDef<CreatePrivateZoneRequest, CreatePrivateZoneResponse> genForCreatePrivateZone() {
        // basic
        HttpRequestDef.Builder<CreatePrivateZoneRequest, CreatePrivateZoneResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePrivateZoneRequest.class, CreatePrivateZoneResponse.class)
                .withName("CreatePrivateZone")
                .withUri("/v2/zones")
                .withContentType("application/json");

        // requests
        builder.<CreatePrivateZoneReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreatePrivateZoneReq.class),
            f -> f.withMarshaller(CreatePrivateZoneRequest::getBody, CreatePrivateZoneRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePublicZoneRequest, CreatePublicZoneResponse> createPublicZone =
        genForCreatePublicZone();

    private static HttpRequestDef<CreatePublicZoneRequest, CreatePublicZoneResponse> genForCreatePublicZone() {
        // basic
        HttpRequestDef.Builder<CreatePublicZoneRequest, CreatePublicZoneResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePublicZoneRequest.class, CreatePublicZoneResponse.class)
                .withName("CreatePublicZone")
                .withUri("/v2/zones")
                .withContentType("application/json");

        // requests
        builder.<CreatePublicZoneReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePublicZoneReq.class),
            f -> f.withMarshaller(CreatePublicZoneRequest::getBody, CreatePublicZoneRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateResolverQueryLogConfigRequest, CreateResolverQueryLogConfigResponse> createResolverQueryLogConfig =
        genForCreateResolverQueryLogConfig();

    private static HttpRequestDef<CreateResolverQueryLogConfigRequest, CreateResolverQueryLogConfigResponse> genForCreateResolverQueryLogConfig() {
        // basic
        HttpRequestDef.Builder<CreateResolverQueryLogConfigRequest, CreateResolverQueryLogConfigResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateResolverQueryLogConfigRequest.class,
                    CreateResolverQueryLogConfigResponse.class)
                .withName("CreateResolverQueryLogConfig")
                .withUri("/v2/resolver/queryloggingconfig")
                .withContentType("application/json");

        // requests
        builder.<CreateResolverQueryLogConfigRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateResolverQueryLogConfigRequestBody.class),
            f -> f.withMarshaller(CreateResolverQueryLogConfigRequest::getBody,
                CreateResolverQueryLogConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateResolverRuleRequest, CreateResolverRuleResponse> createResolverRule =
        genForCreateResolverRule();

    private static HttpRequestDef<CreateResolverRuleRequest, CreateResolverRuleResponse> genForCreateResolverRule() {
        // basic
        HttpRequestDef.Builder<CreateResolverRuleRequest, CreateResolverRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateResolverRuleRequest.class, CreateResolverRuleResponse.class)
                .withName("CreateResolverRule")
                .withUri("/v2.1/resolverrules")
                .withContentType("application/json");

        // requests
        builder.<CreateResolverRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateResolverRuleRequestBody.class),
            f -> f.withMarshaller(CreateResolverRuleRequest::getBody, CreateResolverRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRetrievalRequest, CreateRetrievalResponse> createRetrieval =
        genForCreateRetrieval();

    private static HttpRequestDef<CreateRetrievalRequest, CreateRetrievalResponse> genForCreateRetrieval() {
        // basic
        HttpRequestDef.Builder<CreateRetrievalRequest, CreateRetrievalResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRetrievalRequest.class, CreateRetrievalResponse.class)
                .withName("CreateRetrieval")
                .withUri("/v2/retrieval")
                .withContentType("application/json");

        // requests
        builder.<CreateRetrievalRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateRetrievalRequestBody.class),
            f -> f.withMarshaller(CreateRetrievalRequest::getBody, CreateRetrievalRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRetrievalVerificationRequest, CreateRetrievalVerificationResponse> createRetrievalVerification =
        genForCreateRetrievalVerification();

    private static HttpRequestDef<CreateRetrievalVerificationRequest, CreateRetrievalVerificationResponse> genForCreateRetrievalVerification() {
        // basic
        HttpRequestDef.Builder<CreateRetrievalVerificationRequest, CreateRetrievalVerificationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateRetrievalVerificationRequest.class,
                    CreateRetrievalVerificationResponse.class)
                .withName("CreateRetrievalVerification")
                .withUri("/v2/retrieval/verification/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRetrievalVerificationRequest::getId,
                CreateRetrievalVerificationRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTagRequest, CreateTagResponse> createTag = genForCreateTag();

    private static HttpRequestDef<CreateTagRequest, CreateTagResponse> genForCreateTag() {
        // basic
        HttpRequestDef.Builder<CreateTagRequest, CreateTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTagRequest.class, CreateTagResponse.class)
                .withName("CreateTag")
                .withUri("/v2/{project_id}/{resource_type}/{resource_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTagRequest::getResourceType, CreateTagRequest::setResourceType));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTagRequest::getResourceId, CreateTagRequest::setResourceId));
        builder.<CreateTagReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateTagReq.class),
            f -> f.withMarshaller(CreateTagRequest::getBody, CreateTagRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCustomLineRequest, DeleteCustomLineResponse> deleteCustomLine =
        genForDeleteCustomLine();

    private static HttpRequestDef<DeleteCustomLineRequest, DeleteCustomLineResponse> genForDeleteCustomLine() {
        // basic
        HttpRequestDef.Builder<DeleteCustomLineRequest, DeleteCustomLineResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteCustomLineRequest.class, DeleteCustomLineResponse.class)
                .withName("DeleteCustomLine")
                .withUri("/v2.1/customlines/{line_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("line_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCustomLineRequest::getLineId, DeleteCustomLineRequest::setLineId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEndpointRequest, DeleteEndpointResponse> deleteEndpoint =
        genForDeleteEndpoint();

    private static HttpRequestDef<DeleteEndpointRequest, DeleteEndpointResponse> genForDeleteEndpoint() {
        // basic
        HttpRequestDef.Builder<DeleteEndpointRequest, DeleteEndpointResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteEndpointRequest.class, DeleteEndpointResponse.class)
                .withName("DeleteEndpoint")
                .withUri("/v2.1/endpoints/{endpoint_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("endpoint_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEndpointRequest::getEndpointId, DeleteEndpointRequest::setEndpointId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteLineGroupRequest, DeleteLineGroupResponse> deleteLineGroup =
        genForDeleteLineGroup();

    private static HttpRequestDef<DeleteLineGroupRequest, DeleteLineGroupResponse> genForDeleteLineGroup() {
        // basic
        HttpRequestDef.Builder<DeleteLineGroupRequest, DeleteLineGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteLineGroupRequest.class, DeleteLineGroupResponse.class)
                .withName("DeleteLineGroup")
                .withUri("/v2.1/linegroups/{linegroup_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("linegroup_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLineGroupRequest::getLinegroupId, DeleteLineGroupRequest::setLinegroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePrivateZoneRequest, DeletePrivateZoneResponse> deletePrivateZone =
        genForDeletePrivateZone();

    private static HttpRequestDef<DeletePrivateZoneRequest, DeletePrivateZoneResponse> genForDeletePrivateZone() {
        // basic
        HttpRequestDef.Builder<DeletePrivateZoneRequest, DeletePrivateZoneResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePrivateZoneRequest.class, DeletePrivateZoneResponse.class)
                .withName("DeletePrivateZone")
                .withUri("/v2/zones/{zone_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("zone_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePrivateZoneRequest::getZoneId, DeletePrivateZoneRequest::setZoneId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePublicZoneRequest, DeletePublicZoneResponse> deletePublicZone =
        genForDeletePublicZone();

    private static HttpRequestDef<DeletePublicZoneRequest, DeletePublicZoneResponse> genForDeletePublicZone() {
        // basic
        HttpRequestDef.Builder<DeletePublicZoneRequest, DeletePublicZoneResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePublicZoneRequest.class, DeletePublicZoneResponse.class)
                .withName("DeletePublicZone")
                .withUri("/v2/zones/{zone_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("zone_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePublicZoneRequest::getZoneId, DeletePublicZoneRequest::setZoneId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteResolverQueryLogConfigRequest, DeleteResolverQueryLogConfigResponse> deleteResolverQueryLogConfig =
        genForDeleteResolverQueryLogConfig();

    private static HttpRequestDef<DeleteResolverQueryLogConfigRequest, DeleteResolverQueryLogConfigResponse> genForDeleteResolverQueryLogConfig() {
        // basic
        HttpRequestDef.Builder<DeleteResolverQueryLogConfigRequest, DeleteResolverQueryLogConfigResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteResolverQueryLogConfigRequest.class,
                    DeleteResolverQueryLogConfigResponse.class)
                .withName("DeleteResolverQueryLogConfig")
                .withUri("/v2/resolver/queryloggingconfig/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteResolverQueryLogConfigRequest::getId,
                DeleteResolverQueryLogConfigRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteResolverRuleRequest, DeleteResolverRuleResponse> deleteResolverRule =
        genForDeleteResolverRule();

    private static HttpRequestDef<DeleteResolverRuleRequest, DeleteResolverRuleResponse> genForDeleteResolverRule() {
        // basic
        HttpRequestDef.Builder<DeleteResolverRuleRequest, DeleteResolverRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteResolverRuleRequest.class, DeleteResolverRuleResponse.class)
                .withName("DeleteResolverRule")
                .withUri("/v2.1/resolverrules/{resolverrule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resolverrule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteResolverRuleRequest::getResolverruleId,
                DeleteResolverRuleRequest::setResolverruleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTagRequest, DeleteTagResponse> deleteTag = genForDeleteTag();

    private static HttpRequestDef<DeleteTagRequest, DeleteTagResponse> genForDeleteTag() {
        // basic
        HttpRequestDef.Builder<DeleteTagRequest, DeleteTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTagRequest.class, DeleteTagResponse.class)
                .withName("DeleteTag")
                .withUri("/v2/{project_id}/{resource_type}/{resource_id}/tags/{key}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTagRequest::getResourceType, DeleteTagRequest::setResourceType));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTagRequest::getResourceId, DeleteTagRequest::setResourceId));
        builder.<String>withRequestField("key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTagRequest::getKey, DeleteTagRequest::setKey));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisassociateEndpointIpaddressRequest, DisassociateEndpointIpaddressResponse> disassociateEndpointIpaddress =
        genForDisassociateEndpointIpaddress();

    private static HttpRequestDef<DisassociateEndpointIpaddressRequest, DisassociateEndpointIpaddressResponse> genForDisassociateEndpointIpaddress() {
        // basic
        HttpRequestDef.Builder<DisassociateEndpointIpaddressRequest, DisassociateEndpointIpaddressResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DisassociateEndpointIpaddressRequest.class,
                    DisassociateEndpointIpaddressResponse.class)
                .withName("DisassociateEndpointIpaddress")
                .withUri("/v2.1/endpoints/{endpoint_id}/ipaddresses/{ipaddress_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("endpoint_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisassociateEndpointIpaddressRequest::getEndpointId,
                DisassociateEndpointIpaddressRequest::setEndpointId));
        builder.<String>withRequestField("ipaddress_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisassociateEndpointIpaddressRequest::getIpaddressId,
                DisassociateEndpointIpaddressRequest::setIpaddressId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisassociateResolverQueryLogConfigRequest, DisassociateResolverQueryLogConfigResponse> disassociateResolverQueryLogConfig =
        genForDisassociateResolverQueryLogConfig();

    private static HttpRequestDef<DisassociateResolverQueryLogConfigRequest, DisassociateResolverQueryLogConfigResponse> genForDisassociateResolverQueryLogConfig() {
        // basic
        HttpRequestDef.Builder<DisassociateResolverQueryLogConfigRequest, DisassociateResolverQueryLogConfigResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    DisassociateResolverQueryLogConfigRequest.class,
                    DisassociateResolverQueryLogConfigResponse.class)
                .withName("DisassociateResolverQueryLogConfig")
                .withUri("/v2/resolver/queryloggingconfig/{id}/disassociatevpc")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisassociateResolverQueryLogConfigRequest::getId,
                DisassociateResolverQueryLogConfigRequest::setId));
        builder.<AssociateResolverQueryLogConfigRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AssociateResolverQueryLogConfigRequestBody.class),
            f -> f.withMarshaller(DisassociateResolverQueryLogConfigRequest::getBody,
                DisassociateResolverQueryLogConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisassociateResolverRuleRouterRequest, DisassociateResolverRuleRouterResponse> disassociateResolverRuleRouter =
        genForDisassociateResolverRuleRouter();

    private static HttpRequestDef<DisassociateResolverRuleRouterRequest, DisassociateResolverRuleRouterResponse> genForDisassociateResolverRuleRouter() {
        // basic
        HttpRequestDef.Builder<DisassociateResolverRuleRouterRequest, DisassociateResolverRuleRouterResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    DisassociateResolverRuleRouterRequest.class,
                    DisassociateResolverRuleRouterResponse.class)
                .withName("DisassociateResolverRuleRouter")
                .withUri("/v2.1/resolverrules/{resolverrule_id}/disassociaterouter")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resolverrule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisassociateResolverRuleRouterRequest::getResolverruleId,
                DisassociateResolverRuleRouterRequest::setResolverruleId));
        builder.<AssociateOrDisassociateRouterWithRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AssociateOrDisassociateRouterWithRuleRequestBody.class),
            f -> f.withMarshaller(DisassociateResolverRuleRouterRequest::getBody,
                DisassociateResolverRuleRouterRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisassociateRouterRequest, DisassociateRouterResponse> disassociateRouter =
        genForDisassociateRouter();

    private static HttpRequestDef<DisassociateRouterRequest, DisassociateRouterResponse> genForDisassociateRouter() {
        // basic
        HttpRequestDef.Builder<DisassociateRouterRequest, DisassociateRouterResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DisassociateRouterRequest.class, DisassociateRouterResponse.class)
                .withName("DisassociateRouter")
                .withUri("/v2/zones/{zone_id}/disassociaterouter")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("zone_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisassociateRouterRequest::getZoneId, DisassociateRouterRequest::setZoneId));
        builder.<DisassociaterouterRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DisassociaterouterRequestBody.class),
            f -> f.withMarshaller(DisassociateRouterRequest::getBody, DisassociateRouterRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApiVersionsRequest, ListApiVersionsResponse> listApiVersions =
        genForListApiVersions();

    private static HttpRequestDef<ListApiVersionsRequest, ListApiVersionsResponse> genForListApiVersions() {
        // basic
        HttpRequestDef.Builder<ListApiVersionsRequest, ListApiVersionsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListApiVersionsRequest.class, ListApiVersionsResponse.class)
                .withName("ListApiVersions")
                .withUri("/")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBatchOperationTasksRequest, ListBatchOperationTasksResponse> listBatchOperationTasks =
        genForListBatchOperationTasks();

    private static HttpRequestDef<ListBatchOperationTasksRequest, ListBatchOperationTasksResponse> genForListBatchOperationTasks() {
        // basic
        HttpRequestDef.Builder<ListBatchOperationTasksRequest, ListBatchOperationTasksResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListBatchOperationTasksRequest.class, ListBatchOperationTasksResponse.class)
            .withName("ListBatchOperationTasks")
            .withUri("/v2.1/batch-operation-tasks")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBatchOperationTasksRequest::getLimit, ListBatchOperationTasksRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBatchOperationTasksRequest::getOffset,
                ListBatchOperationTasksRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCustomLineRequest, ListCustomLineResponse> listCustomLine =
        genForListCustomLine();

    private static HttpRequestDef<ListCustomLineRequest, ListCustomLineResponse> genForListCustomLine() {
        // basic
        HttpRequestDef.Builder<ListCustomLineRequest, ListCustomLineResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCustomLineRequest.class, ListCustomLineResponse.class)
                .withName("ListCustomLine")
                .withUri("/v2.1/customlines")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("line_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomLineRequest::getLineId, ListCustomLineRequest::setLineId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomLineRequest::getName, ListCustomLineRequest::setName));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCustomLineRequest::getLimit, ListCustomLineRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCustomLineRequest::getOffset, ListCustomLineRequest::setOffset));
        builder.<Boolean>withRequestField("show_detail",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListCustomLineRequest::getShowDetail, ListCustomLineRequest::setShowDetail));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomLineRequest::getStatus, ListCustomLineRequest::setStatus));
        builder.<String>withRequestField("ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomLineRequest::getIp, ListCustomLineRequest::setIp));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEndpointIpaddressesRequest, ListEndpointIpaddressesResponse> listEndpointIpaddresses =
        genForListEndpointIpaddresses();

    private static HttpRequestDef<ListEndpointIpaddressesRequest, ListEndpointIpaddressesResponse> genForListEndpointIpaddresses() {
        // basic
        HttpRequestDef.Builder<ListEndpointIpaddressesRequest, ListEndpointIpaddressesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListEndpointIpaddressesRequest.class, ListEndpointIpaddressesResponse.class)
            .withName("ListEndpointIpaddresses")
            .withUri("/v2.1/endpoints/{endpoint_id}/ipaddresses")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("endpoint_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEndpointIpaddressesRequest::getEndpointId,
                ListEndpointIpaddressesRequest::setEndpointId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEndpointVpcsRequest, ListEndpointVpcsResponse> listEndpointVpcs =
        genForListEndpointVpcs();

    private static HttpRequestDef<ListEndpointVpcsRequest, ListEndpointVpcsResponse> genForListEndpointVpcs() {
        // basic
        HttpRequestDef.Builder<ListEndpointVpcsRequest, ListEndpointVpcsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEndpointVpcsRequest.class, ListEndpointVpcsResponse.class)
                .withName("ListEndpointVpcs")
                .withUri("/v2.1/vpcs")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEndpointVpcsRequest::getLimit, ListEndpointVpcsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEndpointVpcsRequest::getOffset, ListEndpointVpcsRequest::setOffset));
        builder.<String>withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEndpointVpcsRequest::getVpcId, ListEndpointVpcsRequest::setVpcId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEndpointsRequest, ListEndpointsResponse> listEndpoints =
        genForListEndpoints();

    private static HttpRequestDef<ListEndpointsRequest, ListEndpointsResponse> genForListEndpoints() {
        // basic
        HttpRequestDef.Builder<ListEndpointsRequest, ListEndpointsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEndpointsRequest.class, ListEndpointsResponse.class)
                .withName("ListEndpoints")
                .withUri("/v2.1/endpoints")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("direction",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEndpointsRequest::getDirection, ListEndpointsRequest::setDirection));
        builder.<String>withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEndpointsRequest::getVpcId, ListEndpointsRequest::setVpcId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEndpointsRequest::getName, ListEndpointsRequest::setName));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEndpointsRequest::getLimit, ListEndpointsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEndpointsRequest::getOffset, ListEndpointsRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstancesRequest, ListInstancesResponse> listInstances =
        genForListInstances();

    private static HttpRequestDef<ListInstancesRequest, ListInstancesResponse> genForListInstances() {
        // basic
        HttpRequestDef.Builder<ListInstancesRequest, ListInstancesResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListInstancesRequest.class, ListInstancesResponse.class)
                .withName("ListInstances")
                .withUri("/v2.1/batch-query-instances")
                .withContentType("application/json");

        // requests
        builder.<ListInstancesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListInstancesRequestBody.class),
            f -> f.withMarshaller(ListInstancesRequest::getBody, ListInstancesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLineGroupsRequest, ListLineGroupsResponse> listLineGroups =
        genForListLineGroups();

    private static HttpRequestDef<ListLineGroupsRequest, ListLineGroupsResponse> genForListLineGroups() {
        // basic
        HttpRequestDef.Builder<ListLineGroupsRequest, ListLineGroupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListLineGroupsRequest.class, ListLineGroupsResponse.class)
                .withName("ListLineGroups")
                .withUri("/v2.1/linegroups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("line_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLineGroupsRequest::getLineId, ListLineGroupsRequest::setLineId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLineGroupsRequest::getName, ListLineGroupsRequest::setName));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLineGroupsRequest::getLimit, ListLineGroupsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLineGroupsRequest::getOffset, ListLineGroupsRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNameServersRequest, ListNameServersResponse> listNameServers =
        genForListNameServers();

    private static HttpRequestDef<ListNameServersRequest, ListNameServersResponse> genForListNameServers() {
        // basic
        HttpRequestDef.Builder<ListNameServersRequest, ListNameServersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListNameServersRequest.class, ListNameServersResponse.class)
                .withName("ListNameServers")
                .withUri("/v2/nameservers")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNameServersRequest::getType, ListNameServersRequest::setType));
        builder.<String>withRequestField("region",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNameServersRequest::getRegion, ListNameServersRequest::setRegion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPrivateZonesRequest, ListPrivateZonesResponse> listPrivateZones =
        genForListPrivateZones();

    private static HttpRequestDef<ListPrivateZonesRequest, ListPrivateZonesResponse> genForListPrivateZones() {
        // basic
        HttpRequestDef.Builder<ListPrivateZonesRequest, ListPrivateZonesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPrivateZonesRequest.class, ListPrivateZonesResponse.class)
                .withName("ListPrivateZones")
                .withUri("/v2/zones")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPrivateZonesRequest::getType, ListPrivateZonesRequest::setType));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPrivateZonesRequest::getLimit, ListPrivateZonesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPrivateZonesRequest::getMarker, ListPrivateZonesRequest::setMarker));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPrivateZonesRequest::getOffset, ListPrivateZonesRequest::setOffset));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPrivateZonesRequest::getTags, ListPrivateZonesRequest::setTags));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPrivateZonesRequest::getName, ListPrivateZonesRequest::setName));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPrivateZonesRequest::getId, ListPrivateZonesRequest::setId));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPrivateZonesRequest::getStatus, ListPrivateZonesRequest::setStatus));
        builder.<String>withRequestField("search_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPrivateZonesRequest::getSearchMode, ListPrivateZonesRequest::setSearchMode));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPrivateZonesRequest::getSortKey, ListPrivateZonesRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPrivateZonesRequest::getSortDir, ListPrivateZonesRequest::setSortDir));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPrivateZonesRequest::getEnterpriseProjectId,
                ListPrivateZonesRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("router_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPrivateZonesRequest::getRouterId, ListPrivateZonesRequest::setRouterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPublicZonesRequest, ListPublicZonesResponse> listPublicZones =
        genForListPublicZones();

    private static HttpRequestDef<ListPublicZonesRequest, ListPublicZonesResponse> genForListPublicZones() {
        // basic
        HttpRequestDef.Builder<ListPublicZonesRequest, ListPublicZonesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPublicZonesRequest.class, ListPublicZonesResponse.class)
                .withName("ListPublicZones")
                .withUri("/v2/zones")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublicZonesRequest::getType, ListPublicZonesRequest::setType));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPublicZonesRequest::getLimit, ListPublicZonesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublicZonesRequest::getMarker, ListPublicZonesRequest::setMarker));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPublicZonesRequest::getOffset, ListPublicZonesRequest::setOffset));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublicZonesRequest::getTags, ListPublicZonesRequest::setTags));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublicZonesRequest::getName, ListPublicZonesRequest::setName));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublicZonesRequest::getId, ListPublicZonesRequest::setId));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublicZonesRequest::getStatus, ListPublicZonesRequest::setStatus));
        builder.<String>withRequestField("search_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublicZonesRequest::getSearchMode, ListPublicZonesRequest::setSearchMode));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublicZonesRequest::getSortKey, ListPublicZonesRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublicZonesRequest::getSortDir, ListPublicZonesRequest::setSortDir));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublicZonesRequest::getEnterpriseProjectId,
                ListPublicZonesRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResolverQueryLogConfigsRequest, ListResolverQueryLogConfigsResponse> listResolverQueryLogConfigs =
        genForListResolverQueryLogConfigs();

    private static HttpRequestDef<ListResolverQueryLogConfigsRequest, ListResolverQueryLogConfigsResponse> genForListResolverQueryLogConfigs() {
        // basic
        HttpRequestDef.Builder<ListResolverQueryLogConfigsRequest, ListResolverQueryLogConfigsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListResolverQueryLogConfigsRequest.class,
                    ListResolverQueryLogConfigsResponse.class)
                .withName("ListResolverQueryLogConfigs")
                .withUri("/v2/resolver/queryloggingconfig")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListResolverQueryLogConfigsRequest::getLimit,
                ListResolverQueryLogConfigsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResolverQueryLogConfigsRequest::getMarker,
                ListResolverQueryLogConfigsRequest::setMarker));
        builder.<String>withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResolverQueryLogConfigsRequest::getVpcId,
                ListResolverQueryLogConfigsRequest::setVpcId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResolverRulesRequest, ListResolverRulesResponse> listResolverRules =
        genForListResolverRules();

    private static HttpRequestDef<ListResolverRulesRequest, ListResolverRulesResponse> genForListResolverRules() {
        // basic
        HttpRequestDef.Builder<ListResolverRulesRequest, ListResolverRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListResolverRulesRequest.class, ListResolverRulesResponse.class)
                .withName("ListResolverRules")
                .withUri("/v2.1/resolverrules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResolverRulesRequest::getDomainName, ListResolverRulesRequest::setDomainName));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResolverRulesRequest::getName, ListResolverRulesRequest::setName));
        builder.<String>withRequestField("endpoint_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResolverRulesRequest::getEndpointId, ListResolverRulesRequest::setEndpointId));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResolverRulesRequest::getId, ListResolverRulesRequest::setId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListResolverRulesRequest::getLimit, ListResolverRulesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListResolverRulesRequest::getOffset, ListResolverRulesRequest::setOffset));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResolverRulesRequest::getMarker, ListResolverRulesRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTagRequest, ListTagResponse> listTag = genForListTag();

    private static HttpRequestDef<ListTagRequest, ListTagResponse> genForListTag() {
        // basic
        HttpRequestDef.Builder<ListTagRequest, ListTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListTagRequest.class, ListTagResponse.class)
                .withName("ListTag")
                .withUri("/v2/{project_id}/{resource_type}/resource_instances/action")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTagRequest::getResourceType, ListTagRequest::setResourceType));
        builder.<ListTagReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListTagReq.class),
            f -> f.withMarshaller(ListTagRequest::getBody, ListTagRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTagsRequest, ListTagsResponse> listTags = genForListTags();

    private static HttpRequestDef<ListTagsRequest, ListTagsResponse> genForListTags() {
        // basic
        HttpRequestDef.Builder<ListTagsRequest, ListTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTagsRequest.class, ListTagsResponse.class)
                .withName("ListTags")
                .withUri("/v2/{project_id}/{resource_type}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTagsRequest::getResourceType, ListTagsRequest::setResourceType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetPrivateZoneProxyPatternRequest, SetPrivateZoneProxyPatternResponse> setPrivateZoneProxyPattern =
        genForSetPrivateZoneProxyPattern();

    private static HttpRequestDef<SetPrivateZoneProxyPatternRequest, SetPrivateZoneProxyPatternResponse> genForSetPrivateZoneProxyPattern() {
        // basic
        HttpRequestDef.Builder<SetPrivateZoneProxyPatternRequest, SetPrivateZoneProxyPatternResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    SetPrivateZoneProxyPatternRequest.class,
                    SetPrivateZoneProxyPatternResponse.class)
                .withName("SetPrivateZoneProxyPattern")
                .withUri("/v2/zones/{zone_id}/actions/set-proxy-pattern")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("zone_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetPrivateZoneProxyPatternRequest::getZoneId,
                SetPrivateZoneProxyPatternRequest::setZoneId));
        builder.<SetPrivateZoneProxyPatternRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SetPrivateZoneProxyPatternRequestBody.class),
            f -> f.withMarshaller(SetPrivateZoneProxyPatternRequest::getBody,
                SetPrivateZoneProxyPatternRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowApiInfoRequest, ShowApiInfoResponse> showApiInfo = genForShowApiInfo();

    private static HttpRequestDef<ShowApiInfoRequest, ShowApiInfoResponse> genForShowApiInfo() {
        // basic
        HttpRequestDef.Builder<ShowApiInfoRequest, ShowApiInfoResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowApiInfoRequest.class, ShowApiInfoResponse.class)
                .withName("ShowApiInfo")
                .withUri("/{version}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("version",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowApiInfoRequest::getVersion, ShowApiInfoRequest::setVersion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAuthorizeTxtRecordRequest, ShowAuthorizeTxtRecordResponse> showAuthorizeTxtRecord =
        genForShowAuthorizeTxtRecord();

    private static HttpRequestDef<ShowAuthorizeTxtRecordRequest, ShowAuthorizeTxtRecordResponse> genForShowAuthorizeTxtRecord() {
        // basic
        HttpRequestDef.Builder<ShowAuthorizeTxtRecordRequest, ShowAuthorizeTxtRecordResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowAuthorizeTxtRecordRequest.class, ShowAuthorizeTxtRecordResponse.class)
            .withName("ShowAuthorizeTxtRecord")
            .withUri("/v2/authorize-txtrecord")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("zone_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAuthorizeTxtRecordRequest::getZoneName,
                ShowAuthorizeTxtRecordRequest::setZoneName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBatchOperationTaskRequest, ShowBatchOperationTaskResponse> showBatchOperationTask =
        genForShowBatchOperationTask();

    private static HttpRequestDef<ShowBatchOperationTaskRequest, ShowBatchOperationTaskResponse> genForShowBatchOperationTask() {
        // basic
        HttpRequestDef.Builder<ShowBatchOperationTaskRequest, ShowBatchOperationTaskResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowBatchOperationTaskRequest.class, ShowBatchOperationTaskResponse.class)
            .withName("ShowBatchOperationTask")
            .withUri("/v2.1/batch-operation-tasks/{task_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBatchOperationTaskRequest::getTaskId, ShowBatchOperationTaskRequest::setTaskId));
        builder.<Integer>withRequestField("error_item_limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowBatchOperationTaskRequest::getErrorItemLimit,
                ShowBatchOperationTaskRequest::setErrorItemLimit));
        builder.<Integer>withRequestField("error_item_offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowBatchOperationTaskRequest::getErrorItemOffset,
                ShowBatchOperationTaskRequest::setErrorItemOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDomainDetectionRequest, ShowDomainDetectionResponse> showDomainDetection =
        genForShowDomainDetection();

    private static HttpRequestDef<ShowDomainDetectionRequest, ShowDomainDetectionResponse> genForShowDomainDetection() {
        // basic
        HttpRequestDef.Builder<ShowDomainDetectionRequest, ShowDomainDetectionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDomainDetectionRequest.class, ShowDomainDetectionResponse.class)
                .withName("ShowDomainDetection")
                .withUri("/v2.1/zones/{zone_id}/detection")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("zone_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainDetectionRequest::getZoneId, ShowDomainDetectionRequest::setZoneId));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainDetectionRequest::getType, ShowDomainDetectionRequest::setType));
        builder.<String>withRequestField("domain_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainDetectionRequest::getDomainName,
                ShowDomainDetectionRequest::setDomainName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDomainQuotaRequest, ShowDomainQuotaResponse> showDomainQuota =
        genForShowDomainQuota();

    private static HttpRequestDef<ShowDomainQuotaRequest, ShowDomainQuotaResponse> genForShowDomainQuota() {
        // basic
        HttpRequestDef.Builder<ShowDomainQuotaRequest, ShowDomainQuotaResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDomainQuotaRequest.class, ShowDomainQuotaResponse.class)
                .withName("ShowDomainQuota")
                .withUri("/v2/quotamg/dns/quotas")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDomainQuotaRequest::getDomainId, ShowDomainQuotaRequest::setDomainId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEmailRecordSetRequest, ShowEmailRecordSetResponse> showEmailRecordSet =
        genForShowEmailRecordSet();

    private static HttpRequestDef<ShowEmailRecordSetRequest, ShowEmailRecordSetResponse> genForShowEmailRecordSet() {
        // basic
        HttpRequestDef.Builder<ShowEmailRecordSetRequest, ShowEmailRecordSetResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowEmailRecordSetRequest.class, ShowEmailRecordSetResponse.class)
                .withName("ShowEmailRecordSet")
                .withUri("/v2.1/zones/{zone_id}/email-recordsets")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("zone_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEmailRecordSetRequest::getZoneId, ShowEmailRecordSetRequest::setZoneId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowEmailRecordSetRequest::getLimit, ShowEmailRecordSetRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowEmailRecordSetRequest::getOffset, ShowEmailRecordSetRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEndpointRequest, ShowEndpointResponse> showEndpoint = genForShowEndpoint();

    private static HttpRequestDef<ShowEndpointRequest, ShowEndpointResponse> genForShowEndpoint() {
        // basic
        HttpRequestDef.Builder<ShowEndpointRequest, ShowEndpointResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowEndpointRequest.class, ShowEndpointResponse.class)
                .withName("ShowEndpoint")
                .withUri("/v2.1/endpoints/{endpoint_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("endpoint_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEndpointRequest::getEndpointId, ShowEndpointRequest::setEndpointId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLineGroupRequest, ShowLineGroupResponse> showLineGroup =
        genForShowLineGroup();

    private static HttpRequestDef<ShowLineGroupRequest, ShowLineGroupResponse> genForShowLineGroup() {
        // basic
        HttpRequestDef.Builder<ShowLineGroupRequest, ShowLineGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowLineGroupRequest.class, ShowLineGroupResponse.class)
                .withName("ShowLineGroup")
                .withUri("/v2.1/linegroups/{linegroup_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("linegroup_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLineGroupRequest::getLinegroupId, ShowLineGroupRequest::setLinegroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPrivateZoneRequest, ShowPrivateZoneResponse> showPrivateZone =
        genForShowPrivateZone();

    private static HttpRequestDef<ShowPrivateZoneRequest, ShowPrivateZoneResponse> genForShowPrivateZone() {
        // basic
        HttpRequestDef.Builder<ShowPrivateZoneRequest, ShowPrivateZoneResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPrivateZoneRequest.class, ShowPrivateZoneResponse.class)
                .withName("ShowPrivateZone")
                .withUri("/v2/zones/{zone_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("zone_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPrivateZoneRequest::getZoneId, ShowPrivateZoneRequest::setZoneId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPrivateZoneNameServerRequest, ShowPrivateZoneNameServerResponse> showPrivateZoneNameServer =
        genForShowPrivateZoneNameServer();

    private static HttpRequestDef<ShowPrivateZoneNameServerRequest, ShowPrivateZoneNameServerResponse> genForShowPrivateZoneNameServer() {
        // basic
        HttpRequestDef.Builder<ShowPrivateZoneNameServerRequest, ShowPrivateZoneNameServerResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowPrivateZoneNameServerRequest.class,
                    ShowPrivateZoneNameServerResponse.class)
                .withName("ShowPrivateZoneNameServer")
                .withUri("/v2/zones/{zone_id}/nameservers")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("zone_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPrivateZoneNameServerRequest::getZoneId,
                ShowPrivateZoneNameServerRequest::setZoneId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPublicZoneRequest, ShowPublicZoneResponse> showPublicZone =
        genForShowPublicZone();

    private static HttpRequestDef<ShowPublicZoneRequest, ShowPublicZoneResponse> genForShowPublicZone() {
        // basic
        HttpRequestDef.Builder<ShowPublicZoneRequest, ShowPublicZoneResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPublicZoneRequest.class, ShowPublicZoneResponse.class)
                .withName("ShowPublicZone")
                .withUri("/v2/zones/{zone_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("zone_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPublicZoneRequest::getZoneId, ShowPublicZoneRequest::setZoneId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPublicZoneNameServerRequest, ShowPublicZoneNameServerResponse> showPublicZoneNameServer =
        genForShowPublicZoneNameServer();

    private static HttpRequestDef<ShowPublicZoneNameServerRequest, ShowPublicZoneNameServerResponse> genForShowPublicZoneNameServer() {
        // basic
        HttpRequestDef.Builder<ShowPublicZoneNameServerRequest, ShowPublicZoneNameServerResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowPublicZoneNameServerRequest.class, ShowPublicZoneNameServerResponse.class)
                .withName("ShowPublicZoneNameServer")
                .withUri("/v2/zones/{zone_id}/nameservers")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("zone_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPublicZoneNameServerRequest::getZoneId,
                ShowPublicZoneNameServerRequest::setZoneId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowResolverQueryLogConfigRequest, ShowResolverQueryLogConfigResponse> showResolverQueryLogConfig =
        genForShowResolverQueryLogConfig();

    private static HttpRequestDef<ShowResolverQueryLogConfigRequest, ShowResolverQueryLogConfigResponse> genForShowResolverQueryLogConfig() {
        // basic
        HttpRequestDef.Builder<ShowResolverQueryLogConfigRequest, ShowResolverQueryLogConfigResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowResolverQueryLogConfigRequest.class,
                    ShowResolverQueryLogConfigResponse.class)
                .withName("ShowResolverQueryLogConfig")
                .withUri("/v2/resolver/queryloggingconfig/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResolverQueryLogConfigRequest::getId, ShowResolverQueryLogConfigRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowResolverRuleRequest, ShowResolverRuleResponse> showResolverRule =
        genForShowResolverRule();

    private static HttpRequestDef<ShowResolverRuleRequest, ShowResolverRuleResponse> genForShowResolverRule() {
        // basic
        HttpRequestDef.Builder<ShowResolverRuleRequest, ShowResolverRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowResolverRuleRequest.class, ShowResolverRuleResponse.class)
                .withName("ShowResolverRule")
                .withUri("/v2.1/resolverrules/{resolverrule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resolverrule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResolverRuleRequest::getResolverruleId,
                ShowResolverRuleRequest::setResolverruleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowResourceTagRequest, ShowResourceTagResponse> showResourceTag =
        genForShowResourceTag();

    private static HttpRequestDef<ShowResourceTagRequest, ShowResourceTagResponse> genForShowResourceTag() {
        // basic
        HttpRequestDef.Builder<ShowResourceTagRequest, ShowResourceTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowResourceTagRequest.class, ShowResourceTagResponse.class)
                .withName("ShowResourceTag")
                .withUri("/v2/{project_id}/{resource_type}/{resource_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceTagRequest::getResourceType, ShowResourceTagRequest::setResourceType));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowResourceTagRequest::getResourceId, ShowResourceTagRequest::setResourceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRetrievalRequest, ShowRetrievalResponse> showRetrieval =
        genForShowRetrieval();

    private static HttpRequestDef<ShowRetrievalRequest, ShowRetrievalResponse> genForShowRetrieval() {
        // basic
        HttpRequestDef.Builder<ShowRetrievalRequest, ShowRetrievalResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRetrievalRequest.class, ShowRetrievalResponse.class)
                .withName("ShowRetrieval")
                .withUri("/v2/retrieval")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRetrievalRequest::getName, ShowRetrievalRequest::setName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRetrievalVerificationRequest, ShowRetrievalVerificationResponse> showRetrievalVerification =
        genForShowRetrievalVerification();

    private static HttpRequestDef<ShowRetrievalVerificationRequest, ShowRetrievalVerificationResponse> genForShowRetrievalVerification() {
        // basic
        HttpRequestDef.Builder<ShowRetrievalVerificationRequest, ShowRetrievalVerificationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowRetrievalVerificationRequest.class,
                    ShowRetrievalVerificationResponse.class)
                .withName("ShowRetrievalVerification")
                .withUri("/v2/retrieval/verification/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRetrievalVerificationRequest::getId, ShowRetrievalVerificationRequest::setId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowWebsiteRecordSetRequest, ShowWebsiteRecordSetResponse> showWebsiteRecordSet =
        genForShowWebsiteRecordSet();

    private static HttpRequestDef<ShowWebsiteRecordSetRequest, ShowWebsiteRecordSetResponse> genForShowWebsiteRecordSet() {
        // basic
        HttpRequestDef.Builder<ShowWebsiteRecordSetRequest, ShowWebsiteRecordSetResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowWebsiteRecordSetRequest.class, ShowWebsiteRecordSetResponse.class)
            .withName("ShowWebsiteRecordSet")
            .withUri("/v2.1/zones/{zone_id}/website-recordsets")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("zone_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWebsiteRecordSetRequest::getZoneId, ShowWebsiteRecordSetRequest::setZoneId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowWebsiteRecordSetRequest::getLimit, ShowWebsiteRecordSetRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowWebsiteRecordSetRequest::getOffset, ShowWebsiteRecordSetRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowZoneNameServerRequest, ShowZoneNameServerResponse> showZoneNameServer =
        genForShowZoneNameServer();

    private static HttpRequestDef<ShowZoneNameServerRequest, ShowZoneNameServerResponse> genForShowZoneNameServer() {
        // basic
        HttpRequestDef.Builder<ShowZoneNameServerRequest, ShowZoneNameServerResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowZoneNameServerRequest.class, ShowZoneNameServerResponse.class)
                .withName("ShowZoneNameServer")
                .withUri("/v2/public-zones/dns-servers/{domain_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domain_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowZoneNameServerRequest::getDomainName, ShowZoneNameServerRequest::setDomainName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCustomLineRequest, UpdateCustomLineResponse> updateCustomLine =
        genForUpdateCustomLine();

    private static HttpRequestDef<UpdateCustomLineRequest, UpdateCustomLineResponse> genForUpdateCustomLine() {
        // basic
        HttpRequestDef.Builder<UpdateCustomLineRequest, UpdateCustomLineResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateCustomLineRequest.class, UpdateCustomLineResponse.class)
                .withName("UpdateCustomLine")
                .withUri("/v2.1/customlines/{line_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("line_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCustomLineRequest::getLineId, UpdateCustomLineRequest::setLineId));
        builder.<UpdateCustomLineRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateCustomLineRequestBody.class),
            f -> f.withMarshaller(UpdateCustomLineRequest::getBody, UpdateCustomLineRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEndpointRequest, UpdateEndpointResponse> updateEndpoint =
        genForUpdateEndpoint();

    private static HttpRequestDef<UpdateEndpointRequest, UpdateEndpointResponse> genForUpdateEndpoint() {
        // basic
        HttpRequestDef.Builder<UpdateEndpointRequest, UpdateEndpointResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateEndpointRequest.class, UpdateEndpointResponse.class)
                .withName("UpdateEndpoint")
                .withUri("/v2.1/endpoints/{endpoint_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("endpoint_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEndpointRequest::getEndpointId, UpdateEndpointRequest::setEndpointId));
        builder.<UpdateEndpointRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateEndpointRequestBody.class),
            f -> f.withMarshaller(UpdateEndpointRequest::getBody, UpdateEndpointRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateLineGroupsRequest, UpdateLineGroupsResponse> updateLineGroups =
        genForUpdateLineGroups();

    private static HttpRequestDef<UpdateLineGroupsRequest, UpdateLineGroupsResponse> genForUpdateLineGroups() {
        // basic
        HttpRequestDef.Builder<UpdateLineGroupsRequest, UpdateLineGroupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateLineGroupsRequest.class, UpdateLineGroupsResponse.class)
                .withName("UpdateLineGroups")
                .withUri("/v2.1/linegroups/{linegroup_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("linegroup_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateLineGroupsRequest::getLinegroupId, UpdateLineGroupsRequest::setLinegroupId));
        builder.<UpdateLineGroupsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateLineGroupsRequestBody.class),
            f -> f.withMarshaller(UpdateLineGroupsRequest::getBody, UpdateLineGroupsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePrivateZoneRequest, UpdatePrivateZoneResponse> updatePrivateZone =
        genForUpdatePrivateZone();

    private static HttpRequestDef<UpdatePrivateZoneRequest, UpdatePrivateZoneResponse> genForUpdatePrivateZone() {
        // basic
        HttpRequestDef.Builder<UpdatePrivateZoneRequest, UpdatePrivateZoneResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, UpdatePrivateZoneRequest.class, UpdatePrivateZoneResponse.class)
                .withName("UpdatePrivateZone")
                .withUri("/v2/zones/{zone_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("zone_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePrivateZoneRequest::getZoneId, UpdatePrivateZoneRequest::setZoneId));
        builder.<UpdatePrivateZoneInfoReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePrivateZoneInfoReq.class),
            f -> f.withMarshaller(UpdatePrivateZoneRequest::getBody, UpdatePrivateZoneRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePrivateZoneStatusRequest, UpdatePrivateZoneStatusResponse> updatePrivateZoneStatus =
        genForUpdatePrivateZoneStatus();

    private static HttpRequestDef<UpdatePrivateZoneStatusRequest, UpdatePrivateZoneStatusResponse> genForUpdatePrivateZoneStatus() {
        // basic
        HttpRequestDef.Builder<UpdatePrivateZoneStatusRequest, UpdatePrivateZoneStatusResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdatePrivateZoneStatusRequest.class, UpdatePrivateZoneStatusResponse.class)
            .withName("UpdatePrivateZoneStatus")
            .withUri("/v2/zones/{zone_id}/statuses")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("zone_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePrivateZoneStatusRequest::getZoneId,
                UpdatePrivateZoneStatusRequest::setZoneId));
        builder.<UpdateZoneStatusRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateZoneStatusRequestBody.class),
            f -> f.withMarshaller(UpdatePrivateZoneStatusRequest::getBody, UpdatePrivateZoneStatusRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePublicZoneRequest, UpdatePublicZoneResponse> updatePublicZone =
        genForUpdatePublicZone();

    private static HttpRequestDef<UpdatePublicZoneRequest, UpdatePublicZoneResponse> genForUpdatePublicZone() {
        // basic
        HttpRequestDef.Builder<UpdatePublicZoneRequest, UpdatePublicZoneResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, UpdatePublicZoneRequest.class, UpdatePublicZoneResponse.class)
                .withName("UpdatePublicZone")
                .withUri("/v2/zones/{zone_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("zone_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePublicZoneRequest::getZoneId, UpdatePublicZoneRequest::setZoneId));
        builder.<UpdatePublicZoneInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePublicZoneInfo.class),
            f -> f.withMarshaller(UpdatePublicZoneRequest::getBody, UpdatePublicZoneRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePublicZoneStatusRequest, UpdatePublicZoneStatusResponse> updatePublicZoneStatus =
        genForUpdatePublicZoneStatus();

    private static HttpRequestDef<UpdatePublicZoneStatusRequest, UpdatePublicZoneStatusResponse> genForUpdatePublicZoneStatus() {
        // basic
        HttpRequestDef.Builder<UpdatePublicZoneStatusRequest, UpdatePublicZoneStatusResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdatePublicZoneStatusRequest.class, UpdatePublicZoneStatusResponse.class)
            .withName("UpdatePublicZoneStatus")
            .withUri("/v2/zones/{zone_id}/statuses")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("zone_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePublicZoneStatusRequest::getZoneId, UpdatePublicZoneStatusRequest::setZoneId));
        builder.<UpdateZoneStatusRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateZoneStatusRequestBody.class),
            f -> f.withMarshaller(UpdatePublicZoneStatusRequest::getBody, UpdatePublicZoneStatusRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateResolverRuleRequest, UpdateResolverRuleResponse> updateResolverRule =
        genForUpdateResolverRule();

    private static HttpRequestDef<UpdateResolverRuleRequest, UpdateResolverRuleResponse> genForUpdateResolverRule() {
        // basic
        HttpRequestDef.Builder<UpdateResolverRuleRequest, UpdateResolverRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateResolverRuleRequest.class, UpdateResolverRuleResponse.class)
                .withName("UpdateResolverRule")
                .withUri("/v2.1/resolverrules/{resolverrule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resolverrule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateResolverRuleRequest::getResolverruleId,
                UpdateResolverRuleRequest::setResolverruleId));
        builder.<UpdateResolverRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateResolverRuleRequestBody.class),
            f -> f.withMarshaller(UpdateResolverRuleRequest::getBody, UpdateResolverRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisableDnssecConfigRequest, DisableDnssecConfigResponse> disableDnssecConfig =
        genForDisableDnssecConfig();

    private static HttpRequestDef<DisableDnssecConfigRequest, DisableDnssecConfigResponse> genForDisableDnssecConfig() {
        // basic
        HttpRequestDef.Builder<DisableDnssecConfigRequest, DisableDnssecConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DisableDnssecConfigRequest.class, DisableDnssecConfigResponse.class)
                .withName("DisableDnssecConfig")
                .withUri("/v2/zones/{zone_id}/disable-dnssec")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("zone_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisableDnssecConfigRequest::getZoneId, DisableDnssecConfigRequest::setZoneId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EnableDnssecConfigRequest, EnableDnssecConfigResponse> enableDnssecConfig =
        genForEnableDnssecConfig();

    private static HttpRequestDef<EnableDnssecConfigRequest, EnableDnssecConfigResponse> genForEnableDnssecConfig() {
        // basic
        HttpRequestDef.Builder<EnableDnssecConfigRequest, EnableDnssecConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, EnableDnssecConfigRequest.class, EnableDnssecConfigResponse.class)
                .withName("EnableDnssecConfig")
                .withUri("/v2/zones/{zone_id}/enable-dnssec")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("zone_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EnableDnssecConfigRequest::getZoneId, EnableDnssecConfigRequest::setZoneId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDnssecConfigRequest, ShowDnssecConfigResponse> showDnssecConfig =
        genForShowDnssecConfig();

    private static HttpRequestDef<ShowDnssecConfigRequest, ShowDnssecConfigResponse> genForShowDnssecConfig() {
        // basic
        HttpRequestDef.Builder<ShowDnssecConfigRequest, ShowDnssecConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDnssecConfigRequest.class, ShowDnssecConfigResponse.class)
                .withName("ShowDnssecConfig")
                .withUri("/v2/zones/{zone_id}/dnssec")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("zone_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDnssecConfigRequest::getZoneId, ShowDnssecConfigRequest::setZoneId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEipRecordSetRequest, CreateEipRecordSetResponse> createEipRecordSet =
        genForCreateEipRecordSet();

    private static HttpRequestDef<CreateEipRecordSetRequest, CreateEipRecordSetResponse> genForCreateEipRecordSet() {
        // basic
        HttpRequestDef.Builder<CreateEipRecordSetRequest, CreateEipRecordSetResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, CreateEipRecordSetRequest.class, CreateEipRecordSetResponse.class)
                .withName("CreateEipRecordSet")
                .withUri("/v2/reverse/floatingips/{region}:{floatingip_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("region",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateEipRecordSetRequest::getRegion, CreateEipRecordSetRequest::setRegion));
        builder.<String>withRequestField("floatingip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateEipRecordSetRequest::getFloatingipId,
                CreateEipRecordSetRequest::setFloatingipId));
        builder.<CreatePtrReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePtrReq.class),
            f -> f.withMarshaller(CreateEipRecordSetRequest::getBody, CreateEipRecordSetRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRecordSetRequest, CreateRecordSetResponse> createRecordSet =
        genForCreateRecordSet();

    private static HttpRequestDef<CreateRecordSetRequest, CreateRecordSetResponse> genForCreateRecordSet() {
        // basic
        HttpRequestDef.Builder<CreateRecordSetRequest, CreateRecordSetResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRecordSetRequest.class, CreateRecordSetResponse.class)
                .withName("CreateRecordSet")
                .withUri("/v2/zones/{zone_id}/recordsets")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("zone_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRecordSetRequest::getZoneId, CreateRecordSetRequest::setZoneId));
        builder.<CreateRecordSetRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateRecordSetRequestBody.class),
            f -> f.withMarshaller(CreateRecordSetRequest::getBody, CreateRecordSetRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRecordSetRequest, DeleteRecordSetResponse> deleteRecordSet =
        genForDeleteRecordSet();

    private static HttpRequestDef<DeleteRecordSetRequest, DeleteRecordSetResponse> genForDeleteRecordSet() {
        // basic
        HttpRequestDef.Builder<DeleteRecordSetRequest, DeleteRecordSetResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteRecordSetRequest.class, DeleteRecordSetResponse.class)
                .withName("DeleteRecordSet")
                .withUri("/v2/zones/{zone_id}/recordsets/{recordset_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("zone_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRecordSetRequest::getZoneId, DeleteRecordSetRequest::setZoneId));
        builder.<String>withRequestField("recordset_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRecordSetRequest::getRecordsetId, DeleteRecordSetRequest::setRecordsetId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPtrRecordsRequest, ListPtrRecordsResponse> listPtrRecords =
        genForListPtrRecords();

    private static HttpRequestDef<ListPtrRecordsRequest, ListPtrRecordsResponse> genForListPtrRecords() {
        // basic
        HttpRequestDef.Builder<ListPtrRecordsRequest, ListPtrRecordsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPtrRecordsRequest.class, ListPtrRecordsResponse.class)
                .withName("ListPtrRecords")
                .withUri("/v2/reverse/floatingips")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPtrRecordsRequest::getMarker, ListPtrRecordsRequest::setMarker));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPtrRecordsRequest::getLimit, ListPtrRecordsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPtrRecordsRequest::getOffset, ListPtrRecordsRequest::setOffset));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPtrRecordsRequest::getEnterpriseProjectId,
                ListPtrRecordsRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPtrRecordsRequest::getTags, ListPtrRecordsRequest::setTags));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPtrRecordsRequest::getStatus, ListPtrRecordsRequest::setStatus));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRecordSetsRequest, ListRecordSetsResponse> listRecordSets =
        genForListRecordSets();

    private static HttpRequestDef<ListRecordSetsRequest, ListRecordSetsResponse> genForListRecordSets() {
        // basic
        HttpRequestDef.Builder<ListRecordSetsRequest, ListRecordSetsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRecordSetsRequest.class, ListRecordSetsResponse.class)
                .withName("ListRecordSets")
                .withUri("/v2/recordsets")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("zone_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsRequest::getZoneType, ListRecordSetsRequest::setZoneType));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsRequest::getMarker, ListRecordSetsRequest::setMarker));
        builder.<String>withRequestField("search_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsRequest::getSearchMode, ListRecordSetsRequest::setSearchMode));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRecordSetsRequest::getLimit, ListRecordSetsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRecordSetsRequest::getOffset, ListRecordSetsRequest::setOffset));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsRequest::getTags, ListRecordSetsRequest::setTags));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsRequest::getStatus, ListRecordSetsRequest::setStatus));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsRequest::getType, ListRecordSetsRequest::setType));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsRequest::getName, ListRecordSetsRequest::setName));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsRequest::getId, ListRecordSetsRequest::setId));
        builder.<String>withRequestField("records",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsRequest::getRecords, ListRecordSetsRequest::setRecords));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsRequest::getSortKey, ListRecordSetsRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsRequest::getSortDir, ListRecordSetsRequest::setSortDir));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRecordSetsByZoneRequest, ListRecordSetsByZoneResponse> listRecordSetsByZone =
        genForListRecordSetsByZone();

    private static HttpRequestDef<ListRecordSetsByZoneRequest, ListRecordSetsByZoneResponse> genForListRecordSetsByZone() {
        // basic
        HttpRequestDef.Builder<ListRecordSetsByZoneRequest, ListRecordSetsByZoneResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListRecordSetsByZoneRequest.class, ListRecordSetsByZoneResponse.class)
            .withName("ListRecordSetsByZone")
            .withUri("/v2/zones/{zone_id}/recordsets")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("zone_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsByZoneRequest::getZoneId, ListRecordSetsByZoneRequest::setZoneId));
        builder.<String>withRequestField("search_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsByZoneRequest::getSearchMode,
                ListRecordSetsByZoneRequest::setSearchMode));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsByZoneRequest::getMarker, ListRecordSetsByZoneRequest::setMarker));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRecordSetsByZoneRequest::getLimit, ListRecordSetsByZoneRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRecordSetsByZoneRequest::getOffset, ListRecordSetsByZoneRequest::setOffset));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsByZoneRequest::getTags, ListRecordSetsByZoneRequest::setTags));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsByZoneRequest::getStatus, ListRecordSetsByZoneRequest::setStatus));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsByZoneRequest::getType, ListRecordSetsByZoneRequest::setType));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsByZoneRequest::getName, ListRecordSetsByZoneRequest::setName));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsByZoneRequest::getId, ListRecordSetsByZoneRequest::setId));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsByZoneRequest::getSortKey, ListRecordSetsByZoneRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsByZoneRequest::getSortDir, ListRecordSetsByZoneRequest::setSortDir));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RestorePtrRecordRequest, RestorePtrRecordResponse> restorePtrRecord =
        genForRestorePtrRecord();

    private static HttpRequestDef<RestorePtrRecordRequest, RestorePtrRecordResponse> genForRestorePtrRecord() {
        // basic
        HttpRequestDef.Builder<RestorePtrRecordRequest, RestorePtrRecordResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, RestorePtrRecordRequest.class, RestorePtrRecordResponse.class)
                .withName("RestorePtrRecord")
                .withUri("/v2/reverse/floatingips/{region}:{floatingip_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("region",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestorePtrRecordRequest::getRegion, RestorePtrRecordRequest::setRegion));
        builder.<String>withRequestField("floatingip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RestorePtrRecordRequest::getFloatingipId, RestorePtrRecordRequest::setFloatingipId));
        builder.<RestorePtrReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(RestorePtrReq.class),
            f -> f.withMarshaller(RestorePtrRecordRequest::getBody, RestorePtrRecordRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPtrRecordSetRequest, ShowPtrRecordSetResponse> showPtrRecordSet =
        genForShowPtrRecordSet();

    private static HttpRequestDef<ShowPtrRecordSetRequest, ShowPtrRecordSetResponse> genForShowPtrRecordSet() {
        // basic
        HttpRequestDef.Builder<ShowPtrRecordSetRequest, ShowPtrRecordSetResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPtrRecordSetRequest.class, ShowPtrRecordSetResponse.class)
                .withName("ShowPtrRecordSet")
                .withUri("/v2/reverse/floatingips/{region}:{floatingip_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("region",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPtrRecordSetRequest::getRegion, ShowPtrRecordSetRequest::setRegion));
        builder.<String>withRequestField("floatingip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPtrRecordSetRequest::getFloatingipId, ShowPtrRecordSetRequest::setFloatingipId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRecordSetRequest, ShowRecordSetResponse> showRecordSet =
        genForShowRecordSet();

    private static HttpRequestDef<ShowRecordSetRequest, ShowRecordSetResponse> genForShowRecordSet() {
        // basic
        HttpRequestDef.Builder<ShowRecordSetRequest, ShowRecordSetResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRecordSetRequest.class, ShowRecordSetResponse.class)
                .withName("ShowRecordSet")
                .withUri("/v2/zones/{zone_id}/recordsets/{recordset_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("zone_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecordSetRequest::getZoneId, ShowRecordSetRequest::setZoneId));
        builder.<String>withRequestField("recordset_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecordSetRequest::getRecordsetId, ShowRecordSetRequest::setRecordsetId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePtrRecordRequest, UpdatePtrRecordResponse> updatePtrRecord =
        genForUpdatePtrRecord();

    private static HttpRequestDef<UpdatePtrRecordRequest, UpdatePtrRecordResponse> genForUpdatePtrRecord() {
        // basic
        HttpRequestDef.Builder<UpdatePtrRecordRequest, UpdatePtrRecordResponse> builder =
            HttpRequestDef.builder(HttpMethod.PATCH, UpdatePtrRecordRequest.class, UpdatePtrRecordResponse.class)
                .withName("UpdatePtrRecord")
                .withUri("/v2/reverse/floatingips/{region}:{floatingip_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("region",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePtrRecordRequest::getRegion, UpdatePtrRecordRequest::setRegion));
        builder.<String>withRequestField("floatingip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePtrRecordRequest::getFloatingipId, UpdatePtrRecordRequest::setFloatingipId));
        builder.<UpdatePtrReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdatePtrReq.class),
            f -> f.withMarshaller(UpdatePtrRecordRequest::getBody, UpdatePtrRecordRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRecordSetRequest, UpdateRecordSetResponse> updateRecordSet =
        genForUpdateRecordSet();

    private static HttpRequestDef<UpdateRecordSetRequest, UpdateRecordSetResponse> genForUpdateRecordSet() {
        // basic
        HttpRequestDef.Builder<UpdateRecordSetRequest, UpdateRecordSetResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateRecordSetRequest.class, UpdateRecordSetResponse.class)
                .withName("UpdateRecordSet")
                .withUri("/v2/zones/{zone_id}/recordsets/{recordset_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("zone_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRecordSetRequest::getZoneId, UpdateRecordSetRequest::setZoneId));
        builder.<String>withRequestField("recordset_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRecordSetRequest::getRecordsetId, UpdateRecordSetRequest::setRecordsetId));
        builder.<UpdateRecordSetReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateRecordSetReq.class),
            f -> f.withMarshaller(UpdateRecordSetRequest::getBody, UpdateRecordSetRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateRecordSetsTaskRequest, BatchCreateRecordSetsTaskResponse> batchCreateRecordSetsTask =
        genForBatchCreateRecordSetsTask();

    private static HttpRequestDef<BatchCreateRecordSetsTaskRequest, BatchCreateRecordSetsTaskResponse> genForBatchCreateRecordSetsTask() {
        // basic
        HttpRequestDef.Builder<BatchCreateRecordSetsTaskRequest, BatchCreateRecordSetsTaskResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchCreateRecordSetsTaskRequest.class,
                    BatchCreateRecordSetsTaskResponse.class)
                .withName("BatchCreateRecordSetsTask")
                .withUri("/v2.1/zones/{zone_id}/recordsets/batch-create-task")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("zone_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateRecordSetsTaskRequest::getZoneId,
                BatchCreateRecordSetsTaskRequest::setZoneId));
        builder.<BatchCreateRecordSetsTaskRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateRecordSetsTaskRequestBody.class),
            f -> f.withMarshaller(BatchCreateRecordSetsTaskRequest::getBody,
                BatchCreateRecordSetsTaskRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteRecordSetWithLineRequest, BatchDeleteRecordSetWithLineResponse> batchDeleteRecordSetWithLine =
        genForBatchDeleteRecordSetWithLine();

    private static HttpRequestDef<BatchDeleteRecordSetWithLineRequest, BatchDeleteRecordSetWithLineResponse> genForBatchDeleteRecordSetWithLine() {
        // basic
        HttpRequestDef.Builder<BatchDeleteRecordSetWithLineRequest, BatchDeleteRecordSetWithLineResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    BatchDeleteRecordSetWithLineRequest.class,
                    BatchDeleteRecordSetWithLineResponse.class)
                .withName("BatchDeleteRecordSetWithLine")
                .withUri("/v2.1/zones/{zone_id}/recordsets")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("zone_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteRecordSetWithLineRequest::getZoneId,
                BatchDeleteRecordSetWithLineRequest::setZoneId));
        builder.<BatchDeleteRecordSetWithLineRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteRecordSetWithLineRequestBody.class),
            f -> f.withMarshaller(BatchDeleteRecordSetWithLineRequest::getBody,
                BatchDeleteRecordSetWithLineRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchUpdateRecordSetWithLineRequest, BatchUpdateRecordSetWithLineResponse> batchUpdateRecordSetWithLine =
        genForBatchUpdateRecordSetWithLine();

    private static HttpRequestDef<BatchUpdateRecordSetWithLineRequest, BatchUpdateRecordSetWithLineResponse> genForBatchUpdateRecordSetWithLine() {
        // basic
        HttpRequestDef.Builder<BatchUpdateRecordSetWithLineRequest, BatchUpdateRecordSetWithLineResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    BatchUpdateRecordSetWithLineRequest.class,
                    BatchUpdateRecordSetWithLineResponse.class)
                .withName("BatchUpdateRecordSetWithLine")
                .withUri("/v2.1/zones/{zone_id}/recordsets")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("zone_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchUpdateRecordSetWithLineRequest::getZoneId,
                BatchUpdateRecordSetWithLineRequest::setZoneId));
        builder.<BatchUpdateRecordSetWithLineRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchUpdateRecordSetWithLineRequestBody.class),
            f -> f.withMarshaller(BatchUpdateRecordSetWithLineRequest::getBody,
                BatchUpdateRecordSetWithLineRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePtrRequest, CreatePtrResponse> createPtr = genForCreatePtr();

    private static HttpRequestDef<CreatePtrRequest, CreatePtrResponse> genForCreatePtr() {
        // basic
        HttpRequestDef.Builder<CreatePtrRequest, CreatePtrResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePtrRequest.class, CreatePtrResponse.class)
                .withName("CreatePtr")
                .withUri("/v2.1/ptrs")
                .withContentType("application/json");

        // requests
        builder.<CreatePtrRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePtrRequestBody.class),
            f -> f.withMarshaller(CreatePtrRequest::getBody, CreatePtrRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRecordSetWithBatchLinesRequest, CreateRecordSetWithBatchLinesResponse> createRecordSetWithBatchLines =
        genForCreateRecordSetWithBatchLines();

    private static HttpRequestDef<CreateRecordSetWithBatchLinesRequest, CreateRecordSetWithBatchLinesResponse> genForCreateRecordSetWithBatchLines() {
        // basic
        HttpRequestDef.Builder<CreateRecordSetWithBatchLinesRequest, CreateRecordSetWithBatchLinesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateRecordSetWithBatchLinesRequest.class,
                    CreateRecordSetWithBatchLinesResponse.class)
                .withName("CreateRecordSetWithBatchLines")
                .withUri("/v2.1/zones/{zone_id}/recordsets/batch/lines")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("zone_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRecordSetWithBatchLinesRequest::getZoneId,
                CreateRecordSetWithBatchLinesRequest::setZoneId));
        builder.<CreateRSetBatchLinesReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateRSetBatchLinesReq.class),
            f -> f.withMarshaller(CreateRecordSetWithBatchLinesRequest::getBody,
                CreateRecordSetWithBatchLinesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRecordSetWithLineRequest, CreateRecordSetWithLineResponse> createRecordSetWithLine =
        genForCreateRecordSetWithLine();

    private static HttpRequestDef<CreateRecordSetWithLineRequest, CreateRecordSetWithLineResponse> genForCreateRecordSetWithLine() {
        // basic
        HttpRequestDef.Builder<CreateRecordSetWithLineRequest, CreateRecordSetWithLineResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateRecordSetWithLineRequest.class, CreateRecordSetWithLineResponse.class)
            .withName("CreateRecordSetWithLine")
            .withUri("/v2.1/zones/{zone_id}/recordsets")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("zone_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRecordSetWithLineRequest::getZoneId,
                CreateRecordSetWithLineRequest::setZoneId));
        builder.<CreateRecordSetWithLineRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateRecordSetWithLineRequestBody.class),
            f -> f.withMarshaller(CreateRecordSetWithLineRequest::getBody, CreateRecordSetWithLineRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteBatchCreateRecordSetsTaskRequest, DeleteBatchCreateRecordSetsTaskResponse> deleteBatchCreateRecordSetsTask =
        genForDeleteBatchCreateRecordSetsTask();

    private static HttpRequestDef<DeleteBatchCreateRecordSetsTaskRequest, DeleteBatchCreateRecordSetsTaskResponse> genForDeleteBatchCreateRecordSetsTask() {
        // basic
        HttpRequestDef.Builder<DeleteBatchCreateRecordSetsTaskRequest, DeleteBatchCreateRecordSetsTaskResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteBatchCreateRecordSetsTaskRequest.class,
                    DeleteBatchCreateRecordSetsTaskResponse.class)
                .withName("DeleteBatchCreateRecordSetsTask")
                .withUri("/v2.1/zones/{zone_id}/recordsets/batch-create-task")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("zone_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBatchCreateRecordSetsTaskRequest::getZoneId,
                DeleteBatchCreateRecordSetsTaskRequest::setZoneId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePtrRequest, DeletePtrResponse> deletePtr = genForDeletePtr();

    private static HttpRequestDef<DeletePtrRequest, DeletePtrResponse> genForDeletePtr() {
        // basic
        HttpRequestDef.Builder<DeletePtrRequest, DeletePtrResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePtrRequest.class, DeletePtrResponse.class)
                .withName("DeletePtr")
                .withUri("/v2.1/ptrs/{ptr_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ptr_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePtrRequest::getPtrId, DeletePtrRequest::setPtrId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRecordSetsRequest, DeleteRecordSetsResponse> deleteRecordSets =
        genForDeleteRecordSets();

    private static HttpRequestDef<DeleteRecordSetsRequest, DeleteRecordSetsResponse> genForDeleteRecordSets() {
        // basic
        HttpRequestDef.Builder<DeleteRecordSetsRequest, DeleteRecordSetsResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteRecordSetsRequest.class, DeleteRecordSetsResponse.class)
                .withName("DeleteRecordSets")
                .withUri("/v2.1/zones/{zone_id}/recordsets/{recordset_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("zone_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRecordSetsRequest::getZoneId, DeleteRecordSetsRequest::setZoneId));
        builder.<String>withRequestField("recordset_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRecordSetsRequest::getRecordsetId, DeleteRecordSetsRequest::setRecordsetId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPtrsRequest, ListPtrsResponse> listPtrs = genForListPtrs();

    private static HttpRequestDef<ListPtrsRequest, ListPtrsResponse> genForListPtrs() {
        // basic
        HttpRequestDef.Builder<ListPtrsRequest, ListPtrsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPtrsRequest.class, ListPtrsResponse.class)
                .withName("ListPtrs")
                .withUri("/v2.1/ptrs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPtrsRequest::getMarker, ListPtrsRequest::setMarker));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPtrsRequest::getLimit, ListPtrsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPtrsRequest::getOffset, ListPtrsRequest::setOffset));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPtrsRequest::getEnterpriseProjectId, ListPtrsRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPtrsRequest::getTags, ListPtrsRequest::setTags));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPtrsRequest::getStatus, ListPtrsRequest::setStatus));
        builder.<String>withRequestField("resource_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPtrsRequest::getResourceType, ListPtrsRequest::setResourceType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPublicZoneLinesRequest, ListPublicZoneLinesResponse> listPublicZoneLines =
        genForListPublicZoneLines();

    private static HttpRequestDef<ListPublicZoneLinesRequest, ListPublicZoneLinesResponse> genForListPublicZoneLines() {
        // basic
        HttpRequestDef.Builder<ListPublicZoneLinesRequest, ListPublicZoneLinesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPublicZoneLinesRequest.class, ListPublicZoneLinesResponse.class)
                .withName("ListPublicZoneLines")
                .withUri("/v2.1/zones/{zone_id}/lines")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("zone_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPublicZoneLinesRequest::getZoneId, ListPublicZoneLinesRequest::setZoneId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPublicZoneLinesRequest::getLimit, ListPublicZoneLinesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPublicZoneLinesRequest::getOffset, ListPublicZoneLinesRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRecordSetsWithLineRequest, ListRecordSetsWithLineResponse> listRecordSetsWithLine =
        genForListRecordSetsWithLine();

    private static HttpRequestDef<ListRecordSetsWithLineRequest, ListRecordSetsWithLineResponse> genForListRecordSetsWithLine() {
        // basic
        HttpRequestDef.Builder<ListRecordSetsWithLineRequest, ListRecordSetsWithLineResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListRecordSetsWithLineRequest.class, ListRecordSetsWithLineResponse.class)
            .withName("ListRecordSetsWithLine")
            .withUri("/v2.1/recordsets")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("zone_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsWithLineRequest::getZoneType,
                ListRecordSetsWithLineRequest::setZoneType));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsWithLineRequest::getMarker, ListRecordSetsWithLineRequest::setMarker));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRecordSetsWithLineRequest::getLimit, ListRecordSetsWithLineRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRecordSetsWithLineRequest::getOffset, ListRecordSetsWithLineRequest::setOffset));
        builder.<String>withRequestField("zone_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsWithLineRequest::getZoneId, ListRecordSetsWithLineRequest::setZoneId));
        builder.<String>withRequestField("line_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsWithLineRequest::getLineId, ListRecordSetsWithLineRequest::setLineId));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsWithLineRequest::getTags, ListRecordSetsWithLineRequest::setTags));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsWithLineRequest::getStatus, ListRecordSetsWithLineRequest::setStatus));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsWithLineRequest::getType, ListRecordSetsWithLineRequest::setType));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsWithLineRequest::getName, ListRecordSetsWithLineRequest::setName));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsWithLineRequest::getId, ListRecordSetsWithLineRequest::setId));
        builder.<String>withRequestField("records",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsWithLineRequest::getRecords,
                ListRecordSetsWithLineRequest::setRecords));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsWithLineRequest::getSortKey,
                ListRecordSetsWithLineRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsWithLineRequest::getSortDir,
                ListRecordSetsWithLineRequest::setSortDir));
        builder.<String>withRequestField("health_check_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsWithLineRequest::getHealthCheckId,
                ListRecordSetsWithLineRequest::setHealthCheckId));
        builder.<String>withRequestField("search_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRecordSetsWithLineRequest::getSearchMode,
                ListRecordSetsWithLineRequest::setSearchMode));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSystemLinesRequest, ListSystemLinesResponse> listSystemLines =
        genForListSystemLines();

    private static HttpRequestDef<ListSystemLinesRequest, ListSystemLinesResponse> genForListSystemLines() {
        // basic
        HttpRequestDef.Builder<ListSystemLinesRequest, ListSystemLinesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSystemLinesRequest.class, ListSystemLinesResponse.class)
                .withName("ListSystemLines")
                .withUri("/v2.1/system-lines")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("locale",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSystemLinesRequest::getLocale, ListSystemLinesRequest::setLocale));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSystemLinesRequest::getLimit, ListSystemLinesRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSystemLinesRequest::getOffset, ListSystemLinesRequest::setOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetRecordSetsStatusRequest, SetRecordSetsStatusResponse> setRecordSetsStatus =
        genForSetRecordSetsStatus();

    private static HttpRequestDef<SetRecordSetsStatusRequest, SetRecordSetsStatusResponse> genForSetRecordSetsStatus() {
        // basic
        HttpRequestDef.Builder<SetRecordSetsStatusRequest, SetRecordSetsStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, SetRecordSetsStatusRequest.class, SetRecordSetsStatusResponse.class)
                .withName("SetRecordSetsStatus")
                .withUri("/v2.1/recordsets/{recordset_id}/statuses/set")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("recordset_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetRecordSetsStatusRequest::getRecordsetId,
                SetRecordSetsStatusRequest::setRecordsetId));
        builder.<SetRecordSetsStatusRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(SetRecordSetsStatusRequestBody.class),
            f -> f.withMarshaller(SetRecordSetsStatusRequest::getBody, SetRecordSetsStatusRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBatchCreateRecordSetsTaskRequest, ShowBatchCreateRecordSetsTaskResponse> showBatchCreateRecordSetsTask =
        genForShowBatchCreateRecordSetsTask();

    private static HttpRequestDef<ShowBatchCreateRecordSetsTaskRequest, ShowBatchCreateRecordSetsTaskResponse> genForShowBatchCreateRecordSetsTask() {
        // basic
        HttpRequestDef.Builder<ShowBatchCreateRecordSetsTaskRequest, ShowBatchCreateRecordSetsTaskResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowBatchCreateRecordSetsTaskRequest.class,
                    ShowBatchCreateRecordSetsTaskResponse.class)
                .withName("ShowBatchCreateRecordSetsTask")
                .withUri("/v2.1/zones/{zone_id}/recordsets/batch-create-task")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("zone_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowBatchCreateRecordSetsTaskRequest::getZoneId,
                ShowBatchCreateRecordSetsTaskRequest::setZoneId));
        builder.<Integer>withRequestField("error_item_limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowBatchCreateRecordSetsTaskRequest::getErrorItemLimit,
                ShowBatchCreateRecordSetsTaskRequest::setErrorItemLimit));
        builder.<Integer>withRequestField("error_item_offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowBatchCreateRecordSetsTaskRequest::getErrorItemOffset,
                ShowBatchCreateRecordSetsTaskRequest::setErrorItemOffset));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPtrRequest, ShowPtrResponse> showPtr = genForShowPtr();

    private static HttpRequestDef<ShowPtrRequest, ShowPtrResponse> genForShowPtr() {
        // basic
        HttpRequestDef.Builder<ShowPtrRequest, ShowPtrResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPtrRequest.class, ShowPtrResponse.class)
                .withName("ShowPtr")
                .withUri("/v2.1/ptrs/{ptr_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ptr_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPtrRequest::getPtrId, ShowPtrRequest::setPtrId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRecordSetByZoneRequest, ShowRecordSetByZoneResponse> showRecordSetByZone =
        genForShowRecordSetByZone();

    private static HttpRequestDef<ShowRecordSetByZoneRequest, ShowRecordSetByZoneResponse> genForShowRecordSetByZone() {
        // basic
        HttpRequestDef.Builder<ShowRecordSetByZoneRequest, ShowRecordSetByZoneResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRecordSetByZoneRequest.class, ShowRecordSetByZoneResponse.class)
                .withName("ShowRecordSetByZone")
                .withUri("/v2.1/zones/{zone_id}/recordsets")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("zone_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecordSetByZoneRequest::getZoneId, ShowRecordSetByZoneRequest::setZoneId));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecordSetByZoneRequest::getMarker, ShowRecordSetByZoneRequest::setMarker));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowRecordSetByZoneRequest::getLimit, ShowRecordSetByZoneRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowRecordSetByZoneRequest::getOffset, ShowRecordSetByZoneRequest::setOffset));
        builder.<String>withRequestField("line_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecordSetByZoneRequest::getLineId, ShowRecordSetByZoneRequest::setLineId));
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecordSetByZoneRequest::getTags, ShowRecordSetByZoneRequest::setTags));
        builder.<String>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecordSetByZoneRequest::getStatus, ShowRecordSetByZoneRequest::setStatus));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecordSetByZoneRequest::getType, ShowRecordSetByZoneRequest::setType));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecordSetByZoneRequest::getName, ShowRecordSetByZoneRequest::setName));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecordSetByZoneRequest::getId, ShowRecordSetByZoneRequest::setId));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecordSetByZoneRequest::getSortKey, ShowRecordSetByZoneRequest::setSortKey));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecordSetByZoneRequest::getSortDir, ShowRecordSetByZoneRequest::setSortDir));
        builder.<String>withRequestField("search_mode",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecordSetByZoneRequest::getSearchMode,
                ShowRecordSetByZoneRequest::setSearchMode));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRecordSetWithLineRequest, ShowRecordSetWithLineResponse> showRecordSetWithLine =
        genForShowRecordSetWithLine();

    private static HttpRequestDef<ShowRecordSetWithLineRequest, ShowRecordSetWithLineResponse> genForShowRecordSetWithLine() {
        // basic
        HttpRequestDef.Builder<ShowRecordSetWithLineRequest, ShowRecordSetWithLineResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowRecordSetWithLineRequest.class, ShowRecordSetWithLineResponse.class)
            .withName("ShowRecordSetWithLine")
            .withUri("/v2.1/zones/{zone_id}/recordsets/{recordset_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("zone_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecordSetWithLineRequest::getZoneId, ShowRecordSetWithLineRequest::setZoneId));
        builder.<String>withRequestField("recordset_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRecordSetWithLineRequest::getRecordsetId,
                ShowRecordSetWithLineRequest::setRecordsetId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePtrRequest, UpdatePtrResponse> updatePtr = genForUpdatePtr();

    private static HttpRequestDef<UpdatePtrRequest, UpdatePtrResponse> genForUpdatePtr() {
        // basic
        HttpRequestDef.Builder<UpdatePtrRequest, UpdatePtrResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePtrRequest.class, UpdatePtrResponse.class)
                .withName("UpdatePtr")
                .withUri("/v2.1/ptrs/{ptr_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ptr_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePtrRequest::getPtrId, UpdatePtrRequest::setPtrId));
        builder.<UpdatePtrRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdatePtrRequestBody.class),
            f -> f.withMarshaller(UpdatePtrRequest::getBody, UpdatePtrRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRecordSetsRequest, UpdateRecordSetsResponse> updateRecordSets =
        genForUpdateRecordSets();

    private static HttpRequestDef<UpdateRecordSetsRequest, UpdateRecordSetsResponse> genForUpdateRecordSets() {
        // basic
        HttpRequestDef.Builder<UpdateRecordSetsRequest, UpdateRecordSetsResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateRecordSetsRequest.class, UpdateRecordSetsResponse.class)
                .withName("UpdateRecordSets")
                .withUri("/v2.1/zones/{zone_id}/recordsets/{recordset_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("zone_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRecordSetsRequest::getZoneId, UpdateRecordSetsRequest::setZoneId));
        builder.<String>withRequestField("recordset_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRecordSetsRequest::getRecordsetId, UpdateRecordSetsRequest::setRecordsetId));
        builder.<UpdateRecordSetsReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateRecordSetsReq.class),
            f -> f.withMarshaller(UpdateRecordSetsRequest::getBody, UpdateRecordSetsRequest::setBody));

        // response

        return builder.build();
    }

}
