package com.huaweicloud.sdk.cse.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.cse.v1.model.CreateEngineRequest;
import com.huaweicloud.sdk.cse.v1.model.CreateEngineResponse;
import com.huaweicloud.sdk.cse.v1.model.CreateGovPolicy;
import com.huaweicloud.sdk.cse.v1.model.CreateGovernancePolicyRequest;
import com.huaweicloud.sdk.cse.v1.model.CreateGovernancePolicyResponse;
import com.huaweicloud.sdk.cse.v1.model.CreateMicroserviceRouteRuleRequest;
import com.huaweicloud.sdk.cse.v1.model.CreateMicroserviceRouteRuleResponse;
import com.huaweicloud.sdk.cse.v1.model.CreateNacosNamespacesRequest;
import com.huaweicloud.sdk.cse.v1.model.CreateNacosNamespacesResponse;
import com.huaweicloud.sdk.cse.v1.model.CreateRules;
import com.huaweicloud.sdk.cse.v1.model.DeleteEngineRequest;
import com.huaweicloud.sdk.cse.v1.model.DeleteEngineResponse;
import com.huaweicloud.sdk.cse.v1.model.DeleteGovernancePolicyRequest;
import com.huaweicloud.sdk.cse.v1.model.DeleteGovernancePolicyResponse;
import com.huaweicloud.sdk.cse.v1.model.DeleteMicroserviceRouteRuleRequest;
import com.huaweicloud.sdk.cse.v1.model.DeleteMicroserviceRouteRuleResponse;
import com.huaweicloud.sdk.cse.v1.model.DeleteNacosNamespacesRequest;
import com.huaweicloud.sdk.cse.v1.model.DeleteNacosNamespacesResponse;
import com.huaweicloud.sdk.cse.v1.model.DownloadKieReqBody;
import com.huaweicloud.sdk.cse.v1.model.DownloadKieRequest;
import com.huaweicloud.sdk.cse.v1.model.DownloadKieResponse;
import com.huaweicloud.sdk.cse.v1.model.EngineAdditionalActionReq;
import com.huaweicloud.sdk.cse.v1.model.EngineConfigureReq;
import com.huaweicloud.sdk.cse.v1.model.EngineCreateReq;
import com.huaweicloud.sdk.cse.v1.model.EngineModifyReq;
import com.huaweicloud.sdk.cse.v1.model.EngineUpdateReq;
import com.huaweicloud.sdk.cse.v1.model.GovPolicyDetail;
import com.huaweicloud.sdk.cse.v1.model.ListEnginesRequest;
import com.huaweicloud.sdk.cse.v1.model.ListEnginesResponse;
import com.huaweicloud.sdk.cse.v1.model.ListFlavorsRequest;
import com.huaweicloud.sdk.cse.v1.model.ListFlavorsResponse;
import com.huaweicloud.sdk.cse.v1.model.ListGovernancePolicyByPolicyIdRequest;
import com.huaweicloud.sdk.cse.v1.model.ListGovernancePolicyByPolicyIdResponse;
import com.huaweicloud.sdk.cse.v1.model.ListGovernancePolicyRequest;
import com.huaweicloud.sdk.cse.v1.model.ListGovernancePolicyResponse;
import com.huaweicloud.sdk.cse.v1.model.ListGovernancePolicysRequest;
import com.huaweicloud.sdk.cse.v1.model.ListGovernancePolicysResponse;
import com.huaweicloud.sdk.cse.v1.model.ListMicroserviceRouteRuleRequest;
import com.huaweicloud.sdk.cse.v1.model.ListMicroserviceRouteRuleResponse;
import com.huaweicloud.sdk.cse.v1.model.ListNacosNamespacesRequest;
import com.huaweicloud.sdk.cse.v1.model.ListNacosNamespacesResponse;
import com.huaweicloud.sdk.cse.v1.model.ResizeEngineRequest;
import com.huaweicloud.sdk.cse.v1.model.ResizeEngineResponse;
import com.huaweicloud.sdk.cse.v1.model.RetryEngineRequest;
import com.huaweicloud.sdk.cse.v1.model.RetryEngineResponse;
import com.huaweicloud.sdk.cse.v1.model.ShowEngineJobRequest;
import com.huaweicloud.sdk.cse.v1.model.ShowEngineJobResponse;
import com.huaweicloud.sdk.cse.v1.model.ShowEngineRequest;
import com.huaweicloud.sdk.cse.v1.model.ShowEngineResponse;
import com.huaweicloud.sdk.cse.v1.model.UpdateGovernancePolicyRequest;
import com.huaweicloud.sdk.cse.v1.model.UpdateGovernancePolicyResponse;
import com.huaweicloud.sdk.cse.v1.model.UpdateNacosNamespacesRequest;
import com.huaweicloud.sdk.cse.v1.model.UpdateNacosNamespacesResponse;
import com.huaweicloud.sdk.cse.v1.model.UpgradeEngineConfigRequest;
import com.huaweicloud.sdk.cse.v1.model.UpgradeEngineConfigResponse;
import com.huaweicloud.sdk.cse.v1.model.UpgradeEngineRequest;
import com.huaweicloud.sdk.cse.v1.model.UpgradeEngineResponse;
import com.huaweicloud.sdk.cse.v1.model.UploadKieRequest;
import com.huaweicloud.sdk.cse.v1.model.UploadKieRequestBody;
import com.huaweicloud.sdk.cse.v1.model.UploadKieResponse;

