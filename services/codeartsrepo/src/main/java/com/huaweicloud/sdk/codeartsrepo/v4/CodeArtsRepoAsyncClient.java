package com.huaweicloud.sdk.codeartsrepo.v4;

import com.huaweicloud.sdk.codeartsrepo.v4.model.AddGroupWebhookRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.AddGroupWebhookResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.AddProjectWebhookRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.AddProjectWebhookResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.AddRepositoryMembersRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.AddRepositoryMembersResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.AddRepositoryWebhookRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.AddRepositoryWebhookResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.AddSshKeyRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.AddSshKeyResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.AddSubmoduleRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.AddSubmoduleResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.AddTenantTrustedIpAddressRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.AddTenantTrustedIpAddressResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.AddTrustedIpAddressRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.AddTrustedIpAddressResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ApprovalMergeRequestRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ApprovalMergeRequestResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.AssociateGroupUserGroupRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.AssociateGroupUserGroupResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.AssociateRemoteMirrorRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.AssociateRemoteMirrorResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.AssociateRepositoryUserGroupRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.AssociateRepositoryUserGroupResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.BatchCreateProtectedBranchRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.BatchCreateProtectedBranchResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.BatchCreateProtectedTagsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.BatchCreateProtectedTagsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.BatchDeleteBranchRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.BatchDeleteBranchResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.BatchDeleteProtectedBranchesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.BatchDeleteProtectedBranchesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.BatchDeleteProtectedTagsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.BatchDeleteProtectedTagsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.BatchDeleteRepositoryFilePushPermissionsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.BatchDeleteRepositoryFilePushPermissionsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.BatchUpdateProtectedBranchesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.BatchUpdateProtectedBranchesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.BatchUpdateProtectedTagsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.BatchUpdateProtectedTagsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.BatchUpdateRepositoryFilePushPermissionsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.BatchUpdateRepositoryFilePushPermissionsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.BatchValidateRepoNamesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.BatchValidateRepoNamesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.BatchValidateUserGroupPermissionsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.BatchValidateUserGroupPermissionsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CheckDeployKeyRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CheckDeployKeyResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CheckGroupDeployKeyRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CheckGroupDeployKeyResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateBranchRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateBranchResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateCherryPickMergeRequestRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateCherryPickMergeRequestResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateCommitRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateCommitResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateCommitRevertRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateCommitRevertResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateDirRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateDirResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateFilePushPermissionRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateFilePushPermissionResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateFileRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateFileResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateGroupMergeRequestApproverSettingRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateGroupMergeRequestApproverSettingResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateGroupMergeRequestTemplateRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateGroupMergeRequestTemplateResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateGroupRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateGroupResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateMergeRequestApproverSettingRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateMergeRequestApproverSettingResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateMergeRequestDiscussionRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateMergeRequestDiscussionResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateMergeRequestDiscussionResponseRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateMergeRequestDiscussionResponseResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateMergeRequestRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateMergeRequestResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateMergeRequestTemplateRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateMergeRequestTemplateResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateProjectMergeRequestApproverSettingRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateProjectMergeRequestApproverSettingResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateProjectMergeRequestTemplateRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateProjectMergeRequestTemplateResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateProjectProtectedBranchesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateProjectProtectedBranchesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateProjectProtectedTagsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateProjectProtectedTagsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateRepositoryCommitRuleRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateRepositoryCommitRuleResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateRepositoryLabelRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateRepositoryLabelResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateRepositorySystemLabelsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateRepositorySystemLabelsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateReviewSettingRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateReviewSettingResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateTagRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.CreateTagResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DeleteBranchRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DeleteBranchResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DeleteFileRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DeleteFileResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DeleteGroupMergeRequestApproverSettingRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DeleteGroupMergeRequestApproverSettingResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DeleteGroupMergeRequestTemplateRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DeleteGroupMergeRequestTemplateResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DeleteGroupRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DeleteGroupResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DeleteMergeRequestApproverSettingRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DeleteMergeRequestApproverSettingResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DeleteMergeRequestDiscussionRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DeleteMergeRequestDiscussionResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DeleteMergeRequestTemplateRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DeleteMergeRequestTemplateResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DeleteMergeRequestVoteRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DeleteMergeRequestVoteResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DeleteProjectMergeRequestApproverSettingRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DeleteProjectMergeRequestApproverSettingResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DeleteProjectMergeRequestTemplateRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DeleteProjectMergeRequestTemplateResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DeleteProtectedBranchRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DeleteProtectedBranchResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DeleteProtectedTagRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DeleteProtectedTagResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DeleteRepositoryLabelRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DeleteRepositoryLabelResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DeleteSshKeyRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DeleteSshKeyResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DeleteTagRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DeleteTagResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DeleteTenantTrustedIpAddressRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DeleteTenantTrustedIpAddressResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DeleteTrustedIpAddressRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DeleteTrustedIpAddressResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DownloadArchiveRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DownloadArchiveResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DownloadBlobsRawRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.DownloadBlobsRawResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ExecuteRepositoryStatisticsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ExecuteRepositoryStatisticsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ExportTenantRepositoriesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ExportTenantRepositoriesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ImportMergeRequestRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ImportMergeRequestResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListBranchRelatedWorkItemsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListBranchRelatedWorkItemsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListBranchesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListBranchesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListCommitAssociatedMergeRequestsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListCommitAssociatedMergeRequestsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListCommitAssociatedRefsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListCommitAssociatedRefsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListCommitDiscussionsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListCommitDiscussionsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListCommitsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListCommitsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListCurrentUserRepositoriesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListCurrentUserRepositoriesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListDefaultReviewCategoriesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListDefaultReviewCategoriesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListDiscussionTemplatesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListDiscussionTemplatesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListFileBlameLinesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListFileBlameLinesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListFileUpperTreeEntriesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListFileUpperTreeEntriesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListFilesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListFilesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListGroupAddableMembersRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListGroupAddableMembersResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListGroupAddableUserGroupsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListGroupAddableUserGroupsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListGroupDeployKeysRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListGroupDeployKeysResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListGroupMembersRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListGroupMembersResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListGroupMergeRequestApproverSettingsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListGroupMergeRequestApproverSettingsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListGroupMergeRequestCanBeAssignedReviewersRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListGroupMergeRequestCanBeAssignedReviewersResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListGroupMergeRequestTemplatesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListGroupMergeRequestTemplatesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListGroupMergeRequestValidAssignedCandidatesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListGroupMergeRequestValidAssignedCandidatesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListGroupPermissionResourcesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListGroupPermissionResourcesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListGroupProtectedRefsUserGroupsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListGroupProtectedRefsUserGroupsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListGroupRepositoriesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListGroupRepositoriesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListGroupSubgroupsAndRepositoriesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListGroupSubgroupsAndRepositoriesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListGroupUserGroupsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListGroupUserGroupsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListGroupWebhookLogsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListGroupWebhookLogsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListGroupWebhooksRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListGroupWebhooksResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListGroupsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListGroupsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListImpersonationTokensRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListImpersonationTokensResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListItemCommitsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListItemCommitsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListLatestPipelineJobsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListLatestPipelineJobsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListLogsTreeRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListLogsTreeResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListManageableGroupsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListManageableGroupsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListMembersRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListMembersResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListMergeRequestApproverSettingsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListMergeRequestApproverSettingsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListMergeRequestApproversRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListMergeRequestApproversResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListMergeRequestChangesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListMergeRequestChangesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListMergeRequestChangesTreesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListMergeRequestChangesTreesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListMergeRequestCommitsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListMergeRequestCommitsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListMergeRequestConflictFilesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListMergeRequestConflictFilesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListMergeRequestDiscussionsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListMergeRequestDiscussionsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListMergeRequestEvaluationsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListMergeRequestEvaluationsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListMergeRequestParticipantsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListMergeRequestParticipantsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListMergeRequestReviewersRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListMergeRequestReviewersResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListMergeRequestSystemNotesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListMergeRequestSystemNotesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListMergeRequestTemplatesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListMergeRequestTemplatesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListMergeRequestValidAssignedCandidatesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListMergeRequestValidAssignedCandidatesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListMergeRequestVersionsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListMergeRequestVersionsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListPersonalMergeRequestsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListPersonalMergeRequestsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListPersonalRecentPushEventsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListPersonalRecentPushEventsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListPersonalRepositoryImportRecordsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListPersonalRepositoryImportRecordsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListPipelineJobsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListPipelineJobsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListProductPermissionResourcesGrantedUsersRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListProductPermissionResourcesGrantedUsersResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListProjectDeployKeysRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListProjectDeployKeysResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListProjectMergeRequestApproverSettingsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListProjectMergeRequestApproverSettingsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListProjectMergeRequestCanBeAssignedReviewersRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListProjectMergeRequestCanBeAssignedReviewersResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListProjectMergeRequestCanBeAssignedUsersRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListProjectMergeRequestCanBeAssignedUsersResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListProjectMergeRequestTemplatesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListProjectMergeRequestTemplatesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListProjectNoteRequiredAttributesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListProjectNoteRequiredAttributesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListProjectProtectedBranchesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListProjectProtectedBranchesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListProjectProtectedRefsUserGroupsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListProjectProtectedRefsUserGroupsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListProjectProtectedTagsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListProjectProtectedTagsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListProjectRepositoriesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListProjectRepositoriesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListProjectSubgroupsAndRepositoriesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListProjectSubgroupsAndRepositoriesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListProjectWebhookLogsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListProjectWebhookLogsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListProjectWebhooksRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListProjectWebhooksResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListProtectedBranchesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListProtectedBranchesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListProtectedTagsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListProtectedTagsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListRefsListRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListRefsListResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListRepositoryCommitRulesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListRepositoryCommitRulesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListRepositoryContributorsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListRepositoryContributorsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListRepositoryDeployKeysRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListRepositoryDeployKeysResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListRepositoryEventsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListRepositoryEventsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListRepositoryFilePushPermissionsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListRepositoryFilePushPermissionsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListRepositoryForksRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListRepositoryForksResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListRepositoryLabelsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListRepositoryLabelsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListRepositoryLanguagesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListRepositoryLanguagesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListRepositoryMergeRequestsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListRepositoryMergeRequestsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListRepositoryProtectedRefsUserGroupsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListRepositoryProtectedRefsUserGroupsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListRepositoryResourcePermissionsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListRepositoryResourcePermissionsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListRepositoryReviewAuthorsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListRepositoryReviewAuthorsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListRepositoryReviewsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListRepositoryReviewsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListRepositoryTemplatesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListRepositoryTemplatesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListRepositoryUserGroupsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListRepositoryUserGroupsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListRepositoryWebhookLogsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListRepositoryWebhookLogsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListRepositoryWebhooksRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListRepositoryWebhooksResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListRepositoryWorkItemsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListRepositoryWorkItemsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListSubmodulesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListSubmodulesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListTagsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListTagsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListTenantRepositoriesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListTenantRepositoriesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListTenantTrustedIpAddressesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListTenantTrustedIpAddressesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListTreesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListTreesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListTrustedIpAddressesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListTrustedIpAddressesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListUserGpgKeysRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListUserGpgKeysResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListUserKeysRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ListUserKeysResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.LockRepositoryRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.LockRepositoryResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.MergeMergeRequestRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.MergeMergeRequestResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.RebaseMergeRequestForOpenApiRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.RebaseMergeRequestForOpenApiResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.RemoveDeployKeyFromSubmodulesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.RemoveDeployKeyFromSubmodulesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.RemoveDeployKeyRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.RemoveDeployKeyResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.RemoveGroupWebhookRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.RemoveGroupWebhookResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.RemoveProjectWebhookRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.RemoveProjectWebhookResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.RemoveRepositoryWebhookRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.RemoveRepositoryWebhookResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.RenameFileRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.RenameFileResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ResolveMergeRequestConflictsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ResolveMergeRequestConflictsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ReviewMergeRequestRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ReviewMergeRequestResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.SendUserEmailVerifyCodeRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.SendUserEmailVerifyCodeResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowActualHeadPipelineRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowActualHeadPipelineResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowAverageEvaluationRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowAverageEvaluationResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowBlobsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowBlobsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowBranchConflictRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowBranchConflictResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowBranchRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowBranchResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowCommitCommentsByLineRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowCommitCommentsByLineResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowCommitDiffMetadataRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowCommitDiffMetadataResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowCommitFileDiffRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowCommitFileDiffResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowCommitRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowCommitResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowCommitStatisticsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowCommitStatisticsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowDiffCommitRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowDiffCommitResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowDiffLinesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowDiffLinesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowFileContentRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowFileContentResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowFileRawRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowFileRawResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowFileRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowFileResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowGroupE2eSettingRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowGroupE2eSettingResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowGroupGeneralPolicyRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowGroupGeneralPolicyResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowGroupInheritSettingRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowGroupInheritSettingResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowGroupMergeRequestSettingRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowGroupMergeRequestSettingResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowGroupNoteRequiredAttributesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowGroupNoteRequiredAttributesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowGroupPermissionInheritEnabledRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowGroupPermissionInheritEnabledResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowGroupRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowGroupResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowGroupReviewSettingsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowGroupReviewSettingsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowGroupSettingsInheritCfgRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowGroupSettingsInheritCfgResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowGroupWatermarkRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowGroupWatermarkResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowGroupWebhookLogRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowGroupWebhookLogResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowGroupWebhookRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowGroupWebhookResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowGroupsGeneralPolicyRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowGroupsGeneralPolicyResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowGroupsInheritRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowGroupsInheritResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowHttpsPasswordSettingRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowHttpsPasswordSettingResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowLastPushEventInRepositoryRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowLastPushEventInRepositoryResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowMergeRequestCommentsByLineRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowMergeRequestCommentsByLineResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowMergeRequestDetailRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowMergeRequestDetailResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowMergeRequestDiscussionRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowMergeRequestDiscussionResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowMergeRequestSettingRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowMergeRequestSettingResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowMergeRequestTemplateRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowMergeRequestTemplateResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowMergeRequestVotesDetailRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowMergeRequestVotesDetailResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowMergeableStateOuterRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowMergeableStateOuterResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowNoteRequiredAttributesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowNoteRequiredAttributesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowNotificationSubscriptionRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowNotificationSubscriptionResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowNotificationSubscriptionsStatusRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowNotificationSubscriptionsStatusResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowProjectE2eSettingRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowProjectE2eSettingResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowProjectGeneralPolicyRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowProjectGeneralPolicyResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowProjectMemberSettingRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowProjectMemberSettingResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowProjectMergeRequestSettingRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowProjectMergeRequestSettingResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowProjectReviewSettingsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowProjectReviewSettingsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowProjectSettingsInheritCfgRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowProjectSettingsInheritCfgResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowProjectWatermarkRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowProjectWatermarkResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowProjectWebhookLogRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowProjectWebhookLogResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowProjectWebhookRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowProjectWebhookResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowProjectsGeneralPolicyRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowProjectsGeneralPolicyResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowProtectedBranchRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowProtectedBranchResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowProtectedTagRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowProtectedTagResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowReadmeFileRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowReadmeFileResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowRefCompareRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowRefCompareResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowRemoteMirrorRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowRemoteMirrorResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowRepositoryE2eSettingRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowRepositoryE2eSettingResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowRepositoryGeneralCommitRuleRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowRepositoryGeneralCommitRuleResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowRepositoryGeneralPolicyRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowRepositoryGeneralPolicyResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowRepositoryInheritSettingRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowRepositoryInheritSettingResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowRepositoryInheritSettingSourceRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowRepositoryInheritSettingSourceResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowRepositoryMergeRequestsStatisticRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowRepositoryMergeRequestsStatisticResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowRepositoryPermissionInheritEnabledRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowRepositoryPermissionInheritEnabledResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowRepositoryRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowRepositoryResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowRepositoryStatisticsStatusRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowRepositoryStatisticsStatusResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowRepositoryStatisticsSummaryRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowRepositoryStatisticsSummaryResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowRepositoryWatermarkRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowRepositoryWatermarkResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowRepositoryWebhookLogRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowRepositoryWebhookLogResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowRepositoryWebhookRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowRepositoryWebhookResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowResourcePermissionsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowResourcePermissionsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowReviewSettingRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowReviewSettingResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowTagRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowTagResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowUserEmailsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowUserEmailsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowUserRefPermissionRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.ShowUserRefPermissionResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.StartHouseKeepingRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.StartHouseKeepingResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.StartRemoteMirrorSynchronizationRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.StartRemoteMirrorSynchronizationResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.SyncDeployKeyToSubmodulesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.SyncDeployKeyToSubmodulesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.TransferGroupRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.TransferGroupResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UnlockRepositoryRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UnlockRepositoryResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateBranchNameRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateBranchNameResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateFileRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateFileResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateGroupGeneralPolicyRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateGroupGeneralPolicyResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateGroupMergeRequestApproverSettingRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateGroupMergeRequestApproverSettingResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateGroupMergeRequestTemplateRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateGroupMergeRequestTemplateResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateGroupNoteRequiredAttributesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateGroupNoteRequiredAttributesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateGroupReviewSettingsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateGroupReviewSettingsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateGroupWatermarkRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateGroupWatermarkResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateGroupWebhookRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateGroupWebhookResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateHttpsPasswordSettingRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateHttpsPasswordSettingResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateMergeRequestApproverSettingRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateMergeRequestApproverSettingResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateMergeRequestApproversRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateMergeRequestApproversResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateMergeRequestDiscussionInfoRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateMergeRequestDiscussionInfoResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateMergeRequestDiscussionRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateMergeRequestDiscussionResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateMergeRequestRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateMergeRequestResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateMergeRequestReviewersRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateMergeRequestReviewersResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateMergeRequestSettingRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateMergeRequestSettingResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateMergeRequestTemplateRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateMergeRequestTemplateResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateMergeRequestVoteRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateMergeRequestVoteResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateNoteRequiredAttributesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateNoteRequiredAttributesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateNotificationSubscriptionRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateNotificationSubscriptionResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateProjectGeneralPolicyRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateProjectGeneralPolicyResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateProjectMergeRequestApproverSettingRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateProjectMergeRequestApproverSettingResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateProjectMergeRequestTemplateRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateProjectMergeRequestTemplateResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateProjectNoteRequiredAttributesRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateProjectNoteRequiredAttributesResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateProjectReviewSettingsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateProjectReviewSettingsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateProjectSettingsInheritCfgRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateProjectSettingsInheritCfgResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateProjectWatermarkRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateProjectWatermarkResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateProjectWebhookRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateProjectWebhookResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateProtectedBranchRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateProtectedBranchResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateProtectedTagRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateProtectedTagResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateRepositoryCommitRuleRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateRepositoryCommitRuleResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateRepositoryGeneralCommitRuleRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateRepositoryGeneralCommitRuleResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateRepositoryGeneralPolicyRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateRepositoryGeneralPolicyResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateRepositoryInheritSettingRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateRepositoryInheritSettingResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateRepositoryLabelRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateRepositoryLabelResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateRepositoryPermissionInheritEnabledRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateRepositoryPermissionInheritEnabledResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateRepositoryRemoteMirrorRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateRepositoryRemoteMirrorResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateRepositoryResourcePermissionsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateRepositoryResourcePermissionsResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateRepositoryWatermarkRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateRepositoryWatermarkResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateRepositoryWebhookRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateRepositoryWebhookResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateTenantTrustedIpAddressRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateTenantTrustedIpAddressResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateTrustedIpAddressRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateTrustedIpAddressResponse;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateUserEmailsRequest;
import com.huaweicloud.sdk.codeartsrepo.v4.model.UpdateUserEmailsResponse;
import com.huaweicloud.sdk.core.ClientBuilder;
import com.huaweicloud.sdk.core.HcClient;
import com.huaweicloud.sdk.core.invoker.AsyncInvoker;

import java.util.concurrent.CompletableFuture;

public class CodeArtsRepoAsyncClient {

    protected HcClient hcClient;

    public CodeArtsRepoAsyncClient(HcClient hcClient) {
        this.hcClient = hcClient;
    }

    public static ClientBuilder<CodeArtsRepoAsyncClient> newBuilder() {
        ClientBuilder<CodeArtsRepoAsyncClient> clientBuilder = new ClientBuilder<>(CodeArtsRepoAsyncClient::new);
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
     * @return CompletableFuture<CreateCommitResponse>
     */
    public CompletableFuture<CreateCommitResponse> createCommitAsync(CreateCommitRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.createCommit);
    }

