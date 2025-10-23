package com.huaweicloud.sdk.codehub.v4;

import com.huaweicloud.sdk.codehub.v4.model.AddGroupWebhookRequest;
import com.huaweicloud.sdk.codehub.v4.model.AddGroupWebhookResponse;
import com.huaweicloud.sdk.codehub.v4.model.AddProjectWebhookRequest;
import com.huaweicloud.sdk.codehub.v4.model.AddProjectWebhookResponse;
import com.huaweicloud.sdk.codehub.v4.model.AddRepositoryMembersRequest;
import com.huaweicloud.sdk.codehub.v4.model.AddRepositoryMembersResponse;
import com.huaweicloud.sdk.codehub.v4.model.AddRepositoryWebhookRequest;
import com.huaweicloud.sdk.codehub.v4.model.AddRepositoryWebhookResponse;
import com.huaweicloud.sdk.codehub.v4.model.AddSshKeyRequest;
import com.huaweicloud.sdk.codehub.v4.model.AddSshKeyResponse;
import com.huaweicloud.sdk.codehub.v4.model.AddSubmoduleRequest;
import com.huaweicloud.sdk.codehub.v4.model.AddSubmoduleResponse;
import com.huaweicloud.sdk.codehub.v4.model.AddTenantTrustedIpAddressRequest;
import com.huaweicloud.sdk.codehub.v4.model.AddTenantTrustedIpAddressResponse;
import com.huaweicloud.sdk.codehub.v4.model.AddTrustedIpAddressRequest;
import com.huaweicloud.sdk.codehub.v4.model.AddTrustedIpAddressResponse;
import com.huaweicloud.sdk.codehub.v4.model.ApprovalMergeRequestRequest;
import com.huaweicloud.sdk.codehub.v4.model.ApprovalMergeRequestResponse;
import com.huaweicloud.sdk.codehub.v4.model.AssociateGroupUserGroupRequest;
import com.huaweicloud.sdk.codehub.v4.model.AssociateGroupUserGroupResponse;
import com.huaweicloud.sdk.codehub.v4.model.AssociateRemoteMirrorRequest;
import com.huaweicloud.sdk.codehub.v4.model.AssociateRemoteMirrorResponse;
import com.huaweicloud.sdk.codehub.v4.model.AssociateRepositoryUserGroupRequest;
import com.huaweicloud.sdk.codehub.v4.model.AssociateRepositoryUserGroupResponse;
import com.huaweicloud.sdk.codehub.v4.model.BatchCreateProtectedBranchRequest;
import com.huaweicloud.sdk.codehub.v4.model.BatchCreateProtectedBranchResponse;
import com.huaweicloud.sdk.codehub.v4.model.BatchCreateProtectedTagsRequest;
import com.huaweicloud.sdk.codehub.v4.model.BatchCreateProtectedTagsResponse;
import com.huaweicloud.sdk.codehub.v4.model.BatchDeleteBranchRequest;
import com.huaweicloud.sdk.codehub.v4.model.BatchDeleteBranchResponse;
import com.huaweicloud.sdk.codehub.v4.model.BatchDeleteProtectedBranchesRequest;
import com.huaweicloud.sdk.codehub.v4.model.BatchDeleteProtectedBranchesResponse;
import com.huaweicloud.sdk.codehub.v4.model.BatchDeleteProtectedTagsRequest;
import com.huaweicloud.sdk.codehub.v4.model.BatchDeleteProtectedTagsResponse;
import com.huaweicloud.sdk.codehub.v4.model.BatchDeleteRepositoryFilePushPermissionsRequest;
import com.huaweicloud.sdk.codehub.v4.model.BatchDeleteRepositoryFilePushPermissionsResponse;
import com.huaweicloud.sdk.codehub.v4.model.BatchUpdateProtectedBranchesRequest;
import com.huaweicloud.sdk.codehub.v4.model.BatchUpdateProtectedBranchesResponse;
import com.huaweicloud.sdk.codehub.v4.model.BatchUpdateProtectedTagsRequest;
import com.huaweicloud.sdk.codehub.v4.model.BatchUpdateProtectedTagsResponse;
import com.huaweicloud.sdk.codehub.v4.model.BatchUpdateRepositoryFilePushPermissionsRequest;
import com.huaweicloud.sdk.codehub.v4.model.BatchUpdateRepositoryFilePushPermissionsResponse;
import com.huaweicloud.sdk.codehub.v4.model.BatchValidateRepoNamesRequest;
import com.huaweicloud.sdk.codehub.v4.model.BatchValidateRepoNamesResponse;
import com.huaweicloud.sdk.codehub.v4.model.BatchValidateUserGroupPermissionsRequest;
import com.huaweicloud.sdk.codehub.v4.model.BatchValidateUserGroupPermissionsResponse;
import com.huaweicloud.sdk.codehub.v4.model.CheckDeployKeyRequest;
import com.huaweicloud.sdk.codehub.v4.model.CheckDeployKeyResponse;
import com.huaweicloud.sdk.codehub.v4.model.CheckGroupDeployKeyRequest;
import com.huaweicloud.sdk.codehub.v4.model.CheckGroupDeployKeyResponse;
import com.huaweicloud.sdk.codehub.v4.model.CreateBranchRequest;
import com.huaweicloud.sdk.codehub.v4.model.CreateBranchResponse;
import com.huaweicloud.sdk.codehub.v4.model.CreateCherryPickMergeRequestRequest;
import com.huaweicloud.sdk.codehub.v4.model.CreateCherryPickMergeRequestResponse;
import com.huaweicloud.sdk.codehub.v4.model.CreateCommitRequest;
import com.huaweicloud.sdk.codehub.v4.model.CreateCommitResponse;
import com.huaweicloud.sdk.codehub.v4.model.CreateCommitRevertRequest;
import com.huaweicloud.sdk.codehub.v4.model.CreateCommitRevertResponse;
import com.huaweicloud.sdk.codehub.v4.model.CreateDirRequest;
import com.huaweicloud.sdk.codehub.v4.model.CreateDirResponse;
import com.huaweicloud.sdk.codehub.v4.model.CreateFilePushPermissionRequest;
import com.huaweicloud.sdk.codehub.v4.model.CreateFilePushPermissionResponse;
import com.huaweicloud.sdk.codehub.v4.model.CreateFileRequest;
import com.huaweicloud.sdk.codehub.v4.model.CreateFileResponse;
import com.huaweicloud.sdk.codehub.v4.model.CreateGroupMergeRequestApproverSettingRequest;
import com.huaweicloud.sdk.codehub.v4.model.CreateGroupMergeRequestApproverSettingResponse;
import com.huaweicloud.sdk.codehub.v4.model.CreateGroupMergeRequestTemplateRequest;
import com.huaweicloud.sdk.codehub.v4.model.CreateGroupMergeRequestTemplateResponse;
import com.huaweicloud.sdk.codehub.v4.model.CreateGroupRequest;
import com.huaweicloud.sdk.codehub.v4.model.CreateGroupResponse;
import com.huaweicloud.sdk.codehub.v4.model.CreateMergeRequestApproverSettingRequest;
import com.huaweicloud.sdk.codehub.v4.model.CreateMergeRequestApproverSettingResponse;
import com.huaweicloud.sdk.codehub.v4.model.CreateMergeRequestDiscussionRequest;
import com.huaweicloud.sdk.codehub.v4.model.CreateMergeRequestDiscussionResponse;
import com.huaweicloud.sdk.codehub.v4.model.CreateMergeRequestDiscussionResponseRequest;
import com.huaweicloud.sdk.codehub.v4.model.CreateMergeRequestDiscussionResponseResponse;
import com.huaweicloud.sdk.codehub.v4.model.CreateMergeRequestRequest;
import com.huaweicloud.sdk.codehub.v4.model.CreateMergeRequestResponse;
import com.huaweicloud.sdk.codehub.v4.model.CreateMergeRequestTemplateRequest;
import com.huaweicloud.sdk.codehub.v4.model.CreateMergeRequestTemplateResponse;
import com.huaweicloud.sdk.codehub.v4.model.CreateProjectMergeRequestApproverSettingRequest;
import com.huaweicloud.sdk.codehub.v4.model.CreateProjectMergeRequestApproverSettingResponse;
import com.huaweicloud.sdk.codehub.v4.model.CreateProjectMergeRequestTemplateRequest;
import com.huaweicloud.sdk.codehub.v4.model.CreateProjectMergeRequestTemplateResponse;
import com.huaweicloud.sdk.codehub.v4.model.CreateProjectProtectedBranchesRequest;
import com.huaweicloud.sdk.codehub.v4.model.CreateProjectProtectedBranchesResponse;
import com.huaweicloud.sdk.codehub.v4.model.CreateProjectProtectedTagsRequest;
import com.huaweicloud.sdk.codehub.v4.model.CreateProjectProtectedTagsResponse;
import com.huaweicloud.sdk.codehub.v4.model.CreateRepositoryCommitRuleRequest;
import com.huaweicloud.sdk.codehub.v4.model.CreateRepositoryCommitRuleResponse;
import com.huaweicloud.sdk.codehub.v4.model.CreateRepositoryLabelRequest;
import com.huaweicloud.sdk.codehub.v4.model.CreateRepositoryLabelResponse;
import com.huaweicloud.sdk.codehub.v4.model.CreateRepositorySystemLabelsRequest;
import com.huaweicloud.sdk.codehub.v4.model.CreateRepositorySystemLabelsResponse;
import com.huaweicloud.sdk.codehub.v4.model.CreateReviewSettingRequest;
import com.huaweicloud.sdk.codehub.v4.model.CreateReviewSettingResponse;
import com.huaweicloud.sdk.codehub.v4.model.CreateTagRequest;
import com.huaweicloud.sdk.codehub.v4.model.CreateTagResponse;
import com.huaweicloud.sdk.codehub.v4.model.DeleteBranchRequest;
import com.huaweicloud.sdk.codehub.v4.model.DeleteBranchResponse;
import com.huaweicloud.sdk.codehub.v4.model.DeleteFileRequest;
import com.huaweicloud.sdk.codehub.v4.model.DeleteFileResponse;
import com.huaweicloud.sdk.codehub.v4.model.DeleteGroupMergeRequestApproverSettingRequest;
import com.huaweicloud.sdk.codehub.v4.model.DeleteGroupMergeRequestApproverSettingResponse;
import com.huaweicloud.sdk.codehub.v4.model.DeleteGroupMergeRequestTemplateRequest;
import com.huaweicloud.sdk.codehub.v4.model.DeleteGroupMergeRequestTemplateResponse;
import com.huaweicloud.sdk.codehub.v4.model.DeleteGroupRequest;
import com.huaweicloud.sdk.codehub.v4.model.DeleteGroupResponse;
import com.huaweicloud.sdk.codehub.v4.model.DeleteMergeRequestApproverSettingRequest;
import com.huaweicloud.sdk.codehub.v4.model.DeleteMergeRequestApproverSettingResponse;
import com.huaweicloud.sdk.codehub.v4.model.DeleteMergeRequestDiscussionRequest;
import com.huaweicloud.sdk.codehub.v4.model.DeleteMergeRequestDiscussionResponse;
import com.huaweicloud.sdk.codehub.v4.model.DeleteMergeRequestTemplateRequest;
import com.huaweicloud.sdk.codehub.v4.model.DeleteMergeRequestTemplateResponse;
import com.huaweicloud.sdk.codehub.v4.model.DeleteMergeRequestVoteRequest;
import com.huaweicloud.sdk.codehub.v4.model.DeleteMergeRequestVoteResponse;
import com.huaweicloud.sdk.codehub.v4.model.DeleteProjectMergeRequestApproverSettingRequest;
import com.huaweicloud.sdk.codehub.v4.model.DeleteProjectMergeRequestApproverSettingResponse;
import com.huaweicloud.sdk.codehub.v4.model.DeleteProjectMergeRequestTemplateRequest;
import com.huaweicloud.sdk.codehub.v4.model.DeleteProjectMergeRequestTemplateResponse;
import com.huaweicloud.sdk.codehub.v4.model.DeleteProtectedBranchRequest;
import com.huaweicloud.sdk.codehub.v4.model.DeleteProtectedBranchResponse;
import com.huaweicloud.sdk.codehub.v4.model.DeleteProtectedTagRequest;
import com.huaweicloud.sdk.codehub.v4.model.DeleteProtectedTagResponse;
import com.huaweicloud.sdk.codehub.v4.model.DeleteRepositoryLabelRequest;
import com.huaweicloud.sdk.codehub.v4.model.DeleteRepositoryLabelResponse;
import com.huaweicloud.sdk.codehub.v4.model.DeleteSshKeyRequest;
import com.huaweicloud.sdk.codehub.v4.model.DeleteSshKeyResponse;
import com.huaweicloud.sdk.codehub.v4.model.DeleteTagRequest;
import com.huaweicloud.sdk.codehub.v4.model.DeleteTagResponse;
import com.huaweicloud.sdk.codehub.v4.model.DeleteTenantTrustedIpAddressRequest;
import com.huaweicloud.sdk.codehub.v4.model.DeleteTenantTrustedIpAddressResponse;
import com.huaweicloud.sdk.codehub.v4.model.DeleteTrustedIpAddressRequest;
import com.huaweicloud.sdk.codehub.v4.model.DeleteTrustedIpAddressResponse;
import com.huaweicloud.sdk.codehub.v4.model.DownloadArchiveRequest;
import com.huaweicloud.sdk.codehub.v4.model.DownloadArchiveResponse;
import com.huaweicloud.sdk.codehub.v4.model.DownloadBlobsRawRequest;
import com.huaweicloud.sdk.codehub.v4.model.DownloadBlobsRawResponse;
import com.huaweicloud.sdk.codehub.v4.model.ExecuteRepositoryStatisticsRequest;
import com.huaweicloud.sdk.codehub.v4.model.ExecuteRepositoryStatisticsResponse;
import com.huaweicloud.sdk.codehub.v4.model.ExportTenantRepositoriesRequest;
import com.huaweicloud.sdk.codehub.v4.model.ExportTenantRepositoriesResponse;
import com.huaweicloud.sdk.codehub.v4.model.ImportMergeRequestRequest;
import com.huaweicloud.sdk.codehub.v4.model.ImportMergeRequestResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListBranchRelatedWorkItemsRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListBranchRelatedWorkItemsResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListBranchesRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListBranchesResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListCommitAssociatedMergeRequestsRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListCommitAssociatedMergeRequestsResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListCommitAssociatedRefsRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListCommitAssociatedRefsResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListCommitDiscussionsRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListCommitDiscussionsResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListCommitsRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListCommitsResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListCurrentUserRepositoriesRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListCurrentUserRepositoriesResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListDefaultReviewCategoriesRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListDefaultReviewCategoriesResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListDiscussionTemplatesRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListDiscussionTemplatesResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListFileBlameLinesRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListFileBlameLinesResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListFileUpperTreeEntriesRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListFileUpperTreeEntriesResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListFilesRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListFilesResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListGroupAddableMembersRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListGroupAddableMembersResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListGroupAddableUserGroupsRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListGroupAddableUserGroupsResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListGroupDeployKeysRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListGroupDeployKeysResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListGroupMembersRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListGroupMembersResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListGroupMergeRequestApproverSettingsRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListGroupMergeRequestApproverSettingsResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListGroupMergeRequestCanBeAssignedReviewersRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListGroupMergeRequestCanBeAssignedReviewersResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListGroupMergeRequestTemplatesRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListGroupMergeRequestTemplatesResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListGroupMergeRequestValidAssignedCandidatesRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListGroupMergeRequestValidAssignedCandidatesResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListGroupPermissionResourcesRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListGroupPermissionResourcesResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListGroupProtectedRefsUserGroupsRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListGroupProtectedRefsUserGroupsResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListGroupRepositoriesRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListGroupRepositoriesResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListGroupSubgroupsAndRepositoriesRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListGroupSubgroupsAndRepositoriesResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListGroupUserGroupsRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListGroupUserGroupsResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListGroupWebhookLogsRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListGroupWebhookLogsResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListGroupWebhooksRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListGroupWebhooksResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListGroupsRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListGroupsResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListImpersonationTokensRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListImpersonationTokensResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListItemCommitsRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListItemCommitsResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListLatestPipelineJobsRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListLatestPipelineJobsResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListLogsTreeRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListLogsTreeResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListManageableGroupsRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListManageableGroupsResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListMembersRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListMembersResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListMergeRequestApproverSettingsRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListMergeRequestApproverSettingsResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListMergeRequestApproversRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListMergeRequestApproversResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListMergeRequestChangesRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListMergeRequestChangesResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListMergeRequestChangesTreesRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListMergeRequestChangesTreesResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListMergeRequestCommitsRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListMergeRequestCommitsResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListMergeRequestConflictFilesRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListMergeRequestConflictFilesResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListMergeRequestDiscussionsRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListMergeRequestDiscussionsResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListMergeRequestEvaluationsRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListMergeRequestEvaluationsResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListMergeRequestParticipantsRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListMergeRequestParticipantsResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListMergeRequestReviewersRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListMergeRequestReviewersResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListMergeRequestSystemNotesRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListMergeRequestSystemNotesResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListMergeRequestTemplatesRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListMergeRequestTemplatesResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListMergeRequestValidAssignedCandidatesRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListMergeRequestValidAssignedCandidatesResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListMergeRequestVersionsRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListMergeRequestVersionsResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListPersonalMergeRequestsRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListPersonalMergeRequestsResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListPersonalRecentPushEventsRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListPersonalRecentPushEventsResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListPersonalRepositoryImportRecordsRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListPersonalRepositoryImportRecordsResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListPipelineJobsRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListPipelineJobsResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListProductPermissionResourcesGrantedUsersRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListProductPermissionResourcesGrantedUsersResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListProjectDeployKeysRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListProjectDeployKeysResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListProjectMergeRequestApproverSettingsRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListProjectMergeRequestApproverSettingsResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListProjectMergeRequestCanBeAssignedReviewersRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListProjectMergeRequestCanBeAssignedReviewersResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListProjectMergeRequestCanBeAssignedUsersRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListProjectMergeRequestCanBeAssignedUsersResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListProjectMergeRequestTemplatesRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListProjectMergeRequestTemplatesResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListProjectNoteRequiredAttributesRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListProjectNoteRequiredAttributesResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListProjectProtectedBranchesRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListProjectProtectedBranchesResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListProjectProtectedRefsUserGroupsRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListProjectProtectedRefsUserGroupsResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListProjectProtectedTagsRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListProjectProtectedTagsResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListProjectRepositoriesRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListProjectRepositoriesResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListProjectSubgroupsAndRepositoriesRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListProjectSubgroupsAndRepositoriesResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListProjectWebhookLogsRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListProjectWebhookLogsResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListProjectWebhooksRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListProjectWebhooksResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListProtectedBranchesRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListProtectedBranchesResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListProtectedTagsRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListProtectedTagsResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListRefsListRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListRefsListResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListRepositoryCommitRulesRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListRepositoryCommitRulesResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListRepositoryContributorsRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListRepositoryContributorsResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListRepositoryDeployKeysRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListRepositoryDeployKeysResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListRepositoryEventsRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListRepositoryEventsResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListRepositoryFilePushPermissionsRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListRepositoryFilePushPermissionsResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListRepositoryForksRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListRepositoryForksResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListRepositoryLabelsRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListRepositoryLabelsResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListRepositoryLanguagesRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListRepositoryLanguagesResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListRepositoryMergeRequestsRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListRepositoryMergeRequestsResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListRepositoryProtectedRefsUserGroupsRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListRepositoryProtectedRefsUserGroupsResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListRepositoryResourcePermissionsRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListRepositoryResourcePermissionsResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListRepositoryReviewAuthorsRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListRepositoryReviewAuthorsResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListRepositoryReviewsRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListRepositoryReviewsResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListRepositoryTemplatesRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListRepositoryTemplatesResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListRepositoryUserGroupsRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListRepositoryUserGroupsResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListRepositoryWebhookLogsRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListRepositoryWebhookLogsResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListRepositoryWebhooksRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListRepositoryWebhooksResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListRepositoryWorkItemsRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListRepositoryWorkItemsResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListSubmodulesRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListSubmodulesResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListTagsRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListTagsResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListTenantRepositoriesRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListTenantRepositoriesResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListTenantTrustedIpAddressesRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListTenantTrustedIpAddressesResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListTreesRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListTreesResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListTrustedIpAddressesRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListTrustedIpAddressesResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListUserGpgKeysRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListUserGpgKeysResponse;
import com.huaweicloud.sdk.codehub.v4.model.ListUserKeysRequest;
import com.huaweicloud.sdk.codehub.v4.model.ListUserKeysResponse;
import com.huaweicloud.sdk.codehub.v4.model.LockRepositoryRequest;
import com.huaweicloud.sdk.codehub.v4.model.LockRepositoryResponse;
import com.huaweicloud.sdk.codehub.v4.model.MergeMergeRequestRequest;
import com.huaweicloud.sdk.codehub.v4.model.MergeMergeRequestResponse;
import com.huaweicloud.sdk.codehub.v4.model.RebaseMergeRequestForOpenApiRequest;
import com.huaweicloud.sdk.codehub.v4.model.RebaseMergeRequestForOpenApiResponse;
import com.huaweicloud.sdk.codehub.v4.model.RemoveDeployKeyFromSubmodulesRequest;
import com.huaweicloud.sdk.codehub.v4.model.RemoveDeployKeyFromSubmodulesResponse;
import com.huaweicloud.sdk.codehub.v4.model.RemoveDeployKeyRequest;
import com.huaweicloud.sdk.codehub.v4.model.RemoveDeployKeyResponse;
import com.huaweicloud.sdk.codehub.v4.model.RemoveGroupWebhookRequest;
import com.huaweicloud.sdk.codehub.v4.model.RemoveGroupWebhookResponse;
import com.huaweicloud.sdk.codehub.v4.model.RemoveProjectWebhookRequest;
import com.huaweicloud.sdk.codehub.v4.model.RemoveProjectWebhookResponse;
import com.huaweicloud.sdk.codehub.v4.model.RemoveRepositoryWebhookRequest;
import com.huaweicloud.sdk.codehub.v4.model.RemoveRepositoryWebhookResponse;
import com.huaweicloud.sdk.codehub.v4.model.RenameFileRequest;
import com.huaweicloud.sdk.codehub.v4.model.RenameFileResponse;
import com.huaweicloud.sdk.codehub.v4.model.ResolveMergeRequestConflictsRequest;
import com.huaweicloud.sdk.codehub.v4.model.ResolveMergeRequestConflictsResponse;
import com.huaweicloud.sdk.codehub.v4.model.ReviewMergeRequestRequest;
import com.huaweicloud.sdk.codehub.v4.model.ReviewMergeRequestResponse;
import com.huaweicloud.sdk.codehub.v4.model.SendUserEmailVerifyCodeRequest;
import com.huaweicloud.sdk.codehub.v4.model.SendUserEmailVerifyCodeResponse;
import com.huaweicloud.sdk.codehub.v4.model.ShowActualHeadPipelineRequest;
import com.huaweicloud.sdk.codehub.v4.model.ShowActualHeadPipelineResponse;
import com.huaweicloud.sdk.codehub.v4.model.ShowAverageEvaluationRequest;
import com.huaweicloud.sdk.codehub.v4.model.ShowAverageEvaluationResponse;
import com.huaweicloud.sdk.codehub.v4.model.ShowBlobsRequest;
import com.huaweicloud.sdk.codehub.v4.model.ShowBlobsResponse;
import com.huaweicloud.sdk.codehub.v4.model.ShowBranchConflictRequest;
import com.huaweicloud.sdk.codehub.v4.model.ShowBranchConflictResponse;
import com.huaweicloud.sdk.codehub.v4.model.ShowBranchRequest;
import com.huaweicloud.sdk.codehub.v4.model.ShowBranchResponse;
import com.huaweicloud.sdk.codehub.v4.model.ShowCommitCommentsByLineRequest;
import com.huaweicloud.sdk.codehub.v4.model.ShowCommitCommentsByLineResponse;
import com.huaweicloud.sdk.codehub.v4.model.ShowCommitDiffMetadataRequest;
import com.huaweicloud.sdk.codehub.v4.model.ShowCommitDiffMetadataResponse;
import com.huaweicloud.sdk.codehub.v4.model.ShowCommitFileDiffRequest;
import com.huaweicloud.sdk.codehub.v4.model.ShowCommitFileDiffResponse;
import com.huaweicloud.sdk.codehub.v4.model.ShowCommitRequest;
import com.huaweicloud.sdk.codehub.v4.model.ShowCommitResponse;
import com.huaweicloud.sdk.codehub.v4.model.ShowCommitStatisticsRequest;
import com.huaweicloud.sdk.codehub.v4.model.ShowCommitStatisticsResponse;
import com.huaweicloud.sdk.codehub.v4.model.ShowDiffCommitRequest;
import com.huaweicloud.sdk.codehub.v4.model.ShowDiffCommitResponse;
import com.huaweicloud.sdk.codehub.v4.model.ShowDiffLinesRequest;
import com.huaweicloud.sdk.codehub.v4.model.ShowDiffLinesResponse;
import com.huaweicloud.sdk.codehub.v4.model.ShowFileContentRequest;
import com.huaweicloud.sdk.codehub.v4.model.ShowFileContentResponse;
import com.huaweicloud.sdk.codehub.v4.model.ShowFileRawRequest;
import com.huaweicloud.sdk.codehub.v4.model.ShowFileRawResponse;
import com.huaweicloud.sdk.codehub.v4.model.ShowFileRequest;
import com.huaweicloud.sdk.codehub.v4.model.ShowFileResponse;
import com.huaweicloud.sdk.codehub.v4.model.ShowGroupE2eSettingRequest;
import com.huaweicloud.sdk.codehub.v4.model.ShowGroupE2eSettingResponse;
import com.huaweicloud.sdk.codehub.v4.model.ShowGroupGeneralPolicyRequest;
import com.huaweicloud.sdk.codehub.v4.model.ShowGroupGeneralPolicyResponse;
import com.huaweicloud.sdk.codehub.v4.model.ShowGroupInheritSettingRequest;
import com.huaweicloud.sdk.codehub.v4.model.ShowGroupInheritSettingResponse;
import com.huaweicloud.sdk.codehub.v4.model.ShowGroupMergeRequestSettingRequest;
import com.huaweicloud.sdk.codehub.v4.model.ShowGroupMergeRequestSettingResponse;
import com.huaweicloud.sdk.codehub.v4.model.ShowGroupNoteRequiredAttributesRequest;
import com.huaweicloud.sdk.codehub.v4.model.ShowGroupNoteRequiredAttributesResponse;
import com.huaweicloud.sdk.codehub.v4.model.ShowGroupPermissionInheritEnabledRequest;
import com.huaweicloud.sdk.codehub.v4.model.ShowGroupPermissionInheritEnabledResponse;
import com.huaweicloud.sdk.codehub.v4.model.ShowGroupRequest;
import com.huaweicloud.sdk.codehub.v4.model.ShowGroupResponse;
import com.huaweicloud.sdk.codehub.v4.model.ShowGroupReviewSettingsRequest;
import com.huaweicloud.sdk.codehub.v4.model.ShowGroupReviewSettingsResponse;
import com.huaweicloud.sdk.codehub.v4.model.ShowGroupSettingsInheritCfgRequest;
import com.huaweicloud.sdk.codehub.v4.model.ShowGroupSettingsInheritCfgResponse;
import com.huaweicloud.sdk.codehub.v4.model.ShowGroupWatermarkRequest;
import com.huaweicloud.sdk.codehub.v4.model.ShowGroupWatermarkResponse;
import com.huaweicloud.sdk.codehub.v4.model.ShowGroupWebhookLogRequest;
import com.huaweicloud.sdk.codehub.v4.model.ShowGroupWebhookLogResponse;
import com.huaweicloud.sdk.codehub.v4.model.ShowGroupWebhookRequest;
import com.huaweicloud.sdk.codehub.v4.model.ShowGroupWebhookResponse;
import com.huaweicloud.sdk.codehub.v4.model.ShowGroupsGeneralPolicyRequest;
import com.huaweicloud.sdk.codehub.v4.model.ShowGroupsGeneralPolicyResponse;
import com.huaweicloud.sdk.codehub.v4.model.ShowGroupsInheritRequest;
import com.huaweicloud.sdk.codehub.v4.model.ShowGroupsInheritResponse;
import com.huaweicloud.sdk.codehub.v4.model.ShowHttpsPasswordSettingRequest;
import com.huaweicloud.sdk.codehub.v4.model.ShowHttpsPasswordSettingResponse;
import com.huaweicloud.sdk.codehub.v4.model.ShowLastPushEventInRepositoryRequest;
import com.huaweicloud.sdk.codehub.v4.model.ShowLastPushEventInRepositoryResponse;
import com.huaweicloud.sdk.codehub.v4.model.ShowMergeRequestCommentsByLineRequest;
import com.huaweicloud.sdk.codehub.v4.model.ShowMergeRequestCommentsByLineResponse;
import com.huaweicloud.sdk.codehub.v4.model.ShowMergeRequestDetailRequest;
import com.huaweicloud.sdk.codehub.v4.model.ShowMergeRequestDetailResponse;
import com.huaweicloud.sdk.codehub.v4.model.ShowMergeRequestDiscussionRequest;
import com.huaweicloud.sdk.codehub.v4.model.ShowMergeRequestDiscussionResponse;
import com.huaweicloud.sdk.codehub.v4.model.ShowMergeRequestSettingRequest;
import com.huaweicloud.sdk.codehub.v4.model.ShowMergeRequestSettingResponse;
import com.huaweicloud.sdk.codehub.v4.model.ShowMergeRequestTemplateRequest;
import com.huaweicloud.sdk.codehub.v4.model.ShowMergeRequestTemplateResponse;
import com.huaweicloud.sdk.codehub.v4.model.ShowMergeRequestVotesDetailRequest;
import com.huaweicloud.sdk.codehub.v4.model.ShowMergeRequestVotesDetailResponse;
import com.huaweicloud.sdk.codehub.v4.model.ShowMergeableStateOuterRequest;
import com.huaweicloud.sdk.codehub.v4.model.ShowMergeableStateOuterResponse;
import com.huaweicloud.sdk.codehub.v4.model.ShowNoteRequiredAttributesRequest;
import com.huaweicloud.sdk.codehub.v4.model.ShowNoteRequiredAttributesResponse;
import com.huaweicloud.sdk.codehub.v4.model.ShowNotificationSubscriptionRequest;
import com.huaweicloud.sdk.codehub.v4.model.ShowNotificationSubscriptionResponse;
import com.huaweicloud.sdk.codehub.v4.model.ShowNotificationSubscriptionsStatusRequest;
import com.huaweicloud.sdk.codehub.v4.model.ShowNotificationSubscriptionsStatusResponse;
import com.huaweicloud.sdk.codehub.v4.model.ShowProjectE2eSettingRequest;
import com.huaweicloud.sdk.codehub.v4.model.ShowProjectE2eSettingResponse;
import com.huaweicloud.sdk.codehub.v4.model.ShowProjectGeneralPolicyRequest;
import com.huaweicloud.sdk.codehub.v4.model.ShowProjectGeneralPolicyResponse;
import com.huaweicloud.sdk.codehub.v4.model.ShowProjectMemberSettingRequest;
import com.huaweicloud.sdk.codehub.v4.model.ShowProjectMemberSettingResponse;
import com.huaweicloud.sdk.codehub.v4.model.ShowProjectMergeRequestSettingRequest;
import com.huaweicloud.sdk.codehub.v4.model.ShowProjectMergeRequestSettingResponse;
import com.huaweicloud.sdk.codehub.v4.model.ShowProjectReviewSettingsRequest;
import com.huaweicloud.sdk.codehub.v4.model.ShowProjectReviewSettingsResponse;
import com.huaweicloud.sdk.codehub.v4.model.ShowProjectSettingsInheritCfgRequest;
import com.huaweicloud.sdk.codehub.v4.model.ShowProjectSettingsInheritCfgResponse;
import com.huaweicloud.sdk.codehub.v4.model.ShowProjectWatermarkRequest;
import com.huaweicloud.sdk.codehub.v4.model.ShowProjectWatermarkResponse;
import com.huaweicloud.sdk.codehub.v4.model.ShowProjectWebhookLogRequest;
import com.huaweicloud.sdk.codehub.v4.model.ShowProjectWebhookLogResponse;
import com.huaweicloud.sdk.codehub.v4.model.ShowProjectWebhookRequest;
import com.huaweicloud.sdk.codehub.v4.model.ShowProjectWebhookResponse;
import com.huaweicloud.sdk.codehub.v4.model.ShowProjectsGeneralPolicyRequest;
import com.huaweicloud.sdk.codehub.v4.model.ShowProjectsGeneralPolicyResponse;
import com.huaweicloud.sdk.codehub.v4.model.ShowProtectedBranchRequest;
import com.huaweicloud.sdk.codehub.v4.model.ShowProtectedBranchResponse;
import com.huaweicloud.sdk.codehub.v4.model.ShowProtectedTagRequest;
import com.huaweicloud.sdk.codehub.v4.model.ShowProtectedTagResponse;
import com.huaweicloud.sdk.codehub.v4.model.ShowReadmeFileRequest;
import com.huaweicloud.sdk.codehub.v4.model.ShowReadmeFileResponse;
import com.huaweicloud.sdk.codehub.v4.model.ShowRefCompareRequest;
import com.huaweicloud.sdk.codehub.v4.model.ShowRefCompareResponse;
import com.huaweicloud.sdk.codehub.v4.model.ShowRemoteMirrorRequest;
import com.huaweicloud.sdk.codehub.v4.model.ShowRemoteMirrorResponse;
import com.huaweicloud.sdk.codehub.v4.model.ShowRepositoryE2eSettingRequest;
import com.huaweicloud.sdk.codehub.v4.model.ShowRepositoryE2eSettingResponse;
import com.huaweicloud.sdk.codehub.v4.model.ShowRepositoryGeneralCommitRuleRequest;
import com.huaweicloud.sdk.codehub.v4.model.ShowRepositoryGeneralCommitRuleResponse;
import com.huaweicloud.sdk.codehub.v4.model.ShowRepositoryGeneralPolicyRequest;
import com.huaweicloud.sdk.codehub.v4.model.ShowRepositoryGeneralPolicyResponse;
import com.huaweicloud.sdk.codehub.v4.model.ShowRepositoryInheritSettingRequest;
import com.huaweicloud.sdk.codehub.v4.model.ShowRepositoryInheritSettingResponse;
import com.huaweicloud.sdk.codehub.v4.model.ShowRepositoryInheritSettingSourceRequest;
import com.huaweicloud.sdk.codehub.v4.model.ShowRepositoryInheritSettingSourceResponse;
import com.huaweicloud.sdk.codehub.v4.model.ShowRepositoryMergeRequestsStatisticRequest;
import com.huaweicloud.sdk.codehub.v4.model.ShowRepositoryMergeRequestsStatisticResponse;
import com.huaweicloud.sdk.codehub.v4.model.ShowRepositoryPermissionInheritEnabledRequest;
import com.huaweicloud.sdk.codehub.v4.model.ShowRepositoryPermissionInheritEnabledResponse;
import com.huaweicloud.sdk.codehub.v4.model.ShowRepositoryRequest;
import com.huaweicloud.sdk.codehub.v4.model.ShowRepositoryResponse;
import com.huaweicloud.sdk.codehub.v4.model.ShowRepositoryStatisticsStatusRequest;
import com.huaweicloud.sdk.codehub.v4.model.ShowRepositoryStatisticsStatusResponse;
import com.huaweicloud.sdk.codehub.v4.model.ShowRepositoryStatisticsSummaryRequest;
import com.huaweicloud.sdk.codehub.v4.model.ShowRepositoryStatisticsSummaryResponse;
import com.huaweicloud.sdk.codehub.v4.model.ShowRepositoryWatermarkRequest;
import com.huaweicloud.sdk.codehub.v4.model.ShowRepositoryWatermarkResponse;
import com.huaweicloud.sdk.codehub.v4.model.ShowRepositoryWebhookLogRequest;
import com.huaweicloud.sdk.codehub.v4.model.ShowRepositoryWebhookLogResponse;
import com.huaweicloud.sdk.codehub.v4.model.ShowRepositoryWebhookRequest;
import com.huaweicloud.sdk.codehub.v4.model.ShowRepositoryWebhookResponse;
import com.huaweicloud.sdk.codehub.v4.model.ShowResourcePermissionsRequest;
import com.huaweicloud.sdk.codehub.v4.model.ShowResourcePermissionsResponse;
import com.huaweicloud.sdk.codehub.v4.model.ShowReviewSettingRequest;
import com.huaweicloud.sdk.codehub.v4.model.ShowReviewSettingResponse;
import com.huaweicloud.sdk.codehub.v4.model.ShowTagRequest;
import com.huaweicloud.sdk.codehub.v4.model.ShowTagResponse;
import com.huaweicloud.sdk.codehub.v4.model.ShowUserEmailsRequest;
import com.huaweicloud.sdk.codehub.v4.model.ShowUserEmailsResponse;
import com.huaweicloud.sdk.codehub.v4.model.ShowUserRefPermissionRequest;
import com.huaweicloud.sdk.codehub.v4.model.ShowUserRefPermissionResponse;
import com.huaweicloud.sdk.codehub.v4.model.StartHouseKeepingRequest;
import com.huaweicloud.sdk.codehub.v4.model.StartHouseKeepingResponse;
import com.huaweicloud.sdk.codehub.v4.model.StartRemoteMirrorSynchronizationRequest;
import com.huaweicloud.sdk.codehub.v4.model.StartRemoteMirrorSynchronizationResponse;
import com.huaweicloud.sdk.codehub.v4.model.SyncDeployKeyToSubmodulesRequest;
import com.huaweicloud.sdk.codehub.v4.model.SyncDeployKeyToSubmodulesResponse;
import com.huaweicloud.sdk.codehub.v4.model.TransferGroupRequest;
import com.huaweicloud.sdk.codehub.v4.model.TransferGroupResponse;
import com.huaweicloud.sdk.codehub.v4.model.UnlockRepositoryRequest;
import com.huaweicloud.sdk.codehub.v4.model.UnlockRepositoryResponse;
import com.huaweicloud.sdk.codehub.v4.model.UpdateBranchNameRequest;
import com.huaweicloud.sdk.codehub.v4.model.UpdateBranchNameResponse;
import com.huaweicloud.sdk.codehub.v4.model.UpdateFileRequest;
import com.huaweicloud.sdk.codehub.v4.model.UpdateFileResponse;
import com.huaweicloud.sdk.codehub.v4.model.UpdateGroupGeneralPolicyRequest;
import com.huaweicloud.sdk.codehub.v4.model.UpdateGroupGeneralPolicyResponse;
import com.huaweicloud.sdk.codehub.v4.model.UpdateGroupMergeRequestApproverSettingRequest;
import com.huaweicloud.sdk.codehub.v4.model.UpdateGroupMergeRequestApproverSettingResponse;
import com.huaweicloud.sdk.codehub.v4.model.UpdateGroupMergeRequestTemplateRequest;
import com.huaweicloud.sdk.codehub.v4.model.UpdateGroupMergeRequestTemplateResponse;
import com.huaweicloud.sdk.codehub.v4.model.UpdateGroupNoteRequiredAttributesRequest;
import com.huaweicloud.sdk.codehub.v4.model.UpdateGroupNoteRequiredAttributesResponse;
import com.huaweicloud.sdk.codehub.v4.model.UpdateGroupReviewSettingsRequest;
import com.huaweicloud.sdk.codehub.v4.model.UpdateGroupReviewSettingsResponse;
import com.huaweicloud.sdk.codehub.v4.model.UpdateGroupWatermarkRequest;
import com.huaweicloud.sdk.codehub.v4.model.UpdateGroupWatermarkResponse;
import com.huaweicloud.sdk.codehub.v4.model.UpdateGroupWebhookRequest;
import com.huaweicloud.sdk.codehub.v4.model.UpdateGroupWebhookResponse;
import com.huaweicloud.sdk.codehub.v4.model.UpdateHttpsPasswordSettingRequest;
import com.huaweicloud.sdk.codehub.v4.model.UpdateHttpsPasswordSettingResponse;
import com.huaweicloud.sdk.codehub.v4.model.UpdateMergeRequestApproverSettingRequest;
import com.huaweicloud.sdk.codehub.v4.model.UpdateMergeRequestApproverSettingResponse;
import com.huaweicloud.sdk.codehub.v4.model.UpdateMergeRequestApproversRequest;
import com.huaweicloud.sdk.codehub.v4.model.UpdateMergeRequestApproversResponse;
import com.huaweicloud.sdk.codehub.v4.model.UpdateMergeRequestDiscussionInfoRequest;
import com.huaweicloud.sdk.codehub.v4.model.UpdateMergeRequestDiscussionInfoResponse;
import com.huaweicloud.sdk.codehub.v4.model.UpdateMergeRequestDiscussionRequest;
import com.huaweicloud.sdk.codehub.v4.model.UpdateMergeRequestDiscussionResponse;
import com.huaweicloud.sdk.codehub.v4.model.UpdateMergeRequestRequest;
import com.huaweicloud.sdk.codehub.v4.model.UpdateMergeRequestResponse;
import com.huaweicloud.sdk.codehub.v4.model.UpdateMergeRequestReviewersRequest;
import com.huaweicloud.sdk.codehub.v4.model.UpdateMergeRequestReviewersResponse;
import com.huaweicloud.sdk.codehub.v4.model.UpdateMergeRequestSettingRequest;
import com.huaweicloud.sdk.codehub.v4.model.UpdateMergeRequestSettingResponse;
import com.huaweicloud.sdk.codehub.v4.model.UpdateMergeRequestTemplateRequest;
import com.huaweicloud.sdk.codehub.v4.model.UpdateMergeRequestTemplateResponse;
import com.huaweicloud.sdk.codehub.v4.model.UpdateMergeRequestVoteRequest;
import com.huaweicloud.sdk.codehub.v4.model.UpdateMergeRequestVoteResponse;
import com.huaweicloud.sdk.codehub.v4.model.UpdateNoteRequiredAttributesRequest;
import com.huaweicloud.sdk.codehub.v4.model.UpdateNoteRequiredAttributesResponse;
import com.huaweicloud.sdk.codehub.v4.model.UpdateNotificationSubscriptionRequest;
import com.huaweicloud.sdk.codehub.v4.model.UpdateNotificationSubscriptionResponse;
import com.huaweicloud.sdk.codehub.v4.model.UpdateProjectGeneralPolicyRequest;
import com.huaweicloud.sdk.codehub.v4.model.UpdateProjectGeneralPolicyResponse;
import com.huaweicloud.sdk.codehub.v4.model.UpdateProjectMergeRequestApproverSettingRequest;
import com.huaweicloud.sdk.codehub.v4.model.UpdateProjectMergeRequestApproverSettingResponse;
import com.huaweicloud.sdk.codehub.v4.model.UpdateProjectMergeRequestTemplateRequest;
import com.huaweicloud.sdk.codehub.v4.model.UpdateProjectMergeRequestTemplateResponse;
import com.huaweicloud.sdk.codehub.v4.model.UpdateProjectNoteRequiredAttributesRequest;
import com.huaweicloud.sdk.codehub.v4.model.UpdateProjectNoteRequiredAttributesResponse;
import com.huaweicloud.sdk.codehub.v4.model.UpdateProjectReviewSettingsRequest;
import com.huaweicloud.sdk.codehub.v4.model.UpdateProjectReviewSettingsResponse;
import com.huaweicloud.sdk.codehub.v4.model.UpdateProjectSettingsInheritCfgRequest;
import com.huaweicloud.sdk.codehub.v4.model.UpdateProjectSettingsInheritCfgResponse;
import com.huaweicloud.sdk.codehub.v4.model.UpdateProjectWatermarkRequest;
import com.huaweicloud.sdk.codehub.v4.model.UpdateProjectWatermarkResponse;
import com.huaweicloud.sdk.codehub.v4.model.UpdateProjectWebhookRequest;
import com.huaweicloud.sdk.codehub.v4.model.UpdateProjectWebhookResponse;
import com.huaweicloud.sdk.codehub.v4.model.UpdateProtectedBranchRequest;
import com.huaweicloud.sdk.codehub.v4.model.UpdateProtectedBranchResponse;
import com.huaweicloud.sdk.codehub.v4.model.UpdateProtectedTagRequest;
import com.huaweicloud.sdk.codehub.v4.model.UpdateProtectedTagResponse;
import com.huaweicloud.sdk.codehub.v4.model.UpdateRepositoryCommitRuleRequest;
import com.huaweicloud.sdk.codehub.v4.model.UpdateRepositoryCommitRuleResponse;
import com.huaweicloud.sdk.codehub.v4.model.UpdateRepositoryGeneralCommitRuleRequest;
import com.huaweicloud.sdk.codehub.v4.model.UpdateRepositoryGeneralCommitRuleResponse;
import com.huaweicloud.sdk.codehub.v4.model.UpdateRepositoryGeneralPolicyRequest;
import com.huaweicloud.sdk.codehub.v4.model.UpdateRepositoryGeneralPolicyResponse;
import com.huaweicloud.sdk.codehub.v4.model.UpdateRepositoryInheritSettingRequest;
import com.huaweicloud.sdk.codehub.v4.model.UpdateRepositoryInheritSettingResponse;
import com.huaweicloud.sdk.codehub.v4.model.UpdateRepositoryLabelRequest;
import com.huaweicloud.sdk.codehub.v4.model.UpdateRepositoryLabelResponse;
import com.huaweicloud.sdk.codehub.v4.model.UpdateRepositoryPermissionInheritEnabledRequest;
import com.huaweicloud.sdk.codehub.v4.model.UpdateRepositoryPermissionInheritEnabledResponse;
import com.huaweicloud.sdk.codehub.v4.model.UpdateRepositoryRemoteMirrorRequest;
import com.huaweicloud.sdk.codehub.v4.model.UpdateRepositoryRemoteMirrorResponse;
import com.huaweicloud.sdk.codehub.v4.model.UpdateRepositoryResourcePermissionsRequest;
import com.huaweicloud.sdk.codehub.v4.model.UpdateRepositoryResourcePermissionsResponse;
import com.huaweicloud.sdk.codehub.v4.model.UpdateRepositoryWatermarkRequest;
import com.huaweicloud.sdk.codehub.v4.model.UpdateRepositoryWatermarkResponse;
import com.huaweicloud.sdk.codehub.v4.model.UpdateRepositoryWebhookRequest;
import com.huaweicloud.sdk.codehub.v4.model.UpdateRepositoryWebhookResponse;
import com.huaweicloud.sdk.codehub.v4.model.UpdateTenantTrustedIpAddressRequest;
import com.huaweicloud.sdk.codehub.v4.model.UpdateTenantTrustedIpAddressResponse;
import com.huaweicloud.sdk.codehub.v4.model.UpdateTrustedIpAddressRequest;
import com.huaweicloud.sdk.codehub.v4.model.UpdateTrustedIpAddressResponse;
import com.huaweicloud.sdk.codehub.v4.model.UpdateUserEmailsRequest;
import com.huaweicloud.sdk.codehub.v4.model.UpdateUserEmailsResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.SyncInvoker;

