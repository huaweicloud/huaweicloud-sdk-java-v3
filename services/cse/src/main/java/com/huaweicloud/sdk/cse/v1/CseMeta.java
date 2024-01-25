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
import com.huaweicloud.sdk.cse.v1.model.CreateHttp2RpcRequest;
import com.huaweicloud.sdk.cse.v1.model.CreateHttp2RpcResponse;
import com.huaweicloud.sdk.cse.v1.model.CreateMicroserviceRouteRuleRequest;
import com.huaweicloud.sdk.cse.v1.model.CreateMicroserviceRouteRuleResponse;
import com.huaweicloud.sdk.cse.v1.model.CreateNacosNamespacesRequest;
import com.huaweicloud.sdk.cse.v1.model.CreateNacosNamespacesResponse;
import com.huaweicloud.sdk.cse.v1.model.CreatePluginRequest;
import com.huaweicloud.sdk.cse.v1.model.CreatePluginResponse;
import com.huaweicloud.sdk.cse.v1.model.CreateRules;
import com.huaweicloud.sdk.cse.v1.model.DeleteEngineRequest;
import com.huaweicloud.sdk.cse.v1.model.DeleteEngineResponse;
import com.huaweicloud.sdk.cse.v1.model.DeleteGovernancePolicyRequest;
import com.huaweicloud.sdk.cse.v1.model.DeleteGovernancePolicyResponse;
import com.huaweicloud.sdk.cse.v1.model.DeleteHttp2RpcRequest;
import com.huaweicloud.sdk.cse.v1.model.DeleteHttp2RpcResponse;
import com.huaweicloud.sdk.cse.v1.model.DeleteMicroserviceRouteRuleRequest;
import com.huaweicloud.sdk.cse.v1.model.DeleteMicroserviceRouteRuleResponse;
import com.huaweicloud.sdk.cse.v1.model.DeleteNacosNamespacesRequest;
import com.huaweicloud.sdk.cse.v1.model.DeleteNacosNamespacesResponse;
import com.huaweicloud.sdk.cse.v1.model.DeletePluginRequest;
import com.huaweicloud.sdk.cse.v1.model.DeletePluginResponse;
import com.huaweicloud.sdk.cse.v1.model.DownloadKieReqBody;
import com.huaweicloud.sdk.cse.v1.model.DownloadKieRequest;
import com.huaweicloud.sdk.cse.v1.model.DownloadKieResponse;
import com.huaweicloud.sdk.cse.v1.model.EngineAdditionalActionReq;
import com.huaweicloud.sdk.cse.v1.model.EngineConfigureReq;
import com.huaweicloud.sdk.cse.v1.model.EngineCreateReq;
import com.huaweicloud.sdk.cse.v1.model.EngineModifyReq;
import com.huaweicloud.sdk.cse.v1.model.EngineUpdateReq;
import com.huaweicloud.sdk.cse.v1.model.GovPolicyDetail;
import com.huaweicloud.sdk.cse.v1.model.Http2Rpc;
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
import com.huaweicloud.sdk.cse.v1.model.ModifyHttp2RpcRequest;
import com.huaweicloud.sdk.cse.v1.model.ModifyHttp2RpcResponse;
import com.huaweicloud.sdk.cse.v1.model.ModifyPluginRequest;
import com.huaweicloud.sdk.cse.v1.model.ModifyPluginResponse;
import com.huaweicloud.sdk.cse.v1.model.ResizeEngineRequest;
import com.huaweicloud.sdk.cse.v1.model.ResizeEngineResponse;
import com.huaweicloud.sdk.cse.v1.model.RetryEngineRequest;
import com.huaweicloud.sdk.cse.v1.model.RetryEngineResponse;
import com.huaweicloud.sdk.cse.v1.model.ShowEngineJobRequest;
import com.huaweicloud.sdk.cse.v1.model.ShowEngineJobResponse;
import com.huaweicloud.sdk.cse.v1.model.ShowEngineQuotasRequest;
import com.huaweicloud.sdk.cse.v1.model.ShowEngineQuotasResponse;
import com.huaweicloud.sdk.cse.v1.model.ShowEngineRequest;
import com.huaweicloud.sdk.cse.v1.model.ShowEngineResponse;
import com.huaweicloud.sdk.cse.v1.model.ShowHttp2RpcsRequest;
import com.huaweicloud.sdk.cse.v1.model.ShowHttp2RpcsResponse;
import com.huaweicloud.sdk.cse.v1.model.ShowPluginsRequest;
import com.huaweicloud.sdk.cse.v1.model.ShowPluginsResponse;
import com.huaweicloud.sdk.cse.v1.model.ShowSinglePluginRequest;
import com.huaweicloud.sdk.cse.v1.model.ShowSinglePluginResponse;
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
import com.huaweicloud.sdk.cse.v1.model.WasmPlugin;

