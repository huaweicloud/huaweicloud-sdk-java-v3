package com.huaweicloud.sdk.apig.v2;

import com.huaweicloud.sdk.apig.v2.model.*;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

import java.util.Map;

@SuppressWarnings("unchecked")
public class ApigMeta {

    public static final HttpRequestDef<AddEipV2Request, AddEipV2Response> addEipV2 = genForaddEipV2();

    private static HttpRequestDef<AddEipV2Request, AddEipV2Response> genForaddEipV2() {
        // basic
        HttpRequestDef.Builder<AddEipV2Request, AddEipV2Response> builder =
            HttpRequestDef.builder(HttpMethod.PUT, AddEipV2Request.class, AddEipV2Response.class)
                .withName("AddEipV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/eip")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddEipV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<EipBindReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EipBindReq.class),
            f -> f.withMarshaller(AddEipV2Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddEngressEipV2Request, AddEngressEipV2Response> addEngressEipV2 =
        genForaddEngressEipV2();

    private static HttpRequestDef<AddEngressEipV2Request, AddEngressEipV2Response> genForaddEngressEipV2() {
        // basic
        HttpRequestDef.Builder<AddEngressEipV2Request, AddEngressEipV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddEngressEipV2Request.class, AddEngressEipV2Response.class)
                .withName("AddEngressEipV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/nat-eip")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddEngressEipV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<OpenEngressEipReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OpenEngressEipReq.class),
            f -> f.withMarshaller(AddEngressEipV2Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AssociateCertificateV2Request, AssociateCertificateV2Response> associateCertificateV2 =
        genForassociateCertificateV2();

    private static HttpRequestDef<AssociateCertificateV2Request, AssociateCertificateV2Response> genForassociateCertificateV2() {
        // basic
        HttpRequestDef.Builder<AssociateCertificateV2Request, AssociateCertificateV2Response> builder = HttpRequestDef
            .builder(HttpMethod.POST, AssociateCertificateV2Request.class, AssociateCertificateV2Response.class)
            .withName("AssociateCertificateV2")
            .withUri(
                "/v2/{project_id}/apigw/instances/{instance_id}/api-groups/{group_id}/domains/{domain_id}/certificate")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateCertificateV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateCertificateV2Request::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateCertificateV2Request::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<CertForm>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CertForm.class),
            f -> f.withMarshaller(AssociateCertificateV2Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AssociateDomainV2Request, AssociateDomainV2Response> associateDomainV2 =
        genForassociateDomainV2();

    private static HttpRequestDef<AssociateDomainV2Request, AssociateDomainV2Response> genForassociateDomainV2() {
        // basic
        HttpRequestDef.Builder<AssociateDomainV2Request, AssociateDomainV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, AssociateDomainV2Request.class, AssociateDomainV2Response.class)
                .withName("AssociateDomainV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/api-groups/{group_id}/domains")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateDomainV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateDomainV2Request::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<UrlDomainCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UrlDomainCreate.class),
            f -> f.withMarshaller(AssociateDomainV2Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AssociateSignatureKeyV2Request, AssociateSignatureKeyV2Response> associateSignatureKeyV2 =
        genForassociateSignatureKeyV2();

    private static HttpRequestDef<AssociateSignatureKeyV2Request, AssociateSignatureKeyV2Response> genForassociateSignatureKeyV2() {
        // basic
        HttpRequestDef.Builder<AssociateSignatureKeyV2Request, AssociateSignatureKeyV2Response> builder = HttpRequestDef
            .builder(HttpMethod.POST, AssociateSignatureKeyV2Request.class, AssociateSignatureKeyV2Response.class)
            .withName("AssociateSignatureKeyV2")
            .withUri("/v2/{project_id}/apigw/instances/{instance_id}/sign-bindings")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateSignatureKeyV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<SignApiBinding>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SignApiBinding.class),
            f -> f.withMarshaller(AssociateSignatureKeyV2Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCustomAuthorizerV2Request, CreateCustomAuthorizerV2Response> createCustomAuthorizerV2 =
        genForcreateCustomAuthorizerV2();

    private static HttpRequestDef<CreateCustomAuthorizerV2Request, CreateCustomAuthorizerV2Response> genForcreateCustomAuthorizerV2() {
        // basic
        HttpRequestDef.Builder<CreateCustomAuthorizerV2Request, CreateCustomAuthorizerV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, CreateCustomAuthorizerV2Request.class, CreateCustomAuthorizerV2Response.class)
                .withName("CreateCustomAuthorizerV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/authorizers")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateCustomAuthorizerV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<AuthorizerCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AuthorizerCreate.class),
            f -> f.withMarshaller(CreateCustomAuthorizerV2Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEnvironmentV2Request, CreateEnvironmentV2Response> createEnvironmentV2 =
        genForcreateEnvironmentV2();

    private static HttpRequestDef<CreateEnvironmentV2Request, CreateEnvironmentV2Response> genForcreateEnvironmentV2() {
        // basic
        HttpRequestDef.Builder<CreateEnvironmentV2Request, CreateEnvironmentV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateEnvironmentV2Request.class, CreateEnvironmentV2Response.class)
                .withName("CreateEnvironmentV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/envs")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateEnvironmentV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<EnvCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EnvCreate.class),
            f -> f.withMarshaller(CreateEnvironmentV2Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEnvironmentVariableV2Request, CreateEnvironmentVariableV2Response> createEnvironmentVariableV2 =
        genForcreateEnvironmentVariableV2();

    private static HttpRequestDef<CreateEnvironmentVariableV2Request, CreateEnvironmentVariableV2Response> genForcreateEnvironmentVariableV2() {
        // basic
        HttpRequestDef.Builder<CreateEnvironmentVariableV2Request, CreateEnvironmentVariableV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateEnvironmentVariableV2Request.class,
                    CreateEnvironmentVariableV2Response.class)
                .withName("CreateEnvironmentVariableV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/env-variables")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateEnvironmentVariableV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<EnvVariableCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EnvVariableCreate.class),
            f -> f.withMarshaller(CreateEnvironmentVariableV2Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateFeatureV2Request, CreateFeatureV2Response> createFeatureV2 =
        genForcreateFeatureV2();

    private static HttpRequestDef<CreateFeatureV2Request, CreateFeatureV2Response> genForcreateFeatureV2() {
        // basic
        HttpRequestDef.Builder<CreateFeatureV2Request, CreateFeatureV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateFeatureV2Request.class, CreateFeatureV2Response.class)
                .withName("CreateFeatureV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/features")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateFeatureV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<FeatureToggle>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(FeatureToggle.class),
            f -> f.withMarshaller(CreateFeatureV2Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateGatewayResponseV2Request, CreateGatewayResponseV2Response> createGatewayResponseV2 =
        genForcreateGatewayResponseV2();

    private static HttpRequestDef<CreateGatewayResponseV2Request, CreateGatewayResponseV2Response> genForcreateGatewayResponseV2() {
        // basic
        HttpRequestDef.Builder<CreateGatewayResponseV2Request, CreateGatewayResponseV2Response> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateGatewayResponseV2Request.class, CreateGatewayResponseV2Response.class)
            .withName("CreateGatewayResponseV2")
            .withUri("/v2/{project_id}/apigw/instances/{instance_id}/api-groups/{group_id}/gateway-responses")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateGatewayResponseV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateGatewayResponseV2Request::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<ResponsesCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResponsesCreate.class),
            f -> f.withMarshaller(CreateGatewayResponseV2Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateInstanceV2Request, CreateInstanceV2Response> createInstanceV2 =
        genForcreateInstanceV2();

    private static HttpRequestDef<CreateInstanceV2Request, CreateInstanceV2Response> genForcreateInstanceV2() {
        // basic
        HttpRequestDef.Builder<CreateInstanceV2Request, CreateInstanceV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateInstanceV2Request.class, CreateInstanceV2Response.class)
                .withName("CreateInstanceV2")
                .withUri("/v2/{project_id}/apigw/instances")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<InstanceCreateReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(InstanceCreateReq.class),
            f -> f.withMarshaller(CreateInstanceV2Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateRequestThrottlingPolicyV2Request, CreateRequestThrottlingPolicyV2Response> createRequestThrottlingPolicyV2 =
        genForcreateRequestThrottlingPolicyV2();

    private static HttpRequestDef<CreateRequestThrottlingPolicyV2Request, CreateRequestThrottlingPolicyV2Response> genForcreateRequestThrottlingPolicyV2() {
        // basic
        HttpRequestDef.Builder<CreateRequestThrottlingPolicyV2Request, CreateRequestThrottlingPolicyV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateRequestThrottlingPolicyV2Request.class,
                    CreateRequestThrottlingPolicyV2Response.class)
                .withName("CreateRequestThrottlingPolicyV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/throttles")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateRequestThrottlingPolicyV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<ThrottleBaseInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ThrottleBaseInfo.class),
            f -> f.withMarshaller(CreateRequestThrottlingPolicyV2Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSignatureKeyV2Request, CreateSignatureKeyV2Response> createSignatureKeyV2 =
        genForcreateSignatureKeyV2();

    private static HttpRequestDef<CreateSignatureKeyV2Request, CreateSignatureKeyV2Response> genForcreateSignatureKeyV2() {
        // basic
        HttpRequestDef.Builder<CreateSignatureKeyV2Request, CreateSignatureKeyV2Response> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateSignatureKeyV2Request.class, CreateSignatureKeyV2Response.class)
            .withName("CreateSignatureKeyV2")
            .withUri("/v2/{project_id}/apigw/instances/{instance_id}/signs")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSignatureKeyV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<BaseSignature>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BaseSignature.class),
            f -> f.withMarshaller(CreateSignatureKeyV2Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateSpecialThrottlingConfigurationV2Request, CreateSpecialThrottlingConfigurationV2Response> createSpecialThrottlingConfigurationV2 =
        genForcreateSpecialThrottlingConfigurationV2();

    private static HttpRequestDef<CreateSpecialThrottlingConfigurationV2Request, CreateSpecialThrottlingConfigurationV2Response> genForcreateSpecialThrottlingConfigurationV2() {
        // basic
        HttpRequestDef.Builder<CreateSpecialThrottlingConfigurationV2Request, CreateSpecialThrottlingConfigurationV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateSpecialThrottlingConfigurationV2Request.class,
                    CreateSpecialThrottlingConfigurationV2Response.class)
                .withName("CreateSpecialThrottlingConfigurationV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/throttles/{throttle_id}/throttle-specials")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSpecialThrottlingConfigurationV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("throttle_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateSpecialThrottlingConfigurationV2Request::getThrottleId, (req, v) -> {
                req.setThrottleId(v);
            }));
        builder.<ThrottleSpecialCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ThrottleSpecialCreate.class),
            f -> f.withMarshaller(CreateSpecialThrottlingConfigurationV2Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCustomAuthorizerV2Request, DeleteCustomAuthorizerV2Response> deleteCustomAuthorizerV2 =
        genFordeleteCustomAuthorizerV2();

    private static HttpRequestDef<DeleteCustomAuthorizerV2Request, DeleteCustomAuthorizerV2Response> genFordeleteCustomAuthorizerV2() {
        // basic
        HttpRequestDef.Builder<DeleteCustomAuthorizerV2Request, DeleteCustomAuthorizerV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteCustomAuthorizerV2Request.class,
                    DeleteCustomAuthorizerV2Response.class)
                .withName("DeleteCustomAuthorizerV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/authorizers/{authorizer_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCustomAuthorizerV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("authorizer_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCustomAuthorizerV2Request::getAuthorizerId, (req, v) -> {
                req.setAuthorizerId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEnvironmentV2Request, DeleteEnvironmentV2Response> deleteEnvironmentV2 =
        genFordeleteEnvironmentV2();

    private static HttpRequestDef<DeleteEnvironmentV2Request, DeleteEnvironmentV2Response> genFordeleteEnvironmentV2() {
        // basic
        HttpRequestDef.Builder<DeleteEnvironmentV2Request, DeleteEnvironmentV2Response> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteEnvironmentV2Request.class, DeleteEnvironmentV2Response.class)
            .withName("DeleteEnvironmentV2")
            .withUri("/v2/{project_id}/apigw/instances/{instance_id}/envs/{env_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEnvironmentV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("env_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEnvironmentV2Request::getEnvId, (req, v) -> {
                req.setEnvId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEnvironmentVariableV2Request, DeleteEnvironmentVariableV2Response> deleteEnvironmentVariableV2 =
        genFordeleteEnvironmentVariableV2();

    private static HttpRequestDef<DeleteEnvironmentVariableV2Request, DeleteEnvironmentVariableV2Response> genFordeleteEnvironmentVariableV2() {
        // basic
        HttpRequestDef.Builder<DeleteEnvironmentVariableV2Request, DeleteEnvironmentVariableV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteEnvironmentVariableV2Request.class,
                    DeleteEnvironmentVariableV2Response.class)
                .withName("DeleteEnvironmentVariableV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/env-variables/{env_variable_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEnvironmentVariableV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("env_variable_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEnvironmentVariableV2Request::getEnvVariableId, (req, v) -> {
                req.setEnvVariableId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteGatewayResponseTypeV2Request, DeleteGatewayResponseTypeV2Response> deleteGatewayResponseTypeV2 =
        genFordeleteGatewayResponseTypeV2();

    private static HttpRequestDef<DeleteGatewayResponseTypeV2Request, DeleteGatewayResponseTypeV2Response> genFordeleteGatewayResponseTypeV2() {
        // basic
        HttpRequestDef.Builder<DeleteGatewayResponseTypeV2Request, DeleteGatewayResponseTypeV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteGatewayResponseTypeV2Request.class,
                    DeleteGatewayResponseTypeV2Response.class)
                .withName("DeleteGatewayResponseTypeV2")
                .withUri(
                    "/v2/{project_id}/apigw/instances/{instance_id}/api-groups/{group_id}/gateway-responses/{response_id}/{response_type}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGatewayResponseTypeV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGatewayResponseTypeV2Request::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<String>withRequestField("response_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGatewayResponseTypeV2Request::getResponseId, (req, v) -> {
                req.setResponseId(v);
            }));
        builder.<DeleteGatewayResponseTypeV2Request.ResponseTypeEnum>withRequestField("response_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteGatewayResponseTypeV2Request.ResponseTypeEnum.class),
            f -> f.withMarshaller(DeleteGatewayResponseTypeV2Request::getResponseType, (req, v) -> {
                req.setResponseType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteGatewayResponseV2Request, DeleteGatewayResponseV2Response> deleteGatewayResponseV2 =
        genFordeleteGatewayResponseV2();

    private static HttpRequestDef<DeleteGatewayResponseV2Request, DeleteGatewayResponseV2Response> genFordeleteGatewayResponseV2() {
        // basic
        HttpRequestDef.Builder<DeleteGatewayResponseV2Request, DeleteGatewayResponseV2Response> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteGatewayResponseV2Request.class, DeleteGatewayResponseV2Response.class)
            .withName("DeleteGatewayResponseV2")
            .withUri(
                "/v2/{project_id}/apigw/instances/{instance_id}/api-groups/{group_id}/gateway-responses/{response_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGatewayResponseV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGatewayResponseV2Request::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<String>withRequestField("response_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGatewayResponseV2Request::getResponseId, (req, v) -> {
                req.setResponseId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteInstancesV2Request, DeleteInstancesV2Response> deleteInstancesV2 =
        genFordeleteInstancesV2();

    private static HttpRequestDef<DeleteInstancesV2Request, DeleteInstancesV2Response> genFordeleteInstancesV2() {
        // basic
        HttpRequestDef.Builder<DeleteInstancesV2Request, DeleteInstancesV2Response> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteInstancesV2Request.class, DeleteInstancesV2Response.class)
                .withName("DeleteInstancesV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInstancesV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteRequestThrottlingPolicyV2Request, DeleteRequestThrottlingPolicyV2Response> deleteRequestThrottlingPolicyV2 =
        genFordeleteRequestThrottlingPolicyV2();

    private static HttpRequestDef<DeleteRequestThrottlingPolicyV2Request, DeleteRequestThrottlingPolicyV2Response> genFordeleteRequestThrottlingPolicyV2() {
        // basic
        HttpRequestDef.Builder<DeleteRequestThrottlingPolicyV2Request, DeleteRequestThrottlingPolicyV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteRequestThrottlingPolicyV2Request.class,
                    DeleteRequestThrottlingPolicyV2Response.class)
                .withName("DeleteRequestThrottlingPolicyV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/throttles/{throttle_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRequestThrottlingPolicyV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("throttle_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteRequestThrottlingPolicyV2Request::getThrottleId, (req, v) -> {
                req.setThrottleId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSignatureKeyV2Request, DeleteSignatureKeyV2Response> deleteSignatureKeyV2 =
        genFordeleteSignatureKeyV2();

    private static HttpRequestDef<DeleteSignatureKeyV2Request, DeleteSignatureKeyV2Response> genFordeleteSignatureKeyV2() {
        // basic
        HttpRequestDef.Builder<DeleteSignatureKeyV2Request, DeleteSignatureKeyV2Response> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteSignatureKeyV2Request.class, DeleteSignatureKeyV2Response.class)
            .withName("DeleteSignatureKeyV2")
            .withUri("/v2/{project_id}/apigw/instances/{instance_id}/signs/{sign_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSignatureKeyV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("sign_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSignatureKeyV2Request::getSignId, (req, v) -> {
                req.setSignId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteSpecialThrottlingConfigurationV2Request, DeleteSpecialThrottlingConfigurationV2Response> deleteSpecialThrottlingConfigurationV2 =
        genFordeleteSpecialThrottlingConfigurationV2();

    private static HttpRequestDef<DeleteSpecialThrottlingConfigurationV2Request, DeleteSpecialThrottlingConfigurationV2Response> genFordeleteSpecialThrottlingConfigurationV2() {
        // basic
        HttpRequestDef.Builder<DeleteSpecialThrottlingConfigurationV2Request, DeleteSpecialThrottlingConfigurationV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteSpecialThrottlingConfigurationV2Request.class,
                    DeleteSpecialThrottlingConfigurationV2Response.class)
                .withName("DeleteSpecialThrottlingConfigurationV2")
                .withUri(
                    "/v2/{project_id}/apigw/instances/{instance_id}/throttles/{throttle_id}/throttle-specials/{strategy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSpecialThrottlingConfigurationV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("throttle_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSpecialThrottlingConfigurationV2Request::getThrottleId, (req, v) -> {
                req.setThrottleId(v);
            }));
        builder.<String>withRequestField("strategy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteSpecialThrottlingConfigurationV2Request::getStrategyId, (req, v) -> {
                req.setStrategyId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisassociateCertificateV2Request, DisassociateCertificateV2Response> disassociateCertificateV2 =
        genFordisassociateCertificateV2();

    private static HttpRequestDef<DisassociateCertificateV2Request, DisassociateCertificateV2Response> genFordisassociateCertificateV2() {
        // basic
        HttpRequestDef.Builder<DisassociateCertificateV2Request, DisassociateCertificateV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DisassociateCertificateV2Request.class,
                    DisassociateCertificateV2Response.class)
                .withName("DisassociateCertificateV2")
                .withUri(
                    "/v2/{project_id}/apigw/instances/{instance_id}/api-groups/{group_id}/domains/{domain_id}/certificate/{certificate_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisassociateCertificateV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisassociateCertificateV2Request::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisassociateCertificateV2Request::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisassociateCertificateV2Request::getCertificateId, (req, v) -> {
                req.setCertificateId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisassociateDomainV2Request, DisassociateDomainV2Response> disassociateDomainV2 =
        genFordisassociateDomainV2();

    private static HttpRequestDef<DisassociateDomainV2Request, DisassociateDomainV2Response> genFordisassociateDomainV2() {
        // basic
        HttpRequestDef.Builder<DisassociateDomainV2Request, DisassociateDomainV2Response> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DisassociateDomainV2Request.class, DisassociateDomainV2Response.class)
            .withName("DisassociateDomainV2")
            .withUri("/v2/{project_id}/apigw/instances/{instance_id}/api-groups/{group_id}/domains/{domain_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisassociateDomainV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisassociateDomainV2Request::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisassociateDomainV2Request::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisassociateSignatureKeyV2Request, DisassociateSignatureKeyV2Response> disassociateSignatureKeyV2 =
        genFordisassociateSignatureKeyV2();

    private static HttpRequestDef<DisassociateSignatureKeyV2Request, DisassociateSignatureKeyV2Response> genFordisassociateSignatureKeyV2() {
        // basic
        HttpRequestDef.Builder<DisassociateSignatureKeyV2Request, DisassociateSignatureKeyV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DisassociateSignatureKeyV2Request.class,
                    DisassociateSignatureKeyV2Response.class)
                .withName("DisassociateSignatureKeyV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/sign-bindings/{sign_bindings_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisassociateSignatureKeyV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("sign_bindings_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisassociateSignatureKeyV2Request::getSignBindingsId, (req, v) -> {
                req.setSignBindingsId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportMicroserviceRequest, ImportMicroserviceResponse> importMicroservice =
        genForimportMicroservice();

    private static HttpRequestDef<ImportMicroserviceRequest, ImportMicroserviceResponse> genForimportMicroservice() {
        // basic
        HttpRequestDef.Builder<ImportMicroserviceRequest, ImportMicroserviceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, ImportMicroserviceRequest.class, ImportMicroserviceResponse.class)
                .withName("ImportMicroservice")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/microservice/import")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportMicroserviceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<MicroserviceImportReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MicroserviceImportReq.class),
            f -> f.withMarshaller(ImportMicroserviceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApiGroupsQuantitiesV2Request, ListApiGroupsQuantitiesV2Response> listApiGroupsQuantitiesV2 =
        genForlistApiGroupsQuantitiesV2();

    private static HttpRequestDef<ListApiGroupsQuantitiesV2Request, ListApiGroupsQuantitiesV2Response> genForlistApiGroupsQuantitiesV2() {
        // basic
        HttpRequestDef.Builder<ListApiGroupsQuantitiesV2Request, ListApiGroupsQuantitiesV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListApiGroupsQuantitiesV2Request.class,
                    ListApiGroupsQuantitiesV2Response.class)
                .withName("ListApiGroupsQuantitiesV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/resources/outline/groups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApiGroupsQuantitiesV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApiQuantitiesV2Request, ListApiQuantitiesV2Response> listApiQuantitiesV2 =
        genForlistApiQuantitiesV2();

    private static HttpRequestDef<ListApiQuantitiesV2Request, ListApiQuantitiesV2Response> genForlistApiQuantitiesV2() {
        // basic
        HttpRequestDef.Builder<ListApiQuantitiesV2Request, ListApiQuantitiesV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListApiQuantitiesV2Request.class, ListApiQuantitiesV2Response.class)
                .withName("ListApiQuantitiesV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/resources/outline/apis")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApiQuantitiesV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApisBindedToSignatureKeyV2Request, ListApisBindedToSignatureKeyV2Response> listApisBindedToSignatureKeyV2 =
        genForlistApisBindedToSignatureKeyV2();

    private static HttpRequestDef<ListApisBindedToSignatureKeyV2Request, ListApisBindedToSignatureKeyV2Response> genForlistApisBindedToSignatureKeyV2() {
        // basic
        HttpRequestDef.Builder<ListApisBindedToSignatureKeyV2Request, ListApisBindedToSignatureKeyV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListApisBindedToSignatureKeyV2Request.class,
                    ListApisBindedToSignatureKeyV2Response.class)
                .withName("ListApisBindedToSignatureKeyV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/sign-bindings/binded-apis")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisBindedToSignatureKeyV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListApisBindedToSignatureKeyV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApisBindedToSignatureKeyV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("sign_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisBindedToSignatureKeyV2Request::getSignId, (req, v) -> {
                req.setSignId(v);
            }));
        builder.<String>withRequestField("env_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisBindedToSignatureKeyV2Request::getEnvId, (req, v) -> {
                req.setEnvId(v);
            }));
        builder.<String>withRequestField("api_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisBindedToSignatureKeyV2Request::getApiId, (req, v) -> {
                req.setApiId(v);
            }));
        builder.<String>withRequestField("api_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisBindedToSignatureKeyV2Request::getApiName, (req, v) -> {
                req.setApiName(v);
            }));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisBindedToSignatureKeyV2Request::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApisNotBoundWithSignatureKeyV2Request, ListApisNotBoundWithSignatureKeyV2Response> listApisNotBoundWithSignatureKeyV2 =
        genForlistApisNotBoundWithSignatureKeyV2();

    private static HttpRequestDef<ListApisNotBoundWithSignatureKeyV2Request, ListApisNotBoundWithSignatureKeyV2Response> genForlistApisNotBoundWithSignatureKeyV2() {
        // basic
        HttpRequestDef.Builder<ListApisNotBoundWithSignatureKeyV2Request, ListApisNotBoundWithSignatureKeyV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListApisNotBoundWithSignatureKeyV2Request.class,
                    ListApisNotBoundWithSignatureKeyV2Response.class)
                .withName("ListApisNotBoundWithSignatureKeyV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/sign-bindings/unbinded-apis")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisNotBoundWithSignatureKeyV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListApisNotBoundWithSignatureKeyV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApisNotBoundWithSignatureKeyV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("sign_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisNotBoundWithSignatureKeyV2Request::getSignId, (req, v) -> {
                req.setSignId(v);
            }));
        builder.<String>withRequestField("env_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisNotBoundWithSignatureKeyV2Request::getEnvId, (req, v) -> {
                req.setEnvId(v);
            }));
        builder.<String>withRequestField("api_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisNotBoundWithSignatureKeyV2Request::getApiId, (req, v) -> {
                req.setApiId(v);
            }));
        builder.<String>withRequestField("api_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisNotBoundWithSignatureKeyV2Request::getApiName, (req, v) -> {
                req.setApiName(v);
            }));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisNotBoundWithSignatureKeyV2Request::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAppQuantitiesV2Request, ListAppQuantitiesV2Response> listAppQuantitiesV2 =
        genForlistAppQuantitiesV2();

    private static HttpRequestDef<ListAppQuantitiesV2Request, ListAppQuantitiesV2Response> genForlistAppQuantitiesV2() {
        // basic
        HttpRequestDef.Builder<ListAppQuantitiesV2Request, ListAppQuantitiesV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAppQuantitiesV2Request.class, ListAppQuantitiesV2Response.class)
                .withName("ListAppQuantitiesV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/resources/outline/apps")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppQuantitiesV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAvailableZonesV2Request, ListAvailableZonesV2Response> listAvailableZonesV2 =
        genForlistAvailableZonesV2();

    private static HttpRequestDef<ListAvailableZonesV2Request, ListAvailableZonesV2Response> genForlistAvailableZonesV2() {
        // basic
        HttpRequestDef.Builder<ListAvailableZonesV2Request, ListAvailableZonesV2Response> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAvailableZonesV2Request.class, ListAvailableZonesV2Response.class)
            .withName("ListAvailableZonesV2")
            .withUri("/v2/{project_id}/apigw/available-zones")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCustomAuthorizersV2Request, ListCustomAuthorizersV2Response> listCustomAuthorizersV2 =
        genForlistCustomAuthorizersV2();

    private static HttpRequestDef<ListCustomAuthorizersV2Request, ListCustomAuthorizersV2Response> genForlistCustomAuthorizersV2() {
        // basic
        HttpRequestDef.Builder<ListCustomAuthorizersV2Request, ListCustomAuthorizersV2Response> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListCustomAuthorizersV2Request.class, ListCustomAuthorizersV2Response.class)
            .withName("ListCustomAuthorizersV2")
            .withUri("/v2/{project_id}/apigw/instances/{instance_id}/authorizers")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomAuthorizersV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListCustomAuthorizersV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCustomAuthorizersV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomAuthorizersV2Request::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomAuthorizersV2Request::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCustomAuthorizersV2Request::getType, (req, v) -> {
                req.setType(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEnvironmentVariablesV2Request, ListEnvironmentVariablesV2Response> listEnvironmentVariablesV2 =
        genForlistEnvironmentVariablesV2();

    private static HttpRequestDef<ListEnvironmentVariablesV2Request, ListEnvironmentVariablesV2Response> genForlistEnvironmentVariablesV2() {
        // basic
        HttpRequestDef.Builder<ListEnvironmentVariablesV2Request, ListEnvironmentVariablesV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListEnvironmentVariablesV2Request.class,
                    ListEnvironmentVariablesV2Response.class)
                .withName("ListEnvironmentVariablesV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/env-variables")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEnvironmentVariablesV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListEnvironmentVariablesV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEnvironmentVariablesV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEnvironmentVariablesV2Request::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<String>withRequestField("env_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEnvironmentVariablesV2Request::getEnvId, (req, v) -> {
                req.setEnvId(v);
            }));
        builder.<String>withRequestField("variable_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEnvironmentVariablesV2Request::getVariableName, (req, v) -> {
                req.setVariableName(v);
            }));
        builder.<String>withRequestField("precise_search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEnvironmentVariablesV2Request::getPreciseSearch, (req, v) -> {
                req.setPreciseSearch(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEnvironmentsV2Request, ListEnvironmentsV2Response> listEnvironmentsV2 =
        genForlistEnvironmentsV2();

    private static HttpRequestDef<ListEnvironmentsV2Request, ListEnvironmentsV2Response> genForlistEnvironmentsV2() {
        // basic
        HttpRequestDef.Builder<ListEnvironmentsV2Request, ListEnvironmentsV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEnvironmentsV2Request.class, ListEnvironmentsV2Response.class)
                .withName("ListEnvironmentsV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/envs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEnvironmentsV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListEnvironmentsV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEnvironmentsV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEnvironmentsV2Request::getName, (req, v) -> {
                req.setName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFeaturesV2Request, ListFeaturesV2Response> listFeaturesV2 =
        genForlistFeaturesV2();

    private static HttpRequestDef<ListFeaturesV2Request, ListFeaturesV2Response> genForlistFeaturesV2() {
        // basic
        HttpRequestDef.Builder<ListFeaturesV2Request, ListFeaturesV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFeaturesV2Request.class, ListFeaturesV2Response.class)
                .withName("ListFeaturesV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/features")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListFeaturesV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListFeaturesV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListFeaturesV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGatewayResponsesV2Request, ListGatewayResponsesV2Response> listGatewayResponsesV2 =
        genForlistGatewayResponsesV2();

    private static HttpRequestDef<ListGatewayResponsesV2Request, ListGatewayResponsesV2Response> genForlistGatewayResponsesV2() {
        // basic
        HttpRequestDef.Builder<ListGatewayResponsesV2Request, ListGatewayResponsesV2Response> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListGatewayResponsesV2Request.class, ListGatewayResponsesV2Response.class)
            .withName("ListGatewayResponsesV2")
            .withUri("/v2/{project_id}/apigw/instances/{instance_id}/api-groups/{group_id}/gateway-responses")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGatewayResponsesV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGatewayResponsesV2Request::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListGatewayResponsesV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGatewayResponsesV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceConfigsV2Request, ListInstanceConfigsV2Response> listInstanceConfigsV2 =
        genForlistInstanceConfigsV2();

    private static HttpRequestDef<ListInstanceConfigsV2Request, ListInstanceConfigsV2Response> genForlistInstanceConfigsV2() {
        // basic
        HttpRequestDef.Builder<ListInstanceConfigsV2Request, ListInstanceConfigsV2Response> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListInstanceConfigsV2Request.class, ListInstanceConfigsV2Response.class)
            .withName("ListInstanceConfigsV2")
            .withUri("/v2/{project_id}/apigw/instance/configs")
            .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListInstanceConfigsV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceConfigsV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstancesV2Request, ListInstancesV2Response> listInstancesV2 =
        genForlistInstancesV2();

    private static HttpRequestDef<ListInstancesV2Request, ListInstancesV2Response> genForlistInstancesV2() {
        // basic
        HttpRequestDef.Builder<ListInstancesV2Request, ListInstancesV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListInstancesV2Request.class, ListInstancesV2Response.class)
                .withName("ListInstancesV2")
                .withUri("/v2/{project_id}/apigw/instances")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListInstancesV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstancesV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("instance_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesV2Request::getInstanceName, (req, v) -> {
                req.setInstanceName(v);
            }));
        builder.<ListInstancesV2Request.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInstancesV2Request.StatusEnum.class),
            f -> f.withMarshaller(ListInstancesV2Request::getStatus, (req, v) -> {
                req.setStatus(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLatelyApiStatisticsV2Request, ListLatelyApiStatisticsV2Response> listLatelyApiStatisticsV2 =
        genForlistLatelyApiStatisticsV2();

    private static HttpRequestDef<ListLatelyApiStatisticsV2Request, ListLatelyApiStatisticsV2Response> genForlistLatelyApiStatisticsV2() {
        // basic
        HttpRequestDef.Builder<ListLatelyApiStatisticsV2Request, ListLatelyApiStatisticsV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListLatelyApiStatisticsV2Request.class,
                    ListLatelyApiStatisticsV2Response.class)
                .withName("ListLatelyApiStatisticsV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/statistics/api/latest")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLatelyApiStatisticsV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("api_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLatelyApiStatisticsV2Request::getApiId, (req, v) -> {
                req.setApiId(v);
            }));
        builder.<String>withRequestField("duration",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLatelyApiStatisticsV2Request::getDuration, (req, v) -> {
                req.setDuration(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListLatelyGroupStatisticsV2Request, ListLatelyGroupStatisticsV2Response> listLatelyGroupStatisticsV2 =
        genForlistLatelyGroupStatisticsV2();

    private static HttpRequestDef<ListLatelyGroupStatisticsV2Request, ListLatelyGroupStatisticsV2Response> genForlistLatelyGroupStatisticsV2() {
        // basic
        HttpRequestDef.Builder<ListLatelyGroupStatisticsV2Request, ListLatelyGroupStatisticsV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListLatelyGroupStatisticsV2Request.class,
                    ListLatelyGroupStatisticsV2Response.class)
                .withName("ListLatelyGroupStatisticsV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/statistics/group/latest")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLatelyGroupStatisticsV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListLatelyGroupStatisticsV2Request::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMetricDataRequest, ListMetricDataResponse> listMetricData =
        genForlistMetricData();

    private static HttpRequestDef<ListMetricDataRequest, ListMetricDataResponse> genForlistMetricData() {
        // basic
        HttpRequestDef.Builder<ListMetricDataRequest, ListMetricDataResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListMetricDataRequest.class, ListMetricDataResponse.class)
                .withName("ListMetricData")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/metric-data")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMetricDataRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<ListMetricDataRequest.DimEnum>withRequestField("dim",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListMetricDataRequest.DimEnum.class),
            f -> f.withMarshaller(ListMetricDataRequest::getDim, (req, v) -> {
                req.setDim(v);
            }));
        builder.<ListMetricDataRequest.MetricNameEnum>withRequestField("metric_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListMetricDataRequest.MetricNameEnum.class),
            f -> f.withMarshaller(ListMetricDataRequest::getMetricName, (req, v) -> {
                req.setMetricName(v);
            }));
        builder.<String>withRequestField("from",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMetricDataRequest::getFrom, (req, v) -> {
                req.setFrom(v);
            }));
        builder.<String>withRequestField("to",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMetricDataRequest::getTo, (req, v) -> {
                req.setTo(v);
            }));
        builder.<ListMetricDataRequest.PeriodEnum>withRequestField("period",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListMetricDataRequest.PeriodEnum.class),
            f -> f.withMarshaller(ListMetricDataRequest::getPeriod, (req, v) -> {
                req.setPeriod(v);
            }));
        builder.<ListMetricDataRequest.FilterEnum>withRequestField("filter",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListMetricDataRequest.FilterEnum.class),
            f -> f.withMarshaller(ListMetricDataRequest::getFilter, (req, v) -> {
                req.setFilter(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectCofigsV2Request, ListProjectCofigsV2Response> listProjectCofigsV2 =
        genForlistProjectCofigsV2();

    private static HttpRequestDef<ListProjectCofigsV2Request, ListProjectCofigsV2Response> genForlistProjectCofigsV2() {
        // basic
        HttpRequestDef.Builder<ListProjectCofigsV2Request, ListProjectCofigsV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProjectCofigsV2Request.class, ListProjectCofigsV2Response.class)
                .withName("ListProjectCofigsV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/project/configs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectCofigsV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListProjectCofigsV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListProjectCofigsV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRequestThrottlingPolicyV2Request, ListRequestThrottlingPolicyV2Response> listRequestThrottlingPolicyV2 =
        genForlistRequestThrottlingPolicyV2();

    private static HttpRequestDef<ListRequestThrottlingPolicyV2Request, ListRequestThrottlingPolicyV2Response> genForlistRequestThrottlingPolicyV2() {
        // basic
        HttpRequestDef.Builder<ListRequestThrottlingPolicyV2Request, ListRequestThrottlingPolicyV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListRequestThrottlingPolicyV2Request.class,
                    ListRequestThrottlingPolicyV2Response.class)
                .withName("ListRequestThrottlingPolicyV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/throttles")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRequestThrottlingPolicyV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListRequestThrottlingPolicyV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRequestThrottlingPolicyV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRequestThrottlingPolicyV2Request::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRequestThrottlingPolicyV2Request::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("precise_search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRequestThrottlingPolicyV2Request::getPreciseSearch, (req, v) -> {
                req.setPreciseSearch(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSignatureKeysBindedToApiV2Request, ListSignatureKeysBindedToApiV2Response> listSignatureKeysBindedToApiV2 =
        genForlistSignatureKeysBindedToApiV2();

    private static HttpRequestDef<ListSignatureKeysBindedToApiV2Request, ListSignatureKeysBindedToApiV2Response> genForlistSignatureKeysBindedToApiV2() {
        // basic
        HttpRequestDef.Builder<ListSignatureKeysBindedToApiV2Request, ListSignatureKeysBindedToApiV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListSignatureKeysBindedToApiV2Request.class,
                    ListSignatureKeysBindedToApiV2Response.class)
                .withName("ListSignatureKeysBindedToApiV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/sign-bindings/binded-signs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSignatureKeysBindedToApiV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSignatureKeysBindedToApiV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSignatureKeysBindedToApiV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("api_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSignatureKeysBindedToApiV2Request::getApiId, (req, v) -> {
                req.setApiId(v);
            }));
        builder.<String>withRequestField("sign_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSignatureKeysBindedToApiV2Request::getSignId, (req, v) -> {
                req.setSignId(v);
            }));
        builder.<String>withRequestField("sign_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSignatureKeysBindedToApiV2Request::getSignName, (req, v) -> {
                req.setSignName(v);
            }));
        builder.<String>withRequestField("env_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSignatureKeysBindedToApiV2Request::getEnvId, (req, v) -> {
                req.setEnvId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSignatureKeysV2Request, ListSignatureKeysV2Response> listSignatureKeysV2 =
        genForlistSignatureKeysV2();

    private static HttpRequestDef<ListSignatureKeysV2Request, ListSignatureKeysV2Response> genForlistSignatureKeysV2() {
        // basic
        HttpRequestDef.Builder<ListSignatureKeysV2Request, ListSignatureKeysV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListSignatureKeysV2Request.class, ListSignatureKeysV2Response.class)
                .withName("ListSignatureKeysV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/signs")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSignatureKeysV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSignatureKeysV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSignatureKeysV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSignatureKeysV2Request::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSignatureKeysV2Request::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("precise_search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSignatureKeysV2Request::getPreciseSearch, (req, v) -> {
                req.setPreciseSearch(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListSpecialThrottlingConfigurationsV2Request, ListSpecialThrottlingConfigurationsV2Response> listSpecialThrottlingConfigurationsV2 =
        genForlistSpecialThrottlingConfigurationsV2();

    private static HttpRequestDef<ListSpecialThrottlingConfigurationsV2Request, ListSpecialThrottlingConfigurationsV2Response> genForlistSpecialThrottlingConfigurationsV2() {
        // basic
        HttpRequestDef.Builder<ListSpecialThrottlingConfigurationsV2Request, ListSpecialThrottlingConfigurationsV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListSpecialThrottlingConfigurationsV2Request.class,
                    ListSpecialThrottlingConfigurationsV2Response.class)
                .withName("ListSpecialThrottlingConfigurationsV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/throttles/{throttle_id}/throttle-specials")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSpecialThrottlingConfigurationsV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("throttle_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSpecialThrottlingConfigurationsV2Request::getThrottleId, (req, v) -> {
                req.setThrottleId(v);
            }));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListSpecialThrottlingConfigurationsV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListSpecialThrottlingConfigurationsV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("object_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSpecialThrottlingConfigurationsV2Request::getObjectType, (req, v) -> {
                req.setObjectType(v);
            }));
        builder.<String>withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSpecialThrottlingConfigurationsV2Request::getAppName, (req, v) -> {
                req.setAppName(v);
            }));
        builder.<String>withRequestField("user",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListSpecialThrottlingConfigurationsV2Request::getUser, (req, v) -> {
                req.setUser(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTagsV2Request, ListTagsV2Response> listTagsV2 = genForlistTagsV2();

    private static HttpRequestDef<ListTagsV2Request, ListTagsV2Response> genForlistTagsV2() {
        // basic
        HttpRequestDef.Builder<ListTagsV2Request, ListTagsV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTagsV2Request.class, ListTagsV2Response.class)
                .withName("ListTagsV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTagsV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListTagsV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTagsV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RemoveEipV2Request, RemoveEipV2Response> removeEipV2 = genForremoveEipV2();

    private static HttpRequestDef<RemoveEipV2Request, RemoveEipV2Response> genForremoveEipV2() {
        // basic
        HttpRequestDef.Builder<RemoveEipV2Request, RemoveEipV2Response> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, RemoveEipV2Request.class, RemoveEipV2Response.class)
                .withName("RemoveEipV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/eip")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RemoveEipV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RemoveEngressEipV2Request, RemoveEngressEipV2Response> removeEngressEipV2 =
        genForremoveEngressEipV2();

    private static HttpRequestDef<RemoveEngressEipV2Request, RemoveEngressEipV2Response> genForremoveEngressEipV2() {
        // basic
        HttpRequestDef.Builder<RemoveEngressEipV2Request, RemoveEngressEipV2Response> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, RemoveEngressEipV2Request.class, RemoveEngressEipV2Response.class)
                .withName("RemoveEngressEipV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/nat-eip")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RemoveEngressEipV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDetailsOfCustomAuthorizersV2Request, ShowDetailsOfCustomAuthorizersV2Response> showDetailsOfCustomAuthorizersV2 =
        genForshowDetailsOfCustomAuthorizersV2();

    private static HttpRequestDef<ShowDetailsOfCustomAuthorizersV2Request, ShowDetailsOfCustomAuthorizersV2Response> genForshowDetailsOfCustomAuthorizersV2() {
        // basic
        HttpRequestDef.Builder<ShowDetailsOfCustomAuthorizersV2Request, ShowDetailsOfCustomAuthorizersV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowDetailsOfCustomAuthorizersV2Request.class,
                    ShowDetailsOfCustomAuthorizersV2Response.class)
                .withName("ShowDetailsOfCustomAuthorizersV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/authorizers/{authorizer_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailsOfCustomAuthorizersV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("authorizer_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailsOfCustomAuthorizersV2Request::getAuthorizerId, (req, v) -> {
                req.setAuthorizerId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDetailsOfDomainNameCertificateV2Request, ShowDetailsOfDomainNameCertificateV2Response> showDetailsOfDomainNameCertificateV2 =
        genForshowDetailsOfDomainNameCertificateV2();

    private static HttpRequestDef<ShowDetailsOfDomainNameCertificateV2Request, ShowDetailsOfDomainNameCertificateV2Response> genForshowDetailsOfDomainNameCertificateV2() {
        // basic
        HttpRequestDef.Builder<ShowDetailsOfDomainNameCertificateV2Request, ShowDetailsOfDomainNameCertificateV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowDetailsOfDomainNameCertificateV2Request.class,
                    ShowDetailsOfDomainNameCertificateV2Response.class)
                .withName("ShowDetailsOfDomainNameCertificateV2")
                .withUri(
                    "/v2/{project_id}/apigw/instances/{instance_id}/api-groups/{group_id}/domains/{domain_id}/certificate/{certificate_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailsOfDomainNameCertificateV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailsOfDomainNameCertificateV2Request::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailsOfDomainNameCertificateV2Request::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailsOfDomainNameCertificateV2Request::getCertificateId, (req, v) -> {
                req.setCertificateId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDetailsOfEnvironmentVariableV2Request, ShowDetailsOfEnvironmentVariableV2Response> showDetailsOfEnvironmentVariableV2 =
        genForshowDetailsOfEnvironmentVariableV2();

    private static HttpRequestDef<ShowDetailsOfEnvironmentVariableV2Request, ShowDetailsOfEnvironmentVariableV2Response> genForshowDetailsOfEnvironmentVariableV2() {
        // basic
        HttpRequestDef.Builder<ShowDetailsOfEnvironmentVariableV2Request, ShowDetailsOfEnvironmentVariableV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowDetailsOfEnvironmentVariableV2Request.class,
                    ShowDetailsOfEnvironmentVariableV2Response.class)
                .withName("ShowDetailsOfEnvironmentVariableV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/env-variables/{env_variable_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailsOfEnvironmentVariableV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("env_variable_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailsOfEnvironmentVariableV2Request::getEnvVariableId, (req, v) -> {
                req.setEnvVariableId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDetailsOfGatewayResponseTypeV2Request, ShowDetailsOfGatewayResponseTypeV2Response> showDetailsOfGatewayResponseTypeV2 =
        genForshowDetailsOfGatewayResponseTypeV2();

    private static HttpRequestDef<ShowDetailsOfGatewayResponseTypeV2Request, ShowDetailsOfGatewayResponseTypeV2Response> genForshowDetailsOfGatewayResponseTypeV2() {
        // basic
        HttpRequestDef.Builder<ShowDetailsOfGatewayResponseTypeV2Request, ShowDetailsOfGatewayResponseTypeV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowDetailsOfGatewayResponseTypeV2Request.class,
                    ShowDetailsOfGatewayResponseTypeV2Response.class)
                .withName("ShowDetailsOfGatewayResponseTypeV2")
                .withUri(
                    "/v2/{project_id}/apigw/instances/{instance_id}/api-groups/{group_id}/gateway-responses/{response_id}/{response_type}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailsOfGatewayResponseTypeV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailsOfGatewayResponseTypeV2Request::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<String>withRequestField("response_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailsOfGatewayResponseTypeV2Request::getResponseId, (req, v) -> {
                req.setResponseId(v);
            }));
        builder.<ShowDetailsOfGatewayResponseTypeV2Request.ResponseTypeEnum>withRequestField("response_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowDetailsOfGatewayResponseTypeV2Request.ResponseTypeEnum.class),
            f -> f.withMarshaller(ShowDetailsOfGatewayResponseTypeV2Request::getResponseType, (req, v) -> {
                req.setResponseType(v);
            }));

        // response
        builder.<Map<String, ResponseInfoResp>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Map.class),
            f -> f.withMarshaller(ShowDetailsOfGatewayResponseTypeV2Response::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(ResponseInfoResp.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowDetailsOfGatewayResponseV2Request, ShowDetailsOfGatewayResponseV2Response> showDetailsOfGatewayResponseV2 =
        genForshowDetailsOfGatewayResponseV2();

    private static HttpRequestDef<ShowDetailsOfGatewayResponseV2Request, ShowDetailsOfGatewayResponseV2Response> genForshowDetailsOfGatewayResponseV2() {
        // basic
        HttpRequestDef.Builder<ShowDetailsOfGatewayResponseV2Request, ShowDetailsOfGatewayResponseV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowDetailsOfGatewayResponseV2Request.class,
                    ShowDetailsOfGatewayResponseV2Response.class)
                .withName("ShowDetailsOfGatewayResponseV2")
                .withUri(
                    "/v2/{project_id}/apigw/instances/{instance_id}/api-groups/{group_id}/gateway-responses/{response_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailsOfGatewayResponseV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailsOfGatewayResponseV2Request::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<String>withRequestField("response_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailsOfGatewayResponseV2Request::getResponseId, (req, v) -> {
                req.setResponseId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDetailsOfInstanceProgressV2Request, ShowDetailsOfInstanceProgressV2Response> showDetailsOfInstanceProgressV2 =
        genForshowDetailsOfInstanceProgressV2();

    private static HttpRequestDef<ShowDetailsOfInstanceProgressV2Request, ShowDetailsOfInstanceProgressV2Response> genForshowDetailsOfInstanceProgressV2() {
        // basic
        HttpRequestDef.Builder<ShowDetailsOfInstanceProgressV2Request, ShowDetailsOfInstanceProgressV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowDetailsOfInstanceProgressV2Request.class,
                    ShowDetailsOfInstanceProgressV2Response.class)
                .withName("ShowDetailsOfInstanceProgressV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/progress")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailsOfInstanceProgressV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDetailsOfInstanceV2Request, ShowDetailsOfInstanceV2Response> showDetailsOfInstanceV2 =
        genForshowDetailsOfInstanceV2();

    private static HttpRequestDef<ShowDetailsOfInstanceV2Request, ShowDetailsOfInstanceV2Response> genForshowDetailsOfInstanceV2() {
        // basic
        HttpRequestDef.Builder<ShowDetailsOfInstanceV2Request, ShowDetailsOfInstanceV2Response> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowDetailsOfInstanceV2Request.class, ShowDetailsOfInstanceV2Response.class)
            .withName("ShowDetailsOfInstanceV2")
            .withUri("/v2/{project_id}/apigw/instances/{instance_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailsOfInstanceV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDetailsOfRequestThrottlingPolicyV2Request, ShowDetailsOfRequestThrottlingPolicyV2Response> showDetailsOfRequestThrottlingPolicyV2 =
        genForshowDetailsOfRequestThrottlingPolicyV2();

    private static HttpRequestDef<ShowDetailsOfRequestThrottlingPolicyV2Request, ShowDetailsOfRequestThrottlingPolicyV2Response> genForshowDetailsOfRequestThrottlingPolicyV2() {
        // basic
        HttpRequestDef.Builder<ShowDetailsOfRequestThrottlingPolicyV2Request, ShowDetailsOfRequestThrottlingPolicyV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowDetailsOfRequestThrottlingPolicyV2Request.class,
                    ShowDetailsOfRequestThrottlingPolicyV2Response.class)
                .withName("ShowDetailsOfRequestThrottlingPolicyV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/throttles/{throttle_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailsOfRequestThrottlingPolicyV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("throttle_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailsOfRequestThrottlingPolicyV2Request::getThrottleId, (req, v) -> {
                req.setThrottleId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCustomAuthorizerV2Request, UpdateCustomAuthorizerV2Response> updateCustomAuthorizerV2 =
        genForupdateCustomAuthorizerV2();

    private static HttpRequestDef<UpdateCustomAuthorizerV2Request, UpdateCustomAuthorizerV2Response> genForupdateCustomAuthorizerV2() {
        // basic
        HttpRequestDef.Builder<UpdateCustomAuthorizerV2Request, UpdateCustomAuthorizerV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT, UpdateCustomAuthorizerV2Request.class, UpdateCustomAuthorizerV2Response.class)
                .withName("UpdateCustomAuthorizerV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/authorizers/{authorizer_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCustomAuthorizerV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("authorizer_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCustomAuthorizerV2Request::getAuthorizerId, (req, v) -> {
                req.setAuthorizerId(v);
            }));
        builder.<AuthorizerCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AuthorizerCreate.class),
            f -> f.withMarshaller(UpdateCustomAuthorizerV2Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateDomainV2Request, UpdateDomainV2Response> updateDomainV2 =
        genForupdateDomainV2();

    private static HttpRequestDef<UpdateDomainV2Request, UpdateDomainV2Response> genForupdateDomainV2() {
        // basic
        HttpRequestDef.Builder<UpdateDomainV2Request, UpdateDomainV2Response> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateDomainV2Request.class, UpdateDomainV2Response.class)
                .withName("UpdateDomainV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/api-groups/{group_id}/domains/{domain_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDomainV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDomainV2Request::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateDomainV2Request::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<UrlDomainModify>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UrlDomainModify.class),
            f -> f.withMarshaller(UpdateDomainV2Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEngressEipV2Request, UpdateEngressEipV2Response> updateEngressEipV2 =
        genForupdateEngressEipV2();

    private static HttpRequestDef<UpdateEngressEipV2Request, UpdateEngressEipV2Response> genForupdateEngressEipV2() {
        // basic
        HttpRequestDef.Builder<UpdateEngressEipV2Request, UpdateEngressEipV2Response> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateEngressEipV2Request.class, UpdateEngressEipV2Response.class)
                .withName("UpdateEngressEipV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/nat-eip")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEngressEipV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<OpenEngressEipReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(OpenEngressEipReq.class),
            f -> f.withMarshaller(UpdateEngressEipV2Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateEnvironmentV2Request, UpdateEnvironmentV2Response> updateEnvironmentV2 =
        genForupdateEnvironmentV2();

    private static HttpRequestDef<UpdateEnvironmentV2Request, UpdateEnvironmentV2Response> genForupdateEnvironmentV2() {
        // basic
        HttpRequestDef.Builder<UpdateEnvironmentV2Request, UpdateEnvironmentV2Response> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateEnvironmentV2Request.class, UpdateEnvironmentV2Response.class)
                .withName("UpdateEnvironmentV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/envs/{env_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEnvironmentV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("env_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateEnvironmentV2Request::getEnvId, (req, v) -> {
                req.setEnvId(v);
            }));
        builder.<EnvCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EnvCreate.class),
            f -> f.withMarshaller(UpdateEnvironmentV2Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateGatewayResponseTypeV2Request, UpdateGatewayResponseTypeV2Response> updateGatewayResponseTypeV2 =
        genForupdateGatewayResponseTypeV2();

    private static HttpRequestDef<UpdateGatewayResponseTypeV2Request, UpdateGatewayResponseTypeV2Response> genForupdateGatewayResponseTypeV2() {
        // basic
        HttpRequestDef.Builder<UpdateGatewayResponseTypeV2Request, UpdateGatewayResponseTypeV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateGatewayResponseTypeV2Request.class,
                    UpdateGatewayResponseTypeV2Response.class)
                .withName("UpdateGatewayResponseTypeV2")
                .withUri(
                    "/v2/{project_id}/apigw/instances/{instance_id}/api-groups/{group_id}/gateway-responses/{response_id}/{response_type}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGatewayResponseTypeV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGatewayResponseTypeV2Request::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<String>withRequestField("response_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGatewayResponseTypeV2Request::getResponseId, (req, v) -> {
                req.setResponseId(v);
            }));
        builder.<UpdateGatewayResponseTypeV2Request.ResponseTypeEnum>withRequestField("response_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateGatewayResponseTypeV2Request.ResponseTypeEnum.class),
            f -> f.withMarshaller(UpdateGatewayResponseTypeV2Request::getResponseType, (req, v) -> {
                req.setResponseType(v);
            }));
        builder.<ResponseInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResponseInfo.class),
            f -> f.withMarshaller(UpdateGatewayResponseTypeV2Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response
        builder.<Map<String, ResponseInfoResp>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Map.class),
            f -> f.withMarshaller(UpdateGatewayResponseTypeV2Response::getBody, (response, data) -> {
                response.setBody(data);
            }).withInnerContainerType(ResponseInfoResp.class));

        return builder.build();
    }

    public static final HttpRequestDef<UpdateGatewayResponseV2Request, UpdateGatewayResponseV2Response> updateGatewayResponseV2 =
        genForupdateGatewayResponseV2();

    private static HttpRequestDef<UpdateGatewayResponseV2Request, UpdateGatewayResponseV2Response> genForupdateGatewayResponseV2() {
        // basic
        HttpRequestDef.Builder<UpdateGatewayResponseV2Request, UpdateGatewayResponseV2Response> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateGatewayResponseV2Request.class, UpdateGatewayResponseV2Response.class)
            .withName("UpdateGatewayResponseV2")
            .withUri(
                "/v2/{project_id}/apigw/instances/{instance_id}/api-groups/{group_id}/gateway-responses/{response_id}")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGatewayResponseV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGatewayResponseV2Request::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<String>withRequestField("response_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGatewayResponseV2Request::getResponseId, (req, v) -> {
                req.setResponseId(v);
            }));
        builder.<ResponsesCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResponsesCreate.class),
            f -> f.withMarshaller(UpdateGatewayResponseV2Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceV2Request, UpdateInstanceV2Response> updateInstanceV2 =
        genForupdateInstanceV2();

    private static HttpRequestDef<UpdateInstanceV2Request, UpdateInstanceV2Response> genForupdateInstanceV2() {
        // basic
        HttpRequestDef.Builder<UpdateInstanceV2Request, UpdateInstanceV2Response> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateInstanceV2Request.class, UpdateInstanceV2Response.class)
                .withName("UpdateInstanceV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<InstanceModReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(InstanceModReq.class),
            f -> f.withMarshaller(UpdateInstanceV2Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateRequestThrottlingPolicyV2Request, UpdateRequestThrottlingPolicyV2Response> updateRequestThrottlingPolicyV2 =
        genForupdateRequestThrottlingPolicyV2();

    private static HttpRequestDef<UpdateRequestThrottlingPolicyV2Request, UpdateRequestThrottlingPolicyV2Response> genForupdateRequestThrottlingPolicyV2() {
        // basic
        HttpRequestDef.Builder<UpdateRequestThrottlingPolicyV2Request, UpdateRequestThrottlingPolicyV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateRequestThrottlingPolicyV2Request.class,
                    UpdateRequestThrottlingPolicyV2Response.class)
                .withName("UpdateRequestThrottlingPolicyV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/throttles/{throttle_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRequestThrottlingPolicyV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("throttle_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateRequestThrottlingPolicyV2Request::getThrottleId, (req, v) -> {
                req.setThrottleId(v);
            }));
        builder.<ThrottleBaseInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ThrottleBaseInfo.class),
            f -> f.withMarshaller(UpdateRequestThrottlingPolicyV2Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSignatureKeyV2Request, UpdateSignatureKeyV2Response> updateSignatureKeyV2 =
        genForupdateSignatureKeyV2();

    private static HttpRequestDef<UpdateSignatureKeyV2Request, UpdateSignatureKeyV2Response> genForupdateSignatureKeyV2() {
        // basic
        HttpRequestDef.Builder<UpdateSignatureKeyV2Request, UpdateSignatureKeyV2Response> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateSignatureKeyV2Request.class, UpdateSignatureKeyV2Response.class)
            .withName("UpdateSignatureKeyV2")
            .withUri("/v2/{project_id}/apigw/instances/{instance_id}/signs/{sign_id}")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSignatureKeyV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("sign_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSignatureKeyV2Request::getSignId, (req, v) -> {
                req.setSignId(v);
            }));
        builder.<BaseSignature>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(BaseSignature.class),
            f -> f.withMarshaller(UpdateSignatureKeyV2Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSpecialThrottlingConfigurationV2Request, UpdateSpecialThrottlingConfigurationV2Response> updateSpecialThrottlingConfigurationV2 =
        genForupdateSpecialThrottlingConfigurationV2();

    private static HttpRequestDef<UpdateSpecialThrottlingConfigurationV2Request, UpdateSpecialThrottlingConfigurationV2Response> genForupdateSpecialThrottlingConfigurationV2() {
        // basic
        HttpRequestDef.Builder<UpdateSpecialThrottlingConfigurationV2Request, UpdateSpecialThrottlingConfigurationV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateSpecialThrottlingConfigurationV2Request.class,
                    UpdateSpecialThrottlingConfigurationV2Response.class)
                .withName("UpdateSpecialThrottlingConfigurationV2")
                .withUri(
                    "/v2/{project_id}/apigw/instances/{instance_id}/throttles/{throttle_id}/throttle-specials/{strategy_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSpecialThrottlingConfigurationV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("throttle_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSpecialThrottlingConfigurationV2Request::getThrottleId, (req, v) -> {
                req.setThrottleId(v);
            }));
        builder.<String>withRequestField("strategy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSpecialThrottlingConfigurationV2Request::getStrategyId, (req, v) -> {
                req.setStrategyId(v);
            }));
        builder.<ThrottleSpecialUpdate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ThrottleSpecialUpdate.class),
            f -> f.withMarshaller(UpdateSpecialThrottlingConfigurationV2Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteAclV2Request, BatchDeleteAclV2Response> batchDeleteAclV2 =
        genForbatchDeleteAclV2();

    private static HttpRequestDef<BatchDeleteAclV2Request, BatchDeleteAclV2Response> genForbatchDeleteAclV2() {
        // basic
        HttpRequestDef.Builder<BatchDeleteAclV2Request, BatchDeleteAclV2Response> builder =
            HttpRequestDef.builder(HttpMethod.PUT, BatchDeleteAclV2Request.class, BatchDeleteAclV2Response.class)
                .withName("BatchDeleteAclV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/acls")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteAclV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("action",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteAclV2Request::getAction, (req, v) -> {
                req.setAction(v);
            }));
        builder.<AclBatchDelete>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AclBatchDelete.class),
            f -> f.withMarshaller(BatchDeleteAclV2Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAclStrategyV2Request, CreateAclStrategyV2Response> createAclStrategyV2 =
        genForcreateAclStrategyV2();

    private static HttpRequestDef<CreateAclStrategyV2Request, CreateAclStrategyV2Response> genForcreateAclStrategyV2() {
        // basic
        HttpRequestDef.Builder<CreateAclStrategyV2Request, CreateAclStrategyV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAclStrategyV2Request.class, CreateAclStrategyV2Response.class)
                .withName("CreateAclStrategyV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/acls")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAclStrategyV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<ApiAclCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApiAclCreate.class),
            f -> f.withMarshaller(CreateAclStrategyV2Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAclV2Request, DeleteAclV2Response> deleteAclV2 = genFordeleteAclV2();

    private static HttpRequestDef<DeleteAclV2Request, DeleteAclV2Response> genFordeleteAclV2() {
        // basic
        HttpRequestDef.Builder<DeleteAclV2Request, DeleteAclV2Response> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAclV2Request.class, DeleteAclV2Response.class)
                .withName("DeleteAclV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/acls/{acl_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAclV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("acl_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAclV2Request::getAclId, (req, v) -> {
                req.setAclId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAclStrategiesV2Request, ListAclStrategiesV2Response> listAclStrategiesV2 =
        genForlistAclStrategiesV2();

    private static HttpRequestDef<ListAclStrategiesV2Request, ListAclStrategiesV2Response> genForlistAclStrategiesV2() {
        // basic
        HttpRequestDef.Builder<ListAclStrategiesV2Request, ListAclStrategiesV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAclStrategiesV2Request.class, ListAclStrategiesV2Response.class)
                .withName("ListAclStrategiesV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/acls")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAclStrategiesV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAclStrategiesV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAclStrategiesV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAclStrategiesV2Request::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAclStrategiesV2Request::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("acl_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAclStrategiesV2Request::getAclType, (req, v) -> {
                req.setAclType(v);
            }));
        builder.<String>withRequestField("entity_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAclStrategiesV2Request::getEntityType, (req, v) -> {
                req.setEntityType(v);
            }));
        builder.<String>withRequestField("precise_search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAclStrategiesV2Request::getPreciseSearch, (req, v) -> {
                req.setPreciseSearch(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDetailsOfAclPolicyV2Request, ShowDetailsOfAclPolicyV2Response> showDetailsOfAclPolicyV2 =
        genForshowDetailsOfAclPolicyV2();

    private static HttpRequestDef<ShowDetailsOfAclPolicyV2Request, ShowDetailsOfAclPolicyV2Response> genForshowDetailsOfAclPolicyV2() {
        // basic
        HttpRequestDef.Builder<ShowDetailsOfAclPolicyV2Request, ShowDetailsOfAclPolicyV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowDetailsOfAclPolicyV2Request.class, ShowDetailsOfAclPolicyV2Response.class)
                .withName("ShowDetailsOfAclPolicyV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/acls/{acl_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailsOfAclPolicyV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("acl_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailsOfAclPolicyV2Request::getAclId, (req, v) -> {
                req.setAclId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAclStrategyV2Request, UpdateAclStrategyV2Response> updateAclStrategyV2 =
        genForupdateAclStrategyV2();

    private static HttpRequestDef<UpdateAclStrategyV2Request, UpdateAclStrategyV2Response> genForupdateAclStrategyV2() {
        // basic
        HttpRequestDef.Builder<UpdateAclStrategyV2Request, UpdateAclStrategyV2Response> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAclStrategyV2Request.class, UpdateAclStrategyV2Response.class)
                .withName("UpdateAclStrategyV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/acls/{acl_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAclStrategyV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("acl_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAclStrategyV2Request::getAclId, (req, v) -> {
                req.setAclId(v);
            }));
        builder.<ApiAclCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApiAclCreate.class),
            f -> f.withMarshaller(UpdateAclStrategyV2Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AssociateRequestThrottlingPolicyV2Request, AssociateRequestThrottlingPolicyV2Response> associateRequestThrottlingPolicyV2 =
        genForassociateRequestThrottlingPolicyV2();

    private static HttpRequestDef<AssociateRequestThrottlingPolicyV2Request, AssociateRequestThrottlingPolicyV2Response> genForassociateRequestThrottlingPolicyV2() {
        // basic
        HttpRequestDef.Builder<AssociateRequestThrottlingPolicyV2Request, AssociateRequestThrottlingPolicyV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    AssociateRequestThrottlingPolicyV2Request.class,
                    AssociateRequestThrottlingPolicyV2Response.class)
                .withName("AssociateRequestThrottlingPolicyV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/throttle-bindings")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AssociateRequestThrottlingPolicyV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<ThrottleApiBindingCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ThrottleApiBindingCreate.class),
            f -> f.withMarshaller(AssociateRequestThrottlingPolicyV2Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDisassociateThrottlingPolicyV2Request, BatchDisassociateThrottlingPolicyV2Response> batchDisassociateThrottlingPolicyV2 =
        genForbatchDisassociateThrottlingPolicyV2();

    private static HttpRequestDef<BatchDisassociateThrottlingPolicyV2Request, BatchDisassociateThrottlingPolicyV2Response> genForbatchDisassociateThrottlingPolicyV2() {
        // basic
        HttpRequestDef.Builder<BatchDisassociateThrottlingPolicyV2Request, BatchDisassociateThrottlingPolicyV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    BatchDisassociateThrottlingPolicyV2Request.class,
                    BatchDisassociateThrottlingPolicyV2Response.class)
                .withName("BatchDisassociateThrottlingPolicyV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/throttle-bindings")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDisassociateThrottlingPolicyV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("action",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDisassociateThrottlingPolicyV2Request::getAction, (req, v) -> {
                req.setAction(v);
            }));
        builder.<ThrottleBindingBatchDelete>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ThrottleBindingBatchDelete.class),
            f -> f.withMarshaller(BatchDisassociateThrottlingPolicyV2Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchPublishOrOfflineApiV2Request, BatchPublishOrOfflineApiV2Response> batchPublishOrOfflineApiV2 =
        genForbatchPublishOrOfflineApiV2();

    private static HttpRequestDef<BatchPublishOrOfflineApiV2Request, BatchPublishOrOfflineApiV2Response> genForbatchPublishOrOfflineApiV2() {
        // basic
        HttpRequestDef.Builder<BatchPublishOrOfflineApiV2Request, BatchPublishOrOfflineApiV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchPublishOrOfflineApiV2Request.class,
                    BatchPublishOrOfflineApiV2Response.class)
                .withName("BatchPublishOrOfflineApiV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/apis/publish")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchPublishOrOfflineApiV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("action",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchPublishOrOfflineApiV2Request::getAction, (req, v) -> {
                req.setAction(v);
            }));
        builder.<ApiBatchPublish>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApiBatchPublish.class),
            f -> f.withMarshaller(BatchPublishOrOfflineApiV2Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeApiVersionV2Request, ChangeApiVersionV2Response> changeApiVersionV2 =
        genForchangeApiVersionV2();

    private static HttpRequestDef<ChangeApiVersionV2Request, ChangeApiVersionV2Response> genForchangeApiVersionV2() {
        // basic
        HttpRequestDef.Builder<ChangeApiVersionV2Request, ChangeApiVersionV2Response> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ChangeApiVersionV2Request.class, ChangeApiVersionV2Response.class)
                .withName("ChangeApiVersionV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/apis/publish/{api_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeApiVersionV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("api_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeApiVersionV2Request::getApiId, (req, v) -> {
                req.setApiId(v);
            }));
        builder.<ApiVersion>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApiVersion.class),
            f -> f.withMarshaller(ChangeApiVersionV2Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateApiGroupV2Request, CreateApiGroupV2Response> createApiGroupV2 =
        genForcreateApiGroupV2();

    private static HttpRequestDef<CreateApiGroupV2Request, CreateApiGroupV2Response> genForcreateApiGroupV2() {
        // basic
        HttpRequestDef.Builder<CreateApiGroupV2Request, CreateApiGroupV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateApiGroupV2Request.class, CreateApiGroupV2Response.class)
                .withName("CreateApiGroupV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/api-groups")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateApiGroupV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<ApiGroupCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApiGroupCreate.class),
            f -> f.withMarshaller(CreateApiGroupV2Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateApiV2Request, CreateApiV2Response> createApiV2 = genForcreateApiV2();

    private static HttpRequestDef<CreateApiV2Request, CreateApiV2Response> genForcreateApiV2() {
        // basic
        HttpRequestDef.Builder<CreateApiV2Request, CreateApiV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateApiV2Request.class, CreateApiV2Response.class)
                .withName("CreateApiV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/apis")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateApiV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<ApiCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApiCreate.class),
            f -> f.withMarshaller(CreateApiV2Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateOrDeletePublishRecordForApiV2Request, CreateOrDeletePublishRecordForApiV2Response> createOrDeletePublishRecordForApiV2 =
        genForcreateOrDeletePublishRecordForApiV2();

    private static HttpRequestDef<CreateOrDeletePublishRecordForApiV2Request, CreateOrDeletePublishRecordForApiV2Response> genForcreateOrDeletePublishRecordForApiV2() {
        // basic
        HttpRequestDef.Builder<CreateOrDeletePublishRecordForApiV2Request, CreateOrDeletePublishRecordForApiV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateOrDeletePublishRecordForApiV2Request.class,
                    CreateOrDeletePublishRecordForApiV2Response.class)
                .withName("CreateOrDeletePublishRecordForApiV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/apis/action")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateOrDeletePublishRecordForApiV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<ApiActionInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApiActionInfo.class),
            f -> f.withMarshaller(CreateOrDeletePublishRecordForApiV2Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DebugApiV2Request, DebugApiV2Response> debugApiV2 = genFordebugApiV2();

    private static HttpRequestDef<DebugApiV2Request, DebugApiV2Response> genFordebugApiV2() {
        // basic
        HttpRequestDef.Builder<DebugApiV2Request, DebugApiV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, DebugApiV2Request.class, DebugApiV2Response.class)
                .withName("DebugApiV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/apis/debug/{api_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DebugApiV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("api_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DebugApiV2Request::getApiId, (req, v) -> {
                req.setApiId(v);
            }));
        builder.<ApiDebugInfo>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApiDebugInfo.class),
            f -> f.withMarshaller(DebugApiV2Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteApiByVersionIdV2Request, DeleteApiByVersionIdV2Response> deleteApiByVersionIdV2 =
        genFordeleteApiByVersionIdV2();

    private static HttpRequestDef<DeleteApiByVersionIdV2Request, DeleteApiByVersionIdV2Response> genFordeleteApiByVersionIdV2() {
        // basic
        HttpRequestDef.Builder<DeleteApiByVersionIdV2Request, DeleteApiByVersionIdV2Response> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteApiByVersionIdV2Request.class, DeleteApiByVersionIdV2Response.class)
            .withName("DeleteApiByVersionIdV2")
            .withUri("/v2/{project_id}/apigw/instances/{instance_id}/apis/versions/{version_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteApiByVersionIdV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteApiByVersionIdV2Request::getVersionId, (req, v) -> {
                req.setVersionId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteApiGroupV2Request, DeleteApiGroupV2Response> deleteApiGroupV2 =
        genFordeleteApiGroupV2();

    private static HttpRequestDef<DeleteApiGroupV2Request, DeleteApiGroupV2Response> genFordeleteApiGroupV2() {
        // basic
        HttpRequestDef.Builder<DeleteApiGroupV2Request, DeleteApiGroupV2Response> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteApiGroupV2Request.class, DeleteApiGroupV2Response.class)
                .withName("DeleteApiGroupV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/api-groups/{group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteApiGroupV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteApiGroupV2Request::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteApiV2Request, DeleteApiV2Response> deleteApiV2 = genFordeleteApiV2();

    private static HttpRequestDef<DeleteApiV2Request, DeleteApiV2Response> genFordeleteApiV2() {
        // basic
        HttpRequestDef.Builder<DeleteApiV2Request, DeleteApiV2Response> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteApiV2Request.class, DeleteApiV2Response.class)
                .withName("DeleteApiV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/apis/{api_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteApiV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("api_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteApiV2Request::getApiId, (req, v) -> {
                req.setApiId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisassociateRequestThrottlingPolicyV2Request, DisassociateRequestThrottlingPolicyV2Response> disassociateRequestThrottlingPolicyV2 =
        genFordisassociateRequestThrottlingPolicyV2();

    private static HttpRequestDef<DisassociateRequestThrottlingPolicyV2Request, DisassociateRequestThrottlingPolicyV2Response> genFordisassociateRequestThrottlingPolicyV2() {
        // basic
        HttpRequestDef.Builder<DisassociateRequestThrottlingPolicyV2Request, DisassociateRequestThrottlingPolicyV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DisassociateRequestThrottlingPolicyV2Request.class,
                    DisassociateRequestThrottlingPolicyV2Response.class)
                .withName("DisassociateRequestThrottlingPolicyV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/throttle-bindings/{throttle_binding_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisassociateRequestThrottlingPolicyV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("throttle_binding_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisassociateRequestThrottlingPolicyV2Request::getThrottleBindingId, (req, v) -> {
                req.setThrottleBindingId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApiGroupsV2Request, ListApiGroupsV2Response> listApiGroupsV2 =
        genForlistApiGroupsV2();

    private static HttpRequestDef<ListApiGroupsV2Request, ListApiGroupsV2Response> genForlistApiGroupsV2() {
        // basic
        HttpRequestDef.Builder<ListApiGroupsV2Request, ListApiGroupsV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListApiGroupsV2Request.class, ListApiGroupsV2Response.class)
                .withName("ListApiGroupsV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/api-groups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApiGroupsV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListApiGroupsV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApiGroupsV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApiGroupsV2Request::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApiGroupsV2Request::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("precise_search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApiGroupsV2Request::getPreciseSearch, (req, v) -> {
                req.setPreciseSearch(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApiRuntimeDefinitionV2Request, ListApiRuntimeDefinitionV2Response> listApiRuntimeDefinitionV2 =
        genForlistApiRuntimeDefinitionV2();

    private static HttpRequestDef<ListApiRuntimeDefinitionV2Request, ListApiRuntimeDefinitionV2Response> genForlistApiRuntimeDefinitionV2() {
        // basic
        HttpRequestDef.Builder<ListApiRuntimeDefinitionV2Request, ListApiRuntimeDefinitionV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListApiRuntimeDefinitionV2Request.class,
                    ListApiRuntimeDefinitionV2Response.class)
                .withName("ListApiRuntimeDefinitionV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/apis/runtime/{api_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApiRuntimeDefinitionV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("api_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApiRuntimeDefinitionV2Request::getApiId, (req, v) -> {
                req.setApiId(v);
            }));
        builder.<String>withRequestField("env_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApiRuntimeDefinitionV2Request::getEnvId, (req, v) -> {
                req.setEnvId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApiVersionDetailV2Request, ListApiVersionDetailV2Response> listApiVersionDetailV2 =
        genForlistApiVersionDetailV2();

    private static HttpRequestDef<ListApiVersionDetailV2Request, ListApiVersionDetailV2Response> genForlistApiVersionDetailV2() {
        // basic
        HttpRequestDef.Builder<ListApiVersionDetailV2Request, ListApiVersionDetailV2Response> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListApiVersionDetailV2Request.class, ListApiVersionDetailV2Response.class)
            .withName("ListApiVersionDetailV2")
            .withUri("/v2/{project_id}/apigw/instances/{instance_id}/apis/versions/{version_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApiVersionDetailV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApiVersionDetailV2Request::getVersionId, (req, v) -> {
                req.setVersionId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApiVersionsV2Request, ListApiVersionsV2Response> listApiVersionsV2 =
        genForlistApiVersionsV2();

    private static HttpRequestDef<ListApiVersionsV2Request, ListApiVersionsV2Response> genForlistApiVersionsV2() {
        // basic
        HttpRequestDef.Builder<ListApiVersionsV2Request, ListApiVersionsV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListApiVersionsV2Request.class, ListApiVersionsV2Response.class)
                .withName("ListApiVersionsV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/apis/publish/{api_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApiVersionsV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("api_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApiVersionsV2Request::getApiId, (req, v) -> {
                req.setApiId(v);
            }));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListApiVersionsV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApiVersionsV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("env_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApiVersionsV2Request::getEnvId, (req, v) -> {
                req.setEnvId(v);
            }));
        builder.<String>withRequestField("env_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApiVersionsV2Request::getEnvName, (req, v) -> {
                req.setEnvName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApisBindedToRequestThrottlingPolicyV2Request, ListApisBindedToRequestThrottlingPolicyV2Response> listApisBindedToRequestThrottlingPolicyV2 =
        genForlistApisBindedToRequestThrottlingPolicyV2();

    private static HttpRequestDef<ListApisBindedToRequestThrottlingPolicyV2Request, ListApisBindedToRequestThrottlingPolicyV2Response> genForlistApisBindedToRequestThrottlingPolicyV2() {
        // basic
        HttpRequestDef.Builder<ListApisBindedToRequestThrottlingPolicyV2Request, ListApisBindedToRequestThrottlingPolicyV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListApisBindedToRequestThrottlingPolicyV2Request.class,
                    ListApisBindedToRequestThrottlingPolicyV2Response.class)
                .withName("ListApisBindedToRequestThrottlingPolicyV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/throttle-bindings/binded-apis")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisBindedToRequestThrottlingPolicyV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListApisBindedToRequestThrottlingPolicyV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApisBindedToRequestThrottlingPolicyV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("throttle_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisBindedToRequestThrottlingPolicyV2Request::getThrottleId, (req, v) -> {
                req.setThrottleId(v);
            }));
        builder.<String>withRequestField("env_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisBindedToRequestThrottlingPolicyV2Request::getEnvId, (req, v) -> {
                req.setEnvId(v);
            }));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisBindedToRequestThrottlingPolicyV2Request::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<String>withRequestField("api_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisBindedToRequestThrottlingPolicyV2Request::getApiId, (req, v) -> {
                req.setApiId(v);
            }));
        builder.<String>withRequestField("api_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisBindedToRequestThrottlingPolicyV2Request::getApiName, (req, v) -> {
                req.setApiName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApisUnbindedToRequestThrottlingPolicyV2Request, ListApisUnbindedToRequestThrottlingPolicyV2Response> listApisUnbindedToRequestThrottlingPolicyV2 =
        genForlistApisUnbindedToRequestThrottlingPolicyV2();

    private static HttpRequestDef<ListApisUnbindedToRequestThrottlingPolicyV2Request, ListApisUnbindedToRequestThrottlingPolicyV2Response> genForlistApisUnbindedToRequestThrottlingPolicyV2() {
        // basic
        HttpRequestDef.Builder<ListApisUnbindedToRequestThrottlingPolicyV2Request, ListApisUnbindedToRequestThrottlingPolicyV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListApisUnbindedToRequestThrottlingPolicyV2Request.class,
                    ListApisUnbindedToRequestThrottlingPolicyV2Response.class)
                .withName("ListApisUnbindedToRequestThrottlingPolicyV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/throttle-bindings/unbinded-apis")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisUnbindedToRequestThrottlingPolicyV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListApisUnbindedToRequestThrottlingPolicyV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApisUnbindedToRequestThrottlingPolicyV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("throttle_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisUnbindedToRequestThrottlingPolicyV2Request::getThrottleId, (req, v) -> {
                req.setThrottleId(v);
            }));
        builder.<String>withRequestField("env_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisUnbindedToRequestThrottlingPolicyV2Request::getEnvId, (req, v) -> {
                req.setEnvId(v);
            }));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisUnbindedToRequestThrottlingPolicyV2Request::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<String>withRequestField("api_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisUnbindedToRequestThrottlingPolicyV2Request::getApiId, (req, v) -> {
                req.setApiId(v);
            }));
        builder.<String>withRequestField("api_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisUnbindedToRequestThrottlingPolicyV2Request::getApiName, (req, v) -> {
                req.setApiName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApisV2Request, ListApisV2Response> listApisV2 = genForlistApisV2();

    private static HttpRequestDef<ListApisV2Request, ListApisV2Response> genForlistApisV2() {
        // basic
        HttpRequestDef.Builder<ListApisV2Request, ListApisV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListApisV2Request.class, ListApisV2Response.class)
                .withName("ListApisV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/apis")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListApisV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApisV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisV2Request::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisV2Request::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisV2Request::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<String>withRequestField("req_protocol",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisV2Request::getReqProtocol, (req, v) -> {
                req.setReqProtocol(v);
            }));
        builder.<String>withRequestField("req_method",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisV2Request::getReqMethod, (req, v) -> {
                req.setReqMethod(v);
            }));
        builder.<String>withRequestField("req_uri",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisV2Request::getReqUri, (req, v) -> {
                req.setReqUri(v);
            }));
        builder.<String>withRequestField("auth_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisV2Request::getAuthType, (req, v) -> {
                req.setAuthType(v);
            }));
        builder.<String>withRequestField("env_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisV2Request::getEnvId, (req, v) -> {
                req.setEnvId(v);
            }));
        builder.<Integer>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApisV2Request::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<String>withRequestField("precise_search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisV2Request::getPreciseSearch, (req, v) -> {
                req.setPreciseSearch(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRequestThrottlingPoliciesBindedToApiV2Request, ListRequestThrottlingPoliciesBindedToApiV2Response> listRequestThrottlingPoliciesBindedToApiV2 =
        genForlistRequestThrottlingPoliciesBindedToApiV2();

    private static HttpRequestDef<ListRequestThrottlingPoliciesBindedToApiV2Request, ListRequestThrottlingPoliciesBindedToApiV2Response> genForlistRequestThrottlingPoliciesBindedToApiV2() {
        // basic
        HttpRequestDef.Builder<ListRequestThrottlingPoliciesBindedToApiV2Request, ListRequestThrottlingPoliciesBindedToApiV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListRequestThrottlingPoliciesBindedToApiV2Request.class,
                    ListRequestThrottlingPoliciesBindedToApiV2Response.class)
                .withName("ListRequestThrottlingPoliciesBindedToApiV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/throttle-bindings/binded-throttles")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRequestThrottlingPoliciesBindedToApiV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListRequestThrottlingPoliciesBindedToApiV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRequestThrottlingPoliciesBindedToApiV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("api_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRequestThrottlingPoliciesBindedToApiV2Request::getApiId, (req, v) -> {
                req.setApiId(v);
            }));
        builder.<String>withRequestField("throttle_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRequestThrottlingPoliciesBindedToApiV2Request::getThrottleId, (req, v) -> {
                req.setThrottleId(v);
            }));
        builder.<String>withRequestField("throttle_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRequestThrottlingPoliciesBindedToApiV2Request::getThrottleName, (req, v) -> {
                req.setThrottleName(v);
            }));
        builder.<String>withRequestField("env_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRequestThrottlingPoliciesBindedToApiV2Request::getEnvId, (req, v) -> {
                req.setEnvId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDetailsOfApiGroupV2Request, ShowDetailsOfApiGroupV2Response> showDetailsOfApiGroupV2 =
        genForshowDetailsOfApiGroupV2();

    private static HttpRequestDef<ShowDetailsOfApiGroupV2Request, ShowDetailsOfApiGroupV2Response> genForshowDetailsOfApiGroupV2() {
        // basic
        HttpRequestDef.Builder<ShowDetailsOfApiGroupV2Request, ShowDetailsOfApiGroupV2Response> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowDetailsOfApiGroupV2Request.class, ShowDetailsOfApiGroupV2Response.class)
            .withName("ShowDetailsOfApiGroupV2")
            .withUri("/v2/{project_id}/apigw/instances/{instance_id}/api-groups/{group_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailsOfApiGroupV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailsOfApiGroupV2Request::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDetailsOfApiV2Request, ShowDetailsOfApiV2Response> showDetailsOfApiV2 =
        genForshowDetailsOfApiV2();

    private static HttpRequestDef<ShowDetailsOfApiV2Request, ShowDetailsOfApiV2Response> genForshowDetailsOfApiV2() {
        // basic
        HttpRequestDef.Builder<ShowDetailsOfApiV2Request, ShowDetailsOfApiV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDetailsOfApiV2Request.class, ShowDetailsOfApiV2Response.class)
                .withName("ShowDetailsOfApiV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/apis/{api_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailsOfApiV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("api_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailsOfApiV2Request::getApiId, (req, v) -> {
                req.setApiId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateApiGroupV2Request, UpdateApiGroupV2Response> updateApiGroupV2 =
        genForupdateApiGroupV2();

    private static HttpRequestDef<UpdateApiGroupV2Request, UpdateApiGroupV2Response> genForupdateApiGroupV2() {
        // basic
        HttpRequestDef.Builder<UpdateApiGroupV2Request, UpdateApiGroupV2Response> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateApiGroupV2Request.class, UpdateApiGroupV2Response.class)
                .withName("UpdateApiGroupV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/api-groups/{group_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateApiGroupV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateApiGroupV2Request::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<ApiGroupBase>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApiGroupBase.class),
            f -> f.withMarshaller(UpdateApiGroupV2Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateApiV2Request, UpdateApiV2Response> updateApiV2 = genForupdateApiV2();

    private static HttpRequestDef<UpdateApiV2Request, UpdateApiV2Response> genForupdateApiV2() {
        // basic
        HttpRequestDef.Builder<UpdateApiV2Request, UpdateApiV2Response> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateApiV2Request.class, UpdateApiV2Response.class)
                .withName("UpdateApiV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/apis/{api_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateApiV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("api_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateApiV2Request::getApiId, (req, v) -> {
                req.setApiId(v);
            }));
        builder.<ApiCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApiCreate.class),
            f -> f.withMarshaller(UpdateApiV2Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDeleteApiAclBindingV2Request, BatchDeleteApiAclBindingV2Response> batchDeleteApiAclBindingV2 =
        genForbatchDeleteApiAclBindingV2();

    private static HttpRequestDef<BatchDeleteApiAclBindingV2Request, BatchDeleteApiAclBindingV2Response> genForbatchDeleteApiAclBindingV2() {
        // basic
        HttpRequestDef.Builder<BatchDeleteApiAclBindingV2Request, BatchDeleteApiAclBindingV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    BatchDeleteApiAclBindingV2Request.class,
                    BatchDeleteApiAclBindingV2Response.class)
                .withName("BatchDeleteApiAclBindingV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/acl-bindings")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteApiAclBindingV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("action",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDeleteApiAclBindingV2Request::getAction, (req, v) -> {
                req.setAction(v);
            }));
        builder.<AclBindingBatchDelete>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AclBindingBatchDelete.class),
            f -> f.withMarshaller(BatchDeleteApiAclBindingV2Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateApiAclBindingV2Request, CreateApiAclBindingV2Response> createApiAclBindingV2 =
        genForcreateApiAclBindingV2();

    private static HttpRequestDef<CreateApiAclBindingV2Request, CreateApiAclBindingV2Response> genForcreateApiAclBindingV2() {
        // basic
        HttpRequestDef.Builder<CreateApiAclBindingV2Request, CreateApiAclBindingV2Response> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateApiAclBindingV2Request.class, CreateApiAclBindingV2Response.class)
            .withName("CreateApiAclBindingV2")
            .withUri("/v2/{project_id}/apigw/instances/{instance_id}/acl-bindings")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateApiAclBindingV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<AclApiBindingCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AclApiBindingCreate.class),
            f -> f.withMarshaller(CreateApiAclBindingV2Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteApiAclBindingV2Request, DeleteApiAclBindingV2Response> deleteApiAclBindingV2 =
        genFordeleteApiAclBindingV2();

    private static HttpRequestDef<DeleteApiAclBindingV2Request, DeleteApiAclBindingV2Response> genFordeleteApiAclBindingV2() {
        // basic
        HttpRequestDef.Builder<DeleteApiAclBindingV2Request, DeleteApiAclBindingV2Response> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteApiAclBindingV2Request.class, DeleteApiAclBindingV2Response.class)
            .withName("DeleteApiAclBindingV2")
            .withUri("/v2/{project_id}/apigw/instances/{instance_id}/acl-bindings/{acl_bindings_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteApiAclBindingV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("acl_bindings_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteApiAclBindingV2Request::getAclBindingsId, (req, v) -> {
                req.setAclBindingsId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAclPolicyBindedToApiV2Request, ListAclPolicyBindedToApiV2Response> listAclPolicyBindedToApiV2 =
        genForlistAclPolicyBindedToApiV2();

    private static HttpRequestDef<ListAclPolicyBindedToApiV2Request, ListAclPolicyBindedToApiV2Response> genForlistAclPolicyBindedToApiV2() {
        // basic
        HttpRequestDef.Builder<ListAclPolicyBindedToApiV2Request, ListAclPolicyBindedToApiV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListAclPolicyBindedToApiV2Request.class,
                    ListAclPolicyBindedToApiV2Response.class)
                .withName("ListAclPolicyBindedToApiV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/acl-bindings/binded-acls")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAclPolicyBindedToApiV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAclPolicyBindedToApiV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAclPolicyBindedToApiV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("api_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAclPolicyBindedToApiV2Request::getApiId, (req, v) -> {
                req.setApiId(v);
            }));
        builder.<String>withRequestField("env_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAclPolicyBindedToApiV2Request::getEnvId, (req, v) -> {
                req.setEnvId(v);
            }));
        builder.<String>withRequestField("env_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAclPolicyBindedToApiV2Request::getEnvName, (req, v) -> {
                req.setEnvName(v);
            }));
        builder.<String>withRequestField("acl_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAclPolicyBindedToApiV2Request::getAclId, (req, v) -> {
                req.setAclId(v);
            }));
        builder.<String>withRequestField("acl_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAclPolicyBindedToApiV2Request::getAclName, (req, v) -> {
                req.setAclName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApisBindedToAclPolicyV2Request, ListApisBindedToAclPolicyV2Response> listApisBindedToAclPolicyV2 =
        genForlistApisBindedToAclPolicyV2();

    private static HttpRequestDef<ListApisBindedToAclPolicyV2Request, ListApisBindedToAclPolicyV2Response> genForlistApisBindedToAclPolicyV2() {
        // basic
        HttpRequestDef.Builder<ListApisBindedToAclPolicyV2Request, ListApisBindedToAclPolicyV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListApisBindedToAclPolicyV2Request.class,
                    ListApisBindedToAclPolicyV2Response.class)
                .withName("ListApisBindedToAclPolicyV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/acl-bindings/binded-apis")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisBindedToAclPolicyV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListApisBindedToAclPolicyV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApisBindedToAclPolicyV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("acl_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisBindedToAclPolicyV2Request::getAclId, (req, v) -> {
                req.setAclId(v);
            }));
        builder.<String>withRequestField("api_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisBindedToAclPolicyV2Request::getApiId, (req, v) -> {
                req.setApiId(v);
            }));
        builder.<String>withRequestField("api_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisBindedToAclPolicyV2Request::getApiName, (req, v) -> {
                req.setApiName(v);
            }));
        builder.<String>withRequestField("env_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisBindedToAclPolicyV2Request::getEnvId, (req, v) -> {
                req.setEnvId(v);
            }));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisBindedToAclPolicyV2Request::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApisUnbindedToAclPolicyV2Request, ListApisUnbindedToAclPolicyV2Response> listApisUnbindedToAclPolicyV2 =
        genForlistApisUnbindedToAclPolicyV2();

    private static HttpRequestDef<ListApisUnbindedToAclPolicyV2Request, ListApisUnbindedToAclPolicyV2Response> genForlistApisUnbindedToAclPolicyV2() {
        // basic
        HttpRequestDef.Builder<ListApisUnbindedToAclPolicyV2Request, ListApisUnbindedToAclPolicyV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListApisUnbindedToAclPolicyV2Request.class,
                    ListApisUnbindedToAclPolicyV2Response.class)
                .withName("ListApisUnbindedToAclPolicyV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/acl-bindings/unbinded-apis")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisUnbindedToAclPolicyV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListApisUnbindedToAclPolicyV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApisUnbindedToAclPolicyV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("acl_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisUnbindedToAclPolicyV2Request::getAclId, (req, v) -> {
                req.setAclId(v);
            }));
        builder.<String>withRequestField("api_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisUnbindedToAclPolicyV2Request::getApiId, (req, v) -> {
                req.setApiId(v);
            }));
        builder.<String>withRequestField("api_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisUnbindedToAclPolicyV2Request::getApiName, (req, v) -> {
                req.setApiName(v);
            }));
        builder.<String>withRequestField("env_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisUnbindedToAclPolicyV2Request::getEnvId, (req, v) -> {
                req.setEnvId(v);
            }));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisUnbindedToAclPolicyV2Request::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CancelingAuthorizationV2Request, CancelingAuthorizationV2Response> cancelingAuthorizationV2 =
        genForcancelingAuthorizationV2();

    private static HttpRequestDef<CancelingAuthorizationV2Request, CancelingAuthorizationV2Response> genForcancelingAuthorizationV2() {
        // basic
        HttpRequestDef.Builder<CancelingAuthorizationV2Request, CancelingAuthorizationV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    CancelingAuthorizationV2Request.class,
                    CancelingAuthorizationV2Response.class)
                .withName("CancelingAuthorizationV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/app-auths/{app_auth_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelingAuthorizationV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("app_auth_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CancelingAuthorizationV2Request::getAppAuthId, (req, v) -> {
                req.setAppAuthId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckAppV2Request, CheckAppV2Response> checkAppV2 = genForcheckAppV2();

    private static HttpRequestDef<CheckAppV2Request, CheckAppV2Response> genForcheckAppV2() {
        // basic
        HttpRequestDef.Builder<CheckAppV2Request, CheckAppV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, CheckAppV2Request.class, CheckAppV2Response.class)
                .withName("CheckAppV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/apps/validation/{app_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckAppV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckAppV2Request::getAppId, (req, v) -> {
                req.setAppId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAnAppV2Request, CreateAnAppV2Response> createAnAppV2 =
        genForcreateAnAppV2();

    private static HttpRequestDef<CreateAnAppV2Request, CreateAnAppV2Response> genForcreateAnAppV2() {
        // basic
        HttpRequestDef.Builder<CreateAnAppV2Request, CreateAnAppV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAnAppV2Request.class, CreateAnAppV2Response.class)
                .withName("CreateAnAppV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/apps")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAnAppV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<AppCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AppCreate.class),
            f -> f.withMarshaller(CreateAnAppV2Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAppCodeAutoV2Request, CreateAppCodeAutoV2Response> createAppCodeAutoV2 =
        genForcreateAppCodeAutoV2();

    private static HttpRequestDef<CreateAppCodeAutoV2Request, CreateAppCodeAutoV2Response> genForcreateAppCodeAutoV2() {
        // basic
        HttpRequestDef.Builder<CreateAppCodeAutoV2Request, CreateAppCodeAutoV2Response> builder =
            HttpRequestDef.builder(HttpMethod.PUT, CreateAppCodeAutoV2Request.class, CreateAppCodeAutoV2Response.class)
                .withName("CreateAppCodeAutoV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/apps/{app_id}/app-codes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAppCodeAutoV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAppCodeAutoV2Request::getAppId, (req, v) -> {
                req.setAppId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAppCodeV2Request, CreateAppCodeV2Response> createAppCodeV2 =
        genForcreateAppCodeV2();

    private static HttpRequestDef<CreateAppCodeV2Request, CreateAppCodeV2Response> genForcreateAppCodeV2() {
        // basic
        HttpRequestDef.Builder<CreateAppCodeV2Request, CreateAppCodeV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAppCodeV2Request.class, CreateAppCodeV2Response.class)
                .withName("CreateAppCodeV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/apps/{app_id}/app-codes")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAppCodeV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAppCodeV2Request::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<AppCodeCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AppCodeCreate.class),
            f -> f.withMarshaller(CreateAppCodeV2Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAuthorizingAppsV2Request, CreateAuthorizingAppsV2Response> createAuthorizingAppsV2 =
        genForcreateAuthorizingAppsV2();

    private static HttpRequestDef<CreateAuthorizingAppsV2Request, CreateAuthorizingAppsV2Response> genForcreateAuthorizingAppsV2() {
        // basic
        HttpRequestDef.Builder<CreateAuthorizingAppsV2Request, CreateAuthorizingAppsV2Response> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateAuthorizingAppsV2Request.class, CreateAuthorizingAppsV2Response.class)
            .withName("CreateAuthorizingAppsV2")
            .withUri("/v2/{project_id}/apigw/instances/{instance_id}/app-auths")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAuthorizingAppsV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<ApiAuthCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ApiAuthCreate.class),
            f -> f.withMarshaller(CreateAuthorizingAppsV2Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAppCodeV2Request, DeleteAppCodeV2Response> deleteAppCodeV2 =
        genFordeleteAppCodeV2();

    private static HttpRequestDef<DeleteAppCodeV2Request, DeleteAppCodeV2Response> genFordeleteAppCodeV2() {
        // basic
        HttpRequestDef.Builder<DeleteAppCodeV2Request, DeleteAppCodeV2Response> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAppCodeV2Request.class, DeleteAppCodeV2Response.class)
                .withName("DeleteAppCodeV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/apps/{app_id}/app-codes/{app_code_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAppCodeV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAppCodeV2Request::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<String>withRequestField("app_code_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAppCodeV2Request::getAppCodeId, (req, v) -> {
                req.setAppCodeId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAppV2Request, DeleteAppV2Response> deleteAppV2 = genFordeleteAppV2();

    private static HttpRequestDef<DeleteAppV2Request, DeleteAppV2Response> genFordeleteAppV2() {
        // basic
        HttpRequestDef.Builder<DeleteAppV2Request, DeleteAppV2Response> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAppV2Request.class, DeleteAppV2Response.class)
                .withName("DeleteAppV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/apps/{app_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAppV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAppV2Request::getAppId, (req, v) -> {
                req.setAppId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApisBindedToAppV2Request, ListApisBindedToAppV2Response> listApisBindedToAppV2 =
        genForlistApisBindedToAppV2();

    private static HttpRequestDef<ListApisBindedToAppV2Request, ListApisBindedToAppV2Response> genForlistApisBindedToAppV2() {
        // basic
        HttpRequestDef.Builder<ListApisBindedToAppV2Request, ListApisBindedToAppV2Response> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListApisBindedToAppV2Request.class, ListApisBindedToAppV2Response.class)
            .withName("ListApisBindedToAppV2")
            .withUri("/v2/{project_id}/apigw/instances/{instance_id}/app-auths/binded-apis")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisBindedToAppV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListApisBindedToAppV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApisBindedToAppV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisBindedToAppV2Request::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<String>withRequestField("api_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisBindedToAppV2Request::getApiId, (req, v) -> {
                req.setApiId(v);
            }));
        builder.<String>withRequestField("api_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisBindedToAppV2Request::getApiName, (req, v) -> {
                req.setApiName(v);
            }));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisBindedToAppV2Request::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<String>withRequestField("group_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisBindedToAppV2Request::getGroupName, (req, v) -> {
                req.setGroupName(v);
            }));
        builder.<String>withRequestField("env_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisBindedToAppV2Request::getEnvId, (req, v) -> {
                req.setEnvId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApisUnbindedToAppV2Request, ListApisUnbindedToAppV2Response> listApisUnbindedToAppV2 =
        genForlistApisUnbindedToAppV2();

    private static HttpRequestDef<ListApisUnbindedToAppV2Request, ListApisUnbindedToAppV2Response> genForlistApisUnbindedToAppV2() {
        // basic
        HttpRequestDef.Builder<ListApisUnbindedToAppV2Request, ListApisUnbindedToAppV2Response> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListApisUnbindedToAppV2Request.class, ListApisUnbindedToAppV2Response.class)
            .withName("ListApisUnbindedToAppV2")
            .withUri("/v2/{project_id}/apigw/instances/{instance_id}/app-auths/unbinded-apis")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisUnbindedToAppV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListApisUnbindedToAppV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApisUnbindedToAppV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisUnbindedToAppV2Request::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<String>withRequestField("env_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisUnbindedToAppV2Request::getEnvId, (req, v) -> {
                req.setEnvId(v);
            }));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisUnbindedToAppV2Request::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<String>withRequestField("api_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisUnbindedToAppV2Request::getApiId, (req, v) -> {
                req.setApiId(v);
            }));
        builder.<String>withRequestField("api_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApisUnbindedToAppV2Request::getApiName, (req, v) -> {
                req.setApiName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAppCodesV2Request, ListAppCodesV2Response> listAppCodesV2 =
        genForlistAppCodesV2();

    private static HttpRequestDef<ListAppCodesV2Request, ListAppCodesV2Response> genForlistAppCodesV2() {
        // basic
        HttpRequestDef.Builder<ListAppCodesV2Request, ListAppCodesV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAppCodesV2Request.class, ListAppCodesV2Response.class)
                .withName("ListAppCodesV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/apps/{app_id}/app-codes")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppCodesV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppCodesV2Request::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAppCodesV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppCodesV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAppsBindedToApiV2Request, ListAppsBindedToApiV2Response> listAppsBindedToApiV2 =
        genForlistAppsBindedToApiV2();

    private static HttpRequestDef<ListAppsBindedToApiV2Request, ListAppsBindedToApiV2Response> genForlistAppsBindedToApiV2() {
        // basic
        HttpRequestDef.Builder<ListAppsBindedToApiV2Request, ListAppsBindedToApiV2Response> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAppsBindedToApiV2Request.class, ListAppsBindedToApiV2Response.class)
            .withName("ListAppsBindedToApiV2")
            .withUri("/v2/{project_id}/apigw/instances/{instance_id}/app-auths/binded-apps")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppsBindedToApiV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAppsBindedToApiV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppsBindedToApiV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("api_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppsBindedToApiV2Request::getApiId, (req, v) -> {
                req.setApiId(v);
            }));
        builder.<String>withRequestField("app_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppsBindedToApiV2Request::getAppName, (req, v) -> {
                req.setAppName(v);
            }));
        builder.<String>withRequestField("app_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppsBindedToApiV2Request::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<String>withRequestField("env_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppsBindedToApiV2Request::getEnvId, (req, v) -> {
                req.setEnvId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAppsV2Request, ListAppsV2Response> listAppsV2 = genForlistAppsV2();

    private static HttpRequestDef<ListAppsV2Request, ListAppsV2Response> genForlistAppsV2() {
        // basic
        HttpRequestDef.Builder<ListAppsV2Request, ListAppsV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAppsV2Request.class, ListAppsV2Response.class)
                .withName("ListAppsV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/apps")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppsV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAppsV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppsV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppsV2Request::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppsV2Request::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<Integer>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAppsV2Request::getStatus, (req, v) -> {
                req.setStatus(v);
            }));
        builder.<String>withRequestField("app_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppsV2Request::getAppKey, (req, v) -> {
                req.setAppKey(v);
            }));
        builder.<String>withRequestField("creator",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppsV2Request::getCreator, (req, v) -> {
                req.setCreator(v);
            }));
        builder.<String>withRequestField("precise_search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAppsV2Request::getPreciseSearch, (req, v) -> {
                req.setPreciseSearch(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ResettingAppSecretV2Request, ResettingAppSecretV2Response> resettingAppSecretV2 =
        genForresettingAppSecretV2();

    private static HttpRequestDef<ResettingAppSecretV2Request, ResettingAppSecretV2Response> genForresettingAppSecretV2() {
        // basic
        HttpRequestDef.Builder<ResettingAppSecretV2Request, ResettingAppSecretV2Response> builder = HttpRequestDef
            .builder(HttpMethod.PUT, ResettingAppSecretV2Request.class, ResettingAppSecretV2Response.class)
            .withName("ResettingAppSecretV2")
            .withUri("/v2/{project_id}/apigw/instances/{instance_id}/apps/secret/{app_id}")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResettingAppSecretV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ResettingAppSecretV2Request::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<AppResetCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AppResetCreate.class),
            f -> f.withMarshaller(ResettingAppSecretV2Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDetailsOfAppCodeV2Request, ShowDetailsOfAppCodeV2Response> showDetailsOfAppCodeV2 =
        genForshowDetailsOfAppCodeV2();

    private static HttpRequestDef<ShowDetailsOfAppCodeV2Request, ShowDetailsOfAppCodeV2Response> genForshowDetailsOfAppCodeV2() {
        // basic
        HttpRequestDef.Builder<ShowDetailsOfAppCodeV2Request, ShowDetailsOfAppCodeV2Response> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowDetailsOfAppCodeV2Request.class, ShowDetailsOfAppCodeV2Response.class)
            .withName("ShowDetailsOfAppCodeV2")
            .withUri("/v2/{project_id}/apigw/instances/{instance_id}/apps/{app_id}/app-codes/{app_code_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailsOfAppCodeV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailsOfAppCodeV2Request::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<String>withRequestField("app_code_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailsOfAppCodeV2Request::getAppCodeId, (req, v) -> {
                req.setAppCodeId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDetailsOfAppV2Request, ShowDetailsOfAppV2Response> showDetailsOfAppV2 =
        genForshowDetailsOfAppV2();

    private static HttpRequestDef<ShowDetailsOfAppV2Request, ShowDetailsOfAppV2Response> genForshowDetailsOfAppV2() {
        // basic
        HttpRequestDef.Builder<ShowDetailsOfAppV2Request, ShowDetailsOfAppV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowDetailsOfAppV2Request.class, ShowDetailsOfAppV2Response.class)
                .withName("ShowDetailsOfAppV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/apps/{app_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailsOfAppV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailsOfAppV2Request::getAppId, (req, v) -> {
                req.setAppId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAppV2Request, UpdateAppV2Response> updateAppV2 = genForupdateAppV2();

    private static HttpRequestDef<UpdateAppV2Request, UpdateAppV2Response> genForupdateAppV2() {
        // basic
        HttpRequestDef.Builder<UpdateAppV2Request, UpdateAppV2Response> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAppV2Request.class, UpdateAppV2Response.class)
                .withName("UpdateAppV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/apps/{app_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAppV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAppV2Request::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<AppCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AppCreate.class),
            f -> f.withMarshaller(UpdateAppV2Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ExportApiDefinitionsV2Request, ExportApiDefinitionsV2Response> exportApiDefinitionsV2 =
        genForexportApiDefinitionsV2();

    private static HttpRequestDef<ExportApiDefinitionsV2Request, ExportApiDefinitionsV2Response> genForexportApiDefinitionsV2() {
        // basic
        HttpRequestDef.Builder<ExportApiDefinitionsV2Request, ExportApiDefinitionsV2Response> builder = HttpRequestDef
            .builder(HttpMethod.POST, ExportApiDefinitionsV2Request.class, ExportApiDefinitionsV2Response.class)
            .withName("ExportApiDefinitionsV2")
            .withUri("/v2/{project_id}/apigw/instances/{instance_id}/openapi/export")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ExportApiDefinitionsV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<ExportOpenApiReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExportOpenApiReq.class),
            f -> f.withMarshaller(ExportApiDefinitionsV2Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportApiDefinitionsV2Request, ImportApiDefinitionsV2Response> importApiDefinitionsV2 =
        genForimportApiDefinitionsV2();

    private static HttpRequestDef<ImportApiDefinitionsV2Request, ImportApiDefinitionsV2Response> genForimportApiDefinitionsV2() {
        // basic
        HttpRequestDef.Builder<ImportApiDefinitionsV2Request, ImportApiDefinitionsV2Response> builder = HttpRequestDef
            .builder(HttpMethod.POST, ImportApiDefinitionsV2Request.class, ImportApiDefinitionsV2Response.class)
            .withName("ImportApiDefinitionsV2")
            .withUri("/v2/{project_id}/apigw/instances/{instance_id}/openapi/import")
            .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportApiDefinitionsV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<ImportApiDefinitionsV2RequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImportApiDefinitionsV2RequestBody.class),
            f -> f.withMarshaller(ImportApiDefinitionsV2Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchAssociateCertsV2Request, BatchAssociateCertsV2Response> batchAssociateCertsV2 =
        genForbatchAssociateCertsV2();

    private static HttpRequestDef<BatchAssociateCertsV2Request, BatchAssociateCertsV2Response> genForbatchAssociateCertsV2() {
        // basic
        HttpRequestDef.Builder<BatchAssociateCertsV2Request, BatchAssociateCertsV2Response> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchAssociateCertsV2Request.class, BatchAssociateCertsV2Response.class)
            .withName("BatchAssociateCertsV2")
            .withUri(
                "/v2/{project_id}/apigw/instances/{instance_id}/api-groups/{group_id}/domains/{domain_id}/certificates/attach")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchAssociateCertsV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchAssociateCertsV2Request::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchAssociateCertsV2Request::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<AttachOrDetachCertsReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AttachOrDetachCertsReqBody.class),
            f -> f.withMarshaller(BatchAssociateCertsV2Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchAssociateDomainsV2Request, BatchAssociateDomainsV2Response> batchAssociateDomainsV2 =
        genForbatchAssociateDomainsV2();

    private static HttpRequestDef<BatchAssociateDomainsV2Request, BatchAssociateDomainsV2Response> genForbatchAssociateDomainsV2() {
        // basic
        HttpRequestDef.Builder<BatchAssociateDomainsV2Request, BatchAssociateDomainsV2Response> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchAssociateDomainsV2Request.class, BatchAssociateDomainsV2Response.class)
            .withName("BatchAssociateDomainsV2")
            .withUri("/v2/{project_id}/apigw/certificates/{certificate_id}/domains/attach")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchAssociateDomainsV2Request::getCertificateId, (req, v) -> {
                req.setCertificateId(v);
            }));
        builder.<AttachOrDetachDomainsReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AttachOrDetachDomainsReqBody.class),
            f -> f.withMarshaller(BatchAssociateDomainsV2Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDisassociateCertsV2Request, BatchDisassociateCertsV2Response> batchDisassociateCertsV2 =
        genForbatchDisassociateCertsV2();

    private static HttpRequestDef<BatchDisassociateCertsV2Request, BatchDisassociateCertsV2Response> genForbatchDisassociateCertsV2() {
        // basic
        HttpRequestDef.Builder<BatchDisassociateCertsV2Request, BatchDisassociateCertsV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, BatchDisassociateCertsV2Request.class, BatchDisassociateCertsV2Response.class)
                .withName("BatchDisassociateCertsV2")
                .withUri(
                    "/v2/{project_id}/apigw/instances/{instance_id}/api-groups/{group_id}/domains/{domain_id}/certificates/detach")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDisassociateCertsV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDisassociateCertsV2Request::getGroupId, (req, v) -> {
                req.setGroupId(v);
            }));
        builder.<String>withRequestField("domain_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDisassociateCertsV2Request::getDomainId, (req, v) -> {
                req.setDomainId(v);
            }));
        builder.<AttachOrDetachCertsReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AttachOrDetachCertsReqBody.class),
            f -> f.withMarshaller(BatchDisassociateCertsV2Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDisassociateDomainsV2Request, BatchDisassociateDomainsV2Response> batchDisassociateDomainsV2 =
        genForbatchDisassociateDomainsV2();

    private static HttpRequestDef<BatchDisassociateDomainsV2Request, BatchDisassociateDomainsV2Response> genForbatchDisassociateDomainsV2() {
        // basic
        HttpRequestDef.Builder<BatchDisassociateDomainsV2Request, BatchDisassociateDomainsV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    BatchDisassociateDomainsV2Request.class,
                    BatchDisassociateDomainsV2Response.class)
                .withName("BatchDisassociateDomainsV2")
                .withUri("/v2/{project_id}/apigw/certificates/{certificate_id}/domains/detach")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDisassociateDomainsV2Request::getCertificateId, (req, v) -> {
                req.setCertificateId(v);
            }));
        builder.<AttachOrDetachDomainsReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AttachOrDetachDomainsReqBody.class),
            f -> f.withMarshaller(BatchDisassociateDomainsV2Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCertificateV2Request, CreateCertificateV2Response> createCertificateV2 =
        genForcreateCertificateV2();

    private static HttpRequestDef<CreateCertificateV2Request, CreateCertificateV2Response> genForcreateCertificateV2() {
        // basic
        HttpRequestDef.Builder<CreateCertificateV2Request, CreateCertificateV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCertificateV2Request.class, CreateCertificateV2Response.class)
                .withName("CreateCertificateV2")
                .withUri("/v2/{project_id}/apigw/certificates")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<CertificateForm>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CertificateForm.class),
            f -> f.withMarshaller(CreateCertificateV2Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCertificateV2Request, DeleteCertificateV2Response> deleteCertificateV2 =
        genFordeleteCertificateV2();

    private static HttpRequestDef<DeleteCertificateV2Request, DeleteCertificateV2Response> genFordeleteCertificateV2() {
        // basic
        HttpRequestDef.Builder<DeleteCertificateV2Request, DeleteCertificateV2Response> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteCertificateV2Request.class, DeleteCertificateV2Response.class)
            .withName("DeleteCertificateV2")
            .withUri("/v2/{project_id}/apigw/certificates/{certificate_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCertificateV2Request::getCertificateId, (req, v) -> {
                req.setCertificateId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAttachedDomainsV2Request, ListAttachedDomainsV2Response> listAttachedDomainsV2 =
        genForlistAttachedDomainsV2();

    private static HttpRequestDef<ListAttachedDomainsV2Request, ListAttachedDomainsV2Response> genForlistAttachedDomainsV2() {
        // basic
        HttpRequestDef.Builder<ListAttachedDomainsV2Request, ListAttachedDomainsV2Response> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAttachedDomainsV2Request.class, ListAttachedDomainsV2Response.class)
            .withName("ListAttachedDomainsV2")
            .withUri("/v2/{project_id}/apigw/certificates/{certificate_id}/attached-domains")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAttachedDomainsV2Request::getCertificateId, (req, v) -> {
                req.setCertificateId(v);
            }));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAttachedDomainsV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAttachedDomainsV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("url_domain",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAttachedDomainsV2Request::getUrlDomain, (req, v) -> {
                req.setUrlDomain(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCertificatesV2Request, ListCertificatesV2Response> listCertificatesV2 =
        genForlistCertificatesV2();

    private static HttpRequestDef<ListCertificatesV2Request, ListCertificatesV2Response> genForlistCertificatesV2() {
        // basic
        HttpRequestDef.Builder<ListCertificatesV2Request, ListCertificatesV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCertificatesV2Request.class, ListCertificatesV2Response.class)
                .withName("ListCertificatesV2")
                .withUri("/v2/{project_id}/apigw/certificates")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListCertificatesV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCertificatesV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertificatesV2Request::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("common_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertificatesV2Request::getCommonName, (req, v) -> {
                req.setCommonName(v);
            }));
        builder.<String>withRequestField("signature_algorithm",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertificatesV2Request::getSignatureAlgorithm, (req, v) -> {
                req.setSignatureAlgorithm(v);
            }));
        builder.<ListCertificatesV2Request.TypeEnum>withRequestField("type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListCertificatesV2Request.TypeEnum.class),
            f -> f.withMarshaller(ListCertificatesV2Request::getType, (req, v) -> {
                req.setType(v);
            }));
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCertificatesV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDetailsOfCertificateV2Request, ShowDetailsOfCertificateV2Response> showDetailsOfCertificateV2 =
        genForshowDetailsOfCertificateV2();

    private static HttpRequestDef<ShowDetailsOfCertificateV2Request, ShowDetailsOfCertificateV2Response> genForshowDetailsOfCertificateV2() {
        // basic
        HttpRequestDef.Builder<ShowDetailsOfCertificateV2Request, ShowDetailsOfCertificateV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowDetailsOfCertificateV2Request.class,
                    ShowDetailsOfCertificateV2Response.class)
                .withName("ShowDetailsOfCertificateV2")
                .withUri("/v2/{project_id}/apigw/certificates/{certificate_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailsOfCertificateV2Request::getCertificateId, (req, v) -> {
                req.setCertificateId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateCertificateV2Request, UpdateCertificateV2Response> updateCertificateV2 =
        genForupdateCertificateV2();

    private static HttpRequestDef<UpdateCertificateV2Request, UpdateCertificateV2Response> genForupdateCertificateV2() {
        // basic
        HttpRequestDef.Builder<UpdateCertificateV2Request, UpdateCertificateV2Response> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateCertificateV2Request.class, UpdateCertificateV2Response.class)
                .withName("UpdateCertificateV2")
                .withUri("/v2/{project_id}/apigw/certificates/{certificate_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateCertificateV2Request::getCertificateId, (req, v) -> {
                req.setCertificateId(v);
            }));
        builder.<CertificateForm>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CertificateForm.class),
            f -> f.withMarshaller(UpdateCertificateV2Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddingBackendInstancesV2Request, AddingBackendInstancesV2Response> addingBackendInstancesV2 =
        genForaddingBackendInstancesV2();

    private static HttpRequestDef<AddingBackendInstancesV2Request, AddingBackendInstancesV2Response> genForaddingBackendInstancesV2() {
        // basic
        HttpRequestDef.Builder<AddingBackendInstancesV2Request, AddingBackendInstancesV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, AddingBackendInstancesV2Request.class, AddingBackendInstancesV2Response.class)
                .withName("AddingBackendInstancesV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/vpc-channels/{vpc_channel_id}/members")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddingBackendInstancesV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("vpc_channel_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddingBackendInstancesV2Request::getVpcChannelId, (req, v) -> {
                req.setVpcChannelId(v);
            }));
        builder.<VpcMemberCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(VpcMemberCreate.class),
            f -> f.withMarshaller(AddingBackendInstancesV2Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchDisableMembersRequest, BatchDisableMembersResponse> batchDisableMembers =
        genForbatchDisableMembers();

    private static HttpRequestDef<BatchDisableMembersRequest, BatchDisableMembersResponse> genForbatchDisableMembers() {
        // basic
        HttpRequestDef.Builder<BatchDisableMembersRequest, BatchDisableMembersResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, BatchDisableMembersRequest.class, BatchDisableMembersResponse.class)
            .withName("BatchDisableMembers")
            .withUri(
                "/v2/{project_id}/apigw/instances/{instance_id}/vpc-channels/{vpc_channel_id}/members/batch-disable")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDisableMembersRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("vpc_channel_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchDisableMembersRequest::getVpcChannelId, (req, v) -> {
                req.setVpcChannelId(v);
            }));
        builder.<MembersBatchEnableOrDisable>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MembersBatchEnableOrDisable.class),
            f -> f.withMarshaller(BatchDisableMembersRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<BatchEnableMembersRequest, BatchEnableMembersResponse> batchEnableMembers =
        genForbatchEnableMembers();

    private static HttpRequestDef<BatchEnableMembersRequest, BatchEnableMembersResponse> genForbatchEnableMembers() {
        // basic
        HttpRequestDef.Builder<BatchEnableMembersRequest, BatchEnableMembersResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, BatchEnableMembersRequest.class, BatchEnableMembersResponse.class)
                .withName("BatchEnableMembers")
                .withUri(
                    "/v2/{project_id}/apigw/instances/{instance_id}/vpc-channels/{vpc_channel_id}/members/batch-enable")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchEnableMembersRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("vpc_channel_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(BatchEnableMembersRequest::getVpcChannelId, (req, v) -> {
                req.setVpcChannelId(v);
            }));
        builder.<MembersBatchEnableOrDisable>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MembersBatchEnableOrDisable.class),
            f -> f.withMarshaller(BatchEnableMembersRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateMemberGroupRequest, CreateMemberGroupResponse> createMemberGroup =
        genForcreateMemberGroup();

    private static HttpRequestDef<CreateMemberGroupRequest, CreateMemberGroupResponse> genForcreateMemberGroup() {
        // basic
        HttpRequestDef.Builder<CreateMemberGroupRequest, CreateMemberGroupResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateMemberGroupRequest.class, CreateMemberGroupResponse.class)
                .withName("CreateMemberGroup")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/vpc-channels/{vpc_channel_id}/member-groups")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateMemberGroupRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("vpc_channel_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateMemberGroupRequest::getVpcChannelId, (req, v) -> {
                req.setVpcChannelId(v);
            }));
        builder.<MemberGroupCreateBatch>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MemberGroupCreateBatch.class),
            f -> f.withMarshaller(CreateMemberGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateVpcChannelV2Request, CreateVpcChannelV2Response> createVpcChannelV2 =
        genForcreateVpcChannelV2();

    private static HttpRequestDef<CreateVpcChannelV2Request, CreateVpcChannelV2Response> genForcreateVpcChannelV2() {
        // basic
        HttpRequestDef.Builder<CreateVpcChannelV2Request, CreateVpcChannelV2Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateVpcChannelV2Request.class, CreateVpcChannelV2Response.class)
                .withName("CreateVpcChannelV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/vpc-channels")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateVpcChannelV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<VpcCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(VpcCreate.class),
            f -> f.withMarshaller(CreateVpcChannelV2Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteBackendInstanceV2Request, DeleteBackendInstanceV2Response> deleteBackendInstanceV2 =
        genFordeleteBackendInstanceV2();

    private static HttpRequestDef<DeleteBackendInstanceV2Request, DeleteBackendInstanceV2Response> genFordeleteBackendInstanceV2() {
        // basic
        HttpRequestDef.Builder<DeleteBackendInstanceV2Request, DeleteBackendInstanceV2Response> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteBackendInstanceV2Request.class, DeleteBackendInstanceV2Response.class)
            .withName("DeleteBackendInstanceV2")
            .withUri("/v2/{project_id}/apigw/instances/{instance_id}/vpc-channels/{vpc_channel_id}/members/{member_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBackendInstanceV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("vpc_channel_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBackendInstanceV2Request::getVpcChannelId, (req, v) -> {
                req.setVpcChannelId(v);
            }));
        builder.<String>withRequestField("member_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteBackendInstanceV2Request::getMemberId, (req, v) -> {
                req.setMemberId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteMemberGroupRequest, DeleteMemberGroupResponse> deleteMemberGroup =
        genFordeleteMemberGroup();

    private static HttpRequestDef<DeleteMemberGroupRequest, DeleteMemberGroupResponse> genFordeleteMemberGroup() {
        // basic
        HttpRequestDef.Builder<DeleteMemberGroupRequest, DeleteMemberGroupResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteMemberGroupRequest.class, DeleteMemberGroupResponse.class)
            .withName("DeleteMemberGroup")
            .withUri(
                "/v2/{project_id}/apigw/instances/{instance_id}/vpc-channels/{vpc_channel_id}/member-groups/{member_group_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteMemberGroupRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("vpc_channel_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteMemberGroupRequest::getVpcChannelId, (req, v) -> {
                req.setVpcChannelId(v);
            }));
        builder.<String>withRequestField("member_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteMemberGroupRequest::getMemberGroupId, (req, v) -> {
                req.setMemberGroupId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteVpcChannelV2Request, DeleteVpcChannelV2Response> deleteVpcChannelV2 =
        genFordeleteVpcChannelV2();

    private static HttpRequestDef<DeleteVpcChannelV2Request, DeleteVpcChannelV2Response> genFordeleteVpcChannelV2() {
        // basic
        HttpRequestDef.Builder<DeleteVpcChannelV2Request, DeleteVpcChannelV2Response> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteVpcChannelV2Request.class, DeleteVpcChannelV2Response.class)
                .withName("DeleteVpcChannelV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/vpc-channels/{vpc_channel_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVpcChannelV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("vpc_channel_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVpcChannelV2Request::getVpcChannelId, (req, v) -> {
                req.setVpcChannelId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBackendInstancesV2Request, ListBackendInstancesV2Response> listBackendInstancesV2 =
        genForlistBackendInstancesV2();

    private static HttpRequestDef<ListBackendInstancesV2Request, ListBackendInstancesV2Response> genForlistBackendInstancesV2() {
        // basic
        HttpRequestDef.Builder<ListBackendInstancesV2Request, ListBackendInstancesV2Response> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListBackendInstancesV2Request.class, ListBackendInstancesV2Response.class)
            .withName("ListBackendInstancesV2")
            .withUri("/v2/{project_id}/apigw/instances/{instance_id}/vpc-channels/{vpc_channel_id}/members")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackendInstancesV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("vpc_channel_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackendInstancesV2Request::getVpcChannelId, (req, v) -> {
                req.setVpcChannelId(v);
            }));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListBackendInstancesV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListBackendInstancesV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackendInstancesV2Request::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("member_group_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackendInstancesV2Request::getMemberGroupName, (req, v) -> {
                req.setMemberGroupName(v);
            }));
        builder.<String>withRequestField("member_group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackendInstancesV2Request::getMemberGroupId, (req, v) -> {
                req.setMemberGroupId(v);
            }));
        builder.<String>withRequestField("precise_search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBackendInstancesV2Request::getPreciseSearch, (req, v) -> {
                req.setPreciseSearch(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMemberGroupsRequest, ListMemberGroupsResponse> listMemberGroups =
        genForlistMemberGroups();

    private static HttpRequestDef<ListMemberGroupsRequest, ListMemberGroupsResponse> genForlistMemberGroups() {
        // basic
        HttpRequestDef.Builder<ListMemberGroupsRequest, ListMemberGroupsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListMemberGroupsRequest.class, ListMemberGroupsResponse.class)
                .withName("ListMemberGroups")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/vpc-channels/{vpc_channel_id}/member-groups")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMemberGroupsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("vpc_channel_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMemberGroupsRequest::getVpcChannelId, (req, v) -> {
                req.setVpcChannelId(v);
            }));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListMemberGroupsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMemberGroupsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("dict_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMemberGroupsRequest::getDictCode, (req, v) -> {
                req.setDictCode(v);
            }));
        builder.<String>withRequestField("member_group_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMemberGroupsRequest::getMemberGroupName, (req, v) -> {
                req.setMemberGroupName(v);
            }));
        builder.<String>withRequestField("precise_search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMemberGroupsRequest::getPreciseSearch, (req, v) -> {
                req.setPreciseSearch(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListVpcChannelsV2Request, ListVpcChannelsV2Response> listVpcChannelsV2 =
        genForlistVpcChannelsV2();

    private static HttpRequestDef<ListVpcChannelsV2Request, ListVpcChannelsV2Response> genForlistVpcChannelsV2() {
        // basic
        HttpRequestDef.Builder<ListVpcChannelsV2Request, ListVpcChannelsV2Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListVpcChannelsV2Request.class, ListVpcChannelsV2Response.class)
                .withName("ListVpcChannelsV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/vpc-channels")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVpcChannelsV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListVpcChannelsV2Request::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVpcChannelsV2Request::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<String>withRequestField("id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVpcChannelsV2Request::getId, (req, v) -> {
                req.setId(v);
            }));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVpcChannelsV2Request::getName, (req, v) -> {
                req.setName(v);
            }));
        builder.<String>withRequestField("dict_code",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVpcChannelsV2Request::getDictCode, (req, v) -> {
                req.setDictCode(v);
            }));
        builder.<String>withRequestField("precise_search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVpcChannelsV2Request::getPreciseSearch, (req, v) -> {
                req.setPreciseSearch(v);
            }));
        builder.<String>withRequestField("member_host",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVpcChannelsV2Request::getMemberHost, (req, v) -> {
                req.setMemberHost(v);
            }));
        builder.<Integer>withRequestField("member_port",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListVpcChannelsV2Request::getMemberPort, (req, v) -> {
                req.setMemberPort(v);
            }));
        builder.<String>withRequestField("member_group_name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVpcChannelsV2Request::getMemberGroupName, (req, v) -> {
                req.setMemberGroupName(v);
            }));
        builder.<String>withRequestField("member_group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListVpcChannelsV2Request::getMemberGroupId, (req, v) -> {
                req.setMemberGroupId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDetailsOfMemberGroupRequest, ShowDetailsOfMemberGroupResponse> showDetailsOfMemberGroup =
        genForshowDetailsOfMemberGroup();

    private static HttpRequestDef<ShowDetailsOfMemberGroupRequest, ShowDetailsOfMemberGroupResponse> genForshowDetailsOfMemberGroup() {
        // basic
        HttpRequestDef.Builder<ShowDetailsOfMemberGroupRequest, ShowDetailsOfMemberGroupResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowDetailsOfMemberGroupRequest.class, ShowDetailsOfMemberGroupResponse.class)
                .withName("ShowDetailsOfMemberGroup")
                .withUri(
                    "/v2/{project_id}/apigw/instances/{instance_id}/vpc-channels/{vpc_channel_id}/member-groups/{member_group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailsOfMemberGroupRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("vpc_channel_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailsOfMemberGroupRequest::getVpcChannelId, (req, v) -> {
                req.setVpcChannelId(v);
            }));
        builder.<String>withRequestField("member_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailsOfMemberGroupRequest::getMemberGroupId, (req, v) -> {
                req.setMemberGroupId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowDetailsOfVpcChannelV2Request, ShowDetailsOfVpcChannelV2Response> showDetailsOfVpcChannelV2 =
        genForshowDetailsOfVpcChannelV2();

    private static HttpRequestDef<ShowDetailsOfVpcChannelV2Request, ShowDetailsOfVpcChannelV2Response> genForshowDetailsOfVpcChannelV2() {
        // basic
        HttpRequestDef.Builder<ShowDetailsOfVpcChannelV2Request, ShowDetailsOfVpcChannelV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowDetailsOfVpcChannelV2Request.class,
                    ShowDetailsOfVpcChannelV2Response.class)
                .withName("ShowDetailsOfVpcChannelV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/vpc-channels/{vpc_channel_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailsOfVpcChannelV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("vpc_channel_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowDetailsOfVpcChannelV2Request::getVpcChannelId, (req, v) -> {
                req.setVpcChannelId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateBackendInstancesV2Request, UpdateBackendInstancesV2Response> updateBackendInstancesV2 =
        genForupdateBackendInstancesV2();

    private static HttpRequestDef<UpdateBackendInstancesV2Request, UpdateBackendInstancesV2Response> genForupdateBackendInstancesV2() {
        // basic
        HttpRequestDef.Builder<UpdateBackendInstancesV2Request, UpdateBackendInstancesV2Response> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT, UpdateBackendInstancesV2Request.class, UpdateBackendInstancesV2Response.class)
                .withName("UpdateBackendInstancesV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/vpc-channels/{vpc_channel_id}/members")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateBackendInstancesV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("vpc_channel_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateBackendInstancesV2Request::getVpcChannelId, (req, v) -> {
                req.setVpcChannelId(v);
            }));
        builder.<VpcMemberModify>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(VpcMemberModify.class),
            f -> f.withMarshaller(UpdateBackendInstancesV2Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateHealthCheckRequest, UpdateHealthCheckResponse> updateHealthCheck =
        genForupdateHealthCheck();

    private static HttpRequestDef<UpdateHealthCheckRequest, UpdateHealthCheckResponse> genForupdateHealthCheck() {
        // basic
        HttpRequestDef.Builder<UpdateHealthCheckRequest, UpdateHealthCheckResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateHealthCheckRequest.class, UpdateHealthCheckResponse.class)
                .withName("UpdateHealthCheck")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/vpc-channels/{vpc_channel_id}/health-config")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHealthCheckRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("vpc_channel_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHealthCheckRequest::getVpcChannelId, (req, v) -> {
                req.setVpcChannelId(v);
            }));
        builder.<VpcHealthConfig>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(VpcHealthConfig.class),
            f -> f.withMarshaller(UpdateHealthCheckRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateMemberGroupRequest, UpdateMemberGroupResponse> updateMemberGroup =
        genForupdateMemberGroup();

    private static HttpRequestDef<UpdateMemberGroupRequest, UpdateMemberGroupResponse> genForupdateMemberGroup() {
        // basic
        HttpRequestDef.Builder<UpdateMemberGroupRequest, UpdateMemberGroupResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateMemberGroupRequest.class, UpdateMemberGroupResponse.class)
            .withName("UpdateMemberGroup")
            .withUri(
                "/v2/{project_id}/apigw/instances/{instance_id}/vpc-channels/{vpc_channel_id}/member-groups/{member_group_id}")
            .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMemberGroupRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("vpc_channel_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMemberGroupRequest::getVpcChannelId, (req, v) -> {
                req.setVpcChannelId(v);
            }));
        builder.<String>withRequestField("member_group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateMemberGroupRequest::getMemberGroupId, (req, v) -> {
                req.setMemberGroupId(v);
            }));
        builder.<MemberGroupCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(MemberGroupCreate.class),
            f -> f.withMarshaller(UpdateMemberGroupRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateVpcChannelV2Request, UpdateVpcChannelV2Response> updateVpcChannelV2 =
        genForupdateVpcChannelV2();

    private static HttpRequestDef<UpdateVpcChannelV2Request, UpdateVpcChannelV2Response> genForupdateVpcChannelV2() {
        // basic
        HttpRequestDef.Builder<UpdateVpcChannelV2Request, UpdateVpcChannelV2Response> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateVpcChannelV2Request.class, UpdateVpcChannelV2Response.class)
                .withName("UpdateVpcChannelV2")
                .withUri("/v2/{project_id}/apigw/instances/{instance_id}/vpc-channels/{vpc_channel_id}")
                .withContentType("application/json;charset=UTF-8");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateVpcChannelV2Request::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<String>withRequestField("vpc_channel_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateVpcChannelV2Request::getVpcChannelId, (req, v) -> {
                req.setVpcChannelId(v);
            }));
        builder.<VpcCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(VpcCreate.class),
            f -> f.withMarshaller(UpdateVpcChannelV2Request::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

}
