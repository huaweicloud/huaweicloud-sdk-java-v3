package com.huaweicloud.sdk.iam.v5;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.iam.v5.model.AddUserToGroupReqBody;
import com.huaweicloud.sdk.iam.v5.model.AddUserToGroupV5Request;
import com.huaweicloud.sdk.iam.v5.model.AddUserToGroupV5Response;
import com.huaweicloud.sdk.iam.v5.model.AttachAgencyPolicyReqBody;
import com.huaweicloud.sdk.iam.v5.model.AttachAgencyPolicyV5Request;
import com.huaweicloud.sdk.iam.v5.model.AttachAgencyPolicyV5Response;
import com.huaweicloud.sdk.iam.v5.model.AttachGroupPolicyReqBody;
import com.huaweicloud.sdk.iam.v5.model.AttachGroupPolicyV5Request;
import com.huaweicloud.sdk.iam.v5.model.AttachGroupPolicyV5Response;
import com.huaweicloud.sdk.iam.v5.model.AttachUserPolicyReqBody;
import com.huaweicloud.sdk.iam.v5.model.AttachUserPolicyV5Request;
import com.huaweicloud.sdk.iam.v5.model.AttachUserPolicyV5Response;
import com.huaweicloud.sdk.iam.v5.model.ChangePasswordReqBody;
import com.huaweicloud.sdk.iam.v5.model.ChangePasswordV5Request;
import com.huaweicloud.sdk.iam.v5.model.ChangePasswordV5Response;
import com.huaweicloud.sdk.iam.v5.model.CreateAccessKeyV5Request;
import com.huaweicloud.sdk.iam.v5.model.CreateAccessKeyV5Response;
import com.huaweicloud.sdk.iam.v5.model.CreateAgencyReqBody;
import com.huaweicloud.sdk.iam.v5.model.CreateAgencyV5Request;
import com.huaweicloud.sdk.iam.v5.model.CreateAgencyV5Response;
import com.huaweicloud.sdk.iam.v5.model.CreateGroupReqBody;
import com.huaweicloud.sdk.iam.v5.model.CreateGroupV5Request;
import com.huaweicloud.sdk.iam.v5.model.CreateGroupV5Response;
import com.huaweicloud.sdk.iam.v5.model.CreateLoginProfileReqBody;
import com.huaweicloud.sdk.iam.v5.model.CreateLoginProfileV5Request;
import com.huaweicloud.sdk.iam.v5.model.CreateLoginProfileV5Response;
import com.huaweicloud.sdk.iam.v5.model.CreatePolicyReqBody;
import com.huaweicloud.sdk.iam.v5.model.CreatePolicyV5Request;
import com.huaweicloud.sdk.iam.v5.model.CreatePolicyV5Response;
import com.huaweicloud.sdk.iam.v5.model.CreatePolicyVersionReqBody;
import com.huaweicloud.sdk.iam.v5.model.CreatePolicyVersionV5Request;
import com.huaweicloud.sdk.iam.v5.model.CreatePolicyVersionV5Response;
import com.huaweicloud.sdk.iam.v5.model.CreateServiceLinkedAgencyReqBody;
import com.huaweicloud.sdk.iam.v5.model.CreateServiceLinkedAgencyV5Request;
import com.huaweicloud.sdk.iam.v5.model.CreateServiceLinkedAgencyV5Response;
import com.huaweicloud.sdk.iam.v5.model.CreateUserReqBody;
import com.huaweicloud.sdk.iam.v5.model.CreateUserV5Request;
import com.huaweicloud.sdk.iam.v5.model.CreateUserV5Response;
import com.huaweicloud.sdk.iam.v5.model.CreateVirtualMfaDeviceReqBody;
import com.huaweicloud.sdk.iam.v5.model.CreateVirtualMfaDeviceV5Request;
import com.huaweicloud.sdk.iam.v5.model.CreateVirtualMfaDeviceV5Response;
import com.huaweicloud.sdk.iam.v5.model.DeleteAccessKeyV5Request;
import com.huaweicloud.sdk.iam.v5.model.DeleteAccessKeyV5Response;
import com.huaweicloud.sdk.iam.v5.model.DeleteAgencyV5Request;
import com.huaweicloud.sdk.iam.v5.model.DeleteAgencyV5Response;
import com.huaweicloud.sdk.iam.v5.model.DeleteGroupV5Request;
import com.huaweicloud.sdk.iam.v5.model.DeleteGroupV5Response;
import com.huaweicloud.sdk.iam.v5.model.DeleteLoginProfileV5Request;
import com.huaweicloud.sdk.iam.v5.model.DeleteLoginProfileV5Response;
import com.huaweicloud.sdk.iam.v5.model.DeletePolicyV5Request;
import com.huaweicloud.sdk.iam.v5.model.DeletePolicyV5Response;
import com.huaweicloud.sdk.iam.v5.model.DeletePolicyVersionV5Request;
import com.huaweicloud.sdk.iam.v5.model.DeletePolicyVersionV5Response;
import com.huaweicloud.sdk.iam.v5.model.DeleteResourceTagsV5Request;
import com.huaweicloud.sdk.iam.v5.model.DeleteResourceTagsV5Response;
import com.huaweicloud.sdk.iam.v5.model.DeleteServiceLinkedAgencyV5Request;
import com.huaweicloud.sdk.iam.v5.model.DeleteServiceLinkedAgencyV5Response;
import com.huaweicloud.sdk.iam.v5.model.DeleteUserV5Request;
import com.huaweicloud.sdk.iam.v5.model.DeleteUserV5Response;
import com.huaweicloud.sdk.iam.v5.model.DeleteVirtualMfaDeviceV5Request;
import com.huaweicloud.sdk.iam.v5.model.DeleteVirtualMfaDeviceV5Response;
import com.huaweicloud.sdk.iam.v5.model.DetachAgencyPolicyReqBody;
import com.huaweicloud.sdk.iam.v5.model.DetachAgencyPolicyV5Request;
import com.huaweicloud.sdk.iam.v5.model.DetachAgencyPolicyV5Response;
import com.huaweicloud.sdk.iam.v5.model.DetachGroupPolicyReqBody;
import com.huaweicloud.sdk.iam.v5.model.DetachGroupPolicyV5Request;
import com.huaweicloud.sdk.iam.v5.model.DetachGroupPolicyV5Response;
import com.huaweicloud.sdk.iam.v5.model.DetachUserPolicyReqBody;
import com.huaweicloud.sdk.iam.v5.model.DetachUserPolicyV5Request;
import com.huaweicloud.sdk.iam.v5.model.DetachUserPolicyV5Response;
import com.huaweicloud.sdk.iam.v5.model.DisableMfaDeviceReqBody;
import com.huaweicloud.sdk.iam.v5.model.DisableMfaDeviceV5Request;
import com.huaweicloud.sdk.iam.v5.model.DisableMfaDeviceV5Response;
import com.huaweicloud.sdk.iam.v5.model.EnableMfaDeviceReqBody;
import com.huaweicloud.sdk.iam.v5.model.EnableMfaDeviceV5Request;
import com.huaweicloud.sdk.iam.v5.model.EnableMfaDeviceV5Response;
import com.huaweicloud.sdk.iam.v5.model.GetAccountSummaryV5Request;
import com.huaweicloud.sdk.iam.v5.model.GetAccountSummaryV5Response;
import com.huaweicloud.sdk.iam.v5.model.GetAgencyV5Request;
import com.huaweicloud.sdk.iam.v5.model.GetAgencyV5Response;
import com.huaweicloud.sdk.iam.v5.model.GetAsymmetricSignatureSwitchV5Request;
import com.huaweicloud.sdk.iam.v5.model.GetAsymmetricSignatureSwitchV5Response;
import com.huaweicloud.sdk.iam.v5.model.GetAuthorizationSchemaV5Request;
import com.huaweicloud.sdk.iam.v5.model.GetAuthorizationSchemaV5Response;
import com.huaweicloud.sdk.iam.v5.model.GetFeatureStatusV5Request;
import com.huaweicloud.sdk.iam.v5.model.GetFeatureStatusV5Response;
import com.huaweicloud.sdk.iam.v5.model.GetPolicyV5Request;
import com.huaweicloud.sdk.iam.v5.model.GetPolicyV5Response;
import com.huaweicloud.sdk.iam.v5.model.GetPolicyVersionV5Request;
import com.huaweicloud.sdk.iam.v5.model.GetPolicyVersionV5Response;
import com.huaweicloud.sdk.iam.v5.model.GetServiceLinkedAgencyDeletionStatusV5Request;
import com.huaweicloud.sdk.iam.v5.model.GetServiceLinkedAgencyDeletionStatusV5Response;
import com.huaweicloud.sdk.iam.v5.model.ListAccessKeysV5Request;
import com.huaweicloud.sdk.iam.v5.model.ListAccessKeysV5Response;
import com.huaweicloud.sdk.iam.v5.model.ListAgenciesV5Request;
import com.huaweicloud.sdk.iam.v5.model.ListAgenciesV5Response;
import com.huaweicloud.sdk.iam.v5.model.ListAttachedAgencyPoliciesV5Request;
import com.huaweicloud.sdk.iam.v5.model.ListAttachedAgencyPoliciesV5Response;
import com.huaweicloud.sdk.iam.v5.model.ListAttachedGroupPoliciesV5Request;
import com.huaweicloud.sdk.iam.v5.model.ListAttachedGroupPoliciesV5Response;
import com.huaweicloud.sdk.iam.v5.model.ListAttachedUserPoliciesV5Request;
import com.huaweicloud.sdk.iam.v5.model.ListAttachedUserPoliciesV5Response;
import com.huaweicloud.sdk.iam.v5.model.ListEntitiesForPolicyV5Request;
import com.huaweicloud.sdk.iam.v5.model.ListEntitiesForPolicyV5Response;
import com.huaweicloud.sdk.iam.v5.model.ListGroupsV5Request;
import com.huaweicloud.sdk.iam.v5.model.ListGroupsV5Response;
import com.huaweicloud.sdk.iam.v5.model.ListMfaDevicesV5Request;
import com.huaweicloud.sdk.iam.v5.model.ListMfaDevicesV5Response;
import com.huaweicloud.sdk.iam.v5.model.ListPoliciesV5Request;
import com.huaweicloud.sdk.iam.v5.model.ListPoliciesV5Response;
import com.huaweicloud.sdk.iam.v5.model.ListPolicyVersionsV5Request;
import com.huaweicloud.sdk.iam.v5.model.ListPolicyVersionsV5Response;
import com.huaweicloud.sdk.iam.v5.model.ListRegisteredServicesForAuthSchemaV5Request;
import com.huaweicloud.sdk.iam.v5.model.ListRegisteredServicesForAuthSchemaV5Response;
import com.huaweicloud.sdk.iam.v5.model.ListResourceTagsV5Request;
import com.huaweicloud.sdk.iam.v5.model.ListResourceTagsV5Response;
import com.huaweicloud.sdk.iam.v5.model.ListServicePrincipalsV5Request;
import com.huaweicloud.sdk.iam.v5.model.ListServicePrincipalsV5Response;
import com.huaweicloud.sdk.iam.v5.model.ListUsersV5Request;
import com.huaweicloud.sdk.iam.v5.model.ListUsersV5Response;
import com.huaweicloud.sdk.iam.v5.model.RemoveUserFromGroupReqBody;
import com.huaweicloud.sdk.iam.v5.model.RemoveUserFromGroupV5Request;
import com.huaweicloud.sdk.iam.v5.model.RemoveUserFromGroupV5Response;
import com.huaweicloud.sdk.iam.v5.model.SetAsymmetricSignatureReq;
import com.huaweicloud.sdk.iam.v5.model.SetAsymmetricSignatureSwitchV5Request;
import com.huaweicloud.sdk.iam.v5.model.SetAsymmetricSignatureSwitchV5Response;
import com.huaweicloud.sdk.iam.v5.model.SetDefaultPolicyVersionV5Request;
import com.huaweicloud.sdk.iam.v5.model.SetDefaultPolicyVersionV5Response;
import com.huaweicloud.sdk.iam.v5.model.ShowAccessKeyLastUsedV5Request;
import com.huaweicloud.sdk.iam.v5.model.ShowAccessKeyLastUsedV5Response;
import com.huaweicloud.sdk.iam.v5.model.ShowGroupV5Request;
import com.huaweicloud.sdk.iam.v5.model.ShowGroupV5Response;
import com.huaweicloud.sdk.iam.v5.model.ShowLoginPolicyV5Request;
import com.huaweicloud.sdk.iam.v5.model.ShowLoginPolicyV5Response;
import com.huaweicloud.sdk.iam.v5.model.ShowLoginProfileV5Request;
import com.huaweicloud.sdk.iam.v5.model.ShowLoginProfileV5Response;
import com.huaweicloud.sdk.iam.v5.model.ShowPasswordPolicyV5Request;
import com.huaweicloud.sdk.iam.v5.model.ShowPasswordPolicyV5Response;
import com.huaweicloud.sdk.iam.v5.model.ShowTokenPolicyV5Request;
import com.huaweicloud.sdk.iam.v5.model.ShowTokenPolicyV5Response;
import com.huaweicloud.sdk.iam.v5.model.ShowUserLastLoginV5Request;
import com.huaweicloud.sdk.iam.v5.model.ShowUserLastLoginV5Response;
import com.huaweicloud.sdk.iam.v5.model.ShowUserV5Request;
import com.huaweicloud.sdk.iam.v5.model.ShowUserV5Response;
import com.huaweicloud.sdk.iam.v5.model.TagResourceV5Request;
import com.huaweicloud.sdk.iam.v5.model.TagResourceV5Response;
import com.huaweicloud.sdk.iam.v5.model.Tags;
import com.huaweicloud.sdk.iam.v5.model.UpdateAccessKeyReqBody;
import com.huaweicloud.sdk.iam.v5.model.UpdateAccessKeyV5Request;
import com.huaweicloud.sdk.iam.v5.model.UpdateAccessKeyV5Response;
import com.huaweicloud.sdk.iam.v5.model.UpdateAgencyReqBody;
import com.huaweicloud.sdk.iam.v5.model.UpdateAgencyV5Request;
import com.huaweicloud.sdk.iam.v5.model.UpdateAgencyV5Response;
import com.huaweicloud.sdk.iam.v5.model.UpdateGroupReqBody;
import com.huaweicloud.sdk.iam.v5.model.UpdateGroupV5Request;
import com.huaweicloud.sdk.iam.v5.model.UpdateGroupV5Response;
import com.huaweicloud.sdk.iam.v5.model.UpdateLoginPolicyReqBody;
import com.huaweicloud.sdk.iam.v5.model.UpdateLoginPolicyV5Request;
import com.huaweicloud.sdk.iam.v5.model.UpdateLoginPolicyV5Response;
import com.huaweicloud.sdk.iam.v5.model.UpdateLoginProfileReqBody;
import com.huaweicloud.sdk.iam.v5.model.UpdateLoginProfileV5Request;
import com.huaweicloud.sdk.iam.v5.model.UpdateLoginProfileV5Response;
import com.huaweicloud.sdk.iam.v5.model.UpdatePasswordPolicyReqBody;
import com.huaweicloud.sdk.iam.v5.model.UpdatePasswordPolicyV5Request;
import com.huaweicloud.sdk.iam.v5.model.UpdatePasswordPolicyV5Response;
import com.huaweicloud.sdk.iam.v5.model.UpdateTokenPolicyReqBody;
import com.huaweicloud.sdk.iam.v5.model.UpdateTokenPolicyV5Request;
import com.huaweicloud.sdk.iam.v5.model.UpdateTokenPolicyV5Response;
import com.huaweicloud.sdk.iam.v5.model.UpdateTrustPolicyReqBody;
import com.huaweicloud.sdk.iam.v5.model.UpdateTrustPolicyV5Request;
import com.huaweicloud.sdk.iam.v5.model.UpdateTrustPolicyV5Response;
import com.huaweicloud.sdk.iam.v5.model.UpdateUserReqBody;
import com.huaweicloud.sdk.iam.v5.model.UpdateUserV5Request;
import com.huaweicloud.sdk.iam.v5.model.UpdateUserV5Response;