import java.util.List;

@SuppressWarnings("unchecked")
public class CseMeta {

    public static final HttpRequestDef<CreateEngineRequest, CreateEngineResponse> createEngine = genForCreateEngine();

    private static HttpRequestDef<CreateEngineRequest, CreateEngineResponse> genForCreateEngine() {
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
            f -> f.withMarshaller(CreateEngineRequest::getXEnterpriseProjectID,
                CreateEngineRequest::setXEnterpriseProjectID));
        builder.<EngineCreateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EngineCreateReq.class),
            f -> f.withMarshaller(CreateEngineRequest::getBody, CreateEngineRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateGovernancePolicyRequest, CreateGovernancePolicyResponse> createGovernancePolicy =
        genForCreateGovernancePolicy();

    private static HttpRequestDef<CreateGovernancePolicyRequest, CreateGovernancePolicyResponse> genForCreateGovernancePolicy() {
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
            f -> f.withMarshaller(CreateGovernancePolicyRequest::getKind, CreateGovernancePolicyRequest::setKind));
        builder.<String>withRequestField("x-engine-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateGovernancePolicyRequest::getXEngineId,
                CreateGovernancePolicyRequest::setXEngineId));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateGovernancePolicyRequest::getXEnterpriseProjectID,
                CreateGovernancePolicyRequest::setXEnterpriseProjectID));
        builder.<String>withRequestField("x-environment",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateGovernancePolicyRequest::getXEnvironment,
                CreateGovernancePolicyRequest::setXEnvironment));
        builder.<CreateGovPolicy>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateGovPolicy.class),
            f -> f.withMarshaller(CreateGovernancePolicyRequest::getBody, CreateGovernancePolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateMicroserviceRouteRuleRequest, CreateMicroserviceRouteRuleResponse> createMicroserviceRouteRule =
        genForCreateMicroserviceRouteRule();

    private static HttpRequestDef<CreateMicroserviceRouteRuleRequest, CreateMicroserviceRouteRuleResponse> genForCreateMicroserviceRouteRule() {
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
            f -> f.withMarshaller(CreateMicroserviceRouteRuleRequest::getServiceName,
                CreateMicroserviceRouteRuleRequest::setServiceName));
        builder.<String>withRequestField("environment",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateMicroserviceRouteRuleRequest::getEnvironment,
                CreateMicroserviceRouteRuleRequest::setEnvironment));
        builder.<String>withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateMicroserviceRouteRuleRequest::getAppId,
                CreateMicroserviceRouteRuleRequest::setAppId));
        builder.<String>withRequestField("x-engine-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateMicroserviceRouteRuleRequest::getXEngineId,
                CreateMicroserviceRouteRuleRequest::setXEngineId));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateMicroserviceRouteRuleRequest::getXEnterpriseProjectID,
                CreateMicroserviceRouteRuleRequest::setXEnterpriseProjectID));
        builder.<List<CreateRules>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f
                .withMarshaller(CreateMicroserviceRouteRuleRequest::getBody,
                    CreateMicroserviceRouteRuleRequest::setBody)
                .withInnerContainerType(CreateRules.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEngineRequest, DeleteEngineResponse> deleteEngine = genForDeleteEngine();

    private static HttpRequestDef<DeleteEngineRequest, DeleteEngineResponse> genForDeleteEngine() {
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
            f -> f.withMarshaller(DeleteEngineRequest::getEngineId, DeleteEngineRequest::setEngineId));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEngineRequest::getXEnterpriseProjectID,
                DeleteEngineRequest::setXEnterpriseProjectID));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteGovernancePolicyRequest, DeleteGovernancePolicyResponse> deleteGovernancePolicy =
        genForDeleteGovernancePolicy();

    private static HttpRequestDef<DeleteGovernancePolicyRequest, DeleteGovernancePolicyResponse> genForDeleteGovernancePolicy() {
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
            f -> f.withMarshaller(DeleteGovernancePolicyRequest::getKind, DeleteGovernancePolicyRequest::setKind));
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGovernancePolicyRequest::getPolicyId,
                DeleteGovernancePolicyRequest::setPolicyId));
        builder.<String>withRequestField("x-engine-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGovernancePolicyRequest::getXEngineId,
                DeleteGovernancePolicyRequest::setXEngineId));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGovernancePolicyRequest::getXEnterpriseProjectID,
                DeleteGovernancePolicyRequest::setXEnterpriseProjectID));
        builder.<String>withRequestField("x-environment",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGovernancePolicyRequest::getXEnvironment,
                DeleteGovernancePolicyRequest::setXEnvironment));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteMicroserviceRouteRuleRequest, DeleteMicroserviceRouteRuleResponse> deleteMicroserviceRouteRule =
        genForDeleteMicroserviceRouteRule();

    private static HttpRequestDef<DeleteMicroserviceRouteRuleRequest, DeleteMicroserviceRouteRuleResponse> genForDeleteMicroserviceRouteRule() {
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
            f -> f.withMarshaller(DeleteMicroserviceRouteRuleRequest::getServiceName,
                DeleteMicroserviceRouteRuleRequest::setServiceName));
        builder.<String>withRequestField("environment",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteMicroserviceRouteRuleRequest::getEnvironment,
                DeleteMicroserviceRouteRuleRequest::setEnvironment));
        builder.<String>withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteMicroserviceRouteRuleRequest::getAppId,
                DeleteMicroserviceRouteRuleRequest::setAppId));
        builder.<String>withRequestField("x-engine-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteMicroserviceRouteRuleRequest::getXEngineId,
                DeleteMicroserviceRouteRuleRequest::setXEngineId));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteMicroserviceRouteRuleRequest::getXEnterpriseProjectID,
                DeleteMicroserviceRouteRuleRequest::setXEnterpriseProjectID));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DownloadKieRequest, DownloadKieResponse> downloadKie = genForDownloadKie();

    private static HttpRequestDef<DownloadKieRequest, DownloadKieResponse> genForDownloadKie() {
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
            f -> f.withMarshaller(DownloadKieRequest::getLabel, DownloadKieRequest::setLabel));
        builder.<DownloadKieRequest.MatchEnum>withRequestField("match",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(DownloadKieRequest.MatchEnum.class),
            f -> f.withMarshaller(DownloadKieRequest::getMatch, DownloadKieRequest::setMatch));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadKieRequest::getXEnterpriseProjectID,
                DownloadKieRequest::setXEnterpriseProjectID));
        builder.<String>withRequestField("x-engine-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadKieRequest::getXEngineId, DownloadKieRequest::setXEngineId));
        builder.<DownloadKieReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DownloadKieReqBody.class),
            f -> f.withMarshaller(DownloadKieRequest::getBody, DownloadKieRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEnginesRequest, ListEnginesResponse> listEngines = genForListEngines();

    private static HttpRequestDef<ListEnginesRequest, ListEnginesResponse> genForListEngines() {
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
            f -> f.withMarshaller(ListEnginesRequest::getOffset, ListEnginesRequest::setOffset));
        builder.<String>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEnginesRequest::getLimit, ListEnginesRequest::setLimit));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFlavorsRequest, ListFlavorsResponse> listFlavors = genForListFlavors();

    private static HttpRequestDef<ListFlavorsRequest, ListFlavorsResponse> genForListFlavors() {
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
            f -> f.withMarshaller(ListFlavorsRequest::getSpecType, ListFlavorsRequest::setSpecType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGovernancePolicyRequest, ListGovernancePolicyResponse> listGovernancePolicy =
        genForListGovernancePolicy();

    private static HttpRequestDef<ListGovernancePolicyRequest, ListGovernancePolicyResponse> genForListGovernancePolicy() {
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
            f -> f.withMarshaller(ListGovernancePolicyRequest::getKind, ListGovernancePolicyRequest::setKind));
        builder.<String>withRequestField("x-engine-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGovernancePolicyRequest::getXEngineId,
                ListGovernancePolicyRequest::setXEngineId));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGovernancePolicyRequest::getXEnterpriseProjectID,
                ListGovernancePolicyRequest::setXEnterpriseProjectID));
        builder.<String>withRequestField("x-environment",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGovernancePolicyRequest::getXEnvironment,
                ListGovernancePolicyRequest::setXEnvironment));

        // response
        builder.<List<GovPolicyDetail>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGovernancePolicyResponse::getBody, ListGovernancePolicyResponse::setBody)
                .withInnerContainerType(GovPolicyDetail.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListGovernancePolicyByPolicyIdRequest, ListGovernancePolicyByPolicyIdResponse> listGovernancePolicyByPolicyId =
        genForListGovernancePolicyByPolicyId();

    private static HttpRequestDef<ListGovernancePolicyByPolicyIdRequest, ListGovernancePolicyByPolicyIdResponse> genForListGovernancePolicyByPolicyId() {
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
            f -> f.withMarshaller(ListGovernancePolicyByPolicyIdRequest::getKind,
                ListGovernancePolicyByPolicyIdRequest::setKind));
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGovernancePolicyByPolicyIdRequest::getPolicyId,
                ListGovernancePolicyByPolicyIdRequest::setPolicyId));
        builder.<String>withRequestField("x-engine-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGovernancePolicyByPolicyIdRequest::getXEngineId,
                ListGovernancePolicyByPolicyIdRequest::setXEngineId));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGovernancePolicyByPolicyIdRequest::getXEnterpriseProjectID,
                ListGovernancePolicyByPolicyIdRequest::setXEnterpriseProjectID));
        builder.<String>withRequestField("x-environment",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGovernancePolicyByPolicyIdRequest::getXEnvironment,
                ListGovernancePolicyByPolicyIdRequest::setXEnvironment));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGovernancePolicysRequest, ListGovernancePolicysResponse> listGovernancePolicys =
        genForListGovernancePolicys();

    private static HttpRequestDef<ListGovernancePolicysRequest, ListGovernancePolicysResponse> genForListGovernancePolicys() {
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
            f -> f.withMarshaller(ListGovernancePolicysRequest::getEnvironment,
                ListGovernancePolicysRequest::setEnvironment));
        builder.<String>withRequestField("app",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGovernancePolicysRequest::getApp, ListGovernancePolicysRequest::setApp));
        builder.<String>withRequestField("x-engine-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGovernancePolicysRequest::getXEngineId,
                ListGovernancePolicysRequest::setXEngineId));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGovernancePolicysRequest::getXEnterpriseProjectID,
                ListGovernancePolicysRequest::setXEnterpriseProjectID));

        // response
        builder.<List<GovPolicyDetail>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListGovernancePolicysResponse::getBody, ListGovernancePolicysResponse::setBody)
                .withInnerContainerType(GovPolicyDetail.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListMicroserviceRouteRuleRequest, ListMicroserviceRouteRuleResponse> listMicroserviceRouteRule =
        genForListMicroserviceRouteRule();

    private static HttpRequestDef<ListMicroserviceRouteRuleRequest, ListMicroserviceRouteRuleResponse> genForListMicroserviceRouteRule() {
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
            f -> f.withMarshaller(ListMicroserviceRouteRuleRequest::getServiceName,
                ListMicroserviceRouteRuleRequest::setServiceName));
        builder.<String>withRequestField("environment",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMicroserviceRouteRuleRequest::getEnvironment,
                ListMicroserviceRouteRuleRequest::setEnvironment));
        builder.<String>withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMicroserviceRouteRuleRequest::getAppId,
                ListMicroserviceRouteRuleRequest::setAppId));
        builder.<String>withRequestField("x-engine-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMicroserviceRouteRuleRequest::getXEngineId,
                ListMicroserviceRouteRuleRequest::setXEngineId));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMicroserviceRouteRuleRequest::getXEnterpriseProjectID,
                ListMicroserviceRouteRuleRequest::setXEnterpriseProjectID));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResizeEngineRequest, ResizeEngineResponse> resizeEngine = genForResizeEngine();

    private static HttpRequestDef<ResizeEngineRequest, ResizeEngineResponse> genForResizeEngine() {
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
            f -> f.withMarshaller(ResizeEngineRequest::getEngineId, ResizeEngineRequest::setEngineId));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResizeEngineRequest::getXEnterpriseProjectID,
                ResizeEngineRequest::setXEnterpriseProjectID));
        builder.<String>withRequestField("Accept",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResizeEngineRequest::getAccept, ResizeEngineRequest::setAccept));
        builder.<EngineModifyReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(EngineModifyReq.class),
            f -> f.withMarshaller(ResizeEngineRequest::getBody, ResizeEngineRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RetryEngineRequest, RetryEngineResponse> retryEngine = genForRetryEngine();

    private static HttpRequestDef<RetryEngineRequest, RetryEngineResponse> genForRetryEngine() {
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
            f -> f.withMarshaller(RetryEngineRequest::getEngineId, RetryEngineRequest::setEngineId));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RetryEngineRequest::getXEnterpriseProjectID,
                RetryEngineRequest::setXEnterpriseProjectID));
        builder.<EngineAdditionalActionReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EngineAdditionalActionReq.class),
            f -> f.withMarshaller(RetryEngineRequest::getBody, RetryEngineRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEngineRequest, ShowEngineResponse> showEngine = genForShowEngine();

    private static HttpRequestDef<ShowEngineRequest, ShowEngineResponse> genForShowEngine() {
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
            f -> f.withMarshaller(ShowEngineRequest::getEngineId, ShowEngineRequest::setEngineId));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEngineRequest::getXEnterpriseProjectID,
                ShowEngineRequest::setXEnterpriseProjectID));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEngineJobRequest, ShowEngineJobResponse> showEngineJob =
        genForShowEngineJob();

    private static HttpRequestDef<ShowEngineJobRequest, ShowEngineJobResponse> genForShowEngineJob() {
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
            f -> f.withMarshaller(ShowEngineJobRequest::getEngineId, ShowEngineJobRequest::setEngineId));
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEngineJobRequest::getJobId, ShowEngineJobRequest::setJobId));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEngineJobRequest::getXEnterpriseProjectID,
                ShowEngineJobRequest::setXEnterpriseProjectID));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEngineQuotasRequest, ShowEngineQuotasResponse> showEngineQuotas =
        genForShowEngineQuotas();

    private static HttpRequestDef<ShowEngineQuotasRequest, ShowEngineQuotasResponse> genForShowEngineQuotas() {
        // basic
        HttpRequestDef.Builder<ShowEngineQuotasRequest, ShowEngineQuotasResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowEngineQuotasRequest.class, ShowEngineQuotasResponse.class)
                .withName("ShowEngineQuotas")
                .withUri("/v2/{project_id}/enginemgr/quotas")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateGovernancePolicyRequest, UpdateGovernancePolicyResponse> updateGovernancePolicy =
        genForUpdateGovernancePolicy();

    private static HttpRequestDef<UpdateGovernancePolicyRequest, UpdateGovernancePolicyResponse> genForUpdateGovernancePolicy() {
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
            f -> f.withMarshaller(UpdateGovernancePolicyRequest::getKind, UpdateGovernancePolicyRequest::setKind));
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGovernancePolicyRequest::getPolicyId,
                UpdateGovernancePolicyRequest::setPolicyId));
        builder.<String>withRequestField("x-engine-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGovernancePolicyRequest::getXEngineId,
                UpdateGovernancePolicyRequest::setXEngineId));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGovernancePolicyRequest::getXEnterpriseProjectID,
                UpdateGovernancePolicyRequest::setXEnterpriseProjectID));
        builder.<String>withRequestField("x-environment",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGovernancePolicyRequest::getXEnvironment,
                UpdateGovernancePolicyRequest::setXEnvironment));
        builder.<CreateGovPolicy>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateGovPolicy.class),
            f -> f.withMarshaller(UpdateGovernancePolicyRequest::getBody, UpdateGovernancePolicyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpgradeEngineRequest, UpgradeEngineResponse> upgradeEngine =
        genForUpgradeEngine();

    private static HttpRequestDef<UpgradeEngineRequest, UpgradeEngineResponse> genForUpgradeEngine() {
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
            f -> f.withMarshaller(UpgradeEngineRequest::getEngineId, UpgradeEngineRequest::setEngineId));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpgradeEngineRequest::getXEnterpriseProjectID,
                UpgradeEngineRequest::setXEnterpriseProjectID));
        builder.<EngineUpdateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EngineUpdateReq.class),
            f -> f.withMarshaller(UpgradeEngineRequest::getBody, UpgradeEngineRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpgradeEngineConfigRequest, UpgradeEngineConfigResponse> upgradeEngineConfig =
        genForUpgradeEngineConfig();

    private static HttpRequestDef<UpgradeEngineConfigRequest, UpgradeEngineConfigResponse> genForUpgradeEngineConfig() {
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
            f -> f.withMarshaller(UpgradeEngineConfigRequest::getEngineId, UpgradeEngineConfigRequest::setEngineId));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpgradeEngineConfigRequest::getXEnterpriseProjectID,
                UpgradeEngineConfigRequest::setXEnterpriseProjectID));
        builder.<EngineConfigureReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EngineConfigureReq.class),
            f -> f.withMarshaller(UpgradeEngineConfigRequest::getBody, UpgradeEngineConfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadKieRequest, UploadKieResponse> uploadKie = genForUploadKie();

    private static HttpRequestDef<UploadKieRequest, UploadKieResponse> genForUploadKie() {
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
            f -> f.withMarshaller(UploadKieRequest::getOverride, UploadKieRequest::setOverride));
        builder.<String>withRequestField("label",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadKieRequest::getLabel, UploadKieRequest::setLabel));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadKieRequest::getXEnterpriseProjectID,
                UploadKieRequest::setXEnterpriseProjectID));
        builder.<String>withRequestField("x-engine-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadKieRequest::getXEngineId, UploadKieRequest::setXEngineId));
        builder.<UploadKieRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UploadKieRequestBody.class),
            f -> f.withMarshaller(UploadKieRequest::getBody, UploadKieRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateHttp2RpcRequest, CreateHttp2RpcResponse> createHttp2Rpc =
        genForCreateHttp2Rpc();

    private static HttpRequestDef<CreateHttp2RpcRequest, CreateHttp2RpcResponse> genForCreateHttp2Rpc() {
        // basic
        HttpRequestDef.Builder<CreateHttp2RpcRequest, CreateHttp2RpcResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateHttp2RpcRequest.class, CreateHttp2RpcResponse.class)
                .withName("CreateHttp2Rpc")
                .withUri("/v2/{project_id}/enginemgr/gateways/{gateway_id}/http2Rpcs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("gateway_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateHttp2RpcRequest::getGatewayId, CreateHttp2RpcRequest::setGatewayId));
        builder.<String>withRequestField("Accept",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateHttp2RpcRequest::getAccept, CreateHttp2RpcRequest::setAccept));
        builder.<Http2Rpc>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Http2Rpc.class),
            f -> f.withMarshaller(CreateHttp2RpcRequest::getBody, CreateHttp2RpcRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePluginRequest, CreatePluginResponse> createPlugin = genForCreatePlugin();

    private static HttpRequestDef<CreatePluginRequest, CreatePluginResponse> genForCreatePlugin() {
        // basic
        HttpRequestDef.Builder<CreatePluginRequest, CreatePluginResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePluginRequest.class, CreatePluginResponse.class)
                .withName("CreatePlugin")
                .withUri("/v2/{project_id}/enginemgr/gateways/{gateway_id}/plugins")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("gateway_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePluginRequest::getGatewayId, CreatePluginRequest::setGatewayId));
        builder.<String>withRequestField("Accept",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePluginRequest::getAccept, CreatePluginRequest::setAccept));
        builder.<WasmPlugin>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(WasmPlugin.class),
            f -> f.withMarshaller(CreatePluginRequest::getBody, CreatePluginRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteHttp2RpcRequest, DeleteHttp2RpcResponse> deleteHttp2Rpc =
        genForDeleteHttp2Rpc();

    private static HttpRequestDef<DeleteHttp2RpcRequest, DeleteHttp2RpcResponse> genForDeleteHttp2Rpc() {
        // basic
        HttpRequestDef.Builder<DeleteHttp2RpcRequest, DeleteHttp2RpcResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteHttp2RpcRequest.class, DeleteHttp2RpcResponse.class)
                .withName("DeleteHttp2Rpc")
                .withUri("/v2/{project_id}/enginemgr/gateways/{gateway_id}/http2Rpcs/{http2Rpc_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("gateway_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHttp2RpcRequest::getGatewayId, DeleteHttp2RpcRequest::setGatewayId));
        builder.<String>withRequestField("http2Rpc_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHttp2RpcRequest::getHttp2RpcId, DeleteHttp2RpcRequest::setHttp2RpcId));
        builder.<String>withRequestField("Accept",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHttp2RpcRequest::getAccept, DeleteHttp2RpcRequest::setAccept));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePluginRequest, DeletePluginResponse> deletePlugin = genForDeletePlugin();

    private static HttpRequestDef<DeletePluginRequest, DeletePluginResponse> genForDeletePlugin() {
        // basic
        HttpRequestDef.Builder<DeletePluginRequest, DeletePluginResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePluginRequest.class, DeletePluginResponse.class)
                .withName("DeletePlugin")
                .withUri("/v2/{project_id}/enginemgr/gateways/{gateway_id}/plugins/{plugin_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("gateway_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePluginRequest::getGatewayId, DeletePluginRequest::setGatewayId));
        builder.<String>withRequestField("plugin_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePluginRequest::getPluginId, DeletePluginRequest::setPluginId));
        builder.<String>withRequestField("Accept",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePluginRequest::getAccept, DeletePluginRequest::setAccept));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ModifyHttp2RpcRequest, ModifyHttp2RpcResponse> modifyHttp2Rpc =
        genForModifyHttp2Rpc();

    private static HttpRequestDef<ModifyHttp2RpcRequest, ModifyHttp2RpcResponse> genForModifyHttp2Rpc() {
        // basic
        HttpRequestDef.Builder<ModifyHttp2RpcRequest, ModifyHttp2RpcResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ModifyHttp2RpcRequest.class, ModifyHttp2RpcResponse.class)
                .withName("ModifyHttp2Rpc")
                .withUri("/v2/{project_id}/enginemgr/gateways/{gateway_id}/http2Rpcs/{http2Rpc_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("gateway_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyHttp2RpcRequest::getGatewayId, ModifyHttp2RpcRequest::setGatewayId));
        builder.<String>withRequestField("http2Rpc_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyHttp2RpcRequest::getHttp2RpcId, ModifyHttp2RpcRequest::setHttp2RpcId));
        builder.<String>withRequestField("Accept",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyHttp2RpcRequest::getAccept, ModifyHttp2RpcRequest::setAccept));
        builder.<Http2Rpc>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Http2Rpc.class),
            f -> f.withMarshaller(ModifyHttp2RpcRequest::getBody, ModifyHttp2RpcRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ModifyPluginRequest, ModifyPluginResponse> modifyPlugin = genForModifyPlugin();

    private static HttpRequestDef<ModifyPluginRequest, ModifyPluginResponse> genForModifyPlugin() {
        // basic
        HttpRequestDef.Builder<ModifyPluginRequest, ModifyPluginResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ModifyPluginRequest.class, ModifyPluginResponse.class)
                .withName("ModifyPlugin")
                .withUri("/v2/{project_id}/enginemgr/gateways/{gateway_id}/plugins/{plugin_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("gateway_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyPluginRequest::getGatewayId, ModifyPluginRequest::setGatewayId));
        builder.<String>withRequestField("plugin_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyPluginRequest::getPluginId, ModifyPluginRequest::setPluginId));
        builder.<String>withRequestField("Accept",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyPluginRequest::getAccept, ModifyPluginRequest::setAccept));
        builder.<WasmPlugin>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(WasmPlugin.class),
            f -> f.withMarshaller(ModifyPluginRequest::getBody, ModifyPluginRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHttp2RpcsRequest, ShowHttp2RpcsResponse> showHttp2Rpcs =
        genForShowHttp2Rpcs();

    private static HttpRequestDef<ShowHttp2RpcsRequest, ShowHttp2RpcsResponse> genForShowHttp2Rpcs() {
        // basic
        HttpRequestDef.Builder<ShowHttp2RpcsRequest, ShowHttp2RpcsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowHttp2RpcsRequest.class, ShowHttp2RpcsResponse.class)
                .withName("ShowHttp2Rpcs")
                .withUri("/v2/{project_id}/enginemgr/gateways/{gateway_id}/http2Rpcs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("gateway_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHttp2RpcsRequest::getGatewayId, ShowHttp2RpcsRequest::setGatewayId));
        builder.<String>withRequestField("Accept",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHttp2RpcsRequest::getAccept, ShowHttp2RpcsRequest::setAccept));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPluginsRequest, ShowPluginsResponse> showPlugins = genForShowPlugins();

    private static HttpRequestDef<ShowPluginsRequest, ShowPluginsResponse> genForShowPlugins() {
        // basic
        HttpRequestDef.Builder<ShowPluginsRequest, ShowPluginsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPluginsRequest.class, ShowPluginsResponse.class)
                .withName("ShowPlugins")
                .withUri("/v2/{project_id}/enginemgr/gateways/{gateway_id}/plugins")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("gateway_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPluginsRequest::getGatewayId, ShowPluginsRequest::setGatewayId));
        builder.<String>withRequestField("Accept",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPluginsRequest::getAccept, ShowPluginsRequest::setAccept));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowSinglePluginRequest, ShowSinglePluginResponse> showSinglePlugin =
        genForShowSinglePlugin();

    private static HttpRequestDef<ShowSinglePluginRequest, ShowSinglePluginResponse> genForShowSinglePlugin() {
        // basic
        HttpRequestDef.Builder<ShowSinglePluginRequest, ShowSinglePluginResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowSinglePluginRequest.class, ShowSinglePluginResponse.class)
                .withName("ShowSinglePlugin")
                .withUri("/v2/{project_id}/enginemgr/gateways/{gateway_id}/plugins/{plugin_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("gateway_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSinglePluginRequest::getGatewayId, ShowSinglePluginRequest::setGatewayId));
        builder.<String>withRequestField("plugin_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSinglePluginRequest::getPluginId, ShowSinglePluginRequest::setPluginId));
        builder.<String>withRequestField("Accept",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowSinglePluginRequest::getAccept, ShowSinglePluginRequest::setAccept));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateNacosNamespacesRequest, CreateNacosNamespacesResponse> createNacosNamespaces =
        genForCreateNacosNamespaces();

    private static HttpRequestDef<CreateNacosNamespacesRequest, CreateNacosNamespacesResponse> genForCreateNacosNamespaces() {
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
            f -> f.withMarshaller(CreateNacosNamespacesRequest::getCustomNamespaceId,
                CreateNacosNamespacesRequest::setCustomNamespaceId));
        builder.<String>withRequestField("namespace_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateNacosNamespacesRequest::getNamespaceName,
                CreateNacosNamespacesRequest::setNamespaceName));
        builder.<String>withRequestField("namespace_desc",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateNacosNamespacesRequest::getNamespaceDesc,
                CreateNacosNamespacesRequest::setNamespaceDesc));
        builder.<String>withRequestField("x-engine-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateNacosNamespacesRequest::getXEngineId,
                CreateNacosNamespacesRequest::setXEngineId));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateNacosNamespacesRequest::getXEnterpriseProjectID,
                CreateNacosNamespacesRequest::setXEnterpriseProjectID));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteNacosNamespacesRequest, DeleteNacosNamespacesResponse> deleteNacosNamespaces =
        genForDeleteNacosNamespaces();

    private static HttpRequestDef<DeleteNacosNamespacesRequest, DeleteNacosNamespacesResponse> genForDeleteNacosNamespaces() {
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
            f -> f.withMarshaller(DeleteNacosNamespacesRequest::getNamespaceId,
                DeleteNacosNamespacesRequest::setNamespaceId));
        builder.<String>withRequestField("x-engine-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteNacosNamespacesRequest::getXEngineId,
                DeleteNacosNamespacesRequest::setXEngineId));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteNacosNamespacesRequest::getXEnterpriseProjectID,
                DeleteNacosNamespacesRequest::setXEnterpriseProjectID));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNacosNamespacesRequest, ListNacosNamespacesResponse> listNacosNamespaces =
        genForListNacosNamespaces();

    private static HttpRequestDef<ListNacosNamespacesRequest, ListNacosNamespacesResponse> genForListNacosNamespaces() {
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
            f -> f.withMarshaller(ListNacosNamespacesRequest::getOffset, ListNacosNamespacesRequest::setOffset));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListNacosNamespacesRequest::getLimit, ListNacosNamespacesRequest::setLimit));
        builder.<String>withRequestField("x-engine-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNacosNamespacesRequest::getXEngineId, ListNacosNamespacesRequest::setXEngineId));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNacosNamespacesRequest::getXEnterpriseProjectID,
                ListNacosNamespacesRequest::setXEnterpriseProjectID));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateNacosNamespacesRequest, UpdateNacosNamespacesResponse> updateNacosNamespaces =
        genForUpdateNacosNamespaces();

    private static HttpRequestDef<UpdateNacosNamespacesRequest, UpdateNacosNamespacesResponse> genForUpdateNacosNamespaces() {
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
            f -> f.withMarshaller(UpdateNacosNamespacesRequest::getNamespace,
                UpdateNacosNamespacesRequest::setNamespace));
        builder.<String>withRequestField("namespace_show_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateNacosNamespacesRequest::getNamespaceShowName,
                UpdateNacosNamespacesRequest::setNamespaceShowName));
        builder.<String>withRequestField("namespace_desc",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateNacosNamespacesRequest::getNamespaceDesc,
                UpdateNacosNamespacesRequest::setNamespaceDesc));
        builder.<String>withRequestField("x-engine-id",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateNacosNamespacesRequest::getXEngineId,
                UpdateNacosNamespacesRequest::setXEngineId));
        builder.<String>withRequestField("X-Enterprise-Project-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateNacosNamespacesRequest::getXEnterpriseProjectID,
                UpdateNacosNamespacesRequest::setXEnterpriseProjectID));

        // response

        return builder.build();
    }

}