import java.util.List;

@SuppressWarnings("unchecked")
public class CseMeta {

    public static final HttpRequestDef<CreateEngineRequest, CreateEngineResponse> createEngine = genForcreateEngine();

    private static HttpRequestDef<CreateEngineRequest, CreateEngineResponse> genForcreateEngine() {
        // basic
        HttpRequestDef.Builder<CreateEngineRequest, CreateEngineResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateEngineRequest.class, CreateEngineResponse.class)
                .withName("CreateEngine")
                .withUri("/v2/{project_id}/enginemgr/engines")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateEngineRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
            }));
        builder.<EngineCreateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EngineCreateReq.class),
            f -> f.withMarshaller(CreateEngineRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateGovernancePolicyRequest, CreateGovernancePolicyResponse> createGovernancePolicy =
        genForcreateGovernancePolicy();

    private static HttpRequestDef<CreateGovernancePolicyRequest, CreateGovernancePolicyResponse> genForcreateGovernancePolicy() {
        // basic
        HttpRequestDef.Builder<CreateGovernancePolicyRequest, CreateGovernancePolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateGovernancePolicyRequest.class, CreateGovernancePolicyResponse.class)
            .withName("CreateGovernancePolicy")
            .withUri("/v3/{project_id}/govern/governance/{kind}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("kind",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateGovernancePolicyRequest::getKind, (req, v) -> {
                req.setKind(v);
            }));
        builder.<String>withRequestField("x-engine-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateGovernancePolicyRequest::getXEngineId, (req, v) -> {
                req.setXEngineId(v);
            }));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateGovernancePolicyRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
            }));
        builder.<String>withRequestField("x-environment",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateGovernancePolicyRequest::getXEnvironment, (req, v) -> {
                req.setXEnvironment(v);
            }));
        builder.<CreateGovPolicy>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateGovPolicy.class),
            f -> f.withMarshaller(CreateGovernancePolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateMicroserviceRouteRuleRequest, CreateMicroserviceRouteRuleResponse> createMicroserviceRouteRule =
        genForcreateMicroserviceRouteRule();

    private static HttpRequestDef<CreateMicroserviceRouteRuleRequest, CreateMicroserviceRouteRuleResponse> genForcreateMicroserviceRouteRule() {
        // basic
        HttpRequestDef.Builder<CreateMicroserviceRouteRuleRequest, CreateMicroserviceRouteRuleResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    CreateMicroserviceRouteRuleRequest.class,
                    CreateMicroserviceRouteRuleResponse.class)
                .withName("CreateMicroserviceRouteRule")
                .withUri("/v3/{project_id}/govern/route-rule/microservices/{service_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateMicroserviceRouteRuleRequest::getServiceName, (req, v) -> {
                req.setServiceName(v);
            }));
        builder.<String>withRequestField("environment",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateMicroserviceRouteRuleRequest::getEnvironment, (req, v) -> {
                req.setEnvironment(v);
            }));
        builder.<String>withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateMicroserviceRouteRuleRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<String>withRequestField("x-engine-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateMicroserviceRouteRuleRequest::getXEngineId, (req, v) -> {
                req.setXEngineId(v);
            }));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateMicroserviceRouteRuleRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
            }));
        builder.<List<CreateRules>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CreateMicroserviceRouteRuleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }).withInnerContainerType(CreateRules.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEngineRequest, DeleteEngineResponse> deleteEngine = genFordeleteEngine();

    private static HttpRequestDef<DeleteEngineRequest, DeleteEngineResponse> genFordeleteEngine() {
        // basic
        HttpRequestDef.Builder<DeleteEngineRequest, DeleteEngineResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteEngineRequest.class, DeleteEngineResponse.class)
                .withName("DeleteEngine")
                .withUri("/v2/{project_id}/enginemgr/engines/{engine_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("engine_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEngineRequest::getEngineId, (req, v) -> {
                req.setEngineId(v);
            }));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEngineRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteGovernancePolicyRequest, DeleteGovernancePolicyResponse> deleteGovernancePolicy =
        genFordeleteGovernancePolicy();

    private static HttpRequestDef<DeleteGovernancePolicyRequest, DeleteGovernancePolicyResponse> genFordeleteGovernancePolicy() {
        // basic
        HttpRequestDef.Builder<DeleteGovernancePolicyRequest, DeleteGovernancePolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteGovernancePolicyRequest.class, DeleteGovernancePolicyResponse.class)
            .withName("DeleteGovernancePolicy")
            .withUri("/v3/{project_id}/govern/governance/{kind}/{policy_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("kind",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGovernancePolicyRequest::getKind, (req, v) -> {
                req.setKind(v);
            }));
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGovernancePolicyRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<String>withRequestField("x-engine-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGovernancePolicyRequest::getXEngineId, (req, v) -> {
                req.setXEngineId(v);
            }));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGovernancePolicyRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
            }));
        builder.<String>withRequestField("x-environment",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGovernancePolicyRequest::getXEnvironment, (req, v) -> {
                req.setXEnvironment(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteMicroserviceRouteRuleRequest, DeleteMicroserviceRouteRuleResponse> deleteMicroserviceRouteRule =
        genFordeleteMicroserviceRouteRule();

    private static HttpRequestDef<DeleteMicroserviceRouteRuleRequest, DeleteMicroserviceRouteRuleResponse> genFordeleteMicroserviceRouteRule() {
        // basic
        HttpRequestDef.Builder<DeleteMicroserviceRouteRuleRequest, DeleteMicroserviceRouteRuleResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteMicroserviceRouteRuleRequest.class,
                    DeleteMicroserviceRouteRuleResponse.class)
                .withName("DeleteMicroserviceRouteRule")
                .withUri("/v3/{project_id}/govern/route-rule/microservices/{service_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteMicroserviceRouteRuleRequest::getServiceName, (req, v) -> {
                req.setServiceName(v);
            }));
        builder.<String>withRequestField("environment",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteMicroserviceRouteRuleRequest::getEnvironment, (req, v) -> {
                req.setEnvironment(v);
            }));
        builder.<String>withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteMicroserviceRouteRuleRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<String>withRequestField("x-engine-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteMicroserviceRouteRuleRequest::getXEngineId, (req, v) -> {
                req.setXEngineId(v);
            }));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteMicroserviceRouteRuleRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadKieRequest, DownloadKieResponse> downloadKie = genFordownloadKie();

    private static HttpRequestDef<DownloadKieRequest, DownloadKieResponse> genFordownloadKie() {
        // basic
        HttpRequestDef.Builder<DownloadKieRequest, DownloadKieResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DownloadKieRequest.class, DownloadKieResponse.class)
                .withName("DownloadKie")
                .withUri("/v1/{project_id}/kie/download")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("label",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadKieRequest::getLabel, (req, v) -> {
                req.setLabel(v);
            }));
        builder.<DownloadKieRequest.MatchEnum>withRequestField("match",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DownloadKieRequest.MatchEnum.class),
            f -> f.withMarshaller(DownloadKieRequest::getMatch, (req, v) -> {
                req.setMatch(v);
            }));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadKieRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
            }));
        builder.<String>withRequestField("x-engine-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadKieRequest::getXEngineId, (req, v) -> {
                req.setXEngineId(v);
            }));
        builder.<DownloadKieReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DownloadKieReqBody.class),
            f -> f.withMarshaller(DownloadKieRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEnginesRequest, ListEnginesResponse> listEngines = genForlistEngines();

    private static HttpRequestDef<ListEnginesRequest, ListEnginesResponse> genForlistEngines() {
        // basic
        HttpRequestDef.Builder<ListEnginesRequest, ListEnginesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEnginesRequest.class, ListEnginesResponse.class)
                .withName("ListEngines")
                .withUri("/v2/{project_id}/enginemgr/engines")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEnginesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEnginesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFlavorsRequest, ListFlavorsResponse> listFlavors = genForlistFlavors();

    private static HttpRequestDef<ListFlavorsRequest, ListFlavorsResponse> genForlistFlavors() {
        // basic
        HttpRequestDef.Builder<ListFlavorsRequest, ListFlavorsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFlavorsRequest.class, ListFlavorsResponse.class)
                .withName("ListFlavors")
                .withUri("/v2/{project_id}/enginemgr/flavors")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("spec_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFlavorsRequest::getSpecType, (req, v) -> {
                req.setSpecType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGovernancePolicyRequest, ListGovernancePolicyResponse> listGovernancePolicy =
        genForlistGovernancePolicy();

    private static HttpRequestDef<ListGovernancePolicyRequest, ListGovernancePolicyResponse> genForlistGovernancePolicy() {
        // basic
        HttpRequestDef.Builder<ListGovernancePolicyRequest, ListGovernancePolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListGovernancePolicyRequest.class, ListGovernancePolicyResponse.class)
            .withName("ListGovernancePolicy")
            .withUri("/v3/{project_id}/govern/governance/{kind}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("kind",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGovernancePolicyRequest::getKind, (req, v) -> {
                req.setKind(v);
            }));
        builder.<String>withRequestField("x-engine-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGovernancePolicyRequest::getXEngineId, (req, v) -> {
                req.setXEngineId(v);
            }));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGovernancePolicyRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
            }));
        builder.<String>withRequestField("x-environment",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGovernancePolicyRequest::getXEnvironment, (req, v) -> {
                req.setXEnvironment(v);
            }));

        // response
        builder.<List<GovPolicyDetail>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGovernancePolicyResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(GovPolicyDetail.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListGovernancePolicyByPolicyIdRequest, ListGovernancePolicyByPolicyIdResponse> listGovernancePolicyByPolicyId =
        genForlistGovernancePolicyByPolicyId();

    private static HttpRequestDef<ListGovernancePolicyByPolicyIdRequest, ListGovernancePolicyByPolicyIdResponse> genForlistGovernancePolicyByPolicyId() {
        // basic
        HttpRequestDef.Builder<ListGovernancePolicyByPolicyIdRequest, ListGovernancePolicyByPolicyIdResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListGovernancePolicyByPolicyIdRequest.class,
                    ListGovernancePolicyByPolicyIdResponse.class)
                .withName("ListGovernancePolicyByPolicyId")
                .withUri("/v3/{project_id}/govern/governance/{kind}/{policy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("kind",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGovernancePolicyByPolicyIdRequest::getKind, (req, v) -> {
                req.setKind(v);
            }));
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGovernancePolicyByPolicyIdRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<String>withRequestField("x-engine-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGovernancePolicyByPolicyIdRequest::getXEngineId, (req, v) -> {
                req.setXEngineId(v);
            }));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGovernancePolicyByPolicyIdRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
            }));
        builder.<String>withRequestField("x-environment",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGovernancePolicyByPolicyIdRequest::getXEnvironment, (req, v) -> {
                req.setXEnvironment(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGovernancePolicysRequest, ListGovernancePolicysResponse> listGovernancePolicys =
        genForlistGovernancePolicys();

    private static HttpRequestDef<ListGovernancePolicysRequest, ListGovernancePolicysResponse> genForlistGovernancePolicys() {
        // basic
        HttpRequestDef.Builder<ListGovernancePolicysRequest, ListGovernancePolicysResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListGovernancePolicysRequest.class, ListGovernancePolicysResponse.class)
            .withName("ListGovernancePolicys")
            .withUri("/v3/{project_id}/govern/governance/display")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("environment",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGovernancePolicysRequest::getEnvironment, (req, v) -> {
                req.setEnvironment(v);
            }));
        builder.<String>withRequestField("app",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGovernancePolicysRequest::getApp, (req, v) -> {
                req.setApp(v);
            }));
        builder.<String>withRequestField("x-engine-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGovernancePolicysRequest::getXEngineId, (req, v) -> {
                req.setXEngineId(v);
            }));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGovernancePolicysRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
            }));

        // response
        builder.<List<GovPolicyDetail>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGovernancePolicysResponse::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(GovPolicyDetail.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListMicroserviceRouteRuleRequest, ListMicroserviceRouteRuleResponse> listMicroserviceRouteRule =
        genForlistMicroserviceRouteRule();

    private static HttpRequestDef<ListMicroserviceRouteRuleRequest, ListMicroserviceRouteRuleResponse> genForlistMicroserviceRouteRule() {
        // basic
        HttpRequestDef.Builder<ListMicroserviceRouteRuleRequest, ListMicroserviceRouteRuleResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListMicroserviceRouteRuleRequest.class,
                    ListMicroserviceRouteRuleResponse.class)
                .withName("ListMicroserviceRouteRule")
                .withUri("/v3/{project_id}/govern/route-rule/microservices/{service_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMicroserviceRouteRuleRequest::getServiceName, (req, v) -> {
                req.setServiceName(v);
            }));
        builder.<String>withRequestField("environment",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMicroserviceRouteRuleRequest::getEnvironment, (req, v) -> {
                req.setEnvironment(v);
            }));
        builder.<String>withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMicroserviceRouteRuleRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<String>withRequestField("x-engine-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMicroserviceRouteRuleRequest::getXEngineId, (req, v) -> {
                req.setXEngineId(v);
            }));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMicroserviceRouteRuleRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResizeEngineRequest, ResizeEngineResponse> resizeEngine = genForresizeEngine();

    private static HttpRequestDef<ResizeEngineRequest, ResizeEngineResponse> genForresizeEngine() {
        // basic
        HttpRequestDef.Builder<ResizeEngineRequest, ResizeEngineResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ResizeEngineRequest.class, ResizeEngineResponse.class)
                .withName("ResizeEngine")
                .withUri("/v2/{project_id}/enginemgr/engines/{engine_id}/resize")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("engine_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResizeEngineRequest::getEngineId, (req, v) -> {
                req.setEngineId(v);
            }));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResizeEngineRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
            }));
        builder.<String>withRequestField("Accept",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResizeEngineRequest::getAccept, (req, v) -> {
                req.setAccept(v);
            }));
        builder.<EngineModifyReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(EngineModifyReq.class),
            f -> f.withMarshaller(ResizeEngineRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RetryEngineRequest, RetryEngineResponse> retryEngine = genForretryEngine();

    private static HttpRequestDef<RetryEngineRequest, RetryEngineResponse> genForretryEngine() {
        // basic
        HttpRequestDef.Builder<RetryEngineRequest, RetryEngineResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, RetryEngineRequest.class, RetryEngineResponse.class)
                .withName("RetryEngine")
                .withUri("/v2/{project_id}/enginemgr/engines/{engine_id}/actions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("engine_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RetryEngineRequest::getEngineId, (req, v) -> {
                req.setEngineId(v);
            }));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RetryEngineRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
            }));
        builder.<EngineAdditionalActionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EngineAdditionalActionReq.class),
            f -> f.withMarshaller(RetryEngineRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEngineRequest, ShowEngineResponse> showEngine = genForshowEngine();

    private static HttpRequestDef<ShowEngineRequest, ShowEngineResponse> genForshowEngine() {
        // basic
        HttpRequestDef.Builder<ShowEngineRequest, ShowEngineResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowEngineRequest.class, ShowEngineResponse.class)
                .withName("ShowEngine")
                .withUri("/v2/{project_id}/enginemgr/engines/{engine_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("engine_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEngineRequest::getEngineId, (req, v) -> {
                req.setEngineId(v);
            }));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEngineRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEngineJobRequest, ShowEngineJobResponse> showEngineJob =
        genForshowEngineJob();

    private static HttpRequestDef<ShowEngineJobRequest, ShowEngineJobResponse> genForshowEngineJob() {
        // basic
        HttpRequestDef.Builder<ShowEngineJobRequest, ShowEngineJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowEngineJobRequest.class, ShowEngineJobResponse.class)
                .withName("ShowEngineJob")
                .withUri("/v2/{project_id}/enginemgr/engines/{engine_id}/jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("engine_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEngineJobRequest::getEngineId, (req, v) -> {
                req.setEngineId(v);
            }));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEngineJobRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEngineJobRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateGovernancePolicyRequest, UpdateGovernancePolicyResponse> updateGovernancePolicy =
        genForupdateGovernancePolicy();

    private static HttpRequestDef<UpdateGovernancePolicyRequest, UpdateGovernancePolicyResponse> genForupdateGovernancePolicy() {
        // basic
        HttpRequestDef.Builder<UpdateGovernancePolicyRequest, UpdateGovernancePolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateGovernancePolicyRequest.class, UpdateGovernancePolicyResponse.class)
            .withName("UpdateGovernancePolicy")
            .withUri("/v3/{project_id}/govern/governance/{kind}/{policy_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("kind",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGovernancePolicyRequest::getKind, (req, v) -> {
                req.setKind(v);
            }));
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGovernancePolicyRequest::getPolicyId, (req, v) -> {
                req.setPolicyId(v);
            }));
        builder.<String>withRequestField("x-engine-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGovernancePolicyRequest::getXEngineId, (req, v) -> {
                req.setXEngineId(v);
            }));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGovernancePolicyRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
            }));
        builder.<String>withRequestField("x-environment",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGovernancePolicyRequest::getXEnvironment, (req, v) -> {
                req.setXEnvironment(v);
            }));
        builder.<CreateGovPolicy>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateGovPolicy.class),
            f -> f.withMarshaller(UpdateGovernancePolicyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpgradeEngineRequest, UpgradeEngineResponse> upgradeEngine =
        genForupgradeEngine();

    private static HttpRequestDef<UpgradeEngineRequest, UpgradeEngineResponse> genForupgradeEngine() {
        // basic
        HttpRequestDef.Builder<UpgradeEngineRequest, UpgradeEngineResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpgradeEngineRequest.class, UpgradeEngineResponse.class)
                .withName("UpgradeEngine")
                .withUri("/v2/{project_id}/enginemgr/engines/{engine_id}/upgrade")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("engine_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpgradeEngineRequest::getEngineId, (req, v) -> {
                req.setEngineId(v);
            }));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpgradeEngineRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
            }));
        builder.<EngineUpdateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EngineUpdateReq.class),
            f -> f.withMarshaller(UpgradeEngineRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpgradeEngineConfigRequest, UpgradeEngineConfigResponse> upgradeEngineConfig =
        genForupgradeEngineConfig();

    private static HttpRequestDef<UpgradeEngineConfigRequest, UpgradeEngineConfigResponse> genForupgradeEngineConfig() {
        // basic
        HttpRequestDef.Builder<UpgradeEngineConfigRequest, UpgradeEngineConfigResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpgradeEngineConfigRequest.class, UpgradeEngineConfigResponse.class)
                .withName("UpgradeEngineConfig")
                .withUri("/v2/{project_id}/enginemgr/engines/{engine_id}/config")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("engine_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpgradeEngineConfigRequest::getEngineId, (req, v) -> {
                req.setEngineId(v);
            }));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpgradeEngineConfigRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
            }));
        builder.<EngineConfigureReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EngineConfigureReq.class),
            f -> f.withMarshaller(UpgradeEngineConfigRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadKieRequest, UploadKieResponse> uploadKie = genForuploadKie();

    private static HttpRequestDef<UploadKieRequest, UploadKieResponse> genForuploadKie() {
        // basic
        HttpRequestDef.Builder<UploadKieRequest, UploadKieResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UploadKieRequest.class, UploadKieResponse.class)
                .withName("UploadKie")
                .withUri("/v1/{project_id}/kie/file")
                .withContentType("multipart/form-data");

        // requests
        builder.<UploadKieRequest.OverrideEnum>withRequestField("override",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UploadKieRequest.OverrideEnum.class),
            f -> f.withMarshaller(UploadKieRequest::getOverride, (req, v) -> {
                req.setOverride(v);
            }));
        builder.<String>withRequestField("label",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadKieRequest::getLabel, (req, v) -> {
                req.setLabel(v);
            }));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadKieRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
            }));
        builder.<String>withRequestField("x-engine-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadKieRequest::getXEngineId, (req, v) -> {
                req.setXEngineId(v);
            }));
        builder.<UploadKieRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UploadKieRequestBody.class),
            f -> f.withMarshaller(UploadKieRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateNacosNamespacesRequest, CreateNacosNamespacesResponse> createNacosNamespaces =
        genForcreateNacosNamespaces();

    private static HttpRequestDef<CreateNacosNamespacesRequest, CreateNacosNamespacesResponse> genForcreateNacosNamespaces() {
        // basic
        HttpRequestDef.Builder<CreateNacosNamespacesRequest, CreateNacosNamespacesResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateNacosNamespacesRequest.class, CreateNacosNamespacesResponse.class)
            .withName("CreateNacosNamespaces")
            .withUri("/v1/{project_id}/nacos/v1/console/namespaces")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("custom_namespace_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateNacosNamespacesRequest::getCustomNamespaceId, (req, v) -> {
                req.setCustomNamespaceId(v);
            }));
        builder.<String>withRequestField("namespace_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateNacosNamespacesRequest::getNamespaceName, (req, v) -> {
                req.setNamespaceName(v);
            }));
        builder.<String>withRequestField("namespace_desc",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateNacosNamespacesRequest::getNamespaceDesc, (req, v) -> {
                req.setNamespaceDesc(v);
            }));
        builder.<String>withRequestField("x-engine-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateNacosNamespacesRequest::getXEngineId, (req, v) -> {
                req.setXEngineId(v);
            }));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateNacosNamespacesRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteNacosNamespacesRequest, DeleteNacosNamespacesResponse> deleteNacosNamespaces =
        genFordeleteNacosNamespaces();

    private static HttpRequestDef<DeleteNacosNamespacesRequest, DeleteNacosNamespacesResponse> genFordeleteNacosNamespaces() {
        // basic
        HttpRequestDef.Builder<DeleteNacosNamespacesRequest, DeleteNacosNamespacesResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteNacosNamespacesRequest.class, DeleteNacosNamespacesResponse.class)
            .withName("DeleteNacosNamespaces")
            .withUri("/v1/{project_id}/nacos/v1/console/namespaces")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteNacosNamespacesRequest::getNamespaceId, (req, v) -> {
                req.setNamespaceId(v);
            }));
        builder.<String>withRequestField("x-engine-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteNacosNamespacesRequest::getXEngineId, (req, v) -> {
                req.setXEngineId(v);
            }));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteNacosNamespacesRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNacosNamespacesRequest, ListNacosNamespacesResponse> listNacosNamespaces =
        genForlistNacosNamespaces();

    private static HttpRequestDef<ListNacosNamespacesRequest, ListNacosNamespacesResponse> genForlistNacosNamespaces() {
        // basic
        HttpRequestDef.Builder<ListNacosNamespacesRequest, ListNacosNamespacesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListNacosNamespacesRequest.class, ListNacosNamespacesResponse.class)
                .withName("ListNacosNamespaces")
                .withUri("/v1/{project_id}/nacos/v1/console/namespaces")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNacosNamespacesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNacosNamespacesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("x-engine-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNacosNamespacesRequest::getXEngineId, (req, v) -> {
                req.setXEngineId(v);
            }));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNacosNamespacesRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateNacosNamespacesRequest, UpdateNacosNamespacesResponse> updateNacosNamespaces =
        genForupdateNacosNamespaces();

    private static HttpRequestDef<UpdateNacosNamespacesRequest, UpdateNacosNamespacesResponse> genForupdateNacosNamespaces() {
        // basic
        HttpRequestDef.Builder<UpdateNacosNamespacesRequest, UpdateNacosNamespacesResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateNacosNamespacesRequest.class, UpdateNacosNamespacesResponse.class)
            .withName("UpdateNacosNamespaces")
            .withUri("/v1/{project_id}/nacos/v1/console/namespaces")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateNacosNamespacesRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            }));
        builder.<String>withRequestField("namespace_show_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateNacosNamespacesRequest::getNamespaceShowName, (req, v) -> {
                req.setNamespaceShowName(v);
            }));
        builder.<String>withRequestField("namespace_desc",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateNacosNamespacesRequest::getNamespaceDesc, (req, v) -> {
                req.setNamespaceDesc(v);
            }));
        builder.<String>withRequestField("x-engine-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateNacosNamespacesRequest::getXEngineId, (req, v) -> {
                req.setXEngineId(v);
            }));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateNacosNamespacesRequest::getXEnterpriseProjectID, (req, v) -> {
                req.setXEnterpriseProjectID(v);
            }));

        // response

        return builder.build();
    }

}
