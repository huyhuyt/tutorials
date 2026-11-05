import requests
import sys

def fetch_joke():
    url = "https://icanhazdadjoke.com"
    headers = {"Accept": "application/json"}

    try:
        print("Fetching data from the web...")
        response = requests.get(url, headers=headers)

        # Raise an exception if the request failed (e.g 404, 500 errors)
        response.raise_for_status()
        data = response.json()
        print("\n---Here is your data ---")
        print(data.get("joke"))
        print("----------\n")
    except requests.exceptions.RequestException as e:
        print(f"Error fetching data: {e}",file=sys.stderr)

if __name__ == "__main__":
    fetch_joke()