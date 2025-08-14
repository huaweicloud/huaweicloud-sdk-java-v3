package com.huaweicloud.sdk.identitycenter.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.identitycenter.v1.model.AttachManagedPolicyToPermissionSetReqBody;
import com.huaweicloud.sdk.identitycenter.v1.model.AttachManagedPolicyToPermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.AttachManagedPolicyToPermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.AttachManagedRoleToPermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.AttachManagedRoleToPermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.CreateAccountAssignmentReqBody;
import com.huaweicloud.sdk.identitycenter.v1.model.CreateAccountAssignmentRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.CreateAccountAssignmentResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.CreateAliasReqBody;
import com.huaweicloud.sdk.identitycenter.v1.model.CreateAliasRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.CreateAliasResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.CreateApplicationAssignmentReqBody;
import com.huaweicloud.sdk.identitycenter.v1.model.CreateApplicationAssignmentRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.CreateApplicationAssignmentResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.CreateApplicationInstanceCertificateRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.CreateApplicationInstanceCertificateResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.CreateApplicationInstanceReqBody;
import com.huaweicloud.sdk.identitycenter.v1.model.CreateApplicationInstanceRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.CreateApplicationInstanceResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.CreateInstanceAccessControlAttributeConfigurationReqBody;
import com.huaweicloud.sdk.identitycenter.v1.model.CreateInstanceAccessControlAttributeConfigurationRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.CreateInstanceAccessControlAttributeConfigurationResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.CreatePermissionSetReqBody;
import com.huaweicloud.sdk.identitycenter.v1.model.CreatePermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.CreatePermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.CreateTagResourceRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.CreateTagResourceResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DeleteAccountAssignmentReqBody;
import com.huaweicloud.sdk.identitycenter.v1.model.DeleteAccountAssignmentRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DeleteAccountAssignmentResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DeleteApplicationAssignmentReqBody;
import com.huaweicloud.sdk.identitycenter.v1.model.DeleteApplicationAssignmentRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DeleteApplicationAssignmentResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DeleteApplicationInstanceCertificateRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DeleteApplicationInstanceCertificateResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DeleteApplicationInstanceRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DeleteApplicationInstanceResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DeleteCustomPolicyFromPermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DeleteCustomPolicyFromPermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DeleteCustomRoleFromPermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DeleteCustomRoleFromPermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DeleteIdentityCenterRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DeleteIdentityCenterResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DeleteInstanceAccessControlAttributeConfigurationRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DeleteInstanceAccessControlAttributeConfigurationResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DeletePermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DeletePermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DeleteProfileRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DeleteProfileResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DeleteTagResourceReqBody;
import com.huaweicloud.sdk.identitycenter.v1.model.DeleteTagResourceRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DeleteTagResourceResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DescribeAccountAssignmentCreationStatusRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DescribeAccountAssignmentCreationStatusResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DescribeAccountAssignmentDeletionStatusRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DescribeAccountAssignmentDeletionStatusResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DescribeApplicationProviderRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DescribeApplicationProviderResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DescribeApplicationRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DescribeApplicationResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DescribeInstanceAccessControlAttributeConfigurationRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DescribeInstanceAccessControlAttributeConfigurationResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DescribePermissionSetProvisioningStatusRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DescribePermissionSetProvisioningStatusResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DescribePermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DescribePermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DescribeRegisteredRegionsRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DescribeRegisteredRegionsResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DetachManagedPolicyFromPermissionSetReqBody;
import com.huaweicloud.sdk.identitycenter.v1.model.DetachManagedPolicyFromPermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DetachManagedPolicyFromPermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DetachManagedRoleFromPermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DetachManagedRoleFromPermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.DisassociateProfileReqBody;
import com.huaweicloud.sdk.identitycenter.v1.model.DisassociateProfileRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.DisassociateProfileResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.GetApplicationAssignmentConfigurationRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.GetApplicationAssignmentConfigurationResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.GetApplicationInstanceRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.GetApplicationInstanceResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.GetCustomPolicyForPermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.GetCustomPolicyForPermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.GetCustomRoleForPermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.GetCustomRoleForPermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.GetHaConfigurationRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.GetHaConfigurationResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.GetIdentityCenterServiceStatusRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.GetIdentityCenterServiceStatusResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.GetMfaDeviceManagementForIdentityStoreRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.GetMfaDeviceManagementForIdentityStoreResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.GetPermissionSetSummaryRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.GetPermissionSetSummaryResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.GetSsoConfigurationRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.GetSsoConfigurationResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ImportApplicationInstanceServiceProviderMetadataReqBody;
import com.huaweicloud.sdk.identitycenter.v1.model.ImportApplicationInstanceServiceProviderMetadataRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ImportApplicationInstanceServiceProviderMetadataResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListAccountAssignmentCreationStatusRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListAccountAssignmentCreationStatusResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListAccountAssignmentDeletionStatusRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListAccountAssignmentDeletionStatusResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListAccountAssignmentsForPrincipalRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListAccountAssignmentsForPrincipalResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListAccountAssignmentsRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListAccountAssignmentsResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListAccountsForProvisionedPermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListAccountsForProvisionedPermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListApplicationAssignmentsForPrincipalRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListApplicationAssignmentsForPrincipalResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListApplicationAssignmentsRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListApplicationAssignmentsResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListApplicationInstanceCertificatesRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListApplicationInstanceCertificatesResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListApplicationInstancesRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListApplicationInstancesResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListApplicationProvidersRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListApplicationProvidersResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListApplicationTemplatesRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListApplicationTemplatesResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListApplicationsRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListApplicationsResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListCatalogApplicationsRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListCatalogApplicationsResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListIdentityStoreAssociationRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListIdentityStoreAssociationResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListInstancesRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListInstancesResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListManagedPoliciesInPermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListManagedPoliciesInPermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListManagedRolesInPermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListManagedRolesInPermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListPermissionSetProvisioningStatusRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListPermissionSetProvisioningStatusResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListPermissionSetsProvisionedToAccountRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListPermissionSetsProvisionedToAccountResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListPermissionSetsRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListPermissionSetsResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListProfilesRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListProfilesResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ListTagResourcesRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ListTagResourcesResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ProvisionPermissionSetReqBody;
import com.huaweicloud.sdk.identitycenter.v1.model.ProvisionPermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.ProvisionPermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.PutCustomPolicyToPermissionSetReqBody;
import com.huaweicloud.sdk.identitycenter.v1.model.PutCustomPolicyToPermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.PutCustomPolicyToPermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.PutCustomRoleToPermissionSetReqBody;
import com.huaweicloud.sdk.identitycenter.v1.model.PutCustomRoleToPermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.PutCustomRoleToPermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.PutMfaDeviceManagementForDirectoryReqBody;
import com.huaweicloud.sdk.identitycenter.v1.model.PutMfaDeviceManagementForIdentityStoreRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.PutMfaDeviceManagementForIdentityStoreResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.RegisterRegionReqBody;
import com.huaweicloud.sdk.identitycenter.v1.model.RegisterRegionRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.RegisterRegionResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.ResourceAttachManagedPolicyToPermissionSetReqBody;
import com.huaweicloud.sdk.identitycenter.v1.model.ResourceDetachManagedPolicyFromPermissionSetReqBody;
import com.huaweicloud.sdk.identitycenter.v1.model.StartIdentityCenterRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.StartIdentityCenterResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.TagResourceReqBody;
import com.huaweicloud.sdk.identitycenter.v1.model.UpdateApplicationInstanceActiveCertificateRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.UpdateApplicationInstanceActiveCertificateResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.UpdateApplicationInstanceDisplayDataReqBody;
import com.huaweicloud.sdk.identitycenter.v1.model.UpdateApplicationInstanceDisplayDataRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.UpdateApplicationInstanceDisplayDataResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.UpdateApplicationInstanceResponseConfigurationReqBody;
import com.huaweicloud.sdk.identitycenter.v1.model.UpdateApplicationInstanceResponseConfigurationRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.UpdateApplicationInstanceResponseConfigurationResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.UpdateApplicationInstanceResponseSchemaConfigurationReqBody;
import com.huaweicloud.sdk.identitycenter.v1.model.UpdateApplicationInstanceResponseSchemaConfigurationRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.UpdateApplicationInstanceResponseSchemaConfigurationResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.UpdateApplicationInstanceSecurityConfigurationReqBody;
import com.huaweicloud.sdk.identitycenter.v1.model.UpdateApplicationInstanceSecurityConfigurationRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.UpdateApplicationInstanceSecurityConfigurationResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.UpdateApplicationInstanceServiceProviderConfigurationReqBody;
import com.huaweicloud.sdk.identitycenter.v1.model.UpdateApplicationInstanceServiceProviderConfigurationRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.UpdateApplicationInstanceServiceProviderConfigurationResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.UpdateApplicationInstanceStatusReqBody;
import com.huaweicloud.sdk.identitycenter.v1.model.UpdateApplicationInstanceStatusRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.UpdateApplicationInstanceStatusResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.UpdateHAConfigurationReqBody;
import com.huaweicloud.sdk.identitycenter.v1.model.UpdateHaConfigurationRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.UpdateHaConfigurationResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.UpdateInstanceAccessControlAttributeConfigurationReqBody;
import com.huaweicloud.sdk.identitycenter.v1.model.UpdateInstanceAccessControlAttributeConfigurationRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.UpdateInstanceAccessControlAttributeConfigurationResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.UpdatePermissionSetReqBody;
import com.huaweicloud.sdk.identitycenter.v1.model.UpdatePermissionSetRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.UpdatePermissionSetResponse;
import com.huaweicloud.sdk.identitycenter.v1.model.UpdateSsoConfigurationReqBody;
import com.huaweicloud.sdk.identitycenter.v1.model.UpdateSsoConfigurationRequest;
import com.huaweicloud.sdk.identitycenter.v1.model.UpdateSsoConfigurationResponse;

@SuppressWarnings("unchecked")
public class IdentityCenterMeta {

    public static final HttpRequestDef<CreateAccountAssignmentRequest, CreateAccountAssignmentResponse> createAccountAssignment =
        genForCreateAccountAssignment();