import java.util.List;

@SuppressWarnings("unchecked")
public class IamMeta {

    public static final HttpRequestDef<GetAccountSummaryV5Request, GetAccountSummaryV5Response> getAccountSummaryV5 =
        genForGetAccountSummaryV5();

    private static HttpRequestDef<GetAccountSummaryV5Request, GetAccountSummaryV5Response> genForGetAccountSummaryV5() {
        // basic
        HttpRequestDef.Builder<GetAccountSummaryV5Request, GetAccountSummaryV5Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, GetAccountSummaryV5Request.class, GetAccountSummaryV5Response.class)
                .withName("GetAccountSummaryV5")
                .withUri("/v5/account-summary")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetAsymmetricSignatureSwitchV5Request, GetAsymmetricSignatureSwitchV5Response> getAsymmetricSignatureSwitchV5 =
        genForGetAsymmetricSignatureSwitchV5();

    private static HttpRequestDef<GetAsymmetricSignatureSwitchV5Request, GetAsymmetricSignatureSwitchV5Response> genForGetAsymmetricSignatureSwitchV5() {
        // basic
        HttpRequestDef.Builder<GetAsymmetricSignatureSwitchV5Request, GetAsymmetricSignatureSwitchV5Response> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    GetAsymmetricSignatureSwitchV5Request.class,
                    GetAsymmetricSignatureSwitchV5Response.class)
                .withName("GetAsymmetricSignatureSwitchV5")
                .withUri("/v5/asymmetric-signature-switch")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetFeatureStatusV5Request, GetFeatureStatusV5Response> getFeatureStatusV5 =
        genForGetFeatureStatusV5();

    private static HttpRequestDef<GetFeatureStatusV5Request, GetFeatureStatusV5Response> genForGetFeatureStatusV5() {
        // basic
        HttpRequestDef.Builder<GetFeatureStatusV5Request, GetFeatureStatusV5Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, GetFeatureStatusV5Request.class, GetFeatureStatusV5Response.class)
                .withName("GetFeatureStatusV5")
                .withUri("/v5/features/{feature_name}")
                .withContentType("application/json");

