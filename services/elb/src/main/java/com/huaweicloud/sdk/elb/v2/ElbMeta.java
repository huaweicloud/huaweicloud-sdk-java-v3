package com.huaweicloud.sdk.elb.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.elb.v2.model.BatchCreateListenerTagsRequest;
import com.huaweicloud.sdk.elb.v2.model.BatchCreateListenerTagsRequestBody;
import com.huaweicloud.sdk.elb.v2.model.BatchCreateListenerTagsResponse;
import com.huaweicloud.sdk.elb.v2.model.BatchCreateLoadbalancerTagsRequest;
import com.huaweicloud.sdk.elb.v2.model.BatchCreateLoadbalancerTagsRequestBody;
import com.huaweicloud.sdk.elb.v2.model.BatchCreateLoadbalancerTagsResponse;
import com.huaweicloud.sdk.elb.v2.model.BatchDeleteListenerTagsRequest;
import com.huaweicloud.sdk.elb.v2.model.BatchDeleteListenerTagsRequestBody;
import com.huaweicloud.sdk.elb.v2.model.BatchDeleteListenerTagsResponse;
import com.huaweicloud.sdk.elb.v2.model.BatchDeleteLoadbalancerTagsRequest;
import com.huaweicloud.sdk.elb.v2.model.BatchDeleteLoadbalancerTagsRequestBody;
import com.huaweicloud.sdk.elb.v2.model.BatchDeleteLoadbalancerTagsResponse;
import com.huaweicloud.sdk.elb.v2.model.CreateCertificateRequest;
import com.huaweicloud.sdk.elb.v2.model.CreateCertificateRequestBody;
import com.huaweicloud.sdk.elb.v2.model.CreateCertificateResponse;
import com.huaweicloud.sdk.elb.v2.model.CreateHealthmonitorRequest;
import com.huaweicloud.sdk.elb.v2.model.CreateHealthmonitorRequestBody;
import com.huaweicloud.sdk.elb.v2.model.CreateHealthmonitorResponse;
import com.huaweicloud.sdk.elb.v2.model.CreateL7policyRequest;
import com.huaweicloud.sdk.elb.v2.model.CreateL7policyRequestBody;
import com.huaweicloud.sdk.elb.v2.model.CreateL7policyResponse;
import com.huaweicloud.sdk.elb.v2.model.CreateL7ruleRequest;
import com.huaweicloud.sdk.elb.v2.model.CreateL7ruleRequestBody;
import com.huaweicloud.sdk.elb.v2.model.CreateL7ruleResponse;
import com.huaweicloud.sdk.elb.v2.model.CreateListenerRequest;
import com.huaweicloud.sdk.elb.v2.model.CreateListenerRequestBody;
import com.huaweicloud.sdk.elb.v2.model.CreateListenerResponse;
import com.huaweicloud.sdk.elb.v2.model.CreateListenerTagsRequest;
import com.huaweicloud.sdk.elb.v2.model.CreateListenerTagsRequestBody;
import com.huaweicloud.sdk.elb.v2.model.CreateListenerTagsResponse;
import com.huaweicloud.sdk.elb.v2.model.CreateLoadbalancerRequest;
import com.huaweicloud.sdk.elb.v2.model.CreateLoadbalancerRequestBody;
import com.huaweicloud.sdk.elb.v2.model.CreateLoadbalancerResponse;
import com.huaweicloud.sdk.elb.v2.model.CreateLoadbalancerTagsRequest;
import com.huaweicloud.sdk.elb.v2.model.CreateLoadbalancerTagsRequestBody;
import com.huaweicloud.sdk.elb.v2.model.CreateLoadbalancerTagsResponse;
import com.huaweicloud.sdk.elb.v2.model.CreateMemberRequest;
import com.huaweicloud.sdk.elb.v2.model.CreateMemberRequestBody;
import com.huaweicloud.sdk.elb.v2.model.CreateMemberResponse;
import com.huaweicloud.sdk.elb.v2.model.CreatePoolRequest;
import com.huaweicloud.sdk.elb.v2.model.CreatePoolRequestBody;
import com.huaweicloud.sdk.elb.v2.model.CreatePoolResponse;
import com.huaweicloud.sdk.elb.v2.model.CreateWhitelistRequest;
import com.huaweicloud.sdk.elb.v2.model.CreateWhitelistRequestBody;
import com.huaweicloud.sdk.elb.v2.model.CreateWhitelistResponse;
import com.huaweicloud.sdk.elb.v2.model.DeleteCertificateRequest;
import com.huaweicloud.sdk.elb.v2.model.DeleteCertificateResponse;
import com.huaweicloud.sdk.elb.v2.model.DeleteHealthmonitorRequest;
import com.huaweicloud.sdk.elb.v2.model.DeleteHealthmonitorResponse;
import com.huaweicloud.sdk.elb.v2.model.DeleteL7policyRequest;
import com.huaweicloud.sdk.elb.v2.model.DeleteL7policyResponse;
import com.huaweicloud.sdk.elb.v2.model.DeleteL7ruleRequest;
import com.huaweicloud.sdk.elb.v2.model.DeleteL7ruleResponse;
import com.huaweicloud.sdk.elb.v2.model.DeleteListenerRequest;
import com.huaweicloud.sdk.elb.v2.model.DeleteListenerResponse;
import com.huaweicloud.sdk.elb.v2.model.DeleteListenerTagsRequest;
import com.huaweicloud.sdk.elb.v2.model.DeleteListenerTagsResponse;
import com.huaweicloud.sdk.elb.v2.model.DeleteLoadbalancerRequest;
import com.huaweicloud.sdk.elb.v2.model.DeleteLoadbalancerResponse;
import com.huaweicloud.sdk.elb.v2.model.DeleteLoadbalancerTagsRequest;
import com.huaweicloud.sdk.elb.v2.model.DeleteLoadbalancerTagsResponse;
import com.huaweicloud.sdk.elb.v2.model.DeleteMemberRequest;
import com.huaweicloud.sdk.elb.v2.model.DeleteMemberResponse;
import com.huaweicloud.sdk.elb.v2.model.DeletePoolRequest;
import com.huaweicloud.sdk.elb.v2.model.DeletePoolResponse;
import com.huaweicloud.sdk.elb.v2.model.DeleteWhitelistRequest;
import com.huaweicloud.sdk.elb.v2.model.DeleteWhitelistResponse;
import com.huaweicloud.sdk.elb.v2.model.ListCertificatesRequest;
import com.huaweicloud.sdk.elb.v2.model.ListCertificatesResponse;
import com.huaweicloud.sdk.elb.v2.model.ListHealthmonitorsRequest;
import com.huaweicloud.sdk.elb.v2.model.ListHealthmonitorsResponse;
import com.huaweicloud.sdk.elb.v2.model.ListL7policiesRequest;
import com.huaweicloud.sdk.elb.v2.model.ListL7policiesResponse;
import com.huaweicloud.sdk.elb.v2.model.ListL7rulesRequest;
import com.huaweicloud.sdk.elb.v2.model.ListL7rulesResponse;
import com.huaweicloud.sdk.elb.v2.model.ListListenerTagsRequest;
import com.huaweicloud.sdk.elb.v2.model.ListListenerTagsResponse;
import com.huaweicloud.sdk.elb.v2.model.ListListenersByTagsRequest;
import com.huaweicloud.sdk.elb.v2.model.ListListenersByTagsRequestBody;
import com.huaweicloud.sdk.elb.v2.model.ListListenersByTagsResponse;
import com.huaweicloud.sdk.elb.v2.model.ListListenersRequest;
import com.huaweicloud.sdk.elb.v2.model.ListListenersResponse;
import com.huaweicloud.sdk.elb.v2.model.ListLoadbalancerTagsRequest;
import com.huaweicloud.sdk.elb.v2.model.ListLoadbalancerTagsResponse;
import com.huaweicloud.sdk.elb.v2.model.ListLoadbalancersByTagsRequest;
import com.huaweicloud.sdk.elb.v2.model.ListLoadbalancersByTagsRequestBody;
import com.huaweicloud.sdk.elb.v2.model.ListLoadbalancersByTagsResponse;
import com.huaweicloud.sdk.elb.v2.model.ListLoadbalancersRequest;
import com.huaweicloud.sdk.elb.v2.model.ListLoadbalancersResponse;
import com.huaweicloud.sdk.elb.v2.model.ListMembersRequest;
import com.huaweicloud.sdk.elb.v2.model.ListMembersResponse;
import com.huaweicloud.sdk.elb.v2.model.ListPoolsRequest;
import com.huaweicloud.sdk.elb.v2.model.ListPoolsResponse;
import com.huaweicloud.sdk.elb.v2.model.ListWhitelistsRequest;
import com.huaweicloud.sdk.elb.v2.model.ListWhitelistsResponse;
import com.huaweicloud.sdk.elb.v2.model.ShowCertificateRequest;
import com.huaweicloud.sdk.elb.v2.model.ShowCertificateResponse;
import com.huaweicloud.sdk.elb.v2.model.ShowHealthmonitorsRequest;
import com.huaweicloud.sdk.elb.v2.model.ShowHealthmonitorsResponse;
import com.huaweicloud.sdk.elb.v2.model.ShowL7policyRequest;
import com.huaweicloud.sdk.elb.v2.model.ShowL7policyResponse;
import com.huaweicloud.sdk.elb.v2.model.ShowL7ruleRequest;
import com.huaweicloud.sdk.elb.v2.model.ShowL7ruleResponse;
import com.huaweicloud.sdk.elb.v2.model.ShowListenerRequest;
import com.huaweicloud.sdk.elb.v2.model.ShowListenerResponse;
import com.huaweicloud.sdk.elb.v2.model.ShowListenerTagsRequest;
import com.huaweicloud.sdk.elb.v2.model.ShowListenerTagsResponse;
import com.huaweicloud.sdk.elb.v2.model.ShowLoadbalancerRequest;
import com.huaweicloud.sdk.elb.v2.model.ShowLoadbalancerResponse;
import com.huaweicloud.sdk.elb.v2.model.ShowLoadbalancerTagsRequest;
import com.huaweicloud.sdk.elb.v2.model.ShowLoadbalancerTagsResponse;
import com.huaweicloud.sdk.elb.v2.model.ShowLoadbalancersStatusRequest;
import com.huaweicloud.sdk.elb.v2.model.ShowLoadbalancersStatusResponse;
import com.huaweicloud.sdk.elb.v2.model.ShowMemberRequest;
import com.huaweicloud.sdk.elb.v2.model.ShowMemberResponse;
import com.huaweicloud.sdk.elb.v2.model.ShowPoolRequest;
import com.huaweicloud.sdk.elb.v2.model.ShowPoolResponse;
import com.huaweicloud.sdk.elb.v2.model.ShowWhitelistRequest;
import com.huaweicloud.sdk.elb.v2.model.ShowWhitelistResponse;
import com.huaweicloud.sdk.elb.v2.model.UpdateCertificateRequest;
import com.huaweicloud.sdk.elb.v2.model.UpdateCertificateRequestBody;
import com.huaweicloud.sdk.elb.v2.model.UpdateCertificateResponse;
import com.huaweicloud.sdk.elb.v2.model.UpdateHealthmonitorRequest;
import com.huaweicloud.sdk.elb.v2.model.UpdateHealthmonitorRequestBody;
import com.huaweicloud.sdk.elb.v2.model.UpdateHealthmonitorResponse;
import com.huaweicloud.sdk.elb.v2.model.UpdateL7policiesRequest;
import com.huaweicloud.sdk.elb.v2.model.UpdateL7policiesRequestBody;
import com.huaweicloud.sdk.elb.v2.model.UpdateL7policiesResponse;
import com.huaweicloud.sdk.elb.v2.model.UpdateL7ruleRequest;
import com.huaweicloud.sdk.elb.v2.model.UpdateL7ruleRequestBody;
import com.huaweicloud.sdk.elb.v2.model.UpdateL7ruleResponse;
import com.huaweicloud.sdk.elb.v2.model.UpdateListenerRequest;
import com.huaweicloud.sdk.elb.v2.model.UpdateListenerRequestBody;
import com.huaweicloud.sdk.elb.v2.model.UpdateListenerResponse;
import com.huaweicloud.sdk.elb.v2.model.UpdateLoadbalancerRequest;
import com.huaweicloud.sdk.elb.v2.model.UpdateLoadbalancerRequestBody;
import com.huaweicloud.sdk.elb.v2.model.UpdateLoadbalancerResponse;
import com.huaweicloud.sdk.elb.v2.model.UpdateMemberRequest;
import com.huaweicloud.sdk.elb.v2.model.UpdateMemberRequestBody;
import com.huaweicloud.sdk.elb.v2.model.UpdateMemberResponse;
import com.huaweicloud.sdk.elb.v2.model.UpdatePoolRequest;
import com.huaweicloud.sdk.elb.v2.model.UpdatePoolRequestBody;
import com.huaweicloud.sdk.elb.v2.model.UpdatePoolResponse;
import com.huaweicloud.sdk.elb.v2.model.UpdateWhitelistRequest;
import com.huaweicloud.sdk.elb.v2.model.UpdateWhitelistRequestBody;
import com.huaweicloud.sdk.elb.v2.model.UpdateWhitelistResponse;

