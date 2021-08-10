package com.huaweicloud.sdk.nat.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.nat.v2.model.*;

import java.time.OffsetDateTime;
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
        builder.<OffsetDateTime>withRequestField("created_at",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(OffsetDateTime.class),
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
        builder.<OffsetDateTime>withRequestField("created_at",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(OffsetDateTime.class),
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
        builder.<OffsetDateTime>withRequestField("created_at",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(OffsetDateTime.class),
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

}