        // requests
        builder.<GetFeatureStatusV5Request.FeatureNameEnum>withRequestField("feature_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(GetFeatureStatusV5Request.FeatureNameEnum.class),
            f -> f.withMarshaller(GetFeatureStatusV5Request::getFeatureName,
                GetFeatureStatusV5Request::setFeatureName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetAsymmetricSignatureSwitchV5Request, SetAsymmetricSignatureSwitchV5Response> setAsymmetricSignatureSwitchV5 =
        genForSetAsymmetricSignatureSwitchV5();

    private static HttpRequestDef<SetAsymmetricSignatureSwitchV5Request, SetAsymmetricSignatureSwitchV5Response> genForSetAsymmetricSignatureSwitchV5() {
        // basic
        HttpRequestDef.Builder<SetAsymmetricSignatureSwitchV5Request, SetAsymmetricSignatureSwitchV5Response> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    SetAsymmetricSignatureSwitchV5Request.class,
                    SetAsymmetricSignatureSwitchV5Response.class)
                .withName("SetAsymmetricSignatureSwitchV5")
                .withUri("/v5/asymmetric-signature-switch")
                .withContentType("application/json");

        // requests
        builder.<SetAsymmetricSignatureReq>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SetAsymmetricSignatureReq.class),
            f -> f.withMarshaller(SetAsymmetricSignatureSwitchV5Request::getBody,
                SetAsymmetricSignatureSwitchV5Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAgencyV5Request, CreateAgencyV5Response> createAgencyV5 =
        genForCreateAgencyV5();

    private static HttpRequestDef<CreateAgencyV5Request, CreateAgencyV5Response> genForCreateAgencyV5() {
        // basic
        HttpRequestDef.Builder<CreateAgencyV5Request, CreateAgencyV5Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAgencyV5Request.class, CreateAgencyV5Response.class)
                .withName("CreateAgencyV5")
                .withUri("/v5/agencies")
                .withContentType("application/json");

        // requests
        builder.<CreateAgencyReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAgencyReqBody.class),
            f -> f.withMarshaller(CreateAgencyV5Request::getBody, CreateAgencyV5Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateServiceLinkedAgencyV5Request, CreateServiceLinkedAgencyV5Response> createServiceLinkedAgencyV5 =
        genForCreateServiceLinkedAgencyV5();

    private static HttpRequestDef<CreateServiceLinkedAgencyV5Request, CreateServiceLinkedAgencyV5Response> genForCreateServiceLinkedAgencyV5() {
        // basic
        HttpRequestDef.Builder<CreateServiceLinkedAgencyV5Request, CreateServiceLinkedAgencyV5Response> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    CreateServiceLinkedAgencyV5Request.class,
                    CreateServiceLinkedAgencyV5Response.class)
                .withName("CreateServiceLinkedAgencyV5")
                .withUri("/v5/service-linked-agencies")
                .withContentType("application/json");

        // requests
        builder.<CreateServiceLinkedAgencyReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateServiceLinkedAgencyReqBody.class),
            f -> f.withMarshaller(CreateServiceLinkedAgencyV5Request::getBody,
                CreateServiceLinkedAgencyV5Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAgencyV5Request, DeleteAgencyV5Response> deleteAgencyV5 =
        genForDeleteAgencyV5();

    private static HttpRequestDef<DeleteAgencyV5Request, DeleteAgencyV5Response> genForDeleteAgencyV5() {
        // basic
        HttpRequestDef.Builder<DeleteAgencyV5Request, DeleteAgencyV5Response> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAgencyV5Request.class, DeleteAgencyV5Response.class)
                .withName("DeleteAgencyV5")
                .withUri("/v5/agencies/{agency_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("agency_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAgencyV5Request::getAgencyId, DeleteAgencyV5Request::setAgencyId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteServiceLinkedAgencyV5Request, DeleteServiceLinkedAgencyV5Response> deleteServiceLinkedAgencyV5 =
        genForDeleteServiceLinkedAgencyV5();

    private static HttpRequestDef<DeleteServiceLinkedAgencyV5Request, DeleteServiceLinkedAgencyV5Response> genForDeleteServiceLinkedAgencyV5() {
        // basic
        HttpRequestDef.Builder<DeleteServiceLinkedAgencyV5Request, DeleteServiceLinkedAgencyV5Response> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteServiceLinkedAgencyV5Request.class,
                    DeleteServiceLinkedAgencyV5Response.class)
                .withName("DeleteServiceLinkedAgencyV5")
                .withUri("/v5/service-linked-agencies/{agency_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("agency_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteServiceLinkedAgencyV5Request::getAgencyId,
                DeleteServiceLinkedAgencyV5Request::setAgencyId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetAgencyV5Request, GetAgencyV5Response> getAgencyV5 = genForGetAgencyV5();

    private static HttpRequestDef<GetAgencyV5Request, GetAgencyV5Response> genForGetAgencyV5() {
        // basic
        HttpRequestDef.Builder<GetAgencyV5Request, GetAgencyV5Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, GetAgencyV5Request.class, GetAgencyV5Response.class)
                .withName("GetAgencyV5")
                .withUri("/v5/agencies/{agency_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("agency_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetAgencyV5Request::getAgencyId, GetAgencyV5Request::setAgencyId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetServiceLinkedAgencyDeletionStatusV5Request, GetServiceLinkedAgencyDeletionStatusV5Response> getServiceLinkedAgencyDeletionStatusV5 =
        genForGetServiceLinkedAgencyDeletionStatusV5();

    private static HttpRequestDef<GetServiceLinkedAgencyDeletionStatusV5Request, GetServiceLinkedAgencyDeletionStatusV5Response> genForGetServiceLinkedAgencyDeletionStatusV5() {
        // basic
        HttpRequestDef.Builder<GetServiceLinkedAgencyDeletionStatusV5Request, GetServiceLinkedAgencyDeletionStatusV5Response> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    GetServiceLinkedAgencyDeletionStatusV5Request.class,
                    GetServiceLinkedAgencyDeletionStatusV5Response.class)
                .withName("GetServiceLinkedAgencyDeletionStatusV5")
                .withUri("/v5/service-linked-agencies/deletion-task/{deletion_task_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("deletion_task_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetServiceLinkedAgencyDeletionStatusV5Request::getDeletionTaskId,
                GetServiceLinkedAgencyDeletionStatusV5Request::setDeletionTaskId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAgenciesV5Request, ListAgenciesV5Response> listAgenciesV5 =
        genForListAgenciesV5();

    private static HttpRequestDef<ListAgenciesV5Request, ListAgenciesV5Response> genForListAgenciesV5() {
        // basic
        HttpRequestDef.Builder<ListAgenciesV5Request, ListAgenciesV5Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAgenciesV5Request.class, ListAgenciesV5Response.class)
                .withName("ListAgenciesV5")
                .withUri("/v5/agencies")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAgenciesV5Request::getLimit, ListAgenciesV5Request::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAgenciesV5Request::getMarker, ListAgenciesV5Request::setMarker));
        builder.<String>withRequestField("path_prefix",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAgenciesV5Request::getPathPrefix, ListAgenciesV5Request::setPathPrefix));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAgencyV5Request, UpdateAgencyV5Response> updateAgencyV5 =
        genForUpdateAgencyV5();

    private static HttpRequestDef<UpdateAgencyV5Request, UpdateAgencyV5Response> genForUpdateAgencyV5() {
        // basic
        HttpRequestDef.Builder<UpdateAgencyV5Request, UpdateAgencyV5Response> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAgencyV5Request.class, UpdateAgencyV5Response.class)
                .withName("UpdateAgencyV5")
                .withUri("/v5/agencies/{agency_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("agency_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAgencyV5Request::getAgencyId, UpdateAgencyV5Request::setAgencyId));
        builder.<UpdateAgencyReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAgencyReqBody.class),
            f -> f.withMarshaller(UpdateAgencyV5Request::getBody, UpdateAgencyV5Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTrustPolicyV5Request, UpdateTrustPolicyV5Response> updateTrustPolicyV5 =
        genForUpdateTrustPolicyV5();

    private static HttpRequestDef<UpdateTrustPolicyV5Request, UpdateTrustPolicyV5Response> genForUpdateTrustPolicyV5() {
        // basic
        HttpRequestDef.Builder<UpdateTrustPolicyV5Request, UpdateTrustPolicyV5Response> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateTrustPolicyV5Request.class, UpdateTrustPolicyV5Response.class)
                .withName("UpdateTrustPolicyV5")
                .withUri("/v5/agencies/{agency_id}/trust-policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("agency_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTrustPolicyV5Request::getAgencyId, UpdateTrustPolicyV5Request::setAgencyId));
        builder.<UpdateTrustPolicyReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateTrustPolicyReqBody.class),
            f -> f.withMarshaller(UpdateTrustPolicyV5Request::getBody, UpdateTrustPolicyV5Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetAuthorizationSchemaV5Request, GetAuthorizationSchemaV5Response> getAuthorizationSchemaV5 =
        genForGetAuthorizationSchemaV5();

    private static HttpRequestDef<GetAuthorizationSchemaV5Request, GetAuthorizationSchemaV5Response> genForGetAuthorizationSchemaV5() {
        // basic
        HttpRequestDef.Builder<GetAuthorizationSchemaV5Request, GetAuthorizationSchemaV5Response> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, GetAuthorizationSchemaV5Request.class, GetAuthorizationSchemaV5Response.class)
                .withName("GetAuthorizationSchemaV5")
                .withUri("/v5/authorization-schemas/services/{service_code}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_code",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetAuthorizationSchemaV5Request::getServiceCode,
                GetAuthorizationSchemaV5Request::setServiceCode));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRegisteredServicesForAuthSchemaV5Request, ListRegisteredServicesForAuthSchemaV5Response> listRegisteredServicesForAuthSchemaV5 =
        genForListRegisteredServicesForAuthSchemaV5();

    private static HttpRequestDef<ListRegisteredServicesForAuthSchemaV5Request, ListRegisteredServicesForAuthSchemaV5Response> genForListRegisteredServicesForAuthSchemaV5() {
        // basic
        HttpRequestDef.Builder<ListRegisteredServicesForAuthSchemaV5Request, ListRegisteredServicesForAuthSchemaV5Response> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListRegisteredServicesForAuthSchemaV5Request.class,
                    ListRegisteredServicesForAuthSchemaV5Response.class)
                .withName("ListRegisteredServicesForAuthSchemaV5")
                .withUri("/v5/authorization-schemas/registered-services")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListRegisteredServicesForAuthSchemaV5Request::getLimit,
                ListRegisteredServicesForAuthSchemaV5Request::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListRegisteredServicesForAuthSchemaV5Request::getMarker,
                ListRegisteredServicesForAuthSchemaV5Request::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListServicePrincipalsV5Request, ListServicePrincipalsV5Response> listServicePrincipalsV5 =
        genForListServicePrincipalsV5();

