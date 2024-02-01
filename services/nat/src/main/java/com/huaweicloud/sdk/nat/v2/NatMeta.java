package com.huaweicloud.sdk.nat.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.nat.v2.model.BatchCreateDeleteNatGatewayTagRequest;
import com.huaweicloud.sdk.nat.v2.model.BatchCreateDeleteNatGatewayTagResponse;
import com.huaweicloud.sdk.nat.v2.model.BatchCreateDeleteNatTagsRequestBody;
import com.huaweicloud.sdk.nat.v2.model.BatchCreateDeletePrivateNatTagsRequest;
import com.huaweicloud.sdk.nat.v2.model.BatchCreateDeletePrivateNatTagsResponse;
import com.huaweicloud.sdk.nat.v2.model.BatchCreateDeleteTransitIpTagsRequest;
import com.huaweicloud.sdk.nat.v2.model.BatchCreateDeleteTransitIpTagsResponse;
import com.huaweicloud.sdk.nat.v2.model.BatchCreateNatGatewayDnatRulesRequest;
import com.huaweicloud.sdk.nat.v2.model.BatchCreateNatGatewayDnatRulesRequestBody;
import com.huaweicloud.sdk.nat.v2.model.BatchCreateNatGatewayDnatRulesResponse;
import com.huaweicloud.sdk.nat.v2.model.BatchOperateResourceTagsRequestBody;
import com.huaweicloud.sdk.nat.v2.model.CreateNatGatewayDnatRuleOption;
import com.huaweicloud.sdk.nat.v2.model.CreateNatGatewayDnatRuleRequest;
import com.huaweicloud.sdk.nat.v2.model.CreateNatGatewayDnatRuleResponse;
import com.huaweicloud.sdk.nat.v2.model.CreateNatGatewayRequest;
import com.huaweicloud.sdk.nat.v2.model.CreateNatGatewayRequestBody;
import com.huaweicloud.sdk.nat.v2.model.CreateNatGatewayResponse;
import com.huaweicloud.sdk.nat.v2.model.CreateNatGatewaySnatRuleRequest;
import com.huaweicloud.sdk.nat.v2.model.CreateNatGatewaySnatRuleRequestOption;
import com.huaweicloud.sdk.nat.v2.model.CreateNatGatewaySnatRuleResponse;
import com.huaweicloud.sdk.nat.v2.model.CreateNatGatewayTagRequest;
import com.huaweicloud.sdk.nat.v2.model.CreateNatGatewayTagResponse;
import com.huaweicloud.sdk.nat.v2.model.CreateNatTagRequestBody;
import com.huaweicloud.sdk.nat.v2.model.CreatePrivateDnatOptionBody;
import com.huaweicloud.sdk.nat.v2.model.CreatePrivateDnatRequest;
import com.huaweicloud.sdk.nat.v2.model.CreatePrivateDnatResponse;
import com.huaweicloud.sdk.nat.v2.model.CreatePrivateNatRequest;
import com.huaweicloud.sdk.nat.v2.model.CreatePrivateNatRequestBody;
import com.huaweicloud.sdk.nat.v2.model.CreatePrivateNatResponse;
import com.huaweicloud.sdk.nat.v2.model.CreatePrivateNatTagRequest;
import com.huaweicloud.sdk.nat.v2.model.CreatePrivateNatTagResponse;
import com.huaweicloud.sdk.nat.v2.model.CreatePrivateSnatOptionBody;
import com.huaweicloud.sdk.nat.v2.model.CreatePrivateSnatRequest;
import com.huaweicloud.sdk.nat.v2.model.CreatePrivateSnatResponse;
import com.huaweicloud.sdk.nat.v2.model.CreateResourceTagRequestBody;
import com.huaweicloud.sdk.nat.v2.model.CreateTransitIpRequest;
import com.huaweicloud.sdk.nat.v2.model.CreateTransitIpRequestBody;
import com.huaweicloud.sdk.nat.v2.model.CreateTransitIpResponse;
import com.huaweicloud.sdk.nat.v2.model.CreateTransitIpTagRequest;
import com.huaweicloud.sdk.nat.v2.model.CreateTransitIpTagResponse;
import com.huaweicloud.sdk.nat.v2.model.DeleteNatGatewayDnatRuleRequest;
import com.huaweicloud.sdk.nat.v2.model.DeleteNatGatewayDnatRuleResponse;
import com.huaweicloud.sdk.nat.v2.model.DeleteNatGatewayRequest;
import com.huaweicloud.sdk.nat.v2.model.DeleteNatGatewayResponse;
import com.huaweicloud.sdk.nat.v2.model.DeleteNatGatewaySnatRuleRequest;
import com.huaweicloud.sdk.nat.v2.model.DeleteNatGatewaySnatRuleResponse;
import com.huaweicloud.sdk.nat.v2.model.DeleteNatGatewayTagRequest;
import com.huaweicloud.sdk.nat.v2.model.DeleteNatGatewayTagResponse;
import com.huaweicloud.sdk.nat.v2.model.DeletePrivateDnatRequest;
import com.huaweicloud.sdk.nat.v2.model.DeletePrivateDnatResponse;
import com.huaweicloud.sdk.nat.v2.model.DeletePrivateNatRequest;
import com.huaweicloud.sdk.nat.v2.model.DeletePrivateNatResponse;
import com.huaweicloud.sdk.nat.v2.model.DeletePrivateNatTagRequest;
import com.huaweicloud.sdk.nat.v2.model.DeletePrivateNatTagResponse;
import com.huaweicloud.sdk.nat.v2.model.DeletePrivateSnatRequest;
import com.huaweicloud.sdk.nat.v2.model.DeletePrivateSnatResponse;
import com.huaweicloud.sdk.nat.v2.model.DeleteTransitIpRequest;
import com.huaweicloud.sdk.nat.v2.model.DeleteTransitIpResponse;
import com.huaweicloud.sdk.nat.v2.model.DeleteTransitIpTagRequest;
import com.huaweicloud.sdk.nat.v2.model.DeleteTransitIpTagResponse;
import com.huaweicloud.sdk.nat.v2.model.ListNatGatewayByTagRequest;
import com.huaweicloud.sdk.nat.v2.model.ListNatGatewayByTagResponse;
import com.huaweicloud.sdk.nat.v2.model.ListNatGatewayDnatRulesRequest;
import com.huaweicloud.sdk.nat.v2.model.ListNatGatewayDnatRulesResponse;
import com.huaweicloud.sdk.nat.v2.model.ListNatGatewaySnatRulesRequest;
import com.huaweicloud.sdk.nat.v2.model.ListNatGatewaySnatRulesResponse;
import com.huaweicloud.sdk.nat.v2.model.ListNatGatewayTagRequest;
import com.huaweicloud.sdk.nat.v2.model.ListNatGatewayTagResponse;
import com.huaweicloud.sdk.nat.v2.model.ListNatGatewaysRequest;
import com.huaweicloud.sdk.nat.v2.model.ListNatGatewaysResponse;
import com.huaweicloud.sdk.nat.v2.model.ListNatsByTagsRequestBody;
import com.huaweicloud.sdk.nat.v2.model.ListPrivateDnatsRequest;
import com.huaweicloud.sdk.nat.v2.model.ListPrivateDnatsResponse;
import com.huaweicloud.sdk.nat.v2.model.ListPrivateNatTagsRequest;
import com.huaweicloud.sdk.nat.v2.model.ListPrivateNatTagsResponse;
import com.huaweicloud.sdk.nat.v2.model.ListPrivateNatsByTagsRequest;
import com.huaweicloud.sdk.nat.v2.model.ListPrivateNatsByTagsResponse;
import com.huaweicloud.sdk.nat.v2.model.ListPrivateNatsRequest;
import com.huaweicloud.sdk.nat.v2.model.ListPrivateNatsResponse;
import com.huaweicloud.sdk.nat.v2.model.ListPrivateSnatsRequest;
import com.huaweicloud.sdk.nat.v2.model.ListPrivateSnatsResponse;
import com.huaweicloud.sdk.nat.v2.model.ListTagResourceInstancesRequestBody;
import com.huaweicloud.sdk.nat.v2.model.ListTransitIpTagsRequest;
import com.huaweicloud.sdk.nat.v2.model.ListTransitIpTagsResponse;
import com.huaweicloud.sdk.nat.v2.model.ListTransitIpsByTagsRequest;
import com.huaweicloud.sdk.nat.v2.model.ListTransitIpsByTagsResponse;
import com.huaweicloud.sdk.nat.v2.model.ListTransitIpsRequest;
import com.huaweicloud.sdk.nat.v2.model.ListTransitIpsResponse;
import com.huaweicloud.sdk.nat.v2.model.ShowNatGatewayDnatRuleRequest;
import com.huaweicloud.sdk.nat.v2.model.ShowNatGatewayDnatRuleResponse;
import com.huaweicloud.sdk.nat.v2.model.ShowNatGatewayRequest;
import com.huaweicloud.sdk.nat.v2.model.ShowNatGatewayResponse;
import com.huaweicloud.sdk.nat.v2.model.ShowNatGatewaySnatRuleRequest;
import com.huaweicloud.sdk.nat.v2.model.ShowNatGatewaySnatRuleResponse;
import com.huaweicloud.sdk.nat.v2.model.ShowNatGatewayTagRequest;
import com.huaweicloud.sdk.nat.v2.model.ShowNatGatewayTagResponse;
import com.huaweicloud.sdk.nat.v2.model.ShowPrivateDnatRequest;
import com.huaweicloud.sdk.nat.v2.model.ShowPrivateDnatResponse;
import com.huaweicloud.sdk.nat.v2.model.ShowPrivateNatRequest;
import com.huaweicloud.sdk.nat.v2.model.ShowPrivateNatResponse;
import com.huaweicloud.sdk.nat.v2.model.ShowPrivateNatTagsRequest;
import com.huaweicloud.sdk.nat.v2.model.ShowPrivateNatTagsResponse;
import com.huaweicloud.sdk.nat.v2.model.ShowPrivateSnatRequest;
import com.huaweicloud.sdk.nat.v2.model.ShowPrivateSnatResponse;
import com.huaweicloud.sdk.nat.v2.model.ShowTransitIpRequest;
import com.huaweicloud.sdk.nat.v2.model.ShowTransitIpResponse;
import com.huaweicloud.sdk.nat.v2.model.ShowTransitIpTagsRequest;
import com.huaweicloud.sdk.nat.v2.model.ShowTransitIpTagsResponse;
import com.huaweicloud.sdk.nat.v2.model.UpdateNatGatewayDnatRuleRequest;
import com.huaweicloud.sdk.nat.v2.model.UpdateNatGatewayDnatRuleRequestBody;
import com.huaweicloud.sdk.nat.v2.model.UpdateNatGatewayDnatRuleResponse;
import com.huaweicloud.sdk.nat.v2.model.UpdateNatGatewayRequest;
import com.huaweicloud.sdk.nat.v2.model.UpdateNatGatewayRequestBody;
import com.huaweicloud.sdk.nat.v2.model.UpdateNatGatewayResponse;
import com.huaweicloud.sdk.nat.v2.model.UpdateNatGatewaySnatRuleRequest;
import com.huaweicloud.sdk.nat.v2.model.UpdateNatGatewaySnatRuleRequestOption;
import com.huaweicloud.sdk.nat.v2.model.UpdateNatGatewaySnatRuleResponse;
import com.huaweicloud.sdk.nat.v2.model.UpdatePrivateDnatRequest;
import com.huaweicloud.sdk.nat.v2.model.UpdatePrivateDnatRequestBody;
import com.huaweicloud.sdk.nat.v2.model.UpdatePrivateDnatResponse;
import com.huaweicloud.sdk.nat.v2.model.UpdatePrivateNatRequest;
import com.huaweicloud.sdk.nat.v2.model.UpdatePrivateNatRequestBody;
import com.huaweicloud.sdk.nat.v2.model.UpdatePrivateNatResponse;
import com.huaweicloud.sdk.nat.v2.model.UpdatePrivateSnatOptionBody;
import com.huaweicloud.sdk.nat.v2.model.UpdatePrivateSnatRequest;
import com.huaweicloud.sdk.nat.v2.model.UpdatePrivateSnatResponse;