@SuppressWarnings("unchecked")
public class ElbMeta {

    public static final HttpRequestDef<BatchCreateListenerTagsRequest, BatchCreateListenerTagsResponse> batchCreateListenerTags =
        genForBatchCreateListenerTags();

    private static HttpRequestDef<BatchCreateListenerTagsRequest, BatchCreateListenerTagsResponse> genForBatchCreateListenerTags() {
        // basic
        HttpRequestDef.Builder<BatchCreateListenerTagsRequest, BatchCreateListenerTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchCreateListenerTagsRequest.class, BatchCreateListenerTagsResponse.class)
            .withName("BatchCreateListenerTags")
            .withUri("/v2.0/{project_id}/listeners/{listener_id}/tags/action")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("listener_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateListenerTagsRequest::getListenerId,
                BatchCreateListenerTagsRequest::setListenerId));
        builder.<BatchCreateListenerTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateListenerTagsRequestBody.class),
            f -> f.withMarshaller(BatchCreateListenerTagsRequest::getBody, BatchCreateListenerTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateLoadbalancerTagsRequest, BatchCreateLoadbalancerTagsResponse> batchCreateLoadbalancerTags =
        genForBatchCreateLoadbalancerTags();

    private static HttpRequestDef<BatchCreateLoadbalancerTagsRequest, BatchCreateLoadbalancerTagsResponse> genForBatchCreateLoadbalancerTags() {
        // basic
        HttpRequestDef.Builder<BatchCreateLoadbalancerTagsRequest, BatchCreateLoadbalancerTagsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchCreateLoadbalancerTagsRequest.class,
                    BatchCreateLoadbalancerTagsResponse.class)
                .withName("BatchCreateLoadbalancerTags")
                .withUri("/v2.0/{project_id}/loadbalancers/{loadbalancer_id}/tags/action")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("loadbalancer_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchCreateLoadbalancerTagsRequest::getLoadbalancerId,
                BatchCreateLoadbalancerTagsRequest::setLoadbalancerId));
        builder.<BatchCreateLoadbalancerTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateLoadbalancerTagsRequestBody.class),
            f -> f.withMarshaller(BatchCreateLoadbalancerTagsRequest::getBody,
                BatchCreateLoadbalancerTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteListenerTagsRequest, BatchDeleteListenerTagsResponse> batchDeleteListenerTags =
        genForBatchDeleteListenerTags();

    private static HttpRequestDef<BatchDeleteListenerTagsRequest, BatchDeleteListenerTagsResponse> genForBatchDeleteListenerTags() {
        // basic
        HttpRequestDef.Builder<BatchDeleteListenerTagsRequest, BatchDeleteListenerTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchDeleteListenerTagsRequest.class, BatchDeleteListenerTagsResponse.class)
            .withName("BatchDeleteListenerTags")
            .withUri("/v2.0/{project_id}/listeners/{listener_id}/tags/action")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("listener_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteListenerTagsRequest::getListenerId,
                BatchDeleteListenerTagsRequest::setListenerId));
        builder.<BatchDeleteListenerTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteListenerTagsRequestBody.class),
            f -> f.withMarshaller(BatchDeleteListenerTagsRequest::getBody, BatchDeleteListenerTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteLoadbalancerTagsRequest, BatchDeleteLoadbalancerTagsResponse> batchDeleteLoadbalancerTags =
        genForBatchDeleteLoadbalancerTags();

    private static HttpRequestDef<BatchDeleteLoadbalancerTagsRequest, BatchDeleteLoadbalancerTagsResponse> genForBatchDeleteLoadbalancerTags() {
        // basic
        HttpRequestDef.Builder<BatchDeleteLoadbalancerTagsRequest, BatchDeleteLoadbalancerTagsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchDeleteLoadbalancerTagsRequest.class,
                    BatchDeleteLoadbalancerTagsResponse.class)
                .withName("BatchDeleteLoadbalancerTags")
                .withUri("/v2.0/{project_id}/loadbalancers/{loadbalancer_id}/tags/action")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("loadbalancer_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteLoadbalancerTagsRequest::getLoadbalancerId,
                BatchDeleteLoadbalancerTagsRequest::setLoadbalancerId));
        builder.<BatchDeleteLoadbalancerTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteLoadbalancerTagsRequestBody.class),
            f -> f.withMarshaller(BatchDeleteLoadbalancerTagsRequest::getBody,
                BatchDeleteLoadbalancerTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateHealthmonitorRequest, CreateHealthmonitorResponse> createHealthmonitor =
        genForCreateHealthmonitor();

    private static HttpRequestDef<CreateHealthmonitorRequest, CreateHealthmonitorResponse> genForCreateHealthmonitor() {
        // basic
        HttpRequestDef.Builder<CreateHealthmonitorRequest, CreateHealthmonitorResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateHealthmonitorRequest.class, CreateHealthmonitorResponse.class)
                .withName("CreateHealthmonitor")
                .withUri("/v2/{project_id}/elb/healthmonitors")
                .withContentType("application/json");

        // requests
        builder.<CreateHealthmonitorRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateHealthmonitorRequestBody.class),
            f -> f.withMarshaller(CreateHealthmonitorRequest::getBody, CreateHealthmonitorRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateL7policyRequest, CreateL7policyResponse> createL7policy =
        genForCreateL7policy();

    private static HttpRequestDef<CreateL7policyRequest, CreateL7policyResponse> genForCreateL7policy() {
        // basic
        HttpRequestDef.Builder<CreateL7policyRequest, CreateL7policyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateL7policyRequest.class, CreateL7policyResponse.class)
                .withName("CreateL7policy")
                .withUri("/v2/{project_id}/elb/l7policies")
                .withContentType("application/json");

        // requests
        builder.<CreateL7policyRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateL7policyRequestBody.class),
            f -> f.withMarshaller(CreateL7policyRequest::getBody, CreateL7policyRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateL7ruleRequest, CreateL7ruleResponse> createL7rule = genForCreateL7rule();

    private static HttpRequestDef<CreateL7ruleRequest, CreateL7ruleResponse> genForCreateL7rule() {
        // basic
        HttpRequestDef.Builder<CreateL7ruleRequest, CreateL7ruleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateL7ruleRequest.class, CreateL7ruleResponse.class)
                .withName("CreateL7rule")
                .withUri("/v2/{project_id}/elb/l7policies/{l7policy_id}/rules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("l7policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateL7ruleRequest::getL7policyId, CreateL7ruleRequest::setL7policyId));
        builder.<CreateL7ruleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateL7ruleRequestBody.class),
            f -> f.withMarshaller(CreateL7ruleRequest::getBody, CreateL7ruleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateListenerRequest, CreateListenerResponse> createListener =
        genForCreateListener();

    private static HttpRequestDef<CreateListenerRequest, CreateListenerResponse> genForCreateListener() {
        // basic
        HttpRequestDef.Builder<CreateListenerRequest, CreateListenerResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateListenerRequest.class, CreateListenerResponse.class)
                .withName("CreateListener")
                .withUri("/v2/{project_id}/elb/listeners")
                .withContentType("application/json");

        // requests
        builder.<CreateListenerRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateListenerRequestBody.class),
            f -> f.withMarshaller(CreateListenerRequest::getBody, CreateListenerRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateListenerTagsRequest, CreateListenerTagsResponse> createListenerTags =
        genForCreateListenerTags();

    private static HttpRequestDef<CreateListenerTagsRequest, CreateListenerTagsResponse> genForCreateListenerTags() {
        // basic
        HttpRequestDef.Builder<CreateListenerTagsRequest, CreateListenerTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateListenerTagsRequest.class, CreateListenerTagsResponse.class)
                .withName("CreateListenerTags")
                .withUri("/v2.0/{project_id}/listeners/{listener_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("listener_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateListenerTagsRequest::getListenerId, CreateListenerTagsRequest::setListenerId));
        builder.<CreateListenerTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateListenerTagsRequestBody.class),
            f -> f.withMarshaller(CreateListenerTagsRequest::getBody, CreateListenerTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateLoadbalancerRequest, CreateLoadbalancerResponse> createLoadbalancer =
        genForCreateLoadbalancer();

    private static HttpRequestDef<CreateLoadbalancerRequest, CreateLoadbalancerResponse> genForCreateLoadbalancer() {
        // basic
        HttpRequestDef.Builder<CreateLoadbalancerRequest, CreateLoadbalancerResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateLoadbalancerRequest.class, CreateLoadbalancerResponse.class)
                .withName("CreateLoadbalancer")
                .withUri("/v2/{project_id}/elb/loadbalancers")
                .withContentType("application/json");

        // requests
        builder.<CreateLoadbalancerRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateLoadbalancerRequestBody.class),
            f -> f.withMarshaller(CreateLoadbalancerRequest::getBody, CreateLoadbalancerRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateLoadbalancerTagsRequest, CreateLoadbalancerTagsResponse> createLoadbalancerTags =
        genForCreateLoadbalancerTags();

    private static HttpRequestDef<CreateLoadbalancerTagsRequest, CreateLoadbalancerTagsResponse> genForCreateLoadbalancerTags() {
        // basic
        HttpRequestDef.Builder<CreateLoadbalancerTagsRequest, CreateLoadbalancerTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateLoadbalancerTagsRequest.class, CreateLoadbalancerTagsResponse.class)
            .withName("CreateLoadbalancerTags")
            .withUri("/v2.0/{project_id}/loadbalancers/{loadbalancer_id}/tags")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("loadbalancer_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateLoadbalancerTagsRequest::getLoadbalancerId,
                CreateLoadbalancerTagsRequest::setLoadbalancerId));
        builder.<CreateLoadbalancerTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateLoadbalancerTagsRequestBody.class),
            f -> f.withMarshaller(CreateLoadbalancerTagsRequest::getBody, CreateLoadbalancerTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateMemberRequest, CreateMemberResponse> createMember = genForCreateMember();

    private static HttpRequestDef<CreateMemberRequest, CreateMemberResponse> genForCreateMember() {
        // basic
        HttpRequestDef.Builder<CreateMemberRequest, CreateMemberResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateMemberRequest.class, CreateMemberResponse.class)
                .withName("CreateMember")
                .withUri("/v2/{project_id}/elb/pools/{pool_id}/members")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateMemberRequest::getPoolId, CreateMemberRequest::setPoolId));
        builder.<CreateMemberRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateMemberRequestBody.class),
            f -> f.withMarshaller(CreateMemberRequest::getBody, CreateMemberRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePoolRequest, CreatePoolResponse> createPool = genForCreatePool();

    private static HttpRequestDef<CreatePoolRequest, CreatePoolResponse> genForCreatePool() {
        // basic
        HttpRequestDef.Builder<CreatePoolRequest, CreatePoolResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePoolRequest.class, CreatePoolResponse.class)
                .withName("CreatePool")
                .withUri("/v2/{project_id}/elb/pools")
                .withContentType("application/json");

        // requests
        builder.<CreatePoolRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePoolRequestBody.class),
            f -> f.withMarshaller(CreatePoolRequest::getBody, CreatePoolRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateWhitelistRequest, CreateWhitelistResponse> createWhitelist =
        genForCreateWhitelist();

    private static HttpRequestDef<CreateWhitelistRequest, CreateWhitelistResponse> genForCreateWhitelist() {
        // basic
        HttpRequestDef.Builder<CreateWhitelistRequest, CreateWhitelistResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateWhitelistRequest.class, CreateWhitelistResponse.class)
                .withName("CreateWhitelist")
                .withUri("/v2/{project_id}/elb/whitelists")
                .withContentType("application/json");

        // requests
        builder.<CreateWhitelistRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateWhitelistRequestBody.class),
            f -> f.withMarshaller(CreateWhitelistRequest::getBody, CreateWhitelistRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteHealthmonitorRequest, DeleteHealthmonitorResponse> deleteHealthmonitor =
        genForDeleteHealthmonitor();

    private static HttpRequestDef<DeleteHealthmonitorRequest, DeleteHealthmonitorResponse> genForDeleteHealthmonitor() {
        // basic
        HttpRequestDef.Builder<DeleteHealthmonitorRequest, DeleteHealthmonitorResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteHealthmonitorRequest.class, DeleteHealthmonitorResponse.class)
            .withName("DeleteHealthmonitor")
            .withUri("/v2/{project_id}/elb/healthmonitors/{healthmonitor_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("healthmonitor_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHealthmonitorRequest::getHealthmonitorId,
                DeleteHealthmonitorRequest::setHealthmonitorId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteL7policyRequest, DeleteL7policyResponse> deleteL7policy =
        genForDeleteL7policy();

    private static HttpRequestDef<DeleteL7policyRequest, DeleteL7policyResponse> genForDeleteL7policy() {
        // basic
        HttpRequestDef.Builder<DeleteL7policyRequest, DeleteL7policyResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteL7policyRequest.class, DeleteL7policyResponse.class)
                .withName("DeleteL7policy")
                .withUri("/v2/{project_id}/elb/l7policies/{l7policy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("l7policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteL7policyRequest::getL7policyId, DeleteL7policyRequest::setL7policyId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteL7ruleRequest, DeleteL7ruleResponse> deleteL7rule = genForDeleteL7rule();

    private static HttpRequestDef<DeleteL7ruleRequest, DeleteL7ruleResponse> genForDeleteL7rule() {
        // basic
        HttpRequestDef.Builder<DeleteL7ruleRequest, DeleteL7ruleResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteL7ruleRequest.class, DeleteL7ruleResponse.class)
                .withName("DeleteL7rule")
                .withUri("/v2/{project_id}/elb/l7policies/{l7policy_id}/rules/{l7rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("l7policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteL7ruleRequest::getL7policyId, DeleteL7ruleRequest::setL7policyId));
        builder.<String>withRequestField("l7rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteL7ruleRequest::getL7ruleId, DeleteL7ruleRequest::setL7ruleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteListenerRequest, DeleteListenerResponse> deleteListener =
        genForDeleteListener();

    private static HttpRequestDef<DeleteListenerRequest, DeleteListenerResponse> genForDeleteListener() {
        // basic
        HttpRequestDef.Builder<DeleteListenerRequest, DeleteListenerResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteListenerRequest.class, DeleteListenerResponse.class)
                .withName("DeleteListener")
                .withUri("/v2/{project_id}/elb/listeners/{listener_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("listener_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteListenerRequest::getListenerId, DeleteListenerRequest::setListenerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteListenerTagsRequest, DeleteListenerTagsResponse> deleteListenerTags =
        genForDeleteListenerTags();

    private static HttpRequestDef<DeleteListenerTagsRequest, DeleteListenerTagsResponse> genForDeleteListenerTags() {
        // basic
        HttpRequestDef.Builder<DeleteListenerTagsRequest, DeleteListenerTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteListenerTagsRequest.class, DeleteListenerTagsResponse.class)
                .withName("DeleteListenerTags")
                .withUri("/v2.0/{project_id}/listeners/{listener_id}/tags/{key}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("listener_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteListenerTagsRequest::getListenerId, DeleteListenerTagsRequest::setListenerId));
        builder.<String>withRequestField("key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteListenerTagsRequest::getKey, DeleteListenerTagsRequest::setKey));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteLoadbalancerRequest, DeleteLoadbalancerResponse> deleteLoadbalancer =
        genForDeleteLoadbalancer();

    private static HttpRequestDef<DeleteLoadbalancerRequest, DeleteLoadbalancerResponse> genForDeleteLoadbalancer() {
        // basic
        HttpRequestDef.Builder<DeleteLoadbalancerRequest, DeleteLoadbalancerResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteLoadbalancerRequest.class, DeleteLoadbalancerResponse.class)
                .withName("DeleteLoadbalancer")
                .withUri("/v2/{project_id}/elb/loadbalancers/{loadbalancer_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("loadbalancer_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLoadbalancerRequest::getLoadbalancerId,
                DeleteLoadbalancerRequest::setLoadbalancerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteLoadbalancerTagsRequest, DeleteLoadbalancerTagsResponse> deleteLoadbalancerTags =
        genForDeleteLoadbalancerTags();

    private static HttpRequestDef<DeleteLoadbalancerTagsRequest, DeleteLoadbalancerTagsResponse> genForDeleteLoadbalancerTags() {
        // basic
        HttpRequestDef.Builder<DeleteLoadbalancerTagsRequest, DeleteLoadbalancerTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteLoadbalancerTagsRequest.class, DeleteLoadbalancerTagsResponse.class)
            .withName("DeleteLoadbalancerTags")
            .withUri("/v2.0/{project_id}/loadbalancers/{loadbalancer_id}/tags/{key}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("loadbalancer_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLoadbalancerTagsRequest::getLoadbalancerId,
                DeleteLoadbalancerTagsRequest::setLoadbalancerId));
        builder.<String>withRequestField("key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLoadbalancerTagsRequest::getKey, DeleteLoadbalancerTagsRequest::setKey));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteMemberRequest, DeleteMemberResponse> deleteMember = genForDeleteMember();

    private static HttpRequestDef<DeleteMemberRequest, DeleteMemberResponse> genForDeleteMember() {
        // basic
        HttpRequestDef.Builder<DeleteMemberRequest, DeleteMemberResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteMemberRequest.class, DeleteMemberResponse.class)
                .withName("DeleteMember")
                .withUri("/v2/{project_id}/elb/pools/{pool_id}/members/{member_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteMemberRequest::getPoolId, DeleteMemberRequest::setPoolId));
        builder.<String>withRequestField("member_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteMemberRequest::getMemberId, DeleteMemberRequest::setMemberId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePoolRequest, DeletePoolResponse> deletePool = genForDeletePool();

    private static HttpRequestDef<DeletePoolRequest, DeletePoolResponse> genForDeletePool() {
        // basic
        HttpRequestDef.Builder<DeletePoolRequest, DeletePoolResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePoolRequest.class, DeletePoolResponse.class)
                .withName("DeletePool")
                .withUri("/v2/{project_id}/elb/pools/{pool_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePoolRequest::getPoolId, DeletePoolRequest::setPoolId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteWhitelistRequest, DeleteWhitelistResponse> deleteWhitelist =
        genForDeleteWhitelist();

    private static HttpRequestDef<DeleteWhitelistRequest, DeleteWhitelistResponse> genForDeleteWhitelist() {
        // basic
        HttpRequestDef.Builder<DeleteWhitelistRequest, DeleteWhitelistResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteWhitelistRequest.class, DeleteWhitelistResponse.class)
                .withName("DeleteWhitelist")
                .withUri("/v2/{project_id}/elb/whitelists/{whitelist_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("whitelist_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteWhitelistRequest::getWhitelistId, DeleteWhitelistRequest::setWhitelistId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHealthmonitorsRequest, ListHealthmonitorsResponse> listHealthmonitors =
        genForListHealthmonitors();

    private static HttpRequestDef<ListHealthmonitorsRequest, ListHealthmonitorsResponse> genForListHealthmonitors() {
        // basic
        HttpRequestDef.Builder<ListHealthmonitorsRequest, ListHealthmonitorsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListHealthmonitorsRequest.class, ListHealthmonitorsResponse.class)
                .withName("ListHealthmonitors")
                .withUri("/v2/{project_id}/elb/healthmonitors")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHealthmonitorsRequest::getLimit, ListHealthmonitorsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHealthmonitorsRequest::getMarker, ListHealthmonitorsRequest::setMarker));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListHealthmonitorsRequest::getPageReverse,
                ListHealthmonitorsRequest::setPageReverse));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHealthmonitorsRequest::getId, ListHealthmonitorsRequest::setId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHealthmonitorsRequest::getName, ListHealthmonitorsRequest::setName));
        builder.<Integer>withRequestField("delay",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHealthmonitorsRequest::getDelay, ListHealthmonitorsRequest::setDelay));
        builder.<Integer>withRequestField("max_retries",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHealthmonitorsRequest::getMaxRetries, ListHealthmonitorsRequest::setMaxRetries));
        builder.<Boolean>withRequestField("admin_state_up",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListHealthmonitorsRequest::getAdminStateUp,
                ListHealthmonitorsRequest::setAdminStateUp));
        builder.<Integer>withRequestField("timeout",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHealthmonitorsRequest::getTimeout, ListHealthmonitorsRequest::setTimeout));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHealthmonitorsRequest::getType, ListHealthmonitorsRequest::setType));
        builder.<Integer>withRequestField("monitor_port",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHealthmonitorsRequest::getMonitorPort,
                ListHealthmonitorsRequest::setMonitorPort));
        builder.<String>withRequestField("expected_codes",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHealthmonitorsRequest::getExpectedCodes,
                ListHealthmonitorsRequest::setExpectedCodes));
        builder.<String>withRequestField("domain_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHealthmonitorsRequest::getDomainName, ListHealthmonitorsRequest::setDomainName));
        builder.<String>withRequestField("url_path",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHealthmonitorsRequest::getUrlPath, ListHealthmonitorsRequest::setUrlPath));
        builder.<String>withRequestField("http_method",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHealthmonitorsRequest::getHttpMethod, ListHealthmonitorsRequest::setHttpMethod));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListL7policiesRequest, ListL7policiesResponse> listL7policies =
        genForListL7policies();

    private static HttpRequestDef<ListL7policiesRequest, ListL7policiesResponse> genForListL7policies() {
        // basic
        HttpRequestDef.Builder<ListL7policiesRequest, ListL7policiesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListL7policiesRequest.class, ListL7policiesResponse.class)
                .withName("ListL7policies")
                .withUri("/v2/{project_id}/elb/l7policies")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListL7policiesRequest::getLimit, ListL7policiesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListL7policiesRequest::getMarker, ListL7policiesRequest::setMarker));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListL7policiesRequest::getPageReverse, ListL7policiesRequest::setPageReverse));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListL7policiesRequest::getId, ListL7policiesRequest::setId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListL7policiesRequest::getName, ListL7policiesRequest::setName));
        builder.<String>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListL7policiesRequest::getDescription, ListL7policiesRequest::setDescription));
        builder.<Boolean>withRequestField("admin_state_up",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListL7policiesRequest::getAdminStateUp, ListL7policiesRequest::setAdminStateUp));
        builder.<String>withRequestField("listener_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListL7policiesRequest::getListenerId, ListL7policiesRequest::setListenerId));
        builder.<String>withRequestField("action",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListL7policiesRequest::getAction, ListL7policiesRequest::setAction));
        builder.<String>withRequestField("redirect_pool_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListL7policiesRequest::getRedirectPoolId, ListL7policiesRequest::setRedirectPoolId));
        builder.<String>withRequestField("redirect_listener_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListL7policiesRequest::getRedirectListenerId,
                ListL7policiesRequest::setRedirectListenerId));
        builder.<String>withRequestField("redirect_url",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListL7policiesRequest::getRedirectUrl, ListL7policiesRequest::setRedirectUrl));
        builder.<Integer>withRequestField("position",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListL7policiesRequest::getPosition, ListL7policiesRequest::setPosition));
        builder.<String>withRequestField("provisioning_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListL7policiesRequest::getProvisioningStatus,
                ListL7policiesRequest::setProvisioningStatus));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListL7policiesRequest::getEnterpriseProjectId,
                ListL7policiesRequest::setEnterpriseProjectId));
        builder.<Boolean>withRequestField("display_all_rules",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListL7policiesRequest::getDisplayAllRules,
                ListL7policiesRequest::setDisplayAllRules));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListL7rulesRequest, ListL7rulesResponse> listL7rules = genForListL7rules();

    private static HttpRequestDef<ListL7rulesRequest, ListL7rulesResponse> genForListL7rules() {
        // basic
        HttpRequestDef.Builder<ListL7rulesRequest, ListL7rulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListL7rulesRequest.class, ListL7rulesResponse.class)
                .withName("ListL7rules")
                .withUri("/v2/{project_id}/elb/l7policies/{l7policy_id}/rules")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("l7policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListL7rulesRequest::getL7policyId, ListL7rulesRequest::setL7policyId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListL7rulesRequest::getLimit, ListL7rulesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListL7rulesRequest::getMarker, ListL7rulesRequest::setMarker));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListL7rulesRequest::getPageReverse, ListL7rulesRequest::setPageReverse));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListL7rulesRequest::getId, ListL7rulesRequest::setId));
        builder.<Boolean>withRequestField("admin_state_up",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListL7rulesRequest::getAdminStateUp, ListL7rulesRequest::setAdminStateUp));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListL7rulesRequest::getType, ListL7rulesRequest::setType));
        builder.<String>withRequestField("compare_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListL7rulesRequest::getCompareType, ListL7rulesRequest::setCompareType));
        builder.<Boolean>withRequestField("invert",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListL7rulesRequest::getInvert, ListL7rulesRequest::setInvert));
        builder.<String>withRequestField("key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListL7rulesRequest::getKey, ListL7rulesRequest::setKey));
        builder.<String>withRequestField("value",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListL7rulesRequest::getValue, ListL7rulesRequest::setValue));
        builder.<String>withRequestField("provisioning_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListL7rulesRequest::getProvisioningStatus,
                ListL7rulesRequest::setProvisioningStatus));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListListenerTagsRequest, ListListenerTagsResponse> listListenerTags =
        genForListListenerTags();

    private static HttpRequestDef<ListListenerTagsRequest, ListListenerTagsResponse> genForListListenerTags() {
        // basic
        HttpRequestDef.Builder<ListListenerTagsRequest, ListListenerTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListListenerTagsRequest.class, ListListenerTagsResponse.class)
                .withName("ListListenerTags")
                .withUri("/v2.0/{project_id}/listeners/tags")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListListenersRequest, ListListenersResponse> listListeners =
        genForListListeners();

    private static HttpRequestDef<ListListenersRequest, ListListenersResponse> genForListListeners() {
        // basic
        HttpRequestDef.Builder<ListListenersRequest, ListListenersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListListenersRequest.class, ListListenersResponse.class)
                .withName("ListListeners")
                .withUri("/v2/{project_id}/elb/listeners")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListListenersRequest::getLimit, ListListenersRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListListenersRequest::getMarker, ListListenersRequest::setMarker));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListListenersRequest::getPageReverse, ListListenersRequest::setPageReverse));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListListenersRequest::getId, ListListenersRequest::setId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListListenersRequest::getName, ListListenersRequest::setName));
        builder.<String>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListListenersRequest::getDescription, ListListenersRequest::setDescription));
        builder.<String>withRequestField("loadbalancer_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListListenersRequest::getLoadbalancerId, ListListenersRequest::setLoadbalancerId));
        builder.<Integer>withRequestField("connection_limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListListenersRequest::getConnectionLimit, ListListenersRequest::setConnectionLimit));
        builder.<Boolean>withRequestField("admin_state_up",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListListenersRequest::getAdminStateUp, ListListenersRequest::setAdminStateUp));
        builder.<String>withRequestField("default_pool_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListListenersRequest::getDefaultPoolId, ListListenersRequest::setDefaultPoolId));
        builder.<String>withRequestField("default_tls_container_ref",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListListenersRequest::getDefaultTlsContainerRef,
                ListListenersRequest::setDefaultTlsContainerRef));
        builder.<String>withRequestField("client_ca_tls_container_ref",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListListenersRequest::getClientCaTlsContainerRef,
                ListListenersRequest::setClientCaTlsContainerRef));
        builder.<String>withRequestField("protocol",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListListenersRequest::getProtocol, ListListenersRequest::setProtocol));
        builder.<Integer>withRequestField("protocol_port",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListListenersRequest::getProtocolPort, ListListenersRequest::setProtocolPort));
        builder.<String>withRequestField("tls_ciphers_policy",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListListenersRequest::getTlsCiphersPolicy,
                ListListenersRequest::setTlsCiphersPolicy));
        builder.<String>withRequestField("tls_container_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListListenersRequest::getTlsContainerId, ListListenersRequest::setTlsContainerId));
        builder.<Boolean>withRequestField("http2_enable",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListListenersRequest::getHttp2Enable, ListListenersRequest::setHttp2Enable));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListListenersRequest::getEnterpriseProjectId,
                ListListenersRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListListenersByTagsRequest, ListListenersByTagsResponse> listListenersByTags =
        genForListListenersByTags();

    private static HttpRequestDef<ListListenersByTagsRequest, ListListenersByTagsResponse> genForListListenersByTags() {
        // basic
        HttpRequestDef.Builder<ListListenersByTagsRequest, ListListenersByTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ListListenersByTagsRequest.class, ListListenersByTagsResponse.class)
                .withName("ListListenersByTags")
                .withUri("/v2.0/{project_id}/listeners/resource_instances/action")
                .withContentType("application/json");

        // requests
        builder.<ListListenersByTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListListenersByTagsRequestBody.class),
            f -> f.withMarshaller(ListListenersByTagsRequest::getBody, ListListenersByTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLoadbalancerTagsRequest, ListLoadbalancerTagsResponse> listLoadbalancerTags =
        genForListLoadbalancerTags();

    private static HttpRequestDef<ListLoadbalancerTagsRequest, ListLoadbalancerTagsResponse> genForListLoadbalancerTags() {
        // basic
        HttpRequestDef.Builder<ListLoadbalancerTagsRequest, ListLoadbalancerTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListLoadbalancerTagsRequest.class, ListLoadbalancerTagsResponse.class)
            .withName("ListLoadbalancerTags")
            .withUri("/v2.0/{project_id}/loadbalancers/tags")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLoadbalancersRequest, ListLoadbalancersResponse> listLoadbalancers =
        genForListLoadbalancers();

    private static HttpRequestDef<ListLoadbalancersRequest, ListLoadbalancersResponse> genForListLoadbalancers() {
        // basic
        HttpRequestDef.Builder<ListLoadbalancersRequest, ListLoadbalancersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListLoadbalancersRequest.class, ListLoadbalancersResponse.class)
                .withName("ListLoadbalancers")
                .withUri("/v2/{project_id}/elb/loadbalancers")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListLoadbalancersRequest::getLimit, ListLoadbalancersRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLoadbalancersRequest::getMarker, ListLoadbalancersRequest::setMarker));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListLoadbalancersRequest::getPageReverse, ListLoadbalancersRequest::setPageReverse));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLoadbalancersRequest::getId, ListLoadbalancersRequest::setId));
        builder.<String>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLoadbalancersRequest::getDescription, ListLoadbalancersRequest::setDescription));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLoadbalancersRequest::getName, ListLoadbalancersRequest::setName));
        builder.<String>withRequestField("operating_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLoadbalancersRequest::getOperatingStatus,
                ListLoadbalancersRequest::setOperatingStatus));
        builder.<String>withRequestField("provisioning_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLoadbalancersRequest::getProvisioningStatus,
                ListLoadbalancersRequest::setProvisioningStatus));
        builder.<String>withRequestField("vip_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLoadbalancersRequest::getVipAddress, ListLoadbalancersRequest::setVipAddress));
        builder.<String>withRequestField("vip_port_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLoadbalancersRequest::getVipPortId, ListLoadbalancersRequest::setVipPortId));
        builder.<String>withRequestField("vip_subnet_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLoadbalancersRequest::getVipSubnetId, ListLoadbalancersRequest::setVipSubnetId));
        builder.<String>withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLoadbalancersRequest::getVpcId, ListLoadbalancersRequest::setVpcId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLoadbalancersRequest::getEnterpriseProjectId,
                ListLoadbalancersRequest::setEnterpriseProjectId));
        builder.<Boolean>withRequestField("admin_state_up",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListLoadbalancersRequest::getAdminStateUp,
                ListLoadbalancersRequest::setAdminStateUp));
        builder.<String>withRequestField("member_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLoadbalancersRequest::getMemberAddress,
                ListLoadbalancersRequest::setMemberAddress));
        builder.<String>withRequestField("member_device_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLoadbalancersRequest::getMemberDeviceId,
                ListLoadbalancersRequest::setMemberDeviceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLoadbalancersByTagsRequest, ListLoadbalancersByTagsResponse> listLoadbalancersByTags =
        genForListLoadbalancersByTags();

    private static HttpRequestDef<ListLoadbalancersByTagsRequest, ListLoadbalancersByTagsResponse> genForListLoadbalancersByTags() {
        // basic
        HttpRequestDef.Builder<ListLoadbalancersByTagsRequest, ListLoadbalancersByTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ListLoadbalancersByTagsRequest.class, ListLoadbalancersByTagsResponse.class)
            .withName("ListLoadbalancersByTags")
            .withUri("/v2.0/{project_id}/loadbalancers/resource_instances/action")
            .withContentType("application/json");

        // requests
        builder.<ListLoadbalancersByTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListLoadbalancersByTagsRequestBody.class),
            f -> f.withMarshaller(ListLoadbalancersByTagsRequest::getBody, ListLoadbalancersByTagsRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMembersRequest, ListMembersResponse> listMembers = genForListMembers();

    private static HttpRequestDef<ListMembersRequest, ListMembersResponse> genForListMembers() {
        // basic
        HttpRequestDef.Builder<ListMembersRequest, ListMembersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListMembersRequest.class, ListMembersResponse.class)
                .withName("ListMembers")
                .withUri("/v2/{project_id}/elb/pools/{pool_id}/members")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMembersRequest::getPoolId, ListMembersRequest::setPoolId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMembersRequest::getLimit, ListMembersRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMembersRequest::getMarker, ListMembersRequest::setMarker));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListMembersRequest::getPageReverse, ListMembersRequest::setPageReverse));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMembersRequest::getId, ListMembersRequest::setId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMembersRequest::getName, ListMembersRequest::setName));
        builder.<String>withRequestField("address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMembersRequest::getAddress, ListMembersRequest::setAddress));
        builder.<Integer>withRequestField("protocol_port",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMembersRequest::getProtocolPort, ListMembersRequest::setProtocolPort));
        builder.<String>withRequestField("subnet_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMembersRequest::getSubnetId, ListMembersRequest::setSubnetId));
        builder.<Boolean>withRequestField("admin_state_up",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListMembersRequest::getAdminStateUp, ListMembersRequest::setAdminStateUp));
        builder.<Integer>withRequestField("weight",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMembersRequest::getWeight, ListMembersRequest::setWeight));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMembersRequest::getEnterpriseProjectId,
                ListMembersRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPoolsRequest, ListPoolsResponse> listPools = genForListPools();

    private static HttpRequestDef<ListPoolsRequest, ListPoolsResponse> genForListPools() {
        // basic
        HttpRequestDef.Builder<ListPoolsRequest, ListPoolsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPoolsRequest.class, ListPoolsResponse.class)
                .withName("ListPools")
                .withUri("/v2/{project_id}/elb/pools")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPoolsRequest::getLimit, ListPoolsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPoolsRequest::getMarker, ListPoolsRequest::setMarker));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListPoolsRequest::getPageReverse, ListPoolsRequest::setPageReverse));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPoolsRequest::getId, ListPoolsRequest::setId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPoolsRequest::getName, ListPoolsRequest::setName));
        builder.<String>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPoolsRequest::getDescription, ListPoolsRequest::setDescription));
        builder.<String>withRequestField("healthmonitor_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPoolsRequest::getHealthmonitorId, ListPoolsRequest::setHealthmonitorId));
        builder.<String>withRequestField("loadbalancer_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPoolsRequest::getLoadbalancerId, ListPoolsRequest::setLoadbalancerId));
        builder.<String>withRequestField("protocol",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPoolsRequest::getProtocol, ListPoolsRequest::setProtocol));
        builder.<String>withRequestField("lb_algorithm",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPoolsRequest::getLbAlgorithm, ListPoolsRequest::setLbAlgorithm));
        builder.<String>withRequestField("member_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPoolsRequest::getMemberAddress, ListPoolsRequest::setMemberAddress));
        builder.<String>withRequestField("member_device_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPoolsRequest::getMemberDeviceId, ListPoolsRequest::setMemberDeviceId));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPoolsRequest::getEnterpriseProjectId, ListPoolsRequest::setEnterpriseProjectId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWhitelistsRequest, ListWhitelistsResponse> listWhitelists =
        genForListWhitelists();

    private static HttpRequestDef<ListWhitelistsRequest, ListWhitelistsResponse> genForListWhitelists() {
        // basic
        HttpRequestDef.Builder<ListWhitelistsRequest, ListWhitelistsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListWhitelistsRequest.class, ListWhitelistsResponse.class)
                .withName("ListWhitelists")
                .withUri("/v2/{project_id}/elb/whitelists")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListWhitelistsRequest::getLimit, ListWhitelistsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWhitelistsRequest::getMarker, ListWhitelistsRequest::setMarker));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListWhitelistsRequest::getPageReverse, ListWhitelistsRequest::setPageReverse));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWhitelistsRequest::getId, ListWhitelistsRequest::setId));
        builder.<Boolean>withRequestField("enable_whitelist",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListWhitelistsRequest::getEnableWhitelist,
                ListWhitelistsRequest::setEnableWhitelist));
        builder.<String>withRequestField("listener_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWhitelistsRequest::getListenerId, ListWhitelistsRequest::setListenerId));
        builder.<String>withRequestField("whitelist",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWhitelistsRequest::getWhitelist, ListWhitelistsRequest::setWhitelist));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHealthmonitorsRequest, ShowHealthmonitorsResponse> showHealthmonitors =
        genForShowHealthmonitors();

    private static HttpRequestDef<ShowHealthmonitorsRequest, ShowHealthmonitorsResponse> genForShowHealthmonitors() {
        // basic
        HttpRequestDef.Builder<ShowHealthmonitorsRequest, ShowHealthmonitorsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowHealthmonitorsRequest.class, ShowHealthmonitorsResponse.class)
                .withName("ShowHealthmonitors")
                .withUri("/v2/{project_id}/elb/healthmonitors/{healthmonitor_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("healthmonitor_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowHealthmonitorsRequest::getHealthmonitorId,
                ShowHealthmonitorsRequest::setHealthmonitorId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowL7policyRequest, ShowL7policyResponse> showL7policy = genForShowL7policy();

    private static HttpRequestDef<ShowL7policyRequest, ShowL7policyResponse> genForShowL7policy() {
        // basic
        HttpRequestDef.Builder<ShowL7policyRequest, ShowL7policyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowL7policyRequest.class, ShowL7policyResponse.class)
                .withName("ShowL7policy")
                .withUri("/v2/{project_id}/elb/l7policies/{l7policy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("l7policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowL7policyRequest::getL7policyId, ShowL7policyRequest::setL7policyId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowL7ruleRequest, ShowL7ruleResponse> showL7rule = genForShowL7rule();

    private static HttpRequestDef<ShowL7ruleRequest, ShowL7ruleResponse> genForShowL7rule() {
        // basic
        HttpRequestDef.Builder<ShowL7ruleRequest, ShowL7ruleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowL7ruleRequest.class, ShowL7ruleResponse.class)
                .withName("ShowL7rule")
                .withUri("/v2/{project_id}/elb/l7policies/{l7policy_id}/rules/{l7rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("l7policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowL7ruleRequest::getL7policyId, ShowL7ruleRequest::setL7policyId));
        builder.<String>withRequestField("l7rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowL7ruleRequest::getL7ruleId, ShowL7ruleRequest::setL7ruleId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowListenerRequest, ShowListenerResponse> showListener = genForShowListener();

    private static HttpRequestDef<ShowListenerRequest, ShowListenerResponse> genForShowListener() {
        // basic
        HttpRequestDef.Builder<ShowListenerRequest, ShowListenerResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowListenerRequest.class, ShowListenerResponse.class)
                .withName("ShowListener")
                .withUri("/v2/{project_id}/elb/listeners/{listener_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("listener_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowListenerRequest::getListenerId, ShowListenerRequest::setListenerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowListenerTagsRequest, ShowListenerTagsResponse> showListenerTags =
        genForShowListenerTags();

    private static HttpRequestDef<ShowListenerTagsRequest, ShowListenerTagsResponse> genForShowListenerTags() {
        // basic
        HttpRequestDef.Builder<ShowListenerTagsRequest, ShowListenerTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowListenerTagsRequest.class, ShowListenerTagsResponse.class)
                .withName("ShowListenerTags")
                .withUri("/v2.0/{project_id}/listeners/{listener_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("listener_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowListenerTagsRequest::getListenerId, ShowListenerTagsRequest::setListenerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLoadbalancerRequest, ShowLoadbalancerResponse> showLoadbalancer =
        genForShowLoadbalancer();

    private static HttpRequestDef<ShowLoadbalancerRequest, ShowLoadbalancerResponse> genForShowLoadbalancer() {
        // basic
        HttpRequestDef.Builder<ShowLoadbalancerRequest, ShowLoadbalancerResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowLoadbalancerRequest.class, ShowLoadbalancerResponse.class)
                .withName("ShowLoadbalancer")
                .withUri("/v2/{project_id}/elb/loadbalancers/{loadbalancer_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("loadbalancer_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLoadbalancerRequest::getLoadbalancerId,
                ShowLoadbalancerRequest::setLoadbalancerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLoadbalancerTagsRequest, ShowLoadbalancerTagsResponse> showLoadbalancerTags =
        genForShowLoadbalancerTags();

    private static HttpRequestDef<ShowLoadbalancerTagsRequest, ShowLoadbalancerTagsResponse> genForShowLoadbalancerTags() {
        // basic
        HttpRequestDef.Builder<ShowLoadbalancerTagsRequest, ShowLoadbalancerTagsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowLoadbalancerTagsRequest.class, ShowLoadbalancerTagsResponse.class)
            .withName("ShowLoadbalancerTags")
            .withUri("/v2.0/{project_id}/loadbalancers/{loadbalancer_id}/tags")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("loadbalancer_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLoadbalancerTagsRequest::getLoadbalancerId,
                ShowLoadbalancerTagsRequest::setLoadbalancerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLoadbalancersStatusRequest, ShowLoadbalancersStatusResponse> showLoadbalancersStatus =
        genForShowLoadbalancersStatus();

    private static HttpRequestDef<ShowLoadbalancersStatusRequest, ShowLoadbalancersStatusResponse> genForShowLoadbalancersStatus() {
        // basic
        HttpRequestDef.Builder<ShowLoadbalancersStatusRequest, ShowLoadbalancersStatusResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowLoadbalancersStatusRequest.class, ShowLoadbalancersStatusResponse.class)
            .withName("ShowLoadbalancersStatus")
            .withUri("/v2/{project_id}/elb/loadbalancers/{loadbalancer_id}/statuses")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("loadbalancer_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLoadbalancersStatusRequest::getLoadbalancerId,
                ShowLoadbalancersStatusRequest::setLoadbalancerId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMemberRequest, ShowMemberResponse> showMember = genForShowMember();

    private static HttpRequestDef<ShowMemberRequest, ShowMemberResponse> genForShowMember() {
        // basic
        HttpRequestDef.Builder<ShowMemberRequest, ShowMemberResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowMemberRequest.class, ShowMemberResponse.class)
                .withName("ShowMember")
                .withUri("/v2/{project_id}/elb/pools/{pool_id}/members/{member_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMemberRequest::getPoolId, ShowMemberRequest::setPoolId));
        builder.<String>withRequestField("member_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMemberRequest::getMemberId, ShowMemberRequest::setMemberId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPoolRequest, ShowPoolResponse> showPool = genForShowPool();

    private static HttpRequestDef<ShowPoolRequest, ShowPoolResponse> genForShowPool() {
        // basic
        HttpRequestDef.Builder<ShowPoolRequest, ShowPoolResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPoolRequest.class, ShowPoolResponse.class)
                .withName("ShowPool")
                .withUri("/v2/{project_id}/elb/pools/{pool_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowPoolRequest::getPoolId, ShowPoolRequest::setPoolId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowWhitelistRequest, ShowWhitelistResponse> showWhitelist =
        genForShowWhitelist();

    private static HttpRequestDef<ShowWhitelistRequest, ShowWhitelistResponse> genForShowWhitelist() {
        // basic
        HttpRequestDef.Builder<ShowWhitelistRequest, ShowWhitelistResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowWhitelistRequest.class, ShowWhitelistResponse.class)
                .withName("ShowWhitelist")
                .withUri("/v2/{project_id}/elb/whitelists/{whitelist_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("whitelist_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowWhitelistRequest::getWhitelistId, ShowWhitelistRequest::setWhitelistId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateHealthmonitorRequest, UpdateHealthmonitorResponse> updateHealthmonitor =
        genForUpdateHealthmonitor();

    private static HttpRequestDef<UpdateHealthmonitorRequest, UpdateHealthmonitorResponse> genForUpdateHealthmonitor() {
        // basic
        HttpRequestDef.Builder<UpdateHealthmonitorRequest, UpdateHealthmonitorResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateHealthmonitorRequest.class, UpdateHealthmonitorResponse.class)
                .withName("UpdateHealthmonitor")
                .withUri("/v2/{project_id}/elb/healthmonitors/{healthmonitor_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("healthmonitor_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHealthmonitorRequest::getHealthmonitorId,
                UpdateHealthmonitorRequest::setHealthmonitorId));
        builder.<UpdateHealthmonitorRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateHealthmonitorRequestBody.class),
            f -> f.withMarshaller(UpdateHealthmonitorRequest::getBody, UpdateHealthmonitorRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateL7policiesRequest, UpdateL7policiesResponse> updateL7policies =
        genForUpdateL7policies();

    private static HttpRequestDef<UpdateL7policiesRequest, UpdateL7policiesResponse> genForUpdateL7policies() {
        // basic
        HttpRequestDef.Builder<UpdateL7policiesRequest, UpdateL7policiesResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateL7policiesRequest.class, UpdateL7policiesResponse.class)
                .withName("UpdateL7policies")
                .withUri("/v2/{project_id}/elb/l7policies/{l7policy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("l7policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateL7policiesRequest::getL7policyId, UpdateL7policiesRequest::setL7policyId));
        builder.<UpdateL7policiesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateL7policiesRequestBody.class),
            f -> f.withMarshaller(UpdateL7policiesRequest::getBody, UpdateL7policiesRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateL7ruleRequest, UpdateL7ruleResponse> updateL7rule = genForUpdateL7rule();

    private static HttpRequestDef<UpdateL7ruleRequest, UpdateL7ruleResponse> genForUpdateL7rule() {
        // basic
        HttpRequestDef.Builder<UpdateL7ruleRequest, UpdateL7ruleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateL7ruleRequest.class, UpdateL7ruleResponse.class)
                .withName("UpdateL7rule")
                .withUri("/v2/{project_id}/elb/l7policies/{l7policy_id}/rules/{l7rule_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("l7policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateL7ruleRequest::getL7policyId, UpdateL7ruleRequest::setL7policyId));
        builder.<String>withRequestField("l7rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateL7ruleRequest::getL7ruleId, UpdateL7ruleRequest::setL7ruleId));
        builder.<UpdateL7ruleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateL7ruleRequestBody.class),
            f -> f.withMarshaller(UpdateL7ruleRequest::getBody, UpdateL7ruleRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateListenerRequest, UpdateListenerResponse> updateListener =
        genForUpdateListener();

    private static HttpRequestDef<UpdateListenerRequest, UpdateListenerResponse> genForUpdateListener() {
        // basic
        HttpRequestDef.Builder<UpdateListenerRequest, UpdateListenerResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateListenerRequest.class, UpdateListenerResponse.class)
                .withName("UpdateListener")
                .withUri("/v2/{project_id}/elb/listeners/{listener_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("listener_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateListenerRequest::getListenerId, UpdateListenerRequest::setListenerId));
        builder.<UpdateListenerRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateListenerRequestBody.class),
            f -> f.withMarshaller(UpdateListenerRequest::getBody, UpdateListenerRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateLoadbalancerRequest, UpdateLoadbalancerResponse> updateLoadbalancer =
        genForUpdateLoadbalancer();

    private static HttpRequestDef<UpdateLoadbalancerRequest, UpdateLoadbalancerResponse> genForUpdateLoadbalancer() {
        // basic
        HttpRequestDef.Builder<UpdateLoadbalancerRequest, UpdateLoadbalancerResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateLoadbalancerRequest.class, UpdateLoadbalancerResponse.class)
                .withName("UpdateLoadbalancer")
                .withUri("/v2/{project_id}/elb/loadbalancers/{loadbalancer_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("loadbalancer_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateLoadbalancerRequest::getLoadbalancerId,
                UpdateLoadbalancerRequest::setLoadbalancerId));
        builder.<UpdateLoadbalancerRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateLoadbalancerRequestBody.class),
            f -> f.withMarshaller(UpdateLoadbalancerRequest::getBody, UpdateLoadbalancerRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateMemberRequest, UpdateMemberResponse> updateMember = genForUpdateMember();

    private static HttpRequestDef<UpdateMemberRequest, UpdateMemberResponse> genForUpdateMember() {
        // basic
        HttpRequestDef.Builder<UpdateMemberRequest, UpdateMemberResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateMemberRequest.class, UpdateMemberResponse.class)
                .withName("UpdateMember")
                .withUri("/v2/{project_id}/elb/pools/{pool_id}/members/{member_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("member_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMemberRequest::getMemberId, UpdateMemberRequest::setMemberId));
        builder.<String>withRequestField("pool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMemberRequest::getPoolId, UpdateMemberRequest::setPoolId));
        builder.<UpdateMemberRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateMemberRequestBody.class),
            f -> f.withMarshaller(UpdateMemberRequest::getBody, UpdateMemberRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePoolRequest, UpdatePoolResponse> updatePool = genForUpdatePool();

    private static HttpRequestDef<UpdatePoolRequest, UpdatePoolResponse> genForUpdatePool() {
        // basic
        HttpRequestDef.Builder<UpdatePoolRequest, UpdatePoolResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePoolRequest.class, UpdatePoolResponse.class)
                .withName("UpdatePool")
                .withUri("/v2/{project_id}/elb/pools/{pool_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("pool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePoolRequest::getPoolId, UpdatePoolRequest::setPoolId));
        builder.<UpdatePoolRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePoolRequestBody.class),
            f -> f.withMarshaller(UpdatePoolRequest::getBody, UpdatePoolRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateWhitelistRequest, UpdateWhitelistResponse> updateWhitelist =
        genForUpdateWhitelist();

    private static HttpRequestDef<UpdateWhitelistRequest, UpdateWhitelistResponse> genForUpdateWhitelist() {
        // basic
        HttpRequestDef.Builder<UpdateWhitelistRequest, UpdateWhitelistResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateWhitelistRequest.class, UpdateWhitelistResponse.class)
                .withName("UpdateWhitelist")
                .withUri("/v2/{project_id}/elb/whitelists/{whitelist_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("whitelist_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateWhitelistRequest::getWhitelistId, UpdateWhitelistRequest::setWhitelistId));
        builder.<UpdateWhitelistRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateWhitelistRequestBody.class),
            f -> f.withMarshaller(UpdateWhitelistRequest::getBody, UpdateWhitelistRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCertificateRequest, CreateCertificateResponse> createCertificate =
        genForCreateCertificate();

    private static HttpRequestDef<CreateCertificateRequest, CreateCertificateResponse> genForCreateCertificate() {
        // basic
        HttpRequestDef.Builder<CreateCertificateRequest, CreateCertificateResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCertificateRequest.class, CreateCertificateResponse.class)
                .withName("CreateCertificate")
                .withUri("/v2/{project_id}/elb/certificates")
                .withContentType("application/json");

        // requests
        builder.<CreateCertificateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateCertificateRequestBody.class),
            f -> f.withMarshaller(CreateCertificateRequest::getBody, CreateCertificateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCertificateRequest, DeleteCertificateResponse> deleteCertificate =
        genForDeleteCertificate();

    private static HttpRequestDef<DeleteCertificateRequest, DeleteCertificateResponse> genForDeleteCertificate() {
        // basic
        HttpRequestDef.Builder<DeleteCertificateRequest, DeleteCertificateResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteCertificateRequest.class, DeleteCertificateResponse.class)
                .withName("DeleteCertificate")
                .withUri("/v2/{project_id}/elb/certificates/{certificate_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCertificateRequest::getCertificateId,
                DeleteCertificateRequest::setCertificateId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCertificatesRequest, ListCertificatesResponse> listCertificates =
        genForListCertificates();

    private static HttpRequestDef<ListCertificatesRequest, ListCertificatesResponse> genForListCertificates() {
        // basic
        HttpRequestDef.Builder<ListCertificatesRequest, ListCertificatesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCertificatesRequest.class, ListCertificatesResponse.class)
                .withName("ListCertificates")
                .withUri("/v2/{project_id}/elb/certificates")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCertificatesRequest::getLimit, ListCertificatesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertificatesRequest::getMarker, ListCertificatesRequest::setMarker));
        builder.<String>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertificatesRequest::getPageReverse, ListCertificatesRequest::setPageReverse));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertificatesRequest::getId, ListCertificatesRequest::setId));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertificatesRequest::getName, ListCertificatesRequest::setName));
        builder.<String>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertificatesRequest::getDescription, ListCertificatesRequest::setDescription));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertificatesRequest::getType, ListCertificatesRequest::setType));
        builder.<String>withRequestField("domain",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertificatesRequest::getDomain, ListCertificatesRequest::setDomain));
        builder.<String>withRequestField("private_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertificatesRequest::getPrivateKey, ListCertificatesRequest::setPrivateKey));
        builder.<String>withRequestField("certificate",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertificatesRequest::getCertificate, ListCertificatesRequest::setCertificate));
        builder.<String>withRequestField("source",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertificatesRequest::getSource, ListCertificatesRequest::setSource));
        builder.<ListCertificatesRequest.ProtectionStatusEnum>withRequestField("protection_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListCertificatesRequest.ProtectionStatusEnum.class),
            f -> f.withMarshaller(ListCertificatesRequest::getProtectionStatus,
                ListCertificatesRequest::setProtectionStatus));
        builder.<String>withRequestField("protection_reason",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertificatesRequest::getProtectionReason,
                ListCertificatesRequest::setProtectionReason));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCertificateRequest, ShowCertificateResponse> showCertificate =
        genForShowCertificate();

    private static HttpRequestDef<ShowCertificateRequest, ShowCertificateResponse> genForShowCertificate() {
        // basic
        HttpRequestDef.Builder<ShowCertificateRequest, ShowCertificateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCertificateRequest.class, ShowCertificateResponse.class)
                .withName("ShowCertificate")
                .withUri("/v2/{project_id}/elb/certificates/{certificate_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowCertificateRequest::getCertificateId, ShowCertificateRequest::setCertificateId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCertificateRequest, UpdateCertificateResponse> updateCertificate =
        genForUpdateCertificate();

    private static HttpRequestDef<UpdateCertificateRequest, UpdateCertificateResponse> genForUpdateCertificate() {
        // basic
        HttpRequestDef.Builder<UpdateCertificateRequest, UpdateCertificateResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateCertificateRequest.class, UpdateCertificateResponse.class)
                .withName("UpdateCertificate")
                .withUri("/v2/{project_id}/elb/certificates/{certificate_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCertificateRequest::getCertificateId,
                UpdateCertificateRequest::setCertificateId));
        builder.<UpdateCertificateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateCertificateRequestBody.class),
            f -> f.withMarshaller(UpdateCertificateRequest::getBody, UpdateCertificateRequest::setBody));

        // response

        return builder.build();
    }

}
