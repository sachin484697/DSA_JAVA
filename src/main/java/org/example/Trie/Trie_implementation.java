package org.example.Trie;
//Trie is prefix tree ---- Uses prefix-sharing, meaning common prefixes are stored once instead of multiple times.
// optimization in binary tree
//every node have  N no of children
//time complexity 1) binary tree -- log2(n)
//                 2)trie ----log n(n)

// node having same ancestor are attached in same path

//insert operation
//app , bye, apple, by ,apply,applyu,sky

//
//                                   a(f)b(f)s(f)--- array of [26]--Assuming only lowercase English letters a-z
//                                 p(f)     y(f)  k(f)
//                              p(f)             e(f)   y(f)
//                            l(t)                     (t)    (t)
//                        y(f)      e(f)
//                     u(t)
//                    (t)               (t)
//
//
//
//
//
//
// every node consist array of children
// Autocomplete & Dictionary Lookups
// Spell Checking & Word Suggestion
//
//Insertion	O(n) ---  n = length of word)
//Searching	O(n)
//Deletion	O(n)
//
//
//


// Structure of Trie Node
// class TrieNode {
//    TrieNode[] children = new TrieNode[26]; // Supports lowercase 'a' to 'z'
//    boolean isEndOfWord; // Marks end of a word
//    public TrieNode() {
//        isEndOfWord = false;
//        for (int i = 0; i < 26; i++)
//           children[i] = null;
//    }
// }





// Trie Node Definition
class TrieNode {
    TrieNode[] children;
    boolean isEndOfWord;

    public TrieNode() {
        children = new TrieNode[26];
        isEndOfWord = false;
    }
}

// Trie Class with Insert, Search, and Delete Operations
class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    // Insert a word into Trie
    public void insert(String word) {
        TrieNode node = root;
        for (char ch : word.toCharArray()) {
            int index = ch - 'a';
            if (node.children[index] == null) {
                node.children[index] = new TrieNode();
            }
            node = node.children[index];
        }
        node.isEndOfWord = true;
    }

    // Search a word in Trie
    public boolean search(String word) {
        TrieNode node = root;
        for (char ch : word.toCharArray()) {
            int index = ch - 'a';
            if (node.children[index] == null) {
                return false;
            }
            node = node.children[index];
        }
        return node.isEndOfWord;
    }


    // Check if a node has any children
    private boolean isEmpty(TrieNode node) {
        for (TrieNode child : node.children) {
            if (child != null) return false;
        }
        return true;
    }

    // Display Trie contents
    public void display() {
        displayHelper(root, "");
    }

    private void displayHelper(TrieNode node, String prefix) {
        if (node == null) return;
        if (node.isEndOfWord) {
            System.out.println(prefix);
        }
        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (node.children[ch - 'a'] != null) {
                displayHelper(node.children[ch - 'a'], prefix + ch);
            }
        }
    }
}

// Driver Code
public class Trie_implementation {
    public static void main(String[] args) {
        Trie trie = new Trie();

        // Insert words
        trie.insert("apple");
        trie.insert("app");
        trie.insert("bat");

        // Search words
        System.out.println("Search 'app': " + trie.search("app")); // true
        System.out.println("Search 'bat': " + trie.search("bat")); // true
        System.out.println("Search 'batman': " + trie.search("batman")); // false

        // Display all words
        System.out.println("Trie Contents:");
        trie.display();

        // Delete a word

        System.out.println("Search 'app' after deletion: " + trie.search("app")); // false
        System.out.println("Trie Contents After Deletion:");
        trie.display();
    }
}

