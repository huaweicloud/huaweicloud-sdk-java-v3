package com.huaweicloud.sdk.elb.v2;

import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.elb.v2.model.*;
import java.util.List;
import java.util.Map;
import java.time.OffsetDateTime;

@SuppressWarnings("unchecked")
public class ElbMeta {

    public static final HttpRequestDef<CreateHealthmonitorRequest, CreateHealthmonitorResponse> createHealthmonitor = genForcreateHealthmonitor();

    private static HttpRequestDef<CreateHealthmonitorRequest, CreateHealthmonitorResponse> genForcreateHealthmonitor() {
        // basic
        HttpRequestDef.Builder<CreateHealthmonitorRequest, CreateHealthmonitorResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateHealthmonitorRequest.class, CreateHealthmonitorResponse.class)
                .withUri("/v2/{project_id}/elb/healthmonitors")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateHealthmonitorRequestBody.class,
            f -> f.withMarshaller(CreateHealthmonitorRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateL7policyRequest, CreateL7policyResponse> createL7policy = genForcreateL7policy();

    private static HttpRequestDef<CreateL7policyRequest, CreateL7policyResponse> genForcreateL7policy() {
        // basic
        HttpRequestDef.Builder<CreateL7policyRequest, CreateL7policyResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateL7policyRequest.class, CreateL7policyResponse.class)
                .withUri("/v2/{project_id}/elb/l7policies")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateL7policyRequestBody.class,
            f -> f.withMarshaller(CreateL7policyRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateL7ruleRequest, CreateL7ruleResponse> createL7rule = genForcreateL7rule();

    private static HttpRequestDef<CreateL7ruleRequest, CreateL7ruleResponse> genForcreateL7rule() {
        // basic
        HttpRequestDef.Builder<CreateL7ruleRequest, CreateL7ruleResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateL7ruleRequest.class, CreateL7ruleResponse.class)
                .withUri("/v2/{project_id}/elb/l7policies/{l7policy_id}/rules")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("l7policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateL7ruleRequest::getL7policyId, (req, v) -> {
                req.setL7policyId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateL7ruleRequestBody.class,
            f -> f.withMarshaller(CreateL7ruleRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateListenerRequest, CreateListenerResponse> createListener = genForcreateListener();

    private static HttpRequestDef<CreateListenerRequest, CreateListenerResponse> genForcreateListener() {
        // basic
        HttpRequestDef.Builder<CreateListenerRequest, CreateListenerResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateListenerRequest.class, CreateListenerResponse.class)
                .withUri("/v2/{project_id}/elb/listeners")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateListenerRequestBody.class,
            f -> f.withMarshaller(CreateListenerRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateLoadbalancerRequest, CreateLoadbalancerResponse> createLoadbalancer = genForcreateLoadbalancer();

    private static HttpRequestDef<CreateLoadbalancerRequest, CreateLoadbalancerResponse> genForcreateLoadbalancer() {
        // basic
        HttpRequestDef.Builder<CreateLoadbalancerRequest, CreateLoadbalancerResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateLoadbalancerRequest.class, CreateLoadbalancerResponse.class)
                .withUri("/v2/{project_id}/elb/loadbalancers")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateLoadbalancerRequestBody.class,
            f -> f.withMarshaller(CreateLoadbalancerRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateMemberRequest, CreateMemberResponse> createMember = genForcreateMember();

    private static HttpRequestDef<CreateMemberRequest, CreateMemberResponse> genForcreateMember() {
        // basic
        HttpRequestDef.Builder<CreateMemberRequest, CreateMemberResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateMemberRequest.class, CreateMemberResponse.class)
                .withUri("/v2/{project_id}/elb/pools/{pool_id}/members")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("pool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(CreateMemberRequest::getPoolId, (req, v) -> {
                req.setPoolId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateMemberRequestBody.class,
            f -> f.withMarshaller(CreateMemberRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePoolRequest, CreatePoolResponse> createPool = genForcreatePool();

    private static HttpRequestDef<CreatePoolRequest, CreatePoolResponse> genForcreatePool() {
        // basic
        HttpRequestDef.Builder<CreatePoolRequest, CreatePoolResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePoolRequest.class, CreatePoolResponse.class)
                .withUri("/v2/{project_id}/elb/pools")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreatePoolRequestBody.class,
            f -> f.withMarshaller(CreatePoolRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateWhitelistRequest, CreateWhitelistResponse> createWhitelist = genForcreateWhitelist();

    private static HttpRequestDef<CreateWhitelistRequest, CreateWhitelistResponse> genForcreateWhitelist() {
        // basic
        HttpRequestDef.Builder<CreateWhitelistRequest, CreateWhitelistResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateWhitelistRequest.class, CreateWhitelistResponse.class)
                .withUri("/v2/{project_id}/elb/whitelists")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateWhitelistRequestBody.class,
            f -> f.withMarshaller(CreateWhitelistRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteHealthmonitorRequest, DeleteHealthmonitorResponse> deleteHealthmonitor = genFordeleteHealthmonitor();

    private static HttpRequestDef<DeleteHealthmonitorRequest, DeleteHealthmonitorResponse> genFordeleteHealthmonitor() {
        // basic
        HttpRequestDef.Builder<DeleteHealthmonitorRequest, DeleteHealthmonitorResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteHealthmonitorRequest.class, DeleteHealthmonitorResponse.class)
                .withUri("/v2/{project_id}/elb/healthmonitors/{healthmonitor_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("healthmonitor_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteHealthmonitorRequest::getHealthmonitorId, (req, v) -> {
                req.setHealthmonitorId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteL7policyRequest, DeleteL7policyResponse> deleteL7policy = genFordeleteL7policy();

    private static HttpRequestDef<DeleteL7policyRequest, DeleteL7policyResponse> genFordeleteL7policy() {
        // basic
        HttpRequestDef.Builder<DeleteL7policyRequest, DeleteL7policyResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteL7policyRequest.class, DeleteL7policyResponse.class)
                .withUri("/v2/{project_id}/elb/l7policies/{l7policy_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("l7policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteL7policyRequest::getL7policyId, (req, v) -> {
                req.setL7policyId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteL7ruleRequest, DeleteL7ruleResponse> deleteL7rule = genFordeleteL7rule();

    private static HttpRequestDef<DeleteL7ruleRequest, DeleteL7ruleResponse> genFordeleteL7rule() {
        // basic
        HttpRequestDef.Builder<DeleteL7ruleRequest, DeleteL7ruleResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteL7ruleRequest.class, DeleteL7ruleResponse.class)
                .withUri("/v2/{project_id}/elb/l7policies/{l7policy_id}/rules/{l7rule_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("l7policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteL7ruleRequest::getL7policyId, (req, v) -> {
                req.setL7policyId(v);
            })
        );
        builder.withRequestField("l7rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteL7ruleRequest::getL7ruleId, (req, v) -> {
                req.setL7ruleId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteListenerRequest, DeleteListenerResponse> deleteListener = genFordeleteListener();

    private static HttpRequestDef<DeleteListenerRequest, DeleteListenerResponse> genFordeleteListener() {
        // basic
        HttpRequestDef.Builder<DeleteListenerRequest, DeleteListenerResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteListenerRequest.class, DeleteListenerResponse.class)
                .withUri("/v2/{project_id}/elb/listeners/{listener_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("listener_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteListenerRequest::getListenerId, (req, v) -> {
                req.setListenerId(v);
            })
        );
        builder.withRequestField("cascade",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(DeleteListenerRequest::getCascade, (req, v) -> {
                req.setCascade(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteLoadbalancerRequest, DeleteLoadbalancerResponse> deleteLoadbalancer = genFordeleteLoadbalancer();

    private static HttpRequestDef<DeleteLoadbalancerRequest, DeleteLoadbalancerResponse> genFordeleteLoadbalancer() {
        // basic
        HttpRequestDef.Builder<DeleteLoadbalancerRequest, DeleteLoadbalancerResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteLoadbalancerRequest.class, DeleteLoadbalancerResponse.class)
                .withUri("/v2/{project_id}/elb/loadbalancers/{loadbalancer_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("loadbalancer_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteLoadbalancerRequest::getLoadbalancerId, (req, v) -> {
                req.setLoadbalancerId(v);
            })
        );
        builder.withRequestField("cascade",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(DeleteLoadbalancerRequest::getCascade, (req, v) -> {
                req.setCascade(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteMemberRequest, DeleteMemberResponse> deleteMember = genFordeleteMember();

    private static HttpRequestDef<DeleteMemberRequest, DeleteMemberResponse> genFordeleteMember() {
        // basic
        HttpRequestDef.Builder<DeleteMemberRequest, DeleteMemberResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteMemberRequest.class, DeleteMemberResponse.class)
                .withUri("/v2/{project_id}/elb/pools/{pool_id}/members/{member_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("pool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteMemberRequest::getPoolId, (req, v) -> {
                req.setPoolId(v);
            })
        );
        builder.withRequestField("member_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteMemberRequest::getMemberId, (req, v) -> {
                req.setMemberId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePoolRequest, DeletePoolResponse> deletePool = genFordeletePool();

    private static HttpRequestDef<DeletePoolRequest, DeletePoolResponse> genFordeletePool() {
        // basic
        HttpRequestDef.Builder<DeletePoolRequest, DeletePoolResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePoolRequest.class, DeletePoolResponse.class)
                .withUri("/v2/{project_id}/elb/pools/{pool_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("pool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeletePoolRequest::getPoolId, (req, v) -> {
                req.setPoolId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteWhitelistRequest, DeleteWhitelistResponse> deleteWhitelist = genFordeleteWhitelist();

    private static HttpRequestDef<DeleteWhitelistRequest, DeleteWhitelistResponse> genFordeleteWhitelist() {
        // basic
        HttpRequestDef.Builder<DeleteWhitelistRequest, DeleteWhitelistResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteWhitelistRequest.class, DeleteWhitelistResponse.class)
                .withUri("/v2/{project_id}/elb/whitelists/{whitelist_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("whitelist_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteWhitelistRequest::getWhitelistId, (req, v) -> {
                req.setWhitelistId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHealthmonitorsRequest, ListHealthmonitorsResponse> listHealthmonitors = genForlistHealthmonitors();

    private static HttpRequestDef<ListHealthmonitorsRequest, ListHealthmonitorsResponse> genForlistHealthmonitors() {
        // basic
        HttpRequestDef.Builder<ListHealthmonitorsRequest, ListHealthmonitorsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListHealthmonitorsRequest.class, ListHealthmonitorsResponse.class)
                .withUri("/v2/{project_id}/elb/healthmonitors")
                .withContentType("application/json");

        // requests
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListHealthmonitorsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListHealthmonitorsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            })
        );
        builder.withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(ListHealthmonitorsRequest::getPageReverse, (req, v) -> {
                req.setPageReverse(v);
            })
        );
        builder.withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListHealthmonitorsRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListHealthmonitorsRequest::getName, (req, v) -> {
                req.setName(v);
            })
        );
        builder.withRequestField("delay",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListHealthmonitorsRequest::getDelay, (req, v) -> {
                req.setDelay(v);
            })
        );
        builder.withRequestField("max_retries",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListHealthmonitorsRequest::getMaxRetries, (req, v) -> {
                req.setMaxRetries(v);
            })
        );
        builder.withRequestField("admin_state_up",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(ListHealthmonitorsRequest::getAdminStateUp, (req, v) -> {
                req.setAdminStateUp(v);
            })
        );
        builder.withRequestField("timeout",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListHealthmonitorsRequest::getTimeout, (req, v) -> {
                req.setTimeout(v);
            })
        );
        builder.withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListHealthmonitorsRequest::getType, (req, v) -> {
                req.setType(v);
            })
        );
        builder.withRequestField("monitor_port",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListHealthmonitorsRequest::getMonitorPort, (req, v) -> {
                req.setMonitorPort(v);
            })
        );
        builder.withRequestField("expected_codes",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListHealthmonitorsRequest::getExpectedCodes, (req, v) -> {
                req.setExpectedCodes(v);
            })
        );
        builder.withRequestField("domain_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListHealthmonitorsRequest::getDomainName, (req, v) -> {
                req.setDomainName(v);
            })
        );
        builder.withRequestField("url_path",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListHealthmonitorsRequest::getUrlPath, (req, v) -> {
                req.setUrlPath(v);
            })
        );
        builder.withRequestField("http_method",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListHealthmonitorsRequest::getHttpMethod, (req, v) -> {
                req.setHttpMethod(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListL7policiesRequest, ListL7policiesResponse> listL7policies = genForlistL7policies();

    private static HttpRequestDef<ListL7policiesRequest, ListL7policiesResponse> genForlistL7policies() {
        // basic
        HttpRequestDef.Builder<ListL7policiesRequest, ListL7policiesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListL7policiesRequest.class, ListL7policiesResponse.class)
                .withUri("/v2/{project_id}/elb/l7policies")
                .withContentType("application/json");

        // requests
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListL7policiesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListL7policiesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            })
        );
        builder.withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(ListL7policiesRequest::getPageReverse, (req, v) -> {
                req.setPageReverse(v);
            })
        );
        builder.withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListL7policiesRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListL7policiesRequest::getName, (req, v) -> {
                req.setName(v);
            })
        );
        builder.withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListL7policiesRequest::getDescription, (req, v) -> {
                req.setDescription(v);
            })
        );
        builder.withRequestField("admin_state_up",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(ListL7policiesRequest::getAdminStateUp, (req, v) -> {
                req.setAdminStateUp(v);
            })
        );
        builder.withRequestField("listener_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListL7policiesRequest::getListenerId, (req, v) -> {
                req.setListenerId(v);
            })
        );
        builder.withRequestField("action",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListL7policiesRequest::getAction, (req, v) -> {
                req.setAction(v);
            })
        );
        builder.withRequestField("redirect_pool_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListL7policiesRequest::getRedirectPoolId, (req, v) -> {
                req.setRedirectPoolId(v);
            })
        );
        builder.withRequestField("redirect_listener_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListL7policiesRequest::getRedirectListenerId, (req, v) -> {
                req.setRedirectListenerId(v);
            })
        );
        builder.withRequestField("redirect_url",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListL7policiesRequest::getRedirectUrl, (req, v) -> {
                req.setRedirectUrl(v);
            })
        );
        builder.withRequestField("position",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListL7policiesRequest::getPosition, (req, v) -> {
                req.setPosition(v);
            })
        );
        builder.withRequestField("provisioning_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListL7policiesRequest::getProvisioningStatus, (req, v) -> {
                req.setProvisioningStatus(v);
            })
        );
        builder.withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListL7policiesRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            })
        );
        builder.withRequestField("display_all_rules",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(ListL7policiesRequest::getDisplayAllRules, (req, v) -> {
                req.setDisplayAllRules(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListL7rulesRequest, ListL7rulesResponse> listL7rules = genForlistL7rules();

    private static HttpRequestDef<ListL7rulesRequest, ListL7rulesResponse> genForlistL7rules() {
        // basic
        HttpRequestDef.Builder<ListL7rulesRequest, ListL7rulesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListL7rulesRequest.class, ListL7rulesResponse.class)
                .withUri("/v2/{project_id}/elb/l7policies/{l7policy_id}/rules")
                .withContentType("application/json");

        // requests
        builder.withRequestField("l7policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListL7rulesRequest::getL7policyId, (req, v) -> {
                req.setL7policyId(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListL7rulesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListL7rulesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            })
        );
        builder.withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(ListL7rulesRequest::getPageReverse, (req, v) -> {
                req.setPageReverse(v);
            })
        );
        builder.withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListL7rulesRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("admin_state_up",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(ListL7rulesRequest::getAdminStateUp, (req, v) -> {
                req.setAdminStateUp(v);
            })
        );
        builder.withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListL7rulesRequest::getType, (req, v) -> {
                req.setType(v);
            })
        );
        builder.withRequestField("compare_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListL7rulesRequest::getCompareType, (req, v) -> {
                req.setCompareType(v);
            })
        );
        builder.withRequestField("invert",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(ListL7rulesRequest::getInvert, (req, v) -> {
                req.setInvert(v);
            })
        );
        builder.withRequestField("key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListL7rulesRequest::getKey, (req, v) -> {
                req.setKey(v);
            })
        );
        builder.withRequestField("value",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListL7rulesRequest::getValue, (req, v) -> {
                req.setValue(v);
            })
        );
        builder.withRequestField("provisioning_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListL7rulesRequest::getProvisioningStatus, (req, v) -> {
                req.setProvisioningStatus(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListListenersRequest, ListListenersResponse> listListeners = genForlistListeners();

    private static HttpRequestDef<ListListenersRequest, ListListenersResponse> genForlistListeners() {
        // basic
        HttpRequestDef.Builder<ListListenersRequest, ListListenersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListListenersRequest.class, ListListenersResponse.class)
                .withUri("/v2/{project_id}/elb/listeners")
                .withContentType("application/json");

        // requests
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListListenersRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListListenersRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            })
        );
        builder.withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(ListListenersRequest::getPageReverse, (req, v) -> {
                req.setPageReverse(v);
            })
        );
        builder.withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListListenersRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListListenersRequest::getName, (req, v) -> {
                req.setName(v);
            })
        );
        builder.withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListListenersRequest::getDescription, (req, v) -> {
                req.setDescription(v);
            })
        );
        builder.withRequestField("default_pool_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListListenersRequest::getDefaultPoolId, (req, v) -> {
                req.setDefaultPoolId(v);
            })
        );
        builder.withRequestField("default_tls_container_ref",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListListenersRequest::getDefaultTlsContainerRef, (req, v) -> {
                req.setDefaultTlsContainerRef(v);
            })
        );
        builder.withRequestField("client_ca_tls_container_ref",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListListenersRequest::getClientCaTlsContainerRef, (req, v) -> {
                req.setClientCaTlsContainerRef(v);
            })
        );
        builder.withRequestField("protocol",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListListenersRequest::getProtocol, (req, v) -> {
                req.setProtocol(v);
            })
        );
        builder.withRequestField("protocol_port",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListListenersRequest::getProtocolPort, (req, v) -> {
                req.setProtocolPort(v);
            })
        );
        builder.withRequestField("tls_ciphers_policy",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListListenersRequest::getTlsCiphersPolicy, (req, v) -> {
                req.setTlsCiphersPolicy(v);
            })
        );
        builder.withRequestField("member_timeout",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListListenersRequest::getMemberTimeout, (req, v) -> {
                req.setMemberTimeout(v);
            })
        );
        builder.withRequestField("client_timeout",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListListenersRequest::getClientTimeout, (req, v) -> {
                req.setClientTimeout(v);
            })
        );
        builder.withRequestField("keepalive_timeout",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListListenersRequest::getKeepaliveTimeout, (req, v) -> {
                req.setKeepaliveTimeout(v);
            })
        );
        builder.withRequestField("tls_container_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListListenersRequest::getTlsContainerId, (req, v) -> {
                req.setTlsContainerId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLoadbalancersRequest, ListLoadbalancersResponse> listLoadbalancers = genForlistLoadbalancers();

    private static HttpRequestDef<ListLoadbalancersRequest, ListLoadbalancersResponse> genForlistLoadbalancers() {
        // basic
        HttpRequestDef.Builder<ListLoadbalancersRequest, ListLoadbalancersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListLoadbalancersRequest.class, ListLoadbalancersResponse.class)
                .withUri("/v2/{project_id}/elb/loadbalancers")
                .withContentType("application/json");

        // requests
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListLoadbalancersRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListLoadbalancersRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            })
        );
        builder.withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(ListLoadbalancersRequest::getPageReverse, (req, v) -> {
                req.setPageReverse(v);
            })
        );
        builder.withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListLoadbalancersRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListLoadbalancersRequest::getDescription, (req, v) -> {
                req.setDescription(v);
            })
        );
        builder.withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListLoadbalancersRequest::getName, (req, v) -> {
                req.setName(v);
            })
        );
        builder.withRequestField("operating_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListLoadbalancersRequest::getOperatingStatus, (req, v) -> {
                req.setOperatingStatus(v);
            })
        );
        builder.withRequestField("provisioning_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListLoadbalancersRequest::getProvisioningStatus, (req, v) -> {
                req.setProvisioningStatus(v);
            })
        );
        builder.withRequestField("vip_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListLoadbalancersRequest::getVipAddress, (req, v) -> {
                req.setVipAddress(v);
            })
        );
        builder.withRequestField("vip_port_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListLoadbalancersRequest::getVipPortId, (req, v) -> {
                req.setVipPortId(v);
            })
        );
        builder.withRequestField("vip_subnet_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListLoadbalancersRequest::getVipSubnetId, (req, v) -> {
                req.setVipSubnetId(v);
            })
        );
        builder.withRequestField("vpc_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListLoadbalancersRequest::getVpcId, (req, v) -> {
                req.setVpcId(v);
            })
        );
        builder.withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListLoadbalancersRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            })
        );
        builder.withRequestField("admin_state_up",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(ListLoadbalancersRequest::getAdminStateUp, (req, v) -> {
                req.setAdminStateUp(v);
            })
        );
        builder.withRequestField("member_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListLoadbalancersRequest::getMemberAddress, (req, v) -> {
                req.setMemberAddress(v);
            })
        );
        builder.withRequestField("member_device_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListLoadbalancersRequest::getMemberDeviceId, (req, v) -> {
                req.setMemberDeviceId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMenbersRequest, ListMenbersResponse> listMenbers = genForlistMenbers();

    private static HttpRequestDef<ListMenbersRequest, ListMenbersResponse> genForlistMenbers() {
        // basic
        HttpRequestDef.Builder<ListMenbersRequest, ListMenbersResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListMenbersRequest.class, ListMenbersResponse.class)
                .withUri("/v2/{project_id}/elb/pools/{pool_id}/members")
                .withContentType("application/json");

        // requests
        builder.withRequestField("pool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ListMenbersRequest::getPoolId, (req, v) -> {
                req.setPoolId(v);
            })
        );
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListMenbersRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListMenbersRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            })
        );
        builder.withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(ListMenbersRequest::getPageReverse, (req, v) -> {
                req.setPageReverse(v);
            })
        );
        builder.withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListMenbersRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListMenbersRequest::getName, (req, v) -> {
                req.setName(v);
            })
        );
        builder.withRequestField("address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListMenbersRequest::getAddress, (req, v) -> {
                req.setAddress(v);
            })
        );
        builder.withRequestField("protocol_port",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListMenbersRequest::getProtocolPort, (req, v) -> {
                req.setProtocolPort(v);
            })
        );
        builder.withRequestField("subnet_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListMenbersRequest::getSubnetId, (req, v) -> {
                req.setSubnetId(v);
            })
        );
        builder.withRequestField("admin_state_up",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(ListMenbersRequest::getAdminStateUp, (req, v) -> {
                req.setAdminStateUp(v);
            })
        );
        builder.withRequestField("weight",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListMenbersRequest::getWeight, (req, v) -> {
                req.setWeight(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPoolsRequest, ListPoolsResponse> listPools = genForlistPools();

    private static HttpRequestDef<ListPoolsRequest, ListPoolsResponse> genForlistPools() {
        // basic
        HttpRequestDef.Builder<ListPoolsRequest, ListPoolsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPoolsRequest.class, ListPoolsResponse.class)
                .withUri("/v2/{project_id}/elb/pools")
                .withContentType("application/json");

        // requests
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListPoolsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPoolsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            })
        );
        builder.withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(ListPoolsRequest::getPageReverse, (req, v) -> {
                req.setPageReverse(v);
            })
        );
        builder.withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPoolsRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPoolsRequest::getName, (req, v) -> {
                req.setName(v);
            })
        );
        builder.withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPoolsRequest::getDescription, (req, v) -> {
                req.setDescription(v);
            })
        );
        builder.withRequestField("healthmonitor_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPoolsRequest::getHealthmonitorId, (req, v) -> {
                req.setHealthmonitorId(v);
            })
        );
        builder.withRequestField("loadbalancer_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPoolsRequest::getLoadbalancerId, (req, v) -> {
                req.setLoadbalancerId(v);
            })
        );
        builder.withRequestField("protocol",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPoolsRequest::getProtocol, (req, v) -> {
                req.setProtocol(v);
            })
        );
        builder.withRequestField("lb_algorithm",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPoolsRequest::getLbAlgorithm, (req, v) -> {
                req.setLbAlgorithm(v);
            })
        );
        builder.withRequestField("member_address",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPoolsRequest::getMemberAddress, (req, v) -> {
                req.setMemberAddress(v);
            })
        );
        builder.withRequestField("member_device_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPoolsRequest::getMemberDeviceId, (req, v) -> {
                req.setMemberDeviceId(v);
            })
        );
        builder.withRequestField("enterprise_project_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListPoolsRequest::getEnterpriseProjectId, (req, v) -> {
                req.setEnterpriseProjectId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListWhitelistsRequest, ListWhitelistsResponse> listWhitelists = genForlistWhitelists();

    private static HttpRequestDef<ListWhitelistsRequest, ListWhitelistsResponse> genForlistWhitelists() {
        // basic
        HttpRequestDef.Builder<ListWhitelistsRequest, ListWhitelistsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListWhitelistsRequest.class, ListWhitelistsResponse.class)
                .withUri("/v2/{project_id}/elb/whitelists")
                .withContentType("application/json");

        // requests
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListWhitelistsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListWhitelistsRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            })
        );
        builder.withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(ListWhitelistsRequest::getPageReverse, (req, v) -> {
                req.setPageReverse(v);
            })
        );
        builder.withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListWhitelistsRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("enable_whitelist",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Boolean.class,
            f -> f.withMarshaller(ListWhitelistsRequest::getEnableWhitelist, (req, v) -> {
                req.setEnableWhitelist(v);
            })
        );
        builder.withRequestField("listener_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListWhitelistsRequest::getListenerId, (req, v) -> {
                req.setListenerId(v);
            })
        );
        builder.withRequestField("whitelist",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListWhitelistsRequest::getWhitelist, (req, v) -> {
                req.setWhitelist(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHealthmonitorsRequest, ShowHealthmonitorsResponse> showHealthmonitors = genForshowHealthmonitors();

    private static HttpRequestDef<ShowHealthmonitorsRequest, ShowHealthmonitorsResponse> genForshowHealthmonitors() {
        // basic
        HttpRequestDef.Builder<ShowHealthmonitorsRequest, ShowHealthmonitorsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowHealthmonitorsRequest.class, ShowHealthmonitorsResponse.class)
                .withUri("/v2/{project_id}/elb/healthmonitors/{healthmonitor_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("healthmonitor_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowHealthmonitorsRequest::getHealthmonitorId, (req, v) -> {
                req.setHealthmonitorId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowL7policyRequest, ShowL7policyResponse> showL7policy = genForshowL7policy();

    private static HttpRequestDef<ShowL7policyRequest, ShowL7policyResponse> genForshowL7policy() {
        // basic
        HttpRequestDef.Builder<ShowL7policyRequest, ShowL7policyResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowL7policyRequest.class, ShowL7policyResponse.class)
                .withUri("/v2/{project_id}/elb/l7policies/{l7policy_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("l7policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowL7policyRequest::getL7policyId, (req, v) -> {
                req.setL7policyId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowL7ruleRequest, ShowL7ruleResponse> showL7rule = genForshowL7rule();

    private static HttpRequestDef<ShowL7ruleRequest, ShowL7ruleResponse> genForshowL7rule() {
        // basic
        HttpRequestDef.Builder<ShowL7ruleRequest, ShowL7ruleResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowL7ruleRequest.class, ShowL7ruleResponse.class)
                .withUri("/v2/{project_id}/elb/l7policies/{l7policy_id}/rules/{l7rule_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("l7policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowL7ruleRequest::getL7policyId, (req, v) -> {
                req.setL7policyId(v);
            })
        );
        builder.withRequestField("l7rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowL7ruleRequest::getL7ruleId, (req, v) -> {
                req.setL7ruleId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowListenerRequest, ShowListenerResponse> showListener = genForshowListener();

    private static HttpRequestDef<ShowListenerRequest, ShowListenerResponse> genForshowListener() {
        // basic
        HttpRequestDef.Builder<ShowListenerRequest, ShowListenerResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowListenerRequest.class, ShowListenerResponse.class)
                .withUri("/v2/{project_id}/elb/listeners/{listener_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("listener_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowListenerRequest::getListenerId, (req, v) -> {
                req.setListenerId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLoadbalancerRequest, ShowLoadbalancerResponse> showLoadbalancer = genForshowLoadbalancer();

    private static HttpRequestDef<ShowLoadbalancerRequest, ShowLoadbalancerResponse> genForshowLoadbalancer() {
        // basic
        HttpRequestDef.Builder<ShowLoadbalancerRequest, ShowLoadbalancerResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowLoadbalancerRequest.class, ShowLoadbalancerResponse.class)
                .withUri("/v2/{project_id}/elb/loadbalancers/{loadbalancer_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("loadbalancer_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowLoadbalancerRequest::getLoadbalancerId, (req, v) -> {
                req.setLoadbalancerId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLoadbalancersStatusRequest, ShowLoadbalancersStatusResponse> showLoadbalancersStatus = genForshowLoadbalancersStatus();

    private static HttpRequestDef<ShowLoadbalancersStatusRequest, ShowLoadbalancersStatusResponse> genForshowLoadbalancersStatus() {
        // basic
        HttpRequestDef.Builder<ShowLoadbalancersStatusRequest, ShowLoadbalancersStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowLoadbalancersStatusRequest.class, ShowLoadbalancersStatusResponse.class)
                .withUri("/v2/{project_id}/elb/loadbalancers/{loadbalancer_id}/statuses")
                .withContentType("application/json");

        // requests
        builder.withRequestField("loadbalancer_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowLoadbalancersStatusRequest::getLoadbalancerId, (req, v) -> {
                req.setLoadbalancerId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowMemberRequest, ShowMemberResponse> showMember = genForshowMember();

    private static HttpRequestDef<ShowMemberRequest, ShowMemberResponse> genForshowMember() {
        // basic
        HttpRequestDef.Builder<ShowMemberRequest, ShowMemberResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowMemberRequest.class, ShowMemberResponse.class)
                .withUri("/v2/{project_id}/elb/pools/{pool_id}/members/{member_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("pool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowMemberRequest::getPoolId, (req, v) -> {
                req.setPoolId(v);
            })
        );
        builder.withRequestField("member_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowMemberRequest::getMemberId, (req, v) -> {
                req.setMemberId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPoolRequest, ShowPoolResponse> showPool = genForshowPool();

    private static HttpRequestDef<ShowPoolRequest, ShowPoolResponse> genForshowPool() {
        // basic
        HttpRequestDef.Builder<ShowPoolRequest, ShowPoolResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPoolRequest.class, ShowPoolResponse.class)
                .withUri("/v2/{project_id}/elb/pools/{pool_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("pool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowPoolRequest::getPoolId, (req, v) -> {
                req.setPoolId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowWhitelistRequest, ShowWhitelistResponse> showWhitelist = genForshowWhitelist();

    private static HttpRequestDef<ShowWhitelistRequest, ShowWhitelistResponse> genForshowWhitelist() {
        // basic
        HttpRequestDef.Builder<ShowWhitelistRequest, ShowWhitelistResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowWhitelistRequest.class, ShowWhitelistResponse.class)
                .withUri("/v2/{project_id}/elb/whitelists/{whitelist_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("whitelist_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowWhitelistRequest::getWhitelistId, (req, v) -> {
                req.setWhitelistId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateHealthmonitorRequest, UpdateHealthmonitorResponse> updateHealthmonitor = genForupdateHealthmonitor();

    private static HttpRequestDef<UpdateHealthmonitorRequest, UpdateHealthmonitorResponse> genForupdateHealthmonitor() {
        // basic
        HttpRequestDef.Builder<UpdateHealthmonitorRequest, UpdateHealthmonitorResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateHealthmonitorRequest.class, UpdateHealthmonitorResponse.class)
                .withUri("/v2/{project_id}/elb/healthmonitors/{healthmonitor_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("healthmonitor_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateHealthmonitorRequest::getHealthmonitorId, (req, v) -> {
                req.setHealthmonitorId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateHealthmonitorRequestBody.class,
            f -> f.withMarshaller(UpdateHealthmonitorRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateL7policiesRequest, UpdateL7policiesResponse> updateL7policies = genForupdateL7policies();

    private static HttpRequestDef<UpdateL7policiesRequest, UpdateL7policiesResponse> genForupdateL7policies() {
        // basic
        HttpRequestDef.Builder<UpdateL7policiesRequest, UpdateL7policiesResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateL7policiesRequest.class, UpdateL7policiesResponse.class)
                .withUri("/v2/{project_id}/elb/l7policies/{l7policy_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("l7policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateL7policiesRequest::getL7policyId, (req, v) -> {
                req.setL7policyId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateL7policiesRequestBody.class,
            f -> f.withMarshaller(UpdateL7policiesRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateL7ruleRequest, UpdateL7ruleResponse> updateL7rule = genForupdateL7rule();

    private static HttpRequestDef<UpdateL7ruleRequest, UpdateL7ruleResponse> genForupdateL7rule() {
        // basic
        HttpRequestDef.Builder<UpdateL7ruleRequest, UpdateL7ruleResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateL7ruleRequest.class, UpdateL7ruleResponse.class)
                .withUri("/v2/{project_id}/elb/l7policies/{l7policy_id}/rules/{l7rule_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("l7policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateL7ruleRequest::getL7policyId, (req, v) -> {
                req.setL7policyId(v);
            })
        );
        builder.withRequestField("l7rule_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateL7ruleRequest::getL7ruleId, (req, v) -> {
                req.setL7ruleId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateL7ruleRequestBody.class,
            f -> f.withMarshaller(UpdateL7ruleRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateListenerRequest, UpdateListenerResponse> updateListener = genForupdateListener();

    private static HttpRequestDef<UpdateListenerRequest, UpdateListenerResponse> genForupdateListener() {
        // basic
        HttpRequestDef.Builder<UpdateListenerRequest, UpdateListenerResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateListenerRequest.class, UpdateListenerResponse.class)
                .withUri("/v2/{project_id}/elb/listeners/{listener_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("listener_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateListenerRequest::getListenerId, (req, v) -> {
                req.setListenerId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateListenerRequestBody.class,
            f -> f.withMarshaller(UpdateListenerRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateLoadbalancerRequest, UpdateLoadbalancerResponse> updateLoadbalancer = genForupdateLoadbalancer();

    private static HttpRequestDef<UpdateLoadbalancerRequest, UpdateLoadbalancerResponse> genForupdateLoadbalancer() {
        // basic
        HttpRequestDef.Builder<UpdateLoadbalancerRequest, UpdateLoadbalancerResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateLoadbalancerRequest.class, UpdateLoadbalancerResponse.class)
                .withUri("/v2/{project_id}/elb/loadbalancers/{loadbalancer_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("loadbalancer_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateLoadbalancerRequest::getLoadbalancerId, (req, v) -> {
                req.setLoadbalancerId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateLoadbalancerRequestBody.class,
            f -> f.withMarshaller(UpdateLoadbalancerRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateMemberRequest, UpdateMemberResponse> updateMember = genForupdateMember();

    private static HttpRequestDef<UpdateMemberRequest, UpdateMemberResponse> genForupdateMember() {
        // basic
        HttpRequestDef.Builder<UpdateMemberRequest, UpdateMemberResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateMemberRequest.class, UpdateMemberResponse.class)
                .withUri("/v2/{project_id}/elb/pools/{pool_id}/members/{member_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("member_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateMemberRequest::getMemberId, (req, v) -> {
                req.setMemberId(v);
            })
        );
        builder.withRequestField("pool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateMemberRequest::getPoolId, (req, v) -> {
                req.setPoolId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateMemberRequestBody.class,
            f -> f.withMarshaller(UpdateMemberRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePoolRequest, UpdatePoolResponse> updatePool = genForupdatePool();

    private static HttpRequestDef<UpdatePoolRequest, UpdatePoolResponse> genForupdatePool() {
        // basic
        HttpRequestDef.Builder<UpdatePoolRequest, UpdatePoolResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePoolRequest.class, UpdatePoolResponse.class)
                .withUri("/v2/{project_id}/elb/pools/{pool_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("pool_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdatePoolRequest::getPoolId, (req, v) -> {
                req.setPoolId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdatePoolRequestBody.class,
            f -> f.withMarshaller(UpdatePoolRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateWhitelistRequest, UpdateWhitelistResponse> updateWhitelist = genForupdateWhitelist();

    private static HttpRequestDef<UpdateWhitelistRequest, UpdateWhitelistResponse> genForupdateWhitelist() {
        // basic
        HttpRequestDef.Builder<UpdateWhitelistRequest, UpdateWhitelistResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateWhitelistRequest.class, UpdateWhitelistResponse.class)
                .withUri("/v2/{project_id}/elb/whitelists/{whitelist_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("whitelist_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateWhitelistRequest::getWhitelistId, (req, v) -> {
                req.setWhitelistId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            UpdateWhitelistRequestBody.class,
            f -> f.withMarshaller(UpdateWhitelistRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCertificateRequest, CreateCertificateResponse> createCertificate = genForcreateCertificate();

    private static HttpRequestDef<CreateCertificateRequest, CreateCertificateResponse> genForcreateCertificate() {
        // basic
        HttpRequestDef.Builder<CreateCertificateRequest, CreateCertificateResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCertificateRequest.class, CreateCertificateResponse.class)
                .withUri("/v2/{project_id}/elb/certificates")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            CreateCertificateRequestBody.class,
            f -> f.withMarshaller(CreateCertificateRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCertificateRequest, DeleteCertificateResponse> deleteCertificate = genFordeleteCertificate();

    private static HttpRequestDef<DeleteCertificateRequest, DeleteCertificateResponse> genFordeleteCertificate() {
        // basic
        HttpRequestDef.Builder<DeleteCertificateRequest, DeleteCertificateResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteCertificateRequest.class, DeleteCertificateResponse.class)
                .withUri("/v2/{project_id}/elb/certificates/{certificate_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(DeleteCertificateRequest::getCertificateId, (req, v) -> {
                req.setCertificateId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCertificatesRequest, ListCertificatesResponse> listCertificates = genForlistCertificates();

    private static HttpRequestDef<ListCertificatesRequest, ListCertificatesResponse> genForlistCertificates() {
        // basic
        HttpRequestDef.Builder<ListCertificatesRequest, ListCertificatesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCertificatesRequest.class, ListCertificatesResponse.class)
                .withUri("/v2/{project_id}/elb/certificates")
                .withContentType("application/json");

        // requests
        builder.withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            Integer.class,
            f -> f.withMarshaller(ListCertificatesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            })
        );
        builder.withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCertificatesRequest::getMarker, (req, v) -> {
                req.setMarker(v);
            })
        );
        builder.withRequestField("page_reverse",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCertificatesRequest::getPageReverse, (req, v) -> {
                req.setPageReverse(v);
            })
        );
        builder.withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCertificatesRequest::getId, (req, v) -> {
                req.setId(v);
            })
        );
        builder.withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCertificatesRequest::getName, (req, v) -> {
                req.setName(v);
            })
        );
        builder.withRequestField("description",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCertificatesRequest::getDescription, (req, v) -> {
                req.setDescription(v);
            })
        );
        builder.withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCertificatesRequest::getType, (req, v) -> {
                req.setType(v);
            })
        );
        builder.withRequestField("domain",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCertificatesRequest::getDomain, (req, v) -> {
                req.setDomain(v);
            })
        );
        builder.withRequestField("private_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCertificatesRequest::getPrivateKey, (req, v) -> {
                req.setPrivateKey(v);
            })
        );
        builder.withRequestField("certificate",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(ListCertificatesRequest::getCertificate, (req, v) -> {
                req.setCertificate(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowCertificateRequest, ShowCertificateResponse> showCertificate = genForshowCertificate();

    private static HttpRequestDef<ShowCertificateRequest, ShowCertificateResponse> genForshowCertificate() {
        // basic
        HttpRequestDef.Builder<ShowCertificateRequest, ShowCertificateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowCertificateRequest.class, ShowCertificateResponse.class)
                .withUri("/v2/{project_id}/elb/certificates/{certificate_id}")
                .withContentType("application/json");

        // requests
        builder.withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(ShowCertificateRequest::getCertificateId, (req, v) -> {
                req.setCertificateId(v);
            })
        );

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCertificateRequest, UpdateCertificateResponse> updateCertificate = genForupdateCertificate();

    private static HttpRequestDef<UpdateCertificateRequest, UpdateCertificateResponse> genForupdateCertificate() {
        // basic
        HttpRequestDef.Builder<UpdateCertificateRequest, UpdateCertificateResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateCertificateRequest.class, UpdateCertificateResponse.class)
                .withUri("/v2/{project_id}/elb/certificates/{certificate_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            String.class,
            f -> f.withMarshaller(UpdateCertificateRequest::getCertificateId, (req, v) -> {
                req.setCertificateId(v);
            })
        );
        builder.withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            UpdateCertificateRequestBody.class,
            f -> f.withMarshaller(UpdateCertificateRequest::getBody, (req, v) -> {
                req.setBody(v);
            })
        );

        // response

        return builder.build();
    }

}
