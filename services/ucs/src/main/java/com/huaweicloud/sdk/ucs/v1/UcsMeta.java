package com.huaweicloud.sdk.ucs.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.ucs.v1.model.AddonInstance;
import com.huaweicloud.sdk.ucs.v1.model.Cluster;
import com.huaweicloud.sdk.ucs.v1.model.ClusterJoinGroupRequestBody;
import com.huaweicloud.sdk.ucs.v1.model.CreateAddonInstanceRequest;
import com.huaweicloud.sdk.ucs.v1.model.CreateAddonInstanceResponse;
import com.huaweicloud.sdk.ucs.v1.model.CreateClusterConfRequest;
import com.huaweicloud.sdk.ucs.v1.model.CreateClusterConfResponse;
import com.huaweicloud.sdk.ucs.v1.model.CreateClusterGroupPolicyInstanceRequest;
import com.huaweicloud.sdk.ucs.v1.model.CreateClusterGroupPolicyInstanceResponse;
import com.huaweicloud.sdk.ucs.v1.model.CreateClusterKubeconfigRequest;
import com.huaweicloud.sdk.ucs.v1.model.CreateClusterKubeconfigResponse;
import com.huaweicloud.sdk.ucs.v1.model.CreateClusterPolicyInstanceRequest;
import com.huaweicloud.sdk.ucs.v1.model.CreateClusterPolicyInstanceResponse;
import com.huaweicloud.sdk.ucs.v1.model.CreateConfigSetRequest;
import com.huaweicloud.sdk.ucs.v1.model.CreateConfigSetRequestBody;
import com.huaweicloud.sdk.ucs.v1.model.CreateConfigSetResponse;
import com.huaweicloud.sdk.ucs.v1.model.CreateFederationCertRequest;
import com.huaweicloud.sdk.ucs.v1.model.CreateFederationCertRequestBody;
import com.huaweicloud.sdk.ucs.v1.model.CreateFederationCertResponse;
import com.huaweicloud.sdk.ucs.v1.model.CreateFederationConnectionRequest;
import com.huaweicloud.sdk.ucs.v1.model.CreateFederationConnectionRequestBody;
import com.huaweicloud.sdk.ucs.v1.model.CreateFederationConnectionResponse;
import com.huaweicloud.sdk.ucs.v1.model.CreateProxyUnitedWorkloadRequest;
import com.huaweicloud.sdk.ucs.v1.model.CreateProxyUnitedWorkloadResponse;
import com.huaweicloud.sdk.ucs.v1.model.CreateRecordSetRequest;
import com.huaweicloud.sdk.ucs.v1.model.CreateRecordSetRequestBody;
import com.huaweicloud.sdk.ucs.v1.model.CreateRecordSetResponse;
import com.huaweicloud.sdk.ucs.v1.model.CreateRepoRequest;
import com.huaweicloud.sdk.ucs.v1.model.CreateRepoRequestBody;
import com.huaweicloud.sdk.ucs.v1.model.CreateRepoResponse;
import com.huaweicloud.sdk.ucs.v1.model.CreateRuleRequest;
import com.huaweicloud.sdk.ucs.v1.model.CreateRuleRequestBody;
import com.huaweicloud.sdk.ucs.v1.model.CreateRuleResponse;
import com.huaweicloud.sdk.ucs.v1.model.DeleteAddonInstanceRequest;
import com.huaweicloud.sdk.ucs.v1.model.DeleteAddonInstanceResponse;
import com.huaweicloud.sdk.ucs.v1.model.DeleteClusterGroupRequest;
import com.huaweicloud.sdk.ucs.v1.model.DeleteClusterGroupResponse;
import com.huaweicloud.sdk.ucs.v1.model.DeleteClusterRequest;
import com.huaweicloud.sdk.ucs.v1.model.DeleteClusterResponse;
import com.huaweicloud.sdk.ucs.v1.model.DeleteConfigSetRequest;
import com.huaweicloud.sdk.ucs.v1.model.DeleteConfigSetResponse;
import com.huaweicloud.sdk.ucs.v1.model.DeletePolicyInstanceRequest;
import com.huaweicloud.sdk.ucs.v1.model.DeletePolicyInstanceResponse;
import com.huaweicloud.sdk.ucs.v1.model.DeleteProxyUnitedWorkloadRequest;
import com.huaweicloud.sdk.ucs.v1.model.DeleteProxyUnitedWorkloadResponse;
import com.huaweicloud.sdk.ucs.v1.model.DeleteRepoRequest;
import com.huaweicloud.sdk.ucs.v1.model.DeleteRepoResponse;
import com.huaweicloud.sdk.ucs.v1.model.DeleteRuleRequest;
import com.huaweicloud.sdk.ucs.v1.model.DeleteRuleResponse;
import com.huaweicloud.sdk.ucs.v1.model.DisableClusterPolicyRequest;
import com.huaweicloud.sdk.ucs.v1.model.DisableClusterPolicyResponse;
import com.huaweicloud.sdk.ucs.v1.model.DisableClustergroupPolicyRequest;
import com.huaweicloud.sdk.ucs.v1.model.DisableClustergroupPolicyResponse;
import com.huaweicloud.sdk.ucs.v1.model.DisableFederationRequest;
import com.huaweicloud.sdk.ucs.v1.model.DisableFederationResponse;
import com.huaweicloud.sdk.ucs.v1.model.DisableGitOpsRequest;
import com.huaweicloud.sdk.ucs.v1.model.DisableGitOpsResponse;
import com.huaweicloud.sdk.ucs.v1.model.DownloadFederationKubeconfigRequest;
import com.huaweicloud.sdk.ucs.v1.model.DownloadFederationKubeconfigRequestBody;
import com.huaweicloud.sdk.ucs.v1.model.DownloadFederationKubeconfigResponse;
import com.huaweicloud.sdk.ucs.v1.model.EnableClusterPolicyRequest;
import com.huaweicloud.sdk.ucs.v1.model.EnableClusterPolicyResponse;
import com.huaweicloud.sdk.ucs.v1.model.EnableClustergroupPolicyRequest;
import com.huaweicloud.sdk.ucs.v1.model.EnableClustergroupPolicyResponse;
import com.huaweicloud.sdk.ucs.v1.model.EnableFederationRequest;
import com.huaweicloud.sdk.ucs.v1.model.EnableFederationResponse;
import com.huaweicloud.sdk.ucs.v1.model.EnableGitOpsRequest;
import com.huaweicloud.sdk.ucs.v1.model.EnableGitOpsResponse;
import com.huaweicloud.sdk.ucs.v1.model.JoinGroupRequest;
import com.huaweicloud.sdk.ucs.v1.model.JoinGroupResponse;
import com.huaweicloud.sdk.ucs.v1.model.LeaveGroupRequest;
import com.huaweicloud.sdk.ucs.v1.model.LeaveGroupResponse;
import com.huaweicloud.sdk.ucs.v1.model.ListAddonInstancesRequest;
import com.huaweicloud.sdk.ucs.v1.model.ListAddonInstancesResponse;
import com.huaweicloud.sdk.ucs.v1.model.ListAddonTemplatesRequest;
import com.huaweicloud.sdk.ucs.v1.model.ListAddonTemplatesResponse;
import com.huaweicloud.sdk.ucs.v1.model.ListClusterGroupRequest;
import com.huaweicloud.sdk.ucs.v1.model.ListClusterGroupResponse;
import com.huaweicloud.sdk.ucs.v1.model.ListConfigSetsRequest;
import com.huaweicloud.sdk.ucs.v1.model.ListConfigSetsResponse;
import com.huaweicloud.sdk.ucs.v1.model.ListManagedClustersRequest;
import com.huaweicloud.sdk.ucs.v1.model.ListManagedClustersResponse;
import com.huaweicloud.sdk.ucs.v1.model.ListPolicyDefinitionsRequest;
import com.huaweicloud.sdk.ucs.v1.model.ListPolicyDefinitionsResponse;
import com.huaweicloud.sdk.ucs.v1.model.ListPolicyInstancesRequest;
import com.huaweicloud.sdk.ucs.v1.model.ListPolicyInstancesResponse;
import com.huaweicloud.sdk.ucs.v1.model.ListPolicyJobsRequest;
import com.huaweicloud.sdk.ucs.v1.model.ListPolicyJobsResponse;
import com.huaweicloud.sdk.ucs.v1.model.ListRecordSetsRequest;
import com.huaweicloud.sdk.ucs.v1.model.ListRecordSetsResponse;
import com.huaweicloud.sdk.ucs.v1.model.ListRegisteredClusterVersionsRequest;
import com.huaweicloud.sdk.ucs.v1.model.ListRegisteredClusterVersionsResponse;
import com.huaweicloud.sdk.ucs.v1.model.ListReposRequest;
import com.huaweicloud.sdk.ucs.v1.model.ListReposResponse;
import com.huaweicloud.sdk.ucs.v1.model.ListRuleRequest;
import com.huaweicloud.sdk.ucs.v1.model.ListRuleResponse;
import com.huaweicloud.sdk.ucs.v1.model.ListServerConfigsRequest;
import com.huaweicloud.sdk.ucs.v1.model.ListServerConfigsResponse;
import com.huaweicloud.sdk.ucs.v1.model.MutiWorkload;
import com.huaweicloud.sdk.ucs.v1.model.RecordSet;
import com.huaweicloud.sdk.ucs.v1.model.RegisterCluster;
import com.huaweicloud.sdk.ucs.v1.model.RegisterClusterGroup;
import com.huaweicloud.sdk.ucs.v1.model.RegisterClusterGroupRequest;
import com.huaweicloud.sdk.ucs.v1.model.RegisterClusterGroupResponse;
import com.huaweicloud.sdk.ucs.v1.model.RegisterClusterRequest;
import com.huaweicloud.sdk.ucs.v1.model.RegisterClusterResponse;
import com.huaweicloud.sdk.ucs.v1.model.RequiredInput;
import com.huaweicloud.sdk.ucs.v1.model.RetryClusterActivationRequest;
import com.huaweicloud.sdk.ucs.v1.model.RetryClusterActivationResponse;
import com.huaweicloud.sdk.ucs.v1.model.ShowAddonInstanceRequest;
import com.huaweicloud.sdk.ucs.v1.model.ShowAddonInstanceResponse;
import com.huaweicloud.sdk.ucs.v1.model.ShowClusterAccessInfoRequest;
import com.huaweicloud.sdk.ucs.v1.model.ShowClusterAccessInfoResponse;
import com.huaweicloud.sdk.ucs.v1.model.ShowClusterGroupRequest;
import com.huaweicloud.sdk.ucs.v1.model.ShowClusterGroupResponse;
import com.huaweicloud.sdk.ucs.v1.model.ShowClusterListRequest;
import com.huaweicloud.sdk.ucs.v1.model.ShowClusterListResponse;
import com.huaweicloud.sdk.ucs.v1.model.ShowClusterRequest;
import com.huaweicloud.sdk.ucs.v1.model.ShowClusterResponse;
import com.huaweicloud.sdk.ucs.v1.model.ShowConfigSetRequest;
import com.huaweicloud.sdk.ucs.v1.model.ShowConfigSetResponse;
import com.huaweicloud.sdk.ucs.v1.model.ShowFederationProgressRequest;
import com.huaweicloud.sdk.ucs.v1.model.ShowFederationProgressResponse;
import com.huaweicloud.sdk.ucs.v1.model.ShowGitOpsStatusRequest;
import com.huaweicloud.sdk.ucs.v1.model.ShowGitOpsStatusResponse;
import com.huaweicloud.sdk.ucs.v1.model.ShowGitopsStatisticsRequest;
import com.huaweicloud.sdk.ucs.v1.model.ShowGitopsStatisticsResponse;
import com.huaweicloud.sdk.ucs.v1.model.ShowPolicyDefinitionRequest;
import com.huaweicloud.sdk.ucs.v1.model.ShowPolicyDefinitionResponse;
import com.huaweicloud.sdk.ucs.v1.model.ShowPolicyInstanceRequest;
import com.huaweicloud.sdk.ucs.v1.model.ShowPolicyInstanceResponse;
import com.huaweicloud.sdk.ucs.v1.model.ShowPolicyJobRequest;
import com.huaweicloud.sdk.ucs.v1.model.ShowPolicyJobResponse;
import com.huaweicloud.sdk.ucs.v1.model.ShowProxyUnitedWorkloadRequest;
import com.huaweicloud.sdk.ucs.v1.model.ShowProxyUnitedWorkloadResponse;
import com.huaweicloud.sdk.ucs.v1.model.ShowQuotaRequest;
import com.huaweicloud.sdk.ucs.v1.model.ShowQuotaResponse;
import com.huaweicloud.sdk.ucs.v1.model.UCSConstraintRequest;
import com.huaweicloud.sdk.ucs.v1.model.UCSConstraintTemplateTagRequest;
import com.huaweicloud.sdk.ucs.v1.model.UpdateAddonInstanceRequest;
import com.huaweicloud.sdk.ucs.v1.model.UpdateAddonInstanceResponse;
import com.huaweicloud.sdk.ucs.v1.model.UpdateAssociatedRulesRequest;
import com.huaweicloud.sdk.ucs.v1.model.UpdateAssociatedZonesRequest;
import com.huaweicloud.sdk.ucs.v1.model.UpdateClusterGroupAssociatedClustersRequest;
import com.huaweicloud.sdk.ucs.v1.model.UpdateClusterGroupAssociatedClustersRequestBody;
import com.huaweicloud.sdk.ucs.v1.model.UpdateClusterGroupAssociatedClustersResponse;
import com.huaweicloud.sdk.ucs.v1.model.UpdateClusterGroupAssociatedRulesRequest;
import com.huaweicloud.sdk.ucs.v1.model.UpdateClusterGroupAssociatedRulesResponse;
import com.huaweicloud.sdk.ucs.v1.model.UpdateClusterGroupAssociatedZonesRequest;
import com.huaweicloud.sdk.ucs.v1.model.UpdateClusterGroupAssociatedZonesResponse;
import com.huaweicloud.sdk.ucs.v1.model.UpdateClusterGroupDescriptionRequest;
import com.huaweicloud.sdk.ucs.v1.model.UpdateClusterGroupRequest;
import com.huaweicloud.sdk.ucs.v1.model.UpdateClusterGroupResponse;
import com.huaweicloud.sdk.ucs.v1.model.UpdateClusterRequest;
import com.huaweicloud.sdk.ucs.v1.model.UpdateClusterRequestBody;
import com.huaweicloud.sdk.ucs.v1.model.UpdateClusterResponse;
import com.huaweicloud.sdk.ucs.v1.model.UpdateClusterRulesRequest;
import com.huaweicloud.sdk.ucs.v1.model.UpdateClusterRulesResponse;
import com.huaweicloud.sdk.ucs.v1.model.UpdateConfigSetRequest;
import com.huaweicloud.sdk.ucs.v1.model.UpdateConfigSetRequestBody;
import com.huaweicloud.sdk.ucs.v1.model.UpdateConfigSetResponse;
import com.huaweicloud.sdk.ucs.v1.model.UpdatePolicyDefinationRequest;
import com.huaweicloud.sdk.ucs.v1.model.UpdatePolicyDefinationResponse;
import com.huaweicloud.sdk.ucs.v1.model.UpdatePolicyInstanceRequest;
import com.huaweicloud.sdk.ucs.v1.model.UpdatePolicyInstanceResponse;
import com.huaweicloud.sdk.ucs.v1.model.UpdateProxyUnitedWorkloadRequest;
import com.huaweicloud.sdk.ucs.v1.model.UpdateProxyUnitedWorkloadResponse;
import com.huaweicloud.sdk.ucs.v1.model.UpdateRepoRequest;
import com.huaweicloud.sdk.ucs.v1.model.UpdateRepoRequestBody;
import com.huaweicloud.sdk.ucs.v1.model.UpdateRepoResponse;
import com.huaweicloud.sdk.ucs.v1.model.UpdateRuleRequest;
import com.huaweicloud.sdk.ucs.v1.model.UpdateRuleRequestBody;
import com.huaweicloud.sdk.ucs.v1.model.UpdateRuleResponse;
import com.huaweicloud.sdk.ucs.v1.model.UpgradeFederationRequest;
import com.huaweicloud.sdk.ucs.v1.model.UpgradeFederationRequestBody;
import com.huaweicloud.sdk.ucs.v1.model.UpgradeFederationResponse;