    /**
     * 创建提交信息
     *
     * 创建提交信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCommitRequest 请求对象
     * @return AsyncInvoker<CreateCommitRequest, CreateCommitResponse>
     */
    public AsyncInvoker<CreateCommitRequest, CreateCommitResponse> createCommitAsyncInvoker(
        CreateCommitRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.createCommit, hcClient);
    }

    /**
     * 回退提交
     *
     * 回退提交
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCommitRevertRequest 请求对象
     * @return CompletableFuture<CreateCommitRevertResponse>
     */
    public CompletableFuture<CreateCommitRevertResponse> createCommitRevertAsync(CreateCommitRevertRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.createCommitRevert);
    }

    /**
     * 回退提交
     *
     * 回退提交
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCommitRevertRequest 请求对象
     * @return AsyncInvoker<CreateCommitRevertRequest, CreateCommitRevertResponse>
     */
    public AsyncInvoker<CreateCommitRevertRequest, CreateCommitRevertResponse> createCommitRevertAsyncInvoker(
        CreateCommitRevertRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.createCommitRevert, hcClient);
    }

    /**
     * 根据提交ID查询分支、标签列表
     *
     * 根据提交ID查询分支、标签列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCommitAssociatedRefsRequest 请求对象
     * @return CompletableFuture<ListCommitAssociatedRefsResponse>
     */
    public CompletableFuture<ListCommitAssociatedRefsResponse> listCommitAssociatedRefsAsync(
        ListCommitAssociatedRefsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listCommitAssociatedRefs);
    }

    /**
     * 根据提交ID查询分支、标签列表
     *
     * 根据提交ID查询分支、标签列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCommitAssociatedRefsRequest 请求对象
     * @return AsyncInvoker<ListCommitAssociatedRefsRequest, ListCommitAssociatedRefsResponse>
     */
    public AsyncInvoker<ListCommitAssociatedRefsRequest, ListCommitAssociatedRefsResponse> listCommitAssociatedRefsAsyncInvoker(
        ListCommitAssociatedRefsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listCommitAssociatedRefs, hcClient);
    }

    /**
     * 查看提交列表
     *
     * 查看提交列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCommitsRequest 请求对象
     * @return CompletableFuture<ListCommitsResponse>
     */
    public CompletableFuture<ListCommitsResponse> listCommitsAsync(ListCommitsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listCommits);
    }

    /**
     * 查看提交列表
     *
     * 查看提交列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCommitsRequest 请求对象
     * @return AsyncInvoker<ListCommitsRequest, ListCommitsResponse>
     */
    public AsyncInvoker<ListCommitsRequest, ListCommitsResponse> listCommitsAsyncInvoker(ListCommitsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listCommits, hcClient);
    }

    /**
     * 获取特定提交信息
     *
     * 获取特定提交信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCommitRequest 请求对象
     * @return CompletableFuture<ShowCommitResponse>
     */
    public CompletableFuture<ShowCommitResponse> showCommitAsync(ShowCommitRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.showCommit);
    }

    /**
     * 获取特定提交信息
     *
     * 获取特定提交信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCommitRequest 请求对象
     * @return AsyncInvoker<ShowCommitRequest, ShowCommitResponse>
     */
    public AsyncInvoker<ShowCommitRequest, ShowCommitResponse> showCommitAsyncInvoker(ShowCommitRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.showCommit, hcClient);
    }

    /**
     * 获取commit引入的文件变更元数据
     *
     * 获取commit引入的文件变更元数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCommitDiffMetadataRequest 请求对象
     * @return CompletableFuture<ShowCommitDiffMetadataResponse>
     */
    public CompletableFuture<ShowCommitDiffMetadataResponse> showCommitDiffMetadataAsync(
        ShowCommitDiffMetadataRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.showCommitDiffMetadata);
    }

    /**
     * 获取commit引入的文件变更元数据
     *
     * 获取commit引入的文件变更元数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCommitDiffMetadataRequest 请求对象
     * @return AsyncInvoker<ShowCommitDiffMetadataRequest, ShowCommitDiffMetadataResponse>
     */
    public AsyncInvoker<ShowCommitDiffMetadataRequest, ShowCommitDiffMetadataResponse> showCommitDiffMetadataAsyncInvoker(
        ShowCommitDiffMetadataRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.showCommitDiffMetadata, hcClient);
    }

    /**
     * 获取commit引入的指定文件的变更内容
     *
     * 获取commit引入的指定文件的变更内容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCommitFileDiffRequest 请求对象
     * @return CompletableFuture<ShowCommitFileDiffResponse>
     */
    public CompletableFuture<ShowCommitFileDiffResponse> showCommitFileDiffAsync(ShowCommitFileDiffRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.showCommitFileDiff);
    }

    /**
     * 获取commit引入的指定文件的变更内容
     *
     * 获取commit引入的指定文件的变更内容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCommitFileDiffRequest 请求对象
     * @return AsyncInvoker<ShowCommitFileDiffRequest, ShowCommitFileDiffResponse>
     */
    public AsyncInvoker<ShowCommitFileDiffRequest, ShowCommitFileDiffResponse> showCommitFileDiffAsyncInvoker(
        ShowCommitFileDiffRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.showCommitFileDiff, hcClient);
    }

    /**
     * 获取提交差异
     *
     * 获取提交差异
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDiffCommitRequest 请求对象
     * @return CompletableFuture<ShowDiffCommitResponse>
     */
    public CompletableFuture<ShowDiffCommitResponse> showDiffCommitAsync(ShowDiffCommitRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.showDiffCommit);
    }

    /**
     * 获取提交差异
     *
     * 获取提交差异
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDiffCommitRequest 请求对象
     * @return AsyncInvoker<ShowDiffCommitRequest, ShowDiffCommitResponse>
     */
    public AsyncInvoker<ShowDiffCommitRequest, ShowDiffCommitResponse> showDiffCommitAsyncInvoker(
        ShowDiffCommitRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.showDiffCommit, hcClient);
    }

    /**
     * 创建合并请求检视意见
     *
     * 创建合并请求检视意见
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMergeRequestDiscussionRequest 请求对象
     * @return CompletableFuture<CreateMergeRequestDiscussionResponse>
     */
    public CompletableFuture<CreateMergeRequestDiscussionResponse> createMergeRequestDiscussionAsync(
        CreateMergeRequestDiscussionRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.createMergeRequestDiscussion);
    }

    /**
     * 创建合并请求检视意见
     *
     * 创建合并请求检视意见
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMergeRequestDiscussionRequest 请求对象
     * @return AsyncInvoker<CreateMergeRequestDiscussionRequest, CreateMergeRequestDiscussionResponse>
     */
    public AsyncInvoker<CreateMergeRequestDiscussionRequest, CreateMergeRequestDiscussionResponse> createMergeRequestDiscussionAsyncInvoker(
        CreateMergeRequestDiscussionRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.createMergeRequestDiscussion, hcClient);
    }

    /**
     * 回复合并请求检视意见
     *
     * 回复合并请求检视意见
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMergeRequestDiscussionResponseRequest 请求对象
     * @return CompletableFuture<CreateMergeRequestDiscussionResponseResponse>
     */
    public CompletableFuture<CreateMergeRequestDiscussionResponseResponse> createMergeRequestDiscussionResponseAsync(
        CreateMergeRequestDiscussionResponseRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.createMergeRequestDiscussionResponse);
    }

    /**
     * 回复合并请求检视意见
     *
     * 回复合并请求检视意见
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMergeRequestDiscussionResponseRequest 请求对象
     * @return AsyncInvoker<CreateMergeRequestDiscussionResponseRequest, CreateMergeRequestDiscussionResponseResponse>
     */
    public AsyncInvoker<CreateMergeRequestDiscussionResponseRequest, CreateMergeRequestDiscussionResponseResponse> createMergeRequestDiscussionResponseAsyncInvoker(
        CreateMergeRequestDiscussionResponseRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.createMergeRequestDiscussionResponse, hcClient);
    }

    /**
     * 创建/更新检视意见设置
     *
     * 创建/更新检视意见设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateReviewSettingRequest 请求对象
     * @return CompletableFuture<CreateReviewSettingResponse>
     */
    public CompletableFuture<CreateReviewSettingResponse> createReviewSettingAsync(CreateReviewSettingRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.createReviewSetting);
    }

    /**
     * 创建/更新检视意见设置
     *
     * 创建/更新检视意见设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateReviewSettingRequest 请求对象
     * @return AsyncInvoker<CreateReviewSettingRequest, CreateReviewSettingResponse>
     */
    public AsyncInvoker<CreateReviewSettingRequest, CreateReviewSettingResponse> createReviewSettingAsyncInvoker(
        CreateReviewSettingRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.createReviewSetting, hcClient);
    }

    /**
     * 删除合并请求检视意见
     *
     * 删除合并请求检视意见
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMergeRequestDiscussionRequest 请求对象
     * @return CompletableFuture<DeleteMergeRequestDiscussionResponse>
     */
    public CompletableFuture<DeleteMergeRequestDiscussionResponse> deleteMergeRequestDiscussionAsync(
        DeleteMergeRequestDiscussionRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.deleteMergeRequestDiscussion);
    }

    /**
     * 删除合并请求检视意见
     *
     * 删除合并请求检视意见
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMergeRequestDiscussionRequest 请求对象
     * @return AsyncInvoker<DeleteMergeRequestDiscussionRequest, DeleteMergeRequestDiscussionResponse>
     */
    public AsyncInvoker<DeleteMergeRequestDiscussionRequest, DeleteMergeRequestDiscussionResponse> deleteMergeRequestDiscussionAsyncInvoker(
        DeleteMergeRequestDiscussionRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.deleteMergeRequestDiscussion, hcClient);
    }

    /**
     * 获取代码页单个提交下检视意见列表
     *
     * 获取代码页单个提交下检视意见列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCommitDiscussionsRequest 请求对象
     * @return CompletableFuture<ListCommitDiscussionsResponse>
     */
    public CompletableFuture<ListCommitDiscussionsResponse> listCommitDiscussionsAsync(
        ListCommitDiscussionsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listCommitDiscussions);
    }

    /**
     * 获取代码页单个提交下检视意见列表
     *
     * 获取代码页单个提交下检视意见列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCommitDiscussionsRequest 请求对象
     * @return AsyncInvoker<ListCommitDiscussionsRequest, ListCommitDiscussionsResponse>
     */
    public AsyncInvoker<ListCommitDiscussionsRequest, ListCommitDiscussionsResponse> listCommitDiscussionsAsyncInvoker(
        ListCommitDiscussionsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listCommitDiscussions, hcClient);
    }

    /**
     * 获取默认的检视意见分类
     *
     * 获取默认的检视意见分类
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDefaultReviewCategoriesRequest 请求对象
     * @return CompletableFuture<ListDefaultReviewCategoriesResponse>
     */
    public CompletableFuture<ListDefaultReviewCategoriesResponse> listDefaultReviewCategoriesAsync(
        ListDefaultReviewCategoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listDefaultReviewCategories);
    }

    /**
     * 获取默认的检视意见分类
     *
     * 获取默认的检视意见分类
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDefaultReviewCategoriesRequest 请求对象
     * @return AsyncInvoker<ListDefaultReviewCategoriesRequest, ListDefaultReviewCategoriesResponse>
     */
    public AsyncInvoker<ListDefaultReviewCategoriesRequest, ListDefaultReviewCategoriesResponse> listDefaultReviewCategoriesAsyncInvoker(
        ListDefaultReviewCategoriesRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listDefaultReviewCategories, hcClient);
    }

    /**
     * 获取合并请求检视意见列表
     *
     * 获取合并请求检视意见列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMergeRequestDiscussionsRequest 请求对象
     * @return CompletableFuture<ListMergeRequestDiscussionsResponse>
     */
    public CompletableFuture<ListMergeRequestDiscussionsResponse> listMergeRequestDiscussionsAsync(
        ListMergeRequestDiscussionsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listMergeRequestDiscussions);
    }

    /**
     * 获取合并请求检视意见列表
     *
     * 获取合并请求检视意见列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMergeRequestDiscussionsRequest 请求对象
     * @return AsyncInvoker<ListMergeRequestDiscussionsRequest, ListMergeRequestDiscussionsResponse>
     */
    public AsyncInvoker<ListMergeRequestDiscussionsRequest, ListMergeRequestDiscussionsResponse> listMergeRequestDiscussionsAsyncInvoker(
        ListMergeRequestDiscussionsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listMergeRequestDiscussions, hcClient);
    }

    /**
     * 获取合并请求动态列表
     *
     * 获取合并请求动态列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMergeRequestSystemNotesRequest 请求对象
     * @return CompletableFuture<ListMergeRequestSystemNotesResponse>
     */
    public CompletableFuture<ListMergeRequestSystemNotesResponse> listMergeRequestSystemNotesAsync(
        ListMergeRequestSystemNotesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listMergeRequestSystemNotes);
    }

    /**
     * 获取合并请求动态列表
     *
     * 获取合并请求动态列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMergeRequestSystemNotesRequest 请求对象
     * @return AsyncInvoker<ListMergeRequestSystemNotesRequest, ListMergeRequestSystemNotesResponse>
     */
    public AsyncInvoker<ListMergeRequestSystemNotesRequest, ListMergeRequestSystemNotesResponse> listMergeRequestSystemNotesAsyncInvoker(
        ListMergeRequestSystemNotesRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listMergeRequestSystemNotes, hcClient);
    }

    /**
     * 获取项目检视意见必填项
     *
     * 获取项目检视意见必填项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectNoteRequiredAttributesRequest 请求对象
     * @return CompletableFuture<ListProjectNoteRequiredAttributesResponse>
     */
    public CompletableFuture<ListProjectNoteRequiredAttributesResponse> listProjectNoteRequiredAttributesAsync(
        ListProjectNoteRequiredAttributesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listProjectNoteRequiredAttributes);
    }

    /**
     * 获取项目检视意见必填项
     *
     * 获取项目检视意见必填项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectNoteRequiredAttributesRequest 请求对象
     * @return AsyncInvoker<ListProjectNoteRequiredAttributesRequest, ListProjectNoteRequiredAttributesResponse>
     */
    public AsyncInvoker<ListProjectNoteRequiredAttributesRequest, ListProjectNoteRequiredAttributesResponse> listProjectNoteRequiredAttributesAsyncInvoker(
        ListProjectNoteRequiredAttributesRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listProjectNoteRequiredAttributes, hcClient);
    }

    /**
     * 获取仓库下检视意见作者列表
     *
     * 获取仓库下检视意见作者列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryReviewAuthorsRequest 请求对象
     * @return CompletableFuture<ListRepositoryReviewAuthorsResponse>
     */
    public CompletableFuture<ListRepositoryReviewAuthorsResponse> listRepositoryReviewAuthorsAsync(
        ListRepositoryReviewAuthorsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listRepositoryReviewAuthors);
    }

    /**
     * 获取仓库下检视意见作者列表
     *
     * 获取仓库下检视意见作者列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryReviewAuthorsRequest 请求对象
     * @return AsyncInvoker<ListRepositoryReviewAuthorsRequest, ListRepositoryReviewAuthorsResponse>
     */
    public AsyncInvoker<ListRepositoryReviewAuthorsRequest, ListRepositoryReviewAuthorsResponse> listRepositoryReviewAuthorsAsyncInvoker(
        ListRepositoryReviewAuthorsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listRepositoryReviewAuthors, hcClient);
    }

    /**
     * 获取仓库检视意见列表
     *
     * 获取仓库检视意见列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryReviewsRequest 请求对象
     * @return CompletableFuture<ListRepositoryReviewsResponse>
     */
    public CompletableFuture<ListRepositoryReviewsResponse> listRepositoryReviewsAsync(
        ListRepositoryReviewsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listRepositoryReviews);
    }

    /**
     * 获取仓库检视意见列表
     *
     * 获取仓库检视意见列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryReviewsRequest 请求对象
     * @return AsyncInvoker<ListRepositoryReviewsRequest, ListRepositoryReviewsResponse>
     */
    public AsyncInvoker<ListRepositoryReviewsRequest, ListRepositoryReviewsResponse> listRepositoryReviewsAsyncInvoker(
        ListRepositoryReviewsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listRepositoryReviews, hcClient);
    }

    /**
     * 获取代码组检视意见必填项
     *
     * 获取代码组检视意见必填项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGroupNoteRequiredAttributesRequest 请求对象
     * @return CompletableFuture<ShowGroupNoteRequiredAttributesResponse>
     */
    public CompletableFuture<ShowGroupNoteRequiredAttributesResponse> showGroupNoteRequiredAttributesAsync(
        ShowGroupNoteRequiredAttributesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.showGroupNoteRequiredAttributes);
    }

    /**
     * 获取代码组检视意见必填项
     *
     * 获取代码组检视意见必填项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGroupNoteRequiredAttributesRequest 请求对象
     * @return AsyncInvoker<ShowGroupNoteRequiredAttributesRequest, ShowGroupNoteRequiredAttributesResponse>
     */
    public AsyncInvoker<ShowGroupNoteRequiredAttributesRequest, ShowGroupNoteRequiredAttributesResponse> showGroupNoteRequiredAttributesAsyncInvoker(
        ShowGroupNoteRequiredAttributesRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.showGroupNoteRequiredAttributes, hcClient);
    }

    /**
     * 获取代码组检视意见设置(不含必填项)
     *
     * 获取代码组检视意见设置(不含必填项)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGroupReviewSettingsRequest 请求对象
     * @return CompletableFuture<ShowGroupReviewSettingsResponse>
     */
    public CompletableFuture<ShowGroupReviewSettingsResponse> showGroupReviewSettingsAsync(
        ShowGroupReviewSettingsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.showGroupReviewSettings);
    }

    /**
     * 获取代码组检视意见设置(不含必填项)
     *
     * 获取代码组检视意见设置(不含必填项)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGroupReviewSettingsRequest 请求对象
     * @return AsyncInvoker<ShowGroupReviewSettingsRequest, ShowGroupReviewSettingsResponse>
     */
    public AsyncInvoker<ShowGroupReviewSettingsRequest, ShowGroupReviewSettingsResponse> showGroupReviewSettingsAsyncInvoker(
        ShowGroupReviewSettingsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.showGroupReviewSettings, hcClient);
    }

    /**
     * 根据discussion_id获取合并请求检视意见
     *
     * 根据discussion_id获取合并请求检视意见
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMergeRequestDiscussionRequest 请求对象
     * @return CompletableFuture<ShowMergeRequestDiscussionResponse>
     */
    public CompletableFuture<ShowMergeRequestDiscussionResponse> showMergeRequestDiscussionAsync(
        ShowMergeRequestDiscussionRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.showMergeRequestDiscussion);
    }

    /**
     * 根据discussion_id获取合并请求检视意见
     *
     * 根据discussion_id获取合并请求检视意见
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMergeRequestDiscussionRequest 请求对象
     * @return AsyncInvoker<ShowMergeRequestDiscussionRequest, ShowMergeRequestDiscussionResponse>
     */
    public AsyncInvoker<ShowMergeRequestDiscussionRequest, ShowMergeRequestDiscussionResponse> showMergeRequestDiscussionAsyncInvoker(
        ShowMergeRequestDiscussionRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.showMergeRequestDiscussion, hcClient);
    }

    /**
     * 获取仓库检视意见必填项
     *
     * 获取仓库检视意见必填项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNoteRequiredAttributesRequest 请求对象
     * @return CompletableFuture<ShowNoteRequiredAttributesResponse>
     */
    public CompletableFuture<ShowNoteRequiredAttributesResponse> showNoteRequiredAttributesAsync(
        ShowNoteRequiredAttributesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.showNoteRequiredAttributes);
    }

    /**
     * 获取仓库检视意见必填项
     *
     * 获取仓库检视意见必填项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNoteRequiredAttributesRequest 请求对象
     * @return AsyncInvoker<ShowNoteRequiredAttributesRequest, ShowNoteRequiredAttributesResponse>
     */
    public AsyncInvoker<ShowNoteRequiredAttributesRequest, ShowNoteRequiredAttributesResponse> showNoteRequiredAttributesAsyncInvoker(
        ShowNoteRequiredAttributesRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.showNoteRequiredAttributes, hcClient);
    }

    /**
     * 获取项目检视意见设置(不含必填项)
     *
     * 获取项目检视意见设置(不含必填项)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectReviewSettingsRequest 请求对象
     * @return CompletableFuture<ShowProjectReviewSettingsResponse>
     */
    public CompletableFuture<ShowProjectReviewSettingsResponse> showProjectReviewSettingsAsync(
        ShowProjectReviewSettingsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.showProjectReviewSettings);
    }

    /**
     * 获取项目检视意见设置(不含必填项)
     *
     * 获取项目检视意见设置(不含必填项)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectReviewSettingsRequest 请求对象
     * @return AsyncInvoker<ShowProjectReviewSettingsRequest, ShowProjectReviewSettingsResponse>
     */
    public AsyncInvoker<ShowProjectReviewSettingsRequest, ShowProjectReviewSettingsResponse> showProjectReviewSettingsAsyncInvoker(
        ShowProjectReviewSettingsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.showProjectReviewSettings, hcClient);
    }

    /**
     * 获取检视意见设置
     *
     * 获取检视意见设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReviewSettingRequest 请求对象
     * @return CompletableFuture<ShowReviewSettingResponse>
     */
    public CompletableFuture<ShowReviewSettingResponse> showReviewSettingAsync(ShowReviewSettingRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.showReviewSetting);
    }

    /**
     * 获取检视意见设置
     *
     * 获取检视意见设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReviewSettingRequest 请求对象
     * @return AsyncInvoker<ShowReviewSettingRequest, ShowReviewSettingResponse>
     */
    public AsyncInvoker<ShowReviewSettingRequest, ShowReviewSettingResponse> showReviewSettingAsyncInvoker(
        ShowReviewSettingRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.showReviewSetting, hcClient);
    }

    /**
     * 创建/更新代码组检视意见必填项
     *
     * 创建/更新代码组检视意见必填项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGroupNoteRequiredAttributesRequest 请求对象
     * @return CompletableFuture<UpdateGroupNoteRequiredAttributesResponse>
     */
    public CompletableFuture<UpdateGroupNoteRequiredAttributesResponse> updateGroupNoteRequiredAttributesAsync(
        UpdateGroupNoteRequiredAttributesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.updateGroupNoteRequiredAttributes);
    }

    /**
     * 创建/更新代码组检视意见必填项
     *
     * 创建/更新代码组检视意见必填项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGroupNoteRequiredAttributesRequest 请求对象
     * @return AsyncInvoker<UpdateGroupNoteRequiredAttributesRequest, UpdateGroupNoteRequiredAttributesResponse>
     */
    public AsyncInvoker<UpdateGroupNoteRequiredAttributesRequest, UpdateGroupNoteRequiredAttributesResponse> updateGroupNoteRequiredAttributesAsyncInvoker(
        UpdateGroupNoteRequiredAttributesRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.updateGroupNoteRequiredAttributes, hcClient);
    }

    /**
     * 创建/更新代码组检视意见设置(不含必填项)
     *
     * 创建/更新代码组检视意见设置(不含必填项)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGroupReviewSettingsRequest 请求对象
     * @return CompletableFuture<UpdateGroupReviewSettingsResponse>
     */
    public CompletableFuture<UpdateGroupReviewSettingsResponse> updateGroupReviewSettingsAsync(
        UpdateGroupReviewSettingsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.updateGroupReviewSettings);
    }

    /**
     * 创建/更新代码组检视意见设置(不含必填项)
     *
     * 创建/更新代码组检视意见设置(不含必填项)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGroupReviewSettingsRequest 请求对象
     * @return AsyncInvoker<UpdateGroupReviewSettingsRequest, UpdateGroupReviewSettingsResponse>
     */
    public AsyncInvoker<UpdateGroupReviewSettingsRequest, UpdateGroupReviewSettingsResponse> updateGroupReviewSettingsAsyncInvoker(
        UpdateGroupReviewSettingsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.updateGroupReviewSettings, hcClient);
    }

    /**
     * 更新合并请求检视意见
     *
     * 更新合并请求检视意见
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMergeRequestDiscussionRequest 请求对象
     * @return CompletableFuture<UpdateMergeRequestDiscussionResponse>
     */
    public CompletableFuture<UpdateMergeRequestDiscussionResponse> updateMergeRequestDiscussionAsync(
        UpdateMergeRequestDiscussionRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.updateMergeRequestDiscussion);
    }

    /**
     * 更新合并请求检视意见
     *
     * 更新合并请求检视意见
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMergeRequestDiscussionRequest 请求对象
     * @return AsyncInvoker<UpdateMergeRequestDiscussionRequest, UpdateMergeRequestDiscussionResponse>
     */
    public AsyncInvoker<UpdateMergeRequestDiscussionRequest, UpdateMergeRequestDiscussionResponse> updateMergeRequestDiscussionAsyncInvoker(
        UpdateMergeRequestDiscussionRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.updateMergeRequestDiscussion, hcClient);
    }

    /**
     * 更新合并请求检视意见中除评论内容以外的信息
     *
     * 更新合并请求检视意见中除评论内容以外的信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMergeRequestDiscussionInfoRequest 请求对象
     * @return CompletableFuture<UpdateMergeRequestDiscussionInfoResponse>
     */
    public CompletableFuture<UpdateMergeRequestDiscussionInfoResponse> updateMergeRequestDiscussionInfoAsync(
        UpdateMergeRequestDiscussionInfoRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.updateMergeRequestDiscussionInfo);
    }

    /**
     * 更新合并请求检视意见中除评论内容以外的信息
     *
     * 更新合并请求检视意见中除评论内容以外的信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMergeRequestDiscussionInfoRequest 请求对象
     * @return AsyncInvoker<UpdateMergeRequestDiscussionInfoRequest, UpdateMergeRequestDiscussionInfoResponse>
     */
    public AsyncInvoker<UpdateMergeRequestDiscussionInfoRequest, UpdateMergeRequestDiscussionInfoResponse> updateMergeRequestDiscussionInfoAsyncInvoker(
        UpdateMergeRequestDiscussionInfoRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.updateMergeRequestDiscussionInfo, hcClient);
    }

    /**
     * 创建/更新仓库检视意见必填项
     *
     * 创建/更新仓库检视意见必填项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNoteRequiredAttributesRequest 请求对象
     * @return CompletableFuture<UpdateNoteRequiredAttributesResponse>
     */
    public CompletableFuture<UpdateNoteRequiredAttributesResponse> updateNoteRequiredAttributesAsync(
        UpdateNoteRequiredAttributesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.updateNoteRequiredAttributes);
    }

    /**
     * 创建/更新仓库检视意见必填项
     *
     * 创建/更新仓库检视意见必填项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNoteRequiredAttributesRequest 请求对象
     * @return AsyncInvoker<UpdateNoteRequiredAttributesRequest, UpdateNoteRequiredAttributesResponse>
     */
    public AsyncInvoker<UpdateNoteRequiredAttributesRequest, UpdateNoteRequiredAttributesResponse> updateNoteRequiredAttributesAsyncInvoker(
        UpdateNoteRequiredAttributesRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.updateNoteRequiredAttributes, hcClient);
    }

    /**
     * 创建/更新项目检视意见必填项
     *
     * 创建/更新项目检视意见必填项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProjectNoteRequiredAttributesRequest 请求对象
     * @return CompletableFuture<UpdateProjectNoteRequiredAttributesResponse>
     */
    public CompletableFuture<UpdateProjectNoteRequiredAttributesResponse> updateProjectNoteRequiredAttributesAsync(
        UpdateProjectNoteRequiredAttributesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.updateProjectNoteRequiredAttributes);
    }

    /**
     * 创建/更新项目检视意见必填项
     *
     * 创建/更新项目检视意见必填项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProjectNoteRequiredAttributesRequest 请求对象
     * @return AsyncInvoker<UpdateProjectNoteRequiredAttributesRequest, UpdateProjectNoteRequiredAttributesResponse>
     */
    public AsyncInvoker<UpdateProjectNoteRequiredAttributesRequest, UpdateProjectNoteRequiredAttributesResponse> updateProjectNoteRequiredAttributesAsyncInvoker(
        UpdateProjectNoteRequiredAttributesRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.updateProjectNoteRequiredAttributes, hcClient);
    }

    /**
     * 创建/更新项目检视意见设置(不含必填项)
     *
     * 创建/更新项目检视意见设置(不含必填项)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProjectReviewSettingsRequest 请求对象
     * @return CompletableFuture<UpdateProjectReviewSettingsResponse>
     */
    public CompletableFuture<UpdateProjectReviewSettingsResponse> updateProjectReviewSettingsAsync(
        UpdateProjectReviewSettingsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.updateProjectReviewSettings);
    }

    /**
     * 创建/更新项目检视意见设置(不含必填项)
     *
     * 创建/更新项目检视意见设置(不含必填项)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProjectReviewSettingsRequest 请求对象
     * @return AsyncInvoker<UpdateProjectReviewSettingsRequest, UpdateProjectReviewSettingsResponse>
     */
    public AsyncInvoker<UpdateProjectReviewSettingsRequest, UpdateProjectReviewSettingsResponse> updateProjectReviewSettingsAsyncInvoker(
        UpdateProjectReviewSettingsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.updateProjectReviewSettings, hcClient);
    }

    /**
     * 创建文件
     *
     * 创建文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFileRequest 请求对象
     * @return CompletableFuture<CreateFileResponse>
     */
    public CompletableFuture<CreateFileResponse> createFileAsync(CreateFileRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.createFile);
    }

    /**
     * 创建文件
     *
     * 创建文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFileRequest 请求对象
     * @return AsyncInvoker<CreateFileRequest, CreateFileResponse>
     */
    public AsyncInvoker<CreateFileRequest, CreateFileResponse> createFileAsyncInvoker(CreateFileRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.createFile, hcClient);
    }

    /**
     * 删除文件
     *
     * 删除文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFileRequest 请求对象
     * @return CompletableFuture<DeleteFileResponse>
     */
    public CompletableFuture<DeleteFileResponse> deleteFileAsync(DeleteFileRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.deleteFile);
    }

    /**
     * 删除文件
     *
     * 删除文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteFileRequest 请求对象
     * @return AsyncInvoker<DeleteFileRequest, DeleteFileResponse>
     */
    public AsyncInvoker<DeleteFileRequest, DeleteFileResponse> deleteFileAsyncInvoker(DeleteFileRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.deleteFile, hcClient);
    }

    /**
     * 获取仓库单个文件内容(下载单个文件)
     *
     * 获取仓库单个文件内容(下载单个文件)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadBlobsRawRequest 请求对象
     * @return CompletableFuture<DownloadBlobsRawResponse>
     */
    public CompletableFuture<DownloadBlobsRawResponse> downloadBlobsRawAsync(DownloadBlobsRawRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.downloadBlobsRaw);
    }

    /**
     * 获取仓库单个文件内容(下载单个文件)
     *
     * 获取仓库单个文件内容(下载单个文件)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadBlobsRawRequest 请求对象
     * @return AsyncInvoker<DownloadBlobsRawRequest, DownloadBlobsRawResponse>
     */
    public AsyncInvoker<DownloadBlobsRawRequest, DownloadBlobsRawResponse> downloadBlobsRawAsyncInvoker(
        DownloadBlobsRawRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.downloadBlobsRaw, hcClient);
    }

    /**
     * 获取文件追溯信息
     *
     * 获取文件追溯信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFileBlameLinesRequest 请求对象
     * @return CompletableFuture<ListFileBlameLinesResponse>
     */
    public CompletableFuture<ListFileBlameLinesResponse> listFileBlameLinesAsync(ListFileBlameLinesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listFileBlameLines);
    }

    /**
     * 获取文件追溯信息
     *
     * 获取文件追溯信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFileBlameLinesRequest 请求对象
     * @return AsyncInvoker<ListFileBlameLinesRequest, ListFileBlameLinesResponse>
     */
    public AsyncInvoker<ListFileBlameLinesRequest, ListFileBlameLinesResponse> listFileBlameLinesAsyncInvoker(
        ListFileBlameLinesRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listFileBlameLines, hcClient);
    }

    /**
     * 获取当前文件上级树结构
     *
     * 获取当前文件上级树结构
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFileUpperTreeEntriesRequest 请求对象
     * @return CompletableFuture<ListFileUpperTreeEntriesResponse>
     */
    public CompletableFuture<ListFileUpperTreeEntriesResponse> listFileUpperTreeEntriesAsync(
        ListFileUpperTreeEntriesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listFileUpperTreeEntries);
    }

    /**
     * 获取当前文件上级树结构
     *
     * 获取当前文件上级树结构
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFileUpperTreeEntriesRequest 请求对象
     * @return AsyncInvoker<ListFileUpperTreeEntriesRequest, ListFileUpperTreeEntriesResponse>
     */
    public AsyncInvoker<ListFileUpperTreeEntriesRequest, ListFileUpperTreeEntriesResponse> listFileUpperTreeEntriesAsyncInvoker(
        ListFileUpperTreeEntriesRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listFileUpperTreeEntries, hcClient);
    }

    /**
     * 获取指定分支下所有的文件列表
     *
     * 获取指定分支下所有的文件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFilesRequest 请求对象
     * @return CompletableFuture<ListFilesResponse>
     */
    public CompletableFuture<ListFilesResponse> listFilesAsync(ListFilesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listFiles);
    }

    /**
     * 获取指定分支下所有的文件列表
     *
     * 获取指定分支下所有的文件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListFilesRequest 请求对象
     * @return AsyncInvoker<ListFilesRequest, ListFilesResponse>
     */
    public AsyncInvoker<ListFilesRequest, ListFilesResponse> listFilesAsyncInvoker(ListFilesRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listFiles, hcClient);
    }

    /**
     * 查看文件树
     *
     * 查看文件树
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLogsTreeRequest 请求对象
     * @return CompletableFuture<ListLogsTreeResponse>
     */
    public CompletableFuture<ListLogsTreeResponse> listLogsTreeAsync(ListLogsTreeRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listLogsTree);
    }

    /**
     * 查看文件树
     *
     * 查看文件树
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLogsTreeRequest 请求对象
     * @return AsyncInvoker<ListLogsTreeRequest, ListLogsTreeResponse>
     */
    public AsyncInvoker<ListLogsTreeRequest, ListLogsTreeResponse> listLogsTreeAsyncInvoker(
        ListLogsTreeRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listLogsTree, hcClient);
    }

    /**
     * 查看分支文件列表
     *
     * 查看分支文件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTreesRequest 请求对象
     * @return CompletableFuture<ListTreesResponse>
     */
    public CompletableFuture<ListTreesResponse> listTreesAsync(ListTreesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listTrees);
    }

    /**
     * 查看分支文件列表
     *
     * 查看分支文件列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTreesRequest 请求对象
     * @return AsyncInvoker<ListTreesRequest, ListTreesResponse>
     */
    public AsyncInvoker<ListTreesRequest, ListTreesResponse> listTreesAsyncInvoker(ListTreesRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listTrees, hcClient);
    }

    /**
     * 文件重命名
     *
     * 文件重命名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RenameFileRequest 请求对象
     * @return CompletableFuture<RenameFileResponse>
     */
    public CompletableFuture<RenameFileResponse> renameFileAsync(RenameFileRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.renameFile);
    }

    /**
     * 文件重命名
     *
     * 文件重命名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RenameFileRequest 请求对象
     * @return AsyncInvoker<RenameFileRequest, RenameFileResponse>
     */
    public AsyncInvoker<RenameFileRequest, RenameFileResponse> renameFileAsyncInvoker(RenameFileRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.renameFile, hcClient);
    }

    /**
     * 查看文件属性与内容
     *
     * 查看文件属性与内容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFileRequest 请求对象
     * @return CompletableFuture<ShowFileResponse>
     */
    public CompletableFuture<ShowFileResponse> showFileAsync(ShowFileRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.showFile);
    }

    /**
     * 查看文件属性与内容
     *
     * 查看文件属性与内容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFileRequest 请求对象
     * @return AsyncInvoker<ShowFileRequest, ShowFileResponse>
     */
    public AsyncInvoker<ShowFileRequest, ShowFileResponse> showFileAsyncInvoker(ShowFileRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.showFile, hcClient);
    }

    /**
     * 获取文件内容
     *
     * 获取文件内容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFileContentRequest 请求对象
     * @return CompletableFuture<ShowFileContentResponse>
     */
    public CompletableFuture<ShowFileContentResponse> showFileContentAsync(ShowFileContentRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.showFileContent);
    }

    /**
     * 获取文件内容
     *
     * 获取文件内容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFileContentRequest 请求对象
     * @return AsyncInvoker<ShowFileContentRequest, ShowFileContentResponse>
     */
    public AsyncInvoker<ShowFileContentRequest, ShowFileContentResponse> showFileContentAsyncInvoker(
        ShowFileContentRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.showFileContent, hcClient);
    }

    /**
     * 获取仓库单个文件内容
     *
     * 获取仓库单个文件内容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFileRawRequest 请求对象
     * @return CompletableFuture<ShowFileRawResponse>
     */
    public CompletableFuture<ShowFileRawResponse> showFileRawAsync(ShowFileRawRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.showFileRaw);
    }

    /**
     * 获取仓库单个文件内容
     *
     * 获取仓库单个文件内容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowFileRawRequest 请求对象
     * @return AsyncInvoker<ShowFileRawRequest, ShowFileRawResponse>
     */
    public AsyncInvoker<ShowFileRawRequest, ShowFileRawResponse> showFileRawAsyncInvoker(ShowFileRawRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.showFileRaw, hcClient);
    }

    /**
     * 获取仓库默认分支的Readme文件内容
     *
     * 获取仓库默认分支的Readme文件内容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReadmeFileRequest 请求对象
     * @return CompletableFuture<ShowReadmeFileResponse>
     */
    public CompletableFuture<ShowReadmeFileResponse> showReadmeFileAsync(ShowReadmeFileRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.showReadmeFile);
    }

    /**
     * 获取仓库默认分支的Readme文件内容
     *
     * 获取仓库默认分支的Readme文件内容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowReadmeFileRequest 请求对象
     * @return AsyncInvoker<ShowReadmeFileRequest, ShowReadmeFileResponse>
     */
    public AsyncInvoker<ShowReadmeFileRequest, ShowReadmeFileResponse> showReadmeFileAsyncInvoker(
        ShowReadmeFileRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.showReadmeFile, hcClient);
    }

    /**
     * 更新文件内容
     *
     * 修改仓库ip白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateFileRequest 请求对象
     * @return CompletableFuture<UpdateFileResponse>
     */
    public CompletableFuture<UpdateFileResponse> updateFileAsync(UpdateFileRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.updateFile);
    }

    /**
     * 更新文件内容
     *
     * 修改仓库ip白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateFileRequest 请求对象
     * @return AsyncInvoker<UpdateFileRequest, UpdateFileResponse>
     */
    public AsyncInvoker<UpdateFileRequest, UpdateFileResponse> updateFileAsyncInvoker(UpdateFileRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.updateFile, hcClient);
    }

    /**
     * 关联代码组与成员组
     *
     * 关联代码组与成员组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateGroupUserGroupRequest 请求对象
     * @return CompletableFuture<AssociateGroupUserGroupResponse>
     */
    public CompletableFuture<AssociateGroupUserGroupResponse> associateGroupUserGroupAsync(
        AssociateGroupUserGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.associateGroupUserGroup);
    }

    /**
     * 关联代码组与成员组
     *
     * 关联代码组与成员组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateGroupUserGroupRequest 请求对象
     * @return AsyncInvoker<AssociateGroupUserGroupRequest, AssociateGroupUserGroupResponse>
     */
    public AsyncInvoker<AssociateGroupUserGroupRequest, AssociateGroupUserGroupResponse> associateGroupUserGroupAsyncInvoker(
        AssociateGroupUserGroupRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.associateGroupUserGroup, hcClient);
    }

    /**
     * 创建代码组
     *
     * 创建代码组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGroupRequest 请求对象
     * @return CompletableFuture<CreateGroupResponse>
     */
    public CompletableFuture<CreateGroupResponse> createGroupAsync(CreateGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.createGroup);
    }

    /**
     * 创建代码组
     *
     * 创建代码组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGroupRequest 请求对象
     * @return AsyncInvoker<CreateGroupRequest, CreateGroupResponse>
     */
    public AsyncInvoker<CreateGroupRequest, CreateGroupResponse> createGroupAsyncInvoker(CreateGroupRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.createGroup, hcClient);
    }

    /**
     * 删除代码组
     *
     * 删除代码组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGroupRequest 请求对象
     * @return CompletableFuture<DeleteGroupResponse>
     */
    public CompletableFuture<DeleteGroupResponse> deleteGroupAsync(DeleteGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.deleteGroup);
    }

    /**
     * 删除代码组
     *
     * 删除代码组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGroupRequest 请求对象
     * @return AsyncInvoker<DeleteGroupRequest, DeleteGroupResponse>
     */
    public AsyncInvoker<DeleteGroupRequest, DeleteGroupResponse> deleteGroupAsyncInvoker(DeleteGroupRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.deleteGroup, hcClient);
    }

    /**
     * 获取代码组下可添加的成员列表
     *
     * 获取代码组下可添加的成员列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupAddableMembersRequest 请求对象
     * @return CompletableFuture<ListGroupAddableMembersResponse>
     */
    public CompletableFuture<ListGroupAddableMembersResponse> listGroupAddableMembersAsync(
        ListGroupAddableMembersRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listGroupAddableMembers);
    }

    /**
     * 获取代码组下可添加的成员列表
     *
     * 获取代码组下可添加的成员列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupAddableMembersRequest 请求对象
     * @return AsyncInvoker<ListGroupAddableMembersRequest, ListGroupAddableMembersResponse>
     */
    public AsyncInvoker<ListGroupAddableMembersRequest, ListGroupAddableMembersResponse> listGroupAddableMembersAsyncInvoker(
        ListGroupAddableMembersRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listGroupAddableMembers, hcClient);
    }

    /**
     * 获取代码组下可添加的成员组
     *
     * 获取代码组下可添加的成员组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupAddableUserGroupsRequest 请求对象
     * @return CompletableFuture<ListGroupAddableUserGroupsResponse>
     */
    public CompletableFuture<ListGroupAddableUserGroupsResponse> listGroupAddableUserGroupsAsync(
        ListGroupAddableUserGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listGroupAddableUserGroups);
    }

    /**
     * 获取代码组下可添加的成员组
     *
     * 获取代码组下可添加的成员组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupAddableUserGroupsRequest 请求对象
     * @return AsyncInvoker<ListGroupAddableUserGroupsRequest, ListGroupAddableUserGroupsResponse>
     */
    public AsyncInvoker<ListGroupAddableUserGroupsRequest, ListGroupAddableUserGroupsResponse> listGroupAddableUserGroupsAsyncInvoker(
        ListGroupAddableUserGroupsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listGroupAddableUserGroups, hcClient);
    }

    /**
     * 获取代码组下可添加的成员列表
     *
     * 获取代码组下可添加的成员列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupMembersRequest 请求对象
     * @return CompletableFuture<ListGroupMembersResponse>
     */
    public CompletableFuture<ListGroupMembersResponse> listGroupMembersAsync(ListGroupMembersRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listGroupMembers);
    }

    /**
     * 获取代码组下可添加的成员列表
     *
     * 获取代码组下可添加的成员列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupMembersRequest 请求对象
     * @return AsyncInvoker<ListGroupMembersRequest, ListGroupMembersResponse>
     */
    public AsyncInvoker<ListGroupMembersRequest, ListGroupMembersResponse> listGroupMembersAsyncInvoker(
        ListGroupMembersRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listGroupMembers, hcClient);
    }

    /**
     * 获取代码组权限资源点列表
     *
     * 获取代码组权限资源点列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupPermissionResourcesRequest 请求对象
     * @return CompletableFuture<ListGroupPermissionResourcesResponse>
     */
    public CompletableFuture<ListGroupPermissionResourcesResponse> listGroupPermissionResourcesAsync(
        ListGroupPermissionResourcesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listGroupPermissionResources);
    }

    /**
     * 获取代码组权限资源点列表
     *
     * 获取代码组权限资源点列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupPermissionResourcesRequest 请求对象
     * @return AsyncInvoker<ListGroupPermissionResourcesRequest, ListGroupPermissionResourcesResponse>
     */
    public AsyncInvoker<ListGroupPermissionResourcesRequest, ListGroupPermissionResourcesResponse> listGroupPermissionResourcesAsyncInvoker(
        ListGroupPermissionResourcesRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listGroupPermissionResources, hcClient);
    }

    /**
     * 获取代码组下的子代码组和仓库列表
     *
     * 获取代码组下的子代码组和仓库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupSubgroupsAndRepositoriesRequest 请求对象
     * @return CompletableFuture<ListGroupSubgroupsAndRepositoriesResponse>
     */
    public CompletableFuture<ListGroupSubgroupsAndRepositoriesResponse> listGroupSubgroupsAndRepositoriesAsync(
        ListGroupSubgroupsAndRepositoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listGroupSubgroupsAndRepositories);
    }

    /**
     * 获取代码组下的子代码组和仓库列表
     *
     * 获取代码组下的子代码组和仓库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupSubgroupsAndRepositoriesRequest 请求对象
     * @return AsyncInvoker<ListGroupSubgroupsAndRepositoriesRequest, ListGroupSubgroupsAndRepositoriesResponse>
     */
    public AsyncInvoker<ListGroupSubgroupsAndRepositoriesRequest, ListGroupSubgroupsAndRepositoriesResponse> listGroupSubgroupsAndRepositoriesAsyncInvoker(
        ListGroupSubgroupsAndRepositoriesRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listGroupSubgroupsAndRepositories, hcClient);
    }

    /**
     * 组织下查询成员组列表
     *
     * 组织下查询成员组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupUserGroupsRequest 请求对象
     * @return CompletableFuture<ListGroupUserGroupsResponse>
     */
    public CompletableFuture<ListGroupUserGroupsResponse> listGroupUserGroupsAsync(ListGroupUserGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listGroupUserGroups);
    }

    /**
     * 组织下查询成员组列表
     *
     * 组织下查询成员组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupUserGroupsRequest 请求对象
     * @return AsyncInvoker<ListGroupUserGroupsRequest, ListGroupUserGroupsResponse>
     */
    public AsyncInvoker<ListGroupUserGroupsRequest, ListGroupUserGroupsResponse> listGroupUserGroupsAsyncInvoker(
        ListGroupUserGroupsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listGroupUserGroups, hcClient);
    }

    /**
     * 获取代码组列表
     *
     * 获取代码组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupsRequest 请求对象
     * @return CompletableFuture<ListGroupsResponse>
     */
    public CompletableFuture<ListGroupsResponse> listGroupsAsync(ListGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listGroups);
    }

    /**
     * 获取代码组列表
     *
     * 获取代码组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupsRequest 请求对象
     * @return AsyncInvoker<ListGroupsRequest, ListGroupsResponse>
     */
    public AsyncInvoker<ListGroupsRequest, ListGroupsResponse> listGroupsAsyncInvoker(ListGroupsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listGroups, hcClient);
    }

    /**
     * 获取项目下当前用户有管理权限的代码组列表
     *
     * 获取项目下当前用户有管理权限的代码组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListManageableGroupsRequest 请求对象
     * @return CompletableFuture<ListManageableGroupsResponse>
     */
    public CompletableFuture<ListManageableGroupsResponse> listManageableGroupsAsync(
        ListManageableGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listManageableGroups);
    }

    /**
     * 获取项目下当前用户有管理权限的代码组列表
     *
     * 获取项目下当前用户有管理权限的代码组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListManageableGroupsRequest 请求对象
     * @return AsyncInvoker<ListManageableGroupsRequest, ListManageableGroupsResponse>
     */
    public AsyncInvoker<ListManageableGroupsRequest, ListManageableGroupsResponse> listManageableGroupsAsyncInvoker(
        ListManageableGroupsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listManageableGroups, hcClient);
    }

    /**
     * 获取代码组信息
     *
     * 获取代码组信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGroupRequest 请求对象
     * @return CompletableFuture<ShowGroupResponse>
     */
    public CompletableFuture<ShowGroupResponse> showGroupAsync(ShowGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.showGroup);
    }

    /**
     * 获取代码组信息
     *
     * 获取代码组信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGroupRequest 请求对象
     * @return AsyncInvoker<ShowGroupRequest, ShowGroupResponse>
     */
    public AsyncInvoker<ShowGroupRequest, ShowGroupResponse> showGroupAsyncInvoker(ShowGroupRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.showGroup, hcClient);
    }

    /**
     * 获取指定代码组的基本设置信息
     *
     * 获取指定代码组的基本设置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGroupGeneralPolicyRequest 请求对象
     * @return CompletableFuture<ShowGroupGeneralPolicyResponse>
     */
    public CompletableFuture<ShowGroupGeneralPolicyResponse> showGroupGeneralPolicyAsync(
        ShowGroupGeneralPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.showGroupGeneralPolicy);
    }

    /**
     * 获取指定代码组的基本设置信息
     *
     * 获取指定代码组的基本设置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGroupGeneralPolicyRequest 请求对象
     * @return AsyncInvoker<ShowGroupGeneralPolicyRequest, ShowGroupGeneralPolicyResponse>
     */
    public AsyncInvoker<ShowGroupGeneralPolicyRequest, ShowGroupGeneralPolicyResponse> showGroupGeneralPolicyAsyncInvoker(
        ShowGroupGeneralPolicyRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.showGroupGeneralPolicy, hcClient);
    }

    /**
     * 获取代码组继承设置项
     *
     * 获取代码组继承设置项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGroupInheritSettingRequest 请求对象
     * @return CompletableFuture<ShowGroupInheritSettingResponse>
     */
    public CompletableFuture<ShowGroupInheritSettingResponse> showGroupInheritSettingAsync(
        ShowGroupInheritSettingRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.showGroupInheritSetting);
    }

    /**
     * 获取代码组继承设置项
     *
     * 获取代码组继承设置项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGroupInheritSettingRequest 请求对象
     * @return AsyncInvoker<ShowGroupInheritSettingRequest, ShowGroupInheritSettingResponse>
     */
    public AsyncInvoker<ShowGroupInheritSettingRequest, ShowGroupInheritSettingResponse> showGroupInheritSettingAsyncInvoker(
        ShowGroupInheritSettingRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.showGroupInheritSetting, hcClient);
    }

    /**
     * 获取代码组继承权限设置开关
     *
     * 获取代码组继承权限设置开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGroupPermissionInheritEnabledRequest 请求对象
     * @return CompletableFuture<ShowGroupPermissionInheritEnabledResponse>
     */
    public CompletableFuture<ShowGroupPermissionInheritEnabledResponse> showGroupPermissionInheritEnabledAsync(
        ShowGroupPermissionInheritEnabledRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.showGroupPermissionInheritEnabled);
    }

    /**
     * 获取代码组继承权限设置开关
     *
     * 获取代码组继承权限设置开关
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGroupPermissionInheritEnabledRequest 请求对象
     * @return AsyncInvoker<ShowGroupPermissionInheritEnabledRequest, ShowGroupPermissionInheritEnabledResponse>
     */
    public AsyncInvoker<ShowGroupPermissionInheritEnabledRequest, ShowGroupPermissionInheritEnabledResponse> showGroupPermissionInheritEnabledAsyncInvoker(
        ShowGroupPermissionInheritEnabledRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.showGroupPermissionInheritEnabled, hcClient);
    }

    /**
     * 获取代码组继承设置项
     *
     * 获取代码组继承设置项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGroupSettingsInheritCfgRequest 请求对象
     * @return CompletableFuture<ShowGroupSettingsInheritCfgResponse>
     */
    public CompletableFuture<ShowGroupSettingsInheritCfgResponse> showGroupSettingsInheritCfgAsync(
        ShowGroupSettingsInheritCfgRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.showGroupSettingsInheritCfg);
    }

    /**
     * 获取代码组继承设置项
     *
     * 获取代码组继承设置项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGroupSettingsInheritCfgRequest 请求对象
     * @return AsyncInvoker<ShowGroupSettingsInheritCfgRequest, ShowGroupSettingsInheritCfgResponse>
     */
    public AsyncInvoker<ShowGroupSettingsInheritCfgRequest, ShowGroupSettingsInheritCfgResponse> showGroupSettingsInheritCfgAsyncInvoker(
        ShowGroupSettingsInheritCfgRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.showGroupSettingsInheritCfg, hcClient);
    }

    /**
     * 获取代码组水印设置
     *
     * 获取代码组水印设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGroupWatermarkRequest 请求对象
     * @return CompletableFuture<ShowGroupWatermarkResponse>
     */
    public CompletableFuture<ShowGroupWatermarkResponse> showGroupWatermarkAsync(ShowGroupWatermarkRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.showGroupWatermark);
    }

    /**
     * 获取代码组水印设置
     *
     * 获取代码组水印设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGroupWatermarkRequest 请求对象
     * @return AsyncInvoker<ShowGroupWatermarkRequest, ShowGroupWatermarkResponse>
     */
    public AsyncInvoker<ShowGroupWatermarkRequest, ShowGroupWatermarkResponse> showGroupWatermarkAsyncInvoker(
        ShowGroupWatermarkRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.showGroupWatermark, hcClient);
    }

    /**
     * 获取指定代码组的基本设置信息
     *
     * 获取指定代码组的基本设置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGroupsGeneralPolicyRequest 请求对象
     * @return CompletableFuture<ShowGroupsGeneralPolicyResponse>
     */
    public CompletableFuture<ShowGroupsGeneralPolicyResponse> showGroupsGeneralPolicyAsync(
        ShowGroupsGeneralPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.showGroupsGeneralPolicy);
    }

    /**
     * 获取指定代码组的基本设置信息
     *
     * 获取指定代码组的基本设置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGroupsGeneralPolicyRequest 请求对象
     * @return AsyncInvoker<ShowGroupsGeneralPolicyRequest, ShowGroupsGeneralPolicyResponse>
     */
    public AsyncInvoker<ShowGroupsGeneralPolicyRequest, ShowGroupsGeneralPolicyResponse> showGroupsGeneralPolicyAsyncInvoker(
        ShowGroupsGeneralPolicyRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.showGroupsGeneralPolicy, hcClient);
    }

    /**
     * 获取代码组的继承设置
     *
     * 获取代码组的继承设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGroupsInheritRequest 请求对象
     * @return CompletableFuture<ShowGroupsInheritResponse>
     */
    public CompletableFuture<ShowGroupsInheritResponse> showGroupsInheritAsync(ShowGroupsInheritRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.showGroupsInherit);
    }

    /**
     * 获取代码组的继承设置
     *
     * 获取代码组的继承设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGroupsInheritRequest 请求对象
     * @return AsyncInvoker<ShowGroupsInheritRequest, ShowGroupsInheritResponse>
     */
    public AsyncInvoker<ShowGroupsInheritRequest, ShowGroupsInheritResponse> showGroupsInheritAsyncInvoker(
        ShowGroupsInheritRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.showGroupsInherit, hcClient);
    }

    /**
     * 移交代码组
     *
     * 移交代码组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request TransferGroupRequest 请求对象
     * @return CompletableFuture<TransferGroupResponse>
     */
    public CompletableFuture<TransferGroupResponse> transferGroupAsync(TransferGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.transferGroup);
    }

    /**
     * 移交代码组
     *
     * 移交代码组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request TransferGroupRequest 请求对象
     * @return AsyncInvoker<TransferGroupRequest, TransferGroupResponse>
     */
    public AsyncInvoker<TransferGroupRequest, TransferGroupResponse> transferGroupAsyncInvoker(
        TransferGroupRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.transferGroup, hcClient);
    }

    /**
     * 更新代码组的基本设置信息
     *
     * 更新代码组的基本设置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGroupGeneralPolicyRequest 请求对象
     * @return CompletableFuture<UpdateGroupGeneralPolicyResponse>
     */
    public CompletableFuture<UpdateGroupGeneralPolicyResponse> updateGroupGeneralPolicyAsync(
        UpdateGroupGeneralPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.updateGroupGeneralPolicy);
    }

    /**
     * 更新代码组的基本设置信息
     *
     * 更新代码组的基本设置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGroupGeneralPolicyRequest 请求对象
     * @return AsyncInvoker<UpdateGroupGeneralPolicyRequest, UpdateGroupGeneralPolicyResponse>
     */
    public AsyncInvoker<UpdateGroupGeneralPolicyRequest, UpdateGroupGeneralPolicyResponse> updateGroupGeneralPolicyAsyncInvoker(
        UpdateGroupGeneralPolicyRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.updateGroupGeneralPolicy, hcClient);
    }

    /**
     * 更新代码组水印设置
     *
     * 更新代码组水印设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGroupWatermarkRequest 请求对象
     * @return CompletableFuture<UpdateGroupWatermarkResponse>
     */
    public CompletableFuture<UpdateGroupWatermarkResponse> updateGroupWatermarkAsync(
        UpdateGroupWatermarkRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.updateGroupWatermark);
    }

    /**
     * 更新代码组水印设置
     *
     * 更新代码组水印设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGroupWatermarkRequest 请求对象
     * @return AsyncInvoker<UpdateGroupWatermarkRequest, UpdateGroupWatermarkResponse>
     */
    public AsyncInvoker<UpdateGroupWatermarkRequest, UpdateGroupWatermarkResponse> updateGroupWatermarkAsyncInvoker(
        UpdateGroupWatermarkRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.updateGroupWatermark, hcClient);
    }

    /**
     * 批量添加仓库成员
     *
     * 批量添加仓库成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddRepositoryMembersRequest 请求对象
     * @return CompletableFuture<AddRepositoryMembersResponse>
     */
    public CompletableFuture<AddRepositoryMembersResponse> addRepositoryMembersAsync(
        AddRepositoryMembersRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.addRepositoryMembers);
    }

    /**
     * 批量添加仓库成员
     *
     * 批量添加仓库成员
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddRepositoryMembersRequest 请求对象
     * @return AsyncInvoker<AddRepositoryMembersRequest, AddRepositoryMembersResponse>
     */
    public AsyncInvoker<AddRepositoryMembersRequest, AddRepositoryMembersResponse> addRepositoryMembersAsyncInvoker(
        AddRepositoryMembersRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.addRepositoryMembers, hcClient);
    }

    /**
     * 获取代码组下成员组列表
     *
     * 获取代码组下成员组列表(保护分支保护Tags设置中使用)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupProtectedRefsUserGroupsRequest 请求对象
     * @return CompletableFuture<ListGroupProtectedRefsUserGroupsResponse>
     */
    public CompletableFuture<ListGroupProtectedRefsUserGroupsResponse> listGroupProtectedRefsUserGroupsAsync(
        ListGroupProtectedRefsUserGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listGroupProtectedRefsUserGroups);
    }

    /**
     * 获取代码组下成员组列表
     *
     * 获取代码组下成员组列表(保护分支保护Tags设置中使用)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupProtectedRefsUserGroupsRequest 请求对象
     * @return AsyncInvoker<ListGroupProtectedRefsUserGroupsRequest, ListGroupProtectedRefsUserGroupsResponse>
     */
    public AsyncInvoker<ListGroupProtectedRefsUserGroupsRequest, ListGroupProtectedRefsUserGroupsResponse> listGroupProtectedRefsUserGroupsAsyncInvoker(
        ListGroupProtectedRefsUserGroupsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listGroupProtectedRefsUserGroups, hcClient);
    }

    /**
     * 获取仓库成员列表
     *
     * 获取仓库成员列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMembersRequest 请求对象
     * @return CompletableFuture<ListMembersResponse>
     */
    public CompletableFuture<ListMembersResponse> listMembersAsync(ListMembersRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listMembers);
    }

    /**
     * 获取仓库成员列表
     *
     * 获取仓库成员列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMembersRequest 请求对象
     * @return AsyncInvoker<ListMembersRequest, ListMembersResponse>
     */
    public AsyncInvoker<ListMembersRequest, ListMembersResponse> listMembersAsyncInvoker(ListMembersRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listMembers, hcClient);
    }

    /**
     * 获取项目下成员列表
     *
     * 获取项目下成员列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProductPermissionResourcesGrantedUsersRequest 请求对象
     * @return CompletableFuture<ListProductPermissionResourcesGrantedUsersResponse>
     */
    public CompletableFuture<ListProductPermissionResourcesGrantedUsersResponse> listProductPermissionResourcesGrantedUsersAsync(
        ListProductPermissionResourcesGrantedUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listProductPermissionResourcesGrantedUsers);
    }

    /**
     * 获取项目下成员列表
     *
     * 获取项目下成员列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProductPermissionResourcesGrantedUsersRequest 请求对象
     * @return AsyncInvoker<ListProductPermissionResourcesGrantedUsersRequest, ListProductPermissionResourcesGrantedUsersResponse>
     */
    public AsyncInvoker<ListProductPermissionResourcesGrantedUsersRequest, ListProductPermissionResourcesGrantedUsersResponse> listProductPermissionResourcesGrantedUsersAsyncInvoker(
        ListProductPermissionResourcesGrantedUsersRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listProductPermissionResourcesGrantedUsers, hcClient);
    }

    /**
     * 获取项目下成员组列表
     *
     * 获取项目下成员组列表(保护分支保护Tags设置中使用)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectProtectedRefsUserGroupsRequest 请求对象
     * @return CompletableFuture<ListProjectProtectedRefsUserGroupsResponse>
     */
    public CompletableFuture<ListProjectProtectedRefsUserGroupsResponse> listProjectProtectedRefsUserGroupsAsync(
        ListProjectProtectedRefsUserGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listProjectProtectedRefsUserGroups);
    }

    /**
     * 获取项目下成员组列表
     *
     * 获取项目下成员组列表(保护分支保护Tags设置中使用)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectProtectedRefsUserGroupsRequest 请求对象
     * @return AsyncInvoker<ListProjectProtectedRefsUserGroupsRequest, ListProjectProtectedRefsUserGroupsResponse>
     */
    public AsyncInvoker<ListProjectProtectedRefsUserGroupsRequest, ListProjectProtectedRefsUserGroupsResponse> listProjectProtectedRefsUserGroupsAsyncInvoker(
        ListProjectProtectedRefsUserGroupsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listProjectProtectedRefsUserGroups, hcClient);
    }

    /**
     * 获取仓库下成员组列表
     *
     * 获取仓库下成员组列表(保护分支保护Tags设置中使用)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryProtectedRefsUserGroupsRequest 请求对象
     * @return CompletableFuture<ListRepositoryProtectedRefsUserGroupsResponse>
     */
    public CompletableFuture<ListRepositoryProtectedRefsUserGroupsResponse> listRepositoryProtectedRefsUserGroupsAsync(
        ListRepositoryProtectedRefsUserGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listRepositoryProtectedRefsUserGroups);
    }

    /**
     * 获取仓库下成员组列表
     *
     * 获取仓库下成员组列表(保护分支保护Tags设置中使用)
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryProtectedRefsUserGroupsRequest 请求对象
     * @return AsyncInvoker<ListRepositoryProtectedRefsUserGroupsRequest, ListRepositoryProtectedRefsUserGroupsResponse>
     */
    public AsyncInvoker<ListRepositoryProtectedRefsUserGroupsRequest, ListRepositoryProtectedRefsUserGroupsResponse> listRepositoryProtectedRefsUserGroupsAsyncInvoker(
        ListRepositoryProtectedRefsUserGroupsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listRepositoryProtectedRefsUserGroups, hcClient);
    }

    /**
     * 获取成员组列表
     *
     * 获取成员组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryUserGroupsRequest 请求对象
     * @return CompletableFuture<ListRepositoryUserGroupsResponse>
     */
    public CompletableFuture<ListRepositoryUserGroupsResponse> listRepositoryUserGroupsAsync(
        ListRepositoryUserGroupsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listRepositoryUserGroups);
    }

    /**
     * 获取成员组列表
     *
     * 获取成员组列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryUserGroupsRequest 请求对象
     * @return AsyncInvoker<ListRepositoryUserGroupsRequest, ListRepositoryUserGroupsResponse>
     */
    public AsyncInvoker<ListRepositoryUserGroupsRequest, ListRepositoryUserGroupsResponse> listRepositoryUserGroupsAsyncInvoker(
        ListRepositoryUserGroupsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listRepositoryUserGroups, hcClient);
    }

    /**
     * 审核合并请求
     *
     * 审核合并请求
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ApprovalMergeRequestRequest 请求对象
     * @return CompletableFuture<ApprovalMergeRequestResponse>
     */
    public CompletableFuture<ApprovalMergeRequestResponse> approvalMergeRequestAsync(
        ApprovalMergeRequestRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.approvalMergeRequest);
    }

    /**
     * 审核合并请求
     *
     * 审核合并请求
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ApprovalMergeRequestRequest 请求对象
     * @return AsyncInvoker<ApprovalMergeRequestRequest, ApprovalMergeRequestResponse>
     */
    public AsyncInvoker<ApprovalMergeRequestRequest, ApprovalMergeRequestResponse> approvalMergeRequestAsyncInvoker(
        ApprovalMergeRequestRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.approvalMergeRequest, hcClient);
    }

    /**
     * Cherry pick合并请求
     *
     * Cherry pick合并请求
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCherryPickMergeRequestRequest 请求对象
     * @return CompletableFuture<CreateCherryPickMergeRequestResponse>
     */
    public CompletableFuture<CreateCherryPickMergeRequestResponse> createCherryPickMergeRequestAsync(
        CreateCherryPickMergeRequestRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.createCherryPickMergeRequest);
    }

    /**
     * Cherry pick合并请求
     *
     * Cherry pick合并请求
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateCherryPickMergeRequestRequest 请求对象
     * @return AsyncInvoker<CreateCherryPickMergeRequestRequest, CreateCherryPickMergeRequestResponse>
     */
    public AsyncInvoker<CreateCherryPickMergeRequestRequest, CreateCherryPickMergeRequestResponse> createCherryPickMergeRequestAsyncInvoker(
        CreateCherryPickMergeRequestRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.createCherryPickMergeRequest, hcClient);
    }

    /**
     * 创建代码组合并请求审核设置
     *
     * 创建代码组合并请求审核设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGroupMergeRequestApproverSettingRequest 请求对象
     * @return CompletableFuture<CreateGroupMergeRequestApproverSettingResponse>
     */
    public CompletableFuture<CreateGroupMergeRequestApproverSettingResponse> createGroupMergeRequestApproverSettingAsync(
        CreateGroupMergeRequestApproverSettingRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.createGroupMergeRequestApproverSetting);
    }

    /**
     * 创建代码组合并请求审核设置
     *
     * 创建代码组合并请求审核设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGroupMergeRequestApproverSettingRequest 请求对象
     * @return AsyncInvoker<CreateGroupMergeRequestApproverSettingRequest, CreateGroupMergeRequestApproverSettingResponse>
     */
    public AsyncInvoker<CreateGroupMergeRequestApproverSettingRequest, CreateGroupMergeRequestApproverSettingResponse> createGroupMergeRequestApproverSettingAsyncInvoker(
        CreateGroupMergeRequestApproverSettingRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.createGroupMergeRequestApproverSetting, hcClient);
    }

    /**
     * 创建代码组合并请求模板
     *
     * 创建代码组合并请求模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGroupMergeRequestTemplateRequest 请求对象
     * @return CompletableFuture<CreateGroupMergeRequestTemplateResponse>
     */
    public CompletableFuture<CreateGroupMergeRequestTemplateResponse> createGroupMergeRequestTemplateAsync(
        CreateGroupMergeRequestTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.createGroupMergeRequestTemplate);
    }

    /**
     * 创建代码组合并请求模板
     *
     * 创建代码组合并请求模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateGroupMergeRequestTemplateRequest 请求对象
     * @return AsyncInvoker<CreateGroupMergeRequestTemplateRequest, CreateGroupMergeRequestTemplateResponse>
     */
    public AsyncInvoker<CreateGroupMergeRequestTemplateRequest, CreateGroupMergeRequestTemplateResponse> createGroupMergeRequestTemplateAsyncInvoker(
        CreateGroupMergeRequestTemplateRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.createGroupMergeRequestTemplate, hcClient);
    }

    /**
     * 创建合并请求
     *
     * 创建合并请求
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMergeRequestRequest 请求对象
     * @return CompletableFuture<CreateMergeRequestResponse>
     */
    public CompletableFuture<CreateMergeRequestResponse> createMergeRequestAsync(CreateMergeRequestRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.createMergeRequest);
    }

    /**
     * 创建合并请求
     *
     * 创建合并请求
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMergeRequestRequest 请求对象
     * @return AsyncInvoker<CreateMergeRequestRequest, CreateMergeRequestResponse>
     */
    public AsyncInvoker<CreateMergeRequestRequest, CreateMergeRequestResponse> createMergeRequestAsyncInvoker(
        CreateMergeRequestRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.createMergeRequest, hcClient);
    }

    /**
     * 创建合并请求审核设置
     *
     * 创建合并请求审核设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMergeRequestApproverSettingRequest 请求对象
     * @return CompletableFuture<CreateMergeRequestApproverSettingResponse>
     */
    public CompletableFuture<CreateMergeRequestApproverSettingResponse> createMergeRequestApproverSettingAsync(
        CreateMergeRequestApproverSettingRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.createMergeRequestApproverSetting);
    }

    /**
     * 创建合并请求审核设置
     *
     * 创建合并请求审核设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMergeRequestApproverSettingRequest 请求对象
     * @return AsyncInvoker<CreateMergeRequestApproverSettingRequest, CreateMergeRequestApproverSettingResponse>
     */
    public AsyncInvoker<CreateMergeRequestApproverSettingRequest, CreateMergeRequestApproverSettingResponse> createMergeRequestApproverSettingAsyncInvoker(
        CreateMergeRequestApproverSettingRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.createMergeRequestApproverSetting, hcClient);
    }

    /**
     * 创建合并请求模板
     *
     * 创建合并请求模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMergeRequestTemplateRequest 请求对象
     * @return CompletableFuture<CreateMergeRequestTemplateResponse>
     */
    public CompletableFuture<CreateMergeRequestTemplateResponse> createMergeRequestTemplateAsync(
        CreateMergeRequestTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.createMergeRequestTemplate);
    }

    /**
     * 创建合并请求模板
     *
     * 创建合并请求模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateMergeRequestTemplateRequest 请求对象
     * @return AsyncInvoker<CreateMergeRequestTemplateRequest, CreateMergeRequestTemplateResponse>
     */
    public AsyncInvoker<CreateMergeRequestTemplateRequest, CreateMergeRequestTemplateResponse> createMergeRequestTemplateAsyncInvoker(
        CreateMergeRequestTemplateRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.createMergeRequestTemplate, hcClient);
    }

    /**
     * 创建项目合并请求审核设置
     *
     * 创建项目合并请求审核设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProjectMergeRequestApproverSettingRequest 请求对象
     * @return CompletableFuture<CreateProjectMergeRequestApproverSettingResponse>
     */
    public CompletableFuture<CreateProjectMergeRequestApproverSettingResponse> createProjectMergeRequestApproverSettingAsync(
        CreateProjectMergeRequestApproverSettingRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.createProjectMergeRequestApproverSetting);
    }

    /**
     * 创建项目合并请求审核设置
     *
     * 创建项目合并请求审核设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProjectMergeRequestApproverSettingRequest 请求对象
     * @return AsyncInvoker<CreateProjectMergeRequestApproverSettingRequest, CreateProjectMergeRequestApproverSettingResponse>
     */
    public AsyncInvoker<CreateProjectMergeRequestApproverSettingRequest, CreateProjectMergeRequestApproverSettingResponse> createProjectMergeRequestApproverSettingAsyncInvoker(
        CreateProjectMergeRequestApproverSettingRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.createProjectMergeRequestApproverSetting, hcClient);
    }

    /**
     * 创建项目合并请求模板
     *
     * 创建项目合并请求模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProjectMergeRequestTemplateRequest 请求对象
     * @return CompletableFuture<CreateProjectMergeRequestTemplateResponse>
     */
    public CompletableFuture<CreateProjectMergeRequestTemplateResponse> createProjectMergeRequestTemplateAsync(
        CreateProjectMergeRequestTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.createProjectMergeRequestTemplate);
    }

    /**
     * 创建项目合并请求模板
     *
     * 创建项目合并请求模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProjectMergeRequestTemplateRequest 请求对象
     * @return AsyncInvoker<CreateProjectMergeRequestTemplateRequest, CreateProjectMergeRequestTemplateResponse>
     */
    public AsyncInvoker<CreateProjectMergeRequestTemplateRequest, CreateProjectMergeRequestTemplateResponse> createProjectMergeRequestTemplateAsyncInvoker(
        CreateProjectMergeRequestTemplateRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.createProjectMergeRequestTemplate, hcClient);
    }

    /**
     * 删除代码组合并请求审核配置
     *
     * 删除代码组合并请求审核配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGroupMergeRequestApproverSettingRequest 请求对象
     * @return CompletableFuture<DeleteGroupMergeRequestApproverSettingResponse>
     */
    public CompletableFuture<DeleteGroupMergeRequestApproverSettingResponse> deleteGroupMergeRequestApproverSettingAsync(
        DeleteGroupMergeRequestApproverSettingRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.deleteGroupMergeRequestApproverSetting);
    }

    /**
     * 删除代码组合并请求审核配置
     *
     * 删除代码组合并请求审核配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGroupMergeRequestApproverSettingRequest 请求对象
     * @return AsyncInvoker<DeleteGroupMergeRequestApproverSettingRequest, DeleteGroupMergeRequestApproverSettingResponse>
     */
    public AsyncInvoker<DeleteGroupMergeRequestApproverSettingRequest, DeleteGroupMergeRequestApproverSettingResponse> deleteGroupMergeRequestApproverSettingAsyncInvoker(
        DeleteGroupMergeRequestApproverSettingRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.deleteGroupMergeRequestApproverSetting, hcClient);
    }

    /**
     * 删除代码组合并请求模板
     *
     * 删除代码组合并请求模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGroupMergeRequestTemplateRequest 请求对象
     * @return CompletableFuture<DeleteGroupMergeRequestTemplateResponse>
     */
    public CompletableFuture<DeleteGroupMergeRequestTemplateResponse> deleteGroupMergeRequestTemplateAsync(
        DeleteGroupMergeRequestTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.deleteGroupMergeRequestTemplate);
    }

    /**
     * 删除代码组合并请求模板
     *
     * 删除代码组合并请求模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteGroupMergeRequestTemplateRequest 请求对象
     * @return AsyncInvoker<DeleteGroupMergeRequestTemplateRequest, DeleteGroupMergeRequestTemplateResponse>
     */
    public AsyncInvoker<DeleteGroupMergeRequestTemplateRequest, DeleteGroupMergeRequestTemplateResponse> deleteGroupMergeRequestTemplateAsyncInvoker(
        DeleteGroupMergeRequestTemplateRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.deleteGroupMergeRequestTemplate, hcClient);
    }

    /**
     * 删除合并请求审核配置
     *
     * 删除合并请求审核配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMergeRequestApproverSettingRequest 请求对象
     * @return CompletableFuture<DeleteMergeRequestApproverSettingResponse>
     */
    public CompletableFuture<DeleteMergeRequestApproverSettingResponse> deleteMergeRequestApproverSettingAsync(
        DeleteMergeRequestApproverSettingRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.deleteMergeRequestApproverSetting);
    }

    /**
     * 删除合并请求审核配置
     *
     * 删除合并请求审核配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMergeRequestApproverSettingRequest 请求对象
     * @return AsyncInvoker<DeleteMergeRequestApproverSettingRequest, DeleteMergeRequestApproverSettingResponse>
     */
    public AsyncInvoker<DeleteMergeRequestApproverSettingRequest, DeleteMergeRequestApproverSettingResponse> deleteMergeRequestApproverSettingAsyncInvoker(
        DeleteMergeRequestApproverSettingRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.deleteMergeRequestApproverSetting, hcClient);
    }

    /**
     * 删除合并请求模板
     *
     * 删除合并请求模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMergeRequestTemplateRequest 请求对象
     * @return CompletableFuture<DeleteMergeRequestTemplateResponse>
     */
    public CompletableFuture<DeleteMergeRequestTemplateResponse> deleteMergeRequestTemplateAsync(
        DeleteMergeRequestTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.deleteMergeRequestTemplate);
    }

    /**
     * 删除合并请求模板
     *
     * 删除合并请求模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMergeRequestTemplateRequest 请求对象
     * @return AsyncInvoker<DeleteMergeRequestTemplateRequest, DeleteMergeRequestTemplateResponse>
     */
    public AsyncInvoker<DeleteMergeRequestTemplateRequest, DeleteMergeRequestTemplateResponse> deleteMergeRequestTemplateAsyncInvoker(
        DeleteMergeRequestTemplateRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.deleteMergeRequestTemplate, hcClient);
    }

    /**
     * 删除合并请求打分
     *
     * 删除合并请求打分
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMergeRequestVoteRequest 请求对象
     * @return CompletableFuture<DeleteMergeRequestVoteResponse>
     */
    public CompletableFuture<DeleteMergeRequestVoteResponse> deleteMergeRequestVoteAsync(
        DeleteMergeRequestVoteRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.deleteMergeRequestVote);
    }

    /**
     * 删除合并请求打分
     *
     * 删除合并请求打分
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteMergeRequestVoteRequest 请求对象
     * @return AsyncInvoker<DeleteMergeRequestVoteRequest, DeleteMergeRequestVoteResponse>
     */
    public AsyncInvoker<DeleteMergeRequestVoteRequest, DeleteMergeRequestVoteResponse> deleteMergeRequestVoteAsyncInvoker(
        DeleteMergeRequestVoteRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.deleteMergeRequestVote, hcClient);
    }

    /**
     * 删除项目合并请求审核配置
     *
     * 删除项目合并请求审核配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteProjectMergeRequestApproverSettingRequest 请求对象
     * @return CompletableFuture<DeleteProjectMergeRequestApproverSettingResponse>
     */
    public CompletableFuture<DeleteProjectMergeRequestApproverSettingResponse> deleteProjectMergeRequestApproverSettingAsync(
        DeleteProjectMergeRequestApproverSettingRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.deleteProjectMergeRequestApproverSetting);
    }

    /**
     * 删除项目合并请求审核配置
     *
     * 删除项目合并请求审核配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteProjectMergeRequestApproverSettingRequest 请求对象
     * @return AsyncInvoker<DeleteProjectMergeRequestApproverSettingRequest, DeleteProjectMergeRequestApproverSettingResponse>
     */
    public AsyncInvoker<DeleteProjectMergeRequestApproverSettingRequest, DeleteProjectMergeRequestApproverSettingResponse> deleteProjectMergeRequestApproverSettingAsyncInvoker(
        DeleteProjectMergeRequestApproverSettingRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.deleteProjectMergeRequestApproverSetting, hcClient);
    }

    /**
     * 删除项目合并请求模板
     *
     * 删除项目合并请求模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteProjectMergeRequestTemplateRequest 请求对象
     * @return CompletableFuture<DeleteProjectMergeRequestTemplateResponse>
     */
    public CompletableFuture<DeleteProjectMergeRequestTemplateResponse> deleteProjectMergeRequestTemplateAsync(
        DeleteProjectMergeRequestTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.deleteProjectMergeRequestTemplate);
    }

    /**
     * 删除项目合并请求模板
     *
     * 删除项目合并请求模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteProjectMergeRequestTemplateRequest 请求对象
     * @return AsyncInvoker<DeleteProjectMergeRequestTemplateRequest, DeleteProjectMergeRequestTemplateResponse>
     */
    public AsyncInvoker<DeleteProjectMergeRequestTemplateRequest, DeleteProjectMergeRequestTemplateResponse> deleteProjectMergeRequestTemplateAsyncInvoker(
        DeleteProjectMergeRequestTemplateRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.deleteProjectMergeRequestTemplate, hcClient);
    }

    /**
     * 导入合并请求
     *
     * 导入合并请求
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportMergeRequestRequest 请求对象
     * @return CompletableFuture<ImportMergeRequestResponse>
     */
    public CompletableFuture<ImportMergeRequestResponse> importMergeRequestAsync(ImportMergeRequestRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.importMergeRequest);
    }

    /**
     * 导入合并请求
     *
     * 导入合并请求
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ImportMergeRequestRequest 请求对象
     * @return AsyncInvoker<ImportMergeRequestRequest, ImportMergeRequestResponse>
     */
    public AsyncInvoker<ImportMergeRequestRequest, ImportMergeRequestResponse> importMergeRequestAsyncInvoker(
        ImportMergeRequestRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.importMergeRequest, hcClient);
    }

    /**
     * 获取提交关联的合并请求
     *
     * 获取提交关联的合并请求
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCommitAssociatedMergeRequestsRequest 请求对象
     * @return CompletableFuture<ListCommitAssociatedMergeRequestsResponse>
     */
    public CompletableFuture<ListCommitAssociatedMergeRequestsResponse> listCommitAssociatedMergeRequestsAsync(
        ListCommitAssociatedMergeRequestsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listCommitAssociatedMergeRequests);
    }

    /**
     * 获取提交关联的合并请求
     *
     * 获取提交关联的合并请求
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCommitAssociatedMergeRequestsRequest 请求对象
     * @return AsyncInvoker<ListCommitAssociatedMergeRequestsRequest, ListCommitAssociatedMergeRequestsResponse>
     */
    public AsyncInvoker<ListCommitAssociatedMergeRequestsRequest, ListCommitAssociatedMergeRequestsResponse> listCommitAssociatedMergeRequestsAsyncInvoker(
        ListCommitAssociatedMergeRequestsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listCommitAssociatedMergeRequests, hcClient);
    }

    /**
     * 获取检视意见模板列表
     *
     * 获取检视意见模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDiscussionTemplatesRequest 请求对象
     * @return CompletableFuture<ListDiscussionTemplatesResponse>
     */
    public CompletableFuture<ListDiscussionTemplatesResponse> listDiscussionTemplatesAsync(
        ListDiscussionTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listDiscussionTemplates);
    }

    /**
     * 获取检视意见模板列表
     *
     * 获取检视意见模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListDiscussionTemplatesRequest 请求对象
     * @return AsyncInvoker<ListDiscussionTemplatesRequest, ListDiscussionTemplatesResponse>
     */
    public AsyncInvoker<ListDiscussionTemplatesRequest, ListDiscussionTemplatesResponse> listDiscussionTemplatesAsyncInvoker(
        ListDiscussionTemplatesRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listDiscussionTemplates, hcClient);
    }

    /**
     * 获取代码组合并请求审核设置列表
     *
     * 获取代码组合并请求审核设置列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupMergeRequestApproverSettingsRequest 请求对象
     * @return CompletableFuture<ListGroupMergeRequestApproverSettingsResponse>
     */
    public CompletableFuture<ListGroupMergeRequestApproverSettingsResponse> listGroupMergeRequestApproverSettingsAsync(
        ListGroupMergeRequestApproverSettingsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listGroupMergeRequestApproverSettings);
    }

    /**
     * 获取代码组合并请求审核设置列表
     *
     * 获取代码组合并请求审核设置列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupMergeRequestApproverSettingsRequest 请求对象
     * @return AsyncInvoker<ListGroupMergeRequestApproverSettingsRequest, ListGroupMergeRequestApproverSettingsResponse>
     */
    public AsyncInvoker<ListGroupMergeRequestApproverSettingsRequest, ListGroupMergeRequestApproverSettingsResponse> listGroupMergeRequestApproverSettingsAsyncInvoker(
        ListGroupMergeRequestApproverSettingsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listGroupMergeRequestApproverSettings, hcClient);
    }

    /**
     * 获取代码组检视人
     *
     * 获取代码组检视人
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupMergeRequestCanBeAssignedReviewersRequest 请求对象
     * @return CompletableFuture<ListGroupMergeRequestCanBeAssignedReviewersResponse>
     */
    public CompletableFuture<ListGroupMergeRequestCanBeAssignedReviewersResponse> listGroupMergeRequestCanBeAssignedReviewersAsync(
        ListGroupMergeRequestCanBeAssignedReviewersRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listGroupMergeRequestCanBeAssignedReviewers);
    }

    /**
     * 获取代码组检视人
     *
     * 获取代码组检视人
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupMergeRequestCanBeAssignedReviewersRequest 请求对象
     * @return AsyncInvoker<ListGroupMergeRequestCanBeAssignedReviewersRequest, ListGroupMergeRequestCanBeAssignedReviewersResponse>
     */
    public AsyncInvoker<ListGroupMergeRequestCanBeAssignedReviewersRequest, ListGroupMergeRequestCanBeAssignedReviewersResponse> listGroupMergeRequestCanBeAssignedReviewersAsyncInvoker(
        ListGroupMergeRequestCanBeAssignedReviewersRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listGroupMergeRequestCanBeAssignedReviewers, hcClient);
    }

    /**
     * 获取代码组合并请求模板列表
     *
     * 获取代码组合并请求模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupMergeRequestTemplatesRequest 请求对象
     * @return CompletableFuture<ListGroupMergeRequestTemplatesResponse>
     */
    public CompletableFuture<ListGroupMergeRequestTemplatesResponse> listGroupMergeRequestTemplatesAsync(
        ListGroupMergeRequestTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listGroupMergeRequestTemplates);
    }

    /**
     * 获取代码组合并请求模板列表
     *
     * 获取代码组合并请求模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupMergeRequestTemplatesRequest 请求对象
     * @return AsyncInvoker<ListGroupMergeRequestTemplatesRequest, ListGroupMergeRequestTemplatesResponse>
     */
    public AsyncInvoker<ListGroupMergeRequestTemplatesRequest, ListGroupMergeRequestTemplatesResponse> listGroupMergeRequestTemplatesAsyncInvoker(
        ListGroupMergeRequestTemplatesRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listGroupMergeRequestTemplates, hcClient);
    }

    /**
     * 获取代码组审核人或合并人
     *
     * 获取代码组审核人或合并人
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupMergeRequestValidAssignedCandidatesRequest 请求对象
     * @return CompletableFuture<ListGroupMergeRequestValidAssignedCandidatesResponse>
     */
    public CompletableFuture<ListGroupMergeRequestValidAssignedCandidatesResponse> listGroupMergeRequestValidAssignedCandidatesAsync(
        ListGroupMergeRequestValidAssignedCandidatesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listGroupMergeRequestValidAssignedCandidates);
    }

    /**
     * 获取代码组审核人或合并人
     *
     * 获取代码组审核人或合并人
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupMergeRequestValidAssignedCandidatesRequest 请求对象
     * @return AsyncInvoker<ListGroupMergeRequestValidAssignedCandidatesRequest, ListGroupMergeRequestValidAssignedCandidatesResponse>
     */
    public AsyncInvoker<ListGroupMergeRequestValidAssignedCandidatesRequest, ListGroupMergeRequestValidAssignedCandidatesResponse> listGroupMergeRequestValidAssignedCandidatesAsyncInvoker(
        ListGroupMergeRequestValidAssignedCandidatesRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listGroupMergeRequestValidAssignedCandidates, hcClient);
    }

    /**
     * 获取合并请求审核设置列表
     *
     * 获取合并请求审核设置列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMergeRequestApproverSettingsRequest 请求对象
     * @return CompletableFuture<ListMergeRequestApproverSettingsResponse>
     */
    public CompletableFuture<ListMergeRequestApproverSettingsResponse> listMergeRequestApproverSettingsAsync(
        ListMergeRequestApproverSettingsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listMergeRequestApproverSettings);
    }

    /**
     * 获取合并请求审核设置列表
     *
     * 获取合并请求审核设置列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMergeRequestApproverSettingsRequest 请求对象
     * @return AsyncInvoker<ListMergeRequestApproverSettingsRequest, ListMergeRequestApproverSettingsResponse>
     */
    public AsyncInvoker<ListMergeRequestApproverSettingsRequest, ListMergeRequestApproverSettingsResponse> listMergeRequestApproverSettingsAsyncInvoker(
        ListMergeRequestApproverSettingsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listMergeRequestApproverSettings, hcClient);
    }

    /**
     * 获取合并请求审核人列表
     *
     * 获取合并请求审核人列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMergeRequestApproversRequest 请求对象
     * @return CompletableFuture<ListMergeRequestApproversResponse>
     */
    public CompletableFuture<ListMergeRequestApproversResponse> listMergeRequestApproversAsync(
        ListMergeRequestApproversRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listMergeRequestApprovers);
    }

    /**
     * 获取合并请求审核人列表
     *
     * 获取合并请求审核人列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMergeRequestApproversRequest 请求对象
     * @return AsyncInvoker<ListMergeRequestApproversRequest, ListMergeRequestApproversResponse>
     */
    public AsyncInvoker<ListMergeRequestApproversRequest, ListMergeRequestApproversResponse> listMergeRequestApproversAsyncInvoker(
        ListMergeRequestApproversRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listMergeRequestApprovers, hcClient);
    }

    /**
     * 获取合并请求文件变更列表
     *
     * 获取合并请求文件变更列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMergeRequestChangesRequest 请求对象
     * @return CompletableFuture<ListMergeRequestChangesResponse>
     */
    public CompletableFuture<ListMergeRequestChangesResponse> listMergeRequestChangesAsync(
        ListMergeRequestChangesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listMergeRequestChanges);
    }

    /**
     * 获取合并请求文件变更列表
     *
     * 获取合并请求文件变更列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMergeRequestChangesRequest 请求对象
     * @return AsyncInvoker<ListMergeRequestChangesRequest, ListMergeRequestChangesResponse>
     */
    public AsyncInvoker<ListMergeRequestChangesRequest, ListMergeRequestChangesResponse> listMergeRequestChangesAsyncInvoker(
        ListMergeRequestChangesRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listMergeRequestChanges, hcClient);
    }

    /**
     * 获取合并请求文件变更列表树
     *
     * 获取合并请求文件变更列表树
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMergeRequestChangesTreesRequest 请求对象
     * @return CompletableFuture<ListMergeRequestChangesTreesResponse>
     */
    public CompletableFuture<ListMergeRequestChangesTreesResponse> listMergeRequestChangesTreesAsync(
        ListMergeRequestChangesTreesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listMergeRequestChangesTrees);
    }

    /**
     * 获取合并请求文件变更列表树
     *
     * 获取合并请求文件变更列表树
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMergeRequestChangesTreesRequest 请求对象
     * @return AsyncInvoker<ListMergeRequestChangesTreesRequest, ListMergeRequestChangesTreesResponse>
     */
    public AsyncInvoker<ListMergeRequestChangesTreesRequest, ListMergeRequestChangesTreesResponse> listMergeRequestChangesTreesAsyncInvoker(
        ListMergeRequestChangesTreesRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listMergeRequestChangesTrees, hcClient);
    }

    /**
     * 获取合并请求commit列表
     *
     * 获取合并请求commit列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMergeRequestCommitsRequest 请求对象
     * @return CompletableFuture<ListMergeRequestCommitsResponse>
     */
    public CompletableFuture<ListMergeRequestCommitsResponse> listMergeRequestCommitsAsync(
        ListMergeRequestCommitsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listMergeRequestCommits);
    }

    /**
     * 获取合并请求commit列表
     *
     * 获取合并请求commit列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMergeRequestCommitsRequest 请求对象
     * @return AsyncInvoker<ListMergeRequestCommitsRequest, ListMergeRequestCommitsResponse>
     */
    public AsyncInvoker<ListMergeRequestCommitsRequest, ListMergeRequestCommitsResponse> listMergeRequestCommitsAsyncInvoker(
        ListMergeRequestCommitsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listMergeRequestCommits, hcClient);
    }

    /**
     * 获取所有的冲突文件
     *
     * 获取所有的冲突文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMergeRequestConflictFilesRequest 请求对象
     * @return CompletableFuture<ListMergeRequestConflictFilesResponse>
     */
    public CompletableFuture<ListMergeRequestConflictFilesResponse> listMergeRequestConflictFilesAsync(
        ListMergeRequestConflictFilesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listMergeRequestConflictFiles);
    }

    /**
     * 获取所有的冲突文件
     *
     * 获取所有的冲突文件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMergeRequestConflictFilesRequest 请求对象
     * @return AsyncInvoker<ListMergeRequestConflictFilesRequest, ListMergeRequestConflictFilesResponse>
     */
    public AsyncInvoker<ListMergeRequestConflictFilesRequest, ListMergeRequestConflictFilesResponse> listMergeRequestConflictFilesAsyncInvoker(
        ListMergeRequestConflictFilesRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listMergeRequestConflictFiles, hcClient);
    }

    /**
     * 获取合并请求评价列表
     *
     * 获取合并请求评价列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMergeRequestEvaluationsRequest 请求对象
     * @return CompletableFuture<ListMergeRequestEvaluationsResponse>
     */
    public CompletableFuture<ListMergeRequestEvaluationsResponse> listMergeRequestEvaluationsAsync(
        ListMergeRequestEvaluationsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listMergeRequestEvaluations);
    }

    /**
     * 获取合并请求评价列表
     *
     * 获取合并请求评价列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMergeRequestEvaluationsRequest 请求对象
     * @return AsyncInvoker<ListMergeRequestEvaluationsRequest, ListMergeRequestEvaluationsResponse>
     */
    public AsyncInvoker<ListMergeRequestEvaluationsRequest, ListMergeRequestEvaluationsResponse> listMergeRequestEvaluationsAsyncInvoker(
        ListMergeRequestEvaluationsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listMergeRequestEvaluations, hcClient);
    }

    /**
     * 获取合并请求参与者
     *
     * 获取合并请求参与者
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMergeRequestParticipantsRequest 请求对象
     * @return CompletableFuture<ListMergeRequestParticipantsResponse>
     */
    public CompletableFuture<ListMergeRequestParticipantsResponse> listMergeRequestParticipantsAsync(
        ListMergeRequestParticipantsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listMergeRequestParticipants);
    }

    /**
     * 获取合并请求参与者
     *
     * 获取合并请求参与者
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMergeRequestParticipantsRequest 请求对象
     * @return AsyncInvoker<ListMergeRequestParticipantsRequest, ListMergeRequestParticipantsResponse>
     */
    public AsyncInvoker<ListMergeRequestParticipantsRequest, ListMergeRequestParticipantsResponse> listMergeRequestParticipantsAsyncInvoker(
        ListMergeRequestParticipantsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listMergeRequestParticipants, hcClient);
    }

    /**
     * 获取合并请求检视人列表
     *
     * 获取合并请求检视人列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMergeRequestReviewersRequest 请求对象
     * @return CompletableFuture<ListMergeRequestReviewersResponse>
     */
    public CompletableFuture<ListMergeRequestReviewersResponse> listMergeRequestReviewersAsync(
        ListMergeRequestReviewersRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listMergeRequestReviewers);
    }

    /**
     * 获取合并请求检视人列表
     *
     * 获取合并请求检视人列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMergeRequestReviewersRequest 请求对象
     * @return AsyncInvoker<ListMergeRequestReviewersRequest, ListMergeRequestReviewersResponse>
     */
    public AsyncInvoker<ListMergeRequestReviewersRequest, ListMergeRequestReviewersResponse> listMergeRequestReviewersAsyncInvoker(
        ListMergeRequestReviewersRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listMergeRequestReviewers, hcClient);
    }

    /**
     * 获取合并请求模板列表
     *
     * 获取合并请求模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMergeRequestTemplatesRequest 请求对象
     * @return CompletableFuture<ListMergeRequestTemplatesResponse>
     */
    public CompletableFuture<ListMergeRequestTemplatesResponse> listMergeRequestTemplatesAsync(
        ListMergeRequestTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listMergeRequestTemplates);
    }

    /**
     * 获取合并请求模板列表
     *
     * 获取合并请求模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMergeRequestTemplatesRequest 请求对象
     * @return AsyncInvoker<ListMergeRequestTemplatesRequest, ListMergeRequestTemplatesResponse>
     */
    public AsyncInvoker<ListMergeRequestTemplatesRequest, ListMergeRequestTemplatesResponse> listMergeRequestTemplatesAsyncInvoker(
        ListMergeRequestTemplatesRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listMergeRequestTemplates, hcClient);
    }

    /**
     * 获取可选的合并请求检视人
     *
     * 获取可选的合并请求检视人
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMergeRequestValidAssignedCandidatesRequest 请求对象
     * @return CompletableFuture<ListMergeRequestValidAssignedCandidatesResponse>
     */
    public CompletableFuture<ListMergeRequestValidAssignedCandidatesResponse> listMergeRequestValidAssignedCandidatesAsync(
        ListMergeRequestValidAssignedCandidatesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listMergeRequestValidAssignedCandidates);
    }

    /**
     * 获取可选的合并请求检视人
     *
     * 获取可选的合并请求检视人
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMergeRequestValidAssignedCandidatesRequest 请求对象
     * @return AsyncInvoker<ListMergeRequestValidAssignedCandidatesRequest, ListMergeRequestValidAssignedCandidatesResponse>
     */
    public AsyncInvoker<ListMergeRequestValidAssignedCandidatesRequest, ListMergeRequestValidAssignedCandidatesResponse> listMergeRequestValidAssignedCandidatesAsyncInvoker(
        ListMergeRequestValidAssignedCandidatesRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listMergeRequestValidAssignedCandidates, hcClient);
    }

    /**
     * 获取文件变更历史版本列表
     *
     * 获取文件变更历史版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMergeRequestVersionsRequest 请求对象
     * @return CompletableFuture<ListMergeRequestVersionsResponse>
     */
    public CompletableFuture<ListMergeRequestVersionsResponse> listMergeRequestVersionsAsync(
        ListMergeRequestVersionsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listMergeRequestVersions);
    }

    /**
     * 获取文件变更历史版本列表
     *
     * 获取文件变更历史版本列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListMergeRequestVersionsRequest 请求对象
     * @return AsyncInvoker<ListMergeRequestVersionsRequest, ListMergeRequestVersionsResponse>
     */
    public AsyncInvoker<ListMergeRequestVersionsRequest, ListMergeRequestVersionsResponse> listMergeRequestVersionsAsyncInvoker(
        ListMergeRequestVersionsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listMergeRequestVersions, hcClient);
    }

    /**
     * 获取个人首页mr列表
     *
     * 获取个人首页mr列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPersonalMergeRequestsRequest 请求对象
     * @return CompletableFuture<ListPersonalMergeRequestsResponse>
     */
    public CompletableFuture<ListPersonalMergeRequestsResponse> listPersonalMergeRequestsAsync(
        ListPersonalMergeRequestsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listPersonalMergeRequests);
    }

    /**
     * 获取个人首页mr列表
     *
     * 获取个人首页mr列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPersonalMergeRequestsRequest 请求对象
     * @return AsyncInvoker<ListPersonalMergeRequestsRequest, ListPersonalMergeRequestsResponse>
     */
    public AsyncInvoker<ListPersonalMergeRequestsRequest, ListPersonalMergeRequestsResponse> listPersonalMergeRequestsAsyncInvoker(
        ListPersonalMergeRequestsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listPersonalMergeRequests, hcClient);
    }

    /**
     * 获取项目合并请求审核设置列表
     *
     * 获取项目合并请求审核设置列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectMergeRequestApproverSettingsRequest 请求对象
     * @return CompletableFuture<ListProjectMergeRequestApproverSettingsResponse>
     */
    public CompletableFuture<ListProjectMergeRequestApproverSettingsResponse> listProjectMergeRequestApproverSettingsAsync(
        ListProjectMergeRequestApproverSettingsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listProjectMergeRequestApproverSettings);
    }

    /**
     * 获取项目合并请求审核设置列表
     *
     * 获取项目合并请求审核设置列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectMergeRequestApproverSettingsRequest 请求对象
     * @return AsyncInvoker<ListProjectMergeRequestApproverSettingsRequest, ListProjectMergeRequestApproverSettingsResponse>
     */
    public AsyncInvoker<ListProjectMergeRequestApproverSettingsRequest, ListProjectMergeRequestApproverSettingsResponse> listProjectMergeRequestApproverSettingsAsyncInvoker(
        ListProjectMergeRequestApproverSettingsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listProjectMergeRequestApproverSettings, hcClient);
    }

    /**
     * 获取项目检视人
     *
     * 获取代码组检视人
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectMergeRequestCanBeAssignedReviewersRequest 请求对象
     * @return CompletableFuture<ListProjectMergeRequestCanBeAssignedReviewersResponse>
     */
    public CompletableFuture<ListProjectMergeRequestCanBeAssignedReviewersResponse> listProjectMergeRequestCanBeAssignedReviewersAsync(
        ListProjectMergeRequestCanBeAssignedReviewersRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listProjectMergeRequestCanBeAssignedReviewers);
    }

    /**
     * 获取项目检视人
     *
     * 获取代码组检视人
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectMergeRequestCanBeAssignedReviewersRequest 请求对象
     * @return AsyncInvoker<ListProjectMergeRequestCanBeAssignedReviewersRequest, ListProjectMergeRequestCanBeAssignedReviewersResponse>
     */
    public AsyncInvoker<ListProjectMergeRequestCanBeAssignedReviewersRequest, ListProjectMergeRequestCanBeAssignedReviewersResponse> listProjectMergeRequestCanBeAssignedReviewersAsyncInvoker(
        ListProjectMergeRequestCanBeAssignedReviewersRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listProjectMergeRequestCanBeAssignedReviewers, hcClient);
    }

    /**
     * 获取项目审核人或合并人
     *
     * 获取代码组审核人或合并人
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectMergeRequestCanBeAssignedUsersRequest 请求对象
     * @return CompletableFuture<ListProjectMergeRequestCanBeAssignedUsersResponse>
     */
    public CompletableFuture<ListProjectMergeRequestCanBeAssignedUsersResponse> listProjectMergeRequestCanBeAssignedUsersAsync(
        ListProjectMergeRequestCanBeAssignedUsersRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listProjectMergeRequestCanBeAssignedUsers);
    }

    /**
     * 获取项目审核人或合并人
     *
     * 获取代码组审核人或合并人
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectMergeRequestCanBeAssignedUsersRequest 请求对象
     * @return AsyncInvoker<ListProjectMergeRequestCanBeAssignedUsersRequest, ListProjectMergeRequestCanBeAssignedUsersResponse>
     */
    public AsyncInvoker<ListProjectMergeRequestCanBeAssignedUsersRequest, ListProjectMergeRequestCanBeAssignedUsersResponse> listProjectMergeRequestCanBeAssignedUsersAsyncInvoker(
        ListProjectMergeRequestCanBeAssignedUsersRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listProjectMergeRequestCanBeAssignedUsers, hcClient);
    }

    /**
     * 获取项目合并请求模板列表
     *
     * 获取项目合并请求模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectMergeRequestTemplatesRequest 请求对象
     * @return CompletableFuture<ListProjectMergeRequestTemplatesResponse>
     */
    public CompletableFuture<ListProjectMergeRequestTemplatesResponse> listProjectMergeRequestTemplatesAsync(
        ListProjectMergeRequestTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listProjectMergeRequestTemplates);
    }

    /**
     * 获取项目合并请求模板列表
     *
     * 获取项目合并请求模板列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectMergeRequestTemplatesRequest 请求对象
     * @return AsyncInvoker<ListProjectMergeRequestTemplatesRequest, ListProjectMergeRequestTemplatesResponse>
     */
    public AsyncInvoker<ListProjectMergeRequestTemplatesRequest, ListProjectMergeRequestTemplatesResponse> listProjectMergeRequestTemplatesAsyncInvoker(
        ListProjectMergeRequestTemplatesRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listProjectMergeRequestTemplates, hcClient);
    }

    /**
     * 获取仓库MR列表
     *
     * 获取仓库MR列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryMergeRequestsRequest 请求对象
     * @return CompletableFuture<ListRepositoryMergeRequestsResponse>
     */
    public CompletableFuture<ListRepositoryMergeRequestsResponse> listRepositoryMergeRequestsAsync(
        ListRepositoryMergeRequestsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listRepositoryMergeRequests);
    }

    /**
     * 获取仓库MR列表
     *
     * 获取仓库MR列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryMergeRequestsRequest 请求对象
     * @return AsyncInvoker<ListRepositoryMergeRequestsRequest, ListRepositoryMergeRequestsResponse>
     */
    public AsyncInvoker<ListRepositoryMergeRequestsRequest, ListRepositoryMergeRequestsResponse> listRepositoryMergeRequestsAsyncInvoker(
        ListRepositoryMergeRequestsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listRepositoryMergeRequests, hcClient);
    }

    /**
     * 合入合并请求
     *
     * 合入合并请求
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request MergeMergeRequestRequest 请求对象
     * @return CompletableFuture<MergeMergeRequestResponse>
     */
    public CompletableFuture<MergeMergeRequestResponse> mergeMergeRequestAsync(MergeMergeRequestRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.mergeMergeRequest);
    }

    /**
     * 合入合并请求
     *
     * 合入合并请求
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request MergeMergeRequestRequest 请求对象
     * @return AsyncInvoker<MergeMergeRequestRequest, MergeMergeRequestResponse>
     */
    public AsyncInvoker<MergeMergeRequestRequest, MergeMergeRequestResponse> mergeMergeRequestAsyncInvoker(
        MergeMergeRequestRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.mergeMergeRequest, hcClient);
    }

    /**
     * 变基合并请求
     *
     * 变基合并请求
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RebaseMergeRequestForOpenApiRequest 请求对象
     * @return CompletableFuture<RebaseMergeRequestForOpenApiResponse>
     */
    public CompletableFuture<RebaseMergeRequestForOpenApiResponse> rebaseMergeRequestForOpenApiAsync(
        RebaseMergeRequestForOpenApiRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.rebaseMergeRequestForOpenApi);
    }

    /**
     * 变基合并请求
     *
     * 变基合并请求
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RebaseMergeRequestForOpenApiRequest 请求对象
     * @return AsyncInvoker<RebaseMergeRequestForOpenApiRequest, RebaseMergeRequestForOpenApiResponse>
     */
    public AsyncInvoker<RebaseMergeRequestForOpenApiRequest, RebaseMergeRequestForOpenApiResponse> rebaseMergeRequestForOpenApiAsyncInvoker(
        RebaseMergeRequestForOpenApiRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.rebaseMergeRequestForOpenApi, hcClient);
    }

    /**
     * 在线解决合并请求冲突
     *
     * 在线解决合并请求冲突
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResolveMergeRequestConflictsRequest 请求对象
     * @return CompletableFuture<ResolveMergeRequestConflictsResponse>
     */
    public CompletableFuture<ResolveMergeRequestConflictsResponse> resolveMergeRequestConflictsAsync(
        ResolveMergeRequestConflictsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.resolveMergeRequestConflicts);
    }

    /**
     * 在线解决合并请求冲突
     *
     * 在线解决合并请求冲突
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ResolveMergeRequestConflictsRequest 请求对象
     * @return AsyncInvoker<ResolveMergeRequestConflictsRequest, ResolveMergeRequestConflictsResponse>
     */
    public AsyncInvoker<ResolveMergeRequestConflictsRequest, ResolveMergeRequestConflictsResponse> resolveMergeRequestConflictsAsyncInvoker(
        ResolveMergeRequestConflictsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.resolveMergeRequestConflicts, hcClient);
    }

    /**
     * 检视合并请求
     *
     * 检视合并请求
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ReviewMergeRequestRequest 请求对象
     * @return CompletableFuture<ReviewMergeRequestResponse>
     */
    public CompletableFuture<ReviewMergeRequestResponse> reviewMergeRequestAsync(ReviewMergeRequestRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.reviewMergeRequest);
    }

    /**
     * 检视合并请求
     *
     * 检视合并请求
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ReviewMergeRequestRequest 请求对象
     * @return AsyncInvoker<ReviewMergeRequestRequest, ReviewMergeRequestResponse>
     */
    public AsyncInvoker<ReviewMergeRequestRequest, ReviewMergeRequestResponse> reviewMergeRequestAsyncInvoker(
        ReviewMergeRequestRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.reviewMergeRequest, hcClient);
    }

    /**
     * 获取合并请求关联的最新流水线
     *
     * 获取合并请求关联的最新流水线
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowActualHeadPipelineRequest 请求对象
     * @return CompletableFuture<ShowActualHeadPipelineResponse>
     */
    public CompletableFuture<ShowActualHeadPipelineResponse> showActualHeadPipelineAsync(
        ShowActualHeadPipelineRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.showActualHeadPipeline);
    }

    /**
     * 获取合并请求关联的最新流水线
     *
     * 获取合并请求关联的最新流水线
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowActualHeadPipelineRequest 请求对象
     * @return AsyncInvoker<ShowActualHeadPipelineRequest, ShowActualHeadPipelineResponse>
     */
    public AsyncInvoker<ShowActualHeadPipelineRequest, ShowActualHeadPipelineResponse> showActualHeadPipelineAsyncInvoker(
        ShowActualHeadPipelineRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.showActualHeadPipeline, hcClient);
    }

    /**
     * 获取合并请求的平均评价
     *
     * 获取合并请求的平均评价
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAverageEvaluationRequest 请求对象
     * @return CompletableFuture<ShowAverageEvaluationResponse>
     */
    public CompletableFuture<ShowAverageEvaluationResponse> showAverageEvaluationAsync(
        ShowAverageEvaluationRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.showAverageEvaluation);
    }

    /**
     * 获取合并请求的平均评价
     *
     * 获取合并请求的平均评价
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowAverageEvaluationRequest 请求对象
     * @return AsyncInvoker<ShowAverageEvaluationRequest, ShowAverageEvaluationResponse>
     */
    public AsyncInvoker<ShowAverageEvaluationRequest, ShowAverageEvaluationResponse> showAverageEvaluationAsyncInvoker(
        ShowAverageEvaluationRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.showAverageEvaluation, hcClient);
    }

    /**
     * 获取分支代码冲突
     *
     * 获取分支代码冲突
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBranchConflictRequest 请求对象
     * @return CompletableFuture<ShowBranchConflictResponse>
     */
    public CompletableFuture<ShowBranchConflictResponse> showBranchConflictAsync(ShowBranchConflictRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.showBranchConflict);
    }

    /**
     * 获取分支代码冲突
     *
     * 获取分支代码冲突
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBranchConflictRequest 请求对象
     * @return AsyncInvoker<ShowBranchConflictRequest, ShowBranchConflictResponse>
     */
    public AsyncInvoker<ShowBranchConflictRequest, ShowBranchConflictResponse> showBranchConflictAsyncInvoker(
        ShowBranchConflictRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.showBranchConflict, hcClient);
    }

    /**
     * 获取代码页单个提交下文件的检视意见
     *
     * 获取代码页单个提交下文件的检视意见
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCommitCommentsByLineRequest 请求对象
     * @return CompletableFuture<ShowCommitCommentsByLineResponse>
     */
    public CompletableFuture<ShowCommitCommentsByLineResponse> showCommitCommentsByLineAsync(
        ShowCommitCommentsByLineRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.showCommitCommentsByLine);
    }

    /**
     * 获取代码页单个提交下文件的检视意见
     *
     * 获取代码页单个提交下文件的检视意见
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCommitCommentsByLineRequest 请求对象
     * @return AsyncInvoker<ShowCommitCommentsByLineRequest, ShowCommitCommentsByLineResponse>
     */
    public AsyncInvoker<ShowCommitCommentsByLineRequest, ShowCommitCommentsByLineResponse> showCommitCommentsByLineAsyncInvoker(
        ShowCommitCommentsByLineRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.showCommitCommentsByLine, hcClient);
    }

    /**
     * 获取代码组合并请求设置
     *
     * 获取代码组合并请求设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGroupMergeRequestSettingRequest 请求对象
     * @return CompletableFuture<ShowGroupMergeRequestSettingResponse>
     */
    public CompletableFuture<ShowGroupMergeRequestSettingResponse> showGroupMergeRequestSettingAsync(
        ShowGroupMergeRequestSettingRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.showGroupMergeRequestSetting);
    }

    /**
     * 获取代码组合并请求设置
     *
     * 获取代码组合并请求设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGroupMergeRequestSettingRequest 请求对象
     * @return AsyncInvoker<ShowGroupMergeRequestSettingRequest, ShowGroupMergeRequestSettingResponse>
     */
    public AsyncInvoker<ShowGroupMergeRequestSettingRequest, ShowGroupMergeRequestSettingResponse> showGroupMergeRequestSettingAsyncInvoker(
        ShowGroupMergeRequestSettingRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.showGroupMergeRequestSetting, hcClient);
    }

    /**
     * 获取合并请求文件变更页单个文件下的检视意见
     *
     * 获取合并请求文件变更页单个文件下的检视意见
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMergeRequestCommentsByLineRequest 请求对象
     * @return CompletableFuture<ShowMergeRequestCommentsByLineResponse>
     */
    public CompletableFuture<ShowMergeRequestCommentsByLineResponse> showMergeRequestCommentsByLineAsync(
        ShowMergeRequestCommentsByLineRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.showMergeRequestCommentsByLine);
    }

    /**
     * 获取合并请求文件变更页单个文件下的检视意见
     *
     * 获取合并请求文件变更页单个文件下的检视意见
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMergeRequestCommentsByLineRequest 请求对象
     * @return AsyncInvoker<ShowMergeRequestCommentsByLineRequest, ShowMergeRequestCommentsByLineResponse>
     */
    public AsyncInvoker<ShowMergeRequestCommentsByLineRequest, ShowMergeRequestCommentsByLineResponse> showMergeRequestCommentsByLineAsyncInvoker(
        ShowMergeRequestCommentsByLineRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.showMergeRequestCommentsByLine, hcClient);
    }

    /**
     * 获取MR详情
     *
     * 获取MR详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMergeRequestDetailRequest 请求对象
     * @return CompletableFuture<ShowMergeRequestDetailResponse>
     */
    public CompletableFuture<ShowMergeRequestDetailResponse> showMergeRequestDetailAsync(
        ShowMergeRequestDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.showMergeRequestDetail);
    }

    /**
     * 获取MR详情
     *
     * 获取MR详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMergeRequestDetailRequest 请求对象
     * @return AsyncInvoker<ShowMergeRequestDetailRequest, ShowMergeRequestDetailResponse>
     */
    public AsyncInvoker<ShowMergeRequestDetailRequest, ShowMergeRequestDetailResponse> showMergeRequestDetailAsyncInvoker(
        ShowMergeRequestDetailRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.showMergeRequestDetail, hcClient);
    }

    /**
     * 获取仓库合并请求设置
     *
     * 获取仓库合并请求设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMergeRequestSettingRequest 请求对象
     * @return CompletableFuture<ShowMergeRequestSettingResponse>
     */
    public CompletableFuture<ShowMergeRequestSettingResponse> showMergeRequestSettingAsync(
        ShowMergeRequestSettingRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.showMergeRequestSetting);
    }

    /**
     * 获取仓库合并请求设置
     *
     * 获取仓库合并请求设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMergeRequestSettingRequest 请求对象
     * @return AsyncInvoker<ShowMergeRequestSettingRequest, ShowMergeRequestSettingResponse>
     */
    public AsyncInvoker<ShowMergeRequestSettingRequest, ShowMergeRequestSettingResponse> showMergeRequestSettingAsyncInvoker(
        ShowMergeRequestSettingRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.showMergeRequestSetting, hcClient);
    }

    /**
     * 获取单个合并请求模板
     *
     * 获取单个合并请求模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMergeRequestTemplateRequest 请求对象
     * @return CompletableFuture<ShowMergeRequestTemplateResponse>
     */
    public CompletableFuture<ShowMergeRequestTemplateResponse> showMergeRequestTemplateAsync(
        ShowMergeRequestTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.showMergeRequestTemplate);
    }

    /**
     * 获取单个合并请求模板
     *
     * 获取单个合并请求模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMergeRequestTemplateRequest 请求对象
     * @return AsyncInvoker<ShowMergeRequestTemplateRequest, ShowMergeRequestTemplateResponse>
     */
    public AsyncInvoker<ShowMergeRequestTemplateRequest, ShowMergeRequestTemplateResponse> showMergeRequestTemplateAsyncInvoker(
        ShowMergeRequestTemplateRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.showMergeRequestTemplate, hcClient);
    }

    /**
     * 获取合并请求打分
     *
     * 获取合并请求打分
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMergeRequestVotesDetailRequest 请求对象
     * @return CompletableFuture<ShowMergeRequestVotesDetailResponse>
     */
    public CompletableFuture<ShowMergeRequestVotesDetailResponse> showMergeRequestVotesDetailAsync(
        ShowMergeRequestVotesDetailRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.showMergeRequestVotesDetail);
    }

    /**
     * 获取合并请求打分
     *
     * 获取合并请求打分
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMergeRequestVotesDetailRequest 请求对象
     * @return AsyncInvoker<ShowMergeRequestVotesDetailRequest, ShowMergeRequestVotesDetailResponse>
     */
    public AsyncInvoker<ShowMergeRequestVotesDetailRequest, ShowMergeRequestVotesDetailResponse> showMergeRequestVotesDetailAsyncInvoker(
        ShowMergeRequestVotesDetailRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.showMergeRequestVotesDetail, hcClient);
    }

    /**
     * 获取合并请求的可合入状态。
     *
     * 获取合并请求的可合入状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMergeableStateOuterRequest 请求对象
     * @return CompletableFuture<ShowMergeableStateOuterResponse>
     */
    public CompletableFuture<ShowMergeableStateOuterResponse> showMergeableStateOuterAsync(
        ShowMergeableStateOuterRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.showMergeableStateOuter);
    }

    /**
     * 获取合并请求的可合入状态。
     *
     * 获取合并请求的可合入状态。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowMergeableStateOuterRequest 请求对象
     * @return AsyncInvoker<ShowMergeableStateOuterRequest, ShowMergeableStateOuterResponse>
     */
    public AsyncInvoker<ShowMergeableStateOuterRequest, ShowMergeableStateOuterResponse> showMergeableStateOuterAsyncInvoker(
        ShowMergeableStateOuterRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.showMergeableStateOuter, hcClient);
    }

    /**
     * 获取项目合并请求设置
     *
     * 获取项目合并请求设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectMergeRequestSettingRequest 请求对象
     * @return CompletableFuture<ShowProjectMergeRequestSettingResponse>
     */
    public CompletableFuture<ShowProjectMergeRequestSettingResponse> showProjectMergeRequestSettingAsync(
        ShowProjectMergeRequestSettingRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.showProjectMergeRequestSetting);
    }

    /**
     * 获取项目合并请求设置
     *
     * 获取项目合并请求设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectMergeRequestSettingRequest 请求对象
     * @return AsyncInvoker<ShowProjectMergeRequestSettingRequest, ShowProjectMergeRequestSettingResponse>
     */
    public AsyncInvoker<ShowProjectMergeRequestSettingRequest, ShowProjectMergeRequestSettingResponse> showProjectMergeRequestSettingAsyncInvoker(
        ShowProjectMergeRequestSettingRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.showProjectMergeRequestSetting, hcClient);
    }

    /**
     * 获取仓库合并请求统计数据
     *
     * 获取仓库合并请求统计数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryMergeRequestsStatisticRequest 请求对象
     * @return CompletableFuture<ShowRepositoryMergeRequestsStatisticResponse>
     */
    public CompletableFuture<ShowRepositoryMergeRequestsStatisticResponse> showRepositoryMergeRequestsStatisticAsync(
        ShowRepositoryMergeRequestsStatisticRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.showRepositoryMergeRequestsStatistic);
    }

    /**
     * 获取仓库合并请求统计数据
     *
     * 获取仓库合并请求统计数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryMergeRequestsStatisticRequest 请求对象
     * @return AsyncInvoker<ShowRepositoryMergeRequestsStatisticRequest, ShowRepositoryMergeRequestsStatisticResponse>
     */
    public AsyncInvoker<ShowRepositoryMergeRequestsStatisticRequest, ShowRepositoryMergeRequestsStatisticResponse> showRepositoryMergeRequestsStatisticAsyncInvoker(
        ShowRepositoryMergeRequestsStatisticRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.showRepositoryMergeRequestsStatistic, hcClient);
    }

    /**
     * 更新代码组合并请求审核设置
     *
     * 更新代码组合并请求审核设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGroupMergeRequestApproverSettingRequest 请求对象
     * @return CompletableFuture<UpdateGroupMergeRequestApproverSettingResponse>
     */
    public CompletableFuture<UpdateGroupMergeRequestApproverSettingResponse> updateGroupMergeRequestApproverSettingAsync(
        UpdateGroupMergeRequestApproverSettingRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.updateGroupMergeRequestApproverSetting);
    }

    /**
     * 更新代码组合并请求审核设置
     *
     * 更新代码组合并请求审核设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGroupMergeRequestApproverSettingRequest 请求对象
     * @return AsyncInvoker<UpdateGroupMergeRequestApproverSettingRequest, UpdateGroupMergeRequestApproverSettingResponse>
     */
    public AsyncInvoker<UpdateGroupMergeRequestApproverSettingRequest, UpdateGroupMergeRequestApproverSettingResponse> updateGroupMergeRequestApproverSettingAsyncInvoker(
        UpdateGroupMergeRequestApproverSettingRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.updateGroupMergeRequestApproverSetting, hcClient);
    }

    /**
     * 更新代码组合并请求模板
     *
     * 更新代码组合并请求模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGroupMergeRequestTemplateRequest 请求对象
     * @return CompletableFuture<UpdateGroupMergeRequestTemplateResponse>
     */
    public CompletableFuture<UpdateGroupMergeRequestTemplateResponse> updateGroupMergeRequestTemplateAsync(
        UpdateGroupMergeRequestTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.updateGroupMergeRequestTemplate);
    }

    /**
     * 更新代码组合并请求模板
     *
     * 更新代码组合并请求模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGroupMergeRequestTemplateRequest 请求对象
     * @return AsyncInvoker<UpdateGroupMergeRequestTemplateRequest, UpdateGroupMergeRequestTemplateResponse>
     */
    public AsyncInvoker<UpdateGroupMergeRequestTemplateRequest, UpdateGroupMergeRequestTemplateResponse> updateGroupMergeRequestTemplateAsyncInvoker(
        UpdateGroupMergeRequestTemplateRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.updateGroupMergeRequestTemplate, hcClient);
    }

    /**
     * 更新合并请求
     *
     * 更新合并请求
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMergeRequestRequest 请求对象
     * @return CompletableFuture<UpdateMergeRequestResponse>
     */
    public CompletableFuture<UpdateMergeRequestResponse> updateMergeRequestAsync(UpdateMergeRequestRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.updateMergeRequest);
    }

    /**
     * 更新合并请求
     *
     * 更新合并请求
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMergeRequestRequest 请求对象
     * @return AsyncInvoker<UpdateMergeRequestRequest, UpdateMergeRequestResponse>
     */
    public AsyncInvoker<UpdateMergeRequestRequest, UpdateMergeRequestResponse> updateMergeRequestAsyncInvoker(
        UpdateMergeRequestRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.updateMergeRequest, hcClient);
    }

    /**
     * 更新合并请求审核设置
     *
     * 更新合并请求审核设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMergeRequestApproverSettingRequest 请求对象
     * @return CompletableFuture<UpdateMergeRequestApproverSettingResponse>
     */
    public CompletableFuture<UpdateMergeRequestApproverSettingResponse> updateMergeRequestApproverSettingAsync(
        UpdateMergeRequestApproverSettingRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.updateMergeRequestApproverSetting);
    }

    /**
     * 更新合并请求审核设置
     *
     * 更新合并请求审核设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMergeRequestApproverSettingRequest 请求对象
     * @return AsyncInvoker<UpdateMergeRequestApproverSettingRequest, UpdateMergeRequestApproverSettingResponse>
     */
    public AsyncInvoker<UpdateMergeRequestApproverSettingRequest, UpdateMergeRequestApproverSettingResponse> updateMergeRequestApproverSettingAsyncInvoker(
        UpdateMergeRequestApproverSettingRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.updateMergeRequestApproverSetting, hcClient);
    }

    /**
     * 更新合并请求的审核人列表
     *
     * 更新合并请求的审核人列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMergeRequestApproversRequest 请求对象
     * @return CompletableFuture<UpdateMergeRequestApproversResponse>
     */
    public CompletableFuture<UpdateMergeRequestApproversResponse> updateMergeRequestApproversAsync(
        UpdateMergeRequestApproversRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.updateMergeRequestApprovers);
    }

    /**
     * 更新合并请求的审核人列表
     *
     * 更新合并请求的审核人列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMergeRequestApproversRequest 请求对象
     * @return AsyncInvoker<UpdateMergeRequestApproversRequest, UpdateMergeRequestApproversResponse>
     */
    public AsyncInvoker<UpdateMergeRequestApproversRequest, UpdateMergeRequestApproversResponse> updateMergeRequestApproversAsyncInvoker(
        UpdateMergeRequestApproversRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.updateMergeRequestApprovers, hcClient);
    }

    /**
     * 更新合并请求的检视人列表
     *
     * 更新合并请求的检视人列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMergeRequestReviewersRequest 请求对象
     * @return CompletableFuture<UpdateMergeRequestReviewersResponse>
     */
    public CompletableFuture<UpdateMergeRequestReviewersResponse> updateMergeRequestReviewersAsync(
        UpdateMergeRequestReviewersRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.updateMergeRequestReviewers);
    }

    /**
     * 更新合并请求的检视人列表
     *
     * 更新合并请求的检视人列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMergeRequestReviewersRequest 请求对象
     * @return AsyncInvoker<UpdateMergeRequestReviewersRequest, UpdateMergeRequestReviewersResponse>
     */
    public AsyncInvoker<UpdateMergeRequestReviewersRequest, UpdateMergeRequestReviewersResponse> updateMergeRequestReviewersAsyncInvoker(
        UpdateMergeRequestReviewersRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.updateMergeRequestReviewers, hcClient);
    }

    /**
     * 更新仓库合并请求设置
     *
     * 更新仓库合并请求设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMergeRequestSettingRequest 请求对象
     * @return CompletableFuture<UpdateMergeRequestSettingResponse>
     */
    public CompletableFuture<UpdateMergeRequestSettingResponse> updateMergeRequestSettingAsync(
        UpdateMergeRequestSettingRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.updateMergeRequestSetting);
    }

    /**
     * 更新仓库合并请求设置
     *
     * 更新仓库合并请求设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMergeRequestSettingRequest 请求对象
     * @return AsyncInvoker<UpdateMergeRequestSettingRequest, UpdateMergeRequestSettingResponse>
     */
    public AsyncInvoker<UpdateMergeRequestSettingRequest, UpdateMergeRequestSettingResponse> updateMergeRequestSettingAsyncInvoker(
        UpdateMergeRequestSettingRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.updateMergeRequestSetting, hcClient);
    }

    /**
     * 更新合并请求模板
     *
     * 更新合并请求模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMergeRequestTemplateRequest 请求对象
     * @return CompletableFuture<UpdateMergeRequestTemplateResponse>
     */
    public CompletableFuture<UpdateMergeRequestTemplateResponse> updateMergeRequestTemplateAsync(
        UpdateMergeRequestTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.updateMergeRequestTemplate);
    }

    /**
     * 更新合并请求模板
     *
     * 更新合并请求模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMergeRequestTemplateRequest 请求对象
     * @return AsyncInvoker<UpdateMergeRequestTemplateRequest, UpdateMergeRequestTemplateResponse>
     */
    public AsyncInvoker<UpdateMergeRequestTemplateRequest, UpdateMergeRequestTemplateResponse> updateMergeRequestTemplateAsyncInvoker(
        UpdateMergeRequestTemplateRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.updateMergeRequestTemplate, hcClient);
    }

    /**
     * 更新合并请求打分
     *
     * 更新合并请求打分
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMergeRequestVoteRequest 请求对象
     * @return CompletableFuture<UpdateMergeRequestVoteResponse>
     */
    public CompletableFuture<UpdateMergeRequestVoteResponse> updateMergeRequestVoteAsync(
        UpdateMergeRequestVoteRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.updateMergeRequestVote);
    }

    /**
     * 更新合并请求打分
     *
     * 更新合并请求打分
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateMergeRequestVoteRequest 请求对象
     * @return AsyncInvoker<UpdateMergeRequestVoteRequest, UpdateMergeRequestVoteResponse>
     */
    public AsyncInvoker<UpdateMergeRequestVoteRequest, UpdateMergeRequestVoteResponse> updateMergeRequestVoteAsyncInvoker(
        UpdateMergeRequestVoteRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.updateMergeRequestVote, hcClient);
    }

    /**
     * 更新项目合并请求审核设置
     *
     * 更新项目合并请求审核设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProjectMergeRequestApproverSettingRequest 请求对象
     * @return CompletableFuture<UpdateProjectMergeRequestApproverSettingResponse>
     */
    public CompletableFuture<UpdateProjectMergeRequestApproverSettingResponse> updateProjectMergeRequestApproverSettingAsync(
        UpdateProjectMergeRequestApproverSettingRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.updateProjectMergeRequestApproverSetting);
    }

    /**
     * 更新项目合并请求审核设置
     *
     * 更新项目合并请求审核设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProjectMergeRequestApproverSettingRequest 请求对象
     * @return AsyncInvoker<UpdateProjectMergeRequestApproverSettingRequest, UpdateProjectMergeRequestApproverSettingResponse>
     */
    public AsyncInvoker<UpdateProjectMergeRequestApproverSettingRequest, UpdateProjectMergeRequestApproverSettingResponse> updateProjectMergeRequestApproverSettingAsyncInvoker(
        UpdateProjectMergeRequestApproverSettingRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.updateProjectMergeRequestApproverSetting, hcClient);
    }

    /**
     * 更新项目合并请求模板
     *
     * 更新项目合并请求模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProjectMergeRequestTemplateRequest 请求对象
     * @return CompletableFuture<UpdateProjectMergeRequestTemplateResponse>
     */
    public CompletableFuture<UpdateProjectMergeRequestTemplateResponse> updateProjectMergeRequestTemplateAsync(
        UpdateProjectMergeRequestTemplateRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.updateProjectMergeRequestTemplate);
    }

    /**
     * 更新项目合并请求模板
     *
     * 更新项目合并请求模板
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProjectMergeRequestTemplateRequest 请求对象
     * @return AsyncInvoker<UpdateProjectMergeRequestTemplateRequest, UpdateProjectMergeRequestTemplateResponse>
     */
    public AsyncInvoker<UpdateProjectMergeRequestTemplateRequest, UpdateProjectMergeRequestTemplateResponse> updateProjectMergeRequestTemplateAsyncInvoker(
        UpdateProjectMergeRequestTemplateRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.updateProjectMergeRequestTemplate, hcClient);
    }

    /**
     * 批量删除仓库文件推送权限
     *
     * 批量删除仓库文件推送权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteRepositoryFilePushPermissionsRequest 请求对象
     * @return CompletableFuture<BatchDeleteRepositoryFilePushPermissionsResponse>
     */
    public CompletableFuture<BatchDeleteRepositoryFilePushPermissionsResponse> batchDeleteRepositoryFilePushPermissionsAsync(
        BatchDeleteRepositoryFilePushPermissionsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.batchDeleteRepositoryFilePushPermissions);
    }

    /**
     * 批量删除仓库文件推送权限
     *
     * 批量删除仓库文件推送权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteRepositoryFilePushPermissionsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteRepositoryFilePushPermissionsRequest, BatchDeleteRepositoryFilePushPermissionsResponse>
     */
    public AsyncInvoker<BatchDeleteRepositoryFilePushPermissionsRequest, BatchDeleteRepositoryFilePushPermissionsResponse> batchDeleteRepositoryFilePushPermissionsAsyncInvoker(
        BatchDeleteRepositoryFilePushPermissionsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.batchDeleteRepositoryFilePushPermissions, hcClient);
    }

    /**
     * 批量更新仓库文件推送权限
     *
     * 批量更新仓库文件推送权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateRepositoryFilePushPermissionsRequest 请求对象
     * @return CompletableFuture<BatchUpdateRepositoryFilePushPermissionsResponse>
     */
    public CompletableFuture<BatchUpdateRepositoryFilePushPermissionsResponse> batchUpdateRepositoryFilePushPermissionsAsync(
        BatchUpdateRepositoryFilePushPermissionsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.batchUpdateRepositoryFilePushPermissions);
    }

    /**
     * 批量更新仓库文件推送权限
     *
     * 批量更新仓库文件推送权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateRepositoryFilePushPermissionsRequest 请求对象
     * @return AsyncInvoker<BatchUpdateRepositoryFilePushPermissionsRequest, BatchUpdateRepositoryFilePushPermissionsResponse>
     */
    public AsyncInvoker<BatchUpdateRepositoryFilePushPermissionsRequest, BatchUpdateRepositoryFilePushPermissionsResponse> batchUpdateRepositoryFilePushPermissionsAsyncInvoker(
        BatchUpdateRepositoryFilePushPermissionsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.batchUpdateRepositoryFilePushPermissions, hcClient);
    }

    /**
     * 创建仓库文件推送权限
     *
     * 创建仓库文件推送权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFilePushPermissionRequest 请求对象
     * @return CompletableFuture<CreateFilePushPermissionResponse>
     */
    public CompletableFuture<CreateFilePushPermissionResponse> createFilePushPermissionAsync(
        CreateFilePushPermissionRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.createFilePushPermission);
    }

    /**
     * 创建仓库文件推送权限
     *
     * 创建仓库文件推送权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateFilePushPermissionRequest 请求对象
     * @return AsyncInvoker<CreateFilePushPermissionRequest, CreateFilePushPermissionResponse>
     */
    public AsyncInvoker<CreateFilePushPermissionRequest, CreateFilePushPermissionResponse> createFilePushPermissionAsyncInvoker(
        CreateFilePushPermissionRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.createFilePushPermission, hcClient);
    }

    /**
     * 获取仓库文件推送权限列表
     *
     * 获取仓库文件推送权限列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryFilePushPermissionsRequest 请求对象
     * @return CompletableFuture<ListRepositoryFilePushPermissionsResponse>
     */
    public CompletableFuture<ListRepositoryFilePushPermissionsResponse> listRepositoryFilePushPermissionsAsync(
        ListRepositoryFilePushPermissionsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listRepositoryFilePushPermissions);
    }

    /**
     * 获取仓库文件推送权限列表
     *
     * 获取仓库文件推送权限列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryFilePushPermissionsRequest 请求对象
     * @return AsyncInvoker<ListRepositoryFilePushPermissionsRequest, ListRepositoryFilePushPermissionsResponse>
     */
    public AsyncInvoker<ListRepositoryFilePushPermissionsRequest, ListRepositoryFilePushPermissionsResponse> listRepositoryFilePushPermissionsAsyncInvoker(
        ListRepositoryFilePushPermissionsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listRepositoryFilePushPermissions, hcClient);
    }

    /**
     * 查询仓库权限矩阵配置
     *
     * 查询仓库权限矩阵配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryResourcePermissionsRequest 请求对象
     * @return CompletableFuture<ListRepositoryResourcePermissionsResponse>
     */
    public CompletableFuture<ListRepositoryResourcePermissionsResponse> listRepositoryResourcePermissionsAsync(
        ListRepositoryResourcePermissionsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listRepositoryResourcePermissions);
    }

    /**
     * 查询仓库权限矩阵配置
     *
     * 查询仓库权限矩阵配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryResourcePermissionsRequest 请求对象
     * @return AsyncInvoker<ListRepositoryResourcePermissionsRequest, ListRepositoryResourcePermissionsResponse>
     */
    public AsyncInvoker<ListRepositoryResourcePermissionsRequest, ListRepositoryResourcePermissionsResponse> listRepositoryResourcePermissionsAsyncInvoker(
        ListRepositoryResourcePermissionsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listRepositoryResourcePermissions, hcClient);
    }

    /**
     * 查询仓库权限配置信息
     *
     * 查询仓库权限配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryPermissionInheritEnabledRequest 请求对象
     * @return CompletableFuture<ShowRepositoryPermissionInheritEnabledResponse>
     */
    public CompletableFuture<ShowRepositoryPermissionInheritEnabledResponse> showRepositoryPermissionInheritEnabledAsync(
        ShowRepositoryPermissionInheritEnabledRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.showRepositoryPermissionInheritEnabled);
    }

    /**
     * 查询仓库权限配置信息
     *
     * 查询仓库权限配置信息。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryPermissionInheritEnabledRequest 请求对象
     * @return AsyncInvoker<ShowRepositoryPermissionInheritEnabledRequest, ShowRepositoryPermissionInheritEnabledResponse>
     */
    public AsyncInvoker<ShowRepositoryPermissionInheritEnabledRequest, ShowRepositoryPermissionInheritEnabledResponse> showRepositoryPermissionInheritEnabledAsyncInvoker(
        ShowRepositoryPermissionInheritEnabledRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.showRepositoryPermissionInheritEnabled, hcClient);
    }

    /**
     * 更新仓库权限继承配置
     *
     * 更新仓库权限继承配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRepositoryPermissionInheritEnabledRequest 请求对象
     * @return CompletableFuture<UpdateRepositoryPermissionInheritEnabledResponse>
     */
    public CompletableFuture<UpdateRepositoryPermissionInheritEnabledResponse> updateRepositoryPermissionInheritEnabledAsync(
        UpdateRepositoryPermissionInheritEnabledRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.updateRepositoryPermissionInheritEnabled);
    }

    /**
     * 更新仓库权限继承配置
     *
     * 更新仓库权限继承配置。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRepositoryPermissionInheritEnabledRequest 请求对象
     * @return AsyncInvoker<UpdateRepositoryPermissionInheritEnabledRequest, UpdateRepositoryPermissionInheritEnabledResponse>
     */
    public AsyncInvoker<UpdateRepositoryPermissionInheritEnabledRequest, UpdateRepositoryPermissionInheritEnabledResponse> updateRepositoryPermissionInheritEnabledAsyncInvoker(
        UpdateRepositoryPermissionInheritEnabledRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.updateRepositoryPermissionInheritEnabled, hcClient);
    }

    /**
     * 更新仓库权限矩阵配置
     *
     * 更新仓库权限矩阵配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRepositoryResourcePermissionsRequest 请求对象
     * @return CompletableFuture<UpdateRepositoryResourcePermissionsResponse>
     */
    public CompletableFuture<UpdateRepositoryResourcePermissionsResponse> updateRepositoryResourcePermissionsAsync(
        UpdateRepositoryResourcePermissionsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.updateRepositoryResourcePermissions);
    }

    /**
     * 更新仓库权限矩阵配置
     *
     * 更新仓库权限矩阵配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRepositoryResourcePermissionsRequest 请求对象
     * @return AsyncInvoker<UpdateRepositoryResourcePermissionsRequest, UpdateRepositoryResourcePermissionsResponse>
     */
    public AsyncInvoker<UpdateRepositoryResourcePermissionsRequest, UpdateRepositoryResourcePermissionsResponse> updateRepositoryResourcePermissionsAsyncInvoker(
        UpdateRepositoryResourcePermissionsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.updateRepositoryResourcePermissions, hcClient);
    }

    /**
     * 获取流水线的关联的最新任务
     *
     * 获取流水线的关联的最新任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLatestPipelineJobsRequest 请求对象
     * @return CompletableFuture<ListLatestPipelineJobsResponse>
     */
    public CompletableFuture<ListLatestPipelineJobsResponse> listLatestPipelineJobsAsync(
        ListLatestPipelineJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listLatestPipelineJobs);
    }

    /**
     * 获取流水线的关联的最新任务
     *
     * 获取流水线的关联的最新任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListLatestPipelineJobsRequest 请求对象
     * @return AsyncInvoker<ListLatestPipelineJobsRequest, ListLatestPipelineJobsResponse>
     */
    public AsyncInvoker<ListLatestPipelineJobsRequest, ListLatestPipelineJobsResponse> listLatestPipelineJobsAsyncInvoker(
        ListLatestPipelineJobsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listLatestPipelineJobs, hcClient);
    }

    /**
     * 获取流水线的关联的任务列表
     *
     * 获取流水线的关联的任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPipelineJobsRequest 请求对象
     * @return CompletableFuture<ListPipelineJobsResponse>
     */
    public CompletableFuture<ListPipelineJobsResponse> listPipelineJobsAsync(ListPipelineJobsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listPipelineJobs);
    }

    /**
     * 获取流水线的关联的任务列表
     *
     * 获取流水线的关联的任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPipelineJobsRequest 请求对象
     * @return AsyncInvoker<ListPipelineJobsRequest, ListPipelineJobsResponse>
     */
    public AsyncInvoker<ListPipelineJobsRequest, ListPipelineJobsResponse> listPipelineJobsAsyncInvoker(
        ListPipelineJobsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listPipelineJobs, hcClient);
    }

    /**
     * 工作项关联的提交信息
     *
     * 工作项关联的提交信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListItemCommitsRequest 请求对象
     * @return CompletableFuture<ListItemCommitsResponse>
     */
    public CompletableFuture<ListItemCommitsResponse> listItemCommitsAsync(ListItemCommitsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listItemCommits);
    }

    /**
     * 工作项关联的提交信息
     *
     * 工作项关联的提交信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListItemCommitsRequest 请求对象
     * @return AsyncInvoker<ListItemCommitsRequest, ListItemCommitsResponse>
     */
    public AsyncInvoker<ListItemCommitsRequest, ListItemCommitsResponse> listItemCommitsAsyncInvoker(
        ListItemCommitsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listItemCommits, hcClient);
    }

    /**
     * 获取项目下的代码组和仓库列表
     *
     * 获取项目下的代码组和仓库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectSubgroupsAndRepositoriesRequest 请求对象
     * @return CompletableFuture<ListProjectSubgroupsAndRepositoriesResponse>
     */
    public CompletableFuture<ListProjectSubgroupsAndRepositoriesResponse> listProjectSubgroupsAndRepositoriesAsync(
        ListProjectSubgroupsAndRepositoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listProjectSubgroupsAndRepositories);
    }

    /**
     * 获取项目下的代码组和仓库列表
     *
     * 获取项目下的代码组和仓库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectSubgroupsAndRepositoriesRequest 请求对象
     * @return AsyncInvoker<ListProjectSubgroupsAndRepositoriesRequest, ListProjectSubgroupsAndRepositoriesResponse>
     */
    public AsyncInvoker<ListProjectSubgroupsAndRepositoriesRequest, ListProjectSubgroupsAndRepositoriesResponse> listProjectSubgroupsAndRepositoriesAsyncInvoker(
        ListProjectSubgroupsAndRepositoriesRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listProjectSubgroupsAndRepositories, hcClient);
    }

    /**
     * 获取指定项目的基本设置信息
     *
     * 获取指定项目的基本设置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectGeneralPolicyRequest 请求对象
     * @return CompletableFuture<ShowProjectGeneralPolicyResponse>
     */
    public CompletableFuture<ShowProjectGeneralPolicyResponse> showProjectGeneralPolicyAsync(
        ShowProjectGeneralPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.showProjectGeneralPolicy);
    }

    /**
     * 获取指定项目的基本设置信息
     *
     * 获取指定项目的基本设置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectGeneralPolicyRequest 请求对象
     * @return AsyncInvoker<ShowProjectGeneralPolicyRequest, ShowProjectGeneralPolicyResponse>
     */
    public AsyncInvoker<ShowProjectGeneralPolicyRequest, ShowProjectGeneralPolicyResponse> showProjectGeneralPolicyAsyncInvoker(
        ShowProjectGeneralPolicyRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.showProjectGeneralPolicy, hcClient);
    }

    /**
     * 获取项目成员设置
     *
     * 获取项目成员设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectMemberSettingRequest 请求对象
     * @return CompletableFuture<ShowProjectMemberSettingResponse>
     */
    public CompletableFuture<ShowProjectMemberSettingResponse> showProjectMemberSettingAsync(
        ShowProjectMemberSettingRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.showProjectMemberSetting);
    }

    /**
     * 获取项目成员设置
     *
     * 获取项目成员设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectMemberSettingRequest 请求对象
     * @return AsyncInvoker<ShowProjectMemberSettingRequest, ShowProjectMemberSettingResponse>
     */
    public AsyncInvoker<ShowProjectMemberSettingRequest, ShowProjectMemberSettingResponse> showProjectMemberSettingAsyncInvoker(
        ShowProjectMemberSettingRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.showProjectMemberSetting, hcClient);
    }

    /**
     * 获取项目继承设置项
     *
     * 获取项目继承设置项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectSettingsInheritCfgRequest 请求对象
     * @return CompletableFuture<ShowProjectSettingsInheritCfgResponse>
     */
    public CompletableFuture<ShowProjectSettingsInheritCfgResponse> showProjectSettingsInheritCfgAsync(
        ShowProjectSettingsInheritCfgRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.showProjectSettingsInheritCfg);
    }

    /**
     * 获取项目继承设置项
     *
     * 获取项目继承设置项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectSettingsInheritCfgRequest 请求对象
     * @return AsyncInvoker<ShowProjectSettingsInheritCfgRequest, ShowProjectSettingsInheritCfgResponse>
     */
    public AsyncInvoker<ShowProjectSettingsInheritCfgRequest, ShowProjectSettingsInheritCfgResponse> showProjectSettingsInheritCfgAsyncInvoker(
        ShowProjectSettingsInheritCfgRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.showProjectSettingsInheritCfg, hcClient);
    }

    /**
     * 获取项目水印设置
     *
     * 获取项目水印设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectWatermarkRequest 请求对象
     * @return CompletableFuture<ShowProjectWatermarkResponse>
     */
    public CompletableFuture<ShowProjectWatermarkResponse> showProjectWatermarkAsync(
        ShowProjectWatermarkRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.showProjectWatermark);
    }

    /**
     * 获取项目水印设置
     *
     * 获取项目水印设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectWatermarkRequest 请求对象
     * @return AsyncInvoker<ShowProjectWatermarkRequest, ShowProjectWatermarkResponse>
     */
    public AsyncInvoker<ShowProjectWatermarkRequest, ShowProjectWatermarkResponse> showProjectWatermarkAsyncInvoker(
        ShowProjectWatermarkRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.showProjectWatermark, hcClient);
    }

    /**
     * 获取指定项目的基本设置信息
     *
     * 获取指定项目的基本设置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectsGeneralPolicyRequest 请求对象
     * @return CompletableFuture<ShowProjectsGeneralPolicyResponse>
     */
    public CompletableFuture<ShowProjectsGeneralPolicyResponse> showProjectsGeneralPolicyAsync(
        ShowProjectsGeneralPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.showProjectsGeneralPolicy);
    }

    /**
     * 获取指定项目的基本设置信息
     *
     * 获取指定项目的基本设置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectsGeneralPolicyRequest 请求对象
     * @return AsyncInvoker<ShowProjectsGeneralPolicyRequest, ShowProjectsGeneralPolicyResponse>
     */
    public AsyncInvoker<ShowProjectsGeneralPolicyRequest, ShowProjectsGeneralPolicyResponse> showProjectsGeneralPolicyAsyncInvoker(
        ShowProjectsGeneralPolicyRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.showProjectsGeneralPolicy, hcClient);
    }

    /**
     * 获取资源点对应的角色和权限
     *
     * 获取资源点对应的角色和权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourcePermissionsRequest 请求对象
     * @return CompletableFuture<ShowResourcePermissionsResponse>
     */
    public CompletableFuture<ShowResourcePermissionsResponse> showResourcePermissionsAsync(
        ShowResourcePermissionsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.showResourcePermissions);
    }

    /**
     * 获取资源点对应的角色和权限
     *
     * 获取资源点对应的角色和权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowResourcePermissionsRequest 请求对象
     * @return AsyncInvoker<ShowResourcePermissionsRequest, ShowResourcePermissionsResponse>
     */
    public AsyncInvoker<ShowResourcePermissionsRequest, ShowResourcePermissionsResponse> showResourcePermissionsAsyncInvoker(
        ShowResourcePermissionsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.showResourcePermissions, hcClient);
    }

    /**
     * 更新项目的基本设置信息
     *
     * 更新项目的基本设置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProjectGeneralPolicyRequest 请求对象
     * @return CompletableFuture<UpdateProjectGeneralPolicyResponse>
     */
    public CompletableFuture<UpdateProjectGeneralPolicyResponse> updateProjectGeneralPolicyAsync(
        UpdateProjectGeneralPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.updateProjectGeneralPolicy);
    }

    /**
     * 更新项目的基本设置信息
     *
     * 更新项目的基本设置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProjectGeneralPolicyRequest 请求对象
     * @return AsyncInvoker<UpdateProjectGeneralPolicyRequest, UpdateProjectGeneralPolicyResponse>
     */
    public AsyncInvoker<UpdateProjectGeneralPolicyRequest, UpdateProjectGeneralPolicyResponse> updateProjectGeneralPolicyAsyncInvoker(
        UpdateProjectGeneralPolicyRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.updateProjectGeneralPolicy, hcClient);
    }

    /**
     * 更新项目继承设置项
     *
     * 更新项目继承设置项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProjectSettingsInheritCfgRequest 请求对象
     * @return CompletableFuture<UpdateProjectSettingsInheritCfgResponse>
     */
    public CompletableFuture<UpdateProjectSettingsInheritCfgResponse> updateProjectSettingsInheritCfgAsync(
        UpdateProjectSettingsInheritCfgRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.updateProjectSettingsInheritCfg);
    }

    /**
     * 更新项目继承设置项
     *
     * 更新项目继承设置项
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProjectSettingsInheritCfgRequest 请求对象
     * @return AsyncInvoker<UpdateProjectSettingsInheritCfgRequest, UpdateProjectSettingsInheritCfgResponse>
     */
    public AsyncInvoker<UpdateProjectSettingsInheritCfgRequest, UpdateProjectSettingsInheritCfgResponse> updateProjectSettingsInheritCfgAsyncInvoker(
        UpdateProjectSettingsInheritCfgRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.updateProjectSettingsInheritCfg, hcClient);
    }

    /**
     * 更新项目水印设置
     *
     * 更新项目水印设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProjectWatermarkRequest 请求对象
     * @return CompletableFuture<UpdateProjectWatermarkResponse>
     */
    public CompletableFuture<UpdateProjectWatermarkResponse> updateProjectWatermarkAsync(
        UpdateProjectWatermarkRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.updateProjectWatermark);
    }

    /**
     * 更新项目水印设置
     *
     * 更新项目水印设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProjectWatermarkRequest 请求对象
     * @return AsyncInvoker<UpdateProjectWatermarkRequest, UpdateProjectWatermarkResponse>
     */
    public AsyncInvoker<UpdateProjectWatermarkRequest, UpdateProjectWatermarkResponse> updateProjectWatermarkAsyncInvoker(
        UpdateProjectWatermarkRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.updateProjectWatermark, hcClient);
    }

    /**
     * 批量创建仓库保护分支
     *
     * 批量创建仓库保护分支
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateProtectedBranchRequest 请求对象
     * @return CompletableFuture<BatchCreateProtectedBranchResponse>
     */
    public CompletableFuture<BatchCreateProtectedBranchResponse> batchCreateProtectedBranchAsync(
        BatchCreateProtectedBranchRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.batchCreateProtectedBranch);
    }

    /**
     * 批量创建仓库保护分支
     *
     * 批量创建仓库保护分支
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateProtectedBranchRequest 请求对象
     * @return AsyncInvoker<BatchCreateProtectedBranchRequest, BatchCreateProtectedBranchResponse>
     */
    public AsyncInvoker<BatchCreateProtectedBranchRequest, BatchCreateProtectedBranchResponse> batchCreateProtectedBranchAsyncInvoker(
        BatchCreateProtectedBranchRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.batchCreateProtectedBranch, hcClient);
    }

    /**
     * 批量创建仓库保护Tag
     *
     * 批量创建仓库保护Tag
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateProtectedTagsRequest 请求对象
     * @return CompletableFuture<BatchCreateProtectedTagsResponse>
     */
    public CompletableFuture<BatchCreateProtectedTagsResponse> batchCreateProtectedTagsAsync(
        BatchCreateProtectedTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.batchCreateProtectedTags);
    }

    /**
     * 批量创建仓库保护Tag
     *
     * 批量创建仓库保护Tag
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchCreateProtectedTagsRequest 请求对象
     * @return AsyncInvoker<BatchCreateProtectedTagsRequest, BatchCreateProtectedTagsResponse>
     */
    public AsyncInvoker<BatchCreateProtectedTagsRequest, BatchCreateProtectedTagsResponse> batchCreateProtectedTagsAsyncInvoker(
        BatchCreateProtectedTagsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.batchCreateProtectedTags, hcClient);
    }

    /**
     * 批量删除仓库保护分支
     *
     * 批量删除仓库保护分支
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteProtectedBranchesRequest 请求对象
     * @return CompletableFuture<BatchDeleteProtectedBranchesResponse>
     */
    public CompletableFuture<BatchDeleteProtectedBranchesResponse> batchDeleteProtectedBranchesAsync(
        BatchDeleteProtectedBranchesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.batchDeleteProtectedBranches);
    }

    /**
     * 批量删除仓库保护分支
     *
     * 批量删除仓库保护分支
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteProtectedBranchesRequest 请求对象
     * @return AsyncInvoker<BatchDeleteProtectedBranchesRequest, BatchDeleteProtectedBranchesResponse>
     */
    public AsyncInvoker<BatchDeleteProtectedBranchesRequest, BatchDeleteProtectedBranchesResponse> batchDeleteProtectedBranchesAsyncInvoker(
        BatchDeleteProtectedBranchesRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.batchDeleteProtectedBranches, hcClient);
    }

    /**
     * 批量删除仓库保护Tag
     *
     * 批量删除仓库保护Tag
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteProtectedTagsRequest 请求对象
     * @return CompletableFuture<BatchDeleteProtectedTagsResponse>
     */
    public CompletableFuture<BatchDeleteProtectedTagsResponse> batchDeleteProtectedTagsAsync(
        BatchDeleteProtectedTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.batchDeleteProtectedTags);
    }

    /**
     * 批量删除仓库保护Tag
     *
     * 批量删除仓库保护Tag
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteProtectedTagsRequest 请求对象
     * @return AsyncInvoker<BatchDeleteProtectedTagsRequest, BatchDeleteProtectedTagsResponse>
     */
    public AsyncInvoker<BatchDeleteProtectedTagsRequest, BatchDeleteProtectedTagsResponse> batchDeleteProtectedTagsAsyncInvoker(
        BatchDeleteProtectedTagsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.batchDeleteProtectedTags, hcClient);
    }

    /**
     * 批量更新仓库保护分支
     *
     * 批量更新仓库保护分支
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateProtectedBranchesRequest 请求对象
     * @return CompletableFuture<BatchUpdateProtectedBranchesResponse>
     */
    public CompletableFuture<BatchUpdateProtectedBranchesResponse> batchUpdateProtectedBranchesAsync(
        BatchUpdateProtectedBranchesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.batchUpdateProtectedBranches);
    }

    /**
     * 批量更新仓库保护分支
     *
     * 批量更新仓库保护分支
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateProtectedBranchesRequest 请求对象
     * @return AsyncInvoker<BatchUpdateProtectedBranchesRequest, BatchUpdateProtectedBranchesResponse>
     */
    public AsyncInvoker<BatchUpdateProtectedBranchesRequest, BatchUpdateProtectedBranchesResponse> batchUpdateProtectedBranchesAsyncInvoker(
        BatchUpdateProtectedBranchesRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.batchUpdateProtectedBranches, hcClient);
    }

    /**
     * 批量更新仓库保护Tag
     *
     * 批量更新仓库保护Tag
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateProtectedTagsRequest 请求对象
     * @return CompletableFuture<BatchUpdateProtectedTagsResponse>
     */
    public CompletableFuture<BatchUpdateProtectedTagsResponse> batchUpdateProtectedTagsAsync(
        BatchUpdateProtectedTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.batchUpdateProtectedTags);
    }

    /**
     * 批量更新仓库保护Tag
     *
     * 批量更新仓库保护Tag
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchUpdateProtectedTagsRequest 请求对象
     * @return AsyncInvoker<BatchUpdateProtectedTagsRequest, BatchUpdateProtectedTagsResponse>
     */
    public AsyncInvoker<BatchUpdateProtectedTagsRequest, BatchUpdateProtectedTagsResponse> batchUpdateProtectedTagsAsyncInvoker(
        BatchUpdateProtectedTagsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.batchUpdateProtectedTags, hcClient);
    }

    /**
     * 创建项目下保护分支
     *
     * 创建项目下保护分支
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProjectProtectedBranchesRequest 请求对象
     * @return CompletableFuture<CreateProjectProtectedBranchesResponse>
     */
    public CompletableFuture<CreateProjectProtectedBranchesResponse> createProjectProtectedBranchesAsync(
        CreateProjectProtectedBranchesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.createProjectProtectedBranches);
    }

    /**
     * 创建项目下保护分支
     *
     * 创建项目下保护分支
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProjectProtectedBranchesRequest 请求对象
     * @return AsyncInvoker<CreateProjectProtectedBranchesRequest, CreateProjectProtectedBranchesResponse>
     */
    public AsyncInvoker<CreateProjectProtectedBranchesRequest, CreateProjectProtectedBranchesResponse> createProjectProtectedBranchesAsyncInvoker(
        CreateProjectProtectedBranchesRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.createProjectProtectedBranches, hcClient);
    }

    /**
     * 创建项目下的保护tag
     *
     * 创建项目下的保护tag
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProjectProtectedTagsRequest 请求对象
     * @return CompletableFuture<CreateProjectProtectedTagsResponse>
     */
    public CompletableFuture<CreateProjectProtectedTagsResponse> createProjectProtectedTagsAsync(
        CreateProjectProtectedTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.createProjectProtectedTags);
    }

    /**
     * 创建项目下的保护tag
     *
     * 创建项目下的保护tag
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateProjectProtectedTagsRequest 请求对象
     * @return AsyncInvoker<CreateProjectProtectedTagsRequest, CreateProjectProtectedTagsResponse>
     */
    public AsyncInvoker<CreateProjectProtectedTagsRequest, CreateProjectProtectedTagsResponse> createProjectProtectedTagsAsyncInvoker(
        CreateProjectProtectedTagsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.createProjectProtectedTags, hcClient);
    }

    /**
     * 删除仓库保护分支
     *
     * 删除仓库保护分支
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteProtectedBranchRequest 请求对象
     * @return CompletableFuture<DeleteProtectedBranchResponse>
     */
    public CompletableFuture<DeleteProtectedBranchResponse> deleteProtectedBranchAsync(
        DeleteProtectedBranchRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.deleteProtectedBranch);
    }

    /**
     * 删除仓库保护分支
     *
     * 删除仓库保护分支
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteProtectedBranchRequest 请求对象
     * @return AsyncInvoker<DeleteProtectedBranchRequest, DeleteProtectedBranchResponse>
     */
    public AsyncInvoker<DeleteProtectedBranchRequest, DeleteProtectedBranchResponse> deleteProtectedBranchAsyncInvoker(
        DeleteProtectedBranchRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.deleteProtectedBranch, hcClient);
    }

    /**
     * 删除仓库保护Tag
     *
     * 删除仓库保护Tag
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteProtectedTagRequest 请求对象
     * @return CompletableFuture<DeleteProtectedTagResponse>
     */
    public CompletableFuture<DeleteProtectedTagResponse> deleteProtectedTagAsync(DeleteProtectedTagRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.deleteProtectedTag);
    }

    /**
     * 删除仓库保护Tag
     *
     * 删除仓库保护Tag
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteProtectedTagRequest 请求对象
     * @return AsyncInvoker<DeleteProtectedTagRequest, DeleteProtectedTagResponse>
     */
    public AsyncInvoker<DeleteProtectedTagRequest, DeleteProtectedTagResponse> deleteProtectedTagAsyncInvoker(
        DeleteProtectedTagRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.deleteProtectedTag, hcClient);
    }

    /**
     * 获取项目下保护分支列表
     *
     * 获取项目下保护分支列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectProtectedBranchesRequest 请求对象
     * @return CompletableFuture<ListProjectProtectedBranchesResponse>
     */
    public CompletableFuture<ListProjectProtectedBranchesResponse> listProjectProtectedBranchesAsync(
        ListProjectProtectedBranchesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listProjectProtectedBranches);
    }

    /**
     * 获取项目下保护分支列表
     *
     * 获取项目下保护分支列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectProtectedBranchesRequest 请求对象
     * @return AsyncInvoker<ListProjectProtectedBranchesRequest, ListProjectProtectedBranchesResponse>
     */
    public AsyncInvoker<ListProjectProtectedBranchesRequest, ListProjectProtectedBranchesResponse> listProjectProtectedBranchesAsyncInvoker(
        ListProjectProtectedBranchesRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listProjectProtectedBranches, hcClient);
    }

    /**
     * 获取指定项目的保护tag详情
     *
     * 获取指定项目的保护tag详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectProtectedTagsRequest 请求对象
     * @return CompletableFuture<ListProjectProtectedTagsResponse>
     */
    public CompletableFuture<ListProjectProtectedTagsResponse> listProjectProtectedTagsAsync(
        ListProjectProtectedTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listProjectProtectedTags);
    }

    /**
     * 获取指定项目的保护tag详情
     *
     * 获取指定项目的保护tag详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectProtectedTagsRequest 请求对象
     * @return AsyncInvoker<ListProjectProtectedTagsRequest, ListProjectProtectedTagsResponse>
     */
    public AsyncInvoker<ListProjectProtectedTagsRequest, ListProjectProtectedTagsResponse> listProjectProtectedTagsAsyncInvoker(
        ListProjectProtectedTagsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listProjectProtectedTags, hcClient);
    }

    /**
     * 获取仓库保护分支列表
     *
     * 获取仓库保护分支列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProtectedBranchesRequest 请求对象
     * @return CompletableFuture<ListProtectedBranchesResponse>
     */
    public CompletableFuture<ListProtectedBranchesResponse> listProtectedBranchesAsync(
        ListProtectedBranchesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listProtectedBranches);
    }

    /**
     * 获取仓库保护分支列表
     *
     * 获取仓库保护分支列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProtectedBranchesRequest 请求对象
     * @return AsyncInvoker<ListProtectedBranchesRequest, ListProtectedBranchesResponse>
     */
    public AsyncInvoker<ListProtectedBranchesRequest, ListProtectedBranchesResponse> listProtectedBranchesAsyncInvoker(
        ListProtectedBranchesRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listProtectedBranches, hcClient);
    }

    /**
     * 获取仓库保护Tag列表
     *
     * 获取仓库保护Tag列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProtectedTagsRequest 请求对象
     * @return CompletableFuture<ListProtectedTagsResponse>
     */
    public CompletableFuture<ListProtectedTagsResponse> listProtectedTagsAsync(ListProtectedTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listProtectedTags);
    }

    /**
     * 获取仓库保护Tag列表
     *
     * 获取仓库保护Tag列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProtectedTagsRequest 请求对象
     * @return AsyncInvoker<ListProtectedTagsRequest, ListProtectedTagsResponse>
     */
    public AsyncInvoker<ListProtectedTagsRequest, ListProtectedTagsResponse> listProtectedTagsAsyncInvoker(
        ListProtectedTagsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listProtectedTags, hcClient);
    }

    /**
     * 获取仓库保护分支
     *
     * 获取仓库保护分支
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProtectedBranchRequest 请求对象
     * @return CompletableFuture<ShowProtectedBranchResponse>
     */
    public CompletableFuture<ShowProtectedBranchResponse> showProtectedBranchAsync(ShowProtectedBranchRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.showProtectedBranch);
    }

    /**
     * 获取仓库保护分支
     *
     * 获取仓库保护分支
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProtectedBranchRequest 请求对象
     * @return AsyncInvoker<ShowProtectedBranchRequest, ShowProtectedBranchResponse>
     */
    public AsyncInvoker<ShowProtectedBranchRequest, ShowProtectedBranchResponse> showProtectedBranchAsyncInvoker(
        ShowProtectedBranchRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.showProtectedBranch, hcClient);
    }

    /**
     * 获取仓库保护Tag
     *
     * 获取仓库保护Tag
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProtectedTagRequest 请求对象
     * @return CompletableFuture<ShowProtectedTagResponse>
     */
    public CompletableFuture<ShowProtectedTagResponse> showProtectedTagAsync(ShowProtectedTagRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.showProtectedTag);
    }

    /**
     * 获取仓库保护Tag
     *
     * 获取仓库保护Tag
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProtectedTagRequest 请求对象
     * @return AsyncInvoker<ShowProtectedTagRequest, ShowProtectedTagResponse>
     */
    public AsyncInvoker<ShowProtectedTagRequest, ShowProtectedTagResponse> showProtectedTagAsyncInvoker(
        ShowProtectedTagRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.showProtectedTag, hcClient);
    }

    /**
     * 更新仓库保护分支
     *
     * 更新仓库保护分支
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProtectedBranchRequest 请求对象
     * @return CompletableFuture<UpdateProtectedBranchResponse>
     */
    public CompletableFuture<UpdateProtectedBranchResponse> updateProtectedBranchAsync(
        UpdateProtectedBranchRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.updateProtectedBranch);
    }

    /**
     * 更新仓库保护分支
     *
     * 更新仓库保护分支
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProtectedBranchRequest 请求对象
     * @return AsyncInvoker<UpdateProtectedBranchRequest, UpdateProtectedBranchResponse>
     */
    public AsyncInvoker<UpdateProtectedBranchRequest, UpdateProtectedBranchResponse> updateProtectedBranchAsyncInvoker(
        UpdateProtectedBranchRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.updateProtectedBranch, hcClient);
    }

    /**
     * 更新仓库保护Tag
     *
     * 更新仓库保护Tag
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProtectedTagRequest 请求对象
     * @return CompletableFuture<UpdateProtectedTagResponse>
     */
    public CompletableFuture<UpdateProtectedTagResponse> updateProtectedTagAsync(UpdateProtectedTagRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.updateProtectedTag);
    }

    /**
     * 更新仓库保护Tag
     *
     * 更新仓库保护Tag
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProtectedTagRequest 请求对象
     * @return AsyncInvoker<UpdateProtectedTagRequest, UpdateProtectedTagResponse>
     */
    public AsyncInvoker<UpdateProtectedTagRequest, UpdateProtectedTagResponse> updateProtectedTagAsyncInvoker(
        UpdateProtectedTagRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.updateProtectedTag, hcClient);
    }

    /**
     * 批量删除分支
     *
     * 批量删除分支
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteBranchRequest 请求对象
     * @return CompletableFuture<BatchDeleteBranchResponse>
     */
    public CompletableFuture<BatchDeleteBranchResponse> batchDeleteBranchAsync(BatchDeleteBranchRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.batchDeleteBranch);
    }

    /**
     * 批量删除分支
     *
     * 批量删除分支
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchDeleteBranchRequest 请求对象
     * @return AsyncInvoker<BatchDeleteBranchRequest, BatchDeleteBranchResponse>
     */
    public AsyncInvoker<BatchDeleteBranchRequest, BatchDeleteBranchResponse> batchDeleteBranchAsyncInvoker(
        BatchDeleteBranchRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.batchDeleteBranch, hcClient);
    }

    /**
     * 创建分支
     *
     * 创建分支
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBranchRequest 请求对象
     * @return CompletableFuture<CreateBranchResponse>
     */
    public CompletableFuture<CreateBranchResponse> createBranchAsync(CreateBranchRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.createBranch);
    }

    /**
     * 创建分支
     *
     * 创建分支
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateBranchRequest 请求对象
     * @return AsyncInvoker<CreateBranchRequest, CreateBranchResponse>
     */
    public AsyncInvoker<CreateBranchRequest, CreateBranchResponse> createBranchAsyncInvoker(
        CreateBranchRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.createBranch, hcClient);
    }

    /**
     * 创建标签
     *
     * 创建标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTagRequest 请求对象
     * @return CompletableFuture<CreateTagResponse>
     */
    public CompletableFuture<CreateTagResponse> createTagAsync(CreateTagRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.createTag);
    }

    /**
     * 创建标签
     *
     * 创建标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateTagRequest 请求对象
     * @return AsyncInvoker<CreateTagRequest, CreateTagResponse>
     */
    public AsyncInvoker<CreateTagRequest, CreateTagResponse> createTagAsyncInvoker(CreateTagRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.createTag, hcClient);
    }

    /**
     * 删除分支
     *
     * 删除分支
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBranchRequest 请求对象
     * @return CompletableFuture<DeleteBranchResponse>
     */
    public CompletableFuture<DeleteBranchResponse> deleteBranchAsync(DeleteBranchRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.deleteBranch);
    }

    /**
     * 删除分支
     *
     * 删除分支
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteBranchRequest 请求对象
     * @return AsyncInvoker<DeleteBranchRequest, DeleteBranchResponse>
     */
    public AsyncInvoker<DeleteBranchRequest, DeleteBranchResponse> deleteBranchAsyncInvoker(
        DeleteBranchRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.deleteBranch, hcClient);
    }

    /**
     * 删除标签
     *
     * 删除标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTagRequest 请求对象
     * @return CompletableFuture<DeleteTagResponse>
     */
    public CompletableFuture<DeleteTagResponse> deleteTagAsync(DeleteTagRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.deleteTag);
    }

    /**
     * 删除标签
     *
     * 删除标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTagRequest 请求对象
     * @return AsyncInvoker<DeleteTagRequest, DeleteTagResponse>
     */
    public AsyncInvoker<DeleteTagRequest, DeleteTagResponse> deleteTagAsyncInvoker(DeleteTagRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.deleteTag, hcClient);
    }

    /**
     * 获取分支列表
     *
     * 获取分支列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBranchesRequest 请求对象
     * @return CompletableFuture<ListBranchesResponse>
     */
    public CompletableFuture<ListBranchesResponse> listBranchesAsync(ListBranchesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listBranches);
    }

    /**
     * 获取分支列表
     *
     * 获取分支列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBranchesRequest 请求对象
     * @return AsyncInvoker<ListBranchesRequest, ListBranchesResponse>
     */
    public AsyncInvoker<ListBranchesRequest, ListBranchesResponse> listBranchesAsyncInvoker(
        ListBranchesRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listBranches, hcClient);
    }

    /**
     * 查看分支/tag列表
     *
     * 查看分支/tag列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRefsListRequest 请求对象
     * @return CompletableFuture<ListRefsListResponse>
     */
    public CompletableFuture<ListRefsListResponse> listRefsListAsync(ListRefsListRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listRefsList);
    }

    /**
     * 查看分支/tag列表
     *
     * 查看分支/tag列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRefsListRequest 请求对象
     * @return AsyncInvoker<ListRefsListRequest, ListRefsListResponse>
     */
    public AsyncInvoker<ListRefsListRequest, ListRefsListResponse> listRefsListAsyncInvoker(
        ListRefsListRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listRefsList, hcClient);
    }

    /**
     * 获取标签列表
     *
     * 获取标签列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagsRequest 请求对象
     * @return CompletableFuture<ListTagsResponse>
     */
    public CompletableFuture<ListTagsResponse> listTagsAsync(ListTagsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listTags);
    }

    /**
     * 获取标签列表
     *
     * 获取标签列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTagsRequest 请求对象
     * @return AsyncInvoker<ListTagsRequest, ListTagsResponse>
     */
    public AsyncInvoker<ListTagsRequest, ListTagsResponse> listTagsAsyncInvoker(ListTagsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listTags, hcClient);
    }

    /**
     * 获取分支详情
     *
     * 获取分支详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBranchRequest 请求对象
     * @return CompletableFuture<ShowBranchResponse>
     */
    public CompletableFuture<ShowBranchResponse> showBranchAsync(ShowBranchRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.showBranch);
    }

    /**
     * 获取分支详情
     *
     * 获取分支详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBranchRequest 请求对象
     * @return AsyncInvoker<ShowBranchRequest, ShowBranchResponse>
     */
    public AsyncInvoker<ShowBranchRequest, ShowBranchResponse> showBranchAsyncInvoker(ShowBranchRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.showBranch, hcClient);
    }

    /**
     * 查看标签详情
     *
     * 查看标签详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTagRequest 请求对象
     * @return CompletableFuture<ShowTagResponse>
     */
    public CompletableFuture<ShowTagResponse> showTagAsync(ShowTagRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.showTag);
    }

    /**
     * 查看标签详情
     *
     * 查看标签详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowTagRequest 请求对象
     * @return AsyncInvoker<ShowTagRequest, ShowTagResponse>
     */
    public AsyncInvoker<ShowTagRequest, ShowTagResponse> showTagAsyncInvoker(ShowTagRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.showTag, hcClient);
    }

    /**
     * 分支重命名
     *
     * 分支重命名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBranchNameRequest 请求对象
     * @return CompletableFuture<UpdateBranchNameResponse>
     */
    public CompletableFuture<UpdateBranchNameResponse> updateBranchNameAsync(UpdateBranchNameRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.updateBranchName);
    }

    /**
     * 分支重命名
     *
     * 分支重命名。
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateBranchNameRequest 请求对象
     * @return AsyncInvoker<UpdateBranchNameRequest, UpdateBranchNameResponse>
     */
    public AsyncInvoker<UpdateBranchNameRequest, UpdateBranchNameResponse> updateBranchNameAsyncInvoker(
        UpdateBranchNameRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.updateBranchName, hcClient);
    }

    /**
     * 创建子模块
     *
     * 创建子模块
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddSubmoduleRequest 请求对象
     * @return CompletableFuture<AddSubmoduleResponse>
     */
    public CompletableFuture<AddSubmoduleResponse> addSubmoduleAsync(AddSubmoduleRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.addSubmodule);
    }

    /**
     * 创建子模块
     *
     * 创建子模块
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddSubmoduleRequest 请求对象
     * @return AsyncInvoker<AddSubmoduleRequest, AddSubmoduleResponse>
     */
    public AsyncInvoker<AddSubmoduleRequest, AddSubmoduleResponse> addSubmoduleAsyncInvoker(
        AddSubmoduleRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.addSubmodule, hcClient);
    }

    /**
     * 添加仓库ip白名单
     *
     * 添加仓库ip白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddTrustedIpAddressRequest 请求对象
     * @return CompletableFuture<AddTrustedIpAddressResponse>
     */
    public CompletableFuture<AddTrustedIpAddressResponse> addTrustedIpAddressAsync(AddTrustedIpAddressRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.addTrustedIpAddress);
    }

    /**
     * 添加仓库ip白名单
     *
     * 添加仓库ip白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddTrustedIpAddressRequest 请求对象
     * @return AsyncInvoker<AddTrustedIpAddressRequest, AddTrustedIpAddressResponse>
     */
    public AsyncInvoker<AddTrustedIpAddressRequest, AddTrustedIpAddressResponse> addTrustedIpAddressAsyncInvoker(
        AddTrustedIpAddressRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.addTrustedIpAddress, hcClient);
    }

    /**
     * 将普通仓库与远程镜像关联
     *
     * 将普通仓库与远程镜像关联
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateRemoteMirrorRequest 请求对象
     * @return CompletableFuture<AssociateRemoteMirrorResponse>
     */
    public CompletableFuture<AssociateRemoteMirrorResponse> associateRemoteMirrorAsync(
        AssociateRemoteMirrorRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.associateRemoteMirror);
    }

    /**
     * 将普通仓库与远程镜像关联
     *
     * 将普通仓库与远程镜像关联
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateRemoteMirrorRequest 请求对象
     * @return AsyncInvoker<AssociateRemoteMirrorRequest, AssociateRemoteMirrorResponse>
     */
    public AsyncInvoker<AssociateRemoteMirrorRequest, AssociateRemoteMirrorResponse> associateRemoteMirrorAsyncInvoker(
        AssociateRemoteMirrorRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.associateRemoteMirror, hcClient);
    }

    /**
     * 关联仓库与成员组
     *
     * 关联仓库与成员组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateRepositoryUserGroupRequest 请求对象
     * @return CompletableFuture<AssociateRepositoryUserGroupResponse>
     */
    public CompletableFuture<AssociateRepositoryUserGroupResponse> associateRepositoryUserGroupAsync(
        AssociateRepositoryUserGroupRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.associateRepositoryUserGroup);
    }

    /**
     * 关联仓库与成员组
     *
     * 关联仓库与成员组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AssociateRepositoryUserGroupRequest 请求对象
     * @return AsyncInvoker<AssociateRepositoryUserGroupRequest, AssociateRepositoryUserGroupResponse>
     */
    public AsyncInvoker<AssociateRepositoryUserGroupRequest, AssociateRepositoryUserGroupResponse> associateRepositoryUserGroupAsyncInvoker(
        AssociateRepositoryUserGroupRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.associateRepositoryUserGroup, hcClient);
    }

    /**
     * 批量检查仓库名
     *
     * 批量检查仓库名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchValidateRepoNamesRequest 请求对象
     * @return CompletableFuture<BatchValidateRepoNamesResponse>
     */
    public CompletableFuture<BatchValidateRepoNamesResponse> batchValidateRepoNamesAsync(
        BatchValidateRepoNamesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.batchValidateRepoNames);
    }

    /**
     * 批量检查仓库名
     *
     * 批量检查仓库名
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchValidateRepoNamesRequest 请求对象
     * @return AsyncInvoker<BatchValidateRepoNamesRequest, BatchValidateRepoNamesResponse>
     */
    public AsyncInvoker<BatchValidateRepoNamesRequest, BatchValidateRepoNamesResponse> batchValidateRepoNamesAsyncInvoker(
        BatchValidateRepoNamesRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.batchValidateRepoNames, hcClient);
    }

    /**
     * 创建指定分支下的目录
     *
     * 创建指定分支下的目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDirRequest 请求对象
     * @return CompletableFuture<CreateDirResponse>
     */
    public CompletableFuture<CreateDirResponse> createDirAsync(CreateDirRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.createDir);
    }

    /**
     * 创建指定分支下的目录
     *
     * 创建指定分支下的目录
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateDirRequest 请求对象
     * @return AsyncInvoker<CreateDirRequest, CreateDirResponse>
     */
    public AsyncInvoker<CreateDirRequest, CreateDirResponse> createDirAsyncInvoker(CreateDirRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.createDir, hcClient);
    }

    /**
     * 创建仓库提交规则
     *
     * 创建仓库提交规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRepositoryCommitRuleRequest 请求对象
     * @return CompletableFuture<CreateRepositoryCommitRuleResponse>
     */
    public CompletableFuture<CreateRepositoryCommitRuleResponse> createRepositoryCommitRuleAsync(
        CreateRepositoryCommitRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.createRepositoryCommitRule);
    }

    /**
     * 创建仓库提交规则
     *
     * 创建仓库提交规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRepositoryCommitRuleRequest 请求对象
     * @return AsyncInvoker<CreateRepositoryCommitRuleRequest, CreateRepositoryCommitRuleResponse>
     */
    public AsyncInvoker<CreateRepositoryCommitRuleRequest, CreateRepositoryCommitRuleResponse> createRepositoryCommitRuleAsyncInvoker(
        CreateRepositoryCommitRuleRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.createRepositoryCommitRule, hcClient);
    }

    /**
     * 创建仓库标签
     *
     * 创建仓库标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRepositoryLabelRequest 请求对象
     * @return CompletableFuture<CreateRepositoryLabelResponse>
     */
    public CompletableFuture<CreateRepositoryLabelResponse> createRepositoryLabelAsync(
        CreateRepositoryLabelRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.createRepositoryLabel);
    }

    /**
     * 创建仓库标签
     *
     * 创建仓库标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRepositoryLabelRequest 请求对象
     * @return AsyncInvoker<CreateRepositoryLabelRequest, CreateRepositoryLabelResponse>
     */
    public AsyncInvoker<CreateRepositoryLabelRequest, CreateRepositoryLabelResponse> createRepositoryLabelAsyncInvoker(
        CreateRepositoryLabelRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.createRepositoryLabel, hcClient);
    }

    /**
     * 创建仓库系统标签
     *
     * 创建仓库系统标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRepositorySystemLabelsRequest 请求对象
     * @return CompletableFuture<CreateRepositorySystemLabelsResponse>
     */
    public CompletableFuture<CreateRepositorySystemLabelsResponse> createRepositorySystemLabelsAsync(
        CreateRepositorySystemLabelsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.createRepositorySystemLabels);
    }

    /**
     * 创建仓库系统标签
     *
     * 创建仓库系统标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CreateRepositorySystemLabelsRequest 请求对象
     * @return AsyncInvoker<CreateRepositorySystemLabelsRequest, CreateRepositorySystemLabelsResponse>
     */
    public AsyncInvoker<CreateRepositorySystemLabelsRequest, CreateRepositorySystemLabelsResponse> createRepositorySystemLabelsAsyncInvoker(
        CreateRepositorySystemLabelsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.createRepositorySystemLabels, hcClient);
    }

    /**
     * 删除仓库标签
     *
     * 删除仓库标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRepositoryLabelRequest 请求对象
     * @return CompletableFuture<DeleteRepositoryLabelResponse>
     */
    public CompletableFuture<DeleteRepositoryLabelResponse> deleteRepositoryLabelAsync(
        DeleteRepositoryLabelRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.deleteRepositoryLabel);
    }

    /**
     * 删除仓库标签
     *
     * 删除仓库标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteRepositoryLabelRequest 请求对象
     * @return AsyncInvoker<DeleteRepositoryLabelRequest, DeleteRepositoryLabelResponse>
     */
    public AsyncInvoker<DeleteRepositoryLabelRequest, DeleteRepositoryLabelResponse> deleteRepositoryLabelAsyncInvoker(
        DeleteRepositoryLabelRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.deleteRepositoryLabel, hcClient);
    }

    /**
     * 删除仓库ip白名单
     *
     * 删除仓库ip白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTrustedIpAddressRequest 请求对象
     * @return CompletableFuture<DeleteTrustedIpAddressResponse>
     */
    public CompletableFuture<DeleteTrustedIpAddressResponse> deleteTrustedIpAddressAsync(
        DeleteTrustedIpAddressRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.deleteTrustedIpAddress);
    }

    /**
     * 删除仓库ip白名单
     *
     * 删除仓库ip白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTrustedIpAddressRequest 请求对象
     * @return AsyncInvoker<DeleteTrustedIpAddressRequest, DeleteTrustedIpAddressResponse>
     */
    public AsyncInvoker<DeleteTrustedIpAddressRequest, DeleteTrustedIpAddressResponse> deleteTrustedIpAddressAsyncInvoker(
        DeleteTrustedIpAddressRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.deleteTrustedIpAddress, hcClient);
    }

    /**
     * 仓库下载
     *
     * 仓库下载
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadArchiveRequest 请求对象
     * @return CompletableFuture<DownloadArchiveResponse>
     */
    public CompletableFuture<DownloadArchiveResponse> downloadArchiveAsync(DownloadArchiveRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.downloadArchive);
    }

    /**
     * 仓库下载
     *
     * 仓库下载
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DownloadArchiveRequest 请求对象
     * @return AsyncInvoker<DownloadArchiveRequest, DownloadArchiveResponse>
     */
    public AsyncInvoker<DownloadArchiveRequest, DownloadArchiveResponse> downloadArchiveAsyncInvoker(
        DownloadArchiveRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.downloadArchive, hcClient);
    }

    /**
     * 触发仓库统计任务
     *
     * 触发仓库统计任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteRepositoryStatisticsRequest 请求对象
     * @return CompletableFuture<ExecuteRepositoryStatisticsResponse>
     */
    public CompletableFuture<ExecuteRepositoryStatisticsResponse> executeRepositoryStatisticsAsync(
        ExecuteRepositoryStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.executeRepositoryStatistics);
    }

    /**
     * 触发仓库统计任务
     *
     * 触发仓库统计任务
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExecuteRepositoryStatisticsRequest 请求对象
     * @return AsyncInvoker<ExecuteRepositoryStatisticsRequest, ExecuteRepositoryStatisticsResponse>
     */
    public AsyncInvoker<ExecuteRepositoryStatisticsRequest, ExecuteRepositoryStatisticsResponse> executeRepositoryStatisticsAsyncInvoker(
        ExecuteRepositoryStatisticsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.executeRepositoryStatistics, hcClient);
    }

    /**
     * 获取当前登录用户仓库
     *
     * 获取当前登录用户仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCurrentUserRepositoriesRequest 请求对象
     * @return CompletableFuture<ListCurrentUserRepositoriesResponse>
     */
    public CompletableFuture<ListCurrentUserRepositoriesResponse> listCurrentUserRepositoriesAsync(
        ListCurrentUserRepositoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listCurrentUserRepositories);
    }

    /**
     * 获取当前登录用户仓库
     *
     * 获取当前登录用户仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListCurrentUserRepositoriesRequest 请求对象
     * @return AsyncInvoker<ListCurrentUserRepositoriesRequest, ListCurrentUserRepositoriesResponse>
     */
    public AsyncInvoker<ListCurrentUserRepositoriesRequest, ListCurrentUserRepositoriesResponse> listCurrentUserRepositoriesAsyncInvoker(
        ListCurrentUserRepositoriesRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listCurrentUserRepositories, hcClient);
    }

    /**
     * 获取代码组下仓库列表
     *
     * 获取代码组下仓库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupRepositoriesRequest 请求对象
     * @return CompletableFuture<ListGroupRepositoriesResponse>
     */
    public CompletableFuture<ListGroupRepositoriesResponse> listGroupRepositoriesAsync(
        ListGroupRepositoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listGroupRepositories);
    }

    /**
     * 获取代码组下仓库列表
     *
     * 获取代码组下仓库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupRepositoriesRequest 请求对象
     * @return AsyncInvoker<ListGroupRepositoriesRequest, ListGroupRepositoriesResponse>
     */
    public AsyncInvoker<ListGroupRepositoriesRequest, ListGroupRepositoriesResponse> listGroupRepositoriesAsyncInvoker(
        ListGroupRepositoriesRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listGroupRepositories, hcClient);
    }

    /**
     * 获取当前用户最近提交动态列表
     *
     * 查询当前最近前N条提交动态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPersonalRecentPushEventsRequest 请求对象
     * @return CompletableFuture<ListPersonalRecentPushEventsResponse>
     */
    public CompletableFuture<ListPersonalRecentPushEventsResponse> listPersonalRecentPushEventsAsync(
        ListPersonalRecentPushEventsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listPersonalRecentPushEvents);
    }

    /**
     * 获取当前用户最近提交动态列表
     *
     * 查询当前最近前N条提交动态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPersonalRecentPushEventsRequest 请求对象
     * @return AsyncInvoker<ListPersonalRecentPushEventsRequest, ListPersonalRecentPushEventsResponse>
     */
    public AsyncInvoker<ListPersonalRecentPushEventsRequest, ListPersonalRecentPushEventsResponse> listPersonalRecentPushEventsAsyncInvoker(
        ListPersonalRecentPushEventsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listPersonalRecentPushEvents, hcClient);
    }

    /**
     * 查看当前用户仓库导入任务列表
     *
     * 查看当前用户仓库导入任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPersonalRepositoryImportRecordsRequest 请求对象
     * @return CompletableFuture<ListPersonalRepositoryImportRecordsResponse>
     */
    public CompletableFuture<ListPersonalRepositoryImportRecordsResponse> listPersonalRepositoryImportRecordsAsync(
        ListPersonalRepositoryImportRecordsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listPersonalRepositoryImportRecords);
    }

    /**
     * 查看当前用户仓库导入任务列表
     *
     * 查看当前用户仓库导入任务列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListPersonalRepositoryImportRecordsRequest 请求对象
     * @return AsyncInvoker<ListPersonalRepositoryImportRecordsRequest, ListPersonalRepositoryImportRecordsResponse>
     */
    public AsyncInvoker<ListPersonalRepositoryImportRecordsRequest, ListPersonalRepositoryImportRecordsResponse> listPersonalRepositoryImportRecordsAsyncInvoker(
        ListPersonalRepositoryImportRecordsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listPersonalRepositoryImportRecords, hcClient);
    }

    /**
     * 获取项目下仓库列表
     *
     * 获取项目下仓库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectRepositoriesRequest 请求对象
     * @return CompletableFuture<ListProjectRepositoriesResponse>
     */
    public CompletableFuture<ListProjectRepositoriesResponse> listProjectRepositoriesAsync(
        ListProjectRepositoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listProjectRepositories);
    }

    /**
     * 获取项目下仓库列表
     *
     * 获取项目下仓库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectRepositoriesRequest 请求对象
     * @return AsyncInvoker<ListProjectRepositoriesRequest, ListProjectRepositoriesResponse>
     */
    public AsyncInvoker<ListProjectRepositoriesRequest, ListProjectRepositoriesResponse> listProjectRepositoriesAsyncInvoker(
        ListProjectRepositoriesRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listProjectRepositories, hcClient);
    }

    /**
     * 查看仓库提交规则
     *
     * 查看仓库提交规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryCommitRulesRequest 请求对象
     * @return CompletableFuture<ListRepositoryCommitRulesResponse>
     */
    public CompletableFuture<ListRepositoryCommitRulesResponse> listRepositoryCommitRulesAsync(
        ListRepositoryCommitRulesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listRepositoryCommitRules);
    }

    /**
     * 查看仓库提交规则
     *
     * 查看仓库提交规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryCommitRulesRequest 请求对象
     * @return AsyncInvoker<ListRepositoryCommitRulesRequest, ListRepositoryCommitRulesResponse>
     */
    public AsyncInvoker<ListRepositoryCommitRulesRequest, ListRepositoryCommitRulesResponse> listRepositoryCommitRulesAsyncInvoker(
        ListRepositoryCommitRulesRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listRepositoryCommitRules, hcClient);
    }

    /**
     * 获取仓库贡献者列表
     *
     * 获取仓库贡献者列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryContributorsRequest 请求对象
     * @return CompletableFuture<ListRepositoryContributorsResponse>
     */
    public CompletableFuture<ListRepositoryContributorsResponse> listRepositoryContributorsAsync(
        ListRepositoryContributorsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listRepositoryContributors);
    }

    /**
     * 获取仓库贡献者列表
     *
     * 获取仓库贡献者列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryContributorsRequest 请求对象
     * @return AsyncInvoker<ListRepositoryContributorsRequest, ListRepositoryContributorsResponse>
     */
    public AsyncInvoker<ListRepositoryContributorsRequest, ListRepositoryContributorsResponse> listRepositoryContributorsAsyncInvoker(
        ListRepositoryContributorsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listRepositoryContributors, hcClient);
    }

    /**
     * 获取仓库动态
     *
     * 获取仓库动态（当前仅开放推送动态）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryEventsRequest 请求对象
     * @return CompletableFuture<ListRepositoryEventsResponse>
     */
    public CompletableFuture<ListRepositoryEventsResponse> listRepositoryEventsAsync(
        ListRepositoryEventsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listRepositoryEvents);
    }

    /**
     * 获取仓库动态
     *
     * 获取仓库动态（当前仅开放推送动态）
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryEventsRequest 请求对象
     * @return AsyncInvoker<ListRepositoryEventsRequest, ListRepositoryEventsResponse>
     */
    public AsyncInvoker<ListRepositoryEventsRequest, ListRepositoryEventsResponse> listRepositoryEventsAsyncInvoker(
        ListRepositoryEventsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listRepositoryEvents, hcClient);
    }

    /**
     * 获取仓库Fork列表
     *
     * 获取仓库Fork列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryForksRequest 请求对象
     * @return CompletableFuture<ListRepositoryForksResponse>
     */
    public CompletableFuture<ListRepositoryForksResponse> listRepositoryForksAsync(ListRepositoryForksRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listRepositoryForks);
    }

    /**
     * 获取仓库Fork列表
     *
     * 获取仓库Fork列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryForksRequest 请求对象
     * @return AsyncInvoker<ListRepositoryForksRequest, ListRepositoryForksResponse>
     */
    public AsyncInvoker<ListRepositoryForksRequest, ListRepositoryForksResponse> listRepositoryForksAsyncInvoker(
        ListRepositoryForksRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listRepositoryForks, hcClient);
    }

    /**
     * 获取仓库标签列表
     *
     * 获取仓库标签列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryLabelsRequest 请求对象
     * @return CompletableFuture<ListRepositoryLabelsResponse>
     */
    public CompletableFuture<ListRepositoryLabelsResponse> listRepositoryLabelsAsync(
        ListRepositoryLabelsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listRepositoryLabels);
    }

    /**
     * 获取仓库标签列表
     *
     * 获取仓库标签列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryLabelsRequest 请求对象
     * @return AsyncInvoker<ListRepositoryLabelsRequest, ListRepositoryLabelsResponse>
     */
    public AsyncInvoker<ListRepositoryLabelsRequest, ListRepositoryLabelsResponse> listRepositoryLabelsAsyncInvoker(
        ListRepositoryLabelsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listRepositoryLabels, hcClient);
    }

    /**
     * 获取仓库默认分支语言统计
     *
     * 获取仓库默认分支语言统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryLanguagesRequest 请求对象
     * @return CompletableFuture<ListRepositoryLanguagesResponse>
     */
    public CompletableFuture<ListRepositoryLanguagesResponse> listRepositoryLanguagesAsync(
        ListRepositoryLanguagesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listRepositoryLanguages);
    }

    /**
     * 获取仓库默认分支语言统计
     *
     * 获取仓库默认分支语言统计
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryLanguagesRequest 请求对象
     * @return AsyncInvoker<ListRepositoryLanguagesRequest, ListRepositoryLanguagesResponse>
     */
    public AsyncInvoker<ListRepositoryLanguagesRequest, ListRepositoryLanguagesResponse> listRepositoryLanguagesAsyncInvoker(
        ListRepositoryLanguagesRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listRepositoryLanguages, hcClient);
    }

    /**
     * 模板仓列表
     *
     * 模板仓列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryTemplatesRequest 请求对象
     * @return CompletableFuture<ListRepositoryTemplatesResponse>
     */
    public CompletableFuture<ListRepositoryTemplatesResponse> listRepositoryTemplatesAsync(
        ListRepositoryTemplatesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listRepositoryTemplates);
    }

    /**
     * 模板仓列表
     *
     * 模板仓列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryTemplatesRequest 请求对象
     * @return AsyncInvoker<ListRepositoryTemplatesRequest, ListRepositoryTemplatesResponse>
     */
    public AsyncInvoker<ListRepositoryTemplatesRequest, ListRepositoryTemplatesResponse> listRepositoryTemplatesAsyncInvoker(
        ListRepositoryTemplatesRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listRepositoryTemplates, hcClient);
    }

    /**
     * 获取仓库指定分支或者标签子模块列表
     *
     * 获取仓库指定分支或者标签子模块列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubmodulesRequest 请求对象
     * @return CompletableFuture<ListSubmodulesResponse>
     */
    public CompletableFuture<ListSubmodulesResponse> listSubmodulesAsync(ListSubmodulesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listSubmodules);
    }

    /**
     * 获取仓库指定分支或者标签子模块列表
     *
     * 获取仓库指定分支或者标签子模块列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListSubmodulesRequest 请求对象
     * @return AsyncInvoker<ListSubmodulesRequest, ListSubmodulesResponse>
     */
    public AsyncInvoker<ListSubmodulesRequest, ListSubmodulesResponse> listSubmodulesAsyncInvoker(
        ListSubmodulesRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listSubmodules, hcClient);
    }

    /**
     * 获取仓库ip白名单
     *
     * 获取仓库ip白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTrustedIpAddressesRequest 请求对象
     * @return CompletableFuture<ListTrustedIpAddressesResponse>
     */
    public CompletableFuture<ListTrustedIpAddressesResponse> listTrustedIpAddressesAsync(
        ListTrustedIpAddressesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listTrustedIpAddresses);
    }

    /**
     * 获取仓库ip白名单
     *
     * 获取仓库ip白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTrustedIpAddressesRequest 请求对象
     * @return AsyncInvoker<ListTrustedIpAddressesRequest, ListTrustedIpAddressesResponse>
     */
    public AsyncInvoker<ListTrustedIpAddressesRequest, ListTrustedIpAddressesResponse> listTrustedIpAddressesAsyncInvoker(
        ListTrustedIpAddressesRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listTrustedIpAddresses, hcClient);
    }

    /**
     * 锁定仓库
     *
     * 锁定仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request LockRepositoryRequest 请求对象
     * @return CompletableFuture<LockRepositoryResponse>
     */
    public CompletableFuture<LockRepositoryResponse> lockRepositoryAsync(LockRepositoryRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.lockRepository);
    }

    /**
     * 锁定仓库
     *
     * 锁定仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request LockRepositoryRequest 请求对象
     * @return AsyncInvoker<LockRepositoryRequest, LockRepositoryResponse>
     */
    public AsyncInvoker<LockRepositoryRequest, LockRepositoryResponse> lockRepositoryAsyncInvoker(
        LockRepositoryRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.lockRepository, hcClient);
    }

    /**
     * 删除仓库部署密钥
     *
     * 删除仓库部署密钥
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveDeployKeyRequest 请求对象
     * @return CompletableFuture<RemoveDeployKeyResponse>
     */
    public CompletableFuture<RemoveDeployKeyResponse> removeDeployKeyAsync(RemoveDeployKeyRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.removeDeployKey);
    }

    /**
     * 删除仓库部署密钥
     *
     * 删除仓库部署密钥
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveDeployKeyRequest 请求对象
     * @return AsyncInvoker<RemoveDeployKeyRequest, RemoveDeployKeyResponse>
     */
    public AsyncInvoker<RemoveDeployKeyRequest, RemoveDeployKeyResponse> removeDeployKeyAsyncInvoker(
        RemoveDeployKeyRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.removeDeployKey, hcClient);
    }

    /**
     * 删除子仓库部署密钥
     *
     * 将该该仓库的部署密钥从子模组中删除
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveDeployKeyFromSubmodulesRequest 请求对象
     * @return CompletableFuture<RemoveDeployKeyFromSubmodulesResponse>
     */
    public CompletableFuture<RemoveDeployKeyFromSubmodulesResponse> removeDeployKeyFromSubmodulesAsync(
        RemoveDeployKeyFromSubmodulesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.removeDeployKeyFromSubmodules);
    }

    /**
     * 删除子仓库部署密钥
     *
     * 将该该仓库的部署密钥从子模组中删除
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveDeployKeyFromSubmodulesRequest 请求对象
     * @return AsyncInvoker<RemoveDeployKeyFromSubmodulesRequest, RemoveDeployKeyFromSubmodulesResponse>
     */
    public AsyncInvoker<RemoveDeployKeyFromSubmodulesRequest, RemoveDeployKeyFromSubmodulesResponse> removeDeployKeyFromSubmodulesAsyncInvoker(
        RemoveDeployKeyFromSubmodulesRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.removeDeployKeyFromSubmodules, hcClient);
    }

    /**
     * 获取文件内容
     *
     * 获取文件内容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBlobsRequest 请求对象
     * @return CompletableFuture<ShowBlobsResponse>
     */
    public CompletableFuture<ShowBlobsResponse> showBlobsAsync(ShowBlobsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.showBlobs);
    }

    /**
     * 获取文件内容
     *
     * 获取文件内容
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowBlobsRequest 请求对象
     * @return AsyncInvoker<ShowBlobsRequest, ShowBlobsResponse>
     */
    public AsyncInvoker<ShowBlobsRequest, ShowBlobsResponse> showBlobsAsyncInvoker(ShowBlobsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.showBlobs, hcClient);
    }

    /**
     * 获取仓库指定分支的提交统计信息
     *
     * 获取仓库指定分支的提交统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCommitStatisticsRequest 请求对象
     * @return CompletableFuture<ShowCommitStatisticsResponse>
     */
    public CompletableFuture<ShowCommitStatisticsResponse> showCommitStatisticsAsync(
        ShowCommitStatisticsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.showCommitStatistics);
    }

    /**
     * 获取仓库指定分支的提交统计信息
     *
     * 获取仓库指定分支的提交统计信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowCommitStatisticsRequest 请求对象
     * @return AsyncInvoker<ShowCommitStatisticsRequest, ShowCommitStatisticsResponse>
     */
    public AsyncInvoker<ShowCommitStatisticsRequest, ShowCommitStatisticsResponse> showCommitStatisticsAsyncInvoker(
        ShowCommitStatisticsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.showCommitStatistics, hcClient);
    }

    /**
     * 按行数查询提交文件内容
     *
     * 按行数查询提交文件内容，最大显示行数为1000行
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDiffLinesRequest 请求对象
     * @return CompletableFuture<ShowDiffLinesResponse>
     */
    public CompletableFuture<ShowDiffLinesResponse> showDiffLinesAsync(ShowDiffLinesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.showDiffLines);
    }

    /**
     * 按行数查询提交文件内容
     *
     * 按行数查询提交文件内容，最大显示行数为1000行
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowDiffLinesRequest 请求对象
     * @return AsyncInvoker<ShowDiffLinesRequest, ShowDiffLinesResponse>
     */
    public AsyncInvoker<ShowDiffLinesRequest, ShowDiffLinesResponse> showDiffLinesAsyncInvoker(
        ShowDiffLinesRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.showDiffLines, hcClient);
    }

    /**
     * 获取仓库最近推送事件
     *
     * 获取仓库最近推送事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLastPushEventInRepositoryRequest 请求对象
     * @return CompletableFuture<ShowLastPushEventInRepositoryResponse>
     */
    public CompletableFuture<ShowLastPushEventInRepositoryResponse> showLastPushEventInRepositoryAsync(
        ShowLastPushEventInRepositoryRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.showLastPushEventInRepository);
    }

    /**
     * 获取仓库最近推送事件
     *
     * 获取仓库最近推送事件
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowLastPushEventInRepositoryRequest 请求对象
     * @return AsyncInvoker<ShowLastPushEventInRepositoryRequest, ShowLastPushEventInRepositoryResponse>
     */
    public AsyncInvoker<ShowLastPushEventInRepositoryRequest, ShowLastPushEventInRepositoryResponse> showLastPushEventInRepositoryAsyncInvoker(
        ShowLastPushEventInRepositoryRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.showLastPushEventInRepository, hcClient);
    }

    /**
     * 获取仓库通知设置
     *
     * 获取仓库通知设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNotificationSubscriptionRequest 请求对象
     * @return CompletableFuture<ShowNotificationSubscriptionResponse>
     */
    public CompletableFuture<ShowNotificationSubscriptionResponse> showNotificationSubscriptionAsync(
        ShowNotificationSubscriptionRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.showNotificationSubscription);
    }

    /**
     * 获取仓库通知设置
     *
     * 获取仓库通知设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNotificationSubscriptionRequest 请求对象
     * @return AsyncInvoker<ShowNotificationSubscriptionRequest, ShowNotificationSubscriptionResponse>
     */
    public AsyncInvoker<ShowNotificationSubscriptionRequest, ShowNotificationSubscriptionResponse> showNotificationSubscriptionAsyncInvoker(
        ShowNotificationSubscriptionRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.showNotificationSubscription, hcClient);
    }

    /**
     * 获取仓库通知设置启用状态
     *
     * 获取仓库通知设置启用状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNotificationSubscriptionsStatusRequest 请求对象
     * @return CompletableFuture<ShowNotificationSubscriptionsStatusResponse>
     */
    public CompletableFuture<ShowNotificationSubscriptionsStatusResponse> showNotificationSubscriptionsStatusAsync(
        ShowNotificationSubscriptionsStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.showNotificationSubscriptionsStatus);
    }

    /**
     * 获取仓库通知设置启用状态
     *
     * 获取仓库通知设置启用状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowNotificationSubscriptionsStatusRequest 请求对象
     * @return AsyncInvoker<ShowNotificationSubscriptionsStatusRequest, ShowNotificationSubscriptionsStatusResponse>
     */
    public AsyncInvoker<ShowNotificationSubscriptionsStatusRequest, ShowNotificationSubscriptionsStatusResponse> showNotificationSubscriptionsStatusAsyncInvoker(
        ShowNotificationSubscriptionsStatusRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.showNotificationSubscriptionsStatus, hcClient);
    }

    /**
     * 分支、tags、提交对比
     *
     * 分支、tags、提交对比
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRefCompareRequest 请求对象
     * @return CompletableFuture<ShowRefCompareResponse>
     */
    public CompletableFuture<ShowRefCompareResponse> showRefCompareAsync(ShowRefCompareRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.showRefCompare);
    }

    /**
     * 分支、tags、提交对比
     *
     * 分支、tags、提交对比
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRefCompareRequest 请求对象
     * @return AsyncInvoker<ShowRefCompareRequest, ShowRefCompareResponse>
     */
    public AsyncInvoker<ShowRefCompareRequest, ShowRefCompareResponse> showRefCompareAsyncInvoker(
        ShowRefCompareRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.showRefCompare, hcClient);
    }

    /**
     * 获取仓库镜像详情
     *
     * 获取仓库镜像详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRemoteMirrorRequest 请求对象
     * @return CompletableFuture<ShowRemoteMirrorResponse>
     */
    public CompletableFuture<ShowRemoteMirrorResponse> showRemoteMirrorAsync(ShowRemoteMirrorRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.showRemoteMirror);
    }

    /**
     * 获取仓库镜像详情
     *
     * 获取仓库镜像详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRemoteMirrorRequest 请求对象
     * @return AsyncInvoker<ShowRemoteMirrorRequest, ShowRemoteMirrorResponse>
     */
    public AsyncInvoker<ShowRemoteMirrorRequest, ShowRemoteMirrorResponse> showRemoteMirrorAsyncInvoker(
        ShowRemoteMirrorRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.showRemoteMirror, hcClient);
    }

    /**
     * 获取仓库详情
     *
     * 获取仓库详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryRequest 请求对象
     * @return CompletableFuture<ShowRepositoryResponse>
     */
    public CompletableFuture<ShowRepositoryResponse> showRepositoryAsync(ShowRepositoryRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.showRepository);
    }

    /**
     * 获取仓库详情
     *
     * 获取仓库详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryRequest 请求对象
     * @return AsyncInvoker<ShowRepositoryRequest, ShowRepositoryResponse>
     */
    public AsyncInvoker<ShowRepositoryRequest, ShowRepositoryResponse> showRepositoryAsyncInvoker(
        ShowRepositoryRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.showRepository, hcClient);
    }

    /**
     * 查看仓库通用提交规则
     *
     * 查看仓库通用提交规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryGeneralCommitRuleRequest 请求对象
     * @return CompletableFuture<ShowRepositoryGeneralCommitRuleResponse>
     */
    public CompletableFuture<ShowRepositoryGeneralCommitRuleResponse> showRepositoryGeneralCommitRuleAsync(
        ShowRepositoryGeneralCommitRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.showRepositoryGeneralCommitRule);
    }

    /**
     * 查看仓库通用提交规则
     *
     * 查看仓库通用提交规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryGeneralCommitRuleRequest 请求对象
     * @return AsyncInvoker<ShowRepositoryGeneralCommitRuleRequest, ShowRepositoryGeneralCommitRuleResponse>
     */
    public AsyncInvoker<ShowRepositoryGeneralCommitRuleRequest, ShowRepositoryGeneralCommitRuleResponse> showRepositoryGeneralCommitRuleAsyncInvoker(
        ShowRepositoryGeneralCommitRuleRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.showRepositoryGeneralCommitRule, hcClient);
    }

    /**
     * 查看仓库通用策略
     *
     * 查看仓库通用策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryGeneralPolicyRequest 请求对象
     * @return CompletableFuture<ShowRepositoryGeneralPolicyResponse>
     */
    public CompletableFuture<ShowRepositoryGeneralPolicyResponse> showRepositoryGeneralPolicyAsync(
        ShowRepositoryGeneralPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.showRepositoryGeneralPolicy);
    }

    /**
     * 查看仓库通用策略
     *
     * 查看仓库通用策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryGeneralPolicyRequest 请求对象
     * @return AsyncInvoker<ShowRepositoryGeneralPolicyRequest, ShowRepositoryGeneralPolicyResponse>
     */
    public AsyncInvoker<ShowRepositoryGeneralPolicyRequest, ShowRepositoryGeneralPolicyResponse> showRepositoryGeneralPolicyAsyncInvoker(
        ShowRepositoryGeneralPolicyRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.showRepositoryGeneralPolicy, hcClient);
    }

    /**
     * 查看仓库继承设置
     *
     * 查看仓库继承设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryInheritSettingRequest 请求对象
     * @return CompletableFuture<ShowRepositoryInheritSettingResponse>
     */
    public CompletableFuture<ShowRepositoryInheritSettingResponse> showRepositoryInheritSettingAsync(
        ShowRepositoryInheritSettingRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.showRepositoryInheritSetting);
    }

    /**
     * 查看仓库继承设置
     *
     * 查看仓库继承设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryInheritSettingRequest 请求对象
     * @return AsyncInvoker<ShowRepositoryInheritSettingRequest, ShowRepositoryInheritSettingResponse>
     */
    public AsyncInvoker<ShowRepositoryInheritSettingRequest, ShowRepositoryInheritSettingResponse> showRepositoryInheritSettingAsyncInvoker(
        ShowRepositoryInheritSettingRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.showRepositoryInheritSetting, hcClient);
    }

    /**
     * 查看仓库继承设置源
     *
     * 查看仓库继承设置源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryInheritSettingSourceRequest 请求对象
     * @return CompletableFuture<ShowRepositoryInheritSettingSourceResponse>
     */
    public CompletableFuture<ShowRepositoryInheritSettingSourceResponse> showRepositoryInheritSettingSourceAsync(
        ShowRepositoryInheritSettingSourceRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.showRepositoryInheritSettingSource);
    }

    /**
     * 查看仓库继承设置源
     *
     * 查看仓库继承设置源
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryInheritSettingSourceRequest 请求对象
     * @return AsyncInvoker<ShowRepositoryInheritSettingSourceRequest, ShowRepositoryInheritSettingSourceResponse>
     */
    public AsyncInvoker<ShowRepositoryInheritSettingSourceRequest, ShowRepositoryInheritSettingSourceResponse> showRepositoryInheritSettingSourceAsyncInvoker(
        ShowRepositoryInheritSettingSourceRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.showRepositoryInheritSettingSource, hcClient);
    }

    /**
     * 获取仓库统计任务状态
     *
     * 获取仓库统计任务状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryStatisticsStatusRequest 请求对象
     * @return CompletableFuture<ShowRepositoryStatisticsStatusResponse>
     */
    public CompletableFuture<ShowRepositoryStatisticsStatusResponse> showRepositoryStatisticsStatusAsync(
        ShowRepositoryStatisticsStatusRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.showRepositoryStatisticsStatus);
    }

    /**
     * 获取仓库统计任务状态
     *
     * 获取仓库统计任务状态
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryStatisticsStatusRequest 请求对象
     * @return AsyncInvoker<ShowRepositoryStatisticsStatusRequest, ShowRepositoryStatisticsStatusResponse>
     */
    public AsyncInvoker<ShowRepositoryStatisticsStatusRequest, ShowRepositoryStatisticsStatusResponse> showRepositoryStatisticsStatusAsyncInvoker(
        ShowRepositoryStatisticsStatusRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.showRepositoryStatisticsStatus, hcClient);
    }

    /**
     * 获取仓库统计摘要
     *
     * 获取仓库统计摘要
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryStatisticsSummaryRequest 请求对象
     * @return CompletableFuture<ShowRepositoryStatisticsSummaryResponse>
     */
    public CompletableFuture<ShowRepositoryStatisticsSummaryResponse> showRepositoryStatisticsSummaryAsync(
        ShowRepositoryStatisticsSummaryRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.showRepositoryStatisticsSummary);
    }

    /**
     * 获取仓库统计摘要
     *
     * 获取仓库统计摘要
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryStatisticsSummaryRequest 请求对象
     * @return AsyncInvoker<ShowRepositoryStatisticsSummaryRequest, ShowRepositoryStatisticsSummaryResponse>
     */
    public AsyncInvoker<ShowRepositoryStatisticsSummaryRequest, ShowRepositoryStatisticsSummaryResponse> showRepositoryStatisticsSummaryAsyncInvoker(
        ShowRepositoryStatisticsSummaryRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.showRepositoryStatisticsSummary, hcClient);
    }

    /**
     * 获取仓库水印设置
     *
     * 获取仓库水印设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryWatermarkRequest 请求对象
     * @return CompletableFuture<ShowRepositoryWatermarkResponse>
     */
    public CompletableFuture<ShowRepositoryWatermarkResponse> showRepositoryWatermarkAsync(
        ShowRepositoryWatermarkRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.showRepositoryWatermark);
    }

    /**
     * 获取仓库水印设置
     *
     * 获取仓库水印设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryWatermarkRequest 请求对象
     * @return AsyncInvoker<ShowRepositoryWatermarkRequest, ShowRepositoryWatermarkResponse>
     */
    public AsyncInvoker<ShowRepositoryWatermarkRequest, ShowRepositoryWatermarkResponse> showRepositoryWatermarkAsyncInvoker(
        ShowRepositoryWatermarkRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.showRepositoryWatermark, hcClient);
    }

    /**
     * 获取CR仓库用户分支或标签级权限
     *
     * 获取CR仓库用户分支或标签级权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserRefPermissionRequest 请求对象
     * @return CompletableFuture<ShowUserRefPermissionResponse>
     */
    public CompletableFuture<ShowUserRefPermissionResponse> showUserRefPermissionAsync(
        ShowUserRefPermissionRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.showUserRefPermission);
    }

    /**
     * 获取CR仓库用户分支或标签级权限
     *
     * 获取CR仓库用户分支或标签级权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserRefPermissionRequest 请求对象
     * @return AsyncInvoker<ShowUserRefPermissionRequest, ShowUserRefPermissionResponse>
     */
    public AsyncInvoker<ShowUserRefPermissionRequest, ShowUserRefPermissionResponse> showUserRefPermissionAsyncInvoker(
        ShowUserRefPermissionRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.showUserRefPermission, hcClient);
    }

    /**
     * 启动仓库加速
     *
     * 启动仓库加速
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartHouseKeepingRequest 请求对象
     * @return CompletableFuture<StartHouseKeepingResponse>
     */
    public CompletableFuture<StartHouseKeepingResponse> startHouseKeepingAsync(StartHouseKeepingRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.startHouseKeeping);
    }

    /**
     * 启动仓库加速
     *
     * 启动仓库加速
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartHouseKeepingRequest 请求对象
     * @return AsyncInvoker<StartHouseKeepingRequest, StartHouseKeepingResponse>
     */
    public AsyncInvoker<StartHouseKeepingRequest, StartHouseKeepingResponse> startHouseKeepingAsyncInvoker(
        StartHouseKeepingRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.startHouseKeeping, hcClient);
    }

    /**
     * 启动仓库镜像同步
     *
     * 启动仓库镜像同步
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartRemoteMirrorSynchronizationRequest 请求对象
     * @return CompletableFuture<StartRemoteMirrorSynchronizationResponse>
     */
    public CompletableFuture<StartRemoteMirrorSynchronizationResponse> startRemoteMirrorSynchronizationAsync(
        StartRemoteMirrorSynchronizationRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.startRemoteMirrorSynchronization);
    }

    /**
     * 启动仓库镜像同步
     *
     * 启动仓库镜像同步
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request StartRemoteMirrorSynchronizationRequest 请求对象
     * @return AsyncInvoker<StartRemoteMirrorSynchronizationRequest, StartRemoteMirrorSynchronizationResponse>
     */
    public AsyncInvoker<StartRemoteMirrorSynchronizationRequest, StartRemoteMirrorSynchronizationResponse> startRemoteMirrorSynchronizationAsyncInvoker(
        StartRemoteMirrorSynchronizationRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.startRemoteMirrorSynchronization, hcClient);
    }

    /**
     * 仓库部署密钥同步到子仓
     *
     * 将该仓库的部署密钥同步到所有的子模组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SyncDeployKeyToSubmodulesRequest 请求对象
     * @return CompletableFuture<SyncDeployKeyToSubmodulesResponse>
     */
    public CompletableFuture<SyncDeployKeyToSubmodulesResponse> syncDeployKeyToSubmodulesAsync(
        SyncDeployKeyToSubmodulesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.syncDeployKeyToSubmodules);
    }

    /**
     * 仓库部署密钥同步到子仓
     *
     * 将该仓库的部署密钥同步到所有的子模组
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SyncDeployKeyToSubmodulesRequest 请求对象
     * @return AsyncInvoker<SyncDeployKeyToSubmodulesRequest, SyncDeployKeyToSubmodulesResponse>
     */
    public AsyncInvoker<SyncDeployKeyToSubmodulesRequest, SyncDeployKeyToSubmodulesResponse> syncDeployKeyToSubmodulesAsyncInvoker(
        SyncDeployKeyToSubmodulesRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.syncDeployKeyToSubmodules, hcClient);
    }

    /**
     * 解锁仓库
     *
     * 解锁仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnlockRepositoryRequest 请求对象
     * @return CompletableFuture<UnlockRepositoryResponse>
     */
    public CompletableFuture<UnlockRepositoryResponse> unlockRepositoryAsync(UnlockRepositoryRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.unlockRepository);
    }

    /**
     * 解锁仓库
     *
     * 解锁仓库
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UnlockRepositoryRequest 请求对象
     * @return AsyncInvoker<UnlockRepositoryRequest, UnlockRepositoryResponse>
     */
    public AsyncInvoker<UnlockRepositoryRequest, UnlockRepositoryResponse> unlockRepositoryAsyncInvoker(
        UnlockRepositoryRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.unlockRepository, hcClient);
    }

    /**
     * 修改仓库通知设置
     *
     * 修改仓库通知设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNotificationSubscriptionRequest 请求对象
     * @return CompletableFuture<UpdateNotificationSubscriptionResponse>
     */
    public CompletableFuture<UpdateNotificationSubscriptionResponse> updateNotificationSubscriptionAsync(
        UpdateNotificationSubscriptionRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.updateNotificationSubscription);
    }

    /**
     * 修改仓库通知设置
     *
     * 修改仓库通知设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateNotificationSubscriptionRequest 请求对象
     * @return AsyncInvoker<UpdateNotificationSubscriptionRequest, UpdateNotificationSubscriptionResponse>
     */
    public AsyncInvoker<UpdateNotificationSubscriptionRequest, UpdateNotificationSubscriptionResponse> updateNotificationSubscriptionAsyncInvoker(
        UpdateNotificationSubscriptionRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.updateNotificationSubscription, hcClient);
    }

    /**
     * 修改仓库提交规则
     *
     * 修改仓库提交规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRepositoryCommitRuleRequest 请求对象
     * @return CompletableFuture<UpdateRepositoryCommitRuleResponse>
     */
    public CompletableFuture<UpdateRepositoryCommitRuleResponse> updateRepositoryCommitRuleAsync(
        UpdateRepositoryCommitRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.updateRepositoryCommitRule);
    }

    /**
     * 修改仓库提交规则
     *
     * 修改仓库提交规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRepositoryCommitRuleRequest 请求对象
     * @return AsyncInvoker<UpdateRepositoryCommitRuleRequest, UpdateRepositoryCommitRuleResponse>
     */
    public AsyncInvoker<UpdateRepositoryCommitRuleRequest, UpdateRepositoryCommitRuleResponse> updateRepositoryCommitRuleAsyncInvoker(
        UpdateRepositoryCommitRuleRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.updateRepositoryCommitRule, hcClient);
    }

    /**
     * 修改仓库通用提交规则
     *
     * 修改仓库通用提交规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRepositoryGeneralCommitRuleRequest 请求对象
     * @return CompletableFuture<UpdateRepositoryGeneralCommitRuleResponse>
     */
    public CompletableFuture<UpdateRepositoryGeneralCommitRuleResponse> updateRepositoryGeneralCommitRuleAsync(
        UpdateRepositoryGeneralCommitRuleRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.updateRepositoryGeneralCommitRule);
    }

    /**
     * 修改仓库通用提交规则
     *
     * 修改仓库通用提交规则
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRepositoryGeneralCommitRuleRequest 请求对象
     * @return AsyncInvoker<UpdateRepositoryGeneralCommitRuleRequest, UpdateRepositoryGeneralCommitRuleResponse>
     */
    public AsyncInvoker<UpdateRepositoryGeneralCommitRuleRequest, UpdateRepositoryGeneralCommitRuleResponse> updateRepositoryGeneralCommitRuleAsyncInvoker(
        UpdateRepositoryGeneralCommitRuleRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.updateRepositoryGeneralCommitRule, hcClient);
    }

    /**
     * 修改仓库通用策略
     *
     * 修改仓库通用策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRepositoryGeneralPolicyRequest 请求对象
     * @return CompletableFuture<UpdateRepositoryGeneralPolicyResponse>
     */
    public CompletableFuture<UpdateRepositoryGeneralPolicyResponse> updateRepositoryGeneralPolicyAsync(
        UpdateRepositoryGeneralPolicyRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.updateRepositoryGeneralPolicy);
    }

    /**
     * 修改仓库通用策略
     *
     * 修改仓库通用策略
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRepositoryGeneralPolicyRequest 请求对象
     * @return AsyncInvoker<UpdateRepositoryGeneralPolicyRequest, UpdateRepositoryGeneralPolicyResponse>
     */
    public AsyncInvoker<UpdateRepositoryGeneralPolicyRequest, UpdateRepositoryGeneralPolicyResponse> updateRepositoryGeneralPolicyAsyncInvoker(
        UpdateRepositoryGeneralPolicyRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.updateRepositoryGeneralPolicy, hcClient);
    }

    /**
     * 修改仓库继承设置
     *
     * 修改仓库继承设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRepositoryInheritSettingRequest 请求对象
     * @return CompletableFuture<UpdateRepositoryInheritSettingResponse>
     */
    public CompletableFuture<UpdateRepositoryInheritSettingResponse> updateRepositoryInheritSettingAsync(
        UpdateRepositoryInheritSettingRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.updateRepositoryInheritSetting);
    }

    /**
     * 修改仓库继承设置
     *
     * 修改仓库继承设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRepositoryInheritSettingRequest 请求对象
     * @return AsyncInvoker<UpdateRepositoryInheritSettingRequest, UpdateRepositoryInheritSettingResponse>
     */
    public AsyncInvoker<UpdateRepositoryInheritSettingRequest, UpdateRepositoryInheritSettingResponse> updateRepositoryInheritSettingAsyncInvoker(
        UpdateRepositoryInheritSettingRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.updateRepositoryInheritSetting, hcClient);
    }

    /**
     * 修改仓库标签
     *
     * 修改仓库标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRepositoryLabelRequest 请求对象
     * @return CompletableFuture<UpdateRepositoryLabelResponse>
     */
    public CompletableFuture<UpdateRepositoryLabelResponse> updateRepositoryLabelAsync(
        UpdateRepositoryLabelRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.updateRepositoryLabel);
    }

    /**
     * 修改仓库标签
     *
     * 修改仓库标签
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRepositoryLabelRequest 请求对象
     * @return AsyncInvoker<UpdateRepositoryLabelRequest, UpdateRepositoryLabelResponse>
     */
    public AsyncInvoker<UpdateRepositoryLabelRequest, UpdateRepositoryLabelResponse> updateRepositoryLabelAsyncInvoker(
        UpdateRepositoryLabelRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.updateRepositoryLabel, hcClient);
    }

    /**
     * 更新仓库镜像信息
     *
     * 更新仓库镜像信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRepositoryRemoteMirrorRequest 请求对象
     * @return CompletableFuture<UpdateRepositoryRemoteMirrorResponse>
     */
    public CompletableFuture<UpdateRepositoryRemoteMirrorResponse> updateRepositoryRemoteMirrorAsync(
        UpdateRepositoryRemoteMirrorRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.updateRepositoryRemoteMirror);
    }

    /**
     * 更新仓库镜像信息
     *
     * 更新仓库镜像信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRepositoryRemoteMirrorRequest 请求对象
     * @return AsyncInvoker<UpdateRepositoryRemoteMirrorRequest, UpdateRepositoryRemoteMirrorResponse>
     */
    public AsyncInvoker<UpdateRepositoryRemoteMirrorRequest, UpdateRepositoryRemoteMirrorResponse> updateRepositoryRemoteMirrorAsyncInvoker(
        UpdateRepositoryRemoteMirrorRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.updateRepositoryRemoteMirror, hcClient);
    }

    /**
     * 更新仓库水印设置
     *
     * 更新仓库水印设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRepositoryWatermarkRequest 请求对象
     * @return CompletableFuture<UpdateRepositoryWatermarkResponse>
     */
    public CompletableFuture<UpdateRepositoryWatermarkResponse> updateRepositoryWatermarkAsync(
        UpdateRepositoryWatermarkRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.updateRepositoryWatermark);
    }

    /**
     * 更新仓库水印设置
     *
     * 更新仓库水印设置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRepositoryWatermarkRequest 请求对象
     * @return AsyncInvoker<UpdateRepositoryWatermarkRequest, UpdateRepositoryWatermarkResponse>
     */
    public AsyncInvoker<UpdateRepositoryWatermarkRequest, UpdateRepositoryWatermarkResponse> updateRepositoryWatermarkAsyncInvoker(
        UpdateRepositoryWatermarkRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.updateRepositoryWatermark, hcClient);
    }

    /**
     * 修改仓库ip白名单
     *
     * 修改仓库ip白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTrustedIpAddressRequest 请求对象
     * @return CompletableFuture<UpdateTrustedIpAddressResponse>
     */
    public CompletableFuture<UpdateTrustedIpAddressResponse> updateTrustedIpAddressAsync(
        UpdateTrustedIpAddressRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.updateTrustedIpAddress);
    }

    /**
     * 修改仓库ip白名单
     *
     * 修改仓库ip白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTrustedIpAddressRequest 请求对象
     * @return AsyncInvoker<UpdateTrustedIpAddressRequest, UpdateTrustedIpAddressResponse>
     */
    public AsyncInvoker<UpdateTrustedIpAddressRequest, UpdateTrustedIpAddressResponse> updateTrustedIpAddressAsyncInvoker(
        UpdateTrustedIpAddressRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.updateTrustedIpAddress, hcClient);
    }

    /**
     * 添加租户ip白名单
     *
     * 添加租户ip白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddTenantTrustedIpAddressRequest 请求对象
     * @return CompletableFuture<AddTenantTrustedIpAddressResponse>
     */
    public CompletableFuture<AddTenantTrustedIpAddressResponse> addTenantTrustedIpAddressAsync(
        AddTenantTrustedIpAddressRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.addTenantTrustedIpAddress);
    }

    /**
     * 添加租户ip白名单
     *
     * 添加租户ip白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddTenantTrustedIpAddressRequest 请求对象
     * @return AsyncInvoker<AddTenantTrustedIpAddressRequest, AddTenantTrustedIpAddressResponse>
     */
    public AsyncInvoker<AddTenantTrustedIpAddressRequest, AddTenantTrustedIpAddressResponse> addTenantTrustedIpAddressAsyncInvoker(
        AddTenantTrustedIpAddressRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.addTenantTrustedIpAddress, hcClient);
    }

    /**
     * 删除租户ip白名单
     *
     * 删除租户ip白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTenantTrustedIpAddressRequest 请求对象
     * @return CompletableFuture<DeleteTenantTrustedIpAddressResponse>
     */
    public CompletableFuture<DeleteTenantTrustedIpAddressResponse> deleteTenantTrustedIpAddressAsync(
        DeleteTenantTrustedIpAddressRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.deleteTenantTrustedIpAddress);
    }

    /**
     * 删除租户ip白名单
     *
     * 删除租户ip白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteTenantTrustedIpAddressRequest 请求对象
     * @return AsyncInvoker<DeleteTenantTrustedIpAddressRequest, DeleteTenantTrustedIpAddressResponse>
     */
    public AsyncInvoker<DeleteTenantTrustedIpAddressRequest, DeleteTenantTrustedIpAddressResponse> deleteTenantTrustedIpAddressAsyncInvoker(
        DeleteTenantTrustedIpAddressRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.deleteTenantTrustedIpAddress, hcClient);
    }

    /**
     * 租户仓库列表
     *
     * 租户下所有占用资源的仓库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportTenantRepositoriesRequest 请求对象
     * @return CompletableFuture<ExportTenantRepositoriesResponse>
     */
    public CompletableFuture<ExportTenantRepositoriesResponse> exportTenantRepositoriesAsync(
        ExportTenantRepositoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.exportTenantRepositories);
    }

    /**
     * 租户仓库列表
     *
     * 租户下所有占用资源的仓库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ExportTenantRepositoriesRequest 请求对象
     * @return AsyncInvoker<ExportTenantRepositoriesRequest, ExportTenantRepositoriesResponse>
     */
    public AsyncInvoker<ExportTenantRepositoriesRequest, ExportTenantRepositoriesResponse> exportTenantRepositoriesAsyncInvoker(
        ExportTenantRepositoriesRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.exportTenantRepositories, hcClient);
    }

    /**
     * 租户仓库列表
     *
     * 租户下所有占用资源的仓库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTenantRepositoriesRequest 请求对象
     * @return CompletableFuture<ListTenantRepositoriesResponse>
     */
    public CompletableFuture<ListTenantRepositoriesResponse> listTenantRepositoriesAsync(
        ListTenantRepositoriesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listTenantRepositories);
    }

    /**
     * 租户仓库列表
     *
     * 租户下所有占用资源的仓库列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTenantRepositoriesRequest 请求对象
     * @return AsyncInvoker<ListTenantRepositoriesRequest, ListTenantRepositoriesResponse>
     */
    public AsyncInvoker<ListTenantRepositoriesRequest, ListTenantRepositoriesResponse> listTenantRepositoriesAsyncInvoker(
        ListTenantRepositoriesRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listTenantRepositories, hcClient);
    }

    /**
     * 获取租户ip白名单
     *
     * 获取租户ip白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTenantTrustedIpAddressesRequest 请求对象
     * @return CompletableFuture<ListTenantTrustedIpAddressesResponse>
     */
    public CompletableFuture<ListTenantTrustedIpAddressesResponse> listTenantTrustedIpAddressesAsync(
        ListTenantTrustedIpAddressesRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listTenantTrustedIpAddresses);
    }

    /**
     * 获取租户ip白名单
     *
     * 获取租户ip白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListTenantTrustedIpAddressesRequest 请求对象
     * @return AsyncInvoker<ListTenantTrustedIpAddressesRequest, ListTenantTrustedIpAddressesResponse>
     */
    public AsyncInvoker<ListTenantTrustedIpAddressesRequest, ListTenantTrustedIpAddressesResponse> listTenantTrustedIpAddressesAsyncInvoker(
        ListTenantTrustedIpAddressesRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listTenantTrustedIpAddresses, hcClient);
    }

    /**
     * 修改租户ip白名单
     *
     * 修改租户ip白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTenantTrustedIpAddressRequest 请求对象
     * @return CompletableFuture<UpdateTenantTrustedIpAddressResponse>
     */
    public CompletableFuture<UpdateTenantTrustedIpAddressResponse> updateTenantTrustedIpAddressAsync(
        UpdateTenantTrustedIpAddressRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.updateTenantTrustedIpAddress);
    }

    /**
     * 修改租户ip白名单
     *
     * 修改租户ip白名单
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateTenantTrustedIpAddressRequest 请求对象
     * @return AsyncInvoker<UpdateTenantTrustedIpAddressRequest, UpdateTenantTrustedIpAddressResponse>
     */
    public AsyncInvoker<UpdateTenantTrustedIpAddressRequest, UpdateTenantTrustedIpAddressResponse> updateTenantTrustedIpAddressAsyncInvoker(
        UpdateTenantTrustedIpAddressRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.updateTenantTrustedIpAddress, hcClient);
    }

    /**
     * 校验部署密钥在上层代码组或项目是否配置
     *
     * 校验部署密钥在上层代码组或项目是否配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckDeployKeyRequest 请求对象
     * @return CompletableFuture<CheckDeployKeyResponse>
     */
    public CompletableFuture<CheckDeployKeyResponse> checkDeployKeyAsync(CheckDeployKeyRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.checkDeployKey);
    }

    /**
     * 校验部署密钥在上层代码组或项目是否配置
     *
     * 校验部署密钥在上层代码组或项目是否配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckDeployKeyRequest 请求对象
     * @return AsyncInvoker<CheckDeployKeyRequest, CheckDeployKeyResponse>
     */
    public AsyncInvoker<CheckDeployKeyRequest, CheckDeployKeyResponse> checkDeployKeyAsyncInvoker(
        CheckDeployKeyRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.checkDeployKey, hcClient);
    }

    /**
     * 校验代码组部署密钥在上层代码组或项目是否配置
     *
     * 校验代码组部署密钥在上层代码组或项目是否配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckGroupDeployKeyRequest 请求对象
     * @return CompletableFuture<CheckGroupDeployKeyResponse>
     */
    public CompletableFuture<CheckGroupDeployKeyResponse> checkGroupDeployKeyAsync(CheckGroupDeployKeyRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.checkGroupDeployKey);
    }

    /**
     * 校验代码组部署密钥在上层代码组或项目是否配置
     *
     * 校验代码组部署密钥在上层代码组或项目是否配置
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request CheckGroupDeployKeyRequest 请求对象
     * @return AsyncInvoker<CheckGroupDeployKeyRequest, CheckGroupDeployKeyResponse>
     */
    public AsyncInvoker<CheckGroupDeployKeyRequest, CheckGroupDeployKeyResponse> checkGroupDeployKeyAsyncInvoker(
        CheckGroupDeployKeyRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.checkGroupDeployKey, hcClient);
    }

    /**
     * 获取仓库下指定分支的关联工作项列表
     *
     * 获取仓库下指定分支的关联工作项列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBranchRelatedWorkItemsRequest 请求对象
     * @return CompletableFuture<ListBranchRelatedWorkItemsResponse>
     */
    public CompletableFuture<ListBranchRelatedWorkItemsResponse> listBranchRelatedWorkItemsAsync(
        ListBranchRelatedWorkItemsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listBranchRelatedWorkItems);
    }

    /**
     * 获取仓库下指定分支的关联工作项列表
     *
     * 获取仓库下指定分支的关联工作项列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListBranchRelatedWorkItemsRequest 请求对象
     * @return AsyncInvoker<ListBranchRelatedWorkItemsRequest, ListBranchRelatedWorkItemsResponse>
     */
    public AsyncInvoker<ListBranchRelatedWorkItemsRequest, ListBranchRelatedWorkItemsResponse> listBranchRelatedWorkItemsAsyncInvoker(
        ListBranchRelatedWorkItemsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listBranchRelatedWorkItems, hcClient);
    }

    /**
     * 获取代码组下部署密钥列表
     *
     * 获取代码组下部署密钥列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupDeployKeysRequest 请求对象
     * @return CompletableFuture<ListGroupDeployKeysResponse>
     */
    public CompletableFuture<ListGroupDeployKeysResponse> listGroupDeployKeysAsync(ListGroupDeployKeysRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listGroupDeployKeys);
    }

    /**
     * 获取代码组下部署密钥列表
     *
     * 获取代码组下部署密钥列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupDeployKeysRequest 请求对象
     * @return AsyncInvoker<ListGroupDeployKeysRequest, ListGroupDeployKeysResponse>
     */
    public AsyncInvoker<ListGroupDeployKeysRequest, ListGroupDeployKeysResponse> listGroupDeployKeysAsyncInvoker(
        ListGroupDeployKeysRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listGroupDeployKeys, hcClient);
    }

    /**
     * 获取项目下部署密钥列表
     *
     * 获取项目下部署密钥列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectDeployKeysRequest 请求对象
     * @return CompletableFuture<ListProjectDeployKeysResponse>
     */
    public CompletableFuture<ListProjectDeployKeysResponse> listProjectDeployKeysAsync(
        ListProjectDeployKeysRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listProjectDeployKeys);
    }

    /**
     * 获取项目下部署密钥列表
     *
     * 获取项目下部署密钥列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectDeployKeysRequest 请求对象
     * @return AsyncInvoker<ListProjectDeployKeysRequest, ListProjectDeployKeysResponse>
     */
    public AsyncInvoker<ListProjectDeployKeysRequest, ListProjectDeployKeysResponse> listProjectDeployKeysAsyncInvoker(
        ListProjectDeployKeysRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listProjectDeployKeys, hcClient);
    }

    /**
     * 获取仓库下部署密钥列表
     *
     * 获取仓库下部署密钥列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryDeployKeysRequest 请求对象
     * @return CompletableFuture<ListRepositoryDeployKeysResponse>
     */
    public CompletableFuture<ListRepositoryDeployKeysResponse> listRepositoryDeployKeysAsync(
        ListRepositoryDeployKeysRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listRepositoryDeployKeys);
    }

    /**
     * 获取仓库下部署密钥列表
     *
     * 获取仓库下部署密钥列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryDeployKeysRequest 请求对象
     * @return AsyncInvoker<ListRepositoryDeployKeysRequest, ListRepositoryDeployKeysResponse>
     */
    public AsyncInvoker<ListRepositoryDeployKeysRequest, ListRepositoryDeployKeysResponse> listRepositoryDeployKeysAsyncInvoker(
        ListRepositoryDeployKeysRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listRepositoryDeployKeys, hcClient);
    }

    /**
     * 获取仓库下工作项列表
     *
     * 获取仓库下工作项列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryWorkItemsRequest 请求对象
     * @return CompletableFuture<ListRepositoryWorkItemsResponse>
     */
    public CompletableFuture<ListRepositoryWorkItemsResponse> listRepositoryWorkItemsAsync(
        ListRepositoryWorkItemsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listRepositoryWorkItems);
    }

    /**
     * 获取仓库下工作项列表
     *
     * 获取仓库下工作项列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryWorkItemsRequest 请求对象
     * @return AsyncInvoker<ListRepositoryWorkItemsRequest, ListRepositoryWorkItemsResponse>
     */
    public AsyncInvoker<ListRepositoryWorkItemsRequest, ListRepositoryWorkItemsResponse> listRepositoryWorkItemsAsyncInvoker(
        ListRepositoryWorkItemsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listRepositoryWorkItems, hcClient);
    }

    /**
     * 获取代码组下E2E设置信息
     *
     * 获取代码组下E2E设置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGroupE2eSettingRequest 请求对象
     * @return CompletableFuture<ShowGroupE2eSettingResponse>
     */
    public CompletableFuture<ShowGroupE2eSettingResponse> showGroupE2eSettingAsync(ShowGroupE2eSettingRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.showGroupE2eSetting);
    }

    /**
     * 获取代码组下E2E设置信息
     *
     * 获取代码组下E2E设置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGroupE2eSettingRequest 请求对象
     * @return AsyncInvoker<ShowGroupE2eSettingRequest, ShowGroupE2eSettingResponse>
     */
    public AsyncInvoker<ShowGroupE2eSettingRequest, ShowGroupE2eSettingResponse> showGroupE2eSettingAsyncInvoker(
        ShowGroupE2eSettingRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.showGroupE2eSetting, hcClient);
    }

    /**
     * 获取项目下E2E设置信息
     *
     * 获取项目下E2E设置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectE2eSettingRequest 请求对象
     * @return CompletableFuture<ShowProjectE2eSettingResponse>
     */
    public CompletableFuture<ShowProjectE2eSettingResponse> showProjectE2eSettingAsync(
        ShowProjectE2eSettingRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.showProjectE2eSetting);
    }

    /**
     * 获取项目下E2E设置信息
     *
     * 获取项目下E2E设置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectE2eSettingRequest 请求对象
     * @return AsyncInvoker<ShowProjectE2eSettingRequest, ShowProjectE2eSettingResponse>
     */
    public AsyncInvoker<ShowProjectE2eSettingRequest, ShowProjectE2eSettingResponse> showProjectE2eSettingAsyncInvoker(
        ShowProjectE2eSettingRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.showProjectE2eSetting, hcClient);
    }

    /**
     * 获取仓库下E2E设置信息
     *
     * 获取仓库下E2E设置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryE2eSettingRequest 请求对象
     * @return CompletableFuture<ShowRepositoryE2eSettingResponse>
     */
    public CompletableFuture<ShowRepositoryE2eSettingResponse> showRepositoryE2eSettingAsync(
        ShowRepositoryE2eSettingRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.showRepositoryE2eSetting);
    }

    /**
     * 获取仓库下E2E设置信息
     *
     * 获取仓库下E2E设置信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryE2eSettingRequest 请求对象
     * @return AsyncInvoker<ShowRepositoryE2eSettingRequest, ShowRepositoryE2eSettingResponse>
     */
    public AsyncInvoker<ShowRepositoryE2eSettingRequest, ShowRepositoryE2eSettingResponse> showRepositoryE2eSettingAsyncInvoker(
        ShowRepositoryE2eSettingRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.showRepositoryE2eSetting, hcClient);
    }

    /**
     * 添加ssh公钥
     *
     * 添加ssh公钥
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddSshKeyRequest 请求对象
     * @return CompletableFuture<AddSshKeyResponse>
     */
    public CompletableFuture<AddSshKeyResponse> addSshKeyAsync(AddSshKeyRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.addSshKey);
    }

    /**
     * 添加ssh公钥
     *
     * 添加ssh公钥
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddSshKeyRequest 请求对象
     * @return AsyncInvoker<AddSshKeyRequest, AddSshKeyResponse>
     */
    public AsyncInvoker<AddSshKeyRequest, AddSshKeyResponse> addSshKeyAsyncInvoker(AddSshKeyRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.addSshKey, hcClient);
    }

    /**
     * 获取当前用户指定的代码组列表中的权限
     *
     * 获取当前用户指定的代码组列表中的权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchValidateUserGroupPermissionsRequest 请求对象
     * @return CompletableFuture<BatchValidateUserGroupPermissionsResponse>
     */
    public CompletableFuture<BatchValidateUserGroupPermissionsResponse> batchValidateUserGroupPermissionsAsync(
        BatchValidateUserGroupPermissionsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.batchValidateUserGroupPermissions);
    }

    /**
     * 获取当前用户指定的代码组列表中的权限
     *
     * 获取当前用户指定的代码组列表中的权限
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request BatchValidateUserGroupPermissionsRequest 请求对象
     * @return AsyncInvoker<BatchValidateUserGroupPermissionsRequest, BatchValidateUserGroupPermissionsResponse>
     */
    public AsyncInvoker<BatchValidateUserGroupPermissionsRequest, BatchValidateUserGroupPermissionsResponse> batchValidateUserGroupPermissionsAsyncInvoker(
        BatchValidateUserGroupPermissionsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.batchValidateUserGroupPermissions, hcClient);
    }

    /**
     * 删除ssh公钥
     *
     * 删除ssh公钥
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSshKeyRequest 请求对象
     * @return CompletableFuture<DeleteSshKeyResponse>
     */
    public CompletableFuture<DeleteSshKeyResponse> deleteSshKeyAsync(DeleteSshKeyRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.deleteSshKey);
    }

    /**
     * 删除ssh公钥
     *
     * 删除ssh公钥
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request DeleteSshKeyRequest 请求对象
     * @return AsyncInvoker<DeleteSshKeyRequest, DeleteSshKeyResponse>
     */
    public AsyncInvoker<DeleteSshKeyRequest, DeleteSshKeyResponse> deleteSshKeyAsyncInvoker(
        DeleteSshKeyRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.deleteSshKey, hcClient);
    }

    /**
     * 获取用户的个人访问令牌
     *
     * 获取用户的个人访问令牌
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImpersonationTokensRequest 请求对象
     * @return CompletableFuture<ListImpersonationTokensResponse>
     */
    public CompletableFuture<ListImpersonationTokensResponse> listImpersonationTokensAsync(
        ListImpersonationTokensRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listImpersonationTokens);
    }

    /**
     * 获取用户的个人访问令牌
     *
     * 获取用户的个人访问令牌
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListImpersonationTokensRequest 请求对象
     * @return AsyncInvoker<ListImpersonationTokensRequest, ListImpersonationTokensResponse>
     */
    public AsyncInvoker<ListImpersonationTokensRequest, ListImpersonationTokensResponse> listImpersonationTokensAsyncInvoker(
        ListImpersonationTokensRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listImpersonationTokens, hcClient);
    }

    /**
     * 获取当前用户的gpg_key列表
     *
     * 获取当前用户的gpg_key列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserGpgKeysRequest 请求对象
     * @return CompletableFuture<ListUserGpgKeysResponse>
     */
    public CompletableFuture<ListUserGpgKeysResponse> listUserGpgKeysAsync(ListUserGpgKeysRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listUserGpgKeys);
    }

    /**
     * 获取当前用户的gpg_key列表
     *
     * 获取当前用户的gpg_key列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserGpgKeysRequest 请求对象
     * @return AsyncInvoker<ListUserGpgKeysRequest, ListUserGpgKeysResponse>
     */
    public AsyncInvoker<ListUserGpgKeysRequest, ListUserGpgKeysResponse> listUserGpgKeysAsyncInvoker(
        ListUserGpgKeysRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listUserGpgKeys, hcClient);
    }

    /**
     * 获取当前用户的密钥列表
     *
     * 获取当前用户的密钥列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserKeysRequest 请求对象
     * @return CompletableFuture<ListUserKeysResponse>
     */
    public CompletableFuture<ListUserKeysResponse> listUserKeysAsync(ListUserKeysRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listUserKeys);
    }

    /**
     * 获取当前用户的密钥列表
     *
     * 获取当前用户的密钥列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListUserKeysRequest 请求对象
     * @return AsyncInvoker<ListUserKeysRequest, ListUserKeysResponse>
     */
    public AsyncInvoker<ListUserKeysRequest, ListUserKeysResponse> listUserKeysAsyncInvoker(
        ListUserKeysRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listUserKeys, hcClient);
    }

    /**
     * 发送邮箱验证码
     *
     * 发送邮箱验证码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SendUserEmailVerifyCodeRequest 请求对象
     * @return CompletableFuture<SendUserEmailVerifyCodeResponse>
     */
    public CompletableFuture<SendUserEmailVerifyCodeResponse> sendUserEmailVerifyCodeAsync(
        SendUserEmailVerifyCodeRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.sendUserEmailVerifyCode);
    }

    /**
     * 发送邮箱验证码
     *
     * 发送邮箱验证码
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request SendUserEmailVerifyCodeRequest 请求对象
     * @return AsyncInvoker<SendUserEmailVerifyCodeRequest, SendUserEmailVerifyCodeResponse>
     */
    public AsyncInvoker<SendUserEmailVerifyCodeRequest, SendUserEmailVerifyCodeResponse> sendUserEmailVerifyCodeAsyncInvoker(
        SendUserEmailVerifyCodeRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.sendUserEmailVerifyCode, hcClient);
    }

    /**
     * 获取https的验证方式
     *
     * 获取https的验证方式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpsPasswordSettingRequest 请求对象
     * @return CompletableFuture<ShowHttpsPasswordSettingResponse>
     */
    public CompletableFuture<ShowHttpsPasswordSettingResponse> showHttpsPasswordSettingAsync(
        ShowHttpsPasswordSettingRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.showHttpsPasswordSetting);
    }

    /**
     * 获取https的验证方式
     *
     * 获取https的验证方式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowHttpsPasswordSettingRequest 请求对象
     * @return AsyncInvoker<ShowHttpsPasswordSettingRequest, ShowHttpsPasswordSettingResponse>
     */
    public AsyncInvoker<ShowHttpsPasswordSettingRequest, ShowHttpsPasswordSettingResponse> showHttpsPasswordSettingAsyncInvoker(
        ShowHttpsPasswordSettingRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.showHttpsPasswordSetting, hcClient);
    }

    /**
     * 获取用户相关邮箱信息
     *
     * 获取用户相关邮箱信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserEmailsRequest 请求对象
     * @return CompletableFuture<ShowUserEmailsResponse>
     */
    public CompletableFuture<ShowUserEmailsResponse> showUserEmailsAsync(ShowUserEmailsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.showUserEmails);
    }

    /**
     * 获取用户相关邮箱信息
     *
     * 获取用户相关邮箱信息
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowUserEmailsRequest 请求对象
     * @return AsyncInvoker<ShowUserEmailsRequest, ShowUserEmailsResponse>
     */
    public AsyncInvoker<ShowUserEmailsRequest, ShowUserEmailsResponse> showUserEmailsAsyncInvoker(
        ShowUserEmailsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.showUserEmails, hcClient);
    }

    /**
     * 修改https的验证方式
     *
     * 修改https的验证方式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHttpsPasswordSettingRequest 请求对象
     * @return CompletableFuture<UpdateHttpsPasswordSettingResponse>
     */
    public CompletableFuture<UpdateHttpsPasswordSettingResponse> updateHttpsPasswordSettingAsync(
        UpdateHttpsPasswordSettingRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.updateHttpsPasswordSetting);
    }

    /**
     * 修改https的验证方式
     *
     * 修改https的验证方式
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateHttpsPasswordSettingRequest 请求对象
     * @return AsyncInvoker<UpdateHttpsPasswordSettingRequest, UpdateHttpsPasswordSettingResponse>
     */
    public AsyncInvoker<UpdateHttpsPasswordSettingRequest, UpdateHttpsPasswordSettingResponse> updateHttpsPasswordSettingAsyncInvoker(
        UpdateHttpsPasswordSettingRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.updateHttpsPasswordSetting, hcClient);
    }

    /**
     * 更新邮箱
     *
     * 更新邮箱
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUserEmailsRequest 请求对象
     * @return CompletableFuture<UpdateUserEmailsResponse>
     */
    public CompletableFuture<UpdateUserEmailsResponse> updateUserEmailsAsync(UpdateUserEmailsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.updateUserEmails);
    }

    /**
     * 更新邮箱
     *
     * 更新邮箱
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateUserEmailsRequest 请求对象
     * @return AsyncInvoker<UpdateUserEmailsRequest, UpdateUserEmailsResponse>
     */
    public AsyncInvoker<UpdateUserEmailsRequest, UpdateUserEmailsResponse> updateUserEmailsAsyncInvoker(
        UpdateUserEmailsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.updateUserEmails, hcClient);
    }

    /**
     * 添加代码组下Webhook
     *
     * 添加代码组下Webhook
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddGroupWebhookRequest 请求对象
     * @return CompletableFuture<AddGroupWebhookResponse>
     */
    public CompletableFuture<AddGroupWebhookResponse> addGroupWebhookAsync(AddGroupWebhookRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.addGroupWebhook);
    }

    /**
     * 添加代码组下Webhook
     *
     * 添加代码组下Webhook
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddGroupWebhookRequest 请求对象
     * @return AsyncInvoker<AddGroupWebhookRequest, AddGroupWebhookResponse>
     */
    public AsyncInvoker<AddGroupWebhookRequest, AddGroupWebhookResponse> addGroupWebhookAsyncInvoker(
        AddGroupWebhookRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.addGroupWebhook, hcClient);
    }

    /**
     * 添加项目下Webhook
     *
     * 添加项目下Webhook
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddProjectWebhookRequest 请求对象
     * @return CompletableFuture<AddProjectWebhookResponse>
     */
    public CompletableFuture<AddProjectWebhookResponse> addProjectWebhookAsync(AddProjectWebhookRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.addProjectWebhook);
    }

    /**
     * 添加项目下Webhook
     *
     * 添加项目下Webhook
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddProjectWebhookRequest 请求对象
     * @return AsyncInvoker<AddProjectWebhookRequest, AddProjectWebhookResponse>
     */
    public AsyncInvoker<AddProjectWebhookRequest, AddProjectWebhookResponse> addProjectWebhookAsyncInvoker(
        AddProjectWebhookRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.addProjectWebhook, hcClient);
    }

    /**
     * 添加仓库下Webhook
     *
     * 添加仓库下Webhook
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddRepositoryWebhookRequest 请求对象
     * @return CompletableFuture<AddRepositoryWebhookResponse>
     */
    public CompletableFuture<AddRepositoryWebhookResponse> addRepositoryWebhookAsync(
        AddRepositoryWebhookRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.addRepositoryWebhook);
    }

    /**
     * 添加仓库下Webhook
     *
     * 添加仓库下Webhook
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request AddRepositoryWebhookRequest 请求对象
     * @return AsyncInvoker<AddRepositoryWebhookRequest, AddRepositoryWebhookResponse>
     */
    public AsyncInvoker<AddRepositoryWebhookRequest, AddRepositoryWebhookResponse> addRepositoryWebhookAsyncInvoker(
        AddRepositoryWebhookRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.addRepositoryWebhook, hcClient);
    }

    /**
     * 获取代码组下指定Webhook的日志列表
     *
     * 获取代码组下指定Webhook的日志列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupWebhookLogsRequest 请求对象
     * @return CompletableFuture<ListGroupWebhookLogsResponse>
     */
    public CompletableFuture<ListGroupWebhookLogsResponse> listGroupWebhookLogsAsync(
        ListGroupWebhookLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listGroupWebhookLogs);
    }

    /**
     * 获取代码组下指定Webhook的日志列表
     *
     * 获取代码组下指定Webhook的日志列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupWebhookLogsRequest 请求对象
     * @return AsyncInvoker<ListGroupWebhookLogsRequest, ListGroupWebhookLogsResponse>
     */
    public AsyncInvoker<ListGroupWebhookLogsRequest, ListGroupWebhookLogsResponse> listGroupWebhookLogsAsyncInvoker(
        ListGroupWebhookLogsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listGroupWebhookLogs, hcClient);
    }

    /**
     * 获取代码组下Webhook列表
     *
     * 获取代码组下Webhook列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupWebhooksRequest 请求对象
     * @return CompletableFuture<ListGroupWebhooksResponse>
     */
    public CompletableFuture<ListGroupWebhooksResponse> listGroupWebhooksAsync(ListGroupWebhooksRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listGroupWebhooks);
    }

    /**
     * 获取代码组下Webhook列表
     *
     * 获取代码组下Webhook列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListGroupWebhooksRequest 请求对象
     * @return AsyncInvoker<ListGroupWebhooksRequest, ListGroupWebhooksResponse>
     */
    public AsyncInvoker<ListGroupWebhooksRequest, ListGroupWebhooksResponse> listGroupWebhooksAsyncInvoker(
        ListGroupWebhooksRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listGroupWebhooks, hcClient);
    }

    /**
     * 获取项目下指定Webhook的日志列表
     *
     * 获取项目下指定Webhook的日志列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectWebhookLogsRequest 请求对象
     * @return CompletableFuture<ListProjectWebhookLogsResponse>
     */
    public CompletableFuture<ListProjectWebhookLogsResponse> listProjectWebhookLogsAsync(
        ListProjectWebhookLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listProjectWebhookLogs);
    }

    /**
     * 获取项目下指定Webhook的日志列表
     *
     * 获取项目下指定Webhook的日志列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectWebhookLogsRequest 请求对象
     * @return AsyncInvoker<ListProjectWebhookLogsRequest, ListProjectWebhookLogsResponse>
     */
    public AsyncInvoker<ListProjectWebhookLogsRequest, ListProjectWebhookLogsResponse> listProjectWebhookLogsAsyncInvoker(
        ListProjectWebhookLogsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listProjectWebhookLogs, hcClient);
    }

    /**
     * 获取项目下Webhook列表
     *
     * 获取项目下Webhook列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectWebhooksRequest 请求对象
     * @return CompletableFuture<ListProjectWebhooksResponse>
     */
    public CompletableFuture<ListProjectWebhooksResponse> listProjectWebhooksAsync(ListProjectWebhooksRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listProjectWebhooks);
    }

    /**
     * 获取项目下Webhook列表
     *
     * 获取项目下Webhook列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListProjectWebhooksRequest 请求对象
     * @return AsyncInvoker<ListProjectWebhooksRequest, ListProjectWebhooksResponse>
     */
    public AsyncInvoker<ListProjectWebhooksRequest, ListProjectWebhooksResponse> listProjectWebhooksAsyncInvoker(
        ListProjectWebhooksRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listProjectWebhooks, hcClient);
    }

    /**
     * 获取仓库下指定Webhook的日志列表
     *
     * 获取仓库下指定Webhook的日志列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryWebhookLogsRequest 请求对象
     * @return CompletableFuture<ListRepositoryWebhookLogsResponse>
     */
    public CompletableFuture<ListRepositoryWebhookLogsResponse> listRepositoryWebhookLogsAsync(
        ListRepositoryWebhookLogsRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listRepositoryWebhookLogs);
    }

    /**
     * 获取仓库下指定Webhook的日志列表
     *
     * 获取仓库下指定Webhook的日志列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryWebhookLogsRequest 请求对象
     * @return AsyncInvoker<ListRepositoryWebhookLogsRequest, ListRepositoryWebhookLogsResponse>
     */
    public AsyncInvoker<ListRepositoryWebhookLogsRequest, ListRepositoryWebhookLogsResponse> listRepositoryWebhookLogsAsyncInvoker(
        ListRepositoryWebhookLogsRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listRepositoryWebhookLogs, hcClient);
    }

    /**
     * 获取仓库下Webhook列表
     *
     * 获取仓库下Webhook列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryWebhooksRequest 请求对象
     * @return CompletableFuture<ListRepositoryWebhooksResponse>
     */
    public CompletableFuture<ListRepositoryWebhooksResponse> listRepositoryWebhooksAsync(
        ListRepositoryWebhooksRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.listRepositoryWebhooks);
    }

    /**
     * 获取仓库下Webhook列表
     *
     * 获取仓库下Webhook列表
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ListRepositoryWebhooksRequest 请求对象
     * @return AsyncInvoker<ListRepositoryWebhooksRequest, ListRepositoryWebhooksResponse>
     */
    public AsyncInvoker<ListRepositoryWebhooksRequest, ListRepositoryWebhooksResponse> listRepositoryWebhooksAsyncInvoker(
        ListRepositoryWebhooksRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.listRepositoryWebhooks, hcClient);
    }

    /**
     * 删除代码组下单个Webhook
     *
     * 删除代码组下单个Webhook
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveGroupWebhookRequest 请求对象
     * @return CompletableFuture<RemoveGroupWebhookResponse>
     */
    public CompletableFuture<RemoveGroupWebhookResponse> removeGroupWebhookAsync(RemoveGroupWebhookRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.removeGroupWebhook);
    }

    /**
     * 删除代码组下单个Webhook
     *
     * 删除代码组下单个Webhook
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveGroupWebhookRequest 请求对象
     * @return AsyncInvoker<RemoveGroupWebhookRequest, RemoveGroupWebhookResponse>
     */
    public AsyncInvoker<RemoveGroupWebhookRequest, RemoveGroupWebhookResponse> removeGroupWebhookAsyncInvoker(
        RemoveGroupWebhookRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.removeGroupWebhook, hcClient);
    }

    /**
     * 删除项目下单个Webhook
     *
     * 删除项目下单个Webhook
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveProjectWebhookRequest 请求对象
     * @return CompletableFuture<RemoveProjectWebhookResponse>
     */
    public CompletableFuture<RemoveProjectWebhookResponse> removeProjectWebhookAsync(
        RemoveProjectWebhookRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.removeProjectWebhook);
    }

    /**
     * 删除项目下单个Webhook
     *
     * 删除项目下单个Webhook
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveProjectWebhookRequest 请求对象
     * @return AsyncInvoker<RemoveProjectWebhookRequest, RemoveProjectWebhookResponse>
     */
    public AsyncInvoker<RemoveProjectWebhookRequest, RemoveProjectWebhookResponse> removeProjectWebhookAsyncInvoker(
        RemoveProjectWebhookRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.removeProjectWebhook, hcClient);
    }

    /**
     * 删除仓库下单个Webhook
     *
     * 删除仓库下单个Webhook
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveRepositoryWebhookRequest 请求对象
     * @return CompletableFuture<RemoveRepositoryWebhookResponse>
     */
    public CompletableFuture<RemoveRepositoryWebhookResponse> removeRepositoryWebhookAsync(
        RemoveRepositoryWebhookRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.removeRepositoryWebhook);
    }

    /**
     * 删除仓库下单个Webhook
     *
     * 删除仓库下单个Webhook
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request RemoveRepositoryWebhookRequest 请求对象
     * @return AsyncInvoker<RemoveRepositoryWebhookRequest, RemoveRepositoryWebhookResponse>
     */
    public AsyncInvoker<RemoveRepositoryWebhookRequest, RemoveRepositoryWebhookResponse> removeRepositoryWebhookAsyncInvoker(
        RemoveRepositoryWebhookRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.removeRepositoryWebhook, hcClient);
    }

    /**
     * 获取代码组下单个Webhook数据
     *
     * 获取代码组下单个Webhook数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGroupWebhookRequest 请求对象
     * @return CompletableFuture<ShowGroupWebhookResponse>
     */
    public CompletableFuture<ShowGroupWebhookResponse> showGroupWebhookAsync(ShowGroupWebhookRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.showGroupWebhook);
    }

    /**
     * 获取代码组下单个Webhook数据
     *
     * 获取代码组下单个Webhook数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGroupWebhookRequest 请求对象
     * @return AsyncInvoker<ShowGroupWebhookRequest, ShowGroupWebhookResponse>
     */
    public AsyncInvoker<ShowGroupWebhookRequest, ShowGroupWebhookResponse> showGroupWebhookAsyncInvoker(
        ShowGroupWebhookRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.showGroupWebhook, hcClient);
    }

    /**
     * 获取代码组下指定Webhook的指定日志详情
     *
     * 获取代码组下指定Webhook的指定日志详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGroupWebhookLogRequest 请求对象
     * @return CompletableFuture<ShowGroupWebhookLogResponse>
     */
    public CompletableFuture<ShowGroupWebhookLogResponse> showGroupWebhookLogAsync(ShowGroupWebhookLogRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.showGroupWebhookLog);
    }

    /**
     * 获取代码组下指定Webhook的指定日志详情
     *
     * 获取代码组下指定Webhook的指定日志详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowGroupWebhookLogRequest 请求对象
     * @return AsyncInvoker<ShowGroupWebhookLogRequest, ShowGroupWebhookLogResponse>
     */
    public AsyncInvoker<ShowGroupWebhookLogRequest, ShowGroupWebhookLogResponse> showGroupWebhookLogAsyncInvoker(
        ShowGroupWebhookLogRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.showGroupWebhookLog, hcClient);
    }

    /**
     * 获取项目下单个Webhook数据
     *
     * 获取项目下单个Webhook数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectWebhookRequest 请求对象
     * @return CompletableFuture<ShowProjectWebhookResponse>
     */
    public CompletableFuture<ShowProjectWebhookResponse> showProjectWebhookAsync(ShowProjectWebhookRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.showProjectWebhook);
    }

    /**
     * 获取项目下单个Webhook数据
     *
     * 获取项目下单个Webhook数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectWebhookRequest 请求对象
     * @return AsyncInvoker<ShowProjectWebhookRequest, ShowProjectWebhookResponse>
     */
    public AsyncInvoker<ShowProjectWebhookRequest, ShowProjectWebhookResponse> showProjectWebhookAsyncInvoker(
        ShowProjectWebhookRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.showProjectWebhook, hcClient);
    }

    /**
     * 获取项目下指定Webhook的指定日志详情
     *
     * 获取项目下指定Webhook的指定日志详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectWebhookLogRequest 请求对象
     * @return CompletableFuture<ShowProjectWebhookLogResponse>
     */
    public CompletableFuture<ShowProjectWebhookLogResponse> showProjectWebhookLogAsync(
        ShowProjectWebhookLogRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.showProjectWebhookLog);
    }

    /**
     * 获取项目下指定Webhook的指定日志详情
     *
     * 获取项目下指定Webhook的指定日志详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowProjectWebhookLogRequest 请求对象
     * @return AsyncInvoker<ShowProjectWebhookLogRequest, ShowProjectWebhookLogResponse>
     */
    public AsyncInvoker<ShowProjectWebhookLogRequest, ShowProjectWebhookLogResponse> showProjectWebhookLogAsyncInvoker(
        ShowProjectWebhookLogRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.showProjectWebhookLog, hcClient);
    }

    /**
     * 获取仓库下单个Webhook数据
     *
     * 获取仓库下单个Webhook数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryWebhookRequest 请求对象
     * @return CompletableFuture<ShowRepositoryWebhookResponse>
     */
    public CompletableFuture<ShowRepositoryWebhookResponse> showRepositoryWebhookAsync(
        ShowRepositoryWebhookRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.showRepositoryWebhook);
    }

    /**
     * 获取仓库下单个Webhook数据
     *
     * 获取仓库下单个Webhook数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryWebhookRequest 请求对象
     * @return AsyncInvoker<ShowRepositoryWebhookRequest, ShowRepositoryWebhookResponse>
     */
    public AsyncInvoker<ShowRepositoryWebhookRequest, ShowRepositoryWebhookResponse> showRepositoryWebhookAsyncInvoker(
        ShowRepositoryWebhookRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.showRepositoryWebhook, hcClient);
    }

    /**
     * 获取仓库下指定Webhook的指定日志详情
     *
     * 获取仓库下指定Webhook的指定日志详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryWebhookLogRequest 请求对象
     * @return CompletableFuture<ShowRepositoryWebhookLogResponse>
     */
    public CompletableFuture<ShowRepositoryWebhookLogResponse> showRepositoryWebhookLogAsync(
        ShowRepositoryWebhookLogRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.showRepositoryWebhookLog);
    }

    /**
     * 获取仓库下指定Webhook的指定日志详情
     *
     * 获取仓库下指定Webhook的指定日志详情
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request ShowRepositoryWebhookLogRequest 请求对象
     * @return AsyncInvoker<ShowRepositoryWebhookLogRequest, ShowRepositoryWebhookLogResponse>
     */
    public AsyncInvoker<ShowRepositoryWebhookLogRequest, ShowRepositoryWebhookLogResponse> showRepositoryWebhookLogAsyncInvoker(
        ShowRepositoryWebhookLogRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.showRepositoryWebhookLog, hcClient);
    }

    /**
     * 更新代码组下单个Webhook数据
     *
     * 更新代码组下单个Webhook数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGroupWebhookRequest 请求对象
     * @return CompletableFuture<UpdateGroupWebhookResponse>
     */
    public CompletableFuture<UpdateGroupWebhookResponse> updateGroupWebhookAsync(UpdateGroupWebhookRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.updateGroupWebhook);
    }

    /**
     * 更新代码组下单个Webhook数据
     *
     * 更新代码组下单个Webhook数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateGroupWebhookRequest 请求对象
     * @return AsyncInvoker<UpdateGroupWebhookRequest, UpdateGroupWebhookResponse>
     */
    public AsyncInvoker<UpdateGroupWebhookRequest, UpdateGroupWebhookResponse> updateGroupWebhookAsyncInvoker(
        UpdateGroupWebhookRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.updateGroupWebhook, hcClient);
    }

    /**
     * 更新项目下单个Webhook数据
     *
     * 更新项目下单个Webhook数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProjectWebhookRequest 请求对象
     * @return CompletableFuture<UpdateProjectWebhookResponse>
     */
    public CompletableFuture<UpdateProjectWebhookResponse> updateProjectWebhookAsync(
        UpdateProjectWebhookRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.updateProjectWebhook);
    }

    /**
     * 更新项目下单个Webhook数据
     *
     * 更新项目下单个Webhook数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateProjectWebhookRequest 请求对象
     * @return AsyncInvoker<UpdateProjectWebhookRequest, UpdateProjectWebhookResponse>
     */
    public AsyncInvoker<UpdateProjectWebhookRequest, UpdateProjectWebhookResponse> updateProjectWebhookAsyncInvoker(
        UpdateProjectWebhookRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.updateProjectWebhook, hcClient);
    }

    /**
     * 更新仓库下单个Webhook数据
     *
     * 更新仓库下单个Webhook数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRepositoryWebhookRequest 请求对象
     * @return CompletableFuture<UpdateRepositoryWebhookResponse>
     */
    public CompletableFuture<UpdateRepositoryWebhookResponse> updateRepositoryWebhookAsync(
        UpdateRepositoryWebhookRequest request) {
        return hcClient.asyncInvokeHttp(request, CodeArtsRepoMeta.updateRepositoryWebhook);
    }

    /**
     * 更新仓库下单个Webhook数据
     *
     * 更新仓库下单个Webhook数据
     * 
     * Please refer to HUAWEI cloud API Explorer for details.
     *
     * @param request UpdateRepositoryWebhookRequest 请求对象
     * @return AsyncInvoker<UpdateRepositoryWebhookRequest, UpdateRepositoryWebhookResponse>
     */
    public AsyncInvoker<UpdateRepositoryWebhookRequest, UpdateRepositoryWebhookResponse> updateRepositoryWebhookAsyncInvoker(
        UpdateRepositoryWebhookRequest request) {
        return new AsyncInvoker<>(request, CodeArtsRepoMeta.updateRepositoryWebhook, hcClient);
    }

}