    private static HttpRequestDef<ListServicePrincipalsV5Request, ListServicePrincipalsV5Response> genForListServicePrincipalsV5() {
        // basic
        HttpRequestDef.Builder<ListServicePrincipalsV5Request, ListServicePrincipalsV5Response> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListServicePrincipalsV5Request.class, ListServicePrincipalsV5Response.class)
            .withName("ListServicePrincipalsV5")
            .withUri("/v5/service-principals")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListServicePrincipalsV5Request::getLimit, ListServicePrincipalsV5Request::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListServicePrincipalsV5Request::getMarker,
                ListServicePrincipalsV5Request::setMarker));
        builder.<ListServicePrincipalsV5Request.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListServicePrincipalsV5Request.XLanguageEnum.class),
            f -> f.withMarshaller(ListServicePrincipalsV5Request::getXLanguage,
                ListServicePrincipalsV5Request::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AddUserToGroupV5Request, AddUserToGroupV5Response> addUserToGroupV5 =
        genForAddUserToGroupV5();

    private static HttpRequestDef<AddUserToGroupV5Request, AddUserToGroupV5Response> genForAddUserToGroupV5() {
        // basic
        HttpRequestDef.Builder<AddUserToGroupV5Request, AddUserToGroupV5Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, AddUserToGroupV5Request.class, AddUserToGroupV5Response.class)
                .withName("AddUserToGroupV5")
                .withUri("/v5/groups/{group_id}/add-user")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AddUserToGroupV5Request::getGroupId, AddUserToGroupV5Request::setGroupId));
        builder.<AddUserToGroupReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AddUserToGroupReqBody.class),
            f -> f.withMarshaller(AddUserToGroupV5Request::getBody, AddUserToGroupV5Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateGroupV5Request, CreateGroupV5Response> createGroupV5 =
        genForCreateGroupV5();

    private static HttpRequestDef<CreateGroupV5Request, CreateGroupV5Response> genForCreateGroupV5() {
        // basic
        HttpRequestDef.Builder<CreateGroupV5Request, CreateGroupV5Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateGroupV5Request.class, CreateGroupV5Response.class)
                .withName("CreateGroupV5")
                .withUri("/v5/groups")
                .withContentType("application/json");

        // requests
        builder.<CreateGroupReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateGroupReqBody.class),
            f -> f.withMarshaller(CreateGroupV5Request::getBody, CreateGroupV5Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteGroupV5Request, DeleteGroupV5Response> deleteGroupV5 =
        genForDeleteGroupV5();

    private static HttpRequestDef<DeleteGroupV5Request, DeleteGroupV5Response> genForDeleteGroupV5() {
        // basic
        HttpRequestDef.Builder<DeleteGroupV5Request, DeleteGroupV5Response> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteGroupV5Request.class, DeleteGroupV5Response.class)
                .withName("DeleteGroupV5")
                .withUri("/v5/groups/{group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteGroupV5Request::getGroupId, DeleteGroupV5Request::setGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListGroupsV5Request, ListGroupsV5Response> listGroupsV5 = genForListGroupsV5();

    private static HttpRequestDef<ListGroupsV5Request, ListGroupsV5Response> genForListGroupsV5() {
        // basic
        HttpRequestDef.Builder<ListGroupsV5Request, ListGroupsV5Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListGroupsV5Request.class, ListGroupsV5Response.class)
                .withName("ListGroupsV5")
                .withUri("/v5/groups")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListGroupsV5Request::getLimit, ListGroupsV5Request::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGroupsV5Request::getMarker, ListGroupsV5Request::setMarker));
        builder.<String>withRequestField("user_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListGroupsV5Request::getUserId, ListGroupsV5Request::setUserId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RemoveUserFromGroupV5Request, RemoveUserFromGroupV5Response> removeUserFromGroupV5 =
        genForRemoveUserFromGroupV5();

    private static HttpRequestDef<RemoveUserFromGroupV5Request, RemoveUserFromGroupV5Response> genForRemoveUserFromGroupV5() {
        // basic
        HttpRequestDef.Builder<RemoveUserFromGroupV5Request, RemoveUserFromGroupV5Response> builder = HttpRequestDef
            .builder(HttpMethod.POST, RemoveUserFromGroupV5Request.class, RemoveUserFromGroupV5Response.class)
            .withName("RemoveUserFromGroupV5")
            .withUri("/v5/groups/{group_id}/remove-user")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RemoveUserFromGroupV5Request::getGroupId, RemoveUserFromGroupV5Request::setGroupId));
        builder.<RemoveUserFromGroupReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RemoveUserFromGroupReqBody.class),
            f -> f.withMarshaller(RemoveUserFromGroupV5Request::getBody, RemoveUserFromGroupV5Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowGroupV5Request, ShowGroupV5Response> showGroupV5 = genForShowGroupV5();

    private static HttpRequestDef<ShowGroupV5Request, ShowGroupV5Response> genForShowGroupV5() {
        // basic
        HttpRequestDef.Builder<ShowGroupV5Request, ShowGroupV5Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowGroupV5Request.class, ShowGroupV5Response.class)
                .withName("ShowGroupV5")
                .withUri("/v5/groups/{group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowGroupV5Request::getGroupId, ShowGroupV5Request::setGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateGroupV5Request, UpdateGroupV5Response> updateGroupV5 =
        genForUpdateGroupV5();

    private static HttpRequestDef<UpdateGroupV5Request, UpdateGroupV5Response> genForUpdateGroupV5() {
        // basic
        HttpRequestDef.Builder<UpdateGroupV5Request, UpdateGroupV5Response> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateGroupV5Request.class, UpdateGroupV5Response.class)
                .withName("UpdateGroupV5")
                .withUri("/v5/groups/{group_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateGroupV5Request::getGroupId, UpdateGroupV5Request::setGroupId));
        builder.<UpdateGroupReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateGroupReqBody.class),
            f -> f.withMarshaller(UpdateGroupV5Request::getBody, UpdateGroupV5Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateVirtualMfaDeviceV5Request, CreateVirtualMfaDeviceV5Response> createVirtualMfaDeviceV5 =
        genForCreateVirtualMfaDeviceV5();

    private static HttpRequestDef<CreateVirtualMfaDeviceV5Request, CreateVirtualMfaDeviceV5Response> genForCreateVirtualMfaDeviceV5() {
        // basic
        HttpRequestDef.Builder<CreateVirtualMfaDeviceV5Request, CreateVirtualMfaDeviceV5Response> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, CreateVirtualMfaDeviceV5Request.class, CreateVirtualMfaDeviceV5Response.class)
                .withName("CreateVirtualMfaDeviceV5")
                .withUri("/v5/virtual-mfa-devices")
                .withContentType("application/json");

        // requests
        builder.<CreateVirtualMfaDeviceReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateVirtualMfaDeviceReqBody.class),
            f -> f.withMarshaller(CreateVirtualMfaDeviceV5Request::getBody, CreateVirtualMfaDeviceV5Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteVirtualMfaDeviceV5Request, DeleteVirtualMfaDeviceV5Response> deleteVirtualMfaDeviceV5 =
        genForDeleteVirtualMfaDeviceV5();

    private static HttpRequestDef<DeleteVirtualMfaDeviceV5Request, DeleteVirtualMfaDeviceV5Response> genForDeleteVirtualMfaDeviceV5() {
        // basic
        HttpRequestDef.Builder<DeleteVirtualMfaDeviceV5Request, DeleteVirtualMfaDeviceV5Response> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteVirtualMfaDeviceV5Request.class,
                    DeleteVirtualMfaDeviceV5Response.class)
                .withName("DeleteVirtualMfaDeviceV5")
                .withUri("/v5/virtual-mfa-devices")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVirtualMfaDeviceV5Request::getUserId,
                DeleteVirtualMfaDeviceV5Request::setUserId));
        builder.<String>withRequestField("serial_number",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteVirtualMfaDeviceV5Request::getSerialNumber,
                DeleteVirtualMfaDeviceV5Request::setSerialNumber));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisableMfaDeviceV5Request, DisableMfaDeviceV5Response> disableMfaDeviceV5 =
        genForDisableMfaDeviceV5();

    private static HttpRequestDef<DisableMfaDeviceV5Request, DisableMfaDeviceV5Response> genForDisableMfaDeviceV5() {
        // basic
        HttpRequestDef.Builder<DisableMfaDeviceV5Request, DisableMfaDeviceV5Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, DisableMfaDeviceV5Request.class, DisableMfaDeviceV5Response.class)
                .withName("DisableMfaDeviceV5")
                .withUri("/v5/mfa-devices/disable")
                .withContentType("application/json");

        // requests
        builder.<DisableMfaDeviceReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DisableMfaDeviceReqBody.class),
            f -> f.withMarshaller(DisableMfaDeviceV5Request::getBody, DisableMfaDeviceV5Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EnableMfaDeviceV5Request, EnableMfaDeviceV5Response> enableMfaDeviceV5 =
        genForEnableMfaDeviceV5();

    private static HttpRequestDef<EnableMfaDeviceV5Request, EnableMfaDeviceV5Response> genForEnableMfaDeviceV5() {
        // basic
        HttpRequestDef.Builder<EnableMfaDeviceV5Request, EnableMfaDeviceV5Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, EnableMfaDeviceV5Request.class, EnableMfaDeviceV5Response.class)
                .withName("EnableMfaDeviceV5")
                .withUri("/v5/mfa-devices/enable")
                .withContentType("application/json");

        // requests
        builder.<EnableMfaDeviceReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EnableMfaDeviceReqBody.class),
            f -> f.withMarshaller(EnableMfaDeviceV5Request::getBody, EnableMfaDeviceV5Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListMfaDevicesV5Request, ListMfaDevicesV5Response> listMfaDevicesV5 =
        genForListMfaDevicesV5();

    private static HttpRequestDef<ListMfaDevicesV5Request, ListMfaDevicesV5Response> genForListMfaDevicesV5() {
        // basic
        HttpRequestDef.Builder<ListMfaDevicesV5Request, ListMfaDevicesV5Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListMfaDevicesV5Request.class, ListMfaDevicesV5Response.class)
                .withName("ListMfaDevicesV5")
                .withUri("/v5/mfa-devices")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMfaDevicesV5Request::getUserId, ListMfaDevicesV5Request::setUserId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListMfaDevicesV5Request::getLimit, ListMfaDevicesV5Request::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListMfaDevicesV5Request::getMarker, ListMfaDevicesV5Request::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePolicyV5Request, CreatePolicyV5Response> createPolicyV5 =
        genForCreatePolicyV5();

    private static HttpRequestDef<CreatePolicyV5Request, CreatePolicyV5Response> genForCreatePolicyV5() {
        // basic
        HttpRequestDef.Builder<CreatePolicyV5Request, CreatePolicyV5Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePolicyV5Request.class, CreatePolicyV5Response.class)
                .withName("CreatePolicyV5")
                .withUri("/v5/policies")
                .withContentType("application/json");

        // requests
        builder.<CreatePolicyReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePolicyReqBody.class),
            f -> f.withMarshaller(CreatePolicyV5Request::getBody, CreatePolicyV5Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePolicyVersionV5Request, CreatePolicyVersionV5Response> createPolicyVersionV5 =
        genForCreatePolicyVersionV5();

    private static HttpRequestDef<CreatePolicyVersionV5Request, CreatePolicyVersionV5Response> genForCreatePolicyVersionV5() {
        // basic
        HttpRequestDef.Builder<CreatePolicyVersionV5Request, CreatePolicyVersionV5Response> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreatePolicyVersionV5Request.class, CreatePolicyVersionV5Response.class)
            .withName("CreatePolicyVersionV5")
            .withUri("/v5/policies/{policy_id}/versions")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePolicyVersionV5Request::getPolicyId,
                CreatePolicyVersionV5Request::setPolicyId));
        builder.<CreatePolicyVersionReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePolicyVersionReqBody.class),
            f -> f.withMarshaller(CreatePolicyVersionV5Request::getBody, CreatePolicyVersionV5Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePolicyV5Request, DeletePolicyV5Response> deletePolicyV5 =
        genForDeletePolicyV5();

    private static HttpRequestDef<DeletePolicyV5Request, DeletePolicyV5Response> genForDeletePolicyV5() {
        // basic
        HttpRequestDef.Builder<DeletePolicyV5Request, DeletePolicyV5Response> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeletePolicyV5Request.class, DeletePolicyV5Response.class)
                .withName("DeletePolicyV5")
                .withUri("/v5/policies/{policy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePolicyV5Request::getPolicyId, DeletePolicyV5Request::setPolicyId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePolicyVersionV5Request, DeletePolicyVersionV5Response> deletePolicyVersionV5 =
        genForDeletePolicyVersionV5();

    private static HttpRequestDef<DeletePolicyVersionV5Request, DeletePolicyVersionV5Response> genForDeletePolicyVersionV5() {
        // basic
        HttpRequestDef.Builder<DeletePolicyVersionV5Request, DeletePolicyVersionV5Response> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeletePolicyVersionV5Request.class, DeletePolicyVersionV5Response.class)
            .withName("DeletePolicyVersionV5")
            .withUri("/v5/policies/{policy_id}/versions/{version_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePolicyVersionV5Request::getPolicyId,
                DeletePolicyVersionV5Request::setPolicyId));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePolicyVersionV5Request::getVersionId,
                DeletePolicyVersionV5Request::setVersionId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetPolicyV5Request, GetPolicyV5Response> getPolicyV5 = genForGetPolicyV5();

    private static HttpRequestDef<GetPolicyV5Request, GetPolicyV5Response> genForGetPolicyV5() {
        // basic
        HttpRequestDef.Builder<GetPolicyV5Request, GetPolicyV5Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, GetPolicyV5Request.class, GetPolicyV5Response.class)
                .withName("GetPolicyV5")
                .withUri("/v5/policies/{policy_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetPolicyV5Request::getPolicyId, GetPolicyV5Request::setPolicyId));
        builder.<GetPolicyV5Request.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(GetPolicyV5Request.XLanguageEnum.class),
            f -> f.withMarshaller(GetPolicyV5Request::getXLanguage, GetPolicyV5Request::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetPolicyVersionV5Request, GetPolicyVersionV5Response> getPolicyVersionV5 =
        genForGetPolicyVersionV5();

    private static HttpRequestDef<GetPolicyVersionV5Request, GetPolicyVersionV5Response> genForGetPolicyVersionV5() {
        // basic
        HttpRequestDef.Builder<GetPolicyVersionV5Request, GetPolicyVersionV5Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, GetPolicyVersionV5Request.class, GetPolicyVersionV5Response.class)
                .withName("GetPolicyVersionV5")
                .withUri("/v5/policies/{policy_id}/versions/{version_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetPolicyVersionV5Request::getPolicyId, GetPolicyVersionV5Request::setPolicyId));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetPolicyVersionV5Request::getVersionId, GetPolicyVersionV5Request::setVersionId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPoliciesV5Request, ListPoliciesV5Response> listPoliciesV5 =
        genForListPoliciesV5();

    private static HttpRequestDef<ListPoliciesV5Request, ListPoliciesV5Response> genForListPoliciesV5() {
        // basic
        HttpRequestDef.Builder<ListPoliciesV5Request, ListPoliciesV5Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPoliciesV5Request.class, ListPoliciesV5Response.class)
                .withName("ListPoliciesV5")
                .withUri("/v5/policies")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPoliciesV5Request::getLimit, ListPoliciesV5Request::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPoliciesV5Request::getMarker, ListPoliciesV5Request::setMarker));
        builder.<ListPoliciesV5Request.PolicyTypeEnum>withRequestField("policy_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListPoliciesV5Request.PolicyTypeEnum.class),
            f -> f.withMarshaller(ListPoliciesV5Request::getPolicyType, ListPoliciesV5Request::setPolicyType));
        builder.<String>withRequestField("path_prefix",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPoliciesV5Request::getPathPrefix, ListPoliciesV5Request::setPathPrefix));
        builder.<Boolean>withRequestField("only_attached",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListPoliciesV5Request::getOnlyAttached, ListPoliciesV5Request::setOnlyAttached));
        builder.<ListPoliciesV5Request.XLanguageEnum>withRequestField("X-Language",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListPoliciesV5Request.XLanguageEnum.class),
            f -> f.withMarshaller(ListPoliciesV5Request::getXLanguage, ListPoliciesV5Request::setXLanguage));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPolicyVersionsV5Request, ListPolicyVersionsV5Response> listPolicyVersionsV5 =
        genForListPolicyVersionsV5();

    private static HttpRequestDef<ListPolicyVersionsV5Request, ListPolicyVersionsV5Response> genForListPolicyVersionsV5() {
        // basic
        HttpRequestDef.Builder<ListPolicyVersionsV5Request, ListPolicyVersionsV5Response> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListPolicyVersionsV5Request.class, ListPolicyVersionsV5Response.class)
            .withName("ListPolicyVersionsV5")
            .withUri("/v5/policies/{policy_id}/versions")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPolicyVersionsV5Request::getPolicyId, ListPolicyVersionsV5Request::setPolicyId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPolicyVersionsV5Request::getLimit, ListPolicyVersionsV5Request::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPolicyVersionsV5Request::getMarker, ListPolicyVersionsV5Request::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetDefaultPolicyVersionV5Request, SetDefaultPolicyVersionV5Response> setDefaultPolicyVersionV5 =
        genForSetDefaultPolicyVersionV5();

    private static HttpRequestDef<SetDefaultPolicyVersionV5Request, SetDefaultPolicyVersionV5Response> genForSetDefaultPolicyVersionV5() {
        // basic
        HttpRequestDef.Builder<SetDefaultPolicyVersionV5Request, SetDefaultPolicyVersionV5Response> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    SetDefaultPolicyVersionV5Request.class,
                    SetDefaultPolicyVersionV5Response.class)
                .withName("SetDefaultPolicyVersionV5")
                .withUri("/v5/policies/{policy_id}/versions/{version_id}/set-default")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetDefaultPolicyVersionV5Request::getPolicyId,
                SetDefaultPolicyVersionV5Request::setPolicyId));
        builder.<String>withRequestField("version_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SetDefaultPolicyVersionV5Request::getVersionId,
                SetDefaultPolicyVersionV5Request::setVersionId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AttachAgencyPolicyV5Request, AttachAgencyPolicyV5Response> attachAgencyPolicyV5 =
        genForAttachAgencyPolicyV5();

    private static HttpRequestDef<AttachAgencyPolicyV5Request, AttachAgencyPolicyV5Response> genForAttachAgencyPolicyV5() {
        // basic
        HttpRequestDef.Builder<AttachAgencyPolicyV5Request, AttachAgencyPolicyV5Response> builder = HttpRequestDef
            .builder(HttpMethod.POST, AttachAgencyPolicyV5Request.class, AttachAgencyPolicyV5Response.class)
            .withName("AttachAgencyPolicyV5")
            .withUri("/v5/policies/{policy_id}/attach-agency")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AttachAgencyPolicyV5Request::getPolicyId, AttachAgencyPolicyV5Request::setPolicyId));
        builder.<AttachAgencyPolicyReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AttachAgencyPolicyReqBody.class),
            f -> f.withMarshaller(AttachAgencyPolicyV5Request::getBody, AttachAgencyPolicyV5Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AttachGroupPolicyV5Request, AttachGroupPolicyV5Response> attachGroupPolicyV5 =
        genForAttachGroupPolicyV5();

    private static HttpRequestDef<AttachGroupPolicyV5Request, AttachGroupPolicyV5Response> genForAttachGroupPolicyV5() {
        // basic
        HttpRequestDef.Builder<AttachGroupPolicyV5Request, AttachGroupPolicyV5Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, AttachGroupPolicyV5Request.class, AttachGroupPolicyV5Response.class)
                .withName("AttachGroupPolicyV5")
                .withUri("/v5/policies/{policy_id}/attach-group")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AttachGroupPolicyV5Request::getPolicyId, AttachGroupPolicyV5Request::setPolicyId));
        builder.<AttachGroupPolicyReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AttachGroupPolicyReqBody.class),
            f -> f.withMarshaller(AttachGroupPolicyV5Request::getBody, AttachGroupPolicyV5Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AttachUserPolicyV5Request, AttachUserPolicyV5Response> attachUserPolicyV5 =
        genForAttachUserPolicyV5();

    private static HttpRequestDef<AttachUserPolicyV5Request, AttachUserPolicyV5Response> genForAttachUserPolicyV5() {
        // basic
        HttpRequestDef.Builder<AttachUserPolicyV5Request, AttachUserPolicyV5Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, AttachUserPolicyV5Request.class, AttachUserPolicyV5Response.class)
                .withName("AttachUserPolicyV5")
                .withUri("/v5/policies/{policy_id}/attach-user")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AttachUserPolicyV5Request::getPolicyId, AttachUserPolicyV5Request::setPolicyId));
        builder.<AttachUserPolicyReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AttachUserPolicyReqBody.class),
            f -> f.withMarshaller(AttachUserPolicyV5Request::getBody, AttachUserPolicyV5Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DetachAgencyPolicyV5Request, DetachAgencyPolicyV5Response> detachAgencyPolicyV5 =
        genForDetachAgencyPolicyV5();

    private static HttpRequestDef<DetachAgencyPolicyV5Request, DetachAgencyPolicyV5Response> genForDetachAgencyPolicyV5() {
        // basic
        HttpRequestDef.Builder<DetachAgencyPolicyV5Request, DetachAgencyPolicyV5Response> builder = HttpRequestDef
            .builder(HttpMethod.POST, DetachAgencyPolicyV5Request.class, DetachAgencyPolicyV5Response.class)
            .withName("DetachAgencyPolicyV5")
            .withUri("/v5/policies/{policy_id}/detach-agency")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DetachAgencyPolicyV5Request::getPolicyId, DetachAgencyPolicyV5Request::setPolicyId));
        builder.<DetachAgencyPolicyReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DetachAgencyPolicyReqBody.class),
            f -> f.withMarshaller(DetachAgencyPolicyV5Request::getBody, DetachAgencyPolicyV5Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DetachGroupPolicyV5Request, DetachGroupPolicyV5Response> detachGroupPolicyV5 =
        genForDetachGroupPolicyV5();

    private static HttpRequestDef<DetachGroupPolicyV5Request, DetachGroupPolicyV5Response> genForDetachGroupPolicyV5() {
        // basic
        HttpRequestDef.Builder<DetachGroupPolicyV5Request, DetachGroupPolicyV5Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, DetachGroupPolicyV5Request.class, DetachGroupPolicyV5Response.class)
                .withName("DetachGroupPolicyV5")
                .withUri("/v5/policies/{policy_id}/detach-group")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DetachGroupPolicyV5Request::getPolicyId, DetachGroupPolicyV5Request::setPolicyId));
        builder.<DetachGroupPolicyReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DetachGroupPolicyReqBody.class),
            f -> f.withMarshaller(DetachGroupPolicyV5Request::getBody, DetachGroupPolicyV5Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DetachUserPolicyV5Request, DetachUserPolicyV5Response> detachUserPolicyV5 =
        genForDetachUserPolicyV5();

    private static HttpRequestDef<DetachUserPolicyV5Request, DetachUserPolicyV5Response> genForDetachUserPolicyV5() {
        // basic
        HttpRequestDef.Builder<DetachUserPolicyV5Request, DetachUserPolicyV5Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, DetachUserPolicyV5Request.class, DetachUserPolicyV5Response.class)
                .withName("DetachUserPolicyV5")
                .withUri("/v5/policies/{policy_id}/detach-user")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DetachUserPolicyV5Request::getPolicyId, DetachUserPolicyV5Request::setPolicyId));
        builder.<DetachUserPolicyReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DetachUserPolicyReqBody.class),
            f -> f.withMarshaller(DetachUserPolicyV5Request::getBody, DetachUserPolicyV5Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAttachedAgencyPoliciesV5Request, ListAttachedAgencyPoliciesV5Response> listAttachedAgencyPoliciesV5 =
        genForListAttachedAgencyPoliciesV5();

    private static HttpRequestDef<ListAttachedAgencyPoliciesV5Request, ListAttachedAgencyPoliciesV5Response> genForListAttachedAgencyPoliciesV5() {
        // basic
        HttpRequestDef.Builder<ListAttachedAgencyPoliciesV5Request, ListAttachedAgencyPoliciesV5Response> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListAttachedAgencyPoliciesV5Request.class,
                    ListAttachedAgencyPoliciesV5Response.class)
                .withName("ListAttachedAgencyPoliciesV5")
                .withUri("/v5/agencies/{agency_id}/attached-policies")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("agency_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAttachedAgencyPoliciesV5Request::getAgencyId,
                ListAttachedAgencyPoliciesV5Request::setAgencyId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAttachedAgencyPoliciesV5Request::getLimit,
                ListAttachedAgencyPoliciesV5Request::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAttachedAgencyPoliciesV5Request::getMarker,
                ListAttachedAgencyPoliciesV5Request::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAttachedGroupPoliciesV5Request, ListAttachedGroupPoliciesV5Response> listAttachedGroupPoliciesV5 =
        genForListAttachedGroupPoliciesV5();

    private static HttpRequestDef<ListAttachedGroupPoliciesV5Request, ListAttachedGroupPoliciesV5Response> genForListAttachedGroupPoliciesV5() {
        // basic
        HttpRequestDef.Builder<ListAttachedGroupPoliciesV5Request, ListAttachedGroupPoliciesV5Response> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListAttachedGroupPoliciesV5Request.class,
                    ListAttachedGroupPoliciesV5Response.class)
                .withName("ListAttachedGroupPoliciesV5")
                .withUri("/v5/groups/{group_id}/attached-policies")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("group_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAttachedGroupPoliciesV5Request::getGroupId,
                ListAttachedGroupPoliciesV5Request::setGroupId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAttachedGroupPoliciesV5Request::getLimit,
                ListAttachedGroupPoliciesV5Request::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAttachedGroupPoliciesV5Request::getMarker,
                ListAttachedGroupPoliciesV5Request::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAttachedUserPoliciesV5Request, ListAttachedUserPoliciesV5Response> listAttachedUserPoliciesV5 =
        genForListAttachedUserPoliciesV5();

    private static HttpRequestDef<ListAttachedUserPoliciesV5Request, ListAttachedUserPoliciesV5Response> genForListAttachedUserPoliciesV5() {
        // basic
        HttpRequestDef.Builder<ListAttachedUserPoliciesV5Request, ListAttachedUserPoliciesV5Response> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListAttachedUserPoliciesV5Request.class,
                    ListAttachedUserPoliciesV5Response.class)
                .withName("ListAttachedUserPoliciesV5")
                .withUri("/v5/users/{user_id}/attached-policies")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAttachedUserPoliciesV5Request::getUserId,
                ListAttachedUserPoliciesV5Request::setUserId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAttachedUserPoliciesV5Request::getLimit,
                ListAttachedUserPoliciesV5Request::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAttachedUserPoliciesV5Request::getMarker,
                ListAttachedUserPoliciesV5Request::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEntitiesForPolicyV5Request, ListEntitiesForPolicyV5Response> listEntitiesForPolicyV5 =
        genForListEntitiesForPolicyV5();

    private static HttpRequestDef<ListEntitiesForPolicyV5Request, ListEntitiesForPolicyV5Response> genForListEntitiesForPolicyV5() {
        // basic
        HttpRequestDef.Builder<ListEntitiesForPolicyV5Request, ListEntitiesForPolicyV5Response> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListEntitiesForPolicyV5Request.class, ListEntitiesForPolicyV5Response.class)
            .withName("ListEntitiesForPolicyV5")
            .withUri("/v5/policies/{policy_id}/attached-entities")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("policy_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEntitiesForPolicyV5Request::getPolicyId,
                ListEntitiesForPolicyV5Request::setPolicyId));
        builder.<ListEntitiesForPolicyV5Request.EntityTypeEnum>withRequestField("entity_type",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListEntitiesForPolicyV5Request.EntityTypeEnum.class),
            f -> f.withMarshaller(ListEntitiesForPolicyV5Request::getEntityType,
                ListEntitiesForPolicyV5Request::setEntityType));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEntitiesForPolicyV5Request::getLimit, ListEntitiesForPolicyV5Request::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEntitiesForPolicyV5Request::getMarker,
                ListEntitiesForPolicyV5Request::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteResourceTagsV5Request, DeleteResourceTagsV5Response> deleteResourceTagsV5 =
        genForDeleteResourceTagsV5();

    private static HttpRequestDef<DeleteResourceTagsV5Request, DeleteResourceTagsV5Response> genForDeleteResourceTagsV5() {
        // basic
        HttpRequestDef.Builder<DeleteResourceTagsV5Request, DeleteResourceTagsV5Response> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteResourceTagsV5Request.class, DeleteResourceTagsV5Response.class)
            .withName("DeleteResourceTagsV5")
            .withUri("/v5/{resource_type}/{resource_id}/tags/delete")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteResourceTagsV5Request::getResourceId,
                DeleteResourceTagsV5Request::setResourceId));
        builder.<DeleteResourceTagsV5Request.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteResourceTagsV5Request.ResourceTypeEnum.class),
            f -> f.withMarshaller(DeleteResourceTagsV5Request::getResourceType,
                DeleteResourceTagsV5Request::setResourceType));
        builder.<List<String>>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(DeleteResourceTagsV5Request::getBody, DeleteResourceTagsV5Request::setBody)
                .withInnerContainerType(String.class));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListResourceTagsV5Request, ListResourceTagsV5Response> listResourceTagsV5 =
        genForListResourceTagsV5();

    private static HttpRequestDef<ListResourceTagsV5Request, ListResourceTagsV5Response> genForListResourceTagsV5() {
        // basic
        HttpRequestDef.Builder<ListResourceTagsV5Request, ListResourceTagsV5Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListResourceTagsV5Request.class, ListResourceTagsV5Response.class)
                .withName("ListResourceTagsV5")
                .withUri("/v5/{resource_type}/{resource_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListResourceTagsV5Request::getResourceId, ListResourceTagsV5Request::setResourceId));
        builder.<ListResourceTagsV5Request.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListResourceTagsV5Request.ResourceTypeEnum.class),
            f -> f.withMarshaller(ListResourceTagsV5Request::getResourceType,
                ListResourceTagsV5Request::setResourceType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<TagResourceV5Request, TagResourceV5Response> tagResourceV5 =
        genForTagResourceV5();

    private static HttpRequestDef<TagResourceV5Request, TagResourceV5Response> genForTagResourceV5() {
        // basic
        HttpRequestDef.Builder<TagResourceV5Request, TagResourceV5Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, TagResourceV5Request.class, TagResourceV5Response.class)
                .withName("TagResourceV5")
                .withUri("/v5/{resource_type}/{resource_id}/tags/create")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(TagResourceV5Request::getResourceId, TagResourceV5Request::setResourceId));
        builder.<TagResourceV5Request.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TagResourceV5Request.ResourceTypeEnum.class),
            f -> f.withMarshaller(TagResourceV5Request::getResourceType, TagResourceV5Request::setResourceType));
        builder.<Tags>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(Tags.class),
            f -> f.withMarshaller(TagResourceV5Request::getBody, TagResourceV5Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLoginPolicyV5Request, ShowLoginPolicyV5Response> showLoginPolicyV5 =
        genForShowLoginPolicyV5();

    private static HttpRequestDef<ShowLoginPolicyV5Request, ShowLoginPolicyV5Response> genForShowLoginPolicyV5() {
        // basic
        HttpRequestDef.Builder<ShowLoginPolicyV5Request, ShowLoginPolicyV5Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowLoginPolicyV5Request.class, ShowLoginPolicyV5Response.class)
                .withName("ShowLoginPolicyV5")
                .withUri("/v5/login-policy")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPasswordPolicyV5Request, ShowPasswordPolicyV5Response> showPasswordPolicyV5 =
        genForShowPasswordPolicyV5();

    private static HttpRequestDef<ShowPasswordPolicyV5Request, ShowPasswordPolicyV5Response> genForShowPasswordPolicyV5() {
        // basic
        HttpRequestDef.Builder<ShowPasswordPolicyV5Request, ShowPasswordPolicyV5Response> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowPasswordPolicyV5Request.class, ShowPasswordPolicyV5Response.class)
            .withName("ShowPasswordPolicyV5")
            .withUri("/v5/password-policy")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTokenPolicyV5Request, ShowTokenPolicyV5Response> showTokenPolicyV5 =
        genForShowTokenPolicyV5();

    private static HttpRequestDef<ShowTokenPolicyV5Request, ShowTokenPolicyV5Response> genForShowTokenPolicyV5() {
        // basic
        HttpRequestDef.Builder<ShowTokenPolicyV5Request, ShowTokenPolicyV5Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowTokenPolicyV5Request.class, ShowTokenPolicyV5Response.class)
                .withName("ShowTokenPolicyV5")
                .withUri("/v5/token-policy")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateLoginPolicyV5Request, UpdateLoginPolicyV5Response> updateLoginPolicyV5 =
        genForUpdateLoginPolicyV5();

    private static HttpRequestDef<UpdateLoginPolicyV5Request, UpdateLoginPolicyV5Response> genForUpdateLoginPolicyV5() {
        // basic
        HttpRequestDef.Builder<UpdateLoginPolicyV5Request, UpdateLoginPolicyV5Response> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateLoginPolicyV5Request.class, UpdateLoginPolicyV5Response.class)
                .withName("UpdateLoginPolicyV5")
                .withUri("/v5/login-policy")
                .withContentType("application/json");

        // requests
        builder.<UpdateLoginPolicyReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateLoginPolicyReqBody.class),
            f -> f.withMarshaller(UpdateLoginPolicyV5Request::getBody, UpdateLoginPolicyV5Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePasswordPolicyV5Request, UpdatePasswordPolicyV5Response> updatePasswordPolicyV5 =
        genForUpdatePasswordPolicyV5();

    private static HttpRequestDef<UpdatePasswordPolicyV5Request, UpdatePasswordPolicyV5Response> genForUpdatePasswordPolicyV5() {
        // basic
        HttpRequestDef.Builder<UpdatePasswordPolicyV5Request, UpdatePasswordPolicyV5Response> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdatePasswordPolicyV5Request.class, UpdatePasswordPolicyV5Response.class)
            .withName("UpdatePasswordPolicyV5")
            .withUri("/v5/password-policy")
            .withContentType("application/json");

        // requests
        builder.<UpdatePasswordPolicyReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePasswordPolicyReqBody.class),
            f -> f.withMarshaller(UpdatePasswordPolicyV5Request::getBody, UpdatePasswordPolicyV5Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTokenPolicyV5Request, UpdateTokenPolicyV5Response> updateTokenPolicyV5 =
        genForUpdateTokenPolicyV5();

    private static HttpRequestDef<UpdateTokenPolicyV5Request, UpdateTokenPolicyV5Response> genForUpdateTokenPolicyV5() {
        // basic
        HttpRequestDef.Builder<UpdateTokenPolicyV5Request, UpdateTokenPolicyV5Response> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateTokenPolicyV5Request.class, UpdateTokenPolicyV5Response.class)
                .withName("UpdateTokenPolicyV5")
                .withUri("/v5/token-policy")
                .withContentType("application/json");

        // requests
        builder.<UpdateTokenPolicyReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateTokenPolicyReqBody.class),
            f -> f.withMarshaller(UpdateTokenPolicyV5Request::getBody, UpdateTokenPolicyV5Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateUserV5Request, CreateUserV5Response> createUserV5 = genForCreateUserV5();

    private static HttpRequestDef<CreateUserV5Request, CreateUserV5Response> genForCreateUserV5() {
        // basic
        HttpRequestDef.Builder<CreateUserV5Request, CreateUserV5Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateUserV5Request.class, CreateUserV5Response.class)
                .withName("CreateUserV5")
                .withUri("/v5/users")
                .withContentType("application/json");

        // requests
        builder.<CreateUserReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateUserReqBody.class),
            f -> f.withMarshaller(CreateUserV5Request::getBody, CreateUserV5Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteUserV5Request, DeleteUserV5Response> deleteUserV5 = genForDeleteUserV5();

    private static HttpRequestDef<DeleteUserV5Request, DeleteUserV5Response> genForDeleteUserV5() {
        // basic
        HttpRequestDef.Builder<DeleteUserV5Request, DeleteUserV5Response> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteUserV5Request.class, DeleteUserV5Response.class)
                .withName("DeleteUserV5")
                .withUri("/v5/users/{user_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteUserV5Request::getUserId, DeleteUserV5Request::setUserId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListUsersV5Request, ListUsersV5Response> listUsersV5 = genForListUsersV5();

    private static HttpRequestDef<ListUsersV5Request, ListUsersV5Response> genForListUsersV5() {
        // basic
        HttpRequestDef.Builder<ListUsersV5Request, ListUsersV5Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListUsersV5Request.class, ListUsersV5Response.class)
                .withName("ListUsersV5")
                .withUri("/v5/users")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListUsersV5Request::getLimit, ListUsersV5Request::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersV5Request::getMarker, ListUsersV5Request::setMarker));
        builder.<String>withRequestField("group_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListUsersV5Request::getGroupId, ListUsersV5Request::setGroupId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowUserLastLoginV5Request, ShowUserLastLoginV5Response> showUserLastLoginV5 =
        genForShowUserLastLoginV5();

    private static HttpRequestDef<ShowUserLastLoginV5Request, ShowUserLastLoginV5Response> genForShowUserLastLoginV5() {
        // basic
        HttpRequestDef.Builder<ShowUserLastLoginV5Request, ShowUserLastLoginV5Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowUserLastLoginV5Request.class, ShowUserLastLoginV5Response.class)
                .withName("ShowUserLastLoginV5")
                .withUri("/v5/users/{user_id}/last-login")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUserLastLoginV5Request::getUserId, ShowUserLastLoginV5Request::setUserId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowUserV5Request, ShowUserV5Response> showUserV5 = genForShowUserV5();

    private static HttpRequestDef<ShowUserV5Request, ShowUserV5Response> genForShowUserV5() {
        // basic
        HttpRequestDef.Builder<ShowUserV5Request, ShowUserV5Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowUserV5Request.class, ShowUserV5Response.class)
                .withName("ShowUserV5")
                .withUri("/v5/users/{user_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowUserV5Request::getUserId, ShowUserV5Request::setUserId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateUserV5Request, UpdateUserV5Response> updateUserV5 = genForUpdateUserV5();

    private static HttpRequestDef<UpdateUserV5Request, UpdateUserV5Response> genForUpdateUserV5() {
        // basic
        HttpRequestDef.Builder<UpdateUserV5Request, UpdateUserV5Response> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateUserV5Request.class, UpdateUserV5Response.class)
                .withName("UpdateUserV5")
                .withUri("/v5/users/{user_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateUserV5Request::getUserId, UpdateUserV5Request::setUserId));
        builder.<UpdateUserReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateUserReqBody.class),
            f -> f.withMarshaller(UpdateUserV5Request::getBody, UpdateUserV5Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangePasswordV5Request, ChangePasswordV5Response> changePasswordV5 =
        genForChangePasswordV5();

    private static HttpRequestDef<ChangePasswordV5Request, ChangePasswordV5Response> genForChangePasswordV5() {
        // basic
        HttpRequestDef.Builder<ChangePasswordV5Request, ChangePasswordV5Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, ChangePasswordV5Request.class, ChangePasswordV5Response.class)
                .withName("ChangePasswordV5")
                .withUri("/v5/caller-password")
                .withContentType("application/json");

        // requests
        builder.<ChangePasswordReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ChangePasswordReqBody.class),
            f -> f.withMarshaller(ChangePasswordV5Request::getBody, ChangePasswordV5Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAccessKeyV5Request, CreateAccessKeyV5Response> createAccessKeyV5 =
        genForCreateAccessKeyV5();

    private static HttpRequestDef<CreateAccessKeyV5Request, CreateAccessKeyV5Response> genForCreateAccessKeyV5() {
        // basic
        HttpRequestDef.Builder<CreateAccessKeyV5Request, CreateAccessKeyV5Response> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAccessKeyV5Request.class, CreateAccessKeyV5Response.class)
                .withName("CreateAccessKeyV5")
                .withUri("/v5/users/{user_id}/access-keys")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAccessKeyV5Request::getUserId, CreateAccessKeyV5Request::setUserId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateLoginProfileV5Request, CreateLoginProfileV5Response> createLoginProfileV5 =
        genForCreateLoginProfileV5();

    private static HttpRequestDef<CreateLoginProfileV5Request, CreateLoginProfileV5Response> genForCreateLoginProfileV5() {
        // basic
        HttpRequestDef.Builder<CreateLoginProfileV5Request, CreateLoginProfileV5Response> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateLoginProfileV5Request.class, CreateLoginProfileV5Response.class)
            .withName("CreateLoginProfileV5")
            .withUri("/v5/users/{user_id}/login-profile")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateLoginProfileV5Request::getUserId, CreateLoginProfileV5Request::setUserId));
        builder.<CreateLoginProfileReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateLoginProfileReqBody.class),
            f -> f.withMarshaller(CreateLoginProfileV5Request::getBody, CreateLoginProfileV5Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAccessKeyV5Request, DeleteAccessKeyV5Response> deleteAccessKeyV5 =
        genForDeleteAccessKeyV5();

    private static HttpRequestDef<DeleteAccessKeyV5Request, DeleteAccessKeyV5Response> genForDeleteAccessKeyV5() {
        // basic
        HttpRequestDef.Builder<DeleteAccessKeyV5Request, DeleteAccessKeyV5Response> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAccessKeyV5Request.class, DeleteAccessKeyV5Response.class)
                .withName("DeleteAccessKeyV5")
                .withUri("/v5/users/{user_id}/access-keys/{access_key_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAccessKeyV5Request::getUserId, DeleteAccessKeyV5Request::setUserId));
        builder.<String>withRequestField("access_key_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAccessKeyV5Request::getAccessKeyId, DeleteAccessKeyV5Request::setAccessKeyId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteLoginProfileV5Request, DeleteLoginProfileV5Response> deleteLoginProfileV5 =
        genForDeleteLoginProfileV5();

    private static HttpRequestDef<DeleteLoginProfileV5Request, DeleteLoginProfileV5Response> genForDeleteLoginProfileV5() {
        // basic
        HttpRequestDef.Builder<DeleteLoginProfileV5Request, DeleteLoginProfileV5Response> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteLoginProfileV5Request.class, DeleteLoginProfileV5Response.class)
            .withName("DeleteLoginProfileV5")
            .withUri("/v5/users/{user_id}/login-profile")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteLoginProfileV5Request::getUserId, DeleteLoginProfileV5Request::setUserId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAccessKeysV5Request, ListAccessKeysV5Response> listAccessKeysV5 =
        genForListAccessKeysV5();

    private static HttpRequestDef<ListAccessKeysV5Request, ListAccessKeysV5Response> genForListAccessKeysV5() {
        // basic
        HttpRequestDef.Builder<ListAccessKeysV5Request, ListAccessKeysV5Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAccessKeysV5Request.class, ListAccessKeysV5Response.class)
                .withName("ListAccessKeysV5")
                .withUri("/v5/users/{user_id}/access-keys")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccessKeysV5Request::getUserId, ListAccessKeysV5Request::setUserId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAccessKeysV5Request::getLimit, ListAccessKeysV5Request::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccessKeysV5Request::getMarker, ListAccessKeysV5Request::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAccessKeyLastUsedV5Request, ShowAccessKeyLastUsedV5Response> showAccessKeyLastUsedV5 =
        genForShowAccessKeyLastUsedV5();

    private static HttpRequestDef<ShowAccessKeyLastUsedV5Request, ShowAccessKeyLastUsedV5Response> genForShowAccessKeyLastUsedV5() {
        // basic
        HttpRequestDef.Builder<ShowAccessKeyLastUsedV5Request, ShowAccessKeyLastUsedV5Response> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowAccessKeyLastUsedV5Request.class, ShowAccessKeyLastUsedV5Response.class)
            .withName("ShowAccessKeyLastUsedV5")
            .withUri("/v5/users/{user_id}/access-keys/{access_key_id}/last-used")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAccessKeyLastUsedV5Request::getUserId,
                ShowAccessKeyLastUsedV5Request::setUserId));
        builder.<String>withRequestField("access_key_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowAccessKeyLastUsedV5Request::getAccessKeyId,
                ShowAccessKeyLastUsedV5Request::setAccessKeyId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLoginProfileV5Request, ShowLoginProfileV5Response> showLoginProfileV5 =
        genForShowLoginProfileV5();

    private static HttpRequestDef<ShowLoginProfileV5Request, ShowLoginProfileV5Response> genForShowLoginProfileV5() {
        // basic
        HttpRequestDef.Builder<ShowLoginProfileV5Request, ShowLoginProfileV5Response> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowLoginProfileV5Request.class, ShowLoginProfileV5Response.class)
                .withName("ShowLoginProfileV5")
                .withUri("/v5/users/{user_id}/login-profile")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowLoginProfileV5Request::getUserId, ShowLoginProfileV5Request::setUserId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateAccessKeyV5Request, UpdateAccessKeyV5Response> updateAccessKeyV5 =
        genForUpdateAccessKeyV5();

    private static HttpRequestDef<UpdateAccessKeyV5Request, UpdateAccessKeyV5Response> genForUpdateAccessKeyV5() {
        // basic
        HttpRequestDef.Builder<UpdateAccessKeyV5Request, UpdateAccessKeyV5Response> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateAccessKeyV5Request.class, UpdateAccessKeyV5Response.class)
                .withName("UpdateAccessKeyV5")
                .withUri("/v5/users/{user_id}/access-keys/{access_key_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAccessKeyV5Request::getUserId, UpdateAccessKeyV5Request::setUserId));
        builder.<String>withRequestField("access_key_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateAccessKeyV5Request::getAccessKeyId, UpdateAccessKeyV5Request::setAccessKeyId));
        builder.<UpdateAccessKeyReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateAccessKeyReqBody.class),
            f -> f.withMarshaller(UpdateAccessKeyV5Request::getBody, UpdateAccessKeyV5Request::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateLoginProfileV5Request, UpdateLoginProfileV5Response> updateLoginProfileV5 =
        genForUpdateLoginProfileV5();

    private static HttpRequestDef<UpdateLoginProfileV5Request, UpdateLoginProfileV5Response> genForUpdateLoginProfileV5() {
        // basic
        HttpRequestDef.Builder<UpdateLoginProfileV5Request, UpdateLoginProfileV5Response> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateLoginProfileV5Request.class, UpdateLoginProfileV5Response.class)
            .withName("UpdateLoginProfileV5")
            .withUri("/v5/users/{user_id}/login-profile")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("user_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateLoginProfileV5Request::getUserId, UpdateLoginProfileV5Request::setUserId));
        builder.<UpdateLoginProfileReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateLoginProfileReqBody.class),
            f -> f.withMarshaller(UpdateLoginProfileV5Request::getBody, UpdateLoginProfileV5Request::setBody));

        // response

        return builder.build();
    }

}
