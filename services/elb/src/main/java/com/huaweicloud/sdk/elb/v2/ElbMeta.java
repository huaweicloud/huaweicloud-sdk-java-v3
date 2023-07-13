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
        genForbatchCreateListenerTags();

    private static HttpRequestDef<BatchCreateListenerTagsRequest, BatchCreateListenerTagsResponse> genForbatchCreateListenerTags() {
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
            f -> f.withMarshaller(BatchCreateListenerTagsRequest::getListenerId, (req, v) -> {
                req.setListenerId(v);
            }));
        builder.<BatchCreateListenerTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateListenerTagsRequestBody.class),
            f -> f.withMarshaller(BatchCreateListenerTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchCreateLoadbalancerTagsRequest, BatchCreateLoadbalancerTagsResponse> batchCreateLoadbalancerTags =
        genForbatchCreateLoadbalancerTags();

    private static HttpRequestDef<BatchCreateLoadbalancerTagsRequest, BatchCreateLoadbalancerTagsResponse> genForbatchCreateLoadbalancerTags() {
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
            f -> f.withMarshaller(BatchCreateLoadbalancerTagsRequest::getLoadbalancerId, (req, v) -> {
                req.setLoadbalancerId(v);
            }));
        builder.<BatchCreateLoadbalancerTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchCreateLoadbalancerTagsRequestBody.class),
            f -> f.withMarshaller(BatchCreateLoadbalancerTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteListenerTagsRequest, BatchDeleteListenerTagsResponse> batchDeleteListenerTags =
        genForbatchDeleteListenerTags();

    private static HttpRequestDef<BatchDeleteListenerTagsRequest, BatchDeleteListenerTagsResponse> genForbatchDeleteListenerTags() {
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
            f -> f.withMarshaller(BatchDeleteListenerTagsRequest::getListenerId, (req, v) -> {
                req.setListenerId(v);
            }));
        builder.<BatchDeleteListenerTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteListenerTagsRequestBody.class),
            f -> f.withMarshaller(BatchDeleteListenerTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteLoadbalancerTagsRequest, BatchDeleteLoadbalancerTagsResponse> batchDeleteLoadbalancerTags =
        genForbatchDeleteLoadbalancerTags();

    private static HttpRequestDef<BatchDeleteLoadbalancerTagsRequest, BatchDeleteLoadbalancerTagsResponse> genForbatchDeleteLoadbalancerTags() {
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
            f -> f.withMarshaller(BatchDeleteLoadbalancerTagsRequest::getLoadbalancerId, (req, v) -> {
                req.setLoadbalancerId(v);
            }));
        builder.<BatchDeleteLoadbalancerTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BatchDeleteLoadbalancerTagsRequestBody.class),
            f -> f.withMarshaller(BatchDeleteLoadbalancerTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateHealthmonitorRequest, CreateHealthmonitorResponse> createHealthmonitor =
        genForcreateHealthmonitor();

    private static HttpRequestDef<CreateHealthmonitorRequest, CreateHealthmonitorResponse> genForcreateHealthmonitor() {
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
            f -> f.withMarshaller(CreateHealthmonitorRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateL7policyRequest, CreateL7policyResponse> createL7policy =
        genForcreateL7policy();

    private static HttpRequestDef<CreateL7policyRequest, CreateL7policyResponse> genForcreateL7policy() {
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
            f -> f.withMarshaller(CreateL7policyRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateL7ruleRequest, CreateL7ruleResponse> createL7rule = genForcreateL7rule();

    private static HttpRequestDef<CreateL7ruleRequest, CreateL7ruleResponse> genForcreateL7rule() {
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
            f -> f.withMarshaller(CreateL7ruleRequest::getL7policyId, (req, v) -> {
                req.setL7policyId(v);
            }));
        builder.<CreateL7ruleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateL7ruleRequestBody.class),
            f -> f.withMarshaller(CreateL7ruleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateListenerRequest, CreateListenerResponse> createListener =
        genForcreateListener();

    private static HttpRequestDef<CreateListenerRequest, CreateListenerResponse> genForcreateListener() {
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
            f -> f.withMarshaller(CreateListenerRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateListenerTagsRequest, CreateListenerTagsResponse> createListenerTags =
        genForcreateListenerTags();

    private static HttpRequestDef<CreateListenerTagsRequest, CreateListenerTagsResponse> genForcreateListenerTags() {
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
            f -> f.withMarshaller(CreateListenerTagsRequest::getListenerId, (req, v) -> {
                req.setListenerId(v);
            }));
        builder.<CreateListenerTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateListenerTagsRequestBody.class),
            f -> f.withMarshaller(CreateListenerTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateLoadbalancerRequest, CreateLoadbalancerResponse> createLoadbalancer =
        genForcreateLoadbalancer();

    private static HttpRequestDef<CreateLoadbalancerRequest, CreateLoadbalancerResponse> genForcreateLoadbalancer() {
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
            f -> f.withMarshaller(CreateLoadbalancerRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateLoadbalancerTagsRequest, CreateLoadbalancerTagsResponse> createLoadbalancerTags =
        genForcreateLoadbalancerTags();

    private static HttpRequestDef<CreateLoadbalancerTagsRequest, CreateLoadbalancerTagsResponse> genForcreateLoadbalancerTags() {
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
            f -> f.withMarshaller(CreateLoadbalancerTagsRequest::getLoadbalancerId, (req, v) -> {
                req.setLoadbalancerId(v);
            }));
        builder.<CreateLoadbalancerTagsRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateLoadbalancerTagsRequestBody.class),
            f -> f.withMarshaller(CreateLoadbalancerTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateMemberRequest, CreateMemberResponse> createMember = genForcreateMember();

    private static HttpRequestDef<CreateMemberRequest, CreateMemberResponse> genForcreateMember() {
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
            f -> f.withMarshaller(CreateMemberRequest::getPoolId, (req, v) -> {
                req.setPoolId(v);
            }));
        builder.<CreateMemberRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateMemberRequestBody.class),
            f -> f.withMarshaller(CreateMemberRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePoolRequest, CreatePoolResponse> createPool = genForcreatePool();

    private static HttpRequestDef<CreatePoolRequest, CreatePoolResponse> genForcreatePool() {
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
            f -> f.withMarshaller(CreatePoolRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateWhitelistRequest, CreateWhitelistResponse> createWhitelist =
        genForcreateWhitelist();

    private static HttpRequestDef<CreateWhitelistRequest, CreateWhitelistResponse> genForcreateWhitelist() {
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
            f -> f.withMarshaller(CreateWhitelistRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteHealthmonitorRequest, DeleteHealthmonitorResponse> deleteHealthmonitor =
        genFordeleteHealthmonitor();

    private static HttpRequestDef<DeleteHealthmonitorRequest, DeleteHealthmonitorResponse> genFordeleteHealthmonitor() {
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
            f -> f.withMarshaller(DeleteHealthmonitorRequest::getHealthmonitorId, (req, v) -> {
                req.setHealthmonitorId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteL7policyRequest, DeleteL7policyResponse> deleteL7policy =
        genFordeleteL7policy();

    private static HttpRequestDef<DeleteL7policyRequest, DeleteL7policyResponse> genFordeleteL7policy() {
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
            f -> f.withMarshaller(DeleteL7policyRequest::getL7policyId, (req, v) -> {
                req.setL7policyId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteL7ruleRequest, DeleteL7ruleResponse> deleteL7rule = genFordeleteL7rule();

    private static HttpRequestDef<DeleteL7ruleRequest, DeleteL7ruleResponse> genFordeleteL7rule() {
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
            f -> f.withMarshaller(DeleteL7ruleRequest::getL7policyId, (req, v) -> {
                req.setL7policyId(v);
            }));
        builder.<String>withRequestField("l7rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteL7ruleRequest::getL7ruleId, (req, v) -> {
                req.setL7ruleId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteListenerRequest, DeleteListenerResponse> deleteListener =
        genFordeleteListener();

    private static HttpRequestDef<DeleteListenerRequest, DeleteListenerResponse> genFordeleteListener() {
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
            f -> f.withMarshaller(DeleteListenerRequest::getListenerId, (req, v) -> {
                req.setListenerId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteListenerTagsRequest, DeleteListenerTagsResponse> deleteListenerTags =
        genFordeleteListenerTags();

    private static HttpRequestDef<DeleteListenerTagsRequest, DeleteListenerTagsResponse> genFordeleteListenerTags() {
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
            f -> f.withMarshaller(DeleteListenerTagsRequest::getListenerId, (req, v) -> {
                req.setListenerId(v);
            }));
        builder.<String>withRequestField("key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteListenerTagsRequest::getKey, (req, v) -> {
                req.setKey(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteLoadbalancerRequest, DeleteLoadbalancerResponse> deleteLoadbalancer =
        genFordeleteLoadbalancer();

    private static HttpRequestDef<DeleteLoadbalancerRequest, DeleteLoadbalancerResponse> genFordeleteLoadbalancer() {
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
            f -> f.withMarshaller(DeleteLoadbalancerRequest::getLoadbalancerId, (req, v) -> {
                req.setLoadbalancerId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteLoadbalancerTagsRequest, DeleteLoadbalancerTagsResponse> deleteLoadbalancerTags =
        genFordeleteLoadbalancerTags();

    private static HttpRequestDef<DeleteLoadbalancerTagsRequest, DeleteLoadbalancerTagsResponse> genFordeleteLoadbalancerTags() {
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
            f -> f.withMarshaller(DeleteLoadbalancerTagsRequest::getLoadbalancerId, (req, v) -> {
                req.setLoadbalancerId(v);
            }));
        builder.<String>withRequestField("key",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLoadbalancerTagsRequest::getKey, (req, v) -> {
                req.setKey(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteMemberRequest, DeleteMemberResponse> deleteMember = genFordeleteMember();

    private static HttpRequestDef<DeleteMemberRequest, DeleteMemberResponse> genFordeleteMember() {
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
            f -> f.withMarshaller(DeleteMemberRequest::getPoolId, (req, v) -> {
                req.setPoolId(v);
            }));
        builder.<String>withRequestField("member_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteMemberRequest::getMemberId, (req, v) -> {
                req.setMemberId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePoolRequest, DeletePoolResponse> deletePool = genFordeletePool();

    private static HttpRequestDef<DeletePoolRequest, DeletePoolResponse> genFordeletePool() {
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
            f -> f.withMarshaller(DeletePoolRequest::getPoolId, (req, v) -> {
                req.setPoolId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteWhitelistRequest, DeleteWhitelistResponse> deleteWhitelist =
        genFordeleteWhitelist();

    private static HttpRequestDef<DeleteWhitelistRequest, DeleteWhitelistResponse> genFordeleteWhitelist() {
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
            f -> f.withMarshaller(DeleteWhitelistRequest::getWhitelistId, (req, v) -> {
                req.setWhitelistId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHealthmonitorsRequest, ListHealthmonitorsResponse> listHealthmonitors =
        genForlistHealthmonitors();

    private static HttpRequestDef<ListHealthmonitorsRequest, ListHealthmonitorsResponse> genForlistHealthmonitors() {
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
            f -> f.withMarshaller(ListHealthmonitorsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHealthmonitorsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListHealthmonitorsRequest::getPageReverse, (req, v) -> {
                req.setPageReverse(v);
            }));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHealthmonitorsRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHealthmonitorsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<Integer>withRequestField("delay",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHealthmonitorsRequest::getDelay, (req, v) -> {
                req.setDelay(v);
            }));
        builder.<Integer>withRequestField("max_retries",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHealthmonitorsRequest::getMaxRetries, (req, v) -> {
                req.setMaxRetries(v);
            }));
        builder.<Boolean>withRequestField("admin_state_up",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListHealthmonitorsRequest::getAdminStateUp, (req, v) -> {
                req.setAdminStateUp(v);
            }));
        builder.<Integer>withRequestField("timeout",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHealthmonitorsRequest::getTimeout, (req, v) -> {
                req.setTimeout(v);
            }));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHealthmonitorsRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<Integer>withRequestField("monitor_port",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListHealthmonitorsRequest::getMonitorPort, (req, v) -> {
                req.setMonitorPort(v);
            }));
        builder.<String>withRequestField("expected_codes",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHealthmonitorsRequest::getExpectedCodes, (req, v) -> {
                req.setExpectedCodes(v);
            }));
        builder.<String>withRequestField("domain_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHealthmonitorsRequest::getDomainName, (req, v) -> {
                req.setDomainName(v);
            }));
        builder.<String>withRequestField("url_path",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHealthmonitorsRequest::getUrlPath, (req, v) -> {
                req.setUrlPath(v);
            }));
        builder.<String>withRequestField("http_method",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHealthmonitorsRequest::getHttpMethod, (req, v) -> {
                req.setHttpMethod(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListL7policiesRequest, ListL7policiesResponse> listL7policies =
        genForlistL7policies();

    private static HttpRequestDef<ListL7policiesRequest, ListL7policiesResponse> genForlistL7policies() {
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
            f -> f.withMarshaller(ListL7policiesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListL7policiesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListL7policiesRequest::getPageReverse, (req, v) -> {
                req.setPageReverse(v);
            }));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListL7policiesRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListL7policiesRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListL7policiesRequest::getDescription, (req, v) -> {
                req.setDescription(v);
            }));
        builder.<Boolean>withRequestField("admin_state_up",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListL7policiesRequest::getAdminStateUp, (req, v) -> {
                req.setAdminStateUp(v);
            }));
        builder.<String>withRequestField("listener_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListL7policiesRequest::getListenerId, (req, v) -> {
                req.setListenerId(v);
            }));
        builder.<String>withRequestField("action",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListL7policiesRequest::getAction, (req, v) -> {
                req.setAction(v);
            }));
        builder.<String>withRequestField("redirect_pool_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListL7policiesRequest::getRedirectPoolId, (req, v) -> {
                req.setRedirectPoolId(v);
            }));
        builder.<String>withRequestField("redirect_listener_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListL7policiesRequest::getRedirectListenerId, (req, v) -> {
                req.setRedirectListenerId(v);
            }));
        builder.<String>withRequestField("redirect_url",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListL7policiesRequest::getRedirectUrl, (req, v) -> {
                req.setRedirectUrl(v);
            }));
        builder.<Integer>withRequestField("position",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListL7policiesRequest::getPosition, (req, v) -> {
                req.setPosition(v);
            }));
        builder.<String>withRequestField("provisioning_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListL7policiesRequest::getProvisioningStatus, (req, v) -> {
                req.setProvisioningStatus(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListL7policiesRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<Boolean>withRequestField("display_all_rules",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListL7policiesRequest::getDisplayAllRules, (req, v) -> {
                req.setDisplayAllRules(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListL7rulesRequest, ListL7rulesResponse> listL7rules = genForlistL7rules();

    private static HttpRequestDef<ListL7rulesRequest, ListL7rulesResponse> genForlistL7rules() {
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
            f -> f.withMarshaller(ListL7rulesRequest::getL7policyId, (req, v) -> {
                req.setL7policyId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListL7rulesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListL7rulesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListL7rulesRequest::getPageReverse, (req, v) -> {
                req.setPageReverse(v);
            }));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListL7rulesRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<Boolean>withRequestField("admin_state_up",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListL7rulesRequest::getAdminStateUp, (req, v) -> {
                req.setAdminStateUp(v);
            }));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListL7rulesRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<String>withRequestField("compare_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListL7rulesRequest::getCompareType, (req, v) -> {
                req.setCompareType(v);
            }));
        builder.<Boolean>withRequestField("invert",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListL7rulesRequest::getInvert, (req, v) -> {
                req.setInvert(v);
            }));
        builder.<String>withRequestField("key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListL7rulesRequest::getKey, (req, v) -> {
                req.setKey(v);
            }));
        builder.<String>withRequestField("value",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListL7rulesRequest::getValue, (req, v) -> {
                req.setValue(v);
            }));
        builder.<String>withRequestField("provisioning_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListL7rulesRequest::getProvisioningStatus, (req, v) -> {
                req.setProvisioningStatus(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListListenerTagsRequest, ListListenerTagsResponse> listListenerTags =
        genForlistListenerTags();

    private static HttpRequestDef<ListListenerTagsRequest, ListListenerTagsResponse> genForlistListenerTags() {
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
        genForlistListeners();

    private static HttpRequestDef<ListListenersRequest, ListListenersResponse> genForlistListeners() {
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
            f -> f.withMarshaller(ListListenersRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListListenersRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListListenersRequest::getPageReverse, (req, v) -> {
                req.setPageReverse(v);
            }));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListListenersRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListListenersRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListListenersRequest::getDescription, (req, v) -> {
                req.setDescription(v);
            }));
        builder.<String>withRequestField("loadbalancer_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListListenersRequest::getLoadbalancerId, (req, v) -> {
                req.setLoadbalancerId(v);
            }));
        builder.<Integer>withRequestField("connection_limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListListenersRequest::getConnectionLimit, (req, v) -> {
                req.setConnectionLimit(v);
            }));
        builder.<Boolean>withRequestField("admin_state_up",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListListenersRequest::getAdminStateUp, (req, v) -> {
                req.setAdminStateUp(v);
            }));
        builder.<String>withRequestField("default_pool_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListListenersRequest::getDefaultPoolId, (req, v) -> {
                req.setDefaultPoolId(v);
            }));
        builder.<String>withRequestField("default_tls_container_ref",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListListenersRequest::getDefaultTlsContainerRef, (req, v) -> {
                req.setDefaultTlsContainerRef(v);
            }));
        builder.<String>withRequestField("client_ca_tls_container_ref",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListListenersRequest::getClientCaTlsContainerRef, (req, v) -> {
                req.setClientCaTlsContainerRef(v);
            }));
        builder.<String>withRequestField("protocol",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListListenersRequest::getProtocol, (req, v) -> {
                req.setProtocol(v);
            }));
        builder.<Integer>withRequestField("protocol_port",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListListenersRequest::getProtocolPort, (req, v) -> {
                req.setProtocolPort(v);
            }));
        builder.<String>withRequestField("tls_ciphers_policy",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListListenersRequest::getTlsCiphersPolicy, (req, v) -> {
                req.setTlsCiphersPolicy(v);
            }));
        builder.<String>withRequestField("tls_container_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListListenersRequest::getTlsContainerId, (req, v) -> {
                req.setTlsContainerId(v);
            }));
        builder.<Boolean>withRequestField("http2_enable",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListListenersRequest::getHttp2Enable, (req, v) -> {
                req.setHttp2Enable(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListListenersRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListListenersByTagsRequest, ListListenersByTagsResponse> listListenersByTags =
        genForlistListenersByTags();

    private static HttpRequestDef<ListListenersByTagsRequest, ListListenersByTagsResponse> genForlistListenersByTags() {
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
            f -> f.withMarshaller(ListListenersByTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLoadbalancerTagsRequest, ListLoadbalancerTagsResponse> listLoadbalancerTags =
        genForlistLoadbalancerTags();

    private static HttpRequestDef<ListLoadbalancerTagsRequest, ListLoadbalancerTagsResponse> genForlistLoadbalancerTags() {
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
        genForlistLoadbalancers();

    private static HttpRequestDef<ListLoadbalancersRequest, ListLoadbalancersResponse> genForlistLoadbalancers() {
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
            f -> f.withMarshaller(ListLoadbalancersRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLoadbalancersRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListLoadbalancersRequest::getPageReverse, (req, v) -> {
                req.setPageReverse(v);
            }));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLoadbalancersRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLoadbalancersRequest::getDescription, (req, v) -> {
                req.setDescription(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLoadbalancersRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("operating_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLoadbalancersRequest::getOperatingStatus, (req, v) -> {
                req.setOperatingStatus(v);
            }));
        builder.<String>withRequestField("provisioning_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLoadbalancersRequest::getProvisioningStatus, (req, v) -> {
                req.setProvisioningStatus(v);
            }));
        builder.<String>withRequestField("vip_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLoadbalancersRequest::getVipAddress, (req, v) -> {
                req.setVipAddress(v);
            }));
        builder.<String>withRequestField("vip_port_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLoadbalancersRequest::getVipPortId, (req, v) -> {
                req.setVipPortId(v);
            }));
        builder.<String>withRequestField("vip_subnet_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLoadbalancersRequest::getVipSubnetId, (req, v) -> {
                req.setVipSubnetId(v);
            }));
        builder.<String>withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLoadbalancersRequest::getVpcId, (req, v) -> {
                req.setVpcId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLoadbalancersRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));
        builder.<Boolean>withRequestField("admin_state_up",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListLoadbalancersRequest::getAdminStateUp, (req, v) -> {
                req.setAdminStateUp(v);
            }));
        builder.<String>withRequestField("member_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLoadbalancersRequest::getMemberAddress, (req, v) -> {
                req.setMemberAddress(v);
            }));
        builder.<String>withRequestField("member_device_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLoadbalancersRequest::getMemberDeviceId, (req, v) -> {
                req.setMemberDeviceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLoadbalancersByTagsRequest, ListLoadbalancersByTagsResponse> listLoadbalancersByTags =
        genForlistLoadbalancersByTags();

    private static HttpRequestDef<ListLoadbalancersByTagsRequest, ListLoadbalancersByTagsResponse> genForlistLoadbalancersByTags() {
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
            f -> f.withMarshaller(ListLoadbalancersByTagsRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMembersRequest, ListMembersResponse> listMembers = genForlistMembers();

    private static HttpRequestDef<ListMembersRequest, ListMembersResponse> genForlistMembers() {
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
            f -> f.withMarshaller(ListMembersRequest::getPoolId, (req, v) -> {
                req.setPoolId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMembersRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMembersRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListMembersRequest::getPageReverse, (req, v) -> {
                req.setPageReverse(v);
            }));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMembersRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMembersRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMembersRequest::getAddress, (req, v) -> {
                req.setAddress(v);
            }));
        builder.<Integer>withRequestField("protocol_port",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMembersRequest::getProtocolPort, (req, v) -> {
                req.setProtocolPort(v);
            }));
        builder.<String>withRequestField("subnet_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMembersRequest::getSubnetId, (req, v) -> {
                req.setSubnetId(v);
            }));
        builder.<Boolean>withRequestField("admin_state_up",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListMembersRequest::getAdminStateUp, (req, v) -> {
                req.setAdminStateUp(v);
            }));
        builder.<Integer>withRequestField("weight",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMembersRequest::getWeight, (req, v) -> {
                req.setWeight(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPoolsRequest, ListPoolsResponse> listPools = genForlistPools();

    private static HttpRequestDef<ListPoolsRequest, ListPoolsResponse> genForlistPools() {
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
            f -> f.withMarshaller(ListPoolsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPoolsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListPoolsRequest::getPageReverse, (req, v) -> {
                req.setPageReverse(v);
            }));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPoolsRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPoolsRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPoolsRequest::getDescription, (req, v) -> {
                req.setDescription(v);
            }));
        builder.<String>withRequestField("healthmonitor_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPoolsRequest::getHealthmonitorId, (req, v) -> {
                req.setHealthmonitorId(v);
            }));
        builder.<String>withRequestField("loadbalancer_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPoolsRequest::getLoadbalancerId, (req, v) -> {
                req.setLoadbalancerId(v);
            }));
        builder.<String>withRequestField("protocol",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPoolsRequest::getProtocol, (req, v) -> {
                req.setProtocol(v);
            }));
        builder.<String>withRequestField("lb_algorithm",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPoolsRequest::getLbAlgorithm, (req, v) -> {
                req.setLbAlgorithm(v);
            }));
        builder.<String>withRequestField("member_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPoolsRequest::getMemberAddress, (req, v) -> {
                req.setMemberAddress(v);
            }));
        builder.<String>withRequestField("member_device_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPoolsRequest::getMemberDeviceId, (req, v) -> {
                req.setMemberDeviceId(v);
            }));
        builder.<String>withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPoolsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWhitelistsRequest, ListWhitelistsResponse> listWhitelists =
        genForlistWhitelists();

    private static HttpRequestDef<ListWhitelistsRequest, ListWhitelistsResponse> genForlistWhitelists() {
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
            f -> f.withMarshaller(ListWhitelistsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWhitelistsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<Boolean>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListWhitelistsRequest::getPageReverse, (req, v) -> {
                req.setPageReverse(v);
            }));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWhitelistsRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<Boolean>withRequestField("enable_whitelist",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListWhitelistsRequest::getEnableWhitelist, (req, v) -> {
                req.setEnableWhitelist(v);
            }));
        builder.<String>withRequestField("listener_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWhitelistsRequest::getListenerId, (req, v) -> {
                req.setListenerId(v);
            }));
        builder.<String>withRequestField("whitelist",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListWhitelistsRequest::getWhitelist, (req, v) -> {
                req.setWhitelist(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHealthmonitorsRequest, ShowHealthmonitorsResponse> showHealthmonitors =
        genForshowHealthmonitors();

    private static HttpRequestDef<ShowHealthmonitorsRequest, ShowHealthmonitorsResponse> genForshowHealthmonitors() {
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
            f -> f.withMarshaller(ShowHealthmonitorsRequest::getHealthmonitorId, (req, v) -> {
                req.setHealthmonitorId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowL7policyRequest, ShowL7policyResponse> showL7policy = genForshowL7policy();

    private static HttpRequestDef<ShowL7policyRequest, ShowL7policyResponse> genForshowL7policy() {
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
            f -> f.withMarshaller(ShowL7policyRequest::getL7policyId, (req, v) -> {
                req.setL7policyId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowL7ruleRequest, ShowL7ruleResponse> showL7rule = genForshowL7rule();

    private static HttpRequestDef<ShowL7ruleRequest, ShowL7ruleResponse> genForshowL7rule() {
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
            f -> f.withMarshaller(ShowL7ruleRequest::getL7policyId, (req, v) -> {
                req.setL7policyId(v);
            }));
        builder.<String>withRequestField("l7rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowL7ruleRequest::getL7ruleId, (req, v) -> {
                req.setL7ruleId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowListenerRequest, ShowListenerResponse> showListener = genForshowListener();

    private static HttpRequestDef<ShowListenerRequest, ShowListenerResponse> genForshowListener() {
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
            f -> f.withMarshaller(ShowListenerRequest::getListenerId, (req, v) -> {
                req.setListenerId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowListenerTagsRequest, ShowListenerTagsResponse> showListenerTags =
        genForshowListenerTags();

    private static HttpRequestDef<ShowListenerTagsRequest, ShowListenerTagsResponse> genForshowListenerTags() {
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
            f -> f.withMarshaller(ShowListenerTagsRequest::getListenerId, (req, v) -> {
                req.setListenerId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLoadbalancerRequest, ShowLoadbalancerResponse> showLoadbalancer =
        genForshowLoadbalancer();

    private static HttpRequestDef<ShowLoadbalancerRequest, ShowLoadbalancerResponse> genForshowLoadbalancer() {
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
            f -> f.withMarshaller(ShowLoadbalancerRequest::getLoadbalancerId, (req, v) -> {
                req.setLoadbalancerId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLoadbalancerTagsRequest, ShowLoadbalancerTagsResponse> showLoadbalancerTags =
        genForshowLoadbalancerTags();

    private static HttpRequestDef<ShowLoadbalancerTagsRequest, ShowLoadbalancerTagsResponse> genForshowLoadbalancerTags() {
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
            f -> f.withMarshaller(ShowLoadbalancerTagsRequest::getLoadbalancerId, (req, v) -> {
                req.setLoadbalancerId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLoadbalancersStatusRequest, ShowLoadbalancersStatusResponse> showLoadbalancersStatus =
        genForshowLoadbalancersStatus();

    private static HttpRequestDef<ShowLoadbalancersStatusRequest, ShowLoadbalancersStatusResponse> genForshowLoadbalancersStatus() {
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
            f -> f.withMarshaller(ShowLoadbalancersStatusRequest::getLoadbalancerId, (req, v) -> {
                req.setLoadbalancerId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMemberRequest, ShowMemberResponse> showMember = genForshowMember();

    private static HttpRequestDef<ShowMemberRequest, ShowMemberResponse> genForshowMember() {
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
            f -> f.withMarshaller(ShowMemberRequest::getPoolId, (req, v) -> {
                req.setPoolId(v);
            }));
        builder.<String>withRequestField("member_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowMemberRequest::getMemberId, (req, v) -> {
                req.setMemberId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPoolRequest, ShowPoolResponse> showPool = genForshowPool();

    private static HttpRequestDef<ShowPoolRequest, ShowPoolResponse> genForshowPool() {
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
            f -> f.withMarshaller(ShowPoolRequest::getPoolId, (req, v) -> {
                req.setPoolId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowWhitelistRequest, ShowWhitelistResponse> showWhitelist =
        genForshowWhitelist();

    private static HttpRequestDef<ShowWhitelistRequest, ShowWhitelistResponse> genForshowWhitelist() {
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
            f -> f.withMarshaller(ShowWhitelistRequest::getWhitelistId, (req, v) -> {
                req.setWhitelistId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateHealthmonitorRequest, UpdateHealthmonitorResponse> updateHealthmonitor =
        genForupdateHealthmonitor();

    private static HttpRequestDef<UpdateHealthmonitorRequest, UpdateHealthmonitorResponse> genForupdateHealthmonitor() {
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
            f -> f.withMarshaller(UpdateHealthmonitorRequest::getHealthmonitorId, (req, v) -> {
                req.setHealthmonitorId(v);
            }));
        builder.<UpdateHealthmonitorRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateHealthmonitorRequestBody.class),
            f -> f.withMarshaller(UpdateHealthmonitorRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateL7policiesRequest, UpdateL7policiesResponse> updateL7policies =
        genForupdateL7policies();

    private static HttpRequestDef<UpdateL7policiesRequest, UpdateL7policiesResponse> genForupdateL7policies() {
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
            f -> f.withMarshaller(UpdateL7policiesRequest::getL7policyId, (req, v) -> {
                req.setL7policyId(v);
            }));
        builder.<UpdateL7policiesRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateL7policiesRequestBody.class),
            f -> f.withMarshaller(UpdateL7policiesRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateL7ruleRequest, UpdateL7ruleResponse> updateL7rule = genForupdateL7rule();

    private static HttpRequestDef<UpdateL7ruleRequest, UpdateL7ruleResponse> genForupdateL7rule() {
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
            f -> f.withMarshaller(UpdateL7ruleRequest::getL7policyId, (req, v) -> {
                req.setL7policyId(v);
            }));
        builder.<String>withRequestField("l7rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateL7ruleRequest::getL7ruleId, (req, v) -> {
                req.setL7ruleId(v);
            }));
        builder.<UpdateL7ruleRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateL7ruleRequestBody.class),
            f -> f.withMarshaller(UpdateL7ruleRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateListenerRequest, UpdateListenerResponse> updateListener =
        genForupdateListener();

    private static HttpRequestDef<UpdateListenerRequest, UpdateListenerResponse> genForupdateListener() {
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
            f -> f.withMarshaller(UpdateListenerRequest::getListenerId, (req, v) -> {
                req.setListenerId(v);
            }));
        builder.<UpdateListenerRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateListenerRequestBody.class),
            f -> f.withMarshaller(UpdateListenerRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateLoadbalancerRequest, UpdateLoadbalancerResponse> updateLoadbalancer =
        genForupdateLoadbalancer();

    private static HttpRequestDef<UpdateLoadbalancerRequest, UpdateLoadbalancerResponse> genForupdateLoadbalancer() {
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
            f -> f.withMarshaller(UpdateLoadbalancerRequest::getLoadbalancerId, (req, v) -> {
                req.setLoadbalancerId(v);
            }));
        builder.<UpdateLoadbalancerRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateLoadbalancerRequestBody.class),
            f -> f.withMarshaller(UpdateLoadbalancerRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateMemberRequest, UpdateMemberResponse> updateMember = genForupdateMember();

    private static HttpRequestDef<UpdateMemberRequest, UpdateMemberResponse> genForupdateMember() {
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
            f -> f.withMarshaller(UpdateMemberRequest::getMemberId, (req, v) -> {
                req.setMemberId(v);
            }));
        builder.<String>withRequestField("pool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMemberRequest::getPoolId, (req, v) -> {
                req.setPoolId(v);
            }));
        builder.<UpdateMemberRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateMemberRequestBody.class),
            f -> f.withMarshaller(UpdateMemberRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePoolRequest, UpdatePoolResponse> updatePool = genForupdatePool();

    private static HttpRequestDef<UpdatePoolRequest, UpdatePoolResponse> genForupdatePool() {
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
            f -> f.withMarshaller(UpdatePoolRequest::getPoolId, (req, v) -> {
                req.setPoolId(v);
            }));
        builder.<UpdatePoolRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePoolRequestBody.class),
            f -> f.withMarshaller(UpdatePoolRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateWhitelistRequest, UpdateWhitelistResponse> updateWhitelist =
        genForupdateWhitelist();

    private static HttpRequestDef<UpdateWhitelistRequest, UpdateWhitelistResponse> genForupdateWhitelist() {
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
            f -> f.withMarshaller(UpdateWhitelistRequest::getWhitelistId, (req, v) -> {
                req.setWhitelistId(v);
            }));
        builder.<UpdateWhitelistRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateWhitelistRequestBody.class),
            f -> f.withMarshaller(UpdateWhitelistRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCertificateRequest, CreateCertificateResponse> createCertificate =
        genForcreateCertificate();

    private static HttpRequestDef<CreateCertificateRequest, CreateCertificateResponse> genForcreateCertificate() {
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
            f -> f.withMarshaller(CreateCertificateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCertificateRequest, DeleteCertificateResponse> deleteCertificate =
        genFordeleteCertificate();

    private static HttpRequestDef<DeleteCertificateRequest, DeleteCertificateResponse> genFordeleteCertificate() {
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
            f -> f.withMarshaller(DeleteCertificateRequest::getCertificateId, (req, v) -> {
                req.setCertificateId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCertificatesRequest, ListCertificatesResponse> listCertificates =
        genForlistCertificates();

    private static HttpRequestDef<ListCertificatesRequest, ListCertificatesResponse> genForlistCertificates() {
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
            f -> f.withMarshaller(ListCertificatesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertificatesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            }));
        builder.<String>withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertificatesRequest::getPageReverse, (req, v) -> {
                req.setPageReverse(v);
            }));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertificatesRequest::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertificatesRequest::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertificatesRequest::getDescription, (req, v) -> {
                req.setDescription(v);
            }));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertificatesRequest::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<String>withRequestField("domain",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertificatesRequest::getDomain, (req, v) -> {
                req.setDomain(v);
            }));
        builder.<String>withRequestField("private_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertificatesRequest::getPrivateKey, (req, v) -> {
                req.setPrivateKey(v);
            }));
        builder.<String>withRequestField("certificate",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertificatesRequest::getCertificate, (req, v) -> {
                req.setCertificate(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCertificateRequest, ShowCertificateResponse> showCertificate =
        genForshowCertificate();

    private static HttpRequestDef<ShowCertificateRequest, ShowCertificateResponse> genForshowCertificate() {
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
            f -> f.withMarshaller(ShowCertificateRequest::getCertificateId, (req, v) -> {
                req.setCertificateId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCertificateRequest, UpdateCertificateResponse> updateCertificate =
        genForupdateCertificate();

    private static HttpRequestDef<UpdateCertificateRequest, UpdateCertificateResponse> genForupdateCertificate() {
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
            f -> f.withMarshaller(UpdateCertificateRequest::getCertificateId, (req, v) -> {
                req.setCertificateId(v);
            }));
        builder.<UpdateCertificateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateCertificateRequestBody.class),
            f -> f.withMarshaller(UpdateCertificateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}
