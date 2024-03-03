/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        ListNode *fast=head;
        ListNode *slow=head;
        int i=0;
        while(i<n && fast){
            fast=fast->next;
            i++;
        }
        ListNode *prev=new ListNode(-1);
        while(fast){
            prev=slow;
            slow=slow->next;
            fast=fast->next;
        }
        if(prev->val==-1) return slow->next;
        prev->next=slow->next;
        return head;

    }
};