public class CodeHubClient {

    protected HcClient hcClient;

    public CodeHubClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CodeHubClient> newBuilder() {
        ClientBuilder<CodeHubClient> clientBuilder = new ClientBuilder<>(CodeHubClient::new);
        return clientBuilder;
    }

    /**
     * 创建提交信息
     *
     * 创建提交信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCommitRequest 请求对象
     * @return CreateCommitResponse
     */
    public CreateCommitResponse createCommit(CreateCommitRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.createCommit);
    }

    /**
     * 创建提交信息
     *
     * 创建提交信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCommitRequest 请求对象
     * @return SyncInvoker<CreateCommitRequest, CreateCommitResponse>
     */
    public SyncInvoker<CreateCommitRequest, CreateCommitResponse> createCommitInvoker(CreateCommitRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.createCommit, hcClient);
    }

    /**
     * 回退提交
     *
     * 回退提交
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCommitRevertRequest 请求对象
     * @return CreateCommitRevertResponse
     */
    public CreateCommitRevertResponse createCommitRevert(CreateCommitRevertRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.createCommitRevert);
    }

    /**
     * 回退提交
     *
     * 回退提交
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCommitRevertRequest 请求对象
     * @return SyncInvoker<CreateCommitRevertRequest, CreateCommitRevertResponse>
     */
    public SyncInvoker<CreateCommitRevertRequest, CreateCommitRevertResponse> createCommitRevertInvoker(
        CreateCommitRevertRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.createCommitRevert, hcClient);
    }

    /**
     * 根据提交ID查询分支、标签列表
     *
     * 根据提交ID查询分支、标签列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCommitAssociatedRefsRequest 请求对象
     * @return ListCommitAssociatedRefsResponse
     */
    public ListCommitAssociatedRefsResponse listCommitAssociatedRefs(ListCommitAssociatedRefsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listCommitAssociatedRefs);
    }

    /**
     * 根据提交ID查询分支、标签列表
     *
     * 根据提交ID查询分支、标签列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCommitAssociatedRefsRequest 请求对象
     * @return SyncInvoker<ListCommitAssociatedRefsRequest, ListCommitAssociatedRefsResponse>
     */
    public SyncInvoker<ListCommitAssociatedRefsRequest, ListCommitAssociatedRefsResponse> listCommitAssociatedRefsInvoker(
        ListCommitAssociatedRefsRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listCommitAssociatedRefs, hcClient);
    }

    /**
     * 查看提交列表
     *
     * 查看提交列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCommitsRequest 请求对象
     * @return ListCommitsResponse
     */
    public ListCommitsResponse listCommits(ListCommitsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listCommits);
    }

    /**
     * 查看提交列表
     *
     * 查看提交列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCommitsRequest 请求对象
     * @return SyncInvoker<ListCommitsRequest, ListCommitsResponse>
     */
    public SyncInvoker<ListCommitsRequest, ListCommitsResponse> listCommitsInvoker(ListCommitsRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listCommits, hcClient);
    }

    /**
     * 获取特定提交信息
     *
     * 获取特定提交信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCommitRequest 请求对象
     * @return ShowCommitResponse
     */
    public ShowCommitResponse showCommit(ShowCommitRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showCommit);
    }

    /**
     * 获取特定提交信息
     *
     * 获取特定提交信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCommitRequest 请求对象
     * @return SyncInvoker<ShowCommitRequest, ShowCommitResponse>
     */
    public SyncInvoker<ShowCommitRequest, ShowCommitResponse> showCommitInvoker(ShowCommitRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.showCommit, hcClient);
    }

    /**
     * 获取commit引入的文件变更元数据
     *
     * 获取commit引入的文件变更元数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCommitDiffMetadataRequest 请求对象
     * @return ShowCommitDiffMetadataResponse
     */
    public ShowCommitDiffMetadataResponse showCommitDiffMetadata(ShowCommitDiffMetadataRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showCommitDiffMetadata);
    }

    /**
     * 获取commit引入的文件变更元数据
     *
     * 获取commit引入的文件变更元数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCommitDiffMetadataRequest 请求对象
     * @return SyncInvoker<ShowCommitDiffMetadataRequest, ShowCommitDiffMetadataResponse>
     */
    public SyncInvoker<ShowCommitDiffMetadataRequest, ShowCommitDiffMetadataResponse> showCommitDiffMetadataInvoker(
        ShowCommitDiffMetadataRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.showCommitDiffMetadata, hcClient);
    }

    /**
     * 获取commit引入的指定文件的变更内容
     *
     * 获取commit引入的指定文件的变更内容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCommitFileDiffRequest 请求对象
     * @return ShowCommitFileDiffResponse
     */
    public ShowCommitFileDiffResponse showCommitFileDiff(ShowCommitFileDiffRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showCommitFileDiff);
    }

    /**
     * 获取commit引入的指定文件的变更内容
     *
     * 获取commit引入的指定文件的变更内容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCommitFileDiffRequest 请求对象
     * @return SyncInvoker<ShowCommitFileDiffRequest, ShowCommitFileDiffResponse>
     */
    public SyncInvoker<ShowCommitFileDiffRequest, ShowCommitFileDiffResponse> showCommitFileDiffInvoker(
        ShowCommitFileDiffRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.showCommitFileDiff, hcClient);
    }

    /**
     * 获取提交差异
     *
     * 获取提交差异
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDiffCommitRequest 请求对象
     * @return ShowDiffCommitResponse
     */
    public ShowDiffCommitResponse showDiffCommit(ShowDiffCommitRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showDiffCommit);
    }

    /**
     * 获取提交差异
     *
     * 获取提交差异
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDiffCommitRequest 请求对象
     * @return SyncInvoker<ShowDiffCommitRequest, ShowDiffCommitResponse>
     */
    public SyncInvoker<ShowDiffCommitRequest, ShowDiffCommitResponse> showDiffCommitInvoker(
        ShowDiffCommitRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.showDiffCommit, hcClient);
    }

    /**
     * 创建合并请求检视意见
     *
     * 创建合并请求检视意见
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMergeRequestDiscussionRequest 请求对象
     * @return CreateMergeRequestDiscussionResponse
     */
    public CreateMergeRequestDiscussionResponse createMergeRequestDiscussion(
        CreateMergeRequestDiscussionRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.createMergeRequestDiscussion);
    }

    /**
     * 创建合并请求检视意见
     *
     * 创建合并请求检视意见
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMergeRequestDiscussionRequest 请求对象
     * @return SyncInvoker<CreateMergeRequestDiscussionRequest, CreateMergeRequestDiscussionResponse>
     */
    public SyncInvoker<CreateMergeRequestDiscussionRequest, CreateMergeRequestDiscussionResponse> createMergeRequestDiscussionInvoker(
        CreateMergeRequestDiscussionRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.createMergeRequestDiscussion, hcClient);
    }

    /**
     * 回复合并请求检视意见
     *
     * 回复合并请求检视意见
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMergeRequestDiscussionResponseRequest 请求对象
     * @return CreateMergeRequestDiscussionResponseResponse
     */
    public CreateMergeRequestDiscussionResponseResponse createMergeRequestDiscussionResponse(
        CreateMergeRequestDiscussionResponseRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.createMergeRequestDiscussionResponse);
    }

    /**
     * 回复合并请求检视意见
     *
     * 回复合并请求检视意见
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMergeRequestDiscussionResponseRequest 请求对象
     * @return SyncInvoker<CreateMergeRequestDiscussionResponseRequest, CreateMergeRequestDiscussionResponseResponse>
     */
    public SyncInvoker<CreateMergeRequestDiscussionResponseRequest, CreateMergeRequestDiscussionResponseResponse> createMergeRequestDiscussionResponseInvoker(
        CreateMergeRequestDiscussionResponseRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.createMergeRequestDiscussionResponse, hcClient);
    }

    /**
     * 创建/更新检视意见设置
     *
     * 创建/更新检视意见设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateReviewSettingRequest 请求对象
     * @return CreateReviewSettingResponse
     */
    public CreateReviewSettingResponse createReviewSetting(CreateReviewSettingRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.createReviewSetting);
    }

    /**
     * 创建/更新检视意见设置
     *
     * 创建/更新检视意见设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateReviewSettingRequest 请求对象
     * @return SyncInvoker<CreateReviewSettingRequest, CreateReviewSettingResponse>
     */
    public SyncInvoker<CreateReviewSettingRequest, CreateReviewSettingResponse> createReviewSettingInvoker(
        CreateReviewSettingRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.createReviewSetting, hcClient);
    }

    /**
     * 删除合并请求检视意见
     *
     * 删除合并请求检视意见
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMergeRequestDiscussionRequest 请求对象
     * @return DeleteMergeRequestDiscussionResponse
     */
    public DeleteMergeRequestDiscussionResponse deleteMergeRequestDiscussion(
        DeleteMergeRequestDiscussionRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.deleteMergeRequestDiscussion);
    }

    /**
     * 删除合并请求检视意见
     *
     * 删除合并请求检视意见
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMergeRequestDiscussionRequest 请求对象
     * @return SyncInvoker<DeleteMergeRequestDiscussionRequest, DeleteMergeRequestDiscussionResponse>
     */
    public SyncInvoker<DeleteMergeRequestDiscussionRequest, DeleteMergeRequestDiscussionResponse> deleteMergeRequestDiscussionInvoker(
        DeleteMergeRequestDiscussionRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.deleteMergeRequestDiscussion, hcClient);
    }

    /**
     * 获取代码页单个提交下检视意见列表
     *
     * 获取代码页单个提交下检视意见列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCommitDiscussionsRequest 请求对象
     * @return ListCommitDiscussionsResponse
     */
    public ListCommitDiscussionsResponse listCommitDiscussions(ListCommitDiscussionsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listCommitDiscussions);
    }

    /**
     * 获取代码页单个提交下检视意见列表
     *
     * 获取代码页单个提交下检视意见列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCommitDiscussionsRequest 请求对象
     * @return SyncInvoker<ListCommitDiscussionsRequest, ListCommitDiscussionsResponse>
     */
    public SyncInvoker<ListCommitDiscussionsRequest, ListCommitDiscussionsResponse> listCommitDiscussionsInvoker(
        ListCommitDiscussionsRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listCommitDiscussions, hcClient);
    }

    /**
     * 获取默认的检视意见分类
     *
     * 获取默认的检视意见分类
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDefaultReviewCategoriesRequest 请求对象
     * @return ListDefaultReviewCategoriesResponse
     */
    public ListDefaultReviewCategoriesResponse listDefaultReviewCategories(ListDefaultReviewCategoriesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listDefaultReviewCategories);
    }

    /**
     * 获取默认的检视意见分类
     *
     * 获取默认的检视意见分类
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDefaultReviewCategoriesRequest 请求对象
     * @return SyncInvoker<ListDefaultReviewCategoriesRequest, ListDefaultReviewCategoriesResponse>
     */
    public SyncInvoker<ListDefaultReviewCategoriesRequest, ListDefaultReviewCategoriesResponse> listDefaultReviewCategoriesInvoker(
        ListDefaultReviewCategoriesRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listDefaultReviewCategories, hcClient);
    }

    /**
     * 获取合并请求检视意见列表
     *
     * 获取合并请求检视意见列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMergeRequestDiscussionsRequest 请求对象
     * @return ListMergeRequestDiscussionsResponse
     */
    public ListMergeRequestDiscussionsResponse listMergeRequestDiscussions(ListMergeRequestDiscussionsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listMergeRequestDiscussions);
    }

    /**
     * 获取合并请求检视意见列表
     *
     * 获取合并请求检视意见列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMergeRequestDiscussionsRequest 请求对象
     * @return SyncInvoker<ListMergeRequestDiscussionsRequest, ListMergeRequestDiscussionsResponse>
     */
    public SyncInvoker<ListMergeRequestDiscussionsRequest, ListMergeRequestDiscussionsResponse> listMergeRequestDiscussionsInvoker(
        ListMergeRequestDiscussionsRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listMergeRequestDiscussions, hcClient);
    }

    /**
     * 获取合并请求动态列表
     *
     * 获取合并请求动态列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMergeRequestSystemNotesRequest 请求对象
     * @return ListMergeRequestSystemNotesResponse
     */
    public ListMergeRequestSystemNotesResponse listMergeRequestSystemNotes(ListMergeRequestSystemNotesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listMergeRequestSystemNotes);
    }

    /**
     * 获取合并请求动态列表
     *
     * 获取合并请求动态列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMergeRequestSystemNotesRequest 请求对象
     * @return SyncInvoker<ListMergeRequestSystemNotesRequest, ListMergeRequestSystemNotesResponse>
     */
    public SyncInvoker<ListMergeRequestSystemNotesRequest, ListMergeRequestSystemNotesResponse> listMergeRequestSystemNotesInvoker(
        ListMergeRequestSystemNotesRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listMergeRequestSystemNotes, hcClient);
    }

    /**
     * 获取项目检视意见必填项
     *
     * 获取项目检视意见必填项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectNoteRequiredAttributesRequest 请求对象
     * @return ListProjectNoteRequiredAttributesResponse
     */
    public ListProjectNoteRequiredAttributesResponse listProjectNoteRequiredAttributes(
        ListProjectNoteRequiredAttributesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listProjectNoteRequiredAttributes);
    }

    /**
     * 获取项目检视意见必填项
     *
     * 获取项目检视意见必填项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectNoteRequiredAttributesRequest 请求对象
     * @return SyncInvoker<ListProjectNoteRequiredAttributesRequest, ListProjectNoteRequiredAttributesResponse>
     */
    public SyncInvoker<ListProjectNoteRequiredAttributesRequest, ListProjectNoteRequiredAttributesResponse> listProjectNoteRequiredAttributesInvoker(
        ListProjectNoteRequiredAttributesRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listProjectNoteRequiredAttributes, hcClient);
    }

    /**
     * 获取仓库下检视意见作者列表
     *
     * 获取仓库下检视意见作者列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryReviewAuthorsRequest 请求对象
     * @return ListRepositoryReviewAuthorsResponse
     */
    public ListRepositoryReviewAuthorsResponse listRepositoryReviewAuthors(ListRepositoryReviewAuthorsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listRepositoryReviewAuthors);
    }

    /**
     * 获取仓库下检视意见作者列表
     *
     * 获取仓库下检视意见作者列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryReviewAuthorsRequest 请求对象
     * @return SyncInvoker<ListRepositoryReviewAuthorsRequest, ListRepositoryReviewAuthorsResponse>
     */
    public SyncInvoker<ListRepositoryReviewAuthorsRequest, ListRepositoryReviewAuthorsResponse> listRepositoryReviewAuthorsInvoker(
        ListRepositoryReviewAuthorsRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listRepositoryReviewAuthors, hcClient);
    }

    /**
     * 获取仓库检视意见列表
     *
     * 获取仓库检视意见列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryReviewsRequest 请求对象
     * @return ListRepositoryReviewsResponse
     */
    public ListRepositoryReviewsResponse listRepositoryReviews(ListRepositoryReviewsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listRepositoryReviews);
    }

    /**
     * 获取仓库检视意见列表
     *
     * 获取仓库检视意见列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryReviewsRequest 请求对象
     * @return SyncInvoker<ListRepositoryReviewsRequest, ListRepositoryReviewsResponse>
     */
    public SyncInvoker<ListRepositoryReviewsRequest, ListRepositoryReviewsResponse> listRepositoryReviewsInvoker(
        ListRepositoryReviewsRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listRepositoryReviews, hcClient);
    }

    /**
     * 获取代码组检视意见必填项
     *
     * 获取代码组检视意见必填项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGroupNoteRequiredAttributesRequest 请求对象
     * @return ShowGroupNoteRequiredAttributesResponse
     */
    public ShowGroupNoteRequiredAttributesResponse showGroupNoteRequiredAttributes(
        ShowGroupNoteRequiredAttributesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showGroupNoteRequiredAttributes);
    }

    /**
     * 获取代码组检视意见必填项
     *
     * 获取代码组检视意见必填项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGroupNoteRequiredAttributesRequest 请求对象
     * @return SyncInvoker<ShowGroupNoteRequiredAttributesRequest, ShowGroupNoteRequiredAttributesResponse>
     */
    public SyncInvoker<ShowGroupNoteRequiredAttributesRequest, ShowGroupNoteRequiredAttributesResponse> showGroupNoteRequiredAttributesInvoker(
        ShowGroupNoteRequiredAttributesRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.showGroupNoteRequiredAttributes, hcClient);
    }

    /**
     * 获取代码组检视意见设置(不含必填项)
     *
     * 获取代码组检视意见设置(不含必填项)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGroupReviewSettingsRequest 请求对象
     * @return ShowGroupReviewSettingsResponse
     */
    public ShowGroupReviewSettingsResponse showGroupReviewSettings(ShowGroupReviewSettingsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showGroupReviewSettings);
    }

    /**
     * 获取代码组检视意见设置(不含必填项)
     *
     * 获取代码组检视意见设置(不含必填项)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGroupReviewSettingsRequest 请求对象
     * @return SyncInvoker<ShowGroupReviewSettingsRequest, ShowGroupReviewSettingsResponse>
     */
    public SyncInvoker<ShowGroupReviewSettingsRequest, ShowGroupReviewSettingsResponse> showGroupReviewSettingsInvoker(
        ShowGroupReviewSettingsRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.showGroupReviewSettings, hcClient);
    }

    /**
     * 根据discussion_id获取合并请求检视意见
     *
     * 根据discussion_id获取合并请求检视意见
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMergeRequestDiscussionRequest 请求对象
     * @return ShowMergeRequestDiscussionResponse
     */
    public ShowMergeRequestDiscussionResponse showMergeRequestDiscussion(ShowMergeRequestDiscussionRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showMergeRequestDiscussion);
    }

    /**
     * 根据discussion_id获取合并请求检视意见
     *
     * 根据discussion_id获取合并请求检视意见
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMergeRequestDiscussionRequest 请求对象
     * @return SyncInvoker<ShowMergeRequestDiscussionRequest, ShowMergeRequestDiscussionResponse>
     */
    public SyncInvoker<ShowMergeRequestDiscussionRequest, ShowMergeRequestDiscussionResponse> showMergeRequestDiscussionInvoker(
        ShowMergeRequestDiscussionRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.showMergeRequestDiscussion, hcClient);
    }

    /**
     * 获取仓库检视意见必填项
     *
     * 获取仓库检视意见必填项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNoteRequiredAttributesRequest 请求对象
     * @return ShowNoteRequiredAttributesResponse
     */
    public ShowNoteRequiredAttributesResponse showNoteRequiredAttributes(ShowNoteRequiredAttributesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showNoteRequiredAttributes);
    }

    /**
     * 获取仓库检视意见必填项
     *
     * 获取仓库检视意见必填项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNoteRequiredAttributesRequest 请求对象
     * @return SyncInvoker<ShowNoteRequiredAttributesRequest, ShowNoteRequiredAttributesResponse>
     */
    public SyncInvoker<ShowNoteRequiredAttributesRequest, ShowNoteRequiredAttributesResponse> showNoteRequiredAttributesInvoker(
        ShowNoteRequiredAttributesRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.showNoteRequiredAttributes, hcClient);
    }

    /**
     * 获取项目检视意见设置(不含必填项)
     *
     * 获取项目检视意见设置(不含必填项)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectReviewSettingsRequest 请求对象
     * @return ShowProjectReviewSettingsResponse
     */
    public ShowProjectReviewSettingsResponse showProjectReviewSettings(ShowProjectReviewSettingsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showProjectReviewSettings);
    }

    /**
     * 获取项目检视意见设置(不含必填项)
     *
     * 获取项目检视意见设置(不含必填项)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectReviewSettingsRequest 请求对象
     * @return SyncInvoker<ShowProjectReviewSettingsRequest, ShowProjectReviewSettingsResponse>
     */
    public SyncInvoker<ShowProjectReviewSettingsRequest, ShowProjectReviewSettingsResponse> showProjectReviewSettingsInvoker(
        ShowProjectReviewSettingsRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.showProjectReviewSettings, hcClient);
    }

    /**
     * 获取检视意见设置
     *
     * 获取检视意见设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReviewSettingRequest 请求对象
     * @return ShowReviewSettingResponse
     */
    public ShowReviewSettingResponse showReviewSetting(ShowReviewSettingRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showReviewSetting);
    }

    /**
     * 获取检视意见设置
     *
     * 获取检视意见设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReviewSettingRequest 请求对象
     * @return SyncInvoker<ShowReviewSettingRequest, ShowReviewSettingResponse>
     */
    public SyncInvoker<ShowReviewSettingRequest, ShowReviewSettingResponse> showReviewSettingInvoker(
        ShowReviewSettingRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.showReviewSetting, hcClient);
    }

    /**
     * 创建/更新代码组检视意见必填项
     *
     * 创建/更新代码组检视意见必填项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGroupNoteRequiredAttributesRequest 请求对象
     * @return UpdateGroupNoteRequiredAttributesResponse
     */
    public UpdateGroupNoteRequiredAttributesResponse updateGroupNoteRequiredAttributes(
        UpdateGroupNoteRequiredAttributesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.updateGroupNoteRequiredAttributes);
    }

    /**
     * 创建/更新代码组检视意见必填项
     *
     * 创建/更新代码组检视意见必填项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGroupNoteRequiredAttributesRequest 请求对象
     * @return SyncInvoker<UpdateGroupNoteRequiredAttributesRequest, UpdateGroupNoteRequiredAttributesResponse>
     */
    public SyncInvoker<UpdateGroupNoteRequiredAttributesRequest, UpdateGroupNoteRequiredAttributesResponse> updateGroupNoteRequiredAttributesInvoker(
        UpdateGroupNoteRequiredAttributesRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.updateGroupNoteRequiredAttributes, hcClient);
    }

    /**
     * 创建/更新代码组检视意见设置(不含必填项)
     *
     * 创建/更新代码组检视意见设置(不含必填项)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGroupReviewSettingsRequest 请求对象
     * @return UpdateGroupReviewSettingsResponse
     */
    public UpdateGroupReviewSettingsResponse updateGroupReviewSettings(UpdateGroupReviewSettingsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.updateGroupReviewSettings);
    }

    /**
     * 创建/更新代码组检视意见设置(不含必填项)
     *
     * 创建/更新代码组检视意见设置(不含必填项)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGroupReviewSettingsRequest 请求对象
     * @return SyncInvoker<UpdateGroupReviewSettingsRequest, UpdateGroupReviewSettingsResponse>
     */
    public SyncInvoker<UpdateGroupReviewSettingsRequest, UpdateGroupReviewSettingsResponse> updateGroupReviewSettingsInvoker(
        UpdateGroupReviewSettingsRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.updateGroupReviewSettings, hcClient);
    }

    /**
     * 更新合并请求检视意见
     *
     * 更新合并请求检视意见
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMergeRequestDiscussionRequest 请求对象
     * @return UpdateMergeRequestDiscussionResponse
     */
    public UpdateMergeRequestDiscussionResponse updateMergeRequestDiscussion(
        UpdateMergeRequestDiscussionRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.updateMergeRequestDiscussion);
    }

    /**
     * 更新合并请求检视意见
     *
     * 更新合并请求检视意见
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMergeRequestDiscussionRequest 请求对象
     * @return SyncInvoker<UpdateMergeRequestDiscussionRequest, UpdateMergeRequestDiscussionResponse>
     */
    public SyncInvoker<UpdateMergeRequestDiscussionRequest, UpdateMergeRequestDiscussionResponse> updateMergeRequestDiscussionInvoker(
        UpdateMergeRequestDiscussionRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.updateMergeRequestDiscussion, hcClient);
    }

    /**
     * 更新合并请求检视意见中除评论内容以外的信息
     *
     * 更新合并请求检视意见中除评论内容以外的信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMergeRequestDiscussionInfoRequest 请求对象
     * @return UpdateMergeRequestDiscussionInfoResponse
     */
    public UpdateMergeRequestDiscussionInfoResponse updateMergeRequestDiscussionInfo(
        UpdateMergeRequestDiscussionInfoRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.updateMergeRequestDiscussionInfo);
    }

    /**
     * 更新合并请求检视意见中除评论内容以外的信息
     *
     * 更新合并请求检视意见中除评论内容以外的信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMergeRequestDiscussionInfoRequest 请求对象
     * @return SyncInvoker<UpdateMergeRequestDiscussionInfoRequest, UpdateMergeRequestDiscussionInfoResponse>
     */
    public SyncInvoker<UpdateMergeRequestDiscussionInfoRequest, UpdateMergeRequestDiscussionInfoResponse> updateMergeRequestDiscussionInfoInvoker(
        UpdateMergeRequestDiscussionInfoRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.updateMergeRequestDiscussionInfo, hcClient);
    }

    /**
     * 创建/更新仓库检视意见必填项
     *
     * 创建/更新仓库检视意见必填项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNoteRequiredAttributesRequest 请求对象
     * @return UpdateNoteRequiredAttributesResponse
     */
    public UpdateNoteRequiredAttributesResponse updateNoteRequiredAttributes(
        UpdateNoteRequiredAttributesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.updateNoteRequiredAttributes);
    }

    /**
     * 创建/更新仓库检视意见必填项
     *
     * 创建/更新仓库检视意见必填项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNoteRequiredAttributesRequest 请求对象
     * @return SyncInvoker<UpdateNoteRequiredAttributesRequest, UpdateNoteRequiredAttributesResponse>
     */
    public SyncInvoker<UpdateNoteRequiredAttributesRequest, UpdateNoteRequiredAttributesResponse> updateNoteRequiredAttributesInvoker(
        UpdateNoteRequiredAttributesRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.updateNoteRequiredAttributes, hcClient);
    }

    /**
     * 创建/更新项目检视意见必填项
     *
     * 创建/更新项目检视意见必填项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProjectNoteRequiredAttributesRequest 请求对象
     * @return UpdateProjectNoteRequiredAttributesResponse
     */
    public UpdateProjectNoteRequiredAttributesResponse updateProjectNoteRequiredAttributes(
        UpdateProjectNoteRequiredAttributesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.updateProjectNoteRequiredAttributes);
    }

    /**
     * 创建/更新项目检视意见必填项
     *
     * 创建/更新项目检视意见必填项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProjectNoteRequiredAttributesRequest 请求对象
     * @return SyncInvoker<UpdateProjectNoteRequiredAttributesRequest, UpdateProjectNoteRequiredAttributesResponse>
     */
    public SyncInvoker<UpdateProjectNoteRequiredAttributesRequest, UpdateProjectNoteRequiredAttributesResponse> updateProjectNoteRequiredAttributesInvoker(
        UpdateProjectNoteRequiredAttributesRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.updateProjectNoteRequiredAttributes, hcClient);
    }

    /**
     * 创建/更新项目检视意见设置(不含必填项)
     *
     * 创建/更新项目检视意见设置(不含必填项)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProjectReviewSettingsRequest 请求对象
     * @return UpdateProjectReviewSettingsResponse
     */
    public UpdateProjectReviewSettingsResponse updateProjectReviewSettings(UpdateProjectReviewSettingsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.updateProjectReviewSettings);
    }

    /**
     * 创建/更新项目检视意见设置(不含必填项)
     *
     * 创建/更新项目检视意见设置(不含必填项)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProjectReviewSettingsRequest 请求对象
     * @return SyncInvoker<UpdateProjectReviewSettingsRequest, UpdateProjectReviewSettingsResponse>
     */
    public SyncInvoker<UpdateProjectReviewSettingsRequest, UpdateProjectReviewSettingsResponse> updateProjectReviewSettingsInvoker(
        UpdateProjectReviewSettingsRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.updateProjectReviewSettings, hcClient);
    }

    /**
     * 创建文件
     *
     * 创建文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFileRequest 请求对象
     * @return CreateFileResponse
     */
    public CreateFileResponse createFile(CreateFileRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.createFile);
    }

    /**
     * 创建文件
     *
     * 创建文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFileRequest 请求对象
     * @return SyncInvoker<CreateFileRequest, CreateFileResponse>
     */
    public SyncInvoker<CreateFileRequest, CreateFileResponse> createFileInvoker(CreateFileRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.createFile, hcClient);
    }

    /**
     * 删除文件
     *
     * 删除文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFileRequest 请求对象
     * @return DeleteFileResponse
     */
    public DeleteFileResponse deleteFile(DeleteFileRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.deleteFile);
    }

    /**
     * 删除文件
     *
     * 删除文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFileRequest 请求对象
     * @return SyncInvoker<DeleteFileRequest, DeleteFileResponse>
     */
    public SyncInvoker<DeleteFileRequest, DeleteFileResponse> deleteFileInvoker(DeleteFileRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.deleteFile, hcClient);
    }

    /**
     * 获取仓库单个文件内容(下载单个文件)
     *
     * 获取仓库单个文件内容(下载单个文件)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadBlobsRawRequest 请求对象
     * @return DownloadBlobsRawResponse
     */
    public DownloadBlobsRawResponse downloadBlobsRaw(DownloadBlobsRawRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.downloadBlobsRaw);
    }

    /**
     * 获取仓库单个文件内容(下载单个文件)
     *
     * 获取仓库单个文件内容(下载单个文件)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadBlobsRawRequest 请求对象
     * @return SyncInvoker<DownloadBlobsRawRequest, DownloadBlobsRawResponse>
     */
    public SyncInvoker<DownloadBlobsRawRequest, DownloadBlobsRawResponse> downloadBlobsRawInvoker(
        DownloadBlobsRawRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.downloadBlobsRaw, hcClient);
    }

    /**
     * 获取文件追溯信息
     *
     * 获取文件追溯信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFileBlameLinesRequest 请求对象
     * @return ListFileBlameLinesResponse
     */
    public ListFileBlameLinesResponse listFileBlameLines(ListFileBlameLinesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listFileBlameLines);
    }

    /**
     * 获取文件追溯信息
     *
     * 获取文件追溯信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFileBlameLinesRequest 请求对象
     * @return SyncInvoker<ListFileBlameLinesRequest, ListFileBlameLinesResponse>
     */
    public SyncInvoker<ListFileBlameLinesRequest, ListFileBlameLinesResponse> listFileBlameLinesInvoker(
        ListFileBlameLinesRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listFileBlameLines, hcClient);
    }

    /**
     * 获取当前文件上级树结构
     *
     * 获取当前文件上级树结构
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFileUpperTreeEntriesRequest 请求对象
     * @return ListFileUpperTreeEntriesResponse
     */
    public ListFileUpperTreeEntriesResponse listFileUpperTreeEntries(ListFileUpperTreeEntriesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listFileUpperTreeEntries);
    }

    /**
     * 获取当前文件上级树结构
     *
     * 获取当前文件上级树结构
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFileUpperTreeEntriesRequest 请求对象
     * @return SyncInvoker<ListFileUpperTreeEntriesRequest, ListFileUpperTreeEntriesResponse>
     */
    public SyncInvoker<ListFileUpperTreeEntriesRequest, ListFileUpperTreeEntriesResponse> listFileUpperTreeEntriesInvoker(
        ListFileUpperTreeEntriesRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listFileUpperTreeEntries, hcClient);
    }

    /**
     * 获取指定分支下所有的文件列表
     *
     * 获取指定分支下所有的文件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFilesRequest 请求对象
     * @return ListFilesResponse
     */
    public ListFilesResponse listFiles(ListFilesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listFiles);
    }

    /**
     * 获取指定分支下所有的文件列表
     *
     * 获取指定分支下所有的文件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFilesRequest 请求对象
     * @return SyncInvoker<ListFilesRequest, ListFilesResponse>
     */
    public SyncInvoker<ListFilesRequest, ListFilesResponse> listFilesInvoker(ListFilesRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listFiles, hcClient);
    }

    /**
     * 查看文件树
     *
     * 查看文件树
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLogsTreeRequest 请求对象
     * @return ListLogsTreeResponse
     */
    public ListLogsTreeResponse listLogsTree(ListLogsTreeRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listLogsTree);
    }

    /**
     * 查看文件树
     *
     * 查看文件树
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLogsTreeRequest 请求对象
     * @return SyncInvoker<ListLogsTreeRequest, ListLogsTreeResponse>
     */
    public SyncInvoker<ListLogsTreeRequest, ListLogsTreeResponse> listLogsTreeInvoker(ListLogsTreeRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listLogsTree, hcClient);
    }

    /**
     * 查看分支文件列表
     *
     * 查看分支文件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTreesRequest 请求对象
     * @return ListTreesResponse
     */
    public ListTreesResponse listTrees(ListTreesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listTrees);
    }

    /**
     * 查看分支文件列表
     *
     * 查看分支文件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTreesRequest 请求对象
     * @return SyncInvoker<ListTreesRequest, ListTreesResponse>
     */
    public SyncInvoker<ListTreesRequest, ListTreesResponse> listTreesInvoker(ListTreesRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listTrees, hcClient);
    }

    /**
     * 文件重命名
     *
     * 文件重命名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RenameFileRequest 请求对象
     * @return RenameFileResponse
     */
    public RenameFileResponse renameFile(RenameFileRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.renameFile);
    }

    /**
     * 文件重命名
     *
     * 文件重命名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RenameFileRequest 请求对象
     * @return SyncInvoker<RenameFileRequest, RenameFileResponse>
     */
    public SyncInvoker<RenameFileRequest, RenameFileResponse> renameFileInvoker(RenameFileRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.renameFile, hcClient);
    }

    /**
     * 查看文件属性与内容
     *
     * 查看文件属性与内容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFileRequest 请求对象
     * @return ShowFileResponse
     */
    public ShowFileResponse showFile(ShowFileRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showFile);
    }

    /**
     * 查看文件属性与内容
     *
     * 查看文件属性与内容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFileRequest 请求对象
     * @return SyncInvoker<ShowFileRequest, ShowFileResponse>
     */
    public SyncInvoker<ShowFileRequest, ShowFileResponse> showFileInvoker(ShowFileRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.showFile, hcClient);
    }

    /**
     * 获取文件内容
     *
     * 获取文件内容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFileContentRequest 请求对象
     * @return ShowFileContentResponse
     */
    public ShowFileContentResponse showFileContent(ShowFileContentRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showFileContent);
    }

    /**
     * 获取文件内容
     *
     * 获取文件内容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFileContentRequest 请求对象
     * @return SyncInvoker<ShowFileContentRequest, ShowFileContentResponse>
     */
    public SyncInvoker<ShowFileContentRequest, ShowFileContentResponse> showFileContentInvoker(
        ShowFileContentRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.showFileContent, hcClient);
    }

    /**
     * 获取仓库单个文件内容
     *
     * 获取仓库单个文件内容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFileRawRequest 请求对象
     * @return ShowFileRawResponse
     */
    public ShowFileRawResponse showFileRaw(ShowFileRawRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showFileRaw);
    }

    /**
     * 获取仓库单个文件内容
     *
     * 获取仓库单个文件内容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFileRawRequest 请求对象
     * @return SyncInvoker<ShowFileRawRequest, ShowFileRawResponse>
     */
    public SyncInvoker<ShowFileRawRequest, ShowFileRawResponse> showFileRawInvoker(ShowFileRawRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.showFileRaw, hcClient);
    }

    /**
     * 获取仓库默认分支的Readme文件内容
     *
     * 获取仓库默认分支的Readme文件内容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReadmeFileRequest 请求对象
     * @return ShowReadmeFileResponse
     */
    public ShowReadmeFileResponse showReadmeFile(ShowReadmeFileRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showReadmeFile);
    }

    /**
     * 获取仓库默认分支的Readme文件内容
     *
     * 获取仓库默认分支的Readme文件内容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReadmeFileRequest 请求对象
     * @return SyncInvoker<ShowReadmeFileRequest, ShowReadmeFileResponse>
     */
    public SyncInvoker<ShowReadmeFileRequest, ShowReadmeFileResponse> showReadmeFileInvoker(
        ShowReadmeFileRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.showReadmeFile, hcClient);
    }

    /**
     * 更新文件内容
     *
     * 修改仓库ip白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateFileRequest 请求对象
     * @return UpdateFileResponse
     */
    public UpdateFileResponse updateFile(UpdateFileRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.updateFile);
    }

    /**
     * 更新文件内容
     *
     * 修改仓库ip白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateFileRequest 请求对象
     * @return SyncInvoker<UpdateFileRequest, UpdateFileResponse>
     */
    public SyncInvoker<UpdateFileRequest, UpdateFileResponse> updateFileInvoker(UpdateFileRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.updateFile, hcClient);
    }

    /**
     * 关联代码组与成员组
     *
     * 关联代码组与成员组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateGroupUserGroupRequest 请求对象
     * @return AssociateGroupUserGroupResponse
     */
    public AssociateGroupUserGroupResponse associateGroupUserGroup(AssociateGroupUserGroupRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.associateGroupUserGroup);
    }

    /**
     * 关联代码组与成员组
     *
     * 关联代码组与成员组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateGroupUserGroupRequest 请求对象
     * @return SyncInvoker<AssociateGroupUserGroupRequest, AssociateGroupUserGroupResponse>
     */
    public SyncInvoker<AssociateGroupUserGroupRequest, AssociateGroupUserGroupResponse> associateGroupUserGroupInvoker(
        AssociateGroupUserGroupRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.associateGroupUserGroup, hcClient);
    }

    /**
     * 创建代码组
     *
     * 创建代码组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGroupRequest 请求对象
     * @return CreateGroupResponse
     */
    public CreateGroupResponse createGroup(CreateGroupRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.createGroup);
    }

    /**
     * 创建代码组
     *
     * 创建代码组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGroupRequest 请求对象
     * @return SyncInvoker<CreateGroupRequest, CreateGroupResponse>
     */
    public SyncInvoker<CreateGroupRequest, CreateGroupResponse> createGroupInvoker(CreateGroupRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.createGroup, hcClient);
    }

    /**
     * 删除代码组
     *
     * 删除代码组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGroupRequest 请求对象
     * @return DeleteGroupResponse
     */
    public DeleteGroupResponse deleteGroup(DeleteGroupRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.deleteGroup);
    }

    /**
     * 删除代码组
     *
     * 删除代码组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGroupRequest 请求对象
     * @return SyncInvoker<DeleteGroupRequest, DeleteGroupResponse>
     */
    public SyncInvoker<DeleteGroupRequest, DeleteGroupResponse> deleteGroupInvoker(DeleteGroupRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.deleteGroup, hcClient);
    }

    /**
     * 获取代码组下可添加的成员列表
     *
     * 获取代码组下可添加的成员列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupAddableMembersRequest 请求对象
     * @return ListGroupAddableMembersResponse
     */
    public ListGroupAddableMembersResponse listGroupAddableMembers(ListGroupAddableMembersRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listGroupAddableMembers);
    }

    /**
     * 获取代码组下可添加的成员列表
     *
     * 获取代码组下可添加的成员列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupAddableMembersRequest 请求对象
     * @return SyncInvoker<ListGroupAddableMembersRequest, ListGroupAddableMembersResponse>
     */
    public SyncInvoker<ListGroupAddableMembersRequest, ListGroupAddableMembersResponse> listGroupAddableMembersInvoker(
        ListGroupAddableMembersRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listGroupAddableMembers, hcClient);
    }

    /**
     * 获取代码组下可添加的成员组
     *
     * 获取代码组下可添加的成员组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupAddableUserGroupsRequest 请求对象
     * @return ListGroupAddableUserGroupsResponse
     */
    public ListGroupAddableUserGroupsResponse listGroupAddableUserGroups(ListGroupAddableUserGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listGroupAddableUserGroups);
    }

    /**
     * 获取代码组下可添加的成员组
     *
     * 获取代码组下可添加的成员组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupAddableUserGroupsRequest 请求对象
     * @return SyncInvoker<ListGroupAddableUserGroupsRequest, ListGroupAddableUserGroupsResponse>
     */
    public SyncInvoker<ListGroupAddableUserGroupsRequest, ListGroupAddableUserGroupsResponse> listGroupAddableUserGroupsInvoker(
        ListGroupAddableUserGroupsRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listGroupAddableUserGroups, hcClient);
    }

    /**
     * 获取代码组下可添加的成员列表
     *
     * 获取代码组下可添加的成员列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupMembersRequest 请求对象
     * @return ListGroupMembersResponse
     */
    public ListGroupMembersResponse listGroupMembers(ListGroupMembersRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listGroupMembers);
    }

    /**
     * 获取代码组下可添加的成员列表
     *
     * 获取代码组下可添加的成员列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupMembersRequest 请求对象
     * @return SyncInvoker<ListGroupMembersRequest, ListGroupMembersResponse>
     */
    public SyncInvoker<ListGroupMembersRequest, ListGroupMembersResponse> listGroupMembersInvoker(
        ListGroupMembersRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listGroupMembers, hcClient);
    }

    /**
     * 获取代码组权限资源点列表
     *
     * 获取代码组权限资源点列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupPermissionResourcesRequest 请求对象
     * @return ListGroupPermissionResourcesResponse
     */
    public ListGroupPermissionResourcesResponse listGroupPermissionResources(
        ListGroupPermissionResourcesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listGroupPermissionResources);
    }

    /**
     * 获取代码组权限资源点列表
     *
     * 获取代码组权限资源点列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupPermissionResourcesRequest 请求对象
     * @return SyncInvoker<ListGroupPermissionResourcesRequest, ListGroupPermissionResourcesResponse>
     */
    public SyncInvoker<ListGroupPermissionResourcesRequest, ListGroupPermissionResourcesResponse> listGroupPermissionResourcesInvoker(
        ListGroupPermissionResourcesRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listGroupPermissionResources, hcClient);
    }

    /**
     * 获取代码组下的子代码组和仓库列表
     *
     * 获取代码组下的子代码组和仓库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupSubgroupsAndRepositoriesRequest 请求对象
     * @return ListGroupSubgroupsAndRepositoriesResponse
     */
    public ListGroupSubgroupsAndRepositoriesResponse listGroupSubgroupsAndRepositories(
        ListGroupSubgroupsAndRepositoriesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listGroupSubgroupsAndRepositories);
    }

    /**
     * 获取代码组下的子代码组和仓库列表
     *
     * 获取代码组下的子代码组和仓库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupSubgroupsAndRepositoriesRequest 请求对象
     * @return SyncInvoker<ListGroupSubgroupsAndRepositoriesRequest, ListGroupSubgroupsAndRepositoriesResponse>
     */
    public SyncInvoker<ListGroupSubgroupsAndRepositoriesRequest, ListGroupSubgroupsAndRepositoriesResponse> listGroupSubgroupsAndRepositoriesInvoker(
        ListGroupSubgroupsAndRepositoriesRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listGroupSubgroupsAndRepositories, hcClient);
    }

    /**
     * 组织下查询成员组列表
     *
     * 组织下查询成员组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupUserGroupsRequest 请求对象
     * @return ListGroupUserGroupsResponse
     */
    public ListGroupUserGroupsResponse listGroupUserGroups(ListGroupUserGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listGroupUserGroups);
    }

    /**
     * 组织下查询成员组列表
     *
     * 组织下查询成员组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupUserGroupsRequest 请求对象
     * @return SyncInvoker<ListGroupUserGroupsRequest, ListGroupUserGroupsResponse>
     */
    public SyncInvoker<ListGroupUserGroupsRequest, ListGroupUserGroupsResponse> listGroupUserGroupsInvoker(
        ListGroupUserGroupsRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listGroupUserGroups, hcClient);
    }

    /**
     * 获取代码组列表
     *
     * 获取代码组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupsRequest 请求对象
     * @return ListGroupsResponse
     */
    public ListGroupsResponse listGroups(ListGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listGroups);
    }

    /**
     * 获取代码组列表
     *
     * 获取代码组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupsRequest 请求对象
     * @return SyncInvoker<ListGroupsRequest, ListGroupsResponse>
     */
    public SyncInvoker<ListGroupsRequest, ListGroupsResponse> listGroupsInvoker(ListGroupsRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listGroups, hcClient);
    }

    /**
     * 获取项目下当前用户有管理权限的代码组列表
     *
     * 获取项目下当前用户有管理权限的代码组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListManageableGroupsRequest 请求对象
     * @return ListManageableGroupsResponse
     */
    public ListManageableGroupsResponse listManageableGroups(ListManageableGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listManageableGroups);
    }

    /**
     * 获取项目下当前用户有管理权限的代码组列表
     *
     * 获取项目下当前用户有管理权限的代码组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListManageableGroupsRequest 请求对象
     * @return SyncInvoker<ListManageableGroupsRequest, ListManageableGroupsResponse>
     */
    public SyncInvoker<ListManageableGroupsRequest, ListManageableGroupsResponse> listManageableGroupsInvoker(
        ListManageableGroupsRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listManageableGroups, hcClient);
    }

    /**
     * 获取代码组信息
     *
     * 获取代码组信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGroupRequest 请求对象
     * @return ShowGroupResponse
     */
    public ShowGroupResponse showGroup(ShowGroupRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showGroup);
    }

    /**
     * 获取代码组信息
     *
     * 获取代码组信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGroupRequest 请求对象
     * @return SyncInvoker<ShowGroupRequest, ShowGroupResponse>
     */
    public SyncInvoker<ShowGroupRequest, ShowGroupResponse> showGroupInvoker(ShowGroupRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.showGroup, hcClient);
    }

    /**
     * 获取指定代码组的基本设置信息
     *
     * 获取指定代码组的基本设置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGroupGeneralPolicyRequest 请求对象
     * @return ShowGroupGeneralPolicyResponse
     */
    public ShowGroupGeneralPolicyResponse showGroupGeneralPolicy(ShowGroupGeneralPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showGroupGeneralPolicy);
    }

    /**
     * 获取指定代码组的基本设置信息
     *
     * 获取指定代码组的基本设置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGroupGeneralPolicyRequest 请求对象
     * @return SyncInvoker<ShowGroupGeneralPolicyRequest, ShowGroupGeneralPolicyResponse>
     */
    public SyncInvoker<ShowGroupGeneralPolicyRequest, ShowGroupGeneralPolicyResponse> showGroupGeneralPolicyInvoker(
        ShowGroupGeneralPolicyRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.showGroupGeneralPolicy, hcClient);
    }

    /**
     * 获取代码组继承设置项
     *
     * 获取代码组继承设置项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGroupInheritSettingRequest 请求对象
     * @return ShowGroupInheritSettingResponse
     */
    public ShowGroupInheritSettingResponse showGroupInheritSetting(ShowGroupInheritSettingRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showGroupInheritSetting);
    }

    /**
     * 获取代码组继承设置项
     *
     * 获取代码组继承设置项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGroupInheritSettingRequest 请求对象
     * @return SyncInvoker<ShowGroupInheritSettingRequest, ShowGroupInheritSettingResponse>
     */
    public SyncInvoker<ShowGroupInheritSettingRequest, ShowGroupInheritSettingResponse> showGroupInheritSettingInvoker(
        ShowGroupInheritSettingRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.showGroupInheritSetting, hcClient);
    }

    /**
     * 获取代码组继承权限设置开关
     *
     * 获取代码组继承权限设置开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGroupPermissionInheritEnabledRequest 请求对象
     * @return ShowGroupPermissionInheritEnabledResponse
     */
    public ShowGroupPermissionInheritEnabledResponse showGroupPermissionInheritEnabled(
        ShowGroupPermissionInheritEnabledRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showGroupPermissionInheritEnabled);
    }

    /**
     * 获取代码组继承权限设置开关
     *
     * 获取代码组继承权限设置开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGroupPermissionInheritEnabledRequest 请求对象
     * @return SyncInvoker<ShowGroupPermissionInheritEnabledRequest, ShowGroupPermissionInheritEnabledResponse>
     */
    public SyncInvoker<ShowGroupPermissionInheritEnabledRequest, ShowGroupPermissionInheritEnabledResponse> showGroupPermissionInheritEnabledInvoker(
        ShowGroupPermissionInheritEnabledRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.showGroupPermissionInheritEnabled, hcClient);
    }

    /**
     * 获取代码组继承设置项
     *
     * 获取代码组继承设置项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGroupSettingsInheritCfgRequest 请求对象
     * @return ShowGroupSettingsInheritCfgResponse
     */
    public ShowGroupSettingsInheritCfgResponse showGroupSettingsInheritCfg(ShowGroupSettingsInheritCfgRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showGroupSettingsInheritCfg);
    }

    /**
     * 获取代码组继承设置项
     *
     * 获取代码组继承设置项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGroupSettingsInheritCfgRequest 请求对象
     * @return SyncInvoker<ShowGroupSettingsInheritCfgRequest, ShowGroupSettingsInheritCfgResponse>
     */
    public SyncInvoker<ShowGroupSettingsInheritCfgRequest, ShowGroupSettingsInheritCfgResponse> showGroupSettingsInheritCfgInvoker(
        ShowGroupSettingsInheritCfgRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.showGroupSettingsInheritCfg, hcClient);
    }

    /**
     * 获取代码组水印设置
     *
     * 获取代码组水印设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGroupWatermarkRequest 请求对象
     * @return ShowGroupWatermarkResponse
     */
    public ShowGroupWatermarkResponse showGroupWatermark(ShowGroupWatermarkRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showGroupWatermark);
    }

    /**
     * 获取代码组水印设置
     *
     * 获取代码组水印设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGroupWatermarkRequest 请求对象
     * @return SyncInvoker<ShowGroupWatermarkRequest, ShowGroupWatermarkResponse>
     */
    public SyncInvoker<ShowGroupWatermarkRequest, ShowGroupWatermarkResponse> showGroupWatermarkInvoker(
        ShowGroupWatermarkRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.showGroupWatermark, hcClient);
    }

    /**
     * 获取指定代码组的基本设置信息
     *
     * 获取指定代码组的基本设置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGroupsGeneralPolicyRequest 请求对象
     * @return ShowGroupsGeneralPolicyResponse
     */
    public ShowGroupsGeneralPolicyResponse showGroupsGeneralPolicy(ShowGroupsGeneralPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showGroupsGeneralPolicy);
    }

    /**
     * 获取指定代码组的基本设置信息
     *
     * 获取指定代码组的基本设置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGroupsGeneralPolicyRequest 请求对象
     * @return SyncInvoker<ShowGroupsGeneralPolicyRequest, ShowGroupsGeneralPolicyResponse>
     */
    public SyncInvoker<ShowGroupsGeneralPolicyRequest, ShowGroupsGeneralPolicyResponse> showGroupsGeneralPolicyInvoker(
        ShowGroupsGeneralPolicyRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.showGroupsGeneralPolicy, hcClient);
    }

    /**
     * 获取代码组的继承设置
     *
     * 获取代码组的继承设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGroupsInheritRequest 请求对象
     * @return ShowGroupsInheritResponse
     */
    public ShowGroupsInheritResponse showGroupsInherit(ShowGroupsInheritRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showGroupsInherit);
    }

    /**
     * 获取代码组的继承设置
     *
     * 获取代码组的继承设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGroupsInheritRequest 请求对象
     * @return SyncInvoker<ShowGroupsInheritRequest, ShowGroupsInheritResponse>
     */
    public SyncInvoker<ShowGroupsInheritRequest, ShowGroupsInheritResponse> showGroupsInheritInvoker(
        ShowGroupsInheritRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.showGroupsInherit, hcClient);
    }

    /**
     * 移交代码组
     *
     * 移交代码组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request TransferGroupRequest 请求对象
     * @return TransferGroupResponse
     */
    public TransferGroupResponse transferGroup(TransferGroupRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.transferGroup);
    }

    /**
     * 移交代码组
     *
     * 移交代码组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request TransferGroupRequest 请求对象
     * @return SyncInvoker<TransferGroupRequest, TransferGroupResponse>
     */
    public SyncInvoker<TransferGroupRequest, TransferGroupResponse> transferGroupInvoker(TransferGroupRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.transferGroup, hcClient);
    }

    /**
     * 更新代码组的基本设置信息
     *
     * 更新代码组的基本设置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGroupGeneralPolicyRequest 请求对象
     * @return UpdateGroupGeneralPolicyResponse
     */
    public UpdateGroupGeneralPolicyResponse updateGroupGeneralPolicy(UpdateGroupGeneralPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.updateGroupGeneralPolicy);
    }

    /**
     * 更新代码组的基本设置信息
     *
     * 更新代码组的基本设置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGroupGeneralPolicyRequest 请求对象
     * @return SyncInvoker<UpdateGroupGeneralPolicyRequest, UpdateGroupGeneralPolicyResponse>
     */
    public SyncInvoker<UpdateGroupGeneralPolicyRequest, UpdateGroupGeneralPolicyResponse> updateGroupGeneralPolicyInvoker(
        UpdateGroupGeneralPolicyRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.updateGroupGeneralPolicy, hcClient);
    }

    /**
     * 更新代码组水印设置
     *
     * 更新代码组水印设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGroupWatermarkRequest 请求对象
     * @return UpdateGroupWatermarkResponse
     */
    public UpdateGroupWatermarkResponse updateGroupWatermark(UpdateGroupWatermarkRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.updateGroupWatermark);
    }

    /**
     * 更新代码组水印设置
     *
     * 更新代码组水印设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGroupWatermarkRequest 请求对象
     * @return SyncInvoker<UpdateGroupWatermarkRequest, UpdateGroupWatermarkResponse>
     */
    public SyncInvoker<UpdateGroupWatermarkRequest, UpdateGroupWatermarkResponse> updateGroupWatermarkInvoker(
        UpdateGroupWatermarkRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.updateGroupWatermark, hcClient);
    }

    /**
     * 批量添加仓库成员
     *
     * 批量添加仓库成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddRepositoryMembersRequest 请求对象
     * @return AddRepositoryMembersResponse
     */
    public AddRepositoryMembersResponse addRepositoryMembers(AddRepositoryMembersRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.addRepositoryMembers);
    }

    /**
     * 批量添加仓库成员
     *
     * 批量添加仓库成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddRepositoryMembersRequest 请求对象
     * @return SyncInvoker<AddRepositoryMembersRequest, AddRepositoryMembersResponse>
     */
    public SyncInvoker<AddRepositoryMembersRequest, AddRepositoryMembersResponse> addRepositoryMembersInvoker(
        AddRepositoryMembersRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.addRepositoryMembers, hcClient);
    }

    /**
     * 获取代码组下成员组列表
     *
     * 获取代码组下成员组列表(保护分支保护Tags设置中使用)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupProtectedRefsUserGroupsRequest 请求对象
     * @return ListGroupProtectedRefsUserGroupsResponse
     */
    public ListGroupProtectedRefsUserGroupsResponse listGroupProtectedRefsUserGroups(
        ListGroupProtectedRefsUserGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listGroupProtectedRefsUserGroups);
    }

    /**
     * 获取代码组下成员组列表
     *
     * 获取代码组下成员组列表(保护分支保护Tags设置中使用)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupProtectedRefsUserGroupsRequest 请求对象
     * @return SyncInvoker<ListGroupProtectedRefsUserGroupsRequest, ListGroupProtectedRefsUserGroupsResponse>
     */
    public SyncInvoker<ListGroupProtectedRefsUserGroupsRequest, ListGroupProtectedRefsUserGroupsResponse> listGroupProtectedRefsUserGroupsInvoker(
        ListGroupProtectedRefsUserGroupsRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listGroupProtectedRefsUserGroups, hcClient);
    }

    /**
     * 获取仓库成员列表
     *
     * 获取仓库成员列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMembersRequest 请求对象
     * @return ListMembersResponse
     */
    public ListMembersResponse listMembers(ListMembersRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listMembers);
    }

    /**
     * 获取仓库成员列表
     *
     * 获取仓库成员列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMembersRequest 请求对象
     * @return SyncInvoker<ListMembersRequest, ListMembersResponse>
     */
    public SyncInvoker<ListMembersRequest, ListMembersResponse> listMembersInvoker(ListMembersRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listMembers, hcClient);
    }

    /**
     * 获取项目下成员列表
     *
     * 获取项目下成员列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProductPermissionResourcesGrantedUsersRequest 请求对象
     * @return ListProductPermissionResourcesGrantedUsersResponse
     */
    public ListProductPermissionResourcesGrantedUsersResponse listProductPermissionResourcesGrantedUsers(
        ListProductPermissionResourcesGrantedUsersRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listProductPermissionResourcesGrantedUsers);
    }

    /**
     * 获取项目下成员列表
     *
     * 获取项目下成员列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProductPermissionResourcesGrantedUsersRequest 请求对象
     * @return SyncInvoker<ListProductPermissionResourcesGrantedUsersRequest, ListProductPermissionResourcesGrantedUsersResponse>
     */
    public SyncInvoker<ListProductPermissionResourcesGrantedUsersRequest, ListProductPermissionResourcesGrantedUsersResponse> listProductPermissionResourcesGrantedUsersInvoker(
        ListProductPermissionResourcesGrantedUsersRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listProductPermissionResourcesGrantedUsers, hcClient);
    }

    /**
     * 获取项目下成员组列表
     *
     * 获取项目下成员组列表(保护分支保护Tags设置中使用)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectProtectedRefsUserGroupsRequest 请求对象
     * @return ListProjectProtectedRefsUserGroupsResponse
     */
    public ListProjectProtectedRefsUserGroupsResponse listProjectProtectedRefsUserGroups(
        ListProjectProtectedRefsUserGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listProjectProtectedRefsUserGroups);
    }

    /**
     * 获取项目下成员组列表
     *
     * 获取项目下成员组列表(保护分支保护Tags设置中使用)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectProtectedRefsUserGroupsRequest 请求对象
     * @return SyncInvoker<ListProjectProtectedRefsUserGroupsRequest, ListProjectProtectedRefsUserGroupsResponse>
     */
    public SyncInvoker<ListProjectProtectedRefsUserGroupsRequest, ListProjectProtectedRefsUserGroupsResponse> listProjectProtectedRefsUserGroupsInvoker(
        ListProjectProtectedRefsUserGroupsRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listProjectProtectedRefsUserGroups, hcClient);
    }

    /**
     * 获取仓库下成员组列表
     *
     * 获取仓库下成员组列表(保护分支保护Tags设置中使用)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryProtectedRefsUserGroupsRequest 请求对象
     * @return ListRepositoryProtectedRefsUserGroupsResponse
     */
    public ListRepositoryProtectedRefsUserGroupsResponse listRepositoryProtectedRefsUserGroups(
        ListRepositoryProtectedRefsUserGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listRepositoryProtectedRefsUserGroups);
    }

    /**
     * 获取仓库下成员组列表
     *
     * 获取仓库下成员组列表(保护分支保护Tags设置中使用)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryProtectedRefsUserGroupsRequest 请求对象
     * @return SyncInvoker<ListRepositoryProtectedRefsUserGroupsRequest, ListRepositoryProtectedRefsUserGroupsResponse>
     */
    public SyncInvoker<ListRepositoryProtectedRefsUserGroupsRequest, ListRepositoryProtectedRefsUserGroupsResponse> listRepositoryProtectedRefsUserGroupsInvoker(
        ListRepositoryProtectedRefsUserGroupsRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listRepositoryProtectedRefsUserGroups, hcClient);
    }

    /**
     * 获取成员组列表
     *
     * 获取成员组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryUserGroupsRequest 请求对象
     * @return ListRepositoryUserGroupsResponse
     */
    public ListRepositoryUserGroupsResponse listRepositoryUserGroups(ListRepositoryUserGroupsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listRepositoryUserGroups);
    }

    /**
     * 获取成员组列表
     *
     * 获取成员组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryUserGroupsRequest 请求对象
     * @return SyncInvoker<ListRepositoryUserGroupsRequest, ListRepositoryUserGroupsResponse>
     */
    public SyncInvoker<ListRepositoryUserGroupsRequest, ListRepositoryUserGroupsResponse> listRepositoryUserGroupsInvoker(
        ListRepositoryUserGroupsRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listRepositoryUserGroups, hcClient);
    }

    /**
     * 审核合并请求
     *
     * 审核合并请求
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ApprovalMergeRequestRequest 请求对象
     * @return ApprovalMergeRequestResponse
     */
    public ApprovalMergeRequestResponse approvalMergeRequest(ApprovalMergeRequestRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.approvalMergeRequest);
    }

    /**
     * 审核合并请求
     *
     * 审核合并请求
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ApprovalMergeRequestRequest 请求对象
     * @return SyncInvoker<ApprovalMergeRequestRequest, ApprovalMergeRequestResponse>
     */
    public SyncInvoker<ApprovalMergeRequestRequest, ApprovalMergeRequestResponse> approvalMergeRequestInvoker(
        ApprovalMergeRequestRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.approvalMergeRequest, hcClient);
    }

    /**
     * Cherry pick合并请求
     *
     * Cherry pick合并请求
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCherryPickMergeRequestRequest 请求对象
     * @return CreateCherryPickMergeRequestResponse
     */
    public CreateCherryPickMergeRequestResponse createCherryPickMergeRequest(
        CreateCherryPickMergeRequestRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.createCherryPickMergeRequest);
    }

    /**
     * Cherry pick合并请求
     *
     * Cherry pick合并请求
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCherryPickMergeRequestRequest 请求对象
     * @return SyncInvoker<CreateCherryPickMergeRequestRequest, CreateCherryPickMergeRequestResponse>
     */
    public SyncInvoker<CreateCherryPickMergeRequestRequest, CreateCherryPickMergeRequestResponse> createCherryPickMergeRequestInvoker(
        CreateCherryPickMergeRequestRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.createCherryPickMergeRequest, hcClient);
    }

    /**
     * 创建代码组合并请求审核设置
     *
     * 创建代码组合并请求审核设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGroupMergeRequestApproverSettingRequest 请求对象
     * @return CreateGroupMergeRequestApproverSettingResponse
     */
    public CreateGroupMergeRequestApproverSettingResponse createGroupMergeRequestApproverSetting(
        CreateGroupMergeRequestApproverSettingRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.createGroupMergeRequestApproverSetting);
    }

    /**
     * 创建代码组合并请求审核设置
     *
     * 创建代码组合并请求审核设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGroupMergeRequestApproverSettingRequest 请求对象
     * @return SyncInvoker<CreateGroupMergeRequestApproverSettingRequest, CreateGroupMergeRequestApproverSettingResponse>
     */
    public SyncInvoker<CreateGroupMergeRequestApproverSettingRequest, CreateGroupMergeRequestApproverSettingResponse> createGroupMergeRequestApproverSettingInvoker(
        CreateGroupMergeRequestApproverSettingRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.createGroupMergeRequestApproverSetting, hcClient);
    }

    /**
     * 创建代码组合并请求模板
     *
     * 创建代码组合并请求模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGroupMergeRequestTemplateRequest 请求对象
     * @return CreateGroupMergeRequestTemplateResponse
     */
    public CreateGroupMergeRequestTemplateResponse createGroupMergeRequestTemplate(
        CreateGroupMergeRequestTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.createGroupMergeRequestTemplate);
    }

    /**
     * 创建代码组合并请求模板
     *
     * 创建代码组合并请求模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGroupMergeRequestTemplateRequest 请求对象
     * @return SyncInvoker<CreateGroupMergeRequestTemplateRequest, CreateGroupMergeRequestTemplateResponse>
     */
    public SyncInvoker<CreateGroupMergeRequestTemplateRequest, CreateGroupMergeRequestTemplateResponse> createGroupMergeRequestTemplateInvoker(
        CreateGroupMergeRequestTemplateRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.createGroupMergeRequestTemplate, hcClient);
    }

    /**
     * 创建合并请求
     *
     * 创建合并请求
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMergeRequestRequest 请求对象
     * @return CreateMergeRequestResponse
     */
    public CreateMergeRequestResponse createMergeRequest(CreateMergeRequestRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.createMergeRequest);
    }

    /**
     * 创建合并请求
     *
     * 创建合并请求
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMergeRequestRequest 请求对象
     * @return SyncInvoker<CreateMergeRequestRequest, CreateMergeRequestResponse>
     */
    public SyncInvoker<CreateMergeRequestRequest, CreateMergeRequestResponse> createMergeRequestInvoker(
        CreateMergeRequestRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.createMergeRequest, hcClient);
    }

    /**
     * 创建合并请求审核设置
     *
     * 创建合并请求审核设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMergeRequestApproverSettingRequest 请求对象
     * @return CreateMergeRequestApproverSettingResponse
     */
    public CreateMergeRequestApproverSettingResponse createMergeRequestApproverSetting(
        CreateMergeRequestApproverSettingRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.createMergeRequestApproverSetting);
    }

    /**
     * 创建合并请求审核设置
     *
     * 创建合并请求审核设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMergeRequestApproverSettingRequest 请求对象
     * @return SyncInvoker<CreateMergeRequestApproverSettingRequest, CreateMergeRequestApproverSettingResponse>
     */
    public SyncInvoker<CreateMergeRequestApproverSettingRequest, CreateMergeRequestApproverSettingResponse> createMergeRequestApproverSettingInvoker(
        CreateMergeRequestApproverSettingRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.createMergeRequestApproverSetting, hcClient);
    }

    /**
     * 创建合并请求模板
     *
     * 创建合并请求模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMergeRequestTemplateRequest 请求对象
     * @return CreateMergeRequestTemplateResponse
     */
    public CreateMergeRequestTemplateResponse createMergeRequestTemplate(CreateMergeRequestTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.createMergeRequestTemplate);
    }

    /**
     * 创建合并请求模板
     *
     * 创建合并请求模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMergeRequestTemplateRequest 请求对象
     * @return SyncInvoker<CreateMergeRequestTemplateRequest, CreateMergeRequestTemplateResponse>
     */
    public SyncInvoker<CreateMergeRequestTemplateRequest, CreateMergeRequestTemplateResponse> createMergeRequestTemplateInvoker(
        CreateMergeRequestTemplateRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.createMergeRequestTemplate, hcClient);
    }

    /**
     * 创建项目合并请求审核设置
     *
     * 创建项目合并请求审核设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProjectMergeRequestApproverSettingRequest 请求对象
     * @return CreateProjectMergeRequestApproverSettingResponse
     */
    public CreateProjectMergeRequestApproverSettingResponse createProjectMergeRequestApproverSetting(
        CreateProjectMergeRequestApproverSettingRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.createProjectMergeRequestApproverSetting);
    }

    /**
     * 创建项目合并请求审核设置
     *
     * 创建项目合并请求审核设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProjectMergeRequestApproverSettingRequest 请求对象
     * @return SyncInvoker<CreateProjectMergeRequestApproverSettingRequest, CreateProjectMergeRequestApproverSettingResponse>
     */
    public SyncInvoker<CreateProjectMergeRequestApproverSettingRequest, CreateProjectMergeRequestApproverSettingResponse> createProjectMergeRequestApproverSettingInvoker(
        CreateProjectMergeRequestApproverSettingRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.createProjectMergeRequestApproverSetting, hcClient);
    }

    /**
     * 创建项目合并请求模板
     *
     * 创建项目合并请求模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProjectMergeRequestTemplateRequest 请求对象
     * @return CreateProjectMergeRequestTemplateResponse
     */
    public CreateProjectMergeRequestTemplateResponse createProjectMergeRequestTemplate(
        CreateProjectMergeRequestTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.createProjectMergeRequestTemplate);
    }

    /**
     * 创建项目合并请求模板
     *
     * 创建项目合并请求模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProjectMergeRequestTemplateRequest 请求对象
     * @return SyncInvoker<CreateProjectMergeRequestTemplateRequest, CreateProjectMergeRequestTemplateResponse>
     */
    public SyncInvoker<CreateProjectMergeRequestTemplateRequest, CreateProjectMergeRequestTemplateResponse> createProjectMergeRequestTemplateInvoker(
        CreateProjectMergeRequestTemplateRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.createProjectMergeRequestTemplate, hcClient);
    }

    /**
     * 删除代码组合并请求审核配置
     *
     * 删除代码组合并请求审核配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGroupMergeRequestApproverSettingRequest 请求对象
     * @return DeleteGroupMergeRequestApproverSettingResponse
     */
    public DeleteGroupMergeRequestApproverSettingResponse deleteGroupMergeRequestApproverSetting(
        DeleteGroupMergeRequestApproverSettingRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.deleteGroupMergeRequestApproverSetting);
    }

    /**
     * 删除代码组合并请求审核配置
     *
     * 删除代码组合并请求审核配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGroupMergeRequestApproverSettingRequest 请求对象
     * @return SyncInvoker<DeleteGroupMergeRequestApproverSettingRequest, DeleteGroupMergeRequestApproverSettingResponse>
     */
    public SyncInvoker<DeleteGroupMergeRequestApproverSettingRequest, DeleteGroupMergeRequestApproverSettingResponse> deleteGroupMergeRequestApproverSettingInvoker(
        DeleteGroupMergeRequestApproverSettingRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.deleteGroupMergeRequestApproverSetting, hcClient);
    }

    /**
     * 删除代码组合并请求模板
     *
     * 删除代码组合并请求模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGroupMergeRequestTemplateRequest 请求对象
     * @return DeleteGroupMergeRequestTemplateResponse
     */
    public DeleteGroupMergeRequestTemplateResponse deleteGroupMergeRequestTemplate(
        DeleteGroupMergeRequestTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.deleteGroupMergeRequestTemplate);
    }

    /**
     * 删除代码组合并请求模板
     *
     * 删除代码组合并请求模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGroupMergeRequestTemplateRequest 请求对象
     * @return SyncInvoker<DeleteGroupMergeRequestTemplateRequest, DeleteGroupMergeRequestTemplateResponse>
     */
    public SyncInvoker<DeleteGroupMergeRequestTemplateRequest, DeleteGroupMergeRequestTemplateResponse> deleteGroupMergeRequestTemplateInvoker(
        DeleteGroupMergeRequestTemplateRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.deleteGroupMergeRequestTemplate, hcClient);
    }

    /**
     * 删除合并请求审核配置
     *
     * 删除合并请求审核配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMergeRequestApproverSettingRequest 请求对象
     * @return DeleteMergeRequestApproverSettingResponse
     */
    public DeleteMergeRequestApproverSettingResponse deleteMergeRequestApproverSetting(
        DeleteMergeRequestApproverSettingRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.deleteMergeRequestApproverSetting);
    }

    /**
     * 删除合并请求审核配置
     *
     * 删除合并请求审核配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMergeRequestApproverSettingRequest 请求对象
     * @return SyncInvoker<DeleteMergeRequestApproverSettingRequest, DeleteMergeRequestApproverSettingResponse>
     */
    public SyncInvoker<DeleteMergeRequestApproverSettingRequest, DeleteMergeRequestApproverSettingResponse> deleteMergeRequestApproverSettingInvoker(
        DeleteMergeRequestApproverSettingRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.deleteMergeRequestApproverSetting, hcClient);
    }

    /**
     * 删除合并请求模板
     *
     * 删除合并请求模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMergeRequestTemplateRequest 请求对象
     * @return DeleteMergeRequestTemplateResponse
     */
    public DeleteMergeRequestTemplateResponse deleteMergeRequestTemplate(DeleteMergeRequestTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.deleteMergeRequestTemplate);
    }

    /**
     * 删除合并请求模板
     *
     * 删除合并请求模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMergeRequestTemplateRequest 请求对象
     * @return SyncInvoker<DeleteMergeRequestTemplateRequest, DeleteMergeRequestTemplateResponse>
     */
    public SyncInvoker<DeleteMergeRequestTemplateRequest, DeleteMergeRequestTemplateResponse> deleteMergeRequestTemplateInvoker(
        DeleteMergeRequestTemplateRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.deleteMergeRequestTemplate, hcClient);
    }

    /**
     * 删除合并请求打分
     *
     * 删除合并请求打分
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMergeRequestVoteRequest 请求对象
     * @return DeleteMergeRequestVoteResponse
     */
    public DeleteMergeRequestVoteResponse deleteMergeRequestVote(DeleteMergeRequestVoteRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.deleteMergeRequestVote);
    }

    /**
     * 删除合并请求打分
     *
     * 删除合并请求打分
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMergeRequestVoteRequest 请求对象
     * @return SyncInvoker<DeleteMergeRequestVoteRequest, DeleteMergeRequestVoteResponse>
     */
    public SyncInvoker<DeleteMergeRequestVoteRequest, DeleteMergeRequestVoteResponse> deleteMergeRequestVoteInvoker(
        DeleteMergeRequestVoteRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.deleteMergeRequestVote, hcClient);
    }

    /**
     * 删除项目合并请求审核配置
     *
     * 删除项目合并请求审核配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteProjectMergeRequestApproverSettingRequest 请求对象
     * @return DeleteProjectMergeRequestApproverSettingResponse
     */
    public DeleteProjectMergeRequestApproverSettingResponse deleteProjectMergeRequestApproverSetting(
        DeleteProjectMergeRequestApproverSettingRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.deleteProjectMergeRequestApproverSetting);
    }

    /**
     * 删除项目合并请求审核配置
     *
     * 删除项目合并请求审核配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteProjectMergeRequestApproverSettingRequest 请求对象
     * @return SyncInvoker<DeleteProjectMergeRequestApproverSettingRequest, DeleteProjectMergeRequestApproverSettingResponse>
     */
    public SyncInvoker<DeleteProjectMergeRequestApproverSettingRequest, DeleteProjectMergeRequestApproverSettingResponse> deleteProjectMergeRequestApproverSettingInvoker(
        DeleteProjectMergeRequestApproverSettingRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.deleteProjectMergeRequestApproverSetting, hcClient);
    }

    /**
     * 删除项目合并请求模板
     *
     * 删除项目合并请求模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteProjectMergeRequestTemplateRequest 请求对象
     * @return DeleteProjectMergeRequestTemplateResponse
     */
    public DeleteProjectMergeRequestTemplateResponse deleteProjectMergeRequestTemplate(
        DeleteProjectMergeRequestTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.deleteProjectMergeRequestTemplate);
    }

    /**
     * 删除项目合并请求模板
     *
     * 删除项目合并请求模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteProjectMergeRequestTemplateRequest 请求对象
     * @return SyncInvoker<DeleteProjectMergeRequestTemplateRequest, DeleteProjectMergeRequestTemplateResponse>
     */
    public SyncInvoker<DeleteProjectMergeRequestTemplateRequest, DeleteProjectMergeRequestTemplateResponse> deleteProjectMergeRequestTemplateInvoker(
        DeleteProjectMergeRequestTemplateRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.deleteProjectMergeRequestTemplate, hcClient);
    }

    /**
     * 导入合并请求
     *
     * 导入合并请求
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportMergeRequestRequest 请求对象
     * @return ImportMergeRequestResponse
     */
    public ImportMergeRequestResponse importMergeRequest(ImportMergeRequestRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.importMergeRequest);
    }

    /**
     * 导入合并请求
     *
     * 导入合并请求
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportMergeRequestRequest 请求对象
     * @return SyncInvoker<ImportMergeRequestRequest, ImportMergeRequestResponse>
     */
    public SyncInvoker<ImportMergeRequestRequest, ImportMergeRequestResponse> importMergeRequestInvoker(
        ImportMergeRequestRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.importMergeRequest, hcClient);
    }

    /**
     * 获取提交关联的合并请求
     *
     * 获取提交关联的合并请求
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCommitAssociatedMergeRequestsRequest 请求对象
     * @return ListCommitAssociatedMergeRequestsResponse
     */
    public ListCommitAssociatedMergeRequestsResponse listCommitAssociatedMergeRequests(
        ListCommitAssociatedMergeRequestsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listCommitAssociatedMergeRequests);
    }

    /**
     * 获取提交关联的合并请求
     *
     * 获取提交关联的合并请求
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCommitAssociatedMergeRequestsRequest 请求对象
     * @return SyncInvoker<ListCommitAssociatedMergeRequestsRequest, ListCommitAssociatedMergeRequestsResponse>
     */
    public SyncInvoker<ListCommitAssociatedMergeRequestsRequest, ListCommitAssociatedMergeRequestsResponse> listCommitAssociatedMergeRequestsInvoker(
        ListCommitAssociatedMergeRequestsRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listCommitAssociatedMergeRequests, hcClient);
    }

    /**
     * 获取检视意见模板列表
     *
     * 获取检视意见模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDiscussionTemplatesRequest 请求对象
     * @return ListDiscussionTemplatesResponse
     */
    public ListDiscussionTemplatesResponse listDiscussionTemplates(ListDiscussionTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listDiscussionTemplates);
    }

    /**
     * 获取检视意见模板列表
     *
     * 获取检视意见模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDiscussionTemplatesRequest 请求对象
     * @return SyncInvoker<ListDiscussionTemplatesRequest, ListDiscussionTemplatesResponse>
     */
    public SyncInvoker<ListDiscussionTemplatesRequest, ListDiscussionTemplatesResponse> listDiscussionTemplatesInvoker(
        ListDiscussionTemplatesRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listDiscussionTemplates, hcClient);
    }

    /**
     * 获取代码组合并请求审核设置列表
     *
     * 获取代码组合并请求审核设置列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupMergeRequestApproverSettingsRequest 请求对象
     * @return ListGroupMergeRequestApproverSettingsResponse
     */
    public ListGroupMergeRequestApproverSettingsResponse listGroupMergeRequestApproverSettings(
        ListGroupMergeRequestApproverSettingsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listGroupMergeRequestApproverSettings);
    }

    /**
     * 获取代码组合并请求审核设置列表
     *
     * 获取代码组合并请求审核设置列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupMergeRequestApproverSettingsRequest 请求对象
     * @return SyncInvoker<ListGroupMergeRequestApproverSettingsRequest, ListGroupMergeRequestApproverSettingsResponse>
     */
    public SyncInvoker<ListGroupMergeRequestApproverSettingsRequest, ListGroupMergeRequestApproverSettingsResponse> listGroupMergeRequestApproverSettingsInvoker(
        ListGroupMergeRequestApproverSettingsRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listGroupMergeRequestApproverSettings, hcClient);
    }

    /**
     * 获取代码组检视人
     *
     * 获取代码组检视人
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupMergeRequestCanBeAssignedReviewersRequest 请求对象
     * @return ListGroupMergeRequestCanBeAssignedReviewersResponse
     */
    public ListGroupMergeRequestCanBeAssignedReviewersResponse listGroupMergeRequestCanBeAssignedReviewers(
        ListGroupMergeRequestCanBeAssignedReviewersRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listGroupMergeRequestCanBeAssignedReviewers);
    }

    /**
     * 获取代码组检视人
     *
     * 获取代码组检视人
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupMergeRequestCanBeAssignedReviewersRequest 请求对象
     * @return SyncInvoker<ListGroupMergeRequestCanBeAssignedReviewersRequest, ListGroupMergeRequestCanBeAssignedReviewersResponse>
     */
    public SyncInvoker<ListGroupMergeRequestCanBeAssignedReviewersRequest, ListGroupMergeRequestCanBeAssignedReviewersResponse> listGroupMergeRequestCanBeAssignedReviewersInvoker(
        ListGroupMergeRequestCanBeAssignedReviewersRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listGroupMergeRequestCanBeAssignedReviewers, hcClient);
    }

    /**
     * 获取代码组合并请求模板列表
     *
     * 获取代码组合并请求模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupMergeRequestTemplatesRequest 请求对象
     * @return ListGroupMergeRequestTemplatesResponse
     */
    public ListGroupMergeRequestTemplatesResponse listGroupMergeRequestTemplates(
        ListGroupMergeRequestTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listGroupMergeRequestTemplates);
    }

    /**
     * 获取代码组合并请求模板列表
     *
     * 获取代码组合并请求模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupMergeRequestTemplatesRequest 请求对象
     * @return SyncInvoker<ListGroupMergeRequestTemplatesRequest, ListGroupMergeRequestTemplatesResponse>
     */
    public SyncInvoker<ListGroupMergeRequestTemplatesRequest, ListGroupMergeRequestTemplatesResponse> listGroupMergeRequestTemplatesInvoker(
        ListGroupMergeRequestTemplatesRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listGroupMergeRequestTemplates, hcClient);
    }

    /**
     * 获取代码组审核人或合并人
     *
     * 获取代码组审核人或合并人
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupMergeRequestValidAssignedCandidatesRequest 请求对象
     * @return ListGroupMergeRequestValidAssignedCandidatesResponse
     */
    public ListGroupMergeRequestValidAssignedCandidatesResponse listGroupMergeRequestValidAssignedCandidates(
        ListGroupMergeRequestValidAssignedCandidatesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listGroupMergeRequestValidAssignedCandidates);
    }

    /**
     * 获取代码组审核人或合并人
     *
     * 获取代码组审核人或合并人
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupMergeRequestValidAssignedCandidatesRequest 请求对象
     * @return SyncInvoker<ListGroupMergeRequestValidAssignedCandidatesRequest, ListGroupMergeRequestValidAssignedCandidatesResponse>
     */
    public SyncInvoker<ListGroupMergeRequestValidAssignedCandidatesRequest, ListGroupMergeRequestValidAssignedCandidatesResponse> listGroupMergeRequestValidAssignedCandidatesInvoker(
        ListGroupMergeRequestValidAssignedCandidatesRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listGroupMergeRequestValidAssignedCandidates, hcClient);
    }

    /**
     * 获取合并请求审核设置列表
     *
     * 获取合并请求审核设置列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMergeRequestApproverSettingsRequest 请求对象
     * @return ListMergeRequestApproverSettingsResponse
     */
    public ListMergeRequestApproverSettingsResponse listMergeRequestApproverSettings(
        ListMergeRequestApproverSettingsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listMergeRequestApproverSettings);
    }

    /**
     * 获取合并请求审核设置列表
     *
     * 获取合并请求审核设置列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMergeRequestApproverSettingsRequest 请求对象
     * @return SyncInvoker<ListMergeRequestApproverSettingsRequest, ListMergeRequestApproverSettingsResponse>
     */
    public SyncInvoker<ListMergeRequestApproverSettingsRequest, ListMergeRequestApproverSettingsResponse> listMergeRequestApproverSettingsInvoker(
        ListMergeRequestApproverSettingsRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listMergeRequestApproverSettings, hcClient);
    }

    /**
     * 获取合并请求审核人列表
     *
     * 获取合并请求审核人列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMergeRequestApproversRequest 请求对象
     * @return ListMergeRequestApproversResponse
     */
    public ListMergeRequestApproversResponse listMergeRequestApprovers(ListMergeRequestApproversRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listMergeRequestApprovers);
    }

    /**
     * 获取合并请求审核人列表
     *
     * 获取合并请求审核人列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMergeRequestApproversRequest 请求对象
     * @return SyncInvoker<ListMergeRequestApproversRequest, ListMergeRequestApproversResponse>
     */
    public SyncInvoker<ListMergeRequestApproversRequest, ListMergeRequestApproversResponse> listMergeRequestApproversInvoker(
        ListMergeRequestApproversRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listMergeRequestApprovers, hcClient);
    }

    /**
     * 获取合并请求文件变更列表
     *
     * 获取合并请求文件变更列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMergeRequestChangesRequest 请求对象
     * @return ListMergeRequestChangesResponse
     */
    public ListMergeRequestChangesResponse listMergeRequestChanges(ListMergeRequestChangesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listMergeRequestChanges);
    }

    /**
     * 获取合并请求文件变更列表
     *
     * 获取合并请求文件变更列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMergeRequestChangesRequest 请求对象
     * @return SyncInvoker<ListMergeRequestChangesRequest, ListMergeRequestChangesResponse>
     */
    public SyncInvoker<ListMergeRequestChangesRequest, ListMergeRequestChangesResponse> listMergeRequestChangesInvoker(
        ListMergeRequestChangesRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listMergeRequestChanges, hcClient);
    }

    /**
     * 获取合并请求文件变更列表树
     *
     * 获取合并请求文件变更列表树
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMergeRequestChangesTreesRequest 请求对象
     * @return ListMergeRequestChangesTreesResponse
     */
    public ListMergeRequestChangesTreesResponse listMergeRequestChangesTrees(
        ListMergeRequestChangesTreesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listMergeRequestChangesTrees);
    }

    /**
     * 获取合并请求文件变更列表树
     *
     * 获取合并请求文件变更列表树
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMergeRequestChangesTreesRequest 请求对象
     * @return SyncInvoker<ListMergeRequestChangesTreesRequest, ListMergeRequestChangesTreesResponse>
     */
    public SyncInvoker<ListMergeRequestChangesTreesRequest, ListMergeRequestChangesTreesResponse> listMergeRequestChangesTreesInvoker(
        ListMergeRequestChangesTreesRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listMergeRequestChangesTrees, hcClient);
    }

    /**
     * 获取合并请求commit列表
     *
     * 获取合并请求commit列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMergeRequestCommitsRequest 请求对象
     * @return ListMergeRequestCommitsResponse
     */
    public ListMergeRequestCommitsResponse listMergeRequestCommits(ListMergeRequestCommitsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listMergeRequestCommits);
    }

    /**
     * 获取合并请求commit列表
     *
     * 获取合并请求commit列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMergeRequestCommitsRequest 请求对象
     * @return SyncInvoker<ListMergeRequestCommitsRequest, ListMergeRequestCommitsResponse>
     */
    public SyncInvoker<ListMergeRequestCommitsRequest, ListMergeRequestCommitsResponse> listMergeRequestCommitsInvoker(
        ListMergeRequestCommitsRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listMergeRequestCommits, hcClient);
    }

    /**
     * 获取所有的冲突文件
     *
     * 获取所有的冲突文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMergeRequestConflictFilesRequest 请求对象
     * @return ListMergeRequestConflictFilesResponse
     */
    public ListMergeRequestConflictFilesResponse listMergeRequestConflictFiles(
        ListMergeRequestConflictFilesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listMergeRequestConflictFiles);
    }

    /**
     * 获取所有的冲突文件
     *
     * 获取所有的冲突文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMergeRequestConflictFilesRequest 请求对象
     * @return SyncInvoker<ListMergeRequestConflictFilesRequest, ListMergeRequestConflictFilesResponse>
     */
    public SyncInvoker<ListMergeRequestConflictFilesRequest, ListMergeRequestConflictFilesResponse> listMergeRequestConflictFilesInvoker(
        ListMergeRequestConflictFilesRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listMergeRequestConflictFiles, hcClient);
    }

    /**
     * 获取合并请求评价列表
     *
     * 获取合并请求评价列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMergeRequestEvaluationsRequest 请求对象
     * @return ListMergeRequestEvaluationsResponse
     */
    public ListMergeRequestEvaluationsResponse listMergeRequestEvaluations(ListMergeRequestEvaluationsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listMergeRequestEvaluations);
    }

    /**
     * 获取合并请求评价列表
     *
     * 获取合并请求评价列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMergeRequestEvaluationsRequest 请求对象
     * @return SyncInvoker<ListMergeRequestEvaluationsRequest, ListMergeRequestEvaluationsResponse>
     */
    public SyncInvoker<ListMergeRequestEvaluationsRequest, ListMergeRequestEvaluationsResponse> listMergeRequestEvaluationsInvoker(
        ListMergeRequestEvaluationsRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listMergeRequestEvaluations, hcClient);
    }

    /**
     * 获取合并请求参与者
     *
     * 获取合并请求参与者
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMergeRequestParticipantsRequest 请求对象
     * @return ListMergeRequestParticipantsResponse
     */
    public ListMergeRequestParticipantsResponse listMergeRequestParticipants(
        ListMergeRequestParticipantsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listMergeRequestParticipants);
    }

    /**
     * 获取合并请求参与者
     *
     * 获取合并请求参与者
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMergeRequestParticipantsRequest 请求对象
     * @return SyncInvoker<ListMergeRequestParticipantsRequest, ListMergeRequestParticipantsResponse>
     */
    public SyncInvoker<ListMergeRequestParticipantsRequest, ListMergeRequestParticipantsResponse> listMergeRequestParticipantsInvoker(
        ListMergeRequestParticipantsRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listMergeRequestParticipants, hcClient);
    }

    /**
     * 获取合并请求检视人列表
     *
     * 获取合并请求检视人列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMergeRequestReviewersRequest 请求对象
     * @return ListMergeRequestReviewersResponse
     */
    public ListMergeRequestReviewersResponse listMergeRequestReviewers(ListMergeRequestReviewersRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listMergeRequestReviewers);
    }

    /**
     * 获取合并请求检视人列表
     *
     * 获取合并请求检视人列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMergeRequestReviewersRequest 请求对象
     * @return SyncInvoker<ListMergeRequestReviewersRequest, ListMergeRequestReviewersResponse>
     */
    public SyncInvoker<ListMergeRequestReviewersRequest, ListMergeRequestReviewersResponse> listMergeRequestReviewersInvoker(
        ListMergeRequestReviewersRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listMergeRequestReviewers, hcClient);
    }

    /**
     * 获取合并请求模板列表
     *
     * 获取合并请求模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMergeRequestTemplatesRequest 请求对象
     * @return ListMergeRequestTemplatesResponse
     */
    public ListMergeRequestTemplatesResponse listMergeRequestTemplates(ListMergeRequestTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listMergeRequestTemplates);
    }

    /**
     * 获取合并请求模板列表
     *
     * 获取合并请求模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMergeRequestTemplatesRequest 请求对象
     * @return SyncInvoker<ListMergeRequestTemplatesRequest, ListMergeRequestTemplatesResponse>
     */
    public SyncInvoker<ListMergeRequestTemplatesRequest, ListMergeRequestTemplatesResponse> listMergeRequestTemplatesInvoker(
        ListMergeRequestTemplatesRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listMergeRequestTemplates, hcClient);
    }

    /**
     * 获取可选的合并请求检视人
     *
     * 获取可选的合并请求检视人
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMergeRequestValidAssignedCandidatesRequest 请求对象
     * @return ListMergeRequestValidAssignedCandidatesResponse
     */
    public ListMergeRequestValidAssignedCandidatesResponse listMergeRequestValidAssignedCandidates(
        ListMergeRequestValidAssignedCandidatesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listMergeRequestValidAssignedCandidates);
    }

    /**
     * 获取可选的合并请求检视人
     *
     * 获取可选的合并请求检视人
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMergeRequestValidAssignedCandidatesRequest 请求对象
     * @return SyncInvoker<ListMergeRequestValidAssignedCandidatesRequest, ListMergeRequestValidAssignedCandidatesResponse>
     */
    public SyncInvoker<ListMergeRequestValidAssignedCandidatesRequest, ListMergeRequestValidAssignedCandidatesResponse> listMergeRequestValidAssignedCandidatesInvoker(
        ListMergeRequestValidAssignedCandidatesRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listMergeRequestValidAssignedCandidates, hcClient);
    }

    /**
     * 获取文件变更历史版本列表
     *
     * 获取文件变更历史版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMergeRequestVersionsRequest 请求对象
     * @return ListMergeRequestVersionsResponse
     */
    public ListMergeRequestVersionsResponse listMergeRequestVersions(ListMergeRequestVersionsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listMergeRequestVersions);
    }

    /**
     * 获取文件变更历史版本列表
     *
     * 获取文件变更历史版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMergeRequestVersionsRequest 请求对象
     * @return SyncInvoker<ListMergeRequestVersionsRequest, ListMergeRequestVersionsResponse>
     */
    public SyncInvoker<ListMergeRequestVersionsRequest, ListMergeRequestVersionsResponse> listMergeRequestVersionsInvoker(
        ListMergeRequestVersionsRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listMergeRequestVersions, hcClient);
    }

    /**
     * 获取个人首页mr列表
     *
     * 获取个人首页mr列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPersonalMergeRequestsRequest 请求对象
     * @return ListPersonalMergeRequestsResponse
     */
    public ListPersonalMergeRequestsResponse listPersonalMergeRequests(ListPersonalMergeRequestsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listPersonalMergeRequests);
    }

    /**
     * 获取个人首页mr列表
     *
     * 获取个人首页mr列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPersonalMergeRequestsRequest 请求对象
     * @return SyncInvoker<ListPersonalMergeRequestsRequest, ListPersonalMergeRequestsResponse>
     */
    public SyncInvoker<ListPersonalMergeRequestsRequest, ListPersonalMergeRequestsResponse> listPersonalMergeRequestsInvoker(
        ListPersonalMergeRequestsRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listPersonalMergeRequests, hcClient);
    }

    /**
     * 获取项目合并请求审核设置列表
     *
     * 获取项目合并请求审核设置列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectMergeRequestApproverSettingsRequest 请求对象
     * @return ListProjectMergeRequestApproverSettingsResponse
     */
    public ListProjectMergeRequestApproverSettingsResponse listProjectMergeRequestApproverSettings(
        ListProjectMergeRequestApproverSettingsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listProjectMergeRequestApproverSettings);
    }

    /**
     * 获取项目合并请求审核设置列表
     *
     * 获取项目合并请求审核设置列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectMergeRequestApproverSettingsRequest 请求对象
     * @return SyncInvoker<ListProjectMergeRequestApproverSettingsRequest, ListProjectMergeRequestApproverSettingsResponse>
     */
    public SyncInvoker<ListProjectMergeRequestApproverSettingsRequest, ListProjectMergeRequestApproverSettingsResponse> listProjectMergeRequestApproverSettingsInvoker(
        ListProjectMergeRequestApproverSettingsRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listProjectMergeRequestApproverSettings, hcClient);
    }

    /**
     * 获取项目检视人
     *
     * 获取代码组检视人
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectMergeRequestCanBeAssignedReviewersRequest 请求对象
     * @return ListProjectMergeRequestCanBeAssignedReviewersResponse
     */
    public ListProjectMergeRequestCanBeAssignedReviewersResponse listProjectMergeRequestCanBeAssignedReviewers(
        ListProjectMergeRequestCanBeAssignedReviewersRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listProjectMergeRequestCanBeAssignedReviewers);
    }

    /**
     * 获取项目检视人
     *
     * 获取代码组检视人
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectMergeRequestCanBeAssignedReviewersRequest 请求对象
     * @return SyncInvoker<ListProjectMergeRequestCanBeAssignedReviewersRequest, ListProjectMergeRequestCanBeAssignedReviewersResponse>
     */
    public SyncInvoker<ListProjectMergeRequestCanBeAssignedReviewersRequest, ListProjectMergeRequestCanBeAssignedReviewersResponse> listProjectMergeRequestCanBeAssignedReviewersInvoker(
        ListProjectMergeRequestCanBeAssignedReviewersRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listProjectMergeRequestCanBeAssignedReviewers, hcClient);
    }

    /**
     * 获取项目审核人或合并人
     *
     * 获取代码组审核人或合并人
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectMergeRequestCanBeAssignedUsersRequest 请求对象
     * @return ListProjectMergeRequestCanBeAssignedUsersResponse
     */
    public ListProjectMergeRequestCanBeAssignedUsersResponse listProjectMergeRequestCanBeAssignedUsers(
        ListProjectMergeRequestCanBeAssignedUsersRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listProjectMergeRequestCanBeAssignedUsers);
    }

    /**
     * 获取项目审核人或合并人
     *
     * 获取代码组审核人或合并人
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectMergeRequestCanBeAssignedUsersRequest 请求对象
     * @return SyncInvoker<ListProjectMergeRequestCanBeAssignedUsersRequest, ListProjectMergeRequestCanBeAssignedUsersResponse>
     */
    public SyncInvoker<ListProjectMergeRequestCanBeAssignedUsersRequest, ListProjectMergeRequestCanBeAssignedUsersResponse> listProjectMergeRequestCanBeAssignedUsersInvoker(
        ListProjectMergeRequestCanBeAssignedUsersRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listProjectMergeRequestCanBeAssignedUsers, hcClient);
    }

    /**
     * 获取项目合并请求模板列表
     *
     * 获取项目合并请求模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectMergeRequestTemplatesRequest 请求对象
     * @return ListProjectMergeRequestTemplatesResponse
     */
    public ListProjectMergeRequestTemplatesResponse listProjectMergeRequestTemplates(
        ListProjectMergeRequestTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listProjectMergeRequestTemplates);
    }

    /**
     * 获取项目合并请求模板列表
     *
     * 获取项目合并请求模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectMergeRequestTemplatesRequest 请求对象
     * @return SyncInvoker<ListProjectMergeRequestTemplatesRequest, ListProjectMergeRequestTemplatesResponse>
     */
    public SyncInvoker<ListProjectMergeRequestTemplatesRequest, ListProjectMergeRequestTemplatesResponse> listProjectMergeRequestTemplatesInvoker(
        ListProjectMergeRequestTemplatesRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listProjectMergeRequestTemplates, hcClient);
    }

    /**
     * 获取仓库MR列表
     *
     * 获取仓库MR列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryMergeRequestsRequest 请求对象
     * @return ListRepositoryMergeRequestsResponse
     */
    public ListRepositoryMergeRequestsResponse listRepositoryMergeRequests(ListRepositoryMergeRequestsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listRepositoryMergeRequests);
    }

    /**
     * 获取仓库MR列表
     *
     * 获取仓库MR列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryMergeRequestsRequest 请求对象
     * @return SyncInvoker<ListRepositoryMergeRequestsRequest, ListRepositoryMergeRequestsResponse>
     */
    public SyncInvoker<ListRepositoryMergeRequestsRequest, ListRepositoryMergeRequestsResponse> listRepositoryMergeRequestsInvoker(
        ListRepositoryMergeRequestsRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listRepositoryMergeRequests, hcClient);
    }

    /**
     * 合入合并请求
     *
     * 合入合并请求
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request MergeMergeRequestRequest 请求对象
     * @return MergeMergeRequestResponse
     */
    public MergeMergeRequestResponse mergeMergeRequest(MergeMergeRequestRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.mergeMergeRequest);
    }

    /**
     * 合入合并请求
     *
     * 合入合并请求
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request MergeMergeRequestRequest 请求对象
     * @return SyncInvoker<MergeMergeRequestRequest, MergeMergeRequestResponse>
     */
    public SyncInvoker<MergeMergeRequestRequest, MergeMergeRequestResponse> mergeMergeRequestInvoker(
        MergeMergeRequestRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.mergeMergeRequest, hcClient);
    }

    /**
     * 变基合并请求
     *
     * 变基合并请求
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RebaseMergeRequestForOpenApiRequest 请求对象
     * @return RebaseMergeRequestForOpenApiResponse
     */
    public RebaseMergeRequestForOpenApiResponse rebaseMergeRequestForOpenApi(
        RebaseMergeRequestForOpenApiRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.rebaseMergeRequestForOpenApi);
    }

    /**
     * 变基合并请求
     *
     * 变基合并请求
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RebaseMergeRequestForOpenApiRequest 请求对象
     * @return SyncInvoker<RebaseMergeRequestForOpenApiRequest, RebaseMergeRequestForOpenApiResponse>
     */
    public SyncInvoker<RebaseMergeRequestForOpenApiRequest, RebaseMergeRequestForOpenApiResponse> rebaseMergeRequestForOpenApiInvoker(
        RebaseMergeRequestForOpenApiRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.rebaseMergeRequestForOpenApi, hcClient);
    }

    /**
     * 在线解决合并请求冲突
     *
     * 在线解决合并请求冲突
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResolveMergeRequestConflictsRequest 请求对象
     * @return ResolveMergeRequestConflictsResponse
     */
    public ResolveMergeRequestConflictsResponse resolveMergeRequestConflicts(
        ResolveMergeRequestConflictsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.resolveMergeRequestConflicts);
    }

    /**
     * 在线解决合并请求冲突
     *
     * 在线解决合并请求冲突
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResolveMergeRequestConflictsRequest 请求对象
     * @return SyncInvoker<ResolveMergeRequestConflictsRequest, ResolveMergeRequestConflictsResponse>
     */
    public SyncInvoker<ResolveMergeRequestConflictsRequest, ResolveMergeRequestConflictsResponse> resolveMergeRequestConflictsInvoker(
        ResolveMergeRequestConflictsRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.resolveMergeRequestConflicts, hcClient);
    }

    /**
     * 检视合并请求
     *
     * 检视合并请求
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ReviewMergeRequestRequest 请求对象
     * @return ReviewMergeRequestResponse
     */
    public ReviewMergeRequestResponse reviewMergeRequest(ReviewMergeRequestRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.reviewMergeRequest);
    }

    /**
     * 检视合并请求
     *
     * 检视合并请求
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ReviewMergeRequestRequest 请求对象
     * @return SyncInvoker<ReviewMergeRequestRequest, ReviewMergeRequestResponse>
     */
    public SyncInvoker<ReviewMergeRequestRequest, ReviewMergeRequestResponse> reviewMergeRequestInvoker(
        ReviewMergeRequestRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.reviewMergeRequest, hcClient);
    }

    /**
     * 获取合并请求关联的最新流水线
     *
     * 获取合并请求关联的最新流水线
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowActualHeadPipelineRequest 请求对象
     * @return ShowActualHeadPipelineResponse
     */
    public ShowActualHeadPipelineResponse showActualHeadPipeline(ShowActualHeadPipelineRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showActualHeadPipeline);
    }

    /**
     * 获取合并请求关联的最新流水线
     *
     * 获取合并请求关联的最新流水线
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowActualHeadPipelineRequest 请求对象
     * @return SyncInvoker<ShowActualHeadPipelineRequest, ShowActualHeadPipelineResponse>
     */
    public SyncInvoker<ShowActualHeadPipelineRequest, ShowActualHeadPipelineResponse> showActualHeadPipelineInvoker(
        ShowActualHeadPipelineRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.showActualHeadPipeline, hcClient);
    }

    /**
     * 获取合并请求的平均评价
     *
     * 获取合并请求的平均评价
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAverageEvaluationRequest 请求对象
     * @return ShowAverageEvaluationResponse
     */
    public ShowAverageEvaluationResponse showAverageEvaluation(ShowAverageEvaluationRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showAverageEvaluation);
    }

    /**
     * 获取合并请求的平均评价
     *
     * 获取合并请求的平均评价
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAverageEvaluationRequest 请求对象
     * @return SyncInvoker<ShowAverageEvaluationRequest, ShowAverageEvaluationResponse>
     */
    public SyncInvoker<ShowAverageEvaluationRequest, ShowAverageEvaluationResponse> showAverageEvaluationInvoker(
        ShowAverageEvaluationRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.showAverageEvaluation, hcClient);
    }

    /**
     * 获取分支代码冲突
     *
     * 获取分支代码冲突
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBranchConflictRequest 请求对象
     * @return ShowBranchConflictResponse
     */
    public ShowBranchConflictResponse showBranchConflict(ShowBranchConflictRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showBranchConflict);
    }

    /**
     * 获取分支代码冲突
     *
     * 获取分支代码冲突
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBranchConflictRequest 请求对象
     * @return SyncInvoker<ShowBranchConflictRequest, ShowBranchConflictResponse>
     */
    public SyncInvoker<ShowBranchConflictRequest, ShowBranchConflictResponse> showBranchConflictInvoker(
        ShowBranchConflictRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.showBranchConflict, hcClient);
    }

    /**
     * 获取代码页单个提交下文件的检视意见
     *
     * 获取代码页单个提交下文件的检视意见
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCommitCommentsByLineRequest 请求对象
     * @return ShowCommitCommentsByLineResponse
     */
    public ShowCommitCommentsByLineResponse showCommitCommentsByLine(ShowCommitCommentsByLineRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showCommitCommentsByLine);
    }

    /**
     * 获取代码页单个提交下文件的检视意见
     *
     * 获取代码页单个提交下文件的检视意见
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCommitCommentsByLineRequest 请求对象
     * @return SyncInvoker<ShowCommitCommentsByLineRequest, ShowCommitCommentsByLineResponse>
     */
    public SyncInvoker<ShowCommitCommentsByLineRequest, ShowCommitCommentsByLineResponse> showCommitCommentsByLineInvoker(
        ShowCommitCommentsByLineRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.showCommitCommentsByLine, hcClient);
    }

    /**
     * 获取代码组合并请求设置
     *
     * 获取代码组合并请求设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGroupMergeRequestSettingRequest 请求对象
     * @return ShowGroupMergeRequestSettingResponse
     */
    public ShowGroupMergeRequestSettingResponse showGroupMergeRequestSetting(
        ShowGroupMergeRequestSettingRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showGroupMergeRequestSetting);
    }

    /**
     * 获取代码组合并请求设置
     *
     * 获取代码组合并请求设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGroupMergeRequestSettingRequest 请求对象
     * @return SyncInvoker<ShowGroupMergeRequestSettingRequest, ShowGroupMergeRequestSettingResponse>
     */
    public SyncInvoker<ShowGroupMergeRequestSettingRequest, ShowGroupMergeRequestSettingResponse> showGroupMergeRequestSettingInvoker(
        ShowGroupMergeRequestSettingRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.showGroupMergeRequestSetting, hcClient);
    }

    /**
     * 获取合并请求文件变更页单个文件下的检视意见
     *
     * 获取合并请求文件变更页单个文件下的检视意见
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMergeRequestCommentsByLineRequest 请求对象
     * @return ShowMergeRequestCommentsByLineResponse
     */
    public ShowMergeRequestCommentsByLineResponse showMergeRequestCommentsByLine(
        ShowMergeRequestCommentsByLineRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showMergeRequestCommentsByLine);
    }

    /**
     * 获取合并请求文件变更页单个文件下的检视意见
     *
     * 获取合并请求文件变更页单个文件下的检视意见
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMergeRequestCommentsByLineRequest 请求对象
     * @return SyncInvoker<ShowMergeRequestCommentsByLineRequest, ShowMergeRequestCommentsByLineResponse>
     */
    public SyncInvoker<ShowMergeRequestCommentsByLineRequest, ShowMergeRequestCommentsByLineResponse> showMergeRequestCommentsByLineInvoker(
        ShowMergeRequestCommentsByLineRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.showMergeRequestCommentsByLine, hcClient);
    }

    /**
     * 获取MR详情
     *
     * 获取MR详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMergeRequestDetailRequest 请求对象
     * @return ShowMergeRequestDetailResponse
     */
    public ShowMergeRequestDetailResponse showMergeRequestDetail(ShowMergeRequestDetailRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showMergeRequestDetail);
    }

    /**
     * 获取MR详情
     *
     * 获取MR详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMergeRequestDetailRequest 请求对象
     * @return SyncInvoker<ShowMergeRequestDetailRequest, ShowMergeRequestDetailResponse>
     */
    public SyncInvoker<ShowMergeRequestDetailRequest, ShowMergeRequestDetailResponse> showMergeRequestDetailInvoker(
        ShowMergeRequestDetailRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.showMergeRequestDetail, hcClient);
    }

    /**
     * 获取仓库合并请求设置
     *
     * 获取仓库合并请求设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMergeRequestSettingRequest 请求对象
     * @return ShowMergeRequestSettingResponse
     */
    public ShowMergeRequestSettingResponse showMergeRequestSetting(ShowMergeRequestSettingRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showMergeRequestSetting);
    }

    /**
     * 获取仓库合并请求设置
     *
     * 获取仓库合并请求设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMergeRequestSettingRequest 请求对象
     * @return SyncInvoker<ShowMergeRequestSettingRequest, ShowMergeRequestSettingResponse>
     */
    public SyncInvoker<ShowMergeRequestSettingRequest, ShowMergeRequestSettingResponse> showMergeRequestSettingInvoker(
        ShowMergeRequestSettingRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.showMergeRequestSetting, hcClient);
    }

    /**
     * 获取单个合并请求模板
     *
     * 获取单个合并请求模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMergeRequestTemplateRequest 请求对象
     * @return ShowMergeRequestTemplateResponse
     */
    public ShowMergeRequestTemplateResponse showMergeRequestTemplate(ShowMergeRequestTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showMergeRequestTemplate);
    }

    /**
     * 获取单个合并请求模板
     *
     * 获取单个合并请求模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMergeRequestTemplateRequest 请求对象
     * @return SyncInvoker<ShowMergeRequestTemplateRequest, ShowMergeRequestTemplateResponse>
     */
    public SyncInvoker<ShowMergeRequestTemplateRequest, ShowMergeRequestTemplateResponse> showMergeRequestTemplateInvoker(
        ShowMergeRequestTemplateRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.showMergeRequestTemplate, hcClient);
    }

    /**
     * 获取合并请求打分
     *
     * 获取合并请求打分
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMergeRequestVotesDetailRequest 请求对象
     * @return ShowMergeRequestVotesDetailResponse
     */
    public ShowMergeRequestVotesDetailResponse showMergeRequestVotesDetail(ShowMergeRequestVotesDetailRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showMergeRequestVotesDetail);
    }

    /**
     * 获取合并请求打分
     *
     * 获取合并请求打分
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMergeRequestVotesDetailRequest 请求对象
     * @return SyncInvoker<ShowMergeRequestVotesDetailRequest, ShowMergeRequestVotesDetailResponse>
     */
    public SyncInvoker<ShowMergeRequestVotesDetailRequest, ShowMergeRequestVotesDetailResponse> showMergeRequestVotesDetailInvoker(
        ShowMergeRequestVotesDetailRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.showMergeRequestVotesDetail, hcClient);
    }

    /**
     * 获取合并请求的可合入状态。
     *
     * 获取合并请求的可合入状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMergeableStateOuterRequest 请求对象
     * @return ShowMergeableStateOuterResponse
     */
    public ShowMergeableStateOuterResponse showMergeableStateOuter(ShowMergeableStateOuterRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showMergeableStateOuter);
    }

    /**
     * 获取合并请求的可合入状态。
     *
     * 获取合并请求的可合入状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMergeableStateOuterRequest 请求对象
     * @return SyncInvoker<ShowMergeableStateOuterRequest, ShowMergeableStateOuterResponse>
     */
    public SyncInvoker<ShowMergeableStateOuterRequest, ShowMergeableStateOuterResponse> showMergeableStateOuterInvoker(
        ShowMergeableStateOuterRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.showMergeableStateOuter, hcClient);
    }

    /**
     * 获取项目合并请求设置
     *
     * 获取项目合并请求设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectMergeRequestSettingRequest 请求对象
     * @return ShowProjectMergeRequestSettingResponse
     */
    public ShowProjectMergeRequestSettingResponse showProjectMergeRequestSetting(
        ShowProjectMergeRequestSettingRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showProjectMergeRequestSetting);
    }

    /**
     * 获取项目合并请求设置
     *
     * 获取项目合并请求设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectMergeRequestSettingRequest 请求对象
     * @return SyncInvoker<ShowProjectMergeRequestSettingRequest, ShowProjectMergeRequestSettingResponse>
     */
    public SyncInvoker<ShowProjectMergeRequestSettingRequest, ShowProjectMergeRequestSettingResponse> showProjectMergeRequestSettingInvoker(
        ShowProjectMergeRequestSettingRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.showProjectMergeRequestSetting, hcClient);
    }

    /**
     * 获取仓库合并请求统计数据
     *
     * 获取仓库合并请求统计数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryMergeRequestsStatisticRequest 请求对象
     * @return ShowRepositoryMergeRequestsStatisticResponse
     */
    public ShowRepositoryMergeRequestsStatisticResponse showRepositoryMergeRequestsStatistic(
        ShowRepositoryMergeRequestsStatisticRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showRepositoryMergeRequestsStatistic);
    }

    /**
     * 获取仓库合并请求统计数据
     *
     * 获取仓库合并请求统计数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryMergeRequestsStatisticRequest 请求对象
     * @return SyncInvoker<ShowRepositoryMergeRequestsStatisticRequest, ShowRepositoryMergeRequestsStatisticResponse>
     */
    public SyncInvoker<ShowRepositoryMergeRequestsStatisticRequest, ShowRepositoryMergeRequestsStatisticResponse> showRepositoryMergeRequestsStatisticInvoker(
        ShowRepositoryMergeRequestsStatisticRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.showRepositoryMergeRequestsStatistic, hcClient);
    }

    /**
     * 更新代码组合并请求审核设置
     *
     * 更新代码组合并请求审核设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGroupMergeRequestApproverSettingRequest 请求对象
     * @return UpdateGroupMergeRequestApproverSettingResponse
     */
    public UpdateGroupMergeRequestApproverSettingResponse updateGroupMergeRequestApproverSetting(
        UpdateGroupMergeRequestApproverSettingRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.updateGroupMergeRequestApproverSetting);
    }

    /**
     * 更新代码组合并请求审核设置
     *
     * 更新代码组合并请求审核设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGroupMergeRequestApproverSettingRequest 请求对象
     * @return SyncInvoker<UpdateGroupMergeRequestApproverSettingRequest, UpdateGroupMergeRequestApproverSettingResponse>
     */
    public SyncInvoker<UpdateGroupMergeRequestApproverSettingRequest, UpdateGroupMergeRequestApproverSettingResponse> updateGroupMergeRequestApproverSettingInvoker(
        UpdateGroupMergeRequestApproverSettingRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.updateGroupMergeRequestApproverSetting, hcClient);
    }

    /**
     * 更新代码组合并请求模板
     *
     * 更新代码组合并请求模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGroupMergeRequestTemplateRequest 请求对象
     * @return UpdateGroupMergeRequestTemplateResponse
     */
    public UpdateGroupMergeRequestTemplateResponse updateGroupMergeRequestTemplate(
        UpdateGroupMergeRequestTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.updateGroupMergeRequestTemplate);
    }

    /**
     * 更新代码组合并请求模板
     *
     * 更新代码组合并请求模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGroupMergeRequestTemplateRequest 请求对象
     * @return SyncInvoker<UpdateGroupMergeRequestTemplateRequest, UpdateGroupMergeRequestTemplateResponse>
     */
    public SyncInvoker<UpdateGroupMergeRequestTemplateRequest, UpdateGroupMergeRequestTemplateResponse> updateGroupMergeRequestTemplateInvoker(
        UpdateGroupMergeRequestTemplateRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.updateGroupMergeRequestTemplate, hcClient);
    }

    /**
     * 更新合并请求
     *
     * 更新合并请求
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMergeRequestRequest 请求对象
     * @return UpdateMergeRequestResponse
     */
    public UpdateMergeRequestResponse updateMergeRequest(UpdateMergeRequestRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.updateMergeRequest);
    }

    /**
     * 更新合并请求
     *
     * 更新合并请求
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMergeRequestRequest 请求对象
     * @return SyncInvoker<UpdateMergeRequestRequest, UpdateMergeRequestResponse>
     */
    public SyncInvoker<UpdateMergeRequestRequest, UpdateMergeRequestResponse> updateMergeRequestInvoker(
        UpdateMergeRequestRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.updateMergeRequest, hcClient);
    }

    /**
     * 更新合并请求审核设置
     *
     * 更新合并请求审核设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMergeRequestApproverSettingRequest 请求对象
     * @return UpdateMergeRequestApproverSettingResponse
     */
    public UpdateMergeRequestApproverSettingResponse updateMergeRequestApproverSetting(
        UpdateMergeRequestApproverSettingRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.updateMergeRequestApproverSetting);
    }

    /**
     * 更新合并请求审核设置
     *
     * 更新合并请求审核设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMergeRequestApproverSettingRequest 请求对象
     * @return SyncInvoker<UpdateMergeRequestApproverSettingRequest, UpdateMergeRequestApproverSettingResponse>
     */
    public SyncInvoker<UpdateMergeRequestApproverSettingRequest, UpdateMergeRequestApproverSettingResponse> updateMergeRequestApproverSettingInvoker(
        UpdateMergeRequestApproverSettingRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.updateMergeRequestApproverSetting, hcClient);
    }

    /**
     * 更新合并请求的审核人列表
     *
     * 更新合并请求的审核人列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMergeRequestApproversRequest 请求对象
     * @return UpdateMergeRequestApproversResponse
     */
    public UpdateMergeRequestApproversResponse updateMergeRequestApprovers(UpdateMergeRequestApproversRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.updateMergeRequestApprovers);
    }

    /**
     * 更新合并请求的审核人列表
     *
     * 更新合并请求的审核人列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMergeRequestApproversRequest 请求对象
     * @return SyncInvoker<UpdateMergeRequestApproversRequest, UpdateMergeRequestApproversResponse>
     */
    public SyncInvoker<UpdateMergeRequestApproversRequest, UpdateMergeRequestApproversResponse> updateMergeRequestApproversInvoker(
        UpdateMergeRequestApproversRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.updateMergeRequestApprovers, hcClient);
    }

    /**
     * 更新合并请求的检视人列表
     *
     * 更新合并请求的检视人列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMergeRequestReviewersRequest 请求对象
     * @return UpdateMergeRequestReviewersResponse
     */
    public UpdateMergeRequestReviewersResponse updateMergeRequestReviewers(UpdateMergeRequestReviewersRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.updateMergeRequestReviewers);
    }

    /**
     * 更新合并请求的检视人列表
     *
     * 更新合并请求的检视人列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMergeRequestReviewersRequest 请求对象
     * @return SyncInvoker<UpdateMergeRequestReviewersRequest, UpdateMergeRequestReviewersResponse>
     */
    public SyncInvoker<UpdateMergeRequestReviewersRequest, UpdateMergeRequestReviewersResponse> updateMergeRequestReviewersInvoker(
        UpdateMergeRequestReviewersRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.updateMergeRequestReviewers, hcClient);
    }

    /**
     * 更新仓库合并请求设置
     *
     * 更新仓库合并请求设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMergeRequestSettingRequest 请求对象
     * @return UpdateMergeRequestSettingResponse
     */
    public UpdateMergeRequestSettingResponse updateMergeRequestSetting(UpdateMergeRequestSettingRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.updateMergeRequestSetting);
    }

    /**
     * 更新仓库合并请求设置
     *
     * 更新仓库合并请求设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMergeRequestSettingRequest 请求对象
     * @return SyncInvoker<UpdateMergeRequestSettingRequest, UpdateMergeRequestSettingResponse>
     */
    public SyncInvoker<UpdateMergeRequestSettingRequest, UpdateMergeRequestSettingResponse> updateMergeRequestSettingInvoker(
        UpdateMergeRequestSettingRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.updateMergeRequestSetting, hcClient);
    }

    /**
     * 更新合并请求模板
     *
     * 更新合并请求模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMergeRequestTemplateRequest 请求对象
     * @return UpdateMergeRequestTemplateResponse
     */
    public UpdateMergeRequestTemplateResponse updateMergeRequestTemplate(UpdateMergeRequestTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.updateMergeRequestTemplate);
    }

    /**
     * 更新合并请求模板
     *
     * 更新合并请求模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMergeRequestTemplateRequest 请求对象
     * @return SyncInvoker<UpdateMergeRequestTemplateRequest, UpdateMergeRequestTemplateResponse>
     */
    public SyncInvoker<UpdateMergeRequestTemplateRequest, UpdateMergeRequestTemplateResponse> updateMergeRequestTemplateInvoker(
        UpdateMergeRequestTemplateRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.updateMergeRequestTemplate, hcClient);
    }

    /**
     * 更新合并请求打分
     *
     * 更新合并请求打分
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMergeRequestVoteRequest 请求对象
     * @return UpdateMergeRequestVoteResponse
     */
    public UpdateMergeRequestVoteResponse updateMergeRequestVote(UpdateMergeRequestVoteRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.updateMergeRequestVote);
    }

    /**
     * 更新合并请求打分
     *
     * 更新合并请求打分
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMergeRequestVoteRequest 请求对象
     * @return SyncInvoker<UpdateMergeRequestVoteRequest, UpdateMergeRequestVoteResponse>
     */
    public SyncInvoker<UpdateMergeRequestVoteRequest, UpdateMergeRequestVoteResponse> updateMergeRequestVoteInvoker(
        UpdateMergeRequestVoteRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.updateMergeRequestVote, hcClient);
    }

    /**
     * 更新项目合并请求审核设置
     *
     * 更新项目合并请求审核设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProjectMergeRequestApproverSettingRequest 请求对象
     * @return UpdateProjectMergeRequestApproverSettingResponse
     */
    public UpdateProjectMergeRequestApproverSettingResponse updateProjectMergeRequestApproverSetting(
        UpdateProjectMergeRequestApproverSettingRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.updateProjectMergeRequestApproverSetting);
    }

    /**
     * 更新项目合并请求审核设置
     *
     * 更新项目合并请求审核设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProjectMergeRequestApproverSettingRequest 请求对象
     * @return SyncInvoker<UpdateProjectMergeRequestApproverSettingRequest, UpdateProjectMergeRequestApproverSettingResponse>
     */
    public SyncInvoker<UpdateProjectMergeRequestApproverSettingRequest, UpdateProjectMergeRequestApproverSettingResponse> updateProjectMergeRequestApproverSettingInvoker(
        UpdateProjectMergeRequestApproverSettingRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.updateProjectMergeRequestApproverSetting, hcClient);
    }

    /**
     * 更新项目合并请求模板
     *
     * 更新项目合并请求模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProjectMergeRequestTemplateRequest 请求对象
     * @return UpdateProjectMergeRequestTemplateResponse
     */
    public UpdateProjectMergeRequestTemplateResponse updateProjectMergeRequestTemplate(
        UpdateProjectMergeRequestTemplateRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.updateProjectMergeRequestTemplate);
    }

    /**
     * 更新项目合并请求模板
     *
     * 更新项目合并请求模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProjectMergeRequestTemplateRequest 请求对象
     * @return SyncInvoker<UpdateProjectMergeRequestTemplateRequest, UpdateProjectMergeRequestTemplateResponse>
     */
    public SyncInvoker<UpdateProjectMergeRequestTemplateRequest, UpdateProjectMergeRequestTemplateResponse> updateProjectMergeRequestTemplateInvoker(
        UpdateProjectMergeRequestTemplateRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.updateProjectMergeRequestTemplate, hcClient);
    }

    /**
     * 批量删除仓库文件推送权限
     *
     * 批量删除仓库文件推送权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteRepositoryFilePushPermissionsRequest 请求对象
     * @return BatchDeleteRepositoryFilePushPermissionsResponse
     */
    public BatchDeleteRepositoryFilePushPermissionsResponse batchDeleteRepositoryFilePushPermissions(
        BatchDeleteRepositoryFilePushPermissionsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.batchDeleteRepositoryFilePushPermissions);
    }

    /**
     * 批量删除仓库文件推送权限
     *
     * 批量删除仓库文件推送权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteRepositoryFilePushPermissionsRequest 请求对象
     * @return SyncInvoker<BatchDeleteRepositoryFilePushPermissionsRequest, BatchDeleteRepositoryFilePushPermissionsResponse>
     */
    public SyncInvoker<BatchDeleteRepositoryFilePushPermissionsRequest, BatchDeleteRepositoryFilePushPermissionsResponse> batchDeleteRepositoryFilePushPermissionsInvoker(
        BatchDeleteRepositoryFilePushPermissionsRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.batchDeleteRepositoryFilePushPermissions, hcClient);
    }

    /**
     * 批量更新仓库文件推送权限
     *
     * 批量更新仓库文件推送权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateRepositoryFilePushPermissionsRequest 请求对象
     * @return BatchUpdateRepositoryFilePushPermissionsResponse
     */
    public BatchUpdateRepositoryFilePushPermissionsResponse batchUpdateRepositoryFilePushPermissions(
        BatchUpdateRepositoryFilePushPermissionsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.batchUpdateRepositoryFilePushPermissions);
    }

    /**
     * 批量更新仓库文件推送权限
     *
     * 批量更新仓库文件推送权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateRepositoryFilePushPermissionsRequest 请求对象
     * @return SyncInvoker<BatchUpdateRepositoryFilePushPermissionsRequest, BatchUpdateRepositoryFilePushPermissionsResponse>
     */
    public SyncInvoker<BatchUpdateRepositoryFilePushPermissionsRequest, BatchUpdateRepositoryFilePushPermissionsResponse> batchUpdateRepositoryFilePushPermissionsInvoker(
        BatchUpdateRepositoryFilePushPermissionsRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.batchUpdateRepositoryFilePushPermissions, hcClient);
    }

    /**
     * 创建仓库文件推送权限
     *
     * 创建仓库文件推送权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFilePushPermissionRequest 请求对象
     * @return CreateFilePushPermissionResponse
     */
    public CreateFilePushPermissionResponse createFilePushPermission(CreateFilePushPermissionRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.createFilePushPermission);
    }

    /**
     * 创建仓库文件推送权限
     *
     * 创建仓库文件推送权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFilePushPermissionRequest 请求对象
     * @return SyncInvoker<CreateFilePushPermissionRequest, CreateFilePushPermissionResponse>
     */
    public SyncInvoker<CreateFilePushPermissionRequest, CreateFilePushPermissionResponse> createFilePushPermissionInvoker(
        CreateFilePushPermissionRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.createFilePushPermission, hcClient);
    }

    /**
     * 获取仓库文件推送权限列表
     *
     * 获取仓库文件推送权限列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryFilePushPermissionsRequest 请求对象
     * @return ListRepositoryFilePushPermissionsResponse
     */
    public ListRepositoryFilePushPermissionsResponse listRepositoryFilePushPermissions(
        ListRepositoryFilePushPermissionsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listRepositoryFilePushPermissions);
    }

    /**
     * 获取仓库文件推送权限列表
     *
     * 获取仓库文件推送权限列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryFilePushPermissionsRequest 请求对象
     * @return SyncInvoker<ListRepositoryFilePushPermissionsRequest, ListRepositoryFilePushPermissionsResponse>
     */
    public SyncInvoker<ListRepositoryFilePushPermissionsRequest, ListRepositoryFilePushPermissionsResponse> listRepositoryFilePushPermissionsInvoker(
        ListRepositoryFilePushPermissionsRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listRepositoryFilePushPermissions, hcClient);
    }

    /**
     * 查询仓库权限矩阵配置
     *
     * 查询仓库权限矩阵配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryResourcePermissionsRequest 请求对象
     * @return ListRepositoryResourcePermissionsResponse
     */
    public ListRepositoryResourcePermissionsResponse listRepositoryResourcePermissions(
        ListRepositoryResourcePermissionsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listRepositoryResourcePermissions);
    }

    /**
     * 查询仓库权限矩阵配置
     *
     * 查询仓库权限矩阵配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryResourcePermissionsRequest 请求对象
     * @return SyncInvoker<ListRepositoryResourcePermissionsRequest, ListRepositoryResourcePermissionsResponse>
     */
    public SyncInvoker<ListRepositoryResourcePermissionsRequest, ListRepositoryResourcePermissionsResponse> listRepositoryResourcePermissionsInvoker(
        ListRepositoryResourcePermissionsRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listRepositoryResourcePermissions, hcClient);
    }

    /**
     * 查询仓库权限配置信息
     *
     * 查询仓库权限配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryPermissionInheritEnabledRequest 请求对象
     * @return ShowRepositoryPermissionInheritEnabledResponse
     */
    public ShowRepositoryPermissionInheritEnabledResponse showRepositoryPermissionInheritEnabled(
        ShowRepositoryPermissionInheritEnabledRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showRepositoryPermissionInheritEnabled);
    }

    /**
     * 查询仓库权限配置信息
     *
     * 查询仓库权限配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryPermissionInheritEnabledRequest 请求对象
     * @return SyncInvoker<ShowRepositoryPermissionInheritEnabledRequest, ShowRepositoryPermissionInheritEnabledResponse>
     */
    public SyncInvoker<ShowRepositoryPermissionInheritEnabledRequest, ShowRepositoryPermissionInheritEnabledResponse> showRepositoryPermissionInheritEnabledInvoker(
        ShowRepositoryPermissionInheritEnabledRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.showRepositoryPermissionInheritEnabled, hcClient);
    }

    /**
     * 更新仓库权限继承配置
     *
     * 更新仓库权限继承配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRepositoryPermissionInheritEnabledRequest 请求对象
     * @return UpdateRepositoryPermissionInheritEnabledResponse
     */
    public UpdateRepositoryPermissionInheritEnabledResponse updateRepositoryPermissionInheritEnabled(
        UpdateRepositoryPermissionInheritEnabledRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.updateRepositoryPermissionInheritEnabled);
    }

    /**
     * 更新仓库权限继承配置
     *
     * 更新仓库权限继承配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRepositoryPermissionInheritEnabledRequest 请求对象
     * @return SyncInvoker<UpdateRepositoryPermissionInheritEnabledRequest, UpdateRepositoryPermissionInheritEnabledResponse>
     */
    public SyncInvoker<UpdateRepositoryPermissionInheritEnabledRequest, UpdateRepositoryPermissionInheritEnabledResponse> updateRepositoryPermissionInheritEnabledInvoker(
        UpdateRepositoryPermissionInheritEnabledRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.updateRepositoryPermissionInheritEnabled, hcClient);
    }

    /**
     * 更新仓库权限矩阵配置
     *
     * 更新仓库权限矩阵配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRepositoryResourcePermissionsRequest 请求对象
     * @return UpdateRepositoryResourcePermissionsResponse
     */
    public UpdateRepositoryResourcePermissionsResponse updateRepositoryResourcePermissions(
        UpdateRepositoryResourcePermissionsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.updateRepositoryResourcePermissions);
    }

    /**
     * 更新仓库权限矩阵配置
     *
     * 更新仓库权限矩阵配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRepositoryResourcePermissionsRequest 请求对象
     * @return SyncInvoker<UpdateRepositoryResourcePermissionsRequest, UpdateRepositoryResourcePermissionsResponse>
     */
    public SyncInvoker<UpdateRepositoryResourcePermissionsRequest, UpdateRepositoryResourcePermissionsResponse> updateRepositoryResourcePermissionsInvoker(
        UpdateRepositoryResourcePermissionsRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.updateRepositoryResourcePermissions, hcClient);
    }

    /**
     * 获取流水线的关联的最新任务
     *
     * 获取流水线的关联的最新任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLatestPipelineJobsRequest 请求对象
     * @return ListLatestPipelineJobsResponse
     */
    public ListLatestPipelineJobsResponse listLatestPipelineJobs(ListLatestPipelineJobsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listLatestPipelineJobs);
    }

    /**
     * 获取流水线的关联的最新任务
     *
     * 获取流水线的关联的最新任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLatestPipelineJobsRequest 请求对象
     * @return SyncInvoker<ListLatestPipelineJobsRequest, ListLatestPipelineJobsResponse>
     */
    public SyncInvoker<ListLatestPipelineJobsRequest, ListLatestPipelineJobsResponse> listLatestPipelineJobsInvoker(
        ListLatestPipelineJobsRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listLatestPipelineJobs, hcClient);
    }

    /**
     * 获取流水线的关联的任务列表
     *
     * 获取流水线的关联的任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPipelineJobsRequest 请求对象
     * @return ListPipelineJobsResponse
     */
    public ListPipelineJobsResponse listPipelineJobs(ListPipelineJobsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listPipelineJobs);
    }

    /**
     * 获取流水线的关联的任务列表
     *
     * 获取流水线的关联的任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPipelineJobsRequest 请求对象
     * @return SyncInvoker<ListPipelineJobsRequest, ListPipelineJobsResponse>
     */
    public SyncInvoker<ListPipelineJobsRequest, ListPipelineJobsResponse> listPipelineJobsInvoker(
        ListPipelineJobsRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listPipelineJobs, hcClient);
    }

    /**
     * 工作项关联的提交信息
     *
     * 工作项关联的提交信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListItemCommitsRequest 请求对象
     * @return ListItemCommitsResponse
     */
    public ListItemCommitsResponse listItemCommits(ListItemCommitsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listItemCommits);
    }

    /**
     * 工作项关联的提交信息
     *
     * 工作项关联的提交信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListItemCommitsRequest 请求对象
     * @return SyncInvoker<ListItemCommitsRequest, ListItemCommitsResponse>
     */
    public SyncInvoker<ListItemCommitsRequest, ListItemCommitsResponse> listItemCommitsInvoker(
        ListItemCommitsRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listItemCommits, hcClient);
    }

    /**
     * 获取项目下的代码组和仓库列表
     *
     * 获取项目下的代码组和仓库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectSubgroupsAndRepositoriesRequest 请求对象
     * @return ListProjectSubgroupsAndRepositoriesResponse
     */
    public ListProjectSubgroupsAndRepositoriesResponse listProjectSubgroupsAndRepositories(
        ListProjectSubgroupsAndRepositoriesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listProjectSubgroupsAndRepositories);
    }

    /**
     * 获取项目下的代码组和仓库列表
     *
     * 获取项目下的代码组和仓库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectSubgroupsAndRepositoriesRequest 请求对象
     * @return SyncInvoker<ListProjectSubgroupsAndRepositoriesRequest, ListProjectSubgroupsAndRepositoriesResponse>
     */
    public SyncInvoker<ListProjectSubgroupsAndRepositoriesRequest, ListProjectSubgroupsAndRepositoriesResponse> listProjectSubgroupsAndRepositoriesInvoker(
        ListProjectSubgroupsAndRepositoriesRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listProjectSubgroupsAndRepositories, hcClient);
    }

    /**
     * 获取指定项目的基本设置信息
     *
     * 获取指定项目的基本设置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectGeneralPolicyRequest 请求对象
     * @return ShowProjectGeneralPolicyResponse
     */
    public ShowProjectGeneralPolicyResponse showProjectGeneralPolicy(ShowProjectGeneralPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showProjectGeneralPolicy);
    }

    /**
     * 获取指定项目的基本设置信息
     *
     * 获取指定项目的基本设置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectGeneralPolicyRequest 请求对象
     * @return SyncInvoker<ShowProjectGeneralPolicyRequest, ShowProjectGeneralPolicyResponse>
     */
    public SyncInvoker<ShowProjectGeneralPolicyRequest, ShowProjectGeneralPolicyResponse> showProjectGeneralPolicyInvoker(
        ShowProjectGeneralPolicyRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.showProjectGeneralPolicy, hcClient);
    }

    /**
     * 获取项目成员设置
     *
     * 获取项目成员设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectMemberSettingRequest 请求对象
     * @return ShowProjectMemberSettingResponse
     */
    public ShowProjectMemberSettingResponse showProjectMemberSetting(ShowProjectMemberSettingRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showProjectMemberSetting);
    }

    /**
     * 获取项目成员设置
     *
     * 获取项目成员设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectMemberSettingRequest 请求对象
     * @return SyncInvoker<ShowProjectMemberSettingRequest, ShowProjectMemberSettingResponse>
     */
    public SyncInvoker<ShowProjectMemberSettingRequest, ShowProjectMemberSettingResponse> showProjectMemberSettingInvoker(
        ShowProjectMemberSettingRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.showProjectMemberSetting, hcClient);
    }

    /**
     * 获取项目继承设置项
     *
     * 获取项目继承设置项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectSettingsInheritCfgRequest 请求对象
     * @return ShowProjectSettingsInheritCfgResponse
     */
    public ShowProjectSettingsInheritCfgResponse showProjectSettingsInheritCfg(
        ShowProjectSettingsInheritCfgRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showProjectSettingsInheritCfg);
    }

    /**
     * 获取项目继承设置项
     *
     * 获取项目继承设置项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectSettingsInheritCfgRequest 请求对象
     * @return SyncInvoker<ShowProjectSettingsInheritCfgRequest, ShowProjectSettingsInheritCfgResponse>
     */
    public SyncInvoker<ShowProjectSettingsInheritCfgRequest, ShowProjectSettingsInheritCfgResponse> showProjectSettingsInheritCfgInvoker(
        ShowProjectSettingsInheritCfgRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.showProjectSettingsInheritCfg, hcClient);
    }

    /**
     * 获取项目水印设置
     *
     * 获取项目水印设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectWatermarkRequest 请求对象
     * @return ShowProjectWatermarkResponse
     */
    public ShowProjectWatermarkResponse showProjectWatermark(ShowProjectWatermarkRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showProjectWatermark);
    }

    /**
     * 获取项目水印设置
     *
     * 获取项目水印设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectWatermarkRequest 请求对象
     * @return SyncInvoker<ShowProjectWatermarkRequest, ShowProjectWatermarkResponse>
     */
    public SyncInvoker<ShowProjectWatermarkRequest, ShowProjectWatermarkResponse> showProjectWatermarkInvoker(
        ShowProjectWatermarkRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.showProjectWatermark, hcClient);
    }

    /**
     * 获取指定项目的基本设置信息
     *
     * 获取指定项目的基本设置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectsGeneralPolicyRequest 请求对象
     * @return ShowProjectsGeneralPolicyResponse
     */
    public ShowProjectsGeneralPolicyResponse showProjectsGeneralPolicy(ShowProjectsGeneralPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showProjectsGeneralPolicy);
    }

    /**
     * 获取指定项目的基本设置信息
     *
     * 获取指定项目的基本设置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectsGeneralPolicyRequest 请求对象
     * @return SyncInvoker<ShowProjectsGeneralPolicyRequest, ShowProjectsGeneralPolicyResponse>
     */
    public SyncInvoker<ShowProjectsGeneralPolicyRequest, ShowProjectsGeneralPolicyResponse> showProjectsGeneralPolicyInvoker(
        ShowProjectsGeneralPolicyRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.showProjectsGeneralPolicy, hcClient);
    }

    /**
     * 获取资源点对应的角色和权限
     *
     * 获取资源点对应的角色和权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourcePermissionsRequest 请求对象
     * @return ShowResourcePermissionsResponse
     */
    public ShowResourcePermissionsResponse showResourcePermissions(ShowResourcePermissionsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showResourcePermissions);
    }

    /**
     * 获取资源点对应的角色和权限
     *
     * 获取资源点对应的角色和权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourcePermissionsRequest 请求对象
     * @return SyncInvoker<ShowResourcePermissionsRequest, ShowResourcePermissionsResponse>
     */
    public SyncInvoker<ShowResourcePermissionsRequest, ShowResourcePermissionsResponse> showResourcePermissionsInvoker(
        ShowResourcePermissionsRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.showResourcePermissions, hcClient);
    }

    /**
     * 更新项目的基本设置信息
     *
     * 更新项目的基本设置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProjectGeneralPolicyRequest 请求对象
     * @return UpdateProjectGeneralPolicyResponse
     */
    public UpdateProjectGeneralPolicyResponse updateProjectGeneralPolicy(UpdateProjectGeneralPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.updateProjectGeneralPolicy);
    }

    /**
     * 更新项目的基本设置信息
     *
     * 更新项目的基本设置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProjectGeneralPolicyRequest 请求对象
     * @return SyncInvoker<UpdateProjectGeneralPolicyRequest, UpdateProjectGeneralPolicyResponse>
     */
    public SyncInvoker<UpdateProjectGeneralPolicyRequest, UpdateProjectGeneralPolicyResponse> updateProjectGeneralPolicyInvoker(
        UpdateProjectGeneralPolicyRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.updateProjectGeneralPolicy, hcClient);
    }

    /**
     * 更新项目继承设置项
     *
     * 更新项目继承设置项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProjectSettingsInheritCfgRequest 请求对象
     * @return UpdateProjectSettingsInheritCfgResponse
     */
    public UpdateProjectSettingsInheritCfgResponse updateProjectSettingsInheritCfg(
        UpdateProjectSettingsInheritCfgRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.updateProjectSettingsInheritCfg);
    }

    /**
     * 更新项目继承设置项
     *
     * 更新项目继承设置项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProjectSettingsInheritCfgRequest 请求对象
     * @return SyncInvoker<UpdateProjectSettingsInheritCfgRequest, UpdateProjectSettingsInheritCfgResponse>
     */
    public SyncInvoker<UpdateProjectSettingsInheritCfgRequest, UpdateProjectSettingsInheritCfgResponse> updateProjectSettingsInheritCfgInvoker(
        UpdateProjectSettingsInheritCfgRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.updateProjectSettingsInheritCfg, hcClient);
    }

    /**
     * 更新项目水印设置
     *
     * 更新项目水印设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProjectWatermarkRequest 请求对象
     * @return UpdateProjectWatermarkResponse
     */
    public UpdateProjectWatermarkResponse updateProjectWatermark(UpdateProjectWatermarkRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.updateProjectWatermark);
    }

    /**
     * 更新项目水印设置
     *
     * 更新项目水印设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProjectWatermarkRequest 请求对象
     * @return SyncInvoker<UpdateProjectWatermarkRequest, UpdateProjectWatermarkResponse>
     */
    public SyncInvoker<UpdateProjectWatermarkRequest, UpdateProjectWatermarkResponse> updateProjectWatermarkInvoker(
        UpdateProjectWatermarkRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.updateProjectWatermark, hcClient);
    }

    /**
     * 批量创建仓库保护分支
     *
     * 批量创建仓库保护分支
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateProtectedBranchRequest 请求对象
     * @return BatchCreateProtectedBranchResponse
     */
    public BatchCreateProtectedBranchResponse batchCreateProtectedBranch(BatchCreateProtectedBranchRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.batchCreateProtectedBranch);
    }

    /**
     * 批量创建仓库保护分支
     *
     * 批量创建仓库保护分支
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateProtectedBranchRequest 请求对象
     * @return SyncInvoker<BatchCreateProtectedBranchRequest, BatchCreateProtectedBranchResponse>
     */
    public SyncInvoker<BatchCreateProtectedBranchRequest, BatchCreateProtectedBranchResponse> batchCreateProtectedBranchInvoker(
        BatchCreateProtectedBranchRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.batchCreateProtectedBranch, hcClient);
    }

    /**
     * 批量创建仓库保护Tag
     *
     * 批量创建仓库保护Tag
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateProtectedTagsRequest 请求对象
     * @return BatchCreateProtectedTagsResponse
     */
    public BatchCreateProtectedTagsResponse batchCreateProtectedTags(BatchCreateProtectedTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.batchCreateProtectedTags);
    }

    /**
     * 批量创建仓库保护Tag
     *
     * 批量创建仓库保护Tag
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateProtectedTagsRequest 请求对象
     * @return SyncInvoker<BatchCreateProtectedTagsRequest, BatchCreateProtectedTagsResponse>
     */
    public SyncInvoker<BatchCreateProtectedTagsRequest, BatchCreateProtectedTagsResponse> batchCreateProtectedTagsInvoker(
        BatchCreateProtectedTagsRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.batchCreateProtectedTags, hcClient);
    }

    /**
     * 批量删除仓库保护分支
     *
     * 批量删除仓库保护分支
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteProtectedBranchesRequest 请求对象
     * @return BatchDeleteProtectedBranchesResponse
     */
    public BatchDeleteProtectedBranchesResponse batchDeleteProtectedBranches(
        BatchDeleteProtectedBranchesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.batchDeleteProtectedBranches);
    }

    /**
     * 批量删除仓库保护分支
     *
     * 批量删除仓库保护分支
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteProtectedBranchesRequest 请求对象
     * @return SyncInvoker<BatchDeleteProtectedBranchesRequest, BatchDeleteProtectedBranchesResponse>
     */
    public SyncInvoker<BatchDeleteProtectedBranchesRequest, BatchDeleteProtectedBranchesResponse> batchDeleteProtectedBranchesInvoker(
        BatchDeleteProtectedBranchesRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.batchDeleteProtectedBranches, hcClient);
    }

    /**
     * 批量删除仓库保护Tag
     *
     * 批量删除仓库保护Tag
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteProtectedTagsRequest 请求对象
     * @return BatchDeleteProtectedTagsResponse
     */
    public BatchDeleteProtectedTagsResponse batchDeleteProtectedTags(BatchDeleteProtectedTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.batchDeleteProtectedTags);
    }

    /**
     * 批量删除仓库保护Tag
     *
     * 批量删除仓库保护Tag
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteProtectedTagsRequest 请求对象
     * @return SyncInvoker<BatchDeleteProtectedTagsRequest, BatchDeleteProtectedTagsResponse>
     */
    public SyncInvoker<BatchDeleteProtectedTagsRequest, BatchDeleteProtectedTagsResponse> batchDeleteProtectedTagsInvoker(
        BatchDeleteProtectedTagsRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.batchDeleteProtectedTags, hcClient);
    }

    /**
     * 批量更新仓库保护分支
     *
     * 批量更新仓库保护分支
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateProtectedBranchesRequest 请求对象
     * @return BatchUpdateProtectedBranchesResponse
     */
    public BatchUpdateProtectedBranchesResponse batchUpdateProtectedBranches(
        BatchUpdateProtectedBranchesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.batchUpdateProtectedBranches);
    }

    /**
     * 批量更新仓库保护分支
     *
     * 批量更新仓库保护分支
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateProtectedBranchesRequest 请求对象
     * @return SyncInvoker<BatchUpdateProtectedBranchesRequest, BatchUpdateProtectedBranchesResponse>
     */
    public SyncInvoker<BatchUpdateProtectedBranchesRequest, BatchUpdateProtectedBranchesResponse> batchUpdateProtectedBranchesInvoker(
        BatchUpdateProtectedBranchesRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.batchUpdateProtectedBranches, hcClient);
    }

    /**
     * 批量更新仓库保护Tag
     *
     * 批量更新仓库保护Tag
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateProtectedTagsRequest 请求对象
     * @return BatchUpdateProtectedTagsResponse
     */
    public BatchUpdateProtectedTagsResponse batchUpdateProtectedTags(BatchUpdateProtectedTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.batchUpdateProtectedTags);
    }

    /**
     * 批量更新仓库保护Tag
     *
     * 批量更新仓库保护Tag
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateProtectedTagsRequest 请求对象
     * @return SyncInvoker<BatchUpdateProtectedTagsRequest, BatchUpdateProtectedTagsResponse>
     */
    public SyncInvoker<BatchUpdateProtectedTagsRequest, BatchUpdateProtectedTagsResponse> batchUpdateProtectedTagsInvoker(
        BatchUpdateProtectedTagsRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.batchUpdateProtectedTags, hcClient);
    }

    /**
     * 创建项目下保护分支
     *
     * 创建项目下保护分支
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProjectProtectedBranchesRequest 请求对象
     * @return CreateProjectProtectedBranchesResponse
     */
    public CreateProjectProtectedBranchesResponse createProjectProtectedBranches(
        CreateProjectProtectedBranchesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.createProjectProtectedBranches);
    }

    /**
     * 创建项目下保护分支
     *
     * 创建项目下保护分支
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProjectProtectedBranchesRequest 请求对象
     * @return SyncInvoker<CreateProjectProtectedBranchesRequest, CreateProjectProtectedBranchesResponse>
     */
    public SyncInvoker<CreateProjectProtectedBranchesRequest, CreateProjectProtectedBranchesResponse> createProjectProtectedBranchesInvoker(
        CreateProjectProtectedBranchesRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.createProjectProtectedBranches, hcClient);
    }

    /**
     * 创建项目下的保护tag
     *
     * 创建项目下的保护tag
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProjectProtectedTagsRequest 请求对象
     * @return CreateProjectProtectedTagsResponse
     */
    public CreateProjectProtectedTagsResponse createProjectProtectedTags(CreateProjectProtectedTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.createProjectProtectedTags);
    }

    /**
     * 创建项目下的保护tag
     *
     * 创建项目下的保护tag
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProjectProtectedTagsRequest 请求对象
     * @return SyncInvoker<CreateProjectProtectedTagsRequest, CreateProjectProtectedTagsResponse>
     */
    public SyncInvoker<CreateProjectProtectedTagsRequest, CreateProjectProtectedTagsResponse> createProjectProtectedTagsInvoker(
        CreateProjectProtectedTagsRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.createProjectProtectedTags, hcClient);
    }

    /**
     * 删除仓库保护分支
     *
     * 删除仓库保护分支
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteProtectedBranchRequest 请求对象
     * @return DeleteProtectedBranchResponse
     */
    public DeleteProtectedBranchResponse deleteProtectedBranch(DeleteProtectedBranchRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.deleteProtectedBranch);
    }

    /**
     * 删除仓库保护分支
     *
     * 删除仓库保护分支
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteProtectedBranchRequest 请求对象
     * @return SyncInvoker<DeleteProtectedBranchRequest, DeleteProtectedBranchResponse>
     */
    public SyncInvoker<DeleteProtectedBranchRequest, DeleteProtectedBranchResponse> deleteProtectedBranchInvoker(
        DeleteProtectedBranchRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.deleteProtectedBranch, hcClient);
    }

    /**
     * 删除仓库保护Tag
     *
     * 删除仓库保护Tag
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteProtectedTagRequest 请求对象
     * @return DeleteProtectedTagResponse
     */
    public DeleteProtectedTagResponse deleteProtectedTag(DeleteProtectedTagRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.deleteProtectedTag);
    }

    /**
     * 删除仓库保护Tag
     *
     * 删除仓库保护Tag
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteProtectedTagRequest 请求对象
     * @return SyncInvoker<DeleteProtectedTagRequest, DeleteProtectedTagResponse>
     */
    public SyncInvoker<DeleteProtectedTagRequest, DeleteProtectedTagResponse> deleteProtectedTagInvoker(
        DeleteProtectedTagRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.deleteProtectedTag, hcClient);
    }

    /**
     * 获取项目下保护分支列表
     *
     * 获取项目下保护分支列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectProtectedBranchesRequest 请求对象
     * @return ListProjectProtectedBranchesResponse
     */
    public ListProjectProtectedBranchesResponse listProjectProtectedBranches(
        ListProjectProtectedBranchesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listProjectProtectedBranches);
    }

    /**
     * 获取项目下保护分支列表
     *
     * 获取项目下保护分支列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectProtectedBranchesRequest 请求对象
     * @return SyncInvoker<ListProjectProtectedBranchesRequest, ListProjectProtectedBranchesResponse>
     */
    public SyncInvoker<ListProjectProtectedBranchesRequest, ListProjectProtectedBranchesResponse> listProjectProtectedBranchesInvoker(
        ListProjectProtectedBranchesRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listProjectProtectedBranches, hcClient);
    }

    /**
     * 获取指定项目的保护tag详情
     *
     * 获取指定项目的保护tag详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectProtectedTagsRequest 请求对象
     * @return ListProjectProtectedTagsResponse
     */
    public ListProjectProtectedTagsResponse listProjectProtectedTags(ListProjectProtectedTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listProjectProtectedTags);
    }

    /**
     * 获取指定项目的保护tag详情
     *
     * 获取指定项目的保护tag详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectProtectedTagsRequest 请求对象
     * @return SyncInvoker<ListProjectProtectedTagsRequest, ListProjectProtectedTagsResponse>
     */
    public SyncInvoker<ListProjectProtectedTagsRequest, ListProjectProtectedTagsResponse> listProjectProtectedTagsInvoker(
        ListProjectProtectedTagsRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listProjectProtectedTags, hcClient);
    }

    /**
     * 获取仓库保护分支列表
     *
     * 获取仓库保护分支列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProtectedBranchesRequest 请求对象
     * @return ListProtectedBranchesResponse
     */
    public ListProtectedBranchesResponse listProtectedBranches(ListProtectedBranchesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listProtectedBranches);
    }

    /**
     * 获取仓库保护分支列表
     *
     * 获取仓库保护分支列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProtectedBranchesRequest 请求对象
     * @return SyncInvoker<ListProtectedBranchesRequest, ListProtectedBranchesResponse>
     */
    public SyncInvoker<ListProtectedBranchesRequest, ListProtectedBranchesResponse> listProtectedBranchesInvoker(
        ListProtectedBranchesRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listProtectedBranches, hcClient);
    }

    /**
     * 获取仓库保护Tag列表
     *
     * 获取仓库保护Tag列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProtectedTagsRequest 请求对象
     * @return ListProtectedTagsResponse
     */
    public ListProtectedTagsResponse listProtectedTags(ListProtectedTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listProtectedTags);
    }

    /**
     * 获取仓库保护Tag列表
     *
     * 获取仓库保护Tag列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProtectedTagsRequest 请求对象
     * @return SyncInvoker<ListProtectedTagsRequest, ListProtectedTagsResponse>
     */
    public SyncInvoker<ListProtectedTagsRequest, ListProtectedTagsResponse> listProtectedTagsInvoker(
        ListProtectedTagsRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listProtectedTags, hcClient);
    }

    /**
     * 获取仓库保护分支
     *
     * 获取仓库保护分支
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProtectedBranchRequest 请求对象
     * @return ShowProtectedBranchResponse
     */
    public ShowProtectedBranchResponse showProtectedBranch(ShowProtectedBranchRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showProtectedBranch);
    }

    /**
     * 获取仓库保护分支
     *
     * 获取仓库保护分支
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProtectedBranchRequest 请求对象
     * @return SyncInvoker<ShowProtectedBranchRequest, ShowProtectedBranchResponse>
     */
    public SyncInvoker<ShowProtectedBranchRequest, ShowProtectedBranchResponse> showProtectedBranchInvoker(
        ShowProtectedBranchRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.showProtectedBranch, hcClient);
    }

    /**
     * 获取仓库保护Tag
     *
     * 获取仓库保护Tag
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProtectedTagRequest 请求对象
     * @return ShowProtectedTagResponse
     */
    public ShowProtectedTagResponse showProtectedTag(ShowProtectedTagRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showProtectedTag);
    }

    /**
     * 获取仓库保护Tag
     *
     * 获取仓库保护Tag
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProtectedTagRequest 请求对象
     * @return SyncInvoker<ShowProtectedTagRequest, ShowProtectedTagResponse>
     */
    public SyncInvoker<ShowProtectedTagRequest, ShowProtectedTagResponse> showProtectedTagInvoker(
        ShowProtectedTagRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.showProtectedTag, hcClient);
    }

    /**
     * 更新仓库保护分支
     *
     * 更新仓库保护分支
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProtectedBranchRequest 请求对象
     * @return UpdateProtectedBranchResponse
     */
    public UpdateProtectedBranchResponse updateProtectedBranch(UpdateProtectedBranchRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.updateProtectedBranch);
    }

    /**
     * 更新仓库保护分支
     *
     * 更新仓库保护分支
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProtectedBranchRequest 请求对象
     * @return SyncInvoker<UpdateProtectedBranchRequest, UpdateProtectedBranchResponse>
     */
    public SyncInvoker<UpdateProtectedBranchRequest, UpdateProtectedBranchResponse> updateProtectedBranchInvoker(
        UpdateProtectedBranchRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.updateProtectedBranch, hcClient);
    }

    /**
     * 更新仓库保护Tag
     *
     * 更新仓库保护Tag
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProtectedTagRequest 请求对象
     * @return UpdateProtectedTagResponse
     */
    public UpdateProtectedTagResponse updateProtectedTag(UpdateProtectedTagRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.updateProtectedTag);
    }

    /**
     * 更新仓库保护Tag
     *
     * 更新仓库保护Tag
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProtectedTagRequest 请求对象
     * @return SyncInvoker<UpdateProtectedTagRequest, UpdateProtectedTagResponse>
     */
    public SyncInvoker<UpdateProtectedTagRequest, UpdateProtectedTagResponse> updateProtectedTagInvoker(
        UpdateProtectedTagRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.updateProtectedTag, hcClient);
    }

    /**
     * 批量删除分支
     *
     * 批量删除分支
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteBranchRequest 请求对象
     * @return BatchDeleteBranchResponse
     */
    public BatchDeleteBranchResponse batchDeleteBranch(BatchDeleteBranchRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.batchDeleteBranch);
    }

    /**
     * 批量删除分支
     *
     * 批量删除分支
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteBranchRequest 请求对象
     * @return SyncInvoker<BatchDeleteBranchRequest, BatchDeleteBranchResponse>
     */
    public SyncInvoker<BatchDeleteBranchRequest, BatchDeleteBranchResponse> batchDeleteBranchInvoker(
        BatchDeleteBranchRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.batchDeleteBranch, hcClient);
    }

    /**
     * 创建分支
     *
     * 创建分支
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBranchRequest 请求对象
     * @return CreateBranchResponse
     */
    public CreateBranchResponse createBranch(CreateBranchRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.createBranch);
    }

    /**
     * 创建分支
     *
     * 创建分支
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBranchRequest 请求对象
     * @return SyncInvoker<CreateBranchRequest, CreateBranchResponse>
     */
    public SyncInvoker<CreateBranchRequest, CreateBranchResponse> createBranchInvoker(CreateBranchRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.createBranch, hcClient);
    }

    /**
     * 创建标签
     *
     * 创建标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTagRequest 请求对象
     * @return CreateTagResponse
     */
    public CreateTagResponse createTag(CreateTagRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.createTag);
    }

    /**
     * 创建标签
     *
     * 创建标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTagRequest 请求对象
     * @return SyncInvoker<CreateTagRequest, CreateTagResponse>
     */
    public SyncInvoker<CreateTagRequest, CreateTagResponse> createTagInvoker(CreateTagRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.createTag, hcClient);
    }

    /**
     * 删除分支
     *
     * 删除分支
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBranchRequest 请求对象
     * @return DeleteBranchResponse
     */
    public DeleteBranchResponse deleteBranch(DeleteBranchRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.deleteBranch);
    }

    /**
     * 删除分支
     *
     * 删除分支
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBranchRequest 请求对象
     * @return SyncInvoker<DeleteBranchRequest, DeleteBranchResponse>
     */
    public SyncInvoker<DeleteBranchRequest, DeleteBranchResponse> deleteBranchInvoker(DeleteBranchRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.deleteBranch, hcClient);
    }

    /**
     * 删除标签
     *
     * 删除标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTagRequest 请求对象
     * @return DeleteTagResponse
     */
    public DeleteTagResponse deleteTag(DeleteTagRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.deleteTag);
    }

    /**
     * 删除标签
     *
     * 删除标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTagRequest 请求对象
     * @return SyncInvoker<DeleteTagRequest, DeleteTagResponse>
     */
    public SyncInvoker<DeleteTagRequest, DeleteTagResponse> deleteTagInvoker(DeleteTagRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.deleteTag, hcClient);
    }

    /**
     * 获取分支列表
     *
     * 获取分支列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBranchesRequest 请求对象
     * @return ListBranchesResponse
     */
    public ListBranchesResponse listBranches(ListBranchesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listBranches);
    }

    /**
     * 获取分支列表
     *
     * 获取分支列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBranchesRequest 请求对象
     * @return SyncInvoker<ListBranchesRequest, ListBranchesResponse>
     */
    public SyncInvoker<ListBranchesRequest, ListBranchesResponse> listBranchesInvoker(ListBranchesRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listBranches, hcClient);
    }

    /**
     * 查看分支/tag列表
     *
     * 查看分支/tag列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRefsListRequest 请求对象
     * @return ListRefsListResponse
     */
    public ListRefsListResponse listRefsList(ListRefsListRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listRefsList);
    }

    /**
     * 查看分支/tag列表
     *
     * 查看分支/tag列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRefsListRequest 请求对象
     * @return SyncInvoker<ListRefsListRequest, ListRefsListResponse>
     */
    public SyncInvoker<ListRefsListRequest, ListRefsListResponse> listRefsListInvoker(ListRefsListRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listRefsList, hcClient);
    }

    /**
     * 获取标签列表
     *
     * 获取标签列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagsRequest 请求对象
     * @return ListTagsResponse
     */
    public ListTagsResponse listTags(ListTagsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listTags);
    }

    /**
     * 获取标签列表
     *
     * 获取标签列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagsRequest 请求对象
     * @return SyncInvoker<ListTagsRequest, ListTagsResponse>
     */
    public SyncInvoker<ListTagsRequest, ListTagsResponse> listTagsInvoker(ListTagsRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listTags, hcClient);
    }

    /**
     * 获取分支详情
     *
     * 获取分支详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBranchRequest 请求对象
     * @return ShowBranchResponse
     */
    public ShowBranchResponse showBranch(ShowBranchRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showBranch);
    }

    /**
     * 获取分支详情
     *
     * 获取分支详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBranchRequest 请求对象
     * @return SyncInvoker<ShowBranchRequest, ShowBranchResponse>
     */
    public SyncInvoker<ShowBranchRequest, ShowBranchResponse> showBranchInvoker(ShowBranchRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.showBranch, hcClient);
    }

    /**
     * 查看标签详情
     *
     * 查看标签详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTagRequest 请求对象
     * @return ShowTagResponse
     */
    public ShowTagResponse showTag(ShowTagRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showTag);
    }

    /**
     * 查看标签详情
     *
     * 查看标签详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTagRequest 请求对象
     * @return SyncInvoker<ShowTagRequest, ShowTagResponse>
     */
    public SyncInvoker<ShowTagRequest, ShowTagResponse> showTagInvoker(ShowTagRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.showTag, hcClient);
    }

    /**
     * 分支重命名
     *
     * 分支重命名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBranchNameRequest 请求对象
     * @return UpdateBranchNameResponse
     */
    public UpdateBranchNameResponse updateBranchName(UpdateBranchNameRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.updateBranchName);
    }

    /**
     * 分支重命名
     *
     * 分支重命名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBranchNameRequest 请求对象
     * @return SyncInvoker<UpdateBranchNameRequest, UpdateBranchNameResponse>
     */
    public SyncInvoker<UpdateBranchNameRequest, UpdateBranchNameResponse> updateBranchNameInvoker(
        UpdateBranchNameRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.updateBranchName, hcClient);
    }

    /**
     * 创建子模块
     *
     * 创建子模块
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddSubmoduleRequest 请求对象
     * @return AddSubmoduleResponse
     */
    public AddSubmoduleResponse addSubmodule(AddSubmoduleRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.addSubmodule);
    }

    /**
     * 创建子模块
     *
     * 创建子模块
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddSubmoduleRequest 请求对象
     * @return SyncInvoker<AddSubmoduleRequest, AddSubmoduleResponse>
     */
    public SyncInvoker<AddSubmoduleRequest, AddSubmoduleResponse> addSubmoduleInvoker(AddSubmoduleRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.addSubmodule, hcClient);
    }

    /**
     * 添加仓库ip白名单
     *
     * 添加仓库ip白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddTrustedIpAddressRequest 请求对象
     * @return AddTrustedIpAddressResponse
     */
    public AddTrustedIpAddressResponse addTrustedIpAddress(AddTrustedIpAddressRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.addTrustedIpAddress);
    }

    /**
     * 添加仓库ip白名单
     *
     * 添加仓库ip白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddTrustedIpAddressRequest 请求对象
     * @return SyncInvoker<AddTrustedIpAddressRequest, AddTrustedIpAddressResponse>
     */
    public SyncInvoker<AddTrustedIpAddressRequest, AddTrustedIpAddressResponse> addTrustedIpAddressInvoker(
        AddTrustedIpAddressRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.addTrustedIpAddress, hcClient);
    }

    /**
     * 将普通仓库与远程镜像关联
     *
     * 将普通仓库与远程镜像关联
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateRemoteMirrorRequest 请求对象
     * @return AssociateRemoteMirrorResponse
     */
    public AssociateRemoteMirrorResponse associateRemoteMirror(AssociateRemoteMirrorRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.associateRemoteMirror);
    }

    /**
     * 将普通仓库与远程镜像关联
     *
     * 将普通仓库与远程镜像关联
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateRemoteMirrorRequest 请求对象
     * @return SyncInvoker<AssociateRemoteMirrorRequest, AssociateRemoteMirrorResponse>
     */
    public SyncInvoker<AssociateRemoteMirrorRequest, AssociateRemoteMirrorResponse> associateRemoteMirrorInvoker(
        AssociateRemoteMirrorRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.associateRemoteMirror, hcClient);
    }

    /**
     * 关联仓库与成员组
     *
     * 关联仓库与成员组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateRepositoryUserGroupRequest 请求对象
     * @return AssociateRepositoryUserGroupResponse
     */
    public AssociateRepositoryUserGroupResponse associateRepositoryUserGroup(
        AssociateRepositoryUserGroupRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.associateRepositoryUserGroup);
    }

    /**
     * 关联仓库与成员组
     *
     * 关联仓库与成员组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateRepositoryUserGroupRequest 请求对象
     * @return SyncInvoker<AssociateRepositoryUserGroupRequest, AssociateRepositoryUserGroupResponse>
     */
    public SyncInvoker<AssociateRepositoryUserGroupRequest, AssociateRepositoryUserGroupResponse> associateRepositoryUserGroupInvoker(
        AssociateRepositoryUserGroupRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.associateRepositoryUserGroup, hcClient);
    }

    /**
     * 批量检查仓库名
     *
     * 批量检查仓库名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchValidateRepoNamesRequest 请求对象
     * @return BatchValidateRepoNamesResponse
     */
    public BatchValidateRepoNamesResponse batchValidateRepoNames(BatchValidateRepoNamesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.batchValidateRepoNames);
    }

    /**
     * 批量检查仓库名
     *
     * 批量检查仓库名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchValidateRepoNamesRequest 请求对象
     * @return SyncInvoker<BatchValidateRepoNamesRequest, BatchValidateRepoNamesResponse>
     */
    public SyncInvoker<BatchValidateRepoNamesRequest, BatchValidateRepoNamesResponse> batchValidateRepoNamesInvoker(
        BatchValidateRepoNamesRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.batchValidateRepoNames, hcClient);
    }

    /**
     * 创建指定分支下的目录
     *
     * 创建指定分支下的目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDirRequest 请求对象
     * @return CreateDirResponse
     */
    public CreateDirResponse createDir(CreateDirRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.createDir);
    }

    /**
     * 创建指定分支下的目录
     *
     * 创建指定分支下的目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDirRequest 请求对象
     * @return SyncInvoker<CreateDirRequest, CreateDirResponse>
     */
    public SyncInvoker<CreateDirRequest, CreateDirResponse> createDirInvoker(CreateDirRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.createDir, hcClient);
    }

    /**
     * 创建仓库提交规则
     *
     * 创建仓库提交规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRepositoryCommitRuleRequest 请求对象
     * @return CreateRepositoryCommitRuleResponse
     */
    public CreateRepositoryCommitRuleResponse createRepositoryCommitRule(CreateRepositoryCommitRuleRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.createRepositoryCommitRule);
    }

    /**
     * 创建仓库提交规则
     *
     * 创建仓库提交规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRepositoryCommitRuleRequest 请求对象
     * @return SyncInvoker<CreateRepositoryCommitRuleRequest, CreateRepositoryCommitRuleResponse>
     */
    public SyncInvoker<CreateRepositoryCommitRuleRequest, CreateRepositoryCommitRuleResponse> createRepositoryCommitRuleInvoker(
        CreateRepositoryCommitRuleRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.createRepositoryCommitRule, hcClient);
    }

    /**
     * 创建仓库标签
     *
     * 创建仓库标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRepositoryLabelRequest 请求对象
     * @return CreateRepositoryLabelResponse
     */
    public CreateRepositoryLabelResponse createRepositoryLabel(CreateRepositoryLabelRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.createRepositoryLabel);
    }

    /**
     * 创建仓库标签
     *
     * 创建仓库标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRepositoryLabelRequest 请求对象
     * @return SyncInvoker<CreateRepositoryLabelRequest, CreateRepositoryLabelResponse>
     */
    public SyncInvoker<CreateRepositoryLabelRequest, CreateRepositoryLabelResponse> createRepositoryLabelInvoker(
        CreateRepositoryLabelRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.createRepositoryLabel, hcClient);
    }

    /**
     * 创建仓库系统标签
     *
     * 创建仓库系统标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRepositorySystemLabelsRequest 请求对象
     * @return CreateRepositorySystemLabelsResponse
     */
    public CreateRepositorySystemLabelsResponse createRepositorySystemLabels(
        CreateRepositorySystemLabelsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.createRepositorySystemLabels);
    }

    /**
     * 创建仓库系统标签
     *
     * 创建仓库系统标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRepositorySystemLabelsRequest 请求对象
     * @return SyncInvoker<CreateRepositorySystemLabelsRequest, CreateRepositorySystemLabelsResponse>
     */
    public SyncInvoker<CreateRepositorySystemLabelsRequest, CreateRepositorySystemLabelsResponse> createRepositorySystemLabelsInvoker(
        CreateRepositorySystemLabelsRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.createRepositorySystemLabels, hcClient);
    }

    /**
     * 删除仓库标签
     *
     * 删除仓库标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRepositoryLabelRequest 请求对象
     * @return DeleteRepositoryLabelResponse
     */
    public DeleteRepositoryLabelResponse deleteRepositoryLabel(DeleteRepositoryLabelRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.deleteRepositoryLabel);
    }

    /**
     * 删除仓库标签
     *
     * 删除仓库标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRepositoryLabelRequest 请求对象
     * @return SyncInvoker<DeleteRepositoryLabelRequest, DeleteRepositoryLabelResponse>
     */
    public SyncInvoker<DeleteRepositoryLabelRequest, DeleteRepositoryLabelResponse> deleteRepositoryLabelInvoker(
        DeleteRepositoryLabelRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.deleteRepositoryLabel, hcClient);
    }

    /**
     * 删除仓库ip白名单
     *
     * 删除仓库ip白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTrustedIpAddressRequest 请求对象
     * @return DeleteTrustedIpAddressResponse
     */
    public DeleteTrustedIpAddressResponse deleteTrustedIpAddress(DeleteTrustedIpAddressRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.deleteTrustedIpAddress);
    }

    /**
     * 删除仓库ip白名单
     *
     * 删除仓库ip白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTrustedIpAddressRequest 请求对象
     * @return SyncInvoker<DeleteTrustedIpAddressRequest, DeleteTrustedIpAddressResponse>
     */
    public SyncInvoker<DeleteTrustedIpAddressRequest, DeleteTrustedIpAddressResponse> deleteTrustedIpAddressInvoker(
        DeleteTrustedIpAddressRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.deleteTrustedIpAddress, hcClient);
    }

    /**
     * 仓库下载
     *
     * 仓库下载
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadArchiveRequest 请求对象
     * @return DownloadArchiveResponse
     */
    public DownloadArchiveResponse downloadArchive(DownloadArchiveRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.downloadArchive);
    }

    /**
     * 仓库下载
     *
     * 仓库下载
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadArchiveRequest 请求对象
     * @return SyncInvoker<DownloadArchiveRequest, DownloadArchiveResponse>
     */
    public SyncInvoker<DownloadArchiveRequest, DownloadArchiveResponse> downloadArchiveInvoker(
        DownloadArchiveRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.downloadArchive, hcClient);
    }

    /**
     * 触发仓库统计任务
     *
     * 触发仓库统计任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteRepositoryStatisticsRequest 请求对象
     * @return ExecuteRepositoryStatisticsResponse
     */
    public ExecuteRepositoryStatisticsResponse executeRepositoryStatistics(ExecuteRepositoryStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.executeRepositoryStatistics);
    }

    /**
     * 触发仓库统计任务
     *
     * 触发仓库统计任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteRepositoryStatisticsRequest 请求对象
     * @return SyncInvoker<ExecuteRepositoryStatisticsRequest, ExecuteRepositoryStatisticsResponse>
     */
    public SyncInvoker<ExecuteRepositoryStatisticsRequest, ExecuteRepositoryStatisticsResponse> executeRepositoryStatisticsInvoker(
        ExecuteRepositoryStatisticsRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.executeRepositoryStatistics, hcClient);
    }

    /**
     * 获取当前登录用户仓库
     *
     * 获取当前登录用户仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCurrentUserRepositoriesRequest 请求对象
     * @return ListCurrentUserRepositoriesResponse
     */
    public ListCurrentUserRepositoriesResponse listCurrentUserRepositories(ListCurrentUserRepositoriesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listCurrentUserRepositories);
    }

    /**
     * 获取当前登录用户仓库
     *
     * 获取当前登录用户仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCurrentUserRepositoriesRequest 请求对象
     * @return SyncInvoker<ListCurrentUserRepositoriesRequest, ListCurrentUserRepositoriesResponse>
     */
    public SyncInvoker<ListCurrentUserRepositoriesRequest, ListCurrentUserRepositoriesResponse> listCurrentUserRepositoriesInvoker(
        ListCurrentUserRepositoriesRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listCurrentUserRepositories, hcClient);
    }

    /**
     * 获取代码组下仓库列表
     *
     * 获取代码组下仓库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupRepositoriesRequest 请求对象
     * @return ListGroupRepositoriesResponse
     */
    public ListGroupRepositoriesResponse listGroupRepositories(ListGroupRepositoriesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listGroupRepositories);
    }

    /**
     * 获取代码组下仓库列表
     *
     * 获取代码组下仓库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupRepositoriesRequest 请求对象
     * @return SyncInvoker<ListGroupRepositoriesRequest, ListGroupRepositoriesResponse>
     */
    public SyncInvoker<ListGroupRepositoriesRequest, ListGroupRepositoriesResponse> listGroupRepositoriesInvoker(
        ListGroupRepositoriesRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listGroupRepositories, hcClient);
    }

    /**
     * 获取当前用户最近提交动态列表
     *
     * 查询当前最近前N条提交动态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPersonalRecentPushEventsRequest 请求对象
     * @return ListPersonalRecentPushEventsResponse
     */
    public ListPersonalRecentPushEventsResponse listPersonalRecentPushEvents(
        ListPersonalRecentPushEventsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listPersonalRecentPushEvents);
    }

    /**
     * 获取当前用户最近提交动态列表
     *
     * 查询当前最近前N条提交动态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPersonalRecentPushEventsRequest 请求对象
     * @return SyncInvoker<ListPersonalRecentPushEventsRequest, ListPersonalRecentPushEventsResponse>
     */
    public SyncInvoker<ListPersonalRecentPushEventsRequest, ListPersonalRecentPushEventsResponse> listPersonalRecentPushEventsInvoker(
        ListPersonalRecentPushEventsRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listPersonalRecentPushEvents, hcClient);
    }

    /**
     * 查看当前用户仓库导入任务列表
     *
     * 查看当前用户仓库导入任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPersonalRepositoryImportRecordsRequest 请求对象
     * @return ListPersonalRepositoryImportRecordsResponse
     */
    public ListPersonalRepositoryImportRecordsResponse listPersonalRepositoryImportRecords(
        ListPersonalRepositoryImportRecordsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listPersonalRepositoryImportRecords);
    }

    /**
     * 查看当前用户仓库导入任务列表
     *
     * 查看当前用户仓库导入任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPersonalRepositoryImportRecordsRequest 请求对象
     * @return SyncInvoker<ListPersonalRepositoryImportRecordsRequest, ListPersonalRepositoryImportRecordsResponse>
     */
    public SyncInvoker<ListPersonalRepositoryImportRecordsRequest, ListPersonalRepositoryImportRecordsResponse> listPersonalRepositoryImportRecordsInvoker(
        ListPersonalRepositoryImportRecordsRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listPersonalRepositoryImportRecords, hcClient);
    }

    /**
     * 获取项目下仓库列表
     *
     * 获取项目下仓库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectRepositoriesRequest 请求对象
     * @return ListProjectRepositoriesResponse
     */
    public ListProjectRepositoriesResponse listProjectRepositories(ListProjectRepositoriesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listProjectRepositories);
    }

    /**
     * 获取项目下仓库列表
     *
     * 获取项目下仓库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectRepositoriesRequest 请求对象
     * @return SyncInvoker<ListProjectRepositoriesRequest, ListProjectRepositoriesResponse>
     */
    public SyncInvoker<ListProjectRepositoriesRequest, ListProjectRepositoriesResponse> listProjectRepositoriesInvoker(
        ListProjectRepositoriesRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listProjectRepositories, hcClient);
    }

    /**
     * 查看仓库提交规则
     *
     * 查看仓库提交规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryCommitRulesRequest 请求对象
     * @return ListRepositoryCommitRulesResponse
     */
    public ListRepositoryCommitRulesResponse listRepositoryCommitRules(ListRepositoryCommitRulesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listRepositoryCommitRules);
    }

    /**
     * 查看仓库提交规则
     *
     * 查看仓库提交规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryCommitRulesRequest 请求对象
     * @return SyncInvoker<ListRepositoryCommitRulesRequest, ListRepositoryCommitRulesResponse>
     */
    public SyncInvoker<ListRepositoryCommitRulesRequest, ListRepositoryCommitRulesResponse> listRepositoryCommitRulesInvoker(
        ListRepositoryCommitRulesRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listRepositoryCommitRules, hcClient);
    }

    /**
     * 获取仓库贡献者列表
     *
     * 获取仓库贡献者列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryContributorsRequest 请求对象
     * @return ListRepositoryContributorsResponse
     */
    public ListRepositoryContributorsResponse listRepositoryContributors(ListRepositoryContributorsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listRepositoryContributors);
    }

    /**
     * 获取仓库贡献者列表
     *
     * 获取仓库贡献者列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryContributorsRequest 请求对象
     * @return SyncInvoker<ListRepositoryContributorsRequest, ListRepositoryContributorsResponse>
     */
    public SyncInvoker<ListRepositoryContributorsRequest, ListRepositoryContributorsResponse> listRepositoryContributorsInvoker(
        ListRepositoryContributorsRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listRepositoryContributors, hcClient);
    }

    /**
     * 获取仓库动态
     *
     * 获取仓库动态（当前仅开放推送动态）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryEventsRequest 请求对象
     * @return ListRepositoryEventsResponse
     */
    public ListRepositoryEventsResponse listRepositoryEvents(ListRepositoryEventsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listRepositoryEvents);
    }

    /**
     * 获取仓库动态
     *
     * 获取仓库动态（当前仅开放推送动态）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryEventsRequest 请求对象
     * @return SyncInvoker<ListRepositoryEventsRequest, ListRepositoryEventsResponse>
     */
    public SyncInvoker<ListRepositoryEventsRequest, ListRepositoryEventsResponse> listRepositoryEventsInvoker(
        ListRepositoryEventsRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listRepositoryEvents, hcClient);
    }

    /**
     * 获取仓库Fork列表
     *
     * 获取仓库Fork列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryForksRequest 请求对象
     * @return ListRepositoryForksResponse
     */
    public ListRepositoryForksResponse listRepositoryForks(ListRepositoryForksRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listRepositoryForks);
    }

    /**
     * 获取仓库Fork列表
     *
     * 获取仓库Fork列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryForksRequest 请求对象
     * @return SyncInvoker<ListRepositoryForksRequest, ListRepositoryForksResponse>
     */
    public SyncInvoker<ListRepositoryForksRequest, ListRepositoryForksResponse> listRepositoryForksInvoker(
        ListRepositoryForksRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listRepositoryForks, hcClient);
    }

    /**
     * 获取仓库标签列表
     *
     * 获取仓库标签列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryLabelsRequest 请求对象
     * @return ListRepositoryLabelsResponse
     */
    public ListRepositoryLabelsResponse listRepositoryLabels(ListRepositoryLabelsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listRepositoryLabels);
    }

    /**
     * 获取仓库标签列表
     *
     * 获取仓库标签列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryLabelsRequest 请求对象
     * @return SyncInvoker<ListRepositoryLabelsRequest, ListRepositoryLabelsResponse>
     */
    public SyncInvoker<ListRepositoryLabelsRequest, ListRepositoryLabelsResponse> listRepositoryLabelsInvoker(
        ListRepositoryLabelsRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listRepositoryLabels, hcClient);
    }

    /**
     * 获取仓库默认分支语言统计
     *
     * 获取仓库默认分支语言统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryLanguagesRequest 请求对象
     * @return ListRepositoryLanguagesResponse
     */
    public ListRepositoryLanguagesResponse listRepositoryLanguages(ListRepositoryLanguagesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listRepositoryLanguages);
    }

    /**
     * 获取仓库默认分支语言统计
     *
     * 获取仓库默认分支语言统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryLanguagesRequest 请求对象
     * @return SyncInvoker<ListRepositoryLanguagesRequest, ListRepositoryLanguagesResponse>
     */
    public SyncInvoker<ListRepositoryLanguagesRequest, ListRepositoryLanguagesResponse> listRepositoryLanguagesInvoker(
        ListRepositoryLanguagesRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listRepositoryLanguages, hcClient);
    }

    /**
     * 模板仓列表
     *
     * 模板仓列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryTemplatesRequest 请求对象
     * @return ListRepositoryTemplatesResponse
     */
    public ListRepositoryTemplatesResponse listRepositoryTemplates(ListRepositoryTemplatesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listRepositoryTemplates);
    }

    /**
     * 模板仓列表
     *
     * 模板仓列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryTemplatesRequest 请求对象
     * @return SyncInvoker<ListRepositoryTemplatesRequest, ListRepositoryTemplatesResponse>
     */
    public SyncInvoker<ListRepositoryTemplatesRequest, ListRepositoryTemplatesResponse> listRepositoryTemplatesInvoker(
        ListRepositoryTemplatesRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listRepositoryTemplates, hcClient);
    }

    /**
     * 获取仓库指定分支或者标签子模块列表
     *
     * 获取仓库指定分支或者标签子模块列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubmodulesRequest 请求对象
     * @return ListSubmodulesResponse
     */
    public ListSubmodulesResponse listSubmodules(ListSubmodulesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listSubmodules);
    }

    /**
     * 获取仓库指定分支或者标签子模块列表
     *
     * 获取仓库指定分支或者标签子模块列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubmodulesRequest 请求对象
     * @return SyncInvoker<ListSubmodulesRequest, ListSubmodulesResponse>
     */
    public SyncInvoker<ListSubmodulesRequest, ListSubmodulesResponse> listSubmodulesInvoker(
        ListSubmodulesRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listSubmodules, hcClient);
    }

    /**
     * 获取仓库ip白名单
     *
     * 获取仓库ip白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTrustedIpAddressesRequest 请求对象
     * @return ListTrustedIpAddressesResponse
     */
    public ListTrustedIpAddressesResponse listTrustedIpAddresses(ListTrustedIpAddressesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listTrustedIpAddresses);
    }

    /**
     * 获取仓库ip白名单
     *
     * 获取仓库ip白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTrustedIpAddressesRequest 请求对象
     * @return SyncInvoker<ListTrustedIpAddressesRequest, ListTrustedIpAddressesResponse>
     */
    public SyncInvoker<ListTrustedIpAddressesRequest, ListTrustedIpAddressesResponse> listTrustedIpAddressesInvoker(
        ListTrustedIpAddressesRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listTrustedIpAddresses, hcClient);
    }

    /**
     * 锁定仓库
     *
     * 锁定仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request LockRepositoryRequest 请求对象
     * @return LockRepositoryResponse
     */
    public LockRepositoryResponse lockRepository(LockRepositoryRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.lockRepository);
    }

    /**
     * 锁定仓库
     *
     * 锁定仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request LockRepositoryRequest 请求对象
     * @return SyncInvoker<LockRepositoryRequest, LockRepositoryResponse>
     */
    public SyncInvoker<LockRepositoryRequest, LockRepositoryResponse> lockRepositoryInvoker(
        LockRepositoryRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.lockRepository, hcClient);
    }

    /**
     * 删除仓库部署密钥
     *
     * 删除仓库部署密钥
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveDeployKeyRequest 请求对象
     * @return RemoveDeployKeyResponse
     */
    public RemoveDeployKeyResponse removeDeployKey(RemoveDeployKeyRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.removeDeployKey);
    }

    /**
     * 删除仓库部署密钥
     *
     * 删除仓库部署密钥
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveDeployKeyRequest 请求对象
     * @return SyncInvoker<RemoveDeployKeyRequest, RemoveDeployKeyResponse>
     */
    public SyncInvoker<RemoveDeployKeyRequest, RemoveDeployKeyResponse> removeDeployKeyInvoker(
        RemoveDeployKeyRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.removeDeployKey, hcClient);
    }

    /**
     * 删除子仓库部署密钥
     *
     * 将该该仓库的部署密钥从子模组中删除
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveDeployKeyFromSubmodulesRequest 请求对象
     * @return RemoveDeployKeyFromSubmodulesResponse
     */
    public RemoveDeployKeyFromSubmodulesResponse removeDeployKeyFromSubmodules(
        RemoveDeployKeyFromSubmodulesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.removeDeployKeyFromSubmodules);
    }

    /**
     * 删除子仓库部署密钥
     *
     * 将该该仓库的部署密钥从子模组中删除
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveDeployKeyFromSubmodulesRequest 请求对象
     * @return SyncInvoker<RemoveDeployKeyFromSubmodulesRequest, RemoveDeployKeyFromSubmodulesResponse>
     */
    public SyncInvoker<RemoveDeployKeyFromSubmodulesRequest, RemoveDeployKeyFromSubmodulesResponse> removeDeployKeyFromSubmodulesInvoker(
        RemoveDeployKeyFromSubmodulesRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.removeDeployKeyFromSubmodules, hcClient);
    }

    /**
     * 获取文件内容
     *
     * 获取文件内容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBlobsRequest 请求对象
     * @return ShowBlobsResponse
     */
    public ShowBlobsResponse showBlobs(ShowBlobsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showBlobs);
    }

    /**
     * 获取文件内容
     *
     * 获取文件内容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBlobsRequest 请求对象
     * @return SyncInvoker<ShowBlobsRequest, ShowBlobsResponse>
     */
    public SyncInvoker<ShowBlobsRequest, ShowBlobsResponse> showBlobsInvoker(ShowBlobsRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.showBlobs, hcClient);
    }

    /**
     * 获取仓库指定分支的提交统计信息
     *
     * 获取仓库指定分支的提交统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCommitStatisticsRequest 请求对象
     * @return ShowCommitStatisticsResponse
     */
    public ShowCommitStatisticsResponse showCommitStatistics(ShowCommitStatisticsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showCommitStatistics);
    }

    /**
     * 获取仓库指定分支的提交统计信息
     *
     * 获取仓库指定分支的提交统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCommitStatisticsRequest 请求对象
     * @return SyncInvoker<ShowCommitStatisticsRequest, ShowCommitStatisticsResponse>
     */
    public SyncInvoker<ShowCommitStatisticsRequest, ShowCommitStatisticsResponse> showCommitStatisticsInvoker(
        ShowCommitStatisticsRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.showCommitStatistics, hcClient);
    }

    /**
     * 按行数查询提交文件内容
     *
     * 按行数查询提交文件内容，最大显示行数为1000行
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDiffLinesRequest 请求对象
     * @return ShowDiffLinesResponse
     */
    public ShowDiffLinesResponse showDiffLines(ShowDiffLinesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showDiffLines);
    }

    /**
     * 按行数查询提交文件内容
     *
     * 按行数查询提交文件内容，最大显示行数为1000行
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDiffLinesRequest 请求对象
     * @return SyncInvoker<ShowDiffLinesRequest, ShowDiffLinesResponse>
     */
    public SyncInvoker<ShowDiffLinesRequest, ShowDiffLinesResponse> showDiffLinesInvoker(ShowDiffLinesRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.showDiffLines, hcClient);
    }

    /**
     * 获取仓库最近推送事件
     *
     * 获取仓库最近推送事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLastPushEventInRepositoryRequest 请求对象
     * @return ShowLastPushEventInRepositoryResponse
     */
    public ShowLastPushEventInRepositoryResponse showLastPushEventInRepository(
        ShowLastPushEventInRepositoryRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showLastPushEventInRepository);
    }

    /**
     * 获取仓库最近推送事件
     *
     * 获取仓库最近推送事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLastPushEventInRepositoryRequest 请求对象
     * @return SyncInvoker<ShowLastPushEventInRepositoryRequest, ShowLastPushEventInRepositoryResponse>
     */
    public SyncInvoker<ShowLastPushEventInRepositoryRequest, ShowLastPushEventInRepositoryResponse> showLastPushEventInRepositoryInvoker(
        ShowLastPushEventInRepositoryRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.showLastPushEventInRepository, hcClient);
    }

    /**
     * 获取仓库通知设置
     *
     * 获取仓库通知设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNotificationSubscriptionRequest 请求对象
     * @return ShowNotificationSubscriptionResponse
     */
    public ShowNotificationSubscriptionResponse showNotificationSubscription(
        ShowNotificationSubscriptionRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showNotificationSubscription);
    }

    /**
     * 获取仓库通知设置
     *
     * 获取仓库通知设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNotificationSubscriptionRequest 请求对象
     * @return SyncInvoker<ShowNotificationSubscriptionRequest, ShowNotificationSubscriptionResponse>
     */
    public SyncInvoker<ShowNotificationSubscriptionRequest, ShowNotificationSubscriptionResponse> showNotificationSubscriptionInvoker(
        ShowNotificationSubscriptionRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.showNotificationSubscription, hcClient);
    }

    /**
     * 获取仓库通知设置启用状态
     *
     * 获取仓库通知设置启用状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNotificationSubscriptionsStatusRequest 请求对象
     * @return ShowNotificationSubscriptionsStatusResponse
     */
    public ShowNotificationSubscriptionsStatusResponse showNotificationSubscriptionsStatus(
        ShowNotificationSubscriptionsStatusRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showNotificationSubscriptionsStatus);
    }

    /**
     * 获取仓库通知设置启用状态
     *
     * 获取仓库通知设置启用状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNotificationSubscriptionsStatusRequest 请求对象
     * @return SyncInvoker<ShowNotificationSubscriptionsStatusRequest, ShowNotificationSubscriptionsStatusResponse>
     */
    public SyncInvoker<ShowNotificationSubscriptionsStatusRequest, ShowNotificationSubscriptionsStatusResponse> showNotificationSubscriptionsStatusInvoker(
        ShowNotificationSubscriptionsStatusRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.showNotificationSubscriptionsStatus, hcClient);
    }

    /**
     * 分支、tags、提交对比
     *
     * 分支、tags、提交对比
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRefCompareRequest 请求对象
     * @return ShowRefCompareResponse
     */
    public ShowRefCompareResponse showRefCompare(ShowRefCompareRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showRefCompare);
    }

    /**
     * 分支、tags、提交对比
     *
     * 分支、tags、提交对比
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRefCompareRequest 请求对象
     * @return SyncInvoker<ShowRefCompareRequest, ShowRefCompareResponse>
     */
    public SyncInvoker<ShowRefCompareRequest, ShowRefCompareResponse> showRefCompareInvoker(
        ShowRefCompareRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.showRefCompare, hcClient);
    }

    /**
     * 获取仓库镜像详情
     *
     * 获取仓库镜像详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRemoteMirrorRequest 请求对象
     * @return ShowRemoteMirrorResponse
     */
    public ShowRemoteMirrorResponse showRemoteMirror(ShowRemoteMirrorRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showRemoteMirror);
    }

    /**
     * 获取仓库镜像详情
     *
     * 获取仓库镜像详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRemoteMirrorRequest 请求对象
     * @return SyncInvoker<ShowRemoteMirrorRequest, ShowRemoteMirrorResponse>
     */
    public SyncInvoker<ShowRemoteMirrorRequest, ShowRemoteMirrorResponse> showRemoteMirrorInvoker(
        ShowRemoteMirrorRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.showRemoteMirror, hcClient);
    }

    /**
     * 获取仓库详情
     *
     * 获取仓库详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryRequest 请求对象
     * @return ShowRepositoryResponse
     */
    public ShowRepositoryResponse showRepository(ShowRepositoryRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showRepository);
    }

    /**
     * 获取仓库详情
     *
     * 获取仓库详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryRequest 请求对象
     * @return SyncInvoker<ShowRepositoryRequest, ShowRepositoryResponse>
     */
    public SyncInvoker<ShowRepositoryRequest, ShowRepositoryResponse> showRepositoryInvoker(
        ShowRepositoryRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.showRepository, hcClient);
    }

    /**
     * 查看仓库通用提交规则
     *
     * 查看仓库通用提交规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryGeneralCommitRuleRequest 请求对象
     * @return ShowRepositoryGeneralCommitRuleResponse
     */
    public ShowRepositoryGeneralCommitRuleResponse showRepositoryGeneralCommitRule(
        ShowRepositoryGeneralCommitRuleRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showRepositoryGeneralCommitRule);
    }

    /**
     * 查看仓库通用提交规则
     *
     * 查看仓库通用提交规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryGeneralCommitRuleRequest 请求对象
     * @return SyncInvoker<ShowRepositoryGeneralCommitRuleRequest, ShowRepositoryGeneralCommitRuleResponse>
     */
    public SyncInvoker<ShowRepositoryGeneralCommitRuleRequest, ShowRepositoryGeneralCommitRuleResponse> showRepositoryGeneralCommitRuleInvoker(
        ShowRepositoryGeneralCommitRuleRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.showRepositoryGeneralCommitRule, hcClient);
    }

    /**
     * 查看仓库通用策略
     *
     * 查看仓库通用策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryGeneralPolicyRequest 请求对象
     * @return ShowRepositoryGeneralPolicyResponse
     */
    public ShowRepositoryGeneralPolicyResponse showRepositoryGeneralPolicy(ShowRepositoryGeneralPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showRepositoryGeneralPolicy);
    }

    /**
     * 查看仓库通用策略
     *
     * 查看仓库通用策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryGeneralPolicyRequest 请求对象
     * @return SyncInvoker<ShowRepositoryGeneralPolicyRequest, ShowRepositoryGeneralPolicyResponse>
     */
    public SyncInvoker<ShowRepositoryGeneralPolicyRequest, ShowRepositoryGeneralPolicyResponse> showRepositoryGeneralPolicyInvoker(
        ShowRepositoryGeneralPolicyRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.showRepositoryGeneralPolicy, hcClient);
    }

    /**
     * 查看仓库继承设置
     *
     * 查看仓库继承设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryInheritSettingRequest 请求对象
     * @return ShowRepositoryInheritSettingResponse
     */
    public ShowRepositoryInheritSettingResponse showRepositoryInheritSetting(
        ShowRepositoryInheritSettingRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showRepositoryInheritSetting);
    }

    /**
     * 查看仓库继承设置
     *
     * 查看仓库继承设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryInheritSettingRequest 请求对象
     * @return SyncInvoker<ShowRepositoryInheritSettingRequest, ShowRepositoryInheritSettingResponse>
     */
    public SyncInvoker<ShowRepositoryInheritSettingRequest, ShowRepositoryInheritSettingResponse> showRepositoryInheritSettingInvoker(
        ShowRepositoryInheritSettingRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.showRepositoryInheritSetting, hcClient);
    }

    /**
     * 查看仓库继承设置源
     *
     * 查看仓库继承设置源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryInheritSettingSourceRequest 请求对象
     * @return ShowRepositoryInheritSettingSourceResponse
     */
    public ShowRepositoryInheritSettingSourceResponse showRepositoryInheritSettingSource(
        ShowRepositoryInheritSettingSourceRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showRepositoryInheritSettingSource);
    }

    /**
     * 查看仓库继承设置源
     *
     * 查看仓库继承设置源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryInheritSettingSourceRequest 请求对象
     * @return SyncInvoker<ShowRepositoryInheritSettingSourceRequest, ShowRepositoryInheritSettingSourceResponse>
     */
    public SyncInvoker<ShowRepositoryInheritSettingSourceRequest, ShowRepositoryInheritSettingSourceResponse> showRepositoryInheritSettingSourceInvoker(
        ShowRepositoryInheritSettingSourceRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.showRepositoryInheritSettingSource, hcClient);
    }

    /**
     * 获取仓库统计任务状态
     *
     * 获取仓库统计任务状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryStatisticsStatusRequest 请求对象
     * @return ShowRepositoryStatisticsStatusResponse
     */
    public ShowRepositoryStatisticsStatusResponse showRepositoryStatisticsStatus(
        ShowRepositoryStatisticsStatusRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showRepositoryStatisticsStatus);
    }

    /**
     * 获取仓库统计任务状态
     *
     * 获取仓库统计任务状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryStatisticsStatusRequest 请求对象
     * @return SyncInvoker<ShowRepositoryStatisticsStatusRequest, ShowRepositoryStatisticsStatusResponse>
     */
    public SyncInvoker<ShowRepositoryStatisticsStatusRequest, ShowRepositoryStatisticsStatusResponse> showRepositoryStatisticsStatusInvoker(
        ShowRepositoryStatisticsStatusRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.showRepositoryStatisticsStatus, hcClient);
    }

    /**
     * 获取仓库统计摘要
     *
     * 获取仓库统计摘要
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryStatisticsSummaryRequest 请求对象
     * @return ShowRepositoryStatisticsSummaryResponse
     */
    public ShowRepositoryStatisticsSummaryResponse showRepositoryStatisticsSummary(
        ShowRepositoryStatisticsSummaryRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showRepositoryStatisticsSummary);
    }

    /**
     * 获取仓库统计摘要
     *
     * 获取仓库统计摘要
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryStatisticsSummaryRequest 请求对象
     * @return SyncInvoker<ShowRepositoryStatisticsSummaryRequest, ShowRepositoryStatisticsSummaryResponse>
     */
    public SyncInvoker<ShowRepositoryStatisticsSummaryRequest, ShowRepositoryStatisticsSummaryResponse> showRepositoryStatisticsSummaryInvoker(
        ShowRepositoryStatisticsSummaryRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.showRepositoryStatisticsSummary, hcClient);
    }

    /**
     * 获取仓库水印设置
     *
     * 获取仓库水印设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryWatermarkRequest 请求对象
     * @return ShowRepositoryWatermarkResponse
     */
    public ShowRepositoryWatermarkResponse showRepositoryWatermark(ShowRepositoryWatermarkRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showRepositoryWatermark);
    }

    /**
     * 获取仓库水印设置
     *
     * 获取仓库水印设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryWatermarkRequest 请求对象
     * @return SyncInvoker<ShowRepositoryWatermarkRequest, ShowRepositoryWatermarkResponse>
     */
    public SyncInvoker<ShowRepositoryWatermarkRequest, ShowRepositoryWatermarkResponse> showRepositoryWatermarkInvoker(
        ShowRepositoryWatermarkRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.showRepositoryWatermark, hcClient);
    }

    /**
     * 获取CR仓库用户分支或标签级权限
     *
     * 获取CR仓库用户分支或标签级权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserRefPermissionRequest 请求对象
     * @return ShowUserRefPermissionResponse
     */
    public ShowUserRefPermissionResponse showUserRefPermission(ShowUserRefPermissionRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showUserRefPermission);
    }

    /**
     * 获取CR仓库用户分支或标签级权限
     *
     * 获取CR仓库用户分支或标签级权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserRefPermissionRequest 请求对象
     * @return SyncInvoker<ShowUserRefPermissionRequest, ShowUserRefPermissionResponse>
     */
    public SyncInvoker<ShowUserRefPermissionRequest, ShowUserRefPermissionResponse> showUserRefPermissionInvoker(
        ShowUserRefPermissionRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.showUserRefPermission, hcClient);
    }

    /**
     * 启动仓库加速
     *
     * 启动仓库加速
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartHouseKeepingRequest 请求对象
     * @return StartHouseKeepingResponse
     */
    public StartHouseKeepingResponse startHouseKeeping(StartHouseKeepingRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.startHouseKeeping);
    }

    /**
     * 启动仓库加速
     *
     * 启动仓库加速
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartHouseKeepingRequest 请求对象
     * @return SyncInvoker<StartHouseKeepingRequest, StartHouseKeepingResponse>
     */
    public SyncInvoker<StartHouseKeepingRequest, StartHouseKeepingResponse> startHouseKeepingInvoker(
        StartHouseKeepingRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.startHouseKeeping, hcClient);
    }

    /**
     * 启动仓库镜像同步
     *
     * 启动仓库镜像同步
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartRemoteMirrorSynchronizationRequest 请求对象
     * @return StartRemoteMirrorSynchronizationResponse
     */
    public StartRemoteMirrorSynchronizationResponse startRemoteMirrorSynchronization(
        StartRemoteMirrorSynchronizationRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.startRemoteMirrorSynchronization);
    }

    /**
     * 启动仓库镜像同步
     *
     * 启动仓库镜像同步
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartRemoteMirrorSynchronizationRequest 请求对象
     * @return SyncInvoker<StartRemoteMirrorSynchronizationRequest, StartRemoteMirrorSynchronizationResponse>
     */
    public SyncInvoker<StartRemoteMirrorSynchronizationRequest, StartRemoteMirrorSynchronizationResponse> startRemoteMirrorSynchronizationInvoker(
        StartRemoteMirrorSynchronizationRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.startRemoteMirrorSynchronization, hcClient);
    }

    /**
     * 仓库部署密钥同步到子仓
     *
     * 将该仓库的部署密钥同步到所有的子模组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SyncDeployKeyToSubmodulesRequest 请求对象
     * @return SyncDeployKeyToSubmodulesResponse
     */
    public SyncDeployKeyToSubmodulesResponse syncDeployKeyToSubmodules(SyncDeployKeyToSubmodulesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.syncDeployKeyToSubmodules);
    }

    /**
     * 仓库部署密钥同步到子仓
     *
     * 将该仓库的部署密钥同步到所有的子模组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SyncDeployKeyToSubmodulesRequest 请求对象
     * @return SyncInvoker<SyncDeployKeyToSubmodulesRequest, SyncDeployKeyToSubmodulesResponse>
     */
    public SyncInvoker<SyncDeployKeyToSubmodulesRequest, SyncDeployKeyToSubmodulesResponse> syncDeployKeyToSubmodulesInvoker(
        SyncDeployKeyToSubmodulesRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.syncDeployKeyToSubmodules, hcClient);
    }

    /**
     * 解锁仓库
     *
     * 解锁仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnlockRepositoryRequest 请求对象
     * @return UnlockRepositoryResponse
     */
    public UnlockRepositoryResponse unlockRepository(UnlockRepositoryRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.unlockRepository);
    }

    /**
     * 解锁仓库
     *
     * 解锁仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnlockRepositoryRequest 请求对象
     * @return SyncInvoker<UnlockRepositoryRequest, UnlockRepositoryResponse>
     */
    public SyncInvoker<UnlockRepositoryRequest, UnlockRepositoryResponse> unlockRepositoryInvoker(
        UnlockRepositoryRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.unlockRepository, hcClient);
    }

    /**
     * 修改仓库通知设置
     *
     * 修改仓库通知设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNotificationSubscriptionRequest 请求对象
     * @return UpdateNotificationSubscriptionResponse
     */
    public UpdateNotificationSubscriptionResponse updateNotificationSubscription(
        UpdateNotificationSubscriptionRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.updateNotificationSubscription);
    }

    /**
     * 修改仓库通知设置
     *
     * 修改仓库通知设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNotificationSubscriptionRequest 请求对象
     * @return SyncInvoker<UpdateNotificationSubscriptionRequest, UpdateNotificationSubscriptionResponse>
     */
    public SyncInvoker<UpdateNotificationSubscriptionRequest, UpdateNotificationSubscriptionResponse> updateNotificationSubscriptionInvoker(
        UpdateNotificationSubscriptionRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.updateNotificationSubscription, hcClient);
    }

    /**
     * 修改仓库提交规则
     *
     * 修改仓库提交规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRepositoryCommitRuleRequest 请求对象
     * @return UpdateRepositoryCommitRuleResponse
     */
    public UpdateRepositoryCommitRuleResponse updateRepositoryCommitRule(UpdateRepositoryCommitRuleRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.updateRepositoryCommitRule);
    }

    /**
     * 修改仓库提交规则
     *
     * 修改仓库提交规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRepositoryCommitRuleRequest 请求对象
     * @return SyncInvoker<UpdateRepositoryCommitRuleRequest, UpdateRepositoryCommitRuleResponse>
     */
    public SyncInvoker<UpdateRepositoryCommitRuleRequest, UpdateRepositoryCommitRuleResponse> updateRepositoryCommitRuleInvoker(
        UpdateRepositoryCommitRuleRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.updateRepositoryCommitRule, hcClient);
    }

    /**
     * 修改仓库通用提交规则
     *
     * 修改仓库通用提交规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRepositoryGeneralCommitRuleRequest 请求对象
     * @return UpdateRepositoryGeneralCommitRuleResponse
     */
    public UpdateRepositoryGeneralCommitRuleResponse updateRepositoryGeneralCommitRule(
        UpdateRepositoryGeneralCommitRuleRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.updateRepositoryGeneralCommitRule);
    }

    /**
     * 修改仓库通用提交规则
     *
     * 修改仓库通用提交规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRepositoryGeneralCommitRuleRequest 请求对象
     * @return SyncInvoker<UpdateRepositoryGeneralCommitRuleRequest, UpdateRepositoryGeneralCommitRuleResponse>
     */
    public SyncInvoker<UpdateRepositoryGeneralCommitRuleRequest, UpdateRepositoryGeneralCommitRuleResponse> updateRepositoryGeneralCommitRuleInvoker(
        UpdateRepositoryGeneralCommitRuleRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.updateRepositoryGeneralCommitRule, hcClient);
    }

    /**
     * 修改仓库通用策略
     *
     * 修改仓库通用策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRepositoryGeneralPolicyRequest 请求对象
     * @return UpdateRepositoryGeneralPolicyResponse
     */
    public UpdateRepositoryGeneralPolicyResponse updateRepositoryGeneralPolicy(
        UpdateRepositoryGeneralPolicyRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.updateRepositoryGeneralPolicy);
    }

    /**
     * 修改仓库通用策略
     *
     * 修改仓库通用策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRepositoryGeneralPolicyRequest 请求对象
     * @return SyncInvoker<UpdateRepositoryGeneralPolicyRequest, UpdateRepositoryGeneralPolicyResponse>
     */
    public SyncInvoker<UpdateRepositoryGeneralPolicyRequest, UpdateRepositoryGeneralPolicyResponse> updateRepositoryGeneralPolicyInvoker(
        UpdateRepositoryGeneralPolicyRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.updateRepositoryGeneralPolicy, hcClient);
    }

    /**
     * 修改仓库继承设置
     *
     * 修改仓库继承设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRepositoryInheritSettingRequest 请求对象
     * @return UpdateRepositoryInheritSettingResponse
     */
    public UpdateRepositoryInheritSettingResponse updateRepositoryInheritSetting(
        UpdateRepositoryInheritSettingRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.updateRepositoryInheritSetting);
    }

    /**
     * 修改仓库继承设置
     *
     * 修改仓库继承设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRepositoryInheritSettingRequest 请求对象
     * @return SyncInvoker<UpdateRepositoryInheritSettingRequest, UpdateRepositoryInheritSettingResponse>
     */
    public SyncInvoker<UpdateRepositoryInheritSettingRequest, UpdateRepositoryInheritSettingResponse> updateRepositoryInheritSettingInvoker(
        UpdateRepositoryInheritSettingRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.updateRepositoryInheritSetting, hcClient);
    }

    /**
     * 修改仓库标签
     *
     * 修改仓库标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRepositoryLabelRequest 请求对象
     * @return UpdateRepositoryLabelResponse
     */
    public UpdateRepositoryLabelResponse updateRepositoryLabel(UpdateRepositoryLabelRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.updateRepositoryLabel);
    }

    /**
     * 修改仓库标签
     *
     * 修改仓库标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRepositoryLabelRequest 请求对象
     * @return SyncInvoker<UpdateRepositoryLabelRequest, UpdateRepositoryLabelResponse>
     */
    public SyncInvoker<UpdateRepositoryLabelRequest, UpdateRepositoryLabelResponse> updateRepositoryLabelInvoker(
        UpdateRepositoryLabelRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.updateRepositoryLabel, hcClient);
    }

    /**
     * 更新仓库镜像信息
     *
     * 更新仓库镜像信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRepositoryRemoteMirrorRequest 请求对象
     * @return UpdateRepositoryRemoteMirrorResponse
     */
    public UpdateRepositoryRemoteMirrorResponse updateRepositoryRemoteMirror(
        UpdateRepositoryRemoteMirrorRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.updateRepositoryRemoteMirror);
    }

    /**
     * 更新仓库镜像信息
     *
     * 更新仓库镜像信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRepositoryRemoteMirrorRequest 请求对象
     * @return SyncInvoker<UpdateRepositoryRemoteMirrorRequest, UpdateRepositoryRemoteMirrorResponse>
     */
    public SyncInvoker<UpdateRepositoryRemoteMirrorRequest, UpdateRepositoryRemoteMirrorResponse> updateRepositoryRemoteMirrorInvoker(
        UpdateRepositoryRemoteMirrorRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.updateRepositoryRemoteMirror, hcClient);
    }

    /**
     * 更新仓库水印设置
     *
     * 更新仓库水印设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRepositoryWatermarkRequest 请求对象
     * @return UpdateRepositoryWatermarkResponse
     */
    public UpdateRepositoryWatermarkResponse updateRepositoryWatermark(UpdateRepositoryWatermarkRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.updateRepositoryWatermark);
    }

    /**
     * 更新仓库水印设置
     *
     * 更新仓库水印设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRepositoryWatermarkRequest 请求对象
     * @return SyncInvoker<UpdateRepositoryWatermarkRequest, UpdateRepositoryWatermarkResponse>
     */
    public SyncInvoker<UpdateRepositoryWatermarkRequest, UpdateRepositoryWatermarkResponse> updateRepositoryWatermarkInvoker(
        UpdateRepositoryWatermarkRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.updateRepositoryWatermark, hcClient);
    }

    /**
     * 修改仓库ip白名单
     *
     * 修改仓库ip白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTrustedIpAddressRequest 请求对象
     * @return UpdateTrustedIpAddressResponse
     */
    public UpdateTrustedIpAddressResponse updateTrustedIpAddress(UpdateTrustedIpAddressRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.updateTrustedIpAddress);
    }

    /**
     * 修改仓库ip白名单
     *
     * 修改仓库ip白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTrustedIpAddressRequest 请求对象
     * @return SyncInvoker<UpdateTrustedIpAddressRequest, UpdateTrustedIpAddressResponse>
     */
    public SyncInvoker<UpdateTrustedIpAddressRequest, UpdateTrustedIpAddressResponse> updateTrustedIpAddressInvoker(
        UpdateTrustedIpAddressRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.updateTrustedIpAddress, hcClient);
    }

    /**
     * 添加租户ip白名单
     *
     * 添加租户ip白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddTenantTrustedIpAddressRequest 请求对象
     * @return AddTenantTrustedIpAddressResponse
     */
    public AddTenantTrustedIpAddressResponse addTenantTrustedIpAddress(AddTenantTrustedIpAddressRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.addTenantTrustedIpAddress);
    }

    /**
     * 添加租户ip白名单
     *
     * 添加租户ip白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddTenantTrustedIpAddressRequest 请求对象
     * @return SyncInvoker<AddTenantTrustedIpAddressRequest, AddTenantTrustedIpAddressResponse>
     */
    public SyncInvoker<AddTenantTrustedIpAddressRequest, AddTenantTrustedIpAddressResponse> addTenantTrustedIpAddressInvoker(
        AddTenantTrustedIpAddressRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.addTenantTrustedIpAddress, hcClient);
    }

    /**
     * 删除租户ip白名单
     *
     * 删除租户ip白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTenantTrustedIpAddressRequest 请求对象
     * @return DeleteTenantTrustedIpAddressResponse
     */
    public DeleteTenantTrustedIpAddressResponse deleteTenantTrustedIpAddress(
        DeleteTenantTrustedIpAddressRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.deleteTenantTrustedIpAddress);
    }

    /**
     * 删除租户ip白名单
     *
     * 删除租户ip白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTenantTrustedIpAddressRequest 请求对象
     * @return SyncInvoker<DeleteTenantTrustedIpAddressRequest, DeleteTenantTrustedIpAddressResponse>
     */
    public SyncInvoker<DeleteTenantTrustedIpAddressRequest, DeleteTenantTrustedIpAddressResponse> deleteTenantTrustedIpAddressInvoker(
        DeleteTenantTrustedIpAddressRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.deleteTenantTrustedIpAddress, hcClient);
    }

    /**
     * 租户仓库列表
     *
     * 租户下所有占用资源的仓库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportTenantRepositoriesRequest 请求对象
     * @return ExportTenantRepositoriesResponse
     */
    public ExportTenantRepositoriesResponse exportTenantRepositories(ExportTenantRepositoriesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.exportTenantRepositories);
    }

    /**
     * 租户仓库列表
     *
     * 租户下所有占用资源的仓库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportTenantRepositoriesRequest 请求对象
     * @return SyncInvoker<ExportTenantRepositoriesRequest, ExportTenantRepositoriesResponse>
     */
    public SyncInvoker<ExportTenantRepositoriesRequest, ExportTenantRepositoriesResponse> exportTenantRepositoriesInvoker(
        ExportTenantRepositoriesRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.exportTenantRepositories, hcClient);
    }

    /**
     * 租户仓库列表
     *
     * 租户下所有占用资源的仓库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTenantRepositoriesRequest 请求对象
     * @return ListTenantRepositoriesResponse
     */
    public ListTenantRepositoriesResponse listTenantRepositories(ListTenantRepositoriesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listTenantRepositories);
    }

    /**
     * 租户仓库列表
     *
     * 租户下所有占用资源的仓库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTenantRepositoriesRequest 请求对象
     * @return SyncInvoker<ListTenantRepositoriesRequest, ListTenantRepositoriesResponse>
     */
    public SyncInvoker<ListTenantRepositoriesRequest, ListTenantRepositoriesResponse> listTenantRepositoriesInvoker(
        ListTenantRepositoriesRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listTenantRepositories, hcClient);
    }

    /**
     * 获取租户ip白名单
     *
     * 获取租户ip白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTenantTrustedIpAddressesRequest 请求对象
     * @return ListTenantTrustedIpAddressesResponse
     */
    public ListTenantTrustedIpAddressesResponse listTenantTrustedIpAddresses(
        ListTenantTrustedIpAddressesRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listTenantTrustedIpAddresses);
    }

    /**
     * 获取租户ip白名单
     *
     * 获取租户ip白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTenantTrustedIpAddressesRequest 请求对象
     * @return SyncInvoker<ListTenantTrustedIpAddressesRequest, ListTenantTrustedIpAddressesResponse>
     */
    public SyncInvoker<ListTenantTrustedIpAddressesRequest, ListTenantTrustedIpAddressesResponse> listTenantTrustedIpAddressesInvoker(
        ListTenantTrustedIpAddressesRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listTenantTrustedIpAddresses, hcClient);
    }

    /**
     * 修改租户ip白名单
     *
     * 修改租户ip白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTenantTrustedIpAddressRequest 请求对象
     * @return UpdateTenantTrustedIpAddressResponse
     */
    public UpdateTenantTrustedIpAddressResponse updateTenantTrustedIpAddress(
        UpdateTenantTrustedIpAddressRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.updateTenantTrustedIpAddress);
    }

    /**
     * 修改租户ip白名单
     *
     * 修改租户ip白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTenantTrustedIpAddressRequest 请求对象
     * @return SyncInvoker<UpdateTenantTrustedIpAddressRequest, UpdateTenantTrustedIpAddressResponse>
     */
    public SyncInvoker<UpdateTenantTrustedIpAddressRequest, UpdateTenantTrustedIpAddressResponse> updateTenantTrustedIpAddressInvoker(
        UpdateTenantTrustedIpAddressRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.updateTenantTrustedIpAddress, hcClient);
    }

    /**
     * 校验部署密钥在上层代码组或项目是否配置
     *
     * 校验部署密钥在上层代码组或项目是否配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckDeployKeyRequest 请求对象
     * @return CheckDeployKeyResponse
     */
    public CheckDeployKeyResponse checkDeployKey(CheckDeployKeyRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.checkDeployKey);
    }

    /**
     * 校验部署密钥在上层代码组或项目是否配置
     *
     * 校验部署密钥在上层代码组或项目是否配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckDeployKeyRequest 请求对象
     * @return SyncInvoker<CheckDeployKeyRequest, CheckDeployKeyResponse>
     */
    public SyncInvoker<CheckDeployKeyRequest, CheckDeployKeyResponse> checkDeployKeyInvoker(
        CheckDeployKeyRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.checkDeployKey, hcClient);
    }

    /**
     * 校验代码组部署密钥在上层代码组或项目是否配置
     *
     * 校验代码组部署密钥在上层代码组或项目是否配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckGroupDeployKeyRequest 请求对象
     * @return CheckGroupDeployKeyResponse
     */
    public CheckGroupDeployKeyResponse checkGroupDeployKey(CheckGroupDeployKeyRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.checkGroupDeployKey);
    }

    /**
     * 校验代码组部署密钥在上层代码组或项目是否配置
     *
     * 校验代码组部署密钥在上层代码组或项目是否配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckGroupDeployKeyRequest 请求对象
     * @return SyncInvoker<CheckGroupDeployKeyRequest, CheckGroupDeployKeyResponse>
     */
    public SyncInvoker<CheckGroupDeployKeyRequest, CheckGroupDeployKeyResponse> checkGroupDeployKeyInvoker(
        CheckGroupDeployKeyRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.checkGroupDeployKey, hcClient);
    }

    /**
     * 获取仓库下指定分支的关联工作项列表
     *
     * 获取仓库下指定分支的关联工作项列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBranchRelatedWorkItemsRequest 请求对象
     * @return ListBranchRelatedWorkItemsResponse
     */
    public ListBranchRelatedWorkItemsResponse listBranchRelatedWorkItems(ListBranchRelatedWorkItemsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listBranchRelatedWorkItems);
    }

    /**
     * 获取仓库下指定分支的关联工作项列表
     *
     * 获取仓库下指定分支的关联工作项列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBranchRelatedWorkItemsRequest 请求对象
     * @return SyncInvoker<ListBranchRelatedWorkItemsRequest, ListBranchRelatedWorkItemsResponse>
     */
    public SyncInvoker<ListBranchRelatedWorkItemsRequest, ListBranchRelatedWorkItemsResponse> listBranchRelatedWorkItemsInvoker(
        ListBranchRelatedWorkItemsRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listBranchRelatedWorkItems, hcClient);
    }

    /**
     * 获取代码组下部署密钥列表
     *
     * 获取代码组下部署密钥列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupDeployKeysRequest 请求对象
     * @return ListGroupDeployKeysResponse
     */
    public ListGroupDeployKeysResponse listGroupDeployKeys(ListGroupDeployKeysRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listGroupDeployKeys);
    }

    /**
     * 获取代码组下部署密钥列表
     *
     * 获取代码组下部署密钥列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupDeployKeysRequest 请求对象
     * @return SyncInvoker<ListGroupDeployKeysRequest, ListGroupDeployKeysResponse>
     */
    public SyncInvoker<ListGroupDeployKeysRequest, ListGroupDeployKeysResponse> listGroupDeployKeysInvoker(
        ListGroupDeployKeysRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listGroupDeployKeys, hcClient);
    }

    /**
     * 获取项目下部署密钥列表
     *
     * 获取项目下部署密钥列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectDeployKeysRequest 请求对象
     * @return ListProjectDeployKeysResponse
     */
    public ListProjectDeployKeysResponse listProjectDeployKeys(ListProjectDeployKeysRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listProjectDeployKeys);
    }

    /**
     * 获取项目下部署密钥列表
     *
     * 获取项目下部署密钥列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectDeployKeysRequest 请求对象
     * @return SyncInvoker<ListProjectDeployKeysRequest, ListProjectDeployKeysResponse>
     */
    public SyncInvoker<ListProjectDeployKeysRequest, ListProjectDeployKeysResponse> listProjectDeployKeysInvoker(
        ListProjectDeployKeysRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listProjectDeployKeys, hcClient);
    }

    /**
     * 获取仓库下部署密钥列表
     *
     * 获取仓库下部署密钥列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryDeployKeysRequest 请求对象
     * @return ListRepositoryDeployKeysResponse
     */
    public ListRepositoryDeployKeysResponse listRepositoryDeployKeys(ListRepositoryDeployKeysRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listRepositoryDeployKeys);
    }

    /**
     * 获取仓库下部署密钥列表
     *
     * 获取仓库下部署密钥列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryDeployKeysRequest 请求对象
     * @return SyncInvoker<ListRepositoryDeployKeysRequest, ListRepositoryDeployKeysResponse>
     */
    public SyncInvoker<ListRepositoryDeployKeysRequest, ListRepositoryDeployKeysResponse> listRepositoryDeployKeysInvoker(
        ListRepositoryDeployKeysRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listRepositoryDeployKeys, hcClient);
    }

    /**
     * 获取仓库下工作项列表
     *
     * 获取仓库下工作项列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryWorkItemsRequest 请求对象
     * @return ListRepositoryWorkItemsResponse
     */
    public ListRepositoryWorkItemsResponse listRepositoryWorkItems(ListRepositoryWorkItemsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listRepositoryWorkItems);
    }

    /**
     * 获取仓库下工作项列表
     *
     * 获取仓库下工作项列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryWorkItemsRequest 请求对象
     * @return SyncInvoker<ListRepositoryWorkItemsRequest, ListRepositoryWorkItemsResponse>
     */
    public SyncInvoker<ListRepositoryWorkItemsRequest, ListRepositoryWorkItemsResponse> listRepositoryWorkItemsInvoker(
        ListRepositoryWorkItemsRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listRepositoryWorkItems, hcClient);
    }

    /**
     * 获取代码组下E2E设置信息
     *
     * 获取代码组下E2E设置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGroupE2eSettingRequest 请求对象
     * @return ShowGroupE2eSettingResponse
     */
    public ShowGroupE2eSettingResponse showGroupE2eSetting(ShowGroupE2eSettingRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showGroupE2eSetting);
    }

    /**
     * 获取代码组下E2E设置信息
     *
     * 获取代码组下E2E设置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGroupE2eSettingRequest 请求对象
     * @return SyncInvoker<ShowGroupE2eSettingRequest, ShowGroupE2eSettingResponse>
     */
    public SyncInvoker<ShowGroupE2eSettingRequest, ShowGroupE2eSettingResponse> showGroupE2eSettingInvoker(
        ShowGroupE2eSettingRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.showGroupE2eSetting, hcClient);
    }

    /**
     * 获取项目下E2E设置信息
     *
     * 获取项目下E2E设置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectE2eSettingRequest 请求对象
     * @return ShowProjectE2eSettingResponse
     */
    public ShowProjectE2eSettingResponse showProjectE2eSetting(ShowProjectE2eSettingRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showProjectE2eSetting);
    }

    /**
     * 获取项目下E2E设置信息
     *
     * 获取项目下E2E设置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectE2eSettingRequest 请求对象
     * @return SyncInvoker<ShowProjectE2eSettingRequest, ShowProjectE2eSettingResponse>
     */
    public SyncInvoker<ShowProjectE2eSettingRequest, ShowProjectE2eSettingResponse> showProjectE2eSettingInvoker(
        ShowProjectE2eSettingRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.showProjectE2eSetting, hcClient);
    }

    /**
     * 获取仓库下E2E设置信息
     *
     * 获取仓库下E2E设置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryE2eSettingRequest 请求对象
     * @return ShowRepositoryE2eSettingResponse
     */
    public ShowRepositoryE2eSettingResponse showRepositoryE2eSetting(ShowRepositoryE2eSettingRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showRepositoryE2eSetting);
    }

    /**
     * 获取仓库下E2E设置信息
     *
     * 获取仓库下E2E设置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryE2eSettingRequest 请求对象
     * @return SyncInvoker<ShowRepositoryE2eSettingRequest, ShowRepositoryE2eSettingResponse>
     */
    public SyncInvoker<ShowRepositoryE2eSettingRequest, ShowRepositoryE2eSettingResponse> showRepositoryE2eSettingInvoker(
        ShowRepositoryE2eSettingRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.showRepositoryE2eSetting, hcClient);
    }

    /**
     * 添加ssh公钥
     *
     * 添加ssh公钥
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddSshKeyRequest 请求对象
     * @return AddSshKeyResponse
     */
    public AddSshKeyResponse addSshKey(AddSshKeyRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.addSshKey);
    }

    /**
     * 添加ssh公钥
     *
     * 添加ssh公钥
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddSshKeyRequest 请求对象
     * @return SyncInvoker<AddSshKeyRequest, AddSshKeyResponse>
     */
    public SyncInvoker<AddSshKeyRequest, AddSshKeyResponse> addSshKeyInvoker(AddSshKeyRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.addSshKey, hcClient);
    }

    /**
     * 获取当前用户指定的代码组列表中的权限
     *
     * 获取当前用户指定的代码组列表中的权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchValidateUserGroupPermissionsRequest 请求对象
     * @return BatchValidateUserGroupPermissionsResponse
     */
    public BatchValidateUserGroupPermissionsResponse batchValidateUserGroupPermissions(
        BatchValidateUserGroupPermissionsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.batchValidateUserGroupPermissions);
    }

    /**
     * 获取当前用户指定的代码组列表中的权限
     *
     * 获取当前用户指定的代码组列表中的权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchValidateUserGroupPermissionsRequest 请求对象
     * @return SyncInvoker<BatchValidateUserGroupPermissionsRequest, BatchValidateUserGroupPermissionsResponse>
     */
    public SyncInvoker<BatchValidateUserGroupPermissionsRequest, BatchValidateUserGroupPermissionsResponse> batchValidateUserGroupPermissionsInvoker(
        BatchValidateUserGroupPermissionsRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.batchValidateUserGroupPermissions, hcClient);
    }

    /**
     * 删除ssh公钥
     *
     * 删除ssh公钥
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSshKeyRequest 请求对象
     * @return DeleteSshKeyResponse
     */
    public DeleteSshKeyResponse deleteSshKey(DeleteSshKeyRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.deleteSshKey);
    }

    /**
     * 删除ssh公钥
     *
     * 删除ssh公钥
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSshKeyRequest 请求对象
     * @return SyncInvoker<DeleteSshKeyRequest, DeleteSshKeyResponse>
     */
    public SyncInvoker<DeleteSshKeyRequest, DeleteSshKeyResponse> deleteSshKeyInvoker(DeleteSshKeyRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.deleteSshKey, hcClient);
    }

    /**
     * 获取用户的个人访问令牌
     *
     * 获取用户的个人访问令牌
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImpersonationTokensRequest 请求对象
     * @return ListImpersonationTokensResponse
     */
    public ListImpersonationTokensResponse listImpersonationTokens(ListImpersonationTokensRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listImpersonationTokens);
    }

    /**
     * 获取用户的个人访问令牌
     *
     * 获取用户的个人访问令牌
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImpersonationTokensRequest 请求对象
     * @return SyncInvoker<ListImpersonationTokensRequest, ListImpersonationTokensResponse>
     */
    public SyncInvoker<ListImpersonationTokensRequest, ListImpersonationTokensResponse> listImpersonationTokensInvoker(
        ListImpersonationTokensRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listImpersonationTokens, hcClient);
    }

    /**
     * 获取当前用户的gpg_key列表
     *
     * 获取当前用户的gpg_key列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserGpgKeysRequest 请求对象
     * @return ListUserGpgKeysResponse
     */
    public ListUserGpgKeysResponse listUserGpgKeys(ListUserGpgKeysRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listUserGpgKeys);
    }

    /**
     * 获取当前用户的gpg_key列表
     *
     * 获取当前用户的gpg_key列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserGpgKeysRequest 请求对象
     * @return SyncInvoker<ListUserGpgKeysRequest, ListUserGpgKeysResponse>
     */
    public SyncInvoker<ListUserGpgKeysRequest, ListUserGpgKeysResponse> listUserGpgKeysInvoker(
        ListUserGpgKeysRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listUserGpgKeys, hcClient);
    }

    /**
     * 获取当前用户的密钥列表
     *
     * 获取当前用户的密钥列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserKeysRequest 请求对象
     * @return ListUserKeysResponse
     */
    public ListUserKeysResponse listUserKeys(ListUserKeysRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listUserKeys);
    }

    /**
     * 获取当前用户的密钥列表
     *
     * 获取当前用户的密钥列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserKeysRequest 请求对象
     * @return SyncInvoker<ListUserKeysRequest, ListUserKeysResponse>
     */
    public SyncInvoker<ListUserKeysRequest, ListUserKeysResponse> listUserKeysInvoker(ListUserKeysRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listUserKeys, hcClient);
    }

    /**
     * 发送邮箱验证码
     *
     * 发送邮箱验证码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SendUserEmailVerifyCodeRequest 请求对象
     * @return SendUserEmailVerifyCodeResponse
     */
    public SendUserEmailVerifyCodeResponse sendUserEmailVerifyCode(SendUserEmailVerifyCodeRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.sendUserEmailVerifyCode);
    }

    /**
     * 发送邮箱验证码
     *
     * 发送邮箱验证码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SendUserEmailVerifyCodeRequest 请求对象
     * @return SyncInvoker<SendUserEmailVerifyCodeRequest, SendUserEmailVerifyCodeResponse>
     */
    public SyncInvoker<SendUserEmailVerifyCodeRequest, SendUserEmailVerifyCodeResponse> sendUserEmailVerifyCodeInvoker(
        SendUserEmailVerifyCodeRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.sendUserEmailVerifyCode, hcClient);
    }

    /**
     * 获取https的验证方式
     *
     * 获取https的验证方式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpsPasswordSettingRequest 请求对象
     * @return ShowHttpsPasswordSettingResponse
     */
    public ShowHttpsPasswordSettingResponse showHttpsPasswordSetting(ShowHttpsPasswordSettingRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showHttpsPasswordSetting);
    }

    /**
     * 获取https的验证方式
     *
     * 获取https的验证方式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpsPasswordSettingRequest 请求对象
     * @return SyncInvoker<ShowHttpsPasswordSettingRequest, ShowHttpsPasswordSettingResponse>
     */
    public SyncInvoker<ShowHttpsPasswordSettingRequest, ShowHttpsPasswordSettingResponse> showHttpsPasswordSettingInvoker(
        ShowHttpsPasswordSettingRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.showHttpsPasswordSetting, hcClient);
    }

    /**
     * 获取用户相关邮箱信息
     *
     * 获取用户相关邮箱信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserEmailsRequest 请求对象
     * @return ShowUserEmailsResponse
     */
    public ShowUserEmailsResponse showUserEmails(ShowUserEmailsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showUserEmails);
    }

    /**
     * 获取用户相关邮箱信息
     *
     * 获取用户相关邮箱信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserEmailsRequest 请求对象
     * @return SyncInvoker<ShowUserEmailsRequest, ShowUserEmailsResponse>
     */
    public SyncInvoker<ShowUserEmailsRequest, ShowUserEmailsResponse> showUserEmailsInvoker(
        ShowUserEmailsRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.showUserEmails, hcClient);
    }

    /**
     * 修改https的验证方式
     *
     * 修改https的验证方式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHttpsPasswordSettingRequest 请求对象
     * @return UpdateHttpsPasswordSettingResponse
     */
    public UpdateHttpsPasswordSettingResponse updateHttpsPasswordSetting(UpdateHttpsPasswordSettingRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.updateHttpsPasswordSetting);
    }

    /**
     * 修改https的验证方式
     *
     * 修改https的验证方式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHttpsPasswordSettingRequest 请求对象
     * @return SyncInvoker<UpdateHttpsPasswordSettingRequest, UpdateHttpsPasswordSettingResponse>
     */
    public SyncInvoker<UpdateHttpsPasswordSettingRequest, UpdateHttpsPasswordSettingResponse> updateHttpsPasswordSettingInvoker(
        UpdateHttpsPasswordSettingRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.updateHttpsPasswordSetting, hcClient);
    }

    /**
     * 更新邮箱
     *
     * 更新邮箱
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUserEmailsRequest 请求对象
     * @return UpdateUserEmailsResponse
     */
    public UpdateUserEmailsResponse updateUserEmails(UpdateUserEmailsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.updateUserEmails);
    }

    /**
     * 更新邮箱
     *
     * 更新邮箱
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUserEmailsRequest 请求对象
     * @return SyncInvoker<UpdateUserEmailsRequest, UpdateUserEmailsResponse>
     */
    public SyncInvoker<UpdateUserEmailsRequest, UpdateUserEmailsResponse> updateUserEmailsInvoker(
        UpdateUserEmailsRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.updateUserEmails, hcClient);
    }

    /**
     * 添加代码组下Webhook
     *
     * 添加代码组下Webhook
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddGroupWebhookRequest 请求对象
     * @return AddGroupWebhookResponse
     */
    public AddGroupWebhookResponse addGroupWebhook(AddGroupWebhookRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.addGroupWebhook);
    }

    /**
     * 添加代码组下Webhook
     *
     * 添加代码组下Webhook
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddGroupWebhookRequest 请求对象
     * @return SyncInvoker<AddGroupWebhookRequest, AddGroupWebhookResponse>
     */
    public SyncInvoker<AddGroupWebhookRequest, AddGroupWebhookResponse> addGroupWebhookInvoker(
        AddGroupWebhookRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.addGroupWebhook, hcClient);
    }

    /**
     * 添加项目下Webhook
     *
     * 添加项目下Webhook
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddProjectWebhookRequest 请求对象
     * @return AddProjectWebhookResponse
     */
    public AddProjectWebhookResponse addProjectWebhook(AddProjectWebhookRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.addProjectWebhook);
    }

    /**
     * 添加项目下Webhook
     *
     * 添加项目下Webhook
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddProjectWebhookRequest 请求对象
     * @return SyncInvoker<AddProjectWebhookRequest, AddProjectWebhookResponse>
     */
    public SyncInvoker<AddProjectWebhookRequest, AddProjectWebhookResponse> addProjectWebhookInvoker(
        AddProjectWebhookRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.addProjectWebhook, hcClient);
    }

    /**
     * 添加仓库下Webhook
     *
     * 添加仓库下Webhook
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddRepositoryWebhookRequest 请求对象
     * @return AddRepositoryWebhookResponse
     */
    public AddRepositoryWebhookResponse addRepositoryWebhook(AddRepositoryWebhookRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.addRepositoryWebhook);
    }

    /**
     * 添加仓库下Webhook
     *
     * 添加仓库下Webhook
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddRepositoryWebhookRequest 请求对象
     * @return SyncInvoker<AddRepositoryWebhookRequest, AddRepositoryWebhookResponse>
     */
    public SyncInvoker<AddRepositoryWebhookRequest, AddRepositoryWebhookResponse> addRepositoryWebhookInvoker(
        AddRepositoryWebhookRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.addRepositoryWebhook, hcClient);
    }

    /**
     * 获取代码组下指定Webhook的日志列表
     *
     * 获取代码组下指定Webhook的日志列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupWebhookLogsRequest 请求对象
     * @return ListGroupWebhookLogsResponse
     */
    public ListGroupWebhookLogsResponse listGroupWebhookLogs(ListGroupWebhookLogsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listGroupWebhookLogs);
    }

    /**
     * 获取代码组下指定Webhook的日志列表
     *
     * 获取代码组下指定Webhook的日志列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupWebhookLogsRequest 请求对象
     * @return SyncInvoker<ListGroupWebhookLogsRequest, ListGroupWebhookLogsResponse>
     */
    public SyncInvoker<ListGroupWebhookLogsRequest, ListGroupWebhookLogsResponse> listGroupWebhookLogsInvoker(
        ListGroupWebhookLogsRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listGroupWebhookLogs, hcClient);
    }

    /**
     * 获取代码组下Webhook列表
     *
     * 获取代码组下Webhook列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupWebhooksRequest 请求对象
     * @return ListGroupWebhooksResponse
     */
    public ListGroupWebhooksResponse listGroupWebhooks(ListGroupWebhooksRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listGroupWebhooks);
    }

    /**
     * 获取代码组下Webhook列表
     *
     * 获取代码组下Webhook列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupWebhooksRequest 请求对象
     * @return SyncInvoker<ListGroupWebhooksRequest, ListGroupWebhooksResponse>
     */
    public SyncInvoker<ListGroupWebhooksRequest, ListGroupWebhooksResponse> listGroupWebhooksInvoker(
        ListGroupWebhooksRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listGroupWebhooks, hcClient);
    }

    /**
     * 获取项目下指定Webhook的日志列表
     *
     * 获取项目下指定Webhook的日志列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectWebhookLogsRequest 请求对象
     * @return ListProjectWebhookLogsResponse
     */
    public ListProjectWebhookLogsResponse listProjectWebhookLogs(ListProjectWebhookLogsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listProjectWebhookLogs);
    }

    /**
     * 获取项目下指定Webhook的日志列表
     *
     * 获取项目下指定Webhook的日志列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectWebhookLogsRequest 请求对象
     * @return SyncInvoker<ListProjectWebhookLogsRequest, ListProjectWebhookLogsResponse>
     */
    public SyncInvoker<ListProjectWebhookLogsRequest, ListProjectWebhookLogsResponse> listProjectWebhookLogsInvoker(
        ListProjectWebhookLogsRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listProjectWebhookLogs, hcClient);
    }

    /**
     * 获取项目下Webhook列表
     *
     * 获取项目下Webhook列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectWebhooksRequest 请求对象
     * @return ListProjectWebhooksResponse
     */
    public ListProjectWebhooksResponse listProjectWebhooks(ListProjectWebhooksRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listProjectWebhooks);
    }

    /**
     * 获取项目下Webhook列表
     *
     * 获取项目下Webhook列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectWebhooksRequest 请求对象
     * @return SyncInvoker<ListProjectWebhooksRequest, ListProjectWebhooksResponse>
     */
    public SyncInvoker<ListProjectWebhooksRequest, ListProjectWebhooksResponse> listProjectWebhooksInvoker(
        ListProjectWebhooksRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listProjectWebhooks, hcClient);
    }

    /**
     * 获取仓库下指定Webhook的日志列表
     *
     * 获取仓库下指定Webhook的日志列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryWebhookLogsRequest 请求对象
     * @return ListRepositoryWebhookLogsResponse
     */
    public ListRepositoryWebhookLogsResponse listRepositoryWebhookLogs(ListRepositoryWebhookLogsRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listRepositoryWebhookLogs);
    }

    /**
     * 获取仓库下指定Webhook的日志列表
     *
     * 获取仓库下指定Webhook的日志列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryWebhookLogsRequest 请求对象
     * @return SyncInvoker<ListRepositoryWebhookLogsRequest, ListRepositoryWebhookLogsResponse>
     */
    public SyncInvoker<ListRepositoryWebhookLogsRequest, ListRepositoryWebhookLogsResponse> listRepositoryWebhookLogsInvoker(
        ListRepositoryWebhookLogsRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listRepositoryWebhookLogs, hcClient);
    }

    /**
     * 获取仓库下Webhook列表
     *
     * 获取仓库下Webhook列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryWebhooksRequest 请求对象
     * @return ListRepositoryWebhooksResponse
     */
    public ListRepositoryWebhooksResponse listRepositoryWebhooks(ListRepositoryWebhooksRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.listRepositoryWebhooks);
    }

    /**
     * 获取仓库下Webhook列表
     *
     * 获取仓库下Webhook列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryWebhooksRequest 请求对象
     * @return SyncInvoker<ListRepositoryWebhooksRequest, ListRepositoryWebhooksResponse>
     */
    public SyncInvoker<ListRepositoryWebhooksRequest, ListRepositoryWebhooksResponse> listRepositoryWebhooksInvoker(
        ListRepositoryWebhooksRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.listRepositoryWebhooks, hcClient);
    }

    /**
     * 删除代码组下单个Webhook
     *
     * 删除代码组下单个Webhook
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveGroupWebhookRequest 请求对象
     * @return RemoveGroupWebhookResponse
     */
    public RemoveGroupWebhookResponse removeGroupWebhook(RemoveGroupWebhookRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.removeGroupWebhook);
    }

    /**
     * 删除代码组下单个Webhook
     *
     * 删除代码组下单个Webhook
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveGroupWebhookRequest 请求对象
     * @return SyncInvoker<RemoveGroupWebhookRequest, RemoveGroupWebhookResponse>
     */
    public SyncInvoker<RemoveGroupWebhookRequest, RemoveGroupWebhookResponse> removeGroupWebhookInvoker(
        RemoveGroupWebhookRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.removeGroupWebhook, hcClient);
    }

    /**
     * 删除项目下单个Webhook
     *
     * 删除项目下单个Webhook
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveProjectWebhookRequest 请求对象
     * @return RemoveProjectWebhookResponse
     */
    public RemoveProjectWebhookResponse removeProjectWebhook(RemoveProjectWebhookRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.removeProjectWebhook);
    }

    /**
     * 删除项目下单个Webhook
     *
     * 删除项目下单个Webhook
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveProjectWebhookRequest 请求对象
     * @return SyncInvoker<RemoveProjectWebhookRequest, RemoveProjectWebhookResponse>
     */
    public SyncInvoker<RemoveProjectWebhookRequest, RemoveProjectWebhookResponse> removeProjectWebhookInvoker(
        RemoveProjectWebhookRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.removeProjectWebhook, hcClient);
    }

    /**
     * 删除仓库下单个Webhook
     *
     * 删除仓库下单个Webhook
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveRepositoryWebhookRequest 请求对象
     * @return RemoveRepositoryWebhookResponse
     */
    public RemoveRepositoryWebhookResponse removeRepositoryWebhook(RemoveRepositoryWebhookRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.removeRepositoryWebhook);
    }

    /**
     * 删除仓库下单个Webhook
     *
     * 删除仓库下单个Webhook
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveRepositoryWebhookRequest 请求对象
     * @return SyncInvoker<RemoveRepositoryWebhookRequest, RemoveRepositoryWebhookResponse>
     */
    public SyncInvoker<RemoveRepositoryWebhookRequest, RemoveRepositoryWebhookResponse> removeRepositoryWebhookInvoker(
        RemoveRepositoryWebhookRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.removeRepositoryWebhook, hcClient);
    }

    /**
     * 获取代码组下单个Webhook数据
     *
     * 获取代码组下单个Webhook数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGroupWebhookRequest 请求对象
     * @return ShowGroupWebhookResponse
     */
    public ShowGroupWebhookResponse showGroupWebhook(ShowGroupWebhookRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showGroupWebhook);
    }

    /**
     * 获取代码组下单个Webhook数据
     *
     * 获取代码组下单个Webhook数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGroupWebhookRequest 请求对象
     * @return SyncInvoker<ShowGroupWebhookRequest, ShowGroupWebhookResponse>
     */
    public SyncInvoker<ShowGroupWebhookRequest, ShowGroupWebhookResponse> showGroupWebhookInvoker(
        ShowGroupWebhookRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.showGroupWebhook, hcClient);
    }

    /**
     * 获取代码组下指定Webhook的指定日志详情
     *
     * 获取代码组下指定Webhook的指定日志详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGroupWebhookLogRequest 请求对象
     * @return ShowGroupWebhookLogResponse
     */
    public ShowGroupWebhookLogResponse showGroupWebhookLog(ShowGroupWebhookLogRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showGroupWebhookLog);
    }

    /**
     * 获取代码组下指定Webhook的指定日志详情
     *
     * 获取代码组下指定Webhook的指定日志详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGroupWebhookLogRequest 请求对象
     * @return SyncInvoker<ShowGroupWebhookLogRequest, ShowGroupWebhookLogResponse>
     */
    public SyncInvoker<ShowGroupWebhookLogRequest, ShowGroupWebhookLogResponse> showGroupWebhookLogInvoker(
        ShowGroupWebhookLogRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.showGroupWebhookLog, hcClient);
    }

    /**
     * 获取项目下单个Webhook数据
     *
     * 获取项目下单个Webhook数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectWebhookRequest 请求对象
     * @return ShowProjectWebhookResponse
     */
    public ShowProjectWebhookResponse showProjectWebhook(ShowProjectWebhookRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showProjectWebhook);
    }

    /**
     * 获取项目下单个Webhook数据
     *
     * 获取项目下单个Webhook数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectWebhookRequest 请求对象
     * @return SyncInvoker<ShowProjectWebhookRequest, ShowProjectWebhookResponse>
     */
    public SyncInvoker<ShowProjectWebhookRequest, ShowProjectWebhookResponse> showProjectWebhookInvoker(
        ShowProjectWebhookRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.showProjectWebhook, hcClient);
    }

    /**
     * 获取项目下指定Webhook的指定日志详情
     *
     * 获取项目下指定Webhook的指定日志详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectWebhookLogRequest 请求对象
     * @return ShowProjectWebhookLogResponse
     */
    public ShowProjectWebhookLogResponse showProjectWebhookLog(ShowProjectWebhookLogRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showProjectWebhookLog);
    }

    /**
     * 获取项目下指定Webhook的指定日志详情
     *
     * 获取项目下指定Webhook的指定日志详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectWebhookLogRequest 请求对象
     * @return SyncInvoker<ShowProjectWebhookLogRequest, ShowProjectWebhookLogResponse>
     */
    public SyncInvoker<ShowProjectWebhookLogRequest, ShowProjectWebhookLogResponse> showProjectWebhookLogInvoker(
        ShowProjectWebhookLogRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.showProjectWebhookLog, hcClient);
    }

    /**
     * 获取仓库下单个Webhook数据
     *
     * 获取仓库下单个Webhook数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryWebhookRequest 请求对象
     * @return ShowRepositoryWebhookResponse
     */
    public ShowRepositoryWebhookResponse showRepositoryWebhook(ShowRepositoryWebhookRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showRepositoryWebhook);
    }

    /**
     * 获取仓库下单个Webhook数据
     *
     * 获取仓库下单个Webhook数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryWebhookRequest 请求对象
     * @return SyncInvoker<ShowRepositoryWebhookRequest, ShowRepositoryWebhookResponse>
     */
    public SyncInvoker<ShowRepositoryWebhookRequest, ShowRepositoryWebhookResponse> showRepositoryWebhookInvoker(
        ShowRepositoryWebhookRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.showRepositoryWebhook, hcClient);
    }

    /**
     * 获取仓库下指定Webhook的指定日志详情
     *
     * 获取仓库下指定Webhook的指定日志详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryWebhookLogRequest 请求对象
     * @return ShowRepositoryWebhookLogResponse
     */
    public ShowRepositoryWebhookLogResponse showRepositoryWebhookLog(ShowRepositoryWebhookLogRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.showRepositoryWebhookLog);
    }

    /**
     * 获取仓库下指定Webhook的指定日志详情
     *
     * 获取仓库下指定Webhook的指定日志详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryWebhookLogRequest 请求对象
     * @return SyncInvoker<ShowRepositoryWebhookLogRequest, ShowRepositoryWebhookLogResponse>
     */
    public SyncInvoker<ShowRepositoryWebhookLogRequest, ShowRepositoryWebhookLogResponse> showRepositoryWebhookLogInvoker(
        ShowRepositoryWebhookLogRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.showRepositoryWebhookLog, hcClient);
    }

    /**
     * 更新代码组下单个Webhook数据
     *
     * 更新代码组下单个Webhook数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGroupWebhookRequest 请求对象
     * @return UpdateGroupWebhookResponse
     */
    public UpdateGroupWebhookResponse updateGroupWebhook(UpdateGroupWebhookRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.updateGroupWebhook);
    }

    /**
     * 更新代码组下单个Webhook数据
     *
     * 更新代码组下单个Webhook数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGroupWebhookRequest 请求对象
     * @return SyncInvoker<UpdateGroupWebhookRequest, UpdateGroupWebhookResponse>
     */
    public SyncInvoker<UpdateGroupWebhookRequest, UpdateGroupWebhookResponse> updateGroupWebhookInvoker(
        UpdateGroupWebhookRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.updateGroupWebhook, hcClient);
    }

    /**
     * 更新项目下单个Webhook数据
     *
     * 更新项目下单个Webhook数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProjectWebhookRequest 请求对象
     * @return UpdateProjectWebhookResponse
     */
    public UpdateProjectWebhookResponse updateProjectWebhook(UpdateProjectWebhookRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.updateProjectWebhook);
    }

    /**
     * 更新项目下单个Webhook数据
     *
     * 更新项目下单个Webhook数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProjectWebhookRequest 请求对象
     * @return SyncInvoker<UpdateProjectWebhookRequest, UpdateProjectWebhookResponse>
     */
    public SyncInvoker<UpdateProjectWebhookRequest, UpdateProjectWebhookResponse> updateProjectWebhookInvoker(
        UpdateProjectWebhookRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.updateProjectWebhook, hcClient);
    }

    /**
     * 更新仓库下单个Webhook数据
     *
     * 更新仓库下单个Webhook数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRepositoryWebhookRequest 请求对象
     * @return UpdateRepositoryWebhookResponse
     */
    public UpdateRepositoryWebhookResponse updateRepositoryWebhook(UpdateRepositoryWebhookRequest request) {
        return hcClient.syncInvokeHttp(request, CodeHubMeta.updateRepositoryWebhook);
    }

    /**
     * 更新仓库下单个Webhook数据
     *
     * 更新仓库下单个Webhook数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRepositoryWebhookRequest 请求对象
     * @return SyncInvoker<UpdateRepositoryWebhookRequest, UpdateRepositoryWebhookResponse>
     */
    public SyncInvoker<UpdateRepositoryWebhookRequest, UpdateRepositoryWebhookResponse> updateRepositoryWebhookInvoker(
        UpdateRepositoryWebhookRequest request) {
        return new SyncInvoker<>(request, CodeHubMeta.updateRepositoryWebhook, hcClient);
    }

}