import java.util.List;

@SuppressWarnings("unchecked")
public class NatMeta {

    public static final HttpRequestDef<BatchCreateNatGatewayDnatRulesRequest, BatchCreateNatGatewayDnatRulesResponse> batchCreateNatGatewayDnatRules =
        genForBatchCreateNatGatewayDnatRules();

    private static HttpRequestDef<BatchCreateNatGatewayDnatRulesRequest, BatchCreateNatGatewayDnatRulesResponse> genForBatchCreateNatGatewayDnatRules() {
        // basic
        HttpRequestDef.Builder<BatchCreateNatGatewayDnatRulesRequest, BatchCreateNatGatewayDnatRulesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchCreateNatGatewayDnatRulesRequest.class,
                    BatchCreateNatGatewayDnatRulesResponse.class)
                .withName("BatchCreateNatGatewayDnatRules")
                .withUri("/v2/{project_id}/dnat_rules/batch")
                .withContentType("application/json");

        // requests
        builder.<BatchCreateNatGatewayDnatRulesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateNatGatewayDnatRulesRequestBody.class),
            f -> f.withMarshaller(BatchCreateNatGatewayDnatRulesRequest::getBody,
                BatchCreateNatGatewayDnatRulesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateNatGatewayDnatRuleRequest, CreateNatGatewayDnatRuleResponse> createNatGatewayDnatRule =
        genForCreateNatGatewayDnatRule();

    private static HttpRequestDef<CreateNatGatewayDnatRuleRequest, CreateNatGatewayDnatRuleResponse> genForCreateNatGatewayDnatRule() {
        // basic
        HttpRequestDef.Builder<CreateNatGatewayDnatRuleRequest, CreateNatGatewayDnatRuleResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, CreateNatGatewayDnatRuleRequest.class, CreateNatGatewayDnatRuleResponse.class)
                .withName("CreateNatGatewayDnatRule")
                .withUri("/v2/{project_id}/dnat_rules")
                .withContentType("application/json");

        // requests
        builder.<CreateNatGatewayDnatRuleOption>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateNatGatewayDnatRuleOption.class),
            f -> f.withMarshaller(CreateNatGatewayDnatRuleRequest::getBody, CreateNatGatewayDnatRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePrivateDnatRequest, CreatePrivateDnatResponse> createPrivateDnat =
        genForCreatePrivateDnat();

    private static HttpRequestDef<CreatePrivateDnatRequest, CreatePrivateDnatResponse> genForCreatePrivateDnat() {
        // basic
        HttpRequestDef.Builder<CreatePrivateDnatRequest, CreatePrivateDnatResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePrivateDnatRequest.class, CreatePrivateDnatResponse.class)
                .withName("CreatePrivateDnat")
                .withUri("/v3/{project_id}/private-nat/dnat-rules")
                .withContentType("application/json");

        // requests
        builder.<CreatePrivateDnatOptionBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePrivateDnatOptionBody.class),
            f -> f.withMarshaller(CreatePrivateDnatRequest::getBody, CreatePrivateDnatRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteNatGatewayDnatRuleRequest, DeleteNatGatewayDnatRuleResponse> deleteNatGatewayDnatRule =
        genForDeleteNatGatewayDnatRule();

    private static HttpRequestDef<DeleteNatGatewayDnatRuleRequest, DeleteNatGatewayDnatRuleResponse> genForDeleteNatGatewayDnatRule() {
        // basic
        HttpRequestDef.Builder<DeleteNatGatewayDnatRuleRequest, DeleteNatGatewayDnatRuleResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteNatGatewayDnatRuleRequest.class,
                    DeleteNatGatewayDnatRuleResponse.class)
                .withName("DeleteNatGatewayDnatRule")
                .withUri("/v2/{project_id}/nat_gateways/{nat_gateway_id}/dnat_rules/{dnat_rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("nat_gateway_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteNatGatewayDnatRuleRequest::getNatGatewayId,
                DeleteNatGatewayDnatRuleRequest::setNatGatewayId));
        builder.<String>withRequestField("dnat_rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteNatGatewayDnatRuleRequest::getDnatRuleId,
                DeleteNatGatewayDnatRuleRequest::setDnatRuleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePrivateDnatRequest, DeletePrivateDnatResponse> deletePrivateDnat =
        genForDeletePrivateDnat();

    private static HttpRequestDef<DeletePrivateDnatRequest, DeletePrivateDnatResponse> genForDeletePrivateDnat() {
        // basic
        HttpRequestDef.Builder<DeletePrivateDnatRequest, DeletePrivateDnatResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePrivateDnatRequest.class, DeletePrivateDnatResponse.class)
                .withName("DeletePrivateDnat")
                .withUri("/v3/{project_id}/private-nat/dnat-rules/{dnat_rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("dnat_rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePrivateDnatRequest::getDnatRuleId, DeletePrivateDnatRequest::setDnatRuleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNatGatewayDnatRulesRequest, ListNatGatewayDnatRulesResponse> listNatGatewayDnatRules =
        genForListNatGatewayDnatRules();

    private static HttpRequestDef<ListNatGatewayDnatRulesRequest, ListNatGatewayDnatRulesResponse> genForListNatGatewayDnatRules() {
        // basic
        HttpRequestDef.Builder<ListNatGatewayDnatRulesRequest, ListNatGatewayDnatRulesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListNatGatewayDnatRulesRequest.class, ListNatGatewayDnatRulesResponse.class)
            .withName("ListNatGatewayDnatRules")
            .withUri("/v2/{project_id}/dnat_rules")
            .withContentType("application/json");

        // requests
        builder.<Boolean>withRequestField("admin_state_up",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListNatGatewayDnatRulesRequest::getAdminStateUp,
                ListNatGatewayDnatRulesRequest::setAdminStateUp));
        builder.<Integer>withRequestField("external_service_port",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNatGatewayDnatRulesRequest::getExternalServicePort,
                ListNatGatewayDnatRulesRequest::setExternalServicePort));
        builder.<String>withRequestField("floating_ip_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNatGatewayDnatRulesRequest::getFloatingIpAddress,
                ListNatGatewayDnatRulesRequest::setFloatingIpAddress));
        builder.<List<ListNatGatewayDnatRulesRequest.StatusEnum>>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListNatGatewayDnatRulesRequest::getStatus,
                ListNatGatewayDnatRulesRequest::setStatus));
        builder.<String>withRequestField("floating_ip_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNatGatewayDnatRulesRequest::getFloatingIpId,
                ListNatGatewayDnatRulesRequest::setFloatingIpId));
        builder.<Integer>withRequestField("internal_service_port",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNatGatewayDnatRulesRequest::getInternalServicePort,
                ListNatGatewayDnatRulesRequest::setInternalServicePort));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNatGatewayDnatRulesRequest::getLimit, ListNatGatewayDnatRulesRequest::setLimit));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNatGatewayDnatRulesRequest::getId, ListNatGatewayDnatRulesRequest::setId));
        builder.<String>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNatGatewayDnatRulesRequest::getDescription,
                ListNatGatewayDnatRulesRequest::setDescription));
        builder.<String>withRequestField("created_at",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNatGatewayDnatRulesRequest::getCreatedAt,
                ListNatGatewayDnatRulesRequest::setCreatedAt));
        builder.<List<String>>withRequestField("nat_gateway_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListNatGatewayDnatRulesRequest::getNatGatewayId,
                ListNatGatewayDnatRulesRequest::setNatGatewayId));
        builder.<String>withRequestField("port_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNatGatewayDnatRulesRequest::getPortId,
                ListNatGatewayDnatRulesRequest::setPortId));
        builder.<String>withRequestField("private_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNatGatewayDnatRulesRequest::getPrivateIp,
                ListNatGatewayDnatRulesRequest::setPrivateIp));
        builder.<List<String>>withRequestField("protocol",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListNatGatewayDnatRulesRequest::getProtocol,
                ListNatGatewayDnatRulesRequest::setProtocol));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNatGatewayDnatRulesRequest::getMarker,
                ListNatGatewayDnatRulesRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPrivateDnatsRequest, ListPrivateDnatsResponse> listPrivateDnats =
        genForListPrivateDnats();

    private static HttpRequestDef<ListPrivateDnatsRequest, ListPrivateDnatsResponse> genForListPrivateDnats() {
        // basic
        HttpRequestDef.Builder<ListPrivateDnatsRequest, ListPrivateDnatsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPrivateDnatsRequest.class, ListPrivateDnatsResponse.class)
                .withName("ListPrivateDnats")
                .withUri("/v3/{project_id}/private-nat/dnat-rules")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPrivateDnatsRequest::getLimit, ListPrivateDnatsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPrivateDnatsRequest::getMarker, ListPrivateDnatsRequest::setMarker));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListPrivateDnatsRequest::getPageReverse, ListPrivateDnatsRequest::setPageReverse));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPrivateDnatsRequest::getId, ListPrivateDnatsRequest::setId));
        builder.<List<String>>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPrivateDnatsRequest::getEnterpriseProjectId,
                ListPrivateDnatsRequest::setEnterpriseProjectId));
        builder.<List<String>>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPrivateDnatsRequest::getDescription, ListPrivateDnatsRequest::setDescription));
        builder.<List<String>>withRequestField("gateway_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPrivateDnatsRequest::getGatewayId, ListPrivateDnatsRequest::setGatewayId));
        builder.<List<String>>withRequestField("transit_ip_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPrivateDnatsRequest::getTransitIpId, ListPrivateDnatsRequest::setTransitIpId));
        builder.<List<String>>withRequestField("external_ip_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPrivateDnatsRequest::getExternalIpAddress,
                ListPrivateDnatsRequest::setExternalIpAddress));
        builder.<List<String>>withRequestField("network_interface_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPrivateDnatsRequest::getNetworkInterfaceId,
                ListPrivateDnatsRequest::setNetworkInterfaceId));
        builder.<List<String>>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPrivateDnatsRequest::getType, ListPrivateDnatsRequest::setType));
        builder.<List<String>>withRequestField("private_ip_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPrivateDnatsRequest::getPrivateIpAddress,
                ListPrivateDnatsRequest::setPrivateIpAddress));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowNatGatewayDnatRuleRequest, ShowNatGatewayDnatRuleResponse> showNatGatewayDnatRule =
        genForShowNatGatewayDnatRule();

    private static HttpRequestDef<ShowNatGatewayDnatRuleRequest, ShowNatGatewayDnatRuleResponse> genForShowNatGatewayDnatRule() {
        // basic
        HttpRequestDef.Builder<ShowNatGatewayDnatRuleRequest, ShowNatGatewayDnatRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowNatGatewayDnatRuleRequest.class, ShowNatGatewayDnatRuleResponse.class)
            .withName("ShowNatGatewayDnatRule")
            .withUri("/v2/{project_id}/dnat_rules/{dnat_rule_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("dnat_rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNatGatewayDnatRuleRequest::getDnatRuleId,
                ShowNatGatewayDnatRuleRequest::setDnatRuleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPrivateDnatRequest, ShowPrivateDnatResponse> showPrivateDnat =
        genForShowPrivateDnat();

    private static HttpRequestDef<ShowPrivateDnatRequest, ShowPrivateDnatResponse> genForShowPrivateDnat() {
        // basic
        HttpRequestDef.Builder<ShowPrivateDnatRequest, ShowPrivateDnatResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPrivateDnatRequest.class, ShowPrivateDnatResponse.class)
                .withName("ShowPrivateDnat")
                .withUri("/v3/{project_id}/private-nat/dnat-rules/{dnat_rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("dnat_rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPrivateDnatRequest::getDnatRuleId, ShowPrivateDnatRequest::setDnatRuleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateNatGatewayDnatRuleRequest, UpdateNatGatewayDnatRuleResponse> updateNatGatewayDnatRule =
        genForUpdateNatGatewayDnatRule();

    private static HttpRequestDef<UpdateNatGatewayDnatRuleRequest, UpdateNatGatewayDnatRuleResponse> genForUpdateNatGatewayDnatRule() {
        // basic
        HttpRequestDef.Builder<UpdateNatGatewayDnatRuleRequest, UpdateNatGatewayDnatRuleResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT, UpdateNatGatewayDnatRuleRequest.class, UpdateNatGatewayDnatRuleResponse.class)
                .withName("UpdateNatGatewayDnatRule")
                .withUri("/v2/{project_id}/dnat_rules/{dnat_rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("dnat_rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateNatGatewayDnatRuleRequest::getDnatRuleId,
                UpdateNatGatewayDnatRuleRequest::setDnatRuleId));
        builder.<UpdateNatGatewayDnatRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateNatGatewayDnatRuleRequestBody.class),
            f -> f.withMarshaller(UpdateNatGatewayDnatRuleRequest::getBody, UpdateNatGatewayDnatRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePrivateDnatRequest, UpdatePrivateDnatResponse> updatePrivateDnat =
        genForUpdatePrivateDnat();

    private static HttpRequestDef<UpdatePrivateDnatRequest, UpdatePrivateDnatResponse> genForUpdatePrivateDnat() {
        // basic
        HttpRequestDef.Builder<UpdatePrivateDnatRequest, UpdatePrivateDnatResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePrivateDnatRequest.class, UpdatePrivateDnatResponse.class)
                .withName("UpdatePrivateDnat")
                .withUri("/v3/{project_id}/private-nat/dnat-rules/{dnat_rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("dnat_rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePrivateDnatRequest::getDnatRuleId, UpdatePrivateDnatRequest::setDnatRuleId));
        builder.<UpdatePrivateDnatRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePrivateDnatRequestBody.class),
            f -> f.withMarshaller(UpdatePrivateDnatRequest::getBody, UpdatePrivateDnatRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateDeleteTransitIpTagsRequest, BatchCreateDeleteTransitIpTagsResponse> batchCreateDeleteTransitIpTags =
        genForBatchCreateDeleteTransitIpTags();

    private static HttpRequestDef<BatchCreateDeleteTransitIpTagsRequest, BatchCreateDeleteTransitIpTagsResponse> genForBatchCreateDeleteTransitIpTags() {
        // basic
        HttpRequestDef.Builder<BatchCreateDeleteTransitIpTagsRequest, BatchCreateDeleteTransitIpTagsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchCreateDeleteTransitIpTagsRequest.class,
                    BatchCreateDeleteTransitIpTagsResponse.class)
                .withName("BatchCreateDeleteTransitIpTags")
                .withUri("/v3/{project_id}/transit-ips/{resource_id}/tags/action")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateDeleteTransitIpTagsRequest::getResourceId,
                BatchCreateDeleteTransitIpTagsRequest::setResourceId));
        builder.<BatchOperateResourceTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchOperateResourceTagsRequestBody.class),
            f -> f.withMarshaller(BatchCreateDeleteTransitIpTagsRequest::getBody,
                BatchCreateDeleteTransitIpTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTransitIpTagRequest, CreateTransitIpTagResponse> createTransitIpTag =
        genForCreateTransitIpTag();

    private static HttpRequestDef<CreateTransitIpTagRequest, CreateTransitIpTagResponse> genForCreateTransitIpTag() {
        // basic
        HttpRequestDef.Builder<CreateTransitIpTagRequest, CreateTransitIpTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTransitIpTagRequest.class, CreateTransitIpTagResponse.class)
                .withName("CreateTransitIpTag")
                .withUri("/v3/{project_id}/transit-ips/{resource_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTransitIpTagRequest::getResourceId, CreateTransitIpTagRequest::setResourceId));
        builder.<CreateResourceTagRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateResourceTagRequestBody.class),
            f -> f.withMarshaller(CreateTransitIpTagRequest::getBody, CreateTransitIpTagRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTransitIpTagRequest, DeleteTransitIpTagResponse> deleteTransitIpTag =
        genForDeleteTransitIpTag();

    private static HttpRequestDef<DeleteTransitIpTagRequest, DeleteTransitIpTagResponse> genForDeleteTransitIpTag() {
        // basic
        HttpRequestDef.Builder<DeleteTransitIpTagRequest, DeleteTransitIpTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTransitIpTagRequest.class, DeleteTransitIpTagResponse.class)
                .withName("DeleteTransitIpTag")
                .withUri("/v3/{project_id}/transit-ips/{resource_id}/tags/{key}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTransitIpTagRequest::getKey, DeleteTransitIpTagRequest::setKey));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTransitIpTagRequest::getResourceId, DeleteTransitIpTagRequest::setResourceId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteTransitIpTagResponse::getBody, DeleteTransitIpTagResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ListTransitIpTagsRequest, ListTransitIpTagsResponse> listTransitIpTags =
        genForListTransitIpTags();

    private static HttpRequestDef<ListTransitIpTagsRequest, ListTransitIpTagsResponse> genForListTransitIpTags() {
        // basic
        HttpRequestDef.Builder<ListTransitIpTagsRequest, ListTransitIpTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTransitIpTagsRequest.class, ListTransitIpTagsResponse.class)
                .withName("ListTransitIpTags")
                .withUri("/v3/{project_id}/transit-ips/tags")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTransitIpsByTagsRequest, ListTransitIpsByTagsResponse> listTransitIpsByTags =
        genForListTransitIpsByTags();

    private static HttpRequestDef<ListTransitIpsByTagsRequest, ListTransitIpsByTagsResponse> genForListTransitIpsByTags() {
        // basic
        HttpRequestDef.Builder<ListTransitIpsByTagsRequest, ListTransitIpsByTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListTransitIpsByTagsRequest.class, ListTransitIpsByTagsResponse.class)
            .withName("ListTransitIpsByTags")
            .withUri("/v3/{project_id}/transit-ips/resource_instances/action")
            .withContentType("application/json");

        // requests
        builder.<ListTagResourceInstancesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListTagResourceInstancesRequestBody.class),
            f -> f.withMarshaller(ListTransitIpsByTagsRequest::getBody, ListTransitIpsByTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTransitIpTagsRequest, ShowTransitIpTagsResponse> showTransitIpTags =
        genForShowTransitIpTags();

    private static HttpRequestDef<ShowTransitIpTagsRequest, ShowTransitIpTagsResponse> genForShowTransitIpTags() {
        // basic
        HttpRequestDef.Builder<ShowTransitIpTagsRequest, ShowTransitIpTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTransitIpTagsRequest.class, ShowTransitIpTagsResponse.class)
                .withName("ShowTransitIpTags")
                .withUri("/v3/{project_id}/transit-ips/{resource_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTransitIpTagsRequest::getResourceId, ShowTransitIpTagsRequest::setResourceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateDeleteNatGatewayTagRequest, BatchCreateDeleteNatGatewayTagResponse> batchCreateDeleteNatGatewayTag =
        genForBatchCreateDeleteNatGatewayTag();

    private static HttpRequestDef<BatchCreateDeleteNatGatewayTagRequest, BatchCreateDeleteNatGatewayTagResponse> genForBatchCreateDeleteNatGatewayTag() {
        // basic
        HttpRequestDef.Builder<BatchCreateDeleteNatGatewayTagRequest, BatchCreateDeleteNatGatewayTagResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchCreateDeleteNatGatewayTagRequest.class,
                    BatchCreateDeleteNatGatewayTagResponse.class)
                .withName("BatchCreateDeleteNatGatewayTag")
                .withUri("/v3/{project_id}/nat_gateways/{nat_gateway_id}/tags/action")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("nat_gateway_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateDeleteNatGatewayTagRequest::getNatGatewayId,
                BatchCreateDeleteNatGatewayTagRequest::setNatGatewayId));
        builder.<BatchCreateDeleteNatTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateDeleteNatTagsRequestBody.class),
            f -> f.withMarshaller(BatchCreateDeleteNatGatewayTagRequest::getBody,
                BatchCreateDeleteNatGatewayTagRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateDeletePrivateNatTagsRequest, BatchCreateDeletePrivateNatTagsResponse> batchCreateDeletePrivateNatTags =
        genForBatchCreateDeletePrivateNatTags();

    private static HttpRequestDef<BatchCreateDeletePrivateNatTagsRequest, BatchCreateDeletePrivateNatTagsResponse> genForBatchCreateDeletePrivateNatTags() {
        // basic
        HttpRequestDef.Builder<BatchCreateDeletePrivateNatTagsRequest, BatchCreateDeletePrivateNatTagsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchCreateDeletePrivateNatTagsRequest.class,
                    BatchCreateDeletePrivateNatTagsResponse.class)
                .withName("BatchCreateDeletePrivateNatTags")
                .withUri("/v3/{project_id}/private-nat-gateways/{resource_id}/tags/action")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateDeletePrivateNatTagsRequest::getResourceId,
                BatchCreateDeletePrivateNatTagsRequest::setResourceId));
        builder.<BatchOperateResourceTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchOperateResourceTagsRequestBody.class),
            f -> f.withMarshaller(BatchCreateDeletePrivateNatTagsRequest::getBody,
                BatchCreateDeletePrivateNatTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateNatGatewayRequest, CreateNatGatewayResponse> createNatGateway =
        genForCreateNatGateway();

    private static HttpRequestDef<CreateNatGatewayRequest, CreateNatGatewayResponse> genForCreateNatGateway() {
        // basic
        HttpRequestDef.Builder<CreateNatGatewayRequest, CreateNatGatewayResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateNatGatewayRequest.class, CreateNatGatewayResponse.class)
                .withName("CreateNatGateway")
                .withUri("/v2/{project_id}/nat_gateways")
                .withContentType("application/json");

        // requests
        builder.<CreateNatGatewayRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateNatGatewayRequestBody.class),
            f -> f.withMarshaller(CreateNatGatewayRequest::getBody, CreateNatGatewayRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateNatGatewayTagRequest, CreateNatGatewayTagResponse> createNatGatewayTag =
        genForCreateNatGatewayTag();

    private static HttpRequestDef<CreateNatGatewayTagRequest, CreateNatGatewayTagResponse> genForCreateNatGatewayTag() {
        // basic
        HttpRequestDef.Builder<CreateNatGatewayTagRequest, CreateNatGatewayTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateNatGatewayTagRequest.class, CreateNatGatewayTagResponse.class)
                .withName("CreateNatGatewayTag")
                .withUri("/v3/{project_id}/nat_gateways/{nat_gateway_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("nat_gateway_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateNatGatewayTagRequest::getNatGatewayId,
                CreateNatGatewayTagRequest::setNatGatewayId));
        builder.<CreateNatTagRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateNatTagRequestBody.class),
            f -> f.withMarshaller(CreateNatGatewayTagRequest::getBody, CreateNatGatewayTagRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePrivateNatRequest, CreatePrivateNatResponse> createPrivateNat =
        genForCreatePrivateNat();

    private static HttpRequestDef<CreatePrivateNatRequest, CreatePrivateNatResponse> genForCreatePrivateNat() {
        // basic
        HttpRequestDef.Builder<CreatePrivateNatRequest, CreatePrivateNatResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePrivateNatRequest.class, CreatePrivateNatResponse.class)
                .withName("CreatePrivateNat")
                .withUri("/v3/{project_id}/private-nat/gateways")
                .withContentType("application/json");

        // requests
        builder.<CreatePrivateNatRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePrivateNatRequestBody.class),
            f -> f.withMarshaller(CreatePrivateNatRequest::getBody, CreatePrivateNatRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePrivateNatTagRequest, CreatePrivateNatTagResponse> createPrivateNatTag =
        genForCreatePrivateNatTag();

    private static HttpRequestDef<CreatePrivateNatTagRequest, CreatePrivateNatTagResponse> genForCreatePrivateNatTag() {
        // basic
        HttpRequestDef.Builder<CreatePrivateNatTagRequest, CreatePrivateNatTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePrivateNatTagRequest.class, CreatePrivateNatTagResponse.class)
                .withName("CreatePrivateNatTag")
                .withUri("/v3/{project_id}/private-nat-gateways/{resource_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePrivateNatTagRequest::getResourceId,
                CreatePrivateNatTagRequest::setResourceId));
        builder.<CreateResourceTagRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateResourceTagRequestBody.class),
            f -> f.withMarshaller(CreatePrivateNatTagRequest::getBody, CreatePrivateNatTagRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteNatGatewayRequest, DeleteNatGatewayResponse> deleteNatGateway =
        genForDeleteNatGateway();

    private static HttpRequestDef<DeleteNatGatewayRequest, DeleteNatGatewayResponse> genForDeleteNatGateway() {
        // basic
        HttpRequestDef.Builder<DeleteNatGatewayRequest, DeleteNatGatewayResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteNatGatewayRequest.class, DeleteNatGatewayResponse.class)
                .withName("DeleteNatGateway")
                .withUri("/v2/{project_id}/nat_gateways/{nat_gateway_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("nat_gateway_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteNatGatewayRequest::getNatGatewayId, DeleteNatGatewayRequest::setNatGatewayId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteNatGatewayTagRequest, DeleteNatGatewayTagResponse> deleteNatGatewayTag =
        genForDeleteNatGatewayTag();

    private static HttpRequestDef<DeleteNatGatewayTagRequest, DeleteNatGatewayTagResponse> genForDeleteNatGatewayTag() {
        // basic
        HttpRequestDef.Builder<DeleteNatGatewayTagRequest, DeleteNatGatewayTagResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteNatGatewayTagRequest.class, DeleteNatGatewayTagResponse.class)
            .withName("DeleteNatGatewayTag")
            .withUri("/v3/{project_id}/nat_gateways/{nat_gateway_id}/tags/{key}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("nat_gateway_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteNatGatewayTagRequest::getNatGatewayId,
                DeleteNatGatewayTagRequest::setNatGatewayId));
        builder.<String>withRequestField("key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteNatGatewayTagRequest::getKey, DeleteNatGatewayTagRequest::setKey));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteNatGatewayTagResponse::getBody, DeleteNatGatewayTagResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<DeletePrivateNatRequest, DeletePrivateNatResponse> deletePrivateNat =
        genForDeletePrivateNat();

    private static HttpRequestDef<DeletePrivateNatRequest, DeletePrivateNatResponse> genForDeletePrivateNat() {
        // basic
        HttpRequestDef.Builder<DeletePrivateNatRequest, DeletePrivateNatResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePrivateNatRequest.class, DeletePrivateNatResponse.class)
                .withName("DeletePrivateNat")
                .withUri("/v3/{project_id}/private-nat/gateways/{gateway_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("gateway_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePrivateNatRequest::getGatewayId, DeletePrivateNatRequest::setGatewayId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePrivateNatTagRequest, DeletePrivateNatTagResponse> deletePrivateNatTag =
        genForDeletePrivateNatTag();

    private static HttpRequestDef<DeletePrivateNatTagRequest, DeletePrivateNatTagResponse> genForDeletePrivateNatTag() {
        // basic
        HttpRequestDef.Builder<DeletePrivateNatTagRequest, DeletePrivateNatTagResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeletePrivateNatTagRequest.class, DeletePrivateNatTagResponse.class)
            .withName("DeletePrivateNatTag")
            .withUri("/v3/{project_id}/private-nat-gateways/{resource_id}/tags/{key}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePrivateNatTagRequest::getKey, DeletePrivateNatTagRequest::setKey));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePrivateNatTagRequest::getResourceId,
                DeletePrivateNatTagRequest::setResourceId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeletePrivateNatTagResponse::getBody, DeletePrivateNatTagResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ListNatGatewayByTagRequest, ListNatGatewayByTagResponse> listNatGatewayByTag =
        genForListNatGatewayByTag();

    private static HttpRequestDef<ListNatGatewayByTagRequest, ListNatGatewayByTagResponse> genForListNatGatewayByTag() {
        // basic
        HttpRequestDef.Builder<ListNatGatewayByTagRequest, ListNatGatewayByTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListNatGatewayByTagRequest.class, ListNatGatewayByTagResponse.class)
                .withName("ListNatGatewayByTag")
                .withUri("/v3/{project_id}/nat_gateways/resource_instances/action")
                .withContentType("application/json");

        // requests
        builder.<ListNatsByTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListNatsByTagsRequestBody.class),
            f -> f.withMarshaller(ListNatGatewayByTagRequest::getBody, ListNatGatewayByTagRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNatGatewayTagRequest, ListNatGatewayTagResponse> listNatGatewayTag =
        genForListNatGatewayTag();

    private static HttpRequestDef<ListNatGatewayTagRequest, ListNatGatewayTagResponse> genForListNatGatewayTag() {
        // basic
        HttpRequestDef.Builder<ListNatGatewayTagRequest, ListNatGatewayTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListNatGatewayTagRequest.class, ListNatGatewayTagResponse.class)
                .withName("ListNatGatewayTag")
                .withUri("/v3/{project_id}/nat_gateways/tags")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNatGatewaysRequest, ListNatGatewaysResponse> listNatGateways =
        genForListNatGateways();

    private static HttpRequestDef<ListNatGatewaysRequest, ListNatGatewaysResponse> genForListNatGateways() {
        // basic
        HttpRequestDef.Builder<ListNatGatewaysRequest, ListNatGatewaysResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListNatGatewaysRequest.class, ListNatGatewaysResponse.class)
                .withName("ListNatGateways")
                .withUri("/v2/{project_id}/nat_gateways")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNatGatewaysRequest::getId, ListNatGatewaysRequest::setId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNatGatewaysRequest::getEnterpriseProjectId,
                ListNatGatewaysRequest::setEnterpriseProjectId));
        builder.<String>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNatGatewaysRequest::getDescription, ListNatGatewaysRequest::setDescription));
        builder.<String>withRequestField("created_at",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNatGatewaysRequest::getCreatedAt, ListNatGatewaysRequest::setCreatedAt));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNatGatewaysRequest::getName, ListNatGatewaysRequest::setName));
        builder.<List<ListNatGatewaysRequest.StatusEnum>>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListNatGatewaysRequest::getStatus, ListNatGatewaysRequest::setStatus));
        builder.<List<ListNatGatewaysRequest.SpecEnum>>withRequestField("spec",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListNatGatewaysRequest::getSpec, ListNatGatewaysRequest::setSpec));
        builder.<Boolean>withRequestField("admin_state_up",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListNatGatewaysRequest::getAdminStateUp, ListNatGatewaysRequest::setAdminStateUp));
        builder.<String>withRequestField("internal_network_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNatGatewaysRequest::getInternalNetworkId,
                ListNatGatewaysRequest::setInternalNetworkId));
        builder.<String>withRequestField("router_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNatGatewaysRequest::getRouterId, ListNatGatewaysRequest::setRouterId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNatGatewaysRequest::getLimit, ListNatGatewaysRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNatGatewaysRequest::getMarker, ListNatGatewaysRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPrivateNatTagsRequest, ListPrivateNatTagsResponse> listPrivateNatTags =
        genForListPrivateNatTags();

    private static HttpRequestDef<ListPrivateNatTagsRequest, ListPrivateNatTagsResponse> genForListPrivateNatTags() {
        // basic
        HttpRequestDef.Builder<ListPrivateNatTagsRequest, ListPrivateNatTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPrivateNatTagsRequest.class, ListPrivateNatTagsResponse.class)
                .withName("ListPrivateNatTags")
                .withUri("/v3/{project_id}/private-nat-gateways/tags")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPrivateNatsRequest, ListPrivateNatsResponse> listPrivateNats =
        genForListPrivateNats();

    private static HttpRequestDef<ListPrivateNatsRequest, ListPrivateNatsResponse> genForListPrivateNats() {
        // basic
        HttpRequestDef.Builder<ListPrivateNatsRequest, ListPrivateNatsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPrivateNatsRequest.class, ListPrivateNatsResponse.class)
                .withName("ListPrivateNats")
                .withUri("/v3/{project_id}/private-nat/gateways")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPrivateNatsRequest::getLimit, ListPrivateNatsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPrivateNatsRequest::getMarker, ListPrivateNatsRequest::setMarker));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListPrivateNatsRequest::getPageReverse, ListPrivateNatsRequest::setPageReverse));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPrivateNatsRequest::getId, ListPrivateNatsRequest::setId));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPrivateNatsRequest::getName, ListPrivateNatsRequest::setName));
        builder.<List<String>>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPrivateNatsRequest::getDescription, ListPrivateNatsRequest::setDescription));
        builder.<List<ListPrivateNatsRequest.SpecEnum>>withRequestField("spec",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPrivateNatsRequest::getSpec, ListPrivateNatsRequest::setSpec));
        builder.<List<ListPrivateNatsRequest.StatusEnum>>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPrivateNatsRequest::getStatus, ListPrivateNatsRequest::setStatus));
        builder.<List<String>>withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPrivateNatsRequest::getVpcId, ListPrivateNatsRequest::setVpcId));
        builder.<List<String>>withRequestField("virsubnet_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPrivateNatsRequest::getVirsubnetId, ListPrivateNatsRequest::setVirsubnetId));
        builder.<List<String>>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPrivateNatsRequest::getEnterpriseProjectId,
                ListPrivateNatsRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPrivateNatsByTagsRequest, ListPrivateNatsByTagsResponse> listPrivateNatsByTags =
        genForListPrivateNatsByTags();

    private static HttpRequestDef<ListPrivateNatsByTagsRequest, ListPrivateNatsByTagsResponse> genForListPrivateNatsByTags() {
        // basic
        HttpRequestDef.Builder<ListPrivateNatsByTagsRequest, ListPrivateNatsByTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListPrivateNatsByTagsRequest.class, ListPrivateNatsByTagsResponse.class)
            .withName("ListPrivateNatsByTags")
            .withUri("/v3/{project_id}/private-nat-gateways/resource_instances/action")
            .withContentType("application/json");

        // requests
        builder.<ListTagResourceInstancesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListTagResourceInstancesRequestBody.class),
            f -> f.withMarshaller(ListPrivateNatsByTagsRequest::getBody, ListPrivateNatsByTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowNatGatewayRequest, ShowNatGatewayResponse> showNatGateway =
        genForShowNatGateway();

    private static HttpRequestDef<ShowNatGatewayRequest, ShowNatGatewayResponse> genForShowNatGateway() {
        // basic
        HttpRequestDef.Builder<ShowNatGatewayRequest, ShowNatGatewayResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowNatGatewayRequest.class, ShowNatGatewayResponse.class)
                .withName("ShowNatGateway")
                .withUri("/v2/{project_id}/nat_gateways/{nat_gateway_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("nat_gateway_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNatGatewayRequest::getNatGatewayId, ShowNatGatewayRequest::setNatGatewayId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowNatGatewayTagRequest, ShowNatGatewayTagResponse> showNatGatewayTag =
        genForShowNatGatewayTag();

    private static HttpRequestDef<ShowNatGatewayTagRequest, ShowNatGatewayTagResponse> genForShowNatGatewayTag() {
        // basic
        HttpRequestDef.Builder<ShowNatGatewayTagRequest, ShowNatGatewayTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowNatGatewayTagRequest.class, ShowNatGatewayTagResponse.class)
                .withName("ShowNatGatewayTag")
                .withUri("/v3/{project_id}/nat_gateways/{nat_gateway_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("nat_gateway_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNatGatewayTagRequest::getNatGatewayId,
                ShowNatGatewayTagRequest::setNatGatewayId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPrivateNatRequest, ShowPrivateNatResponse> showPrivateNat =
        genForShowPrivateNat();

    private static HttpRequestDef<ShowPrivateNatRequest, ShowPrivateNatResponse> genForShowPrivateNat() {
        // basic
        HttpRequestDef.Builder<ShowPrivateNatRequest, ShowPrivateNatResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPrivateNatRequest.class, ShowPrivateNatResponse.class)
                .withName("ShowPrivateNat")
                .withUri("/v3/{project_id}/private-nat/gateways/{gateway_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("gateway_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPrivateNatRequest::getGatewayId, ShowPrivateNatRequest::setGatewayId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPrivateNatTagsRequest, ShowPrivateNatTagsResponse> showPrivateNatTags =
        genForShowPrivateNatTags();

    private static HttpRequestDef<ShowPrivateNatTagsRequest, ShowPrivateNatTagsResponse> genForShowPrivateNatTags() {
        // basic
        HttpRequestDef.Builder<ShowPrivateNatTagsRequest, ShowPrivateNatTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPrivateNatTagsRequest.class, ShowPrivateNatTagsResponse.class)
                .withName("ShowPrivateNatTags")
                .withUri("/v3/{project_id}/private-nat-gateways/{resource_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPrivateNatTagsRequest::getResourceId, ShowPrivateNatTagsRequest::setResourceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateNatGatewayRequest, UpdateNatGatewayResponse> updateNatGateway =
        genForUpdateNatGateway();

    private static HttpRequestDef<UpdateNatGatewayRequest, UpdateNatGatewayResponse> genForUpdateNatGateway() {
        // basic
        HttpRequestDef.Builder<UpdateNatGatewayRequest, UpdateNatGatewayResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateNatGatewayRequest.class, UpdateNatGatewayResponse.class)
                .withName("UpdateNatGateway")
                .withUri("/v2/{project_id}/nat_gateways/{nat_gateway_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("nat_gateway_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateNatGatewayRequest::getNatGatewayId, UpdateNatGatewayRequest::setNatGatewayId));
        builder.<UpdateNatGatewayRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateNatGatewayRequestBody.class),
            f -> f.withMarshaller(UpdateNatGatewayRequest::getBody, UpdateNatGatewayRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePrivateNatRequest, UpdatePrivateNatResponse> updatePrivateNat =
        genForUpdatePrivateNat();

    private static HttpRequestDef<UpdatePrivateNatRequest, UpdatePrivateNatResponse> genForUpdatePrivateNat() {
        // basic
        HttpRequestDef.Builder<UpdatePrivateNatRequest, UpdatePrivateNatResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePrivateNatRequest.class, UpdatePrivateNatResponse.class)
                .withName("UpdatePrivateNat")
                .withUri("/v3/{project_id}/private-nat/gateways/{gateway_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("gateway_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePrivateNatRequest::getGatewayId, UpdatePrivateNatRequest::setGatewayId));
        builder.<UpdatePrivateNatRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePrivateNatRequestBody.class),
            f -> f.withMarshaller(UpdatePrivateNatRequest::getBody, UpdatePrivateNatRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTransitIpRequest, CreateTransitIpResponse> createTransitIp =
        genForCreateTransitIp();

    private static HttpRequestDef<CreateTransitIpRequest, CreateTransitIpResponse> genForCreateTransitIp() {
        // basic
        HttpRequestDef.Builder<CreateTransitIpRequest, CreateTransitIpResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTransitIpRequest.class, CreateTransitIpResponse.class)
                .withName("CreateTransitIp")
                .withUri("/v3/{project_id}/private-nat/transit-ips")
                .withContentType("application/json");

        // requests
        builder.<CreateTransitIpRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTransitIpRequestBody.class),
            f -> f.withMarshaller(CreateTransitIpRequest::getBody, CreateTransitIpRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTransitIpRequest, DeleteTransitIpResponse> deleteTransitIp =
        genForDeleteTransitIp();

    private static HttpRequestDef<DeleteTransitIpRequest, DeleteTransitIpResponse> genForDeleteTransitIp() {
        // basic
        HttpRequestDef.Builder<DeleteTransitIpRequest, DeleteTransitIpResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTransitIpRequest.class, DeleteTransitIpResponse.class)
                .withName("DeleteTransitIp")
                .withUri("/v3/{project_id}/private-nat/transit-ips/{transit_ip_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("transit_ip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTransitIpRequest::getTransitIpId, DeleteTransitIpRequest::setTransitIpId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTransitIpsRequest, ListTransitIpsResponse> listTransitIps =
        genForListTransitIps();

    private static HttpRequestDef<ListTransitIpsRequest, ListTransitIpsResponse> genForListTransitIps() {
        // basic
        HttpRequestDef.Builder<ListTransitIpsRequest, ListTransitIpsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTransitIpsRequest.class, ListTransitIpsResponse.class)
                .withName("ListTransitIps")
                .withUri("/v3/{project_id}/private-nat/transit-ips")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTransitIpsRequest::getLimit, ListTransitIpsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTransitIpsRequest::getMarker, ListTransitIpsRequest::setMarker));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListTransitIpsRequest::getPageReverse, ListTransitIpsRequest::setPageReverse));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListTransitIpsRequest::getId, ListTransitIpsRequest::setId));
        builder.<List<String>>withRequestField("network_interface_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListTransitIpsRequest::getNetworkInterfaceId,
                ListTransitIpsRequest::setNetworkInterfaceId));
        builder.<List<String>>withRequestField("ip_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListTransitIpsRequest::getIpAddress, ListTransitIpsRequest::setIpAddress));
        builder.<List<String>>withRequestField("gateway_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListTransitIpsRequest::getGatewayId, ListTransitIpsRequest::setGatewayId));
        builder.<List<String>>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListTransitIpsRequest::getEnterpriseProjectId,
                ListTransitIpsRequest::setEnterpriseProjectId));
        builder.<List<String>>withRequestField("virsubnet_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListTransitIpsRequest::getVirsubnetId, ListTransitIpsRequest::setVirsubnetId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTransitIpRequest, ShowTransitIpResponse> showTransitIp =
        genForShowTransitIp();

    private static HttpRequestDef<ShowTransitIpRequest, ShowTransitIpResponse> genForShowTransitIp() {
        // basic
        HttpRequestDef.Builder<ShowTransitIpRequest, ShowTransitIpResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTransitIpRequest.class, ShowTransitIpResponse.class)
                .withName("ShowTransitIp")
                .withUri("/v3/{project_id}/private-nat/transit-ips/{transit_ip_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("transit_ip_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTransitIpRequest::getTransitIpId, ShowTransitIpRequest::setTransitIpId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateNatGatewaySnatRuleRequest, CreateNatGatewaySnatRuleResponse> createNatGatewaySnatRule =
        genForCreateNatGatewaySnatRule();

    private static HttpRequestDef<CreateNatGatewaySnatRuleRequest, CreateNatGatewaySnatRuleResponse> genForCreateNatGatewaySnatRule() {
        // basic
        HttpRequestDef.Builder<CreateNatGatewaySnatRuleRequest, CreateNatGatewaySnatRuleResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, CreateNatGatewaySnatRuleRequest.class, CreateNatGatewaySnatRuleResponse.class)
                .withName("CreateNatGatewaySnatRule")
                .withUri("/v2/{project_id}/snat_rules")
                .withContentType("application/json");

        // requests
        builder.<CreateNatGatewaySnatRuleRequestOption>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateNatGatewaySnatRuleRequestOption.class),
            f -> f.withMarshaller(CreateNatGatewaySnatRuleRequest::getBody, CreateNatGatewaySnatRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePrivateSnatRequest, CreatePrivateSnatResponse> createPrivateSnat =
        genForCreatePrivateSnat();

    private static HttpRequestDef<CreatePrivateSnatRequest, CreatePrivateSnatResponse> genForCreatePrivateSnat() {
        // basic
        HttpRequestDef.Builder<CreatePrivateSnatRequest, CreatePrivateSnatResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePrivateSnatRequest.class, CreatePrivateSnatResponse.class)
                .withName("CreatePrivateSnat")
                .withUri("/v3/{project_id}/private-nat/snat-rules")
                .withContentType("application/json");

        // requests
        builder.<CreatePrivateSnatOptionBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePrivateSnatOptionBody.class),
            f -> f.withMarshaller(CreatePrivateSnatRequest::getBody, CreatePrivateSnatRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteNatGatewaySnatRuleRequest, DeleteNatGatewaySnatRuleResponse> deleteNatGatewaySnatRule =
        genForDeleteNatGatewaySnatRule();

    private static HttpRequestDef<DeleteNatGatewaySnatRuleRequest, DeleteNatGatewaySnatRuleResponse> genForDeleteNatGatewaySnatRule() {
        // basic
        HttpRequestDef.Builder<DeleteNatGatewaySnatRuleRequest, DeleteNatGatewaySnatRuleResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteNatGatewaySnatRuleRequest.class,
                    DeleteNatGatewaySnatRuleResponse.class)
                .withName("DeleteNatGatewaySnatRule")
                .withUri("/v2/{project_id}/nat_gateways/{nat_gateway_id}/snat_rules/{snat_rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("nat_gateway_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteNatGatewaySnatRuleRequest::getNatGatewayId,
                DeleteNatGatewaySnatRuleRequest::setNatGatewayId));
        builder.<String>withRequestField("snat_rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteNatGatewaySnatRuleRequest::getSnatRuleId,
                DeleteNatGatewaySnatRuleRequest::setSnatRuleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePrivateSnatRequest, DeletePrivateSnatResponse> deletePrivateSnat =
        genForDeletePrivateSnat();

    private static HttpRequestDef<DeletePrivateSnatRequest, DeletePrivateSnatResponse> genForDeletePrivateSnat() {
        // basic
        HttpRequestDef.Builder<DeletePrivateSnatRequest, DeletePrivateSnatResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePrivateSnatRequest.class, DeletePrivateSnatResponse.class)
                .withName("DeletePrivateSnat")
                .withUri("/v3/{project_id}/private-nat/snat-rules/{snat_rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("snat_rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePrivateSnatRequest::getSnatRuleId, DeletePrivateSnatRequest::setSnatRuleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNatGatewaySnatRulesRequest, ListNatGatewaySnatRulesResponse> listNatGatewaySnatRules =
        genForListNatGatewaySnatRules();

    private static HttpRequestDef<ListNatGatewaySnatRulesRequest, ListNatGatewaySnatRulesResponse> genForListNatGatewaySnatRules() {
        // basic
        HttpRequestDef.Builder<ListNatGatewaySnatRulesRequest, ListNatGatewaySnatRulesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListNatGatewaySnatRulesRequest.class, ListNatGatewaySnatRulesResponse.class)
            .withName("ListNatGatewaySnatRules")
            .withUri("/v2/{project_id}/snat_rules")
            .withContentType("application/json");

        // requests
        builder.<Boolean>withRequestField("admin_state_up",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListNatGatewaySnatRulesRequest::getAdminStateUp,
                ListNatGatewaySnatRulesRequest::setAdminStateUp));
        builder.<String>withRequestField("cidr",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNatGatewaySnatRulesRequest::getCidr, ListNatGatewaySnatRulesRequest::setCidr));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNatGatewaySnatRulesRequest::getLimit, ListNatGatewaySnatRulesRequest::setLimit));
        builder.<String>withRequestField("floating_ip_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNatGatewaySnatRulesRequest::getFloatingIpAddress,
                ListNatGatewaySnatRulesRequest::setFloatingIpAddress));
        builder.<String>withRequestField("floating_ip_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNatGatewaySnatRulesRequest::getFloatingIpId,
                ListNatGatewaySnatRulesRequest::setFloatingIpId));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNatGatewaySnatRulesRequest::getId, ListNatGatewaySnatRulesRequest::setId));
        builder.<String>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNatGatewaySnatRulesRequest::getDescription,
                ListNatGatewaySnatRulesRequest::setDescription));
        builder.<String>withRequestField("created_at",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNatGatewaySnatRulesRequest::getCreatedAt,
                ListNatGatewaySnatRulesRequest::setCreatedAt));
        builder.<List<String>>withRequestField("nat_gateway_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListNatGatewaySnatRulesRequest::getNatGatewayId,
                ListNatGatewaySnatRulesRequest::setNatGatewayId));
        builder.<String>withRequestField("network_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNatGatewaySnatRulesRequest::getNetworkId,
                ListNatGatewaySnatRulesRequest::setNetworkId));
        builder.<Integer>withRequestField("source_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNatGatewaySnatRulesRequest::getSourceType,
                ListNatGatewaySnatRulesRequest::setSourceType));
        builder.<ListNatGatewaySnatRulesRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListNatGatewaySnatRulesRequest.StatusEnum.class),
            f -> f.withMarshaller(ListNatGatewaySnatRulesRequest::getStatus,
                ListNatGatewaySnatRulesRequest::setStatus));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNatGatewaySnatRulesRequest::getMarker,
                ListNatGatewaySnatRulesRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPrivateSnatsRequest, ListPrivateSnatsResponse> listPrivateSnats =
        genForListPrivateSnats();

    private static HttpRequestDef<ListPrivateSnatsRequest, ListPrivateSnatsResponse> genForListPrivateSnats() {
        // basic
        HttpRequestDef.Builder<ListPrivateSnatsRequest, ListPrivateSnatsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPrivateSnatsRequest.class, ListPrivateSnatsResponse.class)
                .withName("ListPrivateSnats")
                .withUri("/v3/{project_id}/private-nat/snat-rules")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPrivateSnatsRequest::getLimit, ListPrivateSnatsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPrivateSnatsRequest::getMarker, ListPrivateSnatsRequest::setMarker));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListPrivateSnatsRequest::getPageReverse, ListPrivateSnatsRequest::setPageReverse));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPrivateSnatsRequest::getId, ListPrivateSnatsRequest::setId));
        builder.<List<String>>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPrivateSnatsRequest::getDescription, ListPrivateSnatsRequest::setDescription));
        builder.<List<String>>withRequestField("gateway_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPrivateSnatsRequest::getGatewayId, ListPrivateSnatsRequest::setGatewayId));
        builder.<List<String>>withRequestField("cidr",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPrivateSnatsRequest::getCidr, ListPrivateSnatsRequest::setCidr));
        builder.<List<String>>withRequestField("virsubnet_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPrivateSnatsRequest::getVirsubnetId, ListPrivateSnatsRequest::setVirsubnetId));
        builder.<List<String>>withRequestField("transit_ip_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPrivateSnatsRequest::getTransitIpId, ListPrivateSnatsRequest::setTransitIpId));
        builder.<List<String>>withRequestField("transit_ip_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPrivateSnatsRequest::getTransitIpAddress,
                ListPrivateSnatsRequest::setTransitIpAddress));
        builder.<List<String>>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPrivateSnatsRequest::getEnterpriseProjectId,
                ListPrivateSnatsRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowNatGatewaySnatRuleRequest, ShowNatGatewaySnatRuleResponse> showNatGatewaySnatRule =
        genForShowNatGatewaySnatRule();

    private static HttpRequestDef<ShowNatGatewaySnatRuleRequest, ShowNatGatewaySnatRuleResponse> genForShowNatGatewaySnatRule() {
        // basic
        HttpRequestDef.Builder<ShowNatGatewaySnatRuleRequest, ShowNatGatewaySnatRuleResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowNatGatewaySnatRuleRequest.class, ShowNatGatewaySnatRuleResponse.class)
            .withName("ShowNatGatewaySnatRule")
            .withUri("/v2/{project_id}/snat_rules/{snat_rule_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("snat_rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowNatGatewaySnatRuleRequest::getSnatRuleId,
                ShowNatGatewaySnatRuleRequest::setSnatRuleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPrivateSnatRequest, ShowPrivateSnatResponse> showPrivateSnat =
        genForShowPrivateSnat();

    private static HttpRequestDef<ShowPrivateSnatRequest, ShowPrivateSnatResponse> genForShowPrivateSnat() {
        // basic
        HttpRequestDef.Builder<ShowPrivateSnatRequest, ShowPrivateSnatResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPrivateSnatRequest.class, ShowPrivateSnatResponse.class)
                .withName("ShowPrivateSnat")
                .withUri("/v3/{project_id}/private-nat/snat-rules/{snat_rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("snat_rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPrivateSnatRequest::getSnatRuleId, ShowPrivateSnatRequest::setSnatRuleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateNatGatewaySnatRuleRequest, UpdateNatGatewaySnatRuleResponse> updateNatGatewaySnatRule =
        genForUpdateNatGatewaySnatRule();

    private static HttpRequestDef<UpdateNatGatewaySnatRuleRequest, UpdateNatGatewaySnatRuleResponse> genForUpdateNatGatewaySnatRule() {
        // basic
        HttpRequestDef.Builder<UpdateNatGatewaySnatRuleRequest, UpdateNatGatewaySnatRuleResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT, UpdateNatGatewaySnatRuleRequest.class, UpdateNatGatewaySnatRuleResponse.class)
                .withName("UpdateNatGatewaySnatRule")
                .withUri("/v2/{project_id}/snat_rules/{snat_rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("snat_rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateNatGatewaySnatRuleRequest::getSnatRuleId,
                UpdateNatGatewaySnatRuleRequest::setSnatRuleId));
        builder.<UpdateNatGatewaySnatRuleRequestOption>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateNatGatewaySnatRuleRequestOption.class),
            f -> f.withMarshaller(UpdateNatGatewaySnatRuleRequest::getBody, UpdateNatGatewaySnatRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePrivateSnatRequest, UpdatePrivateSnatResponse> updatePrivateSnat =
        genForUpdatePrivateSnat();

    private static HttpRequestDef<UpdatePrivateSnatRequest, UpdatePrivateSnatResponse> genForUpdatePrivateSnat() {
        // basic
        HttpRequestDef.Builder<UpdatePrivateSnatRequest, UpdatePrivateSnatResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePrivateSnatRequest.class, UpdatePrivateSnatResponse.class)
                .withName("UpdatePrivateSnat")
                .withUri("/v3/{project_id}/private-nat/snat-rules/{snat_rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("snat_rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePrivateSnatRequest::getSnatRuleId, UpdatePrivateSnatRequest::setSnatRuleId));
        builder.<UpdatePrivateSnatOptionBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePrivateSnatOptionBody.class),
            f -> f.withMarshaller(UpdatePrivateSnatRequest::getBody, UpdatePrivateSnatRequest::setBody));

        // response

        return builder.build();
    }

}
