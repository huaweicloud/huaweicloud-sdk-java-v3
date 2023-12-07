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
        genForbatchCreateNatGatewayDnatRules();

    private static HttpRequestDef<BatchCreateNatGatewayDnatRulesRequest, BatchCreateNatGatewayDnatRulesResponse> genForbatchCreateNatGatewayDnatRules() {
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
            f -> f.withMarshaller(BatchCreateNatGatewayDnatRulesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateNatGatewayDnatRuleRequest, CreateNatGatewayDnatRuleResponse> createNatGatewayDnatRule =
        genForcreateNatGatewayDnatRule();

    private static HttpRequestDef<CreateNatGatewayDnatRuleRequest, CreateNatGatewayDnatRuleResponse> genForcreateNatGatewayDnatRule() {
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
            f -> f.withMarshaller(CreateNatGatewayDnatRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePrivateDnatRequest, CreatePrivateDnatResponse> createPrivateDnat =
        genForcreatePrivateDnat();

    private static HttpRequestDef<CreatePrivateDnatRequest, CreatePrivateDnatResponse> genForcreatePrivateDnat() {
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
            f -> f.withMarshaller(CreatePrivateDnatRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteNatGatewayDnatRuleRequest, DeleteNatGatewayDnatRuleResponse> deleteNatGatewayDnatRule =
        genFordeleteNatGatewayDnatRule();

    private static HttpRequestDef<DeleteNatGatewayDnatRuleRequest, DeleteNatGatewayDnatRuleResponse> genFordeleteNatGatewayDnatRule() {
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
            f -> f.withMarshaller(DeleteNatGatewayDnatRuleRequest::getNatGatewayId, (req, v) -> {
                req.setNatGatewayId(v);
            }));
        builder.<String>withRequestField("dnat_rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteNatGatewayDnatRuleRequest::getDnatRuleId, (req, v) -> {
                req.setDnatRuleId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePrivateDnatRequest, DeletePrivateDnatResponse> deletePrivateDnat =
        genFordeletePrivateDnat();

    private static HttpRequestDef<DeletePrivateDnatRequest, DeletePrivateDnatResponse> genFordeletePrivateDnat() {
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
            f -> f.withMarshaller(DeletePrivateDnatRequest::getDnatRuleId, (req, v) -> {
                req.setDnatRuleId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNatGatewayDnatRulesRequest, ListNatGatewayDnatRulesResponse> listNatGatewayDnatRules =
        genForlistNatGatewayDnatRules();

    private static HttpRequestDef<ListNatGatewayDnatRulesRequest, ListNatGatewayDnatRulesResponse> genForlistNatGatewayDnatRules() {
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
            f -> f.withMarshaller(ListNatGatewayDnatRulesRequest::getAdminStateUp, (req, v) -> {
                req.setAdminStateUp(v);
            }));
        builder.<Integer>withRequestField("external_service_port",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNatGatewayDnatRulesRequest::getExternalServicePort, (req, v) -> {
                req.setExternalServicePort(v);
            }));
        builder.<String>withRequestField("floating_ip_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNatGatewayDnatRulesRequest::getFloatingIpAddress, (req, v) -> {
                req.setFloatingIpAddress(v);
            }));
        builder.<List<ListNatGatewayDnatRulesRequest.StatusEnum>>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListNatGatewayDnatRulesRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("floating_ip_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNatGatewayDnatRulesRequest::getFloatingIpId, (req, v) -> {
                req.setFloatingIpId(v);
            }));
        builder.<Integer>withRequestField("internal_service_port",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNatGatewayDnatRulesRequest::getInternalServicePort, (req, v) -> {
                req.setInternalServicePort(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNatGatewayDnatRulesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNatGatewayDnatRulesRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNatGatewayDnatRulesRequest::getDescription, (req, v) -> {
                req.setDescription(v);
            }));
        builder.<String>withRequestField("created_at",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNatGatewayDnatRulesRequest::getCreatedAt, (req, v) -> {
                req.setCreatedAt(v);
            }));
        builder.<List<String>>withRequestField("nat_gateway_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListNatGatewayDnatRulesRequest::getNatGatewayId, (req, v) -> {
                req.setNatGatewayId(v);
            }));
        builder.<String>withRequestField("port_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNatGatewayDnatRulesRequest::getPortId, (req, v) -> {
                req.setPortId(v);
            }));
        builder.<String>withRequestField("private_ip",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNatGatewayDnatRulesRequest::getPrivateIp, (req, v) -> {
                req.setPrivateIp(v);
            }));
        builder.<List<String>>withRequestField("protocol",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListNatGatewayDnatRulesRequest::getProtocol, (req, v) -> {
                req.setProtocol(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPrivateDnatsRequest, ListPrivateDnatsResponse> listPrivateDnats =
        genForlistPrivateDnats();

    private static HttpRequestDef<ListPrivateDnatsRequest, ListPrivateDnatsResponse> genForlistPrivateDnats() {
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
            f -> f.withMarshaller(ListPrivateDnatsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPrivateDnatsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListPrivateDnatsRequest::getPageReverse, (req, v) -> {
                req.setPageReverse(v);
            }));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPrivateDnatsRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<List<String>>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPrivateDnatsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<List<String>>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPrivateDnatsRequest::getDescription, (req, v) -> {
                req.setDescription(v);
            }));
        builder.<List<String>>withRequestField("gateway_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPrivateDnatsRequest::getGatewayId, (req, v) -> {
                req.setGatewayId(v);
            }));
        builder.<List<String>>withRequestField("transit_ip_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPrivateDnatsRequest::getTransitIpId, (req, v) -> {
                req.setTransitIpId(v);
            }));
        builder.<List<String>>withRequestField("external_ip_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPrivateDnatsRequest::getExternalIpAddress, (req, v) -> {
                req.setExternalIpAddress(v);
            }));
        builder.<List<String>>withRequestField("network_interface_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPrivateDnatsRequest::getNetworkInterfaceId, (req, v) -> {
                req.setNetworkInterfaceId(v);
            }));
        builder.<List<String>>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPrivateDnatsRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<List<String>>withRequestField("private_ip_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPrivateDnatsRequest::getPrivateIpAddress, (req, v) -> {
                req.setPrivateIpAddress(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowNatGatewayDnatRuleRequest, ShowNatGatewayDnatRuleResponse> showNatGatewayDnatRule =
        genForshowNatGatewayDnatRule();

    private static HttpRequestDef<ShowNatGatewayDnatRuleRequest, ShowNatGatewayDnatRuleResponse> genForshowNatGatewayDnatRule() {
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
            f -> f.withMarshaller(ShowNatGatewayDnatRuleRequest::getDnatRuleId, (req, v) -> {
                req.setDnatRuleId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPrivateDnatRequest, ShowPrivateDnatResponse> showPrivateDnat =
        genForshowPrivateDnat();

    private static HttpRequestDef<ShowPrivateDnatRequest, ShowPrivateDnatResponse> genForshowPrivateDnat() {
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
            f -> f.withMarshaller(ShowPrivateDnatRequest::getDnatRuleId, (req, v) -> {
                req.setDnatRuleId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateNatGatewayDnatRuleRequest, UpdateNatGatewayDnatRuleResponse> updateNatGatewayDnatRule =
        genForupdateNatGatewayDnatRule();

    private static HttpRequestDef<UpdateNatGatewayDnatRuleRequest, UpdateNatGatewayDnatRuleResponse> genForupdateNatGatewayDnatRule() {
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
            f -> f.withMarshaller(UpdateNatGatewayDnatRuleRequest::getDnatRuleId, (req, v) -> {
                req.setDnatRuleId(v);
            }));
        builder.<UpdateNatGatewayDnatRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateNatGatewayDnatRuleRequestBody.class),
            f -> f.withMarshaller(UpdateNatGatewayDnatRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePrivateDnatRequest, UpdatePrivateDnatResponse> updatePrivateDnat =
        genForupdatePrivateDnat();

    private static HttpRequestDef<UpdatePrivateDnatRequest, UpdatePrivateDnatResponse> genForupdatePrivateDnat() {
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
            f -> f.withMarshaller(UpdatePrivateDnatRequest::getDnatRuleId, (req, v) -> {
                req.setDnatRuleId(v);
            }));
        builder.<UpdatePrivateDnatRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePrivateDnatRequestBody.class),
            f -> f.withMarshaller(UpdatePrivateDnatRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateDeleteTransitIpTagsRequest, BatchCreateDeleteTransitIpTagsResponse> batchCreateDeleteTransitIpTags =
        genForbatchCreateDeleteTransitIpTags();

    private static HttpRequestDef<BatchCreateDeleteTransitIpTagsRequest, BatchCreateDeleteTransitIpTagsResponse> genForbatchCreateDeleteTransitIpTags() {
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
            f -> f.withMarshaller(BatchCreateDeleteTransitIpTagsRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<BatchOperateResourceTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchOperateResourceTagsRequestBody.class),
            f -> f.withMarshaller(BatchCreateDeleteTransitIpTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTransitIpTagRequest, CreateTransitIpTagResponse> createTransitIpTag =
        genForcreateTransitIpTag();

    private static HttpRequestDef<CreateTransitIpTagRequest, CreateTransitIpTagResponse> genForcreateTransitIpTag() {
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
            f -> f.withMarshaller(CreateTransitIpTagRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<CreateResourceTagRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateResourceTagRequestBody.class),
            f -> f.withMarshaller(CreateTransitIpTagRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTransitIpTagRequest, DeleteTransitIpTagResponse> deleteTransitIpTag =
        genFordeleteTransitIpTag();

    private static HttpRequestDef<DeleteTransitIpTagRequest, DeleteTransitIpTagResponse> genFordeleteTransitIpTag() {
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
            f -> f.withMarshaller(DeleteTransitIpTagRequest::getKey, (req, v) -> {
                req.setKey(v);
            }));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTransitIpTagRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteTransitIpTagResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<ListTransitIpTagsRequest, ListTransitIpTagsResponse> listTransitIpTags =
        genForlistTransitIpTags();

    private static HttpRequestDef<ListTransitIpTagsRequest, ListTransitIpTagsResponse> genForlistTransitIpTags() {
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
        genForlistTransitIpsByTags();

    private static HttpRequestDef<ListTransitIpsByTagsRequest, ListTransitIpsByTagsResponse> genForlistTransitIpsByTags() {
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
            f -> f.withMarshaller(ListTransitIpsByTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTransitIpTagsRequest, ShowTransitIpTagsResponse> showTransitIpTags =
        genForshowTransitIpTags();

    private static HttpRequestDef<ShowTransitIpTagsRequest, ShowTransitIpTagsResponse> genForshowTransitIpTags() {
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
            f -> f.withMarshaller(ShowTransitIpTagsRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateDeleteNatGatewayTagRequest, BatchCreateDeleteNatGatewayTagResponse> batchCreateDeleteNatGatewayTag =
        genForbatchCreateDeleteNatGatewayTag();

    private static HttpRequestDef<BatchCreateDeleteNatGatewayTagRequest, BatchCreateDeleteNatGatewayTagResponse> genForbatchCreateDeleteNatGatewayTag() {
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
            f -> f.withMarshaller(BatchCreateDeleteNatGatewayTagRequest::getNatGatewayId, (req, v) -> {
                req.setNatGatewayId(v);
            }));
        builder.<BatchCreateDeleteNatTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateDeleteNatTagsRequestBody.class),
            f -> f.withMarshaller(BatchCreateDeleteNatGatewayTagRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateNatGatewayTagRequest, CreateNatGatewayTagResponse> createNatGatewayTag =
        genForcreateNatGatewayTag();

    private static HttpRequestDef<CreateNatGatewayTagRequest, CreateNatGatewayTagResponse> genForcreateNatGatewayTag() {
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
            f -> f.withMarshaller(CreateNatGatewayTagRequest::getNatGatewayId, (req, v) -> {
                req.setNatGatewayId(v);
            }));
        builder.<CreateNatTagRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateNatTagRequestBody.class),
            f -> f.withMarshaller(CreateNatGatewayTagRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteNatGatewayTagRequest, DeleteNatGatewayTagResponse> deleteNatGatewayTag =
        genFordeleteNatGatewayTag();

    private static HttpRequestDef<DeleteNatGatewayTagRequest, DeleteNatGatewayTagResponse> genFordeleteNatGatewayTag() {
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
            f -> f.withMarshaller(DeleteNatGatewayTagRequest::getNatGatewayId, (req, v) -> {
                req.setNatGatewayId(v);
            }));
        builder.<String>withRequestField("key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteNatGatewayTagRequest::getKey, (req, v) -> {
                req.setKey(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteNatGatewayTagResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<ListNatGatewayByTagRequest, ListNatGatewayByTagResponse> listNatGatewayByTag =
        genForlistNatGatewayByTag();

    private static HttpRequestDef<ListNatGatewayByTagRequest, ListNatGatewayByTagResponse> genForlistNatGatewayByTag() {
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
            f -> f.withMarshaller(ListNatGatewayByTagRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNatGatewayTagRequest, ListNatGatewayTagResponse> listNatGatewayTag =
        genForlistNatGatewayTag();

    private static HttpRequestDef<ListNatGatewayTagRequest, ListNatGatewayTagResponse> genForlistNatGatewayTag() {
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

    public static final HttpRequestDef<ShowNatGatewayTagRequest, ShowNatGatewayTagResponse> showNatGatewayTag =
        genForshowNatGatewayTag();

    private static HttpRequestDef<ShowNatGatewayTagRequest, ShowNatGatewayTagResponse> genForshowNatGatewayTag() {
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
            f -> f.withMarshaller(ShowNatGatewayTagRequest::getNatGatewayId, (req, v) -> {
                req.setNatGatewayId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateDeletePrivateNatTagsRequest, BatchCreateDeletePrivateNatTagsResponse> batchCreateDeletePrivateNatTags =
        genForbatchCreateDeletePrivateNatTags();

    private static HttpRequestDef<BatchCreateDeletePrivateNatTagsRequest, BatchCreateDeletePrivateNatTagsResponse> genForbatchCreateDeletePrivateNatTags() {
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
            f -> f.withMarshaller(BatchCreateDeletePrivateNatTagsRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<BatchOperateResourceTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchOperateResourceTagsRequestBody.class),
            f -> f.withMarshaller(BatchCreateDeletePrivateNatTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateNatGatewayRequest, CreateNatGatewayResponse> createNatGateway =
        genForcreateNatGateway();

    private static HttpRequestDef<CreateNatGatewayRequest, CreateNatGatewayResponse> genForcreateNatGateway() {
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
            f -> f.withMarshaller(CreateNatGatewayRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePrivateNatRequest, CreatePrivateNatResponse> createPrivateNat =
        genForcreatePrivateNat();

    private static HttpRequestDef<CreatePrivateNatRequest, CreatePrivateNatResponse> genForcreatePrivateNat() {
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
            f -> f.withMarshaller(CreatePrivateNatRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePrivateNatTagRequest, CreatePrivateNatTagResponse> createPrivateNatTag =
        genForcreatePrivateNatTag();

    private static HttpRequestDef<CreatePrivateNatTagRequest, CreatePrivateNatTagResponse> genForcreatePrivateNatTag() {
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
            f -> f.withMarshaller(CreatePrivateNatTagRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));
        builder.<CreateResourceTagRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateResourceTagRequestBody.class),
            f -> f.withMarshaller(CreatePrivateNatTagRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteNatGatewayRequest, DeleteNatGatewayResponse> deleteNatGateway =
        genFordeleteNatGateway();

    private static HttpRequestDef<DeleteNatGatewayRequest, DeleteNatGatewayResponse> genFordeleteNatGateway() {
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
            f -> f.withMarshaller(DeleteNatGatewayRequest::getNatGatewayId, (req, v) -> {
                req.setNatGatewayId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePrivateNatRequest, DeletePrivateNatResponse> deletePrivateNat =
        genFordeletePrivateNat();

    private static HttpRequestDef<DeletePrivateNatRequest, DeletePrivateNatResponse> genFordeletePrivateNat() {
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
            f -> f.withMarshaller(DeletePrivateNatRequest::getGatewayId, (req, v) -> {
                req.setGatewayId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePrivateNatTagRequest, DeletePrivateNatTagResponse> deletePrivateNatTag =
        genFordeletePrivateNatTag();

    private static HttpRequestDef<DeletePrivateNatTagRequest, DeletePrivateNatTagResponse> genFordeletePrivateNatTag() {
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
            f -> f.withMarshaller(DeletePrivateNatTagRequest::getKey, (req, v) -> {
                req.setKey(v);
            }));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePrivateNatTagRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeletePrivateNatTagResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

    public static final HttpRequestDef<ListNatGatewaysRequest, ListNatGatewaysResponse> listNatGateways =
        genForlistNatGateways();

    private static HttpRequestDef<ListNatGatewaysRequest, ListNatGatewaysResponse> genForlistNatGateways() {
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
            f -> f.withMarshaller(ListNatGatewaysRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNatGatewaysRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<String>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNatGatewaysRequest::getDescription, (req, v) -> {
                req.setDescription(v);
            }));
        builder.<String>withRequestField("created_at",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNatGatewaysRequest::getCreatedAt, (req, v) -> {
                req.setCreatedAt(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNatGatewaysRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<List<ListNatGatewaysRequest.StatusEnum>>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListNatGatewaysRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<List<ListNatGatewaysRequest.SpecEnum>>withRequestField("spec",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListNatGatewaysRequest::getSpec, (req, v) -> {
                req.setSpec(v);
            }));
        builder.<Boolean>withRequestField("admin_state_up",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListNatGatewaysRequest::getAdminStateUp, (req, v) -> {
                req.setAdminStateUp(v);
            }));
        builder.<String>withRequestField("internal_network_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNatGatewaysRequest::getInternalNetworkId, (req, v) -> {
                req.setInternalNetworkId(v);
            }));
        builder.<String>withRequestField("router_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNatGatewaysRequest::getRouterId, (req, v) -> {
                req.setRouterId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNatGatewaysRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPrivateNatTagsRequest, ListPrivateNatTagsResponse> listPrivateNatTags =
        genForlistPrivateNatTags();

    private static HttpRequestDef<ListPrivateNatTagsRequest, ListPrivateNatTagsResponse> genForlistPrivateNatTags() {
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
        genForlistPrivateNats();

    private static HttpRequestDef<ListPrivateNatsRequest, ListPrivateNatsResponse> genForlistPrivateNats() {
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
            f -> f.withMarshaller(ListPrivateNatsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPrivateNatsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListPrivateNatsRequest::getPageReverse, (req, v) -> {
                req.setPageReverse(v);
            }));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPrivateNatsRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<List<String>>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPrivateNatsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<List<String>>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPrivateNatsRequest::getDescription, (req, v) -> {
                req.setDescription(v);
            }));
        builder.<List<ListPrivateNatsRequest.SpecEnum>>withRequestField("spec",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPrivateNatsRequest::getSpec, (req, v) -> {
                req.setSpec(v);
            }));
        builder.<List<ListPrivateNatsRequest.StatusEnum>>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPrivateNatsRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<List<String>>withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPrivateNatsRequest::getVpcId, (req, v) -> {
                req.setVpcId(v);
            }));
        builder.<List<String>>withRequestField("virsubnet_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPrivateNatsRequest::getVirsubnetId, (req, v) -> {
                req.setVirsubnetId(v);
            }));
        builder.<List<String>>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPrivateNatsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPrivateNatsByTagsRequest, ListPrivateNatsByTagsResponse> listPrivateNatsByTags =
        genForlistPrivateNatsByTags();

    private static HttpRequestDef<ListPrivateNatsByTagsRequest, ListPrivateNatsByTagsResponse> genForlistPrivateNatsByTags() {
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
            f -> f.withMarshaller(ListPrivateNatsByTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowNatGatewayRequest, ShowNatGatewayResponse> showNatGateway =
        genForshowNatGateway();

    private static HttpRequestDef<ShowNatGatewayRequest, ShowNatGatewayResponse> genForshowNatGateway() {
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
            f -> f.withMarshaller(ShowNatGatewayRequest::getNatGatewayId, (req, v) -> {
                req.setNatGatewayId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPrivateNatRequest, ShowPrivateNatResponse> showPrivateNat =
        genForshowPrivateNat();

    private static HttpRequestDef<ShowPrivateNatRequest, ShowPrivateNatResponse> genForshowPrivateNat() {
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
            f -> f.withMarshaller(ShowPrivateNatRequest::getGatewayId, (req, v) -> {
                req.setGatewayId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPrivateNatTagsRequest, ShowPrivateNatTagsResponse> showPrivateNatTags =
        genForshowPrivateNatTags();

    private static HttpRequestDef<ShowPrivateNatTagsRequest, ShowPrivateNatTagsResponse> genForshowPrivateNatTags() {
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
            f -> f.withMarshaller(ShowPrivateNatTagsRequest::getResourceId, (req, v) -> {
                req.setResourceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateNatGatewayRequest, UpdateNatGatewayResponse> updateNatGateway =
        genForupdateNatGateway();

    private static HttpRequestDef<UpdateNatGatewayRequest, UpdateNatGatewayResponse> genForupdateNatGateway() {
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
            f -> f.withMarshaller(UpdateNatGatewayRequest::getNatGatewayId, (req, v) -> {
                req.setNatGatewayId(v);
            }));
        builder.<UpdateNatGatewayRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateNatGatewayRequestBody.class),
            f -> f.withMarshaller(UpdateNatGatewayRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePrivateNatRequest, UpdatePrivateNatResponse> updatePrivateNat =
        genForupdatePrivateNat();

    private static HttpRequestDef<UpdatePrivateNatRequest, UpdatePrivateNatResponse> genForupdatePrivateNat() {
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
            f -> f.withMarshaller(UpdatePrivateNatRequest::getGatewayId, (req, v) -> {
                req.setGatewayId(v);
            }));
        builder.<UpdatePrivateNatRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePrivateNatRequestBody.class),
            f -> f.withMarshaller(UpdatePrivateNatRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTransitIpRequest, CreateTransitIpResponse> createTransitIp =
        genForcreateTransitIp();

    private static HttpRequestDef<CreateTransitIpRequest, CreateTransitIpResponse> genForcreateTransitIp() {
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
            f -> f.withMarshaller(CreateTransitIpRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTransitIpRequest, DeleteTransitIpResponse> deleteTransitIp =
        genFordeleteTransitIp();

    private static HttpRequestDef<DeleteTransitIpRequest, DeleteTransitIpResponse> genFordeleteTransitIp() {
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
            f -> f.withMarshaller(DeleteTransitIpRequest::getTransitIpId, (req, v) -> {
                req.setTransitIpId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTransitIpsRequest, ListTransitIpsResponse> listTransitIps =
        genForlistTransitIps();

    private static HttpRequestDef<ListTransitIpsRequest, ListTransitIpsResponse> genForlistTransitIps() {
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
            f -> f.withMarshaller(ListTransitIpsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTransitIpsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListTransitIpsRequest::getPageReverse, (req, v) -> {
                req.setPageReverse(v);
            }));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListTransitIpsRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<List<String>>withRequestField("network_interface_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListTransitIpsRequest::getNetworkInterfaceId, (req, v) -> {
                req.setNetworkInterfaceId(v);
            }));
        builder.<List<String>>withRequestField("ip_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListTransitIpsRequest::getIpAddress, (req, v) -> {
                req.setIpAddress(v);
            }));
        builder.<List<String>>withRequestField("gateway_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListTransitIpsRequest::getGatewayId, (req, v) -> {
                req.setGatewayId(v);
            }));
        builder.<List<String>>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListTransitIpsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<List<String>>withRequestField("virsubnet_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListTransitIpsRequest::getVirsubnetId, (req, v) -> {
                req.setVirsubnetId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTransitIpRequest, ShowTransitIpResponse> showTransitIp =
        genForshowTransitIp();

    private static HttpRequestDef<ShowTransitIpRequest, ShowTransitIpResponse> genForshowTransitIp() {
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
            f -> f.withMarshaller(ShowTransitIpRequest::getTransitIpId, (req, v) -> {
                req.setTransitIpId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateNatGatewaySnatRuleRequest, CreateNatGatewaySnatRuleResponse> createNatGatewaySnatRule =
        genForcreateNatGatewaySnatRule();

    private static HttpRequestDef<CreateNatGatewaySnatRuleRequest, CreateNatGatewaySnatRuleResponse> genForcreateNatGatewaySnatRule() {
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
            f -> f.withMarshaller(CreateNatGatewaySnatRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePrivateSnatRequest, CreatePrivateSnatResponse> createPrivateSnat =
        genForcreatePrivateSnat();

    private static HttpRequestDef<CreatePrivateSnatRequest, CreatePrivateSnatResponse> genForcreatePrivateSnat() {
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
            f -> f.withMarshaller(CreatePrivateSnatRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteNatGatewaySnatRuleRequest, DeleteNatGatewaySnatRuleResponse> deleteNatGatewaySnatRule =
        genFordeleteNatGatewaySnatRule();

    private static HttpRequestDef<DeleteNatGatewaySnatRuleRequest, DeleteNatGatewaySnatRuleResponse> genFordeleteNatGatewaySnatRule() {
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
            f -> f.withMarshaller(DeleteNatGatewaySnatRuleRequest::getNatGatewayId, (req, v) -> {
                req.setNatGatewayId(v);
            }));
        builder.<String>withRequestField("snat_rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteNatGatewaySnatRuleRequest::getSnatRuleId, (req, v) -> {
                req.setSnatRuleId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePrivateSnatRequest, DeletePrivateSnatResponse> deletePrivateSnat =
        genFordeletePrivateSnat();

    private static HttpRequestDef<DeletePrivateSnatRequest, DeletePrivateSnatResponse> genFordeletePrivateSnat() {
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
            f -> f.withMarshaller(DeletePrivateSnatRequest::getSnatRuleId, (req, v) -> {
                req.setSnatRuleId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNatGatewaySnatRulesRequest, ListNatGatewaySnatRulesResponse> listNatGatewaySnatRules =
        genForlistNatGatewaySnatRules();

    private static HttpRequestDef<ListNatGatewaySnatRulesRequest, ListNatGatewaySnatRulesResponse> genForlistNatGatewaySnatRules() {
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
            f -> f.withMarshaller(ListNatGatewaySnatRulesRequest::getAdminStateUp, (req, v) -> {
                req.setAdminStateUp(v);
            }));
        builder.<String>withRequestField("cidr",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNatGatewaySnatRulesRequest::getCidr, (req, v) -> {
                req.setCidr(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNatGatewaySnatRulesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("floating_ip_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNatGatewaySnatRulesRequest::getFloatingIpAddress, (req, v) -> {
                req.setFloatingIpAddress(v);
            }));
        builder.<String>withRequestField("floating_ip_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNatGatewaySnatRulesRequest::getFloatingIpId, (req, v) -> {
                req.setFloatingIpId(v);
            }));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNatGatewaySnatRulesRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNatGatewaySnatRulesRequest::getDescription, (req, v) -> {
                req.setDescription(v);
            }));
        builder.<String>withRequestField("created_at",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNatGatewaySnatRulesRequest::getCreatedAt, (req, v) -> {
                req.setCreatedAt(v);
            }));
        builder.<List<String>>withRequestField("nat_gateway_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListNatGatewaySnatRulesRequest::getNatGatewayId, (req, v) -> {
                req.setNatGatewayId(v);
            }));
        builder.<String>withRequestField("network_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNatGatewaySnatRulesRequest::getNetworkId, (req, v) -> {
                req.setNetworkId(v);
            }));
        builder.<Integer>withRequestField("source_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNatGatewaySnatRulesRequest::getSourceType, (req, v) -> {
                req.setSourceType(v);
            }));
        builder.<ListNatGatewaySnatRulesRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListNatGatewaySnatRulesRequest.StatusEnum.class),
            f -> f.withMarshaller(ListNatGatewaySnatRulesRequest::getStatus, (req, v) -> {
                req.setStatus(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPrivateSnatsRequest, ListPrivateSnatsResponse> listPrivateSnats =
        genForlistPrivateSnats();

    private static HttpRequestDef<ListPrivateSnatsRequest, ListPrivateSnatsResponse> genForlistPrivateSnats() {
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
            f -> f.withMarshaller(ListPrivateSnatsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPrivateSnatsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListPrivateSnatsRequest::getPageReverse, (req, v) -> {
                req.setPageReverse(v);
            }));
        builder.<List<String>>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPrivateSnatsRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<List<String>>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPrivateSnatsRequest::getDescription, (req, v) -> {
                req.setDescription(v);
            }));
        builder.<List<String>>withRequestField("gateway_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPrivateSnatsRequest::getGatewayId, (req, v) -> {
                req.setGatewayId(v);
            }));
        builder.<List<String>>withRequestField("cidr",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPrivateSnatsRequest::getCidr, (req, v) -> {
                req.setCidr(v);
            }));
        builder.<List<String>>withRequestField("virsubnet_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPrivateSnatsRequest::getVirsubnetId, (req, v) -> {
                req.setVirsubnetId(v);
            }));
        builder.<List<String>>withRequestField("transit_ip_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPrivateSnatsRequest::getTransitIpId, (req, v) -> {
                req.setTransitIpId(v);
            }));
        builder.<List<String>>withRequestField("transit_ip_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPrivateSnatsRequest::getTransitIpAddress, (req, v) -> {
                req.setTransitIpAddress(v);
            }));
        builder.<List<String>>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListPrivateSnatsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowNatGatewaySnatRuleRequest, ShowNatGatewaySnatRuleResponse> showNatGatewaySnatRule =
        genForshowNatGatewaySnatRule();

    private static HttpRequestDef<ShowNatGatewaySnatRuleRequest, ShowNatGatewaySnatRuleResponse> genForshowNatGatewaySnatRule() {
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
            f -> f.withMarshaller(ShowNatGatewaySnatRuleRequest::getSnatRuleId, (req, v) -> {
                req.setSnatRuleId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPrivateSnatRequest, ShowPrivateSnatResponse> showPrivateSnat =
        genForshowPrivateSnat();

    private static HttpRequestDef<ShowPrivateSnatRequest, ShowPrivateSnatResponse> genForshowPrivateSnat() {
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
            f -> f.withMarshaller(ShowPrivateSnatRequest::getSnatRuleId, (req, v) -> {
                req.setSnatRuleId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateNatGatewaySnatRuleRequest, UpdateNatGatewaySnatRuleResponse> updateNatGatewaySnatRule =
        genForupdateNatGatewaySnatRule();

    private static HttpRequestDef<UpdateNatGatewaySnatRuleRequest, UpdateNatGatewaySnatRuleResponse> genForupdateNatGatewaySnatRule() {
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
            f -> f.withMarshaller(UpdateNatGatewaySnatRuleRequest::getSnatRuleId, (req, v) -> {
                req.setSnatRuleId(v);
            }));
        builder.<UpdateNatGatewaySnatRuleRequestOption>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateNatGatewaySnatRuleRequestOption.class),
            f -> f.withMarshaller(UpdateNatGatewaySnatRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePrivateSnatRequest, UpdatePrivateSnatResponse> updatePrivateSnat =
        genForupdatePrivateSnat();

    private static HttpRequestDef<UpdatePrivateSnatRequest, UpdatePrivateSnatResponse> genForupdatePrivateSnat() {
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
            f -> f.withMarshaller(UpdatePrivateSnatRequest::getSnatRuleId, (req, v) -> {
                req.setSnatRuleId(v);
            }));
        builder.<UpdatePrivateSnatOptionBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePrivateSnatOptionBody.class),
            f -> f.withMarshaller(UpdatePrivateSnatRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}
