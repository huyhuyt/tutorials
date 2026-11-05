from collections import defaultdict
from dataclasses import dataclass


class Solution:
    def findItinerary(self, tickets: list[list[str]]) -> list[str]:
        adj = defaultdict(list)
        tickets.sort(reverse=True)
        for src,dst in tickets:
            adj[src].append(dst)

        res = []
        def dfs(src):
            while adj[src]:
                dst = adj[src].pop()
                dfs(dst)
            res.append(src)
        dfs("JFK")
        res.reverse()
        return res
#you are given a list of airline tickets where tickets[i] = [fromi, toi]
# represent the departure and the arrival airports of one flight.
# Reconstruct the itinerary in order and return it.
# All of the tickets belong to a man who departs from "JFK",
# thus, the itinerary must begin with "JFK".
# If there are multiple valid itineraries,
# you should return the itinerary that has the smallest lexical order
# when read as a single string. For example, the itinerary ["JFK", "LGA"]
# has a smaller lexical order than ["JFK", "LGB"].
# You may assume all tickets form at least one valid itinerary.
# You must use all the tickets once and only once.


tickets = [["MUC","LHR"],["JFK","MUC"],["SFO","SJC"],["LHR","SFO"]]
s1 = Solution()
print(s1.findItinerary(tickets))

@dataclass
class User:
    username: str
    email: str

user1 = User("kevin", "huykevin@gmail.com")
print(user1)