    private static HttpRequestDef<CreateAccountAssignmentRequest, CreateAccountAssignmentResponse> genForCreateAccountAssignment() {
        // basic
        HttpRequestDef.Builder<CreateAccountAssignmentRequest, CreateAccountAssignmentResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateAccountAssignmentRequest.class, CreateAccountAssignmentResponse.class)
            .withName("CreateAccountAssignment")
            .withUri("/v1/instances/{instance_id}/account-assignments/create")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAccountAssignmentRequest::getInstanceId,
                CreateAccountAssignmentRequest::setInstanceId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAccountAssignmentRequest::getXSecurityToken,
                CreateAccountAssignmentRequest::setXSecurityToken));
        builder.<CreateAccountAssignmentReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAccountAssignmentReqBody.class),
            f -> f.withMarshaller(CreateAccountAssignmentRequest::getBody, CreateAccountAssignmentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAccountAssignmentRequest, DeleteAccountAssignmentResponse> deleteAccountAssignment =
        genForDeleteAccountAssignment();

    private static HttpRequestDef<DeleteAccountAssignmentRequest, DeleteAccountAssignmentResponse> genForDeleteAccountAssignment() {
        // basic
        HttpRequestDef.Builder<DeleteAccountAssignmentRequest, DeleteAccountAssignmentResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, DeleteAccountAssignmentRequest.class, DeleteAccountAssignmentResponse.class)
            .withName("DeleteAccountAssignment")
            .withUri("/v1/instances/{instance_id}/account-assignments/delete")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAccountAssignmentRequest::getInstanceId,
                DeleteAccountAssignmentRequest::setInstanceId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAccountAssignmentRequest::getXSecurityToken,
                DeleteAccountAssignmentRequest::setXSecurityToken));
        builder.<DeleteAccountAssignmentReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteAccountAssignmentReqBody.class),
            f -> f.withMarshaller(DeleteAccountAssignmentRequest::getBody, DeleteAccountAssignmentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DescribeAccountAssignmentCreationStatusRequest, DescribeAccountAssignmentCreationStatusResponse> describeAccountAssignmentCreationStatus =
        genForDescribeAccountAssignmentCreationStatus();

    private static HttpRequestDef<DescribeAccountAssignmentCreationStatusRequest, DescribeAccountAssignmentCreationStatusResponse> genForDescribeAccountAssignmentCreationStatus() {
        // basic
        HttpRequestDef.Builder<DescribeAccountAssignmentCreationStatusRequest, DescribeAccountAssignmentCreationStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    DescribeAccountAssignmentCreationStatusRequest.class,
                    DescribeAccountAssignmentCreationStatusResponse.class)
                .withName("DescribeAccountAssignmentCreationStatus")
                .withUri("/v1/instances/{instance_id}/account-assignments/creation-status/{request_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DescribeAccountAssignmentCreationStatusRequest::getInstanceId,
                DescribeAccountAssignmentCreationStatusRequest::setInstanceId));
        builder.<String>withRequestField("request_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DescribeAccountAssignmentCreationStatusRequest::getRequestId,
                DescribeAccountAssignmentCreationStatusRequest::setRequestId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DescribeAccountAssignmentCreationStatusRequest::getXSecurityToken,
                DescribeAccountAssignmentCreationStatusRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DescribeAccountAssignmentDeletionStatusRequest, DescribeAccountAssignmentDeletionStatusResponse> describeAccountAssignmentDeletionStatus =
        genForDescribeAccountAssignmentDeletionStatus();

    private static HttpRequestDef<DescribeAccountAssignmentDeletionStatusRequest, DescribeAccountAssignmentDeletionStatusResponse> genForDescribeAccountAssignmentDeletionStatus() {
        // basic
        HttpRequestDef.Builder<DescribeAccountAssignmentDeletionStatusRequest, DescribeAccountAssignmentDeletionStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    DescribeAccountAssignmentDeletionStatusRequest.class,
                    DescribeAccountAssignmentDeletionStatusResponse.class)
                .withName("DescribeAccountAssignmentDeletionStatus")
                .withUri("/v1/instances/{instance_id}/account-assignments/deletion-status/{request_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DescribeAccountAssignmentDeletionStatusRequest::getInstanceId,
                DescribeAccountAssignmentDeletionStatusRequest::setInstanceId));
        builder.<String>withRequestField("request_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DescribeAccountAssignmentDeletionStatusRequest::getRequestId,
                DescribeAccountAssignmentDeletionStatusRequest::setRequestId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DescribeAccountAssignmentDeletionStatusRequest::getXSecurityToken,
                DescribeAccountAssignmentDeletionStatusRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DisassociateProfileRequest, DisassociateProfileResponse> disassociateProfile =
        genForDisassociateProfile();

    private static HttpRequestDef<DisassociateProfileRequest, DisassociateProfileResponse> genForDisassociateProfile() {
        // basic
        HttpRequestDef.Builder<DisassociateProfileRequest, DisassociateProfileResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DisassociateProfileRequest.class, DisassociateProfileResponse.class)
                .withName("DisassociateProfile")
                .withUri("/v1/instances/{instance_id}/disassociate-profile")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisassociateProfileRequest::getInstanceId,
                DisassociateProfileRequest::setInstanceId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DisassociateProfileRequest::getXSecurityToken,
                DisassociateProfileRequest::setXSecurityToken));
        builder.<DisassociateProfileReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DisassociateProfileReqBody.class),
            f -> f.withMarshaller(DisassociateProfileRequest::getBody, DisassociateProfileRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAccountAssignmentCreationStatusRequest, ListAccountAssignmentCreationStatusResponse> listAccountAssignmentCreationStatus =
        genForListAccountAssignmentCreationStatus();

    private static HttpRequestDef<ListAccountAssignmentCreationStatusRequest, ListAccountAssignmentCreationStatusResponse> genForListAccountAssignmentCreationStatus() {
        // basic
        HttpRequestDef.Builder<ListAccountAssignmentCreationStatusRequest, ListAccountAssignmentCreationStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListAccountAssignmentCreationStatusRequest.class,
                    ListAccountAssignmentCreationStatusResponse.class)
                .withName("ListAccountAssignmentCreationStatus")
                .withUri("/v1/instances/{instance_id}/account-assignments/creation-statuses")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccountAssignmentCreationStatusRequest::getInstanceId,
                ListAccountAssignmentCreationStatusRequest::setInstanceId));
        builder.<ListAccountAssignmentCreationStatusRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAccountAssignmentCreationStatusRequest.StatusEnum.class),
            f -> f.withMarshaller(ListAccountAssignmentCreationStatusRequest::getStatus,
                ListAccountAssignmentCreationStatusRequest::setStatus));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAccountAssignmentCreationStatusRequest::getLimit,
                ListAccountAssignmentCreationStatusRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccountAssignmentCreationStatusRequest::getMarker,
                ListAccountAssignmentCreationStatusRequest::setMarker));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccountAssignmentCreationStatusRequest::getXSecurityToken,
                ListAccountAssignmentCreationStatusRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAccountAssignmentDeletionStatusRequest, ListAccountAssignmentDeletionStatusResponse> listAccountAssignmentDeletionStatus =
        genForListAccountAssignmentDeletionStatus();

    private static HttpRequestDef<ListAccountAssignmentDeletionStatusRequest, ListAccountAssignmentDeletionStatusResponse> genForListAccountAssignmentDeletionStatus() {
        // basic
        HttpRequestDef.Builder<ListAccountAssignmentDeletionStatusRequest, ListAccountAssignmentDeletionStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListAccountAssignmentDeletionStatusRequest.class,
                    ListAccountAssignmentDeletionStatusResponse.class)
                .withName("ListAccountAssignmentDeletionStatus")
                .withUri("/v1/instances/{instance_id}/account-assignments/deletion-statuses")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccountAssignmentDeletionStatusRequest::getInstanceId,
                ListAccountAssignmentDeletionStatusRequest::setInstanceId));
        builder.<ListAccountAssignmentDeletionStatusRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAccountAssignmentDeletionStatusRequest.StatusEnum.class),
            f -> f.withMarshaller(ListAccountAssignmentDeletionStatusRequest::getStatus,
                ListAccountAssignmentDeletionStatusRequest::setStatus));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAccountAssignmentDeletionStatusRequest::getLimit,
                ListAccountAssignmentDeletionStatusRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccountAssignmentDeletionStatusRequest::getMarker,
                ListAccountAssignmentDeletionStatusRequest::setMarker));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccountAssignmentDeletionStatusRequest::getXSecurityToken,
                ListAccountAssignmentDeletionStatusRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAccountAssignmentsRequest, ListAccountAssignmentsResponse> listAccountAssignments =
        genForListAccountAssignments();

    private static HttpRequestDef<ListAccountAssignmentsRequest, ListAccountAssignmentsResponse> genForListAccountAssignments() {
        // basic
        HttpRequestDef.Builder<ListAccountAssignmentsRequest, ListAccountAssignmentsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListAccountAssignmentsRequest.class, ListAccountAssignmentsResponse.class)
            .withName("ListAccountAssignments")
            .withUri("/v1/instances/{instance_id}/account-assignments")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccountAssignmentsRequest::getInstanceId,
                ListAccountAssignmentsRequest::setInstanceId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAccountAssignmentsRequest::getLimit, ListAccountAssignmentsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccountAssignmentsRequest::getMarker, ListAccountAssignmentsRequest::setMarker));
        builder.<String>withRequestField("account_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccountAssignmentsRequest::getAccountId,
                ListAccountAssignmentsRequest::setAccountId));
        builder.<String>withRequestField("permission_set_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccountAssignmentsRequest::getPermissionSetId,
                ListAccountAssignmentsRequest::setPermissionSetId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccountAssignmentsRequest::getXSecurityToken,
                ListAccountAssignmentsRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAccountAssignmentsForPrincipalRequest, ListAccountAssignmentsForPrincipalResponse> listAccountAssignmentsForPrincipal =
        genForListAccountAssignmentsForPrincipal();

    private static HttpRequestDef<ListAccountAssignmentsForPrincipalRequest, ListAccountAssignmentsForPrincipalResponse> genForListAccountAssignmentsForPrincipal() {
        // basic
        HttpRequestDef.Builder<ListAccountAssignmentsForPrincipalRequest, ListAccountAssignmentsForPrincipalResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListAccountAssignmentsForPrincipalRequest.class,
                    ListAccountAssignmentsForPrincipalResponse.class)
                .withName("ListAccountAssignmentsForPrincipal")
                .withUri("/v1/instances/{instance_id}/account-assignments-for-principals")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccountAssignmentsForPrincipalRequest::getInstanceId,
                ListAccountAssignmentsForPrincipalRequest::setInstanceId));
        builder.<String>withRequestField("principal_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccountAssignmentsForPrincipalRequest::getPrincipalId,
                ListAccountAssignmentsForPrincipalRequest::setPrincipalId));
        builder.<ListAccountAssignmentsForPrincipalRequest.PrincipalTypeEnum>withRequestField("principal_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListAccountAssignmentsForPrincipalRequest.PrincipalTypeEnum.class),
            f -> f.withMarshaller(ListAccountAssignmentsForPrincipalRequest::getPrincipalType,
                ListAccountAssignmentsForPrincipalRequest::setPrincipalType));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAccountAssignmentsForPrincipalRequest::getLimit,
                ListAccountAssignmentsForPrincipalRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccountAssignmentsForPrincipalRequest::getMarker,
                ListAccountAssignmentsForPrincipalRequest::setMarker));
        builder.<String>withRequestField("account_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccountAssignmentsForPrincipalRequest::getAccountId,
                ListAccountAssignmentsForPrincipalRequest::setAccountId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccountAssignmentsForPrincipalRequest::getXSecurityToken,
                ListAccountAssignmentsForPrincipalRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateApplicationInstanceRequest, CreateApplicationInstanceResponse> createApplicationInstance =
        genForCreateApplicationInstance();

    private static HttpRequestDef<CreateApplicationInstanceRequest, CreateApplicationInstanceResponse> genForCreateApplicationInstance() {
        // basic
        HttpRequestDef.Builder<CreateApplicationInstanceRequest, CreateApplicationInstanceResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateApplicationInstanceRequest.class,
                    CreateApplicationInstanceResponse.class)
                .withName("CreateApplicationInstance")
                .withUri("/v1/instances/{instance_id}/application-instances")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateApplicationInstanceRequest::getInstanceId,
                CreateApplicationInstanceRequest::setInstanceId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateApplicationInstanceRequest::getXSecurityToken,
                CreateApplicationInstanceRequest::setXSecurityToken));
        builder.<CreateApplicationInstanceReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateApplicationInstanceReqBody.class),
            f -> f.withMarshaller(CreateApplicationInstanceRequest::getBody,
                CreateApplicationInstanceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteApplicationInstanceRequest, DeleteApplicationInstanceResponse> deleteApplicationInstance =
        genForDeleteApplicationInstance();

    private static HttpRequestDef<DeleteApplicationInstanceRequest, DeleteApplicationInstanceResponse> genForDeleteApplicationInstance() {
        // basic
        HttpRequestDef.Builder<DeleteApplicationInstanceRequest, DeleteApplicationInstanceResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteApplicationInstanceRequest.class,
                    DeleteApplicationInstanceResponse.class)
                .withName("DeleteApplicationInstance")
                .withUri("/v1/instances/{instance_id}/application-instances/{application_instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteApplicationInstanceRequest::getInstanceId,
                DeleteApplicationInstanceRequest::setInstanceId));
        builder.<String>withRequestField("application_instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteApplicationInstanceRequest::getApplicationInstanceId,
                DeleteApplicationInstanceRequest::setApplicationInstanceId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteApplicationInstanceRequest::getXSecurityToken,
                DeleteApplicationInstanceRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteProfileRequest, DeleteProfileResponse> deleteProfile =
        genForDeleteProfile();

    private static HttpRequestDef<DeleteProfileRequest, DeleteProfileResponse> genForDeleteProfile() {
        // basic
        HttpRequestDef.Builder<DeleteProfileRequest, DeleteProfileResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteProfileRequest.class, DeleteProfileResponse.class)
                .withName("DeleteProfile")
                .withUri(
                    "/v1/instances/{instance_id}/application-instances/{application_instance_id}/profiles/{profile_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteProfileRequest::getInstanceId, DeleteProfileRequest::setInstanceId));
        builder.<String>withRequestField("application_instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteProfileRequest::getApplicationInstanceId,
                DeleteProfileRequest::setApplicationInstanceId));
        builder.<String>withRequestField("profile_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteProfileRequest::getProfileId, DeleteProfileRequest::setProfileId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteProfileRequest::getXSecurityToken, DeleteProfileRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DescribeApplicationRequest, DescribeApplicationResponse> describeApplication =
        genForDescribeApplication();

    private static HttpRequestDef<DescribeApplicationRequest, DescribeApplicationResponse> genForDescribeApplication() {
        // basic
        HttpRequestDef.Builder<DescribeApplicationRequest, DescribeApplicationResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, DescribeApplicationRequest.class, DescribeApplicationResponse.class)
                .withName("DescribeApplication")
                .withUri("/v1/instances/{instance_id}/applications/{application_instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DescribeApplicationRequest::getInstanceId,
                DescribeApplicationRequest::setInstanceId));
        builder.<String>withRequestField("application_instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DescribeApplicationRequest::getApplicationInstanceId,
                DescribeApplicationRequest::setApplicationInstanceId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DescribeApplicationRequest::getXSecurityToken,
                DescribeApplicationRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DescribeApplicationProviderRequest, DescribeApplicationProviderResponse> describeApplicationProvider =
        genForDescribeApplicationProvider();

    private static HttpRequestDef<DescribeApplicationProviderRequest, DescribeApplicationProviderResponse> genForDescribeApplicationProvider() {
        // basic
        HttpRequestDef.Builder<DescribeApplicationProviderRequest, DescribeApplicationProviderResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    DescribeApplicationProviderRequest.class,
                    DescribeApplicationProviderResponse.class)
                .withName("DescribeApplicationProvider")
                .withUri("/v1/application-providers/{application_provider_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_provider_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DescribeApplicationProviderRequest::getApplicationProviderId,
                DescribeApplicationProviderRequest::setApplicationProviderId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DescribeApplicationProviderRequest::getXSecurityToken,
                DescribeApplicationProviderRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetApplicationAssignmentConfigurationRequest, GetApplicationAssignmentConfigurationResponse> getApplicationAssignmentConfiguration =
        genForGetApplicationAssignmentConfiguration();

    private static HttpRequestDef<GetApplicationAssignmentConfigurationRequest, GetApplicationAssignmentConfigurationResponse> genForGetApplicationAssignmentConfiguration() {
        // basic
        HttpRequestDef.Builder<GetApplicationAssignmentConfigurationRequest, GetApplicationAssignmentConfigurationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    GetApplicationAssignmentConfigurationRequest.class,
                    GetApplicationAssignmentConfigurationResponse.class)
                .withName("GetApplicationAssignmentConfiguration")
                .withUri("/v1/instances/{instance_id}/applications/{application_instance_id}/assignments-configuration")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetApplicationAssignmentConfigurationRequest::getInstanceId,
                GetApplicationAssignmentConfigurationRequest::setInstanceId));
        builder.<String>withRequestField("application_instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetApplicationAssignmentConfigurationRequest::getApplicationInstanceId,
                GetApplicationAssignmentConfigurationRequest::setApplicationInstanceId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetApplicationAssignmentConfigurationRequest::getXSecurityToken,
                GetApplicationAssignmentConfigurationRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetApplicationInstanceRequest, GetApplicationInstanceResponse> getApplicationInstance =
        genForGetApplicationInstance();

    private static HttpRequestDef<GetApplicationInstanceRequest, GetApplicationInstanceResponse> genForGetApplicationInstance() {
        // basic
        HttpRequestDef.Builder<GetApplicationInstanceRequest, GetApplicationInstanceResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, GetApplicationInstanceRequest.class, GetApplicationInstanceResponse.class)
            .withName("GetApplicationInstance")
            .withUri("/v1/instances/{instance_id}/application-instances/{application_instance_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetApplicationInstanceRequest::getInstanceId,
                GetApplicationInstanceRequest::setInstanceId));
        builder.<String>withRequestField("application_instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetApplicationInstanceRequest::getApplicationInstanceId,
                GetApplicationInstanceRequest::setApplicationInstanceId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetApplicationInstanceRequest::getXSecurityToken,
                GetApplicationInstanceRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ImportApplicationInstanceServiceProviderMetadataRequest, ImportApplicationInstanceServiceProviderMetadataResponse> importApplicationInstanceServiceProviderMetadata =
        genForImportApplicationInstanceServiceProviderMetadata();

    private static HttpRequestDef<ImportApplicationInstanceServiceProviderMetadataRequest, ImportApplicationInstanceServiceProviderMetadataResponse> genForImportApplicationInstanceServiceProviderMetadata() {
        // basic
        HttpRequestDef.Builder<ImportApplicationInstanceServiceProviderMetadataRequest, ImportApplicationInstanceServiceProviderMetadataResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ImportApplicationInstanceServiceProviderMetadataRequest.class,
                    ImportApplicationInstanceServiceProviderMetadataResponse.class)
                .withName("ImportApplicationInstanceServiceProviderMetadata")
                .withUri("/v1/instances/{instance_id}/application-instances/{application_instance_id}/metadata")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportApplicationInstanceServiceProviderMetadataRequest::getInstanceId,
                ImportApplicationInstanceServiceProviderMetadataRequest::setInstanceId));
        builder.<String>withRequestField("application_instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportApplicationInstanceServiceProviderMetadataRequest::getApplicationInstanceId,
                ImportApplicationInstanceServiceProviderMetadataRequest::setApplicationInstanceId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ImportApplicationInstanceServiceProviderMetadataRequest::getXSecurityToken,
                ImportApplicationInstanceServiceProviderMetadataRequest::setXSecurityToken));
        builder.<ImportApplicationInstanceServiceProviderMetadataReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ImportApplicationInstanceServiceProviderMetadataReqBody.class),
            f -> f.withMarshaller(ImportApplicationInstanceServiceProviderMetadataRequest::getBody,
                ImportApplicationInstanceServiceProviderMetadataRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApplicationInstancesRequest, ListApplicationInstancesResponse> listApplicationInstances =
        genForListApplicationInstances();

    private static HttpRequestDef<ListApplicationInstancesRequest, ListApplicationInstancesResponse> genForListApplicationInstances() {
        // basic
        HttpRequestDef.Builder<ListApplicationInstancesRequest, ListApplicationInstancesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListApplicationInstancesRequest.class, ListApplicationInstancesResponse.class)
                .withName("ListApplicationInstances")
                .withUri("/v1/instances/{instance_id}/application-instances")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApplicationInstancesRequest::getInstanceId,
                ListApplicationInstancesRequest::setInstanceId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApplicationInstancesRequest::getLimit,
                ListApplicationInstancesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApplicationInstancesRequest::getMarker,
                ListApplicationInstancesRequest::setMarker));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApplicationInstancesRequest::getXSecurityToken,
                ListApplicationInstancesRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApplicationProvidersRequest, ListApplicationProvidersResponse> listApplicationProviders =
        genForListApplicationProviders();

    private static HttpRequestDef<ListApplicationProvidersRequest, ListApplicationProvidersResponse> genForListApplicationProviders() {
        // basic
        HttpRequestDef.Builder<ListApplicationProvidersRequest, ListApplicationProvidersResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListApplicationProvidersRequest.class, ListApplicationProvidersResponse.class)
                .withName("ListApplicationProviders")
                .withUri("/v1/application-providers")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApplicationProvidersRequest::getLimit,
                ListApplicationProvidersRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApplicationProvidersRequest::getMarker,
                ListApplicationProvidersRequest::setMarker));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApplicationProvidersRequest::getXSecurityToken,
                ListApplicationProvidersRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApplicationTemplatesRequest, ListApplicationTemplatesResponse> listApplicationTemplates =
        genForListApplicationTemplates();

    private static HttpRequestDef<ListApplicationTemplatesRequest, ListApplicationTemplatesResponse> genForListApplicationTemplates() {
        // basic
        HttpRequestDef.Builder<ListApplicationTemplatesRequest, ListApplicationTemplatesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ListApplicationTemplatesRequest.class, ListApplicationTemplatesResponse.class)
                .withName("ListApplicationTemplates")
                .withUri("/v1/application-templates")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApplicationTemplatesRequest::getApplicationId,
                ListApplicationTemplatesRequest::setApplicationId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApplicationTemplatesRequest::getXSecurityToken,
                ListApplicationTemplatesRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApplicationsRequest, ListApplicationsResponse> listApplications =
        genForListApplications();

    private static HttpRequestDef<ListApplicationsRequest, ListApplicationsResponse> genForListApplications() {
        // basic
        HttpRequestDef.Builder<ListApplicationsRequest, ListApplicationsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListApplicationsRequest.class, ListApplicationsResponse.class)
                .withName("ListApplications")
                .withUri("/v1/instances/{instance_id}/applications")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApplicationsRequest::getInstanceId, ListApplicationsRequest::setInstanceId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApplicationsRequest::getLimit, ListApplicationsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApplicationsRequest::getMarker, ListApplicationsRequest::setMarker));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApplicationsRequest::getXSecurityToken,
                ListApplicationsRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCatalogApplicationsRequest, ListCatalogApplicationsResponse> listCatalogApplications =
        genForListCatalogApplications();

    private static HttpRequestDef<ListCatalogApplicationsRequest, ListCatalogApplicationsResponse> genForListCatalogApplications() {
        // basic
        HttpRequestDef.Builder<ListCatalogApplicationsRequest, ListCatalogApplicationsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListCatalogApplicationsRequest.class, ListCatalogApplicationsResponse.class)
            .withName("ListCatalogApplications")
            .withUri("/v1/catalog/applications")
            .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListCatalogApplicationsRequest::getLimit, ListCatalogApplicationsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCatalogApplicationsRequest::getMarker,
                ListCatalogApplicationsRequest::setMarker));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCatalogApplicationsRequest::getXSecurityToken,
                ListCatalogApplicationsRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProfilesRequest, ListProfilesResponse> listProfiles = genForListProfiles();

    private static HttpRequestDef<ListProfilesRequest, ListProfilesResponse> genForListProfiles() {
        // basic
        HttpRequestDef.Builder<ListProfilesRequest, ListProfilesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProfilesRequest.class, ListProfilesResponse.class)
                .withName("ListProfiles")
                .withUri("/v1/instances/{instance_id}/application-instances/{application_instance_id}/profiles")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProfilesRequest::getInstanceId, ListProfilesRequest::setInstanceId));
        builder.<String>withRequestField("application_instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProfilesRequest::getApplicationInstanceId,
                ListProfilesRequest::setApplicationInstanceId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProfilesRequest::getXSecurityToken, ListProfilesRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateApplicationInstanceDisplayDataRequest, UpdateApplicationInstanceDisplayDataResponse> updateApplicationInstanceDisplayData =
        genForUpdateApplicationInstanceDisplayData();

    private static HttpRequestDef<UpdateApplicationInstanceDisplayDataRequest, UpdateApplicationInstanceDisplayDataResponse> genForUpdateApplicationInstanceDisplayData() {
        // basic
        HttpRequestDef.Builder<UpdateApplicationInstanceDisplayDataRequest, UpdateApplicationInstanceDisplayDataResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateApplicationInstanceDisplayDataRequest.class,
                    UpdateApplicationInstanceDisplayDataResponse.class)
                .withName("UpdateApplicationInstanceDisplayData")
                .withUri("/v1/instances/{instance_id}/application-instances/{application_instance_id}/display-data")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateApplicationInstanceDisplayDataRequest::getInstanceId,
                UpdateApplicationInstanceDisplayDataRequest::setInstanceId));
        builder.<String>withRequestField("application_instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateApplicationInstanceDisplayDataRequest::getApplicationInstanceId,
                UpdateApplicationInstanceDisplayDataRequest::setApplicationInstanceId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateApplicationInstanceDisplayDataRequest::getXSecurityToken,
                UpdateApplicationInstanceDisplayDataRequest::setXSecurityToken));
        builder.<UpdateApplicationInstanceDisplayDataReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateApplicationInstanceDisplayDataReqBody.class),
            f -> f.withMarshaller(UpdateApplicationInstanceDisplayDataRequest::getBody,
                UpdateApplicationInstanceDisplayDataRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateApplicationInstanceResponseConfigurationRequest, UpdateApplicationInstanceResponseConfigurationResponse> updateApplicationInstanceResponseConfiguration =
        genForUpdateApplicationInstanceResponseConfiguration();

    private static HttpRequestDef<UpdateApplicationInstanceResponseConfigurationRequest, UpdateApplicationInstanceResponseConfigurationResponse> genForUpdateApplicationInstanceResponseConfiguration() {
        // basic
        HttpRequestDef.Builder<UpdateApplicationInstanceResponseConfigurationRequest, UpdateApplicationInstanceResponseConfigurationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateApplicationInstanceResponseConfigurationRequest.class,
                    UpdateApplicationInstanceResponseConfigurationResponse.class)
                .withName("UpdateApplicationInstanceResponseConfiguration")
                .withUri(
                    "/v1/instances/{instance_id}/application-instances/{application_instance_id}/response-configuration")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateApplicationInstanceResponseConfigurationRequest::getInstanceId,
                UpdateApplicationInstanceResponseConfigurationRequest::setInstanceId));
        builder.<String>withRequestField("application_instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateApplicationInstanceResponseConfigurationRequest::getApplicationInstanceId,
                UpdateApplicationInstanceResponseConfigurationRequest::setApplicationInstanceId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateApplicationInstanceResponseConfigurationRequest::getXSecurityToken,
                UpdateApplicationInstanceResponseConfigurationRequest::setXSecurityToken));
        builder.<UpdateApplicationInstanceResponseConfigurationReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateApplicationInstanceResponseConfigurationReqBody.class),
            f -> f.withMarshaller(UpdateApplicationInstanceResponseConfigurationRequest::getBody,
                UpdateApplicationInstanceResponseConfigurationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateApplicationInstanceResponseSchemaConfigurationRequest, UpdateApplicationInstanceResponseSchemaConfigurationResponse> updateApplicationInstanceResponseSchemaConfiguration =
        genForUpdateApplicationInstanceResponseSchemaConfiguration();

    private static HttpRequestDef<UpdateApplicationInstanceResponseSchemaConfigurationRequest, UpdateApplicationInstanceResponseSchemaConfigurationResponse> genForUpdateApplicationInstanceResponseSchemaConfiguration() {
        // basic
        HttpRequestDef.Builder<UpdateApplicationInstanceResponseSchemaConfigurationRequest, UpdateApplicationInstanceResponseSchemaConfigurationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateApplicationInstanceResponseSchemaConfigurationRequest.class,
                    UpdateApplicationInstanceResponseSchemaConfigurationResponse.class)
                .withName("UpdateApplicationInstanceResponseSchemaConfiguration")
                .withUri(
                    "/v1/instances/{instance_id}/application-instances/{application_instance_id}/response-schema-configuration")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateApplicationInstanceResponseSchemaConfigurationRequest::getInstanceId,
                UpdateApplicationInstanceResponseSchemaConfigurationRequest::setInstanceId));
        builder.<String>withRequestField("application_instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateApplicationInstanceResponseSchemaConfigurationRequest::getApplicationInstanceId,
                UpdateApplicationInstanceResponseSchemaConfigurationRequest::setApplicationInstanceId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateApplicationInstanceResponseSchemaConfigurationRequest::getXSecurityToken,
                UpdateApplicationInstanceResponseSchemaConfigurationRequest::setXSecurityToken));
        builder.<UpdateApplicationInstanceResponseSchemaConfigurationReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateApplicationInstanceResponseSchemaConfigurationReqBody.class),
            f -> f.withMarshaller(UpdateApplicationInstanceResponseSchemaConfigurationRequest::getBody,
                UpdateApplicationInstanceResponseSchemaConfigurationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateApplicationInstanceSecurityConfigurationRequest, UpdateApplicationInstanceSecurityConfigurationResponse> updateApplicationInstanceSecurityConfiguration =
        genForUpdateApplicationInstanceSecurityConfiguration();

    private static HttpRequestDef<UpdateApplicationInstanceSecurityConfigurationRequest, UpdateApplicationInstanceSecurityConfigurationResponse> genForUpdateApplicationInstanceSecurityConfiguration() {
        // basic
        HttpRequestDef.Builder<UpdateApplicationInstanceSecurityConfigurationRequest, UpdateApplicationInstanceSecurityConfigurationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateApplicationInstanceSecurityConfigurationRequest.class,
                    UpdateApplicationInstanceSecurityConfigurationResponse.class)
                .withName("UpdateApplicationInstanceSecurityConfiguration")
                .withUri(
                    "/v1/instances/{instance_id}/application-instances/{application_instance_id}/security-configuration")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateApplicationInstanceSecurityConfigurationRequest::getInstanceId,
                UpdateApplicationInstanceSecurityConfigurationRequest::setInstanceId));
        builder.<String>withRequestField("application_instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateApplicationInstanceSecurityConfigurationRequest::getApplicationInstanceId,
                UpdateApplicationInstanceSecurityConfigurationRequest::setApplicationInstanceId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateApplicationInstanceSecurityConfigurationRequest::getXSecurityToken,
                UpdateApplicationInstanceSecurityConfigurationRequest::setXSecurityToken));
        builder.<UpdateApplicationInstanceSecurityConfigurationReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateApplicationInstanceSecurityConfigurationReqBody.class),
            f -> f.withMarshaller(UpdateApplicationInstanceSecurityConfigurationRequest::getBody,
                UpdateApplicationInstanceSecurityConfigurationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateApplicationInstanceServiceProviderConfigurationRequest, UpdateApplicationInstanceServiceProviderConfigurationResponse> updateApplicationInstanceServiceProviderConfiguration =
        genForUpdateApplicationInstanceServiceProviderConfiguration();

    private static HttpRequestDef<UpdateApplicationInstanceServiceProviderConfigurationRequest, UpdateApplicationInstanceServiceProviderConfigurationResponse> genForUpdateApplicationInstanceServiceProviderConfiguration() {
        // basic
        HttpRequestDef.Builder<UpdateApplicationInstanceServiceProviderConfigurationRequest, UpdateApplicationInstanceServiceProviderConfigurationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateApplicationInstanceServiceProviderConfigurationRequest.class,
                    UpdateApplicationInstanceServiceProviderConfigurationResponse.class)
                .withName("UpdateApplicationInstanceServiceProviderConfiguration")
                .withUri(
                    "/v1/instances/{instance_id}/application-instances/{application_instance_id}/service-provider-configuration")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateApplicationInstanceServiceProviderConfigurationRequest::getInstanceId,
                UpdateApplicationInstanceServiceProviderConfigurationRequest::setInstanceId));
        builder.<String>withRequestField("application_instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(
                UpdateApplicationInstanceServiceProviderConfigurationRequest::getApplicationInstanceId,
                UpdateApplicationInstanceServiceProviderConfigurationRequest::setApplicationInstanceId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateApplicationInstanceServiceProviderConfigurationRequest::getXSecurityToken,
                UpdateApplicationInstanceServiceProviderConfigurationRequest::setXSecurityToken));
        builder.<UpdateApplicationInstanceServiceProviderConfigurationReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateApplicationInstanceServiceProviderConfigurationReqBody.class),
            f -> f.withMarshaller(UpdateApplicationInstanceServiceProviderConfigurationRequest::getBody,
                UpdateApplicationInstanceServiceProviderConfigurationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateApplicationInstanceStatusRequest, UpdateApplicationInstanceStatusResponse> updateApplicationInstanceStatus =
        genForUpdateApplicationInstanceStatus();

    private static HttpRequestDef<UpdateApplicationInstanceStatusRequest, UpdateApplicationInstanceStatusResponse> genForUpdateApplicationInstanceStatus() {
        // basic
        HttpRequestDef.Builder<UpdateApplicationInstanceStatusRequest, UpdateApplicationInstanceStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateApplicationInstanceStatusRequest.class,
                    UpdateApplicationInstanceStatusResponse.class)
                .withName("UpdateApplicationInstanceStatus")
                .withUri("/v1/instances/{instance_id}/application-instances/{application_instance_id}/status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateApplicationInstanceStatusRequest::getInstanceId,
                UpdateApplicationInstanceStatusRequest::setInstanceId));
        builder.<String>withRequestField("application_instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateApplicationInstanceStatusRequest::getApplicationInstanceId,
                UpdateApplicationInstanceStatusRequest::setApplicationInstanceId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateApplicationInstanceStatusRequest::getXSecurityToken,
                UpdateApplicationInstanceStatusRequest::setXSecurityToken));
        builder.<UpdateApplicationInstanceStatusReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateApplicationInstanceStatusReqBody.class),
            f -> f.withMarshaller(UpdateApplicationInstanceStatusRequest::getBody,
                UpdateApplicationInstanceStatusRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateApplicationAssignmentRequest, CreateApplicationAssignmentResponse> createApplicationAssignment =
        genForCreateApplicationAssignment();

    private static HttpRequestDef<CreateApplicationAssignmentRequest, CreateApplicationAssignmentResponse> genForCreateApplicationAssignment() {
        // basic
        HttpRequestDef.Builder<CreateApplicationAssignmentRequest, CreateApplicationAssignmentResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateApplicationAssignmentRequest.class,
                    CreateApplicationAssignmentResponse.class)
                .withName("CreateApplicationAssignment")
                .withUri("/v1/instances/{instance_id}/applications/{application_instance_id}/assignments/create")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateApplicationAssignmentRequest::getInstanceId,
                CreateApplicationAssignmentRequest::setInstanceId));
        builder.<String>withRequestField("application_instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateApplicationAssignmentRequest::getApplicationInstanceId,
                CreateApplicationAssignmentRequest::setApplicationInstanceId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateApplicationAssignmentRequest::getXSecurityToken,
                CreateApplicationAssignmentRequest::setXSecurityToken));
        builder.<CreateApplicationAssignmentReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateApplicationAssignmentReqBody.class),
            f -> f.withMarshaller(CreateApplicationAssignmentRequest::getBody,
                CreateApplicationAssignmentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteApplicationAssignmentRequest, DeleteApplicationAssignmentResponse> deleteApplicationAssignment =
        genForDeleteApplicationAssignment();

    private static HttpRequestDef<DeleteApplicationAssignmentRequest, DeleteApplicationAssignmentResponse> genForDeleteApplicationAssignment() {
        // basic
        HttpRequestDef.Builder<DeleteApplicationAssignmentRequest, DeleteApplicationAssignmentResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    DeleteApplicationAssignmentRequest.class,
                    DeleteApplicationAssignmentResponse.class)
                .withName("DeleteApplicationAssignment")
                .withUri("/v1/instances/{instance_id}/applications/{application_instance_id}/assignments/delete")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteApplicationAssignmentRequest::getInstanceId,
                DeleteApplicationAssignmentRequest::setInstanceId));
        builder.<String>withRequestField("application_instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteApplicationAssignmentRequest::getApplicationInstanceId,
                DeleteApplicationAssignmentRequest::setApplicationInstanceId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteApplicationAssignmentRequest::getXSecurityToken,
                DeleteApplicationAssignmentRequest::setXSecurityToken));
        builder.<DeleteApplicationAssignmentReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteApplicationAssignmentReqBody.class),
            f -> f.withMarshaller(DeleteApplicationAssignmentRequest::getBody,
                DeleteApplicationAssignmentRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApplicationAssignmentsRequest, ListApplicationAssignmentsResponse> listApplicationAssignments =
        genForListApplicationAssignments();

    private static HttpRequestDef<ListApplicationAssignmentsRequest, ListApplicationAssignmentsResponse> genForListApplicationAssignments() {
        // basic
        HttpRequestDef.Builder<ListApplicationAssignmentsRequest, ListApplicationAssignmentsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListApplicationAssignmentsRequest.class,
                    ListApplicationAssignmentsResponse.class)
                .withName("ListApplicationAssignments")
                .withUri("/v1/instances/{instance_id}/applications/{application_instance_id}/assignments")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApplicationAssignmentsRequest::getInstanceId,
                ListApplicationAssignmentsRequest::setInstanceId));
        builder.<String>withRequestField("application_instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApplicationAssignmentsRequest::getApplicationInstanceId,
                ListApplicationAssignmentsRequest::setApplicationInstanceId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApplicationAssignmentsRequest::getLimit,
                ListApplicationAssignmentsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApplicationAssignmentsRequest::getMarker,
                ListApplicationAssignmentsRequest::setMarker));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApplicationAssignmentsRequest::getXSecurityToken,
                ListApplicationAssignmentsRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApplicationAssignmentsForPrincipalRequest, ListApplicationAssignmentsForPrincipalResponse> listApplicationAssignmentsForPrincipal =
        genForListApplicationAssignmentsForPrincipal();

    private static HttpRequestDef<ListApplicationAssignmentsForPrincipalRequest, ListApplicationAssignmentsForPrincipalResponse> genForListApplicationAssignmentsForPrincipal() {
        // basic
        HttpRequestDef.Builder<ListApplicationAssignmentsForPrincipalRequest, ListApplicationAssignmentsForPrincipalResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListApplicationAssignmentsForPrincipalRequest.class,
                    ListApplicationAssignmentsForPrincipalResponse.class)
                .withName("ListApplicationAssignmentsForPrincipal")
                .withUri("/v1/instances/{instance_id}/application-assignments-for-principals")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApplicationAssignmentsForPrincipalRequest::getInstanceId,
                ListApplicationAssignmentsForPrincipalRequest::setInstanceId));
        builder.<String>withRequestField("principal_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApplicationAssignmentsForPrincipalRequest::getPrincipalId,
                ListApplicationAssignmentsForPrincipalRequest::setPrincipalId));
        builder.<ListApplicationAssignmentsForPrincipalRequest.PrincipalTypeEnum>withRequestField("principal_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListApplicationAssignmentsForPrincipalRequest.PrincipalTypeEnum.class),
            f -> f.withMarshaller(ListApplicationAssignmentsForPrincipalRequest::getPrincipalType,
                ListApplicationAssignmentsForPrincipalRequest::setPrincipalType));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApplicationAssignmentsForPrincipalRequest::getLimit,
                ListApplicationAssignmentsForPrincipalRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApplicationAssignmentsForPrincipalRequest::getMarker,
                ListApplicationAssignmentsForPrincipalRequest::setMarker));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApplicationAssignmentsForPrincipalRequest::getXSecurityToken,
                ListApplicationAssignmentsForPrincipalRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateApplicationInstanceCertificateRequest, CreateApplicationInstanceCertificateResponse> createApplicationInstanceCertificate =
        genForCreateApplicationInstanceCertificate();

    private static HttpRequestDef<CreateApplicationInstanceCertificateRequest, CreateApplicationInstanceCertificateResponse> genForCreateApplicationInstanceCertificate() {
        // basic
        HttpRequestDef.Builder<CreateApplicationInstanceCertificateRequest, CreateApplicationInstanceCertificateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateApplicationInstanceCertificateRequest.class,
                    CreateApplicationInstanceCertificateResponse.class)
                .withName("CreateApplicationInstanceCertificate")
                .withUri("/v1/instances/{instance_id}/application-instances/{application_instance_id}/certificates")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateApplicationInstanceCertificateRequest::getInstanceId,
                CreateApplicationInstanceCertificateRequest::setInstanceId));
        builder.<String>withRequestField("application_instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateApplicationInstanceCertificateRequest::getApplicationInstanceId,
                CreateApplicationInstanceCertificateRequest::setApplicationInstanceId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateApplicationInstanceCertificateRequest::getXSecurityToken,
                CreateApplicationInstanceCertificateRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteApplicationInstanceCertificateRequest, DeleteApplicationInstanceCertificateResponse> deleteApplicationInstanceCertificate =
        genForDeleteApplicationInstanceCertificate();

    private static HttpRequestDef<DeleteApplicationInstanceCertificateRequest, DeleteApplicationInstanceCertificateResponse> genForDeleteApplicationInstanceCertificate() {
        // basic
        HttpRequestDef.Builder<DeleteApplicationInstanceCertificateRequest, DeleteApplicationInstanceCertificateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteApplicationInstanceCertificateRequest.class,
                    DeleteApplicationInstanceCertificateResponse.class)
                .withName("DeleteApplicationInstanceCertificate")
                .withUri(
                    "/v1/instances/{instance_id}/application-instances/{application_instance_id}/certificates/{certificate_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteApplicationInstanceCertificateRequest::getInstanceId,
                DeleteApplicationInstanceCertificateRequest::setInstanceId));
        builder.<String>withRequestField("application_instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteApplicationInstanceCertificateRequest::getApplicationInstanceId,
                DeleteApplicationInstanceCertificateRequest::setApplicationInstanceId));
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteApplicationInstanceCertificateRequest::getCertificateId,
                DeleteApplicationInstanceCertificateRequest::setCertificateId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteApplicationInstanceCertificateRequest::getXSecurityToken,
                DeleteApplicationInstanceCertificateRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApplicationInstanceCertificatesRequest, ListApplicationInstanceCertificatesResponse> listApplicationInstanceCertificates =
        genForListApplicationInstanceCertificates();

    private static HttpRequestDef<ListApplicationInstanceCertificatesRequest, ListApplicationInstanceCertificatesResponse> genForListApplicationInstanceCertificates() {
        // basic
        HttpRequestDef.Builder<ListApplicationInstanceCertificatesRequest, ListApplicationInstanceCertificatesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListApplicationInstanceCertificatesRequest.class,
                    ListApplicationInstanceCertificatesResponse.class)
                .withName("ListApplicationInstanceCertificates")
                .withUri("/v1/instances/{instance_id}/application-instances/{application_instance_id}/certificates")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApplicationInstanceCertificatesRequest::getInstanceId,
                ListApplicationInstanceCertificatesRequest::setInstanceId));
        builder.<String>withRequestField("application_instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApplicationInstanceCertificatesRequest::getApplicationInstanceId,
                ListApplicationInstanceCertificatesRequest::setApplicationInstanceId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApplicationInstanceCertificatesRequest::getLimit,
                ListApplicationInstanceCertificatesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApplicationInstanceCertificatesRequest::getMarker,
                ListApplicationInstanceCertificatesRequest::setMarker));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApplicationInstanceCertificatesRequest::getXSecurityToken,
                ListApplicationInstanceCertificatesRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateApplicationInstanceActiveCertificateRequest, UpdateApplicationInstanceActiveCertificateResponse> updateApplicationInstanceActiveCertificate =
        genForUpdateApplicationInstanceActiveCertificate();

    private static HttpRequestDef<UpdateApplicationInstanceActiveCertificateRequest, UpdateApplicationInstanceActiveCertificateResponse> genForUpdateApplicationInstanceActiveCertificate() {
        // basic
        HttpRequestDef.Builder<UpdateApplicationInstanceActiveCertificateRequest, UpdateApplicationInstanceActiveCertificateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateApplicationInstanceActiveCertificateRequest.class,
                    UpdateApplicationInstanceActiveCertificateResponse.class)
                .withName("UpdateApplicationInstanceActiveCertificate")
                .withUri(
                    "/v1/instances/{instance_id}/application-instances/{application_instance_id}/certificates/{certificate_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateApplicationInstanceActiveCertificateRequest::getInstanceId,
                UpdateApplicationInstanceActiveCertificateRequest::setInstanceId));
        builder.<String>withRequestField("application_instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateApplicationInstanceActiveCertificateRequest::getApplicationInstanceId,
                UpdateApplicationInstanceActiveCertificateRequest::setApplicationInstanceId));
        builder.<String>withRequestField("certificate_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateApplicationInstanceActiveCertificateRequest::getCertificateId,
                UpdateApplicationInstanceActiveCertificateRequest::setCertificateId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateApplicationInstanceActiveCertificateRequest::getXSecurityToken,
                UpdateApplicationInstanceActiveCertificateRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetSsoConfigurationRequest, GetSsoConfigurationResponse> getSsoConfiguration =
        genForGetSsoConfiguration();

    private static HttpRequestDef<GetSsoConfigurationRequest, GetSsoConfigurationResponse> genForGetSsoConfiguration() {
        // basic
        HttpRequestDef.Builder<GetSsoConfigurationRequest, GetSsoConfigurationResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, GetSsoConfigurationRequest.class, GetSsoConfigurationResponse.class)
                .withName("GetSsoConfiguration")
                .withUri("/v1/instances/{instance_id}/sso-configuration")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetSsoConfigurationRequest::getInstanceId,
                GetSsoConfigurationRequest::setInstanceId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetSsoConfigurationRequest::getXSecurityToken,
                GetSsoConfigurationRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateSsoConfigurationRequest, UpdateSsoConfigurationResponse> updateSsoConfiguration =
        genForUpdateSsoConfiguration();

    private static HttpRequestDef<UpdateSsoConfigurationRequest, UpdateSsoConfigurationResponse> genForUpdateSsoConfiguration() {
        // basic
        HttpRequestDef.Builder<UpdateSsoConfigurationRequest, UpdateSsoConfigurationResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, UpdateSsoConfigurationRequest.class, UpdateSsoConfigurationResponse.class)
            .withName("UpdateSsoConfiguration")
            .withUri("/v1/instances/{instance_id}/sso-configuration")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSsoConfigurationRequest::getInstanceId,
                UpdateSsoConfigurationRequest::setInstanceId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateSsoConfigurationRequest::getXSecurityToken,
                UpdateSsoConfigurationRequest::setXSecurityToken));
        builder.<UpdateSsoConfigurationReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateSsoConfigurationReqBody.class),
            f -> f.withMarshaller(UpdateSsoConfigurationRequest::getBody, UpdateSsoConfigurationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAliasRequest, CreateAliasResponse> createAlias = genForCreateAlias();

    private static HttpRequestDef<CreateAliasRequest, CreateAliasResponse> genForCreateAlias() {
        // basic
        HttpRequestDef.Builder<CreateAliasRequest, CreateAliasResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAliasRequest.class, CreateAliasResponse.class)
                .withName("CreateAlias")
                .withUri("/v1/instances/{instance_id}/alias")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAliasRequest::getInstanceId, CreateAliasRequest::setInstanceId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateAliasRequest::getXSecurityToken, CreateAliasRequest::setXSecurityToken));
        builder.<CreateAliasReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateAliasReqBody.class),
            f -> f.withMarshaller(CreateAliasRequest::getBody, CreateAliasRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteIdentityCenterRequest, DeleteIdentityCenterResponse> deleteIdentityCenter =
        genForDeleteIdentityCenter();

    private static HttpRequestDef<DeleteIdentityCenterRequest, DeleteIdentityCenterResponse> genForDeleteIdentityCenter() {
        // basic
        HttpRequestDef.Builder<DeleteIdentityCenterRequest, DeleteIdentityCenterResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, DeleteIdentityCenterRequest.class, DeleteIdentityCenterResponse.class)
            .withName("DeleteIdentityCenter")
            .withUri("/v1/service/delete")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteIdentityCenterRequest::getXSecurityToken,
                DeleteIdentityCenterRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DescribeRegisteredRegionsRequest, DescribeRegisteredRegionsResponse> describeRegisteredRegions =
        genForDescribeRegisteredRegions();

    private static HttpRequestDef<DescribeRegisteredRegionsRequest, DescribeRegisteredRegionsResponse> genForDescribeRegisteredRegions() {
        // basic
        HttpRequestDef.Builder<DescribeRegisteredRegionsRequest, DescribeRegisteredRegionsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    DescribeRegisteredRegionsRequest.class,
                    DescribeRegisteredRegionsResponse.class)
                .withName("DescribeRegisteredRegions")
                .withUri("/v1/registered-regions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DescribeRegisteredRegionsRequest::getXSecurityToken,
                DescribeRegisteredRegionsRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetHaConfigurationRequest, GetHaConfigurationResponse> getHaConfiguration =
        genForGetHaConfiguration();

    private static HttpRequestDef<GetHaConfigurationRequest, GetHaConfigurationResponse> genForGetHaConfiguration() {
        // basic
        HttpRequestDef.Builder<GetHaConfigurationRequest, GetHaConfigurationResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, GetHaConfigurationRequest.class, GetHaConfigurationResponse.class)
                .withName("GetHaConfiguration")
                .withUri("/v1/instances/{instance_id}/disaster-recovery-configuration")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetHaConfigurationRequest::getInstanceId, GetHaConfigurationRequest::setInstanceId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetHaConfigurationRequest::getXSecurityToken,
                GetHaConfigurationRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetIdentityCenterServiceStatusRequest, GetIdentityCenterServiceStatusResponse> getIdentityCenterServiceStatus =
        genForGetIdentityCenterServiceStatus();

    private static HttpRequestDef<GetIdentityCenterServiceStatusRequest, GetIdentityCenterServiceStatusResponse> genForGetIdentityCenterServiceStatus() {
        // basic
        HttpRequestDef.Builder<GetIdentityCenterServiceStatusRequest, GetIdentityCenterServiceStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    GetIdentityCenterServiceStatusRequest.class,
                    GetIdentityCenterServiceStatusResponse.class)
                .withName("GetIdentityCenterServiceStatus")
                .withUri("/v1/identity-center-service/status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetIdentityCenterServiceStatusRequest::getXSecurityToken,
                GetIdentityCenterServiceStatusRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListIdentityStoreAssociationRequest, ListIdentityStoreAssociationResponse> listIdentityStoreAssociation =
        genForListIdentityStoreAssociation();

    private static HttpRequestDef<ListIdentityStoreAssociationRequest, ListIdentityStoreAssociationResponse> genForListIdentityStoreAssociation() {
        // basic
        HttpRequestDef.Builder<ListIdentityStoreAssociationRequest, ListIdentityStoreAssociationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListIdentityStoreAssociationRequest.class,
                    ListIdentityStoreAssociationResponse.class)
                .withName("ListIdentityStoreAssociation")
                .withUri("/v1/instances/{instance_id}/identity-store-associations")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIdentityStoreAssociationRequest::getInstanceId,
                ListIdentityStoreAssociationRequest::setInstanceId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListIdentityStoreAssociationRequest::getXSecurityToken,
                ListIdentityStoreAssociationRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstancesRequest, ListInstancesResponse> listInstances =
        genForListInstances();

    private static HttpRequestDef<ListInstancesRequest, ListInstancesResponse> genForListInstances() {
        // basic
        HttpRequestDef.Builder<ListInstancesRequest, ListInstancesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListInstancesRequest.class, ListInstancesResponse.class)
                .withName("ListInstances")
                .withUri("/v1/instances")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstancesRequest::getLimit, ListInstancesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getMarker, ListInstancesRequest::setMarker));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getXSecurityToken, ListInstancesRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RegisterRegionRequest, RegisterRegionResponse> registerRegion =
        genForRegisterRegion();

    private static HttpRequestDef<RegisterRegionRequest, RegisterRegionResponse> genForRegisterRegion() {
        // basic
        HttpRequestDef.Builder<RegisterRegionRequest, RegisterRegionResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, RegisterRegionRequest.class, RegisterRegionResponse.class)
                .withName("RegisterRegion")
                .withUri("/v1/register-regions")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RegisterRegionRequest::getXSecurityToken, RegisterRegionRequest::setXSecurityToken));
        builder.<RegisterRegionReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(RegisterRegionReqBody.class),
            f -> f.withMarshaller(RegisterRegionRequest::getBody, RegisterRegionRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartIdentityCenterRequest, StartIdentityCenterResponse> startIdentityCenter =
        genForStartIdentityCenter();

    private static HttpRequestDef<StartIdentityCenterRequest, StartIdentityCenterResponse> genForStartIdentityCenter() {
        // basic
        HttpRequestDef.Builder<StartIdentityCenterRequest, StartIdentityCenterResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, StartIdentityCenterRequest.class, StartIdentityCenterResponse.class)
                .withName("StartIdentityCenter")
                .withUri("/v1/service/start")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartIdentityCenterRequest::getXSecurityToken,
                StartIdentityCenterRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateHaConfigurationRequest, UpdateHaConfigurationResponse> updateHaConfiguration =
        genForUpdateHaConfiguration();

    private static HttpRequestDef<UpdateHaConfigurationRequest, UpdateHaConfigurationResponse> genForUpdateHaConfiguration() {
        // basic
        HttpRequestDef.Builder<UpdateHaConfigurationRequest, UpdateHaConfigurationResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateHaConfigurationRequest.class, UpdateHaConfigurationResponse.class)
            .withName("UpdateHaConfiguration")
            .withUri("/v1/instances/{instance_id}/disaster-recovery-configuration")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHaConfigurationRequest::getInstanceId,
                UpdateHaConfigurationRequest::setInstanceId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateHaConfigurationRequest::getXSecurityToken,
                UpdateHaConfigurationRequest::setXSecurityToken));
        builder.<UpdateHAConfigurationReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateHAConfigurationReqBody.class),
            f -> f.withMarshaller(UpdateHaConfigurationRequest::getBody, UpdateHaConfigurationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateInstanceAccessControlAttributeConfigurationRequest, CreateInstanceAccessControlAttributeConfigurationResponse> createInstanceAccessControlAttributeConfiguration =
        genForCreateInstanceAccessControlAttributeConfiguration();

    private static HttpRequestDef<CreateInstanceAccessControlAttributeConfigurationRequest, CreateInstanceAccessControlAttributeConfigurationResponse> genForCreateInstanceAccessControlAttributeConfiguration() {
        // basic
        HttpRequestDef.Builder<CreateInstanceAccessControlAttributeConfigurationRequest, CreateInstanceAccessControlAttributeConfigurationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateInstanceAccessControlAttributeConfigurationRequest.class,
                    CreateInstanceAccessControlAttributeConfigurationResponse.class)
                .withName("CreateInstanceAccessControlAttributeConfiguration")
                .withUri("/v1/instances/{instance_id}/access-control-attribute-configuration")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateInstanceAccessControlAttributeConfigurationRequest::getInstanceId,
                CreateInstanceAccessControlAttributeConfigurationRequest::setInstanceId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateInstanceAccessControlAttributeConfigurationRequest::getXSecurityToken,
                CreateInstanceAccessControlAttributeConfigurationRequest::setXSecurityToken));
        builder.<CreateInstanceAccessControlAttributeConfigurationReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateInstanceAccessControlAttributeConfigurationReqBody.class),
            f -> f.withMarshaller(CreateInstanceAccessControlAttributeConfigurationRequest::getBody,
                CreateInstanceAccessControlAttributeConfigurationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteInstanceAccessControlAttributeConfigurationRequest, DeleteInstanceAccessControlAttributeConfigurationResponse> deleteInstanceAccessControlAttributeConfiguration =
        genForDeleteInstanceAccessControlAttributeConfiguration();

    private static HttpRequestDef<DeleteInstanceAccessControlAttributeConfigurationRequest, DeleteInstanceAccessControlAttributeConfigurationResponse> genForDeleteInstanceAccessControlAttributeConfiguration() {
        // basic
        HttpRequestDef.Builder<DeleteInstanceAccessControlAttributeConfigurationRequest, DeleteInstanceAccessControlAttributeConfigurationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteInstanceAccessControlAttributeConfigurationRequest.class,
                    DeleteInstanceAccessControlAttributeConfigurationResponse.class)
                .withName("DeleteInstanceAccessControlAttributeConfiguration")
                .withUri("/v1/instances/{instance_id}/access-control-attribute-configuration")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInstanceAccessControlAttributeConfigurationRequest::getInstanceId,
                DeleteInstanceAccessControlAttributeConfigurationRequest::setInstanceId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInstanceAccessControlAttributeConfigurationRequest::getXSecurityToken,
                DeleteInstanceAccessControlAttributeConfigurationRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DescribeInstanceAccessControlAttributeConfigurationRequest, DescribeInstanceAccessControlAttributeConfigurationResponse> describeInstanceAccessControlAttributeConfiguration =
        genForDescribeInstanceAccessControlAttributeConfiguration();

    private static HttpRequestDef<DescribeInstanceAccessControlAttributeConfigurationRequest, DescribeInstanceAccessControlAttributeConfigurationResponse> genForDescribeInstanceAccessControlAttributeConfiguration() {
        // basic
        HttpRequestDef.Builder<DescribeInstanceAccessControlAttributeConfigurationRequest, DescribeInstanceAccessControlAttributeConfigurationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    DescribeInstanceAccessControlAttributeConfigurationRequest.class,
                    DescribeInstanceAccessControlAttributeConfigurationResponse.class)
                .withName("DescribeInstanceAccessControlAttributeConfiguration")
                .withUri("/v1/instances/{instance_id}/access-control-attribute-configuration")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DescribeInstanceAccessControlAttributeConfigurationRequest::getInstanceId,
                DescribeInstanceAccessControlAttributeConfigurationRequest::setInstanceId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DescribeInstanceAccessControlAttributeConfigurationRequest::getXSecurityToken,
                DescribeInstanceAccessControlAttributeConfigurationRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceAccessControlAttributeConfigurationRequest, UpdateInstanceAccessControlAttributeConfigurationResponse> updateInstanceAccessControlAttributeConfiguration =
        genForUpdateInstanceAccessControlAttributeConfiguration();

    private static HttpRequestDef<UpdateInstanceAccessControlAttributeConfigurationRequest, UpdateInstanceAccessControlAttributeConfigurationResponse> genForUpdateInstanceAccessControlAttributeConfiguration() {
        // basic
        HttpRequestDef.Builder<UpdateInstanceAccessControlAttributeConfigurationRequest, UpdateInstanceAccessControlAttributeConfigurationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    UpdateInstanceAccessControlAttributeConfigurationRequest.class,
                    UpdateInstanceAccessControlAttributeConfigurationResponse.class)
                .withName("UpdateInstanceAccessControlAttributeConfiguration")
                .withUri("/v1/instances/{instance_id}/access-control-attribute-configuration")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceAccessControlAttributeConfigurationRequest::getInstanceId,
                UpdateInstanceAccessControlAttributeConfigurationRequest::setInstanceId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceAccessControlAttributeConfigurationRequest::getXSecurityToken,
                UpdateInstanceAccessControlAttributeConfigurationRequest::setXSecurityToken));
        builder.<UpdateInstanceAccessControlAttributeConfigurationReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateInstanceAccessControlAttributeConfigurationReqBody.class),
            f -> f.withMarshaller(UpdateInstanceAccessControlAttributeConfigurationRequest::getBody,
                UpdateInstanceAccessControlAttributeConfigurationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetMfaDeviceManagementForIdentityStoreRequest, GetMfaDeviceManagementForIdentityStoreResponse> getMfaDeviceManagementForIdentityStore =
        genForGetMfaDeviceManagementForIdentityStore();

    private static HttpRequestDef<GetMfaDeviceManagementForIdentityStoreRequest, GetMfaDeviceManagementForIdentityStoreResponse> genForGetMfaDeviceManagementForIdentityStore() {
        // basic
        HttpRequestDef.Builder<GetMfaDeviceManagementForIdentityStoreRequest, GetMfaDeviceManagementForIdentityStoreResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    GetMfaDeviceManagementForIdentityStoreRequest.class,
                    GetMfaDeviceManagementForIdentityStoreResponse.class)
                .withName("GetMfaDeviceManagementForIdentityStore")
                .withUri("/v1/instances/{instance_id}/mfa-devices/management-settings")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetMfaDeviceManagementForIdentityStoreRequest::getInstanceId,
                GetMfaDeviceManagementForIdentityStoreRequest::setInstanceId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetMfaDeviceManagementForIdentityStoreRequest::getXSecurityToken,
                GetMfaDeviceManagementForIdentityStoreRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PutMfaDeviceManagementForIdentityStoreRequest, PutMfaDeviceManagementForIdentityStoreResponse> putMfaDeviceManagementForIdentityStore =
        genForPutMfaDeviceManagementForIdentityStore();

    private static HttpRequestDef<PutMfaDeviceManagementForIdentityStoreRequest, PutMfaDeviceManagementForIdentityStoreResponse> genForPutMfaDeviceManagementForIdentityStore() {
        // basic
        HttpRequestDef.Builder<PutMfaDeviceManagementForIdentityStoreRequest, PutMfaDeviceManagementForIdentityStoreResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    PutMfaDeviceManagementForIdentityStoreRequest.class,
                    PutMfaDeviceManagementForIdentityStoreResponse.class)
                .withName("PutMfaDeviceManagementForIdentityStore")
                .withUri("/v1/instances/{instance_id}/mfa-devices/management-settings")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PutMfaDeviceManagementForIdentityStoreRequest::getInstanceId,
                PutMfaDeviceManagementForIdentityStoreRequest::setInstanceId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PutMfaDeviceManagementForIdentityStoreRequest::getXSecurityToken,
                PutMfaDeviceManagementForIdentityStoreRequest::setXSecurityToken));
        builder.<PutMfaDeviceManagementForDirectoryReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(PutMfaDeviceManagementForDirectoryReqBody.class),
            f -> f.withMarshaller(PutMfaDeviceManagementForIdentityStoreRequest::getBody,
                PutMfaDeviceManagementForIdentityStoreRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AttachManagedPolicyToPermissionSetRequest, AttachManagedPolicyToPermissionSetResponse> attachManagedPolicyToPermissionSet =
        genForAttachManagedPolicyToPermissionSet();

    private static HttpRequestDef<AttachManagedPolicyToPermissionSetRequest, AttachManagedPolicyToPermissionSetResponse> genForAttachManagedPolicyToPermissionSet() {
        // basic
        HttpRequestDef.Builder<AttachManagedPolicyToPermissionSetRequest, AttachManagedPolicyToPermissionSetResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    AttachManagedPolicyToPermissionSetRequest.class,
                    AttachManagedPolicyToPermissionSetResponse.class)
                .withName("AttachManagedPolicyToPermissionSet")
                .withUri("/v1/instances/{instance_id}/permission-sets/{permission_set_id}/attach-managed-policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AttachManagedPolicyToPermissionSetRequest::getInstanceId,
                AttachManagedPolicyToPermissionSetRequest::setInstanceId));
        builder.<String>withRequestField("permission_set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AttachManagedPolicyToPermissionSetRequest::getPermissionSetId,
                AttachManagedPolicyToPermissionSetRequest::setPermissionSetId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AttachManagedPolicyToPermissionSetRequest::getXSecurityToken,
                AttachManagedPolicyToPermissionSetRequest::setXSecurityToken));
        builder.<AttachManagedPolicyToPermissionSetReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(AttachManagedPolicyToPermissionSetReqBody.class),
            f -> f.withMarshaller(AttachManagedPolicyToPermissionSetRequest::getBody,
                AttachManagedPolicyToPermissionSetRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<AttachManagedRoleToPermissionSetRequest, AttachManagedRoleToPermissionSetResponse> attachManagedRoleToPermissionSet =
        genForAttachManagedRoleToPermissionSet();

    private static HttpRequestDef<AttachManagedRoleToPermissionSetRequest, AttachManagedRoleToPermissionSetResponse> genForAttachManagedRoleToPermissionSet() {
        // basic
        HttpRequestDef.Builder<AttachManagedRoleToPermissionSetRequest, AttachManagedRoleToPermissionSetResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    AttachManagedRoleToPermissionSetRequest.class,
                    AttachManagedRoleToPermissionSetResponse.class)
                .withName("AttachManagedRoleToPermissionSet")
                .withUri("/v1/instances/{instance_id}/permission-sets/{permission_set_id}/attach-managed-role")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AttachManagedRoleToPermissionSetRequest::getInstanceId,
                AttachManagedRoleToPermissionSetRequest::setInstanceId));
        builder.<String>withRequestField("permission_set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AttachManagedRoleToPermissionSetRequest::getPermissionSetId,
                AttachManagedRoleToPermissionSetRequest::setPermissionSetId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(AttachManagedRoleToPermissionSetRequest::getXSecurityToken,
                AttachManagedRoleToPermissionSetRequest::setXSecurityToken));
        builder.<ResourceAttachManagedPolicyToPermissionSetReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResourceAttachManagedPolicyToPermissionSetReqBody.class),
            f -> f.withMarshaller(AttachManagedRoleToPermissionSetRequest::getBody,
                AttachManagedRoleToPermissionSetRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePermissionSetRequest, CreatePermissionSetResponse> createPermissionSet =
        genForCreatePermissionSet();

    private static HttpRequestDef<CreatePermissionSetRequest, CreatePermissionSetResponse> genForCreatePermissionSet() {
        // basic
        HttpRequestDef.Builder<CreatePermissionSetRequest, CreatePermissionSetResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePermissionSetRequest.class, CreatePermissionSetResponse.class)
                .withName("CreatePermissionSet")
                .withUri("/v1/instances/{instance_id}/permission-sets")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePermissionSetRequest::getInstanceId,
                CreatePermissionSetRequest::setInstanceId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreatePermissionSetRequest::getXSecurityToken,
                CreatePermissionSetRequest::setXSecurityToken));
        builder.<CreatePermissionSetReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePermissionSetReqBody.class),
            f -> f.withMarshaller(CreatePermissionSetRequest::getBody, CreatePermissionSetRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCustomPolicyFromPermissionSetRequest, DeleteCustomPolicyFromPermissionSetResponse> deleteCustomPolicyFromPermissionSet =
        genForDeleteCustomPolicyFromPermissionSet();

    private static HttpRequestDef<DeleteCustomPolicyFromPermissionSetRequest, DeleteCustomPolicyFromPermissionSetResponse> genForDeleteCustomPolicyFromPermissionSet() {
        // basic
        HttpRequestDef.Builder<DeleteCustomPolicyFromPermissionSetRequest, DeleteCustomPolicyFromPermissionSetResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteCustomPolicyFromPermissionSetRequest.class,
                    DeleteCustomPolicyFromPermissionSetResponse.class)
                .withName("DeleteCustomPolicyFromPermissionSet")
                .withUri("/v1/instances/{instance_id}/permission-sets/{permission_set_id}/custom-policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCustomPolicyFromPermissionSetRequest::getInstanceId,
                DeleteCustomPolicyFromPermissionSetRequest::setInstanceId));
        builder.<String>withRequestField("permission_set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCustomPolicyFromPermissionSetRequest::getPermissionSetId,
                DeleteCustomPolicyFromPermissionSetRequest::setPermissionSetId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCustomPolicyFromPermissionSetRequest::getXSecurityToken,
                DeleteCustomPolicyFromPermissionSetRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCustomRoleFromPermissionSetRequest, DeleteCustomRoleFromPermissionSetResponse> deleteCustomRoleFromPermissionSet =
        genForDeleteCustomRoleFromPermissionSet();

    private static HttpRequestDef<DeleteCustomRoleFromPermissionSetRequest, DeleteCustomRoleFromPermissionSetResponse> genForDeleteCustomRoleFromPermissionSet() {
        // basic
        HttpRequestDef.Builder<DeleteCustomRoleFromPermissionSetRequest, DeleteCustomRoleFromPermissionSetResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteCustomRoleFromPermissionSetRequest.class,
                    DeleteCustomRoleFromPermissionSetResponse.class)
                .withName("DeleteCustomRoleFromPermissionSet")
                .withUri("/v1/instances/{instance_id}/permission-sets/{permission_set_id}/custom-role")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCustomRoleFromPermissionSetRequest::getInstanceId,
                DeleteCustomRoleFromPermissionSetRequest::setInstanceId));
        builder.<String>withRequestField("permission_set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCustomRoleFromPermissionSetRequest::getPermissionSetId,
                DeleteCustomRoleFromPermissionSetRequest::setPermissionSetId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCustomRoleFromPermissionSetRequest::getXSecurityToken,
                DeleteCustomRoleFromPermissionSetRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeletePermissionSetRequest, DeletePermissionSetResponse> deletePermissionSet =
        genForDeletePermissionSet();

    private static HttpRequestDef<DeletePermissionSetRequest, DeletePermissionSetResponse> genForDeletePermissionSet() {
        // basic
        HttpRequestDef.Builder<DeletePermissionSetRequest, DeletePermissionSetResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeletePermissionSetRequest.class, DeletePermissionSetResponse.class)
            .withName("DeletePermissionSet")
            .withUri("/v1/instances/{instance_id}/permission-sets/{permission_set_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePermissionSetRequest::getInstanceId,
                DeletePermissionSetRequest::setInstanceId));
        builder.<String>withRequestField("permission_set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePermissionSetRequest::getPermissionSetId,
                DeletePermissionSetRequest::setPermissionSetId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeletePermissionSetRequest::getXSecurityToken,
                DeletePermissionSetRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DescribePermissionSetRequest, DescribePermissionSetResponse> describePermissionSet =
        genForDescribePermissionSet();

    private static HttpRequestDef<DescribePermissionSetRequest, DescribePermissionSetResponse> genForDescribePermissionSet() {
        // basic
        HttpRequestDef.Builder<DescribePermissionSetRequest, DescribePermissionSetResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, DescribePermissionSetRequest.class, DescribePermissionSetResponse.class)
            .withName("DescribePermissionSet")
            .withUri("/v1/instances/{instance_id}/permission-sets/{permission_set_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DescribePermissionSetRequest::getInstanceId,
                DescribePermissionSetRequest::setInstanceId));
        builder.<String>withRequestField("permission_set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DescribePermissionSetRequest::getPermissionSetId,
                DescribePermissionSetRequest::setPermissionSetId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DescribePermissionSetRequest::getXSecurityToken,
                DescribePermissionSetRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DescribePermissionSetProvisioningStatusRequest, DescribePermissionSetProvisioningStatusResponse> describePermissionSetProvisioningStatus =
        genForDescribePermissionSetProvisioningStatus();

    private static HttpRequestDef<DescribePermissionSetProvisioningStatusRequest, DescribePermissionSetProvisioningStatusResponse> genForDescribePermissionSetProvisioningStatus() {
        // basic
        HttpRequestDef.Builder<DescribePermissionSetProvisioningStatusRequest, DescribePermissionSetProvisioningStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    DescribePermissionSetProvisioningStatusRequest.class,
                    DescribePermissionSetProvisioningStatusResponse.class)
                .withName("DescribePermissionSetProvisioningStatus")
                .withUri("/v1/instances/{instance_id}/permission-sets/provisioning-status/{request_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DescribePermissionSetProvisioningStatusRequest::getInstanceId,
                DescribePermissionSetProvisioningStatusRequest::setInstanceId));
        builder.<String>withRequestField("request_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DescribePermissionSetProvisioningStatusRequest::getRequestId,
                DescribePermissionSetProvisioningStatusRequest::setRequestId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DescribePermissionSetProvisioningStatusRequest::getXSecurityToken,
                DescribePermissionSetProvisioningStatusRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DetachManagedPolicyFromPermissionSetRequest, DetachManagedPolicyFromPermissionSetResponse> detachManagedPolicyFromPermissionSet =
        genForDetachManagedPolicyFromPermissionSet();

    private static HttpRequestDef<DetachManagedPolicyFromPermissionSetRequest, DetachManagedPolicyFromPermissionSetResponse> genForDetachManagedPolicyFromPermissionSet() {
        // basic
        HttpRequestDef.Builder<DetachManagedPolicyFromPermissionSetRequest, DetachManagedPolicyFromPermissionSetResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    DetachManagedPolicyFromPermissionSetRequest.class,
                    DetachManagedPolicyFromPermissionSetResponse.class)
                .withName("DetachManagedPolicyFromPermissionSet")
                .withUri("/v1/instances/{instance_id}/permission-sets/{permission_set_id}/detach-managed-policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DetachManagedPolicyFromPermissionSetRequest::getInstanceId,
                DetachManagedPolicyFromPermissionSetRequest::setInstanceId));
        builder.<String>withRequestField("permission_set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DetachManagedPolicyFromPermissionSetRequest::getPermissionSetId,
                DetachManagedPolicyFromPermissionSetRequest::setPermissionSetId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DetachManagedPolicyFromPermissionSetRequest::getXSecurityToken,
                DetachManagedPolicyFromPermissionSetRequest::setXSecurityToken));
        builder.<DetachManagedPolicyFromPermissionSetReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DetachManagedPolicyFromPermissionSetReqBody.class),
            f -> f.withMarshaller(DetachManagedPolicyFromPermissionSetRequest::getBody,
                DetachManagedPolicyFromPermissionSetRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DetachManagedRoleFromPermissionSetRequest, DetachManagedRoleFromPermissionSetResponse> detachManagedRoleFromPermissionSet =
        genForDetachManagedRoleFromPermissionSet();

    private static HttpRequestDef<DetachManagedRoleFromPermissionSetRequest, DetachManagedRoleFromPermissionSetResponse> genForDetachManagedRoleFromPermissionSet() {
        // basic
        HttpRequestDef.Builder<DetachManagedRoleFromPermissionSetRequest, DetachManagedRoleFromPermissionSetResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    DetachManagedRoleFromPermissionSetRequest.class,
                    DetachManagedRoleFromPermissionSetResponse.class)
                .withName("DetachManagedRoleFromPermissionSet")
                .withUri("/v1/instances/{instance_id}/permission-sets/{permission_set_id}/detach-managed-role")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DetachManagedRoleFromPermissionSetRequest::getInstanceId,
                DetachManagedRoleFromPermissionSetRequest::setInstanceId));
        builder.<String>withRequestField("permission_set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DetachManagedRoleFromPermissionSetRequest::getPermissionSetId,
                DetachManagedRoleFromPermissionSetRequest::setPermissionSetId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DetachManagedRoleFromPermissionSetRequest::getXSecurityToken,
                DetachManagedRoleFromPermissionSetRequest::setXSecurityToken));
        builder.<ResourceDetachManagedPolicyFromPermissionSetReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ResourceDetachManagedPolicyFromPermissionSetReqBody.class),
            f -> f.withMarshaller(DetachManagedRoleFromPermissionSetRequest::getBody,
                DetachManagedRoleFromPermissionSetRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetCustomPolicyForPermissionSetRequest, GetCustomPolicyForPermissionSetResponse> getCustomPolicyForPermissionSet =
        genForGetCustomPolicyForPermissionSet();

    private static HttpRequestDef<GetCustomPolicyForPermissionSetRequest, GetCustomPolicyForPermissionSetResponse> genForGetCustomPolicyForPermissionSet() {
        // basic
        HttpRequestDef.Builder<GetCustomPolicyForPermissionSetRequest, GetCustomPolicyForPermissionSetResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    GetCustomPolicyForPermissionSetRequest.class,
                    GetCustomPolicyForPermissionSetResponse.class)
                .withName("GetCustomPolicyForPermissionSet")
                .withUri("/v1/instances/{instance_id}/permission-sets/{permission_set_id}/custom-policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetCustomPolicyForPermissionSetRequest::getInstanceId,
                GetCustomPolicyForPermissionSetRequest::setInstanceId));
        builder.<String>withRequestField("permission_set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetCustomPolicyForPermissionSetRequest::getPermissionSetId,
                GetCustomPolicyForPermissionSetRequest::setPermissionSetId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetCustomPolicyForPermissionSetRequest::getXSecurityToken,
                GetCustomPolicyForPermissionSetRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetCustomRoleForPermissionSetRequest, GetCustomRoleForPermissionSetResponse> getCustomRoleForPermissionSet =
        genForGetCustomRoleForPermissionSet();

    private static HttpRequestDef<GetCustomRoleForPermissionSetRequest, GetCustomRoleForPermissionSetResponse> genForGetCustomRoleForPermissionSet() {
        // basic
        HttpRequestDef.Builder<GetCustomRoleForPermissionSetRequest, GetCustomRoleForPermissionSetResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    GetCustomRoleForPermissionSetRequest.class,
                    GetCustomRoleForPermissionSetResponse.class)
                .withName("GetCustomRoleForPermissionSet")
                .withUri("/v1/instances/{instance_id}/permission-sets/{permission_set_id}/custom-role")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetCustomRoleForPermissionSetRequest::getInstanceId,
                GetCustomRoleForPermissionSetRequest::setInstanceId));
        builder.<String>withRequestField("permission_set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetCustomRoleForPermissionSetRequest::getPermissionSetId,
                GetCustomRoleForPermissionSetRequest::setPermissionSetId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetCustomRoleForPermissionSetRequest::getXSecurityToken,
                GetCustomRoleForPermissionSetRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<GetPermissionSetSummaryRequest, GetPermissionSetSummaryResponse> getPermissionSetSummary =
        genForGetPermissionSetSummary();

    private static HttpRequestDef<GetPermissionSetSummaryRequest, GetPermissionSetSummaryResponse> genForGetPermissionSetSummary() {
        // basic
        HttpRequestDef.Builder<GetPermissionSetSummaryRequest, GetPermissionSetSummaryResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, GetPermissionSetSummaryRequest.class, GetPermissionSetSummaryResponse.class)
            .withName("GetPermissionSetSummary")
            .withUri("/v1/instances/{instance_id}/permission-set-summary")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetPermissionSetSummaryRequest::getInstanceId,
                GetPermissionSetSummaryRequest::setInstanceId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(GetPermissionSetSummaryRequest::getXSecurityToken,
                GetPermissionSetSummaryRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAccountsForProvisionedPermissionSetRequest, ListAccountsForProvisionedPermissionSetResponse> listAccountsForProvisionedPermissionSet =
        genForListAccountsForProvisionedPermissionSet();

    private static HttpRequestDef<ListAccountsForProvisionedPermissionSetRequest, ListAccountsForProvisionedPermissionSetResponse> genForListAccountsForProvisionedPermissionSet() {
        // basic
        HttpRequestDef.Builder<ListAccountsForProvisionedPermissionSetRequest, ListAccountsForProvisionedPermissionSetResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListAccountsForProvisionedPermissionSetRequest.class,
                    ListAccountsForProvisionedPermissionSetResponse.class)
                .withName("ListAccountsForProvisionedPermissionSet")
                .withUri("/v1/instances/{instance_id}/permission-sets/{permission_set_id}/accounts")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccountsForProvisionedPermissionSetRequest::getInstanceId,
                ListAccountsForProvisionedPermissionSetRequest::setInstanceId));
        builder.<String>withRequestField("permission_set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccountsForProvisionedPermissionSetRequest::getPermissionSetId,
                ListAccountsForProvisionedPermissionSetRequest::setPermissionSetId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListAccountsForProvisionedPermissionSetRequest::getLimit,
                ListAccountsForProvisionedPermissionSetRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccountsForProvisionedPermissionSetRequest::getMarker,
                ListAccountsForProvisionedPermissionSetRequest::setMarker));
        builder.<ListAccountsForProvisionedPermissionSetRequest.ProvisioningStatusEnum>withRequestField(
            "provisioning_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListAccountsForProvisionedPermissionSetRequest.ProvisioningStatusEnum.class),
            f -> f.withMarshaller(ListAccountsForProvisionedPermissionSetRequest::getProvisioningStatus,
                ListAccountsForProvisionedPermissionSetRequest::setProvisioningStatus));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListAccountsForProvisionedPermissionSetRequest::getXSecurityToken,
                ListAccountsForProvisionedPermissionSetRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListManagedPoliciesInPermissionSetRequest, ListManagedPoliciesInPermissionSetResponse> listManagedPoliciesInPermissionSet =
        genForListManagedPoliciesInPermissionSet();

    private static HttpRequestDef<ListManagedPoliciesInPermissionSetRequest, ListManagedPoliciesInPermissionSetResponse> genForListManagedPoliciesInPermissionSet() {
        // basic
        HttpRequestDef.Builder<ListManagedPoliciesInPermissionSetRequest, ListManagedPoliciesInPermissionSetResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListManagedPoliciesInPermissionSetRequest.class,
                    ListManagedPoliciesInPermissionSetResponse.class)
                .withName("ListManagedPoliciesInPermissionSet")
                .withUri("/v1/instances/{instance_id}/permission-sets/{permission_set_id}/managed-policies")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListManagedPoliciesInPermissionSetRequest::getInstanceId,
                ListManagedPoliciesInPermissionSetRequest::setInstanceId));
        builder.<String>withRequestField("permission_set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListManagedPoliciesInPermissionSetRequest::getPermissionSetId,
                ListManagedPoliciesInPermissionSetRequest::setPermissionSetId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListManagedPoliciesInPermissionSetRequest::getLimit,
                ListManagedPoliciesInPermissionSetRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListManagedPoliciesInPermissionSetRequest::getMarker,
                ListManagedPoliciesInPermissionSetRequest::setMarker));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListManagedPoliciesInPermissionSetRequest::getXSecurityToken,
                ListManagedPoliciesInPermissionSetRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListManagedRolesInPermissionSetRequest, ListManagedRolesInPermissionSetResponse> listManagedRolesInPermissionSet =
        genForListManagedRolesInPermissionSet();

    private static HttpRequestDef<ListManagedRolesInPermissionSetRequest, ListManagedRolesInPermissionSetResponse> genForListManagedRolesInPermissionSet() {
        // basic
        HttpRequestDef.Builder<ListManagedRolesInPermissionSetRequest, ListManagedRolesInPermissionSetResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListManagedRolesInPermissionSetRequest.class,
                    ListManagedRolesInPermissionSetResponse.class)
                .withName("ListManagedRolesInPermissionSet")
                .withUri("/v1/instances/{instance_id}/permission-sets/{permission_set_id}/managed-roles")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListManagedRolesInPermissionSetRequest::getInstanceId,
                ListManagedRolesInPermissionSetRequest::setInstanceId));
        builder.<String>withRequestField("permission_set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListManagedRolesInPermissionSetRequest::getPermissionSetId,
                ListManagedRolesInPermissionSetRequest::setPermissionSetId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListManagedRolesInPermissionSetRequest::getLimit,
                ListManagedRolesInPermissionSetRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListManagedRolesInPermissionSetRequest::getMarker,
                ListManagedRolesInPermissionSetRequest::setMarker));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListManagedRolesInPermissionSetRequest::getXSecurityToken,
                ListManagedRolesInPermissionSetRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPermissionSetProvisioningStatusRequest, ListPermissionSetProvisioningStatusResponse> listPermissionSetProvisioningStatus =
        genForListPermissionSetProvisioningStatus();

    private static HttpRequestDef<ListPermissionSetProvisioningStatusRequest, ListPermissionSetProvisioningStatusResponse> genForListPermissionSetProvisioningStatus() {
        // basic
        HttpRequestDef.Builder<ListPermissionSetProvisioningStatusRequest, ListPermissionSetProvisioningStatusResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListPermissionSetProvisioningStatusRequest.class,
                    ListPermissionSetProvisioningStatusResponse.class)
                .withName("ListPermissionSetProvisioningStatus")
                .withUri("/v1/instances/{instance_id}/permission-sets/provisioning-statuses")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPermissionSetProvisioningStatusRequest::getInstanceId,
                ListPermissionSetProvisioningStatusRequest::setInstanceId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPermissionSetProvisioningStatusRequest::getLimit,
                ListPermissionSetProvisioningStatusRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPermissionSetProvisioningStatusRequest::getMarker,
                ListPermissionSetProvisioningStatusRequest::setMarker));
        builder.<ListPermissionSetProvisioningStatusRequest.StatusEnum>withRequestField("status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListPermissionSetProvisioningStatusRequest.StatusEnum.class),
            f -> f.withMarshaller(ListPermissionSetProvisioningStatusRequest::getStatus,
                ListPermissionSetProvisioningStatusRequest::setStatus));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPermissionSetProvisioningStatusRequest::getXSecurityToken,
                ListPermissionSetProvisioningStatusRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPermissionSetsRequest, ListPermissionSetsResponse> listPermissionSets =
        genForListPermissionSets();

    private static HttpRequestDef<ListPermissionSetsRequest, ListPermissionSetsResponse> genForListPermissionSets() {
        // basic
        HttpRequestDef.Builder<ListPermissionSetsRequest, ListPermissionSetsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListPermissionSetsRequest.class, ListPermissionSetsResponse.class)
                .withName("ListPermissionSets")
                .withUri("/v1/instances/{instance_id}/permission-sets")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPermissionSetsRequest::getInstanceId, ListPermissionSetsRequest::setInstanceId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPermissionSetsRequest::getLimit, ListPermissionSetsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPermissionSetsRequest::getMarker, ListPermissionSetsRequest::setMarker));
        builder.<String>withRequestField("permission_set_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPermissionSetsRequest::getPermissionSetId,
                ListPermissionSetsRequest::setPermissionSetId));
        builder.<String>withRequestField("permission_urn",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPermissionSetsRequest::getPermissionUrn,
                ListPermissionSetsRequest::setPermissionUrn));
        builder.<String>withRequestField("name",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPermissionSetsRequest::getName, ListPermissionSetsRequest::setName));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPermissionSetsRequest::getXSecurityToken,
                ListPermissionSetsRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPermissionSetsProvisionedToAccountRequest, ListPermissionSetsProvisionedToAccountResponse> listPermissionSetsProvisionedToAccount =
        genForListPermissionSetsProvisionedToAccount();

    private static HttpRequestDef<ListPermissionSetsProvisionedToAccountRequest, ListPermissionSetsProvisionedToAccountResponse> genForListPermissionSetsProvisionedToAccount() {
        // basic
        HttpRequestDef.Builder<ListPermissionSetsProvisionedToAccountRequest, ListPermissionSetsProvisionedToAccountResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListPermissionSetsProvisionedToAccountRequest.class,
                    ListPermissionSetsProvisionedToAccountResponse.class)
                .withName("ListPermissionSetsProvisionedToAccount")
                .withUri("/v1/instances/{instance_id}/permission-sets/provisioned-to-accounts")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPermissionSetsProvisionedToAccountRequest::getInstanceId,
                ListPermissionSetsProvisionedToAccountRequest::setInstanceId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListPermissionSetsProvisionedToAccountRequest::getLimit,
                ListPermissionSetsProvisionedToAccountRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPermissionSetsProvisionedToAccountRequest::getMarker,
                ListPermissionSetsProvisionedToAccountRequest::setMarker));
        builder.<String>withRequestField("account_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPermissionSetsProvisionedToAccountRequest::getAccountId,
                ListPermissionSetsProvisionedToAccountRequest::setAccountId));
        builder.<ListPermissionSetsProvisionedToAccountRequest.ProvisioningStatusEnum>withRequestField(
            "provisioning_status",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListPermissionSetsProvisionedToAccountRequest.ProvisioningStatusEnum.class),
            f -> f.withMarshaller(ListPermissionSetsProvisionedToAccountRequest::getProvisioningStatus,
                ListPermissionSetsProvisionedToAccountRequest::setProvisioningStatus));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListPermissionSetsProvisionedToAccountRequest::getXSecurityToken,
                ListPermissionSetsProvisionedToAccountRequest::setXSecurityToken));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ProvisionPermissionSetRequest, ProvisionPermissionSetResponse> provisionPermissionSet =
        genForProvisionPermissionSet();

    private static HttpRequestDef<ProvisionPermissionSetRequest, ProvisionPermissionSetResponse> genForProvisionPermissionSet() {
        // basic
        HttpRequestDef.Builder<ProvisionPermissionSetRequest, ProvisionPermissionSetResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, ProvisionPermissionSetRequest.class, ProvisionPermissionSetResponse.class)
            .withName("ProvisionPermissionSet")
            .withUri("/v1/instances/{instance_id}/permission-sets/{permission_set_id}/provision")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ProvisionPermissionSetRequest::getInstanceId,
                ProvisionPermissionSetRequest::setInstanceId));
        builder.<String>withRequestField("permission_set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ProvisionPermissionSetRequest::getPermissionSetId,
                ProvisionPermissionSetRequest::setPermissionSetId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ProvisionPermissionSetRequest::getXSecurityToken,
                ProvisionPermissionSetRequest::setXSecurityToken));
        builder.<ProvisionPermissionSetReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ProvisionPermissionSetReqBody.class),
            f -> f.withMarshaller(ProvisionPermissionSetRequest::getBody, ProvisionPermissionSetRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PutCustomPolicyToPermissionSetRequest, PutCustomPolicyToPermissionSetResponse> putCustomPolicyToPermissionSet =
        genForPutCustomPolicyToPermissionSet();

    private static HttpRequestDef<PutCustomPolicyToPermissionSetRequest, PutCustomPolicyToPermissionSetResponse> genForPutCustomPolicyToPermissionSet() {
        // basic
        HttpRequestDef.Builder<PutCustomPolicyToPermissionSetRequest, PutCustomPolicyToPermissionSetResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    PutCustomPolicyToPermissionSetRequest.class,
                    PutCustomPolicyToPermissionSetResponse.class)
                .withName("PutCustomPolicyToPermissionSet")
                .withUri("/v1/instances/{instance_id}/permission-sets/{permission_set_id}/custom-policy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PutCustomPolicyToPermissionSetRequest::getInstanceId,
                PutCustomPolicyToPermissionSetRequest::setInstanceId));
        builder.<String>withRequestField("permission_set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PutCustomPolicyToPermissionSetRequest::getPermissionSetId,
                PutCustomPolicyToPermissionSetRequest::setPermissionSetId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PutCustomPolicyToPermissionSetRequest::getXSecurityToken,
                PutCustomPolicyToPermissionSetRequest::setXSecurityToken));
        builder.<PutCustomPolicyToPermissionSetReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PutCustomPolicyToPermissionSetReqBody.class),
            f -> f.withMarshaller(PutCustomPolicyToPermissionSetRequest::getBody,
                PutCustomPolicyToPermissionSetRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<PutCustomRoleToPermissionSetRequest, PutCustomRoleToPermissionSetResponse> putCustomRoleToPermissionSet =
        genForPutCustomRoleToPermissionSet();

    private static HttpRequestDef<PutCustomRoleToPermissionSetRequest, PutCustomRoleToPermissionSetResponse> genForPutCustomRoleToPermissionSet() {
        // basic
        HttpRequestDef.Builder<PutCustomRoleToPermissionSetRequest, PutCustomRoleToPermissionSetResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    PutCustomRoleToPermissionSetRequest.class,
                    PutCustomRoleToPermissionSetResponse.class)
                .withName("PutCustomRoleToPermissionSet")
                .withUri("/v1/instances/{instance_id}/permission-sets/{permission_set_id}/custom-role")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PutCustomRoleToPermissionSetRequest::getInstanceId,
                PutCustomRoleToPermissionSetRequest::setInstanceId));
        builder.<String>withRequestField("permission_set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PutCustomRoleToPermissionSetRequest::getPermissionSetId,
                PutCustomRoleToPermissionSetRequest::setPermissionSetId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(PutCustomRoleToPermissionSetRequest::getXSecurityToken,
                PutCustomRoleToPermissionSetRequest::setXSecurityToken));
        builder.<PutCustomRoleToPermissionSetReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(PutCustomRoleToPermissionSetReqBody.class),
            f -> f.withMarshaller(PutCustomRoleToPermissionSetRequest::getBody,
                PutCustomRoleToPermissionSetRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdatePermissionSetRequest, UpdatePermissionSetResponse> updatePermissionSet =
        genForUpdatePermissionSet();

    private static HttpRequestDef<UpdatePermissionSetRequest, UpdatePermissionSetResponse> genForUpdatePermissionSet() {
        // basic
        HttpRequestDef.Builder<UpdatePermissionSetRequest, UpdatePermissionSetResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdatePermissionSetRequest.class, UpdatePermissionSetResponse.class)
                .withName("UpdatePermissionSet")
                .withUri("/v1/instances/{instance_id}/permission-sets/{permission_set_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePermissionSetRequest::getInstanceId,
                UpdatePermissionSetRequest::setInstanceId));
        builder.<String>withRequestField("permission_set_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePermissionSetRequest::getPermissionSetId,
                UpdatePermissionSetRequest::setPermissionSetId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdatePermissionSetRequest::getXSecurityToken,
                UpdatePermissionSetRequest::setXSecurityToken));
        builder.<UpdatePermissionSetReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdatePermissionSetReqBody.class),
            f -> f.withMarshaller(UpdatePermissionSetRequest::getBody, UpdatePermissionSetRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTagResourceRequest, CreateTagResourceResponse> createTagResource =
        genForCreateTagResource();

    private static HttpRequestDef<CreateTagResourceRequest, CreateTagResourceResponse> genForCreateTagResource() {
        // basic
        HttpRequestDef.Builder<CreateTagResourceRequest, CreateTagResourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTagResourceRequest.class, CreateTagResourceResponse.class)
                .withName("CreateTagResource")
                .withUri("/v1/instances/{resource_type}/{resource_id}/tags/create")
                .withContentType("application/json");

        // requests
        builder.<CreateTagResourceRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTagResourceRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(CreateTagResourceRequest::getResourceType,
                CreateTagResourceRequest::setResourceType));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTagResourceRequest::getResourceId, CreateTagResourceRequest::setResourceId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTagResourceRequest::getXSecurityToken,
                CreateTagResourceRequest::setXSecurityToken));
        builder.<TagResourceReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(TagResourceReqBody.class),
            f -> f.withMarshaller(CreateTagResourceRequest::getBody, CreateTagResourceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTagResourceRequest, DeleteTagResourceResponse> deleteTagResource =
        genForDeleteTagResource();

    private static HttpRequestDef<DeleteTagResourceRequest, DeleteTagResourceResponse> genForDeleteTagResource() {
        // basic
        HttpRequestDef.Builder<DeleteTagResourceRequest, DeleteTagResourceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteTagResourceRequest.class, DeleteTagResourceResponse.class)
                .withName("DeleteTagResource")
                .withUri("/v1/instances/{resource_type}/{resource_id}/tags/delete")
                .withContentType("application/json");

        // requests
        builder.<DeleteTagResourceRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteTagResourceRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(DeleteTagResourceRequest::getResourceType,
                DeleteTagResourceRequest::setResourceType));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTagResourceRequest::getResourceId, DeleteTagResourceRequest::setResourceId));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTagResourceRequest::getXSecurityToken,
                DeleteTagResourceRequest::setXSecurityToken));
        builder.<DeleteTagResourceReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeleteTagResourceReqBody.class),
            f -> f.withMarshaller(DeleteTagResourceRequest::getBody, DeleteTagResourceRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTagResourcesRequest, ListTagResourcesResponse> listTagResources =
        genForListTagResources();

    private static HttpRequestDef<ListTagResourcesRequest, ListTagResourcesResponse> genForListTagResources() {
        // basic
        HttpRequestDef.Builder<ListTagResourcesRequest, ListTagResourcesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTagResourcesRequest.class, ListTagResourcesResponse.class)
                .withName("ListTagResources")
                .withUri("/v1/instances/{resource_type}/{resource_id}/tags")
                .withContentType("application/json");

        // requests
        builder.<ListTagResourcesRequest.ResourceTypeEnum>withRequestField("resource_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ListTagResourcesRequest.ResourceTypeEnum.class),
            f -> f.withMarshaller(ListTagResourcesRequest::getResourceType, ListTagResourcesRequest::setResourceType));
        builder.<String>withRequestField("resource_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTagResourcesRequest::getResourceId, ListTagResourcesRequest::setResourceId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListTagResourcesRequest::getLimit, ListTagResourcesRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTagResourcesRequest::getMarker, ListTagResourcesRequest::setMarker));
        builder.<String>withRequestField("X-Security-Token",
            LocationType.Header,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTagResourcesRequest::getXSecurityToken,
                ListTagResourcesRequest::setXSecurityToken));

        // response

        return builder.build();
    }

}