import java.util.List;
import java.util.Map;

@SuppressWarnings("unchecked")
public class UcsMeta {

    public static final HttpRequestDef<CreateAddonInstanceRequest, CreateAddonInstanceResponse> createAddonInstance =
        genForCreateAddonInstance();

    private static HttpRequestDef<CreateAddonInstanceRequest, CreateAddonInstanceResponse> genForCreateAddonInstance() {
        // basic
        HttpRequestDef.Builder<CreateAddonInstanceRequest, CreateAddonInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAddonInstanceRequest.class, CreateAddonInstanceResponse.class)
                .withName("CreateAddonInstance")
                .withUri("/v1/addons")
                .withContentType("application/json");

        // requests
        builder.<AddonInstance>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AddonInstance.class),
            f -> f.withMarshaller(CreateAddonInstanceRequest::getBody, CreateAddonInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateClusterGroupPolicyInstanceRequest, CreateClusterGroupPolicyInstanceResponse> createClusterGroupPolicyInstance =
        genForCreateClusterGroupPolicyInstance();

    private static HttpRequestDef<CreateClusterGroupPolicyInstanceRequest, CreateClusterGroupPolicyInstanceResponse> genForCreateClusterGroupPolicyInstance() {
        // basic
        HttpRequestDef.Builder<CreateClusterGroupPolicyInstanceRequest, CreateClusterGroupPolicyInstanceResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateClusterGroupPolicyInstanceRequest.class,
                    CreateClusterGroupPolicyInstanceResponse.class)
                .withName("CreateClusterGroupPolicyInstance")
                .withUri("/v1/clustergroups/{clustergroupid}/policyinstance")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("clustergroupid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateClusterGroupPolicyInstanceRequest::getClustergroupid,
                CreateClusterGroupPolicyInstanceRequest::setClustergroupid));
        builder.<UCSConstraintRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UCSConstraintRequest.class),
            f -> f.withMarshaller(CreateClusterGroupPolicyInstanceRequest::getBody,
                CreateClusterGroupPolicyInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateConfigSetRequest, CreateConfigSetResponse> createConfigSet =
        genForCreateConfigSet();

    private static HttpRequestDef<CreateConfigSetRequest, CreateConfigSetResponse> genForCreateConfigSet() {
        // basic
        HttpRequestDef.Builder<CreateConfigSetRequest, CreateConfigSetResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateConfigSetRequest.class, CreateConfigSetResponse.class)
                .withName("CreateConfigSet")
                .withUri("/v1/configsets")
                .withContentType("application/json");

        // requests
        builder.<CreateConfigSetRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateConfigSetRequestBody.class),
            f -> f.withMarshaller(CreateConfigSetRequest::getBody, CreateConfigSetRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateFederationCertRequest, CreateFederationCertResponse> createFederationCert =
        genForCreateFederationCert();

    private static HttpRequestDef<CreateFederationCertRequest, CreateFederationCertResponse> genForCreateFederationCert() {
        // basic
        HttpRequestDef.Builder<CreateFederationCertRequest, CreateFederationCertResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateFederationCertRequest.class, CreateFederationCertResponse.class)
            .withName("CreateFederationCert")
            .withUri("/v1/clustergroups/{clustergroupid}/cert")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("clustergroupid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateFederationCertRequest::getClustergroupid,
                CreateFederationCertRequest::setClustergroupid));
        builder.<CreateFederationCertRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateFederationCertRequestBody.class),
            f -> f.withMarshaller(CreateFederationCertRequest::getBody, CreateFederationCertRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateFederationConnectionRequest, CreateFederationConnectionResponse> createFederationConnection =
        genForCreateFederationConnection();

    private static HttpRequestDef<CreateFederationConnectionRequest, CreateFederationConnectionResponse> genForCreateFederationConnection() {
        // basic
        HttpRequestDef.Builder<CreateFederationConnectionRequest, CreateFederationConnectionResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateFederationConnectionRequest.class,
                    CreateFederationConnectionResponse.class)
                .withName("CreateFederationConnection")
                .withUri("/v1/clustergroups/{clustergroupid}/connection")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("clustergroupid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateFederationConnectionRequest::getClustergroupid,
                CreateFederationConnectionRequest::setClustergroupid));
        builder.<CreateFederationConnectionRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateFederationConnectionRequestBody.class),
            f -> f.withMarshaller(CreateFederationConnectionRequest::getBody,
                CreateFederationConnectionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateProxyUnitedWorkloadRequest, CreateProxyUnitedWorkloadResponse> createProxyUnitedWorkload =
        genForCreateProxyUnitedWorkload();

    private static HttpRequestDef<CreateProxyUnitedWorkloadRequest, CreateProxyUnitedWorkloadResponse> genForCreateProxyUnitedWorkload() {
        // basic
        HttpRequestDef.Builder<CreateProxyUnitedWorkloadRequest, CreateProxyUnitedWorkloadResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateProxyUnitedWorkloadRequest.class,
                    CreateProxyUnitedWorkloadResponse.class)
                .withName("CreateProxyUnitedWorkload")
                .withUri("/v1/clustergroups/{clustergroupid}/unitedworkload")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("clustergroupid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateProxyUnitedWorkloadRequest::getClustergroupid,
                CreateProxyUnitedWorkloadRequest::setClustergroupid));
        builder.<MutiWorkload>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(MutiWorkload.class),
            f -> f.withMarshaller(CreateProxyUnitedWorkloadRequest::getBody,
                CreateProxyUnitedWorkloadRequest::setBody));

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
                .withUri("/v1/traffic/recordsets")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Zone-Project-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRecordSetRequest::getXZoneProjectID,
                CreateRecordSetRequest::setXZoneProjectID));
        builder.<String>withRequestField("X-Zone-ID",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRecordSetRequest::getXZoneID, CreateRecordSetRequest::setXZoneID));
        builder.<List<CreateRecordSetRequestBody>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CreateRecordSetRequest::getBody, CreateRecordSetRequest::setBody)
                .withInnerContainerType(CreateRecordSetRequestBody.class));

        // response
        builder.<List<RecordSet>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(CreateRecordSetResponse::getBody, CreateRecordSetResponse::setBody)
                .withInnerContainerType(RecordSet.class));

        return builder.build();
    }

    public static final HttpRequestDef<CreateRepoRequest, CreateRepoResponse> createRepo = genForCreateRepo();

    private static HttpRequestDef<CreateRepoRequest, CreateRepoResponse> genForCreateRepo() {
        // basic
        HttpRequestDef.Builder<CreateRepoRequest, CreateRepoResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRepoRequest.class, CreateRepoResponse.class)
                .withName("CreateRepo")
                .withUri("/v1/configsets/repos")
                .withContentType("application/json");

        // requests
        builder.<CreateRepoRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateRepoRequestBody.class),
            f -> f.withMarshaller(CreateRepoRequest::getBody, CreateRepoRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRuleRequest, CreateRuleResponse> createRule = genForCreateRule();

    private static HttpRequestDef<CreateRuleRequest, CreateRuleResponse> genForCreateRule() {
        // basic
        HttpRequestDef.Builder<CreateRuleRequest, CreateRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateRuleRequest.class, CreateRuleResponse.class)
                .withName("CreateRule")
                .withUri("/v1/permissions/rules")
                .withContentType("application/x-www-form-urlencoded");

        // requests
        builder.<CreateRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateRuleRequestBody.class),
            f -> f.withMarshaller(CreateRuleRequest::getBody, CreateRuleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAddonInstanceRequest, DeleteAddonInstanceResponse> deleteAddonInstance =
        genForDeleteAddonInstance();

    private static HttpRequestDef<DeleteAddonInstanceRequest, DeleteAddonInstanceResponse> genForDeleteAddonInstance() {
        // basic
        HttpRequestDef.Builder<DeleteAddonInstanceRequest, DeleteAddonInstanceResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteAddonInstanceRequest.class, DeleteAddonInstanceResponse.class)
            .withName("DeleteAddonInstance")
            .withUri("/v1/addons/{id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAddonInstanceRequest::getId, DeleteAddonInstanceRequest::setId));
        builder.<String>withRequestField("cluster_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAddonInstanceRequest::getClusterId, DeleteAddonInstanceRequest::setClusterId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteAddonInstanceResponse::getBody, DeleteAddonInstanceResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteClusterGroupRequest, DeleteClusterGroupResponse> deleteClusterGroup =
        genForDeleteClusterGroup();

    private static HttpRequestDef<DeleteClusterGroupRequest, DeleteClusterGroupResponse> genForDeleteClusterGroup() {
        // basic
        HttpRequestDef.Builder<DeleteClusterGroupRequest, DeleteClusterGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteClusterGroupRequest.class, DeleteClusterGroupResponse.class)
                .withName("DeleteClusterGroup")
                .withUri("/v1/clustergroups/{clustergroupid}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("clustergroupid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteClusterGroupRequest::getClustergroupid,
                DeleteClusterGroupRequest::setClustergroupid));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteClusterGroupResponse::getBody, DeleteClusterGroupResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteConfigSetRequest, DeleteConfigSetResponse> deleteConfigSet =
        genForDeleteConfigSet();

    private static HttpRequestDef<DeleteConfigSetRequest, DeleteConfigSetResponse> genForDeleteConfigSet() {
        // basic
        HttpRequestDef.Builder<DeleteConfigSetRequest, DeleteConfigSetResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteConfigSetRequest.class, DeleteConfigSetResponse.class)
                .withName("DeleteConfigSet")
                .withUri("/v1/configsets/{configsetid}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("configsetid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteConfigSetRequest::getConfigsetid, DeleteConfigSetRequest::setConfigsetid));

        // response
        builder.<Object>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            Object.class,
            f -> f.withMarshaller(DeleteConfigSetResponse::getBody, DeleteConfigSetResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<DeletePolicyInstanceRequest, DeletePolicyInstanceResponse> deletePolicyInstance =
        genForDeletePolicyInstance();

    private static HttpRequestDef<DeletePolicyInstanceRequest, DeletePolicyInstanceResponse> genForDeletePolicyInstance() {
        // basic
        HttpRequestDef.Builder<DeletePolicyInstanceRequest, DeletePolicyInstanceResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeletePolicyInstanceRequest.class, DeletePolicyInstanceResponse.class)
            .withName("DeletePolicyInstance")
            .withUri("/v1/policyinstances/{policyinstanceid}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policyinstanceid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePolicyInstanceRequest::getPolicyinstanceid,
                DeletePolicyInstanceRequest::setPolicyinstanceid));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteProxyUnitedWorkloadRequest, DeleteProxyUnitedWorkloadResponse> deleteProxyUnitedWorkload =
        genForDeleteProxyUnitedWorkload();

    private static HttpRequestDef<DeleteProxyUnitedWorkloadRequest, DeleteProxyUnitedWorkloadResponse> genForDeleteProxyUnitedWorkload() {
        // basic
        HttpRequestDef.Builder<DeleteProxyUnitedWorkloadRequest, DeleteProxyUnitedWorkloadResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteProxyUnitedWorkloadRequest.class,
                    DeleteProxyUnitedWorkloadResponse.class)
                .withName("DeleteProxyUnitedWorkload")
                .withUri("/v1/clustergroups/{clustergroupid}/unitedworkload")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("clustergroupid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteProxyUnitedWorkloadRequest::getClustergroupid,
                DeleteProxyUnitedWorkloadRequest::setClustergroupid));
        builder.<String>withRequestField("kind",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteProxyUnitedWorkloadRequest::getKind,
                DeleteProxyUnitedWorkloadRequest::setKind));
        builder.<String>withRequestField("namespace",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteProxyUnitedWorkloadRequest::getNamespace,
                DeleteProxyUnitedWorkloadRequest::setNamespace));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteProxyUnitedWorkloadRequest::getName,
                DeleteProxyUnitedWorkloadRequest::setName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRepoRequest, DeleteRepoResponse> deleteRepo = genForDeleteRepo();

    private static HttpRequestDef<DeleteRepoRequest, DeleteRepoResponse> genForDeleteRepo() {
        // basic
        HttpRequestDef.Builder<DeleteRepoRequest, DeleteRepoResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteRepoRequest.class, DeleteRepoResponse.class)
                .withName("DeleteRepo")
                .withUri("/v1/configsets/repos/{repoid}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("repoid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRepoRequest::getRepoid, DeleteRepoRequest::setRepoid));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteRepoResponse::getBody, DeleteRepoResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRuleRequest, DeleteRuleResponse> deleteRule = genForDeleteRule();

    private static HttpRequestDef<DeleteRuleRequest, DeleteRuleResponse> genForDeleteRule() {
        // basic
        HttpRequestDef.Builder<DeleteRuleRequest, DeleteRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteRuleRequest.class, DeleteRuleResponse.class)
                .withName("DeleteRule")
                .withUri("/v1/permissions/rules/{ruleid}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ruleid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRuleRequest::getRuleid, DeleteRuleRequest::setRuleid));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteRuleResponse::getBody, DeleteRuleResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<DisableClustergroupPolicyRequest, DisableClustergroupPolicyResponse> disableClustergroupPolicy =
        genForDisableClustergroupPolicy();

    private static HttpRequestDef<DisableClustergroupPolicyRequest, DisableClustergroupPolicyResponse> genForDisableClustergroupPolicy() {
        // basic
        HttpRequestDef.Builder<DisableClustergroupPolicyRequest, DisableClustergroupPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DisableClustergroupPolicyRequest.class,
                    DisableClustergroupPolicyResponse.class)
                .withName("DisableClustergroupPolicy")
                .withUri("/v1/clustergroups/{clustergroupid}/policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("clustergroupid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisableClustergroupPolicyRequest::getClustergroupid,
                DisableClustergroupPolicyRequest::setClustergroupid));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisableFederationRequest, DisableFederationResponse> disableFederation =
        genForDisableFederation();

    private static HttpRequestDef<DisableFederationRequest, DisableFederationResponse> genForDisableFederation() {
        // basic
        HttpRequestDef.Builder<DisableFederationRequest, DisableFederationResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DisableFederationRequest.class, DisableFederationResponse.class)
                .withName("DisableFederation")
                .withUri("/v1/clustergroups/{clustergroupid}/federations")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("clustergroupid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisableFederationRequest::getClustergroupid,
                DisableFederationRequest::setClustergroupid));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DisableFederationResponse::getBody, DisableFederationResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<DownloadFederationKubeconfigRequest, DownloadFederationKubeconfigResponse> downloadFederationKubeconfig =
        genForDownloadFederationKubeconfig();

    private static HttpRequestDef<DownloadFederationKubeconfigRequest, DownloadFederationKubeconfigResponse> genForDownloadFederationKubeconfig() {
        // basic
        HttpRequestDef.Builder<DownloadFederationKubeconfigRequest, DownloadFederationKubeconfigResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    DownloadFederationKubeconfigRequest.class,
                    DownloadFederationKubeconfigResponse.class)
                .withName("DownloadFederationKubeconfig")
                .withUri("/v1/clustergroups/{clustergroupid}/kubeconfig")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("clustergroupid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DownloadFederationKubeconfigRequest::getClustergroupid,
                DownloadFederationKubeconfigRequest::setClustergroupid));
        builder.<DownloadFederationKubeconfigRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DownloadFederationKubeconfigRequestBody.class),
            f -> f.withMarshaller(DownloadFederationKubeconfigRequest::getBody,
                DownloadFederationKubeconfigRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EnableClustergroupPolicyRequest, EnableClustergroupPolicyResponse> enableClustergroupPolicy =
        genForEnableClustergroupPolicy();

    private static HttpRequestDef<EnableClustergroupPolicyRequest, EnableClustergroupPolicyResponse> genForEnableClustergroupPolicy() {
        // basic
        HttpRequestDef.Builder<EnableClustergroupPolicyRequest, EnableClustergroupPolicyResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, EnableClustergroupPolicyRequest.class, EnableClustergroupPolicyResponse.class)
                .withName("EnableClustergroupPolicy")
                .withUri("/v1/clustergroups/{clustergroupid}/policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("clustergroupid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EnableClustergroupPolicyRequest::getClustergroupid,
                EnableClustergroupPolicyRequest::setClustergroupid));
        builder.<String>withRequestField("retry",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EnableClustergroupPolicyRequest::getRetry,
                EnableClustergroupPolicyRequest::setRetry));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EnableFederationRequest, EnableFederationResponse> enableFederation =
        genForEnableFederation();

    private static HttpRequestDef<EnableFederationRequest, EnableFederationResponse> genForEnableFederation() {
        // basic
        HttpRequestDef.Builder<EnableFederationRequest, EnableFederationResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, EnableFederationRequest.class, EnableFederationResponse.class)
                .withName("EnableFederation")
                .withUri("/v1/clustergroups/{clustergroupid}/federations")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("clustergroupid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EnableFederationRequest::getClustergroupid,
                EnableFederationRequest::setClustergroupid));
        builder.<Boolean>withRequestField("retryjoinall",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(EnableFederationRequest::getRetryjoinall, EnableFederationRequest::setRetryjoinall));

        // response
        builder.<Object>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            Object.class,
            f -> f.withMarshaller(EnableFederationResponse::getBody, EnableFederationResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<JoinGroupRequest, JoinGroupResponse> joinGroup = genForJoinGroup();

    private static HttpRequestDef<JoinGroupRequest, JoinGroupResponse> genForJoinGroup() {
        // basic
        HttpRequestDef.Builder<JoinGroupRequest, JoinGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, JoinGroupRequest.class, JoinGroupResponse.class)
                .withName("JoinGroup")
                .withUri("/v1/clusters/{clusterid}/join")
                .withContentType("application/x-www-form-urlencoded");

        // requests
        builder.<String>withRequestField("clusterid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(JoinGroupRequest::getClusterid, JoinGroupRequest::setClusterid));
        builder.<ClusterJoinGroupRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ClusterJoinGroupRequestBody.class),
            f -> f.withMarshaller(JoinGroupRequest::getBody, JoinGroupRequest::setBody));

        // response
        builder.<Object>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            Object.class,
            f -> f.withMarshaller(JoinGroupResponse::getBody, JoinGroupResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<LeaveGroupRequest, LeaveGroupResponse> leaveGroup = genForLeaveGroup();

    private static HttpRequestDef<LeaveGroupRequest, LeaveGroupResponse> genForLeaveGroup() {
        // basic
        HttpRequestDef.Builder<LeaveGroupRequest, LeaveGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, LeaveGroupRequest.class, LeaveGroupResponse.class)
                .withName("LeaveGroup")
                .withUri("/v1/clusters/{clusterid}/unjoin")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("clusterid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(LeaveGroupRequest::getClusterid, LeaveGroupRequest::setClusterid));

        // response
        builder.<Object>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            Object.class,
            f -> f.withMarshaller(LeaveGroupResponse::getBody, LeaveGroupResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ListAddonInstancesRequest, ListAddonInstancesResponse> listAddonInstances =
        genForListAddonInstances();

    private static HttpRequestDef<ListAddonInstancesRequest, ListAddonInstancesResponse> genForListAddonInstances() {
        // basic
        HttpRequestDef.Builder<ListAddonInstancesRequest, ListAddonInstancesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAddonInstancesRequest.class, ListAddonInstancesResponse.class)
                .withName("ListAddonInstances")
                .withUri("/v1/addons")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("cluster_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAddonInstancesRequest::getClusterId, ListAddonInstancesRequest::setClusterId));
        builder.<String>withRequestField("addon_template_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAddonInstancesRequest::getAddonTemplateName,
                ListAddonInstancesRequest::setAddonTemplateName));
        builder.<String>withRequestField("is_database_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAddonInstancesRequest::getIsDatabaseStatus,
                ListAddonInstancesRequest::setIsDatabaseStatus));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAddonTemplatesRequest, ListAddonTemplatesResponse> listAddonTemplates =
        genForListAddonTemplates();

    private static HttpRequestDef<ListAddonTemplatesRequest, ListAddonTemplatesResponse> genForListAddonTemplates() {
        // basic
        HttpRequestDef.Builder<ListAddonTemplatesRequest, ListAddonTemplatesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAddonTemplatesRequest.class, ListAddonTemplatesResponse.class)
                .withName("ListAddonTemplates")
                .withUri("/v1/addontemplates")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAddonTemplatesRequest::getVersion, ListAddonTemplatesRequest::setVersion));
        builder.<String>withRequestField("newest",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAddonTemplatesRequest::getNewest, ListAddonTemplatesRequest::setNewest));
        builder.<String>withRequestField("cluster_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAddonTemplatesRequest::getClusterId, ListAddonTemplatesRequest::setClusterId));
        builder.<String>withRequestField("addon_template_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAddonTemplatesRequest::getAddonTemplateName,
                ListAddonTemplatesRequest::setAddonTemplateName));
        builder.<String>withRequestField("base_update_addon_version",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAddonTemplatesRequest::getBaseUpdateAddonVersion,
                ListAddonTemplatesRequest::setBaseUpdateAddonVersion));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListClusterGroupRequest, ListClusterGroupResponse> listClusterGroup =
        genForListClusterGroup();

    private static HttpRequestDef<ListClusterGroupRequest, ListClusterGroupResponse> genForListClusterGroup() {
        // basic
        HttpRequestDef.Builder<ListClusterGroupRequest, ListClusterGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListClusterGroupRequest.class, ListClusterGroupResponse.class)
                .withName("ListClusterGroup")
                .withUri("/v1/clustergroups")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListClusterGroupRequest::getLimit, ListClusterGroupRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListClusterGroupRequest::getOffset, ListClusterGroupRequest::setOffset));
        builder.<String>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterGroupRequest::getOrderBy, ListClusterGroupRequest::setOrderBy));
        builder.<String>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListClusterGroupRequest::getOrder, ListClusterGroupRequest::setOrder));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListConfigSetsRequest, ListConfigSetsResponse> listConfigSets =
        genForListConfigSets();

    private static HttpRequestDef<ListConfigSetsRequest, ListConfigSetsResponse> genForListConfigSets() {
        // basic
        HttpRequestDef.Builder<ListConfigSetsRequest, ListConfigSetsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListConfigSetsRequest.class, ListConfigSetsResponse.class)
                .withName("ListConfigSets")
                .withUri("/v1/configsets")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("clusterid",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConfigSetsRequest::getClusterid, ListConfigSetsRequest::setClusterid));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConfigSetsRequest::getLimit, ListConfigSetsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListConfigSetsRequest::getOffset, ListConfigSetsRequest::setOffset));
        builder.<String>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConfigSetsRequest::getOrderBy, ListConfigSetsRequest::setOrderBy));
        builder.<String>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConfigSetsRequest::getOrder, ListConfigSetsRequest::setOrder));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPolicyDefinitionsRequest, ListPolicyDefinitionsResponse> listPolicyDefinitions =
        genForListPolicyDefinitions();

    private static HttpRequestDef<ListPolicyDefinitionsRequest, ListPolicyDefinitionsResponse> genForListPolicyDefinitions() {
        // basic
        HttpRequestDef.Builder<ListPolicyDefinitionsRequest, ListPolicyDefinitionsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListPolicyDefinitionsRequest.class, ListPolicyDefinitionsResponse.class)
            .withName("ListPolicyDefinitions")
            .withUri("/v1/policydefinitions")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPolicyInstancesRequest, ListPolicyInstancesResponse> listPolicyInstances =
        genForListPolicyInstances();

    private static HttpRequestDef<ListPolicyInstancesRequest, ListPolicyInstancesResponse> genForListPolicyInstances() {
        // basic
        HttpRequestDef.Builder<ListPolicyInstancesRequest, ListPolicyInstancesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPolicyInstancesRequest.class, ListPolicyInstancesResponse.class)
                .withName("ListPolicyInstances")
                .withUri("/v1/policyinstances")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPolicyJobsRequest, ListPolicyJobsResponse> listPolicyJobs =
        genForListPolicyJobs();

    private static HttpRequestDef<ListPolicyJobsRequest, ListPolicyJobsResponse> genForListPolicyJobs() {
        // basic
        HttpRequestDef.Builder<ListPolicyJobsRequest, ListPolicyJobsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPolicyJobsRequest.class, ListPolicyJobsResponse.class)
                .withName("ListPolicyJobs")
                .withUri("/v1/policy/jobs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("kind",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPolicyJobsRequest::getKind, ListPolicyJobsRequest::setKind));

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
                .withUri("/v1/traffic/recordsets")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListReposRequest, ListReposResponse> listRepos = genForListRepos();

    private static HttpRequestDef<ListReposRequest, ListReposResponse> genForListRepos() {
        // basic
        HttpRequestDef.Builder<ListReposRequest, ListReposResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListReposRequest.class, ListReposResponse.class)
                .withName("ListRepos")
                .withUri("/v1/configsets/repos")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("clusterid",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListReposRequest::getClusterid, ListReposRequest::setClusterid));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListReposRequest::getLimit, ListReposRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListReposRequest::getOffset, ListReposRequest::setOffset));
        builder.<String>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListReposRequest::getOrderBy, ListReposRequest::setOrderBy));
        builder.<String>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListReposRequest::getOrder, ListReposRequest::setOrder));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRuleRequest, ListRuleResponse> listRule = genForListRule();

    private static HttpRequestDef<ListRuleRequest, ListRuleResponse> genForListRule() {
        // basic
        HttpRequestDef.Builder<ListRuleRequest, ListRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRuleRequest.class, ListRuleResponse.class)
                .withName("ListRule")
                .withUri("/v1/permissions/rules")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRuleRequest::getLimit, ListRuleRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRuleRequest::getOffset, ListRuleRequest::setOffset));
        builder.<String>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRuleRequest::getOrderBy, ListRuleRequest::setOrderBy));
        builder.<String>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRuleRequest::getOrder, ListRuleRequest::setOrder));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListServerConfigsRequest, ListServerConfigsResponse> listServerConfigs =
        genForListServerConfigs();

    private static HttpRequestDef<ListServerConfigsRequest, ListServerConfigsResponse> genForListServerConfigs() {
        // basic
        HttpRequestDef.Builder<ListServerConfigsRequest, ListServerConfigsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListServerConfigsRequest.class, ListServerConfigsResponse.class)
                .withName("ListServerConfigs")
                .withUri("/v1/serverconfig")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RegisterClusterGroupRequest, RegisterClusterGroupResponse> registerClusterGroup =
        genForRegisterClusterGroup();

    private static HttpRequestDef<RegisterClusterGroupRequest, RegisterClusterGroupResponse> genForRegisterClusterGroup() {
        // basic
        HttpRequestDef.Builder<RegisterClusterGroupRequest, RegisterClusterGroupResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, RegisterClusterGroupRequest.class, RegisterClusterGroupResponse.class)
            .withName("RegisterClusterGroup")
            .withUri("/v1/clustergroups")
            .withContentType("application/x-www-form-urlencoded");

        // requests
        builder.<RegisterClusterGroup>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RegisterClusterGroup.class),
            f -> f.withMarshaller(RegisterClusterGroupRequest::getBody, RegisterClusterGroupRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAddonInstanceRequest, ShowAddonInstanceResponse> showAddonInstance =
        genForShowAddonInstance();

    private static HttpRequestDef<ShowAddonInstanceRequest, ShowAddonInstanceResponse> genForShowAddonInstance() {
        // basic
        HttpRequestDef.Builder<ShowAddonInstanceRequest, ShowAddonInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAddonInstanceRequest.class, ShowAddonInstanceResponse.class)
                .withName("ShowAddonInstance")
                .withUri("/v1/addons/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAddonInstanceRequest::getId, ShowAddonInstanceRequest::setId));
        builder.<String>withRequestField("is_database_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAddonInstanceRequest::getIsDatabaseStatus,
                ShowAddonInstanceRequest::setIsDatabaseStatus));
        builder.<String>withRequestField("cluster_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAddonInstanceRequest::getClusterId, ShowAddonInstanceRequest::setClusterId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowClusterGroupRequest, ShowClusterGroupResponse> showClusterGroup =
        genForShowClusterGroup();

    private static HttpRequestDef<ShowClusterGroupRequest, ShowClusterGroupResponse> genForShowClusterGroup() {
        // basic
        HttpRequestDef.Builder<ShowClusterGroupRequest, ShowClusterGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowClusterGroupRequest.class, ShowClusterGroupResponse.class)
                .withName("ShowClusterGroup")
                .withUri("/v1/clustergroups/{clustergroupid}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("clustergroupid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowClusterGroupRequest::getClustergroupid,
                ShowClusterGroupRequest::setClustergroupid));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowConfigSetRequest, ShowConfigSetResponse> showConfigSet =
        genForShowConfigSet();

    private static HttpRequestDef<ShowConfigSetRequest, ShowConfigSetResponse> genForShowConfigSet() {
        // basic
        HttpRequestDef.Builder<ShowConfigSetRequest, ShowConfigSetResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowConfigSetRequest.class, ShowConfigSetResponse.class)
                .withName("ShowConfigSet")
                .withUri("/v1/configsets/{configsetid}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("configsetid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowConfigSetRequest::getConfigsetid, ShowConfigSetRequest::setConfigsetid));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowFederationProgressRequest, ShowFederationProgressResponse> showFederationProgress =
        genForShowFederationProgress();

    private static HttpRequestDef<ShowFederationProgressRequest, ShowFederationProgressResponse> genForShowFederationProgress() {
        // basic
        HttpRequestDef.Builder<ShowFederationProgressRequest, ShowFederationProgressResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowFederationProgressRequest.class, ShowFederationProgressResponse.class)
            .withName("ShowFederationProgress")
            .withUri("/v1/clustergroups/{clustergroupid}/federations/progress")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("clustergroupid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowFederationProgressRequest::getClustergroupid,
                ShowFederationProgressRequest::setClustergroupid));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGitopsStatisticsRequest, ShowGitopsStatisticsResponse> showGitopsStatistics =
        genForShowGitopsStatistics();

    private static HttpRequestDef<ShowGitopsStatisticsRequest, ShowGitopsStatisticsResponse> genForShowGitopsStatistics() {
        // basic
        HttpRequestDef.Builder<ShowGitopsStatisticsRequest, ShowGitopsStatisticsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowGitopsStatisticsRequest.class, ShowGitopsStatisticsResponse.class)
            .withName("ShowGitopsStatistics")
            .withUri("/v1/configsets/statistics")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowGitopsStatisticsRequest::getLimit, ShowGitopsStatisticsRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowGitopsStatisticsRequest::getOffset, ShowGitopsStatisticsRequest::setOffset));
        builder.<String>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGitopsStatisticsRequest::getOrderBy, ShowGitopsStatisticsRequest::setOrderBy));
        builder.<String>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGitopsStatisticsRequest::getOrder, ShowGitopsStatisticsRequest::setOrder));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPolicyDefinitionRequest, ShowPolicyDefinitionResponse> showPolicyDefinition =
        genForShowPolicyDefinition();

    private static HttpRequestDef<ShowPolicyDefinitionRequest, ShowPolicyDefinitionResponse> genForShowPolicyDefinition() {
        // basic
        HttpRequestDef.Builder<ShowPolicyDefinitionRequest, ShowPolicyDefinitionResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowPolicyDefinitionRequest.class, ShowPolicyDefinitionResponse.class)
            .withName("ShowPolicyDefinition")
            .withUri("/v1/policydefinitions/{policydefinitionid}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policydefinitionid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPolicyDefinitionRequest::getPolicydefinitionid,
                ShowPolicyDefinitionRequest::setPolicydefinitionid));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPolicyInstanceRequest, ShowPolicyInstanceResponse> showPolicyInstance =
        genForShowPolicyInstance();

    private static HttpRequestDef<ShowPolicyInstanceRequest, ShowPolicyInstanceResponse> genForShowPolicyInstance() {
        // basic
        HttpRequestDef.Builder<ShowPolicyInstanceRequest, ShowPolicyInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPolicyInstanceRequest.class, ShowPolicyInstanceResponse.class)
                .withName("ShowPolicyInstance")
                .withUri("/v1/policyinstances/{policyinstanceid}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policyinstanceid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPolicyInstanceRequest::getPolicyinstanceid,
                ShowPolicyInstanceRequest::setPolicyinstanceid));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPolicyJobRequest, ShowPolicyJobResponse> showPolicyJob =
        genForShowPolicyJob();

    private static HttpRequestDef<ShowPolicyJobRequest, ShowPolicyJobResponse> genForShowPolicyJob() {
        // basic
        HttpRequestDef.Builder<ShowPolicyJobRequest, ShowPolicyJobResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPolicyJobRequest.class, ShowPolicyJobResponse.class)
                .withName("ShowPolicyJob")
                .withUri("/v1/policy/jobs/{jobid}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("jobid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPolicyJobRequest::getJobid, ShowPolicyJobRequest::setJobid));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProxyUnitedWorkloadRequest, ShowProxyUnitedWorkloadResponse> showProxyUnitedWorkload =
        genForShowProxyUnitedWorkload();

    private static HttpRequestDef<ShowProxyUnitedWorkloadRequest, ShowProxyUnitedWorkloadResponse> genForShowProxyUnitedWorkload() {
        // basic
        HttpRequestDef.Builder<ShowProxyUnitedWorkloadRequest, ShowProxyUnitedWorkloadResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowProxyUnitedWorkloadRequest.class, ShowProxyUnitedWorkloadResponse.class)
            .withName("ShowProxyUnitedWorkload")
            .withUri("/v1/clustergroups/{clustergroupid}/unitedworkload")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("clustergroupid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProxyUnitedWorkloadRequest::getClustergroupid,
                ShowProxyUnitedWorkloadRequest::setClustergroupid));
        builder.<String>withRequestField("kind",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProxyUnitedWorkloadRequest::getKind, ShowProxyUnitedWorkloadRequest::setKind));
        builder.<String>withRequestField("namespace",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProxyUnitedWorkloadRequest::getNamespace,
                ShowProxyUnitedWorkloadRequest::setNamespace));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProxyUnitedWorkloadRequest::getName, ShowProxyUnitedWorkloadRequest::setName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowQuotaRequest, ShowQuotaResponse> showQuota = genForShowQuota();

    private static HttpRequestDef<ShowQuotaRequest, ShowQuotaResponse> genForShowQuota() {
        // basic
        HttpRequestDef.Builder<ShowQuotaRequest, ShowQuotaResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowQuotaRequest.class, ShowQuotaResponse.class)
                .withName("ShowQuota")
                .withUri("/v1/maintenance/quota/{domainid}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("domainid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowQuotaRequest::getDomainid, ShowQuotaRequest::setDomainid));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAddonInstanceRequest, UpdateAddonInstanceResponse> updateAddonInstance =
        genForUpdateAddonInstance();

    private static HttpRequestDef<UpdateAddonInstanceRequest, UpdateAddonInstanceResponse> genForUpdateAddonInstance() {
        // basic
        HttpRequestDef.Builder<UpdateAddonInstanceRequest, UpdateAddonInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAddonInstanceRequest.class, UpdateAddonInstanceResponse.class)
                .withName("UpdateAddonInstance")
                .withUri("/v1/addons/{id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAddonInstanceRequest::getId, UpdateAddonInstanceRequest::setId));
        builder.<AddonInstance>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddonInstance.class),
            f -> f.withMarshaller(UpdateAddonInstanceRequest::getBody, UpdateAddonInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateClusterGroupRequest, UpdateClusterGroupResponse> updateClusterGroup =
        genForUpdateClusterGroup();

    private static HttpRequestDef<UpdateClusterGroupRequest, UpdateClusterGroupResponse> genForUpdateClusterGroup() {
        // basic
        HttpRequestDef.Builder<UpdateClusterGroupRequest, UpdateClusterGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateClusterGroupRequest.class, UpdateClusterGroupResponse.class)
                .withName("UpdateClusterGroup")
                .withUri("/v1/clustergroups/{clustergroupid}/description")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("clustergroupid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateClusterGroupRequest::getClustergroupid,
                UpdateClusterGroupRequest::setClustergroupid));
        builder.<UpdateClusterGroupDescriptionRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateClusterGroupDescriptionRequest.class),
            f -> f.withMarshaller(UpdateClusterGroupRequest::getBody, UpdateClusterGroupRequest::setBody));

        // response
        builder.<Object>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            Object.class,
            f -> f.withMarshaller(UpdateClusterGroupResponse::getBody, UpdateClusterGroupResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateClusterGroupAssociatedClustersRequest, UpdateClusterGroupAssociatedClustersResponse> updateClusterGroupAssociatedClusters =
        genForUpdateClusterGroupAssociatedClusters();

    private static HttpRequestDef<UpdateClusterGroupAssociatedClustersRequest, UpdateClusterGroupAssociatedClustersResponse> genForUpdateClusterGroupAssociatedClusters() {
        // basic
        HttpRequestDef.Builder<UpdateClusterGroupAssociatedClustersRequest, UpdateClusterGroupAssociatedClustersResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateClusterGroupAssociatedClustersRequest.class,
                    UpdateClusterGroupAssociatedClustersResponse.class)
                .withName("UpdateClusterGroupAssociatedClusters")
                .withUri("/v1/clustergroups/{clustergroupid}/associatedclusters")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("clustergroupid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateClusterGroupAssociatedClustersRequest::getClustergroupid,
                UpdateClusterGroupAssociatedClustersRequest::setClustergroupid));
        builder.<UpdateClusterGroupAssociatedClustersRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateClusterGroupAssociatedClustersRequestBody.class),
            f -> f.withMarshaller(UpdateClusterGroupAssociatedClustersRequest::getBody,
                UpdateClusterGroupAssociatedClustersRequest::setBody));

        // response
        builder.<Object>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            Object.class,
            f -> f.withMarshaller(UpdateClusterGroupAssociatedClustersResponse::getBody,
                UpdateClusterGroupAssociatedClustersResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateClusterGroupAssociatedRulesRequest, UpdateClusterGroupAssociatedRulesResponse> updateClusterGroupAssociatedRules =
        genForUpdateClusterGroupAssociatedRules();

    private static HttpRequestDef<UpdateClusterGroupAssociatedRulesRequest, UpdateClusterGroupAssociatedRulesResponse> genForUpdateClusterGroupAssociatedRules() {
        // basic
        HttpRequestDef.Builder<UpdateClusterGroupAssociatedRulesRequest, UpdateClusterGroupAssociatedRulesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateClusterGroupAssociatedRulesRequest.class,
                    UpdateClusterGroupAssociatedRulesResponse.class)
                .withName("UpdateClusterGroupAssociatedRules")
                .withUri("/v1/clustergroups/{clustergroupid}/associatedrules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("clustergroupid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateClusterGroupAssociatedRulesRequest::getClustergroupid,
                UpdateClusterGroupAssociatedRulesRequest::setClustergroupid));
        builder.<UpdateAssociatedRulesRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateAssociatedRulesRequest.class),
            f -> f.withMarshaller(UpdateClusterGroupAssociatedRulesRequest::getBody,
                UpdateClusterGroupAssociatedRulesRequest::setBody));

        // response
        builder.<Object>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            Object.class,
            f -> f.withMarshaller(UpdateClusterGroupAssociatedRulesResponse::getBody,
                UpdateClusterGroupAssociatedRulesResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateClusterGroupAssociatedZonesRequest, UpdateClusterGroupAssociatedZonesResponse> updateClusterGroupAssociatedZones =
        genForUpdateClusterGroupAssociatedZones();

    private static HttpRequestDef<UpdateClusterGroupAssociatedZonesRequest, UpdateClusterGroupAssociatedZonesResponse> genForUpdateClusterGroupAssociatedZones() {
        // basic
        HttpRequestDef.Builder<UpdateClusterGroupAssociatedZonesRequest, UpdateClusterGroupAssociatedZonesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateClusterGroupAssociatedZonesRequest.class,
                    UpdateClusterGroupAssociatedZonesResponse.class)
                .withName("UpdateClusterGroupAssociatedZones")
                .withUri("/v1/clustergroups/{clustergroupid}/associatedzones")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("clustergroupid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateClusterGroupAssociatedZonesRequest::getClustergroupid,
                UpdateClusterGroupAssociatedZonesRequest::setClustergroupid));
        builder.<UpdateAssociatedZonesRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateAssociatedZonesRequest.class),
            f -> f.withMarshaller(UpdateClusterGroupAssociatedZonesRequest::getBody,
                UpdateClusterGroupAssociatedZonesRequest::setBody));

        // response
        builder.<Object>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            Object.class,
            f -> f.withMarshaller(UpdateClusterGroupAssociatedZonesResponse::getBody,
                UpdateClusterGroupAssociatedZonesResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateConfigSetRequest, UpdateConfigSetResponse> updateConfigSet =
        genForUpdateConfigSet();

    private static HttpRequestDef<UpdateConfigSetRequest, UpdateConfigSetResponse> genForUpdateConfigSet() {
        // basic
        HttpRequestDef.Builder<UpdateConfigSetRequest, UpdateConfigSetResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateConfigSetRequest.class, UpdateConfigSetResponse.class)
                .withName("UpdateConfigSet")
                .withUri("/v1/configsets/{configsetid}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("configsetid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateConfigSetRequest::getConfigsetid, UpdateConfigSetRequest::setConfigsetid));
        builder.<UpdateConfigSetRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateConfigSetRequestBody.class),
            f -> f.withMarshaller(UpdateConfigSetRequest::getBody, UpdateConfigSetRequest::setBody));

        // response
        builder.<Object>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            Object.class,
            f -> f.withMarshaller(UpdateConfigSetResponse::getBody, UpdateConfigSetResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePolicyDefinationRequest, UpdatePolicyDefinationResponse> updatePolicyDefination =
        genForUpdatePolicyDefination();

    private static HttpRequestDef<UpdatePolicyDefinationRequest, UpdatePolicyDefinationResponse> genForUpdatePolicyDefination() {
        // basic
        HttpRequestDef.Builder<UpdatePolicyDefinationRequest, UpdatePolicyDefinationResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdatePolicyDefinationRequest.class, UpdatePolicyDefinationResponse.class)
            .withName("UpdatePolicyDefination")
            .withUri("/v1/policydefinitions/{policydefinitionid}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policydefinitionid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePolicyDefinationRequest::getPolicydefinitionid,
                UpdatePolicyDefinationRequest::setPolicydefinitionid));
        builder.<UCSConstraintTemplateTagRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UCSConstraintTemplateTagRequest.class),
            f -> f.withMarshaller(UpdatePolicyDefinationRequest::getBody, UpdatePolicyDefinationRequest::setBody));

        // response
        builder.<Object>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            Object.class,
            f -> f.withMarshaller(UpdatePolicyDefinationResponse::getBody, UpdatePolicyDefinationResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePolicyInstanceRequest, UpdatePolicyInstanceResponse> updatePolicyInstance =
        genForUpdatePolicyInstance();

    private static HttpRequestDef<UpdatePolicyInstanceRequest, UpdatePolicyInstanceResponse> genForUpdatePolicyInstance() {
        // basic
        HttpRequestDef.Builder<UpdatePolicyInstanceRequest, UpdatePolicyInstanceResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdatePolicyInstanceRequest.class, UpdatePolicyInstanceResponse.class)
            .withName("UpdatePolicyInstance")
            .withUri("/v1/policyinstances/{policyinstanceid}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policyinstanceid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePolicyInstanceRequest::getPolicyinstanceid,
                UpdatePolicyInstanceRequest::setPolicyinstanceid));
        builder.<UCSConstraintRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UCSConstraintRequest.class),
            f -> f.withMarshaller(UpdatePolicyInstanceRequest::getBody, UpdatePolicyInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateProxyUnitedWorkloadRequest, UpdateProxyUnitedWorkloadResponse> updateProxyUnitedWorkload =
        genForUpdateProxyUnitedWorkload();

    private static HttpRequestDef<UpdateProxyUnitedWorkloadRequest, UpdateProxyUnitedWorkloadResponse> genForUpdateProxyUnitedWorkload() {
        // basic
        HttpRequestDef.Builder<UpdateProxyUnitedWorkloadRequest, UpdateProxyUnitedWorkloadResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateProxyUnitedWorkloadRequest.class,
                    UpdateProxyUnitedWorkloadResponse.class)
                .withName("UpdateProxyUnitedWorkload")
                .withUri("/v1/clustergroups/{clustergroupid}/unitedworkload")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("clustergroupid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateProxyUnitedWorkloadRequest::getClustergroupid,
                UpdateProxyUnitedWorkloadRequest::setClustergroupid));
        builder.<MutiWorkload>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(MutiWorkload.class),
            f -> f.withMarshaller(UpdateProxyUnitedWorkloadRequest::getBody,
                UpdateProxyUnitedWorkloadRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRepoRequest, UpdateRepoResponse> updateRepo = genForUpdateRepo();

    private static HttpRequestDef<UpdateRepoRequest, UpdateRepoResponse> genForUpdateRepo() {
        // basic
        HttpRequestDef.Builder<UpdateRepoRequest, UpdateRepoResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateRepoRequest.class, UpdateRepoResponse.class)
                .withName("UpdateRepo")
                .withUri("/v1/configsets/repos/{repoid}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("repoid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRepoRequest::getRepoid, UpdateRepoRequest::setRepoid));
        builder.<UpdateRepoRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateRepoRequestBody.class),
            f -> f.withMarshaller(UpdateRepoRequest::getBody, UpdateRepoRequest::setBody));

        // response
        builder.<Object>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            Object.class,
            f -> f.withMarshaller(UpdateRepoResponse::getBody, UpdateRepoResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRuleRequest, UpdateRuleResponse> updateRule = genForUpdateRule();

    private static HttpRequestDef<UpdateRuleRequest, UpdateRuleResponse> genForUpdateRule() {
        // basic
        HttpRequestDef.Builder<UpdateRuleRequest, UpdateRuleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateRuleRequest.class, UpdateRuleResponse.class)
                .withName("UpdateRule")
                .withUri("/v1/permissions/rules/{ruleid}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("ruleid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRuleRequest::getRuleid, UpdateRuleRequest::setRuleid));
        builder.<UpdateRuleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateRuleRequestBody.class),
            f -> f.withMarshaller(UpdateRuleRequest::getBody, UpdateRuleRequest::setBody));

        // response
        builder.<Object>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            Object.class,
            f -> f.withMarshaller(UpdateRuleResponse::getBody, UpdateRuleResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<UpgradeFederationRequest, UpgradeFederationResponse> upgradeFederation =
        genForUpgradeFederation();

    private static HttpRequestDef<UpgradeFederationRequest, UpgradeFederationResponse> genForUpgradeFederation() {
        // basic
        HttpRequestDef.Builder<UpgradeFederationRequest, UpgradeFederationResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UpgradeFederationRequest.class, UpgradeFederationResponse.class)
                .withName("UpgradeFederation")
                .withUri("/v1/clustergroups/{clustergroupid}/federations/upgrade")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("clustergroupid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpgradeFederationRequest::getClustergroupid,
                UpgradeFederationRequest::setClustergroupid));
        builder.<UpgradeFederationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpgradeFederationRequestBody.class),
            f -> f.withMarshaller(UpgradeFederationRequest::getBody, UpgradeFederationRequest::setBody));

        // response
        builder.<Object>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            Object.class,
            f -> f.withMarshaller(UpgradeFederationResponse::getBody, UpgradeFederationResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<CreateClusterConfRequest, CreateClusterConfResponse> createClusterConf =
        genForCreateClusterConf();

    private static HttpRequestDef<CreateClusterConfRequest, CreateClusterConfResponse> genForCreateClusterConf() {
        // basic
        HttpRequestDef.Builder<CreateClusterConfRequest, CreateClusterConfResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateClusterConfRequest.class, CreateClusterConfResponse.class)
                .withName("CreateClusterConf")
                .withUri("/v1/clusters/{clusterid}/clusterconf")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("clusterid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateClusterConfRequest::getClusterid, CreateClusterConfRequest::setClusterid));
        builder.<RequiredInput>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(RequiredInput.class),
            f -> f.withMarshaller(CreateClusterConfRequest::getBody, CreateClusterConfRequest::setBody));

        // response
        builder.<Map<String, Object>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Map.class),
            f -> f.withMarshaller(CreateClusterConfResponse::getBody, CreateClusterConfResponse::setBody)
                .withInnerContainerType(Object.class));

        return builder.build();
    }

    public static final HttpRequestDef<CreateClusterKubeconfigRequest, CreateClusterKubeconfigResponse> createClusterKubeconfig =
        genForCreateClusterKubeconfig();

    private static HttpRequestDef<CreateClusterKubeconfigRequest, CreateClusterKubeconfigResponse> genForCreateClusterKubeconfig() {
        // basic
        HttpRequestDef.Builder<CreateClusterKubeconfigRequest, CreateClusterKubeconfigResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateClusterKubeconfigRequest.class, CreateClusterKubeconfigResponse.class)
            .withName("CreateClusterKubeconfig")
            .withUri("/v1/clusters/{clusterid}/kubeconfig")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("clusterid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateClusterKubeconfigRequest::getClusterid,
                CreateClusterKubeconfigRequest::setClusterid));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateClusterPolicyInstanceRequest, CreateClusterPolicyInstanceResponse> createClusterPolicyInstance =
        genForCreateClusterPolicyInstance();

    private static HttpRequestDef<CreateClusterPolicyInstanceRequest, CreateClusterPolicyInstanceResponse> genForCreateClusterPolicyInstance() {
        // basic
        HttpRequestDef.Builder<CreateClusterPolicyInstanceRequest, CreateClusterPolicyInstanceResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateClusterPolicyInstanceRequest.class,
                    CreateClusterPolicyInstanceResponse.class)
                .withName("CreateClusterPolicyInstance")
                .withUri("/v1/clusters/{clusterid}/policyinstance")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("clusterid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateClusterPolicyInstanceRequest::getClusterid,
                CreateClusterPolicyInstanceRequest::setClusterid));
        builder.<UCSConstraintRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UCSConstraintRequest.class),
            f -> f.withMarshaller(CreateClusterPolicyInstanceRequest::getBody,
                CreateClusterPolicyInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteClusterRequest, DeleteClusterResponse> deleteCluster =
        genForDeleteCluster();

    private static HttpRequestDef<DeleteClusterRequest, DeleteClusterResponse> genForDeleteCluster() {
        // basic
        HttpRequestDef.Builder<DeleteClusterRequest, DeleteClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteClusterRequest.class, DeleteClusterResponse.class)
                .withName("DeleteCluster")
                .withUri("/v1/clusters/{clusterid}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("clusterid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteClusterRequest::getClusterid, DeleteClusterRequest::setClusterid));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(DeleteClusterResponse::getBody, DeleteClusterResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<DisableClusterPolicyRequest, DisableClusterPolicyResponse> disableClusterPolicy =
        genForDisableClusterPolicy();

    private static HttpRequestDef<DisableClusterPolicyRequest, DisableClusterPolicyResponse> genForDisableClusterPolicy() {
        // basic
        HttpRequestDef.Builder<DisableClusterPolicyRequest, DisableClusterPolicyResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DisableClusterPolicyRequest.class, DisableClusterPolicyResponse.class)
            .withName("DisableClusterPolicy")
            .withUri("/v1/clusters/{clusterid}/policy")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("clusterid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisableClusterPolicyRequest::getClusterid,
                DisableClusterPolicyRequest::setClusterid));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisableGitOpsRequest, DisableGitOpsResponse> disableGitOps =
        genForDisableGitOps();

    private static HttpRequestDef<DisableGitOpsRequest, DisableGitOpsResponse> genForDisableGitOps() {
        // basic
        HttpRequestDef.Builder<DisableGitOpsRequest, DisableGitOpsResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DisableGitOpsRequest.class, DisableGitOpsResponse.class)
                .withName("DisableGitOps")
                .withUri("/v1/clusters/{clusterid}/gitops")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("clusterid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisableGitOpsRequest::getClusterid, DisableGitOpsRequest::setClusterid));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EnableClusterPolicyRequest, EnableClusterPolicyResponse> enableClusterPolicy =
        genForEnableClusterPolicy();

    private static HttpRequestDef<EnableClusterPolicyRequest, EnableClusterPolicyResponse> genForEnableClusterPolicy() {
        // basic
        HttpRequestDef.Builder<EnableClusterPolicyRequest, EnableClusterPolicyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, EnableClusterPolicyRequest.class, EnableClusterPolicyResponse.class)
                .withName("EnableClusterPolicy")
                .withUri("/v1/clusters/{clusterid}/policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("clusterid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EnableClusterPolicyRequest::getClusterid, EnableClusterPolicyRequest::setClusterid));
        builder.<String>withRequestField("retry",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EnableClusterPolicyRequest::getRetry, EnableClusterPolicyRequest::setRetry));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EnableGitOpsRequest, EnableGitOpsResponse> enableGitOps = genForEnableGitOps();

    private static HttpRequestDef<EnableGitOpsRequest, EnableGitOpsResponse> genForEnableGitOps() {
        // basic
        HttpRequestDef.Builder<EnableGitOpsRequest, EnableGitOpsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, EnableGitOpsRequest.class, EnableGitOpsResponse.class)
                .withName("EnableGitOps")
                .withUri("/v1/clusters/{clusterid}/gitops")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("clusterid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EnableGitOpsRequest::getClusterid, EnableGitOpsRequest::setClusterid));
        builder.<String>withRequestField("retry",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EnableGitOpsRequest::getRetry, EnableGitOpsRequest::setRetry));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListManagedClustersRequest, ListManagedClustersResponse> listManagedClusters =
        genForListManagedClusters();

    private static HttpRequestDef<ListManagedClustersRequest, ListManagedClustersResponse> genForListManagedClusters() {
        // basic
        HttpRequestDef.Builder<ListManagedClustersRequest, ListManagedClustersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListManagedClustersRequest.class, ListManagedClustersResponse.class)
                .withName("ListManagedClusters")
                .withUri("/v1/managedclusters")
                .withContentType("application/json");

        // requests
        builder.<Boolean>withRequestField("unimported",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListManagedClustersRequest::getUnimported,
                ListManagedClustersRequest::setUnimported));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListManagedClustersRequest::getLimit, ListManagedClustersRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListManagedClustersRequest::getOffset, ListManagedClustersRequest::setOffset));

        // response
        builder.<List<Cluster>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ListManagedClustersResponse::getBody, ListManagedClustersResponse::setBody)
                .withInnerContainerType(Cluster.class));

        return builder.build();
    }

    public static final HttpRequestDef<ListRegisteredClusterVersionsRequest, ListRegisteredClusterVersionsResponse> listRegisteredClusterVersions =
        genForListRegisteredClusterVersions();

    private static HttpRequestDef<ListRegisteredClusterVersionsRequest, ListRegisteredClusterVersionsResponse> genForListRegisteredClusterVersions() {
        // basic
        HttpRequestDef.Builder<ListRegisteredClusterVersionsRequest, ListRegisteredClusterVersionsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListRegisteredClusterVersionsRequest.class,
                    ListRegisteredClusterVersionsResponse.class)
                .withName("ListRegisteredClusterVersions")
                .withUri("/v1/config/registeredclusterversions")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RegisterClusterRequest, RegisterClusterResponse> registerCluster =
        genForRegisterCluster();

    private static HttpRequestDef<RegisterClusterRequest, RegisterClusterResponse> genForRegisterCluster() {
        // basic
        HttpRequestDef.Builder<RegisterClusterRequest, RegisterClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RegisterClusterRequest.class, RegisterClusterResponse.class)
                .withName("RegisterCluster")
                .withUri("/v1/clusters")
                .withContentType("application/x-www-form-urlencoded");

        // requests
        builder.<RegisterCluster>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RegisterCluster.class),
            f -> f.withMarshaller(RegisterClusterRequest::getBody, RegisterClusterRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RetryClusterActivationRequest, RetryClusterActivationResponse> retryClusterActivation =
        genForRetryClusterActivation();

    private static HttpRequestDef<RetryClusterActivationRequest, RetryClusterActivationResponse> genForRetryClusterActivation() {
        // basic
        HttpRequestDef.Builder<RetryClusterActivationRequest, RetryClusterActivationResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, RetryClusterActivationRequest.class, RetryClusterActivationResponse.class)
            .withName("RetryClusterActivation")
            .withUri("/v1/clusters/{clusterid}/activation")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("clusterid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RetryClusterActivationRequest::getClusterid,
                RetryClusterActivationRequest::setClusterid));

        // response
        builder.<Object>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            Object.class,
            f -> f.withMarshaller(RetryClusterActivationResponse::getBody, RetryClusterActivationResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<ShowClusterRequest, ShowClusterResponse> showCluster = genForShowCluster();

    private static HttpRequestDef<ShowClusterRequest, ShowClusterResponse> genForShowCluster() {
        // basic
        HttpRequestDef.Builder<ShowClusterRequest, ShowClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowClusterRequest.class, ShowClusterResponse.class)
                .withName("ShowCluster")
                .withUri("/v1/clusters/{clusterid}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("clusterid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowClusterRequest::getClusterid, ShowClusterRequest::setClusterid));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowClusterAccessInfoRequest, ShowClusterAccessInfoResponse> showClusterAccessInfo =
        genForShowClusterAccessInfo();

    private static HttpRequestDef<ShowClusterAccessInfoRequest, ShowClusterAccessInfoResponse> genForShowClusterAccessInfo() {
        // basic
        HttpRequestDef.Builder<ShowClusterAccessInfoRequest, ShowClusterAccessInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowClusterAccessInfoRequest.class, ShowClusterAccessInfoResponse.class)
            .withName("ShowClusterAccessInfo")
            .withUri("/v1/clusters/{clusterid}/accessinfo")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("clusterid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowClusterAccessInfoRequest::getClusterid,
                ShowClusterAccessInfoRequest::setClusterid));
        builder.<String>withRequestField("vpcendpoint",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowClusterAccessInfoRequest::getVpcendpoint,
                ShowClusterAccessInfoRequest::setVpcendpoint));
        builder.<String>withRequestField("region",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowClusterAccessInfoRequest::getRegion, ShowClusterAccessInfoRequest::setRegion));

        // response
        builder.<List<byte[]>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowClusterAccessInfoResponse::getBody, ShowClusterAccessInfoResponse::setBody)
                .withInnerContainerType(byte[].class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowClusterListRequest, ShowClusterListResponse> showClusterList =
        genForShowClusterList();

    private static HttpRequestDef<ShowClusterListRequest, ShowClusterListResponse> genForShowClusterList() {
        // basic
        HttpRequestDef.Builder<ShowClusterListRequest, ShowClusterListResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowClusterListRequest.class, ShowClusterListResponse.class)
                .withName("ShowClusterList")
                .withUri("/v1/clusters")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("category",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowClusterListRequest::getCategory, ShowClusterListRequest::setCategory));
        builder.<Boolean>withRequestField("enablestatus",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ShowClusterListRequest::getEnablestatus, ShowClusterListRequest::setEnablestatus));
        builder.<String>withRequestField("clustergroupid",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowClusterListRequest::getClustergroupid,
                ShowClusterListRequest::setClustergroupid));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowClusterListRequest::getLimit, ShowClusterListRequest::setLimit));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowClusterListRequest::getOffset, ShowClusterListRequest::setOffset));
        builder.<String>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowClusterListRequest::getOrderBy, ShowClusterListRequest::setOrderBy));
        builder.<String>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowClusterListRequest::getOrder, ShowClusterListRequest::setOrder));
        builder.<String>withRequestField("managetype",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowClusterListRequest::getManagetype, ShowClusterListRequest::setManagetype));
        builder.<String>withRequestField("clusterids",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowClusterListRequest::getClusterids, ShowClusterListRequest::setClusterids));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGitOpsStatusRequest, ShowGitOpsStatusResponse> showGitOpsStatus =
        genForShowGitOpsStatus();

    private static HttpRequestDef<ShowGitOpsStatusRequest, ShowGitOpsStatusResponse> genForShowGitOpsStatus() {
        // basic
        HttpRequestDef.Builder<ShowGitOpsStatusRequest, ShowGitOpsStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowGitOpsStatusRequest.class, ShowGitOpsStatusResponse.class)
                .withName("ShowGitOpsStatus")
                .withUri("/v1/clusters/{clusterid}/gitops")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("clusterid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGitOpsStatusRequest::getClusterid, ShowGitOpsStatusRequest::setClusterid));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateClusterRequest, UpdateClusterResponse> updateCluster =
        genForUpdateCluster();

    private static HttpRequestDef<UpdateClusterRequest, UpdateClusterResponse> genForUpdateCluster() {
        // basic
        HttpRequestDef.Builder<UpdateClusterRequest, UpdateClusterResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateClusterRequest.class, UpdateClusterResponse.class)
                .withName("UpdateCluster")
                .withUri("/v1/clusters/{clusterid}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("clusterid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateClusterRequest::getClusterid, UpdateClusterRequest::setClusterid));
        builder.<UpdateClusterRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateClusterRequestBody.class),
            f -> f.withMarshaller(UpdateClusterRequest::getBody, UpdateClusterRequest::setBody));

        // response
        builder.<Object>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            Object.class,
            f -> f.withMarshaller(UpdateClusterResponse::getBody, UpdateClusterResponse::setBody));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateClusterRulesRequest, UpdateClusterRulesResponse> updateClusterRules =
        genForUpdateClusterRules();

    private static HttpRequestDef<UpdateClusterRulesRequest, UpdateClusterRulesResponse> genForUpdateClusterRules() {
        // basic
        HttpRequestDef.Builder<UpdateClusterRulesRequest, UpdateClusterRulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateClusterRulesRequest.class, UpdateClusterRulesResponse.class)
                .withName("UpdateClusterRules")
                .withUri("/v1/clusters/{clusterid}/associatedrules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("clusterid",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateClusterRulesRequest::getClusterid, UpdateClusterRulesRequest::setClusterid));
        builder.<UpdateAssociatedRulesRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAssociatedRulesRequest.class),
            f -> f.withMarshaller(UpdateClusterRulesRequest::getBody, UpdateClusterRulesRequest::setBody));

        // response
        builder.<Object>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            Object.class,
            f -> f.withMarshaller(UpdateClusterRulesResponse::getBody, UpdateClusterRulesResponse::setBody));

        return builder.build();
    }

}
